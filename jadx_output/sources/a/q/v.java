package a.q;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroupOverlay f926a;

    v(ViewGroup viewGroup) {
        this.f926a = viewGroup.getOverlay();
    }

    @Override // a.q.w
    public void a(View view) {
        this.f926a.add(view);
    }

    @Override // a.q.b0
    public void b(Drawable drawable) {
        this.f926a.add(drawable);
    }

    @Override // a.q.w
    public void c(View view) {
        this.f926a.remove(view);
    }

    @Override // a.q.b0
    public void d(Drawable drawable) {
        this.f926a.remove(drawable);
    }
}
