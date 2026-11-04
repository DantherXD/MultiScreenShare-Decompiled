package d.a.m.e.a;

import d.a.f;
import d.a.g;
import d.a.h;
import d.a.m.g.i;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> extends d.a.m.e.a.a<T, T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h f4773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f4774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f4775d;

    static final class a<T> extends d.a.m.d.a<T> implements g<T>, Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final g<? super T> f4776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final h.b f4777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f4778d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final int f4779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        d.a.m.c.c<T> f4780f;
        d.a.j.b g;
        Throwable h;
        volatile boolean i;
        volatile boolean j;
        int k;
        boolean l;

        a(g<? super T> gVar, h.b bVar, boolean z, int i) {
            this.f4776b = gVar;
            this.f4777c = bVar;
            this.f4778d = z;
            this.f4779e = i;
        }

        @Override // d.a.g
        public void a(T t) {
            if (this.i) {
                return;
            }
            if (this.k != 2) {
                this.f4780f.offer(t);
            }
            j();
        }

        @Override // d.a.g
        public void b() {
            if (this.i) {
                return;
            }
            this.i = true;
            j();
        }

        @Override // d.a.j.b
        public void c() {
            if (this.j) {
                return;
            }
            this.j = true;
            this.g.c();
            this.f4777c.c();
            if (getAndIncrement() == 0) {
                this.f4780f.clear();
            }
        }

        @Override // d.a.m.c.c
        public void clear() {
            this.f4780f.clear();
        }

        @Override // d.a.g
        public void d(Throwable th) {
            if (this.i) {
                d.a.n.a.k(th);
                return;
            }
            this.h = th;
            this.i = true;
            j();
        }

        @Override // d.a.g
        public void e(d.a.j.b bVar) {
            if (d.a.m.a.b.f(this.g, bVar)) {
                this.g = bVar;
                if (bVar instanceof d.a.m.c.a) {
                    d.a.m.c.a aVar = (d.a.m.c.a) bVar;
                    int iF = aVar.f(7);
                    if (iF == 1) {
                        this.k = iF;
                        this.f4780f = aVar;
                        this.i = true;
                        this.f4776b.e(this);
                        j();
                        return;
                    }
                    if (iF == 2) {
                        this.k = iF;
                        this.f4780f = aVar;
                        this.f4776b.e(this);
                        return;
                    }
                }
                this.f4780f = new d.a.m.f.a(this.f4779e);
                this.f4776b.e(this);
            }
        }

        @Override // d.a.m.c.b
        public int f(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.l = true;
            return 2;
        }

        boolean g(boolean z, boolean z2, g<? super T> gVar) {
            if (this.j) {
                this.f4780f.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.h;
            if (this.f4778d) {
                if (!z2) {
                    return false;
                }
                if (th != null) {
                    gVar.d(th);
                } else {
                    gVar.b();
                }
                this.f4777c.c();
                return true;
            }
            if (th != null) {
                this.f4780f.clear();
                gVar.d(th);
                this.f4777c.c();
                return true;
            }
            if (!z2) {
                return false;
            }
            gVar.b();
            this.f4777c.c();
            return true;
        }

        void h() {
            int iAddAndGet = 1;
            while (!this.j) {
                boolean z = this.i;
                Throwable th = this.h;
                if (this.f4778d || !z || th == null) {
                    this.f4776b.a(null);
                    if (z) {
                        Throwable th2 = this.h;
                        if (th2 != null) {
                            this.f4776b.d(th2);
                        } else {
                            this.f4776b.b();
                        }
                    } else {
                        iAddAndGet = addAndGet(-iAddAndGet);
                        if (iAddAndGet == 0) {
                            return;
                        }
                    }
                } else {
                    this.f4776b.d(th);
                }
                this.f4777c.c();
                return;
            }
        }

        void i() {
            d.a.m.c.c<T> cVar = this.f4780f;
            g<? super T> gVar = this.f4776b;
            int iAddAndGet = 1;
            while (!g(this.i, cVar.isEmpty(), gVar)) {
                while (true) {
                    boolean z = this.i;
                    try {
                        T tPoll = cVar.poll();
                        boolean z2 = tPoll == null;
                        if (g(z, z2, gVar)) {
                            return;
                        }
                        if (z2) {
                            break;
                        } else {
                            gVar.a(tPoll);
                        }
                    } catch (Throwable th) {
                        d.a.k.b.b(th);
                        this.g.c();
                        cVar.clear();
                        gVar.d(th);
                        this.f4777c.c();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // d.a.m.c.c
        public boolean isEmpty() {
            return this.f4780f.isEmpty();
        }

        void j() {
            if (getAndIncrement() == 0) {
                this.f4777c.b(this);
            }
        }

        @Override // d.a.m.c.c
        public T poll() {
            return this.f4780f.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.l) {
                h();
            } else {
                i();
            }
        }
    }

    public c(f<T> fVar, h hVar, boolean z, int i) {
        super(fVar);
        this.f4773b = hVar;
        this.f4774c = z;
        this.f4775d = i;
    }

    @Override // d.a.c
    protected void h(g<? super T> gVar) {
        h hVar = this.f4773b;
        if (hVar instanceof i) {
            this.f4770a.a(gVar);
        } else {
            this.f4770a.a(new a(gVar, hVar.a(), this.f4774c, this.f4775d));
        }
    }
}
