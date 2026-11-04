package com.blankj.utilcode.util;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f3018a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<Integer, Map<Integer, ExecutorService>> f3019b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<?, ExecutorService> f3020c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f3021d = Runtime.getRuntime().availableProcessors();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Timer f3022e = new Timer();

    private static final class a extends LinkedBlockingQueue<Runnable> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile b f3023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3024c;

        a() {
            this.f3024c = Integer.MAX_VALUE;
        }

        a(boolean z) {
            this.f3024c = Integer.MAX_VALUE;
            if (z) {
                this.f3024c = 0;
            }
        }

        @Override // java.util.concurrent.LinkedBlockingQueue, java.util.Queue, java.util.concurrent.BlockingQueue
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean offer(Runnable runnable) {
            if (this.f3024c > size() || this.f3023b == null || this.f3023b.getPoolSize() >= this.f3023b.getMaximumPoolSize()) {
                return super.offer(runnable);
            }
            return false;
        }
    }

    static final class b extends ThreadPoolExecutor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f3025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a f3026b;

        b(int i, int i2, long j, TimeUnit timeUnit, a aVar, ThreadFactory threadFactory) {
            super(i, i2, j, timeUnit, aVar, threadFactory);
            this.f3025a = new AtomicInteger();
            aVar.f3023b = this;
            this.f3026b = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static ExecutorService b(int i, int i2) {
            if (i == -8) {
                return new b(j.f3021d + 1, (j.f3021d * 2) + 1, 30L, TimeUnit.SECONDS, new a(true), new c("cpu", i2));
            }
            if (i == -4) {
                return new b((j.f3021d * 2) + 1, (j.f3021d * 2) + 1, 30L, TimeUnit.SECONDS, new a(), new c("io", i2));
            }
            if (i == -2) {
                return new b(0, 128, 60L, TimeUnit.SECONDS, new a(true), new c("cached", i2));
            }
            if (i == -1) {
                return new b(1, 1, 0L, TimeUnit.MILLISECONDS, new a(), new c("single", i2));
            }
            return new b(i, i, 0L, TimeUnit.MILLISECONDS, new a(), new c("fixed(" + i + ")", i2));
        }

        @Override // java.util.concurrent.ThreadPoolExecutor
        protected void afterExecute(Runnable runnable, Throwable th) {
            this.f3025a.decrementAndGet();
            super.afterExecute(runnable, th);
        }

        @Override // java.util.concurrent.ThreadPoolExecutor, java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (isShutdown()) {
                return;
            }
            this.f3025a.incrementAndGet();
            try {
                super.execute(runnable);
            } catch (RejectedExecutionException unused) {
                Log.e("ThreadUtils", "This will not happen!");
                this.f3026b.offer(runnable);
            } catch (Throwable unused2) {
                this.f3025a.decrementAndGet();
            }
        }
    }

    static final class c extends AtomicLong implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicInteger f3027b = new AtomicInteger(1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f3028c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f3029d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f3030e;

        class a extends Thread {
            a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                try {
                    super.run();
                } catch (Throwable th) {
                    Log.e("ThreadUtils", "Request threw uncaught throwable", th);
                }
            }
        }

        class b implements Thread.UncaughtExceptionHandler {
            b() {
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public void uncaughtException(Thread thread, Throwable th) {
                System.out.println(th);
            }
        }

        c(String str, int i) {
            this(str, i, false);
        }

        c(String str, int i, boolean z) {
            this.f3028c = str + "-pool-" + f3027b.getAndIncrement() + "-thread-";
            this.f3029d = i;
            this.f3030e = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            a aVar = new a(runnable, this.f3028c + getAndIncrement());
            aVar.setDaemon(this.f3030e);
            aVar.setUncaughtExceptionHandler(new b());
            aVar.setPriority(this.f3029d);
            return aVar;
        }
    }

    public static ExecutorService b() {
        return c(-2);
    }

    private static ExecutorService c(int i) {
        return d(i, 5);
    }

    private static ExecutorService d(int i, int i2) {
        ExecutorService executorServiceB;
        Map<Integer, Map<Integer, ExecutorService>> map = f3019b;
        synchronized (map) {
            Map<Integer, ExecutorService> map2 = map.get(Integer.valueOf(i));
            if (map2 == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                executorServiceB = b.b(i, i2);
                concurrentHashMap.put(Integer.valueOf(i2), executorServiceB);
                map.put(Integer.valueOf(i), concurrentHashMap);
            } else {
                executorServiceB = map2.get(Integer.valueOf(i2));
                if (executorServiceB == null) {
                    executorServiceB = b.b(i, i2);
                    map2.put(Integer.valueOf(i2), executorServiceB);
                }
            }
        }
        return executorServiceB;
    }

    public static void e(Runnable runnable, long j) {
        f3018a.postDelayed(runnable, j);
    }
}
