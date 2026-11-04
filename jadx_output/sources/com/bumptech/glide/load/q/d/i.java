package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class i extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f3538b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(com.bumptech.glide.load.g.f3112a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3538b);
    }

    @Override // com.bumptech.glide.load.q.d.f
    protected Bitmap c(com.bumptech.glide.load.o.a0.e eVar, Bitmap bitmap, int i, int i2) {
        return z.b(eVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof i;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -599754482;
    }
}
