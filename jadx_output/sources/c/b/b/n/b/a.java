package c.b.b.n.b;

/* JADX INFO: loaded from: classes.dex */
public enum a {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a[] f2974f;
    private final int h;

    static {
        a aVar = L;
        a aVar2 = M;
        a aVar3 = Q;
        f2974f = new a[]{aVar2, aVar, H, aVar3};
    }

    a(int i) {
        this.h = i;
    }

    public int a() {
        return this.h;
    }
}
