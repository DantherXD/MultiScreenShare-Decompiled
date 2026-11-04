package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements com.bumptech.glide.load.k<Bitmap, Bitmap> {

    private static final class a implements com.bumptech.glide.load.o.v<Bitmap> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f3517b;

        a(Bitmap bitmap) {
            this.f3517b = bitmap;
        }

        @Override // com.bumptech.glide.load.o.v
        public int b() {
            return com.bumptech.glide.t.k.g(this.f3517b);
        }

        @Override // com.bumptech.glide.load.o.v
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Bitmap a() {
            return this.f3517b;
        }

        @Override // com.bumptech.glide.load.o.v
        public Class<Bitmap> d() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.o.v
        public void f() {
        }
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.o.v<Bitmap> a(Bitmap bitmap, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new a(bitmap);
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Bitmap bitmap, com.bumptech.glide.load.i iVar) {
        return true;
    }
}
