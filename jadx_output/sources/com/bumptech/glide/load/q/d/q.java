package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class q extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f3563b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(com.bumptech.glide.load.g.f3112a);

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(f3563b);
    }

    @Override // com.bumptech.glide.load.q.d.f
    protected Bitmap c(com.bumptech.glide.load.o.a0.e eVar, Bitmap bitmap, int i, int i2) {
        return z.e(eVar, bitmap, i, i2);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        return obj instanceof q;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return 1572326941;
    }
}
