package a.g.k;

/* JADX INFO: loaded from: classes.dex */
public class d<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f601b;

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f600a, this.f600a) && c.a(dVar.f601b, this.f601b);
    }

    public int hashCode() {
        F f2 = this.f600a;
        int iHashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f601b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f600a + " " + this.f601b + "}";
    }
}
