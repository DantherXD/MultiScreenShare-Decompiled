package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class k<E> extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Activity f1925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f1926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f1927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final n f1929f;

    k(Activity activity, Context context, Handler handler, int i) {
        this.f1929f = new o();
        this.f1925b = activity;
        this.f1926c = (Context) a.g.k.h.f(context, "context == null");
        this.f1927d = (Handler) a.g.k.h.f(handler, "handler == null");
        this.f1928e = i;
    }

    k(e eVar) {
        this(eVar, eVar, new Handler(), 0);
    }

    @Override // androidx.fragment.app.g
    public View g(int i) {
        return null;
    }

    @Override // androidx.fragment.app.g
    public boolean i() {
        return true;
    }

    Activity j() {
        return this.f1925b;
    }

    Context k() {
        return this.f1926c;
    }

    Handler l() {
        return this.f1927d;
    }

    public abstract E m();

    public LayoutInflater n() {
        return LayoutInflater.from(this.f1926c);
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public void p() {
    }
}
