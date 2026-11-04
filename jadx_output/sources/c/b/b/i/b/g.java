package c.b.b.i.b;

/* JADX INFO: loaded from: classes.dex */
abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final g f2867a = new e(null, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f2868b;

    g(g gVar) {
        this.f2868b = gVar;
    }

    final g a(int i, int i2) {
        return new e(this, i, i2);
    }

    final g b(int i, int i2) {
        return new b(this, i, i2);
    }

    abstract void c(c.b.b.j.a aVar, byte[] bArr);

    final g d() {
        return this.f2868b;
    }
}
