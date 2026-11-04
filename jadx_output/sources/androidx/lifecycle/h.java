package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h extends d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.b.a.b.a<f, a> f2100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d.c f2101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference<g> f2102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2104f;
    private boolean g;
    private ArrayList<d.c> h;
    private final boolean i;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        d.c f2105a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        e f2106b;

        a(f fVar, d.c cVar) {
            this.f2106b = j.f(fVar);
            this.f2105a = cVar;
        }

        void a(g gVar, d.b bVar) {
            d.c cVarB = bVar.b();
            this.f2105a = h.k(this.f2105a, cVarB);
            this.f2106b.d(gVar, bVar);
            this.f2105a = cVarB;
        }
    }

    public h(g gVar) {
        this(gVar, true);
    }

    private h(g gVar, boolean z) {
        this.f2100b = new a.b.a.b.a<>();
        this.f2103e = 0;
        this.f2104f = false;
        this.g = false;
        this.h = new ArrayList<>();
        this.f2102d = new WeakReference<>(gVar);
        this.f2101c = d.c.INITIALIZED;
        this.i = z;
    }

    private void d(g gVar) {
        Iterator<Map.Entry<f, a>> itA = this.f2100b.a();
        while (itA.hasNext() && !this.g) {
            Map.Entry<f, a> next = itA.next();
            a value = next.getValue();
            while (value.f2105a.compareTo(this.f2101c) > 0 && !this.g && this.f2100b.contains(next.getKey())) {
                d.b bVarA = d.b.a(value.f2105a);
                if (bVarA == null) {
                    throw new IllegalStateException("no event down from " + value.f2105a);
                }
                n(bVarA.b());
                value.a(gVar, bVarA);
                m();
            }
        }
    }

    private d.c e(f fVar) {
        Map.Entry<f, a> entryI = this.f2100b.i(fVar);
        d.c cVar = null;
        d.c cVar2 = entryI != null ? entryI.getValue().f2105a : null;
        if (!this.h.isEmpty()) {
            ArrayList<d.c> arrayList = this.h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return k(k(this.f2101c, cVar2), cVar);
    }

    @SuppressLint({"RestrictedApi"})
    private void f(String str) {
        if (!this.i || a.b.a.a.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Method " + str + " must be called on the main thread");
    }

    private void g(g gVar) {
        a.b.a.b.b<f, a>.d dVarD = this.f2100b.d();
        while (dVarD.hasNext() && !this.g) {
            Map.Entry next = dVarD.next();
            a aVar = (a) next.getValue();
            while (aVar.f2105a.compareTo(this.f2101c) < 0 && !this.g && this.f2100b.contains((f) next.getKey())) {
                n(aVar.f2105a);
                d.b bVarC = d.b.c(aVar.f2105a);
                if (bVarC == null) {
                    throw new IllegalStateException("no event up from " + aVar.f2105a);
                }
                aVar.a(gVar, bVarC);
                m();
            }
        }
    }

    private boolean i() {
        if (this.f2100b.size() == 0) {
            return true;
        }
        d.c cVar = this.f2100b.b().getValue().f2105a;
        d.c cVar2 = this.f2100b.e().getValue().f2105a;
        return cVar == cVar2 && this.f2101c == cVar2;
    }

    static d.c k(d.c cVar, d.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void l(d.c cVar) {
        if (this.f2101c == cVar) {
            return;
        }
        this.f2101c = cVar;
        if (this.f2104f || this.f2103e != 0) {
            this.g = true;
            return;
        }
        this.f2104f = true;
        p();
        this.f2104f = false;
    }

    private void m() {
        ArrayList<d.c> arrayList = this.h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void n(d.c cVar) {
        this.h.add(cVar);
    }

    private void p() {
        g gVar = this.f2102d.get();
        if (gVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            boolean zI = i();
            this.g = false;
            if (zI) {
                return;
            }
            if (this.f2101c.compareTo(this.f2100b.b().getValue().f2105a) < 0) {
                d(gVar);
            }
            Map.Entry<f, a> entryE = this.f2100b.e();
            if (!this.g && entryE != null && this.f2101c.compareTo(entryE.getValue().f2105a) > 0) {
                g(gVar);
            }
        }
    }

    @Override // androidx.lifecycle.d
    public void a(f fVar) {
        g gVar;
        f("addObserver");
        d.c cVar = this.f2101c;
        d.c cVar2 = d.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = d.c.INITIALIZED;
        }
        a aVar = new a(fVar, cVar2);
        if (this.f2100b.g(fVar, aVar) == null && (gVar = this.f2102d.get()) != null) {
            boolean z = this.f2103e != 0 || this.f2104f;
            d.c cVarE = e(fVar);
            this.f2103e++;
            while (aVar.f2105a.compareTo(cVarE) < 0 && this.f2100b.contains(fVar)) {
                n(aVar.f2105a);
                d.b bVarC = d.b.c(aVar.f2105a);
                if (bVarC == null) {
                    throw new IllegalStateException("no event up from " + aVar.f2105a);
                }
                aVar.a(gVar, bVarC);
                m();
                cVarE = e(fVar);
            }
            if (!z) {
                p();
            }
            this.f2103e--;
        }
    }

    @Override // androidx.lifecycle.d
    public d.c b() {
        return this.f2101c;
    }

    @Override // androidx.lifecycle.d
    public void c(f fVar) {
        f("removeObserver");
        this.f2100b.h(fVar);
    }

    public void h(d.b bVar) {
        f("handleLifecycleEvent");
        l(bVar.b());
    }

    @Deprecated
    public void j(d.c cVar) {
        f("markState");
        o(cVar);
    }

    public void o(d.c cVar) {
        f("setCurrentState");
        l(cVar);
    }
}
