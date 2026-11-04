package e;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparable<a> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f4879f;
    private final int g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0118a f4876c = new C0118a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4875b = b.a();

    /* JADX INFO: renamed from: e.a$a, reason: collision with other inner class name */
    public static final class C0118a {
        private C0118a() {
        }

        public /* synthetic */ C0118a(e.f.a.a aVar) {
            this();
        }
    }

    public a(int i, int i2, int i3) {
        this.f4878e = i;
        this.f4879f = i2;
        this.g = i3;
        this.f4877d = b(i, i2, i3);
    }

    private final int b(int i, int i2, int i3) {
        if (i >= 0 && 255 >= i && i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3) {
            return (i << 16) + (i2 << 8) + i3;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i + '.' + i2 + '.' + i3).toString());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        e.f.a.b.a(aVar, "other");
        return this.f4877d - aVar.f4877d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            obj = null;
        }
        a aVar = (a) obj;
        return aVar != null && this.f4877d == aVar.f4877d;
    }

    public int hashCode() {
        return this.f4877d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4878e);
        sb.append('.');
        sb.append(this.f4879f);
        sb.append('.');
        sb.append(this.g);
        return sb.toString();
    }
}
