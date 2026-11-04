package c.b.a.b.t;

import android.content.Context;
import android.graphics.Color;
import c.b.a.b.x.b;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f2794a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2795b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2796c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f2797d;

    public a(Context context) {
        this.f2794a = b.b(context, c.b.a.b.b.n, false);
        this.f2795b = c.b.a.b.q.a.a(context, c.b.a.b.b.m, 0);
        this.f2796c = c.b.a.b.q.a.a(context, c.b.a.b.b.k, 0);
        this.f2797d = context.getResources().getDisplayMetrics().density;
    }

    private boolean e(int i) {
        return a.g.e.a.d(i, 255) == this.f2796c;
    }

    public float a(float f2) {
        float f3 = this.f2797d;
        if (f3 <= 0.0f || f2 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f2 / f3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i, float f2) {
        float fA = a(f2);
        return a.g.e.a.d(c.b.a.b.q.a.f(a.g.e.a.d(i, 255), this.f2795b, fA), Color.alpha(i));
    }

    public int c(int i, float f2) {
        return (this.f2794a && e(i)) ? b(i, f2) : i;
    }

    public boolean d() {
        return this.f2794a;
    }
}
