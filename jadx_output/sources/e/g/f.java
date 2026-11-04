package e.g;

/* JADX INFO: loaded from: classes.dex */
public class f implements Iterable<Integer> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4894b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4897e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e.f.a.a aVar) {
            this();
        }
    }

    public f(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4895c = i;
        this.f4896d = e.e.a.c(i, i2, i3);
        this.f4897e = i3;
    }

    public final int a() {
        return this.f4895c;
    }

    public final int b() {
        return this.f4896d;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.d.b iterator() {
        return new g(this.f4895c, this.f4896d, this.f4897e);
    }
}
