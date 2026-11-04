package c.b.b.i.b;

/* JADX INFO: loaded from: classes.dex */
final class e extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f2860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f2861d;

    e(g gVar, int i, int i2) {
        super(gVar);
        this.f2860c = (short) i;
        this.f2861d = (short) i2;
    }

    @Override // c.b.b.i.b.g
    void c(c.b.b.j.a aVar, byte[] bArr) {
        aVar.c(this.f2860c, this.f2861d);
    }

    public String toString() {
        short s = this.f2860c;
        short s2 = this.f2861d;
        return "<" + Integer.toBinaryString((1 << this.f2861d) | (s & ((1 << s2) - 1)) | (1 << s2)).substring(1) + '>';
    }
}
