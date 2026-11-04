package c.b.b;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2836b;

    public int a() {
        return this.f2836b;
    }

    public int b() {
        return this.f2835a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f2835a == bVar.f2835a && this.f2836b == bVar.f2836b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f2835a * 32713) + this.f2836b;
    }

    public String toString() {
        return this.f2835a + "x" + this.f2836b;
    }
}
