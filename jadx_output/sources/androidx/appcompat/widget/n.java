package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f1442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f1443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v0 f1444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v0 f1445d;

    public n(ImageView imageView) {
        this.f1442a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1445d == null) {
            this.f1445d = new v0();
        }
        v0 v0Var = this.f1445d;
        v0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f1442a);
        if (colorStateListA != null) {
            v0Var.f1507d = true;
            v0Var.f1504a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f1442a);
        if (modeB != null) {
            v0Var.f1506c = true;
            v0Var.f1505b = modeB;
        }
        if (!v0Var.f1507d && !v0Var.f1506c) {
            return false;
        }
        j.i(drawable, v0Var, this.f1442a.getDrawableState());
        return true;
    }

    private boolean j() {
        int i = Build.VERSION.SDK_INT;
        if (i > 21) {
            return this.f1443b != null;
        }
        return i == 21;
    }

    void b() {
        Drawable drawable = this.f1442a.getDrawable();
        if (drawable != null) {
            f0.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            v0 v0Var = this.f1444c;
            if (v0Var != null) {
                j.i(drawable, v0Var, this.f1442a.getDrawableState());
                return;
            }
            v0 v0Var2 = this.f1443b;
            if (v0Var2 != null) {
                j.i(drawable, v0Var2, this.f1442a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        v0 v0Var = this.f1444c;
        if (v0Var != null) {
            return v0Var.f1504a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        v0 v0Var = this.f1444c;
        if (v0Var != null) {
            return v0Var.f1505b;
        }
        return null;
    }

    boolean e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1442a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i) {
        int iN;
        Context context = this.f1442a.getContext();
        int[] iArr = a.a.j.R;
        x0 x0VarV = x0.v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1442a;
        a.g.l.v.m0(imageView, imageView.getContext(), iArr, attributeSet, x0VarV.r(), i, 0);
        try {
            Drawable drawable = this.f1442a.getDrawable();
            if (drawable == null && (iN = x0VarV.n(a.a.j.S, -1)) != -1 && (drawable = a.a.k.a.a.d(this.f1442a.getContext(), iN)) != null) {
                this.f1442a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                f0.b(drawable);
            }
            int i2 = a.a.j.T;
            if (x0VarV.s(i2)) {
                androidx.core.widget.e.c(this.f1442a, x0VarV.c(i2));
            }
            int i3 = a.a.j.U;
            if (x0VarV.s(i3)) {
                androidx.core.widget.e.d(this.f1442a, f0.d(x0VarV.k(i3, -1), null));
            }
        } finally {
            x0VarV.w();
        }
    }

    public void g(int i) {
        if (i != 0) {
            Drawable drawableD = a.a.k.a.a.d(this.f1442a.getContext(), i);
            if (drawableD != null) {
                f0.b(drawableD);
            }
            this.f1442a.setImageDrawable(drawableD);
        } else {
            this.f1442a.setImageDrawable(null);
        }
        b();
    }

    void h(ColorStateList colorStateList) {
        if (this.f1444c == null) {
            this.f1444c = new v0();
        }
        v0 v0Var = this.f1444c;
        v0Var.f1504a = colorStateList;
        v0Var.f1507d = true;
        b();
    }

    void i(PorterDuff.Mode mode) {
        if (this.f1444c == null) {
            this.f1444c = new v0();
        }
        v0 v0Var = this.f1444c;
        v0Var.f1505b = mode;
        v0Var.f1506c = true;
        b();
    }
}
