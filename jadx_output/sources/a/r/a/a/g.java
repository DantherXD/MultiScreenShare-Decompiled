package a.r.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
public class g implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float[] f958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f959b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        this(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArrayK = a.g.d.f.g.k(resources, theme, attributeSet, a.l);
        d(typedArrayK, xmlPullParser);
        typedArrayK.recycle();
    }

    private void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        b(path);
    }

    private void b(Path path) {
        int i = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int iMin = Math.min(3000, ((int) (length / 0.002f)) + 1);
        if (iMin <= 0) {
            throw new IllegalArgumentException("The Path has a invalid length " + length);
        }
        this.f958a = new float[iMin];
        this.f959b = new float[iMin];
        float[] fArr = new float[2];
        for (int i2 = 0; i2 < iMin; i2++) {
            pathMeasure.getPosTan((i2 * length) / (iMin - 1), fArr, null);
            this.f958a[i2] = fArr[0];
            this.f959b[i2] = fArr[1];
        }
        if (Math.abs(this.f958a[0]) <= 1.0E-5d && Math.abs(this.f959b[0]) <= 1.0E-5d) {
            int i3 = iMin - 1;
            if (Math.abs(this.f958a[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.f959b[i3] - 1.0f) <= 1.0E-5d) {
                float f2 = 0.0f;
                int i4 = 0;
                while (i < iMin) {
                    float[] fArr2 = this.f958a;
                    int i5 = i4 + 1;
                    float f3 = fArr2[i4];
                    if (f3 < f2) {
                        throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f3);
                    }
                    fArr2[i] = f3;
                    i++;
                    f2 = f3;
                    i4 = i5;
                }
                if (pathMeasure.nextContour()) {
                    throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                }
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("The Path must start at (0,0) and end at (1,1) start: ");
        sb.append(this.f958a[0]);
        sb.append(",");
        sb.append(this.f959b[0]);
        sb.append(" end:");
        int i6 = iMin - 1;
        sb.append(this.f958a[i6]);
        sb.append(",");
        sb.append(this.f959b[i6]);
        throw new IllegalArgumentException(sb.toString());
    }

    private void c(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        b(path);
    }

    private void d(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (a.g.d.f.g.j(xmlPullParser, "pathData")) {
            String strI = a.g.d.f.g.i(typedArray, xmlPullParser, "pathData", 4);
            Path pathE = a.g.e.c.e(strI);
            if (pathE != null) {
                b(pathE);
                return;
            }
            throw new InflateException("The path is null, which is created from " + strI);
        }
        if (!a.g.d.f.g.j(xmlPullParser, "controlX1")) {
            throw new InflateException("pathInterpolator requires the controlX1 attribute");
        }
        if (!a.g.d.f.g.j(xmlPullParser, "controlY1")) {
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        float f2 = a.g.d.f.g.f(typedArray, xmlPullParser, "controlX1", 0, 0.0f);
        float f3 = a.g.d.f.g.f(typedArray, xmlPullParser, "controlY1", 1, 0.0f);
        boolean zJ = a.g.d.f.g.j(xmlPullParser, "controlX2");
        if (zJ != a.g.d.f.g.j(xmlPullParser, "controlY2")) {
            throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
        }
        if (zJ) {
            a(f2, f3, a.g.d.f.g.f(typedArray, xmlPullParser, "controlX2", 2, 0.0f), a.g.d.f.g.f(typedArray, xmlPullParser, "controlY2", 3, 0.0f));
        } else {
            c(f2, f3);
        }
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int i = 0;
        int length = this.f958a.length - 1;
        while (length - i > 1) {
            int i2 = (i + length) / 2;
            if (f2 < this.f958a[i2]) {
                length = i2;
            } else {
                i = i2;
            }
        }
        float[] fArr = this.f958a;
        float f3 = fArr[length] - fArr[i];
        if (f3 == 0.0f) {
            return this.f959b[i];
        }
        float f4 = (f2 - fArr[i]) / f3;
        float[] fArr2 = this.f959b;
        float f5 = fArr2[i];
        return f5 + (f4 * (fArr2[length] - f5));
    }
}
