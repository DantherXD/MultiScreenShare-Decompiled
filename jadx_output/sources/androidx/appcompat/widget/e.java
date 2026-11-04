package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1373a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v0 f1376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v0 f1377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f1378f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1375c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f1374b = j.b();

    e(View view) {
        this.f1373a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1378f == null) {
            this.f1378f = new v0();
        }
        v0 v0Var = this.f1378f;
        v0Var.a();
        ColorStateList colorStateListS = a.g.l.v.s(this.f1373a);
        if (colorStateListS != null) {
            v0Var.f1507d = true;
            v0Var.f1504a = colorStateListS;
        }
        PorterDuff.Mode modeT = a.g.l.v.t(this.f1373a);
        if (modeT != null) {
            v0Var.f1506c = true;
            v0Var.f1505b = modeT;
        }
        if (!v0Var.f1507d && !v0Var.f1506c) {
            return false;
        }
        j.i(drawable, v0Var, this.f1373a.getDrawableState());
        return true;
    }

    private boolean k() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            return this.f1376d != null;
        }
        return i == 21;
    }

    void b() {
        Drawable background = this.f1373a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            v0 v0Var = this.f1377e;
            if (v0Var != null) {
                j.i(background, v0Var, this.f1373a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.f1376d;
            if (v0Var2 != null) {
                j.i(background, v0Var2, this.f1373a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        v0 v0Var = this.f1377e;
        if (v0Var != null) {
            return v0Var.f1504a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        v0 v0Var = this.f1377e;
        if (v0Var != null) {
            return v0Var.f1505b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i) {
        Context context = this.f1373a.getContext();
        int[] iArr = a.a.j.D3;
        x0 x0VarV = x0.v(context, attributeSet, iArr, i, 0);
        View view = this.f1373a;
        a.g.l.v.m0(view, view.getContext(), iArr, attributeSet, x0VarV.r(), i, 0);
        try {
            int i2 = a.a.j.E3;
            if (x0VarV.s(i2)) {
                this.f1375c = x0VarV.n(i2, -1);
                ColorStateList colorStateListF = this.f1374b.f(this.f1373a.getContext(), this.f1375c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i3 = a.a.j.F3;
            if (x0VarV.s(i3)) {
                a.g.l.v.s0(this.f1373a, x0VarV.c(i3));
            }
            int i4 = a.a.j.G3;
            if (x0VarV.s(i4)) {
                a.g.l.v.t0(this.f1373a, f0.d(x0VarV.k(i4, -1), null));
            }
        } finally {
            x0VarV.w();
        }
    }

    void f(Drawable drawable) {
        this.f1375c = -1;
        h(null);
        b();
    }

    void g(int i) {
        this.f1375c = i;
        j jVar = this.f1374b;
        h(jVar != null ? jVar.f(this.f1373a.getContext(), i) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1376d == null) {
                this.f1376d = new v0();
            }
            v0 v0Var = this.f1376d;
            v0Var.f1504a = colorStateList;
            v0Var.f1507d = true;
        } else {
            this.f1376d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1377e == null) {
            this.f1377e = new v0();
        }
        v0 v0Var = this.f1377e;
        v0Var.f1504a = colorStateList;
        v0Var.f1507d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1377e == null) {
            this.f1377e = new v0();
        }
        v0 v0Var = this.f1377e;
        v0Var.f1505b = mode;
        v0Var.f1506c = true;
        b();
    }
}
