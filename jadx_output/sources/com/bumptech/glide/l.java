package com.bumptech.glide;

import com.bumptech.glide.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class l<CHILD extends l<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.r.k.c<? super TranscodeType> f3088b = com.bumptech.glide.r.k.a.b();

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final CHILD clone() {
        try {
            return (CHILD) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    final com.bumptech.glide.r.k.c<? super TranscodeType> b() {
        return this.f3088b;
    }
}
