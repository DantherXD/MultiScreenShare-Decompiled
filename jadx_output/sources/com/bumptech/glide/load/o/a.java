package com.bumptech.glide.load.o;

import android.os.Process;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f3163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f3164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<com.bumptech.glide.load.g, d> f3165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f3166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p.a f3167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f3168f;
    private volatile c g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.o.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0068a implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.o.a$a$a, reason: collision with other inner class name */
        class RunnableC0069a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Runnable f3169b;

            RunnableC0069a(Runnable runnable) {
                this.f3169b = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f3169b.run();
            }
        }

        ThreadFactoryC0068a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0069a(runnable), "glide-active-resources");
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    interface c {
        void a();
    }

    static final class d extends WeakReference<p<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.g f3172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f3173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        v<?> f3174c;

        d(com.bumptech.glide.load.g gVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            this.f3172a = (com.bumptech.glide.load.g) com.bumptech.glide.t.j.d(gVar);
            this.f3174c = (pVar.g() && z) ? (v) com.bumptech.glide.t.j.d(pVar.e()) : null;
            this.f3173b = pVar.g();
        }

        void a() {
            this.f3174c = null;
            clear();
        }
    }

    a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC0068a()));
    }

    a(boolean z, Executor executor) {
        this.f3165c = new HashMap();
        this.f3166d = new ReferenceQueue<>();
        this.f3163a = z;
        this.f3164b = executor;
        executor.execute(new b());
    }

    synchronized void a(com.bumptech.glide.load.g gVar, p<?> pVar) {
        d dVarPut = this.f3165c.put(gVar, new d(gVar, pVar, this.f3166d, this.f3163a));
        if (dVarPut != null) {
            dVarPut.a();
        }
    }

    void b() {
        while (!this.f3168f) {
            try {
                c((d) this.f3166d.remove());
                c cVar = this.g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(d dVar) {
        v<?> vVar;
        synchronized (this) {
            this.f3165c.remove(dVar.f3172a);
            if (dVar.f3173b && (vVar = dVar.f3174c) != null) {
                this.f3167e.a(dVar.f3172a, new p<>(vVar, true, false, dVar.f3172a, this.f3167e));
            }
        }
    }

    synchronized void d(com.bumptech.glide.load.g gVar) {
        d dVarRemove = this.f3165c.remove(gVar);
        if (dVarRemove != null) {
            dVarRemove.a();
        }
    }

    synchronized p<?> e(com.bumptech.glide.load.g gVar) {
        d dVar = this.f3165c.get(gVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f3167e = aVar;
            }
        }
    }
}
