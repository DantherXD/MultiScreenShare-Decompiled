package com.google.android.material.bottomsheet;

import a.g.l.d0;
import a.g.l.v;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import c.b.a.b.a0.k;
import c.b.a.b.j;
import com.google.android.material.internal.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3923a = j.f2746d;
    int A;
    float B;
    int C;
    float D;
    boolean E;
    private boolean F;
    private boolean G;
    int H;
    a.i.b.c I;
    private boolean J;
    private int K;
    private boolean L;
    private int M;
    int N;
    int O;
    WeakReference<V> P;
    WeakReference<View> Q;
    private final ArrayList<g> R;
    private VelocityTracker S;
    int T;
    private int U;
    boolean V;
    private Map<View, Integer> W;
    private int X;
    private final a.i.b.c.AbstractC0029c Y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3928f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private c.b.a.b.a0.g k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private int t;
    private k u;
    private boolean v;
    private BottomSheetBehavior<V>.i w;
    private ValueAnimator x;
    int y;
    int z;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewGroup.LayoutParams f3930c;

        a(View view, ViewGroup.LayoutParams layoutParams) {
            this.f3929b = view;
            this.f3930c = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3929b.setLayoutParams(this.f3930c);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f3932b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3933c;

        b(View view, int i) {
            this.f3932b = view;
            this.f3933c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.v0(this.f3932b, this.f3933c);
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.k != null) {
                BottomSheetBehavior.this.k.X(fFloatValue);
            }
        }
    }

    class d implements l.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f3936a;

        d(boolean z) {
            this.f3936a = z;
        }

        @Override // com.google.android.material.internal.l.c
        public d0 a(View view, d0 d0Var, l.d dVar) {
            BottomSheetBehavior.this.t = d0Var.i();
            boolean zD = l.d(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.o) {
                BottomSheetBehavior.this.s = d0Var.f();
                paddingBottom = dVar.f4150d + BottomSheetBehavior.this.s;
            }
            if (BottomSheetBehavior.this.p) {
                paddingLeft = (zD ? dVar.f4149c : dVar.f4147a) + d0Var.g();
            }
            if (BottomSheetBehavior.this.q) {
                paddingRight = (zD ? dVar.f4147a : dVar.f4149c) + d0Var.h();
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f3936a) {
                BottomSheetBehavior.this.m = d0Var.e().f481e;
            }
            if (BottomSheetBehavior.this.o || this.f3936a) {
                BottomSheetBehavior.this.C0(false);
            }
            return d0Var;
        }
    }

    class e extends a.i.b.c.AbstractC0029c {
        e() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.O + bottomSheetBehavior.b0()) / 2;
        }

        @Override // a.i.b.c.AbstractC0029c
        public int a(View view, int i, int i2) {
            return view.getLeft();
        }

        @Override // a.i.b.c.AbstractC0029c
        public int b(View view, int i, int i2) {
            int iB0 = BottomSheetBehavior.this.b0();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return a.g.g.a.b(i, iB0, bottomSheetBehavior.E ? bottomSheetBehavior.O : bottomSheetBehavior.C);
        }

        @Override // a.i.b.c.AbstractC0029c
        public int e(View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.E ? bottomSheetBehavior.O : bottomSheetBehavior.C;
        }

        @Override // a.i.b.c.AbstractC0029c
        public void j(int i) {
            if (i == 1 && BottomSheetBehavior.this.G) {
                BottomSheetBehavior.this.t0(1);
            }
        }

        @Override // a.i.b.c.AbstractC0029c
        public void k(View view, int i, int i2, int i3, int i4) {
            BottomSheetBehavior.this.Z(i2);
        }

        /* JADX WARN: Code duplicated, block: B:6:0x0010  */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        
            if (java.lang.Math.abs(r7.getTop() - r6.f3938a.b0()) < java.lang.Math.abs(r7.getTop() - r6.f3938a.A)) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
        
            r8 = r6.f3938a.b0();
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00f0, code lost:
        
            if (r8 < java.lang.Math.abs(r8 - r9.C)) goto L28;
         */
        @Override // a.i.b.c.AbstractC0029c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r7, float r8, float r9) {
            /*
                Method dump skipped, instruction units count: 268
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.e.l(android.view.View, float, float):void");
        }

        @Override // a.i.b.c.AbstractC0029c
        public boolean m(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.H;
            if (i2 == 1 || bottomSheetBehavior.V) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.T == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.Q;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.P;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements a.g.l.e0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3939a;

        f(int i) {
            this.f3939a = i;
        }

        @Override // a.g.l.e0.f
        public boolean a(View view, a.g.l.e0.f.a aVar) {
            BottomSheetBehavior.this.s0(this.f3939a);
            return true;
        }
    }

    public static abstract class g {
        public abstract void a(View view, float f2);

        public abstract void b(View view, int i);
    }

    protected static class h extends a.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f3941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f3943f;
        boolean g;
        boolean h;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3941d = parcel.readInt();
            this.f3942e = parcel.readInt();
            this.f3943f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt() == 1;
        }

        public h(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f3941d = bottomSheetBehavior.H;
            this.f3942e = ((BottomSheetBehavior) bottomSheetBehavior).f3928f;
            this.f3943f = ((BottomSheetBehavior) bottomSheetBehavior).f3925c;
            this.g = bottomSheetBehavior.E;
            this.h = ((BottomSheetBehavior) bottomSheetBehavior).F;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3941d);
            parcel.writeInt(this.f3942e);
            parcel.writeInt(this.f3943f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h ? 1 : 0);
        }
    }

    private class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f3944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3945c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3946d;

        i(View view, int i) {
            this.f3944b = view;
            this.f3946d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.i.b.c cVar = BottomSheetBehavior.this.I;
            if (cVar == null || !cVar.k(true)) {
                BottomSheetBehavior.this.t0(this.f3946d);
            } else {
                v.g0(this.f3944b, this);
            }
            this.f3945c = false;
        }
    }

    public BottomSheetBehavior() {
        this.f3924b = 0;
        this.f3925c = true;
        this.f3926d = false;
        this.l = -1;
        this.w = null;
        this.B = 0.5f;
        this.D = -1.0f;
        this.G = true;
        this.H = 4;
        this.R = new ArrayList<>();
        this.X = -1;
        this.Y = new e();
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.f3924b = 0;
        this.f3925c = true;
        this.f3926d = false;
        this.l = -1;
        this.w = null;
        this.B = 0.5f;
        this.D = -1.0f;
        this.G = true;
        this.H = 4;
        this.R = new ArrayList<>();
        this.X = -1;
        this.Y = new e();
        this.i = context.getResources().getDimensionPixelSize(c.b.a.b.d.N);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.a.b.k.y);
        this.j = typedArrayObtainStyledAttributes.hasValue(c.b.a.b.k.P);
        int i3 = c.b.a.b.k.B;
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i3);
        if (zHasValue) {
            X(context, attributeSet, zHasValue, c.b.a.b.x.c.a(context, typedArrayObtainStyledAttributes, i3));
        } else {
            W(context, attributeSet, zHasValue);
        }
        Y();
        if (Build.VERSION.SDK_INT >= 21) {
            this.D = typedArrayObtainStyledAttributes.getDimension(c.b.a.b.k.A, -1.0f);
        }
        int i4 = c.b.a.b.k.z;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            n0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i4, -1));
        }
        int i5 = c.b.a.b.k.H;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i5);
        if (typedValuePeekValue == null || (i2 = typedValuePeekValue.data) != -1) {
            o0(typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, -1));
        } else {
            o0(i2);
        }
        m0(typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.G, false));
        k0(typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.K, false));
        j0(typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.E, true));
        r0(typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.J, false));
        h0(typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.C, true));
        q0(typedArrayObtainStyledAttributes.getInt(c.b.a.b.k.I, 0));
        l0(typedArrayObtainStyledAttributes.getFloat(c.b.a.b.k.F, 0.5f));
        int i6 = c.b.a.b.k.D;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i6);
        i0((typedValuePeekValue2 == null || typedValuePeekValue2.type != 16) ? typedArrayObtainStyledAttributes.getDimensionPixelOffset(i6, 0) : typedValuePeekValue2.data);
        this.o = typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.L, false);
        this.p = typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.M, false);
        this.q = typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.N, false);
        this.r = typedArrayObtainStyledAttributes.getBoolean(c.b.a.b.k.O, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f3927e = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    private void A0(int i2) {
        ValueAnimator valueAnimator;
        if (i2 == 2) {
            return;
        }
        boolean z = i2 == 3;
        if (this.v != z) {
            this.v = z;
            if (this.k == null || (valueAnimator = this.x) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.x.reverse();
                return;
            }
            float f2 = z ? 0.0f : 1.0f;
            this.x.setFloatValues(1.0f - f2, f2);
            this.x.start();
        }
    }

    private void B0(boolean z) {
        Map<View, Integer> map;
        int iIntValue;
        WeakReference<V> weakReference = this.P;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (Build.VERSION.SDK_INT >= 16 && z) {
                if (this.W != null) {
                    return;
                } else {
                    this.W = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.P.get()) {
                    if (z) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            this.W.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        if (this.f3926d) {
                            iIntValue = 4;
                            v.x0(childAt, iIntValue);
                        }
                    } else if (this.f3926d && (map = this.W) != null && map.containsKey(childAt)) {
                        iIntValue = this.W.get(childAt).intValue();
                        v.x0(childAt, iIntValue);
                    }
                }
            }
            if (!z) {
                this.W = null;
            } else if (this.f3926d) {
                this.P.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0(boolean z) {
        V v;
        if (this.P != null) {
            S();
            if (this.H != 4 || (v = this.P.get()) == null) {
                return;
            }
            if (z) {
                w0(this.H);
            } else {
                v.requestLayout();
            }
        }
    }

    private int R(V v, int i2, int i3) {
        return v.b(v, v.getResources().getString(i2), V(i3));
    }

    private void S() {
        int iU = U();
        if (this.f3925c) {
            this.C = Math.max(this.O - iU, this.z);
        } else {
            this.C = this.O - iU;
        }
    }

    private void T() {
        this.A = (int) (this.O * (1.0f - this.B));
    }

    private int U() {
        int iMin;
        int i2;
        if (this.g) {
            iMin = Math.min(Math.max(this.h, this.O - ((this.N * 9) / 16)), this.M);
        } else {
            if (!this.n && !this.o && (i2 = this.m) > 0) {
                return Math.max(this.f3928f, i2 + this.i);
            }
            iMin = this.f3928f;
        }
        return iMin + this.s;
    }

    private a.g.l.e0.f V(int i2) {
        return new f(i2);
    }

    private void W(Context context, AttributeSet attributeSet, boolean z) {
        X(context, attributeSet, z, null);
    }

    private void X(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.j) {
            this.u = k.e(context, attributeSet, c.b.a.b.b.f2699b, f3923a).m();
            c.b.a.b.a0.g gVar = new c.b.a.b.a0.g(this.u);
            this.k = gVar;
            gVar.M(context);
            if (z && colorStateList != null) {
                this.k.W(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
            this.k.setTint(typedValue.data);
        }
    }

    private void Y() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.x = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.x.addUpdateListener(new c());
    }

    private float c0() {
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f3927e);
        return this.S.getYVelocity(this.T);
    }

    private void e0(V v, a.g.l.e0.c.a aVar, int i2) {
        v.k0(v, aVar, null, V(i2));
    }

    private void f0() {
        this.T = -1;
        VelocityTracker velocityTracker = this.S;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.S = null;
        }
    }

    private void g0(h hVar) {
        int i2 = this.f3924b;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f3928f = hVar.f3942e;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f3925c = hVar.f3943f;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.E = hVar.g;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.F = hVar.h;
        }
    }

    private void u0(View view) {
        boolean z = (Build.VERSION.SDK_INT < 29 || d0() || this.g) ? false : true;
        if (this.o || this.p || this.q || z) {
            l.a(view, new d(z));
        }
    }

    private void w0(int i2) {
        V v = this.P.get();
        if (v == null) {
            return;
        }
        ViewParent parent = v.getParent();
        if (parent != null && parent.isLayoutRequested() && v.S(v)) {
            v.post(new b(v, i2));
        } else {
            v0(v, i2);
        }
    }

    private void z0() {
        V v;
        int i2;
        a.g.l.e0.c.a aVar;
        WeakReference<V> weakReference = this.P;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        v.i0(v, 524288);
        v.i0(v, 262144);
        v.i0(v, 1048576);
        int i3 = this.X;
        if (i3 != -1) {
            v.i0(v, i3);
        }
        if (!this.f3925c && this.H != 6) {
            this.X = R(v, c.b.a.b.i.f2737a, 6);
        }
        if (this.E && this.H != 5) {
            e0(v, a.g.l.e0.c.a.u, 5);
        }
        int i4 = this.H;
        if (i4 == 3) {
            i2 = this.f3925c ? 4 : 6;
            aVar = a.g.l.e0.c.a.t;
        } else {
            if (i4 != 4) {
                if (i4 != 6) {
                    return;
                }
                e0(v, a.g.l.e0.c.a.t, 4);
                e0(v, a.g.l.e0.c.a.s, 3);
                return;
            }
            i2 = this.f3925c ? 3 : 6;
            aVar = a.g.l.e0.c.a.s;
        }
        e0(v, aVar, i2);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean A(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i2, int i3) {
        this.K = 0;
        this.L = false;
        return (i2 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0029  */
    /* JADX WARN: Code duplicated, block: B:21:0x0038  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void C(CoordinatorLayout coordinatorLayout, V v, View view, int i2) {
        int iB0;
        int i3 = 3;
        if (v.getTop() == b0()) {
            t0(3);
            return;
        }
        WeakReference<View> weakReference = this.Q;
        if (weakReference != null && view == weakReference.get() && this.L) {
            if (this.K > 0) {
                if (this.f3925c) {
                    iB0 = this.z;
                } else {
                    int top = v.getTop();
                    int i4 = this.A;
                    if (top > i4) {
                        iB0 = i4;
                        i3 = 6;
                    } else {
                        iB0 = b0();
                    }
                }
            } else if (this.E && x0(v, c0())) {
                iB0 = this.O;
                i3 = 5;
            } else if (this.K == 0) {
                int top2 = v.getTop();
                if (!this.f3925c) {
                    int i5 = this.A;
                    if (top2 < i5) {
                        if (top2 < Math.abs(top2 - this.C)) {
                            iB0 = b0();
                        }
                    } else if (Math.abs(top2 - i5) < Math.abs(top2 - this.C)) {
                    }
                    iB0 = this.A;
                    i3 = 6;
                } else if (Math.abs(top2 - this.z) < Math.abs(top2 - this.C)) {
                    iB0 = this.z;
                }
                iB0 = this.C;
                i3 = 4;
            } else {
                if (!this.f3925c) {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.A) < Math.abs(top3 - this.C)) {
                        iB0 = this.A;
                        i3 = 6;
                    }
                }
                iB0 = this.C;
                i3 = 4;
            }
            y0(v, i3, iB0, false);
            this.L = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.H == 1 && actionMasked == 0) {
            return true;
        }
        a.i.b.c cVar = this.I;
        if (cVar != null) {
            cVar.z(motionEvent);
        }
        if (actionMasked == 0) {
            f0();
        }
        if (this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent);
        if (this.I != null && actionMasked == 2 && !this.J && Math.abs(this.U - motionEvent.getY()) > this.I.u()) {
            this.I.b(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.J;
    }

    void Z(int i2) {
        float f2;
        float fB0;
        V v = this.P.get();
        if (v == null || this.R.isEmpty()) {
            return;
        }
        int i3 = this.C;
        if (i2 > i3 || i3 == b0()) {
            int i4 = this.C;
            f2 = i4 - i2;
            fB0 = this.O - i4;
        } else {
            int i5 = this.C;
            f2 = i5 - i2;
            fB0 = i5 - b0();
        }
        float f3 = f2 / fB0;
        for (int i6 = 0; i6 < this.R.size(); i6++) {
            this.R.get(i6).a(v, f3);
        }
    }

    View a0(View view) {
        if (v.U(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View viewA0 = a0(viewGroup.getChildAt(i2));
            if (viewA0 != null) {
                return viewA0;
            }
        }
        return null;
    }

    public int b0() {
        if (this.f3925c) {
            return this.z;
        }
        return Math.max(this.y, this.r ? 0 : this.t);
    }

    public boolean d0() {
        return this.n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        super.g(fVar);
        this.P = null;
        this.I = null;
    }

    public void h0(boolean z) {
        this.G = z;
    }

    public void i0(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.y = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void j() {
        super.j();
        this.P = null;
        this.I = null;
    }

    public void j0(boolean z) {
        if (this.f3925c == z) {
            return;
        }
        this.f3925c = z;
        if (this.P != null) {
            S();
        }
        t0((this.f3925c && this.H == 6) ? 3 : this.H);
        z0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.i.b.c cVar;
        if (!v.isShown() || !this.G) {
            this.J = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            f0();
        }
        if (this.S == null) {
            this.S = VelocityTracker.obtain();
        }
        this.S.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.U = (int) motionEvent.getY();
            if (this.H != 2) {
                WeakReference<View> weakReference = this.Q;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.B(view, x, this.U)) {
                    this.T = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.V = true;
                }
            }
            this.J = this.T == -1 && !coordinatorLayout.B(v, x, this.U);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.V = false;
            this.T = -1;
            if (this.J) {
                this.J = false;
                return false;
            }
        }
        if (!this.J && (cVar = this.I) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.Q;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.J || this.H == 1 || coordinatorLayout.B(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.I == null || Math.abs(((float) this.U) - motionEvent.getY()) <= ((float) this.I.u())) ? false : true;
    }

    public void k0(boolean z) {
        this.n = z;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i2) {
        int iB0;
        c.b.a.b.a0.g gVar;
        if (v.z(coordinatorLayout) && !v.z(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.P == null) {
            this.h = coordinatorLayout.getResources().getDimensionPixelSize(c.b.a.b.d.f2712b);
            u0(v);
            this.P = new WeakReference<>(v);
            if (this.j && (gVar = this.k) != null) {
                v.r0(v, gVar);
            }
            c.b.a.b.a0.g gVar2 = this.k;
            if (gVar2 != null) {
                float fW = this.D;
                if (fW == -1.0f) {
                    fW = v.w(v);
                }
                gVar2.V(fW);
                boolean z = this.H == 3;
                this.v = z;
                this.k.X(z ? 0.0f : 1.0f);
            }
            z0();
            if (v.A(v) == 0) {
                v.x0(v, 1);
            }
            int measuredWidth = v.getMeasuredWidth();
            int i3 = this.l;
            if (measuredWidth > i3 && i3 != -1) {
                ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
                layoutParams.width = this.l;
                v.post(new a(v, layoutParams));
            }
        }
        if (this.I == null) {
            this.I = a.i.b.c.m(coordinatorLayout, this.Y);
        }
        int top = v.getTop();
        coordinatorLayout.I(v, i2);
        this.N = coordinatorLayout.getWidth();
        this.O = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.M = height;
        int i4 = this.O;
        int i5 = i4 - height;
        int i6 = this.t;
        if (i5 < i6) {
            if (this.r) {
                this.M = i4;
            } else {
                this.M = i4 - i6;
            }
        }
        this.z = Math.max(0, i4 - this.M);
        T();
        S();
        int i7 = this.H;
        if (i7 == 3) {
            iB0 = b0();
        } else if (i7 == 6) {
            iB0 = this.A;
        } else {
            if (!this.E || i7 != 5) {
                if (i7 == 4) {
                    iB0 = this.C;
                } else if (i7 == 1 || i7 == 2) {
                    v.Z(v, top - v.getTop());
                }
                this.Q = new WeakReference<>(a0(v));
                return true;
            }
            iB0 = this.O;
        }
        v.Z(v, iB0);
        this.Q = new WeakReference<>(a0(v));
        return true;
    }

    public void l0(float f2) {
        if (f2 <= 0.0f || f2 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.B = f2;
        if (this.P != null) {
            T();
        }
    }

    public void m0(boolean z) {
        if (this.E != z) {
            this.E = z;
            if (!z && this.H == 5) {
                s0(4);
            }
            z0();
        }
    }

    public void n0(int i2) {
        this.l = i2;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean o(CoordinatorLayout coordinatorLayout, V v, View view, float f2, float f3) {
        WeakReference<View> weakReference = this.Q;
        if (weakReference == null || view != weakReference.get()) {
            return false;
        }
        return this.H != 3 || super.o(coordinatorLayout, v, view, f2, f3);
    }

    public void o0(int i2) {
        p0(i2, false);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    public final void p0(int i2, boolean z) {
        boolean z2 = true;
        if (i2 == -1) {
            if (this.g) {
                z2 = false;
            } else {
                this.g = true;
            }
        } else if (this.g || this.f3928f != i2) {
            this.g = false;
            this.f3928f = Math.max(0, i2);
        } else {
            z2 = false;
        }
        if (z2) {
            C0(z);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void q(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int[] iArr, int i4) {
        int i5;
        if (i4 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.Q;
        if (view != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        int top = v.getTop();
        int i6 = top - i3;
        if (i3 > 0) {
            if (i6 < b0()) {
                iArr[1] = top - b0();
                v.Z(v, -iArr[1]);
                i5 = 3;
                t0(i5);
            } else {
                if (!this.G) {
                    return;
                }
                iArr[1] = i3;
                v.Z(v, -i3);
                t0(1);
            }
        } else if (i3 < 0 && !view.canScrollVertically(-1)) {
            int i7 = this.C;
            if (i6 > i7 && !this.E) {
                iArr[1] = top - i7;
                v.Z(v, -iArr[1]);
                i5 = 4;
                t0(i5);
            } else {
                if (!this.G) {
                    return;
                }
                iArr[1] = i3;
                v.Z(v, -i3);
                t0(1);
            }
        }
        Z(v.getTop());
        this.K = i3;
        this.L = true;
    }

    public void q0(int i2) {
        this.f3924b = i2;
    }

    public void r0(boolean z) {
        this.F = z;
    }

    public void s0(int i2) {
        if (i2 == this.H) {
            return;
        }
        if (this.P != null) {
            w0(i2);
            return;
        }
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.E && i2 == 5)) {
            this.H = i2;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void t(CoordinatorLayout coordinatorLayout, V v, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
    }

    void t0(int i2) {
        V v;
        if (this.H == i2) {
            return;
        }
        this.H = i2;
        WeakReference<V> weakReference = this.P;
        if (weakReference == null || (v = weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            B0(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            B0(false);
        }
        A0(i2);
        for (int i3 = 0; i3 < this.R.size(); i3++) {
            this.R.get(i3).b(v, i2);
        }
        z0();
    }

    void v0(View view, int i2) {
        int iB0;
        int i3;
        if (i2 == 4) {
            iB0 = this.C;
        } else if (i2 == 6) {
            int i4 = this.A;
            if (!this.f3925c || i4 > (i3 = this.z)) {
                iB0 = i4;
            } else {
                i2 = 3;
                iB0 = i3;
            }
        } else if (i2 == 3) {
            iB0 = b0();
        } else {
            if (!this.E || i2 != 5) {
                throw new IllegalArgumentException("Illegal state argument: " + i2);
            }
            iB0 = this.O;
        }
        y0(view, i2, iB0, false);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void x(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        h hVar = (h) parcelable;
        super.x(coordinatorLayout, v, hVar.j());
        g0(hVar);
        int i2 = hVar.f3941d;
        if (i2 == 1 || i2 == 2) {
            i2 = 4;
        }
        this.H = i2;
    }

    boolean x0(View view, float f2) {
        if (this.F) {
            return true;
        }
        if (view.getTop() < this.C) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f2 * 0.1f)) - ((float) this.C)) / ((float) U()) > 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public Parcelable y(CoordinatorLayout coordinatorLayout, V v) {
        return new h(super.y(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    void y0(View view, int i2, int i3, boolean z) {
        a.i.b.c cVar = this.I;
        if (!(cVar != null && (!z ? !cVar.H(view, view.getLeft(), i3) : !cVar.F(view.getLeft(), i3)))) {
            t0(i2);
            return;
        }
        t0(2);
        A0(i2);
        if (this.w == null) {
            this.w = new i(view, i2);
        }
        if (((i) this.w).f3945c) {
            this.w.f3946d = i2;
            return;
        }
        BottomSheetBehavior<V>.i iVar = this.w;
        iVar.f3946d = i2;
        v.g0(view, iVar);
        ((i) this.w).f3945c = true;
    }
}
