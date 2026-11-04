package androidx.recyclerview.widget;

import a.g.l.v;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class d extends RecyclerView.o implements RecyclerView.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2310a = {R.attr.state_pressed};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f2311b = new int[0];
    final ValueAnimator B;
    int C;
    private final Runnable D;
    private final RecyclerView.u E;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final StateListDrawable f2314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Drawable f2315f;
    private final int g;
    private final int h;
    private final StateListDrawable i;
    private final Drawable j;
    private final int k;
    private final int l;
    int m;
    int n;
    float o;
    int p;
    int q;
    float r;
    private RecyclerView u;
    private int s = 0;
    private int t = 0;
    private boolean v = false;
    private boolean w = false;
    private int x = 0;
    private int y = 0;
    private final int[] z = new int[2];
    private final int[] A = new int[2];

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    class b extends RecyclerView.u {
        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    private class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f2318a = false;

        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2318a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f2318a) {
                this.f2318a = false;
                return;
            }
            float fFloatValue = ((Float) d.this.B.getAnimatedValue()).floatValue();
            d dVar = d.this;
            if (fFloatValue == 0.0f) {
                dVar.C = 0;
                dVar.y(0);
            } else {
                dVar.C = 2;
                dVar.v();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    private class C0059d implements ValueAnimator.AnimatorUpdateListener {
        C0059d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f2314e.setAlpha(iFloatValue);
            d.this.f2315f.setAlpha(iFloatValue);
            d.this.v();
        }
    }

    d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.B = valueAnimatorOfFloat;
        this.C = 0;
        this.D = new a();
        this.E = new b();
        this.f2314e = stateListDrawable;
        this.f2315f = drawable;
        this.i = stateListDrawable2;
        this.j = drawable2;
        this.g = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.h = Math.max(i, drawable.getIntrinsicWidth());
        this.k = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.l = Math.max(i, drawable2.getIntrinsicWidth());
        this.f2312c = i2;
        this.f2313d = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new c());
        valueAnimatorOfFloat.addUpdateListener(new C0059d());
        j(recyclerView);
    }

    private void C(float f2) {
        int[] iArrP = p();
        float fMax = Math.max(iArrP[0], Math.min(iArrP[1], f2));
        if (Math.abs(this.n - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.o, fMax, iArrP, this.u.computeVerticalScrollRange(), this.u.computeVerticalScrollOffset(), this.t);
        if (iX != 0) {
            this.u.scrollBy(0, iX);
        }
        this.o = fMax;
    }

    private void k() {
        this.u.removeCallbacks(this.D);
    }

    private void l() {
        this.u.W0(this);
        this.u.X0(this);
        this.u.Y0(this.E);
        k();
    }

    private void m(Canvas canvas) {
        int i = this.t;
        int i2 = this.k;
        int i3 = i - i2;
        int i4 = this.q;
        int i5 = this.p;
        int i6 = i4 - (i5 / 2);
        this.i.setBounds(0, 0, i5, i2);
        this.j.setBounds(0, 0, this.s, this.l);
        canvas.translate(0.0f, i3);
        this.j.draw(canvas);
        canvas.translate(i6, 0.0f);
        this.i.draw(canvas);
        canvas.translate(-i6, -i3);
    }

    private void n(Canvas canvas) {
        int i;
        int i2 = this.s;
        int i3 = this.g;
        int i4 = i2 - i3;
        int i5 = this.n;
        int i6 = this.m;
        int i7 = i5 - (i6 / 2);
        this.f2314e.setBounds(0, 0, i3, i6);
        this.f2315f.setBounds(0, 0, this.h, this.t);
        if (s()) {
            this.f2315f.draw(canvas);
            canvas.translate(this.g, i7);
            canvas.scale(-1.0f, 1.0f);
            this.f2314e.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            i = -this.g;
        } else {
            canvas.translate(i4, 0.0f);
            this.f2315f.draw(canvas);
            canvas.translate(0.0f, i7);
            this.f2314e.draw(canvas);
            i = -i4;
        }
        canvas.translate(i, -i7);
    }

    private int[] o() {
        int[] iArr = this.A;
        int i = this.f2313d;
        iArr[0] = i;
        iArr[1] = this.s - i;
        return iArr;
    }

    private int[] p() {
        int[] iArr = this.z;
        int i = this.f2313d;
        iArr[0] = i;
        iArr[1] = this.t - i;
        return iArr;
    }

    private void r(float f2) {
        int[] iArrO = o();
        float fMax = Math.max(iArrO[0], Math.min(iArrO[1], f2));
        if (Math.abs(this.q - fMax) < 2.0f) {
            return;
        }
        int iX = x(this.r, fMax, iArrO, this.u.computeHorizontalScrollRange(), this.u.computeHorizontalScrollOffset(), this.s);
        if (iX != 0) {
            this.u.scrollBy(iX, 0);
        }
        this.r = fMax;
    }

    private boolean s() {
        return v.C(this.u) == 1;
    }

    private void w(int i) {
        k();
        this.u.postDelayed(this.D, i);
    }

    private int x(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    private void z() {
        this.u.h(this);
        this.u.j(this);
        this.u.k(this.E);
    }

    public void A() {
        int i = this.C;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.B.cancel();
            }
        }
        this.C = 1;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.B.setDuration(500L);
        this.B.setStartDelay(0L);
        this.B.start();
    }

    void B(int i, int i2) {
        int iComputeVerticalScrollRange = this.u.computeVerticalScrollRange();
        int i3 = this.t;
        this.v = iComputeVerticalScrollRange - i3 > 0 && i3 >= this.f2312c;
        int iComputeHorizontalScrollRange = this.u.computeHorizontalScrollRange();
        int i4 = this.s;
        boolean z = iComputeHorizontalScrollRange - i4 > 0 && i4 >= this.f2312c;
        this.w = z;
        boolean z2 = this.v;
        if (!z2 && !z) {
            if (this.x != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z2) {
            float f2 = i3;
            this.n = (int) ((f2 * (i2 + (f2 / 2.0f))) / iComputeVerticalScrollRange);
            this.m = Math.min(i3, (i3 * i3) / iComputeVerticalScrollRange);
        }
        if (this.w) {
            float f3 = i4;
            this.q = (int) ((f3 * (i + (f3 / 2.0f))) / iComputeHorizontalScrollRange);
            this.p = Math.min(i4, (i4 * i4) / iComputeHorizontalScrollRange);
        }
        int i5 = this.x;
        if (i5 == 0 || i5 == 1) {
            y(1);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i = this.x;
        if (i == 1) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (!zU && !zT) {
                return false;
            }
            if (zT) {
                this.y = 1;
                this.r = (int) motionEvent.getX();
            } else if (zU) {
                this.y = 2;
                this.o = (int) motionEvent.getY();
            }
            y(2);
        } else if (i != 2) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.x == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean zU = u(motionEvent.getX(), motionEvent.getY());
            boolean zT = t(motionEvent.getX(), motionEvent.getY());
            if (zU || zT) {
                if (zT) {
                    this.y = 1;
                    this.r = (int) motionEvent.getX();
                } else if (zU) {
                    this.y = 2;
                    this.o = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.x == 2) {
            this.o = 0.0f;
            this.r = 0.0f;
            y(1);
            this.y = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.x == 2) {
            A();
            if (this.y == 1) {
                r(motionEvent.getX());
            }
            if (this.y == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        if (this.s != this.u.getWidth() || this.t != this.u.getHeight()) {
            this.s = this.u.getWidth();
            this.t = this.u.getHeight();
            y(0);
        } else if (this.C != 0) {
            if (this.v) {
                n(canvas);
            }
            if (this.w) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.u;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.u = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    void q(int i) {
        int i2 = this.C;
        if (i2 == 1) {
            this.B.cancel();
        } else if (i2 != 2) {
            return;
        }
        this.C = 3;
        ValueAnimator valueAnimator = this.B;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.B.setDuration(i);
        this.B.start();
    }

    boolean t(float f2, float f3) {
        if (f3 >= this.t - this.k) {
            int i = this.q;
            int i2 = this.p;
            if (f2 >= i - (i2 / 2) && f2 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    boolean u(float f2, float f3) {
        if (!s() ? f2 >= this.s - this.g : f2 <= this.g) {
            int i = this.n;
            int i2 = this.m;
            if (f3 >= i - (i2 / 2) && f3 <= i + (i2 / 2)) {
                return true;
            }
        }
        return false;
    }

    void v() {
        this.u.invalidate();
    }

    void y(int i) {
        int i2;
        if (i == 2 && this.x != 2) {
            this.f2314e.setState(f2310a);
            k();
        }
        if (i == 0) {
            v();
        } else {
            A();
        }
        if (this.x != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.x = i;
        }
        this.f2314e.setState(f2311b);
        w(i2);
        this.x = i;
    }
}
