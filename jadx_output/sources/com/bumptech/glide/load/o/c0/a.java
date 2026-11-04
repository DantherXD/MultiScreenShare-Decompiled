package com.bumptech.glide.load.o.c0;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ExecutorService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f3249a = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile int f3250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f3251c;

    /* JADX INFO: renamed from: com.bumptech.glide.load.o.c0.a$a, reason: collision with other inner class name */
    public static final class C0071a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f3252a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3253b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3254c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private c f3255d = c.f3266d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f3256e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private long f3257f;

        C0071a(boolean z) {
            this.f3252a = z;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f3256e)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f3256e);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f3253b, this.f3254c, this.f3257f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f3256e, this.f3255d, this.f3252a));
            if (this.f3257f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public C0071a b(String str) {
            this.f3256e = str;
            return this;
        }

        public C0071a c(int i) {
            this.f3253b = i;
            this.f3254c = i;
            return this;
        }
    }

    private static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final c f3259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f3260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f3261e;

        /* JADX INFO: renamed from: com.bumptech.glide.load.o.c0.a$b$a, reason: collision with other inner class name */
        class C0072a extends Thread {
            C0072a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                if (b.this.f3260d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f3259c.a(th);
                }
            }
        }

        b(String str, c cVar, boolean z) {
            this.f3258b = str;
            this.f3259c = cVar;
            this.f3260d = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0072a c0072a;
            c0072a = new C0072a(runnable, "glide-" + this.f3258b + "-thread-" + this.f3261e);
            this.f3261e = this.f3261e + 1;
            return c0072a;
        }
    }

    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f3263a = new C0073a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f3264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f3265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f3266d;

        /* JADX INFO: renamed from: com.bumptech.glide.load.o.c0.a$c$a, reason: collision with other inner class name */
        class C0073a implements c {
            C0073a() {
            }

            @Override // com.bumptech.glide.load.o.c0.a.c
            public void a(Throwable th) {
            }
        }

        class b implements c {
            b() {
            }

            @Override // com.bumptech.glide.load.o.c0.a.c
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.load.o.c0.a$c$c, reason: collision with other inner class name */
        class C0074c implements c {
            C0074c() {
            }

            @Override // com.bumptech.glide.load.o.c0.a.c
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f3264b = bVar;
            f3265c = new C0074c();
            f3266d = bVar;
        }

        void a(Throwable th);
    }

    a(ExecutorService executorService) {
        this.f3251c = executorService;
    }

    public static int a() {
        if (f3250b == 0) {
            f3250b = Math.min(4, com.bumptech.glide.load.o.c0.b.a());
        }
        return f3250b;
    }

    public static C0071a b() {
        return new C0071a(true).c(a() >= 4 ? 2 : 1).b("animation");
    }

    public static a c() {
        return b().a();
    }

    public static C0071a d() {
        return new C0071a(true).c(1).b("disk-cache");
    }

    public static a e() {
        return d().a();
    }

    public static C0071a f() {
        return new C0071a(false).c(a()).b("source");
    }

    public static a g() {
        return f().a();
    }

    public static a h() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f3249a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f3266d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.f3251c.awaitTermination(j, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3251c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f3251c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return this.f3251c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f3251c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) {
        return (T) this.f3251c.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f3251c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f3251c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f3251c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f3251c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f3251c.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3251c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f3251c.submit(callable);
    }

    public String toString() {
        return this.f3251c.toString();
    }
}
