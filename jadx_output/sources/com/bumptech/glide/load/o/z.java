package com.bumptech.glide.load.o;

import android.util.Log;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class z implements f, f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<?> f3388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.a f3389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f3391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f3392f;
    private volatile com.bumptech.glide.load.p.n.a<?> g;
    private d h;

    class a implements com.bumptech.glide.load.n.d.a<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.p.n.a f3393b;

        a(com.bumptech.glide.load.p.n.a aVar) {
            this.f3393b = aVar;
        }

        @Override // com.bumptech.glide.load.n.d.a
        public void d(Exception exc) {
            if (z.this.g(this.f3393b)) {
                z.this.i(this.f3393b, exc);
            }
        }

        @Override // com.bumptech.glide.load.n.d.a
        public void f(Object obj) {
            if (z.this.g(this.f3393b)) {
                z.this.h(this.f3393b, obj);
            }
        }
    }

    z(g<?> gVar, f.a aVar) {
        this.f3388b = gVar;
        this.f3389c = aVar;
    }

    private void e(Object obj) {
        long jB = com.bumptech.glide.t.f.b();
        try {
            com.bumptech.glide.load.d<X> dVarP = this.f3388b.p(obj);
            e eVar = new e(dVarP, obj, this.f3388b.k());
            this.h = new d(this.g.f3443a, this.f3388b.o());
            this.f3388b.d().a(this.h, eVar);
            if (Log.isLoggable("SourceGenerator", 2)) {
                Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.h + ", data: " + obj + ", encoder: " + dVarP + ", duration: " + com.bumptech.glide.t.f.a(jB));
            }
            this.g.f3445c.b();
            this.f3391e = new c(Collections.singletonList(this.g.f3443a), this.f3388b, this);
        } catch (Throwable th) {
            this.g.f3445c.b();
            throw th;
        }
    }

    private boolean f() {
        return this.f3390d < this.f3388b.g().size();
    }

    private void j(com.bumptech.glide.load.p.n.a<?> aVar) {
        this.g.f3445c.e(this.f3388b.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.o.f
    public boolean a() {
        Object obj = this.f3392f;
        if (obj != null) {
            this.f3392f = null;
            e(obj);
        }
        c cVar = this.f3391e;
        if (cVar != null && cVar.a()) {
            return true;
        }
        this.f3391e = null;
        this.g = null;
        boolean z = false;
        while (!z && f()) {
            List<com.bumptech.glide.load.p.n.a<?>> listG = this.f3388b.g();
            int i = this.f3390d;
            this.f3390d = i + 1;
            this.g = listG.get(i);
            if (this.g != null && (this.f3388b.e().c(this.g.f3445c.c()) || this.f3388b.t(this.g.f3445c.a()))) {
                j(this.g);
                z = true;
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.load.o.f.a
    public void b() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.o.f.a
    public void c(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.n.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.f3389c.c(gVar, obj, dVar, this.g.f3445c.c(), gVar);
    }

    @Override // com.bumptech.glide.load.o.f
    public void cancel() {
        com.bumptech.glide.load.p.n.a<?> aVar = this.g;
        if (aVar != null) {
            aVar.f3445c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.o.f.a
    public void d(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.n.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f3389c.d(gVar, exc, dVar, this.g.f3445c.c());
    }

    boolean g(com.bumptech.glide.load.p.n.a<?> aVar) {
        com.bumptech.glide.load.p.n.a<?> aVar2 = this.g;
        return aVar2 != null && aVar2 == aVar;
    }

    void h(com.bumptech.glide.load.p.n.a<?> aVar, Object obj) {
        j jVarE = this.f3388b.e();
        if (obj != null && jVarE.c(aVar.f3445c.c())) {
            this.f3392f = obj;
            this.f3389c.b();
        } else {
            f.a aVar2 = this.f3389c;
            com.bumptech.glide.load.g gVar = aVar.f3443a;
            com.bumptech.glide.load.n.d<?> dVar = aVar.f3445c;
            aVar2.c(gVar, obj, dVar, dVar.c(), this.h);
        }
    }

    void i(com.bumptech.glide.load.p.n.a<?> aVar, Exception exc) {
        f.a aVar2 = this.f3389c;
        d dVar = this.h;
        com.bumptech.glide.load.n.d<?> dVar2 = aVar.f3445c;
        aVar2.d(dVar, exc, dVar2, dVar2.c());
    }
}
