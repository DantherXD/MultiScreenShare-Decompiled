package com.bumptech.glide.load.o;

import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class n implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class<?> f3351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class<?> f3352f;
    private final com.bumptech.glide.load.g g;
    private final Map<Class<?>, com.bumptech.glide.load.m<?>> h;
    private final com.bumptech.glide.load.i i;
    private int j;

    n(Object obj, com.bumptech.glide.load.g gVar, int i, int i2, Map<Class<?>, com.bumptech.glide.load.m<?>> map, Class<?> cls, Class<?> cls2, com.bumptech.glide.load.i iVar) {
        this.f3348b = com.bumptech.glide.t.j.d(obj);
        this.g = (com.bumptech.glide.load.g) com.bumptech.glide.t.j.e(gVar, "Signature must not be null");
        this.f3349c = i;
        this.f3350d = i2;
        this.h = (Map) com.bumptech.glide.t.j.d(map);
        this.f3351e = (Class) com.bumptech.glide.t.j.e(cls, "Resource class must not be null");
        this.f3352f = (Class) com.bumptech.glide.t.j.e(cls2, "Transcode class must not be null");
        this.i = (com.bumptech.glide.load.i) com.bumptech.glide.t.j.d(iVar);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f3348b.equals(nVar.f3348b) && this.g.equals(nVar.g) && this.f3350d == nVar.f3350d && this.f3349c == nVar.f3349c && this.h.equals(nVar.h) && this.f3351e.equals(nVar.f3351e) && this.f3352f.equals(nVar.f3352f) && this.i.equals(nVar.i);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.j == 0) {
            int iHashCode = this.f3348b.hashCode();
            this.j = iHashCode;
            int iHashCode2 = (iHashCode * 31) + this.g.hashCode();
            this.j = iHashCode2;
            int i = (iHashCode2 * 31) + this.f3349c;
            this.j = i;
            int i2 = (i * 31) + this.f3350d;
            this.j = i2;
            int iHashCode3 = (i2 * 31) + this.h.hashCode();
            this.j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f3351e.hashCode();
            this.j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f3352f.hashCode();
            this.j = iHashCode5;
            this.j = (iHashCode5 * 31) + this.i.hashCode();
        }
        return this.j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f3348b + ", width=" + this.f3349c + ", height=" + this.f3350d + ", resourceClass=" + this.f3351e + ", transcodeClass=" + this.f3352f + ", signature=" + this.g + ", hashCode=" + this.j + ", transformations=" + this.h + ", options=" + this.i + '}';
    }
}
