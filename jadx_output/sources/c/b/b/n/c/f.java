package c.b.b.n.c;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c.b.b.n.b.b f3001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c.b.b.n.b.a f3002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c.b.b.n.b.c f3003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3004d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f3005e;

    public static boolean b(int i) {
        return i >= 0 && i < 8;
    }

    public b a() {
        return this.f3005e;
    }

    public void c(c.b.b.n.b.a aVar) {
        this.f3002b = aVar;
    }

    public void d(int i) {
        this.f3004d = i;
    }

    public void e(b bVar) {
        this.f3005e = bVar;
    }

    public void f(c.b.b.n.b.b bVar) {
        this.f3001a = bVar;
    }

    public void g(c.b.b.n.b.c cVar) {
        this.f3003c = cVar;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("<<\n");
        sb.append(" mode: ");
        sb.append(this.f3001a);
        sb.append("\n ecLevel: ");
        sb.append(this.f3002b);
        sb.append("\n version: ");
        sb.append(this.f3003c);
        sb.append("\n maskPattern: ");
        sb.append(this.f3004d);
        if (this.f3005e == null) {
            sb.append("\n matrix: null\n");
        } else {
            sb.append("\n matrix:\n");
            sb.append(this.f3005e);
        }
        sb.append(">>\n");
        return sb.toString();
    }
}
