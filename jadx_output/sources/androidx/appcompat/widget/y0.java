package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Toolbar f1535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f1537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f1538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f1539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1540f;
    private Drawable g;
    private boolean h;
    CharSequence i;
    private CharSequence j;
    private CharSequence k;
    Window.Callback l;
    boolean m;
    private c n;
    private int o;
    private int p;
    private Drawable q;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.appcompat.view.menu.a f1541b;

        a() {
            this.f1541b = new androidx.appcompat.view.menu.a(y0.this.f1535a.getContext(), 0, R.id.home, 0, 0, y0.this.i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            y0 y0Var = y0.this;
            Window.Callback callback = y0Var.l;
            if (callback == null || !y0Var.m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f1541b);
        }
    }

    class b extends a.g.l.b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1543a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1544b;

        b(int i) {
            this.f1544b = i;
        }

        @Override // a.g.l.a0
        public void a(View view) {
            if (this.f1543a) {
                return;
            }
            y0.this.f1535a.setVisibility(this.f1544b);
        }

        @Override // a.g.l.b0, a.g.l.a0
        public void b(View view) {
            y0.this.f1535a.setVisibility(0);
        }

        @Override // a.g.l.b0, a.g.l.a0
        public void c(View view) {
            this.f1543a = true;
        }
    }

    public y0(Toolbar toolbar, boolean z) {
        this(toolbar, z, a.a.h.f37a, a.a.e.n);
    }

    public y0(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.o = 0;
        this.p = 0;
        this.f1535a = toolbar;
        this.i = toolbar.getTitle();
        this.j = toolbar.getSubtitle();
        this.h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        x0 x0VarV = x0.v(toolbar.getContext(), null, a.a.j.f47a, a.a.a.f2c, 0);
        this.q = x0VarV.g(a.a.j.l);
        if (z) {
            CharSequence charSequenceP = x0VarV.p(a.a.j.r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                E(charSequenceP);
            }
            CharSequence charSequenceP2 = x0VarV.p(a.a.j.p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                D(charSequenceP2);
            }
            Drawable drawableG = x0VarV.g(a.a.j.n);
            if (drawableG != null) {
                z(drawableG);
            }
            Drawable drawableG2 = x0VarV.g(a.a.j.m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.g == null && (drawable = this.q) != null) {
                C(drawable);
            }
            v(x0VarV.k(a.a.j.h, 0));
            int iN = x0VarV.n(a.a.j.g, 0);
            if (iN != 0) {
                x(LayoutInflater.from(this.f1535a.getContext()).inflate(iN, (ViewGroup) this.f1535a, false));
                v(this.f1536b | 16);
            }
            int iM = x0VarV.m(a.a.j.j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1535a.getLayoutParams();
                layoutParams.height = iM;
                this.f1535a.setLayoutParams(layoutParams);
            }
            int iE = x0VarV.e(a.a.j.f52f, -1);
            int iE2 = x0VarV.e(a.a.j.f51e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f1535a.H(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = x0VarV.n(a.a.j.s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f1535a;
                toolbar2.K(toolbar2.getContext(), iN2);
            }
            int iN3 = x0VarV.n(a.a.j.q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f1535a;
                toolbar3.J(toolbar3.getContext(), iN3);
            }
            int iN4 = x0VarV.n(a.a.j.o, 0);
            if (iN4 != 0) {
                this.f1535a.setPopupTheme(iN4);
            }
        } else {
            this.f1536b = w();
        }
        x0VarV.w();
        y(i);
        this.k = this.f1535a.getNavigationContentDescription();
        this.f1535a.setNavigationOnClickListener(new a());
    }

    private void F(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f1536b & 8) != 0) {
            this.f1535a.setTitle(charSequence);
        }
    }

    private void G() {
        if ((this.f1536b & 4) != 0) {
            if (TextUtils.isEmpty(this.k)) {
                this.f1535a.setNavigationContentDescription(this.p);
            } else {
                this.f1535a.setNavigationContentDescription(this.k);
            }
        }
    }

    private void H() {
        if ((this.f1536b & 4) == 0) {
            this.f1535a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f1535a;
        Drawable drawable = this.g;
        if (drawable == null) {
            drawable = this.q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void I() {
        Drawable drawable;
        int i = this.f1536b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f1540f) == null) {
            drawable = this.f1539e;
        }
        this.f1535a.setLogo(drawable);
    }

    private int w() {
        if (this.f1535a.getNavigationIcon() == null) {
            return 11;
        }
        this.q = this.f1535a.getNavigationIcon();
        return 15;
    }

    public void A(int i) {
        B(i == 0 ? null : o().getString(i));
    }

    public void B(CharSequence charSequence) {
        this.k = charSequence;
        G();
    }

    public void C(Drawable drawable) {
        this.g = drawable;
        H();
    }

    public void D(CharSequence charSequence) {
        this.j = charSequence;
        if ((this.f1536b & 8) != 0) {
            this.f1535a.setSubtitle(charSequence);
        }
    }

    public void E(CharSequence charSequence) {
        this.h = true;
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void a(Menu menu, androidx.appcompat.view.menu.m.a aVar) {
        if (this.n == null) {
            c cVar = new c(this.f1535a.getContext());
            this.n = cVar;
            cVar.p(a.a.f.g);
        }
        this.n.h(aVar);
        this.f1535a.I((androidx.appcompat.view.menu.g) menu, this.n);
    }

    @Override // androidx.appcompat.widget.e0
    public boolean b() {
        return this.f1535a.z();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean c() {
        return this.f1535a.A();
    }

    @Override // androidx.appcompat.widget.e0
    public void collapseActionView() {
        this.f1535a.e();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean d() {
        return this.f1535a.w();
    }

    @Override // androidx.appcompat.widget.e0
    public boolean e() {
        return this.f1535a.N();
    }

    @Override // androidx.appcompat.widget.e0
    public void f() {
        this.m = true;
    }

    @Override // androidx.appcompat.widget.e0
    public boolean g() {
        return this.f1535a.d();
    }

    @Override // androidx.appcompat.widget.e0
    public CharSequence getTitle() {
        return this.f1535a.getTitle();
    }

    @Override // androidx.appcompat.widget.e0
    public void h() {
        this.f1535a.f();
    }

    @Override // androidx.appcompat.widget.e0
    public int i() {
        return this.f1536b;
    }

    @Override // androidx.appcompat.widget.e0
    public void j(int i) {
        this.f1535a.setVisibility(i);
    }

    @Override // androidx.appcompat.widget.e0
    public void k(int i) {
        z(i != 0 ? a.a.k.a.a.d(o(), i) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void l(q0 q0Var) {
        View view = this.f1537c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1535a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1537c);
            }
        }
        this.f1537c = q0Var;
        if (q0Var == null || this.o != 2) {
            return;
        }
        this.f1535a.addView(q0Var, 0);
        Toolbar.e eVar = (Toolbar.e) this.f1537c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) eVar).width = -2;
        ((ViewGroup.MarginLayoutParams) eVar).height = -2;
        eVar.f1078a = 8388691;
        q0Var.setAllowCollapse(true);
    }

    @Override // androidx.appcompat.widget.e0
    public ViewGroup m() {
        return this.f1535a;
    }

    @Override // androidx.appcompat.widget.e0
    public void n(boolean z) {
    }

    @Override // androidx.appcompat.widget.e0
    public Context o() {
        return this.f1535a.getContext();
    }

    @Override // androidx.appcompat.widget.e0
    public int p() {
        return this.o;
    }

    @Override // androidx.appcompat.widget.e0
    public a.g.l.z q(int i, long j) {
        return a.g.l.v.d(this.f1535a).a(i == 0 ? 1.0f : 0.0f).d(j).f(new b(i));
    }

    @Override // androidx.appcompat.widget.e0
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public boolean s() {
        return this.f1535a.v();
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(int i) {
        setIcon(i != 0 ? a.a.k.a.a.d(o(), i) : null);
    }

    @Override // androidx.appcompat.widget.e0
    public void setIcon(Drawable drawable) {
        this.f1539e = drawable;
        I();
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowCallback(Window.Callback callback) {
        this.l = callback;
    }

    @Override // androidx.appcompat.widget.e0
    public void setWindowTitle(CharSequence charSequence) {
        if (this.h) {
            return;
        }
        F(charSequence);
    }

    @Override // androidx.appcompat.widget.e0
    public void t() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // androidx.appcompat.widget.e0
    public void u(boolean z) {
        this.f1535a.setCollapsible(z);
    }

    @Override // androidx.appcompat.widget.e0
    public void v(int i) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i2 = this.f1536b ^ i;
        this.f1536b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    G();
                }
                H();
            }
            if ((i2 & 3) != 0) {
                I();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1535a.setTitle(this.i);
                    toolbar = this.f1535a;
                    charSequence = this.j;
                } else {
                    charSequence = null;
                    this.f1535a.setTitle((CharSequence) null);
                    toolbar = this.f1535a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i2 & 16) == 0 || (view = this.f1538d) == null) {
                return;
            }
            int i3 = i & 16;
            Toolbar toolbar2 = this.f1535a;
            if (i3 != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    public void x(View view) {
        View view2 = this.f1538d;
        if (view2 != null && (this.f1536b & 16) != 0) {
            this.f1535a.removeView(view2);
        }
        this.f1538d = view;
        if (view == null || (this.f1536b & 16) == 0) {
            return;
        }
        this.f1535a.addView(view);
    }

    public void y(int i) {
        if (i == this.p) {
            return;
        }
        this.p = i;
        if (TextUtils.isEmpty(this.f1535a.getNavigationContentDescription())) {
            A(this.p);
        }
    }

    public void z(Drawable drawable) {
        this.f1540f = drawable;
        I();
    }
}
