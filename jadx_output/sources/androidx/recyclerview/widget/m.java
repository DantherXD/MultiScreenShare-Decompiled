package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class m extends RecyclerView.m {
    boolean g = true;

    public final void A(RecyclerView.e0 e0Var) {
        I(e0Var);
        h(e0Var);
    }

    public final void B(RecyclerView.e0 e0Var) {
        J(e0Var);
    }

    public final void C(RecyclerView.e0 e0Var, boolean z) {
        K(e0Var, z);
        h(e0Var);
    }

    public final void D(RecyclerView.e0 e0Var, boolean z) {
        L(e0Var, z);
    }

    public final void E(RecyclerView.e0 e0Var) {
        M(e0Var);
        h(e0Var);
    }

    public final void F(RecyclerView.e0 e0Var) {
        N(e0Var);
    }

    public final void G(RecyclerView.e0 e0Var) {
        O(e0Var);
        h(e0Var);
    }

    public final void H(RecyclerView.e0 e0Var) {
        P(e0Var);
    }

    public void I(RecyclerView.e0 e0Var) {
    }

    public void J(RecyclerView.e0 e0Var) {
    }

    public void K(RecyclerView.e0 e0Var, boolean z) {
    }

    public void L(RecyclerView.e0 e0Var, boolean z) {
    }

    public void M(RecyclerView.e0 e0Var) {
    }

    public void N(RecyclerView.e0 e0Var) {
    }

    public void O(RecyclerView.e0 e0Var) {
    }

    public void P(RecyclerView.e0 e0Var) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        return (cVar == null || ((i = cVar.f2195a) == (i2 = cVar2.f2195a) && cVar.f2196b == cVar2.f2196b)) ? w(e0Var) : y(e0Var, i, cVar.f2196b, i2, cVar2.f2196b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean b(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f2195a;
        int i4 = cVar.f2196b;
        if (e0Var2.J()) {
            int i5 = cVar.f2195a;
            i2 = cVar.f2196b;
            i = i5;
        } else {
            i = cVar2.f2195a;
            i2 = cVar2.f2196b;
        }
        return x(e0Var, e0Var2, i3, i4, i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.f2195a;
        int i2 = cVar.f2196b;
        View view = e0Var.f2175b;
        int left = cVar2 == null ? view.getLeft() : cVar2.f2195a;
        int top = cVar2 == null ? view.getTop() : cVar2.f2196b;
        if (e0Var.v() || (i == left && i2 == top)) {
            return z(e0Var);
        }
        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
        return y(e0Var, i, i2, left, top);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2) {
        int i = cVar.f2195a;
        int i2 = cVar2.f2195a;
        if (i != i2 || cVar.f2196b != cVar2.f2196b) {
            return y(e0Var, i, cVar.f2196b, i2, cVar2.f2196b);
        }
        E(e0Var);
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean f(RecyclerView.e0 e0Var) {
        return !this.g || e0Var.t();
    }

    public abstract boolean w(RecyclerView.e0 e0Var);

    public abstract boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4);

    public abstract boolean y(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4);

    public abstract boolean z(RecyclerView.e0 e0Var);
}
