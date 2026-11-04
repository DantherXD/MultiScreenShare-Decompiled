package com.bumptech.glide.load;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b<Object> f3113a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f3114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b<T> f3115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile byte[] f3117e;

    class a implements b<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    private h(String str, T t, b<T> bVar) {
        this.f3116d = com.bumptech.glide.t.j.b(str);
        this.f3114b = t;
        this.f3115c = (b) com.bumptech.glide.t.j.d(bVar);
    }

    public static <T> h<T> a(String str, T t, b<T> bVar) {
        return new h<>(str, t, bVar);
    }

    private static <T> b<T> b() {
        return (b<T>) f3113a;
    }

    private byte[] d() {
        if (this.f3117e == null) {
            this.f3117e = this.f3116d.getBytes(g.f3112a);
        }
        return this.f3117e;
    }

    public static <T> h<T> e(String str) {
        return new h<>(str, null, b());
    }

    public static <T> h<T> f(String str, T t) {
        return new h<>(str, t, b());
    }

    public T c() {
        return this.f3114b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f3116d.equals(((h) obj).f3116d);
        }
        return false;
    }

    public void g(T t, MessageDigest messageDigest) {
        this.f3115c.a(d(), t, messageDigest);
    }

    public int hashCode() {
        return this.f3116d.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f3116d + "'}";
    }
}
