package d.a.m.g;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class h extends d.a.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final e f4833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final ScheduledExecutorService f4834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ThreadFactory f4835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final AtomicReference<ScheduledExecutorService> f4836e;

    static final class a extends d.a.h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ScheduledExecutorService f4837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final d.a.j.a f4838c = new d.a.j.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f4839d;

        a(ScheduledExecutorService scheduledExecutorService) {
            this.f4837b = scheduledExecutorService;
        }

        @Override // d.a.j.b
        public void c() {
            if (this.f4839d) {
                return;
            }
            this.f4839d = true;
            this.f4838c.c();
        }

        @Override // d.a.h.b
        public d.a.j.b d(Runnable runnable, long j, TimeUnit timeUnit) {
            if (this.f4839d) {
                return d.a.m.a.c.INSTANCE;
            }
            f fVar = new f(d.a.n.a.m(runnable), this.f4838c);
            this.f4838c.d(fVar);
            try {
                fVar.a(j <= 0 ? this.f4837b.submit((Callable) fVar) : this.f4837b.schedule((Callable) fVar, j, timeUnit));
                return fVar;
            } catch (RejectedExecutionException e2) {
                c();
                d.a.n.a.k(e2);
                return d.a.m.a.c.INSTANCE;
            }
        }
    }

    static {
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f4834c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.shutdown();
        f4833b = new e("RxSingleScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.single-priority", 5).intValue())), true);
    }

    public h() {
        this(f4833b);
    }

    public h(ThreadFactory threadFactory) {
        AtomicReference<ScheduledExecutorService> atomicReference = new AtomicReference<>();
        this.f4836e = atomicReference;
        this.f4835d = threadFactory;
        atomicReference.lazySet(d(threadFactory));
    }

    static ScheduledExecutorService d(ThreadFactory threadFactory) {
        return g.a(threadFactory);
    }

    @Override // d.a.h
    public d.a.h.b a() {
        return new a(this.f4836e.get());
    }

    @Override // d.a.h
    public d.a.j.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableM = d.a.n.a.m(runnable);
        try {
            return d.a.j.c.b(j <= 0 ? this.f4836e.get().submit(runnableM) : this.f4836e.get().schedule(runnableM, j, timeUnit));
        } catch (RejectedExecutionException e2) {
            d.a.n.a.k(e2);
            return d.a.m.a.c.INSTANCE;
        }
    }
}
