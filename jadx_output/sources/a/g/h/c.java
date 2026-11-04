package a.g.h;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f509e;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i < 18 || i >= 29) {
            return;
        }
        try {
            f505a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
            Class cls = Long.TYPE;
            f506b = Trace.class.getMethod("isTagEnabled", cls);
            Class cls2 = Integer.TYPE;
            f507c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
            f508d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
            f509e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
        } catch (Exception e2) {
            Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
        }
    }

    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
