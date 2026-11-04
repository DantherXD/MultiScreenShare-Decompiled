package com.bumptech.glide.load.o;

import java.io.File;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class c implements f, com.bumptech.glide.load.n.d.a<Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.g> f3244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g<?> f3245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f.a f3246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.g f3248f;
    private List<com.bumptech.glide.load.p.n<File, ?>> g;
    private int h;
    private volatile com.bumptech.glide.load.p.n.a<?> i;
    private File j;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    c(List<com.bumptech.glide.load.g> list, g<?> gVar, f.a aVar) {
        this.f3247e = -1;
        this.f3244b = list;
        this.f3245c = gVar;
        this.f3246d = aVar;
    }

    private boolean b() {
        return this.h < this.g.size();
    }

    @Override // com.bumptech.glide.load.o.f
    public boolean a() {
        while (true) {
            boolean z = false;
            if (this.g != null && b()) {
                this.i = null;
                while (!z && b()) {
                    List<com.bumptech.glide.load.p.n<File, ?>> list = this.g;
                    int i = this.h;
                    this.h = i + 1;
                    this.i = list.get(i).a(this.j, this.f3245c.s(), this.f3245c.f(), this.f3245c.k());
                    if (this.i != null && this.f3245c.t(this.i.f3445c.a())) {
                        this.i.f3445c.e(this.f3245c.l(), this);
                        z = true;
                    }
                }
                return z;
            }
            int i2 = this.f3247e + 1;
            this.f3247e = i2;
            if (i2 >= this.f3244b.size()) {
                return false;
            }
            com.bumptech.glide.load.g gVar = this.f3244b.get(this.f3247e);
            File fileB = this.f3245c.d().b(new d(gVar, this.f3245c.o()));
            this.j = fileB;
            if (fileB != null) {
                this.f3248f = gVar;
                this.g = this.f3245c.j(fileB);
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
        this.f3246d.d(this.f3248f, exc, this.i.f3445c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.n.d.a
    public void f(Object obj) {
        this.f3246d.c(this.f3248f, obj, this.i.f3445c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f3248f);
    }
}
