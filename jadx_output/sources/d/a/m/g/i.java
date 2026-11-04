package d.a.m.g;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class i extends d.a.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i f4840b = new i();

    static final class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Runnable f4841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c f4842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f4843d;

        a(Runnable runnable, c cVar, long j) {
            this.f4841b = runnable;
            this.f4842c = cVar;
            this.f4843d = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4842c.f4851e) {
                return;
            }
            long jA = this.f4842c.a(TimeUnit.MILLISECONDS);
            long j = this.f4843d;
            if (j > jA) {
                long j2 = j - jA;
                if (j2 > 0) {
                    try {
                        Thread.sleep(j2);
                    } catch (InterruptedException e2) {
                        Thread.currentThread().interrupt();
                        d.a.n.a.k(e2);
                        return;
                    }
                }
            }
            if (this.f4842c.f4851e) {
                return;
            }
            this.f4841b.run();
        }
    }

    static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Runnable f4844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f4845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f4846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f4847e;

        b(Runnable runnable, Long l, int i) {
            this.f4844b = runnable;
            this.f4845c = l.longValue();
            this.f4846d = i;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            int iB = d.a.m.b.b.b(this.f4845c, bVar.f4845c);
            return iB == 0 ? d.a.m.b.b.a(this.f4846d, bVar.f4846d) : iB;
        }
    }

    static final class c extends d.a.h.b implements d.a.j.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final PriorityBlockingQueue<b> f4848b = new PriorityBlockingQueue<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f4849c = new AtomicInteger();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final AtomicInteger f4850d = new AtomicInteger();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f4851e;

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f4852b;

            a(b bVar) {
                this.f4852b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f4852b.f4847e = true;
                c.this.f4848b.remove(this.f4852b);
            }
        }

        c() {
        }

        @Override // d.a.h.b
        public d.a.j.b b(Runnable runnable) {
            return e(runnable, a(TimeUnit.MILLISECONDS));
        }

        @Override // d.a.j.b
        public void c() {
            this.f4851e = true;
        }

        @Override // d.a.h.b
        public d.a.j.b d(Runnable runnable, long j, TimeUnit timeUnit) {
            long jA = a(TimeUnit.MILLISECONDS) + timeUnit.toMillis(j);
            return e(new a(runnable, this, jA), jA);
        }

        d.a.j.b e(Runnable runnable, long j) {
            if (this.f4851e) {
                return d.a.m.a.c.INSTANCE;
            }
            b bVar = new b(runnable, Long.valueOf(j), this.f4850d.incrementAndGet());
            this.f4848b.add(bVar);
            if (this.f4849c.getAndIncrement() != 0) {
                return d.a.j.c.d(new a(bVar));
            }
            int iAddAndGet = 1;
            while (true) {
                b bVarPoll = this.f4848b.poll();
                if (bVarPoll == null) {
                    iAddAndGet = this.f4849c.addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return d.a.m.a.c.INSTANCE;
                    }
                } else if (!bVarPoll.f4847e) {
                    bVarPoll.f4844b.run();
                }
            }
        }
    }

    i() {
    }

    public static i d() {
        return f4840b;
    }

    @Override // d.a.h
    public d.a.h.b a() {
        return new c();
    }

    @Override // d.a.h
    public d.a.j.b b(Runnable runnable) {
        runnable.run();
        return d.a.m.a.c.INSTANCE;
    }

    @Override // d.a.h
    public d.a.j.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            runnable.run();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            d.a.n.a.k(e2);
        }
        return d.a.m.a.c.INSTANCE;
    }
}
