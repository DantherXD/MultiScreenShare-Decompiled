package d.a.j;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static b a() {
        return d.a.m.a.c.INSTANCE;
    }

    public static b b(Future<?> future) {
        d.a.m.b.b.c(future, "future is null");
        return c(future, true);
    }

    public static b c(Future<?> future, boolean z) {
        d.a.m.b.b.c(future, "future is null");
        return new d(future, z);
    }

    public static b d(Runnable runnable) {
        d.a.m.b.b.c(runnable, "run is null");
        return new f(runnable);
    }
}
