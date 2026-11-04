package androidx.core.widget;

import a.g.l.v;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f1767b = ViewConfiguration.getTapTimeout();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final View f1770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f1771f;
    private int i;
    private int j;
    private boolean n;
    boolean o;
    boolean p;
    boolean q;
    private boolean r;
    private boolean s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final C0050a f1768c = new C0050a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Interpolator f1769d = new AccelerateInterpolator();
    private float[] g = {0.0f, 0.0f};
    private float[] h = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] k = {0.0f, 0.0f};
    private float[] l = {0.0f, 0.0f};
    private float[] m = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    private static class C0050a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1773b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f1774c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f1775d;
        private float j;
        private int k;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f1776e = Long.MIN_VALUE;
        private long i = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f1777f = 0;
        private int g = 0;
        private int h = 0;

        C0050a() {
        }

        private float e(long j) {
            long j2 = this.f1776e;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.i;
            if (j3 < 0 || j < j3) {
                return a.e((j - j2) / this.f1772a, 0.0f, 1.0f) * 0.5f;
            }
            float f2 = this.j;
            return (1.0f - f2) + (f2 * a.e((j - j3) / this.k, 0.0f, 1.0f));
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f1777f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float fG = g(e(jCurrentAnimationTimeMillis));
            long j = jCurrentAnimationTimeMillis - this.f1777f;
            this.f1777f = jCurrentAnimationTimeMillis;
            float f2 = j * fG;
            this.g = (int) (this.f1774c * f2);
            this.h = (int) (f2 * this.f1775d);
        }

        public int b() {
            return this.g;
        }

        public int c() {
            return this.h;
        }

        public int d() {
            float f2 = this.f1774c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f1775d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.i + ((long) this.k);
        }

        public void i() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = a.f((int) (jCurrentAnimationTimeMillis - this.f1776e), 0, this.f1773b);
            this.j = e(jCurrentAnimationTimeMillis);
            this.i = jCurrentAnimationTimeMillis;
        }

        public void j(int i) {
            this.f1773b = i;
        }

        public void k(int i) {
            this.f1772a = i;
        }

        public void l(float f2, float f3) {
            this.f1774c = f2;
            this.f1775d = f3;
        }

        public void m() {
            long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1776e = jCurrentAnimationTimeMillis;
            this.i = -1L;
            this.f1777f = jCurrentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.q) {
                if (aVar.o) {
                    aVar.o = false;
                    aVar.f1768c.m();
                }
                C0050a c0050a = a.this.f1768c;
                if (c0050a.h() || !a.this.u()) {
                    a.this.q = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.p) {
                    aVar2.p = false;
                    aVar2.c();
                }
                c0050a.a();
                a.this.j(c0050a.b(), c0050a.c());
                v.g0(a.this.f1770e, this);
            }
        }
    }

    public a(View view) {
        this.f1770e = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f1767b);
        r(500);
        q(500);
    }

    private float d(int i, float f2, float f3, float f4) {
        float fH = h(this.g[i], f3, this.h[i], f2);
        if (fH == 0.0f) {
            return 0.0f;
        }
        float f5 = this.k[i];
        float f6 = this.l[i];
        float f7 = this.m[i];
        float f8 = f5 * f4;
        return fH > 0.0f ? e(fH * f8, f6, f7) : -e((-fH) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        return f2 < f3 ? f3 : f2;
    }

    static int f(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.i;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.q && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float fE = e(f2 * f3, 0.0f, f4);
        float fG = g(f3 - f5, fE) - g(f5, fE);
        if (fG < 0.0f) {
            interpolation = -this.f1769d.getInterpolation(-fG);
        } else {
            if (fG <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1769d.getInterpolation(fG);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.o) {
            this.q = false;
        } else {
            this.f1768c.i();
        }
    }

    private void v() {
        int i;
        if (this.f1771f == null) {
            this.f1771f = new b();
        }
        this.q = true;
        this.o = true;
        if (this.n || (i = this.j) <= 0) {
            this.f1771f.run();
        } else {
            v.h0(this.f1770e, this.f1771f, i);
        }
        this.n = true;
    }

    public abstract boolean a(int i);

    public abstract boolean b(int i);

    void c() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1770e.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public abstract void j(int i, int i2);

    public a k(int i) {
        this.j = i;
        return this;
    }

    public a l(int i) {
        this.i = i;
        return this;
    }

    public a m(boolean z) {
        if (this.r && !z) {
            i();
        }
        this.r = z;
        return this;
    }

    public a n(float f2, float f3) {
        float[] fArr = this.h;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a o(float f2, float f3) {
        float[] fArr = this.m;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!this.r) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i();
                }
            }
            return this.s && this.q;
        }
        this.p = true;
        this.n = false;
        this.f1768c.l(d(0, motionEvent.getX(), view.getWidth(), this.f1770e.getWidth()), d(1, motionEvent.getY(), view.getHeight(), this.f1770e.getHeight()));
        if (!this.q && u()) {
            v();
        }
        if (this.s) {
            return false;
        }
    }

    public a p(float f2, float f3) {
        float[] fArr = this.l;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public a q(int i) {
        this.f1768c.j(i);
        return this;
    }

    public a r(int i) {
        this.f1768c.k(i);
        return this;
    }

    public a s(float f2, float f3) {
        float[] fArr = this.g;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public a t(float f2, float f3) {
        float[] fArr = this.k;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean u() {
        C0050a c0050a = this.f1768c;
        int iF = c0050a.f();
        int iD = c0050a.d();
        return (iF != 0 && b(iF)) || (iD != 0 && a(iD));
    }
}
