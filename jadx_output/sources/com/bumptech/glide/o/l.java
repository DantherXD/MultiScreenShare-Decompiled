package com.bumptech.glide.o;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f3709a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile com.bumptech.glide.k f3710b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f3713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b f3714f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map<FragmentManager, k> f3711c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map<androidx.fragment.app.n, o> f3712d = new HashMap();
    private final a.d.a<View, Fragment> g = new a.d.a<>();
    private final a.d.a<View, android.app.Fragment> h = new a.d.a<>();
    private final Bundle i = new Bundle();

    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.o.l.b
        public com.bumptech.glide.k a(com.bumptech.glide.c cVar, h hVar, m mVar, Context context) {
            return new com.bumptech.glide.k(cVar, hVar, mVar, context);
        }
    }

    public interface b {
        com.bumptech.glide.k a(com.bumptech.glide.c cVar, h hVar, m mVar, Context context);
    }

    public l(b bVar) {
        this.f3714f = bVar == null ? f3709a : bVar;
        this.f3713e = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    private static void a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static Activity b(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return b(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    @Deprecated
    private com.bumptech.glide.k c(Context context, FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        k kVarI = i(fragmentManager, fragment, z);
        com.bumptech.glide.k kVarE = kVarI.e();
        if (kVarE != null) {
            return kVarE;
        }
        com.bumptech.glide.k kVarA = this.f3714f.a(com.bumptech.glide.c.c(context), kVarI.c(), kVarI.f(), context);
        kVarI.k(kVarA);
        return kVarA;
    }

    private com.bumptech.glide.k g(Context context) {
        if (this.f3710b == null) {
            synchronized (this) {
                if (this.f3710b == null) {
                    this.f3710b = this.f3714f.a(com.bumptech.glide.c.c(context.getApplicationContext()), new com.bumptech.glide.o.b(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.f3710b;
    }

    private k i(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f3711c.get(fragmentManager)) == null) {
            kVar = new k();
            kVar.j(fragment);
            if (z) {
                kVar.c().d();
            }
            this.f3711c.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f3713e.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    private o k(androidx.fragment.app.n nVar, Fragment fragment, boolean z) {
        o oVar = (o) nVar.h0("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.f3712d.get(nVar)) == null) {
            oVar = new o();
            oVar.M1(fragment);
            if (z) {
                oVar.E1().d();
            }
            this.f3712d.put(nVar, oVar);
            nVar.l().d(oVar, "com.bumptech.glide.manager").g();
            this.f3713e.obtainMessage(2, nVar).sendToTarget();
        }
        return oVar;
    }

    private static boolean l(Context context) {
        Activity activityB = b(context);
        return activityB == null || !activityB.isFinishing();
    }

    private com.bumptech.glide.k m(Context context, androidx.fragment.app.n nVar, Fragment fragment, boolean z) {
        o oVarK = k(nVar, fragment, z);
        com.bumptech.glide.k kVarG1 = oVarK.G1();
        if (kVarG1 != null) {
            return kVarG1;
        }
        com.bumptech.glide.k kVarA = this.f3714f.a(com.bumptech.glide.c.c(context), oVarK.E1(), oVarK.H1(), context);
        oVarK.N1(kVarA);
        return kVarA;
    }

    public com.bumptech.glide.k d(Activity activity) {
        if (com.bumptech.glide.t.k.o()) {
            return e(activity.getApplicationContext());
        }
        a(activity);
        return c(activity, activity.getFragmentManager(), null, l(activity));
    }

    public com.bumptech.glide.k e(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (com.bumptech.glide.t.k.p() && !(context instanceof Application)) {
            if (context instanceof androidx.fragment.app.e) {
                return f((androidx.fragment.app.e) context);
            }
            if (context instanceof Activity) {
                return d((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return e(contextWrapper.getBaseContext());
                }
            }
        }
        return g(context);
    }

    public com.bumptech.glide.k f(androidx.fragment.app.e eVar) {
        if (com.bumptech.glide.t.k.o()) {
            return e(eVar.getApplicationContext());
        }
        a(eVar);
        return m(eVar, eVar.r(), null, l(eVar));
    }

    @Deprecated
    k h(Activity activity) {
        return i(activity.getFragmentManager(), null, l(activity));
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        Object obj;
        Map map;
        Object obj2;
        int i = message.what;
        Object objRemove = null;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
                obj2 = null;
            } else {
                obj = (androidx.fragment.app.n) message.obj;
                map = this.f3712d;
            }
            if (z && objRemove == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
            }
            return z;
        }
        obj = (FragmentManager) message.obj;
        map = this.f3711c;
        Object obj3 = obj;
        objRemove = map.remove(obj);
        obj2 = obj3;
        if (z) {
            Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z;
    }

    o j(Context context, androidx.fragment.app.n nVar) {
        return k(nVar, null, l(context));
    }
}
