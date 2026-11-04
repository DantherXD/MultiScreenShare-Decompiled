package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class y implements com.bumptech.glide.load.k<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f3587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.b f3588b;

    static class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final w f3589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.t.d f3590b;

        a(w wVar, com.bumptech.glide.t.d dVar) {
            this.f3589a = wVar;
            this.f3590b = dVar;
        }

        @Override // com.bumptech.glide.load.q.d.m.b
        public void a(com.bumptech.glide.load.o.a0.e eVar, Bitmap bitmap) throws IOException {
            IOException iOExceptionA = this.f3590b.a();
            if (iOExceptionA != null) {
                if (bitmap == null) {
                    throw iOExceptionA;
                }
                eVar.d(bitmap);
                throw iOExceptionA;
            }
        }

        @Override // com.bumptech.glide.load.q.d.m.b
        public void b() {
            this.f3589a.b();
        }
    }

    public y(m mVar, com.bumptech.glide.load.o.a0.b bVar) {
        this.f3587a = mVar;
        this.f3588b = bVar;
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.o.v<Bitmap> a(InputStream inputStream, int i, int i2, com.bumptech.glide.load.i iVar) {
        boolean z;
        w wVar;
        if (inputStream instanceof w) {
            wVar = (w) inputStream;
            z = false;
        } else {
            z = true;
            wVar = new w(inputStream, this.f3588b);
        }
        com.bumptech.glide.t.d dVarB = com.bumptech.glide.t.d.b(wVar);
        try {
            return this.f3587a.g(new com.bumptech.glide.t.h(dVarB), i, i2, iVar, new a(wVar, dVarB));
        } finally {
            dVarB.c();
            if (z) {
                wVar.c();
            }
        }
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(InputStream inputStream, com.bumptech.glide.load.i iVar) {
        return this.f3587a.p(inputStream);
    }
}
