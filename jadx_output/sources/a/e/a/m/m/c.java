package a.e.a.m.m;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class c extends p {
    ArrayList<p> k;
    private int l;

    public c(a.e.a.m.e eVar, int i) {
        super(eVar);
        this.k = new ArrayList<>();
        this.f377f = i;
        q();
    }

    private void q() {
        a.e.a.m.e eVar;
        a.e.a.m.e eVarJ = this.f373b;
        do {
            eVar = eVarJ;
            eVarJ = eVarJ.J(this.f377f);
        } while (eVarJ != null);
        this.f373b = eVar;
        this.k.add(eVar.L(this.f377f));
        a.e.a.m.e eVarH = eVar.H(this.f377f);
        while (eVarH != null) {
            this.k.add(eVarH.L(this.f377f));
            eVarH = eVarH.H(this.f377f);
        }
        for (p pVar : this.k) {
            int i = this.f377f;
            if (i == 0) {
                pVar.f373b.f311d = this;
            } else if (i == 1) {
                pVar.f373b.f312e = this;
            }
        }
        if ((this.f377f == 0 && ((a.e.a.m.f) this.f373b.I()).L1()) && this.k.size() > 1) {
            ArrayList<p> arrayList = this.k;
            this.f373b = arrayList.get(arrayList.size() - 1).f373b;
        }
        this.l = this.f377f == 0 ? this.f373b.x() : this.f373b.Q();
    }

    private a.e.a.m.e r() {
        for (int i = 0; i < this.k.size(); i++) {
            p pVar = this.k.get(i);
            if (pVar.f373b.T() != 8) {
                return pVar.f373b;
            }
        }
        return null;
    }

    private a.e.a.m.e s() {
        for (int size = this.k.size() - 1; size >= 0; size--) {
            p pVar = this.k.get(size);
            if (pVar.f373b.T() != 8) {
                return pVar.f373b;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:300:0x00f4 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ec A[ADDED_TO_REGION] */
    @Override // a.e.a.m.m.p, a.e.a.m.m.d
    public void a(d dVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        float f3;
        if (this.h.j && this.i.j) {
            a.e.a.m.e eVarI = this.f373b.I();
            boolean zL1 = eVarI instanceof a.e.a.m.f ? ((a.e.a.m.f) eVarI).L1() : false;
            int i14 = this.i.g - this.h.g;
            int size = this.k.size();
            int i15 = 0;
            while (true) {
                i = -1;
                i2 = 8;
                if (i15 >= size) {
                    i15 = -1;
                    break;
                } else if (this.k.get(i15).f373b.T() != 8) {
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = size - 1;
            for (int i17 = i16; i17 >= 0; i17--) {
                if (this.k.get(i17).f373b.T() != 8) {
                    i = i17;
                    break;
                }
            }
            int i18 = 0;
            while (true) {
                if (i18 >= 2) {
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    f2 = 0.0f;
                    break;
                }
                int i19 = 0;
                i4 = 0;
                i5 = 0;
                int i20 = 0;
                f2 = 0.0f;
                while (i19 < size) {
                    p pVar = this.k.get(i19);
                    if (pVar.f373b.T() != i2) {
                        i20++;
                        if (i19 > 0 && i19 >= i15) {
                            i4 += pVar.h.f343f;
                        }
                        g gVar = pVar.f376e;
                        int i21 = gVar.g;
                        boolean z2 = pVar.f375d != a.e.a.m.e.b.MATCH_CONSTRAINT;
                        if (z2) {
                            int i22 = this.f377f;
                            if (i22 == 0 && !pVar.f373b.f313f.f376e.j) {
                                return;
                            }
                            if (i22 == 1 && !pVar.f373b.g.f376e.j) {
                                return;
                            } else {
                                i12 = i21;
                            }
                        } else {
                            i12 = i21;
                            if (pVar.f372a == 1 && i18 == 0) {
                                i13 = gVar.m;
                                i5++;
                            } else {
                                if (gVar.j) {
                                    i13 = i12;
                                }
                                if (z2) {
                                    i4 += i13;
                                } else {
                                    i5++;
                                    f3 = pVar.f373b.D0[this.f377f];
                                    if (f3 >= 0.0f) {
                                        f2 += f3;
                                    }
                                }
                                if (i19 >= i16 && i19 < i) {
                                    i4 += -pVar.i.f343f;
                                }
                            }
                            z2 = true;
                            if (z2) {
                                i5++;
                                f3 = pVar.f373b.D0[this.f377f];
                                if (f3 >= 0.0f) {
                                    f2 += f3;
                                }
                            } else {
                                i4 += i13;
                            }
                            if (i19 >= i16) {
                            }
                        }
                        i13 = i12;
                        if (z2) {
                            i5++;
                            f3 = pVar.f373b.D0[this.f377f];
                            if (f3 >= 0.0f) {
                                f2 += f3;
                            }
                        } else {
                            i4 += i13;
                        }
                        if (i19 >= i16) {
                        }
                    }
                    i19++;
                    i2 = 8;
                }
                if (i4 < i14 || i5 == 0) {
                    i3 = i20;
                    break;
                } else {
                    i18++;
                    i2 = 8;
                }
            }
            int i23 = this.h.g;
            if (zL1) {
                i23 = this.i.g;
            }
            if (i4 > i14) {
                int i24 = (int) (((i4 - i14) / 2.0f) + 0.5f);
                i23 = zL1 ? i23 + i24 : i23 - i24;
            }
            if (i5 > 0) {
                float f4 = i14 - i4;
                int i25 = (int) ((f4 / i5) + 0.5f);
                int i26 = 0;
                int i27 = 0;
                while (i26 < size) {
                    p pVar2 = this.k.get(i26);
                    int i28 = i25;
                    int i29 = i4;
                    if (pVar2.f373b.T() != 8 && pVar2.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                        g gVar2 = pVar2.f376e;
                        if (gVar2.j) {
                            zL1 = zL1;
                            i23 = i23;
                            f4 = f4;
                        } else {
                            int i30 = f2 > 0.0f ? (int) (((pVar2.f373b.D0[this.f377f] * f4) / f2) + 0.5f) : i28;
                            if (this.f377f == 0) {
                                a.e.a.m.e eVar = pVar2.f373b;
                                i11 = eVar.B;
                                i10 = eVar.A;
                            } else {
                                a.e.a.m.e eVar2 = pVar2.f373b;
                                int i31 = eVar2.E;
                                i10 = eVar2.D;
                                i11 = i31;
                            }
                            int iMax = Math.max(i10, pVar2.f372a == 1 ? Math.min(i30, gVar2.m) : i30);
                            if (i11 > 0) {
                                iMax = Math.min(i11, iMax);
                            }
                            if (iMax != i30) {
                                i27++;
                                i30 = iMax;
                            }
                            pVar2.f376e.d(i30);
                        }
                    } else {
                        zL1 = zL1;
                        i23 = i23;
                        f4 = f4;
                    }
                    i26++;
                    i25 = i28;
                    i4 = i29;
                    i23 = i23;
                    f4 = f4;
                    zL1 = zL1;
                    i3 = i3;
                }
                z = zL1;
                i6 = i3;
                i7 = i23;
                int i32 = i4;
                if (i27 > 0) {
                    i5 -= i27;
                    int i33 = 0;
                    for (int i34 = 0; i34 < size; i34++) {
                        p pVar3 = this.k.get(i34);
                        if (pVar3.f373b.T() != 8) {
                            if (i34 > 0 && i34 >= i15) {
                                i33 += pVar3.h.f343f;
                            }
                            i33 += pVar3.f376e.g;
                            if (i34 < i16 && i34 < i) {
                                i33 += -pVar3.i.f343f;
                            }
                        }
                    }
                    i4 = i33;
                } else {
                    i4 = i32;
                }
                i9 = 2;
                if (this.l == 2 && i27 == 0) {
                    i8 = 0;
                    this.l = 0;
                } else {
                    i8 = 0;
                }
            } else {
                z = zL1;
                i6 = i3;
                i7 = i23;
                i8 = 0;
                i9 = 2;
            }
            if (i4 > i14) {
                this.l = i9;
            }
            if (i6 > 0 && i5 == 0 && i15 == i) {
                this.l = i9;
            }
            int i35 = this.l;
            int i36 = i6;
            if (i35 == 1) {
                int i37 = i36 > 1 ? (i14 - i4) / (i36 - 1) : i36 == 1 ? (i14 - i4) / 2 : i8;
                if (i5 > 0) {
                    i37 = i8;
                }
                int i38 = i7;
                for (int i39 = i8; i39 < size; i39++) {
                    p pVar4 = this.k.get(z ? size - (i39 + 1) : i39);
                    if (pVar4.f373b.T() == 8) {
                        pVar4.h.d(i38);
                        pVar4.i.d(i38);
                    } else {
                        if (i39 > 0) {
                            i38 = z ? i38 - i37 : i38 + i37;
                        }
                        if (i39 > 0 && i39 >= i15) {
                            int i40 = pVar4.h.f343f;
                            i38 = z ? i38 - i40 : i38 + i40;
                        }
                        (z ? pVar4.i : pVar4.h).d(i38);
                        g gVar3 = pVar4.f376e;
                        int i41 = gVar3.g;
                        if (pVar4.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT && pVar4.f372a == 1) {
                            i41 = gVar3.m;
                        }
                        i38 = z ? i38 - i41 : i38 + i41;
                        (z ? pVar4.h : pVar4.i).d(i38);
                        pVar4.g = true;
                        if (i39 < i16 && i39 < i) {
                            int i42 = -pVar4.i.f343f;
                            i38 = z ? i38 - i42 : i38 + i42;
                        }
                    }
                }
                return;
            }
            if (i35 == 0) {
                int i43 = (i14 - i4) / (i36 + 1);
                if (i5 > 0) {
                    i43 = i8;
                }
                int i44 = i7;
                for (int i45 = i8; i45 < size; i45++) {
                    p pVar5 = this.k.get(z ? size - (i45 + 1) : i45);
                    if (pVar5.f373b.T() == 8) {
                        pVar5.h.d(i44);
                        pVar5.i.d(i44);
                    } else {
                        int i46 = z ? i44 - i43 : i44 + i43;
                        if (i45 > 0 && i45 >= i15) {
                            int i47 = pVar5.h.f343f;
                            i46 = z ? i46 - i47 : i46 + i47;
                        }
                        (z ? pVar5.i : pVar5.h).d(i46);
                        g gVar4 = pVar5.f376e;
                        int iMin = gVar4.g;
                        if (pVar5.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT && pVar5.f372a == 1) {
                            iMin = Math.min(iMin, gVar4.m);
                        }
                        i44 = z ? i46 - iMin : i46 + iMin;
                        (z ? pVar5.h : pVar5.i).d(i44);
                        if (i45 < i16 && i45 < i) {
                            int i48 = -pVar5.i.f343f;
                            i44 = z ? i44 - i48 : i44 + i48;
                        }
                    }
                }
                return;
            }
            if (i35 == 2) {
                float fW = this.f377f == 0 ? this.f373b.w() : this.f373b.P();
                if (z) {
                    fW = 1.0f - fW;
                }
                int i49 = (int) (((i14 - i4) * fW) + 0.5f);
                if (i49 < 0 || i5 > 0) {
                    i49 = i8;
                }
                int i50 = z ? i7 - i49 : i7 + i49;
                for (int i51 = i8; i51 < size; i51++) {
                    p pVar6 = this.k.get(z ? size - (i51 + 1) : i51);
                    if (pVar6.f373b.T() == 8) {
                        pVar6.h.d(i50);
                        pVar6.i.d(i50);
                    } else {
                        if (i51 > 0 && i51 >= i15) {
                            int i52 = pVar6.h.f343f;
                            i50 = z ? i50 - i52 : i50 + i52;
                        }
                        (z ? pVar6.i : pVar6.h).d(i50);
                        g gVar5 = pVar6.f376e;
                        int i53 = gVar5.g;
                        if (pVar6.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT && pVar6.f372a == 1) {
                            i53 = gVar5.m;
                        }
                        i50 = z ? i50 - i53 : i50 + i53;
                        (z ? pVar6.h : pVar6.i).d(i50);
                        if (i51 < i16 && i51 < i) {
                            int i54 = -pVar6.i.f343f;
                            i50 = z ? i50 - i54 : i50 + i54;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00a5 A[PHI: r0 r1
      0x00a5: PHI (r0v13 int) = (r0v10 int), (r0v19 int) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r1v3 a.e.a.m.m.f) = (r1v2 a.e.a.m.m.f), (r1v7 a.e.a.m.m.f) binds: [B:29:0x00a3, B:19:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.e.a.m.m.p
    void d() {
        f fVarI;
        int iE;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.k.size();
        if (size < 1) {
            return;
        }
        a.e.a.m.e eVar = this.k.get(0).f373b;
        a.e.a.m.e eVar2 = this.k.get(size - 1).f373b;
        if (this.f377f == 0) {
            a.e.a.m.d dVar = eVar.P;
            a.e.a.m.d dVar2 = eVar2.R;
            f fVarI2 = i(dVar, 0);
            int iE2 = dVar.e();
            a.e.a.m.e eVarR = r();
            if (eVarR != null) {
                iE2 = eVarR.P.e();
            }
            if (fVarI2 != null) {
                b(this.h, fVarI2, iE2);
            }
            fVarI = i(dVar2, 0);
            iE = dVar2.e();
            a.e.a.m.e eVarS = s();
            if (eVarS != null) {
                iE = eVarS.R.e();
            }
            if (fVarI != null) {
                b(this.i, fVarI, -iE);
            }
        } else {
            a.e.a.m.d dVar3 = eVar.Q;
            a.e.a.m.d dVar4 = eVar2.S;
            f fVarI3 = i(dVar3, 1);
            int iE3 = dVar3.e();
            a.e.a.m.e eVarR2 = r();
            if (eVarR2 != null) {
                iE3 = eVarR2.Q.e();
            }
            if (fVarI3 != null) {
                b(this.h, fVarI3, iE3);
            }
            fVarI = i(dVar4, 1);
            iE = dVar4.e();
            a.e.a.m.e eVarS2 = s();
            if (eVarS2 != null) {
                iE = eVarS2.S.e();
            }
            if (fVarI != null) {
                b(this.i, fVarI, -iE);
            }
        }
        this.h.f338a = this;
        this.i.f338a = this;
    }

    @Override // a.e.a.m.m.p
    public void e() {
        for (int i = 0; i < this.k.size(); i++) {
            this.k.get(i).e();
        }
    }

    @Override // a.e.a.m.m.p
    void f() {
        this.f374c = null;
        Iterator<p> it = this.k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // a.e.a.m.m.p
    public long j() {
        int size = this.k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            p pVar = this.k.get(i);
            j = j + ((long) pVar.h.f343f) + pVar.j() + ((long) pVar.i.f343f);
        }
        return j;
    }

    @Override // a.e.a.m.m.p
    boolean m() {
        int size = this.k.size();
        for (int i = 0; i < size; i++) {
            if (!this.k.get(i).m()) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f377f == 0 ? "horizontal : " : "vertical : ");
        for (p pVar : this.k) {
            sb.append("<");
            sb.append(pVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
