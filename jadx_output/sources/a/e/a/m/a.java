package a.e.a.m;

/* JADX INFO: loaded from: classes.dex */
public class a extends i {
    private int M0 = 0;
    private boolean N0 = true;
    private int O0 = 0;
    boolean P0 = false;

    @Override // a.e.a.m.e
    public void g(a.e.a.d dVar, boolean z) {
        d[] dVarArr;
        boolean z2;
        a.e.a.i iVar;
        d dVar2;
        int i;
        int i2;
        int i3;
        a.e.a.i iVar2;
        int i4;
        d[] dVarArr2 = this.X;
        dVarArr2[0] = this.P;
        dVarArr2[2] = this.Q;
        dVarArr2[1] = this.R;
        dVarArr2[3] = this.S;
        int i5 = 0;
        while (true) {
            dVarArr = this.X;
            if (i5 >= dVarArr.length) {
                break;
            }
            dVarArr[i5].i = dVar.q(dVarArr[i5]);
            i5++;
        }
        int i6 = this.M0;
        if (i6 < 0 || i6 >= 4) {
            return;
        }
        d dVar3 = dVarArr[i6];
        if (!this.P0) {
            q1();
        }
        if (this.P0) {
            this.P0 = false;
            int i7 = this.M0;
            if (i7 == 0 || i7 == 1) {
                dVar.f(this.P.i, this.g0);
                iVar2 = this.R.i;
                i4 = this.g0;
            } else {
                if (i7 != 2 && i7 != 3) {
                    return;
                }
                dVar.f(this.Q.i, this.h0);
                iVar2 = this.S.i;
                i4 = this.h0;
            }
            dVar.f(iVar2, i4);
            return;
        }
        int i8 = 0;
        while (true) {
            if (i8 >= this.L0) {
                z2 = false;
                break;
            }
            e eVar = this.K0[i8];
            if ((this.N0 || eVar.h()) && ((((i2 = this.M0) == 0 || i2 == 1) && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.P.f301f != null && eVar.R.f301f != null) || (((i3 = this.M0) == 2 || i3 == 3) && eVar.R() == e.b.MATCH_CONSTRAINT && eVar.Q.f301f != null && eVar.S.f301f != null))) {
                z2 = true;
                break;
            }
            i8++;
        }
        boolean z3 = this.P.k() || this.R.k();
        boolean z4 = this.Q.k() || this.S.k();
        int i9 = !z2 && (((i = this.M0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4)))) ? 5 : 4;
        for (int i10 = 0; i10 < this.L0; i10++) {
            e eVar2 = this.K0[i10];
            if (this.N0 || eVar2.h()) {
                a.e.a.i iVarQ = dVar.q(eVar2.X[this.M0]);
                d[] dVarArr3 = eVar2.X;
                int i11 = this.M0;
                dVarArr3[i11].i = iVarQ;
                int i12 = (dVarArr3[i11].f301f == null || dVarArr3[i11].f301f.f299d != this) ? 0 : dVarArr3[i11].g + 0;
                if (i11 == 0 || i11 == 2) {
                    dVar.i(dVar3.i, iVarQ, this.O0 - i12, z2);
                } else {
                    dVar.g(dVar3.i, iVarQ, this.O0 + i12, z2);
                }
                dVar.e(dVar3.i, iVarQ, this.O0 + i12, i9);
            }
        }
        int i13 = this.M0;
        if (i13 == 0) {
            dVar.e(this.R.i, this.P.i, 0, 8);
            dVar.e(this.P.i, this.b0.R.i, 0, 4);
            iVar = this.P.i;
            dVar2 = this.b0.P;
        } else if (i13 == 1) {
            dVar.e(this.P.i, this.R.i, 0, 8);
            dVar.e(this.P.i, this.b0.P.i, 0, 4);
            iVar = this.P.i;
            dVar2 = this.b0.R;
        } else if (i13 == 2) {
            dVar.e(this.S.i, this.Q.i, 0, 8);
            dVar.e(this.Q.i, this.b0.S.i, 0, 4);
            iVar = this.Q.i;
            dVar2 = this.b0.Q;
        } else {
            if (i13 != 3) {
                return;
            }
            dVar.e(this.Q.i, this.S.i, 0, 8);
            dVar.e(this.Q.i, this.b0.Q.i, 0, 4);
            iVar = this.Q.i;
            dVar2 = this.b0.S;
        }
        dVar.e(iVar, dVar2.i, 0, 0);
    }

    @Override // a.e.a.m.e
    public boolean h() {
        return true;
    }

    @Override // a.e.a.m.e
    public boolean l0() {
        return this.P0;
    }

    @Override // a.e.a.m.e
    public boolean m0() {
        return this.P0;
    }

    public boolean q1() {
        int i;
        d.b bVar;
        d.b bVar2;
        d.b bVar3;
        int i2;
        int i3;
        int i4 = 0;
        boolean z = true;
        while (true) {
            i = this.L0;
            if (i4 >= i) {
                break;
            }
            e eVar = this.K0[i4];
            if ((this.N0 || eVar.h()) && ((((i2 = this.M0) == 0 || i2 == 1) && !eVar.l0()) || (((i3 = this.M0) == 2 || i3 == 3) && !eVar.m0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.L0; i5++) {
            e eVar2 = this.K0[i5];
            if (this.N0 || eVar2.h()) {
                if (!z2) {
                    int i6 = this.M0;
                    if (i6 == 0) {
                        bVar3 = d.b.LEFT;
                    } else if (i6 == 1) {
                        bVar3 = d.b.RIGHT;
                    } else if (i6 == 2) {
                        bVar3 = d.b.TOP;
                    } else {
                        if (i6 == 3) {
                            bVar3 = d.b.BOTTOM;
                        }
                        z2 = true;
                    }
                    iMax = eVar2.m(bVar3).d();
                    z2 = true;
                }
                int i7 = this.M0;
                if (i7 == 0) {
                    bVar2 = d.b.LEFT;
                } else {
                    if (i7 == 1) {
                        bVar = d.b.RIGHT;
                    } else if (i7 == 2) {
                        bVar2 = d.b.TOP;
                    } else if (i7 == 3) {
                        bVar = d.b.BOTTOM;
                    }
                    iMax = Math.max(iMax, eVar2.m(bVar).d());
                }
                iMax = Math.min(iMax, eVar2.m(bVar2).d());
            }
        }
        int i8 = iMax + this.O0;
        int i9 = this.M0;
        if (i9 == 0 || i9 == 1) {
            C0(i8, i8);
        } else {
            F0(i8, i8);
        }
        this.P0 = true;
        return true;
    }

    public boolean r1() {
        return this.N0;
    }

    public int s1() {
        return this.M0;
    }

    public int t1() {
        return this.O0;
    }

    @Override // a.e.a.m.e
    public String toString() {
        String str = "[Barrier] " + r() + " {";
        for (int i = 0; i < this.L0; i++) {
            e eVar = this.K0[i];
            if (i > 0) {
                str = str + ", ";
            }
            str = str + eVar.r();
        }
        return str + "}";
    }

    public int u1() {
        int i = this.M0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    protected void v1() {
        for (int i = 0; i < this.L0; i++) {
            e eVar = this.K0[i];
            if (this.N0 || eVar.h()) {
                int i2 = this.M0;
                if (i2 == 0 || i2 == 1) {
                    eVar.P0(0, true);
                } else if (i2 == 2 || i2 == 3) {
                    eVar.P0(1, true);
                }
            }
        }
    }

    public void w1(boolean z) {
        this.N0 = z;
    }

    public void x1(int i) {
        this.M0 = i;
    }

    public void y1(int i) {
        this.O0 = i;
    }
}
