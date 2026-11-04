package d.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> implements f<T> {
    public static int b() {
        return b.a();
    }

    public static <T> c<T> c(e<T> eVar) {
        d.a.m.b.b.c(eVar, "source is null");
        return d.a.n.a.j(new d.a.m.e.a.b(eVar));
    }

    @Override // d.a.f
    public final void a(g<? super T> gVar) {
        d.a.m.b.b.c(gVar, "observer is null");
        try {
            g<? super T> gVarN = d.a.n.a.n(this, gVar);
            d.a.m.b.b.c(gVarN, "Plugin returned null Observer");
            h(gVarN);
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th) {
            d.a.k.b.b(th);
            d.a.n.a.k(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final c<T> d(h hVar) {
        return e(hVar, false, b());
    }

    public final c<T> e(h hVar, boolean z, int i) {
        d.a.m.b.b.c(hVar, "scheduler is null");
        d.a.m.b.b.d(i, "bufferSize");
        return d.a.n.a.j(new d.a.m.e.a.c(this, hVar, z, i));
    }

    public final d.a.j.b f(d.a.l.d<? super T> dVar) {
        return g(dVar, d.a.m.b.a.f4764f, d.a.m.b.a.f4761c, d.a.m.b.a.a());
    }

    public final d.a.j.b g(d.a.l.d<? super T> dVar, d.a.l.d<? super Throwable> dVar2, d.a.l.a aVar, d.a.l.d<? super d.a.j.b> dVar3) {
        d.a.m.b.b.c(dVar, "onNext is null");
        d.a.m.b.b.c(dVar2, "onError is null");
        d.a.m.b.b.c(aVar, "onComplete is null");
        d.a.m.b.b.c(dVar3, "onSubscribe is null");
        d.a.m.d.b bVar = new d.a.m.d.b(dVar, dVar2, aVar, dVar3);
        a(bVar);
        return bVar;
    }

    protected abstract void h(g<? super T> gVar);

    public final c<T> i(h hVar) {
        d.a.m.b.b.c(hVar, "scheduler is null");
        return d.a.n.a.j(new d.a.m.e.a.d(this, hVar));
    }
}
