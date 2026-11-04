package a.g.l;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ViewTreeObserver f683c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f684d;

    private t(View view, Runnable runnable) {
        this.f682b = view;
        this.f683c = view.getViewTreeObserver();
        this.f684d = runnable;
    }

    public static t a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        t tVar = new t(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(tVar);
        view.addOnAttachStateChangeListener(tVar);
        return tVar;
    }

    public void b() {
        (this.f683c.isAlive() ? this.f683c : this.f682b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f682b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f684d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f683c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
