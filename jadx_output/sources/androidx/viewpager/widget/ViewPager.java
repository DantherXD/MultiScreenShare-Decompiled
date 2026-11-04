package androidx.viewpager.widget;

import a.g.l.d0;
import a.g.l.q;
import a.g.l.v;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ViewPager extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[] f2387b = {R.attr.layout_gravity};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator<f> f2388c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Interpolator f2389d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final n f2390e = new n();
    private boolean A;
    private boolean B;
    private int C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private float I;
    private float J;
    private float K;
    private float L;
    private int M;
    private VelocityTracker N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private boolean S;
    private EdgeEffect T;
    private EdgeEffect U;
    private boolean V;
    private boolean W;
    private boolean a0;
    private int b0;
    private List<j> c0;
    private j d0;
    private j e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f2391f;
    private List<i> f0;
    private final ArrayList<f> g;
    private k g0;
    private final f h;
    private int h0;
    private final Rect i;
    private int i0;
    androidx.viewpager.widget.a j;
    private ArrayList<View> j0;
    int k;
    private final Runnable k0;
    private int l;
    private int l0;
    private Parcelable m;
    private ClassLoader n;
    private Scroller o;
    private boolean p;
    private l q;
    private int r;
    private Drawable s;
    private int t;
    private int u;
    private float v;
    private float w;
    private int x;
    private int y;
    private boolean z;

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f2396b - fVar2.f2396b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.D();
        }
    }

    class d implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f2393a = new Rect();

        d() {
        }

        @Override // a.g.l.q
        public d0 a(View view, d0 d0Var) {
            d0 d0VarA0 = v.a0(view, d0Var);
            if (d0VarA0.l()) {
                return d0VarA0;
            }
            Rect rect = this.f2393a;
            rect.left = d0VarA0.g();
            rect.top = d0VarA0.i();
            rect.right = d0VarA0.h();
            rect.bottom = d0VarA0.f();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                d0 d0VarH = v.h(ViewPager.this.getChildAt(i), d0VarA0);
                rect.left = Math.min(d0VarH.g(), rect.left);
                rect.top = Math.min(d0VarH.i(), rect.top);
                rect.right = Math.min(d0VarH.h(), rect.right);
                rect.bottom = Math.min(d0VarH.f(), rect.bottom);
            }
            return d0VarA0.m(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f2395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2396b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f2397c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f2398d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f2399e;

        f() {
        }
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2401b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f2402c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2403d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2404e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2405f;

        public g() {
            super(-1, -1);
            this.f2402c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2402c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f2387b);
            this.f2401b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    class h extends a.g.l.a {
        h() {
        }

        private boolean n() {
            androidx.viewpager.widget.a aVar = ViewPager.this.j;
            return aVar != null && aVar.d() > 1;
        }

        @Override // a.g.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(n());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.j) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.d());
            accessibilityEvent.setFromIndex(ViewPager.this.k);
            accessibilityEvent.setToIndex(ViewPager.this.k);
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            cVar.W(ViewPager.class.getName());
            cVar.n0(n());
            if (ViewPager.this.canScrollHorizontally(1)) {
                cVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                cVar.a(8192);
            }
        }

        @Override // a.g.l.a
        public boolean j(View view, int i, Bundle bundle) {
            ViewPager viewPager;
            int i2;
            if (super.j(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.k - 1;
            } else {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                viewPager = ViewPager.this;
                i2 = viewPager.k + 1;
            }
            viewPager.setCurrentItem(i2);
            return true;
        }
    }

    public interface i {
        void a(ViewPager viewPager, androidx.viewpager.widget.a aVar, androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void a(int i, float f2, int i2);

        void b(int i);

        void c(int i);
    }

    public interface k {
        void a(View view, float f2);
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.g();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.g();
        }
    }

    public static class m extends a.i.a.a {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2408d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Parcelable f2409e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ClassLoader f2410f;

        static class a implements Parcelable.ClassLoaderCreator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new m(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        m(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? m.class.getClassLoader() : classLoader;
            this.f2408d = parcel.readInt();
            this.f2409e = parcel.readParcelable(classLoader);
            this.f2410f = classLoader;
        }

        public m(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f2408d + "}";
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f2408d);
            parcel.writeParcelable(this.f2409e, i);
        }
    }

    static class n implements Comparator<View> {
        n() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z = gVar.f2400a;
            if (z != gVar2.f2400a) {
                return z ? 1 : -1;
            }
            return gVar.f2404e - gVar2.f2404e;
        }
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new ArrayList<>();
        this.h = new f();
        this.i = new Rect();
        this.l = -1;
        this.m = null;
        this.n = null;
        this.v = -3.4028235E38f;
        this.w = Float.MAX_VALUE;
        this.C = 1;
        this.M = -1;
        this.V = true;
        this.W = false;
        this.k0 = new c();
        this.l0 = 0;
        u();
    }

    private boolean B(int i2) {
        if (this.g.size() == 0) {
            if (this.V) {
                return false;
            }
            this.a0 = false;
            x(0, 0.0f, 0);
            if (this.a0) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarS = s();
        int clientWidth = getClientWidth();
        int i3 = this.r;
        int i4 = clientWidth + i3;
        float f2 = clientWidth;
        int i5 = fVarS.f2396b;
        float f3 = ((i2 / f2) - fVarS.f2399e) / (fVarS.f2398d + (i3 / f2));
        this.a0 = false;
        x(i5, f3, (int) (i4 * f3));
        if (this.a0) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean C(float f2) {
        boolean z;
        boolean z2;
        float f3 = this.I - f2;
        this.I = f2;
        float scrollX = getScrollX() + f3;
        float clientWidth = getClientWidth();
        float f4 = this.v * clientWidth;
        float f5 = this.w * clientWidth;
        boolean z3 = false;
        f fVar = this.g.get(0);
        ArrayList<f> arrayList = this.g;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f2396b != 0) {
            f4 = fVar.f2399e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f2396b != this.j.d() - 1) {
            f5 = fVar2.f2399e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f4) {
            if (z) {
                this.T.onPull(Math.abs(f4 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        } else if (scrollX > f5) {
            if (z2) {
                this.U.onPull(Math.abs(scrollX - f5) / clientWidth);
                z3 = true;
            }
            scrollX = f5;
        }
        int i2 = (int) scrollX;
        this.I += scrollX - i2;
        scrollTo(i2, getScrollY());
        B(i2);
        return z3;
    }

    private void F(int i2, int i3, int i4, int i5) {
        int iMin;
        if (i3 <= 0 || this.g.isEmpty()) {
            f fVarT = t(this.k);
            iMin = (int) ((fVarT != null ? Math.min(fVarT.f2399e, this.w) : 0.0f) * ((i2 - getPaddingLeft()) - getPaddingRight()));
            if (iMin == getScrollX()) {
                return;
            } else {
                f(false);
            }
        } else if (!this.o.isFinished()) {
            this.o.setFinalX(getCurrentItem() * getClientWidth());
            return;
        } else {
            iMin = (int) ((getScrollX() / (((i3 - getPaddingLeft()) - getPaddingRight()) + i5)) * (((i2 - getPaddingLeft()) - getPaddingRight()) + i4));
        }
        scrollTo(iMin, getScrollY());
    }

    private void G() {
        int i2 = 0;
        while (i2 < getChildCount()) {
            if (!((g) getChildAt(i2).getLayoutParams()).f2400a) {
                removeViewAt(i2);
                i2--;
            }
            i2++;
        }
    }

    private void H(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean I() {
        this.M = -1;
        n();
        this.T.onRelease();
        this.U.onRelease();
        return this.T.isFinished() || this.U.isFinished();
    }

    private void J(int i2, boolean z, int i3, boolean z2) {
        f fVarT = t(i2);
        int clientWidth = fVarT != null ? (int) (getClientWidth() * Math.max(this.v, Math.min(fVarT.f2399e, this.w))) : 0;
        if (z) {
            P(clientWidth, 0, i3);
            if (z2) {
                j(i2);
                return;
            }
            return;
        }
        if (z2) {
            j(i2);
        }
        f(false);
        scrollTo(clientWidth, 0);
        B(clientWidth);
    }

    private void Q() {
        if (this.i0 != 0) {
            ArrayList<View> arrayList = this.j0;
            if (arrayList == null) {
                this.j0 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                this.j0.add(getChildAt(i2));
            }
            Collections.sort(this.j0, f2390e);
        }
    }

    private void d(f fVar, int i2, f fVar2) {
        int i3;
        int i4;
        f fVar3;
        f fVar4;
        int iD = this.j.d();
        int clientWidth = getClientWidth();
        float f2 = clientWidth > 0 ? this.r / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i5 = fVar2.f2396b;
            int i6 = fVar.f2396b;
            if (i5 < i6) {
                float f3 = fVar2.f2399e + fVar2.f2398d + f2;
                int i7 = i5 + 1;
                int i8 = 0;
                while (i7 <= fVar.f2396b && i8 < this.g.size()) {
                    while (true) {
                        fVar4 = this.g.get(i8);
                        if (i7 <= fVar4.f2396b || i8 >= this.g.size() - 1) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                    while (i7 < fVar4.f2396b) {
                        f3 += this.j.f(i7) + f2;
                        i7++;
                    }
                    fVar4.f2399e = f3;
                    f3 += fVar4.f2398d + f2;
                    i7++;
                }
            } else if (i5 > i6) {
                int size = this.g.size() - 1;
                float f4 = fVar2.f2399e;
                while (true) {
                    i5--;
                    if (i5 < fVar.f2396b || size < 0) {
                        break;
                    }
                    while (true) {
                        fVar3 = this.g.get(size);
                        if (i5 >= fVar3.f2396b || size <= 0) {
                            break;
                        } else {
                            size--;
                        }
                    }
                    while (i5 > fVar3.f2396b) {
                        f4 -= this.j.f(i5) + f2;
                        i5--;
                    }
                    f4 -= fVar3.f2398d + f2;
                    fVar3.f2399e = f4;
                }
            }
        }
        int size2 = this.g.size();
        float f5 = fVar.f2399e;
        int i9 = fVar.f2396b;
        int i10 = i9 - 1;
        this.v = i9 == 0 ? f5 : -3.4028235E38f;
        int i11 = iD - 1;
        this.w = i9 == i11 ? (fVar.f2398d + f5) - 1.0f : Float.MAX_VALUE;
        int i12 = i2 - 1;
        while (i12 >= 0) {
            f fVar5 = this.g.get(i12);
            while (true) {
                i4 = fVar5.f2396b;
                if (i10 <= i4) {
                    break;
                }
                f5 -= this.j.f(i10) + f2;
                i10--;
            }
            f5 -= fVar5.f2398d + f2;
            fVar5.f2399e = f5;
            if (i4 == 0) {
                this.v = f5;
            }
            i12--;
            i10--;
        }
        float f6 = fVar.f2399e + fVar.f2398d + f2;
        int i13 = fVar.f2396b + 1;
        int i14 = i2 + 1;
        while (i14 < size2) {
            f fVar6 = this.g.get(i14);
            while (true) {
                i3 = fVar6.f2396b;
                if (i13 >= i3) {
                    break;
                }
                f6 += this.j.f(i13) + f2;
                i13++;
            }
            if (i3 == i11) {
                this.w = (fVar6.f2398d + f6) - 1.0f;
            }
            fVar6.f2399e = f6;
            f6 += fVar6.f2398d + f2;
            i14++;
            i13++;
        }
        this.W = false;
    }

    private void f(boolean z) {
        boolean z2 = this.l0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.o.isFinished()) {
                this.o.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.o.getCurrX();
                int currY = this.o.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        B(currX);
                    }
                }
            }
        }
        this.B = false;
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            f fVar = this.g.get(i2);
            if (fVar.f2397c) {
                fVar.f2397c = false;
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                v.g0(this, this.k0);
            } else {
                this.k0.run();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private int h(int i2, float f2, int i3, int i4) {
        if (Math.abs(i4) <= this.Q || Math.abs(i3) <= this.O) {
            i2 += (int) (f2 + (i2 >= this.k ? 0.4f : 0.6f));
        } else if (i3 <= 0) {
            i2++;
        }
        if (this.g.size() <= 0) {
            return i2;
        }
        f fVar = this.g.get(0);
        ArrayList<f> arrayList = this.g;
        return Math.max(fVar.f2396b, Math.min(i2, arrayList.get(arrayList.size() - 1).f2396b));
    }

    private void i(int i2, float f2, int i3) {
        j jVar = this.d0;
        if (jVar != null) {
            jVar.a(i2, f2, i3);
        }
        List<j> list = this.c0;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                j jVar2 = this.c0.get(i4);
                if (jVar2 != null) {
                    jVar2.a(i2, f2, i3);
                }
            }
        }
        j jVar3 = this.e0;
        if (jVar3 != null) {
            jVar3.a(i2, f2, i3);
        }
    }

    private void j(int i2) {
        j jVar = this.d0;
        if (jVar != null) {
            jVar.c(i2);
        }
        List<j> list = this.c0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.c0.get(i3);
                if (jVar2 != null) {
                    jVar2.c(i2);
                }
            }
        }
        j jVar3 = this.e0;
        if (jVar3 != null) {
            jVar3.c(i2);
        }
    }

    private void k(int i2) {
        j jVar = this.d0;
        if (jVar != null) {
            jVar.b(i2);
        }
        List<j> list = this.c0;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                j jVar2 = this.c0.get(i3);
                if (jVar2 != null) {
                    jVar2.b(i2);
                }
            }
        }
        j jVar3 = this.e0;
        if (jVar3 != null) {
            jVar3.b(i2);
        }
    }

    private void m(boolean z) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).setLayerType(z ? this.h0 : 0, null);
        }
    }

    private void n() {
        this.D = false;
        this.E = false;
        VelocityTracker velocityTracker = this.N;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.N = null;
        }
    }

    private Rect p(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f s() {
        int i2;
        int clientWidth = getClientWidth();
        float f2 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f3 = clientWidth > 0 ? this.r / clientWidth : 0.0f;
        f fVar = null;
        int i3 = 0;
        int i4 = -1;
        boolean z = true;
        float f4 = 0.0f;
        while (i3 < this.g.size()) {
            f fVar2 = this.g.get(i3);
            if (!z && fVar2.f2396b != (i2 = i4 + 1)) {
                fVar2 = this.h;
                fVar2.f2399e = f2 + f4 + f3;
                fVar2.f2396b = i2;
                fVar2.f2398d = this.j.f(i2);
                i3--;
            }
            f2 = fVar2.f2399e;
            float f5 = fVar2.f2398d + f2 + f3;
            if (!z && scrollX < f2) {
                return fVar;
            }
            if (scrollX < f5 || i3 == this.g.size() - 1) {
                return fVar2;
            }
            i4 = fVar2.f2396b;
            f4 = fVar2.f2398d;
            i3++;
            z = false;
            fVar = fVar2;
        }
        return fVar;
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A != z) {
            this.A = z;
        }
    }

    private static boolean v(View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean w(float f2, float f3) {
        return (f2 < ((float) this.G) && f3 > 0.0f) || (f2 > ((float) (getWidth() - this.G)) && f3 < 0.0f);
    }

    private void y(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.M) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.I = motionEvent.getX(i2);
            this.M = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.N;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    boolean A() {
        androidx.viewpager.widget.a aVar = this.j;
        if (aVar == null || this.k >= aVar.d() - 1) {
            return false;
        }
        K(this.k + 1, true);
        return true;
    }

    void D() {
        E(this.k);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00de A[PHI: r7 r10 r15
      0x00de: PHI (r7v6 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00de: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e7 A[PHI: r7 r10 r15
      0x00e7: PHI (r7v9 int) = (r7v5 int), (r7v4 int), (r7v10 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r10v12 int) = (r10v1 int), (r10v8 int), (r10v13 int) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r15v10 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:62:0x00dc, B:59:0x00ce, B:53:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    void E(int i2) {
        f fVarT;
        String hexString;
        f fVarA;
        f fVarR;
        f fVar;
        int i3 = this.k;
        if (i3 != i2) {
            fVarT = t(i3);
            this.k = i2;
        } else {
            fVarT = null;
        }
        if (this.j == null) {
            Q();
            return;
        }
        if (this.B) {
            Q();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.j.p(this);
        int i4 = this.C;
        int iMax = Math.max(0, this.k - i4);
        int iD = this.j.d();
        int iMin = Math.min(iD - 1, this.k + i4);
        if (iD != this.f2391f) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f2391f + ", found: " + iD + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.j.getClass());
        }
        int i5 = 0;
        while (true) {
            if (i5 < this.g.size()) {
                fVarA = this.g.get(i5);
                int i6 = fVarA.f2396b;
                int i7 = this.k;
                if (i6 >= i7) {
                    if (i6 != i7) {
                        break;
                    } else {
                        break;
                    }
                }
                i5++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && iD > 0) {
            fVarA = a(this.k, i5);
        }
        if (fVarA != null) {
            int i8 = i5 - 1;
            f fVar2 = i8 >= 0 ? this.g.get(i8) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVarA.f2398d) + (getPaddingLeft() / clientWidth);
            float f2 = 0.0f;
            for (int i9 = this.k - 1; i9 >= 0; i9--) {
                if (f2 < paddingLeft || i9 >= iMax) {
                    if (fVar2 == null || i9 != fVar2.f2396b) {
                        f2 += a(i9, i8 + 1).f2398d;
                        i5++;
                        if (i8 >= 0) {
                            fVar = this.g.get(i8);
                        } else {
                            fVar = null;
                        }
                    } else {
                        f2 += fVar2.f2398d;
                        i8--;
                        if (i8 >= 0) {
                            fVar = this.g.get(i8);
                        } else {
                            fVar = null;
                        }
                    }
                    fVar2 = fVar;
                } else {
                    if (fVar2 == null) {
                        break;
                    }
                    if (i9 == fVar2.f2396b && !fVar2.f2397c) {
                        this.g.remove(i8);
                        this.j.a(this, i9, fVar2.f2395a);
                        i8--;
                        i5--;
                        if (i8 >= 0) {
                            fVar = this.g.get(i8);
                        } else {
                            fVar = null;
                        }
                        fVar2 = fVar;
                    }
                }
            }
            float f3 = fVarA.f2398d;
            int i10 = i5 + 1;
            if (f3 < 2.0f) {
                f fVar3 = i10 < this.g.size() ? this.g.get(i10) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i11 = this.k;
                while (true) {
                    i11++;
                    if (i11 >= iD) {
                        break;
                    }
                    if (f3 >= paddingRight && i11 > iMin) {
                        if (fVar3 == null) {
                            break;
                        }
                        if (i11 == fVar3.f2396b && !fVar3.f2397c) {
                            this.g.remove(i10);
                            this.j.a(this, i11, fVar3.f2395a);
                            if (i10 < this.g.size()) {
                            }
                        }
                    } else if (fVar3 == null || i11 != fVar3.f2396b) {
                        f fVarA2 = a(i11, i10);
                        i10++;
                        f3 += fVarA2.f2398d;
                        fVar3 = i10 < this.g.size() ? this.g.get(i10) : null;
                    } else {
                        f3 += fVar3.f2398d;
                        i10++;
                        if (i10 < this.g.size()) {
                        }
                    }
                }
            }
            d(fVarA, i5, fVarT);
            this.j.m(this, this.k, fVarA.f2395a);
        }
        this.j.c(this);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f2405f = i12;
            if (!gVar.f2400a && gVar.f2402c == 0.0f && (fVarR = r(childAt)) != null) {
                gVar.f2402c = fVarR.f2398d;
                gVar.f2404e = fVarR.f2396b;
            }
        }
        Q();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            f fVarQ = viewFindFocus != null ? q(viewFindFocus) : null;
            if (fVarQ == null || fVarQ.f2396b != this.k) {
                for (int i13 = 0; i13 < getChildCount(); i13++) {
                    View childAt2 = getChildAt(i13);
                    f fVarR2 = r(childAt2);
                    if (fVarR2 != null && fVarR2.f2396b == this.k && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void K(int i2, boolean z) {
        this.B = false;
        L(i2, z, false);
    }

    void L(int i2, boolean z, boolean z2) {
        M(i2, z, z2, 0);
    }

    void M(int i2, boolean z, boolean z2, int i3) {
        androidx.viewpager.widget.a aVar = this.j;
        if (aVar == null || aVar.d() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z2 && this.k == i2 && this.g.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i2 < 0) {
            i2 = 0;
        } else if (i2 >= this.j.d()) {
            i2 = this.j.d() - 1;
        }
        int i4 = this.C;
        int i5 = this.k;
        if (i2 > i5 + i4 || i2 < i5 - i4) {
            for (int i6 = 0; i6 < this.g.size(); i6++) {
                this.g.get(i6).f2397c = true;
            }
        }
        boolean z3 = this.k != i2;
        if (!this.V) {
            E(i2);
            J(i2, z, i3, z3);
        } else {
            this.k = i2;
            if (z3) {
                j(i2);
            }
            requestLayout();
        }
    }

    public void N(boolean z, k kVar) {
        O(z, kVar, 2);
    }

    public void O(boolean z, k kVar, int i2) {
        boolean z2 = kVar != null;
        boolean z3 = z2 != (this.g0 != null);
        this.g0 = kVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            this.i0 = z ? 2 : 1;
            this.h0 = i2;
        } else {
            this.i0 = 0;
        }
        if (z3) {
            D();
        }
    }

    void P(int i2, int i3, int i4) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.o;
        if ((scroller == null || scroller.isFinished()) ? false : true) {
            scrollX = this.p ? this.o.getCurrX() : this.o.getStartX();
            this.o.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i5 = scrollX;
        int scrollY = getScrollY();
        int i6 = i2 - i5;
        int i7 = i3 - scrollY;
        if (i6 == 0 && i7 == 0) {
            f(false);
            D();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i8 = clientWidth / 2;
        float f2 = clientWidth;
        float f3 = i8;
        float fL = f3 + (l(Math.min(1.0f, (Math.abs(i6) * 1.0f) / f2)) * f3);
        int iAbs2 = Math.abs(i4);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fL / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i6) / ((f2 * this.j.f(this.k)) + this.r)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.p = false;
        this.o.startScroll(i5, scrollY, i6, i7, iMin);
        v.f0(this);
    }

    f a(int i2, int i3) {
        f fVar = new f();
        fVar.f2396b = i2;
        fVar.f2395a = this.j.g(this, i2);
        fVar.f2398d = this.j.f(i2);
        if (i3 < 0 || i3 >= this.g.size()) {
            this.g.add(fVar);
        } else {
            this.g.add(i3, fVar);
        }
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        f fVarR;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f2396b == this.k) {
                    childAt.addFocusables(arrayList, i2, i3);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i3 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarR;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f2396b == this.k) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zV = gVar.f2400a | v(view);
        gVar.f2400a = zV;
        if (!this.z) {
            super.addView(view, i2, layoutParams);
        } else {
            if (zV) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f2403d = true;
            addViewInLayout(view, i2, layoutParams);
        }
    }

    public void b(j jVar) {
        if (this.c0 == null) {
            this.c0 = new ArrayList();
        }
        this.c0.add(jVar);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0094  */
    public boolean c(int i2) {
        boolean z;
        boolean zA;
        View viewFindFocus = findFocus();
        boolean z2 = false;
        if (viewFindFocus == this) {
            viewFindFocus = null;
        } else if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    z = false;
                    break;
                }
                if (parent == this) {
                    z = true;
                    break;
                }
                parent = parent.getParent();
            }
            if (!z) {
                StringBuilder sb = new StringBuilder();
                sb.append(viewFindFocus.getClass().getSimpleName());
                for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                    sb.append(" => ");
                    sb.append(parent2.getClass().getSimpleName());
                }
                Log.e("ViewPager", "arrowScroll tried to find focus based on non-child current focused view " + sb.toString());
                viewFindFocus = null;
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i2 == 17 || i2 == 1) {
                z2 = z();
            } else if (i2 == 66 || i2 == 2) {
                z2 = A();
            }
        } else if (i2 == 17) {
            int i3 = p(this.i, viewFindNextFocus).left;
            int i4 = p(this.i, viewFindFocus).left;
            if (viewFindFocus == null || i3 < i4) {
                zA = viewFindNextFocus.requestFocus();
            } else {
                zA = z();
            }
            z2 = zA;
        } else if (i2 == 66) {
            int i5 = p(this.i, viewFindNextFocus).left;
            int i6 = p(this.i, viewFindFocus).left;
            if (viewFindFocus == null || i5 > i6) {
                zA = viewFindNextFocus.requestFocus();
            } else {
                zA = A();
            }
            z2 = zA;
        }
        if (z2) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i2));
        }
        return z2;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i2) {
        if (this.j == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i2 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.v));
        }
        return i2 > 0 && scrollX < ((int) (((float) clientWidth) * this.w));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.p = true;
        if (this.o.isFinished() || !this.o.computeScrollOffset()) {
            f(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.o.getCurrX();
        int currY = this.o.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!B(currX)) {
                this.o.abortAnimation();
                scrollTo(0, currY);
            }
        }
        v.f0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || o(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarR;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f2396b == this.k && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.j) != null && aVar.d() > 1)) {
            if (!this.T.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.v * width);
                this.T.setSize(height, width);
                zDraw = false | this.T.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.U.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.w + 1.0f)) * width2);
                this.U.setSize(height2, width2);
                zDraw |= this.U.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.T.finish();
            this.U.finish();
        }
        if (zDraw) {
            v.f0(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    protected boolean e(View view, boolean z, int i2, int i3, int i4) {
        int i5;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i6 = i3 + scrollX;
                if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && (i5 = i4 + scrollY) >= childAt.getTop() && i5 < childAt.getBottom() && e(childAt, true, i2, i6 - childAt.getLeft(), i5 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z && view.canScrollHorizontally(-i2);
    }

    void g() {
        int iD = this.j.d();
        this.f2391f = iD;
        boolean z = this.g.size() < (this.C * 2) + 1 && this.g.size() < iD;
        int iMax = this.k;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.g.size()) {
            f fVar = this.g.get(i2);
            int iE = this.j.e(fVar.f2395a);
            if (iE != -1) {
                if (iE == -2) {
                    this.g.remove(i2);
                    i2--;
                    if (!z2) {
                        this.j.p(this);
                        z2 = true;
                    }
                    this.j.a(this, fVar.f2396b, fVar.f2395a);
                    int i3 = this.k;
                    if (i3 == fVar.f2396b) {
                        iMax = Math.max(0, Math.min(i3, iD - 1));
                    }
                } else {
                    int i4 = fVar.f2396b;
                    if (i4 != iE) {
                        if (i4 == this.k) {
                            iMax = iE;
                        }
                        fVar.f2396b = iE;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.j.c(this);
        }
        Collections.sort(this.g, f2388c);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                g gVar = (g) getChildAt(i5).getLayoutParams();
                if (!gVar.f2400a) {
                    gVar.f2402c = 0.0f;
                }
            }
            L(iMax, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public androidx.viewpager.widget.a getAdapter() {
        return this.j;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        if (this.i0 == 2) {
            i3 = (i2 - 1) - i3;
        }
        return ((g) this.j0.get(i3).getLayoutParams()).f2405f;
    }

    public int getCurrentItem() {
        return this.k;
    }

    public int getOffscreenPageLimit() {
        return this.C;
    }

    public int getPageMargin() {
        return this.r;
    }

    float l(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    public boolean o(KeyEvent keyEvent) {
        int i2;
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return c(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return c(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return A();
                    }
                    i2 = 66;
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return z();
                }
                i2 = 17;
            }
            return c(i2);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.k0);
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            this.o.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i2;
        float f2;
        super.onDraw(canvas);
        if (this.r <= 0 || this.s == null || this.g.size() <= 0 || this.j == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f3 = width;
        float f4 = this.r / f3;
        int i3 = 0;
        f fVar = this.g.get(0);
        float f5 = fVar.f2399e;
        int size = this.g.size();
        int i4 = fVar.f2396b;
        int i5 = this.g.get(size - 1).f2396b;
        while (i4 < i5) {
            while (true) {
                i2 = fVar.f2396b;
                if (i4 <= i2 || i3 >= size) {
                    break;
                }
                i3++;
                fVar = this.g.get(i3);
            }
            if (i4 == i2) {
                float f6 = fVar.f2399e;
                float f7 = fVar.f2398d;
                f2 = (f6 + f7) * f3;
                f5 = f6 + f7 + f4;
            } else {
                float f8 = this.j.f(i4);
                f2 = (f5 + f8) * f3;
                f5 += f8 + f4;
            }
            if (this.r + f2 > scrollX) {
                this.s.setBounds(Math.round(f2), this.t, Math.round(this.r + f2), this.u);
                this.s.draw(canvas);
            }
            if (f2 > scrollX + width) {
                return;
            }
            i4++;
            f4 = f4;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            I();
            return false;
        }
        if (action != 0) {
            if (this.D) {
                return true;
            }
            if (this.E) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.K = x;
            this.I = x;
            float y = motionEvent.getY();
            this.L = y;
            this.J = y;
            this.M = motionEvent.getPointerId(0);
            this.E = false;
            this.p = true;
            this.o.computeScrollOffset();
            if (this.l0 != 2 || Math.abs(this.o.getFinalX() - this.o.getCurrX()) <= this.R) {
                f(false);
                this.D = false;
            } else {
                this.o.abortAnimation();
                this.B = false;
                D();
                this.D = true;
                H(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i2 = this.M;
            if (i2 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                float x2 = motionEvent.getX(iFindPointerIndex);
                float f2 = x2 - this.I;
                float fAbs = Math.abs(f2);
                float y2 = motionEvent.getY(iFindPointerIndex);
                float fAbs2 = Math.abs(y2 - this.L);
                if (f2 != 0.0f && !w(this.I, f2) && e(this, false, (int) f2, (int) x2, (int) y2)) {
                    this.I = x2;
                    this.J = y2;
                    this.E = true;
                    return false;
                }
                int i3 = this.H;
                if (fAbs > i3 && fAbs * 0.5f > fAbs2) {
                    this.D = true;
                    H(true);
                    setScrollState(1);
                    float f3 = this.K;
                    float f4 = this.H;
                    this.I = f2 > 0.0f ? f3 + f4 : f3 - f4;
                    this.J = y2;
                    setScrollingCacheEnabled(true);
                } else if (fAbs2 > i3) {
                    this.E = true;
                }
                if (this.D && C(x2)) {
                    v.f0(this);
                }
            }
        } else if (action == 6) {
            y(motionEvent);
        }
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent);
        return this.D;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0071  */
    /* JADX WARN: Code duplicated, block: B:24:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:29:0x008e  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        boolean z2;
        f fVarR;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f2400a) {
                    int i10 = gVar.f2401b;
                    int i11 = i10 & 7;
                    int i12 = i10 & 112;
                    if (i11 != 1) {
                        if (i11 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i11 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i6 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i12 != 16) {
                            if (i12 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i12 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i13 = paddingLeft + scrollX;
                            childAt.layout(i13, paddingTop, childAt.getMeasuredWidth() + i13, paddingTop + childAt.getMeasuredHeight());
                            i8++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i14 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i14;
                        int i15 = paddingLeft + scrollX;
                        childAt.layout(i15, paddingTop, childAt.getMeasuredWidth() + i15, paddingTop + childAt.getMeasuredHeight());
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i6 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i16 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i16;
                    if (i12 != 16) {
                        if (i12 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i12 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i7 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i17 = paddingLeft + scrollX;
                        childAt.layout(i17, paddingTop, childAt.getMeasuredWidth() + i17, paddingTop + childAt.getMeasuredHeight());
                        i8++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i7 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i18 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i18;
                    int i19 = paddingLeft + scrollX;
                    childAt.layout(i19, paddingTop, childAt.getMeasuredWidth() + i19, paddingTop + childAt.getMeasuredHeight());
                    i8++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i20 = (i6 - paddingLeft) - paddingRight;
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f2400a && (fVarR = r(childAt2)) != null) {
                    float f2 = i20;
                    int i22 = ((int) (fVarR.f2399e * f2)) + paddingLeft;
                    if (gVar2.f2403d) {
                        gVar2.f2403d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f2 * gVar2.f2402c), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i22, paddingTop, childAt2.getMeasuredWidth() + i22, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.t = paddingTop;
        this.u = i7 - paddingBottom;
        this.b0 = i8;
        if (this.V) {
            z2 = false;
            J(this.k, false, 0, false);
        } else {
            z2 = false;
        }
        this.V = z2;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        g gVar;
        g gVar2;
        int i4;
        setMeasuredDimension(ViewGroup.getDefaultSize(0, i2), ViewGroup.getDefaultSize(0, i3));
        int measuredWidth = getMeasuredWidth();
        this.G = Math.min(measuredWidth / 10, this.F);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i5 = 0;
        while (true) {
            boolean z = true;
            int i6 = 1073741824;
            if (i5 >= childCount) {
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f2400a) {
                int i7 = gVar2.f2401b;
                int i8 = i7 & 7;
                int i9 = i7 & 112;
                boolean z2 = i9 == 48 || i9 == 80;
                if (i8 != 3 && i8 != 5) {
                    z = false;
                }
                int i10 = Integer.MIN_VALUE;
                if (z2) {
                    i4 = Integer.MIN_VALUE;
                    i10 = 1073741824;
                } else {
                    i4 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i11 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i11 != -2) {
                    if (i11 == -1) {
                        i11 = paddingLeft;
                    }
                    i10 = 1073741824;
                } else {
                    i11 = paddingLeft;
                }
                int i12 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i12 == -2) {
                    i12 = measuredHeight;
                    i6 = i4;
                } else if (i12 == -1) {
                    i12 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11, i10), View.MeasureSpec.makeMeasureSpec(i12, i6));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i5++;
        }
        this.x = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.y = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.z = true;
        D();
        this.z = false;
        int childCount2 = getChildCount();
        for (int i13 = 0; i13 < childCount2; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f2400a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f2402c), 1073741824), this.y);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        int i3;
        int i4;
        f fVarR;
        int childCount = getChildCount();
        int i5 = -1;
        if ((i2 & 2) != 0) {
            i5 = childCount;
            i3 = 0;
            i4 = 1;
        } else {
            i3 = childCount - 1;
            i4 = -1;
        }
        while (i3 != i5) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (fVarR = r(childAt)) != null && fVarR.f2396b == this.k && childAt.requestFocus(i2, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        m mVar = (m) parcelable;
        super.onRestoreInstanceState(mVar.j());
        androidx.viewpager.widget.a aVar = this.j;
        if (aVar != null) {
            aVar.j(mVar.f2409e, mVar.f2410f);
            L(mVar.f2408d, false, true);
        } else {
            this.l = mVar.f2408d;
            this.m = mVar.f2409e;
            this.n = mVar.f2410f;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        m mVar = new m(super.onSaveInstanceState());
        mVar.f2408d = this.k;
        androidx.viewpager.widget.a aVar = this.j;
        if (aVar != null) {
            mVar.f2409e = aVar.k();
        }
        return mVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4) {
            int i6 = this.r;
            F(i2, i4, i6, i6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0151  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        int pointerId;
        if (this.S) {
            return true;
        }
        boolean zI = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.j) == null || aVar.d() == 0) {
            return false;
        }
        if (this.N == null) {
            this.N = VelocityTracker.obtain();
        }
        this.N.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (!this.D) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(this.M);
                        if (iFindPointerIndex == -1) {
                            zI = I();
                        } else {
                            float x = motionEvent.getX(iFindPointerIndex);
                            float fAbs = Math.abs(x - this.I);
                            float y = motionEvent.getY(iFindPointerIndex);
                            float fAbs2 = Math.abs(y - this.J);
                            if (fAbs > this.H && fAbs > fAbs2) {
                                this.D = true;
                                H(true);
                                float f2 = this.K;
                                this.I = x - f2 > 0.0f ? f2 + this.H : f2 - this.H;
                                this.J = y;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.D) {
                        zI = false | C(motionEvent.getX(motionEvent.findPointerIndex(this.M)));
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.I = motionEvent.getX(actionIndex);
                        pointerId = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        y(motionEvent);
                        this.I = motionEvent.getX(motionEvent.findPointerIndex(this.M));
                    }
                } else if (this.D) {
                    J(this.k, true, 0, false);
                    zI = I();
                }
            } else if (this.D) {
                VelocityTracker velocityTracker = this.N;
                velocityTracker.computeCurrentVelocity(1000, this.P);
                int xVelocity = (int) velocityTracker.getXVelocity(this.M);
                this.B = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                f fVarS = s();
                float f3 = clientWidth;
                M(h(fVarS.f2396b, ((scrollX / f3) - fVarS.f2399e) / (fVarS.f2398d + (this.r / f3)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.M)) - this.K)), true, true, xVelocity);
                zI = I();
            }
            if (zI) {
                v.f0(this);
            }
            return true;
        }
        this.o.abortAnimation();
        this.B = false;
        D();
        float x2 = motionEvent.getX();
        this.K = x2;
        this.I = x2;
        float y2 = motionEvent.getY();
        this.L = y2;
        this.J = y2;
        pointerId = motionEvent.getPointerId(0);
        this.M = pointerId;
        if (zI) {
            v.f0(this);
        }
        return true;
    }

    f q(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return r(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    f r(View view) {
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            f fVar = this.g.get(i2);
            if (this.j.h(view, fVar.f2395a)) {
                return fVar;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.z) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.j;
        if (aVar2 != null) {
            aVar2.n(null);
            this.j.p(this);
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                f fVar = this.g.get(i2);
                this.j.a(this, fVar.f2396b, fVar.f2395a);
            }
            this.j.c(this);
            this.g.clear();
            G();
            this.k = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.j;
        this.j = aVar;
        this.f2391f = 0;
        if (aVar != null) {
            if (this.q == null) {
                this.q = new l();
            }
            this.j.n(this.q);
            this.B = false;
            boolean z = this.V;
            this.V = true;
            this.f2391f = this.j.d();
            if (this.l >= 0) {
                this.j.j(this.m, this.n);
                L(this.l, false, true);
                this.l = -1;
                this.m = null;
                this.n = null;
            } else if (z) {
                requestLayout();
            } else {
                D();
            }
        }
        List<i> list = this.f0;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.f0.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f0.get(i3).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i2) {
        this.B = false;
        L(i2, !this.V, false);
    }

    public void setOffscreenPageLimit(int i2) {
        if (i2 < 1) {
            Log.w("ViewPager", "Requested offscreen page limit " + i2 + " too small; defaulting to 1");
            i2 = 1;
        }
        if (i2 != this.C) {
            this.C = i2;
            D();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.d0 = jVar;
    }

    public void setPageMargin(int i2) {
        int i3 = this.r;
        this.r = i2;
        int width = getWidth();
        F(width, width, i2, i3);
        requestLayout();
    }

    public void setPageMarginDrawable(int i2) {
        setPageMarginDrawable(a.g.d.a.e(getContext(), i2));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i2) {
        if (this.l0 == i2) {
            return;
        }
        this.l0 = i2;
        if (this.g0 != null) {
            m(i2 != 0);
        }
        k(i2);
    }

    f t(int i2) {
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            f fVar = this.g.get(i3);
            if (fVar.f2396b == i2) {
                return fVar;
            }
        }
        return null;
    }

    void u() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.o = new Scroller(context, f2389d);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.H = viewConfiguration.getScaledPagingTouchSlop();
        this.O = (int) (400.0f * f2);
        this.P = viewConfiguration.getScaledMaximumFlingVelocity();
        this.T = new EdgeEffect(context);
        this.U = new EdgeEffect(context);
        this.Q = (int) (25.0f * f2);
        this.R = (int) (2.0f * f2);
        this.F = (int) (f2 * 16.0f);
        v.o0(this, new h());
        if (v.A(this) == 0) {
            v.x0(this, 1);
        }
        v.z0(this, new d());
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0064  */
    protected void x(int i2, float f2, int i3) {
        int iMax;
        int width;
        int left;
        if (this.b0 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f2400a) {
                    int i5 = gVar.f2401b & 7;
                    if (i5 != 1) {
                        if (i5 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i5 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i6 = iMax;
                    width = paddingLeft;
                    paddingLeft = i6;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        i(i2, f2, i3);
        if (this.g0 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i7 = 0; i7 < childCount2; i7++) {
                View childAt2 = getChildAt(i7);
                if (!((g) childAt2.getLayoutParams()).f2400a) {
                    this.g0.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.a0 = true;
    }

    boolean z() {
        int i2 = this.k;
        if (i2 <= 0) {
            return false;
        }
        K(i2 - 1, true);
        return true;
    }
}
