package e.g;

/* JADX INFO: loaded from: classes.dex */
public class a implements Iterable<Character> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0119a f4881b = new C0119a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final char f4882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final char f4883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4884e;

    /* JADX INFO: renamed from: e.g.a$a, reason: collision with other inner class name */
    public static final class C0119a {
        private C0119a() {
        }

        public /* synthetic */ C0119a(e.f.a.a aVar) {
            this();
        }
    }

    public a(char c2, char c3, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4882c = c2;
        this.f4883d = (char) e.e.a.c(c2, c3, i);
        this.f4884e = i;
    }

    public final char a() {
        return this.f4882c;
    }

    public final char b() {
        return this.f4883d;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.d.a iterator() {
        return new b(this.f4882c, this.f4883d, this.f4884e);
    }
}
