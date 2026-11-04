package com.bumptech.glide.load.o.a0;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f3175a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h<a, Bitmap> f3176b = new h<>();

    static class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f3177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Bitmap.Config f3180d;

        public a(b bVar) {
            this.f3177a = bVar;
        }

        @Override // com.bumptech.glide.load.o.a0.m
        public void a() {
            this.f3177a.c(this);
        }

        public void b(int i, int i2, Bitmap.Config config) {
            this.f3178b = i;
            this.f3179c = i2;
            this.f3180d = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3178b == aVar.f3178b && this.f3179c == aVar.f3179c && this.f3180d == aVar.f3180d;
        }

        public int hashCode() {
            int i = ((this.f3178b * 31) + this.f3179c) * 31;
            Bitmap.Config config = this.f3180d;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.g(this.f3178b, this.f3179c, this.f3180d);
        }
    }

    static class b extends d<a> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.o.a0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i, int i2, Bitmap.Config config) {
            a aVarB = b();
            aVarB.b(i, i2, config);
            return aVarB;
        }
    }

    c() {
    }

    static String g(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }

    private static String h(Bitmap bitmap) {
        return g(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public int a(Bitmap bitmap) {
        return com.bumptech.glide.t.k.g(bitmap);
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public Bitmap b() {
        return this.f3176b.f();
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        return this.f3176b.a(this.f3175a.e(i, i2, config));
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public void d(Bitmap bitmap) {
        this.f3176b.d(this.f3175a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public String e(int i, int i2, Bitmap.Config config) {
        return g(i, i2, config);
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public String f(Bitmap bitmap) {
        return h(bitmap);
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f3176b;
    }
}
