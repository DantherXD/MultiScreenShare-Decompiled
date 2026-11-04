package com.google.android.material.button;

import a.g.l.v;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import c.b.a.b.a0.g;
import c.b.a.b.a0.k;
import c.b.a.b.a0.n;
import c.b.a.b.b;
import c.b.a.b.x.c;
import com.google.android.material.internal.l;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f3966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialButton f3967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f3968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3970e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3971f;
    private int g;
    private int h;
    private int i;
    private PorterDuff.Mode j;
    private ColorStateList k;
    private ColorStateList l;
    private ColorStateList m;
    private Drawable n;
    private boolean o = false;
    private boolean p = false;
    private boolean q = false;
    private boolean r;
    private LayerDrawable s;
    private int t;

    static {
        f3966a = Build.VERSION.SDK_INT >= 21;
    }

    a(MaterialButton materialButton, k kVar) {
        this.f3967b = materialButton;
        this.f3968c = kVar;
    }

    private void E(int i, int i2) {
        int I = v.I(this.f3967b);
        int paddingTop = this.f3967b.getPaddingTop();
        int iH = v.H(this.f3967b);
        int paddingBottom = this.f3967b.getPaddingBottom();
        int i3 = this.f3971f;
        int i4 = this.g;
        this.g = i2;
        this.f3971f = i;
        if (!this.p) {
            F();
        }
        v.A0(this.f3967b, I, (paddingTop + i) - i3, iH, (paddingBottom + i2) - i4);
    }

    private void F() {
        this.f3967b.setInternalBackground(a());
        g gVarF = f();
        if (gVarF != null) {
            gVarF.V(this.t);
        }
    }

    private void G(k kVar) {
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    private void I() {
        g gVarF = f();
        g gVarN = n();
        if (gVarF != null) {
            gVarF.c0(this.i, this.l);
            if (gVarN != null) {
                gVarN.b0(this.i, this.o ? c.b.a.b.q.a.c(this.f3967b, b.k) : 0);
            }
        }
    }

    private InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f3969d, this.f3971f, this.f3970e, this.g);
    }

    private Drawable a() {
        g gVar = new g(this.f3968c);
        gVar.M(this.f3967b.getContext());
        androidx.core.graphics.drawable.a.o(gVar, this.k);
        PorterDuff.Mode mode = this.j;
        if (mode != null) {
            androidx.core.graphics.drawable.a.p(gVar, mode);
        }
        gVar.c0(this.i, this.l);
        g gVar2 = new g(this.f3968c);
        gVar2.setTint(0);
        gVar2.b0(this.i, this.o ? c.b.a.b.q.a.c(this.f3967b, b.k) : 0);
        if (f3966a) {
            g gVar3 = new g(this.f3968c);
            this.n = gVar3;
            androidx.core.graphics.drawable.a.n(gVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(c.b.a.b.y.b.a(this.m), J(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.n);
            this.s = rippleDrawable;
            return rippleDrawable;
        }
        c.b.a.b.y.a aVar = new c.b.a.b.y.a(this.f3968c);
        this.n = aVar;
        androidx.core.graphics.drawable.a.o(aVar, c.b.a.b.y.b.a(this.m));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar, this.n});
        this.s = layerDrawable;
        return J(layerDrawable);
    }

    private g g(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        boolean z2 = f3966a;
        LayerDrawable layerDrawable2 = this.s;
        if (z2) {
            layerDrawable2 = (LayerDrawable) ((InsetDrawable) layerDrawable2.getDrawable(0)).getDrawable();
        }
        return (g) layerDrawable2.getDrawable(!z ? 1 : 0);
    }

    private g n() {
        return g(true);
    }

    void A(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            I();
        }
    }

    void B(int i) {
        if (this.i != i) {
            this.i = i;
            I();
        }
    }

    void C(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            if (f() != null) {
                androidx.core.graphics.drawable.a.o(f(), this.k);
            }
        }
    }

    void D(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            if (f() == null || this.j == null) {
                return;
            }
            androidx.core.graphics.drawable.a.p(f(), this.j);
        }
    }

    void H(int i, int i2) {
        Drawable drawable = this.n;
        if (drawable != null) {
            drawable.setBounds(this.f3969d, this.f3971f, i2 - this.f3970e, i - this.g);
        }
    }

    int b() {
        return this.h;
    }

    public int c() {
        return this.g;
    }

    public int d() {
        return this.f3971f;
    }

    public n e() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        int numberOfLayers = this.s.getNumberOfLayers();
        LayerDrawable layerDrawable2 = this.s;
        return (n) (numberOfLayers > 2 ? layerDrawable2.getDrawable(2) : layerDrawable2.getDrawable(1));
    }

    g f() {
        return g(false);
    }

    ColorStateList h() {
        return this.m;
    }

    k i() {
        return this.f3968c;
    }

    ColorStateList j() {
        return this.l;
    }

    int k() {
        return this.i;
    }

    ColorStateList l() {
        return this.k;
    }

    PorterDuff.Mode m() {
        return this.j;
    }

    boolean o() {
        return this.p;
    }

    boolean p() {
        return this.r;
    }

    void q(TypedArray typedArray) {
        this.f3969d = typedArray.getDimensionPixelOffset(c.b.a.b.k.U1, 0);
        this.f3970e = typedArray.getDimensionPixelOffset(c.b.a.b.k.V1, 0);
        this.f3971f = typedArray.getDimensionPixelOffset(c.b.a.b.k.W1, 0);
        this.g = typedArray.getDimensionPixelOffset(c.b.a.b.k.X1, 0);
        int i = c.b.a.b.k.b2;
        if (typedArray.hasValue(i)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i, -1);
            this.h = dimensionPixelSize;
            y(this.f3968c.w(dimensionPixelSize));
            this.q = true;
        }
        this.i = typedArray.getDimensionPixelSize(c.b.a.b.k.l2, 0);
        this.j = l.e(typedArray.getInt(c.b.a.b.k.a2, -1), PorterDuff.Mode.SRC_IN);
        this.k = c.a(this.f3967b.getContext(), typedArray, c.b.a.b.k.Z1);
        this.l = c.a(this.f3967b.getContext(), typedArray, c.b.a.b.k.k2);
        this.m = c.a(this.f3967b.getContext(), typedArray, c.b.a.b.k.j2);
        this.r = typedArray.getBoolean(c.b.a.b.k.Y1, false);
        this.t = typedArray.getDimensionPixelSize(c.b.a.b.k.c2, 0);
        int I = v.I(this.f3967b);
        int paddingTop = this.f3967b.getPaddingTop();
        int iH = v.H(this.f3967b);
        int paddingBottom = this.f3967b.getPaddingBottom();
        if (typedArray.hasValue(c.b.a.b.k.T1)) {
            s();
        } else {
            F();
        }
        v.A0(this.f3967b, I + this.f3969d, paddingTop + this.f3971f, iH + this.f3970e, paddingBottom + this.g);
    }

    void r(int i) {
        if (f() != null) {
            f().setTint(i);
        }
    }

    void s() {
        this.p = true;
        this.f3967b.setSupportBackgroundTintList(this.k);
        this.f3967b.setSupportBackgroundTintMode(this.j);
    }

    void t(boolean z) {
        this.r = z;
    }

    void u(int i) {
        if (this.q && this.h == i) {
            return;
        }
        this.h = i;
        this.q = true;
        y(this.f3968c.w(i));
    }

    public void v(int i) {
        E(this.f3971f, i);
    }

    public void w(int i) {
        E(i, this.g);
    }

    void x(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            boolean z = f3966a;
            if (z && (this.f3967b.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f3967b.getBackground()).setColor(c.b.a.b.y.b.a(colorStateList));
            } else {
                if (z || !(this.f3967b.getBackground() instanceof c.b.a.b.y.a)) {
                    return;
                }
                ((c.b.a.b.y.a) this.f3967b.getBackground()).setTintList(c.b.a.b.y.b.a(colorStateList));
            }
        }
    }

    void y(k kVar) {
        this.f3968c = kVar;
        G(kVar);
    }

    void z(boolean z) {
        this.o = z;
        I();
    }
}
