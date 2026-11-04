package com.bumptech.glide.load.o;

/* JADX INFO: loaded from: classes.dex */
class p<Z> implements v<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f3353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v<Z> f3355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f3356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3357f;
    private int g;
    private boolean h;

    interface a {
        void a(com.bumptech.glide.load.g gVar, p<?> pVar);
    }

    p(v<Z> vVar, boolean z, boolean z2, com.bumptech.glide.load.g gVar, a aVar) {
        this.f3355d = (v) com.bumptech.glide.t.j.d(vVar);
        this.f3353b = z;
        this.f3354c = z2;
        this.f3357f = gVar;
        this.f3356e = (a) com.bumptech.glide.t.j.d(aVar);
    }

    @Override // com.bumptech.glide.load.o.v
    public Z a() {
        return this.f3355d.a();
    }

    @Override // com.bumptech.glide.load.o.v
    public int b() {
        return this.f3355d.b();
    }

    synchronized void c() {
        if (this.h) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.g++;
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<Z> d() {
        return this.f3355d.d();
    }

    v<Z> e() {
        return this.f3355d;
    }

    @Override // com.bumptech.glide.load.o.v
    public synchronized void f() {
        if (this.g > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.h) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.h = true;
        if (this.f3354c) {
            this.f3355d.f();
        }
    }

    boolean g() {
        return this.f3353b;
    }

    void h() {
        boolean z;
        synchronized (this) {
            int i = this.g;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.g = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f3356e.a(this.f3357f, this);
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f3353b + ", listener=" + this.f3356e + ", key=" + this.f3357f + ", acquired=" + this.g + ", isRecycled=" + this.h + ", resource=" + this.f3355d + '}';
    }
}
