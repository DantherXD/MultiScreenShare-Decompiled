package a.g.l;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f622a;

    private d(Object obj) {
        this.f622a = obj;
    }

    static d a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new d(obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return a.g.k.c.a(this.f622a, ((d) obj).f622a);
    }

    public int hashCode() {
        Object obj = this.f622a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f622a + "}";
    }
}
