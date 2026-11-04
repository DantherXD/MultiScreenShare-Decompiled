package c.a.a.i;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f2469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Type f2471d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient String f2472e;

    public l(l lVar, Object obj, Object obj2) {
        this.f2469b = lVar;
        this.f2468a = obj;
        this.f2470c = obj2;
    }

    public String toString() {
        StringBuilder sb;
        String string;
        if (this.f2472e == null) {
            if (this.f2469b == null) {
                string = "$";
            } else {
                if (this.f2470c instanceof Integer) {
                    sb = new StringBuilder();
                    sb.append(this.f2469b.toString());
                    sb.append("[");
                    sb.append(this.f2470c);
                    sb.append("]");
                } else {
                    sb = new StringBuilder();
                    sb.append(this.f2469b.toString());
                    sb.append(".");
                    sb.append(this.f2470c);
                }
                string = sb.toString();
            }
            this.f2472e = string;
        }
        return this.f2472e;
    }
}
