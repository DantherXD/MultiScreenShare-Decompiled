package a.g.l;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private InterfaceC0019b f611c;

    public interface a {
    }

    /* JADX INFO: renamed from: a.g.l.b$b, reason: collision with other inner class name */
    public interface InterfaceC0019b {
        void onActionProviderVisibilityChanged(boolean z);
    }

    public b(Context context) {
        this.f609a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public void f(SubMenu subMenu) {
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f611c = null;
        this.f610b = null;
    }

    public void i(a aVar) {
        this.f610b = aVar;
    }

    public void j(InterfaceC0019b interfaceC0019b) {
        if (this.f611c != null && interfaceC0019b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f611c = interfaceC0019b;
    }
}
