package com.bumptech.glide.r;

/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f3743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f3744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f3745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f3746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f3747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f3748f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f3747e = aVar;
        this.f3748f = aVar;
        this.f3743a = obj;
        this.f3744b = dVar;
    }

    private boolean m(c cVar) {
        return cVar.equals(this.f3745c) || (this.f3747e == d.a.FAILED && cVar.equals(this.f3746d));
    }

    private boolean n() {
        d dVar = this.f3744b;
        return dVar == null || dVar.l(this);
    }

    private boolean o() {
        d dVar = this.f3744b;
        return dVar == null || dVar.k(this);
    }

    private boolean p() {
        d dVar = this.f3744b;
        return dVar == null || dVar.a(this);
    }

    @Override // com.bumptech.glide.r.d
    public boolean a(c cVar) {
        boolean z;
        synchronized (this.f3743a) {
            z = p() && m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d, com.bumptech.glide.r.c
    public boolean b() {
        boolean z;
        synchronized (this.f3743a) {
            z = this.f3745c.b() || this.f3746d.b();
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bumptech.glide.r.d] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // com.bumptech.glide.r.d
    public d c() {
        ?? C;
        synchronized (this.f3743a) {
            d dVar = this.f3744b;
            this = this;
            if (dVar != null) {
                C = dVar.c();
            }
        }
        return C;
    }

    @Override // com.bumptech.glide.r.c
    public void clear() {
        synchronized (this.f3743a) {
            d.a aVar = d.a.CLEARED;
            this.f3747e = aVar;
            this.f3745c.clear();
            if (this.f3748f != aVar) {
                this.f3748f = aVar;
                this.f3746d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.r.d
    public void d(c cVar) {
        synchronized (this.f3743a) {
            if (cVar.equals(this.f3746d)) {
                this.f3748f = d.a.FAILED;
                d dVar = this.f3744b;
                if (dVar != null) {
                    dVar.d(this);
                }
                return;
            }
            this.f3747e = d.a.FAILED;
            d.a aVar = this.f3748f;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f3748f = aVar2;
                this.f3746d.f();
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public void e() {
        synchronized (this.f3743a) {
            d.a aVar = this.f3747e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar == aVar2) {
                this.f3747e = d.a.PAUSED;
                this.f3745c.e();
            }
            if (this.f3748f == aVar2) {
                this.f3748f = d.a.PAUSED;
                this.f3746d.e();
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public void f() {
        synchronized (this.f3743a) {
            d.a aVar = this.f3747e;
            d.a aVar2 = d.a.RUNNING;
            if (aVar != aVar2) {
                this.f3747e = aVar2;
                this.f3745c.f();
            }
        }
    }

    @Override // com.bumptech.glide.r.d
    public void g(c cVar) {
        synchronized (this.f3743a) {
            if (cVar.equals(this.f3745c)) {
                this.f3747e = d.a.SUCCESS;
            } else if (cVar.equals(this.f3746d)) {
                this.f3748f = d.a.SUCCESS;
            }
            d dVar = this.f3744b;
            if (dVar != null) {
                dVar.g(this);
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean h(c cVar) {
        if (!(cVar instanceof b)) {
            return false;
        }
        b bVar = (b) cVar;
        return this.f3745c.h(bVar.f3745c) && this.f3746d.h(bVar.f3746d);
    }

    @Override // com.bumptech.glide.r.c
    public boolean i() {
        boolean z;
        synchronized (this.f3743a) {
            d.a aVar = this.f3747e;
            d.a aVar2 = d.a.SUCCESS;
            z = aVar == aVar2 || this.f3748f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f3743a) {
            d.a aVar = this.f3747e;
            d.a aVar2 = d.a.RUNNING;
            z = aVar == aVar2 || this.f3748f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public boolean j() {
        boolean z;
        synchronized (this.f3743a) {
            d.a aVar = this.f3747e;
            d.a aVar2 = d.a.CLEARED;
            z = aVar == aVar2 && this.f3748f == aVar2;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean k(c cVar) {
        boolean z;
        synchronized (this.f3743a) {
            z = o() && m(cVar);
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean l(c cVar) {
        boolean z;
        synchronized (this.f3743a) {
            z = n() && m(cVar);
        }
        return z;
    }

    public void q(c cVar, c cVar2) {
        this.f3745c = cVar;
        this.f3746d = cVar2;
    }
}
