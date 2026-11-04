package d.a.i.b;

import android.os.Handler;
import android.os.Looper;
import d.a.h;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h f4736a = d.a.i.a.a.d(new CallableC0110a());

    /* JADX INFO: renamed from: d.a.i.b.a$a, reason: collision with other inner class name */
    static class CallableC0110a implements Callable<h> {
        CallableC0110a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h call() {
            return b.f4737a;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final h f4737a = new d.a.i.b.b(new Handler(Looper.getMainLooper()));
    }

    public static h a() {
        return d.a.i.a.a.e(f4736a);
    }
}
