package d.a.m.e.a;

import d.a.f;
import d.a.g;
import d.a.h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d<T> extends d.a.m.e.a.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h f4781b;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f4782b;

        a(b bVar) {
            this.f4782b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.f4770a.a(this.f4782b);
        }
    }

    static final class b<T> extends AtomicReference<d.a.j.b> implements g<T>, d.a.j.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g<? super T> f4784b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final AtomicReference<d.a.j.b> f4785c = new AtomicReference<>();

        b(g<? super T> gVar) {
            this.f4784b = gVar;
        }

        @Override // d.a.g
        public void a(T t) {
            this.f4784b.a(t);
        }

        @Override // d.a.g
        public void b() {
            this.f4784b.b();
        }

        @Override // d.a.j.b
        public void c() {
            d.a.m.a.b.a(this.f4785c);
            d.a.m.a.b.a(this);
        }

        @Override // d.a.g
        public void d(Throwable th) {
            this.f4784b.d(th);
        }

        @Override // d.a.g
        public void e(d.a.j.b bVar) {
            d.a.m.a.b.e(this.f4785c, bVar);
        }

        void f(d.a.j.b bVar) {
            d.a.m.a.b.e(this, bVar);
        }
    }

    public d(f<T> fVar, h hVar) {
        super(fVar);
        this.f4781b = hVar;
    }

    @Override // d.a.c
    public void h(g<? super T> gVar) {
        b bVar = new b(gVar);
        gVar.e(bVar);
        bVar.f(this.f4781b.b(new a(bVar)));
    }
}
