package com.google.android.material.datepicker;

import a.g.l.v;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class h<S> extends p<S> {
    static final Object d0 = "MONTHS_VIEW_GROUP_TAG";
    static final Object e0 = "NAVIGATION_PREV_TAG";
    static final Object f0 = "NAVIGATION_NEXT_TAG";
    static final Object g0 = "SELECTOR_TOGGLE_TAG";
    private int h0;
    private com.google.android.material.datepicker.d<S> i0;
    private com.google.android.material.datepicker.a j0;
    private com.google.android.material.datepicker.l k0;
    private k l0;
    private com.google.android.material.datepicker.c m0;
    private RecyclerView n0;
    private RecyclerView o0;
    private View p0;
    private View q0;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4011b;

        a(int i) {
            this.f4011b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            h.this.o0.p1(this.f4011b);
        }
    }

    class b extends a.g.l.a {
        b() {
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            cVar.Y(null);
        }
    }

    class c extends q {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.I = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.b0 b0Var, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = h.this.o0.getWidth();
                iArr[1] = h.this.o0.getWidth();
            } else {
                iArr[0] = h.this.o0.getHeight();
                iArr[1] = h.this.o0.getHeight();
            }
        }
    }

    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.h.l
        public void a(long j) {
            if (h.this.j0.o().e(j)) {
                h.this.i0.g(j);
                Iterator<o<S>> it = h.this.c0.iterator();
                while (it.hasNext()) {
                    it.next().a(h.this.i0.a());
                }
                h.this.o0.getAdapter().i();
                if (h.this.n0 != null) {
                    h.this.n0.getAdapter().i();
                }
            }
        }
    }

    class e extends RecyclerView.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Calendar f4015a = s.k();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Calendar f4016b = s.k();

        e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.o
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            if ((recyclerView.getAdapter() instanceof t) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                t tVar = (t) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (a.g.k.d<Long, Long> dVar : h.this.i0.d()) {
                    Long l = dVar.f600a;
                    if (l != null && dVar.f601b != null) {
                        this.f4015a.setTimeInMillis(l.longValue());
                        this.f4016b.setTimeInMillis(dVar.f601b.longValue());
                        int iY = tVar.y(this.f4015a.get(1));
                        int iY2 = tVar.y(this.f4016b.get(1));
                        View viewC = gridLayoutManager.C(iY);
                        View viewC2 = gridLayoutManager.C(iY2);
                        int iT2 = iY / gridLayoutManager.T2();
                        int iT3 = iY2 / gridLayoutManager.T2();
                        int i = iT2;
                        while (i <= iT3) {
                            View viewC3 = gridLayoutManager.C(gridLayoutManager.T2() * i);
                            if (viewC3 != null) {
                                canvas.drawRect(i == iT2 ? viewC.getLeft() + (viewC.getWidth() / 2) : 0, viewC3.getTop() + h.this.m0.f4003d.c(), i == iT3 ? viewC2.getLeft() + (viewC2.getWidth() / 2) : recyclerView.getWidth(), viewC3.getBottom() - h.this.m0.f4003d.b(), h.this.m0.h);
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    class f extends a.g.l.a {
        f() {
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            cVar.g0(h.this.Q(h.this.q0.getVisibility() == 0 ? c.b.a.b.i.o : c.b.a.b.i.m));
        }
    }

    class g extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f4019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f4020b;

        g(n nVar, MaterialButton materialButton) {
            this.f4019a = nVar;
            this.f4020b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i) {
            if (i == 0) {
                CharSequence text = this.f4020b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(2048);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            LinearLayoutManager linearLayoutManagerS1 = h.this.S1();
            int iY1 = i < 0 ? linearLayoutManagerS1.Y1() : linearLayoutManagerS1.a2();
            h.this.k0 = this.f4019a.x(iY1);
            this.f4020b.setText(this.f4019a.y(iY1));
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.datepicker.h$h, reason: collision with other inner class name */
    class ViewOnClickListenerC0098h implements View.OnClickListener {
        ViewOnClickListenerC0098h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            h.this.X1();
        }
    }

    class i implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f4023b;

        i(n nVar) {
            this.f4023b = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iY1 = h.this.S1().Y1() + 1;
            if (iY1 < h.this.o0.getAdapter().d()) {
                h.this.V1(this.f4023b.x(iY1));
            }
        }
    }

    class j implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f4025b;

        j(n nVar) {
            this.f4025b = nVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int iA2 = h.this.S1().a2() - 1;
            if (iA2 >= 0) {
                h.this.V1(this.f4025b.x(iA2));
            }
        }
    }

    enum k {
        DAY,
        YEAR
    }

    interface l {
        void a(long j);
    }

    private void L1(View view, n nVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(c.b.a.b.f.p);
        materialButton.setTag(g0);
        v.o0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(c.b.a.b.f.r);
        materialButton2.setTag(e0);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(c.b.a.b.f.q);
        materialButton3.setTag(f0);
        this.p0 = view.findViewById(c.b.a.b.f.y);
        this.q0 = view.findViewById(c.b.a.b.f.t);
        W1(k.DAY);
        materialButton.setText(this.k0.q(view.getContext()));
        this.o0.k(new g(nVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0098h());
        materialButton3.setOnClickListener(new i(nVar));
        materialButton2.setOnClickListener(new j(nVar));
    }

    private RecyclerView.o M1() {
        return new e();
    }

    static int R1(Context context) {
        return context.getResources().getDimensionPixelSize(c.b.a.b.d.B);
    }

    public static <T> h<T> T1(com.google.android.material.datepicker.d<T> dVar, int i2, com.google.android.material.datepicker.a aVar) {
        h<T> hVar = new h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i2);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.r());
        hVar.t1(bundle);
        return hVar;
    }

    private void U1(int i2) {
        this.o0.post(new a(i2));
    }

    @Override // com.google.android.material.datepicker.p
    public boolean C1(o<S> oVar) {
        return super.C1(oVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void H0(Bundle bundle) {
        super.H0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.h0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.i0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.j0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.k0);
    }

    com.google.android.material.datepicker.a N1() {
        return this.j0;
    }

    com.google.android.material.datepicker.c O1() {
        return this.m0;
    }

    com.google.android.material.datepicker.l P1() {
        return this.k0;
    }

    public com.google.android.material.datepicker.d<S> Q1() {
        return this.i0;
    }

    LinearLayoutManager S1() {
        return (LinearLayoutManager) this.o0.getLayoutManager();
    }

    void V1(com.google.android.material.datepicker.l lVar) {
        RecyclerView recyclerView;
        int i2;
        n nVar = (n) this.o0.getAdapter();
        int iZ = nVar.z(lVar);
        int iZ2 = iZ - nVar.z(this.k0);
        boolean z = Math.abs(iZ2) > 3;
        boolean z2 = iZ2 > 0;
        this.k0 = lVar;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.o0;
                i2 = iZ + 3;
            }
            U1(iZ);
        }
        recyclerView = this.o0;
        i2 = iZ - 3;
        recyclerView.h1(i2);
        U1(iZ);
    }

    void W1(k kVar) {
        this.l0 = kVar;
        if (kVar == k.YEAR) {
            this.n0.getLayoutManager().x1(((t) this.n0.getAdapter()).y(this.k0.f4037d));
            this.p0.setVisibility(0);
            this.q0.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.p0.setVisibility(8);
            this.q0.setVisibility(0);
            V1(this.k0);
        }
    }

    void X1() {
        k kVar = this.l0;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            W1(k.DAY);
        } else if (kVar == k.DAY) {
            W1(kVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        super.l0(bundle);
        if (bundle == null) {
            bundle = o();
        }
        this.h0 = bundle.getInt("THEME_RES_ID_KEY");
        this.i0 = (com.google.android.material.datepicker.d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.j0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.k0 = (com.google.android.material.datepicker.l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View p0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(q(), this.h0);
        this.m0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.l lVarS = this.j0.s();
        if (com.google.android.material.datepicker.i.e2(contextThemeWrapper)) {
            i2 = c.b.a.b.h.n;
            i3 = 1;
        } else {
            i2 = c.b.a.b.h.l;
            i3 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) viewInflate.findViewById(c.b.a.b.f.u);
        v.o0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.g());
        gridView.setNumColumns(lVarS.f4038e);
        gridView.setEnabled(false);
        this.o0 = (RecyclerView) viewInflate.findViewById(c.b.a.b.f.x);
        this.o0.setLayoutManager(new c(q(), i3, false, i3));
        this.o0.setTag(d0);
        n nVar = new n(contextThemeWrapper, this.i0, this.j0, new d());
        this.o0.setAdapter(nVar);
        int integer = contextThemeWrapper.getResources().getInteger(c.b.a.b.g.f2730b);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(c.b.a.b.f.y);
        this.n0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.n0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.n0.setAdapter(new t(this));
            this.n0.h(M1());
        }
        if (viewInflate.findViewById(c.b.a.b.f.p) != null) {
            L1(viewInflate, nVar);
        }
        if (!com.google.android.material.datepicker.i.e2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.o0);
        }
        this.o0.h1(nVar.z(this.k0));
        return viewInflate;
    }
}
