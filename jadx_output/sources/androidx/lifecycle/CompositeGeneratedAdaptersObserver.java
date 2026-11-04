package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class CompositeGeneratedAdaptersObserver implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c[] f2060a;

    CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.f2060a = cVarArr;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        k kVar = new k();
        for (c cVar : this.f2060a) {
            cVar.a(gVar, bVar, false, kVar);
        }
        for (c cVar2 : this.f2060a) {
            cVar2.a(gVar, bVar, true, kVar);
        }
    }
}
