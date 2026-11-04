package c.b.a.a.c;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Executor f2584a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Executor f2585b = new c0();

    private static final class a implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f2586a = new c.b.a.a.b.a.a(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f2586a.post(runnable);
        }
    }
}
