package e.g;

/* JADX INFO: loaded from: classes.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f4890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f4891b;

    public boolean a() {
        return this.f4890a > this.f4891b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!a() || !((d) obj).a()) {
                d dVar = (d) obj;
                if (this.f4890a != dVar.f4890a || this.f4891b != dVar.f4891b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return Double.valueOf(this.f4891b).hashCode() + (Double.valueOf(this.f4890a).hashCode() * 31);
    }

    public String toString() {
        return this.f4890a + ".." + this.f4891b;
    }
}
