package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements a.g.l.k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f2142b = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final boolean f2143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final boolean f2144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final boolean f2145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final boolean f2146f;
    private static final boolean g;
    private static final boolean h;
    private static final Class<?>[] i;
    static final Interpolator j;
    private final ArrayList<t> A;
    private k A0;
    private t B;
    private final int[] B0;
    boolean C;
    private a.g.l.l C0;
    boolean D;
    private final int[] D0;
    boolean E;
    private final int[] E0;
    boolean F;
    final int[] F0;
    private int G;
    final List<e0> G0;
    boolean H;
    private Runnable H0;
    boolean I;
    private boolean I0;
    private boolean J;
    private int J0;
    private int K;
    private int K0;
    boolean L;
    private final androidx.recyclerview.widget.p.b L0;
    private final AccessibilityManager M;
    private List<r> N;
    boolean O;
    boolean P;
    private int Q;
    private int R;
    private l S;
    private EdgeEffect T;
    private EdgeEffect U;
    private EdgeEffect V;
    private EdgeEffect W;
    m a0;
    private int b0;
    private int c0;
    private VelocityTracker d0;
    private int e0;
    private int f0;
    private int g0;
    private int h0;
    private int i0;
    private s j0;
    private final y k;
    private final int k0;
    final w l;
    private final int l0;
    z m;
    private float m0;
    androidx.recyclerview.widget.a n;
    private float n0;
    androidx.recyclerview.widget.b o;
    private boolean o0;
    final androidx.recyclerview.widget.p p;
    final d0 p0;
    boolean q;
    androidx.recyclerview.widget.e q0;
    final Runnable r;
    androidx.recyclerview.widget.e.b r0;
    final Rect s;
    final b0 s0;
    private final Rect t;
    private u t0;
    final RectF u;
    private List<u> u0;
    h v;
    boolean v0;
    p w;
    boolean w0;
    x x;
    private m.b x0;
    final List<x> y;
    boolean y0;
    final ArrayList<o> z;
    androidx.recyclerview.widget.k z0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.F || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.C) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.I) {
                recyclerView2.H = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    public static abstract class a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private RecyclerView f2149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private p f2150c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2151d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f2153f;
        private boolean h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f2148a = -1;
        private final a g = new a(0, 0);

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f2154a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f2155b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f2156c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f2157d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private Interpolator f2158e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private boolean f2159f;
            private int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.f2157d = -1;
                this.f2159f = false;
                this.g = 0;
                this.f2154a = i;
                this.f2155b = i2;
                this.f2156c = i3;
                this.f2158e = interpolator;
            }

            private void e() {
                if (this.f2158e != null && this.f2156c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f2156c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f2157d >= 0;
            }

            public void b(int i) {
                this.f2157d = i;
            }

            void c(RecyclerView recyclerView) {
                int i = this.f2157d;
                if (i >= 0) {
                    this.f2157d = -1;
                    recyclerView.v0(i);
                    this.f2159f = false;
                } else {
                    if (!this.f2159f) {
                        this.g = 0;
                        return;
                    }
                    e();
                    recyclerView.p0.e(this.f2154a, this.f2155b, this.f2156c, this.f2158e);
                    int i2 = this.g + 1;
                    this.g = i2;
                    if (i2 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f2159f = false;
                }
            }

            public void d(int i, int i2, int i3, Interpolator interpolator) {
                this.f2154a = i;
                this.f2155b = i2;
                this.f2156c = i3;
                this.f2158e = interpolator;
                this.f2159f = true;
            }
        }

        public interface b {
            PointF a(int i);
        }

        public PointF a(int i) {
            Object objE = e();
            if (objE instanceof b) {
                return ((b) objE).a(i);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i) {
            return this.f2149b.w.C(i);
        }

        public int c() {
            return this.f2149b.w.J();
        }

        public int d(View view) {
            return this.f2149b.d0(view);
        }

        public p e() {
            return this.f2150c;
        }

        public int f() {
            return this.f2148a;
        }

        public boolean g() {
            return this.f2151d;
        }

        public boolean h() {
            return this.f2152e;
        }

        protected void i(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float fSqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= fSqrt;
            pointF.y /= fSqrt;
        }

        void j(int i, int i2) {
            PointF pointFA;
            RecyclerView recyclerView = this.f2149b;
            if (this.f2148a == -1 || recyclerView == null) {
                r();
            }
            if (this.f2151d && this.f2153f == null && this.f2150c != null && (pointFA = a(this.f2148a)) != null) {
                float f2 = pointFA.x;
                if (f2 != 0.0f || pointFA.y != 0.0f) {
                    recyclerView.g1((int) Math.signum(f2), (int) Math.signum(pointFA.y), null);
                }
            }
            this.f2151d = false;
            View view = this.f2153f;
            if (view != null) {
                if (d(view) == this.f2148a) {
                    o(this.f2153f, recyclerView.s0, this.g);
                    this.g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f2153f = null;
                }
            }
            if (this.f2152e) {
                l(i, i2, recyclerView.s0, this.g);
                boolean zA = this.g.a();
                this.g.c(recyclerView);
                if (zA && this.f2152e) {
                    this.f2151d = true;
                    recyclerView.p0.d();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f2153f = view;
            }
        }

        protected abstract void l(int i, int i2, b0 b0Var, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, b0 b0Var, a aVar);

        public void p(int i) {
            this.f2148a = i;
        }

        void q(RecyclerView recyclerView, p pVar) {
            recyclerView.p0.f();
            if (this.h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f2149b = recyclerView;
            this.f2150c = pVar;
            int i = this.f2148a;
            if (i == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.s0.f2161a = i;
            this.f2152e = true;
            this.f2151d = true;
            this.f2153f = b(f());
            m();
            this.f2149b.p0.d();
            this.h = true;
        }

        protected final void r() {
            if (this.f2152e) {
                this.f2152e = false;
                n();
                this.f2149b.s0.f2161a = -1;
                this.f2153f = null;
                this.f2148a = -1;
                this.f2151d = false;
                this.f2150c.f1(this);
                this.f2150c = null;
                this.f2149b = null;
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = RecyclerView.this.a0;
            if (mVar != null) {
                mVar.u();
            }
            RecyclerView.this.y0 = false;
        }
    }

    public static class b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray<Object> f2162b;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2161a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2163c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2164d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2165e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2166f = 0;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;

        void a(int i) {
            if ((this.f2165e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f2165e));
        }

        public int b() {
            return this.h ? this.f2163c - this.f2164d : this.f2166f;
        }

        public int c() {
            return this.f2161a;
        }

        public boolean d() {
            return this.f2161a != -1;
        }

        public boolean e() {
            return this.h;
        }

        void f(h hVar) {
            this.f2165e = 1;
            this.f2166f = hVar.d();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public boolean g() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f2161a + ", mData=" + this.f2162b + ", mItemCount=" + this.f2166f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f2163c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f2164d + ", mStructureChanged=" + this.g + ", mInPreLayout=" + this.h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    public static abstract class c0 {
    }

    class d implements androidx.recyclerview.widget.p.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(e0 e0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.w.m1(e0Var.f2175b, recyclerView.l);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.l(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(e0 e0Var, m.c cVar, m.c cVar2) {
            RecyclerView.this.l.J(e0Var);
            RecyclerView.this.n(e0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(e0 e0Var, m.c cVar, m.c cVar2) {
            e0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.O;
            m mVar = recyclerView.a0;
            if (z) {
                if (!mVar.b(e0Var, e0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!mVar.d(e0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.M0();
        }
    }

    class d0 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2168b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f2169c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        OverScroller f2170d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Interpolator f2171e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f2172f;
        private boolean g;

        d0() {
            Interpolator interpolator = RecyclerView.j;
            this.f2171e = interpolator;
            this.f2172f = false;
            this.g = false;
            this.f2170d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i, int i2) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i2);
            boolean z = iAbs > iAbs2;
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            if (!z) {
                iAbs = iAbs2;
            }
            return Math.min((int) (((iAbs / width) + 1.0f) * 300.0f), 2000);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            a.g.l.v.g0(RecyclerView.this, this);
        }

        public void b(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f2169c = 0;
            this.f2168b = 0;
            Interpolator interpolator = this.f2171e;
            Interpolator interpolator2 = RecyclerView.j;
            if (interpolator != interpolator2) {
                this.f2171e = interpolator2;
                this.f2170d = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f2170d.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            d();
        }

        void d() {
            if (this.f2172f) {
                this.g = true;
            } else {
                c();
            }
        }

        public void e(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.j;
            }
            if (this.f2171e != interpolator) {
                this.f2171e = interpolator;
                this.f2170d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f2169c = 0;
            this.f2168b = 0;
            RecyclerView.this.setScrollState(2);
            this.f2170d.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f2170d.computeScrollOffset();
            }
            d();
        }

        public void f() {
            RecyclerView.this.removeCallbacks(this);
            this.f2170d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            int i3;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.w == null) {
                f();
                return;
            }
            this.g = false;
            this.f2172f = true;
            recyclerView.u();
            OverScroller overScroller = this.f2170d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f2168b;
                int i5 = currY - this.f2169c;
                this.f2168b = currX;
                this.f2169c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.F0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i4, i5, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.F0;
                    i4 -= iArr2[0];
                    i5 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i4, i5);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.v != null) {
                    int[] iArr3 = recyclerView3.F0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.g1(i4, i5, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.F0;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i4 -= i2;
                    i5 -= i;
                    a0 a0Var = recyclerView4.w.g;
                    if (a0Var != null && !a0Var.g() && a0Var.h()) {
                        int iB = RecyclerView.this.s0.b();
                        if (iB == 0) {
                            a0Var.r();
                        } else {
                            if (a0Var.f() >= iB) {
                                a0Var.p(iB - 1);
                            }
                            a0Var.j(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.z.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.F0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i2, i, i4, i5, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.F0;
                int i6 = i4 - iArr6[0];
                int i7 = i5 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    recyclerView6.I(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i6 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i7 != 0));
                a0 a0Var2 = RecyclerView.this.w.g;
                if ((a0Var2 != null && a0Var2.g()) || !z) {
                    d();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.q0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i6 < 0) {
                            i3 = -currVelocity;
                        } else {
                            i3 = i6 > 0 ? currVelocity : 0;
                        }
                        if (i7 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i7 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i3, currVelocity);
                    }
                    if (RecyclerView.f2146f) {
                        RecyclerView.this.r0.b();
                    }
                }
            }
            a0 a0Var3 = RecyclerView.this.w.g;
            if (a0Var3 != null && a0Var3.g()) {
                a0Var3.j(0, 0);
            }
            this.f2172f = false;
            if (this.g) {
                c();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.t1(1);
            }
        }
    }

    class e implements androidx.recyclerview.widget.b.InterfaceC0057b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public void b(View view) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (e0VarF0 != null) {
                e0VarF0.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public void c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public void d() {
            int iK = k();
            for (int i = 0; i < iK; i++) {
                View viewA = a(i);
                RecyclerView.this.z(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public e0 e(View view) {
            return RecyclerView.f0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public void f(int i) {
            e0 e0VarF0;
            View viewA = a(i);
            if (viewA != null && (e0VarF0 = RecyclerView.f0(viewA)) != null) {
                if (e0VarF0.x() && !e0VarF0.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + e0VarF0 + RecyclerView.this.P());
                }
                e0VarF0.b(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public void g(View view) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (e0VarF0 != null) {
                e0VarF0.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public void h(View view, int i, ViewGroup.LayoutParams layoutParams) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (e0VarF0 != null) {
                if (!e0VarF0.x() && !e0VarF0.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + e0VarF0 + RecyclerView.this.P());
                }
                e0VarF0.f();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public void i(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public int j(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0057b
        public int k() {
            return RecyclerView.this.getChildCount();
        }
    }

    public static abstract class e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final List<Object> f2174a = Collections.emptyList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f2175b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        WeakReference<RecyclerView> f2176c;
        int k;
        RecyclerView s;
        h<? extends e0> t;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2177d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2178e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f2179f = -1;
        int g = -1;
        int h = -1;
        e0 i = null;
        e0 j = null;
        List<Object> l = null;
        List<Object> m = null;
        private int n = 0;
        w o = null;
        boolean p = false;
        private int q = 0;
        int r = -1;

        public e0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f2175b = view;
        }

        private void g() {
            if (this.l == null) {
                ArrayList arrayList = new ArrayList();
                this.l = arrayList;
                this.m = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i, boolean z) {
            if (this.f2178e == -1) {
                this.f2178e = this.f2177d;
            }
            if (this.h == -1) {
                this.h = this.f2177d;
            }
            if (z) {
                this.h += i;
            }
            this.f2177d += i;
            if (this.f2175b.getLayoutParams() != null) {
                ((q) this.f2175b.getLayoutParams()).f2214c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int iA = this.r;
            if (iA == -1) {
                iA = a.g.l.v.A(this.f2175b);
            }
            this.q = iA;
            recyclerView.j1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.j1(this, this.q);
            this.q = 0;
        }

        void D() {
            this.k = 0;
            this.f2177d = -1;
            this.f2178e = -1;
            this.f2179f = -1L;
            this.h = -1;
            this.n = 0;
            this.i = null;
            this.j = null;
            d();
            this.q = 0;
            this.r = -1;
            RecyclerView.r(this);
        }

        void E() {
            if (this.f2178e == -1) {
                this.f2178e = this.f2177d;
            }
        }

        void F(int i, int i2) {
            this.k = (i & i2) | (this.k & (~i2));
        }

        public final void G(boolean z) {
            int i;
            int i2 = this.n;
            int i3 = z ? i2 - 1 : i2 + 1;
            this.n = i3;
            if (i3 < 0) {
                this.n = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.k | 16;
            } else if (!z || i3 != 0) {
                return;
            } else {
                i = this.k & (-17);
            }
            this.k = i;
        }

        void H(w wVar, boolean z) {
            this.o = wVar;
            this.p = z;
        }

        boolean I() {
            return (this.k & 16) != 0;
        }

        boolean J() {
            return (this.k & 128) != 0;
        }

        void K() {
            this.o.J(this);
        }

        boolean L() {
            return (this.k & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.k) == 0) {
                g();
                this.l.add(obj);
            }
        }

        void b(int i) {
            this.k = i | this.k;
        }

        void c() {
            this.f2178e = -1;
            this.h = -1;
        }

        void d() {
            List<Object> list = this.l;
            if (list != null) {
                list.clear();
            }
            this.k &= -1025;
        }

        void e() {
            this.k &= -33;
        }

        void f() {
            this.k &= -257;
        }

        boolean h() {
            return (this.k & 16) == 0 && a.g.l.v.Q(this.f2175b);
        }

        void i(int i, int i2, boolean z) {
            b(8);
            A(i2, z);
            this.f2177d = i;
        }

        public final int j() {
            RecyclerView recyclerView = this.s;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f2179f;
        }

        public final int l() {
            return this.g;
        }

        public final int m() {
            int i = this.h;
            return i == -1 ? this.f2177d : i;
        }

        public final int n() {
            return this.f2178e;
        }

        List<Object> o() {
            if ((this.k & 1024) != 0) {
                return f2174a;
            }
            List<Object> list = this.l;
            return (list == null || list.size() == 0) ? f2174a : this.m;
        }

        boolean p(int i) {
            return (this.k & i) != 0;
        }

        boolean q() {
            return (this.k & 512) != 0 || t();
        }

        boolean r() {
            return (this.f2175b.getParent() == null || this.f2175b.getParent() == this.s) ? false : true;
        }

        boolean s() {
            return (this.k & 1) != 0;
        }

        boolean t() {
            return (this.k & 4) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f2177d + " id=" + this.f2179f + ", oldPos=" + this.f2178e + ", pLpos:" + this.h);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.p ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.n + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f2175b.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.k & 16) == 0 && !a.g.l.v.Q(this.f2175b);
        }

        boolean v() {
            return (this.k & 8) != 0;
        }

        boolean w() {
            return this.o != null;
        }

        boolean x() {
            return (this.k & 256) != 0;
        }

        boolean y() {
            return (this.k & 2) != 0;
        }

        boolean z() {
            return (this.k & 2) != 0;
        }
    }

    class f implements androidx.recyclerview.widget.a.InterfaceC0056a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public void a(int i, int i2) {
            RecyclerView.this.C0(i, i2);
            RecyclerView.this.v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public void b(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public e0 c(int i) {
            e0 e0VarZ = RecyclerView.this.Z(i, true);
            if (e0VarZ == null || RecyclerView.this.o.n(e0VarZ.f2175b)) {
                return null;
            }
            return e0VarZ;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public void d(int i, int i2) {
            RecyclerView.this.D0(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.v0 = true;
            recyclerView.s0.f2164d += i2;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public void e(int i, int i2) {
            RecyclerView.this.D0(i, i2, false);
            RecyclerView.this.v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public void f(androidx.recyclerview.widget.a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public void g(int i, int i2) {
            RecyclerView.this.B0(i, i2);
            RecyclerView.this.v0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0056a
        public void h(int i, int i2, Object obj) {
            RecyclerView.this.w1(i, i2, obj);
            RecyclerView.this.w0 = true;
        }

        void i(androidx.recyclerview.widget.a.b bVar) {
            int i = bVar.f2262a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.w.R0(recyclerView, bVar.f2263b, bVar.f2265d);
                return;
            }
            if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.w.U0(recyclerView2, bVar.f2263b, bVar.f2265d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.w.W0(recyclerView3, bVar.f2263b, bVar.f2265d, bVar.f2264c);
            } else {
                if (i != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.w.T0(recyclerView4, bVar.f2263b, bVar.f2265d, 1);
            }
        }
    }

    static /* synthetic */ class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2181a;

        static {
            int[] iArr = new int[h.a.values().length];
            f2181a = iArr;
            try {
                iArr[h.a.PREVENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2181a[h.a.PREVENT_WHEN_EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class h<VH extends e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i f2182a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2183b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a f2184c = a.ALLOW;

        public enum a {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(VH vh, int i) {
            boolean z = vh.t == null;
            if (z) {
                vh.f2177d = i;
                if (h()) {
                    vh.f2179f = e(i);
                }
                vh.F(1, 519);
                a.g.h.c.a("RV OnBindView");
            }
            vh.t = this;
            m(vh, i, vh.o());
            if (z) {
                vh.d();
                ViewGroup.LayoutParams layoutParams = vh.f2175b.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q) layoutParams).f2214c = true;
                }
                a.g.h.c.b();
            }
        }

        boolean b() {
            int i = g.f2181a[this.f2184c.ordinal()];
            if (i != 1) {
                return i != 2 || d() > 0;
            }
            return false;
        }

        public final VH c(ViewGroup viewGroup, int i) {
            try {
                a.g.h.c.a("RV CreateView");
                VH vh = (VH) n(viewGroup, i);
                if (vh.f2175b.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                vh.g = i;
                a.g.h.c.b();
                return vh;
            } catch (Throwable th) {
                a.g.h.c.b();
                throw th;
            }
        }

        public abstract int d();

        public long e(int i) {
            return -1L;
        }

        public int f(int i) {
            return 0;
        }

        public final boolean g() {
            return this.f2182a.a();
        }

        public final boolean h() {
            return this.f2183b;
        }

        public final void i() {
            this.f2182a.b();
        }

        public final void j(int i, Object obj) {
            this.f2182a.c(i, 1, obj);
        }

        public void k(RecyclerView recyclerView) {
        }

        public abstract void l(VH vh, int i);

        public void m(VH vh, int i, List<Object> list) {
            l(vh, i);
        }

        public abstract VH n(ViewGroup viewGroup, int i);

        public void o(RecyclerView recyclerView) {
        }

        public boolean p(VH vh) {
            return false;
        }

        public void q(VH vh) {
        }

        public void r(VH vh) {
        }

        public void s(VH vh) {
        }

        public void t(j jVar) {
            this.f2182a.registerObserver(jVar);
        }

        public void u(boolean z) {
            if (g()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f2183b = z;
        }

        public void v(j jVar) {
            this.f2182a.unregisterObserver(jVar);
        }
    }

    static class i extends Observable<j> {
        i() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2, Object obj) {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((j) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            }
        }
    }

    public static abstract class j {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }
    }

    public interface k {
        int a(int i, int i2);
    }

    public static class l {
        protected EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private b f2189a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ArrayList<a> f2190b = new ArrayList<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f2191c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f2192d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f2193e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f2194f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(e0 e0Var);
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2195a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2196b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f2197c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f2198d;

            public c a(e0 e0Var) {
                return b(e0Var, 0);
            }

            public c b(e0 e0Var, int i) {
                View view = e0Var.f2175b;
                this.f2195a = view.getLeft();
                this.f2196b = view.getTop();
                this.f2197c = view.getRight();
                this.f2198d = view.getBottom();
                return this;
            }
        }

        static int e(e0 e0Var) {
            int i = e0Var.k & 14;
            if (e0Var.t()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int iN = e0Var.n();
            int iJ = e0Var.j();
            return (iN == -1 || iJ == -1 || iN == iJ) ? i : i | 2048;
        }

        public abstract boolean a(e0 e0Var, c cVar, c cVar2);

        public abstract boolean b(e0 e0Var, e0 e0Var2, c cVar, c cVar2);

        public abstract boolean c(e0 e0Var, c cVar, c cVar2);

        public abstract boolean d(e0 e0Var, c cVar, c cVar2);

        public abstract boolean f(e0 e0Var);

        public boolean g(e0 e0Var, List<Object> list) {
            return f(e0Var);
        }

        public final void h(e0 e0Var) {
            r(e0Var);
            b bVar = this.f2189a;
            if (bVar != null) {
                bVar.a(e0Var);
            }
        }

        public final void i() {
            int size = this.f2190b.size();
            for (int i = 0; i < size; i++) {
                this.f2190b.get(i).a();
            }
            this.f2190b.clear();
        }

        public abstract void j(e0 e0Var);

        public abstract void k();

        public long l() {
            return this.f2191c;
        }

        public long m() {
            return this.f2194f;
        }

        public long n() {
            return this.f2193e;
        }

        public long o() {
            return this.f2192d;
        }

        public abstract boolean p();

        public c q() {
            return new c();
        }

        public void r(e0 e0Var) {
        }

        public c s(b0 b0Var, e0 e0Var) {
            return q().a(e0Var);
        }

        public c t(b0 b0Var, e0 e0Var, int i, List<Object> list) {
            return q().a(e0Var);
        }

        public abstract void u();

        void v(b bVar) {
            this.f2189a = bVar;
        }
    }

    private class n implements m.b {
        n() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.m.b
        public void a(e0 e0Var) {
            e0Var.G(true);
            if (e0Var.i != null && e0Var.j == null) {
                e0Var.i = null;
            }
            e0Var.j = null;
            if (e0Var.I() || RecyclerView.this.V0(e0Var.f2175b) || !e0Var.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(e0Var.f2175b, false);
        }
    }

    public static abstract class o {
        @Deprecated
        public void d(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
            d(rect, ((q) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            f(canvas, recyclerView);
        }

        @Deprecated
        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f2200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        RecyclerView f2201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.recyclerview.widget.o.b f2202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final androidx.recyclerview.widget.o.b f2203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.o f2204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.o f2205f;
        a0 g;
        boolean h;
        boolean i;
        boolean j;
        private boolean k;
        private boolean l;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        class a implements androidx.recyclerview.widget.o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return p.this.I(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.o0() - p.this.f0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return p.this.T(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).leftMargin;
            }
        }

        class b implements androidx.recyclerview.widget.o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i) {
                return p.this.I(i);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return p.this.W() - p.this.d0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return p.this.g0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return p.this.O(view) + ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return p.this.U(view) - ((ViewGroup.MarginLayoutParams) ((q) view.getLayoutParams())).topMargin;
            }
        }

        public interface c {
            void a(int i, int i2);
        }

        public static class d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f2208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f2209b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f2210c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f2211d;
        }

        public p() {
            a aVar = new a();
            this.f2202c = aVar;
            b bVar = new b();
            this.f2203d = bVar;
            this.f2204e = new androidx.recyclerview.widget.o(aVar);
            this.f2205f = new androidx.recyclerview.widget.o(bVar);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x001c  */
        /* JADX WARN: Code duplicated, block: B:14:0x0020  */
        /* JADX WARN: Code duplicated, block: B:21:0x002f  */
        public static int K(int i, int i2, int i3, int i4, boolean z) {
            int iMax = Math.max(0, i - i3);
            if (z) {
                if (i4 >= 0) {
                    i2 = 1073741824;
                } else if (i4 != -1 || (i2 != Integer.MIN_VALUE && (i2 == 0 || i2 != 1073741824))) {
                    i2 = 0;
                    i4 = 0;
                } else {
                    i4 = iMax;
                }
            } else if (i4 >= 0) {
                i2 = 1073741824;
            } else if (i4 == -1) {
                i4 = iMax;
            } else if (i4 != -2) {
                i2 = 0;
                i4 = 0;
            } else if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                i4 = iMax;
                i2 = Integer.MIN_VALUE;
            } else {
                i4 = iMax;
                i2 = 0;
            }
            return View.MeasureSpec.makeMeasureSpec(i4, i2);
        }

        private int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int iE0 = e0();
            int iG0 = g0();
            int iO0 = o0() - f0();
            int iW = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i = left - iE0;
            int iMin = Math.min(0, i);
            int i2 = top - iG0;
            int iMin2 = Math.min(0, i2);
            int i3 = iWidth - iO0;
            int iMax = Math.max(0, i3);
            int iMax2 = Math.max(0, iHeight - iW);
            if (Z() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i3);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i2, iMax2);
            }
            iArr[0] = iMax;
            iArr[1] = iMin2;
            return iArr;
        }

        private void f(View view, int i, boolean z) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (z || e0VarF0.v()) {
                this.f2201b.p.b(e0VarF0);
            } else {
                this.f2201b.p.p(e0VarF0);
            }
            q qVar = (q) view.getLayoutParams();
            if (e0VarF0.L() || e0VarF0.w()) {
                if (e0VarF0.w()) {
                    e0VarF0.K();
                } else {
                    e0VarF0.e();
                }
                this.f2200a.c(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f2201b) {
                int iM = this.f2200a.m(view);
                if (i == -1) {
                    i = this.f2200a.g();
                }
                if (iM == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f2201b.indexOfChild(view) + this.f2201b.P());
                }
                if (iM != i) {
                    this.f2201b.w.B0(iM, i);
                }
            } else {
                this.f2200a.a(view, i, false);
                qVar.f2214c = true;
                a0 a0Var = this.g;
                if (a0Var != null && a0Var.h()) {
                    this.g.k(view);
                }
            }
            if (qVar.f2215d) {
                e0VarF0.f2175b.invalidate();
                qVar.f2215d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.o.c.f809f, i, i2);
            dVar.f2208a = typedArrayObtainStyledAttributes.getInt(a.o.c.g, 1);
            dVar.f2209b = typedArrayObtainStyledAttributes.getInt(a.o.c.q, 1);
            dVar.f2210c = typedArrayObtainStyledAttributes.getBoolean(a.o.c.p, false);
            dVar.f2211d = typedArrayObtainStyledAttributes.getBoolean(a.o.c.r, false);
            typedArrayObtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        private boolean t0(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iE0 = e0();
            int iG0 = g0();
            int iO0 = o0() - f0();
            int iW = W() - d0();
            Rect rect = this.f2201b.s;
            P(focusedChild, rect);
            return rect.left - i < iO0 && rect.right - i > iE0 && rect.top - i2 < iW && rect.bottom - i2 > iG0;
        }

        private void v1(w wVar, int i, View view) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (e0VarF0.J()) {
                return;
            }
            if (e0VarF0.t() && !e0VarF0.v() && !this.f2201b.v.h()) {
                q1(i);
                wVar.C(e0VarF0);
            } else {
                x(i);
                wVar.D(view);
                this.f2201b.p.k(e0VarF0);
            }
        }

        private static boolean w0(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void y(int i, View view) {
            this.f2200a.d(i);
        }

        void A(RecyclerView recyclerView, w wVar) {
            this.i = false;
            I0(recyclerView, wVar);
        }

        public void A0(View view, int i, int i2) {
            q qVar = (q) view.getLayoutParams();
            Rect rectJ0 = this.f2201b.j0(view);
            int i3 = i + rectJ0.left + rectJ0.right;
            int i4 = i2 + rectJ0.top + rectJ0.bottom;
            int iK = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) qVar).width, k());
            int iK2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) qVar).height, l());
            if (F1(view, iK, iK2, qVar)) {
                view.measure(iK, iK2);
            }
        }

        void A1(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.o = mode;
            if (mode == 0 && !RecyclerView.f2144d) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.p = mode2;
            if (mode2 != 0 || RecyclerView.f2144d) {
                return;
            }
            this.r = 0;
        }

        public View B(View view) {
            View viewR;
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView == null || (viewR = recyclerView.R(view)) == null || this.f2200a.n(viewR)) {
                return null;
            }
            return viewR;
        }

        public void B0(int i, int i2) {
            View viewI = I(i);
            if (viewI != null) {
                x(i);
                h(viewI, i2);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f2201b.toString());
            }
        }

        public void B1(int i, int i2) {
            this.f2201b.setMeasuredDimension(i, i2);
        }

        public View C(int i) {
            int iJ = J();
            for (int i2 = 0; i2 < iJ; i2++) {
                View viewI = I(i2);
                e0 e0VarF0 = RecyclerView.f0(viewI);
                if (e0VarF0 != null && e0VarF0.m() == i && !e0VarF0.J() && (this.f2201b.s0.e() || !e0VarF0.v())) {
                    return viewI;
                }
            }
            return null;
        }

        public void C0(int i) {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                recyclerView.z0(i);
            }
        }

        public void C1(Rect rect, int i, int i2) {
            B1(n(i, rect.width() + e0() + f0(), c0()), n(i2, rect.height() + g0() + d0(), b0()));
        }

        public abstract q D();

        public void D0(int i) {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                recyclerView.A0(i);
            }
        }

        void D1(int i, int i2) {
            int iJ = J();
            if (iJ == 0) {
                this.f2201b.w(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < iJ; i7++) {
                View viewI = I(i7);
                Rect rect = this.f2201b.s;
                P(viewI, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f2201b.s.set(i4, i5, i3, i6);
            C1(this.f2201b.s, i, i2);
        }

        public q E(Context context, AttributeSet attributeSet) {
            return new q(context, attributeSet);
        }

        public void E0(h hVar, h hVar2) {
        }

        void E1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f2201b = null;
                this.f2200a = null;
                height = 0;
                this.q = 0;
            } else {
                this.f2201b = recyclerView;
                this.f2200a = recyclerView.o;
                this.q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.r = height;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public q F(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof q) {
                return new q((q) layoutParams);
            }
            return layoutParams instanceof ViewGroup.MarginLayoutParams ? new q((ViewGroup.MarginLayoutParams) layoutParams) : new q(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        boolean F1(View view, int i, int i2, q qVar) {
            return (!view.isLayoutRequested() && this.k && w0(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && w0(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((q) view.getLayoutParams()).f2213b.bottom;
        }

        @Deprecated
        public void H0(RecyclerView recyclerView) {
        }

        boolean H1(View view, int i, int i2, q qVar) {
            return (this.k && w0(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) qVar).width) && w0(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) qVar).height)) ? false : true;
        }

        public View I(int i) {
            androidx.recyclerview.widget.b bVar = this.f2200a;
            if (bVar != null) {
                return bVar.f(i);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, w wVar) {
            H0(recyclerView);
        }

        public void I1(RecyclerView recyclerView, b0 b0Var, int i) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public int J() {
            androidx.recyclerview.widget.b bVar = this.f2200a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public View J0(View view, int i, w wVar, b0 b0Var) {
            return null;
        }

        public void J1(a0 a0Var) {
            a0 a0Var2 = this.g;
            if (a0Var2 != null && a0Var != a0Var2 && a0Var2.h()) {
                this.g.r();
            }
            this.g = a0Var;
            a0Var.q(this.f2201b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2201b;
            L0(recyclerView.l, recyclerView.s0, accessibilityEvent);
        }

        void K1() {
            a0 a0Var = this.g;
            if (a0Var != null) {
                a0Var.r();
            }
        }

        public void L0(w wVar, b0 b0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f2201b.canScrollVertically(-1) && !this.f2201b.canScrollHorizontally(-1) && !this.f2201b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            h hVar = this.f2201b.v;
            if (hVar != null) {
                accessibilityEvent.setItemCount(hVar.d());
            }
        }

        public boolean L1() {
            return false;
        }

        public boolean M() {
            RecyclerView recyclerView = this.f2201b;
            return recyclerView != null && recyclerView.q;
        }

        void M0(a.g.l.e0.c cVar) {
            RecyclerView recyclerView = this.f2201b;
            N0(recyclerView.l, recyclerView.s0, cVar);
        }

        public int N(w wVar, b0 b0Var) {
            return -1;
        }

        public void N0(w wVar, b0 b0Var, a.g.l.e0.c cVar) {
            if (this.f2201b.canScrollVertically(-1) || this.f2201b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.n0(true);
            }
            if (this.f2201b.canScrollVertically(1) || this.f2201b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.n0(true);
            }
            cVar.Y(a.g.l.e0.c.b.a(k0(wVar, b0Var), N(wVar, b0Var), v0(wVar, b0Var), l0(wVar, b0Var)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        void O0(View view, a.g.l.e0.c cVar) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (e0VarF0 == null || e0VarF0.v() || this.f2200a.n(e0VarF0.f2175b)) {
                return;
            }
            RecyclerView recyclerView = this.f2201b;
            P0(recyclerView.l, recyclerView.s0, view, cVar);
        }

        public void P(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public void P0(w wVar, b0 b0Var, View view, a.g.l.e0.c cVar) {
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((q) view.getLayoutParams()).f2213b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i, int i2) {
        }

        public int S(View view) {
            Rect rect = ((q) view.getLayoutParams()).f2213b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i, int i2) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f2200a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i, int i2) {
        }

        public int W() {
            return this.r;
        }

        public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
            V0(recyclerView, i, i2);
        }

        public int X() {
            return this.p;
        }

        public void X0(w wVar, b0 b0Var) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int Y() {
            RecyclerView recyclerView = this.f2201b;
            h adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.d();
            }
            return 0;
        }

        public void Y0(b0 b0Var) {
        }

        public int Z() {
            return a.g.l.v.C(this.f2201b);
        }

        public void Z0(w wVar, b0 b0Var, int i, int i2) {
            this.f2201b.w(i, i2);
        }

        public int a0(View view) {
            return ((q) view.getLayoutParams()).f2213b.left;
        }

        @Deprecated
        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.t0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return a.g.l.v.D(this.f2201b);
        }

        public boolean b1(RecyclerView recyclerView, b0 b0Var, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i) {
            f(view, i, true);
        }

        public int c0() {
            return a.g.l.v.E(this.f2201b);
        }

        public void c1(Parcelable parcelable) {
        }

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable d1() {
            return null;
        }

        public void e(View view, int i) {
            f(view, i, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void f1(a0 a0Var) {
            if (this.g == a0Var) {
                this.g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        boolean g1(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2201b;
            return h1(recyclerView.l, recyclerView.s0, i, bundle);
        }

        public void h(View view, int i) {
            i(view, i, (q) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((q) view.getLayoutParams()).a();
        }

        /* JADX WARN: Code duplicated, block: B:25:0x0071 A[PHI: r8
          0x0071: PHI (r8v8 int) = (r8v4 int), (r8v12 int) binds: [B:22:0x005e, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        public boolean h1(w wVar, b0 b0Var, int i, Bundle bundle) {
            int iW;
            int iO0;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                iW = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.f2201b.canScrollHorizontally(1)) {
                    iO0 = (o0() - e0()) - f0();
                    i2 = iW;
                    i3 = iO0;
                } else {
                    i2 = iW;
                    i3 = 0;
                }
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                iW = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.f2201b.canScrollHorizontally(-1)) {
                    iO0 = -((o0() - e0()) - f0());
                    i2 = iW;
                    i3 = iO0;
                } else {
                    i2 = iW;
                    i3 = 0;
                }
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f2201b.o1(i3, i2, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void i(View view, int i, q qVar) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (e0VarF0.v()) {
                this.f2201b.p.b(e0VarF0);
            } else {
                this.f2201b.p.p(e0VarF0);
            }
            this.f2200a.c(view, i, qVar, e0VarF0.v());
        }

        boolean i1(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f2201b;
            return j1(recyclerView.l, recyclerView.s0, view, i, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int j0(View view) {
            return ((q) view.getLayoutParams()).f2213b.right;
        }

        public boolean j1(w wVar, b0 b0Var, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean k() {
            return false;
        }

        public int k0(w wVar, b0 b0Var) {
            return -1;
        }

        public void k1(w wVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                if (!RecyclerView.f0(I(iJ)).J()) {
                    n1(iJ, wVar);
                }
            }
        }

        public boolean l() {
            return false;
        }

        public int l0(w wVar, b0 b0Var) {
            return 0;
        }

        void l1(w wVar) {
            int iJ = wVar.j();
            for (int i = iJ - 1; i >= 0; i--) {
                View viewN = wVar.n(i);
                e0 e0VarF0 = RecyclerView.f0(viewN);
                if (!e0VarF0.J()) {
                    e0VarF0.G(false);
                    if (e0VarF0.x()) {
                        this.f2201b.removeDetachedView(viewN, false);
                    }
                    m mVar = this.f2201b.a0;
                    if (mVar != null) {
                        mVar.j(e0VarF0);
                    }
                    e0VarF0.G(true);
                    wVar.y(viewN);
                }
            }
            wVar.e();
            if (iJ > 0) {
                this.f2201b.invalidate();
            }
        }

        public boolean m(q qVar) {
            return qVar != null;
        }

        public int m0(View view) {
            return ((q) view.getLayoutParams()).f2213b.top;
        }

        public void m1(View view, w wVar) {
            p1(view);
            wVar.B(view);
        }

        public void n0(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((q) view.getLayoutParams()).f2213b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f2201b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f2201b.u;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i, w wVar) {
            View viewI = I(i);
            q1(i);
            wVar.B(viewI);
        }

        public void o(int i, int i2, b0 b0Var, c cVar) {
        }

        public int o0() {
            return this.q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i, c cVar) {
        }

        public int p0() {
            return this.o;
        }

        public void p1(View view) {
            this.f2200a.p(view);
        }

        public int q(b0 b0Var) {
            return 0;
        }

        boolean q0() {
            int iJ = J();
            for (int i = 0; i < iJ; i++) {
                ViewGroup.LayoutParams layoutParams = I(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i) {
            if (I(i) != null) {
                this.f2200a.q(i);
            }
        }

        public int r(b0 b0Var) {
            return 0;
        }

        public boolean r0() {
            return this.i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return s1(recyclerView, view, rect, z, false);
        }

        public int s(b0 b0Var) {
            return 0;
        }

        public boolean s0() {
            return this.j;
        }

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] iArrL = L(view, rect);
            int i = iArrL[0];
            int i2 = iArrL[1];
            if ((z2 && !t0(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.l1(i, i2);
            }
            return true;
        }

        public int t(b0 b0Var) {
            return 0;
        }

        public void t1() {
            RecyclerView recyclerView = this.f2201b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int u(b0 b0Var) {
            return 0;
        }

        public final boolean u0() {
            return this.l;
        }

        public void u1() {
            this.h = true;
        }

        public int v(b0 b0Var) {
            return 0;
        }

        public boolean v0(w wVar, b0 b0Var) {
            return false;
        }

        public void w(w wVar) {
            for (int iJ = J() - 1; iJ >= 0; iJ--) {
                v1(wVar, iJ, I(iJ));
            }
        }

        public int w1(int i, w wVar, b0 b0Var) {
            return 0;
        }

        public void x(int i) {
            y(i, I(i));
        }

        public boolean x0() {
            a0 a0Var = this.g;
            return a0Var != null && a0Var.h();
        }

        public void x1(int i) {
        }

        public boolean y0(View view, boolean z, boolean z2) {
            boolean z3 = this.f2204e.b(view, 24579) && this.f2205f.b(view, 24579);
            return z ? z3 : !z3;
        }

        public int y1(int i, w wVar, b0 b0Var) {
            return 0;
        }

        void z(RecyclerView recyclerView) {
            this.i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i, int i2, int i3, int i4) {
            q qVar = (q) view.getLayoutParams();
            Rect rect = qVar.f2213b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) qVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) qVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) qVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
        }

        void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    public static class q extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e0 f2212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Rect f2213b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f2214c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2215d;

        public q(int i, int i2) {
            super(i, i2);
            this.f2213b = new Rect();
            this.f2214c = true;
            this.f2215d = false;
        }

        public q(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2213b = new Rect();
            this.f2214c = true;
            this.f2215d = false;
        }

        public q(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2213b = new Rect();
            this.f2214c = true;
            this.f2215d = false;
        }

        public q(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2213b = new Rect();
            this.f2214c = true;
            this.f2215d = false;
        }

        public q(q qVar) {
            super((ViewGroup.LayoutParams) qVar);
            this.f2213b = new Rect();
            this.f2214c = true;
            this.f2215d = false;
        }

        public int a() {
            return this.f2212a.m();
        }

        public boolean b() {
            return this.f2212a.y();
        }

        public boolean c() {
            return this.f2212a.v();
        }

        public boolean d() {
            return this.f2212a.t();
        }
    }

    public interface r {
        void a(View view);

        void b(View view);
    }

    public static abstract class s {
        public abstract boolean a(int i, int i2);
    }

    public interface t {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z);
    }

    public static abstract class u {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class v {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        SparseArray<a> f2216a = new SparseArray<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f2217b = 0;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final ArrayList<e0> f2218a = new ArrayList<>();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f2219b = 5;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            long f2220c = 0;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            long f2221d = 0;

            a() {
            }
        }

        private a g(int i) {
            a aVar = this.f2216a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f2216a.put(i, aVar2);
            return aVar2;
        }

        void a() {
            this.f2217b++;
        }

        public void b() {
            for (int i = 0; i < this.f2216a.size(); i++) {
                this.f2216a.valueAt(i).f2218a.clear();
            }
        }

        void c() {
            this.f2217b--;
        }

        void d(int i, long j) {
            a aVarG = g(i);
            aVarG.f2221d = j(aVarG.f2221d, j);
        }

        void e(int i, long j) {
            a aVarG = g(i);
            aVarG.f2220c = j(aVarG.f2220c, j);
        }

        public e0 f(int i) {
            a aVar = this.f2216a.get(i);
            if (aVar == null || aVar.f2218a.isEmpty()) {
                return null;
            }
            ArrayList<e0> arrayList = aVar.f2218a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).r()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void h(h hVar, h hVar2, boolean z) {
            if (hVar != null) {
                c();
            }
            if (!z && this.f2217b == 0) {
                b();
            }
            if (hVar2 != null) {
                a();
            }
        }

        public void i(e0 e0Var) {
            int iL = e0Var.l();
            ArrayList<e0> arrayList = g(iL).f2218a;
            if (this.f2216a.get(iL).f2219b <= arrayList.size()) {
                return;
            }
            e0Var.D();
            arrayList.add(e0Var);
        }

        long j(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        boolean k(int i, long j, long j2) {
            long j3 = g(i).f2221d;
            return j3 == 0 || j + j3 < j2;
        }

        boolean l(int i, long j, long j2) {
            long j3 = g(i).f2220c;
            return j3 == 0 || j + j3 < j2;
        }
    }

    public final class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ArrayList<e0> f2222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ArrayList<e0> f2223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<e0> f2224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<e0> f2225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f2226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2227f;
        v g;
        private c0 h;

        public w() {
            ArrayList<e0> arrayList = new ArrayList<>();
            this.f2222a = arrayList;
            this.f2223b = null;
            this.f2224c = new ArrayList<>();
            this.f2225d = Collections.unmodifiableList(arrayList);
            this.f2226e = 2;
            this.f2227f = 2;
        }

        private boolean H(e0 e0Var, int i, int i2, long j) {
            e0Var.t = null;
            e0Var.s = RecyclerView.this;
            int iL = e0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.g.k(iL, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.v.a(e0Var, i);
            this.g.d(e0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(e0Var);
            if (!RecyclerView.this.s0.e()) {
                return true;
            }
            e0Var.h = i2;
            return true;
        }

        private void b(e0 e0Var) {
            if (RecyclerView.this.s0()) {
                View view = e0Var.f2175b;
                if (a.g.l.v.A(view) == 0) {
                    a.g.l.v.x0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.z0;
                if (kVar == null) {
                    return;
                }
                a.g.l.a aVarN = kVar.n();
                if (aVarN instanceof androidx.recyclerview.widget.k.a) {
                    ((androidx.recyclerview.widget.k.a) aVarN).o(view);
                }
                a.g.l.v.o0(view, aVarN);
            }
        }

        private void q(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(e0 e0Var) {
            View view = e0Var.f2175b;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i) {
            a(this.f2224c.get(i), true);
            this.f2224c.remove(i);
        }

        public void B(View view) {
            e0 e0VarF0 = RecyclerView.f0(view);
            if (e0VarF0.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (e0VarF0.w()) {
                e0VarF0.K();
            } else if (e0VarF0.L()) {
                e0VarF0.e();
            }
            C(e0VarF0);
            if (RecyclerView.this.a0 == null || e0VarF0.u()) {
                return;
            }
            RecyclerView.this.a0.j(e0VarF0);
        }

        void C(e0 e0Var) {
            boolean z;
            boolean z2 = false;
            boolean z3 = true;
            if (e0Var.w() || e0Var.f2175b.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(e0Var.w());
                sb.append(" isAttached:");
                sb.append(e0Var.f2175b.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (e0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + e0Var + RecyclerView.this.P());
            }
            if (e0Var.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean zH = e0Var.h();
            h hVar = RecyclerView.this.v;
            if ((hVar != null && zH && hVar.p(e0Var)) || e0Var.u()) {
                if (this.f2227f <= 0 || e0Var.p(526)) {
                    z = false;
                } else {
                    int size = this.f2224c.size();
                    if (size >= this.f2227f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f2146f && size > 0 && !RecyclerView.this.r0.d(e0Var.f2177d)) {
                        int i = size - 1;
                        while (i >= 0) {
                            if (!RecyclerView.this.r0.d(this.f2224c.get(i).f2177d)) {
                                break;
                            } else {
                                i--;
                            }
                        }
                        size = i + 1;
                    }
                    this.f2224c.add(size, e0Var);
                    z = true;
                }
                if (z) {
                    z3 = false;
                } else {
                    a(e0Var, true);
                }
                z2 = z;
            } else {
                z3 = false;
            }
            RecyclerView.this.p.q(e0Var);
            if (z2 || z3 || !zH) {
                return;
            }
            e0Var.t = null;
            e0Var.s = null;
        }

        void D(View view) {
            ArrayList<e0> arrayList;
            e0 e0VarF0 = RecyclerView.f0(view);
            if (!e0VarF0.p(12) && e0VarF0.y() && !RecyclerView.this.p(e0VarF0)) {
                if (this.f2223b == null) {
                    this.f2223b = new ArrayList<>();
                }
                e0VarF0.H(this, true);
                arrayList = this.f2223b;
            } else {
                if (e0VarF0.t() && !e0VarF0.v() && !RecyclerView.this.v.h()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
                }
                e0VarF0.H(this, false);
                arrayList = this.f2222a;
            }
            arrayList.add(e0VarF0);
        }

        void E(v vVar) {
            v vVar2 = this.g;
            if (vVar2 != null) {
                vVar2.c();
            }
            this.g = vVar;
            if (vVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.g.a();
        }

        void F(c0 c0Var) {
        }

        public void G(int i) {
            this.f2226e = i;
            K();
        }

        /* JADX WARN: Code duplicated, block: B:100:0x01d7  */
        /* JADX WARN: Code duplicated, block: B:18:0x0037 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:19:0x0039  */
        /* JADX WARN: Code duplicated, block: B:21:0x0043  */
        /* JADX WARN: Code duplicated, block: B:22:0x004e  */
        /* JADX WARN: Code duplicated, block: B:24:0x0054  */
        /* JADX WARN: Code duplicated, block: B:27:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x005f  */
        /* JADX WARN: Code duplicated, block: B:64:0x0134 A[PHI: r1 r4
          0x0134: PHI (r1v12 androidx.recyclerview.widget.RecyclerView$e0) = (r1v11 androidx.recyclerview.widget.RecyclerView$e0), (r1v30 androidx.recyclerview.widget.RecyclerView$e0) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]
          0x0134: PHI (r4v3 boolean) = (r4v2 boolean), (r4v7 boolean) binds: [B:28:0x005d, B:50:0x00b5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:73:0x0155  */
        /* JADX WARN: Code duplicated, block: B:79:0x0181  */
        /* JADX WARN: Code duplicated, block: B:81:0x0187  */
        /* JADX WARN: Code duplicated, block: B:90:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:92:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:94:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:95:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:98:0x01d4 A[ADDED_TO_REGION] */
        e0 I(int i, boolean z, long j) {
            e0 e0VarL;
            boolean z2;
            e0 e0Var;
            boolean z3;
            boolean zH;
            ViewGroup.LayoutParams layoutParams;
            q qVar;
            ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
            int iM;
            RecyclerView recyclerViewV;
            if (i < 0 || i >= RecyclerView.this.s0.b()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i + "(" + i + "). Item count:" + RecyclerView.this.s0.b() + RecyclerView.this.P());
            }
            if (RecyclerView.this.s0.e()) {
                e0VarL = h(i);
                if (e0VarL != null) {
                    z2 = true;
                }
                if (e0VarL == null && (e0VarL = m(i, z)) != null) {
                    if (L(e0VarL)) {
                        z2 = true;
                    } else {
                        if (!z) {
                            e0VarL.b(4);
                            if (e0VarL.w()) {
                                RecyclerView.this.removeDetachedView(e0VarL.f2175b, false);
                                e0VarL.K();
                            } else if (e0VarL.L()) {
                                e0VarL.e();
                            }
                            C(e0VarL);
                        }
                        e0VarL = null;
                    }
                }
                if (e0VarL == null) {
                    e0Var = e0VarL;
                } else {
                    iM = RecyclerView.this.n.m(i);
                    if (iM >= 0 || iM >= RecyclerView.this.v.d()) {
                        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM + ").state:" + RecyclerView.this.s0.b() + RecyclerView.this.P());
                    }
                    int iF = RecyclerView.this.v.f(iM);
                    if (RecyclerView.this.v.h() && (e0VarL = l(RecyclerView.this.v.e(iM), iF, z)) != null) {
                        e0VarL.f2177d = iM;
                        z2 = true;
                    }
                    if (e0VarL == null && this.h != null) {
                        throw null;
                    }
                    if (e0VarL == null) {
                        e0 e0VarF = i().f(iF);
                        if (e0VarF != null) {
                            e0VarF.D();
                            if (RecyclerView.f2143c) {
                                r(e0VarF);
                            }
                        }
                        e0VarL = e0VarF;
                    }
                    if (e0VarL == null) {
                        long nanoTime = RecyclerView.this.getNanoTime();
                        if (j != Long.MAX_VALUE && !this.g.l(iF, nanoTime, j)) {
                            return null;
                        }
                        RecyclerView recyclerView = RecyclerView.this;
                        e0 e0VarC = recyclerView.v.c(recyclerView, iF);
                        if (RecyclerView.f2146f && (recyclerViewV = RecyclerView.V(e0VarC.f2175b)) != null) {
                            e0VarC.f2176c = new WeakReference<>(recyclerViewV);
                        }
                        this.g.e(iF, RecyclerView.this.getNanoTime() - nanoTime);
                        e0Var = e0VarC;
                    } else {
                        e0Var = e0VarL;
                    }
                }
                z3 = z2;
                if (z3 && !RecyclerView.this.s0.e() && e0Var.p(8192)) {
                    e0Var.F(0, 8192);
                    if (RecyclerView.this.s0.k) {
                        int iE = m.e(e0Var) | 4096;
                        RecyclerView recyclerView2 = RecyclerView.this;
                        RecyclerView.this.R0(e0Var, recyclerView2.a0.t(recyclerView2.s0, e0Var, iE, e0Var.o()));
                    }
                }
                if (RecyclerView.this.s0.e() || !e0Var.s()) {
                    if (e0Var.s() || e0Var.z() || e0Var.t()) {
                        zH = H(e0Var, RecyclerView.this.n.m(i), i, j);
                    }
                    layoutParams = e0Var.f2175b.getLayoutParams();
                    if (layoutParams != null) {
                        if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            qVar = (q) layoutParams;
                        } else {
                            layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                        }
                        qVar.f2212a = e0Var;
                        qVar.f2215d = !z3 && zH;
                        return e0Var;
                    }
                    layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                    qVar = (q) layoutParamsGenerateLayoutParams;
                    e0Var.f2175b.setLayoutParams(qVar);
                    qVar.f2212a = e0Var;
                    qVar.f2215d = !z3 && zH;
                    return e0Var;
                }
                e0Var.h = i;
                zH = false;
                layoutParams = e0Var.f2175b.getLayoutParams();
                if (layoutParams != null) {
                    if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                        layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                    } else {
                        qVar = (q) layoutParams;
                    }
                    qVar.f2212a = e0Var;
                    qVar.f2215d = !z3 && zH;
                    return e0Var;
                }
                layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                qVar = (q) layoutParamsGenerateLayoutParams;
                e0Var.f2175b.setLayoutParams(qVar);
                qVar.f2212a = e0Var;
                qVar.f2215d = !z3 && zH;
                return e0Var;
            }
            e0VarL = null;
            z2 = false;
            if (e0VarL == null) {
                if (L(e0VarL)) {
                    if (!z) {
                        e0VarL.b(4);
                        if (e0VarL.w()) {
                            RecyclerView.this.removeDetachedView(e0VarL.f2175b, false);
                            e0VarL.K();
                        } else if (e0VarL.L()) {
                            e0VarL.e();
                        }
                        C(e0VarL);
                    }
                    e0VarL = null;
                } else {
                    z2 = true;
                }
            }
            if (e0VarL == null) {
                iM = RecyclerView.this.n.m(i);
                if (iM >= 0) {
                }
                throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iM + ").state:" + RecyclerView.this.s0.b() + RecyclerView.this.P());
            }
            e0Var = e0VarL;
            z3 = z2;
            if (z3) {
                e0Var.F(0, 8192);
                if (RecyclerView.this.s0.k) {
                    int iE2 = m.e(e0Var) | 4096;
                    RecyclerView recyclerView3 = RecyclerView.this;
                    RecyclerView.this.R0(e0Var, recyclerView3.a0.t(recyclerView3.s0, e0Var, iE2, e0Var.o()));
                }
            }
            if (RecyclerView.this.s0.e()) {
                if (e0Var.s()) {
                }
                zH = H(e0Var, RecyclerView.this.n.m(i), i, j);
            } else {
                if (e0Var.s()) {
                }
                zH = H(e0Var, RecyclerView.this.n.m(i), i, j);
            }
            layoutParams = e0Var.f2175b.getLayoutParams();
            if (layoutParams != null) {
                if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                    layoutParamsGenerateLayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                } else {
                    qVar = (q) layoutParams;
                }
                qVar.f2212a = e0Var;
                qVar.f2215d = !z3 && zH;
                return e0Var;
            }
            layoutParamsGenerateLayoutParams = RecyclerView.this.generateDefaultLayoutParams();
            qVar = (q) layoutParamsGenerateLayoutParams;
            e0Var.f2175b.setLayoutParams(qVar);
            qVar.f2212a = e0Var;
            qVar.f2215d = !z3 && zH;
            return e0Var;
        }

        void J(e0 e0Var) {
            (e0Var.p ? this.f2223b : this.f2222a).remove(e0Var);
            e0Var.o = null;
            e0Var.p = false;
            e0Var.e();
        }

        void K() {
            p pVar = RecyclerView.this.w;
            this.f2227f = this.f2226e + (pVar != null ? pVar.m : 0);
            for (int size = this.f2224c.size() - 1; size >= 0 && this.f2224c.size() > this.f2227f; size--) {
                A(size);
            }
        }

        boolean L(e0 e0Var) {
            if (e0Var.v()) {
                return RecyclerView.this.s0.e();
            }
            int i = e0Var.f2177d;
            if (i >= 0 && i < RecyclerView.this.v.d()) {
                if (RecyclerView.this.s0.e() || RecyclerView.this.v.f(e0Var.f2177d) == e0Var.l()) {
                    return !RecyclerView.this.v.h() || e0Var.k() == RecyclerView.this.v.e(e0Var.f2177d);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + e0Var + RecyclerView.this.P());
        }

        void M(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f2224c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f2224c.get(size);
                if (e0Var != null && (i3 = e0Var.f2177d) >= i && i3 < i4) {
                    e0Var.b(2);
                    A(size);
                }
            }
        }

        void a(e0 e0Var, boolean z) {
            RecyclerView.r(e0Var);
            View view = e0Var.f2175b;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.z0;
            if (kVar != null) {
                a.g.l.a aVarN = kVar.n();
                a.g.l.v.o0(view, aVarN instanceof androidx.recyclerview.widget.k.a ? ((androidx.recyclerview.widget.k.a) aVarN).n(view) : null);
            }
            if (z) {
                g(e0Var);
            }
            e0Var.t = null;
            e0Var.s = null;
            i().i(e0Var);
        }

        public void c() {
            this.f2222a.clear();
            z();
        }

        void d() {
            int size = this.f2224c.size();
            for (int i = 0; i < size; i++) {
                this.f2224c.get(i).c();
            }
            int size2 = this.f2222a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f2222a.get(i2).c();
            }
            ArrayList<e0> arrayList = this.f2223b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f2223b.get(i3).c();
                }
            }
        }

        void e() {
            this.f2222a.clear();
            ArrayList<e0> arrayList = this.f2223b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i) {
            if (i >= 0 && i < RecyclerView.this.s0.b()) {
                return !RecyclerView.this.s0.e() ? i : RecyclerView.this.n.m(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.s0.b() + RecyclerView.this.P());
        }

        void g(e0 e0Var) {
            x xVar = RecyclerView.this.x;
            if (xVar != null) {
                xVar.a(e0Var);
            }
            int size = RecyclerView.this.y.size();
            for (int i = 0; i < size; i++) {
                RecyclerView.this.y.get(i).a(e0Var);
            }
            h hVar = RecyclerView.this.v;
            if (hVar != null) {
                hVar.s(e0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.s0 != null) {
                recyclerView.p.q(e0Var);
            }
        }

        e0 h(int i) {
            int size;
            int iM;
            ArrayList<e0> arrayList = this.f2223b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    e0 e0Var = this.f2223b.get(i2);
                    if (!e0Var.L() && e0Var.m() == i) {
                        e0Var.b(32);
                        return e0Var;
                    }
                }
                if (RecyclerView.this.v.h() && (iM = RecyclerView.this.n.m(i)) > 0 && iM < RecyclerView.this.v.d()) {
                    long jE = RecyclerView.this.v.e(iM);
                    for (int i3 = 0; i3 < size; i3++) {
                        e0 e0Var2 = this.f2223b.get(i3);
                        if (!e0Var2.L() && e0Var2.k() == jE) {
                            e0Var2.b(32);
                            return e0Var2;
                        }
                    }
                }
            }
            return null;
        }

        v i() {
            if (this.g == null) {
                this.g = new v();
            }
            return this.g;
        }

        int j() {
            return this.f2222a.size();
        }

        public List<e0> k() {
            return this.f2225d;
        }

        e0 l(long j, int i, boolean z) {
            for (int size = this.f2222a.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f2222a.get(size);
                if (e0Var.k() == j && !e0Var.L()) {
                    if (i == e0Var.l()) {
                        e0Var.b(32);
                        if (e0Var.v() && !RecyclerView.this.s0.e()) {
                            e0Var.F(2, 14);
                        }
                        return e0Var;
                    }
                    if (!z) {
                        this.f2222a.remove(size);
                        RecyclerView.this.removeDetachedView(e0Var.f2175b, false);
                        y(e0Var.f2175b);
                    }
                }
            }
            int size2 = this.f2224c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                e0 e0Var2 = this.f2224c.get(size2);
                if (e0Var2.k() == j && !e0Var2.r()) {
                    if (i == e0Var2.l()) {
                        if (!z) {
                            this.f2224c.remove(size2);
                        }
                        return e0Var2;
                    }
                    if (!z) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        e0 m(int i, boolean z) {
            View viewE;
            int size = this.f2222a.size();
            for (int i2 = 0; i2 < size; i2++) {
                e0 e0Var = this.f2222a.get(i2);
                if (!e0Var.L() && e0Var.m() == i && !e0Var.t() && (RecyclerView.this.s0.h || !e0Var.v())) {
                    e0Var.b(32);
                    return e0Var;
                }
            }
            if (z || (viewE = RecyclerView.this.o.e(i)) == null) {
                int size2 = this.f2224c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    e0 e0Var2 = this.f2224c.get(i3);
                    if (!e0Var2.t() && e0Var2.m() == i && !e0Var2.r()) {
                        if (!z) {
                            this.f2224c.remove(i3);
                        }
                        return e0Var2;
                    }
                }
                return null;
            }
            e0 e0VarF0 = RecyclerView.f0(viewE);
            RecyclerView.this.o.s(viewE);
            int iM = RecyclerView.this.o.m(viewE);
            if (iM != -1) {
                RecyclerView.this.o.d(iM);
                D(viewE);
                e0VarF0.b(8224);
                return e0VarF0;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + e0VarF0 + RecyclerView.this.P());
        }

        View n(int i) {
            return this.f2222a.get(i).f2175b;
        }

        public View o(int i) {
            return p(i, false);
        }

        View p(int i, boolean z) {
            return I(i, z, Long.MAX_VALUE).f2175b;
        }

        void s() {
            int size = this.f2224c.size();
            for (int i = 0; i < size; i++) {
                q qVar = (q) this.f2224c.get(i).f2175b.getLayoutParams();
                if (qVar != null) {
                    qVar.f2214c = true;
                }
            }
        }

        void t() {
            int size = this.f2224c.size();
            for (int i = 0; i < size; i++) {
                e0 e0Var = this.f2224c.get(i);
                if (e0Var != null) {
                    e0Var.b(6);
                    e0Var.a(null);
                }
            }
            h hVar = RecyclerView.this.v;
            if (hVar == null || !hVar.h()) {
                z();
            }
        }

        void u(int i, int i2) {
            int size = this.f2224c.size();
            for (int i3 = 0; i3 < size; i3++) {
                e0 e0Var = this.f2224c.get(i3);
                if (e0Var != null && e0Var.f2177d >= i) {
                    e0Var.A(i2, false);
                }
            }
        }

        void v(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i3 = -1;
                i5 = i;
                i4 = i2;
            } else {
                i3 = 1;
                i4 = i;
                i5 = i2;
            }
            int size = this.f2224c.size();
            for (int i7 = 0; i7 < size; i7++) {
                e0 e0Var = this.f2224c.get(i7);
                if (e0Var != null && (i6 = e0Var.f2177d) >= i5 && i6 <= i4) {
                    if (i6 == i) {
                        e0Var.A(i2 - i, false);
                    } else {
                        e0Var.A(i3, false);
                    }
                }
            }
        }

        void w(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f2224c.size() - 1; size >= 0; size--) {
                e0 e0Var = this.f2224c.get(size);
                if (e0Var != null) {
                    int i4 = e0Var.f2177d;
                    if (i4 >= i3) {
                        e0Var.A(-i2, z);
                    } else if (i4 >= i) {
                        e0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(h hVar, h hVar2, boolean z) {
            c();
            i().h(hVar, hVar2, z);
        }

        void y(View view) {
            e0 e0VarF0 = RecyclerView.f0(view);
            e0VarF0.o = null;
            e0VarF0.p = false;
            e0VarF0.e();
            C(e0VarF0);
        }

        void z() {
            for (int size = this.f2224c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f2224c.clear();
            if (RecyclerView.f2146f) {
                RecyclerView.this.r0.b();
            }
        }
    }

    public interface x {
        void a(e0 e0Var);
    }

    private class y extends j {
        y() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            RecyclerView.this.o(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.s0.g = true;
            recyclerView.P0(true);
            if (RecyclerView.this.n.p()) {
                return;
            }
            RecyclerView.this.requestLayout();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i, int i2, Object obj) {
            RecyclerView.this.o(null);
            if (RecyclerView.this.n.r(i, i2, obj)) {
                d();
            }
        }

        void d() {
            if (RecyclerView.f2145e) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.D && recyclerView.C) {
                    a.g.l.v.g0(recyclerView, recyclerView.r);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.L = true;
            recyclerView2.requestLayout();
        }
    }

    public static class z extends a.i.a.a {
        public static final Parcelable.Creator<z> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Parcelable f2229d;

        class a implements Parcelable.ClassLoaderCreator<z> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel) {
                return new z(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public z createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new z(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public z[] newArray(int i) {
                return new z[i];
            }
        }

        z(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f2229d = parcel.readParcelable(classLoader == null ? p.class.getClassLoader() : classLoader);
        }

        z(Parcelable parcelable) {
            super(parcelable);
        }

        void k(z zVar) {
            this.f2229d = zVar.f2229d;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f2229d, 0);
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        f2143c = i2 == 18 || i2 == 19 || i2 == 20;
        f2144d = i2 >= 23;
        f2145e = i2 >= 16;
        f2146f = i2 >= 21;
        g = i2 <= 15;
        h = i2 <= 15;
        Class<?> cls = Integer.TYPE;
        i = new Class[]{Context.class, AttributeSet.class, cls, cls};
        j = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.o.a.f800a);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = new y();
        this.l = new w();
        this.p = new androidx.recyclerview.widget.p();
        this.r = new a();
        this.s = new Rect();
        this.t = new Rect();
        this.u = new RectF();
        this.y = new ArrayList();
        this.z = new ArrayList<>();
        this.A = new ArrayList<>();
        this.G = 0;
        this.O = false;
        this.P = false;
        this.Q = 0;
        this.R = 0;
        this.S = new l();
        this.a0 = new androidx.recyclerview.widget.c();
        this.b0 = 0;
        this.c0 = -1;
        this.m0 = Float.MIN_VALUE;
        this.n0 = Float.MIN_VALUE;
        boolean z2 = true;
        this.o0 = true;
        this.p0 = new d0();
        this.r0 = f2146f ? new androidx.recyclerview.widget.e.b() : null;
        this.s0 = new b0();
        this.v0 = false;
        this.w0 = false;
        this.x0 = new n();
        this.y0 = false;
        this.B0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new int[2];
        this.G0 = new ArrayList();
        this.H0 = new b();
        this.J0 = 0;
        this.K0 = 0;
        this.L0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i0 = viewConfiguration.getScaledTouchSlop();
        this.m0 = a.g.l.w.b(viewConfiguration, context);
        this.n0 = a.g.l.w.d(viewConfiguration, context);
        this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.a0.v(this.x0);
        n0();
        p0();
        o0();
        if (a.g.l.v.A(this) == 0) {
            a.g.l.v.x0(this, 1);
        }
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = a.o.c.f809f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        a.g.l.v.m0(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        String string = typedArrayObtainStyledAttributes.getString(a.o.c.o);
        if (typedArrayObtainStyledAttributes.getInt(a.o.c.i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.q = typedArrayObtainStyledAttributes.getBoolean(a.o.c.h, true);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(a.o.c.j, false);
        this.E = z3;
        if (z3) {
            q0((StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(a.o.c.m), typedArrayObtainStyledAttributes.getDrawable(a.o.c.n), (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(a.o.c.k), typedArrayObtainStyledAttributes.getDrawable(a.o.c.l));
        }
        typedArrayObtainStyledAttributes.recycle();
        v(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            int[] iArr2 = f2142b;
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
            a.g.l.v.m0(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i2, 0);
            z2 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
            typedArrayObtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void A() {
        int i2 = this.K;
        this.K = 0;
        if (i2 == 0 || !s0()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        a.g.l.e0.b.b(accessibilityEventObtain, i2);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    private void C() {
        this.s0.a(1);
        Q(this.s0);
        this.s0.j = false;
        q1();
        this.p.f();
        G0();
        O0();
        d1();
        b0 b0Var = this.s0;
        b0Var.i = b0Var.k && this.w0;
        this.w0 = false;
        this.v0 = false;
        b0Var.h = b0Var.l;
        b0Var.f2166f = this.v.d();
        U(this.B0);
        if (this.s0.k) {
            int iG = this.o.g();
            for (int i2 = 0; i2 < iG; i2++) {
                e0 e0VarF0 = f0(this.o.f(i2));
                if (!e0VarF0.J() && (!e0VarF0.t() || this.v.h())) {
                    this.p.e(e0VarF0, this.a0.t(this.s0, e0VarF0, m.e(e0VarF0), e0VarF0.o()));
                    if (this.s0.i && e0VarF0.y() && !e0VarF0.v() && !e0VarF0.J() && !e0VarF0.t()) {
                        this.p.c(c0(e0VarF0), e0VarF0);
                    }
                }
            }
        }
        if (this.s0.l) {
            e1();
            b0 b0Var2 = this.s0;
            boolean z2 = b0Var2.g;
            b0Var2.g = false;
            this.w.X0(this.l, b0Var2);
            this.s0.g = z2;
            for (int i3 = 0; i3 < this.o.g(); i3++) {
                e0 e0VarF1 = f0(this.o.f(i3));
                if (!e0VarF1.J() && !this.p.i(e0VarF1)) {
                    int iE = m.e(e0VarF1);
                    boolean zP = e0VarF1.p(8192);
                    if (!zP) {
                        iE |= 4096;
                    }
                    m.c cVarT = this.a0.t(this.s0, e0VarF1, iE, e0VarF1.o());
                    if (zP) {
                        R0(e0VarF1, cVarT);
                    } else {
                        this.p.a(e0VarF1, cVarT);
                    }
                }
            }
        }
        s();
        H0();
        s1(false);
        this.s0.f2165e = 2;
    }

    private void D() {
        q1();
        G0();
        this.s0.a(6);
        this.n.j();
        this.s0.f2166f = this.v.d();
        this.s0.f2164d = 0;
        if (this.m != null && this.v.b()) {
            Parcelable parcelable = this.m.f2229d;
            if (parcelable != null) {
                this.w.c1(parcelable);
            }
            this.m = null;
        }
        b0 b0Var = this.s0;
        b0Var.h = false;
        this.w.X0(this.l, b0Var);
        b0 b0Var2 = this.s0;
        b0Var2.g = false;
        b0Var2.k = b0Var2.k && this.a0 != null;
        b0Var2.f2165e = 4;
        H0();
        s1(false);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0079  */
    private void E() {
        this.s0.a(4);
        q1();
        G0();
        b0 b0Var = this.s0;
        b0Var.f2165e = 1;
        if (b0Var.k) {
            for (int iG = this.o.g() - 1; iG >= 0; iG--) {
                e0 e0VarF0 = f0(this.o.f(iG));
                if (!e0VarF0.J()) {
                    long jC0 = c0(e0VarF0);
                    m.c cVarS = this.a0.s(this.s0, e0VarF0);
                    e0 e0VarG = this.p.g(jC0);
                    if (e0VarG == null || e0VarG.J()) {
                        this.p.d(e0VarF0, cVarS);
                    } else {
                        boolean zH = this.p.h(e0VarG);
                        boolean zH2 = this.p.h(e0VarF0);
                        if (zH && e0VarG == e0VarF0) {
                            this.p.d(e0VarF0, cVarS);
                        } else {
                            m.c cVarN = this.p.n(e0VarG);
                            this.p.d(e0VarF0, cVarS);
                            m.c cVarM = this.p.m(e0VarF0);
                            if (cVarN == null) {
                                k0(jC0, e0VarF0, e0VarG);
                            } else {
                                m(e0VarG, e0VarF0, cVarN, cVarM, zH, zH2);
                            }
                        }
                    }
                }
            }
            this.p.o(this.L0);
        }
        this.w.l1(this.l);
        b0 b0Var2 = this.s0;
        b0Var2.f2163c = b0Var2.f2166f;
        this.O = false;
        this.P = false;
        b0Var2.k = false;
        b0Var2.l = false;
        this.w.h = false;
        ArrayList<e0> arrayList = this.l.f2223b;
        if (arrayList != null) {
            arrayList.clear();
        }
        p pVar = this.w;
        if (pVar.n) {
            pVar.m = 0;
            pVar.n = false;
            this.l.K();
        }
        this.w.Y0(this.s0);
        H0();
        s1(false);
        this.p.f();
        int[] iArr = this.B0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        S0();
        b1();
    }

    private void J0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.c0) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.c0 = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.g0 = x2;
            this.e0 = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.h0 = y2;
            this.f0 = y2;
        }
    }

    private boolean K(MotionEvent motionEvent) {
        t tVar = this.B;
        if (tVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        tVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.B = null;
        }
        return true;
    }

    private boolean N0() {
        return this.a0 != null && this.w.L1();
    }

    private void O0() {
        boolean z2;
        if (this.O) {
            this.n.v();
            if (this.P) {
                this.w.S0(this);
            }
        }
        if (N0()) {
            this.n.t();
        } else {
            this.n.j();
        }
        boolean z3 = false;
        boolean z4 = this.v0 || this.w0;
        this.s0.k = this.F && this.a0 != null && ((z2 = this.O) || z4 || this.w.h) && (!z2 || this.v.h());
        b0 b0Var = this.s0;
        if (b0Var.k && z4 && !this.O && N0()) {
            z3 = true;
        }
        b0Var.l = z3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
    private void Q0(float f2, float f3, float f4, float f5) {
        boolean z2;
        EdgeEffect edgeEffect;
        float width;
        float height;
        boolean z3 = true;
        if (f3 >= 0.0f) {
            if (f3 > 0.0f) {
                N();
                edgeEffect = this.V;
                width = f3 / getWidth();
                height = f4 / getHeight();
            } else {
                z2 = false;
            }
            if (f5 < 0.0f) {
                O();
                androidx.core.widget.d.a(this.U, (-f5) / getHeight(), f2 / getWidth());
            } else if (f5 > 0.0f) {
                L();
                androidx.core.widget.d.a(this.W, f5 / getHeight(), 1.0f - (f2 / getWidth()));
            } else {
                z3 = z2;
            }
            if (z3 && f3 == 0.0f && f5 == 0.0f) {
                return;
            }
            a.g.l.v.f0(this);
        }
        M();
        edgeEffect = this.T;
        width = (-f3) / getWidth();
        height = 1.0f - (f4 / getHeight());
        androidx.core.widget.d.a(edgeEffect, width, height);
        z2 = true;
        if (f5 < 0.0f) {
            O();
            androidx.core.widget.d.a(this.U, (-f5) / getHeight(), f2 / getWidth());
        } else if (f5 > 0.0f) {
            L();
            androidx.core.widget.d.a(this.W, f5 / getHeight(), 1.0f - (f2 / getWidth()));
        } else {
            z3 = z2;
        }
        if (z3) {
        }
        a.g.l.v.f0(this);
    }

    private void S0() {
        View viewFindViewById;
        if (!this.o0 || this.v == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!h || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.o.n(focusedChild)) {
                    return;
                }
            } else if (this.o.g() == 0) {
                requestFocus();
                return;
            }
        }
        View viewW = null;
        e0 e0VarY = (this.s0.n == -1 || !this.v.h()) ? null : Y(this.s0.n);
        if (e0VarY != null && !this.o.n(e0VarY.f2175b) && e0VarY.f2175b.hasFocusable()) {
            viewW = e0VarY.f2175b;
        } else if (this.o.g() > 0) {
            viewW = W();
        }
        if (viewW != null) {
            int i2 = this.s0.o;
            if (i2 != -1 && (viewFindViewById = viewW.findViewById(i2)) != null && viewFindViewById.isFocusable()) {
                viewW = viewFindViewById;
            }
            viewW.requestFocus();
        }
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = this.A.get(i2);
            if (tVar.a(this, motionEvent) && action != 3) {
                this.B = tVar;
                return true;
            }
        }
        return false;
    }

    private void T0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.T.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        if (zIsFinished) {
            a.g.l.v.f0(this);
        }
    }

    private void U(int[] iArr) {
        int iG = this.o.g();
        if (iG == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < iG; i4++) {
            e0 e0VarF0 = f0(this.o.f(i4));
            if (!e0VarF0.J()) {
                int iM = e0VarF0.m();
                if (iM < i2) {
                    i2 = iM;
                }
                if (iM > i3) {
                    i3 = iM;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView recyclerViewV = V(viewGroup.getChildAt(i2));
            if (recyclerViewV != null) {
                return recyclerViewV;
            }
        }
        return null;
    }

    private View W() {
        e0 e0VarX;
        b0 b0Var = this.s0;
        int i2 = b0Var.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int iB = b0Var.b();
        for (int i3 = i2; i3 < iB; i3++) {
            e0 e0VarX2 = X(i3);
            if (e0VarX2 == null) {
                break;
            }
            if (e0VarX2.f2175b.hasFocusable()) {
                return e0VarX2.f2175b;
            }
        }
        int iMin = Math.min(iB, i2);
        do {
            iMin--;
            if (iMin < 0 || (e0VarX = X(iMin)) == null) {
                return null;
            }
        } while (!e0VarX.f2175b.hasFocusable());
        return e0VarX.f2175b;
    }

    private void a1(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.s.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            q qVar = (q) layoutParams;
            if (!qVar.f2214c) {
                Rect rect = qVar.f2213b;
                Rect rect2 = this.s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.s);
            offsetRectIntoDescendantCoords(view, this.s);
        }
        this.w.s1(this, view, this.s, !this.F, view2 == null);
    }

    private void b1() {
        b0 b0Var = this.s0;
        b0Var.n = -1L;
        b0Var.m = -1;
        b0Var.o = -1;
    }

    private void c1() {
        VelocityTracker velocityTracker = this.d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        t1(0);
        T0();
    }

    private void d1() {
        int iJ;
        View focusedChild = (this.o0 && hasFocus() && this.v != null) ? getFocusedChild() : null;
        e0 e0VarS = focusedChild != null ? S(focusedChild) : null;
        if (e0VarS == null) {
            b1();
            return;
        }
        this.s0.n = this.v.h() ? e0VarS.k() : -1L;
        b0 b0Var = this.s0;
        if (this.O) {
            iJ = -1;
        } else {
            iJ = e0VarS.v() ? e0VarS.f2178e : e0VarS.j();
        }
        b0Var.m = iJ;
        this.s0.o = h0(e0VarS.f2175b);
    }

    static e0 f0(View view) {
        if (view == null) {
            return null;
        }
        return ((q) view.getLayoutParams()).f2212a;
    }

    private void g(e0 e0Var) {
        View view = e0Var.f2175b;
        boolean z2 = view.getParent() == this;
        this.l.J(e0(view));
        boolean zX = e0Var.x();
        androidx.recyclerview.widget.b bVar = this.o;
        if (zX) {
            bVar.c(view, -1, view.getLayoutParams(), true);
        } else if (z2) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    static void g0(View view, Rect rect) {
        q qVar = (q) view.getLayoutParams();
        Rect rect2 = qVar.f2213b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) qVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) qVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) qVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin);
    }

    private a.g.l.l getScrollingChildHelper() {
        if (this.C0 == null) {
            this.C0 = new a.g.l.l(this);
        }
        return this.C0;
    }

    private int h0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                }
            }
            break loop0;
        }
        return id;
    }

    private String i0(Context context, String str) {
        StringBuilder sb;
        if (str.charAt(0) == '.') {
            sb = new StringBuilder();
            sb.append(context.getPackageName());
        } else {
            if (str.contains(".")) {
                return str;
            }
            sb = new StringBuilder();
            sb.append(RecyclerView.class.getPackage().getName());
            sb.append('.');
        }
        sb.append(str);
        return sb.toString();
    }

    private void i1(h hVar, boolean z2, boolean z3) {
        h hVar2 = this.v;
        if (hVar2 != null) {
            hVar2.v(this.k);
            this.v.o(this);
        }
        if (!z2 || z3) {
            U0();
        }
        this.n.v();
        h hVar3 = this.v;
        this.v = hVar;
        if (hVar != null) {
            hVar.t(this.k);
            hVar.k(this);
        }
        p pVar = this.w;
        if (pVar != null) {
            pVar.E0(hVar3, this.v);
        }
        this.l.x(hVar3, this.v, z2);
        this.s0.g = true;
    }

    private void k0(long j2, e0 e0Var, e0 e0Var2) {
        int iG = this.o.g();
        for (int i2 = 0; i2 < iG; i2++) {
            e0 e0VarF0 = f0(this.o.f(i2));
            if (e0VarF0 != e0Var && c0(e0VarF0) == j2) {
                h hVar = this.v;
                if (hVar == null || !hVar.h()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + e0VarF0 + " \n View Holder 2:" + e0Var + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + e0VarF0 + " \n View Holder 2:" + e0Var + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + e0Var2 + " cannot be found but it is necessary for " + e0Var + P());
    }

    private void m(e0 e0Var, e0 e0Var2, m.c cVar, m.c cVar2, boolean z2, boolean z3) {
        e0Var.G(false);
        if (z2) {
            g(e0Var);
        }
        if (e0Var != e0Var2) {
            if (z3) {
                g(e0Var2);
            }
            e0Var.i = e0Var2;
            g(e0Var);
            this.l.J(e0Var);
            e0Var2.G(false);
            e0Var2.j = e0Var;
        }
        if (this.a0.b(e0Var, e0Var2, cVar, cVar2)) {
            M0();
        }
    }

    private boolean m0() {
        int iG = this.o.g();
        for (int i2 = 0; i2 < iG; i2++) {
            e0 e0VarF0 = f0(this.o.f(i2));
            if (e0VarF0 != null && !e0VarF0.J() && e0VarF0.y()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void o0() {
        if (a.g.l.v.B(this) == 0) {
            a.g.l.v.y0(this, 8);
        }
    }

    private void p0() {
        this.o = new androidx.recyclerview.widget.b(new e());
    }

    private void q() {
        c1();
        setScrollState(0);
    }

    static void r(e0 e0Var) {
        WeakReference<RecyclerView> weakReference = e0Var.f2176c;
        if (weakReference == null) {
            return;
        }
        Object parent = weakReference.get();
        while (true) {
            View view = (View) parent;
            while (true) {
                if (view == null) {
                    e0Var.f2176c = null;
                    return;
                } else {
                    if (view == e0Var.f2175b) {
                        return;
                    }
                    parent = view.getParent();
                    if (parent instanceof View) {
                        break;
                    } else {
                        view = null;
                    }
                }
            }
        }
    }

    private boolean u0(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.s.set(0, 0, view.getWidth(), view.getHeight());
        this.t.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.s);
        offsetDescendantRectToMyCoords(view2, this.t);
        byte b2 = -1;
        int i4 = this.w.Z() == 1 ? -1 : 1;
        Rect rect = this.s;
        int i5 = rect.left;
        Rect rect2 = this.t;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            b2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                b2 = 0;
            }
        }
        if (i2 == 1) {
            return b2 < 0 || (b2 == 0 && i3 * i4 < 0);
        }
        if (i2 == 2) {
            return b2 > 0 || (b2 == 0 && i3 * i4 > 0);
        }
        if (i2 == 17) {
            return i3 < 0;
        }
        if (i2 == 33) {
            return b2 < 0;
        }
        if (i2 == 66) {
            return i3 > 0;
        }
        if (i2 == 130) {
            return b2 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i2 + P());
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strI0 = i0(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = Class.forName(strI0, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(p.class);
                Object[] objArr = null;
                try {
                    constructor = clsAsSubclass.getConstructor(i);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strI0, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((p) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strI0, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strI0, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strI0, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strI0, e8);
            }
        }
    }

    private void v1() {
        this.p0.f();
        p pVar = this.w;
        if (pVar != null) {
            pVar.K1();
        }
    }

    private boolean x(int i2, int i3) {
        U(this.B0);
        int[] iArr = this.B0;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void y0(int i2, int i3, MotionEvent motionEvent, int i4) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        int[] iArr = this.F0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean zK = pVar.k();
        boolean zL = this.w.l();
        int i5 = zK ? 1 : 0;
        if (zL) {
            i5 |= 2;
        }
        r1(i5, i4);
        if (F(zK ? i2 : 0, zL ? i3 : 0, this.F0, this.D0, i4)) {
            int[] iArr2 = this.F0;
            i2 -= iArr2[0];
            i3 -= iArr2[1];
        }
        f1(zK ? i2 : 0, zL ? i3 : 0, motionEvent, i4);
        androidx.recyclerview.widget.e eVar = this.q0;
        if (eVar != null && (i2 != 0 || i3 != 0)) {
            eVar.f(this, i2, i3);
        }
        t1(i4);
    }

    public void A0(int i2) {
        int iG = this.o.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.o.f(i3).offsetTopAndBottom(i2);
        }
    }

    void B() {
        if (this.v == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.w == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.s0.j = false;
        boolean z2 = this.I0 && !(this.J0 == getWidth() && this.K0 == getHeight());
        this.J0 = 0;
        this.K0 = 0;
        this.I0 = false;
        if (this.s0.f2165e != 1) {
            if (!this.n.q() && !z2 && this.w.o0() == getWidth() && this.w.W() == getHeight()) {
                this.w.z1(this);
            }
            E();
        }
        C();
        this.w.z1(this);
        D();
        E();
    }

    void B0(int i2, int i3) {
        int iJ = this.o.j();
        for (int i4 = 0; i4 < iJ; i4++) {
            e0 e0VarF0 = f0(this.o.i(i4));
            if (e0VarF0 != null && !e0VarF0.J() && e0VarF0.f2177d >= i2) {
                e0VarF0.A(i3, false);
                this.s0.g = true;
            }
        }
        this.l.u(i2, i3);
        requestLayout();
    }

    void C0(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int iJ = this.o.j();
        if (i2 < i3) {
            i6 = -1;
            i5 = i2;
            i4 = i3;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < iJ; i8++) {
            e0 e0VarF0 = f0(this.o.i(i8));
            if (e0VarF0 != null && (i7 = e0VarF0.f2177d) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    e0VarF0.A(i3 - i2, false);
                } else {
                    e0VarF0.A(i6, false);
                }
                this.s0.g = true;
            }
        }
        this.l.v(i2, i3);
        requestLayout();
    }

    void D0(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int iJ = this.o.j();
        for (int i5 = 0; i5 < iJ; i5++) {
            e0 e0VarF0 = f0(this.o.i(i5));
            if (e0VarF0 != null && !e0VarF0.J()) {
                int i6 = e0VarF0.f2177d;
                if (i6 >= i4) {
                    e0VarF0.A(-i3, z2);
                } else if (i6 >= i2) {
                    e0VarF0.i(i2 - 1, -i3, z2);
                }
                this.s0.g = true;
            }
        }
        this.l.w(i2, i3, z2);
        requestLayout();
    }

    public void E0(View view) {
    }

    public boolean F(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().d(i2, i3, iArr, iArr2, i4);
    }

    public void F0(View view) {
    }

    public final void G(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    void G0() {
        this.Q++;
    }

    void H(int i2) {
        p pVar = this.w;
        if (pVar != null) {
            pVar.e1(i2);
        }
        K0(i2);
        u uVar = this.t0;
        if (uVar != null) {
            uVar.a(this, i2);
        }
        List<u> list = this.u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u0.get(size).a(this, i2);
            }
        }
    }

    void H0() {
        I0(true);
    }

    void I(int i2, int i3) {
        this.R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        L0(i2, i3);
        u uVar = this.t0;
        if (uVar != null) {
            uVar.b(this, i2, i3);
        }
        List<u> list = this.u0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.u0.get(size).b(this, i2, i3);
            }
        }
        this.R--;
    }

    void I0(boolean z2) {
        int i2 = this.Q - 1;
        this.Q = i2;
        if (i2 < 1) {
            this.Q = 0;
            if (z2) {
                A();
                J();
            }
        }
    }

    void J() {
        int i2;
        for (int size = this.G0.size() - 1; size >= 0; size--) {
            e0 e0Var = this.G0.get(size);
            if (e0Var.f2175b.getParent() == this && !e0Var.J() && (i2 = e0Var.r) != -1) {
                a.g.l.v.x0(e0Var.f2175b, i2);
                e0Var.r = -1;
            }
        }
        this.G0.clear();
    }

    public void K0(int i2) {
    }

    void L() {
        if (this.W != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 3);
        this.W = edgeEffectA;
        if (this.q) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void L0(int i2, int i3) {
    }

    void M() {
        if (this.T != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 0);
        this.T = edgeEffectA;
        if (this.q) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void M0() {
        if (this.y0 || !this.C) {
            return;
        }
        a.g.l.v.g0(this, this.H0);
        this.y0 = true;
    }

    void N() {
        if (this.V != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 2);
        this.V = edgeEffectA;
        if (this.q) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    void O() {
        if (this.U != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.S.a(this, 1);
        this.U = edgeEffectA;
        if (this.q) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.v + ", layout:" + this.w + ", context:" + getContext();
    }

    void P0(boolean z2) {
        this.P = z2 | this.P;
        this.O = true;
        x0();
    }

    final void Q(b0 b0Var) {
        if (getScrollState() != 2) {
            b0Var.p = 0;
            b0Var.q = 0;
        } else {
            OverScroller overScroller = this.p0.f2170d;
            b0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
            b0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public View R(View view) {
        Object parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    void R0(e0 e0Var, m.c cVar) {
        e0Var.F(0, 8192);
        if (this.s0.i && e0Var.y() && !e0Var.v() && !e0Var.J()) {
            this.p.c(c0(e0Var), e0Var);
        }
        this.p.e(e0Var, cVar);
    }

    public e0 S(View view) {
        View viewR = R(view);
        if (viewR == null) {
            return null;
        }
        return e0(viewR);
    }

    void U0() {
        m mVar = this.a0;
        if (mVar != null) {
            mVar.k();
        }
        p pVar = this.w;
        if (pVar != null) {
            pVar.k1(this.l);
            this.w.l1(this.l);
        }
        this.l.c();
    }

    boolean V0(View view) {
        q1();
        boolean zR = this.o.r(view);
        if (zR) {
            e0 e0VarF0 = f0(view);
            this.l.J(e0VarF0);
            this.l.C(e0VarF0);
        }
        s1(!zR);
        return zR;
    }

    public void W0(o oVar) {
        p pVar = this.w;
        if (pVar != null) {
            pVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.z.remove(oVar);
        if (this.z.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public e0 X(int i2) {
        e0 e0Var = null;
        if (this.O) {
            return null;
        }
        int iJ = this.o.j();
        for (int i3 = 0; i3 < iJ; i3++) {
            e0 e0VarF0 = f0(this.o.i(i3));
            if (e0VarF0 != null && !e0VarF0.v() && b0(e0VarF0) == i2) {
                if (!this.o.n(e0VarF0.f2175b)) {
                    return e0VarF0;
                }
                e0Var = e0VarF0;
            }
        }
        return e0Var;
    }

    public void X0(t tVar) {
        this.A.remove(tVar);
        if (this.B == tVar) {
            this.B = null;
        }
    }

    public e0 Y(long j2) {
        h hVar = this.v;
        e0 e0Var = null;
        if (hVar != null && hVar.h()) {
            int iJ = this.o.j();
            for (int i2 = 0; i2 < iJ; i2++) {
                e0 e0VarF0 = f0(this.o.i(i2));
                if (e0VarF0 != null && !e0VarF0.v() && e0VarF0.k() == j2) {
                    if (!this.o.n(e0VarF0.f2175b)) {
                        return e0VarF0;
                    }
                    e0Var = e0VarF0;
                }
            }
        }
        return e0Var;
    }

    public void Y0(u uVar) {
        List<u> list = this.u0;
        if (list != null) {
            list.remove(uVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[SYNTHETIC] */
    e0 Z(int i2, boolean z2) {
        int iJ = this.o.j();
        e0 e0Var = null;
        for (int i3 = 0; i3 < iJ; i3++) {
            e0 e0VarF0 = f0(this.o.i(i3));
            if (e0VarF0 != null && !e0VarF0.v()) {
                if (z2) {
                    if (e0VarF0.f2177d != i2) {
                        continue;
                    } else {
                        if (this.o.n(e0VarF0.f2175b)) {
                            return e0VarF0;
                        }
                        e0Var = e0VarF0;
                    }
                } else if (e0VarF0.m() != i2) {
                    continue;
                } else {
                    if (this.o.n(e0VarF0.f2175b)) {
                        return e0VarF0;
                    }
                    e0Var = e0VarF0;
                }
            }
        }
        return e0Var;
    }

    void Z0() {
        e0 e0Var;
        int iG = this.o.g();
        for (int i2 = 0; i2 < iG; i2++) {
            View viewF = this.o.f(i2);
            e0 e0VarE0 = e0(viewF);
            if (e0VarE0 != null && (e0Var = e0VarE0.j) != null) {
                View view = e0Var.f2175b;
                int left = viewF.getLeft();
                int top = viewF.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    void a(int i2, int i3) {
        if (i2 < 0) {
            M();
            if (this.T.isFinished()) {
                this.T.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            N();
            if (this.V.isFinished()) {
                this.V.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            O();
            if (this.U.isFinished()) {
                this.U.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            L();
            if (this.W.isFinished()) {
                this.W.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        a.g.l.v.f0(this);
    }

    public boolean a0(int i2, int i3) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.I) {
            return false;
        }
        boolean zK = pVar.k();
        boolean zL = this.w.l();
        if (!zK || Math.abs(i2) < this.k0) {
            i2 = 0;
        }
        if (!zL || Math.abs(i3) < this.k0) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        float f2 = i2;
        float f3 = i3;
        if (!dispatchNestedPreFling(f2, f3)) {
            boolean z2 = zK || zL;
            dispatchNestedFling(f2, f3, z2);
            s sVar = this.j0;
            if (sVar != null && sVar.a(i2, i3)) {
                return true;
            }
            if (z2) {
                int i4 = zK ? 1 : 0;
                if (zL) {
                    i4 |= 2;
                }
                r1(i4, 1);
                int i5 = this.l0;
                int iMax = Math.max(-i5, Math.min(i2, i5));
                int i6 = this.l0;
                this.p0.b(iMax, Math.max(-i6, Math.min(i3, i6)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        p pVar = this.w;
        if (pVar == null || !pVar.F0(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    int b0(e0 e0Var) {
        if (e0Var.p(524) || !e0Var.s()) {
            return -1;
        }
        return this.n.e(e0Var.f2177d);
    }

    long c0(e0 e0Var) {
        return this.v.h() ? e0Var.k() : e0Var.f2177d;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof q) && this.w.m((q) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        p pVar = this.w;
        if (pVar != null && pVar.k()) {
            return this.w.q(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        p pVar = this.w;
        if (pVar != null && pVar.k()) {
            return this.w.r(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        p pVar = this.w;
        if (pVar != null && pVar.k()) {
            return this.w.s(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        p pVar = this.w;
        if (pVar != null && pVar.l()) {
            return this.w.t(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        p pVar = this.w;
        if (pVar != null && pVar.l()) {
            return this.w.u(this.s0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        p pVar = this.w;
        if (pVar != null && pVar.l()) {
            return this.w.v(this.s0);
        }
        return 0;
    }

    public int d0(View view) {
        e0 e0VarF0 = f0(view);
        if (e0VarF0 != null) {
            return e0VarF0.m();
        }
        return -1;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().f(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        float paddingRight;
        int paddingBottom;
        super.draw(canvas);
        int size = this.z.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.z.get(i2).i(canvas, this, this.s0);
        }
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom2 = this.q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom2, 0.0f);
            EdgeEffect edgeEffect2 = this.T;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.q) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.U;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.V;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.q) {
                paddingRight = (-getWidth()) + getPaddingRight();
                paddingBottom = (-getHeight()) + getPaddingBottom();
            } else {
                paddingRight = -getWidth();
                paddingBottom = -getHeight();
            }
            canvas.translate(paddingRight, paddingBottom);
            EdgeEffect edgeEffect8 = this.W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(iSave4);
        }
        if ((z2 || this.a0 == null || this.z.size() <= 0 || !this.a0.p()) ? z2 : true) {
            a.g.l.v.f0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public e0 e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    void e1() {
        int iJ = this.o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            e0 e0VarF0 = f0(this.o.i(i2));
            if (!e0VarF0.J()) {
                e0VarF0.E();
            }
        }
    }

    boolean f1(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        u();
        if (this.v != null) {
            int[] iArr = this.F0;
            iArr[0] = 0;
            iArr[1] = 0;
            g1(i2, i3, iArr);
            int[] iArr2 = this.F0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i5 = i10;
            i6 = i9;
            i7 = i2 - i9;
            i8 = i3 - i10;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.z.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.F0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i6, i5, i7, i8, this.D0, i4, iArr3);
        int[] iArr4 = this.F0;
        int i11 = i7 - iArr4[0];
        int i12 = i8 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.g0;
        int[] iArr5 = this.D0;
        this.g0 = i13 - iArr5[0];
        this.h0 -= iArr5[1];
        int[] iArr6 = this.E0;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !a.g.l.j.a(motionEvent, 8194)) {
                Q0(motionEvent.getX(), i11, motionEvent.getY(), i12);
            }
            t(i2, i3);
        }
        if (i6 != 0 || i5 != 0) {
            I(i6, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i6 == 0 && i5 == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View viewJ0;
        boolean z2;
        View viewQ0 = this.w.Q0(view, i2);
        if (viewQ0 != null) {
            return viewQ0;
        }
        boolean z3 = (this.v == null || this.w == null || t0() || this.I) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z3 && (i2 == 2 || i2 == 1)) {
            if (this.w.l()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (g) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.w.k()) {
                int i4 = (this.w.Z() == 1) ^ (i2 == 2) ? 66 : 17;
                boolean z4 = focusFinder.findNextFocus(this, view, i4) == null;
                if (g) {
                    i2 = i4;
                }
                z2 = z4;
            }
            if (z2) {
                u();
                if (R(view) == null) {
                    return null;
                }
                q1();
                this.w.J0(view, i2, this.l, this.s0);
                s1(false);
            }
            viewJ0 = focusFinder.findNextFocus(this, view, i2);
        } else {
            View viewFindNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (viewFindNextFocus == null && z3) {
                u();
                if (R(view) == null) {
                    return null;
                }
                q1();
                viewJ0 = this.w.J0(view, i2, this.l, this.s0);
                s1(false);
            } else {
                viewJ0 = viewFindNextFocus;
            }
        }
        if (viewJ0 == null || viewJ0.hasFocusable()) {
            return u0(view, viewJ0, i2) ? viewJ0 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        a1(viewJ0, null);
        return view;
    }

    void g1(int i2, int i3, int[] iArr) {
        q1();
        G0();
        a.g.h.c.a("RV Scroll");
        Q(this.s0);
        int iW1 = i2 != 0 ? this.w.w1(i2, this.l, this.s0) : 0;
        int iY1 = i3 != 0 ? this.w.y1(i3, this.l, this.s0) : 0;
        a.g.h.c.b();
        Z0();
        H0();
        s1(false);
        if (iArr != null) {
            iArr[0] = iW1;
            iArr[1] = iY1;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        p pVar = this.w;
        if (pVar != null) {
            return pVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        p pVar = this.w;
        if (pVar != null) {
            return pVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        p pVar = this.w;
        if (pVar != null) {
            return pVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public h getAdapter() {
        return this.v;
    }

    @Override // android.view.View
    public int getBaseline() {
        p pVar = this.w;
        return pVar != null ? pVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        k kVar = this.A0;
        return kVar == null ? super.getChildDrawingOrder(i2, i3) : kVar.a(i2, i3);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.q;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.z0;
    }

    public l getEdgeEffectFactory() {
        return this.S;
    }

    public m getItemAnimator() {
        return this.a0;
    }

    public int getItemDecorationCount() {
        return this.z.size();
    }

    public p getLayoutManager() {
        return this.w;
    }

    public int getMaxFlingVelocity() {
        return this.l0;
    }

    public int getMinFlingVelocity() {
        return this.k0;
    }

    long getNanoTime() {
        if (f2146f) {
            return System.nanoTime();
        }
        return 0L;
    }

    public s getOnFlingListener() {
        return this.j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.o0;
    }

    public v getRecycledViewPool() {
        return this.l.i();
    }

    public int getScrollState() {
        return this.b0;
    }

    public void h(o oVar) {
        i(oVar, -1);
    }

    public void h1(int i2) {
        if (this.I) {
            return;
        }
        u1();
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.x1(i2);
            awakenScrollBars();
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(o oVar, int i2) {
        p pVar = this.w;
        if (pVar != null) {
            pVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.z.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.z.add(oVar);
        } else {
            this.z.add(i2, oVar);
        }
        w0();
        requestLayout();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.C;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.I;
    }

    @Override // android.view.View, a.g.l.k
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(t tVar) {
        this.A.add(tVar);
    }

    Rect j0(View view) {
        q qVar = (q) view.getLayoutParams();
        if (!qVar.f2214c) {
            return qVar.f2213b;
        }
        if (this.s0.e() && (qVar.b() || qVar.d())) {
            return qVar.f2213b;
        }
        Rect rect = qVar.f2213b;
        rect.set(0, 0, 0, 0);
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.set(0, 0, 0, 0);
            this.z.get(i2).e(this.s, view, this, this.s0);
            int i3 = rect.left;
            Rect rect2 = this.s;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        qVar.f2214c = false;
        return rect;
    }

    boolean j1(e0 e0Var, int i2) {
        if (!t0()) {
            a.g.l.v.x0(e0Var.f2175b, i2);
            return true;
        }
        e0Var.r = i2;
        this.G0.add(e0Var);
        return false;
    }

    public void k(u uVar) {
        if (this.u0 == null) {
            this.u0 = new ArrayList();
        }
        this.u0.add(uVar);
    }

    boolean k1(AccessibilityEvent accessibilityEvent) {
        if (!t0()) {
            return false;
        }
        int iA = accessibilityEvent != null ? a.g.l.e0.b.a(accessibilityEvent) : 0;
        this.K |= iA != 0 ? iA : 0;
        return true;
    }

    void l(e0 e0Var, m.c cVar, m.c cVar2) {
        e0Var.G(false);
        if (this.a0.a(e0Var, cVar, cVar2)) {
            M0();
        }
    }

    public boolean l0() {
        return !this.F || this.O || this.n.p();
    }

    public void l1(int i2, int i3) {
        m1(i2, i3, null);
    }

    public void m1(int i2, int i3, Interpolator interpolator) {
        n1(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    void n(e0 e0Var, m.c cVar, m.c cVar2) {
        g(e0Var);
        e0Var.G(false);
        if (this.a0.c(e0Var, cVar, cVar2)) {
            M0();
        }
    }

    void n0() {
        this.n = new androidx.recyclerview.widget.a(new f());
    }

    public void n1(int i2, int i3, Interpolator interpolator, int i4) {
        o1(i2, i3, interpolator, i4, false);
    }

    void o(String str) {
        if (t0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    void o1(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        if (!pVar.k()) {
            i2 = 0;
        }
        if (!this.w.l()) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
            scrollBy(i2, i3);
            return;
        }
        if (z2) {
            int i5 = i2 != 0 ? 1 : 0;
            if (i3 != 0) {
                i5 |= 2;
            }
            r1(i5, 1);
        }
        this.p0.e(i2, i3, i4, interpolator);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q = 0;
        this.C = true;
        this.F = this.F && !isLayoutRequested();
        p pVar = this.w;
        if (pVar != null) {
            pVar.z(this);
        }
        this.y0 = false;
        if (f2146f) {
            ThreadLocal<androidx.recyclerview.widget.e> threadLocal = androidx.recyclerview.widget.e.f2321b;
            androidx.recyclerview.widget.e eVar = threadLocal.get();
            this.q0 = eVar;
            if (eVar == null) {
                this.q0 = new androidx.recyclerview.widget.e();
                Display displayV = a.g.l.v.v(this);
                float f2 = 60.0f;
                if (!isInEditMode() && displayV != null) {
                    float refreshRate = displayV.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                androidx.recyclerview.widget.e eVar2 = this.q0;
                eVar2.f2325f = (long) (1.0E9f / f2);
                threadLocal.set(eVar2);
            }
            this.q0.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        m mVar = this.a0;
        if (mVar != null) {
            mVar.k();
        }
        u1();
        this.C = false;
        p pVar = this.w;
        if (pVar != null) {
            pVar.A(this, this.l);
        }
        this.G0.clear();
        removeCallbacks(this.H0);
        this.p.j();
        if (!f2146f || (eVar = this.q0) == null) {
            return;
        }
        eVar.j(this);
        this.q0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.z.get(i2).g(canvas, this, this.s0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float axisValue;
        if (this.w != null && !this.I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.w.l() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.w.k() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.w.l()) {
                    f2 = -axisValue2;
                } else if (this.w.k()) {
                    axisValue = axisValue2;
                    f2 = 0.0f;
                } else {
                    f2 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f2 = 0.0f;
                axisValue = 0.0f;
            }
            if (f2 != 0.0f || axisValue != 0.0f) {
                y0((int) (axisValue * this.m0), (int) (f2 * this.n0), motionEvent, 1);
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.I) {
            return false;
        }
        this.B = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        p pVar = this.w;
        if (pVar == null) {
            return false;
        }
        boolean zK = pVar.k();
        boolean zL = this.w.l();
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        this.d0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.J) {
                this.J = false;
            }
            this.c0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.g0 = x2;
            this.e0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.h0 = y2;
            this.f0 = y2;
            if (this.b0 == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                t1(1);
            }
            int[] iArr = this.E0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = zK;
            if (zL) {
                i2 = (zK ? 1 : 0) | 2;
            }
            r1(i2, 0);
        } else if (actionMasked == 1) {
            this.d0.clear();
            t1(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.c0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.c0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.b0 != 1) {
                int i3 = x3 - this.e0;
                int i4 = y3 - this.f0;
                if (!zK || Math.abs(i3) <= this.i0) {
                    z2 = false;
                } else {
                    this.g0 = x3;
                    z2 = true;
                }
                if (zL && Math.abs(i4) > this.i0) {
                    this.h0 = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.c0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.g0 = x4;
            this.e0 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.h0 = y4;
            this.f0 = y4;
        } else if (actionMasked == 6) {
            J0(motionEvent);
        }
        return this.b0 == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        a.g.h.c.a("RV OnLayout");
        B();
        a.g.h.c.b();
        this.F = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        p pVar = this.w;
        if (pVar == null) {
            w(i2, i3);
            return;
        }
        boolean z2 = false;
        if (pVar.s0()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.w.Z0(this.l, this.s0, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.I0 = z2;
            if (z2 || this.v == null) {
                return;
            }
            if (this.s0.f2165e == 1) {
                C();
            }
            this.w.A1(i2, i3);
            this.s0.j = true;
            D();
            this.w.D1(i2, i3);
            if (this.w.G1()) {
                this.w.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.s0.j = true;
                D();
                this.w.D1(i2, i3);
            }
            this.J0 = getMeasuredWidth();
            this.K0 = getMeasuredHeight();
            return;
        }
        if (this.D) {
            this.w.Z0(this.l, this.s0, i2, i3);
            return;
        }
        if (this.L) {
            q1();
            G0();
            O0();
            H0();
            b0 b0Var = this.s0;
            if (b0Var.l) {
                b0Var.h = true;
            } else {
                this.n.j();
                this.s0.h = false;
            }
            this.L = false;
            s1(false);
        } else if (this.s0.l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        h hVar = this.v;
        if (hVar != null) {
            this.s0.f2166f = hVar.d();
        } else {
            this.s0.f2166f = 0;
        }
        q1();
        this.w.Z0(this.l, this.s0, i2, i3);
        s1(false);
        this.s0.h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z zVar = (z) parcelable;
        this.m = zVar;
        super.onRestoreInstanceState(zVar.j());
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        z zVar = new z(super.onSaveInstanceState());
        z zVar2 = this.m;
        if (zVar2 != null) {
            zVar.k(zVar2);
        } else {
            p pVar = this.w;
            zVar.f2229d = pVar != null ? pVar.d1() : null;
        }
        return zVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        r0();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00dd A[PHI: r0
      0x00dd: PHI (r0v36 int) = (r0v26 int), (r0v40 int) binds: [B:41:0x00c8, B:46:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        boolean z2;
        boolean z3 = false;
        if (this.I || this.J) {
            return false;
        }
        if (K(motionEvent)) {
            q();
            return true;
        }
        p pVar = this.w;
        if (pVar == null) {
            return false;
        }
        boolean zK = pVar.k();
        boolean zL = this.w.l();
        if (this.d0 == null) {
            this.d0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.E0;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int[] iArr2 = this.E0;
        motionEventObtain.offsetLocation(iArr2[0], iArr2[1]);
        if (actionMasked == 0) {
            this.c0 = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.g0 = x2;
            this.e0 = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.h0 = y2;
            this.f0 = y2;
            if (zL) {
                i2 = zK;
                i2 = (zK ? 1 : 0) | 2;
            }
            i2 = zK;
            r1(i2, 0);
        } else if (actionMasked == 1) {
            this.d0.addMovement(motionEventObtain);
            this.d0.computeCurrentVelocity(1000, this.l0);
            float f2 = zK ? -this.d0.getXVelocity(this.c0) : 0.0f;
            float f3 = zL ? -this.d0.getYVelocity(this.c0) : 0.0f;
            if ((f2 == 0.0f && f3 == 0.0f) || !a0((int) f2, (int) f3)) {
                setScrollState(0);
            }
            c1();
            z3 = true;
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.c0);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.c0 + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            int iMax = this.g0 - x3;
            int iMax2 = this.h0 - y3;
            if (this.b0 != 1) {
                if (zK) {
                    int i3 = this.i0;
                    iMax = iMax > 0 ? Math.max(0, iMax - i3) : Math.min(0, iMax + i3);
                    if (iMax != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                }
                if (zL) {
                    int i4 = this.i0;
                    iMax2 = iMax2 > 0 ? Math.max(0, iMax2 - i4) : Math.min(0, iMax2 + i4);
                    if (iMax2 != 0) {
                        z2 = true;
                    }
                }
                if (z2) {
                    setScrollState(1);
                }
            }
            int i5 = iMax;
            int i6 = iMax2;
            if (this.b0 == 1) {
                int[] iArr3 = this.F0;
                iArr3[0] = 0;
                iArr3[1] = 0;
                if (F(zK ? i5 : 0, zL ? i6 : 0, iArr3, this.D0, 0)) {
                    int[] iArr4 = this.F0;
                    i5 -= iArr4[0];
                    i6 -= iArr4[1];
                    int[] iArr5 = this.E0;
                    int i7 = iArr5[0];
                    int[] iArr6 = this.D0;
                    iArr5[0] = i7 + iArr6[0];
                    iArr5[1] = iArr5[1] + iArr6[1];
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                int i8 = i6;
                int[] iArr7 = this.D0;
                this.g0 = x3 - iArr7[0];
                this.h0 = y3 - iArr7[1];
                if (f1(zK ? i5 : 0, zL ? i8 : 0, motionEvent, 0)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                androidx.recyclerview.widget.e eVar = this.q0;
                if (eVar != null && (i5 != 0 || i8 != 0)) {
                    eVar.f(this, i5, i8);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.c0 = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.g0 = x4;
            this.e0 = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.h0 = y4;
            this.f0 = y4;
        } else if (actionMasked == 6) {
            J0(motionEvent);
        }
        if (!z3) {
            this.d0.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    boolean p(e0 e0Var) {
        m mVar = this.a0;
        return mVar == null || mVar.g(e0Var, e0Var.o());
    }

    public void p1(int i2) {
        if (this.I) {
            return;
        }
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            pVar.I1(this, this.s0, i2);
        }
    }

    void q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.o.b.f801a), resources.getDimensionPixelSize(a.o.b.f803c), resources.getDimensionPixelOffset(a.o.b.f802b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    void q1() {
        int i2 = this.G + 1;
        this.G = i2;
        if (i2 != 1 || this.I) {
            return;
        }
        this.H = false;
    }

    void r0() {
        this.W = null;
        this.U = null;
        this.V = null;
        this.T = null;
    }

    public boolean r1(int i2, int i3) {
        return getScrollingChildHelper().p(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        e0 e0VarF0 = f0(view);
        if (e0VarF0 != null) {
            if (e0VarF0.x()) {
                e0VarF0.f();
            } else if (!e0VarF0.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + e0VarF0 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.w.b1(this, this.s0, view, view2) && view2 != null) {
            a1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.w.r1(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.A.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A.get(i2).c(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.G != 0 || this.I) {
            this.H = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int iJ = this.o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            e0 e0VarF0 = f0(this.o.i(i2));
            if (!e0VarF0.J()) {
                e0VarF0.c();
            }
        }
        this.l.d();
    }

    boolean s0() {
        AccessibilityManager accessibilityManager = this.M;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    void s1(boolean z2) {
        if (this.G < 1) {
            this.G = 1;
        }
        if (!z2 && !this.I) {
            this.H = false;
        }
        if (this.G == 1) {
            if (z2 && this.H && !this.I && this.w != null && this.v != null) {
                B();
            }
            if (!this.I) {
                this.H = false;
            }
        }
        this.G--;
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        p pVar = this.w;
        if (pVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        boolean zK = pVar.k();
        boolean zL = this.w.l();
        if (zK || zL) {
            if (!zK) {
                i2 = 0;
            }
            if (!zL) {
                i3 = 0;
            }
            f1(i2, i3, null, 0);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (k1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.z0 = kVar;
        a.g.l.v.o0(this, kVar);
    }

    public void setAdapter(h hVar) {
        setLayoutFrozen(false);
        i1(hVar, false, true);
        P0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(k kVar) {
        if (kVar == this.A0) {
            return;
        }
        this.A0 = kVar;
        setChildrenDrawingOrderEnabled(kVar != null);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.q) {
            r0();
        }
        this.q = z2;
        super.setClipToPadding(z2);
        if (this.F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(l lVar) {
        a.g.k.h.e(lVar);
        this.S = lVar;
        r0();
    }

    public void setHasFixedSize(boolean z2) {
        this.D = z2;
    }

    public void setItemAnimator(m mVar) {
        m mVar2 = this.a0;
        if (mVar2 != null) {
            mVar2.k();
            this.a0.v(null);
        }
        this.a0 = mVar;
        if (mVar != null) {
            mVar.v(this.x0);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.l.G(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(p pVar) {
        if (pVar == this.w) {
            return;
        }
        u1();
        if (this.w != null) {
            m mVar = this.a0;
            if (mVar != null) {
                mVar.k();
            }
            this.w.k1(this.l);
            this.w.l1(this.l);
            this.l.c();
            if (this.C) {
                this.w.A(this, this.l);
            }
            this.w.E1(null);
            this.w = null;
        } else {
            this.l.c();
        }
        this.o.o();
        this.w = pVar;
        if (pVar != null) {
            if (pVar.f2201b != null) {
                throw new IllegalArgumentException("LayoutManager " + pVar + " is already attached to a RecyclerView:" + pVar.f2201b.P());
            }
            pVar.E1(this);
            if (this.C) {
                this.w.z(this);
            }
        }
        this.l.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().m(z2);
    }

    public void setOnFlingListener(s sVar) {
        this.j0 = sVar;
    }

    @Deprecated
    public void setOnScrollListener(u uVar) {
        this.t0 = uVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.o0 = z2;
    }

    public void setRecycledViewPool(v vVar) {
        this.l.E(vVar);
    }

    @Deprecated
    public void setRecyclerListener(x xVar) {
        this.x = xVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.b0) {
            return;
        }
        this.b0 = i2;
        if (i2 != 2) {
            v1();
        }
        H(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 == 0) {
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else if (i2 != 1) {
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        } else {
            scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        }
        this.i0 = scaledTouchSlop;
    }

    public void setViewCacheExtension(c0 c0Var) {
        this.l.F(c0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().o(i2);
    }

    @Override // android.view.View, a.g.l.k
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.I) {
            o("Do not suppressLayout in layout or scroll");
            if (z2) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
                this.I = true;
                this.J = true;
                u1();
                return;
            }
            this.I = false;
            if (this.H && this.w != null && this.v != null) {
                requestLayout();
            }
            this.H = false;
        }
    }

    void t(int i2, int i3) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            zIsFinished = false;
        } else {
            this.T.onRelease();
            zIsFinished = this.T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.U.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        if (zIsFinished) {
            a.g.l.v.f0(this);
        }
    }

    public boolean t0() {
        return this.Q > 0;
    }

    public void t1(int i2) {
        getScrollingChildHelper().r(i2);
    }

    void u() {
        if (!this.F || this.O) {
            a.g.h.c.a("RV FullInvalidate");
            B();
            a.g.h.c.b();
            return;
        }
        if (this.n.p()) {
            if (this.n.o(4) && !this.n.o(11)) {
                a.g.h.c.a("RV PartialInvalidate");
                q1();
                G0();
                this.n.t();
                if (!this.H) {
                    if (m0()) {
                        B();
                    } else {
                        this.n.i();
                    }
                }
                s1(true);
                H0();
            } else {
                if (!this.n.p()) {
                    return;
                }
                a.g.h.c.a("RV FullInvalidate");
                B();
            }
            a.g.h.c.b();
        }
    }

    public void u1() {
        setScrollState(0);
        v1();
    }

    void v0(int i2) {
        if (this.w == null) {
            return;
        }
        setScrollState(2);
        this.w.x1(i2);
        awakenScrollBars();
    }

    void w(int i2, int i3) {
        setMeasuredDimension(p.n(i2, getPaddingLeft() + getPaddingRight(), a.g.l.v.E(this)), p.n(i3, getPaddingTop() + getPaddingBottom(), a.g.l.v.D(this)));
    }

    void w0() {
        int iJ = this.o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            ((q) this.o.i(i2).getLayoutParams()).f2214c = true;
        }
        this.l.s();
    }

    void w1(int i2, int i3, Object obj) {
        int i4;
        int iJ = this.o.j();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < iJ; i6++) {
            View viewI = this.o.i(i6);
            e0 e0VarF0 = f0(viewI);
            if (e0VarF0 != null && !e0VarF0.J() && (i4 = e0VarF0.f2177d) >= i2 && i4 < i5) {
                e0VarF0.b(2);
                e0VarF0.a(obj);
                ((q) viewI.getLayoutParams()).f2214c = true;
            }
        }
        this.l.M(i2, i3);
    }

    void x0() {
        int iJ = this.o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            e0 e0VarF0 = f0(this.o.i(i2));
            if (e0VarF0 != null && !e0VarF0.J()) {
                e0VarF0.b(6);
            }
        }
        w0();
        this.l.t();
    }

    void y(View view) {
        e0 e0VarF0 = f0(view);
        E0(view);
        h hVar = this.v;
        if (hVar != null && e0VarF0 != null) {
            hVar.q(e0VarF0);
        }
        List<r> list = this.N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.N.get(size).a(view);
            }
        }
    }

    void z(View view) {
        e0 e0VarF0 = f0(view);
        F0(view);
        h hVar = this.v;
        if (hVar != null && e0VarF0 != null) {
            hVar.r(e0VarF0);
        }
        List<r> list = this.N;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.N.get(size).b(view);
            }
        }
    }

    public void z0(int i2) {
        int iG = this.o.g();
        for (int i3 = 0; i3 < iG; i3++) {
            this.o.f(i3).offsetLeftAndRight(i2);
        }
    }
}
