package androidx.appcompat.app;

import a.g.l.a0;
import a.g.l.b0;
import a.g.l.c0;
import a.g.l.v;
import a.g.l.z;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.e0;
import androidx.appcompat.widget.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class m extends androidx.appcompat.app.a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Interpolator f1149a = new AccelerateInterpolator();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Interpolator f1150b = new DecelerateInterpolator();
    a.a.n.h A;
    private boolean B;
    boolean C;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Context f1151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f1152d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f1153e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ActionBarOverlayLayout f1154f;
    ActionBarContainer g;
    e0 h;
    ActionBarContextView i;
    View j;
    q0 k;
    private boolean n;
    d o;
    a.a.n.b p;
    a.a.n.b.a q;
    private boolean r;
    private boolean t;
    boolean w;
    boolean x;
    private boolean y;
    private ArrayList<?> l = new ArrayList<>();
    private int m = -1;
    private ArrayList<androidx.appcompat.app.a.b> s = new ArrayList<>();
    private int u = 0;
    boolean v = true;
    private boolean z = true;
    final a0 D = new a();
    final a0 E = new b();
    final c0 F = new c();

    class a extends b0 {
        a() {
        }

        @Override // a.g.l.a0
        public void a(View view) {
            View view2;
            m mVar = m.this;
            if (mVar.v && (view2 = mVar.j) != null) {
                view2.setTranslationY(0.0f);
                m.this.g.setTranslationY(0.0f);
            }
            m.this.g.setVisibility(8);
            m.this.g.setTransitioning(false);
            m mVar2 = m.this;
            mVar2.A = null;
            mVar2.x();
            ActionBarOverlayLayout actionBarOverlayLayout = m.this.f1154f;
            if (actionBarOverlayLayout != null) {
                v.l0(actionBarOverlayLayout);
            }
        }
    }

    class b extends b0 {
        b() {
        }

        @Override // a.g.l.a0
        public void a(View view) {
            m mVar = m.this;
            mVar.A = null;
            mVar.g.requestLayout();
        }
    }

    class c implements c0 {
        c() {
        }

        @Override // a.g.l.c0
        public void a(View view) {
            ((View) m.this.g.getParent()).invalidate();
        }
    }

    public class d extends a.a.n.b implements androidx.appcompat.view.menu.g.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Context f1158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final androidx.appcompat.view.menu.g f1159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private a.a.n.b.a f1160f;
        private WeakReference<View> g;

        public d(Context context, a.a.n.b.a aVar) {
            this.f1158d = context;
            this.f1160f = aVar;
            androidx.appcompat.view.menu.g gVarS = new androidx.appcompat.view.menu.g(context).S(1);
            this.f1159e = gVarS;
            gVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            a.a.n.b.a aVar = this.f1160f;
            if (aVar != null) {
                return aVar.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (this.f1160f == null) {
                return;
            }
            k();
            m.this.i.l();
        }

        @Override // a.a.n.b
        public void c() {
            m mVar = m.this;
            if (mVar.o != this) {
                return;
            }
            if (m.w(mVar.w, mVar.x, false)) {
                this.f1160f.d(this);
            } else {
                m mVar2 = m.this;
                mVar2.p = this;
                mVar2.q = this.f1160f;
            }
            this.f1160f = null;
            m.this.v(false);
            m.this.i.g();
            m.this.h.m().sendAccessibilityEvent(32);
            m mVar3 = m.this;
            mVar3.f1154f.setHideOnContentScrollEnabled(mVar3.C);
            m.this.o = null;
        }

        @Override // a.a.n.b
        public View d() {
            WeakReference<View> weakReference = this.g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // a.a.n.b
        public Menu e() {
            return this.f1159e;
        }

        @Override // a.a.n.b
        public MenuInflater f() {
            return new a.a.n.g(this.f1158d);
        }

        @Override // a.a.n.b
        public CharSequence g() {
            return m.this.i.getSubtitle();
        }

        @Override // a.a.n.b
        public CharSequence i() {
            return m.this.i.getTitle();
        }

        @Override // a.a.n.b
        public void k() {
            if (m.this.o != this) {
                return;
            }
            this.f1159e.d0();
            try {
                this.f1160f.a(this, this.f1159e);
            } finally {
                this.f1159e.c0();
            }
        }

        @Override // a.a.n.b
        public boolean l() {
            return m.this.i.j();
        }

        @Override // a.a.n.b
        public void m(View view) {
            m.this.i.setCustomView(view);
            this.g = new WeakReference<>(view);
        }

        @Override // a.a.n.b
        public void n(int i) {
            o(m.this.f1151c.getResources().getString(i));
        }

        @Override // a.a.n.b
        public void o(CharSequence charSequence) {
            m.this.i.setSubtitle(charSequence);
        }

        @Override // a.a.n.b
        public void q(int i) {
            r(m.this.f1151c.getResources().getString(i));
        }

        @Override // a.a.n.b
        public void r(CharSequence charSequence) {
            m.this.i.setTitle(charSequence);
        }

        @Override // a.a.n.b
        public void s(boolean z) {
            super.s(z);
            m.this.i.setTitleOptional(z);
        }

        public boolean t() {
            this.f1159e.d0();
            try {
                return this.f1160f.c(this, this.f1159e);
            } finally {
                this.f1159e.c0();
            }
        }
    }

    public m(Activity activity, boolean z) {
        this.f1153e = activity;
        View decorView = activity.getWindow().getDecorView();
        D(decorView);
        if (z) {
            return;
        }
        this.j = decorView.findViewById(R.id.content);
    }

    public m(Dialog dialog) {
        D(dialog.getWindow().getDecorView());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private e0 A(View view) {
        if (view instanceof e0) {
            return (e0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    private void C() {
        if (this.y) {
            this.y = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f1154f;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            M(false);
        }
    }

    private void D(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(a.a.f.p);
        this.f1154f = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.h = A(view.findViewById(a.a.f.f25a));
        this.i = (ActionBarContextView) view.findViewById(a.a.f.f30f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(a.a.f.f27c);
        this.g = actionBarContainer;
        e0 e0Var = this.h;
        if (e0Var == null || this.i == null || actionBarContainer == null) {
            throw new IllegalStateException(m.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f1151c = e0Var.o();
        boolean z = (this.h.i() & 4) != 0;
        if (z) {
            this.n = true;
        }
        a.a.n.a aVarB = a.a.n.a.b(this.f1151c);
        J(aVarB.a() || z);
        H(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f1151c.obtainStyledAttributes(null, a.a.j.f47a, a.a.a.f2c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(a.a.j.k, false)) {
            I(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(a.a.j.i, 0);
        if (dimensionPixelSize != 0) {
            G(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void H(boolean z) {
        this.t = z;
        if (z) {
            this.g.setTabContainer(null);
            this.h.l(this.k);
        } else {
            this.h.l(null);
            this.g.setTabContainer(this.k);
        }
        boolean z2 = B() == 2;
        q0 q0Var = this.k;
        if (q0Var != null) {
            if (z2) {
                q0Var.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f1154f;
                if (actionBarOverlayLayout != null) {
                    v.l0(actionBarOverlayLayout);
                }
            } else {
                q0Var.setVisibility(8);
            }
        }
        this.h.u(!this.t && z2);
        this.f1154f.setHasNonEmbeddedTabs(!this.t && z2);
    }

    private boolean K() {
        return v.T(this.g);
    }

    private void L() {
        if (this.y) {
            return;
        }
        this.y = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1154f;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        M(false);
    }

    private void M(boolean z) {
        if (w(this.w, this.x, this.y)) {
            if (this.z) {
                return;
            }
            this.z = true;
            z(z);
            return;
        }
        if (this.z) {
            this.z = false;
            y(z);
        }
    }

    static boolean w(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return (z || z2) ? false : true;
    }

    public int B() {
        return this.h.p();
    }

    public void E(boolean z) {
        F(z ? 4 : 0, 4);
    }

    public void F(int i, int i2) {
        int i3 = this.h.i();
        if ((i2 & 4) != 0) {
            this.n = true;
        }
        this.h.v((i & i2) | ((~i2) & i3));
    }

    public void G(float f2) {
        v.v0(this.g, f2);
    }

    public void I(boolean z) {
        if (z && !this.f1154f.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.C = z;
        this.f1154f.setHideOnContentScrollEnabled(z);
    }

    public void J(boolean z) {
        this.h.n(z);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a(boolean z) {
        this.v = z;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
        if (this.x) {
            this.x = false;
            M(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
        a.a.n.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
            this.A = null;
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(int i) {
        this.u = i;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.x) {
            return;
        }
        this.x = true;
        M(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
    }

    @Override // androidx.appcompat.app.a
    public boolean h() {
        e0 e0Var = this.h;
        if (e0Var == null || !e0Var.s()) {
            return false;
        }
        this.h.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.a
    public void i(boolean z) {
        if (z == this.r) {
            return;
        }
        this.r = z;
        int size = this.s.size();
        for (int i = 0; i < size; i++) {
            this.s.get(i).a(z);
        }
    }

    @Override // androidx.appcompat.app.a
    public int j() {
        return this.h.i();
    }

    @Override // androidx.appcompat.app.a
    public Context k() {
        if (this.f1152d == null) {
            TypedValue typedValue = new TypedValue();
            this.f1151c.getTheme().resolveAttribute(a.a.a.g, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f1152d = new ContextThemeWrapper(this.f1151c, i);
            } else {
                this.f1152d = this.f1151c;
            }
        }
        return this.f1152d;
    }

    @Override // androidx.appcompat.app.a
    public void m(Configuration configuration) {
        H(a.a.n.a.b(this.f1151c).g());
    }

    @Override // androidx.appcompat.app.a
    public boolean o(int i, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.o;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.a
    public void r(boolean z) {
        if (this.n) {
            return;
        }
        E(z);
    }

    @Override // androidx.appcompat.app.a
    public void s(boolean z) {
        a.a.n.h hVar;
        this.B = z;
        if (z || (hVar = this.A) == null) {
            return;
        }
        hVar.a();
    }

    @Override // androidx.appcompat.app.a
    public void t(CharSequence charSequence) {
        this.h.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.a
    public a.a.n.b u(a.a.n.b.a aVar) {
        d dVar = this.o;
        if (dVar != null) {
            dVar.c();
        }
        this.f1154f.setHideOnContentScrollEnabled(false);
        this.i.k();
        d dVar2 = new d(this.i.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.o = dVar2;
        dVar2.k();
        this.i.h(dVar2);
        v(true);
        this.i.sendAccessibilityEvent(32);
        return dVar2;
    }

    public void v(boolean z) {
        z zVarF;
        z zVarF2;
        if (z) {
            L();
        } else {
            C();
        }
        if (!K()) {
            if (z) {
                this.h.j(4);
                this.i.setVisibility(0);
                return;
            } else {
                this.h.j(0);
                this.i.setVisibility(8);
                return;
            }
        }
        if (z) {
            zVarF = this.h.q(4, 100L);
            zVarF2 = this.i.f(0, 200L);
        } else {
            z zVarQ = this.h.q(0, 200L);
            zVarF = this.i.f(8, 100L);
            zVarF2 = zVarQ;
        }
        a.a.n.h hVar = new a.a.n.h();
        hVar.d(zVarF, zVarF2);
        hVar.h();
    }

    void x() {
        a.a.n.b.a aVar = this.q;
        if (aVar != null) {
            aVar.d(this.p);
            this.p = null;
            this.q = null;
        }
    }

    public void y(boolean z) {
        View view;
        a.a.n.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        if (this.u != 0 || (!this.B && !z)) {
            this.D.a(null);
            return;
        }
        this.g.setAlpha(1.0f);
        this.g.setTransitioning(true);
        a.a.n.h hVar2 = new a.a.n.h();
        float f2 = -this.g.getHeight();
        if (z) {
            int[] iArr = {0, 0};
            this.g.getLocationInWindow(iArr);
            f2 -= iArr[1];
        }
        z zVarK = v.d(this.g).k(f2);
        zVarK.i(this.F);
        hVar2.c(zVarK);
        if (this.v && (view = this.j) != null) {
            hVar2.c(v.d(view).k(f2));
        }
        hVar2.f(f1149a);
        hVar2.e(250L);
        hVar2.g(this.D);
        this.A = hVar2;
        hVar2.h();
    }

    public void z(boolean z) {
        View view;
        View view2;
        a.a.n.h hVar = this.A;
        if (hVar != null) {
            hVar.a();
        }
        this.g.setVisibility(0);
        if (this.u == 0 && (this.B || z)) {
            this.g.setTranslationY(0.0f);
            float f2 = -this.g.getHeight();
            if (z) {
                int[] iArr = {0, 0};
                this.g.getLocationInWindow(iArr);
                f2 -= iArr[1];
            }
            this.g.setTranslationY(f2);
            a.a.n.h hVar2 = new a.a.n.h();
            z zVarK = v.d(this.g).k(0.0f);
            zVarK.i(this.F);
            hVar2.c(zVarK);
            if (this.v && (view2 = this.j) != null) {
                view2.setTranslationY(f2);
                hVar2.c(v.d(this.j).k(0.0f));
            }
            hVar2.f(f1150b);
            hVar2.e(250L);
            hVar2.g(this.E);
            this.A = hVar2;
            hVar2.h();
        } else {
            this.g.setAlpha(1.0f);
            this.g.setTranslationY(0.0f);
            if (this.v && (view = this.j) != null) {
                view.setTranslationY(0.0f);
            }
            this.E.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f1154f;
        if (actionBarOverlayLayout != null) {
            v.l0(actionBarOverlayLayout);
        }
    }
}
