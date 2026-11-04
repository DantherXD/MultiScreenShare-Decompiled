package com.google.firebase.components;

/* JADX INFO: loaded from: classes.dex */
class b0<T> implements com.google.firebase.n.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.n.a<Object> f4311a = new com.google.firebase.n.a() { // from class: com.google.firebase.components.k
        @Override // com.google.firebase.n.a
        public final void a(com.google.firebase.n.b bVar) {
            b0.c(bVar);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.google.firebase.n.b<Object> f4312b = new com.google.firebase.n.b() { // from class: com.google.firebase.components.j
        @Override // com.google.firebase.n.b
        public final Object a() {
            b0.d();
            return null;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.google.firebase.n.a<T> f4313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile com.google.firebase.n.b<T> f4314d;

    private b0(com.google.firebase.n.a<T> aVar, com.google.firebase.n.b<T> bVar) {
        this.f4313c = aVar;
        this.f4314d = bVar;
    }

    static <T> b0<T> b() {
        return new b0<>(f4311a, f4312b);
    }

    static /* synthetic */ void c(com.google.firebase.n.b bVar) {
    }

    static /* synthetic */ Object d() {
        return null;
    }

    @Override // com.google.firebase.n.b
    public T a() {
        return this.f4314d.a();
    }

    void e(com.google.firebase.n.b<T> bVar) {
        com.google.firebase.n.a<T> aVar;
        if (this.f4314d != f4312b) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f4313c;
            this.f4313c = null;
            this.f4314d = bVar;
        }
        aVar.a(bVar);
    }
}
