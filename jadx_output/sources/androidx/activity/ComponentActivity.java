package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.d implements g, s, androidx.savedstate.c, androidx.activity.c, androidx.activity.result.e {
    private r g;
    private int i;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final androidx.activity.d.a f990d = new androidx.activity.d.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final h f991e = new h(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final androidx.savedstate.b f992f = androidx.savedstate.b.a(this);
    private final OnBackPressedDispatcher h = new OnBackPressedDispatcher(new a());
    private final AtomicInteger j = new AtomicInteger();
    private final androidx.activity.result.d k = new b();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    class b extends androidx.activity.result.d {
        b() {
        }
    }

    class c implements SavedStateRegistry.b {
        c() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        @SuppressLint({"SyntheticAccessor"})
        public Bundle a() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.k.f(bundle);
            return bundle;
        }
    }

    class d implements androidx.activity.d.b {
        d() {
        }

        @Override // androidx.activity.d.b
        @SuppressLint({"SyntheticAccessor"})
        public void a(Context context) {
            Bundle bundleA = ComponentActivity.this.c().a("android:support:activity-result");
            if (bundleA != null) {
                ComponentActivity.this.k.e(bundleA);
            }
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        r f1000b;

        e() {
        }
    }

    public ComponentActivity() {
        if (a() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            a().a(new androidx.lifecycle.e() { // from class: androidx.activity.ComponentActivity.3
                @Override // androidx.lifecycle.e
                public void d(g gVar, androidx.lifecycle.d.b bVar) {
                    if (bVar == androidx.lifecycle.d.b.ON_STOP) {
                        Window window = ComponentActivity.this.getWindow();
                        View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                        if (viewPeekDecorView != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                        }
                    }
                }
            });
        }
        a().a(new androidx.lifecycle.e() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.e
            public void d(g gVar, androidx.lifecycle.d.b bVar) {
                if (bVar == androidx.lifecycle.d.b.ON_DESTROY) {
                    ComponentActivity.this.f990d.b();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.h().a();
                }
            }
        });
        a().a(new androidx.lifecycle.e() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.e
            public void d(g gVar, androidx.lifecycle.d.b bVar) {
                ComponentActivity.this.n();
                ComponentActivity.this.a().c(this);
            }
        });
        if (19 <= i && i <= 23) {
            a().a(new ImmLeaksCleaner(this));
        }
        c().d("android:support:activity-result", new c());
        m(new d());
    }

    private void o() {
        t.a(getWindow().getDecorView(), this);
        u.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        return this.f991e;
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        o();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.c
    public final OnBackPressedDispatcher b() {
        return this.h;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry c() {
        return this.f992f.b();
    }

    @Override // androidx.activity.result.e
    public final androidx.activity.result.d d() {
        return this.k;
    }

    @Override // androidx.lifecycle.s
    public r h() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        n();
        return this.g;
    }

    public final void m(androidx.activity.d.b bVar) {
        this.f990d.a(bVar);
    }

    void n() {
        if (this.g == null) {
            e eVar = (e) getLastNonConfigurationInstance();
            if (eVar != null) {
                this.g = eVar.f1000b;
            }
            if (this.g == null) {
                this.g = new r();
            }
        }
    }

    @Override // android.app.Activity
    @Deprecated
    protected void onActivityResult(int i, int i2, Intent intent) {
        if (this.k.b(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.h.c();
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.f992f.c(bundle);
        this.f990d.c(this);
        super.onCreate(bundle);
        o.f(this);
        int i = this.i;
        if (i != 0) {
            setContentView(i);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (this.k.b(i, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        e eVar;
        Object objP = p();
        r rVar = this.g;
        if (rVar == null && (eVar = (e) getLastNonConfigurationInstance()) != null) {
            rVar = eVar.f1000b;
        }
        if (rVar == null && objP == null) {
            return null;
        }
        e eVar2 = new e();
        eVar2.f999a = objP;
        eVar2.f1000b = rVar;
        return eVar2;
    }

    @Override // androidx.core.app.d, android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        androidx.lifecycle.d dVarA = a();
        if (dVarA instanceof h) {
            ((h) dVarA).o(androidx.lifecycle.d.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f992f.d(bundle);
    }

    @Deprecated
    public Object p() {
        return null;
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (a.p.a.d()) {
                a.p.a.a("reportFullyDrawn() for " + getComponentName());
            }
            int i = Build.VERSION.SDK_INT;
            if (i > 19 || (i == 19 && a.g.d.a.a(this, "android.permission.UPDATE_DEVICE_STATS") == 0)) {
                super.reportFullyDrawn();
            }
        } finally {
            a.p.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        o();
        super.setContentView(i);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        o();
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        o();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i) {
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
