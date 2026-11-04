package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f1980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v f1981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Fragment f1982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1983d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1984e = -1;

    class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1985b;

        a(View view) {
            this.f1985b = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f1985b.removeOnAttachStateChangeListener(this);
            a.g.l.v.l0(this.f1985b);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1987a;

        static {
            int[] iArr = new int[androidx.lifecycle.d.c.values().length];
            f1987a = iArr;
            try {
                iArr[androidx.lifecycle.d.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1987a[androidx.lifecycle.d.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1987a[androidx.lifecycle.d.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1987a[androidx.lifecycle.d.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    u(m mVar, v vVar, Fragment fragment) {
        this.f1980a = mVar;
        this.f1981b = vVar;
        this.f1982c = fragment;
    }

    u(m mVar, v vVar, Fragment fragment, t tVar) {
        this.f1980a = mVar;
        this.f1981b = vVar;
        this.f1982c = fragment;
        fragment.f1795e = null;
        fragment.f1796f = null;
        fragment.t = 0;
        fragment.q = false;
        fragment.n = false;
        Fragment fragment2 = fragment.j;
        fragment.k = fragment2 != null ? fragment2.h : null;
        fragment.j = null;
        Bundle bundle = tVar.n;
        fragment.f1794d = bundle == null ? new Bundle() : bundle;
    }

    u(m mVar, v vVar, ClassLoader classLoader, j jVar, t tVar) {
        this.f1980a = mVar;
        this.f1981b = vVar;
        Fragment fragmentA = jVar.a(classLoader, tVar.f1975b);
        this.f1982c = fragmentA;
        Bundle bundle = tVar.k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentA.t1(tVar.k);
        fragmentA.h = tVar.f1976c;
        fragmentA.p = tVar.f1977d;
        fragmentA.r = true;
        fragmentA.y = tVar.f1978e;
        fragmentA.z = tVar.f1979f;
        fragmentA.A = tVar.g;
        fragmentA.D = tVar.h;
        fragmentA.o = tVar.i;
        fragmentA.C = tVar.j;
        fragmentA.B = tVar.l;
        fragmentA.T = androidx.lifecycle.d.c.values()[tVar.m];
        Bundle bundle2 = tVar.n;
        fragmentA.f1794d = bundle2 == null ? new Bundle() : bundle2;
        if (n.E0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + fragmentA);
        }
    }

    private boolean l(View view) {
        if (view == this.f1982c.J) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f1982c.J) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f1982c.g1(bundle);
        this.f1980a.j(this.f1982c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f1982c.J != null) {
            s();
        }
        if (this.f1982c.f1795e != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f1982c.f1795e);
        }
        if (this.f1982c.f1796f != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f1982c.f1796f);
        }
        if (!this.f1982c.L) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f1982c.L);
        }
        return bundle;
    }

    void a() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f1982c);
        }
        Fragment fragment = this.f1982c;
        fragment.M0(fragment.f1794d);
        m mVar = this.f1980a;
        Fragment fragment2 = this.f1982c;
        mVar.a(fragment2, fragment2.f1794d, false);
    }

    void b() {
        int iJ = this.f1981b.j(this.f1982c);
        Fragment fragment = this.f1982c;
        fragment.I.addView(fragment.J, iJ);
    }

    void c() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f1982c);
        }
        Fragment fragment = this.f1982c;
        Fragment fragment2 = fragment.j;
        u uVarM = null;
        if (fragment2 != null) {
            u uVarM2 = this.f1981b.m(fragment2.h);
            if (uVarM2 == null) {
                throw new IllegalStateException("Fragment " + this.f1982c + " declared target fragment " + this.f1982c.j + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f1982c;
            fragment3.k = fragment3.j.h;
            fragment3.j = null;
            uVarM = uVarM2;
        } else {
            String str = fragment.k;
            if (str != null && (uVarM = this.f1981b.m(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f1982c + " declared target fragment " + this.f1982c.k + " that does not belong to this FragmentManager!");
            }
        }
        if (uVarM != null && (n.f1938b || uVarM.k().f1793c < 1)) {
            uVarM.m();
        }
        Fragment fragment4 = this.f1982c;
        fragment4.v = fragment4.u.s0();
        Fragment fragment5 = this.f1982c;
        fragment5.x = fragment5.u.v0();
        this.f1980a.g(this.f1982c, false);
        this.f1982c.N0();
        this.f1980a.b(this.f1982c, false);
    }

    int d() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f1982c;
        if (fragment2.u == null) {
            return fragment2.f1793c;
        }
        int iMin = this.f1984e;
        int i = b.f1987a[fragment2.T.ordinal()];
        if (i != 1) {
            if (i == 2) {
                iMin = Math.min(iMin, 5);
            } else if (i != 3) {
                iMin = i != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0);
            } else {
                iMin = Math.min(iMin, 1);
            }
        }
        Fragment fragment3 = this.f1982c;
        if (fragment3.p) {
            if (fragment3.q) {
                iMin = Math.max(this.f1984e, 2);
                View view = this.f1982c.J;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f1984e < 4 ? Math.min(iMin, fragment3.f1793c) : Math.min(iMin, 1);
            }
        }
        if (!this.f1982c.n) {
            iMin = Math.min(iMin, 1);
        }
        c0.e.b bVarL = null;
        if (n.f1938b && (viewGroup = (fragment = this.f1982c).I) != null) {
            bVarL = c0.n(viewGroup, fragment.E()).l(this);
        }
        if (bVarL == c0.e.b.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (bVarL == c0.e.b.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f1982c;
            if (fragment4.o) {
                iMin = fragment4.Y() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f1982c;
        if (fragment5.K && fragment5.f1793c < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + iMin + " for " + this.f1982c);
        }
        return iMin;
    }

    void e() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f1982c);
        }
        Fragment fragment = this.f1982c;
        if (fragment.S) {
            fragment.n1(fragment.f1794d);
            this.f1982c.f1793c = 1;
            return;
        }
        this.f1980a.h(fragment, fragment.f1794d, false);
        Fragment fragment2 = this.f1982c;
        fragment2.Q0(fragment2.f1794d);
        m mVar = this.f1980a;
        Fragment fragment3 = this.f1982c;
        mVar.c(fragment3, fragment3.f1794d, false);
    }

    void f() {
        String resourceName;
        if (this.f1982c.p) {
            return;
        }
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1982c);
        }
        Fragment fragment = this.f1982c;
        LayoutInflater layoutInflaterW0 = fragment.W0(fragment.f1794d);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f1982c;
        ViewGroup viewGroup2 = fragment2.I;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i = fragment2.z;
            if (i != 0) {
                if (i == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f1982c + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.u.n0().g(this.f1982c.z);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f1982c;
                    if (!fragment3.r) {
                        try {
                            resourceName = fragment3.K().getResourceName(this.f1982c.z);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f1982c.z) + " (" + resourceName + ") for fragment " + this.f1982c);
                    }
                }
            }
        }
        Fragment fragment4 = this.f1982c;
        fragment4.I = viewGroup;
        fragment4.S0(layoutInflaterW0, viewGroup, fragment4.f1794d);
        View view = this.f1982c.J;
        if (view != null) {
            boolean z = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f1982c;
            fragment5.J.setTag(a.k.b.f767a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f1982c;
            if (fragment6.B) {
                fragment6.J.setVisibility(8);
            }
            if (a.g.l.v.S(this.f1982c.J)) {
                a.g.l.v.l0(this.f1982c.J);
            } else {
                View view2 = this.f1982c.J;
                view2.addOnAttachStateChangeListener(new a(view2));
            }
            this.f1982c.j1();
            m mVar = this.f1980a;
            Fragment fragment7 = this.f1982c;
            mVar.m(fragment7, fragment7.J, fragment7.f1794d, false);
            int visibility = this.f1982c.J.getVisibility();
            float alpha = this.f1982c.J.getAlpha();
            if (n.f1938b) {
                this.f1982c.z1(alpha);
                Fragment fragment8 = this.f1982c;
                if (fragment8.I != null && visibility == 0) {
                    View viewFindFocus = fragment8.J.findFocus();
                    if (viewFindFocus != null) {
                        this.f1982c.u1(viewFindFocus);
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f1982c);
                        }
                    }
                    this.f1982c.J.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f1982c;
                if (visibility == 0 && fragment9.I != null) {
                    z = true;
                }
                fragment9.O = z;
            }
        }
        this.f1982c.f1793c = 2;
    }

    void g() {
        Fragment fragmentF;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f1982c);
        }
        Fragment fragment = this.f1982c;
        boolean zIsChangingConfigurations = true;
        boolean z = fragment.o && !fragment.Y();
        if (!(z || this.f1981b.o().o(this.f1982c))) {
            String str = this.f1982c.k;
            if (str != null && (fragmentF = this.f1981b.f(str)) != null && fragmentF.D) {
                this.f1982c.j = fragmentF;
            }
            this.f1982c.f1793c = 0;
            return;
        }
        k<?> kVar = this.f1982c.v;
        if (kVar instanceof androidx.lifecycle.s) {
            zIsChangingConfigurations = this.f1981b.o().l();
        } else if (kVar.k() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) kVar.k()).isChangingConfigurations();
        }
        if (z || zIsChangingConfigurations) {
            this.f1981b.o().f(this.f1982c);
        }
        this.f1982c.T0();
        this.f1980a.d(this.f1982c, false);
        for (u uVar : this.f1981b.k()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                if (this.f1982c.h.equals(fragmentK.k)) {
                    fragmentK.j = this.f1982c;
                    fragmentK.k = null;
                }
            }
        }
        Fragment fragment2 = this.f1982c;
        String str2 = fragment2.k;
        if (str2 != null) {
            fragment2.j = this.f1981b.f(str2);
        }
        this.f1981b.q(this);
    }

    void h() {
        View view;
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f1982c);
        }
        Fragment fragment = this.f1982c;
        ViewGroup viewGroup = fragment.I;
        if (viewGroup != null && (view = fragment.J) != null) {
            viewGroup.removeView(view);
        }
        this.f1982c.U0();
        this.f1980a.n(this.f1982c, false);
        Fragment fragment2 = this.f1982c;
        fragment2.I = null;
        fragment2.J = null;
        fragment2.V = null;
        fragment2.W.l(null);
        this.f1982c.q = false;
    }

    void i() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f1982c);
        }
        this.f1982c.V0();
        boolean z = false;
        this.f1980a.e(this.f1982c, false);
        Fragment fragment = this.f1982c;
        fragment.f1793c = -1;
        fragment.v = null;
        fragment.x = null;
        fragment.u = null;
        if (fragment.o && !fragment.Y()) {
            z = true;
        }
        if (z || this.f1981b.o().o(this.f1982c)) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f1982c);
            }
            this.f1982c.V();
        }
    }

    void j() {
        Fragment fragment = this.f1982c;
        if (fragment.p && fragment.q && !fragment.s) {
            if (n.E0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f1982c);
            }
            Fragment fragment2 = this.f1982c;
            fragment2.S0(fragment2.W0(fragment2.f1794d), null, this.f1982c.f1794d);
            View view = this.f1982c.J;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f1982c;
                fragment3.J.setTag(a.k.b.f767a, fragment3);
                Fragment fragment4 = this.f1982c;
                if (fragment4.B) {
                    fragment4.J.setVisibility(8);
                }
                this.f1982c.j1();
                m mVar = this.f1980a;
                Fragment fragment5 = this.f1982c;
                mVar.m(fragment5, fragment5.J, fragment5.f1794d, false);
                this.f1982c.f1793c = 2;
            }
        }
    }

    Fragment k() {
        return this.f1982c;
    }

    void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f1983d) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f1983d = true;
            while (true) {
                int iD = d();
                Fragment fragment = this.f1982c;
                int i = fragment.f1793c;
                if (iD == i) {
                    if (n.f1938b && fragment.P) {
                        if (fragment.J != null && (viewGroup = fragment.I) != null) {
                            c0 c0VarN = c0.n(viewGroup, fragment.E());
                            if (this.f1982c.B) {
                                c0VarN.c(this);
                            } else {
                                c0VarN.e(this);
                            }
                        }
                        Fragment fragment2 = this.f1982c;
                        n nVar = fragment2.u;
                        if (nVar != null) {
                            nVar.C0(fragment2);
                        }
                        Fragment fragment3 = this.f1982c;
                        fragment3.P = false;
                        fragment3.v0(fragment3.B);
                    }
                    return;
                }
                if (iD <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case 1:
                            h();
                            this.f1982c.f1793c = 1;
                            break;
                        case 2:
                            fragment.q = false;
                            fragment.f1793c = 2;
                            break;
                        case 3:
                            if (n.E0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f1982c);
                            }
                            Fragment fragment4 = this.f1982c;
                            if (fragment4.J != null && fragment4.f1795e == null) {
                                s();
                            }
                            Fragment fragment5 = this.f1982c;
                            if (fragment5.J != null && (viewGroup3 = fragment5.I) != null) {
                                c0.n(viewGroup3, fragment5.E()).d(this);
                            }
                            this.f1982c.f1793c = 3;
                            break;
                        case 4:
                            v();
                            break;
                        case 5:
                            fragment.f1793c = 5;
                            break;
                        case 6:
                            n();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case 1:
                            e();
                            break;
                        case 2:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case 4:
                            if (fragment.J != null && (viewGroup2 = fragment.I) != null) {
                                c0.n(viewGroup2, fragment.E()).b(c0.e.c.b(this.f1982c.J.getVisibility()), this);
                            }
                            this.f1982c.f1793c = 4;
                            break;
                        case 5:
                            u();
                            break;
                        case 6:
                            fragment.f1793c = 6;
                            break;
                        case 7:
                            p();
                            break;
                    }
                }
            }
        } finally {
            this.f1983d = false;
        }
    }

    void n() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f1982c);
        }
        this.f1982c.b1();
        this.f1980a.f(this.f1982c, false);
    }

    void o(ClassLoader classLoader) {
        Bundle bundle = this.f1982c.f1794d;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1982c;
        fragment.f1795e = fragment.f1794d.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1982c;
        fragment2.f1796f = fragment2.f1794d.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f1982c;
        fragment3.k = fragment3.f1794d.getString("android:target_state");
        Fragment fragment4 = this.f1982c;
        if (fragment4.k != null) {
            fragment4.l = fragment4.f1794d.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f1982c;
        Boolean bool = fragment5.g;
        if (bool != null) {
            fragment5.L = bool.booleanValue();
            this.f1982c.g = null;
        } else {
            fragment5.L = fragment5.f1794d.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f1982c;
        if (fragment6.L) {
            return;
        }
        fragment6.K = true;
    }

    void p() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f1982c);
        }
        View viewX = this.f1982c.x();
        if (viewX != null && l(viewX)) {
            boolean zRequestFocus = viewX.requestFocus();
            if (n.E0(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(viewX);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f1982c);
                sb.append(" resulting in focused view ");
                sb.append(this.f1982c.J.findFocus());
                Log.v("FragmentManager", sb.toString());
            }
        }
        this.f1982c.u1(null);
        this.f1982c.f1();
        this.f1980a.i(this.f1982c, false);
        Fragment fragment = this.f1982c;
        fragment.f1794d = null;
        fragment.f1795e = null;
        fragment.f1796f = null;
    }

    t r() {
        t tVar = new t(this.f1982c);
        Fragment fragment = this.f1982c;
        if (fragment.f1793c <= -1 || tVar.n != null) {
            tVar.n = fragment.f1794d;
        } else {
            Bundle bundleQ = q();
            tVar.n = bundleQ;
            if (this.f1982c.k != null) {
                if (bundleQ == null) {
                    tVar.n = new Bundle();
                }
                tVar.n.putString("android:target_state", this.f1982c.k);
                int i = this.f1982c.l;
                if (i != 0) {
                    tVar.n.putInt("android:target_req_state", i);
                }
            }
        }
        return tVar;
    }

    void s() {
        if (this.f1982c.J == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1982c.J.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1982c.f1795e = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f1982c.V.i(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f1982c.f1796f = bundle;
    }

    void t(int i) {
        this.f1984e = i;
    }

    void u() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f1982c);
        }
        this.f1982c.h1();
        this.f1980a.k(this.f1982c, false);
    }

    void v() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f1982c);
        }
        this.f1982c.i1();
        this.f1980a.l(this.f1982c, false);
    }
}
