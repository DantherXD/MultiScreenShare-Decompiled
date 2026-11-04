package e.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends e.g.a {
    public static final a g = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f4889f = new c((char) 1, (char) 0);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e.f.a.a aVar) {
            this();
        }
    }

    public c(char c2, char c3) {
        super(c2, c3, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof c) {
            if (!isEmpty() || !((c) obj).isEmpty()) {
                c cVar = (c) obj;
                if (a() != cVar.a() || b() != cVar.b()) {
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
        return e.f.a.b.b(a(), b()) > 0;
    }

    public String toString() {
        return a() + ".." + b();
    }
}
