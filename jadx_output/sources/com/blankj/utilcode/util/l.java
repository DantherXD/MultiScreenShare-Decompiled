package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
final class l implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final l f3034b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Activity f3035c = new Activity();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedList<Activity> f3036d = new LinkedList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<k.c> f3037e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map<Activity, List<k.a>> f3038f = new ConcurrentHashMap();
    private int g = 0;
    private int h = 0;
    private boolean i = false;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f3039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f3040c;

        a(Activity activity, Object obj) {
            this.f3039b = activity;
            this.f3040c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Window window = this.f3039b.getWindow();
                if (window != null) {
                    window.setSoftInputMode(((Integer) this.f3040c).intValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    l() {
    }

    private void a(Activity activity, androidx.lifecycle.d.b bVar) {
        b(activity, bVar, this.f3038f.get(activity));
        b(activity, bVar, this.f3038f.get(f3035c));
    }

    private void b(Activity activity, androidx.lifecycle.d.b bVar, List<k.a> list) {
        if (list == null) {
            return;
        }
        for (k.a aVar : list) {
            aVar.g(activity, bVar);
            if (bVar.equals(androidx.lifecycle.d.b.ON_CREATE)) {
                aVar.a(activity);
            } else if (bVar.equals(androidx.lifecycle.d.b.ON_START)) {
                aVar.e(activity);
            } else if (bVar.equals(androidx.lifecycle.d.b.ON_RESUME)) {
                aVar.d(activity);
            } else if (bVar.equals(androidx.lifecycle.d.b.ON_PAUSE)) {
                aVar.c(activity);
            } else if (bVar.equals(androidx.lifecycle.d.b.ON_STOP)) {
                aVar.f(activity);
            } else if (bVar.equals(androidx.lifecycle.d.b.ON_DESTROY)) {
                aVar.b(activity);
            }
        }
        if (bVar.equals(androidx.lifecycle.d.b.ON_DESTROY)) {
            this.f3038f.remove(activity);
        }
    }

    private Object c() {
        Object objD = d();
        return objD != null ? objD : e();
    }

    private Object d() {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e2) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e2.getMessage());
            return null;
        }
    }

    private Object e() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e2) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e2.getMessage());
            return null;
        }
    }

    private void h(Activity activity, boolean z) {
        if (this.f3037e.isEmpty()) {
            return;
        }
        for (k.c cVar : this.f3037e) {
            if (z) {
                cVar.a(activity);
            } else {
                cVar.b(activity);
            }
        }
    }

    private void i(Activity activity, boolean z) {
        try {
            if (z) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
            } else {
                Object tag = activity.getWindow().getDecorView().getTag(-123);
                if (!(tag instanceof Integer)) {
                } else {
                    m.k(new a(activity, tag), 100L);
                }
            }
        } catch (Exception unused) {
        }
    }

    private static void j() {
        if (Build.VERSION.SDK_INT < 26 || !ValueAnimator.areAnimatorsEnabled()) {
            try {
                Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
                declaredField.setAccessible(true);
                if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                    declaredField.set(null, Float.valueOf(1.0f));
                    Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchFieldException e3) {
                e3.printStackTrace();
            }
        }
    }

    private void k(Activity activity) {
        if (this.f3036d.contains(activity)) {
            if (this.f3036d.getFirst().equals(activity)) {
                return;
            } else {
                this.f3036d.remove(activity);
            }
        }
        this.f3036d.addFirst(activity);
    }

    Application f() {
        Object objInvoke;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object objC = c();
            if (objC == null || (objInvoke = cls.getMethod("getApplication", new Class[0]).invoke(objC, new Object[0])) == null) {
                return null;
            }
            return (Application) objInvoke;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    void g(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    void l(Application application) {
        this.f3036d.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (this.f3036d.size() == 0) {
            h(activity, true);
        }
        d.a(activity);
        j();
        k(activity);
        a(activity, androidx.lifecycle.d.b.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        this.f3036d.remove(activity);
        m.b(activity);
        a(activity, androidx.lifecycle.d.b.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        a(activity, androidx.lifecycle.d.b.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        k(activity);
        if (this.i) {
            this.i = false;
            h(activity, true);
        }
        i(activity, false);
        a(activity, androidx.lifecycle.d.b.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        if (!this.i) {
            k(activity);
        }
        int i = this.h;
        if (i < 0) {
            this.h = i + 1;
        } else {
            this.g++;
        }
        a(activity, androidx.lifecycle.d.b.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.h--;
        } else {
            int i = this.g - 1;
            this.g = i;
            if (i <= 0) {
                this.i = true;
                h(activity, false);
            }
        }
        i(activity, true);
        a(activity, androidx.lifecycle.d.b.ON_STOP);
    }
}
