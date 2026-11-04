package c.a.a.j;

/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f2532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f2533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2535d;

    public w(w wVar, Object obj, Object obj2, int i) {
        this.f2532a = wVar;
        this.f2533b = obj;
        this.f2534c = obj2;
        this.f2535d = i;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f2532a == null) {
            return "$";
        }
        if (this.f2534c instanceof Integer) {
            sb = new StringBuilder();
            sb.append(this.f2532a.toString());
            sb.append("[");
            sb.append(this.f2534c);
            sb.append("]");
        } else {
            sb = new StringBuilder();
            sb.append(this.f2532a.toString());
            sb.append(".");
            sb.append(this.f2534c);
        }
        return sb.toString();
    }
}
