package com.bumptech.glide.load.q.h;

import com.bumptech.glide.load.o.r;

/* JADX INFO: loaded from: classes.dex */
public class e extends com.bumptech.glide.load.q.f.b<c> implements r {
    public e(c cVar) {
        super(cVar);
    }

    @Override // com.bumptech.glide.load.o.v
    public int b() {
        return ((c) this.f3599b).i();
    }

    @Override // com.bumptech.glide.load.q.f.b, com.bumptech.glide.load.o.r
    public void c() {
        ((c) this.f3599b).e().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<c> d() {
        return c.class;
    }

    @Override // com.bumptech.glide.load.o.v
    public void f() {
        ((c) this.f3599b).stop();
        ((c) this.f3599b).k();
    }
}
