package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class j extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f2345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f2346e;

    class a extends g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.a0
        protected void o(View view, RecyclerView.b0 b0Var, RecyclerView.a0.a aVar) {
            j jVar = j.this;
            int[] iArrC = jVar.c(jVar.f2351a.getLayoutManager(), view);
            int i = iArrC[0];
            int i2 = iArrC[1];
            int iW = w(Math.max(Math.abs(i), Math.abs(i2)));
            if (iW > 0) {
                aVar.d(i, i2, iW, this.j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        protected int x(int i) {
            return Math.min(100, super.x(i));
        }
    }

    private int k(View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    private View l(RecyclerView.p pVar, i iVar) {
        int iJ = pVar.J();
        View view = null;
        if (iJ == 0) {
            return null;
        }
        int iM = iVar.m() + (iVar.n() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < iJ; i2++) {
            View viewI = pVar.I(i2);
            int iAbs = Math.abs((iVar.g(viewI) + (iVar.e(viewI) / 2)) - iM);
            if (iAbs < i) {
                view = viewI;
                i = iAbs;
            }
        }
        return view;
    }

    private i m(RecyclerView.p pVar) {
        i iVar = this.f2346e;
        if (iVar == null || iVar.f2342a != pVar) {
            this.f2346e = i.a(pVar);
        }
        return this.f2346e;
    }

    private i n(RecyclerView.p pVar) {
        if (pVar.l()) {
            return o(pVar);
        }
        if (pVar.k()) {
            return m(pVar);
        }
        return null;
    }

    private i o(RecyclerView.p pVar) {
        i iVar = this.f2345d;
        if (iVar == null || iVar.f2342a != pVar) {
            this.f2345d = i.c(pVar);
        }
        return this.f2345d;
    }

    private boolean p(RecyclerView.p pVar, int i, int i2) {
        if (pVar.k()) {
            return i > 0;
        }
        return i2 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean q(RecyclerView.p pVar) {
        PointF pointFA;
        int iY = pVar.Y();
        if (!(pVar instanceof RecyclerView.a0.b) || (pointFA = ((RecyclerView.a0.b) pVar).a(iY - 1)) == null) {
            return false;
        }
        return pointFA.x < 0.0f || pointFA.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.p pVar, View view) {
        int[] iArr = new int[2];
        if (pVar.k()) {
            iArr[0] = k(view, m(pVar));
        } else {
            iArr[0] = 0;
        }
        if (pVar.l()) {
            iArr[1] = k(view, o(pVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    protected RecyclerView.a0 d(RecyclerView.p pVar) {
        if (pVar instanceof RecyclerView.a0.b) {
            return new a(this.f2351a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View f(RecyclerView.p pVar) {
        i iVarM;
        if (pVar.l()) {
            iVarM = o(pVar);
        } else {
            if (!pVar.k()) {
                return null;
            }
            iVarM = m(pVar);
        }
        return l(pVar, iVarM);
    }

    @Override // androidx.recyclerview.widget.n
    public int g(RecyclerView.p pVar, int i, int i2) {
        i iVarN;
        int iY = pVar.Y();
        if (iY == 0 || (iVarN = n(pVar)) == null) {
            return -1;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int iJ = pVar.J();
        View view = null;
        View view2 = null;
        for (int i5 = 0; i5 < iJ; i5++) {
            View viewI = pVar.I(i5);
            if (viewI != null) {
                int iK = k(viewI, iVarN);
                if (iK <= 0 && iK > i3) {
                    view2 = viewI;
                    i3 = iK;
                }
                if (iK >= 0 && iK < i4) {
                    view = viewI;
                    i4 = iK;
                }
            }
        }
        boolean zP = p(pVar, i, i2);
        if (zP && view != null) {
            return pVar.h0(view);
        }
        if (!zP && view2 != null) {
            return pVar.h0(view2);
        }
        if (zP) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int iH0 = pVar.h0(view) + (q(pVar) == zP ? -1 : 1);
        if (iH0 < 0 || iH0 >= iY) {
            return -1;
        }
        return iH0;
    }
}
