package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f3823b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f3824c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f3825d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("sInstance")
    private final ArrayList<InterfaceC0093a> f3826e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("sInstance")
    private boolean f3827f = false;

    /* JADX INFO: renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0093a {
        void a(boolean z);
    }

    private a() {
    }

    public static a b() {
        return f3823b;
    }

    public static void c(Application application) {
        a aVar = f3823b;
        synchronized (aVar) {
            if (!aVar.f3827f) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f3827f = true;
            }
        }
    }

    private final void d(boolean z) {
        synchronized (f3823b) {
            ArrayList<InterfaceC0093a> arrayList = this.f3826e;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                InterfaceC0093a interfaceC0093a = arrayList.get(i);
                i++;
                interfaceC0093a.a(z);
            }
        }
    }

    public final void a(InterfaceC0093a interfaceC0093a) {
        synchronized (f3823b) {
            this.f3826e.add(interfaceC0093a);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f3824c.compareAndSet(true, false);
        this.f3825d.set(true);
        if (zCompareAndSet) {
            d(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean zCompareAndSet = this.f3824c.compareAndSet(true, false);
        this.f3825d.set(true);
        if (zCompareAndSet) {
            d(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f3824c.compareAndSet(false, true)) {
            this.f3825d.set(true);
            d(true);
        }
    }
}
