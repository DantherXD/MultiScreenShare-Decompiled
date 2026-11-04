package com.bumptech.glide.load.o;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class w implements f, com.bumptech.glide.load.n.d.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f3376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g<?> f3377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3379e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.g f3380f;
    private List<com.bumptech.glide.load.p.n<File, ?>> g;
    private int h;
    private volatile com.bumptech.glide.load.p.n.a<?> i;
    private File j;
    private x k;

    w(g<?> gVar, f.a aVar) {
        this.f3377c = gVar;
        this.f3376b = aVar;
    }

    private boolean b() {
        return this.h < this.g.size();
    }

    @Override // com.bumptech.glide.load.o.f
    public boolean a() {
        List<com.bumptech.glide.load.g> listC = this.f3377c.c();
        boolean z = false;
        if (listC.isEmpty()) {
            return false;
        }
        List<Class<?>> listM = this.f3377c.m();
        if (listM.isEmpty()) {
            if (File.class.equals(this.f3377c.q())) {
                return false;
            }
            throw new IllegalStateException("Failed to find any load path from " + this.f3377c.i() + " to " + this.f3377c.q());
        }
        while (true) {
            if (this.g != null && b()) {
                this.i = null;
                while (!z && b()) {
                    List<com.bumptech.glide.load.p.n<File, ?>> list = this.g;
                    int i = this.h;
                    this.h = i + 1;
                    this.i = list.get(i).a(this.j, this.f3377c.s(), this.f3377c.f(), this.f3377c.k());
                    if (this.i != null && this.f3377c.t(this.i.f3445c.a())) {
                        this.i.f3445c.e(this.f3377c.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f3379e + 1;
            this.f3379e = i2;
            if (i2 >= listM.size()) {
                int i3 = this.f3378d + 1;
                this.f3378d = i3;
                if (i3 >= listC.size()) {
                    return false;
                }
                this.f3379e = 0;
            }
            com.bumptech.glide.load.g gVar = listC.get(this.f3378d);
            Class<?> cls = listM.get(this.f3379e);
            this.k = new x(this.f3377c.b(), gVar, this.f3377c.o(), this.f3377c.s(), this.f3377c.f(), this.f3377c.r(cls), cls, this.f3377c.k());
            File fileB = this.f3377c.d().b(this.k);
            this.j = fileB;
            if (fileB != null) {
                this.f3380f = gVar;
                this.g = this.f3377c.j(fileB);
                this.h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.o.f
    public void cancel() {
        com.bumptech.glide.load.p.n.a<?> aVar = this.i;
        if (aVar != null) {
            aVar.f3445c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.n.d.a
    public void d(Exception exc) {
        this.f3376b.d(this.k, exc, this.i.f3445c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.n.d.a
    public void f(Object obj) {
        this.f3376b.c(this.f3380f, obj, this.i.f3445c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.k);
    }
}
