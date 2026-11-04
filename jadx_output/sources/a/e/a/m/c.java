package a.e.a.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f295f;
    protected e g;
    protected ArrayList<e> h;
    protected int i;
    protected int j;
    protected float k = 0.0f;
    int l;
    int m;
    int n;
    boolean o;
    private int p;
    private boolean q;
    protected boolean r;
    protected boolean s;
    protected boolean t;
    protected boolean u;
    private boolean v;

    public c(e eVar, int i, boolean z) {
        this.q = false;
        this.f290a = eVar;
        this.p = i;
        this.q = z;
    }

    private void b() {
        int i = this.p * 2;
        e eVar = this.f290a;
        this.o = true;
        e eVar2 = eVar;
        boolean z = false;
        while (!z) {
            this.i++;
            e[] eVarArr = eVar.F0;
            int i2 = this.p;
            e eVar3 = null;
            eVarArr[i2] = null;
            eVar.E0[i2] = null;
            if (eVar.T() != 8) {
                this.l++;
                e.b bVarS = eVar.s(this.p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarS != bVar) {
                    this.m += eVar.C(this.p);
                }
                int iE = this.m + eVar.X[i].e();
                this.m = iE;
                int i3 = i + 1;
                this.m = iE + eVar.X[i3].e();
                int iE2 = this.n + eVar.X[i].e();
                this.n = iE2;
                this.n = iE2 + eVar.X[i3].e();
                if (this.f291b == null) {
                    this.f291b = eVar;
                }
                this.f293d = eVar;
                e.b[] bVarArr = eVar.a0;
                int i4 = this.p;
                if (bVarArr[i4] == bVar) {
                    int[] iArr = eVar.z;
                    if (iArr[i4] == 0 || iArr[i4] == 3 || iArr[i4] == 2) {
                        this.j++;
                        float[] fArr = eVar.D0;
                        float f2 = fArr[i4];
                        if (f2 > 0.0f) {
                            this.k += fArr[i4];
                        }
                        if (c(eVar, i4)) {
                            if (f2 < 0.0f) {
                                this.r = true;
                            } else {
                                this.s = true;
                            }
                            if (this.h == null) {
                                this.h = new ArrayList<>();
                            }
                            this.h.add(eVar);
                        }
                        if (this.f295f == null) {
                            this.f295f = eVar;
                        }
                        e eVar4 = this.g;
                        if (eVar4 != null) {
                            eVar4.E0[this.p] = eVar;
                        }
                        this.g = eVar;
                    }
                    if (this.p != 0 ? !(eVar.y == 0 && eVar.D == 0 && eVar.E == 0) : !(eVar.x == 0 && eVar.A == 0 && eVar.B == 0)) {
                        this.o = false;
                    }
                    if (eVar.e0 != 0.0f) {
                        this.o = false;
                        this.u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.p] = eVar;
            }
            d dVar = eVar.X[i + 1].f301f;
            if (dVar != null) {
                e eVar5 = dVar.f299d;
                d[] dVarArr = eVar5.X;
                if (dVarArr[i].f301f != null && dVarArr[i].f301f.f299d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f291b;
        if (eVar6 != null) {
            this.m -= eVar6.X[i].e();
        }
        e eVar7 = this.f293d;
        if (eVar7 != null) {
            this.m -= eVar7.X[i + 1].e();
        }
        this.f292c = eVar;
        if (this.p == 0 && this.q) {
            this.f294e = eVar;
        } else {
            this.f294e = this.f290a;
        }
        this.t = this.s && this.r;
    }

    private static boolean c(e eVar, int i) {
        if (eVar.T() != 8 && eVar.a0[i] == e.b.MATCH_CONSTRAINT) {
            int[] iArr = eVar.z;
            if (iArr[i] == 0 || iArr[i] == 3) {
                return true;
            }
        }
        return false;
    }

    public void a() {
        if (!this.v) {
            b();
        }
        this.v = true;
    }
}
