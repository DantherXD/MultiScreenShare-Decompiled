package com.google.android.material.behavior;

import a.g.l.e0.f;
import a.g.l.v;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a.i.b.c f3885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c f3886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3887c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3889e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f3888d = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f3890f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final a.i.b.c.AbstractC0029c j = new a();

    class a extends a.i.b.c.AbstractC0029c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3891a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3892b = -1;

        a() {
        }

        private boolean n(View view, float f2) {
            if (f2 == 0.0f) {
                return Math.abs(view.getLeft() - this.f3891a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.g);
            }
            boolean z = v.C(view) == 1;
            int i = SwipeDismissBehavior.this.f3890f;
            if (i == 2) {
                return true;
            }
            if (i == 0) {
                if (z) {
                    if (f2 >= 0.0f) {
                        return false;
                    }
                } else if (f2 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i != 1) {
                return false;
            }
            if (z) {
                if (f2 <= 0.0f) {
                    return false;
                }
            } else if (f2 >= 0.0f) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x001c  */
        /* JADX WARN: Code duplicated, block: B:9:0x0012  */
        @Override // a.i.b.c.AbstractC0029c
        public int a(View view, int i, int i2) {
            int width;
            int width2;
            boolean z = v.C(view) == 1;
            int i3 = SwipeDismissBehavior.this.f3890f;
            if (i3 == 0) {
                if (z) {
                    width = this.f3891a - view.getWidth();
                    width2 = this.f3891a;
                } else {
                    width = this.f3891a;
                    width2 = view.getWidth() + width;
                }
            } else if (i3 != 1) {
                width = this.f3891a - view.getWidth();
                width2 = this.f3891a + view.getWidth();
            } else if (z) {
                width = this.f3891a;
                width2 = view.getWidth() + width;
            } else {
                width = this.f3891a - view.getWidth();
                width2 = this.f3891a;
            }
            return SwipeDismissBehavior.G(width, i, width2);
        }

        @Override // a.i.b.c.AbstractC0029c
        public int b(View view, int i, int i2) {
            return view.getTop();
        }

        @Override // a.i.b.c.AbstractC0029c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // a.i.b.c.AbstractC0029c
        public void i(View view, int i) {
            this.f3892b = i;
            this.f3891a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // a.i.b.c.AbstractC0029c
        public void j(int i) {
            c cVar = SwipeDismissBehavior.this.f3886b;
            if (cVar != null) {
                cVar.b(i);
            }
        }

        @Override // a.i.b.c.AbstractC0029c
        public void k(View view, int i, int i2, int i3, int i4) {
            float width = this.f3891a + (view.getWidth() * SwipeDismissBehavior.this.h);
            float width2 = this.f3891a + (view.getWidth() * SwipeDismissBehavior.this.i);
            float f2 = i;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(0.0f, 1.0f - SwipeDismissBehavior.I(width, width2, f2), 1.0f));
            }
        }

        @Override // a.i.b.c.AbstractC0029c
        public void l(View view, float f2, float f3) {
            int i;
            boolean z;
            c cVar;
            this.f3892b = -1;
            int width = view.getWidth();
            if (n(view, f2)) {
                int left = view.getLeft();
                int i2 = this.f3891a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f3891a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f3885a.F(i, view.getTop())) {
                v.g0(view, new d(view, z));
            } else {
                if (!z || (cVar = SwipeDismissBehavior.this.f3886b) == null) {
                    return;
                }
                cVar.a(view);
            }
        }

        @Override // a.i.b.c.AbstractC0029c
        public boolean m(View view, int i) {
            int i2 = this.f3892b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.E(view);
        }
    }

    class b implements f {
        b() {
        }

        @Override // a.g.l.e0.f
        public boolean a(View view, f.a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.E(view)) {
                return false;
            }
            boolean z2 = v.C(view) == 1;
            int i = SwipeDismissBehavior.this.f3890f;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            v.Y(view, width);
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f3886b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i);
    }

    private class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f3895b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f3896c;

        d(View view, boolean z) {
            this.f3895b = view;
            this.f3896c = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            a.i.b.c cVar2 = SwipeDismissBehavior.this.f3885a;
            if (cVar2 != null && cVar2.k(true)) {
                v.g0(this.f3895b, this);
            } else {
                if (!this.f3896c || (cVar = SwipeDismissBehavior.this.f3886b) == null) {
                    return;
                }
                cVar.a(this.f3895b);
            }
        }
    }

    static float F(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    private void H(ViewGroup viewGroup) {
        if (this.f3885a == null) {
            this.f3885a = this.f3889e ? a.i.b.c.l(viewGroup, this.f3888d, this.j) : a.i.b.c.m(viewGroup, this.j);
        }
    }

    static float I(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    private void M(View view) {
        v.i0(view, 1048576);
        if (E(view)) {
            v.k0(view, a.g.l.e0.c.a.u, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        a.i.b.c cVar = this.f3885a;
        if (cVar == null) {
            return false;
        }
        cVar.z(motionEvent);
        return true;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f2) {
        this.i = F(0.0f, f2, 1.0f);
    }

    public void K(float f2) {
        this.h = F(0.0f, f2, 1.0f);
    }

    public void L(int i) {
        this.f3890f = i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean zB = this.f3887c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zB = coordinatorLayout.B(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3887c = zB;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3887c = false;
        }
        if (!zB) {
            return false;
        }
        H(coordinatorLayout);
        return this.f3885a.G(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean zL = super.l(coordinatorLayout, v, i);
        if (v.A(v) == 0) {
            v.x0(v, 1);
            M(v);
        }
        return zL;
    }
}
