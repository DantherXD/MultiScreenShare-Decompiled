package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.lifecycle.LiveData;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.g, androidx.lifecycle.s, androidx.savedstate.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Object f1792b = new Object();
    String A;
    boolean B;
    boolean C;
    boolean D;
    boolean E;
    boolean F;
    private boolean H;
    ViewGroup I;
    View J;
    boolean K;
    e M;
    boolean O;
    boolean P;
    float Q;
    LayoutInflater R;
    boolean S;
    androidx.lifecycle.h U;
    a0 V;
    androidx.lifecycle.q.a X;
    androidx.savedstate.b Y;
    private int Z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Bundle f1794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SparseArray<Parcelable> f1795e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Bundle f1796f;
    Boolean g;
    Bundle i;
    Fragment j;
    int l;
    boolean n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    n u;
    k<?> v;
    Fragment x;
    int y;
    int z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f1793c = -1;
    String h = UUID.randomUUID().toString();
    String k = null;
    private Boolean m = null;
    n w = new o();
    boolean G = true;
    boolean L = true;
    Runnable N = new a();
    androidx.lifecycle.d.c T = androidx.lifecycle.d.c.RESUMED;
    androidx.lifecycle.l<androidx.lifecycle.g> W = new androidx.lifecycle.l<>();
    private final AtomicInteger a0 = new AtomicInteger();
    private final ArrayList<g> b0 = new ArrayList<>();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.B1();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.d(false);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f1800b;

        c(c0 c0Var) {
            this.f1800b = c0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1800b.g();
        }
    }

    class d extends androidx.fragment.app.g {
        d() {
        }

        @Override // androidx.fragment.app.g
        public View g(int i) {
            View view = Fragment.this.J;
            if (view != null) {
                return view.findViewById(i);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.g
        public boolean i() {
            return Fragment.this.J != null;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f1803a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Animator f1804b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f1805c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1806d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1808f;
        int g;
        int h;
        ArrayList<String> i;
        ArrayList<String> j;
        Object k = null;
        Object l;
        Object m;
        Object n;
        Object o;
        Object p;
        Boolean q;
        Boolean r;
        androidx.core.app.k s;
        androidx.core.app.k t;
        float u;
        View v;
        boolean w;
        h x;
        boolean y;

        e() {
            Object obj = Fragment.f1792b;
            this.l = obj;
            this.m = null;
            this.n = obj;
            this.o = null;
            this.p = obj;
            this.u = 1.0f;
            this.v = null;
        }
    }

    public static class f extends RuntimeException {
        public f(String str, Exception exc) {
            super(str, exc);
        }
    }

    private static abstract class g {
        private g() {
        }

        abstract void a();
    }

    interface h {
        void a();

        void b();
    }

    public Fragment() {
        U();
    }

    private int B() {
        androidx.lifecycle.d.c cVar = this.T;
        return (cVar == androidx.lifecycle.d.c.INITIALIZED || this.x == null) ? cVar.ordinal() : Math.min(cVar.ordinal(), this.x.B());
    }

    private void U() {
        this.U = new androidx.lifecycle.h(this);
        this.Y = androidx.savedstate.b.a(this);
        this.X = null;
    }

    @Deprecated
    public static Fragment W(Context context, String str, Bundle bundle) {
        try {
            Fragment fragmentNewInstance = j.d(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.t1(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new f("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new f("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e5) {
            throw new f("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e5);
        }
    }

    private e g() {
        if (this.M == null) {
            this.M = new e();
        }
        return this.M;
    }

    private void o1() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.J != null) {
            p1(this.f1794d);
        }
        this.f1794d = null;
    }

    @Deprecated
    public LayoutInflater A(Bundle bundle) {
        k<?> kVar = this.v;
        if (kVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        LayoutInflater layoutInflaterN = kVar.n();
        a.g.l.g.b(layoutInflaterN, this.w.t0());
        return layoutInflaterN;
    }

    public void A0(Menu menu) {
    }

    void A1(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        g();
        e eVar = this.M;
        eVar.i = arrayList;
        eVar.j = arrayList2;
    }

    public void B0() {
        this.H = true;
    }

    public void B1() {
        if (this.M == null || !g().w) {
            return;
        }
        if (this.v == null) {
            g().w = false;
        } else if (Looper.myLooper() != this.v.l().getLooper()) {
            this.v.l().postAtFrontOfQueue(new b());
        } else {
            d(true);
        }
    }

    int C() {
        e eVar = this.M;
        if (eVar == null) {
            return 0;
        }
        return eVar.h;
    }

    public void C0(boolean z) {
    }

    public final Fragment D() {
        return this.x;
    }

    public void D0(Menu menu) {
    }

    public final n E() {
        n nVar = this.u;
        if (nVar != null) {
            return nVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public void E0(boolean z) {
    }

    boolean F() {
        e eVar = this.M;
        if (eVar == null) {
            return false;
        }
        return eVar.f1805c;
    }

    @Deprecated
    public void F0(int i, String[] strArr, int[] iArr) {
    }

    int G() {
        e eVar = this.M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1808f;
    }

    public void G0() {
        this.H = true;
    }

    int H() {
        e eVar = this.M;
        if (eVar == null) {
            return 0;
        }
        return eVar.g;
    }

    public void H0(Bundle bundle) {
    }

    float I() {
        e eVar = this.M;
        if (eVar == null) {
            return 1.0f;
        }
        return eVar.u;
    }

    public void I0() {
        this.H = true;
    }

    public Object J() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.n;
        return obj == f1792b ? v() : obj;
    }

    public void J0() {
        this.H = true;
    }

    public final Resources K() {
        return l1().getResources();
    }

    public void K0(View view, Bundle bundle) {
    }

    public Object L() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.l;
        return obj == f1792b ? s() : obj;
    }

    public void L0(Bundle bundle) {
        this.H = true;
    }

    public Object M() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.o;
    }

    void M0(Bundle bundle) {
        this.w.P0();
        this.f1793c = 3;
        this.H = false;
        f0(bundle);
        if (this.H) {
            o1();
            this.w.y();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    public Object N() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        Object obj = eVar.p;
        return obj == f1792b ? M() : obj;
    }

    void N0() {
        Iterator<g> it = this.b0.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.b0.clear();
        this.w.j(this.v, e(), this);
        this.f1793c = 0;
        this.H = false;
        i0(this.v.k());
        if (this.H) {
            this.u.I(this);
            this.w.z();
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    ArrayList<String> O() {
        ArrayList<String> arrayList;
        e eVar = this.M;
        return (eVar == null || (arrayList = eVar.i) == null) ? new ArrayList<>() : arrayList;
    }

    void O0(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.w.A(configuration);
    }

    ArrayList<String> P() {
        ArrayList<String> arrayList;
        e eVar = this.M;
        return (eVar == null || (arrayList = eVar.j) == null) ? new ArrayList<>() : arrayList;
    }

    boolean P0(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (k0(menuItem)) {
            return true;
        }
        return this.w.B(menuItem);
    }

    public final String Q(int i) {
        return K().getString(i);
    }

    void Q0(Bundle bundle) {
        this.w.P0();
        this.f1793c = 1;
        this.H = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.U.a(new androidx.lifecycle.e() { // from class: androidx.fragment.app.Fragment.5
                @Override // androidx.lifecycle.e
                public void d(androidx.lifecycle.g gVar, androidx.lifecycle.d.b bVar) {
                    View view;
                    if (bVar != androidx.lifecycle.d.b.ON_STOP || (view = Fragment.this.J) == null) {
                        return;
                    }
                    view.cancelPendingInputEvents();
                }
            });
        }
        this.Y.c(bundle);
        l0(bundle);
        this.S = true;
        if (this.H) {
            this.U.h(androidx.lifecycle.d.b.ON_CREATE);
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onCreate()");
    }

    @Deprecated
    public final Fragment R() {
        String str;
        Fragment fragment = this.j;
        if (fragment != null) {
            return fragment;
        }
        n nVar = this.u;
        if (nVar == null || (str = this.k) == null) {
            return null;
        }
        return nVar.f0(str);
    }

    boolean R0(Menu menu, MenuInflater menuInflater) {
        boolean z = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            z = true;
            o0(menu, menuInflater);
        }
        return z | this.w.D(menu, menuInflater);
    }

    public View S() {
        return this.J;
    }

    void S0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.w.P0();
        this.s = true;
        this.V = new a0(this, h());
        View viewP0 = p0(layoutInflater, viewGroup, bundle);
        this.J = viewP0;
        if (viewP0 == null) {
            if (this.V.f()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.V = null;
        } else {
            this.V.e();
            androidx.lifecycle.t.a(this.J, this.V);
            androidx.lifecycle.u.a(this.J, this.V);
            androidx.savedstate.d.a(this.J, this.V);
            this.W.l(this.V);
        }
    }

    public LiveData<androidx.lifecycle.g> T() {
        return this.W;
    }

    void T0() {
        this.w.E();
        this.U.h(androidx.lifecycle.d.b.ON_DESTROY);
        this.f1793c = 0;
        this.H = false;
        this.S = false;
        q0();
        if (this.H) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void U0() {
        this.w.F();
        if (this.J != null && this.V.a().b().a(androidx.lifecycle.d.c.CREATED)) {
            this.V.d(androidx.lifecycle.d.b.ON_DESTROY);
        }
        this.f1793c = 1;
        this.H = false;
        s0();
        if (this.H) {
            a.m.a.a.b(this).c();
            this.s = false;
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void V() {
        U();
        this.h = UUID.randomUUID().toString();
        this.n = false;
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.t = 0;
        this.u = null;
        this.w = new o();
        this.v = null;
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.B = false;
        this.C = false;
    }

    void V0() {
        this.f1793c = -1;
        this.H = false;
        t0();
        this.R = null;
        if (this.H) {
            if (this.w.D0()) {
                return;
            }
            this.w.E();
            this.w = new o();
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onDetach()");
    }

    LayoutInflater W0(Bundle bundle) {
        LayoutInflater layoutInflaterU0 = u0(bundle);
        this.R = layoutInflaterU0;
        return layoutInflaterU0;
    }

    boolean X() {
        e eVar = this.M;
        if (eVar == null) {
            return false;
        }
        return eVar.y;
    }

    void X0() {
        onLowMemory();
        this.w.G();
    }

    final boolean Y() {
        return this.t > 0;
    }

    void Y0(boolean z) {
        y0(z);
        this.w.H(z);
    }

    public final boolean Z() {
        n nVar;
        return this.G && ((nVar = this.u) == null || nVar.G0(this.x));
    }

    boolean Z0(MenuItem menuItem) {
        if (this.B) {
            return false;
        }
        if (this.F && this.G && z0(menuItem)) {
            return true;
        }
        return this.w.J(menuItem);
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.U;
    }

    boolean a0() {
        e eVar = this.M;
        if (eVar == null) {
            return false;
        }
        return eVar.w;
    }

    void a1(Menu menu) {
        if (this.B) {
            return;
        }
        if (this.F && this.G) {
            A0(menu);
        }
        this.w.K(menu);
    }

    public final boolean b0() {
        return this.o;
    }

    void b1() {
        this.w.M();
        if (this.J != null) {
            this.V.d(androidx.lifecycle.d.b.ON_PAUSE);
        }
        this.U.h(androidx.lifecycle.d.b.ON_PAUSE);
        this.f1793c = 6;
        this.H = false;
        B0();
        if (this.H) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onPause()");
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry c() {
        return this.Y.b();
    }

    final boolean c0() {
        Fragment fragmentD = D();
        return fragmentD != null && (fragmentD.b0() || fragmentD.c0());
    }

    void c1(boolean z) {
        C0(z);
        this.w.N(z);
    }

    void d(boolean z) {
        ViewGroup viewGroup;
        n nVar;
        e eVar = this.M;
        h hVar = null;
        if (eVar != null) {
            eVar.w = false;
            h hVar2 = eVar.x;
            eVar.x = null;
            hVar = hVar2;
        }
        if (hVar != null) {
            hVar.a();
            return;
        }
        if (!n.f1938b || this.J == null || (viewGroup = this.I) == null || (nVar = this.u) == null) {
            return;
        }
        c0 c0VarN = c0.n(viewGroup, nVar);
        c0VarN.p();
        if (z) {
            this.v.l().post(new c(c0VarN));
        } else {
            c0VarN.g();
        }
    }

    public final boolean d0() {
        n nVar = this.u;
        if (nVar == null) {
            return false;
        }
        return nVar.J0();
    }

    boolean d1(Menu menu) {
        boolean z = false;
        if (this.B) {
            return false;
        }
        if (this.F && this.G) {
            z = true;
            D0(menu);
        }
        return z | this.w.O(menu);
    }

    androidx.fragment.app.g e() {
        return new d();
    }

    void e0() {
        this.w.P0();
    }

    void e1() {
        boolean zH0 = this.u.H0(this);
        Boolean bool = this.m;
        if (bool == null || bool.booleanValue() != zH0) {
            this.m = Boolean.valueOf(zH0);
            E0(zH0);
            this.w.P();
        }
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.y));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.z));
        printWriter.print(" mTag=");
        printWriter.println(this.A);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f1793c);
        printWriter.print(" mWho=");
        printWriter.print(this.h);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.n);
        printWriter.print(" mRemoving=");
        printWriter.print(this.o);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.p);
        printWriter.print(" mInLayout=");
        printWriter.println(this.q);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.B);
        printWriter.print(" mDetached=");
        printWriter.print(this.C);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.G);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.F);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.D);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.L);
        if (this.u != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.u);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.v);
        }
        if (this.x != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.x);
        }
        if (this.i != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.i);
        }
        if (this.f1794d != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f1794d);
        }
        if (this.f1795e != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f1795e);
        }
        if (this.f1796f != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f1796f);
        }
        Fragment fragmentR = R();
        if (fragmentR != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragmentR);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.l);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(F());
        if (r() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(r());
        }
        if (u() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(u());
        }
        if (G() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(G());
        }
        if (H() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(H());
        }
        if (this.I != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.I);
        }
        if (this.J != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.J);
        }
        if (m() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(m());
        }
        if (q() != null) {
            a.m.a.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.w + ":");
        this.w.W(str + "  ", fileDescriptor, printWriter, strArr);
    }

    @Deprecated
    public void f0(Bundle bundle) {
        this.H = true;
    }

    void f1() {
        this.w.P0();
        this.w.a0(true);
        this.f1793c = 7;
        this.H = false;
        G0();
        if (!this.H) {
            throw new e0("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.h hVar = this.U;
        androidx.lifecycle.d.b bVar = androidx.lifecycle.d.b.ON_RESUME;
        hVar.h(bVar);
        if (this.J != null) {
            this.V.d(bVar);
        }
        this.w.Q();
    }

    @Deprecated
    public void g0(int i, int i2, Intent intent) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i + " resultCode: " + i2 + " data: " + intent);
        }
    }

    void g1(Bundle bundle) {
        H0(bundle);
        this.Y.d(bundle);
        Parcelable parcelableD1 = this.w.d1();
        if (parcelableD1 != null) {
            bundle.putParcelable("android:support:fragments", parcelableD1);
        }
    }

    @Override // androidx.lifecycle.s
    public androidx.lifecycle.r h() {
        if (this.u == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (B() != androidx.lifecycle.d.c.INITIALIZED.ordinal()) {
            return this.u.z0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @Deprecated
    public void h0(Activity activity) {
        this.H = true;
    }

    void h1() {
        this.w.P0();
        this.w.a0(true);
        this.f1793c = 5;
        this.H = false;
        I0();
        if (!this.H) {
            throw new e0("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.h hVar = this.U;
        androidx.lifecycle.d.b bVar = androidx.lifecycle.d.b.ON_START;
        hVar.h(bVar);
        if (this.J != null) {
            this.V.d(bVar);
        }
        this.w.R();
    }

    public final int hashCode() {
        return super.hashCode();
    }

    Fragment i(String str) {
        return str.equals(this.h) ? this : this.w.i0(str);
    }

    public void i0(Context context) {
        this.H = true;
        k<?> kVar = this.v;
        Activity activityJ = kVar == null ? null : kVar.j();
        if (activityJ != null) {
            this.H = false;
            h0(activityJ);
        }
    }

    void i1() {
        this.w.T();
        if (this.J != null) {
            this.V.d(androidx.lifecycle.d.b.ON_STOP);
        }
        this.U.h(androidx.lifecycle.d.b.ON_STOP);
        this.f1793c = 4;
        this.H = false;
        J0();
        if (this.H) {
            return;
        }
        throw new e0("Fragment " + this + " did not call through to super.onStop()");
    }

    public final androidx.fragment.app.e j() {
        k<?> kVar = this.v;
        if (kVar == null) {
            return null;
        }
        return (androidx.fragment.app.e) kVar.j();
    }

    @Deprecated
    public void j0(Fragment fragment) {
    }

    void j1() {
        K0(this.J, this.f1794d);
        this.w.U();
    }

    public boolean k() {
        Boolean bool;
        e eVar = this.M;
        if (eVar == null || (bool = eVar.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean k0(MenuItem menuItem) {
        return false;
    }

    public final androidx.fragment.app.e k1() {
        androidx.fragment.app.e eVarJ = j();
        if (eVarJ != null) {
            return eVarJ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public boolean l() {
        Boolean bool;
        e eVar = this.M;
        if (eVar == null || (bool = eVar.q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public void l0(Bundle bundle) {
        this.H = true;
        n1(bundle);
        if (this.w.I0(1)) {
            return;
        }
        this.w.C();
    }

    public final Context l1() {
        Context contextQ = q();
        if (contextQ != null) {
            return contextQ;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    View m() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.f1803a;
    }

    public Animation m0(int i, boolean z, int i2) {
        return null;
    }

    public final View m1() {
        View viewS = S();
        if (viewS != null) {
            return viewS;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    Animator n() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.f1804b;
    }

    public Animator n0(int i, boolean z, int i2) {
        return null;
    }

    void n1(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.w.b1(parcelable);
        this.w.C();
    }

    public final Bundle o() {
        return this.i;
    }

    public void o0(Menu menu, MenuInflater menuInflater) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.H = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        k1().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.H = true;
    }

    public final n p() {
        if (this.v != null) {
            return this.w;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public View p0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = this.Z;
        if (i != 0) {
            return layoutInflater.inflate(i, viewGroup, false);
        }
        return null;
    }

    final void p1(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.f1795e;
        if (sparseArray != null) {
            this.J.restoreHierarchyState(sparseArray);
            this.f1795e = null;
        }
        if (this.J != null) {
            this.V.g(this.f1796f);
            this.f1796f = null;
        }
        this.H = false;
        L0(bundle);
        if (this.H) {
            if (this.J != null) {
                this.V.d(androidx.lifecycle.d.b.ON_CREATE);
            }
        } else {
            throw new e0("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public Context q() {
        k<?> kVar = this.v;
        if (kVar == null) {
            return null;
        }
        return kVar.k();
    }

    public void q0() {
        this.H = true;
    }

    void q1(View view) {
        g().f1803a = view;
    }

    int r() {
        e eVar = this.M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1806d;
    }

    public void r0() {
    }

    void r1(int i, int i2, int i3, int i4) {
        if (this.M == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        g().f1806d = i;
        g().f1807e = i2;
        g().f1808f = i3;
        g().g = i4;
    }

    public Object s() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.k;
    }

    public void s0() {
        this.H = true;
    }

    void s1(Animator animator) {
        g().f1804b = animator;
    }

    androidx.core.app.k t() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.s;
    }

    public void t0() {
        this.H = true;
    }

    public void t1(Bundle bundle) {
        if (this.u != null && d0()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.i = bundle;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.h);
        if (this.y != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.y));
        }
        if (this.A != null) {
            sb.append(" tag=");
            sb.append(this.A);
        }
        sb.append(")");
        return sb.toString();
    }

    int u() {
        e eVar = this.M;
        if (eVar == null) {
            return 0;
        }
        return eVar.f1807e;
    }

    public LayoutInflater u0(Bundle bundle) {
        return A(bundle);
    }

    void u1(View view) {
        g().v = view;
    }

    public Object v() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.m;
    }

    public void v0(boolean z) {
    }

    void v1(boolean z) {
        g().y = z;
    }

    androidx.core.app.k w() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.t;
    }

    @Deprecated
    public void w0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
    }

    void w1(int i) {
        if (this.M == null && i == 0) {
            return;
        }
        g();
        this.M.h = i;
    }

    View x() {
        e eVar = this.M;
        if (eVar == null) {
            return null;
        }
        return eVar.v;
    }

    public void x0(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.H = true;
        k<?> kVar = this.v;
        Activity activityJ = kVar == null ? null : kVar.j();
        if (activityJ != null) {
            this.H = false;
            w0(activityJ, attributeSet, bundle);
        }
    }

    void x1(h hVar) {
        g();
        e eVar = this.M;
        h hVar2 = eVar.x;
        if (hVar == hVar2) {
            return;
        }
        if (hVar != null && hVar2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (eVar.w) {
            eVar.x = hVar;
        }
        if (hVar != null) {
            hVar.b();
        }
    }

    @Deprecated
    public final n y() {
        return this.u;
    }

    public void y0(boolean z) {
    }

    void y1(boolean z) {
        if (this.M == null) {
            return;
        }
        g().f1805c = z;
    }

    public final Object z() {
        k<?> kVar = this.v;
        if (kVar == null) {
            return null;
        }
        return kVar.m();
    }

    public boolean z0(MenuItem menuItem) {
        return false;
    }

    void z1(float f2) {
        g().u = f2;
    }
}
