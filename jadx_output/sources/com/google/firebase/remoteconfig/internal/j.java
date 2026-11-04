package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, j> f4576a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f4577b = new Executor() { // from class: com.google.firebase.remoteconfig.internal.i
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ExecutorService f4578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o f4579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c.b.a.a.c.h<k> f4580e = null;

    private static class b<TResult> implements c.b.a.a.c.e<TResult>, c.b.a.a.c.d, c.b.a.a.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CountDownLatch f4581a;

        private b() {
            this.f4581a = new CountDownLatch(1);
        }

        public boolean a(long j, TimeUnit timeUnit) {
            return this.f4581a.await(j, timeUnit);
        }

        @Override // c.b.a.a.c.b
        public void b() {
            this.f4581a.countDown();
        }

        @Override // c.b.a.a.c.d
        public void c(Exception exc) {
            this.f4581a.countDown();
        }

        @Override // c.b.a.a.c.e
        public void d(TResult tresult) {
            this.f4581a.countDown();
        }
    }

    private j(ExecutorService executorService, o oVar) {
        this.f4578c = executorService;
        this.f4579d = oVar;
    }

    private static <TResult> TResult a(c.b.a.a.c.h<TResult> hVar, long j, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = f4577b;
        hVar.e(executor, bVar);
        hVar.d(executor, bVar);
        hVar.a(executor, bVar);
        if (!bVar.a(j, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (hVar.m()) {
            return hVar.j();
        }
        throw new ExecutionException(hVar.i());
    }

    public static synchronized j f(ExecutorService executorService, o oVar) {
        String strB;
        Map<String, j> map;
        strB = oVar.b();
        map = f4576a;
        if (!map.containsKey(strB)) {
            map.put(strB, new j(executorService, oVar));
        }
        return map.get(strB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Void h(k kVar) {
        return this.f4579d.e(kVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ c.b.a.a.c.h j(boolean z, k kVar, Void r3) {
        if (z) {
            m(kVar);
        }
        return c.b.a.a.c.k.c(kVar);
    }

    private synchronized void m(k kVar) {
        this.f4580e = c.b.a.a.c.k.c(kVar);
    }

    public void b() {
        synchronized (this) {
            this.f4580e = c.b.a.a.c.k.c(null);
        }
        this.f4579d.a();
    }

    public synchronized c.b.a.a.c.h<k> c() {
        c.b.a.a.c.h<k> hVar = this.f4580e;
        if (hVar == null || (hVar.l() && !this.f4580e.m())) {
            ExecutorService executorService = this.f4578c;
            final o oVar = this.f4579d;
            Objects.requireNonNull(oVar);
            this.f4580e = c.b.a.a.c.k.a(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.internal.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return oVar.d();
                }
            });
        }
        return this.f4580e;
    }

    public k d() {
        return e(5L);
    }

    k e(long j) {
        synchronized (this) {
            c.b.a.a.c.h<k> hVar = this.f4580e;
            if (hVar != null && hVar.m()) {
                return this.f4580e.j();
            }
            try {
                return (k) a(c(), j, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                return null;
            }
        }
    }

    public c.b.a.a.c.h<k> k(k kVar) {
        return l(kVar, true);
    }

    public c.b.a.a.c.h<k> l(final k kVar, final boolean z) {
        return c.b.a.a.c.k.a(this.f4578c, new Callable() { // from class: com.google.firebase.remoteconfig.internal.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4557b.h(kVar);
            }
        }).o(this.f4578c, new c.b.a.a.c.g() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // c.b.a.a.c.g
            public final c.b.a.a.c.h a(Object obj) {
                return this.f4559a.j(z, kVar, (Void) obj);
            }
        });
    }
}
