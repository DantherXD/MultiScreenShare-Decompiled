package com.google.firebase;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.util.i;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.m;
import com.google.firebase.components.o;
import com.google.firebase.components.r;
import com.google.firebase.components.y;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f4379a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f4380b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("LOCK")
    static final Map<String, f> f4381c = new a.d.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f4382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h f4384f;
    private final r g;
    private final y<com.google.firebase.o.a> j;
    private final AtomicBoolean h = new AtomicBoolean(false);
    private final AtomicBoolean i = new AtomicBoolean();
    private final List<b> k = new CopyOnWriteArrayList();
    private final List<?> l = new CopyOnWriteArrayList();

    public interface b {
        void a(boolean z);
    }

    @TargetApi(14)
    private static class c implements com.google.android.gms.common.api.internal.a.InterfaceC0093a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference<c> f4385a = new AtomicReference<>();

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void c(Context context) {
            if (com.google.android.gms.common.util.h.a() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f4385a.get() == null) {
                    c cVar = new c();
                    if (f4385a.compareAndSet(null, cVar)) {
                        com.google.android.gms.common.api.internal.a.c(application);
                        com.google.android.gms.common.api.internal.a.b().a(cVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.a.InterfaceC0093a
        public void a(boolean z) {
            synchronized (f.f4379a) {
                for (f fVar : new ArrayList(f.f4381c.values())) {
                    if (fVar.h.get()) {
                        fVar.t(z);
                    }
                }
            }
        }
    }

    private static class d implements Executor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Handler f4386a = new Handler(Looper.getMainLooper());

        private d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            f4386a.post(runnable);
        }
    }

    @TargetApi(24)
    private static class e extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference<e> f4387a = new AtomicReference<>();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Context f4388b;

        public e(Context context) {
            this.f4388b = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f4387a.get() == null) {
                e eVar = new e(context);
                if (f4387a.compareAndSet(null, eVar)) {
                    context.registerReceiver(eVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f4388b.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f4379a) {
                Iterator<f> it = f.f4381c.values().iterator();
                while (it.hasNext()) {
                    it.next().l();
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, h hVar) {
        this.f4382d = (Context) com.google.android.gms.common.internal.b.d(context);
        this.f4383e = com.google.android.gms.common.internal.b.b(str);
        this.f4384f = (h) com.google.android.gms.common.internal.b.d(hVar);
        this.g = r.e(f4380b).c(o.b(context, ComponentDiscoveryService.class).a()).b(new FirebaseCommonRegistrar()).a(m.n(context, Context.class, new Class[0])).a(m.n(this, f.class, new Class[0])).a(m.n(hVar, h.class, new Class[0])).d();
        this.j = new y<>(new com.google.firebase.n.b() { // from class: com.google.firebase.a
            @Override // com.google.firebase.n.b
            public final Object a() {
                return this.f4301a.r(context);
            }
        });
    }

    private void e() {
        com.google.android.gms.common.internal.b.f(!this.i.get(), "FirebaseApp was deleted");
    }

    public static f h() {
        f fVar;
        synchronized (f4379a) {
            fVar = f4381c.get("[DEFAULT]");
            if (fVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + i.a() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!a.g.h.d.a(this.f4382d)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + i());
            e.b(this.f4382d);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + i());
        this.g.h(p());
    }

    public static f m(Context context) {
        synchronized (f4379a) {
            if (f4381c.containsKey("[DEFAULT]")) {
                return h();
            }
            h hVarA = h.a(context);
            if (hVarA == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return n(context, hVarA);
        }
    }

    public static f n(Context context, h hVar) {
        return o(context, hVar, "[DEFAULT]");
    }

    public static f o(Context context, h hVar, String str) {
        f fVar;
        c.c(context);
        String strS = s(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f4379a) {
            Map<String, f> map = f4381c;
            com.google.android.gms.common.internal.b.f(!map.containsKey(strS), "FirebaseApp name " + strS + " already exists!");
            com.google.android.gms.common.internal.b.e(context, "Application context cannot be null.");
            fVar = new f(context, strS, hVar);
            map.put(strS, fVar);
        }
        fVar.l();
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ com.google.firebase.o.a r(Context context) {
        return new com.google.firebase.o.a(context, k(), (com.google.firebase.l.c) this.g.a(com.google.firebase.l.c.class));
    }

    private static String s(String str) {
        return str.trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator<b> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f4383e.equals(((f) obj).i());
        }
        return false;
    }

    public <T> T f(Class<T> cls) {
        e();
        return (T) this.g.a(cls);
    }

    public Context g() {
        e();
        return this.f4382d;
    }

    public int hashCode() {
        return this.f4383e.hashCode();
    }

    public String i() {
        e();
        return this.f4383e;
    }

    public h j() {
        e();
        return this.f4384f;
    }

    public String k() {
        return com.google.android.gms.common.util.b.a(i().getBytes(Charset.defaultCharset())) + "+" + com.google.android.gms.common.util.b.a(j().c().getBytes(Charset.defaultCharset()));
    }

    public boolean p() {
        return "[DEFAULT]".equals(i());
    }

    public String toString() {
        return com.google.android.gms.common.internal.a.c(this).a("name", this.f4383e).a("options", this.f4384f).toString();
    }
}
