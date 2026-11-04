package androidx.appcompat.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.c1;
import androidx.lifecycle.t;
import androidx.lifecycle.u;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
public class c extends androidx.fragment.app.e implements d, androidx.core.app.l.a {
    private e q;
    private Resources r;

    class a implements SavedStateRegistry.b {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.b
        public Bundle a() {
            Bundle bundle = new Bundle();
            c.this.z().u(bundle);
            return bundle;
        }
    }

    class b implements androidx.activity.d.b {
        b() {
        }

        @Override // androidx.activity.d.b
        public void a(Context context) {
            e eVarZ = c.this.z();
            eVarZ.n();
            eVarZ.q(c.this.c().a("androidx:appcompat"));
        }
    }

    public c() {
        B();
    }

    private void B() {
        c().d("androidx:appcompat", new a());
        m(new b());
    }

    private boolean H(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    private void o() {
        t.a(getWindow().getDecorView(), this);
        u.a(getWindow().getDecorView(), this);
        androidx.savedstate.d.a(getWindow().getDecorView(), this);
    }

    public androidx.appcompat.app.a A() {
        return z().m();
    }

    public void C(androidx.core.app.l lVar) {
        lVar.b(this);
    }

    protected void D(int i) {
    }

    public void E(androidx.core.app.l lVar) {
    }

    @Deprecated
    public void F() {
    }

    public boolean G() {
        Intent intentF = f();
        if (intentF == null) {
            return false;
        }
        if (!J(intentF)) {
            I(intentF);
            return true;
        }
        androidx.core.app.l lVarD = androidx.core.app.l.d(this);
        C(lVarD);
        E(lVarD);
        lVarD.e();
        try {
            androidx.core.app.a.i(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public void I(Intent intent) {
        androidx.core.app.e.e(this, intent);
    }

    public boolean J(Intent intent) {
        return androidx.core.app.e.f(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        z().d(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(z().f(context));
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        androidx.appcompat.app.a aVarA = A();
        if (getWindow().hasFeature(0)) {
            if (aVarA == null || !aVarA.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // androidx.core.app.d, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.appcompat.app.a aVarA = A();
        if (keyCode == 82 && aVarA != null && aVarA.p(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.core.app.l.a
    public Intent f() {
        return androidx.core.app.e.a(this);
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        return (T) z().i(i);
    }

    @Override // androidx.appcompat.app.d
    public void g(a.a.n.b bVar) {
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return z().l();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.r == null && c1.b()) {
            this.r = new c1(this, super.getResources());
        }
        Resources resources = this.r;
        return resources == null ? super.getResources() : resources;
    }

    @Override // androidx.appcompat.app.d
    public void i(a.a.n.b bVar) {
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        z().o();
    }

    @Override // androidx.appcompat.app.d
    public a.a.n.b j(a.a.n.b.a aVar) {
        return null;
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.r != null) {
            this.r.updateConfiguration(configuration, super.getResources().getDisplayMetrics());
        }
        z().p(configuration);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        F();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        z().r();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (H(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        androidx.appcompat.app.a aVarA = A();
        if (menuItem.getItemId() != 16908332 || aVarA == null || (aVarA.j() & 4) == 0) {
            return false;
        }
        return G();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.fragment.app.e, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        z().s(bundle);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onPostResume() {
        super.onPostResume();
        z().t();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStart() {
        super.onStart();
        z().v();
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    protected void onStop() {
        super.onStop();
        z().w();
    }

    @Override // android.app.Activity
    protected void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        z().E(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        androidx.appcompat.app.a aVarA = A();
        if (getWindow().hasFeature(0)) {
            if (aVarA == null || !aVarA.q()) {
                super.openOptionsMenu();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i) {
        o();
        z().A(i);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        o();
        z().B(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        o();
        z().C(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        z().D(i);
    }

    @Override // androidx.fragment.app.e
    public void y() {
        z().o();
    }

    public e z() {
        if (this.q == null) {
            this.q = e.g(this, this);
        }
        return this.q;
    }
}
