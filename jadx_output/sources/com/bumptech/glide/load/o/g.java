package com.bumptech.glide.load.o;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class g<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.bumptech.glide.load.p.n.a<?>> f3273a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.g> f3274b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.e f3275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f3276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3278f;
    private Class<?> g;
    private h.e h;
    private com.bumptech.glide.load.i i;
    private Map<Class<?>, com.bumptech.glide.load.m<?>> j;
    private Class<Transcode> k;
    private boolean l;
    private boolean m;
    private com.bumptech.glide.load.g n;
    private com.bumptech.glide.g o;
    private j p;
    private boolean q;
    private boolean r;

    g() {
    }

    void a() {
        this.f3275c = null;
        this.f3276d = null;
        this.n = null;
        this.g = null;
        this.k = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.p = null;
        this.f3273a.clear();
        this.l = false;
        this.f3274b.clear();
        this.m = false;
    }

    com.bumptech.glide.load.o.a0.b b() {
        return this.f3275c.b();
    }

    List<com.bumptech.glide.load.g> c() {
        if (!this.m) {
            this.m = true;
            this.f3274b.clear();
            List<com.bumptech.glide.load.p.n.a<?>> listG = g();
            int size = listG.size();
            for (int i = 0; i < size; i++) {
                com.bumptech.glide.load.p.n.a<?> aVar = listG.get(i);
                if (!this.f3274b.contains(aVar.f3443a)) {
                    this.f3274b.add(aVar.f3443a);
                }
                for (int i2 = 0; i2 < aVar.f3444b.size(); i2++) {
                    if (!this.f3274b.contains(aVar.f3444b.get(i2))) {
                        this.f3274b.add(aVar.f3444b.get(i2));
                    }
                }
            }
        }
        return this.f3274b;
    }

    com.bumptech.glide.load.o.b0.a d() {
        return this.h.a();
    }

    j e() {
        return this.p;
    }

    int f() {
        return this.f3278f;
    }

    List<com.bumptech.glide.load.p.n.a<?>> g() {
        if (!this.l) {
            this.l = true;
            this.f3273a.clear();
            List listI = this.f3275c.h().i(this.f3276d);
            int size = listI.size();
            for (int i = 0; i < size; i++) {
                com.bumptech.glide.load.p.n.a<?> aVarA = ((com.bumptech.glide.load.p.n) listI.get(i)).a(this.f3276d, this.f3277e, this.f3278f, this.i);
                if (aVarA != null) {
                    this.f3273a.add(aVarA);
                }
            }
        }
        return this.f3273a;
    }

    <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f3275c.h().h(cls, this.g, this.k);
    }

    Class<?> i() {
        return this.f3276d.getClass();
    }

    List<com.bumptech.glide.load.p.n<File, ?>> j(File file) {
        return this.f3275c.h().i(file);
    }

    com.bumptech.glide.load.i k() {
        return this.i;
    }

    com.bumptech.glide.g l() {
        return this.o;
    }

    List<Class<?>> m() {
        return this.f3275c.h().j(this.f3276d.getClass(), this.g, this.k);
    }

    <Z> com.bumptech.glide.load.l<Z> n(v<Z> vVar) {
        return this.f3275c.h().k(vVar);
    }

    com.bumptech.glide.load.g o() {
        return this.n;
    }

    <X> com.bumptech.glide.load.d<X> p(X x) {
        return this.f3275c.h().m(x);
    }

    Class<?> q() {
        return this.k;
    }

    <Z> com.bumptech.glide.load.m<Z> r(Class<Z> cls) {
        com.bumptech.glide.load.m<Z> mVar = (com.bumptech.glide.load.m) this.j.get(cls);
        if (mVar == null) {
            for (Map.Entry<Class<?>, com.bumptech.glide.load.m<?>> entry : this.j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    mVar = (com.bumptech.glide.load.m) entry.getValue();
                    break;
                }
            }
        }
        if (mVar != null) {
            return mVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return com.bumptech.glide.load.q.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int s() {
        return this.f3277e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void u(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.g gVar, int i, int i2, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, com.bumptech.glide.load.i iVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, h.e eVar2) {
        this.f3275c = eVar;
        this.f3276d = obj;
        this.n = gVar;
        this.f3277e = i;
        this.f3278f = i2;
        this.p = jVar;
        this.g = cls;
        this.h = eVar2;
        this.k = cls2;
        this.o = gVar2;
        this.i = iVar;
        this.j = map;
        this.q = z;
        this.r = z2;
    }

    boolean v(v<?> vVar) {
        return this.f3275c.h().n(vVar);
    }

    boolean w() {
        return this.r;
    }

    boolean x(com.bumptech.glide.load.g gVar) {
        List<com.bumptech.glide.load.p.n.a<?>> listG = g();
        int size = listG.size();
        for (int i = 0; i < size; i++) {
            if (listG.get(i).f3443a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}
