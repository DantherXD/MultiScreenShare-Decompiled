package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class j extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f3539b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(com.bumptech.glide.load.g.f3112a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3539b);
    }

    @Override // com.bumptech.glide.load.q.d.f
    protected Bitmap c(com.bumptech.glide.load.o.a0.e eVar, Bitmap bitmap, int i, int i2) {
        return z.c(eVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return -670243078;
    }
}
