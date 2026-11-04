package d.a.m.g;

import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d extends d.a.h.b implements d.a.j.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f4821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f4822c;

    public d(ThreadFactory threadFactory) {
        this.f4821b = g.a(threadFactory);
    }

    @Override // d.a.h.b
    public d.a.j.b b(Runnable runnable) {
        return d(runnable, 0L, null);
    }

    @Override // d.a.j.b
    public void c() {
        if (this.f4822c) {
            return;
        }
        this.f4822c = true;
        this.f4821b.shutdownNow();
    }

    @Override // d.a.h.b
    public d.a.j.b d(Runnable runnable, long j, TimeUnit timeUnit) {
        return this.f4822c ? d.a.m.a.c.INSTANCE : e(runnable, j, timeUnit, null);
    }

    public f e(Runnable runnable, long j, TimeUnit timeUnit, d.a.m.a.a aVar) {
        f fVar = new f(d.a.n.a.m(runnable), aVar);
        if (aVar != null && !aVar.d(fVar)) {
            return fVar;
        }
        try {
            fVar.a(j <= 0 ? this.f4821b.submit((Callable) fVar) : this.f4821b.schedule((Callable) fVar, j, timeUnit));
        } catch (RejectedExecutionException e2) {
            if (aVar != null) {
                aVar.b(fVar);
            }
            d.a.n.a.k(e2);
        }
        return fVar;
    }

    public d.a.j.b f(Runnable runnable, long j, TimeUnit timeUnit) {
        Runnable runnableM = d.a.n.a.m(runnable);
        try {
            return d.a.j.c.b(j <= 0 ? this.f4821b.submit(runnableM) : this.f4821b.schedule(runnableM, j, timeUnit));
        } catch (RejectedExecutionException e2) {
            d.a.n.a.k(e2);
            return d.a.m.a.c.INSTANCE;
        }
    }
}
