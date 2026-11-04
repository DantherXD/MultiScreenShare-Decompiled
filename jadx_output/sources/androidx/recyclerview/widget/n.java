package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends RecyclerView.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    RecyclerView f2351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Scroller f2352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView.u f2353c = new a();

    class a extends RecyclerView.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f2354a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i) {
            super.a(recyclerView, i);
            if (i == 0 && this.f2354a) {
                this.f2354a = false;
                n.this.j();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i, int i2) {
            if (i == 0 && i2 == 0) {
                return;
            }
            this.f2354a = true;
        }
    }

    private void e() {
        this.f2351a.Y0(this.f2353c);
        this.f2351a.setOnFlingListener(null);
    }

    private void h() {
        if (this.f2351a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f2351a.k(this.f2353c);
        this.f2351a.setOnFlingListener(this);
    }

    private boolean i(RecyclerView.p pVar, int i, int i2) {
        RecyclerView.a0 a0VarD;
        int iG;
        if (!(pVar instanceof RecyclerView.a0.b) || (a0VarD = d(pVar)) == null || (iG = g(pVar, i, i2)) == -1) {
            return false;
        }
        a0VarD.p(iG);
        pVar.J1(a0VarD);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public boolean a(int i, int i2) {
        RecyclerView.p layoutManager = this.f2351a.getLayoutManager();
        if (layoutManager == null || this.f2351a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f2351a.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && i(layoutManager, i, i2);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2351a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            e();
        }
        this.f2351a = recyclerView;
        if (recyclerView != null) {
            h();
            this.f2352b = new Scroller(this.f2351a.getContext(), new DecelerateInterpolator());
            j();
        }
    }

    public abstract int[] c(RecyclerView.p pVar, View view);

    protected abstract RecyclerView.a0 d(RecyclerView.p pVar);

    public abstract View f(RecyclerView.p pVar);

    public abstract int g(RecyclerView.p pVar, int i, int i2);

    void j() {
        RecyclerView.p layoutManager;
        View viewF;
        RecyclerView recyclerView = this.f2351a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewF = f(layoutManager)) == null) {
            return;
        }
        int[] iArrC = c(layoutManager, viewF);
        if (iArrC[0] == 0 && iArrC[1] == 0) {
            return;
        }
        this.f2351a.l1(iArrC[0], iArrC[1]);
    }
}
