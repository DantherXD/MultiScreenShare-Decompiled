package e.g;

/* JADX INFO: loaded from: classes.dex */
public final class h extends f {
    public static final a g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h f4902f = new h(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e.f.a.a aVar) {
            this();
        }
    }

    public h(int i, int i2) {
        super(i, i2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (a() != hVar.a() || b() != hVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return b() + (a() * 31);
    }

    public boolean isEmpty() {
        return a() > b();
    }

    public String toString() {
        return a() + ".." + b();
    }
}
