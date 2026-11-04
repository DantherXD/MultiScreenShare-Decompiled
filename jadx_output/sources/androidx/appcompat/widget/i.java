package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: loaded from: classes.dex */
class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f1397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1398b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1399c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1400d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1401e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1402f;

    i(CompoundButton compoundButton) {
        this.f1397a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f1397a);
        if (drawableA != null) {
            if (this.f1400d || this.f1401e) {
                Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawableA).mutate();
                if (this.f1400d) {
                    androidx.core.graphics.drawable.a.o(drawableMutate, this.f1398b);
                }
                if (this.f1401e) {
                    androidx.core.graphics.drawable.a.p(drawableMutate, this.f1399c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1397a.getDrawableState());
                }
                this.f1397a.setButtonDrawable(drawableMutate);
            }
        }
    }

    int b(int i) {
        Drawable drawableA;
        return (Build.VERSION.SDK_INT >= 17 || (drawableA = androidx.core.widget.c.a(this.f1397a)) == null) ? i : i + drawableA.getIntrinsicWidth();
    }

    ColorStateList c() {
        return this.f1398b;
    }

    PorterDuff.Mode d() {
        return this.f1399c;
    }

    void e(AttributeSet attributeSet, int i) {
        boolean z;
        int iN;
        int iN2;
        Context context = this.f1397a.getContext();
        int[] iArr = a.a.j.R0;
        x0 x0VarV = x0.v(context, attributeSet, iArr, i, 0);
        CompoundButton compoundButton = this.f1397a;
        a.g.l.v.m0(compoundButton, compoundButton.getContext(), iArr, attributeSet, x0VarV.r(), i, 0);
        try {
            int i2 = a.a.j.T0;
            if (!x0VarV.s(i2) || (iN2 = x0VarV.n(i2, 0)) == 0) {
                z = false;
            } else {
                try {
                    CompoundButton compoundButton2 = this.f1397a;
                    compoundButton2.setButtonDrawable(a.a.k.a.a.d(compoundButton2.getContext(), iN2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                    z = false;
                }
            }
            if (!z) {
                int i3 = a.a.j.S0;
                if (x0VarV.s(i3) && (iN = x0VarV.n(i3, 0)) != 0) {
                    CompoundButton compoundButton3 = this.f1397a;
                    compoundButton3.setButtonDrawable(a.a.k.a.a.d(compoundButton3.getContext(), iN));
                }
            }
            int i4 = a.a.j.U0;
            if (x0VarV.s(i4)) {
                androidx.core.widget.c.c(this.f1397a, x0VarV.c(i4));
            }
            int i5 = a.a.j.V0;
            if (x0VarV.s(i5)) {
                androidx.core.widget.c.d(this.f1397a, f0.d(x0VarV.k(i5, -1), null));
            }
        } finally {
            x0VarV.w();
        }
    }

    void f() {
        if (this.f1402f) {
            this.f1402f = false;
        } else {
            this.f1402f = true;
            a();
        }
    }

    void g(ColorStateList colorStateList) {
        this.f1398b = colorStateList;
        this.f1400d = true;
        a();
    }

    void h(PorterDuff.Mode mode) {
        this.f1399c = mode;
        this.f1401e = true;
        a();
    }
}
