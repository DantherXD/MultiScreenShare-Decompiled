package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class g implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f3536a;

    public g(m mVar) {
        this.f3536a = mVar;
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.o.v<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, com.bumptech.glide.load.i iVar) {
        return this.f3536a.f(com.bumptech.glide.t.a.f(byteBuffer), i, i2, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, com.bumptech.glide.load.i iVar) {
        return this.f3536a.q(byteBuffer);
    }
}
