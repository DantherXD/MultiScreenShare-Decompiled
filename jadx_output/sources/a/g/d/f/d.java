package a.g.d.f;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
final class d {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f468b;

        a(int i, int i2) {
            this.f467a = new int[]{i, i2};
            this.f468b = new float[]{0.0f, 1.0f};
        }

        a(int i, int i2, int i3) {
            this.f467a = new int[]{i, i2, i3};
            this.f468b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.f467a = new int[size];
            this.f468b = new float[size];
            for (int i = 0; i < size; i++) {
                this.f467a[i] = list.get(i).intValue();
                this.f468b[i] = list2.get(i).floatValue();
            }
        }
    }

    private static a a(a aVar, int i, int i2, boolean z, int i3) {
        if (aVar != null) {
            return aVar;
        }
        return z ? new a(i, i3, i2) : new a(i, i2);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayK = g.k(resources, theme, attributeSet, a.g.c.x);
        float f2 = g.f(typedArrayK, xmlPullParser, "startX", a.g.c.G, 0.0f);
        float f3 = g.f(typedArrayK, xmlPullParser, "startY", a.g.c.H, 0.0f);
        float f4 = g.f(typedArrayK, xmlPullParser, "endX", a.g.c.I, 0.0f);
        float f5 = g.f(typedArrayK, xmlPullParser, "endY", a.g.c.J, 0.0f);
        float f6 = g.f(typedArrayK, xmlPullParser, "centerX", a.g.c.B, 0.0f);
        float f7 = g.f(typedArrayK, xmlPullParser, "centerY", a.g.c.C, 0.0f);
        int iG = g.g(typedArrayK, xmlPullParser, "type", a.g.c.A, 0);
        int iB = g.b(typedArrayK, xmlPullParser, "startColor", a.g.c.y, 0);
        boolean zJ = g.j(xmlPullParser, "centerColor");
        int iB2 = g.b(typedArrayK, xmlPullParser, "centerColor", a.g.c.F, 0);
        int iB3 = g.b(typedArrayK, xmlPullParser, "endColor", a.g.c.z, 0);
        int iG2 = g.g(typedArrayK, xmlPullParser, "tileMode", a.g.c.E, 0);
        float f8 = g.f(typedArrayK, xmlPullParser, "gradientRadius", a.g.c.D, 0.0f);
        typedArrayK.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zJ, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f2, f3, f4, f5, aVarA.f467a, aVarA.f468b, d(iG2)) : new SweepGradient(f6, f7, aVarA.f467a, aVarA.f468b);
        }
        if (f8 > 0.0f) {
            return new RadialGradient(f6, f7, f8, aVarA.f467a, aVarA.f468b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayK = g.k(resources, theme, attributeSet, a.g.c.K);
                int i = a.g.c.L;
                boolean zHasValue = typedArrayK.hasValue(i);
                int i2 = a.g.c.M;
                boolean zHasValue2 = typedArrayK.hasValue(i2);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayK.getColor(i, 0);
                float f2 = typedArrayK.getFloat(i2, 0.0f);
                typedArrayK.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f2));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i) {
        if (i != 1) {
            return i != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }
}
