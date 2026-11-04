package com.bumptech.glide.load.o;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
final class x implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.t.g<Class<?>, byte[]> f3381b = new com.bumptech.glide.t.g<>(50);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.b f3382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.g f3384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3385f;
    private final int g;
    private final Class<?> h;
    private final com.bumptech.glide.load.i i;
    private final com.bumptech.glide.load.m<?> j;

    x(com.bumptech.glide.load.o.a0.b bVar, com.bumptech.glide.load.g gVar, com.bumptech.glide.load.g gVar2, int i, int i2, com.bumptech.glide.load.m<?> mVar, Class<?> cls, com.bumptech.glide.load.i iVar) {
        this.f3382c = bVar;
        this.f3383d = gVar;
        this.f3384e = gVar2;
        this.f3385f = i;
        this.g = i2;
        this.j = mVar;
        this.h = cls;
        this.i = iVar;
    }

    private byte[] c() {
        com.bumptech.glide.t.g<Class<?>, byte[]> gVar = f3381b;
        byte[] bArrG = gVar.g(this.h);
        if (bArrG != null) {
            return bArrG;
        }
        byte[] bytes = this.h.getName().getBytes(com.bumptech.glide.load.g.f3112a);
        gVar.k(this.h, bytes);
        return bytes;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.f3382c.c(8, byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.f3385f).putInt(this.g).array();
        this.f3384e.a(messageDigest);
        this.f3383d.a(messageDigest);
        messageDigest.update(bArr);
        com.bumptech.glide.load.m<?> mVar = this.j;
        if (mVar != null) {
            mVar.a(messageDigest);
        }
        this.i.a(messageDigest);
        messageDigest.update(c());
        this.f3382c.put(bArr);
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return this.g == xVar.g && this.f3385f == xVar.f3385f && com.bumptech.glide.t.k.c(this.j, xVar.j) && this.h.equals(xVar.h) && this.f3383d.equals(xVar.f3383d) && this.f3384e.equals(xVar.f3384e) && this.i.equals(xVar.i);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        int iHashCode = (((((this.f3383d.hashCode() * 31) + this.f3384e.hashCode()) * 31) + this.f3385f) * 31) + this.g;
        com.bumptech.glide.load.m<?> mVar = this.j;
        if (mVar != null) {
            iHashCode = (iHashCode * 31) + mVar.hashCode();
        }
        return (((iHashCode * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
    }

    public String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f3383d + ", signature=" + this.f3384e + ", width=" + this.f3385f + ", height=" + this.g + ", decodedResourceClass=" + this.h + ", transformation='" + this.j + "', options=" + this.i + '}';
    }
}
