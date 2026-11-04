package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class<?> f1693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f1694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f1695c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f1696d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f1697e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f1698f;
    private static final Handler g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f1699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1700c;

        a(d dVar, Object obj) {
            this.f1699b = dVar;
            this.f1700c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1699b.f1705b = this.f1700c;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.b$b, reason: collision with other inner class name */
    class RunnableC0048b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f1701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ d f1702c;

        RunnableC0048b(Application application, d dVar) {
            this.f1701b = application;
            this.f1702c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1701b.unregisterActivityLifecycleCallbacks(this.f1702c);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f1703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f1704c;

        c(Object obj, Object obj2) {
            this.f1703b = obj;
            this.f1704c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = b.f1696d;
                if (method != null) {
                    method.invoke(this.f1703b, this.f1704c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    b.f1697e.invoke(this.f1703b, this.f1704c, Boolean.FALSE);
                }
            } catch (RuntimeException e2) {
                if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                    throw e2;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    private static final class d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f1705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Activity f1706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f1707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1708e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1709f = false;
        private boolean g = false;

        d(Activity activity) {
            this.f1706c = activity;
            this.f1707d = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f1706c == activity) {
                this.f1706c = null;
                this.f1709f = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f1709f || this.g || this.f1708e || !b.h(this.f1705b, this.f1707d, activity)) {
                return;
            }
            this.g = true;
            this.f1705b = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f1706c == activity) {
                this.f1708e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> clsA = a();
        f1693a = clsA;
        f1694b = b();
        f1695c = f();
        f1696d = d(clsA);
        f1697e = c(clsA);
        f1698f = e(clsA);
    }

    private static Class<?> a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class<?> cls) {
        if (g() && cls != null) {
            try {
                Class<?> cls2 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls2, Configuration.class, Configuration.class, cls2, cls2);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }

    protected static boolean h(Object obj, int i, Activity activity) {
        try {
            Object obj2 = f1695c.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                g.postAtFrontOfQueue(new c(f1694b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f1698f == null) {
            return false;
        }
        if (f1697e == null && f1696d == null) {
            return false;
        }
        try {
            Object obj2 = f1695c.get(activity);
            if (obj2 == null || (obj = f1694b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            d dVar = new d(activity);
            application.registerActivityLifecycleCallbacks(dVar);
            g.post(new a(dVar, obj2));
            try {
                if (g()) {
                    Method method = f1698f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                g.post(new RunnableC0048b(application, dVar));
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
