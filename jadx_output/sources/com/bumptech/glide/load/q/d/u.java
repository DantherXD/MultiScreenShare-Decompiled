package com.bumptech.glide.load.q.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class u implements com.bumptech.glide.load.o.v<BitmapDrawable>, com.bumptech.glide.load.o.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f3577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.o.v<Bitmap> f3578c;

    private u(Resources resources, com.bumptech.glide.load.o.v<Bitmap> vVar) {
        this.f3577b = (Resources) com.bumptech.glide.t.j.d(resources);
        this.f3578c = (com.bumptech.glide.load.o.v) com.bumptech.glide.t.j.d(vVar);
    }

    public static com.bumptech.glide.load.o.v<BitmapDrawable> g(Resources resources, com.bumptech.glide.load.o.v<Bitmap> vVar) {
        if (vVar == null) {
            return null;
        }
        return new u(resources, vVar);
    }

    @Override // com.bumptech.glide.load.o.v
    public int b() {
        return this.f3578c.b();
    }

    @Override // com.bumptech.glide.load.o.r
    public void c() {
        com.bumptech.glide.load.o.v<Bitmap> vVar = this.f3578c;
        if (vVar instanceof com.bumptech.glide.load.o.r) {
            ((com.bumptech.glide.load.o.r) vVar).c();
        }
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<BitmapDrawable> d() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.o.v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable a() {
        return new BitmapDrawable(this.f3577b, this.f3578c.a());
    }

    @Override // com.bumptech.glide.load.o.v
    public void f() {
        this.f3578c.f();
    }
}
