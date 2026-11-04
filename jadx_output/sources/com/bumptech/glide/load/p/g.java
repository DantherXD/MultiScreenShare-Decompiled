package com.bumptech.glide.load.p;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g implements com.bumptech.glide.load.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f3417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f3418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f3420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f3421f;
    private volatile byte[] g;
    private int h;

    public g(String str) {
        this(str, h.f3423b);
    }

    public g(String str, h hVar) {
        this.f3418c = null;
        this.f3419d = com.bumptech.glide.t.j.b(str);
        this.f3417b = (h) com.bumptech.glide.t.j.d(hVar);
    }

    public g(URL url) {
        this(url, h.f3423b);
    }

    public g(URL url, h hVar) {
        this.f3418c = (URL) com.bumptech.glide.t.j.d(url);
        this.f3419d = null;
        this.f3417b = (h) com.bumptech.glide.t.j.d(hVar);
    }

    private byte[] d() {
        if (this.g == null) {
            this.g = c().getBytes(com.bumptech.glide.load.g.f3112a);
        }
        return this.g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f3420e)) {
            String string = this.f3419d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) com.bumptech.glide.t.j.d(this.f3418c)).toString();
            }
            this.f3420e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
        }
        return this.f3420e;
    }

    private URL g() {
        if (this.f3421f == null) {
            this.f3421f = new URL(f());
        }
        return this.f3421f;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f3419d;
        return str != null ? str : ((URL) com.bumptech.glide.t.j.d(this.f3418c)).toString();
    }

    public Map<String, String> e() {
        return this.f3417b.a();
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return c().equals(gVar.c()) && this.f3417b.equals(gVar.f3417b);
    }

    public URL h() {
        return g();
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = (iHashCode * 31) + this.f3417b.hashCode();
        }
        return this.h;
    }

    public String toString() {
        return c();
    }
}
