package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.android.gms.common.util.d f4622a = com.google.android.gms.common.util.e.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Random f4623b = new Random();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, i> f4624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f4625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f4626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.f f4627f;
    private final com.google.firebase.installations.h g;
    private final com.google.firebase.i.c h;
    private final com.google.firebase.n.b<com.google.firebase.j.a.a> i;
    private final String j;
    private Map<String, String> k;

    n(Context context, com.google.firebase.f fVar, com.google.firebase.installations.h hVar, com.google.firebase.i.c cVar, com.google.firebase.n.b<com.google.firebase.j.a.a> bVar) {
        this(context, Executors.newCachedThreadPool(), fVar, hVar, cVar, bVar, true);
    }

    protected n(Context context, ExecutorService executorService, com.google.firebase.f fVar, com.google.firebase.installations.h hVar, com.google.firebase.i.c cVar, com.google.firebase.n.b<com.google.firebase.j.a.a> bVar, boolean z) {
        this.f4624c = new HashMap();
        this.k = new HashMap();
        this.f4625d = context;
        this.f4626e = executorService;
        this.f4627f = fVar;
        this.g = hVar;
        this.h = cVar;
        this.i = bVar;
        this.j = fVar.j().c();
        if (z) {
            c.b.a.a.c.k.a(executorService, new Callable() { // from class: com.google.firebase.remoteconfig.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.f4541b.d();
                }
            });
        }
    }

    private com.google.firebase.remoteconfig.internal.j c(String str, String str2) {
        return com.google.firebase.remoteconfig.internal.j.f(Executors.newCachedThreadPool(), o.c(this.f4625d, String.format("%s_%s_%s_%s.json", "frc", this.j, str, str2)));
    }

    private com.google.firebase.remoteconfig.internal.m g(com.google.firebase.remoteconfig.internal.j jVar, com.google.firebase.remoteconfig.internal.j jVar2) {
        return new com.google.firebase.remoteconfig.internal.m(this.f4626e, jVar, jVar2);
    }

    static com.google.firebase.remoteconfig.internal.n h(Context context, String str, String str2) {
        return new com.google.firebase.remoteconfig.internal.n(context.getSharedPreferences(String.format("%s_%s_%s_%s", "frc", str, str2, "settings"), 0));
    }

    private static p i(com.google.firebase.f fVar, String str, com.google.firebase.n.b<com.google.firebase.j.a.a> bVar) {
        if (k(fVar) && str.equals("firebase")) {
            return new p(bVar);
        }
        return null;
    }

    private static boolean j(com.google.firebase.f fVar, String str) {
        return str.equals("firebase") && k(fVar);
    }

    private static boolean k(com.google.firebase.f fVar) {
        return fVar.i().equals("[DEFAULT]");
    }

    static /* synthetic */ com.google.firebase.j.a.a l() {
        return null;
    }

    synchronized i a(com.google.firebase.f fVar, String str, com.google.firebase.installations.h hVar, com.google.firebase.i.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.j jVar, com.google.firebase.remoteconfig.internal.j jVar2, com.google.firebase.remoteconfig.internal.j jVar3, com.google.firebase.remoteconfig.internal.l lVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.n nVar) {
        if (!this.f4624c.containsKey(str)) {
            i iVar = new i(this.f4625d, fVar, hVar, j(fVar, str) ? cVar : null, executor, jVar, jVar2, jVar3, lVar, mVar, nVar);
            iVar.o();
            this.f4624c.put(str, iVar);
        }
        return this.f4624c.get(str);
    }

    public synchronized i b(String str) {
        com.google.firebase.remoteconfig.internal.j jVarC;
        com.google.firebase.remoteconfig.internal.j jVarC2;
        com.google.firebase.remoteconfig.internal.j jVarC3;
        com.google.firebase.remoteconfig.internal.n nVarH;
        com.google.firebase.remoteconfig.internal.m mVarG;
        jVarC = c(str, "fetch");
        jVarC2 = c(str, "activate");
        jVarC3 = c(str, "defaults");
        nVarH = h(this.f4625d, this.j, str);
        mVarG = g(jVarC2, jVarC3);
        final p pVarI = i(this.f4627f, str, this.i);
        if (pVarI != null) {
            mVarG.a(new com.google.android.gms.common.util.c() { // from class: com.google.firebase.remoteconfig.h
                @Override // com.google.android.gms.common.util.c
                public final void a(Object obj, Object obj2) {
                    pVarI.a((String) obj, (com.google.firebase.remoteconfig.internal.k) obj2);
                }
            });
        }
        return a(this.f4627f, str, this.g, this.h, this.f4626e, jVarC, jVarC2, jVarC3, e(str, jVarC, nVarH), mVarG, nVarH);
    }

    i d() {
        return b("firebase");
    }

    synchronized com.google.firebase.remoteconfig.internal.l e(String str, com.google.firebase.remoteconfig.internal.j jVar, com.google.firebase.remoteconfig.internal.n nVar) {
        return new com.google.firebase.remoteconfig.internal.l(this.g, k(this.f4627f) ? this.i : new com.google.firebase.n.b() { // from class: com.google.firebase.remoteconfig.f
            @Override // com.google.firebase.n.b
            public final Object a() {
                n.l();
                return null;
            }
        }, this.f4626e, f4622a, f4623b, jVar, f(this.f4627f.j().b(), str, nVar), nVar, this.k);
    }

    ConfigFetchHttpClient f(String str, String str2, com.google.firebase.remoteconfig.internal.n nVar) {
        return new ConfigFetchHttpClient(this.f4625d, this.f4627f.j().c(), str, str2, nVar.b(), nVar.b());
    }
}
