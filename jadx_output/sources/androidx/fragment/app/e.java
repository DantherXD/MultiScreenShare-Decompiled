package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
public class e extends ComponentActivity {
    boolean n;
    boolean o;
    final i l = i.b(new c());
    final androidx.lifecycle.h m = new androidx.lifecycle.h(this);
    boolean p = true;

    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            e.this.t();
            e.this.m.h(androidx.lifecycle.d.b.ON_STOP);
            Parcelable parcelableX = e.this.l.x();
            if (parcelableX != null) {
                bundle.putParcelable("android:support:fragments", parcelableX);
            }
            return bundle;
        }
    }

    class b implements androidx.activity.d.b {
        b() {
        }

        @Override // androidx.activity.d.b
        public void a(Context context) {
            e.this.l.a(null);
            Bundle bundleA = e.this.c().a("android:support:fragments");
            if (bundleA != null) {
                e.this.l.w(bundleA.getParcelable("android:support:fragments"));
            }
        }
    }

    class c extends k<e> implements androidx.lifecycle.s, androidx.activity.c, androidx.activity.result.e, r {
        public c() {
            super(e.this);
        }

        @Override // androidx.lifecycle.g
        public androidx.lifecycle.d a() {
            return e.this.m;
        }

        @Override // androidx.activity.c
        public OnBackPressedDispatcher b() {
            return e.this.b();
        }

        @Override // androidx.activity.result.e
        public androidx.activity.result.d d() {
            return e.this.d();
        }

        @Override // androidx.fragment.app.r
        public void e(n nVar, Fragment fragment) {
            e.this.v(fragment);
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public View g(int i) {
            return e.this.findViewById(i);
        }

        @Override // androidx.lifecycle.s
        public androidx.lifecycle.r h() {
            return e.this.h();
        }

        @Override // androidx.fragment.app.k, androidx.fragment.app.g
        public boolean i() {
            Window window = e.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.k
        public LayoutInflater n() {
            return e.this.getLayoutInflater().cloneInContext(e.this);
        }

        @Override // androidx.fragment.app.k
        public boolean o(Fragment fragment) {
            return !e.this.isFinishing();
        }

        @Override // androidx.fragment.app.k
        public void p() {
            e.this.y();
        }

        @Override // androidx.fragment.app.k
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public e m() {
            return e.this;
        }
    }

    public e() {
        s();
    }

    private void s() {
        c().d("android:support:fragments", new a());
        m(new b());
    }

    private static boolean u(n nVar, androidx.lifecycle.d.c cVar) {
        boolean zU = false;
        for (Fragment fragment : nVar.r0()) {
            if (fragment != null) {
                if (fragment.z() != null) {
                    zU |= u(fragment.p(), cVar);
                }
                a0 a0Var = fragment.V;
                if (a0Var != null && a0Var.a().b().a(androidx.lifecycle.d.c.STARTED)) {
                    fragment.V.j(cVar);
                    zU = true;
                }
                if (fragment.U.b().a(androidx.lifecycle.d.c.STARTED)) {
                    fragment.U.o(cVar);
                    zU = true;
                }
            }
        }
        return zU;
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.n);
        printWriter.print(" mResumed=");
        printWriter.print(this.o);
        printWriter.print(" mStopped=");
        printWriter.print(this.p);
        if (getApplication() != null) {
            a.m.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.l.t().W(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        this.l.u();
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.l.u();
        super.onConfigurationChanged(configuration);
        this.l.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.d, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.m.h(androidx.lifecycle.d.b.ON_CREATE);
        this.l.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        return this.l.g(menu, getMenuInflater()) | super.onCreatePanelMenu(i, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewQ = q(view, str, context, attributeSet);
        return viewQ == null ? super.onCreateView(view, str, context, attributeSet) : viewQ;
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewQ = q(null, str, context, attributeSet);
        return viewQ == null ? super.onCreateView(str, context, attributeSet) : viewQ;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.l.h();
        this.m.h(androidx.lifecycle.d.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.l.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 0) {
            return this.l.k(menuItem);
        }
        if (i != 6) {
            return false;
        }
        return this.l.e(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.l.j(z);
    }

    @Override // android.app.Activity
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.l.u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.l.l(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.o = false;
        this.l.m();
        this.m.h(androidx.lifecycle.d.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.l.n(z);
    }

    @Override // android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        x();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        if (i != 0) {
            return super.onPreparePanel(i, view, menu);
        }
        return this.l.o(menu) | w(view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.l.u();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.l.u();
        super.onResume();
        this.o = true;
        this.l.s();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.l.u();
        super.onStart();
        this.p = false;
        if (!this.n) {
            this.n = true;
            this.l.c();
        }
        this.l.s();
        this.m.h(androidx.lifecycle.d.b.ON_START);
        this.l.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.l.u();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        this.p = true;
        t();
        this.l.r();
        this.m.h(androidx.lifecycle.d.b.ON_STOP);
    }

    final View q(View view, String str, Context context, AttributeSet attributeSet) {
        return this.l.v(view, str, context, attributeSet);
    }

    public n r() {
        return this.l.t();
    }

    void t() {
        while (u(r(), androidx.lifecycle.d.c.CREATED)) {
        }
    }

    @Deprecated
    public void v(Fragment fragment) {
    }

    @Deprecated
    protected boolean w(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    protected void x() {
        this.m.h(androidx.lifecycle.d.b.ON_RESUME);
        this.l.p();
    }

    @Deprecated
    public void y() {
        invalidateOptionsMenu();
    }
}
