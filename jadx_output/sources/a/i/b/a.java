package a.i.b;

import a.d.h;
import a.g.l.e0.d;
import a.g.l.e0.e;
import a.g.l.v;
import a.g.l.y;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends a.g.l.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Rect f726d = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a.i.b.b.a<a.g.l.e0.c> f727e = new C0027a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a.i.b.b.InterfaceC0028b<h<a.g.l.e0.c>, a.g.l.e0.c> f728f = new b();
    private final AccessibilityManager k;
    private final View l;
    private c m;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    int n = Integer.MIN_VALUE;
    int o = Integer.MIN_VALUE;
    private int p = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a.i.b.a$a, reason: collision with other inner class name */
    static class C0027a implements a.i.b.b.a<a.g.l.e0.c> {
        C0027a() {
        }

        @Override // a.i.b.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(a.g.l.e0.c cVar, Rect rect) {
            cVar.l(rect);
        }
    }

    static class b implements a.i.b.b.InterfaceC0028b<h<a.g.l.e0.c>, a.g.l.e0.c> {
        b() {
        }

        @Override // a.i.b.b.InterfaceC0028b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a.g.l.e0.c b(h<a.g.l.e0.c> hVar, int i) {
            return hVar.k(i);
        }

        @Override // a.i.b.b.InterfaceC0028b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int a(h<a.g.l.e0.c> hVar) {
            return hVar.j();
        }
    }

    private class c extends d {
        c() {
        }

        @Override // a.g.l.e0.d
        public a.g.l.e0.c b(int i) {
            return a.g.l.e0.c.M(a.this.H(i));
        }

        @Override // a.g.l.e0.d
        public a.g.l.e0.c d(int i) {
            int i2 = i == 2 ? a.this.n : a.this.o;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i2);
        }

        @Override // a.g.l.e0.d
        public boolean f(int i, int i2, Bundle bundle) {
            return a.this.P(i, i2, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.l = view;
        this.k = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (v.A(view) == 0) {
            v.x0(view, 1);
        }
    }

    private static Rect D(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            rect.set(0, -1, width, -1);
        }
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.l.getWindowVisibility() != 0) {
            return false;
        }
        View view = this.l;
        do {
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return parent != null;
            }
            view = (View) parent;
            if (view.getAlpha() <= 0.0f) {
                break;
            }
        } while (view.getVisibility() == 0);
        return false;
    }

    private static int F(int i) {
        if (i == 19) {
            return 33;
        }
        if (i != 21) {
            return i != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i, Rect rect) {
        Object objD;
        h<a.g.l.e0.c> hVarY = y();
        int i2 = this.o;
        a.g.l.e0.c cVarE = i2 == Integer.MIN_VALUE ? null : hVarY.e(i2);
        if (i == 1 || i == 2) {
            objD = a.i.b.b.d(hVarY, f728f, f727e, cVarE, i, v.C(this.l) == 1, false);
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i3 = this.o;
            if (i3 != Integer.MIN_VALUE) {
                z(i3, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.l, i, rect2);
            }
            objD = a.i.b.b.c(hVarY, f728f, f727e, cVarE, rect2, i);
        }
        a.g.l.e0.c cVar = (a.g.l.e0.c) objD;
        return T(cVar != null ? hVarY.h(hVarY.g(cVar)) : Integer.MIN_VALUE);
    }

    private boolean Q(int i, int i2, Bundle bundle) {
        if (i2 == 1) {
            return T(i);
        }
        if (i2 == 2) {
            return o(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? J(i, i2, bundle) : n(i);
        }
        return S(i);
    }

    private boolean R(int i, Bundle bundle) {
        return v.d0(this.l, i, bundle);
    }

    private boolean S(int i) {
        int i2;
        if (!this.k.isEnabled() || !this.k.isTouchExplorationEnabled() || (i2 = this.n) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            n(i2);
        }
        this.n = i;
        this.l.invalidate();
        U(i, 32768);
        return true;
    }

    private void V(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        U(i, 128);
        U(i2, 256);
    }

    private boolean n(int i) {
        if (this.n != i) {
            return false;
        }
        this.n = Integer.MIN_VALUE;
        this.l.invalidate();
        U(i, 65536);
        return true;
    }

    private boolean p() {
        int i = this.o;
        return i != Integer.MIN_VALUE && J(i, 16, null);
    }

    private AccessibilityEvent q(int i, int i2) {
        return i != -1 ? r(i, i2) : s(i2);
    }

    private AccessibilityEvent r(int i, int i2) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
        a.g.l.e0.c cVarH = H(i);
        accessibilityEventObtain.getText().add(cVarH.v());
        accessibilityEventObtain.setContentDescription(cVarH.q());
        accessibilityEventObtain.setScrollable(cVarH.H());
        accessibilityEventObtain.setPassword(cVarH.G());
        accessibilityEventObtain.setEnabled(cVarH.C());
        accessibilityEventObtain.setChecked(cVarH.A());
        L(i, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(cVarH.o());
        e.c(accessibilityEventObtain, this.l, i);
        accessibilityEventObtain.setPackageName(this.l.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i);
        this.l.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private a.g.l.e0.c t(int i) {
        a.g.l.e0.c cVarK = a.g.l.e0.c.K();
        cVarK.b0(true);
        cVarK.d0(true);
        cVarK.W("android.view.View");
        Rect rect = f726d;
        cVarK.S(rect);
        cVarK.T(rect);
        cVarK.k0(this.l);
        N(i, cVarK);
        if (cVarK.v() == null && cVarK.q() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        cVarK.l(this.h);
        if (this.h.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iJ = cVarK.j();
        if ((iJ & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iJ & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        cVarK.i0(this.l.getContext().getPackageName());
        cVarK.p0(this.l, i);
        if (this.n == i) {
            cVarK.Q(true);
            cVarK.a(128);
        } else {
            cVarK.Q(false);
            cVarK.a(64);
        }
        boolean z = this.o == i;
        if (z) {
            cVarK.a(2);
        } else if (cVarK.D()) {
            cVarK.a(1);
        }
        cVarK.e0(z);
        this.l.getLocationOnScreen(this.j);
        cVarK.m(this.g);
        if (this.g.equals(rect)) {
            cVarK.l(this.g);
            if (cVarK.f648c != -1) {
                a.g.l.e0.c cVarK2 = a.g.l.e0.c.K();
                for (int i2 = cVarK.f648c; i2 != -1; i2 = cVarK2.f648c) {
                    cVarK2.l0(this.l, -1);
                    cVarK2.S(f726d);
                    N(i2, cVarK2);
                    cVarK2.l(this.h);
                    Rect rect2 = this.g;
                    Rect rect3 = this.h;
                    rect2.offset(rect3.left, rect3.top);
                }
                cVarK2.O();
            }
            this.g.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
        }
        if (this.l.getLocalVisibleRect(this.i)) {
            this.i.offset(this.j[0] - this.l.getScrollX(), this.j[1] - this.l.getScrollY());
            if (this.g.intersect(this.i)) {
                cVarK.T(this.g);
                if (E(this.g)) {
                    cVarK.t0(true);
                }
            }
        }
        return cVarK;
    }

    private a.g.l.e0.c u() {
        a.g.l.e0.c cVarL = a.g.l.e0.c.L(this.l);
        v.b0(this.l, cVarL);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (cVarL.n() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cVarL.c(this.l, ((Integer) arrayList.get(i)).intValue());
        }
        return cVarL;
    }

    private h<a.g.l.e0.c> y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h<a.g.l.e0.c> hVar = new h<>();
        for (int i = 0; i < arrayList.size(); i++) {
            hVar.i(i, t(i));
        }
        return hVar;
    }

    private void z(int i, Rect rect) {
        H(i).l(rect);
    }

    public final int A() {
        return this.o;
    }

    protected abstract int B(float f2, float f3);

    protected abstract void C(List<Integer> list);

    a.g.l.e0.c H(int i) {
        return i == -1 ? u() : t(i);
    }

    public final void I(boolean z, int i, Rect rect) {
        int i2 = this.o;
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        if (z) {
            G(i, rect);
        }
    }

    protected abstract boolean J(int i, int i2, Bundle bundle);

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i, AccessibilityEvent accessibilityEvent) {
    }

    protected void M(a.g.l.e0.c cVar) {
    }

    protected abstract void N(int i, a.g.l.e0.c cVar);

    protected void O(int i, boolean z) {
    }

    boolean P(int i, int i2, Bundle bundle) {
        return i != -1 ? Q(i, i2, bundle) : R(i2, bundle);
    }

    public final boolean T(int i) {
        int i2;
        if ((!this.l.isFocused() && !this.l.requestFocus()) || (i2 = this.o) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            o(i2);
        }
        this.o = i;
        O(i, true);
        U(i, 8);
        return true;
    }

    public final boolean U(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.k.isEnabled() || (parent = this.l.getParent()) == null) {
            return false;
        }
        return y.h(parent, this.l, q(i, i2));
    }

    @Override // a.g.l.a
    public d b(View view) {
        if (this.m == null) {
            this.m = new c();
        }
        return this.m;
    }

    @Override // a.g.l.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // a.g.l.a
    public void g(View view, a.g.l.e0.c cVar) {
        super.g(view, cVar);
        M(cVar);
    }

    public final boolean o(int i) {
        if (this.o != i) {
            return false;
        }
        this.o = Integer.MIN_VALUE;
        O(i, false);
        U(i, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (!this.k.isEnabled() || !this.k.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            return iB != Integer.MIN_VALUE;
        }
        if (action != 10 || this.p == Integer.MIN_VALUE) {
            return false;
        }
        V(Integer.MIN_VALUE);
        return true;
    }

    public final boolean w(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return G(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return G(1, null);
            }
            return false;
        }
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    int iF = F(keyCode);
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z = false;
                    while (i < repeatCount && G(iF, null)) {
                        i++;
                        z = true;
                    }
                    return z;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        p();
        return true;
    }

    public final int x() {
        return this.n;
    }
}
