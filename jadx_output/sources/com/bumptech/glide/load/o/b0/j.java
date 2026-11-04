package com.bumptech.glide.load.o.b0;

import com.bumptech.glide.t.k;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.t.g<com.bumptech.glide.load.g, String> f3239a = new com.bumptech.glide.t.g<>(1000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.g.k.e<b> f3240b = com.bumptech.glide.t.l.a.d(10, new a());

    class a implements com.bumptech.glide.t.l.a.d<b> {
        a() {
        }

        @Override // com.bumptech.glide.t.l.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private static final class b implements com.bumptech.glide.t.l.a.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final MessageDigest f3242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.t.l.c f3243c = com.bumptech.glide.t.l.c.a();

        b(MessageDigest messageDigest) {
            this.f3242b = messageDigest;
        }

        @Override // com.bumptech.glide.t.l.a.f
        public com.bumptech.glide.t.l.c e() {
            return this.f3243c;
        }
    }

    private String a(com.bumptech.glide.load.g gVar) {
        b bVar = (b) com.bumptech.glide.t.j.d(this.f3240b.b());
        try {
            gVar.a(bVar.f3242b);
            return k.s(bVar.f3242b.digest());
        } finally {
            this.f3240b.a(bVar);
        }
    }

    public String b(com.bumptech.glide.load.g gVar) {
        String strG;
        synchronized (this.f3239a) {
            strG = this.f3239a.g(gVar);
        }
        if (strG == null) {
            strG = a(gVar);
        }
        synchronized (this.f3239a) {
            this.f3239a.k(gVar, strG);
        }
        return strG;
    }
}
