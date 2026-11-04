package com.bumptech.glide.load.p;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<Data> f3406a;

    public interface a<Data> {
        Class<Data> a();

        void b(Data data);

        Data c(String str);
    }

    private static final class b<Data> implements com.bumptech.glide.load.n.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f3407b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a<Data> f3408c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Data f3409d;

        b(String str, a<Data> aVar) {
            this.f3407b = str;
            this.f3408c = aVar;
        }

        @Override // com.bumptech.glide.load.n.d
        public Class<Data> a() {
            return this.f3408c.a();
        }

        @Override // com.bumptech.glide.load.n.d
        public void b() {
            try {
                this.f3408c.b(this.f3409d);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.n.d
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.n.d
        public void cancel() {
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [Data, java.lang.Object] */
        @Override // com.bumptech.glide.load.n.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.n.d.a<? super Data> aVar) {
            try {
                Data dataC = this.f3408c.c(this.f3407b);
                this.f3409d = dataC;
                aVar.f(dataC);
            } catch (IllegalArgumentException e2) {
                aVar.d(e2);
            }
        }
    }

    public static final class c<Model> implements o<Model, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a<InputStream> f3410a = new a();

        class a implements a<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.p.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p.e.a
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // com.bumptech.glide.load.p.e.a
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public InputStream c(String str) {
                if (!str.startsWith("data:image")) {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
                int iIndexOf = str.indexOf(44);
                if (iIndexOf == -1) {
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                if (str.substring(0, iIndexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(iIndexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Model, InputStream> b(r rVar) {
            return new e(this.f3410a);
        }
    }

    public e(a<Data> aVar) {
        this.f3406a = aVar;
    }

    @Override // com.bumptech.glide.load.p.n
    public n.a<Data> a(Model model, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(model), new b(model.toString(), this.f3406a));
    }

    @Override // com.bumptech.glide.load.p.n
    public boolean b(Model model) {
        return model.toString().startsWith("data:image");
    }
}
