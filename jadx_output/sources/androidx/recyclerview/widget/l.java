package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class l {
    static int a(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.J() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1;
        }
        return Math.min(iVar.n(), iVar.d(view2) - iVar.g(view));
    }

    static int b(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z, boolean z2) {
        if (pVar.J() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z2 ? Math.max(0, (b0Var.b() - Math.max(pVar.h0(view), pVar.h0(view2))) - 1) : Math.max(0, Math.min(pVar.h0(view), pVar.h0(view2)));
        if (z) {
            return Math.round((iMax * (Math.abs(iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1))) + (iVar.m() - iVar.g(view)));
        }
        return iMax;
    }

    static int c(RecyclerView.b0 b0Var, i iVar, View view, View view2, RecyclerView.p pVar, boolean z) {
        if (pVar.J() == 0 || b0Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return b0Var.b();
        }
        return (int) (((iVar.d(view2) - iVar.g(view)) / (Math.abs(pVar.h0(view) - pVar.h0(view2)) + 1)) * b0Var.b());
    }
}
