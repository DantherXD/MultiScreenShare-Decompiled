package e.g;

/* JADX INFO: loaded from: classes.dex */
public class i implements Iterable<Long> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f4903b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f4904c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f4905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4906e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e.f.a.a aVar) {
            this();
        }
    }

    public i(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4904c = j;
        this.f4905d = e.e.a.d(j, j2, j3);
        this.f4906e = j3;
    }

    public final long a() {
        return this.f4904c;
    }

    public final long b() {
        return this.f4905d;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.d.c iterator() {
        return new j(this.f4904c, this.f4905d, this.f4906e);
    }
}
