package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.p implements RecyclerView.a0.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    i u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f2124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2127d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f2128e;

        a() {
            e();
        }

        void a() {
            this.f2126c = this.f2127d ? this.f2124a.i() : this.f2124a.m();
        }

        public void b(View view, int i) {
            this.f2126c = this.f2127d ? this.f2124a.d(view) + this.f2124a.o() : this.f2124a.g(view);
            this.f2125b = i;
        }

        public void c(View view, int i) {
            int iO = this.f2124a.o();
            if (iO >= 0) {
                b(view, i);
                return;
            }
            this.f2125b = i;
            if (this.f2127d) {
                int i2 = (this.f2124a.i() - iO) - this.f2124a.d(view);
                this.f2126c = this.f2124a.i() - i2;
                if (i2 > 0) {
                    int iE = this.f2126c - this.f2124a.e(view);
                    int iM = this.f2124a.m();
                    int iMin = iE - (iM + Math.min(this.f2124a.g(view) - iM, 0));
                    if (iMin < 0) {
                        this.f2126c += Math.min(i2, -iMin);
                        return;
                    }
                    return;
                }
                return;
            }
            int iG = this.f2124a.g(view);
            int iM2 = iG - this.f2124a.m();
            this.f2126c = iG;
            if (iM2 > 0) {
                int i3 = (this.f2124a.i() - Math.min(0, (this.f2124a.i() - iO) - this.f2124a.d(view))) - (iG + this.f2124a.e(view));
                if (i3 < 0) {
                    this.f2126c -= Math.min(iM2, -i3);
                }
            }
        }

        boolean d(View view, RecyclerView.b0 b0Var) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return !qVar.c() && qVar.a() >= 0 && qVar.a() < b0Var.b();
        }

        void e() {
            this.f2125b = -1;
            this.f2126c = Integer.MIN_VALUE;
            this.f2127d = false;
            this.f2128e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f2125b + ", mCoordinate=" + this.f2126c + ", mLayoutFromEnd=" + this.f2127d + ", mValid=" + this.f2128e + '}';
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f2129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f2131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2132d;

        protected b() {
        }

        void a() {
            this.f2129a = 0;
            this.f2130b = false;
            this.f2131c = false;
            this.f2132d = false;
        }
    }

    static class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2134b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2135c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2136d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2137e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2138f;
        int g;
        int k;
        boolean m;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f2133a = true;
        int h = 0;
        int i = 0;
        boolean j = false;
        List<RecyclerView.e0> l = null;

        c() {
        }

        private View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).f2175b;
                RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
                if (!qVar.c() && this.f2136d == qVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View viewF = f(view);
            this.f2136d = viewF == null ? -1 : ((RecyclerView.q) viewF.getLayoutParams()).a();
        }

        boolean c(RecyclerView.b0 b0Var) {
            int i = this.f2136d;
            return i >= 0 && i < b0Var.b();
        }

        View d(RecyclerView.w wVar) {
            if (this.l != null) {
                return e();
            }
            View viewO = wVar.o(this.f2136d);
            this.f2136d += this.f2137e;
            return viewO;
        }

        public View f(View view) {
            int iA;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).f2175b;
                RecyclerView.q qVar = (RecyclerView.q) view3.getLayoutParams();
                if (view3 != view && !qVar.c() && (iA = (qVar.a() - this.f2136d) * this.f2137e) >= 0 && iA < i) {
                    view2 = view3;
                    if (iA == 0) {
                        break;
                    }
                    i = iA;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2139b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2140c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f2141d;

        class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f2139b = parcel.readInt();
            this.f2140c = parcel.readInt();
            this.f2141d = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f2139b = dVar.f2139b;
            this.f2140c = dVar.f2140c;
            this.f2141d = dVar.f2141d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        boolean j() {
            return this.f2139b >= 0;
        }

        void k() {
            this.f2139b = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2139b);
            parcel.writeInt(this.f2140c);
            parcel.writeInt(this.f2141d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        y2(i);
        z2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.p.d dVarI0 = RecyclerView.p.i0(context, attributeSet, i, i2);
        y2(dVarI0.f2208a);
        z2(dVarI0.f2210c);
        A2(dVarI0.f2211d);
    }

    private boolean B2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        View viewF2;
        boolean z = false;
        if (J() == 0) {
            return false;
        }
        View viewV = V();
        if (viewV != null && aVar.d(viewV, b0Var)) {
            aVar.c(viewV, h0(viewV));
            return true;
        }
        boolean z2 = this.v;
        boolean z3 = this.y;
        if (z2 != z3 || (viewF2 = f2(wVar, b0Var, aVar.f2127d, z3)) == null) {
            return false;
        }
        aVar.b(viewF2, h0(viewF2));
        if (!b0Var.e() && L1()) {
            int iG = this.u.g(viewF2);
            int iD = this.u.d(viewF2);
            int iM = this.u.m();
            int i = this.u.i();
            boolean z4 = iD <= iM && iG < iM;
            if (iG >= i && iD > i) {
                z = true;
            }
            if (z4 || z) {
                if (aVar.f2127d) {
                    iM = i;
                }
                aVar.f2126c = iM;
            }
        }
        return true;
    }

    private boolean C2(RecyclerView.b0 b0Var, a aVar) {
        int i;
        if (!b0Var.e() && (i = this.A) != -1) {
            if (i >= 0 && i < b0Var.b()) {
                aVar.f2125b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.j()) {
                    boolean z = this.D.f2141d;
                    aVar.f2127d = z;
                    aVar.f2126c = z ? this.u.i() - this.D.f2140c : this.u.m() + this.D.f2140c;
                    return true;
                }
                if (this.B != Integer.MIN_VALUE) {
                    boolean z2 = this.x;
                    aVar.f2127d = z2;
                    aVar.f2126c = z2 ? this.u.i() - this.B : this.u.m() + this.B;
                    return true;
                }
                View viewC = C(this.A);
                if (viewC == null) {
                    if (J() > 0) {
                        aVar.f2127d = (this.A < h0(I(0))) == this.x;
                    }
                    aVar.a();
                } else {
                    if (this.u.e(viewC) > this.u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.u.g(viewC) - this.u.m() < 0) {
                        aVar.f2126c = this.u.m();
                        aVar.f2127d = false;
                        return true;
                    }
                    if (this.u.i() - this.u.d(viewC) < 0) {
                        aVar.f2126c = this.u.i();
                        aVar.f2127d = true;
                        return true;
                    }
                    aVar.f2126c = aVar.f2127d ? this.u.d(viewC) + this.u.o() : this.u.g(viewC);
                }
                return true;
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void D2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar) {
        if (C2(b0Var, aVar) || B2(wVar, b0Var, aVar)) {
            return;
        }
        aVar.a();
        aVar.f2125b = this.y ? b0Var.b() - 1 : 0;
    }

    private void E2(int i, int i2, boolean z, RecyclerView.b0 b0Var) {
        int iM;
        this.t.m = v2();
        this.t.f2138f = i;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]);
        int iMax2 = Math.max(0, this.H[1]);
        boolean z2 = i == 1;
        c cVar = this.t;
        int i3 = z2 ? iMax2 : iMax;
        cVar.h = i3;
        if (!z2) {
            iMax = iMax2;
        }
        cVar.i = iMax;
        if (z2) {
            cVar.h = i3 + this.u.j();
            View viewI2 = i2();
            c cVar2 = this.t;
            cVar2.f2137e = this.x ? -1 : 1;
            int iH0 = h0(viewI2);
            c cVar3 = this.t;
            cVar2.f2136d = iH0 + cVar3.f2137e;
            cVar3.f2134b = this.u.d(viewI2);
            iM = this.u.d(viewI2) - this.u.i();
        } else {
            View viewJ2 = j2();
            this.t.h += this.u.m();
            c cVar4 = this.t;
            cVar4.f2137e = this.x ? 1 : -1;
            int iH1 = h0(viewJ2);
            c cVar5 = this.t;
            cVar4.f2136d = iH1 + cVar5.f2137e;
            cVar5.f2134b = this.u.g(viewJ2);
            iM = (-this.u.g(viewJ2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.f2135c = i2;
        if (z) {
            cVar6.f2135c = i2 - iM;
        }
        cVar6.g = iM;
    }

    private void F2(int i, int i2) {
        this.t.f2135c = this.u.i() - i2;
        c cVar = this.t;
        cVar.f2137e = this.x ? -1 : 1;
        cVar.f2136d = i;
        cVar.f2138f = 1;
        cVar.f2134b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void G2(a aVar) {
        F2(aVar.f2125b, aVar.f2126c);
    }

    private void H2(int i, int i2) {
        this.t.f2135c = i2 - this.u.m();
        c cVar = this.t;
        cVar.f2136d = i;
        cVar.f2137e = this.x ? 1 : -1;
        cVar.f2138f = -1;
        cVar.f2134b = i2;
        cVar.g = Integer.MIN_VALUE;
    }

    private void I2(a aVar) {
        H2(aVar.f2125b, aVar.f2126c);
    }

    private int O1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.a(b0Var, this.u, X1(!this.z, true), W1(!this.z, true), this, this.z);
    }

    private int P1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.b(b0Var, this.u, X1(!this.z, true), W1(!this.z, true), this, this.z, this.x);
    }

    private int Q1(RecyclerView.b0 b0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.c(b0Var, this.u, X1(!this.z, true), W1(!this.z, true), this, this.z);
    }

    private View V1() {
        return b2(0, J());
    }

    private View Z1() {
        return b2(J() - 1, -1);
    }

    private View d2() {
        return this.x ? V1() : Z1();
    }

    private View e2() {
        return this.x ? Z1() : V1();
    }

    private int g2(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 <= 0) {
            return 0;
        }
        int i4 = -x2(-i3, wVar, b0Var);
        int i5 = i + i4;
        if (!z || (i2 = this.u.i() - i5) <= 0) {
            return i4;
        }
        this.u.r(i2);
        return i2 + i4;
    }

    private int h2(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z) {
        int iM;
        int iM2 = i - this.u.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i2 = -x2(iM2, wVar, b0Var);
        int i3 = i + i2;
        if (!z || (iM = i3 - this.u.m()) <= 0) {
            return i2;
        }
        this.u.r(-iM);
        return i2 - iM;
    }

    private View i2() {
        return I(this.x ? 0 : J() - 1);
    }

    private View j2() {
        return I(this.x ? J() - 1 : 0);
    }

    private void p2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i, int i2) {
        if (!b0Var.g() || J() == 0 || b0Var.e() || !L1()) {
            return;
        }
        List<RecyclerView.e0> listK = wVar.k();
        int size = listK.size();
        int iH0 = h0(I(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.e0 e0Var = listK.get(i5);
            if (!e0Var.v()) {
                byte b2 = (e0Var.m() < iH0) != this.x ? (byte) -1 : (byte) 1;
                int iE = this.u.e(e0Var.f2175b);
                if (b2 == -1) {
                    i3 += iE;
                } else {
                    i4 += iE;
                }
            }
        }
        this.t.l = listK;
        if (i3 > 0) {
            H2(h0(j2()), i);
            c cVar = this.t;
            cVar.h = i3;
            cVar.f2135c = 0;
            cVar.a();
            U1(wVar, this.t, b0Var, false);
        }
        if (i4 > 0) {
            F2(h0(i2()), i2);
            c cVar2 = this.t;
            cVar2.h = i4;
            cVar2.f2135c = 0;
            cVar2.a();
            U1(wVar, this.t, b0Var, false);
        }
        this.t.l = null;
    }

    private void r2(RecyclerView.w wVar, c cVar) {
        if (!cVar.f2133a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f2138f == -1) {
            t2(wVar, i, i2);
        } else {
            u2(wVar, i, i2);
        }
    }

    private void s2(RecyclerView.w wVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                n1(i, wVar);
                i--;
            }
        } else {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                n1(i3, wVar);
            }
        }
    }

    private void t2(RecyclerView.w wVar, int i, int i2) {
        int iJ = J();
        if (i < 0) {
            return;
        }
        int iH = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < iJ; i3++) {
                View viewI = I(i3);
                if (this.u.g(viewI) < iH || this.u.q(viewI) < iH) {
                    s2(wVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = iJ - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View viewI2 = I(i5);
            if (this.u.g(viewI2) < iH || this.u.q(viewI2) < iH) {
                s2(wVar, i4, i5);
                return;
            }
        }
    }

    private void u2(RecyclerView.w wVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int iJ = J();
        if (!this.x) {
            for (int i4 = 0; i4 < iJ; i4++) {
                View viewI = I(i4);
                if (this.u.d(viewI) > i3 || this.u.p(viewI) > i3) {
                    s2(wVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = iJ - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View viewI2 = I(i6);
            if (this.u.d(viewI2) > i3 || this.u.p(viewI2) > i3) {
                s2(wVar, i5, i6);
                return;
            }
        }
    }

    private void w2() {
        this.x = (this.s == 1 || !m2()) ? this.w : !this.w;
    }

    public void A2(boolean z) {
        g(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View C(int i) {
        int iJ = J();
        if (iJ == 0) {
            return null;
        }
        int iH0 = i - h0(I(0));
        if (iH0 >= 0 && iH0 < iJ) {
            View viewI = I(iH0);
            if (h0(viewI) == i) {
                return viewI;
            }
        }
        return super.C(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public RecyclerView.q D() {
        return new RecyclerView.q(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.I0(recyclerView, wVar);
        if (this.C) {
            k1(wVar);
            wVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void I1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i);
        J1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public View J0(View view, int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iR1;
        w2();
        if (J() == 0 || (iR1 = R1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        E2(iR1, (int) (this.u.n() * 0.33333334f), false, b0Var);
        c cVar = this.t;
        cVar.g = Integer.MIN_VALUE;
        cVar.f2133a = false;
        U1(wVar, cVar, b0Var, true);
        View viewE2 = iR1 == -1 ? e2() : d2();
        View viewJ2 = iR1 == -1 ? j2() : i2();
        if (!viewJ2.hasFocusable()) {
            return viewE2;
        }
        if (viewE2 == null) {
            return null;
        }
        return viewJ2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Y1());
            accessibilityEvent.setToIndex(a2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean L1() {
        return this.D == null && this.v == this.y;
    }

    protected void M1(RecyclerView.b0 b0Var, int[] iArr) {
        int i;
        int iK2 = k2(b0Var);
        if (this.t.f2138f == -1) {
            i = 0;
        } else {
            i = iK2;
            iK2 = 0;
        }
        iArr[0] = iK2;
        iArr[1] = i;
    }

    void N1(RecyclerView.b0 b0Var, c cVar, RecyclerView.p.c cVar2) {
        int i = cVar.f2136d;
        if (i < 0 || i >= b0Var.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    int R1(int i) {
        if (i == 1) {
            return (this.s != 1 && m2()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.s != 1 && m2()) ? -1 : 1;
        }
        if (i == 17) {
            return this.s == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.s == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.s == 0 ? 1 : Integer.MIN_VALUE;
    }

    c S1() {
        return new c();
    }

    void T1() {
        if (this.t == null) {
            this.t = S1();
        }
    }

    int U1(RecyclerView.w wVar, c cVar, RecyclerView.b0 b0Var, boolean z) {
        int i = cVar.f2135c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            r2(wVar, cVar);
        }
        int i3 = cVar.f2135c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(b0Var)) {
                break;
            }
            bVar.a();
            o2(wVar, b0Var, cVar, bVar);
            if (!bVar.f2130b) {
                cVar.f2134b += bVar.f2129a * cVar.f2138f;
                if (!bVar.f2131c || cVar.l != null || !b0Var.e()) {
                    int i4 = cVar.f2135c;
                    int i5 = bVar.f2129a;
                    cVar.f2135c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f2129a;
                    cVar.g = i7;
                    int i8 = cVar.f2135c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    r2(wVar, cVar);
                }
                if (z && bVar.f2132d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f2135c;
    }

    View W1(boolean z, boolean z2) {
        int iJ;
        int iJ2;
        if (this.x) {
            iJ = 0;
            iJ2 = J();
        } else {
            iJ = J() - 1;
            iJ2 = -1;
        }
        return c2(iJ, iJ2, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void X0(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int iG2;
        int i5;
        View viewC;
        int iG;
        int i6;
        int i7 = -1;
        if (!(this.D == null && this.A == -1) && b0Var.b() == 0) {
            k1(wVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.j()) {
            this.A = this.D.f2139b;
        }
        T1();
        this.t.f2133a = false;
        w2();
        View viewV = V();
        a aVar = this.E;
        if (!aVar.f2128e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f2127d = this.x ^ this.y;
            D2(wVar, b0Var, aVar2);
            this.E.f2128e = true;
        } else if (viewV != null && (this.u.g(viewV) >= this.u.i() || this.u.d(viewV) <= this.u.m())) {
            this.E.c(viewV, h0(viewV));
        }
        c cVar = this.t;
        cVar.f2138f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(b0Var, iArr);
        int iMax = Math.max(0, this.H[0]) + this.u.m();
        int iMax2 = Math.max(0, this.H[1]) + this.u.j();
        if (b0Var.e() && (i5 = this.A) != -1 && this.B != Integer.MIN_VALUE && (viewC = C(i5)) != null) {
            if (this.x) {
                i6 = this.u.i() - this.u.d(viewC);
                iG = this.B;
            } else {
                iG = this.u.g(viewC) - this.u.m();
                i6 = this.B;
            }
            int i8 = i6 - iG;
            if (i8 > 0) {
                iMax += i8;
            } else {
                iMax2 -= i8;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f2127d ? !this.x : this.x) {
            i7 = 1;
        }
        q2(wVar, b0Var, aVar3, i7);
        w(wVar);
        this.t.m = v2();
        this.t.j = b0Var.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.f2127d) {
            I2(aVar4);
            c cVar2 = this.t;
            cVar2.h = iMax;
            U1(wVar, cVar2, b0Var, false);
            c cVar3 = this.t;
            i2 = cVar3.f2134b;
            int i9 = cVar3.f2136d;
            int i10 = cVar3.f2135c;
            if (i10 > 0) {
                iMax2 += i10;
            }
            G2(this.E);
            c cVar4 = this.t;
            cVar4.h = iMax2;
            cVar4.f2136d += cVar4.f2137e;
            U1(wVar, cVar4, b0Var, false);
            c cVar5 = this.t;
            i = cVar5.f2134b;
            int i11 = cVar5.f2135c;
            if (i11 > 0) {
                H2(i9, i2);
                c cVar6 = this.t;
                cVar6.h = i11;
                U1(wVar, cVar6, b0Var, false);
                i2 = this.t.f2134b;
            }
        } else {
            G2(aVar4);
            c cVar7 = this.t;
            cVar7.h = iMax2;
            U1(wVar, cVar7, b0Var, false);
            c cVar8 = this.t;
            i = cVar8.f2134b;
            int i12 = cVar8.f2136d;
            int i13 = cVar8.f2135c;
            if (i13 > 0) {
                iMax += i13;
            }
            I2(this.E);
            c cVar9 = this.t;
            cVar9.h = iMax;
            cVar9.f2136d += cVar9.f2137e;
            U1(wVar, cVar9, b0Var, false);
            c cVar10 = this.t;
            i2 = cVar10.f2134b;
            int i14 = cVar10.f2135c;
            if (i14 > 0) {
                F2(i12, i);
                c cVar11 = this.t;
                cVar11.h = i14;
                U1(wVar, cVar11, b0Var, false);
                i = this.t.f2134b;
            }
        }
        if (J() > 0) {
            if (this.x ^ this.y) {
                int iG3 = g2(i, wVar, b0Var, true);
                i3 = i2 + iG3;
                i4 = i + iG3;
                iG2 = h2(i3, wVar, b0Var, false);
            } else {
                int iH2 = h2(i2, wVar, b0Var, true);
                i3 = i2 + iH2;
                i4 = i + iH2;
                iG2 = g2(i4, wVar, b0Var, false);
            }
            i2 = i3 + iG2;
            i = i4 + iG2;
        }
        p2(wVar, b0Var, i2, i);
        if (b0Var.e()) {
            this.E.e();
        } else {
            this.u.s();
        }
        this.v = this.y;
    }

    View X1(boolean z, boolean z2) {
        int iJ;
        int iJ2;
        if (this.x) {
            iJ = J() - 1;
            iJ2 = -1;
        } else {
            iJ = 0;
            iJ2 = J();
        }
        return c2(iJ, iJ2, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void Y0(RecyclerView.b0 b0Var) {
        super.Y0(b0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public int Y1() {
        View viewC2 = c2(0, J(), false, true);
        if (viewC2 == null) {
            return -1;
        }
        return h0(viewC2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF a(int i) {
        if (J() == 0) {
            return null;
        }
        int i2 = (i < h0(I(0))) != this.x ? -1 : 1;
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public int a2() {
        View viewC2 = c2(J() - 1, -1, false, true);
        if (viewC2 == null) {
            return -1;
        }
        return h0(viewC2);
    }

    View b2(int i, int i2) {
        byte b2;
        int i3;
        int i4;
        T1();
        if (i2 > i) {
            b2 = 1;
        } else {
            b2 = i2 < i ? (byte) -1 : (byte) 0;
        }
        if (b2 == 0) {
            return I(i);
        }
        if (this.u.g(I(i)) < this.u.m()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.s == 0 ? this.f2204e : this.f2205f).a(i, i2, i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            d dVar = (d) parcelable;
            this.D = dVar;
            if (this.A != -1) {
                dVar.k();
            }
            t1();
        }
    }

    View c2(int i, int i2, boolean z, boolean z2) {
        T1();
        return (this.s == 0 ? this.f2204e : this.f2205f).a(i, i2, z ? 24579 : 320, z2 ? 320 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public Parcelable d1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z = this.v ^ this.x;
            dVar.f2141d = z;
            if (z) {
                View viewI2 = i2();
                dVar.f2140c = this.u.i() - this.u.d(viewI2);
                dVar.f2139b = h0(viewI2);
            } else {
                View viewJ2 = j2();
                dVar.f2139b = h0(viewJ2);
                dVar.f2140c = this.u.g(viewJ2) - this.u.m();
            }
        } else {
            dVar.k();
        }
        return dVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    View f2(RecyclerView.w wVar, RecyclerView.b0 b0Var, boolean z, boolean z2) {
        int iJ;
        int i;
        T1();
        int iJ2 = J();
        int i2 = -1;
        if (z2) {
            iJ = J() - 1;
            i = -1;
        } else {
            i2 = iJ2;
            iJ = 0;
            i = 1;
        }
        int iB = b0Var.b();
        int iM = this.u.m();
        int i3 = this.u.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iJ != i2) {
            View viewI = I(iJ);
            int iH0 = h0(viewI);
            int iG = this.u.g(viewI);
            int iD = this.u.d(viewI);
            if (iH0 >= 0 && iH0 < iB) {
                if (!((RecyclerView.q) viewI.getLayoutParams()).c()) {
                    boolean z3 = iD <= iM && iG < iM;
                    boolean z4 = iG >= i3 && iD > i3;
                    if (!z3 && !z4) {
                        return viewI;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewI;
                        } else if (view == null) {
                            view = viewI;
                        }
                    } else if (z3) {
                        view2 = viewI;
                    } else if (view == null) {
                        view = viewI;
                    }
                } else if (view3 == null) {
                    view3 = viewI;
                }
            }
            iJ += i;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean k() {
        return this.s == 0;
    }

    @Deprecated
    protected int k2(RecyclerView.b0 b0Var) {
        if (b0Var.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean l() {
        return this.s == 1;
    }

    public int l2() {
        return this.s;
    }

    protected boolean m2() {
        return Z() == 1;
    }

    public boolean n2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void o(int i, int i2, RecyclerView.b0 b0Var, RecyclerView.p.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (J() == 0 || i == 0) {
            return;
        }
        T1();
        E2(i > 0 ? 1 : -1, Math.abs(i), true, b0Var);
        N1(b0Var, this.t, cVar);
    }

    void o2(RecyclerView.w wVar, RecyclerView.b0 b0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int iE0;
        int iF;
        View viewD = cVar.d(wVar);
        if (viewD == null) {
            bVar.f2130b = true;
            return;
        }
        RecyclerView.q qVar = (RecyclerView.q) viewD.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f2138f == -1)) {
                d(viewD);
            } else {
                e(viewD, 0);
            }
        } else {
            if (this.x == (cVar.f2138f == -1)) {
                b(viewD);
            } else {
                c(viewD, 0);
            }
        }
        A0(viewD, 0, 0);
        bVar.f2129a = this.u.e(viewD);
        if (this.s == 1) {
            if (m2()) {
                iF = o0() - f0();
                iE0 = iF - this.u.f(viewD);
            } else {
                iE0 = e0();
                iF = this.u.f(viewD) + iE0;
            }
            int i4 = cVar.f2138f;
            int i5 = cVar.f2134b;
            if (i4 == -1) {
                i3 = i5;
                i2 = iF;
                i = i5 - bVar.f2129a;
            } else {
                i = i5;
                i2 = iF;
                i3 = bVar.f2129a + i5;
            }
        } else {
            int iG0 = g0();
            int iF2 = this.u.f(viewD) + iG0;
            int i6 = cVar.f2138f;
            int i7 = cVar.f2134b;
            if (i6 == -1) {
                i2 = i7;
                i = iG0;
                i3 = iF2;
                iE0 = i7 - bVar.f2129a;
            } else {
                i = iG0;
                i2 = bVar.f2129a + i7;
                i3 = iF2;
                iE0 = i7;
            }
        }
        z0(viewD, iE0, i, i2, i3);
        if (qVar.c() || qVar.b()) {
            bVar.f2131c = true;
        }
        bVar.f2132d = viewD.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void p(int i, RecyclerView.p.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        if (dVar == null || !dVar.j()) {
            w2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.f2141d;
            i2 = dVar2.f2139b;
        }
        int i3 = z ? -1 : 1;
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int q(RecyclerView.b0 b0Var) {
        return O1(b0Var);
    }

    void q2(RecyclerView.w wVar, RecyclerView.b0 b0Var, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int r(RecyclerView.b0 b0Var) {
        return P1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int s(RecyclerView.b0 b0Var) {
        return Q1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public boolean s0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int t(RecyclerView.b0 b0Var) {
        return O1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int u(RecyclerView.b0 b0Var) {
        return P1(b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int v(RecyclerView.b0 b0Var) {
        return Q1(b0Var);
    }

    boolean v2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int w1(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 1) {
            return 0;
        }
        return x2(i, wVar, b0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public void x1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.k();
        }
        t1();
    }

    int x2(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (J() == 0 || i == 0) {
            return 0;
        }
        T1();
        this.t.f2133a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        E2(i2, iAbs, true, b0Var);
        c cVar = this.t;
        int iU1 = cVar.g + U1(wVar, cVar, b0Var, false);
        if (iU1 < 0) {
            return 0;
        }
        if (iAbs > iU1) {
            i = i2 * iU1;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.p
    public int y1(int i, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (this.s == 0) {
            return 0;
        }
        return x2(i, wVar, b0Var);
    }

    public void y2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        g(null);
        if (i != this.s || this.u == null) {
            i iVarB = i.b(this, i);
            this.u = iVarB;
            this.E.f2124a = iVarB;
            this.s = i;
            t1();
        }
    }

    public void z2(boolean z) {
        g(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        t1();
    }
}
