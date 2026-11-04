package e.g;

/* JADX INFO: loaded from: classes.dex */
public final class k extends i {
    public static final a g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k f4911f = new k(1, 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e.f.a.a aVar) {
            this();
        }
    }

    public k(long j, long j2) {
        super(j, j2, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            if (!isEmpty() || !((k) obj).isEmpty()) {
                k kVar = (k) obj;
                if (a() != kVar.a() || b() != kVar.b()) {
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
        return (int) ((((long) 31) * (a() ^ (a() >>> 32))) + (b() ^ (b() >>> 32)));
    }

    public boolean isEmpty() {
        return a() > b();
    }

    public String toString() {
        return a() + ".." + b();
    }
}
