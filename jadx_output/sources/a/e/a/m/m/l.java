package a.e.a.m.m;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class l extends p {
    private static int[] k = new int[2];

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f352a;

        static {
            int[] iArr = new int[p.b.values().length];
            f352a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f352a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f352a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(a.e.a.m.e eVar) {
        super(eVar);
        this.h.f342e = f.a.LEFT;
        this.i.f342e = f.a.RIGHT;
        this.f377f = 0;
    }

    private void q(int[] iArr, int i, int i2, int i3, int i4, float f2, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f2) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f2) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f2) + 0.5f);
        int i9 = (int) ((i6 / f2) + 0.5f);
        if (i8 <= i6 && i7 <= i7) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else {
            if (i6 > i6 || i9 > i7) {
                return;
            }
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0296, code lost:
    
        if (r14 != 1) goto L134;
     */
    @Override // a.e.a.m.m.p, a.e.a.m.m.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(a.e.a.m.m.d r17) {
        /*
            Method dump skipped, instruction units count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.m.m.l.a(a.e.a.m.m.d):void");
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0341  */
    /* JADX WARN: Code duplicated, block: B:111:0x0349  */
    /* JADX WARN: Code duplicated, block: B:112:0x0356  */
    /* JADX WARN: Code duplicated, block: B:114:0x035c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0364  */
    /* JADX WARN: Code duplicated, block: B:117:0x037f  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:81:0x0240  */
    /* JADX WARN: Code duplicated, block: B:83:0x0248  */
    /* JADX WARN: Code duplicated, block: B:84:0x0261  */
    /* JADX WARN: Code duplicated, block: B:85:0x0268  */
    /* JADX WARN: Code duplicated, block: B:88:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:91:0x02bd  */
    @Override // a.e.a.m.m.p
    void d() {
        a.e.a.m.e eVarI;
        a.e.a.m.e eVar;
        a.e.a.m.d[] dVarArr;
        f fVarH;
        f fVar;
        int iV;
        f fVarH2;
        f fVar2;
        a.e.a.m.d dVar;
        a.e.a.m.e eVar2;
        int i;
        a.e.a.m.e eVarI2;
        List<d> list;
        d dVar2;
        f fVar3;
        f fVarH3;
        f fVar4;
        int iV2;
        f fVar5;
        f fVar6;
        int i2;
        a.e.a.m.e eVarI3;
        a.e.a.m.e eVar3 = this.f373b;
        if (eVar3.f309b) {
            this.f376e.d(eVar3.U());
        }
        if (this.f376e.j) {
            a.e.a.m.e.b bVar = this.f375d;
            a.e.a.m.e.b bVar2 = a.e.a.m.e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarI = this.f373b.I()) != null && (eVarI.y() == a.e.a.m.e.b.FIXED || eVarI.y() == bVar2)) {
                b(this.h, eVarI.f313f.h, this.f373b.P.e());
                b(this.i, eVarI.f313f.i, -this.f373b.R.e());
                return;
            }
        } else {
            a.e.a.m.e.b bVarY = this.f373b.y();
            this.f375d = bVarY;
            if (bVarY != a.e.a.m.e.b.MATCH_CONSTRAINT) {
                a.e.a.m.e.b bVar3 = a.e.a.m.e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (eVarI3 = this.f373b.I()) != null && (eVarI3.y() == a.e.a.m.e.b.FIXED || eVarI3.y() == bVar3)) {
                    int iU = (eVarI3.U() - this.f373b.P.e()) - this.f373b.R.e();
                    b(this.h, eVarI3.f313f.h, this.f373b.P.e());
                    b(this.i, eVarI3.f313f.i, -this.f373b.R.e());
                    this.f376e.d(iU);
                    return;
                }
                if (this.f375d == a.e.a.m.e.b.FIXED) {
                    this.f376e.d(this.f373b.U());
                }
            }
        }
        g gVar = this.f376e;
        if (!gVar.j) {
            if (this.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f373b;
                i = eVar2.x;
                if (i != 2) {
                    eVarI2 = eVar2.I();
                    if (eVarI2 != null) {
                        g gVar2 = eVarI2.g.f376e;
                        this.f376e.l.add(gVar2);
                        gVar2.k.add(this.f376e);
                        g gVar3 = this.f376e;
                        gVar3.f339b = true;
                        gVar3.k.add(this.h);
                        list = this.f376e.k;
                        dVar2 = this.i;
                        list.add(dVar2);
                    }
                } else if (i == 3) {
                    if (eVar2.y == 3) {
                        this.h.f338a = this;
                        this.i.f338a = this;
                        n nVar = eVar2.g;
                        nVar.h.f338a = this;
                        nVar.i.f338a = this;
                        gVar.f338a = this;
                        if (eVar2.i0()) {
                            this.f376e.l.add(this.f373b.g.f376e);
                            this.f373b.g.f376e.k.add(this.f376e);
                            n nVar2 = this.f373b.g;
                            nVar2.f376e.f338a = this;
                            this.f376e.l.add(nVar2.h);
                            this.f376e.l.add(this.f373b.g.i);
                            this.f373b.g.h.k.add(this.f376e);
                            list = this.f373b.g.i.k;
                            dVar2 = this.f376e;
                        } else if (this.f373b.g0()) {
                            this.f373b.g.f376e.l.add(this.f376e);
                            list = this.f376e.k;
                            dVar2 = this.f373b.g.f376e;
                        } else {
                            fVar3 = this.f373b.g.f376e;
                        }
                        list.add(dVar2);
                    } else {
                        g gVar4 = eVar2.g.f376e;
                        gVar.l.add(gVar4);
                        gVar4.k.add(this.f376e);
                        this.f373b.g.h.k.add(this.f376e);
                        this.f373b.g.i.k.add(this.f376e);
                        g gVar5 = this.f376e;
                        gVar5.f339b = true;
                        gVar5.k.add(this.h);
                        this.f376e.k.add(this.i);
                        this.h.l.add(this.f376e);
                        fVar3 = this.i;
                    }
                    list = fVar3.l;
                    dVar2 = this.f376e;
                    list.add(dVar2);
                }
            }
            eVar = this.f373b;
            dVarArr = eVar.X;
            if (dVarArr[0].f301f != null) {
            }
            if (dVarArr[0].f301f == null) {
                if (dVarArr[1].f301f == null) {
                    if (eVar instanceof a.e.a.m.h) {
                        return;
                    } else {
                        return;
                    }
                }
                fVarH2 = h(dVarArr[1]);
                if (fVarH2 != null) {
                    b(this.i, fVarH2, -this.f373b.X[1].e());
                    c(this.h, this.i, -1, this.f376e);
                    return;
                }
                return;
            }
            fVarH = h(dVarArr[0]);
            if (fVarH != null) {
                return;
            }
            fVar = this.h;
            iV = this.f373b.X[0].e();
            b(fVar, fVarH, iV);
            c(this.i, this.h, 1, this.f376e);
            return;
        }
        a.e.a.m.e eVar4 = this.f373b;
        if (eVar4.f309b) {
            a.e.a.m.d[] dVarArr2 = eVar4.X;
            if (dVarArr2[0].f301f == null || dVarArr2[1].f301f == null) {
                if (dVarArr2[0].f301f == null) {
                    if (dVarArr2[1].f301f != null) {
                        f fVarH4 = h(dVarArr2[1]);
                        if (fVarH4 == null) {
                            return;
                        }
                        b(this.i, fVarH4, -this.f373b.X[1].e());
                        fVar5 = this.h;
                        fVar6 = this.i;
                        i2 = -this.f376e.g;
                    } else {
                        if ((eVar4 instanceof a.e.a.m.h) || eVar4.I() == null || this.f373b.m(a.e.a.m.d.b.CENTER).f301f != null) {
                            return;
                        }
                        fVarH3 = this.f373b.I().f313f.h;
                        fVar4 = this.h;
                        iV2 = this.f373b.V();
                    }
                    b(fVar5, fVar6, i2);
                    return;
                }
                fVarH3 = h(dVarArr2[0]);
                if (fVarH3 == null) {
                    return;
                }
                fVar4 = this.h;
                iV2 = this.f373b.X[0].e();
                b(fVar4, fVarH3, iV2);
                fVar5 = this.i;
                fVar6 = this.h;
                i2 = this.f376e.g;
                b(fVar5, fVar6, i2);
                return;
            }
            if (!eVar4.g0()) {
                f fVarH5 = h(this.f373b.X[0]);
                if (fVarH5 != null) {
                    b(this.h, fVarH5, this.f373b.X[0].e());
                }
                f fVarH6 = h(this.f373b.X[1]);
                if (fVarH6 != null) {
                    b(this.i, fVarH6, -this.f373b.X[1].e());
                }
                this.h.f339b = true;
                this.i.f339b = true;
                return;
            }
            this.h.f343f = this.f373b.X[0].e();
            fVar2 = this.i;
            dVar = this.f373b.X[1];
        } else {
            if (this.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                eVar2 = this.f373b;
                i = eVar2.x;
                if (i != 2) {
                    eVarI2 = eVar2.I();
                    if (eVarI2 != null) {
                        g gVar6 = eVarI2.g.f376e;
                        this.f376e.l.add(gVar6);
                        gVar6.k.add(this.f376e);
                        g gVar7 = this.f376e;
                        gVar7.f339b = true;
                        gVar7.k.add(this.h);
                        list = this.f376e.k;
                        dVar2 = this.i;
                        list.add(dVar2);
                    }
                } else if (i == 3) {
                    if (eVar2.y == 3) {
                        this.h.f338a = this;
                        this.i.f338a = this;
                        n nVar3 = eVar2.g;
                        nVar3.h.f338a = this;
                        nVar3.i.f338a = this;
                        gVar.f338a = this;
                        if (eVar2.i0()) {
                            this.f376e.l.add(this.f373b.g.f376e);
                            this.f373b.g.f376e.k.add(this.f376e);
                            n nVar4 = this.f373b.g;
                            nVar4.f376e.f338a = this;
                            this.f376e.l.add(nVar4.h);
                            this.f376e.l.add(this.f373b.g.i);
                            this.f373b.g.h.k.add(this.f376e);
                            list = this.f373b.g.i.k;
                            dVar2 = this.f376e;
                        } else if (this.f373b.g0()) {
                            this.f373b.g.f376e.l.add(this.f376e);
                            list = this.f376e.k;
                            dVar2 = this.f373b.g.f376e;
                        } else {
                            fVar3 = this.f373b.g.f376e;
                        }
                        list.add(dVar2);
                    } else {
                        g gVar8 = eVar2.g.f376e;
                        gVar.l.add(gVar8);
                        gVar8.k.add(this.f376e);
                        this.f373b.g.h.k.add(this.f376e);
                        this.f373b.g.i.k.add(this.f376e);
                        g gVar9 = this.f376e;
                        gVar9.f339b = true;
                        gVar9.k.add(this.h);
                        this.f376e.k.add(this.i);
                        this.h.l.add(this.f376e);
                        fVar3 = this.i;
                    }
                    list = fVar3.l;
                    dVar2 = this.f376e;
                    list.add(dVar2);
                }
            }
            eVar = this.f373b;
            dVarArr = eVar.X;
            if (dVarArr[0].f301f != null || dVarArr[1].f301f == null) {
                if (dVarArr[0].f301f == null) {
                    fVarH = h(dVarArr[0]);
                    if (fVarH != null) {
                        return;
                    }
                    fVar = this.h;
                    iV = this.f373b.X[0].e();
                } else {
                    if (dVarArr[1].f301f == null) {
                        fVarH2 = h(dVarArr[1]);
                        if (fVarH2 != null) {
                            b(this.i, fVarH2, -this.f373b.X[1].e());
                            c(this.h, this.i, -1, this.f376e);
                            return;
                        }
                        return;
                    }
                    if ((eVar instanceof a.e.a.m.h) || eVar.I() == null) {
                        return;
                    }
                    fVarH = this.f373b.I().f313f.h;
                    fVar = this.h;
                    iV = this.f373b.V();
                }
                b(fVar, fVarH, iV);
                c(this.i, this.h, 1, this.f376e);
                return;
            }
            if (!eVar.g0()) {
                f fVarH7 = h(this.f373b.X[0]);
                f fVarH8 = h(this.f373b.X[1]);
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                if (fVarH8 != null) {
                    fVarH8.b(this);
                }
                this.j = p.b.CENTER;
                return;
            }
            this.h.f343f = this.f373b.X[0].e();
            fVar2 = this.i;
            dVar = this.f373b.X[1];
        }
        fVar2.f343f = -dVar.e();
    }

    @Override // a.e.a.m.m.p
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f373b.j1(fVar.g);
        }
    }

    @Override // a.e.a.m.m.p
    void f() {
        this.f374c = null;
        this.h.c();
        this.i.c();
        this.f376e.c();
        this.g = false;
    }

    @Override // a.e.a.m.m.p
    boolean m() {
        return this.f375d != a.e.a.m.e.b.MATCH_CONSTRAINT || this.f373b.x == 0;
    }

    void r() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.f376e.j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f373b.r();
    }
}
