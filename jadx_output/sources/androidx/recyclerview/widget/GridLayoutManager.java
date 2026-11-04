package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    public static class b extends RecyclerView.q {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2119f;

        public b(int i, int i2) {
            super(i, i2);
            this.f2118e = -1;
            this.f2119f = 0;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2118e = -1;
            this.f2119f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2118e = -1;
            this.f2119f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2118e = -1;
            this.f2119f = 0;
        }

        public int e() {
            return this.f2118e;
        }

        public int f() {
            return this.f2119f;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final SparseIntArray f2120a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final SparseIntArray f2121b = new SparseIntArray();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2122c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2123d = false;

        static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        int b(int i, int i2) {
            if (!this.f2123d) {
                return d(i, i2);
            }
            int i3 = this.f2121b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iD = d(i, i2);
            this.f2121b.put(i, iD);
            return iD;
        }

        int c(int i, int i2) {
            if (!this.f2122c) {
                return e(i, i2);
            }
            int i3 = this.f2120a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int iE = e(i, i2);
            this.f2120a.put(i, iE);
            return iE;
        }

        public int d(int i, int i2) {
            int i3;
            int i4;
            int iC;
            int iA;
            if (!this.f2123d || (iA = a(this.f2121b, i)) == -1) {
                i3 = 0;
                i4 = 0;
                iC = 0;
            } else {
                i3 = this.f2121b.get(iA);
                i4 = iA + 1;
                iC = c(iA, i2) + f(iA);
                if (iC == i2) {
                    i3++;
                    iC = 0;
                }
            }
            int iF = f(i);
            while (i4 < i) {
                int iF2 = f(i4);
                iC += iF2;
                if (iC == i2) {
                    i3++;
                    iC = 0;
                } else if (iC > i2) {
                    i3++;
                    iC = iF2;
                }
                i4++;
            }
            return iC + iF > i2 ? i3 + 1 : i3;
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.f2121b.clear();
        }

        public void h() {
            this.f2120a.clear();
        }
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        a3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        a3(RecyclerView.p.i0(context, attributeSet, i, i2).f2209b);
    }

    private void J2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i3 = 1;
            i5 = i;
            i2 = 0;
        } else {
            i2 = i - 1;
            i3 = -1;
        }
        while (i2 != i5) {
            View view = this.L[i2];
            b bVar = (b) view.getLayoutParams();
            int iW2 = W2(wVar, b0Var, h0(view));
            bVar.f2119f = iW2;
            bVar.f2118e = i4;
            i4 += iW2;
            i2 += i3;
        }
    }

    private void K2() {
        int iJ = J();
        for (int i = 0; i < iJ; i++) {
            b bVar = (b) I(i).getLayoutParams();
            int iA = bVar.a();
            this.M.put(iA, bVar.f());
            this.N.put(iA, bVar.e());
        }
    }

    private void L2(int i) {
        this.K = M2(this.K, this.J, i);
    }

    static int[] M2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void N2() {
        this.M.clear();
        this.N.clear();
    }

    private int O2(RecyclerView.b0 b0Var) {
        if (J() != 0 && b0Var.b() != 0) {
            T1();
            boolean zN2 = n2();
            View viewX1 = X1(!zN2, true);
            View viewW1 = W1(!zN2, true);
            if (viewX1 != null && viewW1 != null) {
                int iB = this.O.b(h0(viewX1), this.J);
                int iB2 = this.O.b(h0(viewW1), this.J);
                int iMax = this.x ? Math.max(0, ((this.O.b(b0Var.b() - 1, this.J) + 1) - Math.max(iB, iB2)) - 1) : Math.max(0, Math.min(iB, iB2));
                if (zN2) {
                    return Math.round((iMax * (Math.abs(this.u.d(viewW1) - this.u.g(viewX1)) / ((this.O.b(h0(viewW1), this.J) - this.O.b(h0(viewX1), this.J)) + 1))) + (this.u.m() - this.u.g(viewX1)));
                }
                return iMax;
            }
        }
        return 0;
    }

    private int P2(RecyclerView.b0 b0Var) {
        if (J() != 0 && b0Var.b() != 0) {
            T1();
            View viewX1 = X1(!n2(), true);
            View viewW1 = W1(!n2(), true);
            if (viewX1 != null && viewW1 != null) {
                if (!n2()) {
                    return this.O.b(b0Var.b() - 1, this.J) + 1;
                }
                return (int) (((this.u.d(viewW1) - this.u.g(viewX1)) / ((this.O.b(h0(viewW1), this.J) - this.O.b(h0(viewX1), this.J)) + 1)) * (this.O.b(b0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void Q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int iV2 = V2(wVar, b0Var, aVar.f2125b);
        if (z) {
            while (iV2 > 0) {
                int i2 = aVar.f2125b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.f2125b = i3;
                iV2 = V2(wVar, b0Var, i3);
            }
            return;
        }
        int iB = b0Var.b() - 1;
        int i4 = aVar.f2125b;
        while (i4 < iB) {
            int i5 = i4 + 1;
            int iV3 = V2(wVar, b0Var, i5);
            if (iV3 <= iV2) {
                break;
            }
            i4 = i5;
            iV2 = iV3;
        }
        aVar.f2125b = i4;
    }

    private void R2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int U2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i) {
        if (!b0Var.e()) {
            return this.O.b(i, this.J);
        }
        int iF = wVar.f(i);
        if (iF != -1) {
            return this.O.b(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private int V2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i) {
        if (!b0Var.e()) {
            return this.O.c(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = wVar.f(i);
        if (iF != -1) {
            return this.O.c(iF, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private int W2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i) {
        if (!b0Var.e()) {
            return this.O.f(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int iF = wVar.f(i);
        if (iF != -1) {
            return this.O.f(iF);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    private void X2(float f2, int i) {
        L2(Math.max(Math.round(f2 * this.J), i));
    }

    private void Y2(View view, int i, boolean z) {
        int iK;
        int iK2;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f2213b;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int iS2 = S2(bVar.f2118e, bVar.f2119f);
        if (this.s == 1) {
            iK2 = RecyclerView.p.K(iS2, i, i3, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            iK = RecyclerView.p.K(this.u.n(), X(), i2, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int iK3 = RecyclerView.p.K(iS2, i, i2, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int iK4 = RecyclerView.p.K(this.u.n(), p0(), i3, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            iK = iK3;
            iK2 = iK4;
        }
        Z2(view, iK2, iK, z);
    }

    private void Z2(View view, int i, int i2, boolean z) {
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        if (z ? H1(view, i, i2, qVar) : F1(view, i, i2, qVar)) {
            view.measure(i, i2);
        }
    }

    private void b3() {
        int iW;
        int iG0;
        if (l2() == 1) {
            iW = o0() - f0();
            iG0 = e0();
        } else {
            iW = W() - d0();
            iG0 = g0();
        }
        L2(iW - iG0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void A2(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.A2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void C1(Rect rect, int i, int i2) {
        int iN;
        int iN2;
        if (this.K == null) {
            super.C1(rect, i, i2);
        }
        int iE0 = e0() + f0();
        int iG0 = g0() + d0();
        if (this.s == 1) {
            iN2 = RecyclerView.p.n(i2, rect.height() + iG0, b0());
            int[] iArr = this.K;
            iN = RecyclerView.p.n(i, iArr[iArr.length - 1] + iE0, c0());
        } else {
            iN = RecyclerView.p.n(i, rect.width() + iE0, c0());
            int[] iArr2 = this.K;
            iN2 = RecyclerView.p.n(i2, iArr2[iArr2.length - 1] + iG0, b0());
        }
        B1(iN, iN2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:79:0x0107  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0123  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.w r26, androidx.recyclerview.widget.RecyclerView.b0 r27) {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$w, androidx.recyclerview.widget.RecyclerView$b0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int N(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return U2(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void N1(RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, RecyclerView.p.c cVar2) {
        int iF = this.J;
        for (int i = 0; i < this.J && cVar.c(b0Var) && iF > 0; i++) {
            int i2 = cVar.f2136d;
            cVar2.a(i2, Math.max(0, cVar.g));
            iF -= this.O.f(i2);
            cVar.f2136d += cVar.f2137e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void P0(RecyclerView.w wVar, RecyclerView.b0 b0Var, View view, a.g.l.e0.c cVar) {
        int iF;
        int iE;
        int iF2;
        boolean z;
        boolean z2;
        int iE2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int iU2 = U2(wVar, b0Var, bVar.a());
        if (this.s == 0) {
            iE2 = bVar.e();
            iF = bVar.f();
            iF2 = 1;
            z = false;
            z2 = false;
            iE = iU2;
        } else {
            iF = 1;
            iE = bVar.e();
            iF2 = bVar.f();
            z = false;
            z2 = false;
            iE2 = iU2;
        }
        cVar.Z(a.g.l.e0.c.C0020c.a(iE2, iF, iE, iF2, z, z2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void R0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    int S2(int i, int i2) {
        if (this.s != 1 || !m2()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void T0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    public int T2() {
        return this.J;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void U0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void W0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.e()) {
            K2();
        }
        super.X0(wVar, b0Var);
        N2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.b0 b0Var) {
        super.Y0(b0Var);
        this.I = false;
    }

    public void a3(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.h();
            t1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View f2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z, boolean z2) {
        int iJ;
        int iJ2 = J();
        int i = -1;
        int i2 = 1;
        if (z2) {
            iJ = J() - 1;
            i2 = -1;
        } else {
            i = iJ2;
            iJ = 0;
        }
        int iB = b0Var.b();
        T1();
        int iM = this.u.m();
        int i3 = this.u.i();
        View view = null;
        View view2 = null;
        while (iJ != i) {
            View viewI = I(iJ);
            int iH0 = h0(viewI);
            if (iH0 >= 0 && iH0 < iB && V2(wVar, b0Var, iH0) == 0) {
                if (((RecyclerView.q) viewI.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = viewI;
                    }
                } else {
                    if (this.u.g(viewI) < i3 && this.u.d(viewI) >= iM) {
                        return viewI;
                    }
                    if (view == null) {
                        view = viewI;
                    }
                }
            }
            iJ += i2;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int k0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (b0Var.b() < 1) {
            return 0;
        }
        return U2(wVar, b0Var, b0Var.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean m(RecyclerView.q qVar) {
        return qVar instanceof b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void o2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.c cVar, LinearLayoutManager.b bVar) {
        int i;
        int i2;
        int iF;
        int i3;
        int i4;
        int iF2;
        int iF3;
        int iK;
        int iK2;
        View viewD;
        int iL = this.u.l();
        ?? r5 = 0;
        boolean z = iL != 1073741824;
        int i5 = J() > 0 ? this.K[this.J] : 0;
        if (z) {
            b3();
        }
        boolean z2 = cVar.f2137e == 1;
        int iV2 = this.J;
        if (!z2) {
            iV2 = V2(wVar, b0Var, cVar.f2136d) + W2(wVar, b0Var, cVar.f2136d);
        }
        int i6 = 0;
        while (i6 < this.J && cVar.c(b0Var) && iV2 > 0) {
            int i7 = cVar.f2136d;
            int iW2 = W2(wVar, b0Var, i7);
            if (iW2 > this.J) {
                throw new IllegalArgumentException("Item at position " + i7 + " requires " + iW2 + " spans but GridLayoutManager has only " + this.J + " spans.");
            }
            iV2 -= iW2;
            if (iV2 < 0 || (viewD = cVar.d(wVar)) == null) {
                break;
            }
            this.L[i6] = viewD;
            i6++;
        }
        if (i6 == 0) {
            bVar.f2130b = true;
            return;
        }
        float f2 = 0.0f;
        J2(wVar, b0Var, i6, z2);
        int i8 = 0;
        int i9 = 0;
        while (i8 < i6) {
            View view = this.L[i8];
            if (cVar.l == null) {
                if (z2) {
                    d(view);
                } else {
                    e(view, r5);
                }
            } else if (z2) {
                b(view);
            } else {
                c(view, r5);
            }
            j(view, this.P);
            Y2(view, iL, r5);
            int iE = this.u.e(view);
            if (iE > i9) {
                i9 = iE;
            }
            float f3 = (this.u.f(view) * 1.0f) / ((b) view.getLayoutParams()).f2119f;
            if (f3 > f2) {
                f2 = f3;
            }
            i8++;
            r5 = 0;
        }
        if (z) {
            X2(f2, i5);
            i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                View view2 = this.L[i10];
                Y2(view2, 1073741824, true);
                int iE2 = this.u.e(view2);
                if (iE2 > i9) {
                    i9 = iE2;
                }
            }
        }
        for (int i11 = 0; i11 < i6; i11++) {
            View view3 = this.L[i11];
            if (this.u.e(view3) != i9) {
                b bVar2 = (b) view3.getLayoutParams();
                Rect rect = bVar2.f2213b;
                int i12 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar2).topMargin + ((ViewGroup.MarginLayoutParams) bVar2).bottomMargin;
                int i13 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar2).leftMargin + ((ViewGroup.MarginLayoutParams) bVar2).rightMargin;
                int iS2 = S2(bVar2.f2118e, bVar2.f2119f);
                if (this.s == 1) {
                    iK2 = RecyclerView.p.K(iS2, 1073741824, i13, ((ViewGroup.MarginLayoutParams) bVar2).width, false);
                    iK = View.MeasureSpec.makeMeasureSpec(i9 - i12, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - i13, 1073741824);
                    iK = RecyclerView.p.K(iS2, 1073741824, i12, ((ViewGroup.MarginLayoutParams) bVar2).height, false);
                    iK2 = iMakeMeasureSpec;
                }
                Z2(view3, iK2, iK, true);
            }
        }
        int i14 = 0;
        bVar.f2129a = i9;
        if (this.s == 1) {
            if (cVar.f2138f == -1) {
                iF = cVar.f2134b;
                i3 = iF - i9;
            } else {
                int i15 = cVar.f2134b;
                i3 = i15;
                iF = i9 + i15;
            }
            i = 0;
            i2 = 0;
        } else if (cVar.f2138f == -1) {
            int i16 = cVar.f2134b;
            i2 = i16 - i9;
            i3 = 0;
            i = i16;
            iF = 0;
        } else {
            int i17 = cVar.f2134b;
            i = i9 + i17;
            i2 = i17;
            iF = 0;
            i3 = 0;
        }
        while (i14 < i6) {
            View view4 = this.L[i14];
            b bVar3 = (b) view4.getLayoutParams();
            if (this.s == 1) {
                if (m2()) {
                    int iE0 = e0() + this.K[this.J - bVar3.f2118e];
                    iF2 = iE0;
                    iF3 = iE0 - this.u.f(view4);
                } else {
                    int iE1 = e0() + this.K[bVar3.f2118e];
                    iF3 = iE1;
                    iF2 = this.u.f(view4) + iE1;
                }
                i4 = i3;
            } else {
                int iG0 = g0() + this.K[bVar3.f2118e];
                i4 = iG0;
                iF2 = i;
                iF3 = i2;
                iF = this.u.f(view4) + iG0;
            }
            z0(view4, iF3, i4, iF2, iF);
            if (bVar3.c() || bVar3.b()) {
                bVar.f2131c = true;
            }
            bVar.f2132d |= view4.hasFocusable();
            i14++;
            iF = iF;
            i = iF2;
            i2 = iF3;
            i3 = i4;
        }
        Arrays.fill(this.L, (Object) null);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, LinearLayoutManager.a aVar, int i) {
        super.q2(wVar, b0Var, aVar, i);
        b3();
        if (b0Var.b() > 0 && !b0Var.e()) {
            Q2(wVar, b0Var, aVar, i);
        }
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.b0 b0Var) {
        return this.Q ? O2(b0Var) : super.r(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return this.Q ? P2(b0Var) : super.s(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.b0 b0Var) {
        return this.Q ? O2(b0Var) : super.u(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return this.Q ? P2(b0Var) : super.v(b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        b3();
        R2();
        return super.w1(i, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        b3();
        R2();
        return super.y1(i, wVar, b0Var);
    }
}
