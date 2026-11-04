package a.e.a.m.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<a.e.a.m.e> f323a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f324b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a.e.a.m.f f325c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f326a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f327b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f328c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a.e.a.m.e.b f329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public a.e.a.m.e.b f330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f331f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;
        public int m;
    }

    /* JADX INFO: renamed from: a.e.a.m.m.b$b, reason: collision with other inner class name */
    public interface InterfaceC0006b {
        void a();

        void b(a.e.a.m.e eVar, a aVar);
    }

    public b(a.e.a.m.f fVar) {
        this.f325c = fVar;
    }

    private boolean a(InterfaceC0006b interfaceC0006b, a.e.a.m.e eVar, int i) {
        this.f324b.f329d = eVar.y();
        this.f324b.f330e = eVar.R();
        this.f324b.f331f = eVar.U();
        this.f324b.g = eVar.v();
        a aVar = this.f324b;
        aVar.l = false;
        aVar.m = i;
        a.e.a.m.e.b bVar = aVar.f329d;
        a.e.a.m.e.b bVar2 = a.e.a.m.e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.f330e == bVar2;
        boolean z3 = z && eVar.e0 > 0.0f;
        boolean z4 = z2 && eVar.e0 > 0.0f;
        if (z3 && eVar.z[0] == 4) {
            aVar.f329d = a.e.a.m.e.b.FIXED;
        }
        if (z4 && eVar.z[1] == 4) {
            aVar.f330e = a.e.a.m.e.b.FIXED;
        }
        interfaceC0006b.b(eVar, aVar);
        eVar.h1(this.f324b.h);
        eVar.I0(this.f324b.i);
        eVar.H0(this.f324b.k);
        eVar.x0(this.f324b.j);
        a aVar2 = this.f324b;
        aVar2.m = a.f326a;
        return aVar2.l;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0098 A[PHI: r10
      0x0098: PHI (r10v2 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v4 boolean), (r10v4 boolean) binds: [B:32:0x0062, B:34:0x0068, B:36:0x006c, B:54:0x0095, B:52:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    private void b(a.e.a.m.f fVar) {
        boolean z;
        l lVar;
        n nVar;
        int size = fVar.K0.size();
        boolean zP1 = fVar.P1(64);
        InterfaceC0006b interfaceC0006bF1 = fVar.F1();
        for (int i = 0; i < size; i++) {
            a.e.a.m.e eVar = fVar.K0.get(i);
            if (!(eVar instanceof a.e.a.m.g) && !(eVar instanceof a.e.a.m.a) && !eVar.j0() && (!zP1 || (lVar = eVar.f313f) == null || (nVar = eVar.g) == null || !lVar.f376e.j || !nVar.f376e.j)) {
                a.e.a.m.e.b bVarS = eVar.s(0);
                a.e.a.m.e.b bVarS2 = eVar.s(1);
                a.e.a.m.e.b bVar = a.e.a.m.e.b.MATCH_CONSTRAINT;
                boolean z2 = bVarS == bVar && eVar.x != 1 && bVarS2 == bVar && eVar.y != 1;
                if (!z2 && fVar.P1(1) && !(eVar instanceof a.e.a.m.k)) {
                    if (bVarS == bVar && eVar.x == 0 && bVarS2 != bVar && !eVar.g0()) {
                        z2 = true;
                    }
                    if (bVarS2 == bVar && eVar.y == 0 && bVarS != bVar && !eVar.g0()) {
                        z2 = true;
                    }
                    z = (!(bVarS == bVar || bVarS2 == bVar) || eVar.e0 <= 0.0f) ? z2 : true;
                }
                if (z) {
                    continue;
                } else {
                    a(interfaceC0006bF1, eVar, a.f326a);
                    if (fVar.Q0 != null) {
                        throw null;
                    }
                }
            }
        }
        interfaceC0006bF1.a();
    }

    private void c(a.e.a.m.f fVar, String str, int i, int i2, int i3) {
        int iG = fVar.G();
        int iF = fVar.F();
        fVar.X0(0);
        fVar.W0(0);
        fVar.h1(i2);
        fVar.I0(i3);
        fVar.X0(iG);
        fVar.W0(iF);
        this.f325c.T1(i);
        this.f325c.p1();
    }

    public long d(a.e.a.m.f fVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        boolean zE1;
        int i10;
        int i11;
        boolean z;
        int i12;
        boolean z2;
        b bVar = this;
        InterfaceC0006b interfaceC0006bF1 = fVar.F1();
        int size = fVar.K0.size();
        int iU = fVar.U();
        int iV = fVar.v();
        boolean zB = a.e.a.m.j.b(i, 128);
        boolean z3 = zB || a.e.a.m.j.b(i, 64);
        if (z3) {
            for (int i13 = 0; i13 < size; i13++) {
                a.e.a.m.e eVar = fVar.K0.get(i13);
                a.e.a.m.e.b bVarY = eVar.y();
                a.e.a.m.e.b bVar2 = a.e.a.m.e.b.MATCH_CONSTRAINT;
                boolean z4 = (bVarY == bVar2) && (eVar.R() == bVar2) && eVar.t() > 0.0f;
                if ((eVar.g0() && z4) || ((eVar.i0() && z4) || (eVar instanceof a.e.a.m.k) || eVar.g0() || eVar.i0())) {
                    z3 = false;
                    break;
                }
            }
        }
        if (z3 && a.e.a.d.g != null) {
            throw null;
        }
        boolean z5 = z3 & ((i4 == 1073741824 && i6 == 1073741824) || zB);
        int i14 = 2;
        if (z5) {
            int iMin = Math.min(fVar.E(), i5);
            int iMin2 = Math.min(fVar.D(), i7);
            if (i4 == 1073741824 && fVar.U() != iMin) {
                fVar.h1(iMin);
                fVar.I1();
            }
            if (i6 == 1073741824 && fVar.v() != iMin2) {
                fVar.I0(iMin2);
                fVar.I1();
            }
            if (i4 == 1073741824 && i6 == 1073741824) {
                zE1 = fVar.C1(zB);
                i10 = 2;
            } else {
                boolean zD1 = fVar.D1(zB);
                if (i4 == 1073741824) {
                    zD1 &= fVar.E1(zB, 0);
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                if (i6 == 1073741824) {
                    zE1 = fVar.E1(zB, 1) & zD1;
                    i10++;
                } else {
                    zE1 = zD1;
                }
            }
            if (zE1) {
                fVar.m1(i4 == 1073741824, i6 == 1073741824);
            }
        } else {
            zE1 = false;
            i10 = 0;
        }
        if (zE1 && i10 == 2) {
            return 0L;
        }
        int iG1 = fVar.G1();
        if (size > 0) {
            b(fVar);
        }
        e(fVar);
        int size2 = bVar.f323a.size();
        if (size > 0) {
            c(fVar, "First pass", 0, iU, iV);
        }
        if (size2 > 0) {
            a.e.a.m.e.b bVarY2 = fVar.y();
            a.e.a.m.e.b bVar3 = a.e.a.m.e.b.WRAP_CONTENT;
            boolean z6 = bVarY2 == bVar3;
            boolean z7 = fVar.R() == bVar3;
            int iMax = Math.max(fVar.U(), bVar.f325c.G());
            int iMax2 = Math.max(fVar.v(), bVar.f325c.F());
            int i15 = 0;
            boolean zS1 = false;
            while (i15 < size2) {
                a.e.a.m.e eVar2 = bVar.f323a.get(i15);
                if (eVar2 instanceof a.e.a.m.k) {
                    int iU2 = eVar2.U();
                    int iV2 = eVar2.v();
                    boolean zA = bVar.a(interfaceC0006bF1, eVar2, a.f327b) | zS1;
                    if (fVar.Q0 != null) {
                        throw null;
                    }
                    int iU3 = eVar2.U();
                    int iV3 = eVar2.v();
                    if (iU3 != iU2) {
                        eVar2.h1(iU3);
                        if (z6 && eVar2.K() > iMax) {
                            iMax = Math.max(iMax, eVar2.K() + eVar2.m(a.e.a.m.d.b.RIGHT).e());
                        }
                        z2 = true;
                    } else {
                        z2 = zA;
                    }
                    if (iV3 != iV2) {
                        eVar2.I0(iV3);
                        if (z7 && eVar2.p() > iMax2) {
                            iMax2 = Math.max(iMax2, eVar2.p() + eVar2.m(a.e.a.m.d.b.BOTTOM).e());
                        }
                        z2 = true;
                    }
                    zS1 = z2 | ((a.e.a.m.k) eVar2).s1();
                }
                i15++;
                iG1 = iG1;
                iV = iV;
                i14 = 2;
            }
            int i16 = iG1;
            int i17 = iV;
            int i18 = i14;
            int i19 = 0;
            while (i19 < i18) {
                int i20 = 0;
                while (i20 < size2) {
                    a.e.a.m.e eVar3 = bVar.f323a.get(i20);
                    if (((eVar3 instanceof a.e.a.m.h) && !(eVar3 instanceof a.e.a.m.k)) || (eVar3 instanceof a.e.a.m.g) || eVar3.T() == 8 || ((z5 && eVar3.f313f.f376e.j && eVar3.g.f376e.j) || (eVar3 instanceof a.e.a.m.k))) {
                        z = z5;
                        i12 = size2;
                    } else {
                        int iU4 = eVar3.U();
                        int iV4 = eVar3.v();
                        z = z5;
                        int iN = eVar3.n();
                        int i21 = a.f327b;
                        i12 = size2;
                        if (i19 == 1) {
                            i21 = a.f328c;
                        }
                        boolean zA2 = bVar.a(interfaceC0006bF1, eVar3, i21) | zS1;
                        if (fVar.Q0 != null) {
                            throw null;
                        }
                        int iU5 = eVar3.U();
                        int iV5 = eVar3.v();
                        if (iU5 != iU4) {
                            eVar3.h1(iU5);
                            if (z6 && eVar3.K() > iMax) {
                                iMax = Math.max(iMax, eVar3.K() + eVar3.m(a.e.a.m.d.b.RIGHT).e());
                            }
                            zA2 = true;
                        }
                        if (iV5 != iV4) {
                            eVar3.I0(iV5);
                            if (z7 && eVar3.p() > iMax2) {
                                iMax2 = Math.max(iMax2, eVar3.p() + eVar3.m(a.e.a.m.d.b.BOTTOM).e());
                            }
                            zA2 = true;
                        }
                        zS1 = (!eVar3.X() || iN == eVar3.n()) ? zA2 : true;
                    }
                    i20++;
                    bVar = this;
                    z5 = z;
                    size2 = i12;
                }
                boolean z8 = z5;
                int i22 = size2;
                if (!zS1) {
                    break;
                }
                i19++;
                c(fVar, "intermediate pass", i19, iU, i17);
                bVar = this;
                z5 = z8;
                size2 = i22;
                i18 = 2;
                zS1 = false;
            }
            i11 = i16;
        } else {
            i11 = iG1;
        }
        fVar.S1(i11);
        return 0L;
    }

    public void e(a.e.a.m.f fVar) {
        this.f323a.clear();
        int size = fVar.K0.size();
        for (int i = 0; i < size; i++) {
            a.e.a.m.e eVar = fVar.K0.get(i);
            a.e.a.m.e.b bVarY = eVar.y();
            a.e.a.m.e.b bVar = a.e.a.m.e.b.MATCH_CONSTRAINT;
            if (bVarY == bVar || eVar.R() == bVar) {
                this.f323a.add(eVar);
            }
        }
        fVar.I1();
    }
}
