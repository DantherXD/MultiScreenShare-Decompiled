package c.b.a.a.a.b;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f2567a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f2568b = null;

    public static a a(Context context) {
        return f2567a.b(context);
    }

    private final synchronized a b(Context context) {
        if (this.f2568b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f2568b = new a(context);
        }
        return this.f2568b;
    }
}
