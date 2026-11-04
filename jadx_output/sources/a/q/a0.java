package a.q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
class a0 implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewOverlay f812a;

    a0(View view) {
        this.f812a = view.getOverlay();
    }

    @Override // a.q.b0
    public void b(Drawable drawable) {
        this.f812a.add(drawable);
    }

    @Override // a.q.b0
    public void d(Drawable drawable) {
        this.f812a.remove(drawable);
    }
}
