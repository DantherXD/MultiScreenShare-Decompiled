package d.a.m.e.a;

import d.a.e;
import d.a.g;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b<T> extends d.a.c<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e<T> f4771a;

    static final class a<T> extends AtomicReference<d.a.j.b> implements d.a.d<T>, d.a.j.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g<? super T> f4772b;

        a(g<? super T> gVar) {
            this.f4772b = gVar;
        }

        @Override // d.a.a
        public void a(T t) {
            if (t == null) {
                d(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            } else {
                if (b()) {
                    return;
                }
                this.f4772b.a(t);
            }
        }

        public boolean b() {
            return d.a.m.a.b.b(get());
        }

        @Override // d.a.j.b
        public void c() {
            d.a.m.a.b.a(this);
        }

        public void d(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            if (b()) {
                d.a.n.a.k(th);
                return;
            }
            try {
                this.f4772b.d(th);
            } finally {
                c();
            }
        }
    }

    public b(e<T> eVar) {
        this.f4771a = eVar;
    }

    @Override // d.a.c
    protected void h(g<? super T> gVar) {
        a aVar = new a(gVar);
        gVar.e(aVar);
        try {
            this.f4771a.a(aVar);
        } catch (Throwable th) {
            d.a.k.b.b(th);
            aVar.d(th);
        }
    }
}
