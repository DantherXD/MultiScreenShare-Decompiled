package com.bumptech.glide.load.q.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* JADX INFO: loaded from: classes.dex */
public class a<DataType> implements com.bumptech.glide.load.k<DataType, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.k<DataType, Bitmap> f3515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f3516b;

    public a(Resources resources, com.bumptech.glide.load.k<DataType, Bitmap> kVar) {
        this.f3516b = (Resources) com.bumptech.glide.t.j.d(resources);
        this.f3515a = (com.bumptech.glide.load.k) com.bumptech.glide.t.j.d(kVar);
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.o.v<BitmapDrawable> a(DataType datatype, int i, int i2, com.bumptech.glide.load.i iVar) {
        return u.g(this.f3516b, this.f3515a.a(datatype, i, i2, iVar));
    }

    @Override // com.bumptech.glide.load.k
    public boolean b(DataType datatype, com.bumptech.glide.load.i iVar) {
        return this.f3515a.b(datatype, iVar);
    }
}
