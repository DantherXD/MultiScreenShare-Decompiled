package com.bumptech.glide.load.p;

/* JADX INFO: loaded from: classes.dex */
public class v<Model> implements n<Model, Model> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v<?> f3474a = new v<>();

    public static class a<Model> implements o<Model, Model> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a<?> f3475a = new a<>();

        @Deprecated
        public a() {
        }

        public static <T> a<T> a() {
            return (a<T>) f3475a;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Model, Model> b(r rVar) {
            return v.c();
        }
    }

    private static class b<Model> implements com.bumptech.glide.load.n.d<Model> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Model f3476b;

        b(Model model) {
            this.f3476b = model;
        }

        @Override // com.bumptech.glide.load.n.d
        public Class<Model> a() {
            return (Class<Model>) this.f3476b.getClass();
        }

        @Override // com.bumptech.glide.load.n.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.n.d
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.n.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.n.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.n.d.a<? super Model> aVar) {
            aVar.f(this.f3476b);
        }
    }

    @Deprecated
    public v() {
    }

    public static <T> v<T> c() {
        return (v<T>) f3474a;
    }

    @Override // com.bumptech.glide.load.p.n
    public n.a<Model> a(Model model, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(model), new b(model));
    }

    @Override // com.bumptech.glide.load.p.n
    public boolean b(Model model) {
        return true;
    }
}
