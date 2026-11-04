package a.e.a.m.m;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b.a f349a = new b.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f350b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f351c = 0;

    private static boolean a(int i, a.e.a.m.e eVar) {
        a.e.a.m.e.b bVar;
        a.e.a.m.e.b bVar2;
        a.e.a.m.e.b bVarY = eVar.y();
        a.e.a.m.e.b bVarR = eVar.R();
        a.e.a.m.f fVar = eVar.I() != null ? (a.e.a.m.f) eVar.I() : null;
        if (fVar != null) {
            fVar.y();
            a.e.a.m.e.b bVar3 = a.e.a.m.e.b.FIXED;
        }
        if (fVar != null) {
            fVar.R();
            a.e.a.m.e.b bVar4 = a.e.a.m.e.b.FIXED;
        }
        a.e.a.m.e.b bVar5 = a.e.a.m.e.b.FIXED;
        boolean z = bVarY == bVar5 || eVar.l0() || bVarY == a.e.a.m.e.b.WRAP_CONTENT || (bVarY == (bVar2 = a.e.a.m.e.b.MATCH_CONSTRAINT) && eVar.x == 0 && eVar.e0 == 0.0f && eVar.Y(0)) || (bVarY == bVar2 && eVar.x == 1 && eVar.b0(0, eVar.U()));
        boolean z2 = bVarR == bVar5 || eVar.m0() || bVarR == a.e.a.m.e.b.WRAP_CONTENT || (bVarR == (bVar = a.e.a.m.e.b.MATCH_CONSTRAINT) && eVar.y == 0 && eVar.e0 == 0.0f && eVar.Y(1)) || (bVarR == bVar && eVar.y == 1 && eVar.b0(1, eVar.v()));
        if (eVar.e0 <= 0.0f || !(z || z2)) {
            return z && z2;
        }
        return true;
    }

    private static void b(int i, a.e.a.m.e eVar, b.InterfaceC0006b interfaceC0006b, boolean z) {
        a.e.a.m.d dVar;
        a.e.a.m.d dVar2;
        a.e.a.m.d dVar3;
        a.e.a.m.d dVar4;
        if (eVar.e0()) {
            return;
        }
        boolean z2 = true;
        f350b++;
        if (!(eVar instanceof a.e.a.m.f) && eVar.k0()) {
            int i2 = i + 1;
            if (a(i2, eVar)) {
                a.e.a.m.f.O1(i2, eVar, interfaceC0006b, new b.a(), b.a.f326a);
            }
        }
        a.e.a.m.d dVarM = eVar.m(a.e.a.m.d.b.LEFT);
        a.e.a.m.d dVarM2 = eVar.m(a.e.a.m.d.b.RIGHT);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<a.e.a.m.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                a.e.a.m.d next = it.next();
                a.e.a.m.e eVar2 = next.f299d;
                int i3 = i + 1;
                boolean zA = a(i3, eVar2);
                if (eVar2.k0() && zA) {
                    a.e.a.m.f.O1(i3, eVar2, interfaceC0006b, new b.a(), b.a.f326a);
                }
                boolean z3 = ((next == eVar2.P && (dVar4 = eVar2.R.f301f) != null && dVar4.m()) || (next == eVar2.R && (dVar3 = eVar2.P.f301f) != null && dVar3.m())) ? z2 : false;
                a.e.a.m.e.b bVarY = eVar2.y();
                a.e.a.m.e.b bVar = a.e.a.m.e.b.MATCH_CONSTRAINT;
                if (bVarY != bVar || zA) {
                    if (!eVar2.k0()) {
                        a.e.a.m.d dVar5 = eVar2.P;
                        if (next == dVar5 && eVar2.R.f301f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.C0(iE, eVar2.U() + iE);
                        } else {
                            a.e.a.m.d dVar6 = eVar2.R;
                            if (next == dVar6 && dVar5.f301f == null) {
                                int iE2 = iD - dVar6.e();
                                eVar2.C0(iE2 - eVar2.U(), iE2);
                            } else if (z3 && !eVar2.g0()) {
                                d(i3, interfaceC0006b, eVar2, z);
                            }
                        }
                        b(i3, eVar2, interfaceC0006b, z);
                    }
                } else if (eVar2.y() == bVar && eVar2.B >= 0 && eVar2.A >= 0 && ((eVar2.T() == 8 || (eVar2.x == 0 && eVar2.t() == 0.0f)) && !eVar2.g0() && !eVar2.j0() && z3 && !eVar2.g0())) {
                    e(i3, eVar, interfaceC0006b, eVar2, z);
                }
                z2 = true;
            }
        }
        if (eVar instanceof a.e.a.m.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator<a.e.a.m.d> it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                a.e.a.m.d next2 = it2.next();
                a.e.a.m.e eVar3 = next2.f299d;
                int i4 = i + 1;
                boolean zA2 = a(i4, eVar3);
                if (eVar3.k0() && zA2) {
                    a.e.a.m.f.O1(i4, eVar3, interfaceC0006b, new b.a(), b.a.f326a);
                }
                boolean z4 = (next2 == eVar3.P && (dVar2 = eVar3.R.f301f) != null && dVar2.m()) || (next2 == eVar3.R && (dVar = eVar3.P.f301f) != null && dVar.m());
                a.e.a.m.e.b bVarY2 = eVar3.y();
                a.e.a.m.e.b bVar2 = a.e.a.m.e.b.MATCH_CONSTRAINT;
                if (bVarY2 != bVar2 || zA2) {
                    if (!eVar3.k0()) {
                        a.e.a.m.d dVar7 = eVar3.P;
                        if (next2 == dVar7 && eVar3.R.f301f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.C0(iE3, eVar3.U() + iE3);
                        } else {
                            a.e.a.m.d dVar8 = eVar3.R;
                            if (next2 == dVar8 && dVar7.f301f == null) {
                                int iE4 = iD2 - dVar8.e();
                                eVar3.C0(iE4 - eVar3.U(), iE4);
                            } else if (z4 && !eVar3.g0()) {
                                d(i4, interfaceC0006b, eVar3, z);
                            }
                        }
                        b(i4, eVar3, interfaceC0006b, z);
                    }
                } else if (eVar3.y() == bVar2 && eVar3.B >= 0 && eVar3.A >= 0 && (eVar3.T() == 8 || (eVar3.x == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.g0() && !eVar3.j0() && z4 && !eVar3.g0()) {
                        e(i4, eVar, interfaceC0006b, eVar3, z);
                    }
                }
            }
        }
        eVar.o0();
    }

    private static void c(int i, a.e.a.m.a aVar, b.InterfaceC0006b interfaceC0006b, int i2, boolean z) {
        if (aVar.q1()) {
            int i3 = i + 1;
            if (i2 == 0) {
                b(i3, aVar, interfaceC0006b, z);
            } else {
                i(i3, aVar, interfaceC0006b);
            }
        }
    }

    private static void d(int i, b.InterfaceC0006b interfaceC0006b, a.e.a.m.e eVar, boolean z) {
        float fW = eVar.w();
        int iD = eVar.P.f301f.d();
        int iD2 = eVar.R.f301f.d();
        int iE = eVar.P.e() + iD;
        int iE2 = iD2 - eVar.R.e();
        if (iD == iD2) {
            fW = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iU = eVar.U();
        int i2 = (iD2 - iD) - iU;
        if (iD > iD2) {
            i2 = (iD - iD2) - iU;
        }
        int i3 = ((int) (i2 > 0 ? (fW * i2) + 0.5f : fW * i2)) + iD;
        int i4 = i3 + iU;
        if (iD > iD2) {
            i4 = i3 - iU;
        }
        eVar.C0(i3, i4);
        b(i + 1, eVar, interfaceC0006b, z);
    }

    private static void e(int i, a.e.a.m.e eVar, b.InterfaceC0006b interfaceC0006b, a.e.a.m.e eVar2, boolean z) {
        float fW = eVar2.w();
        int iD = eVar2.P.f301f.d() + eVar2.P.e();
        int iD2 = eVar2.R.f301f.d() - eVar2.R.e();
        if (iD2 >= iD) {
            int iU = eVar2.U();
            if (eVar2.T() != 8) {
                int i2 = eVar2.x;
                if (i2 == 2) {
                    if (!(eVar instanceof a.e.a.m.f)) {
                        eVar = eVar.I();
                    }
                    iU = (int) (eVar2.w() * 0.5f * eVar.U());
                } else if (i2 == 0) {
                    iU = iD2 - iD;
                }
                iU = Math.max(eVar2.A, iU);
                int i3 = eVar2.B;
                if (i3 > 0) {
                    iU = Math.min(i3, iU);
                }
            }
            int i4 = iD + ((int) ((fW * ((iD2 - iD) - iU)) + 0.5f));
            eVar2.C0(i4, iU + i4);
            b(i + 1, eVar2, interfaceC0006b, z);
        }
    }

    private static void f(int i, b.InterfaceC0006b interfaceC0006b, a.e.a.m.e eVar) {
        float fP = eVar.P();
        int iD = eVar.Q.f301f.d();
        int iD2 = eVar.S.f301f.d();
        int iE = eVar.Q.e() + iD;
        int iE2 = iD2 - eVar.S.e();
        if (iD == iD2) {
            fP = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iV = eVar.v();
        int i2 = (iD2 - iD) - iV;
        if (iD > iD2) {
            i2 = (iD - iD2) - iV;
        }
        int i3 = (int) (i2 > 0 ? (fP * i2) + 0.5f : fP * i2);
        int i4 = iD + i3;
        int i5 = i4 + iV;
        if (iD > iD2) {
            i4 = iD - i3;
            i5 = i4 - iV;
        }
        eVar.F0(i4, i5);
        i(i + 1, eVar, interfaceC0006b);
    }

    private static void g(int i, a.e.a.m.e eVar, b.InterfaceC0006b interfaceC0006b, a.e.a.m.e eVar2) {
        float fP = eVar2.P();
        int iD = eVar2.Q.f301f.d() + eVar2.Q.e();
        int iD2 = eVar2.S.f301f.d() - eVar2.S.e();
        if (iD2 >= iD) {
            int iV = eVar2.v();
            if (eVar2.T() != 8) {
                int i2 = eVar2.y;
                if (i2 == 2) {
                    if (!(eVar instanceof a.e.a.m.f)) {
                        eVar = eVar.I();
                    }
                    iV = (int) (fP * 0.5f * eVar.v());
                } else if (i2 == 0) {
                    iV = iD2 - iD;
                }
                iV = Math.max(eVar2.D, iV);
                int i3 = eVar2.E;
                if (i3 > 0) {
                    iV = Math.min(i3, iV);
                }
            }
            int i4 = iD + ((int) ((fP * ((iD2 - iD) - iV)) + 0.5f));
            eVar2.F0(i4, iV + i4);
            i(i + 1, eVar2, interfaceC0006b);
        }
    }

    public static void h(a.e.a.m.f fVar, b.InterfaceC0006b interfaceC0006b) {
        int iS1;
        int iS2;
        a.e.a.m.e.b bVarY = fVar.y();
        a.e.a.m.e.b bVarR = fVar.R();
        f350b = 0;
        f351c = 0;
        fVar.s0();
        ArrayList<a.e.a.m.e> arrayListO1 = fVar.o1();
        int size = arrayListO1.size();
        for (int i = 0; i < size; i++) {
            arrayListO1.get(i).s0();
        }
        boolean zL1 = fVar.L1();
        if (bVarY == a.e.a.m.e.b.FIXED) {
            fVar.C0(0, fVar.U());
        } else {
            fVar.D0(0);
        }
        boolean z = false;
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            a.e.a.m.e eVar = arrayListO1.get(i2);
            if (eVar instanceof a.e.a.m.g) {
                a.e.a.m.g gVar = (a.e.a.m.g) eVar;
                if (gVar.p1() == 1) {
                    if (gVar.q1() != -1) {
                        iS2 = gVar.q1();
                    } else if (gVar.r1() == -1 || !fVar.l0()) {
                        if (fVar.l0()) {
                            iS2 = (int) ((gVar.s1() * fVar.U()) + 0.5f);
                        }
                        z = true;
                    } else {
                        iS2 = fVar.U() - gVar.r1();
                    }
                    gVar.t1(iS2);
                    z = true;
                }
            } else if ((eVar instanceof a.e.a.m.a) && ((a.e.a.m.a) eVar).u1() == 0) {
                z2 = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                a.e.a.m.e eVar2 = arrayListO1.get(i3);
                if (eVar2 instanceof a.e.a.m.g) {
                    a.e.a.m.g gVar2 = (a.e.a.m.g) eVar2;
                    if (gVar2.p1() == 1) {
                        b(0, gVar2, interfaceC0006b, zL1);
                    }
                }
            }
        }
        b(0, fVar, interfaceC0006b, zL1);
        if (z2) {
            for (int i4 = 0; i4 < size; i4++) {
                a.e.a.m.e eVar3 = arrayListO1.get(i4);
                if (eVar3 instanceof a.e.a.m.a) {
                    a.e.a.m.a aVar = (a.e.a.m.a) eVar3;
                    if (aVar.u1() == 0) {
                        c(0, aVar, interfaceC0006b, 0, zL1);
                    }
                }
            }
        }
        if (bVarR == a.e.a.m.e.b.FIXED) {
            fVar.F0(0, fVar.v());
        } else {
            fVar.E0(0);
        }
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            a.e.a.m.e eVar4 = arrayListO1.get(i5);
            if (eVar4 instanceof a.e.a.m.g) {
                a.e.a.m.g gVar3 = (a.e.a.m.g) eVar4;
                if (gVar3.p1() == 0) {
                    if (gVar3.q1() != -1) {
                        iS1 = gVar3.q1();
                    } else if (gVar3.r1() == -1 || !fVar.m0()) {
                        if (fVar.m0()) {
                            iS1 = (int) ((gVar3.s1() * fVar.v()) + 0.5f);
                        }
                        z3 = true;
                    } else {
                        iS1 = fVar.v() - gVar3.r1();
                    }
                    gVar3.t1(iS1);
                    z3 = true;
                }
            } else if ((eVar4 instanceof a.e.a.m.a) && ((a.e.a.m.a) eVar4).u1() == 1) {
                z4 = true;
            }
        }
        if (z3) {
            for (int i6 = 0; i6 < size; i6++) {
                a.e.a.m.e eVar5 = arrayListO1.get(i6);
                if (eVar5 instanceof a.e.a.m.g) {
                    a.e.a.m.g gVar4 = (a.e.a.m.g) eVar5;
                    if (gVar4.p1() == 0) {
                        i(1, gVar4, interfaceC0006b);
                    }
                }
            }
        }
        i(0, fVar, interfaceC0006b);
        if (z4) {
            for (int i7 = 0; i7 < size; i7++) {
                a.e.a.m.e eVar6 = arrayListO1.get(i7);
                if (eVar6 instanceof a.e.a.m.a) {
                    a.e.a.m.a aVar2 = (a.e.a.m.a) eVar6;
                    if (aVar2.u1() == 1) {
                        c(0, aVar2, interfaceC0006b, 1, zL1);
                    }
                }
            }
        }
        for (int i8 = 0; i8 < size; i8++) {
            a.e.a.m.e eVar7 = arrayListO1.get(i8);
            if (eVar7.k0() && a(0, eVar7)) {
                a.e.a.m.f.O1(0, eVar7, interfaceC0006b, f349a, b.a.f326a);
                if (!(eVar7 instanceof a.e.a.m.g)) {
                    b(0, eVar7, interfaceC0006b, zL1);
                } else if (((a.e.a.m.g) eVar7).p1() != 0) {
                    b(0, eVar7, interfaceC0006b, zL1);
                }
                i(0, eVar7, interfaceC0006b);
            }
        }
    }

    private static void i(int i, a.e.a.m.e eVar, b.InterfaceC0006b interfaceC0006b) {
        a.e.a.m.d dVar;
        a.e.a.m.d dVar2;
        a.e.a.m.d dVar3;
        a.e.a.m.d dVar4;
        if (eVar.n0()) {
            return;
        }
        f351c++;
        if (!(eVar instanceof a.e.a.m.f) && eVar.k0()) {
            int i2 = i + 1;
            if (a(i2, eVar)) {
                a.e.a.m.f.O1(i2, eVar, interfaceC0006b, new b.a(), b.a.f326a);
            }
        }
        a.e.a.m.d dVarM = eVar.m(a.e.a.m.d.b.TOP);
        a.e.a.m.d dVarM2 = eVar.m(a.e.a.m.d.b.BOTTOM);
        int iD = dVarM.d();
        int iD2 = dVarM2.d();
        if (dVarM.c() != null && dVarM.m()) {
            Iterator<a.e.a.m.d> it = dVarM.c().iterator();
            while (it.hasNext()) {
                a.e.a.m.d next = it.next();
                a.e.a.m.e eVar2 = next.f299d;
                int i3 = i + 1;
                boolean zA = a(i3, eVar2);
                if (eVar2.k0() && zA) {
                    a.e.a.m.f.O1(i3, eVar2, interfaceC0006b, new b.a(), b.a.f326a);
                }
                boolean z = (next == eVar2.Q && (dVar4 = eVar2.S.f301f) != null && dVar4.m()) || (next == eVar2.S && (dVar3 = eVar2.Q.f301f) != null && dVar3.m());
                a.e.a.m.e.b bVarR = eVar2.R();
                a.e.a.m.e.b bVar = a.e.a.m.e.b.MATCH_CONSTRAINT;
                if (bVarR != bVar || zA) {
                    if (!eVar2.k0()) {
                        a.e.a.m.d dVar5 = eVar2.Q;
                        if (next == dVar5 && eVar2.S.f301f == null) {
                            int iE = dVar5.e() + iD;
                            eVar2.F0(iE, eVar2.v() + iE);
                        } else {
                            a.e.a.m.d dVar6 = eVar2.S;
                            if (next == dVar6 && dVar5.f301f == null) {
                                int iE2 = iD - dVar6.e();
                                eVar2.F0(iE2 - eVar2.v(), iE2);
                            } else if (z && !eVar2.i0()) {
                                f(i3, interfaceC0006b, eVar2);
                            }
                        }
                        i(i3, eVar2, interfaceC0006b);
                    }
                } else if (eVar2.R() == bVar && eVar2.E >= 0 && eVar2.D >= 0 && (eVar2.T() == 8 || (eVar2.y == 0 && eVar2.t() == 0.0f))) {
                    if (!eVar2.i0() && !eVar2.j0() && z && !eVar2.i0()) {
                        g(i3, eVar, interfaceC0006b, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof a.e.a.m.g) {
            return;
        }
        if (dVarM2.c() != null && dVarM2.m()) {
            Iterator<a.e.a.m.d> it2 = dVarM2.c().iterator();
            while (it2.hasNext()) {
                a.e.a.m.d next2 = it2.next();
                a.e.a.m.e eVar3 = next2.f299d;
                int i4 = i + 1;
                boolean zA2 = a(i4, eVar3);
                if (eVar3.k0() && zA2) {
                    a.e.a.m.f.O1(i4, eVar3, interfaceC0006b, new b.a(), b.a.f326a);
                }
                boolean z2 = (next2 == eVar3.Q && (dVar2 = eVar3.S.f301f) != null && dVar2.m()) || (next2 == eVar3.S && (dVar = eVar3.Q.f301f) != null && dVar.m());
                a.e.a.m.e.b bVarR2 = eVar3.R();
                a.e.a.m.e.b bVar2 = a.e.a.m.e.b.MATCH_CONSTRAINT;
                if (bVarR2 != bVar2 || zA2) {
                    if (!eVar3.k0()) {
                        a.e.a.m.d dVar7 = eVar3.Q;
                        if (next2 == dVar7 && eVar3.S.f301f == null) {
                            int iE3 = dVar7.e() + iD2;
                            eVar3.F0(iE3, eVar3.v() + iE3);
                        } else {
                            a.e.a.m.d dVar8 = eVar3.S;
                            if (next2 == dVar8 && dVar7.f301f == null) {
                                int iE4 = iD2 - dVar8.e();
                                eVar3.F0(iE4 - eVar3.v(), iE4);
                            } else if (z2 && !eVar3.i0()) {
                                f(i4, interfaceC0006b, eVar3);
                            }
                        }
                        i(i4, eVar3, interfaceC0006b);
                    }
                } else if (eVar3.R() == bVar2 && eVar3.E >= 0 && eVar3.D >= 0 && (eVar3.T() == 8 || (eVar3.y == 0 && eVar3.t() == 0.0f))) {
                    if (!eVar3.i0() && !eVar3.j0() && z2 && !eVar3.i0()) {
                        g(i4, eVar, interfaceC0006b, eVar3);
                    }
                }
            }
        }
        a.e.a.m.d dVarM3 = eVar.m(a.e.a.m.d.b.BASELINE);
        if (dVarM3.c() != null && dVarM3.m()) {
            int iD3 = dVarM3.d();
            for (a.e.a.m.d dVar9 : dVarM3.c()) {
                a.e.a.m.e eVar4 = dVar9.f299d;
                int i5 = i + 1;
                boolean zA3 = a(i5, eVar4);
                if (eVar4.k0() && zA3) {
                    a.e.a.m.f.O1(i5, eVar4, interfaceC0006b, new b.a(), b.a.f326a);
                }
                if (eVar4.R() != a.e.a.m.e.b.MATCH_CONSTRAINT || zA3) {
                    if (!eVar4.k0() && dVar9 == eVar4.T) {
                        eVar4.B0(dVar9.e() + iD3);
                        i(i5, eVar4, interfaceC0006b);
                    }
                }
            }
        }
        eVar.p0();
    }
}
