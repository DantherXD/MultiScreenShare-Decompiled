package com.bumptech.glide.load.q.i;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.o.v;

/* JADX INFO: loaded from: classes.dex */
public final class c implements e<Drawable, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.e f3635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e<Bitmap, byte[]> f3636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e<com.bumptech.glide.load.q.h.c, byte[]> f3637c;

    public c(com.bumptech.glide.load.o.a0.e eVar, e<Bitmap, byte[]> eVar2, e<com.bumptech.glide.load.q.h.c, byte[]> eVar3) {
        this.f3635a = eVar;
        this.f3636b = eVar2;
        this.f3637c = eVar3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static v<com.bumptech.glide.load.q.h.c> b(v<Drawable> vVar) {
        return vVar;
    }

    @Override // com.bumptech.glide.load.q.i.e
    public v<byte[]> a(v<Drawable> vVar, i iVar) {
        Drawable drawableA = vVar.a();
        if (drawableA instanceof BitmapDrawable) {
            return this.f3636b.a(com.bumptech.glide.load.q.d.e.g(((BitmapDrawable) drawableA).getBitmap(), this.f3635a), iVar);
        }
        if (drawableA instanceof com.bumptech.glide.load.q.h.c) {
            return this.f3637c.a(b(vVar), iVar);
        }
        return null;
    }
}
