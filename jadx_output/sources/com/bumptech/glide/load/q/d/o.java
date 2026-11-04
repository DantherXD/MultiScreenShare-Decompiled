package com.bumptech.glide.load.q.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class o implements com.bumptech.glide.load.m<Drawable> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.m<Bitmap> f3561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3562c;

    public o(com.bumptech.glide.load.m<Bitmap> mVar, boolean z) {
        this.f3561b = mVar;
        this.f3562c = z;
    }

    private com.bumptech.glide.load.o.v<Drawable> d(Context context, com.bumptech.glide.load.o.v<Bitmap> vVar) {
        return u.g(context.getResources(), vVar);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.f3561b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    public com.bumptech.glide.load.o.v<Drawable> b(Context context, com.bumptech.glide.load.o.v<Drawable> vVar, int i, int i2) {
        com.bumptech.glide.load.o.a0.e eVarF = com.bumptech.glide.c.c(context).f();
        Drawable drawableA = vVar.a();
        com.bumptech.glide.load.o.v<Bitmap> vVarA = n.a(eVarF, drawableA, i, i2);
        if (vVarA != null) {
            com.bumptech.glide.load.o.v<Bitmap> vVarB = this.f3561b.b(context, vVarA, i, i2);
            if (!vVarB.equals(vVarA)) {
                return d(context, vVarB);
            }
            vVarB.f();
            return vVar;
        }
        if (!this.f3562c) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawableA + " to a Bitmap");
    }

    public com.bumptech.glide.load.m<BitmapDrawable> c() {
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f3561b.equals(((o) obj).f3561b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f3561b.hashCode();
    }
}
