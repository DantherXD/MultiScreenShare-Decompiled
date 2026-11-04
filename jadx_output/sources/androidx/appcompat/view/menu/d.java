package androidx.appcompat.view.menu;

import a.g.l.v;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.l0;
import androidx.appcompat.widget.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f1183c = a.a.g.f35e;
    ViewTreeObserver A;
    private PopupWindow.OnDismissListener B;
    boolean C;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f1184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1186f;
    private final int g;
    private final boolean h;
    final Handler i;
    private View q;
    View r;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean y;
    private m.a z;
    private final List<g> j = new ArrayList();
    final List<C0041d> k = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener l = new a();
    private final View.OnAttachStateChangeListener m = new b();
    private final l0 n = new c();
    private int o = 0;
    private int p = 0;
    private boolean x = false;
    private int s = D();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!d.this.b() || d.this.k.size() <= 0 || d.this.k.get(0).f1194a.B()) {
                return;
            }
            View view = d.this.r;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0041d> it = d.this.k.iterator();
            while (it.hasNext()) {
                it.next().f1194a.g();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = d.this.A;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.A = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.A.removeGlobalOnLayoutListener(dVar.l);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements l0 {

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0041d f1190b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ MenuItem f1191c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ g f1192d;

            a(C0041d c0041d, MenuItem menuItem, g gVar) {
                this.f1190b = c0041d;
                this.f1191c = menuItem;
                this.f1192d = gVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                C0041d c0041d = this.f1190b;
                if (c0041d != null) {
                    d.this.C = true;
                    c0041d.f1195b.e(false);
                    d.this.C = false;
                }
                if (this.f1191c.isEnabled() && this.f1191c.hasSubMenu()) {
                    this.f1192d.L(this.f1191c, 4);
                }
            }
        }

        c() {
        }

        @Override // androidx.appcompat.widget.l0
        public void a(g gVar, MenuItem menuItem) {
            d.this.i.removeCallbacksAndMessages(null);
            int size = d.this.k.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (gVar == d.this.k.get(i).f1195b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            d.this.i.postAtTime(new a(i2 < d.this.k.size() ? d.this.k.get(i2) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // androidx.appcompat.widget.l0
        public void i(g gVar, MenuItem menuItem) {
            d.this.i.removeCallbacksAndMessages(gVar);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.d$d, reason: collision with other inner class name */
    private static class C0041d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m0 f1194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f1195b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1196c;

        public C0041d(m0 m0Var, g gVar, int i) {
            this.f1194a = m0Var;
            this.f1195b = gVar;
            this.f1196c = i;
        }

        public ListView a() {
            return this.f1194a.l();
        }
    }

    public d(Context context, View view, int i, int i2, boolean z) {
        this.f1184d = context;
        this.q = view;
        this.f1186f = i;
        this.g = i2;
        this.h = z;
        Resources resources = context.getResources();
        this.f1185e = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(a.a.d.f16d));
        this.i = new Handler();
    }

    private int A(g gVar) {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (gVar == this.k.get(i).f1195b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem B(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = gVar.getItem(i);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View C(C0041d c0041d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(c0041d.f1195b, gVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = c0041d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemB == fVar.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int D() {
        return v.C(this.q) == 1 ? 0 : 1;
    }

    private int E(int i) {
        List<C0041d> list = this.k;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.r.getWindowVisibleDisplayFrame(rect);
        if (this.s == 1) {
            return (iArr[0] + listViewA.getWidth()) + i > rect.right ? 0 : 1;
        }
        return iArr[0] - i < 0 ? 1 : 0;
    }

    private void F(g gVar) {
        C0041d c0041d;
        View viewC;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f1184d);
        f fVar = new f(gVar, layoutInflaterFrom, this.h, f1183c);
        if (!b() && this.x) {
            fVar.d(true);
        } else if (b()) {
            fVar.d(k.x(gVar));
        }
        int iO = k.o(fVar, null, this.f1184d, this.f1185e);
        m0 m0VarZ = z();
        m0VarZ.o(fVar);
        m0VarZ.F(iO);
        m0VarZ.G(this.p);
        if (this.k.size() > 0) {
            List<C0041d> list = this.k;
            c0041d = list.get(list.size() - 1);
            viewC = C(c0041d, gVar);
        } else {
            c0041d = null;
            viewC = null;
        }
        if (viewC != null) {
            m0VarZ.U(false);
            m0VarZ.R(null);
            int iE = E(iO);
            boolean z = iE == 1;
            this.s = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                m0VarZ.D(viewC);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.q.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.p & 7) == 5) {
                    iArr[0] = iArr[0] + this.q.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.p & 5) == 5) {
                if (z) {
                    i3 = i + iO;
                } else {
                    iO = viewC.getWidth();
                    i3 = i - iO;
                }
            } else if (z) {
                iO = viewC.getWidth();
                i3 = i + iO;
            } else {
                i3 = i - iO;
            }
            m0VarZ.d(i3);
            m0VarZ.M(true);
            m0VarZ.n(i2);
        } else {
            if (this.t) {
                m0VarZ.d(this.v);
            }
            if (this.u) {
                m0VarZ.n(this.w);
            }
            m0VarZ.H(n());
        }
        this.k.add(new C0041d(m0VarZ, gVar, this.s));
        m0VarZ.g();
        ListView listViewL = m0VarZ.l();
        listViewL.setOnKeyListener(this);
        if (c0041d == null && this.y && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(a.a.g.l, (ViewGroup) listViewL, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listViewL.addHeaderView(frameLayout, null, false);
            m0VarZ.g();
        }
    }

    private m0 z() {
        m0 m0Var = new m0(this.f1184d, null, this.f1186f, this.g);
        m0Var.T(this.n);
        m0Var.L(this);
        m0Var.K(this);
        m0Var.D(this.q);
        m0Var.G(this.p);
        m0Var.J(true);
        m0Var.I(2);
        return m0Var;
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        int iA = A(gVar);
        if (iA < 0) {
            return;
        }
        int i = iA + 1;
        if (i < this.k.size()) {
            this.k.get(i).f1195b.e(false);
        }
        C0041d c0041dRemove = this.k.remove(iA);
        c0041dRemove.f1195b.O(this);
        if (this.C) {
            c0041dRemove.f1194a.S(null);
            c0041dRemove.f1194a.E(0);
        }
        c0041dRemove.f1194a.dismiss();
        int size = this.k.size();
        this.s = size > 0 ? this.k.get(size - 1).f1196c : D();
        if (size != 0) {
            if (z) {
                this.k.get(0).f1195b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.z;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.A;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.A.removeGlobalOnLayoutListener(this.l);
            }
            this.A = null;
        }
        this.r.removeOnAttachStateChangeListener(this.m);
        this.B.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.p
    public boolean b() {
        return this.k.size() > 0 && this.k.get(0).f1194a.b();
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.p
    public void dismiss() {
        int size = this.k.size();
        if (size > 0) {
            C0041d[] c0041dArr = (C0041d[]) this.k.toArray(new C0041d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0041d c0041d = c0041dArr[i];
                if (c0041d.f1194a.b()) {
                    c0041d.f1194a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void g() {
        if (b()) {
            return;
        }
        Iterator<g> it = this.j.iterator();
        while (it.hasNext()) {
            F(it.next());
        }
        this.j.clear();
        View view = this.q;
        this.r = view;
        if (view != null) {
            boolean z = this.A == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.A = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.l);
            }
            this.r.addOnAttachStateChangeListener(this.m);
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.z = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        for (C0041d c0041d : this.k) {
            if (rVar == c0041d.f1195b) {
                c0041d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        k(rVar);
        m.a aVar = this.z;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        Iterator<C0041d> it = this.k.iterator();
        while (it.hasNext()) {
            k.y(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void k(g gVar) {
        gVar.c(this, this.f1184d);
        if (b()) {
            F(gVar);
        } else {
            this.j.add(gVar);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public ListView l() {
        if (this.k.isEmpty()) {
            return null;
        }
        List<C0041d> list = this.k;
        return list.get(list.size() - 1).a();
    }

    @Override // androidx.appcompat.view.menu.k
    protected boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        C0041d c0041d;
        int size = this.k.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c0041d = null;
                break;
            }
            c0041d = this.k.get(i);
            if (!c0041d.f1194a.b()) {
                break;
            } else {
                i++;
            }
        }
        if (c0041d != null) {
            c0041d.f1195b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.k
    public void p(View view) {
        if (this.q != view) {
            this.q = view;
            this.p = a.g.l.e.b(this.o, v.C(view));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void r(boolean z) {
        this.x = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void s(int i) {
        if (this.o != i) {
            this.o = i;
            this.p = a.g.l.e.b(i, v.C(this.q));
        }
    }

    @Override // androidx.appcompat.view.menu.k
    public void t(int i) {
        this.t = true;
        this.v = i;
    }

    @Override // androidx.appcompat.view.menu.k
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.B = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.k
    public void v(boolean z) {
        this.y = z;
    }

    @Override // androidx.appcompat.view.menu.k
    public void w(int i) {
        this.u = true;
        this.w = i;
    }
}
