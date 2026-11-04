package a.g.i;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
class g {

    private static class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f549c;

        /* JADX INFO: renamed from: a.g.i.g$a$a, reason: collision with other inner class name */
        private static class C0014a extends Thread {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f550b;

            C0014a(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.f550b = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f550b);
                super.run();
            }
        }

        a(String str, int i) {
            this.f548b = str;
            this.f549c = i;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0014a(runnable, this.f548b, this.f549c);
        }
    }

    private static class b<T> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Callable<T> f551b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private a.g.k.a<T> f552c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Handler f553d;

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.g.k.a f554b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f555c;

            a(a.g.k.a aVar, Object obj) {
                this.f554b = aVar;
                this.f555c = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f554b.a(this.f555c);
            }
        }

        b(Handler handler, Callable<T> callable, a.g.k.a<T> aVar) {
            this.f551b = callable;
            this.f552c = aVar;
            this.f553d = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f551b.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f553d.post(new a(this.f552c, tCall));
        }
    }

    static ThreadPoolExecutor a(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static <T> void b(Executor executor, Callable<T> callable, a.g.k.a<T> aVar) {
        executor.execute(new b(a.g.i.b.a(), callable, aVar));
    }

    static <T> T c(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
