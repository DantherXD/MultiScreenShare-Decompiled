package a.e.a.m;

/* JADX INFO: loaded from: classes.dex */
public class g extends e {
    protected float K0 = -1.0f;
    protected int L0 = -1;
    protected int M0 = -1;
    protected boolean N0 = true;
    private d O0 = this.Q;
    private int P0 = 0;
    private int Q0 = 0;
    private boolean R0;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f321a;

        static {
            int[] iArr = new int[d.b.values().length];
            f321a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f321a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f321a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f321a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f321a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f321a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f321a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f321a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f321a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public g() {
        this.Y.clear();
        this.Y.add(this.O0);
        int length = this.X.length;
        for (int i = 0; i < length; i++) {
            this.X[i] = this.O0;
        }
    }

    @Override // a.e.a.m.e
    public void g(a.e.a.d dVar, boolean z) {
        f fVar = (f) I();
        if (fVar == null) {
            return;
        }
        d dVarM = fVar.m(d.b.LEFT);
        d dVarM2 = fVar.m(d.b.RIGHT);
        e eVar = this.b0;
        boolean z2 = eVar != null && eVar.a0[0] == e.b.WRAP_CONTENT;
        if (this.P0 == 0) {
            dVarM = fVar.m(d.b.TOP);
            dVarM2 = fVar.m(d.b.BOTTOM);
            e eVar2 = this.b0;
            z2 = eVar2 != null && eVar2.a0[1] == e.b.WRAP_CONTENT;
        }
        if (this.R0 && this.O0.m()) {
            a.e.a.i iVarQ = dVar.q(this.O0);
            dVar.f(iVarQ, this.O0.d());
            if (this.L0 != -1) {
                if (z2) {
                    dVar.h(dVar.q(dVarM2), iVarQ, 0, 5);
                }
            } else if (this.M0 != -1 && z2) {
                a.e.a.i iVarQ2 = dVar.q(dVarM2);
                dVar.h(iVarQ, dVar.q(dVarM), 0, 5);
                dVar.h(iVarQ2, iVarQ, 0, 5);
            }
            this.R0 = false;
            return;
        }
        if (this.L0 != -1) {
            a.e.a.i iVarQ3 = dVar.q(this.O0);
            dVar.e(iVarQ3, dVar.q(dVarM), this.L0, 8);
            if (z2) {
                dVar.h(dVar.q(dVarM2), iVarQ3, 0, 5);
                return;
            }
            return;
        }
        if (this.M0 == -1) {
            if (this.K0 != -1.0f) {
                dVar.d(a.e.a.d.s(dVar, dVar.q(this.O0), dVar.q(dVarM2), this.K0));
                return;
            }
            return;
        }
        a.e.a.i iVarQ4 = dVar.q(this.O0);
        a.e.a.i iVarQ5 = dVar.q(dVarM2);
        dVar.e(iVarQ4, iVarQ5, -this.M0, 8);
        if (z2) {
            dVar.h(iVarQ4, dVar.q(dVarM), 0, 5);
            dVar.h(iVarQ5, iVarQ4, 0, 5);
        }
    }

    @Override // a.e.a.m.e
    public boolean h() {
        return true;
    }

    @Override // a.e.a.m.e
    public boolean l0() {
        return this.R0;
    }

    @Override // a.e.a.m.e
    public d m(d.b bVar) {
        int i = a.f321a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.P0 == 1) {
                return this.O0;
            }
            return null;
        }
        if ((i == 3 || i == 4) && this.P0 == 0) {
            return this.O0;
        }
        return null;
    }

    @Override // a.e.a.m.e
    public boolean m0() {
        return this.R0;
    }

    @Override // a.e.a.m.e
    public void n1(a.e.a.d dVar, boolean z) {
        if (I() == null) {
            return;
        }
        int iX = dVar.x(this.O0);
        if (this.P0 == 1) {
            j1(iX);
            k1(0);
            I0(I().v());
            h1(0);
            return;
        }
        j1(0);
        k1(iX);
        h1(I().U());
        I0(0);
    }

    public d o1() {
        return this.O0;
    }

    public int p1() {
        return this.P0;
    }

    public int q1() {
        return this.L0;
    }

    public int r1() {
        return this.M0;
    }

    public float s1() {
        return this.K0;
    }

    public void t1(int i) {
        this.O0.s(i);
        this.R0 = true;
    }

    public void u1(int i) {
        if (i > -1) {
            this.K0 = -1.0f;
            this.L0 = i;
            this.M0 = -1;
        }
    }

    public void v1(int i) {
        if (i > -1) {
            this.K0 = -1.0f;
            this.L0 = -1;
            this.M0 = i;
        }
    }

    public void w1(float f2) {
        if (f2 > -1.0f) {
            this.K0 = f2;
            this.L0 = -1;
            this.M0 = -1;
        }
    }

    public void x1(int i) {
        if (this.P0 == i) {
            return;
        }
        this.P0 = i;
        this.Y.clear();
        this.O0 = this.P0 == 1 ? this.P : this.Q;
        this.Y.add(this.O0);
        int length = this.X.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.X[i2] = this.O0;
        }
    }
}
