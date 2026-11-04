package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.bumptech.glide.load.l<BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.e f3518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.l<Bitmap> f3519b;

    public b(com.bumptech.glide.load.o.a0.e eVar, com.bumptech.glide.load.l<Bitmap> lVar) {
        this.f3518a = eVar;
        this.f3519b = lVar;
    }

    @Override // com.bumptech.glide.load.l
    public com.bumptech.glide.load.c b(com.bumptech.glide.load.i iVar) {
        return this.f3519b.b(iVar);
    }

    @Override // com.bumptech.glide.load.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(com.bumptech.glide.load.o.v<BitmapDrawable> vVar, File file, com.bumptech.glide.load.i iVar) {
        return this.f3519b.a((Bitmap) new e(vVar.a().getBitmap(), this.f3518a), file, iVar);
    }
}
