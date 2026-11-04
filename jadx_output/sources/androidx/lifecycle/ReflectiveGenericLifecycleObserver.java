package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.C0054a f2080b;

    ReflectiveGenericLifecycleObserver(Object obj) {
        this.f2079a = obj;
        this.f2080b = a.f2085a.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        this.f2080b.a(gVar, bVar, this.f2079a);
    }
}
