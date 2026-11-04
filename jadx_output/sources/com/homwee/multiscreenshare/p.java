package com.homwee.multiscreenshare;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class p extends com.bumptech.glide.k {
    public p(com.bumptech.glide.c cVar, com.bumptech.glide.o.h hVar, com.bumptech.glide.o.m mVar, Context context) {
        super(cVar, hVar, mVar, context);
    }

    @Override // com.bumptech.glide.k
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public <ResourceType> o<ResourceType> l(Class<ResourceType> cls) {
        return new o<>(this.f3083e, this, cls, this.f3084f);
    }

    @Override // com.bumptech.glide.k
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public o<Bitmap> m() {
        return (o) super.m();
    }

    @Override // com.bumptech.glide.k
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public o<Drawable> n() {
        return (o) super.n();
    }

    public o<Drawable> F(Bitmap bitmap) {
        return (o) super.s(bitmap);
    }

    public o<Drawable> G(Integer num) {
        return (o) super.t(num);
    }

    @Override // com.bumptech.glide.k
    protected void y(com.bumptech.glide.r.f fVar) {
        if (!(fVar instanceof n)) {
            fVar = new n().a(fVar);
        }
        super.y(fVar);
    }
}
