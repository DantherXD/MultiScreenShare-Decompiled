package com.bumptech.glide.load;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class i implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.d.a<h<?>, Object> f3118b = new com.bumptech.glide.t.b();

    /* JADX WARN: Multi-variable type inference failed */
    private static <T> void f(h<T> hVar, Object obj, MessageDigest messageDigest) {
        hVar.g(obj, messageDigest);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        for (int i = 0; i < this.f3118b.size(); i++) {
            f(this.f3118b.i(i), this.f3118b.m(i), messageDigest);
        }
    }

    public <T> T c(h<T> hVar) {
        return this.f3118b.containsKey(hVar) ? (T) this.f3118b.get(hVar) : hVar.c();
    }

    public void d(i iVar) {
        this.f3118b.j(iVar.f3118b);
    }

    public <T> i e(h<T> hVar, T t) {
        this.f3118b.put(hVar, t);
        return this;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof i) {
            return this.f3118b.equals(((i) obj).f3118b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f3118b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f3118b + '}';
    }
}
