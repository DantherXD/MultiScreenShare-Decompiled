package com.google.firebase.installations;

import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f4418a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadFactory f4419b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.f f4420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.r.c f4421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.firebase.installations.q.c f4422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final o f4423f;
    private final com.google.firebase.installations.q.b g;
    private final m h;
    private final Object i;
    private final ExecutorService j;
    private final ExecutorService k;
    private String l;
    private Set<com.google.firebase.installations.p.a> m;
    private final List<n> n;

    class a implements ThreadFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f4424b = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f4424b.getAndIncrement())));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f4426b;

        static {
            int[] iArr = new int[com.google.firebase.installations.r.f.b.values().length];
            f4426b = iArr;
            try {
                iArr[com.google.firebase.installations.r.f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4426b[com.google.firebase.installations.r.f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4426b[com.google.firebase.installations.r.f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.google.firebase.installations.r.d.b.values().length];
            f4425a = iArr2;
            try {
                iArr2[com.google.firebase.installations.r.d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4425a[com.google.firebase.installations.r.d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    g(com.google.firebase.f fVar, com.google.firebase.n.b<com.google.firebase.p.i> bVar, com.google.firebase.n.b<com.google.firebase.m.f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4419b), fVar, new com.google.firebase.installations.r.c(fVar.g(), bVar, bVar2), new com.google.firebase.installations.q.c(fVar), o.c(), new com.google.firebase.installations.q.b(fVar), new m());
    }

    g(ExecutorService executorService, com.google.firebase.f fVar, com.google.firebase.installations.r.c cVar, com.google.firebase.installations.q.c cVar2, o oVar, com.google.firebase.installations.q.b bVar, m mVar) {
        this.i = new Object();
        this.m = new HashSet();
        this.n = new ArrayList();
        this.f4420c = fVar;
        this.f4421d = cVar;
        this.f4422e = cVar2;
        this.f4423f = oVar;
        this.g = bVar;
        this.h = mVar;
        this.j = executorService;
        this.k = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4419b);
    }

    private synchronized void A(String str) {
        this.l = str;
    }

    private synchronized void B(com.google.firebase.installations.q.d dVar, com.google.firebase.installations.q.d dVar2) {
        if (this.m.size() != 0 && !dVar.d().equals(dVar2.d())) {
            Iterator<com.google.firebase.installations.p.a> it = this.m.iterator();
            while (it.hasNext()) {
                it.next().a(dVar2.d());
            }
        }
    }

    private c.b.a.a.c.h<l> c() {
        c.b.a.a.c.i iVar = new c.b.a.a.c.i();
        e(new j(this.f4423f, iVar));
        return iVar.a();
    }

    private c.b.a.a.c.h<String> d() {
        c.b.a.a.c.i iVar = new c.b.a.a.c.i();
        e(new k(iVar));
        return iVar.a();
    }

    private void e(n nVar) {
        synchronized (this.i) {
            this.n.add(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void q(boolean z) {
        com.google.firebase.installations.q.d dVarX;
        Exception iOException;
        com.google.firebase.installations.q.d dVarL = l();
        try {
            if (dVarL.i() || dVarL.l()) {
                dVarX = x(dVarL);
            } else {
                if (!z && !this.f4423f.f(dVarL)) {
                    return;
                }
                dVarX = h(dVarL);
            }
            o(dVarX);
            B(dVarL, dVarX);
            if (dVarX.k()) {
                A(dVarX.d());
            }
            if (dVarX.i()) {
                iOException = new i(i.a.BAD_CONFIG);
            } else {
                if (!dVarX.j()) {
                    z(dVarX);
                    return;
                }
                iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
            }
            y(iOException);
        } catch (i e2) {
            y(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void u(final boolean z) {
        com.google.firebase.installations.q.d dVarM = m();
        if (z) {
            dVarM = dVarM.p();
        }
        z(dVarM);
        this.k.execute(new Runnable() { // from class: com.google.firebase.installations.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f4404b.q(z);
            }
        });
    }

    private com.google.firebase.installations.q.d h(com.google.firebase.installations.q.d dVar) throws i {
        com.google.firebase.installations.r.f fVarE = this.f4421d.e(i(), dVar.d(), n(), dVar.f());
        int i = b.f4426b[fVarE.b().ordinal()];
        if (i == 1) {
            return dVar.o(fVarE.c(), fVarE.d(), this.f4423f.b());
        }
        if (i == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i != 3) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
        }
        A(null);
        return dVar.r();
    }

    private synchronized String k() {
        return this.l;
    }

    private com.google.firebase.installations.q.d l() {
        com.google.firebase.installations.q.d dVarC;
        synchronized (f4418a) {
            f fVarA = f.a(this.f4420c.g(), "generatefid.lock");
            try {
                dVarC = this.f4422e.c();
                if (fVarA != null) {
                    fVarA.b();
                }
            } catch (Throwable th) {
                if (fVarA != null) {
                    fVarA.b();
                }
                throw th;
            }
        }
        return dVarC;
    }

    private com.google.firebase.installations.q.d m() {
        com.google.firebase.installations.q.d dVarC;
        synchronized (f4418a) {
            f fVarA = f.a(this.f4420c.g(), "generatefid.lock");
            try {
                dVarC = this.f4422e.c();
                if (dVarC.j()) {
                    dVarC = this.f4422e.a(dVarC.t(w(dVarC)));
                }
                if (fVarA != null) {
                    fVarA.b();
                }
            } catch (Throwable th) {
                if (fVarA != null) {
                    fVarA.b();
                }
                throw th;
            }
        }
        return dVarC;
    }

    private void o(com.google.firebase.installations.q.d dVar) {
        synchronized (f4418a) {
            f fVarA = f.a(this.f4420c.g(), "generatefid.lock");
            try {
                this.f4422e.a(dVar);
                if (fVarA != null) {
                    fVarA.b();
                }
            } catch (Throwable th) {
                if (fVarA != null) {
                    fVarA.b();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void s() {
        t(false);
    }

    private void v() {
        com.google.android.gms.common.internal.b.c(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.b.c(n(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.b.c(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.b.a(o.h(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        com.google.android.gms.common.internal.b.a(o.g(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String w(com.google.firebase.installations.q.d dVar) {
        if ((!this.f4420c.i().equals("CHIME_ANDROID_SDK") && !this.f4420c.p()) || !dVar.m()) {
            return this.h.a();
        }
        String strF = this.g.f();
        return TextUtils.isEmpty(strF) ? this.h.a() : strF;
    }

    private com.google.firebase.installations.q.d x(com.google.firebase.installations.q.d dVar) throws i {
        com.google.firebase.installations.r.d dVarD = this.f4421d.d(i(), dVar.d(), n(), j(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.g.i());
        int i = b.f4425a[dVarD.e().ordinal()];
        if (i == 1) {
            return dVar.s(dVarD.c(), dVarD.d(), this.f4423f.b(), dVarD.b().c(), dVarD.b().d());
        }
        if (i == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    private void y(Exception exc) {
        synchronized (this.i) {
            Iterator<n> it = this.n.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    private void z(com.google.firebase.installations.q.d dVar) {
        synchronized (this.i) {
            Iterator<n> it = this.n.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.google.firebase.installations.h
    public c.b.a.a.c.h<String> a() {
        v();
        String strK = k();
        if (strK != null) {
            return c.b.a.a.c.k.c(strK);
        }
        c.b.a.a.c.h<String> hVarD = d();
        this.j.execute(new Runnable() { // from class: com.google.firebase.installations.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f4406b.s();
            }
        });
        return hVarD;
    }

    @Override // com.google.firebase.installations.h
    public c.b.a.a.c.h<l> b(final boolean z) {
        v();
        c.b.a.a.c.h<l> hVarC = c();
        this.j.execute(new Runnable() { // from class: com.google.firebase.installations.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f4407b.u(z);
            }
        });
        return hVarC;
    }

    String i() {
        return this.f4420c.j().b();
    }

    String j() {
        return this.f4420c.j().c();
    }

    String n() {
        return this.f4420c.j().e();
    }
}
