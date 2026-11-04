package d.a.m.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class a extends d.a.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b f4791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final e f4792c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f4793d = d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final c f4794e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final ThreadFactory f4795f;
    final AtomicReference<b> g;

    /* JADX INFO: renamed from: d.a.m.g.a$a, reason: collision with other inner class name */
    static final class C0114a extends d.a.h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a.m.a.d f4796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d.a.j.a f4797c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d.a.m.a.d f4798d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final c f4799e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        volatile boolean f4800f;

        C0114a(c cVar) {
            this.f4799e = cVar;
            d.a.m.a.d dVar = new d.a.m.a.d();
            this.f4796b = dVar;
            d.a.j.a aVar = new d.a.j.a();
            this.f4797c = aVar;
            d.a.m.a.d dVar2 = new d.a.m.a.d();
            this.f4798d = dVar2;
            dVar2.d(dVar);
            dVar2.d(aVar);
        }

        @Override // d.a.h.b
        public d.a.j.b b(Runnable runnable) {
            return this.f4800f ? d.a.m.a.c.INSTANCE : this.f4799e.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f4796b);
        }

        @Override // d.a.j.b
        public void c() {
            if (this.f4800f) {
                return;
            }
            this.f4800f = true;
            this.f4798d.c();
        }

        @Override // d.a.h.b
        public d.a.j.b d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f4800f ? d.a.m.a.c.INSTANCE : this.f4799e.e(runnable, j, timeUnit, this.f4797c);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4801a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c[] f4802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f4803c;

        b(int i, ThreadFactory threadFactory) {
            this.f4801a = i;
            this.f4802b = new c[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f4802b[i2] = new c(threadFactory);
            }
        }

        public c a() {
            int i = this.f4801a;
            if (i == 0) {
                return a.f4794e;
            }
            c[] cVarArr = this.f4802b;
            long j = this.f4803c;
            this.f4803c = 1 + j;
            return cVarArr[(int) (j % ((long) i))];
        }

        public void b() {
            for (c cVar : this.f4802b) {
                cVar.c();
            }
        }
    }

    static final class c extends d {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new e("RxComputationShutdown"));
        f4794e = cVar;
        cVar.c();
        e eVar = new e("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f4792c = eVar;
        b bVar = new b(0, eVar);
        f4791b = bVar;
        bVar.b();
    }

    public a() {
        this(f4792c);
    }

    public a(ThreadFactory threadFactory) {
        this.f4795f = threadFactory;
        this.g = new AtomicReference<>(f4791b);
        e();
    }

    static int d(int i, int i2) {
        return (i2 <= 0 || i2 > i) ? i : i2;
    }

    @Override // d.a.h
    public d.a.h.b a() {
        return new C0114a(this.g.get().a());
    }

    @Override // d.a.h
    public d.a.j.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.g.get().a().f(runnable, j, timeUnit);
    }

    public void e() {
        b bVar = new b(f4793d, this.f4795f);
        if (this.g.compareAndSet(f4791b, bVar)) {
            return;
        }
        bVar.b();
    }
}
