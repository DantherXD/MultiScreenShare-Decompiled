package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.o;

/* JADX INFO: loaded from: classes.dex */
public class d extends Activity implements androidx.lifecycle.g, a.g.l.f.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.d.g<Class<?>, ?> f1710b = new a.d.g<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.lifecycle.h f1711c = new androidx.lifecycle.h(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.g.l.f.d(decorView, keyEvent)) {
            return a.g.l.f.e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !a.g.l.f.d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // a.g.l.f.a
    public boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o.f(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        this.f1711c.j(androidx.lifecycle.d.c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
