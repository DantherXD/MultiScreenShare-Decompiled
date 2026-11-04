package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
class w extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SeekBar f1508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ColorStateList f1510f;
    private PorterDuff.Mode g;
    private boolean h;
    private boolean i;

    w(SeekBar seekBar) {
        super(seekBar);
        this.f1510f = null;
        this.g = null;
        this.h = false;
        this.i = false;
        this.f1508d = seekBar;
    }

    private void f() {
        Drawable drawable = this.f1509e;
        if (drawable != null) {
            if (this.h || this.i) {
                Drawable drawableR = androidx.core.graphics.drawable.a.r(drawable.mutate());
                this.f1509e = drawableR;
                if (this.h) {
                    androidx.core.graphics.drawable.a.o(drawableR, this.f1510f);
                }
                if (this.i) {
                    androidx.core.graphics.drawable.a.p(this.f1509e, this.g);
                }
                if (this.f1509e.isStateful()) {
                    this.f1509e.setState(this.f1508d.getDrawableState());
                }
            }
        }
    }

    @Override // androidx.appcompat.widget.r
    void c(AttributeSet attributeSet, int i) {
        super.c(attributeSet, i);
        Context context = this.f1508d.getContext();
        int[] iArr = a.a.j.V;
        x0 x0VarV = x0.v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1508d;
        a.g.l.v.m0(seekBar, seekBar.getContext(), iArr, attributeSet, x0VarV.r(), i, 0);
        Drawable drawableH = x0VarV.h(a.a.j.W);
        if (drawableH != null) {
            this.f1508d.setThumb(drawableH);
        }
        j(x0VarV.g(a.a.j.X));
        int i2 = a.a.j.Z;
        if (x0VarV.s(i2)) {
            this.g = f0.d(x0VarV.k(i2, -1), this.g);
            this.i = true;
        }
        int i3 = a.a.j.Y;
        if (x0VarV.s(i3)) {
            this.f1510f = x0VarV.c(i3);
            this.h = true;
        }
        x0VarV.w();
        f();
    }

    void g(Canvas canvas) {
        if (this.f1509e != null) {
            int max = this.f1508d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1509e.getIntrinsicWidth();
                int intrinsicHeight = this.f1509e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1509e.setBounds(-i, -i2, i, i2);
                float width = ((this.f1508d.getWidth() - this.f1508d.getPaddingLeft()) - this.f1508d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f1508d.getPaddingLeft(), this.f1508d.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1509e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void h() {
        Drawable drawable = this.f1509e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1508d.getDrawableState())) {
            this.f1508d.invalidateDrawable(drawable);
        }
    }

    void i() {
        Drawable drawable = this.f1509e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    void j(Drawable drawable) {
        Drawable drawable2 = this.f1509e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f1509e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1508d);
            androidx.core.graphics.drawable.a.m(drawable, a.g.l.v.C(this.f1508d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1508d.getDrawableState());
            }
            f();
        }
        this.f1508d.invalidate();
    }
}
