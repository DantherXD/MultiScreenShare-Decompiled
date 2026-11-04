package a.e.a.m.m;

/* JADX INFO: loaded from: classes.dex */
class g extends f {
    public int m;

    public g(p pVar) {
        super(pVar);
        this.f342e = pVar instanceof l ? f.a.HORIZONTAL_DIMENSION : f.a.VERTICAL_DIMENSION;
    }

    @Override // a.e.a.m.m.f
    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }
}
