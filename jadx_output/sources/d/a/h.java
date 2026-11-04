package d.a;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f4730a = TimeUnit.MINUTES.toNanos(Long.getLong("rx2.scheduler.drift-tolerance", 15).longValue());

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f4731b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f4732c;

        a(Runnable runnable, b bVar) {
            this.f4731b = runnable;
            this.f4732c = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4731b.run();
            } finally {
                this.f4732c.c();
            }
        }
    }

    public static abstract class b implements d.a.j.b {
        public long a(TimeUnit timeUnit) {
            return timeUnit.convert(System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        public d.a.j.b b(Runnable runnable) {
            return d(runnable, 0L, TimeUnit.NANOSECONDS);
        }

        public abstract d.a.j.b d(Runnable runnable, long j, TimeUnit timeUnit);
    }

    public abstract b a();

    public d.a.j.b b(Runnable runnable) {
        return c(runnable, 0L, TimeUnit.NANOSECONDS);
    }

    public d.a.j.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        b bVarA = a();
        bVarA.d(new a(d.a.n.a.m(runnable), bVarA), j, timeUnit);
        return bVarA;
    }
}
