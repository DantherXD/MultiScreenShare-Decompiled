package com.google.android.material.textfield;

import a.g.l.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextInputLayout f4221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f4222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4223d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private FrameLayout f4224e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator f4225f;
    private final float g;
    private int h;
    private int i;
    private CharSequence j;
    private boolean k;
    private TextView l;
    private CharSequence m;
    private int n;
    private ColorStateList o;
    private CharSequence p;
    private boolean q;
    private TextView r;
    private int s;
    private ColorStateList t;
    private Typeface u;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f4227b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4228c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f4229d;

        a(int i, TextView textView, int i2, TextView textView2) {
            this.f4226a = i;
            this.f4227b = textView;
            this.f4228c = i2;
            this.f4229d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.h = this.f4226a;
            f.this.f4225f = null;
            TextView textView = this.f4227b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f4228c == 1 && f.this.l != null) {
                    f.this.l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f4229d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f4229d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f4229d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f4220a = context;
        this.f4221b = textInputLayout;
        this.g = context.getResources().getDimensionPixelSize(c.b.a.b.d.h);
    }

    private void A(int i, int i2) {
        TextView textViewL;
        TextView textViewL2;
        if (i == i2) {
            return;
        }
        if (i2 != 0 && (textViewL2 = l(i2)) != null) {
            textViewL2.setVisibility(0);
            textViewL2.setAlpha(1.0f);
        }
        if (i != 0 && (textViewL = l(i)) != null) {
            textViewL.setVisibility(4);
            if (i == 1) {
                textViewL.setText((CharSequence) null);
            }
        }
        this.h = i2;
    }

    private void I(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void K(ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean L(TextView textView, CharSequence charSequence) {
        return v.T(this.f4221b) && this.f4221b.isEnabled() && !(this.i == this.h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void O(int i, int i2, boolean z) {
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f4225f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.q, this.r, 2, i, i2);
            h(arrayList, this.k, this.l, 1, i, i2);
            c.b.a.b.l.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i2, l(i), i, l(i2)));
            animatorSet.start();
        } else {
            A(i, i2);
        }
        this.f4221b.s0();
        this.f4221b.v0(z);
        this.f4221b.F0();
    }

    private boolean f() {
        return (this.f4222c == null || this.f4221b.getEditText() == null) ? false : true;
    }

    private void h(List<Animator> list, boolean z, TextView textView, int i, int i2, int i3) {
        if (textView == null || !z) {
            return;
        }
        if (i == i3 || i == i2) {
            list.add(i(textView, i3 == i));
            if (i3 == i) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(c.b.a.b.l.a.f2755a);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.g, 0.0f);
        objectAnimatorOfFloat.setDuration(217L);
        objectAnimatorOfFloat.setInterpolator(c.b.a.b.l.a.f2758d);
        return objectAnimatorOfFloat;
    }

    private TextView l(int i) {
        if (i == 1) {
            return this.l;
        }
        if (i != 2) {
            return null;
        }
        return this.r;
    }

    private int s(boolean z, int i, int i2) {
        return z ? this.f4220a.getResources().getDimensionPixelSize(i) : i2;
    }

    private boolean v(int i) {
        return (i != 1 || this.l == null || TextUtils.isEmpty(this.j)) ? false : true;
    }

    void B(CharSequence charSequence) {
        this.m = charSequence;
        TextView textView = this.l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void C(boolean z) {
        if (this.k == z) {
            return;
        }
        g();
        if (z) {
            a0 a0Var = new a0(this.f4220a);
            this.l = a0Var;
            a0Var.setId(c.b.a.b.f.K);
            if (Build.VERSION.SDK_INT >= 17) {
                this.l.setTextAlignment(5);
            }
            Typeface typeface = this.u;
            if (typeface != null) {
                this.l.setTypeface(typeface);
            }
            D(this.n);
            E(this.o);
            B(this.m);
            this.l.setVisibility(4);
            v.q0(this.l, 1);
            d(this.l, 0);
        } else {
            t();
            z(this.l, 0);
            this.l = null;
            this.f4221b.s0();
            this.f4221b.F0();
        }
        this.k = z;
    }

    void D(int i) {
        this.n = i;
        TextView textView = this.l;
        if (textView != null) {
            this.f4221b.e0(textView, i);
        }
    }

    void E(ColorStateList colorStateList) {
        this.o = colorStateList;
        TextView textView = this.l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void F(int i) {
        this.s = i;
        TextView textView = this.r;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i);
        }
    }

    void G(boolean z) {
        if (this.q == z) {
            return;
        }
        g();
        if (z) {
            a0 a0Var = new a0(this.f4220a);
            this.r = a0Var;
            a0Var.setId(c.b.a.b.f.L);
            if (Build.VERSION.SDK_INT >= 17) {
                this.r.setTextAlignment(5);
            }
            Typeface typeface = this.u;
            if (typeface != null) {
                this.r.setTypeface(typeface);
            }
            this.r.setVisibility(4);
            v.q0(this.r, 1);
            F(this.s);
            H(this.t);
            d(this.r, 1);
        } else {
            u();
            z(this.r, 1);
            this.r = null;
            this.f4221b.s0();
            this.f4221b.F0();
        }
        this.q = z;
    }

    void H(ColorStateList colorStateList) {
        this.t = colorStateList;
        TextView textView = this.r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(Typeface typeface) {
        if (typeface != this.u) {
            this.u = typeface;
            I(this.l, typeface);
            I(this.r, typeface);
        }
    }

    void M(CharSequence charSequence) {
        g();
        this.j = charSequence;
        this.l.setText(charSequence);
        int i = this.h;
        if (i != 1) {
            this.i = 1;
        }
        O(i, this.i, L(this.l, charSequence));
    }

    void N(CharSequence charSequence) {
        g();
        this.p = charSequence;
        this.r.setText(charSequence);
        int i = this.h;
        if (i != 2) {
            this.i = 2;
        }
        O(i, this.i, L(this.r, charSequence));
    }

    void d(TextView textView, int i) {
        if (this.f4222c == null && this.f4224e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f4220a);
            this.f4222c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4221b.addView(this.f4222c, -1, -2);
            this.f4224e = new FrameLayout(this.f4220a);
            this.f4222c.addView(this.f4224e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f4221b.getEditText() != null) {
                e();
            }
        }
        if (w(i)) {
            this.f4224e.setVisibility(0);
            this.f4224e.addView(textView);
        } else {
            this.f4222c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f4222c.setVisibility(0);
        this.f4223d++;
    }

    void e() {
        if (f()) {
            EditText editText = this.f4221b.getEditText();
            boolean zG = c.b.a.b.x.c.g(this.f4220a);
            LinearLayout linearLayout = this.f4222c;
            int i = c.b.a.b.d.t;
            v.A0(linearLayout, s(zG, i, v.I(editText)), s(zG, c.b.a.b.d.u, this.f4220a.getResources().getDimensionPixelSize(c.b.a.b.d.s)), s(zG, i, v.H(editText)), 0);
        }
    }

    void g() {
        Animator animator = this.f4225f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean k() {
        return v(this.i);
    }

    CharSequence m() {
        return this.m;
    }

    CharSequence n() {
        return this.j;
    }

    int o() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList p() {
        TextView textView = this.l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence q() {
        return this.p;
    }

    int r() {
        TextView textView = this.r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void t() {
        this.j = null;
        g();
        if (this.h == 1) {
            this.i = (!this.q || TextUtils.isEmpty(this.p)) ? 0 : 2;
        }
        O(this.h, this.i, L(this.l, null));
    }

    void u() {
        g();
        int i = this.h;
        if (i == 2) {
            this.i = 0;
        }
        O(i, this.i, L(this.r, null));
    }

    boolean w(int i) {
        return i == 0 || i == 1;
    }

    boolean x() {
        return this.k;
    }

    boolean y() {
        return this.q;
    }

    void z(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f4222c == null) {
            return;
        }
        if (!w(i) || (frameLayout = this.f4224e) == null) {
            this.f4222c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i2 = this.f4223d - 1;
        this.f4223d = i2;
        K(this.f4222c, i2);
    }
}
