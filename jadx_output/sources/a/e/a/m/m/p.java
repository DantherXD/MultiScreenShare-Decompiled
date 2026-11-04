package a.e.a.m.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class p implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a.e.a.m.e f373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    m f374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected a.e.a.m.e.b f375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    g f376e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f377f = 0;
    boolean g = false;
    public f h = new f(this);
    public f i = new f(this);
    protected b j = b.NONE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f378a;

        static {
            int[] iArr = new int[a.e.a.m.d.b.values().length];
            f378a = iArr;
            try {
                iArr[a.e.a.m.d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f378a[a.e.a.m.d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f378a[a.e.a.m.d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f378a[a.e.a.m.d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f378a[a.e.a.m.d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(a.e.a.m.e eVar) {
        this.f373b = eVar;
    }

    private void l(int i, int i2) {
        g gVar;
        int iMin;
        int i3 = this.f372a;
        if (i3 != 0) {
            if (i3 == 1) {
                int iG = g(this.f376e.m, i);
                gVar = this.f376e;
                iMin = Math.min(iG, i2);
            } else if (i3 == 2) {
                a.e.a.m.e eVarI = this.f373b.I();
                if (eVarI == null) {
                    return;
                }
                g gVar2 = (i == 0 ? eVarI.f313f : eVarI.g).f376e;
                if (!gVar2.j) {
                    return;
                }
                a.e.a.m.e eVar = this.f373b;
                i2 = (int) ((gVar2.g * (i == 0 ? eVar.C : eVar.F)) + 0.5f);
            } else {
                if (i3 != 3) {
                    return;
                }
                a.e.a.m.e eVar2 = this.f373b;
                p pVar = eVar2.f313f;
                a.e.a.m.e.b bVar = pVar.f375d;
                a.e.a.m.e.b bVar2 = a.e.a.m.e.b.MATCH_CONSTRAINT;
                if (bVar == bVar2 && pVar.f372a == 3) {
                    n nVar = eVar2.g;
                    if (nVar.f375d == bVar2 && nVar.f372a == 3) {
                        return;
                    }
                }
                if (i == 0) {
                    pVar = eVar2.g;
                }
                if (!pVar.f376e.j) {
                    return;
                }
                float fT = eVar2.t();
                iMin = i == 1 ? (int) ((pVar.f376e.g / fT) + 0.5f) : (int) ((fT * pVar.f376e.g) + 0.5f);
                gVar = this.f376e;
            }
            gVar.d(iMin);
            return;
        }
        this.f376e.d(g(i2, i));
    }

    @Override // a.e.a.m.m.d
    public void a(d dVar) {
    }

    protected final void b(f fVar, f fVar2, int i) {
        fVar.l.add(fVar2);
        fVar.f343f = i;
        fVar2.k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.l.add(fVar2);
        fVar.l.add(this.f376e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.k.add(fVar);
        gVar.k.add(fVar);
    }

    abstract void d();

    abstract void e();

    abstract void f();

    protected final int g(int i, int i2) {
        int iMax;
        a.e.a.m.e eVar = this.f373b;
        if (i2 == 0) {
            int i3 = eVar.B;
            iMax = Math.max(eVar.A, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            int i4 = eVar.E;
            iMax = Math.max(eVar.D, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    protected final f h(a.e.a.m.d dVar) {
        p pVar;
        p pVar2;
        a.e.a.m.d dVar2 = dVar.f301f;
        if (dVar2 == null) {
            return null;
        }
        a.e.a.m.e eVar = dVar2.f299d;
        int i = a.f378a[dVar2.f300e.ordinal()];
        if (i != 1) {
            if (i == 2) {
                pVar2 = eVar.f313f;
            } else if (i == 3) {
                pVar = eVar.g;
            } else {
                if (i == 4) {
                    return eVar.g.k;
                }
                if (i != 5) {
                    return null;
                }
                pVar2 = eVar.g;
            }
            return pVar2.i;
        }
        pVar = eVar.f313f;
        return pVar.h;
    }

    protected final f i(a.e.a.m.d dVar, int i) {
        a.e.a.m.d dVar2 = dVar.f301f;
        if (dVar2 == null) {
            return null;
        }
        a.e.a.m.e eVar = dVar2.f299d;
        p pVar = i == 0 ? eVar.f313f : eVar.g;
        int i2 = a.f378a[dVar2.f300e.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.h;
    }

    public long j() {
        g gVar = this.f376e;
        if (gVar.j) {
            return gVar.g;
        }
        return 0L;
    }

    public boolean k() {
        return this.g;
    }

    abstract boolean m();

    protected void n(d dVar, a.e.a.m.d dVar2, a.e.a.m.d dVar3, int i) {
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.j && fVarH2.j) {
            int iE = fVarH.g + dVar2.e();
            int iE2 = fVarH2.g - dVar3.e();
            int i2 = iE2 - iE;
            if (!this.f376e.j && this.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                l(i, i2);
            }
            g gVar = this.f376e;
            if (gVar.j) {
                if (gVar.g == i2) {
                    this.h.d(iE);
                    this.i.d(iE2);
                    return;
                }
                a.e.a.m.e eVar = this.f373b;
                float fW = i == 0 ? eVar.w() : eVar.P();
                if (fVarH == fVarH2) {
                    iE = fVarH.g;
                    iE2 = fVarH2.g;
                    fW = 0.5f;
                }
                this.h.d((int) (iE + 0.5f + (((iE2 - iE) - this.f376e.g) * fW)));
                this.i.d(this.h.g + this.f376e.g);
            }
        }
    }

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }
}
