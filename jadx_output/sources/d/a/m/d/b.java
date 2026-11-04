package d.a.m.d;

import d.a.g;
import d.a.l.d;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends AtomicReference<d.a.j.b> implements g<T>, d.a.j.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d<? super T> f4766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final d<? super Throwable> f4767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final d.a.l.a f4768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final d<? super d.a.j.b> f4769e;

    public b(d<? super T> dVar, d<? super Throwable> dVar2, d.a.l.a aVar, d<? super d.a.j.b> dVar3) {
        this.f4766b = dVar;
        this.f4767c = dVar2;
        this.f4768d = aVar;
        this.f4769e = dVar3;
    }

    @Override // d.a.g
    public void a(T t) {
        if (f()) {
            return;
        }
        try {
            this.f4766b.a(t);
        } catch (Throwable th) {
            d.a.k.b.b(th);
            d(th);
        }
    }

    @Override // d.a.g
    public void b() {
        if (f()) {
            return;
        }
        lazySet(d.a.m.a.b.DISPOSED);
        try {
            this.f4768d.run();
        } catch (Throwable th) {
            d.a.k.b.b(th);
            d.a.n.a.k(th);
        }
    }

    @Override // d.a.j.b
    public void c() {
        d.a.m.a.b.a(this);
    }

    @Override // d.a.g
    public void d(Throwable th) {
        if (f()) {
            return;
        }
        lazySet(d.a.m.a.b.DISPOSED);
        try {
            this.f4767c.a(th);
        } catch (Throwable th2) {
            d.a.k.b.b(th2);
            d.a.n.a.k(new d.a.k.a(th, th2));
        }
    }

    @Override // d.a.g
    public void e(d.a.j.b bVar) {
        if (d.a.m.a.b.e(this, bVar)) {
            try {
                this.f4769e.a(this);
            } catch (Throwable th) {
                d.a.k.b.b(th);
                d(th);
            }
        }
    }

    public boolean f() {
        return get() == d.a.m.a.b.DISPOSED;
    }
}
