package com.bumptech.glide.r;

/* JADX INFO: loaded from: classes.dex */
public class i implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f3767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f3768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f3769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f3770f;
    private boolean g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f3769e = aVar;
        this.f3770f = aVar;
        this.f3766b = obj;
        this.f3765a = dVar;
    }

    private boolean m() {
        d dVar = this.f3765a;
        return dVar == null || dVar.l(this);
    }

    private boolean n() {
        d dVar = this.f3765a;
        return dVar == null || dVar.k(this);
    }

    private boolean o() {
        d dVar = this.f3765a;
        return dVar == null || dVar.a(this);
    }

    @Override // com.bumptech.glide.r.d
    public boolean a(c cVar) {
        boolean z;
        synchronized (this.f3766b) {
            z = o() && (cVar.equals(this.f3767c) || this.f3769e != d.a.SUCCESS);
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d, com.bumptech.glide.r.c
    public boolean b() {
        boolean z;
        synchronized (this.f3766b) {
            z = this.f3768d.b() || this.f3767c.b();
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
        synchronized (this.f3766b) {
            d dVar = this.f3765a;
            this = this;
            if (dVar != null) {
                C = dVar.c();
            }
        }
        return C;
    }

    @Override // com.bumptech.glide.r.c
    public void clear() {
        synchronized (this.f3766b) {
            this.g = false;
            d.a aVar = d.a.CLEARED;
            this.f3769e = aVar;
            this.f3770f = aVar;
            this.f3768d.clear();
            this.f3767c.clear();
        }
    }

    @Override // com.bumptech.glide.r.d
    public void d(c cVar) {
        synchronized (this.f3766b) {
            if (!cVar.equals(this.f3767c)) {
                this.f3770f = d.a.FAILED;
                return;
            }
            this.f3769e = d.a.FAILED;
            d dVar = this.f3765a;
            if (dVar != null) {
                dVar.d(this);
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public void e() {
        synchronized (this.f3766b) {
            if (!this.f3770f.a()) {
                this.f3770f = d.a.PAUSED;
                this.f3768d.e();
            }
            if (!this.f3769e.a()) {
                this.f3769e = d.a.PAUSED;
                this.f3767c.e();
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public void f() {
        synchronized (this.f3766b) {
            this.g = true;
            try {
                if (this.f3769e != d.a.SUCCESS) {
                    d.a aVar = this.f3770f;
                    d.a aVar2 = d.a.RUNNING;
                    if (aVar != aVar2) {
                        this.f3770f = aVar2;
                        this.f3768d.f();
                    }
                }
                if (this.g) {
                    d.a aVar3 = this.f3769e;
                    d.a aVar4 = d.a.RUNNING;
                    if (aVar3 != aVar4) {
                        this.f3769e = aVar4;
                        this.f3767c.f();
                    }
                }
                this.g = false;
            } catch (Throwable th) {
                this.g = false;
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.r.d
    public void g(c cVar) {
        synchronized (this.f3766b) {
            if (cVar.equals(this.f3768d)) {
                this.f3770f = d.a.SUCCESS;
                return;
            }
            this.f3769e = d.a.SUCCESS;
            d dVar = this.f3765a;
            if (dVar != null) {
                dVar.g(this);
            }
            if (!this.f3770f.a()) {
                this.f3768d.clear();
            }
        }
    }

    @Override // com.bumptech.glide.r.c
    public boolean h(c cVar) {
        if (!(cVar instanceof i)) {
            return false;
        }
        i iVar = (i) cVar;
        if (this.f3767c == null) {
            if (iVar.f3767c != null) {
                return false;
            }
        } else if (!this.f3767c.h(iVar.f3767c)) {
            return false;
        }
        if (this.f3768d == null) {
            if (iVar.f3768d != null) {
                return false;
            }
        } else if (!this.f3768d.h(iVar.f3768d)) {
            return false;
        }
        return true;
    }

    @Override // com.bumptech.glide.r.c
    public boolean i() {
        boolean z;
        synchronized (this.f3766b) {
            z = this.f3769e == d.a.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public boolean isRunning() {
        boolean z;
        synchronized (this.f3766b) {
            z = this.f3769e == d.a.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.c
    public boolean j() {
        boolean z;
        synchronized (this.f3766b) {
            z = this.f3769e == d.a.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean k(c cVar) {
        boolean z;
        synchronized (this.f3766b) {
            z = n() && cVar.equals(this.f3767c) && !b();
        }
        return z;
    }

    @Override // com.bumptech.glide.r.d
    public boolean l(c cVar) {
        boolean z;
        synchronized (this.f3766b) {
            z = m() && cVar.equals(this.f3767c) && this.f3769e != d.a.PAUSED;
        }
        return z;
    }

    public void p(c cVar, c cVar2) {
        this.f3767c = cVar;
        this.f3768d = cVar2;
    }
}
