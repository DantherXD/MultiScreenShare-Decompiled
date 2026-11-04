package com.google.android.material.floatingactionbutton;

import a.g.l.v;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import c.b.a.b.a0.n;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final TimeInterpolator f4078a = c.b.a.b.l.a.f2757c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f4079b = {R.attr.state_pressed, R.attr.state_enabled};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f4080c = {R.attr.state_hovered, R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[] f4081d = {R.attr.state_focused, R.attr.state_enabled};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f4082e = {R.attr.state_hovered, R.attr.state_enabled};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f4083f = {R.attr.state_enabled};
    static final int[] g = new int[0];
    private int A;
    private ArrayList<Animator.AnimatorListener> C;
    private ArrayList<Animator.AnimatorListener> D;
    private ArrayList<i> E;
    final FloatingActionButton F;
    final c.b.a.b.z.b G;
    private ViewTreeObserver.OnPreDrawListener L;
    c.b.a.b.a0.k h;
    c.b.a.b.a0.g i;
    Drawable j;
    com.google.android.material.floatingactionbutton.a k;
    Drawable l;
    boolean m;
    float o;
    float p;
    float q;
    int r;
    private final com.google.android.material.internal.f s;
    private c.b.a.b.l.h t;
    private c.b.a.b.l.h u;
    private Animator v;
    private c.b.a.b.l.h w;
    private c.b.a.b.l.h x;
    private float y;
    boolean n = true;
    private float z = 1.0f;
    private int B = 0;
    private final Rect H = new Rect();
    private final RectF I = new RectF();
    private final RectF J = new RectF();
    private final Matrix K = new Matrix();

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f4085b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f4086c;

        a(boolean z, j jVar) {
            this.f4085b = z;
            this.f4086c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4084a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            if (this.f4084a) {
                return;
            }
            FloatingActionButton floatingActionButton = b.this.F;
            boolean z = this.f4085b;
            floatingActionButton.b(z ? 8 : 4, z);
            j jVar = this.f4086c;
            if (jVar != null) {
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.f4085b);
            b.this.B = 1;
            b.this.v = animator;
            this.f4084a = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.b$b, reason: collision with other inner class name */
    class C0099b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f4089b;

        C0099b(boolean z, j jVar) {
            this.f4088a = z;
            this.f4089b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.B = 0;
            b.this.v = null;
            j jVar = this.f4089b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.F.b(0, this.f4088a);
            b.this.B = 2;
            b.this.v = animator;
        }
    }

    class c extends c.b.a.b.l.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            b.this.z = f2;
            return super.evaluate(f2, matrix, matrix2);
        }
    }

    class d implements TypeEvaluator<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        FloatEvaluator f4092a = new FloatEvaluator();

        d() {
        }

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float evaluate(float f2, Float f3, Float f4) {
            float fFloatValue = this.f4092a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
            if (fFloatValue < 0.1f) {
                fFloatValue = 0.0f;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.F();
            return true;
        }
    }

    private class f extends l {
        f() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return 0.0f;
        }
    }

    private class g extends l {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.o + bVar.p;
        }
    }

    private class h extends l {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.o + bVar.q;
        }
    }

    interface i {
        void a();

        void b();
    }

    interface j {
        void a();

        void b();
    }

    private class k extends l {
        k() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return b.this.o;
        }
    }

    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f4099a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f4100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f4101c;

        private l() {
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.c0((int) this.f4101c);
            this.f4099a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f4099a) {
                c.b.a.b.a0.g gVar = b.this.i;
                this.f4100b = gVar == null ? 0.0f : gVar.w();
                this.f4101c = a();
                this.f4099a = true;
            }
            b bVar = b.this;
            float f2 = this.f4100b;
            bVar.c0((int) (f2 + ((this.f4101c - f2) * valueAnimator.getAnimatedFraction())));
        }
    }

    b(FloatingActionButton floatingActionButton, c.b.a.b.z.b bVar) {
        this.F = floatingActionButton;
        this.G = bVar;
        com.google.android.material.internal.f fVar = new com.google.android.material.internal.f();
        this.s = fVar;
        fVar.a(f4079b, i(new h()));
        fVar.a(f4080c, i(new g()));
        fVar.a(f4081d, i(new g()));
        fVar.a(f4082e, i(new g()));
        fVar.a(f4083f, i(new k()));
        fVar.a(g, i(new f()));
        this.y = floatingActionButton.getRotation();
    }

    private boolean W() {
        return v.T(this.F) && !this.F.isInEditMode();
    }

    private void d0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d());
    }

    private void g(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.F.getDrawable();
        if (drawable == null || this.A == 0) {
            return;
        }
        RectF rectF = this.I;
        RectF rectF2 = this.J;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.A;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.A;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    private AnimatorSet h(c.b.a.b.l.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.ALPHA, f2);
        hVar.e("opacity").a(objectAnimatorOfFloat);
        arrayList.add(objectAnimatorOfFloat);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_X, f3);
        hVar.e("scale").a(objectAnimatorOfFloat2);
        d0(objectAnimatorOfFloat2);
        arrayList.add(objectAnimatorOfFloat2);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.F, (Property<FloatingActionButton, Float>) View.SCALE_Y, f3);
        hVar.e("scale").a(objectAnimatorOfFloat3);
        d0(objectAnimatorOfFloat3);
        arrayList.add(objectAnimatorOfFloat3);
        g(f4, this.K);
        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(this.F, new c.b.a.b.l.f(), new c(), new Matrix(this.K));
        hVar.e("iconScale").a(objectAnimatorOfObject);
        arrayList.add(objectAnimatorOfObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.b.a.b.l.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator i(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f4078a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private c.b.a.b.l.h k() {
        if (this.u == null) {
            this.u = c.b.a.b.l.h.c(this.F.getContext(), c.b.a.b.a.f2628a);
        }
        return (c.b.a.b.l.h) a.g.k.h.e(this.u);
    }

    private c.b.a.b.l.h l() {
        if (this.t == null) {
            this.t = c.b.a.b.l.h.c(this.F.getContext(), c.b.a.b.a.f2629b);
        }
        return (c.b.a.b.l.h) a.g.k.h.e(this.t);
    }

    private ViewTreeObserver.OnPreDrawListener q() {
        if (this.L == null) {
            this.L = new e();
        }
        return this.L;
    }

    void A() {
    }

    void B() {
        ViewTreeObserver viewTreeObserver = this.F.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.L;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.L = null;
        }
    }

    void C(int[] iArr) {
        this.s.d(iArr);
    }

    void D(float f2, float f3, float f4) {
        b0();
        c0(f2);
    }

    void E(Rect rect) {
        a.g.k.h.f(this.l, "Didn't initialize content background");
        if (!V()) {
            this.G.c(this.l);
        } else {
            this.G.c(new InsetDrawable(this.l, rect.left, rect.top, rect.right, rect.bottom));
        }
    }

    void F() {
        float rotation = this.F.getRotation();
        if (this.y != rotation) {
            this.y = rotation;
            Z();
        }
    }

    void G() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    void H() {
        ArrayList<i> arrayList = this.E;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    boolean I() {
        return true;
    }

    void J(ColorStateList colorStateList) {
        c.b.a.b.a0.g gVar = this.i;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        if (this.k != null) {
            throw null;
        }
    }

    void K(PorterDuff.Mode mode) {
        c.b.a.b.a0.g gVar = this.i;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    final void L(float f2) {
        if (this.o != f2) {
            this.o = f2;
            D(f2, this.p, this.q);
        }
    }

    void M(boolean z) {
        this.m = z;
    }

    final void N(c.b.a.b.l.h hVar) {
        this.x = hVar;
    }

    final void O(float f2) {
        if (this.p != f2) {
            this.p = f2;
            D(this.o, f2, this.q);
        }
    }

    final void P(float f2) {
        this.z = f2;
        Matrix matrix = this.K;
        g(f2, matrix);
        this.F.setImageMatrix(matrix);
    }

    final void Q(float f2) {
        if (this.q != f2) {
            this.q = f2;
            D(this.o, this.p, f2);
        }
    }

    void R(ColorStateList colorStateList) {
        Drawable drawable = this.j;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.o(drawable, c.b.a.b.y.b.a(colorStateList));
        }
    }

    void S(boolean z) {
        this.n = z;
        b0();
    }

    final void T(c.b.a.b.a0.k kVar) {
        this.h = kVar;
        c.b.a.b.a0.g gVar = this.i;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Object obj = this.j;
        if (obj instanceof n) {
            ((n) obj).setShapeAppearanceModel(kVar);
        }
        if (this.k != null) {
            throw null;
        }
    }

    final void U(c.b.a.b.l.h hVar) {
        this.w = hVar;
    }

    boolean V() {
        return true;
    }

    final boolean X() {
        return !this.m || this.F.getSizeDimension() >= this.r;
    }

    void Y(j jVar, boolean z) {
        if (x()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.F.b(0, z);
            this.F.setAlpha(1.0f);
            this.F.setScaleY(1.0f);
            this.F.setScaleX(1.0f);
            P(1.0f);
            if (jVar != null) {
                jVar.a();
                return;
            }
            return;
        }
        if (this.F.getVisibility() != 0) {
            this.F.setAlpha(0.0f);
            this.F.setScaleY(0.0f);
            this.F.setScaleX(0.0f);
            P(0.0f);
        }
        c.b.a.b.l.h hVarL = this.w;
        if (hVarL == null) {
            hVarL = l();
        }
        AnimatorSet animatorSetH = h(hVarL, 1.0f, 1.0f, 1.0f);
        animatorSetH.addListener(new C0099b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.C;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    void Z() {
        FloatingActionButton floatingActionButton;
        int i2;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.y % 90.0f != 0.0f) {
                i2 = 1;
                if (this.F.getLayerType() != 1) {
                    floatingActionButton = this.F;
                    floatingActionButton.setLayerType(i2, null);
                }
            } else if (this.F.getLayerType() != 0) {
                floatingActionButton = this.F;
                i2 = 0;
                floatingActionButton.setLayerType(i2, null);
            }
        }
        c.b.a.b.a0.g gVar = this.i;
        if (gVar != null) {
            gVar.a0((int) this.y);
        }
    }

    final void a0() {
        P(this.z);
    }

    final void b0() {
        Rect rect = this.H;
        r(rect);
        E(rect);
        this.G.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    void c0(float f2) {
        c.b.a.b.a0.g gVar = this.i;
        if (gVar != null) {
            gVar.V(f2);
        }
    }

    public void d(Animator.AnimatorListener animatorListener) {
        if (this.D == null) {
            this.D = new ArrayList<>();
        }
        this.D.add(animatorListener);
    }

    void e(Animator.AnimatorListener animatorListener) {
        if (this.C == null) {
            this.C = new ArrayList<>();
        }
        this.C.add(animatorListener);
    }

    void f(i iVar) {
        if (this.E == null) {
            this.E = new ArrayList<>();
        }
        this.E.add(iVar);
    }

    final Drawable j() {
        return this.l;
    }

    float m() {
        return this.o;
    }

    boolean n() {
        return this.m;
    }

    final c.b.a.b.l.h o() {
        return this.x;
    }

    float p() {
        return this.p;
    }

    void r(Rect rect) {
        int sizeDimension = this.m ? (this.r - this.F.getSizeDimension()) / 2 : 0;
        float fM = this.n ? m() + this.q : 0.0f;
        int iMax = Math.max(sizeDimension, (int) Math.ceil(fM));
        int iMax2 = Math.max(sizeDimension, (int) Math.ceil(fM * 1.5f));
        rect.set(iMax, iMax2, iMax, iMax2);
    }

    float s() {
        return this.q;
    }

    final c.b.a.b.a0.k t() {
        return this.h;
    }

    final c.b.a.b.l.h u() {
        return this.w;
    }

    void v(j jVar, boolean z) {
        if (w()) {
            return;
        }
        Animator animator = this.v;
        if (animator != null) {
            animator.cancel();
        }
        if (!W()) {
            this.F.b(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.b();
                return;
            }
            return;
        }
        c.b.a.b.l.h hVarK = this.x;
        if (hVarK == null) {
            hVarK = k();
        }
        AnimatorSet animatorSetH = h(hVarK, 0.0f, 0.0f, 0.0f);
        animatorSetH.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.D;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                animatorSetH.addListener(it.next());
            }
        }
        animatorSetH.start();
    }

    boolean w() {
        int visibility = this.F.getVisibility();
        int i2 = this.B;
        if (visibility == 0) {
            return i2 == 1;
        }
        return i2 != 2;
    }

    boolean x() {
        int visibility = this.F.getVisibility();
        int i2 = this.B;
        if (visibility != 0) {
            return i2 == 2;
        }
        return i2 != 1;
    }

    void y() {
        this.s.c();
    }

    void z() {
        c.b.a.b.a0.g gVar = this.i;
        if (gVar != null) {
            c.b.a.b.a0.h.f(this.F, gVar);
        }
        if (I()) {
            this.F.getViewTreeObserver().addOnPreDrawListener(q());
        }
    }
}
