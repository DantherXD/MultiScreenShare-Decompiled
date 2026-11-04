package com.bumptech.glide.r.j;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.t.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class i<T extends View, Z> extends com.bumptech.glide.r.j.a<Z> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f3774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f3775c = com.bumptech.glide.h.f3071a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final T f3776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f3777e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnAttachStateChangeListener f3778f;
    private boolean g;
    private boolean h;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static Integer f3779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f3780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<g> f3781c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3782d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ViewTreeObserverOnPreDrawListenerC0089a f3783e;

        /* JADX INFO: renamed from: com.bumptech.glide.r.j.i$a$a, reason: collision with other inner class name */
        private static final class ViewTreeObserverOnPreDrawListenerC0089a implements ViewTreeObserver.OnPreDrawListener {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final WeakReference<a> f3784b;

            ViewTreeObserverOnPreDrawListenerC0089a(a aVar) {
                this.f3784b = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f3784b.get();
                if (aVar == null) {
                    return true;
                }
                aVar.a();
                return true;
            }
        }

        a(View view) {
            this.f3780b = view;
        }

        private static int c(Context context) {
            if (f3779a == null) {
                Display defaultDisplay = ((WindowManager) j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f3779a = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f3779a.intValue();
        }

        private int e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f3782d && this.f3780b.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f3780b.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f3780b.getContext());
        }

        private int f() {
            int paddingTop = this.f3780b.getPaddingTop() + this.f3780b.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f3780b.getLayoutParams();
            return e(this.f3780b.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f3780b.getPaddingLeft() + this.f3780b.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f3780b.getLayoutParams();
            return e(this.f3780b.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        private boolean i(int i, int i2) {
            return h(i) && h(i2);
        }

        private void j(int i, int i2) {
            Iterator it = new ArrayList(this.f3781c).iterator();
            while (it.hasNext()) {
                ((g) it.next()).g(i, i2);
            }
        }

        void a() {
            if (this.f3781c.isEmpty()) {
                return;
            }
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                j(iG, iF);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f3780b.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f3783e);
            }
            this.f3783e = null;
            this.f3781c.clear();
        }

        void d(g gVar) {
            int iG = g();
            int iF = f();
            if (i(iG, iF)) {
                gVar.g(iG, iF);
                return;
            }
            if (!this.f3781c.contains(gVar)) {
                this.f3781c.add(gVar);
            }
            if (this.f3783e == null) {
                ViewTreeObserver viewTreeObserver = this.f3780b.getViewTreeObserver();
                ViewTreeObserverOnPreDrawListenerC0089a viewTreeObserverOnPreDrawListenerC0089a = new ViewTreeObserverOnPreDrawListenerC0089a(this);
                this.f3783e = viewTreeObserverOnPreDrawListenerC0089a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0089a);
            }
        }

        void k(g gVar) {
            this.f3781c.remove(gVar);
        }
    }

    public i(T t) {
        this.f3776d = (T) j.d(t);
        this.f3777e = new a(t);
    }

    private Object l() {
        return this.f3776d.getTag(f3775c);
    }

    private void m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f3778f;
        if (onAttachStateChangeListener == null || this.h) {
            return;
        }
        this.f3776d.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.h = true;
    }

    private void n() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f3778f;
        if (onAttachStateChangeListener == null || !this.h) {
            return;
        }
        this.f3776d.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.h = false;
    }

    private void o(Object obj) {
        f3774b = true;
        this.f3776d.setTag(f3775c, obj);
    }

    @Override // com.bumptech.glide.r.j.h
    public void b(g gVar) {
        this.f3777e.k(gVar);
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void c(Drawable drawable) {
        super.c(drawable);
        m();
    }

    @Override // com.bumptech.glide.r.j.h
    public com.bumptech.glide.r.c g() {
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (objL instanceof com.bumptech.glide.r.c) {
            return (com.bumptech.glide.r.c) objL;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void h(Drawable drawable) {
        super.h(drawable);
        this.f3777e.b();
        if (this.g) {
            return;
        }
        n();
    }

    @Override // com.bumptech.glide.r.j.h
    public void i(g gVar) {
        this.f3777e.d(gVar);
    }

    @Override // com.bumptech.glide.r.j.h
    public void j(com.bumptech.glide.r.c cVar) {
        o(cVar);
    }

    public String toString() {
        return "Target for: " + this.f3776d;
    }
}
