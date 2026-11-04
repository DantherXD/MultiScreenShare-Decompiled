package d.a.m.g;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class b extends d.a.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final e f4804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final e f4805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final TimeUnit f4806d = TimeUnit.SECONDS;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final c f4807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final a f4808f;
    final ThreadFactory g;
    final AtomicReference<a> h;

    static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f4809b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ConcurrentLinkedQueue<c> f4810c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d.a.j.a f4811d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ScheduledExecutorService f4812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Future<?> f4813f;
        private final ThreadFactory g;

        a(long j, TimeUnit timeUnit, ThreadFactory threadFactory) {
            ScheduledFuture<?> scheduledFutureScheduleWithFixedDelay;
            long nanos = timeUnit != null ? timeUnit.toNanos(j) : 0L;
            this.f4809b = nanos;
            this.f4810c = new ConcurrentLinkedQueue<>();
            this.f4811d = new d.a.j.a();
            this.g = threadFactory;
            ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = null;
            if (timeUnit != null) {
                scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1, b.f4805c);
                scheduledFutureScheduleWithFixedDelay = scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(this, nanos, nanos, TimeUnit.NANOSECONDS);
            } else {
                scheduledFutureScheduleWithFixedDelay = null;
            }
            this.f4812e = scheduledExecutorServiceNewScheduledThreadPool;
            this.f4813f = scheduledFutureScheduleWithFixedDelay;
        }

        void a() {
            if (this.f4810c.isEmpty()) {
                return;
            }
            long jC = c();
            for (c cVar : this.f4810c) {
                if (cVar.g() > jC) {
                    return;
                }
                if (this.f4810c.remove(cVar)) {
                    this.f4811d.b(cVar);
                }
            }
        }

        c b() {
            if (this.f4811d.f()) {
                return b.f4807e;
            }
            while (!this.f4810c.isEmpty()) {
                c cVarPoll = this.f4810c.poll();
                if (cVarPoll != null) {
                    return cVarPoll;
                }
            }
            c cVar = new c(this.g);
            this.f4811d.d(cVar);
            return cVar;
        }

        long c() {
            return System.nanoTime();
        }

        void d(c cVar) {
            cVar.h(c() + this.f4809b);
            this.f4810c.offer(cVar);
        }

        void e() {
            this.f4811d.c();
            Future<?> future = this.f4813f;
            if (future != null) {
                future.cancel(true);
            }
            ScheduledExecutorService scheduledExecutorService = this.f4812e;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
        }
    }

    /* JADX INFO: renamed from: d.a.m.g.b$b, reason: collision with other inner class name */
    static final class C0115b extends d.a.h.b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f4815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f4816d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final AtomicBoolean f4817e = new AtomicBoolean();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d.a.j.a f4814b = new d.a.j.a();

        C0115b(a aVar) {
            this.f4815c = aVar;
            this.f4816d = aVar.b();
        }

        @Override // d.a.j.b
        public void c() {
            if (this.f4817e.compareAndSet(false, true)) {
                this.f4814b.c();
                this.f4815c.d(this.f4816d);
            }
        }

        @Override // d.a.h.b
        public d.a.j.b d(Runnable runnable, long j, TimeUnit timeUnit) {
            return this.f4814b.f() ? d.a.m.a.c.INSTANCE : this.f4816d.e(runnable, j, timeUnit, this.f4814b);
        }
    }

    static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f4818d;

        c(ThreadFactory threadFactory) {
            super(threadFactory);
            this.f4818d = 0L;
        }

        public long g() {
            return this.f4818d;
        }

        public void h(long j) {
            this.f4818d = j;
        }
    }

    static {
        c cVar = new c(new e("RxCachedThreadSchedulerShutdown"));
        f4807e = cVar;
        cVar.c();
        int iMax = Math.max(1, Math.min(10, Integer.getInteger("rx2.io-priority", 5).intValue()));
        e eVar = new e("RxCachedThreadScheduler", iMax);
        f4804b = eVar;
        f4805c = new e("RxCachedWorkerPoolEvictor", iMax);
        a aVar = new a(0L, null, eVar);
        f4808f = aVar;
        aVar.e();
    }

    public b() {
        this(f4804b);
    }

    public b(ThreadFactory threadFactory) {
        this.g = threadFactory;
        this.h = new AtomicReference<>(f4808f);
        d();
    }

    @Override // d.a.h
    public d.a.h.b a() {
        return new C0115b(this.h.get());
    }

    public void d() {
        a aVar = new a(60L, f4806d, this.g);
        if (this.h.compareAndSet(f4808f, aVar)) {
            return;
        }
        aVar.e();
    }
}
