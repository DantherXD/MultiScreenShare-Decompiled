package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public class e implements com.bumptech.glide.load.o.v<Bitmap>, com.bumptech.glide.load.o.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Bitmap f3534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.e f3535c;

    public e(Bitmap bitmap, com.bumptech.glide.load.o.a0.e eVar) {
        this.f3534b = (Bitmap) com.bumptech.glide.t.j.e(bitmap, "Bitmap must not be null");
        this.f3535c = (com.bumptech.glide.load.o.a0.e) com.bumptech.glide.t.j.e(eVar, "BitmapPool must not be null");
    }

    public static e g(Bitmap bitmap, com.bumptech.glide.load.o.a0.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.o.v
    public int b() {
        return com.bumptech.glide.t.k.g(this.f3534b);
    }

    @Override // com.bumptech.glide.load.o.r
    public void c() {
        this.f3534b.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<Bitmap> d() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.o.v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Bitmap a() {
        return this.f3534b;
    }

    @Override // com.bumptech.glide.load.o.v
    public void f() {
        this.f3535c.d(this.f3534b);
    }
}
