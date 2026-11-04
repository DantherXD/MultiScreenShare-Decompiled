package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class v implements com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f3579a;

    public v(m mVar) {
        this.f3579a = mVar;
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.o.v<Bitmap> a(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, com.bumptech.glide.load.i iVar) {
        return this.f3579a.d(parcelFileDescriptor, i, i2, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, com.bumptech.glide.load.i iVar) {
        return this.f3579a.o(parcelFileDescriptor);
    }
}
