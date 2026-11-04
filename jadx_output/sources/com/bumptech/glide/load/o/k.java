package com.bumptech.glide.load.o;

import android.util.Log;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class k implements m, com.bumptech.glide.load.o.b0.h.a, p.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f3314a = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f3315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f3316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.o.b0.h f3317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f3318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f3319f;
    private final c g;
    private final a h;
    private final com.bumptech.glide.load.o.a i;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h.e f3320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final a.g.k.e<h<?>> f3321b = com.bumptech.glide.t.l.a.d(150, new C0076a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3322c;

        /* JADX INFO: renamed from: com.bumptech.glide.load.o.k$a$a, reason: collision with other inner class name */
        class C0076a implements com.bumptech.glide.t.l.a.d<h<?>> {
            C0076a() {
            }

            @Override // com.bumptech.glide.t.l.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f3320a, aVar.f3321b);
            }
        }

        a(h.e eVar) {
            this.f3320a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.i iVar, h.b<R> bVar) {
            h hVar = (h) com.bumptech.glide.t.j.d(this.f3321b.b());
            int i3 = this.f3322c;
            this.f3322c = i3 + 1;
            return hVar.n(eVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z3, iVar, bVar, i3);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.o.c0.a f3324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.o.c0.a f3325b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.o.c0.a f3326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.o.c0.a f3327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final m f3328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final p.a f3329f;
        final a.g.k.e<l<?>> g = com.bumptech.glide.t.l.a.d(150, new a());

        class a implements com.bumptech.glide.t.l.a.d<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.t.l.a.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.f3324a, bVar.f3325b, bVar.f3326c, bVar.f3327d, bVar.f3328e, bVar.f3329f, bVar.g);
            }
        }

        b(com.bumptech.glide.load.o.c0.a aVar, com.bumptech.glide.load.o.c0.a aVar2, com.bumptech.glide.load.o.c0.a aVar3, com.bumptech.glide.load.o.c0.a aVar4, m mVar, p.a aVar5) {
            this.f3324a = aVar;
            this.f3325b = aVar2;
            this.f3326c = aVar3;
            this.f3327d = aVar4;
            this.f3328e = mVar;
            this.f3329f = aVar5;
        }

        <R> l<R> a(com.bumptech.glide.load.g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((l) com.bumptech.glide.t.j.d(this.g.b())).l(gVar, z, z2, z3, z4);
        }
    }

    private static class c implements h.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.o.b0.a.InterfaceC0070a f3331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile com.bumptech.glide.load.o.b0.a f3332b;

        c(com.bumptech.glide.load.o.b0.a.InterfaceC0070a interfaceC0070a) {
            this.f3331a = interfaceC0070a;
        }

        @Override // com.bumptech.glide.load.o.h.e
        public com.bumptech.glide.load.o.b0.a a() {
            if (this.f3332b == null) {
                synchronized (this) {
                    if (this.f3332b == null) {
                        this.f3332b = this.f3331a.a();
                    }
                    if (this.f3332b == null) {
                        this.f3332b = new com.bumptech.glide.load.o.b0.b();
                    }
                }
            }
            return this.f3332b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l<?> f3333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.r.g f3334b;

        d(com.bumptech.glide.r.g gVar, l<?> lVar) {
            this.f3334b = gVar;
            this.f3333a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f3333a.r(this.f3334b);
            }
        }
    }

    k(com.bumptech.glide.load.o.b0.h hVar, com.bumptech.glide.load.o.b0.a.InterfaceC0070a interfaceC0070a, com.bumptech.glide.load.o.c0.a aVar, com.bumptech.glide.load.o.c0.a aVar2, com.bumptech.glide.load.o.c0.a aVar3, com.bumptech.glide.load.o.c0.a aVar4, s sVar, o oVar, com.bumptech.glide.load.o.a aVar5, b bVar, a aVar6, y yVar, boolean z) {
        this.f3317d = hVar;
        c cVar = new c(interfaceC0070a);
        this.g = cVar;
        com.bumptech.glide.load.o.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.o.a(z) : aVar5;
        this.i = aVar7;
        aVar7.f(this);
        this.f3316c = oVar == null ? new o() : oVar;
        this.f3315b = sVar == null ? new s() : sVar;
        this.f3318e = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.h = aVar6 == null ? new a(cVar) : aVar6;
        this.f3319f = yVar == null ? new y() : yVar;
        hVar.e(this);
    }

    public k(com.bumptech.glide.load.o.b0.h hVar, com.bumptech.glide.load.o.b0.a.InterfaceC0070a interfaceC0070a, com.bumptech.glide.load.o.c0.a aVar, com.bumptech.glide.load.o.c0.a aVar2, com.bumptech.glide.load.o.c0.a aVar3, com.bumptech.glide.load.o.c0.a aVar4, boolean z) {
        this(hVar, interfaceC0070a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z);
    }

    private p<?> e(com.bumptech.glide.load.g gVar) {
        v<?> vVarD = this.f3317d.d(gVar);
        if (vVarD == null) {
            return null;
        }
        return vVarD instanceof p ? (p) vVarD : new p<>(vVarD, true, true, gVar, this);
    }

    private p<?> g(com.bumptech.glide.load.g gVar) {
        p<?> pVarE = this.i.e(gVar);
        if (pVarE != null) {
            pVarE.c();
        }
        return pVarE;
    }

    private p<?> h(com.bumptech.glide.load.g gVar) {
        p<?> pVarE = e(gVar);
        if (pVarE != null) {
            pVarE.c();
            this.i.a(gVar, pVarE);
        }
        return pVarE;
    }

    private p<?> i(n nVar, boolean z, long j) {
        if (!z) {
            return null;
        }
        p<?> pVarG = g(nVar);
        if (pVarG != null) {
            if (f3314a) {
                j("Loaded resource from active resources", j, nVar);
            }
            return pVarG;
        }
        p<?> pVarH = h(nVar);
        if (pVarH == null) {
            return null;
        }
        if (f3314a) {
            j("Loaded resource from cache", j, nVar);
        }
        return pVarH;
    }

    private static void j(String str, long j, com.bumptech.glide.load.g gVar) {
        Log.v("Engine", str + " in " + com.bumptech.glide.t.f.a(j) + "ms, key: " + gVar);
    }

    private <R> d l(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, com.bumptech.glide.load.i iVar, boolean z3, boolean z4, boolean z5, boolean z6, com.bumptech.glide.r.g gVar3, Executor executor, n nVar, long j) {
        l<?> lVarA = this.f3315b.a(nVar, z6);
        if (lVarA != null) {
            lVarA.b(gVar3, executor);
            if (f3314a) {
                j("Added to existing load", j, nVar);
            }
            return new d(gVar3, lVarA);
        }
        l<R> lVarA2 = this.f3318e.a(nVar, z3, z4, z5, z6);
        h<R> hVarA = this.h.a(eVar, obj, nVar, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, z6, iVar, lVarA2);
        this.f3315b.c(nVar, lVarA2);
        lVarA2.b(gVar3, executor);
        lVarA2.s(hVarA);
        if (f3314a) {
            j("Started new load", j, nVar);
        }
        return new d(gVar3, lVarA2);
    }

    @Override // com.bumptech.glide.load.o.p.a
    public void a(com.bumptech.glide.load.g gVar, p<?> pVar) {
        this.i.d(gVar);
        if (pVar.g()) {
            this.f3317d.c(gVar, pVar);
        } else {
            this.f3319f.a(pVar, false);
        }
    }

    @Override // com.bumptech.glide.load.o.b0.h.a
    public void b(v<?> vVar) {
        this.f3319f.a(vVar, true);
    }

    @Override // com.bumptech.glide.load.o.m
    public synchronized void c(l<?> lVar, com.bumptech.glide.load.g gVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.g()) {
                this.i.a(gVar, pVar);
            }
        }
        this.f3315b.d(gVar, lVar);
    }

    @Override // com.bumptech.glide.load.o.m
    public synchronized void d(l<?> lVar, com.bumptech.glide.load.g gVar) {
        this.f3315b.d(gVar, lVar);
    }

    public <R> d f(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, com.bumptech.glide.load.i iVar, boolean z3, boolean z4, boolean z5, boolean z6, com.bumptech.glide.r.g gVar3, Executor executor) {
        long jB = f3314a ? com.bumptech.glide.t.f.b() : 0L;
        n nVarA = this.f3316c.a(obj, gVar, i, i2, map, cls, cls2, iVar);
        synchronized (this) {
            p<?> pVarI = i(nVarA, z3, jB);
            if (pVarI == null) {
                return l(eVar, obj, gVar, i, i2, cls, cls2, gVar2, jVar, map, z, z2, iVar, z3, z4, z5, z6, gVar3, executor, nVarA, jB);
            }
            gVar3.c(pVarI, com.bumptech.glide.load.a.MEMORY_CACHE);
            return null;
        }
    }

    public void k(v<?> vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).h();
    }
}
