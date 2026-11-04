package d.a.m.a;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public enum b implements d.a.j.b {
    DISPOSED;

    public static boolean a(AtomicReference<d.a.j.b> atomicReference) {
        d.a.j.b andSet;
        d.a.j.b bVar = atomicReference.get();
        b bVar2 = DISPOSED;
        if (bVar == bVar2 || (andSet = atomicReference.getAndSet(bVar2)) == bVar2) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.c();
        return true;
    }

    public static boolean b(d.a.j.b bVar) {
        return bVar == DISPOSED;
    }

    public static void d() {
        d.a.n.a.k(new d.a.k.d("Disposable already set!"));
    }

    public static boolean e(AtomicReference<d.a.j.b> atomicReference, d.a.j.b bVar) {
        d.a.m.b.b.c(bVar, "d is null");
        if (atomicReference.compareAndSet(null, bVar)) {
            return true;
        }
        bVar.c();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        d();
        return false;
    }

    public static boolean f(d.a.j.b bVar, d.a.j.b bVar2) {
        if (bVar2 == null) {
            d.a.n.a.k(new NullPointerException("next is null"));
            return false;
        }
        if (bVar == null) {
            return true;
        }
        bVar2.c();
        d();
        return false;
    }

    @Override // d.a.j.b
    public void c() {
    }
}
