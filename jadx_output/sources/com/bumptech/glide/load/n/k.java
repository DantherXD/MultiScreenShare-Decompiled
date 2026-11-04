package com.bumptech.glide.load.n;

import com.bumptech.glide.load.q.d.w;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class k implements e<InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f3142a;

    public static final class a implements e.a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.o.a0.b f3143a;

        public a(com.bumptech.glide.load.o.a0.b bVar) {
            this.f3143a = bVar;
        }

        @Override // com.bumptech.glide.load.n.e.a
        public Class<InputStream> a() {
            return InputStream.class;
        }

        @Override // com.bumptech.glide.load.n.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<InputStream> b(InputStream inputStream) {
            return new k(inputStream, this.f3143a);
        }
    }

    public k(InputStream inputStream, com.bumptech.glide.load.o.a0.b bVar) {
        w wVar = new w(inputStream, bVar);
        this.f3142a = wVar;
        wVar.mark(5242880);
    }

    @Override // com.bumptech.glide.load.n.e
    public void b() {
        this.f3142a.c();
    }

    public void c() {
        this.f3142a.b();
    }

    @Override // com.bumptech.glide.load.n.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InputStream a() {
        this.f3142a.reset();
        return this.f3142a;
    }
}
