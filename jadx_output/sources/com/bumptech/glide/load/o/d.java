package com.bumptech.glide.load.o;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class d implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3269c;

    d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2) {
        this.f3268b = gVar;
        this.f3269c = gVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.f3268b.a(messageDigest);
        this.f3269c.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f3268b.equals(dVar.f3268b) && this.f3269c.equals(dVar.f3269c);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return (this.f3268b.hashCode() * 31) + this.f3269c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f3268b + ", signature=" + this.f3269c + '}';
    }
}
