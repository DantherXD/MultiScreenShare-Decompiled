package com.google.android.material.internal;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f4130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f4131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Constructor<StaticLayout> f4132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Object f4133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f4134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TextPaint f4135f;
    private final int g;
    private int i;
    private boolean p;
    private int h = 0;
    private Layout.Alignment j = Layout.Alignment.ALIGN_NORMAL;
    private int k = Integer.MAX_VALUE;
    private float l = 0.0f;
    private float m = 1.0f;
    private int n = f4130a;
    private boolean o = true;
    private TextUtils.TruncateAt q = null;

    static class a extends Exception {
        a(Throwable th) {
            super("Error thrown initializing StaticLayout " + th.getMessage(), th);
        }
    }

    static {
        f4130a = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    private g(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f4134e = charSequence;
        this.f4135f = textPaint;
        this.g = i;
        this.i = charSequence.length();
    }

    private void b() throws a {
        Class<?> cls;
        if (f4131b) {
            return;
        }
        try {
            boolean z = this.p && Build.VERSION.SDK_INT >= 23;
            if (Build.VERSION.SDK_INT >= 18) {
                cls = TextDirectionHeuristic.class;
                f4133d = z ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                ClassLoader classLoader = g.class.getClassLoader();
                String str = this.p ? "RTL" : "LTR";
                Class<?> clsLoadClass = classLoader.loadClass("android.text.TextDirectionHeuristic");
                Class<?> clsLoadClass2 = classLoader.loadClass("android.text.TextDirectionHeuristics");
                f4133d = clsLoadClass2.getField(str).get(clsLoadClass2);
                cls = clsLoadClass;
            }
            Class cls2 = Integer.TYPE;
            Class cls3 = Float.TYPE;
            Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls2, cls2, TextPaint.class, cls2, Layout.Alignment.class, cls, cls3, cls3, Boolean.TYPE, TextUtils.TruncateAt.class, cls2, cls2);
            f4132c = declaredConstructor;
            declaredConstructor.setAccessible(true);
            f4131b = true;
        } catch (Exception e2) {
            throw new a(e2);
        }
    }

    public static g c(CharSequence charSequence, TextPaint textPaint, int i) {
        return new g(charSequence, textPaint, i);
    }

    public StaticLayout a() throws a {
        if (this.f4134e == null) {
            this.f4134e = "";
        }
        int iMax = Math.max(0, this.g);
        CharSequence charSequenceEllipsize = this.f4134e;
        if (this.k == 1) {
            charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.f4135f, iMax, this.q);
        }
        int iMin = Math.min(charSequenceEllipsize.length(), this.i);
        this.i = iMin;
        if (Build.VERSION.SDK_INT < 23) {
            b();
            try {
                return (StaticLayout) ((Constructor) a.g.k.h.e(f4132c)).newInstance(charSequenceEllipsize, Integer.valueOf(this.h), Integer.valueOf(this.i), this.f4135f, Integer.valueOf(iMax), this.j, a.g.k.h.e(f4133d), Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.o), null, Integer.valueOf(iMax), Integer.valueOf(this.k));
            } catch (Exception e2) {
                throw new a(e2);
            }
        }
        if (this.p && this.k == 1) {
            this.j = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequenceEllipsize, this.h, iMin, this.f4135f, iMax);
        builderObtain.setAlignment(this.j);
        builderObtain.setIncludePad(this.o);
        builderObtain.setTextDirection(this.p ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.q;
        if (truncateAt != null) {
            builderObtain.setEllipsize(truncateAt);
        }
        builderObtain.setMaxLines(this.k);
        float f2 = this.l;
        if (f2 != 0.0f || this.m != 1.0f) {
            builderObtain.setLineSpacing(f2, this.m);
        }
        if (this.k > 1) {
            builderObtain.setHyphenationFrequency(this.n);
        }
        return builderObtain.build();
    }

    public g d(Layout.Alignment alignment) {
        this.j = alignment;
        return this;
    }

    public g e(TextUtils.TruncateAt truncateAt) {
        this.q = truncateAt;
        return this;
    }

    public g f(int i) {
        this.n = i;
        return this;
    }

    public g g(boolean z) {
        this.o = z;
        return this;
    }

    public g h(boolean z) {
        this.p = z;
        return this;
    }

    public g i(float f2, float f3) {
        this.l = f2;
        this.m = f3;
        return this;
    }

    public g j(int i) {
        this.k = i;
        return this;
    }
}
