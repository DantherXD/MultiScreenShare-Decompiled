package a.e.b.b;

import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
class k implements Comparable<k> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static String[] f419b = {"position", "x", "y", "width", "height", "pathRotate"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a.e.a.k.a.b f420c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float f422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    float f423f;
    float g;
    float h;
    float i;
    float j;
    int m;
    int n;
    float o;
    g p;
    LinkedHashMap<String, androidx.constraintlayout.widget.a> q;
    int r;
    double[] s;
    double[] t;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f421d = 0;
    float k = Float.NaN;
    float l = Float.NaN;

    public k() {
        int i = d.f391a;
        this.m = i;
        this.n = i;
        this.o = Float.NaN;
        this.p = null;
        this.q = new LinkedHashMap<>();
        this.r = 0;
        this.s = new double[18];
        this.t = new double[18];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(k kVar) {
        return Float.compare(this.f423f, kVar.f423f);
    }

    void b(double d2, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f2;
        float f3 = this.g;
        float f4 = this.h;
        float f5 = this.i;
        float f6 = this.j;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f11 = (float) dArr[i];
            float f12 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f11;
                f7 = f12;
            } else if (i2 == 2) {
                f4 = f11;
                f9 = f12;
            } else if (i2 == 3) {
                f5 = f11;
                f8 = f12;
            } else if (i2 == 4) {
                f6 = f11;
                f10 = f12;
            }
        }
        float f13 = (f8 / 2.0f) + f7;
        float fCos = (f10 / 2.0f) + f9;
        g gVar = this.p;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d2, fArr3, fArr4);
            float f14 = fArr3[0];
            float f15 = fArr3[1];
            float f16 = fArr4[0];
            float f17 = fArr4[1];
            double d3 = f3;
            float f18 = f9;
            double d4 = f4;
            float fSin = (float) ((((double) f14) + (Math.sin(d4) * d3)) - ((double) (f5 / 2.0f)));
            float fCos2 = (float) ((((double) f15) - (d3 * Math.cos(d4))) - ((double) (f6 / 2.0f)));
            double d5 = f7;
            double d6 = f18;
            float fSin2 = (float) (((double) f16) + (Math.sin(d4) * d5) + (Math.cos(d4) * d6));
            fCos = (float) ((((double) f17) - (d5 * Math.cos(d4))) + (Math.sin(d4) * d6));
            f3 = fSin;
            f4 = fCos2;
            f13 = fSin2;
            f2 = 2.0f;
        } else {
            f2 = 2.0f;
        }
        fArr[0] = f3 + (f5 / f2) + 0.0f;
        fArr[1] = f4 + (f6 / f2) + 0.0f;
        fArr2[0] = f13;
        fArr2[1] = fCos;
    }

    /* JADX WARN: Multi-variable type inference failed */
    void c(float f2, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z) {
        float f3;
        boolean z2;
        boolean z3;
        float f4;
        float f5 = this.g;
        float f6 = this.h;
        float f7 = this.i;
        float f8 = this.j;
        if (iArr.length != 0 && this.s.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.s = new double[i];
            this.t = new double[i];
        }
        Arrays.fill(this.s, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.s[iArr[i2]] = dArr[i2];
            this.t[iArr[i2]] = dArr2[i2];
        }
        float f9 = Float.NaN;
        int i3 = 0;
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (true) {
            double[] dArr4 = this.s;
            if (i3 >= dArr4.length) {
                break;
            }
            if (Double.isNaN(dArr4[i3]) && (dArr3 == null || dArr3[i3] == 0.0d)) {
                f4 = f9;
            } else {
                double d2 = dArr3 != null ? dArr3[i3] : 0.0d;
                if (!Double.isNaN(this.s[i3])) {
                    d2 = this.s[i3] + d2;
                }
                f4 = f9;
                float f14 = (float) d2;
                float f15 = (float) this.t[i3];
                if (i3 == 1) {
                    f9 = f4;
                    f5 = f14;
                    f10 = f15;
                } else if (i3 == 2) {
                    f9 = f4;
                    f6 = f14;
                    f11 = f15;
                } else if (i3 == 3) {
                    f9 = f4;
                    f7 = f14;
                    f12 = f15;
                } else if (i3 == 4) {
                    f9 = f4;
                    f8 = f14;
                    f13 = f15;
                } else if (i3 == 5) {
                    f9 = f14;
                }
                i3++;
            }
            f9 = f4;
            i3++;
        }
        float f16 = f9;
        g gVar = this.p;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b(f2, fArr, fArr2);
            float f17 = fArr[0];
            float f18 = fArr[1];
            float f19 = fArr2[0];
            float f20 = fArr2[1];
            double d3 = f5;
            double d4 = f6;
            float fSin = (float) ((((double) f17) + (Math.sin(d4) * d3)) - ((double) (f7 / 2.0f)));
            f3 = f8;
            float fCos = (float) ((((double) f18) - (Math.cos(d4) * d3)) - ((double) (f8 / 2.0f)));
            double d5 = f10;
            double d6 = f11;
            float fSin2 = (float) (((double) f19) + (Math.sin(d4) * d5) + (Math.cos(d4) * d3 * d6));
            float fCos2 = (float) ((((double) f20) - (d5 * Math.cos(d4))) + (d3 * Math.sin(d4) * d6));
            if (dArr2.length >= 2) {
                z2 = false;
                dArr2[0] = fSin2;
                z3 = true;
                dArr2[1] = fCos2;
            } else {
                z2 = false;
                z3 = true;
            }
            if (!Float.isNaN(f16)) {
                view.setRotation((float) (((double) f16) + Math.toDegrees(Math.atan2(fCos2, fSin2))));
            }
            f5 = fSin;
            f6 = fCos;
        } else {
            f3 = f8;
            z2 = false;
            z3 = true;
            if (!Float.isNaN(f16)) {
                view.setRotation((float) (((double) 0.0f) + ((double) f16) + Math.toDegrees(Math.atan2(f11 + (f13 / 2.0f), f10 + (f12 / 2.0f)))));
            }
        }
        if (view instanceof c) {
            ((c) view).a(f5, f6, f7 + f5, f6 + f3);
            return;
        }
        float f21 = f5 + 0.5f;
        int i4 = (int) f21;
        float f22 = f6 + 0.5f;
        int i5 = (int) f22;
        int i6 = (int) (f21 + f7);
        int i7 = (int) (f22 + f3);
        int i8 = i6 - i4;
        int i9 = i7 - i5;
        if (i8 != view.getMeasuredWidth() || i9 != view.getMeasuredHeight()) {
            z2 = z3;
        }
        if (z2 || z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
        }
        view.layout(i4, i5, i6, i7);
    }
}
