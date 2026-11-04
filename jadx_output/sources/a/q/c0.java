package a.q;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final i0 f836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f838c;

    static class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(c0.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f2) {
            c0.g(view, f2.floatValue());
        }
    }

    static class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return a.g.l.v.u(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            a.g.l.v.u0(view, rect);
        }
    }

    static {
        i0 d0Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            d0Var = new h0();
        } else if (i >= 23) {
            d0Var = new g0();
        } else if (i >= 22) {
            d0Var = new f0();
        } else if (i >= 21) {
            d0Var = new e0();
        } else {
            d0Var = i >= 19 ? new d0() : new i0();
        }
        f836a = d0Var;
        f837b = new a(Float.class, "translationAlpha");
        f838c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f836a.a(view);
    }

    static b0 b(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new a0(view) : z.e(view);
    }

    static float c(View view) {
        return f836a.c(view);
    }

    static m0 d(View view) {
        return Build.VERSION.SDK_INT >= 18 ? new l0(view) : new k0(view.getWindowToken());
    }

    static void e(View view) {
        f836a.d(view);
    }

    static void f(View view, int i, int i2, int i3, int i4) {
        f836a.e(view, i, i2, i3, i4);
    }

    static void g(View view, float f2) {
        f836a.f(view, f2);
    }

    static void h(View view, int i) {
        f836a.g(view, i);
    }

    static void i(View view, Matrix matrix) {
        f836a.h(view, matrix);
    }

    static void j(View view, Matrix matrix) {
        f836a.i(view, matrix);
    }
}
