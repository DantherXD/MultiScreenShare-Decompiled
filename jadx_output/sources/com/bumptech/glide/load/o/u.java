package com.bumptech.glide.load.o;

/* JADX INFO: loaded from: classes.dex */
final class u<Z> implements v<Z>, com.bumptech.glide.t.l.a.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a.g.k.e<u<?>> f3371b = com.bumptech.glide.t.l.a.d(20, new a());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.t.l.c f3372c = com.bumptech.glide.t.l.c.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v<Z> f3373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3375f;

    class a implements com.bumptech.glide.t.l.a.d<u<?>> {
        a() {
        }

        @Override // com.bumptech.glide.t.l.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public u<?> a() {
            return new u<>();
        }
    }

    u() {
    }

    private void c(v<Z> vVar) {
        this.f3375f = false;
        this.f3374e = true;
        this.f3373d = vVar;
    }

    static <Z> u<Z> g(v<Z> vVar) {
        u<Z> uVar = (u) com.bumptech.glide.t.j.d(f3371b.b());
        uVar.c(vVar);
        return uVar;
    }

    private void h() {
        this.f3373d = null;
        f3371b.a(this);
    }

    @Override // com.bumptech.glide.load.o.v
    public Z a() {
        return this.f3373d.a();
    }

    @Override // com.bumptech.glide.load.o.v
    public int b() {
        return this.f3373d.b();
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<Z> d() {
        return this.f3373d.d();
    }

    @Override // com.bumptech.glide.t.l.a.f
    public com.bumptech.glide.t.l.c e() {
        return this.f3372c;
    }

    @Override // com.bumptech.glide.load.o.v
    public synchronized void f() {
        this.f3372c.c();
        this.f3375f = true;
        if (!this.f3374e) {
            this.f3373d.f();
            h();
        }
    }

    synchronized void i() {
        this.f3372c.c();
        if (!this.f3374e) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f3374e = false;
        if (this.f3375f) {
            f();
        }
    }
}
