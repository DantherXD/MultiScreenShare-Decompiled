package com.bumptech.glide.load.q.d;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public abstract class f implements com.bumptech.glide.load.m<Bitmap> {
    @Override // com.bumptech.glide.load.m
    public final com.bumptech.glide.load.o.v<Bitmap> b(Context context, com.bumptech.glide.load.o.v<Bitmap> vVar, int i, int i2) {
        if (!com.bumptech.glide.t.k.r(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        com.bumptech.glide.load.o.a0.e eVarF = com.bumptech.glide.c.c(context).f();
        Bitmap bitmapA = vVar.a();
        if (i == Integer.MIN_VALUE) {
            i = bitmapA.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = bitmapA.getHeight();
        }
        Bitmap bitmapC = c(eVarF, bitmapA, i, i2);
        return bitmapA.equals(bitmapC) ? vVar : e.g(bitmapC, eVarF);
    }

    protected abstract Bitmap c(com.bumptech.glide.load.o.a0.e eVar, Bitmap bitmap, int i, int i2);
}
