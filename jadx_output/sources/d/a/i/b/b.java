package d.a.i.b;

import android.os.Handler;
import android.os.Message;
import d.a.h;
import d.a.j.c;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class b extends h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f4738b;

    private static final class a extends h.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f4739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f4740c;

        a(Handler handler) {
            this.f4739b = handler;
        }

        @Override // d.a.j.b
        public void c() {
            this.f4740c = true;
            this.f4739b.removeCallbacksAndMessages(this);
        }

        @Override // d.a.h.b
        public d.a.j.b d(Runnable runnable, long j, TimeUnit timeUnit) {
            Objects.requireNonNull(runnable, "run == null");
            Objects.requireNonNull(timeUnit, "unit == null");
            if (this.f4740c) {
                return c.a();
            }
            RunnableC0111b runnableC0111b = new RunnableC0111b(this.f4739b, d.a.n.a.m(runnable));
            Message messageObtain = Message.obtain(this.f4739b, runnableC0111b);
            messageObtain.obj = this;
            this.f4739b.sendMessageDelayed(messageObtain, Math.max(0L, timeUnit.toMillis(j)));
            if (!this.f4740c) {
                return runnableC0111b;
            }
            this.f4739b.removeCallbacks(runnableC0111b);
            return c.a();
        }
    }

    /* JADX INFO: renamed from: d.a.i.b.b$b, reason: collision with other inner class name */
    private static final class RunnableC0111b implements Runnable, d.a.j.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f4741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f4742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile boolean f4743d;

        RunnableC0111b(Handler handler, Runnable runnable) {
            this.f4741b = handler;
            this.f4742c = runnable;
        }

        @Override // d.a.j.b
        public void c() {
            this.f4743d = true;
            this.f4741b.removeCallbacks(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f4742c.run();
            } catch (Throwable th) {
                IllegalStateException illegalStateException = new IllegalStateException("Fatal Exception thrown on Scheduler.", th);
                d.a.n.a.k(illegalStateException);
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, illegalStateException);
            }
        }
    }

    b(Handler handler) {
        this.f4738b = handler;
    }

    @Override // d.a.h
    public h.b a() {
        return new a(this.f4738b);
    }

    @Override // d.a.h
    public d.a.j.b c(Runnable runnable, long j, TimeUnit timeUnit) {
        Objects.requireNonNull(runnable, "run == null");
        Objects.requireNonNull(timeUnit, "unit == null");
        RunnableC0111b runnableC0111b = new RunnableC0111b(this.f4738b, d.a.n.a.m(runnable));
        this.f4738b.postDelayed(runnableC0111b, Math.max(0L, timeUnit.toMillis(j)));
        return runnableC0111b;
    }
}
