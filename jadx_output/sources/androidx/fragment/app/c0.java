package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f1866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<e> f1867b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<e> f1868c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f1869d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f1870e = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f1871b;

        a(d dVar) {
            this.f1871b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (c0.this.f1867b.contains(this.f1871b)) {
                this.f1871b.e().a(this.f1871b.f().J);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f1873b;

        b(d dVar) {
            this.f1873b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            c0.this.f1867b.remove(this.f1873b);
            c0.this.f1868c.remove(this.f1873b);
        }
    }

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f1876b;

        static {
            int[] iArr = new int[e.b.values().length];
            f1876b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1876b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1876b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f1875a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1875a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1875a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1875a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private static class d extends e {
        private final u h;

        d(e.c cVar, e.b bVar, u uVar, a.g.h.b bVar2) {
            super(cVar, bVar, uVar.k(), bVar2);
            this.h = uVar;
        }

        @Override // androidx.fragment.app.c0.e
        public void c() {
            super.c();
            this.h.m();
        }

        @Override // androidx.fragment.app.c0.e
        void l() {
            if (g() == e.b.ADDING) {
                Fragment fragmentK = this.h.k();
                View viewFindFocus = fragmentK.J.findFocus();
                if (viewFindFocus != null) {
                    fragmentK.u1(viewFindFocus);
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + fragmentK);
                    }
                }
                View viewM1 = f().m1();
                if (viewM1.getParent() == null) {
                    this.h.b();
                    viewM1.setAlpha(0.0f);
                }
                if (viewM1.getAlpha() == 0.0f && viewM1.getVisibility() == 0) {
                    viewM1.setVisibility(4);
                }
                viewM1.setAlpha(fragmentK.I());
            }
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private c f1877a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f1878b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Fragment f1879c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List<Runnable> f1880d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final HashSet<a.g.h.b> f1881e = new HashSet<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1882f = false;
        private boolean g = false;

        class a implements a.g.h.b.a {
            a() {
            }

            @Override // a.g.h.b.a
            public void a() {
                e.this.b();
            }
        }

        enum b {
            NONE,
            ADDING,
            REMOVING
        }

        enum c {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            static c b(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException("Unknown visibility " + i);
            }

            static c c(View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            void a(View view) {
                int i;
                int i2 = c.f1875a[ordinal()];
                if (i2 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i2 == 2) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
                    }
                    i = 0;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            return;
                        }
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
                        }
                        view.setVisibility(4);
                        return;
                    }
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
                    }
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        e(c cVar, b bVar, Fragment fragment, a.g.h.b bVar2) {
            this.f1877a = cVar;
            this.f1878b = bVar;
            this.f1879c = fragment;
            bVar2.c(new a());
        }

        final void a(Runnable runnable) {
            this.f1880d.add(runnable);
        }

        final void b() {
            if (h()) {
                return;
            }
            this.f1882f = true;
            if (this.f1881e.isEmpty()) {
                c();
                return;
            }
            Iterator it = new ArrayList(this.f1881e).iterator();
            while (it.hasNext()) {
                ((a.g.h.b) it.next()).a();
            }
        }

        public void c() {
            if (this.g) {
                return;
            }
            if (n.E0(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.g = true;
            Iterator<Runnable> it = this.f1880d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        public final void d(a.g.h.b bVar) {
            if (this.f1881e.remove(bVar) && this.f1881e.isEmpty()) {
                c();
            }
        }

        public c e() {
            return this.f1877a;
        }

        public final Fragment f() {
            return this.f1879c;
        }

        b g() {
            return this.f1878b;
        }

        final boolean h() {
            return this.f1882f;
        }

        final boolean i() {
            return this.g;
        }

        public final void j(a.g.h.b bVar) {
            l();
            this.f1881e.add(bVar);
        }

        final void k(c cVar, b bVar) {
            b bVar2;
            int i = c.f1876b[bVar.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && this.f1877a != c.REMOVED) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1879c + " mFinalState = " + this.f1877a + " -> " + cVar + ". ");
                        }
                        this.f1877a = cVar;
                        return;
                    }
                    return;
                }
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1879c + " mFinalState = " + this.f1877a + " -> REMOVED. mLifecycleImpact  = " + this.f1878b + " to REMOVING.");
                }
                this.f1877a = c.REMOVED;
                bVar2 = b.REMOVING;
            } else {
                if (this.f1877a != c.REMOVED) {
                    return;
                }
                if (n.E0(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + this.f1879c + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + this.f1878b + " to ADDING.");
                }
                this.f1877a = c.VISIBLE;
                bVar2 = b.ADDING;
            }
            this.f1878b = bVar2;
        }

        void l() {
        }

        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f1877a + "} {mLifecycleImpact = " + this.f1878b + "} {mFragment = " + this.f1879c + "}";
        }
    }

    c0(ViewGroup viewGroup) {
        this.f1866a = viewGroup;
    }

    private void a(e.c cVar, e.b bVar, u uVar) {
        synchronized (this.f1867b) {
            a.g.h.b bVar2 = new a.g.h.b();
            e eVarH = h(uVar.k());
            if (eVarH != null) {
                eVarH.k(cVar, bVar);
                return;
            }
            d dVar = new d(cVar, bVar, uVar, bVar2);
            this.f1867b.add(dVar);
            dVar.a(new a(dVar));
            dVar.a(new b(dVar));
        }
    }

    private e h(Fragment fragment) {
        for (e eVar : this.f1867b) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    private e i(Fragment fragment) {
        for (e eVar : this.f1868c) {
            if (eVar.f().equals(fragment) && !eVar.h()) {
                return eVar;
            }
        }
        return null;
    }

    static c0 n(ViewGroup viewGroup, n nVar) {
        return o(viewGroup, nVar.x0());
    }

    static c0 o(ViewGroup viewGroup, d0 d0Var) {
        int i = a.k.b.f768b;
        Object tag = viewGroup.getTag(i);
        if (tag instanceof c0) {
            return (c0) tag;
        }
        c0 c0VarA = d0Var.a(viewGroup);
        viewGroup.setTag(i, c0VarA);
        return c0VarA;
    }

    private void q() {
        for (e eVar : this.f1867b) {
            if (eVar.g() == e.b.ADDING) {
                eVar.k(e.c.b(eVar.f().m1().getVisibility()), e.b.NONE);
            }
        }
    }

    void b(e.c cVar, u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + uVar.k());
        }
        a(cVar, e.b.ADDING, uVar);
    }

    void c(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + uVar.k());
        }
        a(e.c.GONE, e.b.NONE, uVar);
    }

    void d(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + uVar.k());
        }
        a(e.c.REMOVED, e.b.REMOVING, uVar);
    }

    void e(u uVar) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + uVar.k());
        }
        a(e.c.VISIBLE, e.b.NONE, uVar);
    }

    abstract void f(List<e> list, boolean z);

    void g() {
        if (this.f1870e) {
            return;
        }
        if (!a.g.l.v.S(this.f1866a)) {
            j();
            this.f1869d = false;
            return;
        }
        synchronized (this.f1867b) {
            if (!this.f1867b.isEmpty()) {
                ArrayList<e> arrayList = new ArrayList(this.f1868c);
                this.f1868c.clear();
                for (e eVar : arrayList) {
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + eVar);
                    }
                    eVar.b();
                    if (!eVar.i()) {
                        this.f1868c.add(eVar);
                    }
                }
                q();
                ArrayList arrayList2 = new ArrayList(this.f1867b);
                this.f1867b.clear();
                this.f1868c.addAll(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).l();
                }
                f(arrayList2, this.f1869d);
                this.f1869d = false;
            }
        }
    }

    void j() {
        boolean zS = a.g.l.v.S(this.f1866a);
        synchronized (this.f1867b) {
            q();
            Iterator<e> it = this.f1867b.iterator();
            while (it.hasNext()) {
                it.next().l();
            }
            for (e eVar : new ArrayList(this.f1868c)) {
                if (n.E0(2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: ");
                    sb.append(zS ? "" : "Container " + this.f1866a + " is not attached to window. ");
                    sb.append("Cancelling running operation ");
                    sb.append(eVar);
                    Log.v("FragmentManager", sb.toString());
                }
                eVar.b();
            }
            for (e eVar2 : new ArrayList(this.f1867b)) {
                if (n.E0(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: ");
                    sb2.append(zS ? "" : "Container " + this.f1866a + " is not attached to window. ");
                    sb2.append("Cancelling pending operation ");
                    sb2.append(eVar2);
                    Log.v("FragmentManager", sb2.toString());
                }
                eVar2.b();
            }
        }
    }

    void k() {
        if (this.f1870e) {
            this.f1870e = false;
            g();
        }
    }

    e.b l(u uVar) {
        e eVarH = h(uVar.k());
        e.b bVarG = eVarH != null ? eVarH.g() : null;
        e eVarI = i(uVar.k());
        return (eVarI == null || !(bVarG == null || bVarG == e.b.NONE)) ? bVarG : eVarI.g();
    }

    public ViewGroup m() {
        return this.f1866a;
    }

    void p() {
        synchronized (this.f1867b) {
            q();
            this.f1870e = false;
            for (int size = this.f1867b.size() - 1; size >= 0; size--) {
                e eVar = this.f1867b.get(size);
                e.c cVarC = e.c.c(eVar.f().J);
                e.c cVarE = eVar.e();
                e.c cVar = e.c.VISIBLE;
                if (cVarE == cVar && cVarC != cVar) {
                    this.f1870e = eVar.f().a0();
                    break;
                }
            }
        }
    }

    void r(boolean z) {
        this.f1869d = z;
    }
}
