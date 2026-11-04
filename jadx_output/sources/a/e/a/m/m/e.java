package a.e.a.m.m;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.e.a.m.f f332a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a.e.a.m.f f335d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f333b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f334c = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ArrayList<p> f336e = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ArrayList<m> f337f = new ArrayList<>();
    private b.InterfaceC0006b g = null;
    private b.a h = new b.a();
    ArrayList<m> i = new ArrayList<>();

    public e(a.e.a.m.f fVar) {
        this.f332a = fVar;
        this.f335d = fVar;
    }

    private void a(f fVar, int i, int i2, f fVar2, ArrayList<m> arrayList, m mVar) {
        p pVar = fVar.f341d;
        if (pVar.f374c == null) {
            a.e.a.m.f fVar3 = this.f332a;
            if (pVar == fVar3.f313f || pVar == fVar3.g) {
                return;
            }
            if (mVar == null) {
                mVar = new m(pVar, i2);
                arrayList.add(mVar);
            }
            pVar.f374c = mVar;
            mVar.a(pVar);
            for (d dVar : pVar.h.k) {
                if (dVar instanceof f) {
                    a((f) dVar, i, 0, fVar2, arrayList, mVar);
                }
            }
            for (d dVar2 : pVar.i.k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, 1, fVar2, arrayList, mVar);
                }
            }
            if (i == 1 && (pVar instanceof n)) {
                for (d dVar3 : ((n) pVar).k.k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, 2, fVar2, arrayList, mVar);
                    }
                }
            }
            for (f fVar4 : pVar.h.l) {
                if (fVar4 == fVar2) {
                    mVar.f355c = true;
                }
                a(fVar4, i, 0, fVar2, arrayList, mVar);
            }
            for (f fVar5 : pVar.i.l) {
                if (fVar5 == fVar2) {
                    mVar.f355c = true;
                }
                a(fVar5, i, 1, fVar2, arrayList, mVar);
            }
            if (i == 1 && (pVar instanceof n)) {
                Iterator<f> it = ((n) pVar).k.l.iterator();
                while (it.hasNext()) {
                    a(it.next(), i, 2, fVar2, arrayList, mVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:179:0x0008 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:98:0x0148  */
    /* JADX WARN: Code duplicated, block: B:99:0x014a  */
    private boolean b(a.e.a.m.f fVar) {
        int iU;
        a.e.a.m.e.b bVar;
        int iV;
        a.e.a.m.e.b bVar2;
        g gVar;
        int iV2;
        a.e.a.m.e.b bVar3;
        a.e.a.m.e.b bVar4;
        for (a.e.a.m.e eVar : fVar.K0) {
            a.e.a.m.e.b[] bVarArr = eVar.a0;
            a.e.a.m.e.b bVar5 = bVarArr[0];
            a.e.a.m.e.b bVar6 = bVarArr[1];
            if (eVar.T() != 8) {
                if (eVar.C < 1.0f && bVar5 == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                    eVar.x = 2;
                }
                if (eVar.F < 1.0f && bVar6 == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                    eVar.y = 2;
                }
                if (eVar.t() > 0.0f) {
                    a.e.a.m.e.b bVar7 = a.e.a.m.e.b.MATCH_CONSTRAINT;
                    if (bVar5 == bVar7 && (bVar6 == a.e.a.m.e.b.WRAP_CONTENT || bVar6 == a.e.a.m.e.b.FIXED)) {
                        eVar.x = 3;
                    } else if (bVar6 == bVar7 && (bVar5 == a.e.a.m.e.b.WRAP_CONTENT || bVar5 == a.e.a.m.e.b.FIXED)) {
                        eVar.y = 3;
                    } else if (bVar5 == bVar7 && bVar6 == bVar7) {
                        if (eVar.x == 0) {
                            eVar.x = 3;
                        }
                        if (eVar.y == 0) {
                            eVar.y = 3;
                        }
                    }
                }
                a.e.a.m.e.b bVar8 = a.e.a.m.e.b.MATCH_CONSTRAINT;
                if (bVar5 == bVar8 && eVar.x == 1 && (eVar.P.f301f == null || eVar.R.f301f == null)) {
                    bVar5 = a.e.a.m.e.b.WRAP_CONTENT;
                }
                a.e.a.m.e.b bVar9 = bVar5;
                if (bVar6 == bVar8 && eVar.y == 1 && (eVar.Q.f301f == null || eVar.S.f301f == null)) {
                    bVar6 = a.e.a.m.e.b.WRAP_CONTENT;
                }
                a.e.a.m.e.b bVar10 = bVar6;
                l lVar = eVar.f313f;
                lVar.f375d = bVar9;
                int i = eVar.x;
                lVar.f372a = i;
                n nVar = eVar.g;
                nVar.f375d = bVar10;
                int i2 = eVar.y;
                nVar.f372a = i2;
                a.e.a.m.e.b bVar11 = a.e.a.m.e.b.MATCH_PARENT;
                if ((bVar9 == bVar11 || bVar9 == a.e.a.m.e.b.FIXED || bVar9 == a.e.a.m.e.b.WRAP_CONTENT) && (bVar10 == bVar11 || bVar10 == a.e.a.m.e.b.FIXED || bVar10 == a.e.a.m.e.b.WRAP_CONTENT)) {
                    int iU2 = eVar.U();
                    if (bVar9 == bVar11) {
                        iU = (fVar.U() - eVar.P.g) - eVar.R.g;
                        bVar = a.e.a.m.e.b.FIXED;
                    } else {
                        iU = iU2;
                        bVar = bVar9;
                    }
                    int iV3 = eVar.v();
                    if (bVar10 == bVar11) {
                        iV = (fVar.v() - eVar.Q.g) - eVar.S.g;
                        bVar2 = a.e.a.m.e.b.FIXED;
                    } else {
                        iV = iV3;
                        bVar2 = bVar10;
                    }
                    this = this;
                    eVar = eVar;
                    this.l(eVar, bVar, iU, bVar2, iV);
                    eVar.f313f.f376e.d(eVar.U());
                    eVar.g.f376e.d(eVar.v());
                } else if (bVar9 == bVar8 && (bVar10 == (bVar4 = a.e.a.m.e.b.WRAP_CONTENT) || bVar10 == a.e.a.m.e.b.FIXED)) {
                    if (i == 3) {
                        if (bVar10 == bVar4) {
                            l(eVar, bVar4, 0, bVar4, 0);
                        }
                        iV = eVar.v();
                        iU = (int) ((iV * eVar.e0) + 0.5f);
                    } else {
                        if (i == 1) {
                            l(eVar, bVar4, 0, bVar10, 0);
                            gVar = eVar.f313f.f376e;
                            iV2 = eVar.U();
                        } else {
                            if (i == 2) {
                                a.e.a.m.e.b[] bVarArr2 = fVar.a0;
                                a.e.a.m.e.b bVar12 = bVarArr2[0];
                                a.e.a.m.e.b bVar13 = a.e.a.m.e.b.FIXED;
                                if (bVar12 == bVar13 || bVarArr2[0] == bVar11) {
                                    int iU3 = (int) ((eVar.C * fVar.U()) + 0.5f);
                                    iV = eVar.v();
                                    bVar = bVar13;
                                    iU = iU3;
                                } else if (bVar10 != bVar8) {
                                    if (bVar9 != bVar8) {
                                    }
                                } else if (bVar9 != bVar8) {
                                }
                            } else {
                                a.e.a.m.d[] dVarArr = eVar.X;
                                if (dVarArr[0].f301f == null || dVarArr[1].f301f == null) {
                                    iU = 0;
                                    iV = 0;
                                    bVar = bVar4;
                                } else if (bVar10 != bVar8) {
                                    if (bVar9 != bVar8) {
                                    }
                                } else if (bVar9 != bVar8) {
                                }
                            }
                            bVar2 = bVar10;
                            this.l(eVar, bVar, iU, bVar2, iV);
                            eVar.f313f.f376e.d(eVar.U());
                            eVar.g.f376e.d(eVar.v());
                        }
                        gVar.m = iV2;
                    }
                    bVar2 = a.e.a.m.e.b.FIXED;
                    this = this;
                    eVar = eVar;
                    bVar = bVar2;
                    this.l(eVar, bVar, iU, bVar2, iV);
                    eVar.f313f.f376e.d(eVar.U());
                    eVar.g.f376e.d(eVar.v());
                } else if (bVar10 != bVar8 && (bVar9 == (bVar3 = a.e.a.m.e.b.WRAP_CONTENT) || bVar9 == a.e.a.m.e.b.FIXED)) {
                    if (i2 == 3) {
                        if (bVar9 == bVar3) {
                            l(eVar, bVar3, 0, bVar3, 0);
                        }
                        iU = eVar.U();
                        float f2 = eVar.e0;
                        if (eVar.u() == -1) {
                            f2 = 1.0f / f2;
                        }
                        iV = (int) ((iU * f2) + 0.5f);
                        bVar2 = a.e.a.m.e.b.FIXED;
                        this = this;
                        eVar = eVar;
                        bVar = bVar2;
                    } else {
                        if (i2 == 1) {
                            l(eVar, bVar9, 0, bVar3, 0);
                        } else {
                            if (i2 == 2) {
                                a.e.a.m.e.b[] bVarArr3 = fVar.a0;
                                a.e.a.m.e.b bVar14 = bVarArr3[1];
                                a.e.a.m.e.b bVar15 = a.e.a.m.e.b.FIXED;
                                if (bVar14 == bVar15 || bVarArr3[1] == bVar11) {
                                    float f3 = eVar.F;
                                    iU = eVar.U();
                                    this = this;
                                    eVar = eVar;
                                    bVar = bVar9;
                                    bVar2 = bVar15;
                                    iV = (int) ((f3 * fVar.v()) + 0.5f);
                                }
                            } else {
                                a.e.a.m.d[] dVarArr2 = eVar.X;
                                if (dVarArr2[2].f301f == null || dVarArr2[3].f301f == null) {
                                    iU = 0;
                                    iV = 0;
                                    bVar = bVar3;
                                    bVar2 = bVar10;
                                }
                            }
                            if (bVar9 != bVar8) {
                            }
                        }
                        gVar = eVar.g.f376e;
                        iV2 = eVar.v();
                        gVar.m = iV2;
                    }
                    this.l(eVar, bVar, iU, bVar2, iV);
                    eVar.f313f.f376e.d(eVar.U());
                    eVar.g.f376e.d(eVar.v());
                } else if (bVar9 != bVar8 && bVar10 == bVar8) {
                    if (i == 1 || i2 == 1) {
                        a.e.a.m.e.b bVar16 = a.e.a.m.e.b.WRAP_CONTENT;
                        l(eVar, bVar16, 0, bVar16, 0);
                        eVar.f313f.f376e.m = eVar.U();
                        gVar = eVar.g.f376e;
                        iV2 = eVar.v();
                        gVar.m = iV2;
                    } else if (i2 == 2 && i == 2) {
                        a.e.a.m.e.b[] bVarArr4 = fVar.a0;
                        a.e.a.m.e.b bVar17 = bVarArr4[0];
                        bVar2 = a.e.a.m.e.b.FIXED;
                        if (bVar17 == bVar2 && bVarArr4[1] == bVar2) {
                            float f4 = eVar.C;
                            float f5 = eVar.F;
                            iU = (int) ((f4 * fVar.U()) + 0.5f);
                            iV = (int) ((f5 * fVar.v()) + 0.5f);
                            this = this;
                            eVar = eVar;
                            bVar = bVar2;
                            this.l(eVar, bVar, iU, bVar2, iV);
                            eVar.f313f.f376e.d(eVar.U());
                            eVar.g.f376e.d(eVar.v());
                        }
                    }
                }
            }
            eVar.f309b = true;
        }
        return false;
    }

    private int e(a.e.a.m.f fVar, int i) {
        int size = this.i.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, this.i.get(i2).b(fVar, i));
        }
        return (int) jMax;
    }

    private void i(p pVar, int i, ArrayList<m> arrayList) {
        for (d dVar : pVar.h.k) {
            if (dVar instanceof f) {
                a((f) dVar, i, 0, pVar.i, arrayList, null);
            } else if (dVar instanceof p) {
                a(((p) dVar).h, i, 0, pVar.i, arrayList, null);
            }
        }
        for (d dVar2 : pVar.i.k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i, 1, pVar.h, arrayList, null);
            } else if (dVar2 instanceof p) {
                a(((p) dVar2).i, i, 1, pVar.h, arrayList, null);
            }
        }
        if (i == 1) {
            for (d dVar3 : ((n) pVar).k.k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, 2, null, arrayList, null);
                }
            }
        }
    }

    private void l(a.e.a.m.e eVar, a.e.a.m.e.b bVar, int i, a.e.a.m.e.b bVar2, int i2) {
        b.a aVar = this.h;
        aVar.f329d = bVar;
        aVar.f330e = bVar2;
        aVar.f331f = i;
        aVar.g = i2;
        this.g.b(eVar, aVar);
        eVar.h1(this.h.h);
        eVar.I0(this.h.i);
        eVar.H0(this.h.k);
        eVar.x0(this.h.j);
    }

    public void c() {
        d(this.f336e);
        this.i.clear();
        m.f353a = 0;
        i(this.f332a.f313f, 0, this.i);
        i(this.f332a.g, 1, this.i);
        this.f333b = false;
    }

    public void d(ArrayList<p> arrayList) {
        p jVar;
        arrayList.clear();
        this.f335d.f313f.f();
        this.f335d.g.f();
        arrayList.add(this.f335d.f313f);
        arrayList.add(this.f335d.g);
        HashSet hashSet = null;
        for (a.e.a.m.e eVar : this.f335d.K0) {
            if (eVar instanceof a.e.a.m.g) {
                jVar = new j(eVar);
            } else {
                if (eVar.g0()) {
                    if (eVar.f311d == null) {
                        eVar.f311d = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f311d);
                } else {
                    arrayList.add(eVar.f313f);
                }
                if (eVar.i0()) {
                    if (eVar.f312e == null) {
                        eVar.f312e = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f312e);
                } else {
                    arrayList.add(eVar.g);
                }
                if (eVar instanceof a.e.a.m.i) {
                    jVar = new k(eVar);
                }
            }
            arrayList.add(jVar);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        for (p pVar : arrayList) {
            if (pVar.f373b != this.f335d) {
                pVar.d();
            }
        }
    }

    public boolean f(boolean z) {
        boolean z2;
        boolean z3 = true;
        boolean z4 = z & true;
        if (this.f333b || this.f334c) {
            for (a.e.a.m.e eVar : this.f332a.K0) {
                eVar.l();
                eVar.f309b = false;
                eVar.f313f.r();
                eVar.g.q();
            }
            this.f332a.l();
            a.e.a.m.f fVar = this.f332a;
            fVar.f309b = false;
            fVar.f313f.r();
            this.f332a.g.q();
            this.f334c = false;
        }
        if (b(this.f335d)) {
            return false;
        }
        this.f332a.j1(0);
        this.f332a.k1(0);
        a.e.a.m.e.b bVarS = this.f332a.s(0);
        a.e.a.m.e.b bVarS2 = this.f332a.s(1);
        if (this.f333b) {
            c();
        }
        int iV = this.f332a.V();
        int iW = this.f332a.W();
        this.f332a.f313f.h.d(iV);
        this.f332a.g.h.d(iW);
        m();
        a.e.a.m.e.b bVar = a.e.a.m.e.b.WRAP_CONTENT;
        if (bVarS == bVar || bVarS2 == bVar) {
            if (z4) {
                Iterator<p> it = this.f336e.iterator();
                while (it.hasNext()) {
                    if (!it.next().m()) {
                        z4 = false;
                        break;
                    }
                }
            }
            if (z4 && bVarS == a.e.a.m.e.b.WRAP_CONTENT) {
                this.f332a.M0(a.e.a.m.e.b.FIXED);
                a.e.a.m.f fVar2 = this.f332a;
                fVar2.h1(e(fVar2, 0));
                a.e.a.m.f fVar3 = this.f332a;
                fVar3.f313f.f376e.d(fVar3.U());
            }
            if (z4 && bVarS2 == a.e.a.m.e.b.WRAP_CONTENT) {
                this.f332a.d1(a.e.a.m.e.b.FIXED);
                a.e.a.m.f fVar4 = this.f332a;
                fVar4.I0(e(fVar4, 1));
                a.e.a.m.f fVar5 = this.f332a;
                fVar5.g.f376e.d(fVar5.v());
            }
        }
        a.e.a.m.f fVar6 = this.f332a;
        a.e.a.m.e.b[] bVarArr = fVar6.a0;
        a.e.a.m.e.b bVar2 = bVarArr[0];
        a.e.a.m.e.b bVar3 = a.e.a.m.e.b.FIXED;
        if (bVar2 == bVar3 || bVarArr[0] == a.e.a.m.e.b.MATCH_PARENT) {
            int iU = fVar6.U() + iV;
            this.f332a.f313f.i.d(iU);
            this.f332a.f313f.f376e.d(iU - iV);
            m();
            a.e.a.m.f fVar7 = this.f332a;
            a.e.a.m.e.b[] bVarArr2 = fVar7.a0;
            if (bVarArr2[1] == bVar3 || bVarArr2[1] == a.e.a.m.e.b.MATCH_PARENT) {
                int iV2 = fVar7.v() + iW;
                this.f332a.g.i.d(iV2);
                this.f332a.g.f376e.d(iV2 - iW);
            }
            m();
            z2 = true;
        } else {
            z2 = false;
        }
        for (p pVar : this.f336e) {
            if (pVar.f373b != this.f332a || pVar.g) {
                pVar.e();
            }
        }
        for (p pVar2 : this.f336e) {
            if (z2 || pVar2.f373b != this.f332a) {
                if (!pVar2.h.j || ((!pVar2.i.j && !(pVar2 instanceof j)) || (!pVar2.f376e.j && !(pVar2 instanceof c) && !(pVar2 instanceof j)))) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f332a.M0(bVarS);
        this.f332a.d1(bVarS2);
        return z3;
    }

    public boolean g(boolean z) {
        if (this.f333b) {
            for (a.e.a.m.e eVar : this.f332a.K0) {
                eVar.l();
                eVar.f309b = false;
                l lVar = eVar.f313f;
                lVar.f376e.j = false;
                lVar.g = false;
                lVar.r();
                n nVar = eVar.g;
                nVar.f376e.j = false;
                nVar.g = false;
                nVar.q();
            }
            this.f332a.l();
            a.e.a.m.f fVar = this.f332a;
            fVar.f309b = false;
            l lVar2 = fVar.f313f;
            lVar2.f376e.j = false;
            lVar2.g = false;
            lVar2.r();
            n nVar2 = this.f332a.g;
            nVar2.f376e.j = false;
            nVar2.g = false;
            nVar2.q();
            c();
        }
        if (b(this.f335d)) {
            return false;
        }
        this.f332a.j1(0);
        this.f332a.k1(0);
        this.f332a.f313f.h.d(0);
        this.f332a.g.h.d(0);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    public boolean h(boolean z, int i) {
        boolean z2;
        a.e.a.m.e.b bVar;
        g gVar;
        int iV;
        boolean z3 = true;
        boolean z4 = z & true;
        a.e.a.m.e.b bVarS = this.f332a.s(0);
        a.e.a.m.e.b bVarS2 = this.f332a.s(1);
        int iV2 = this.f332a.V();
        int iW = this.f332a.W();
        if (z4 && (bVarS == (bVar = a.e.a.m.e.b.WRAP_CONTENT) || bVarS2 == bVar)) {
            for (p pVar : this.f336e) {
                if (pVar.f377f == i && !pVar.m()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && bVarS == a.e.a.m.e.b.WRAP_CONTENT) {
                    this.f332a.M0(a.e.a.m.e.b.FIXED);
                    a.e.a.m.f fVar = this.f332a;
                    fVar.h1(e(fVar, 0));
                    a.e.a.m.f fVar2 = this.f332a;
                    gVar = fVar2.f313f.f376e;
                    iV = fVar2.U();
                    gVar.d(iV);
                }
            } else if (z4 && bVarS2 == a.e.a.m.e.b.WRAP_CONTENT) {
                this.f332a.d1(a.e.a.m.e.b.FIXED);
                a.e.a.m.f fVar3 = this.f332a;
                fVar3.I0(e(fVar3, 1));
                a.e.a.m.f fVar4 = this.f332a;
                gVar = fVar4.g.f376e;
                iV = fVar4.v();
                gVar.d(iV);
            }
        }
        a.e.a.m.f fVar5 = this.f332a;
        if (i == 0) {
            a.e.a.m.e.b[] bVarArr = fVar5.a0;
            if (bVarArr[0] == a.e.a.m.e.b.FIXED || bVarArr[0] == a.e.a.m.e.b.MATCH_PARENT) {
                int iU = fVar5.U() + iV2;
                this.f332a.f313f.i.d(iU);
                this.f332a.f313f.f376e.d(iU - iV2);
                z2 = true;
            } else {
                z2 = false;
            }
        } else {
            a.e.a.m.e.b[] bVarArr2 = fVar5.a0;
            if (bVarArr2[1] == a.e.a.m.e.b.FIXED || bVarArr2[1] == a.e.a.m.e.b.MATCH_PARENT) {
                int iV3 = fVar5.v() + iW;
                this.f332a.g.i.d(iV3);
                this.f332a.g.f376e.d(iV3 - iW);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        m();
        for (p pVar2 : this.f336e) {
            if (pVar2.f377f == i && (pVar2.f373b != this.f332a || pVar2.g)) {
                pVar2.e();
            }
        }
        for (p pVar3 : this.f336e) {
            if (pVar3.f377f == i && (z2 || pVar3.f373b != this.f332a)) {
                if (!pVar3.h.j || !pVar3.i.j || (!(pVar3 instanceof c) && !pVar3.f376e.j)) {
                    z3 = false;
                    break;
                }
            }
        }
        this.f332a.M0(bVarS);
        this.f332a.d1(bVarS2);
        return z3;
    }

    public void j() {
        this.f333b = true;
    }

    public void k() {
        this.f334c = true;
    }

    public void m() {
        g gVar;
        int iU;
        g gVar2;
        int iU2;
        g gVar3;
        for (a.e.a.m.e eVar : this.f332a.K0) {
            if (!eVar.f309b) {
                a.e.a.m.e.b[] bVarArr = eVar.a0;
                boolean z = false;
                a.e.a.m.e.b bVar = bVarArr[0];
                a.e.a.m.e.b bVar2 = bVarArr[1];
                int i = eVar.x;
                int i2 = eVar.y;
                a.e.a.m.e.b bVar3 = a.e.a.m.e.b.WRAP_CONTENT;
                boolean z2 = bVar == bVar3 || (bVar == a.e.a.m.e.b.MATCH_CONSTRAINT && i == 1);
                if (bVar2 == bVar3 || (bVar2 == a.e.a.m.e.b.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                g gVar4 = eVar.f313f.f376e;
                boolean z3 = gVar4.j;
                g gVar5 = eVar.g.f376e;
                boolean z4 = gVar5.j;
                if (z3 && z4) {
                    a.e.a.m.e.b bVar4 = a.e.a.m.e.b.FIXED;
                    l(eVar, bVar4, gVar4.g, bVar4, gVar5.g);
                } else {
                    if (z3 && z) {
                        l(eVar, a.e.a.m.e.b.FIXED, gVar4.g, bVar3, gVar5.g);
                        if (bVar2 == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.g.f376e;
                            iU2 = eVar.v();
                            gVar2.m = iU2;
                        } else {
                            gVar = eVar.g.f376e;
                            iU = eVar.v();
                            gVar.d(iU);
                        }
                    } else if (z4 && z2) {
                        l(eVar, bVar3, gVar4.g, a.e.a.m.e.b.FIXED, gVar5.g);
                        if (bVar == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                            gVar2 = eVar.f313f.f376e;
                            iU2 = eVar.U();
                            gVar2.m = iU2;
                        } else {
                            gVar = eVar.f313f.f376e;
                            iU = eVar.U();
                            gVar.d(iU);
                        }
                    }
                    if (!eVar.f309b && (gVar3 = eVar.g.l) != null) {
                        gVar3.d(eVar.n());
                    }
                }
                eVar.f309b = true;
                if (!eVar.f309b) {
                }
            }
        }
    }

    public void n(b.InterfaceC0006b interfaceC0006b) {
        this.g = interfaceC0006b;
    }
}
