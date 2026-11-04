package a.e.a.m.m;

/* JADX INFO: loaded from: classes.dex */
public class n extends p {
    public f k;
    g l;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f359a;

        static {
            int[] iArr = new int[p.b.values().length];
            f359a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f359a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f359a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public n(a.e.a.m.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.k = fVar;
        this.l = null;
        this.h.f342e = f.a.TOP;
        this.i.f342e = f.a.BOTTOM;
        fVar.f342e = f.a.BASELINE;
        this.f377f = 1;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    @Override // a.e.a.m.m.p, a.e.a.m.m.d
    public void a(d dVar) {
        int i;
        float fT;
        int i2 = a.f359a[this.j.ordinal()];
        if (i2 == 1) {
            p(dVar);
        } else if (i2 == 2) {
            o(dVar);
        } else if (i2 == 3) {
            a.e.a.m.e eVar = this.f373b;
            n(dVar, eVar.Q, eVar.S, 1);
            return;
        }
        g gVar = this.f376e;
        if (gVar.f340c && !gVar.j && this.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT) {
            a.e.a.m.e eVar2 = this.f373b;
            int i3 = eVar2.y;
            if (i3 == 2) {
                a.e.a.m.e eVarI = eVar2.I();
                if (eVarI != null) {
                    g gVar2 = eVarI.g.f376e;
                    if (gVar2.j) {
                        i = (int) ((gVar2.g * this.f373b.F) + 0.5f);
                        this.f376e.d(i);
                    }
                }
            } else if (i3 == 3 && eVar2.f313f.f376e.j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    a.e.a.m.e eVar3 = this.f373b;
                    fT = eVar3.f313f.f376e.g / eVar3.t();
                    i = (int) (fT + 0.5f);
                } else if (iU == 0) {
                    a.e.a.m.e eVar4 = this.f373b;
                    fT = eVar4.f313f.f376e.g * eVar4.t();
                    i = (int) (fT + 0.5f);
                } else if (iU != 1) {
                    i = 0;
                } else {
                    a.e.a.m.e eVar5 = this.f373b;
                    fT = eVar5.f313f.f376e.g / eVar5.t();
                    i = (int) (fT + 0.5f);
                }
                this.f376e.d(i);
            }
        }
        f fVar = this.h;
        if (fVar.f340c) {
            f fVar2 = this.i;
            if (fVar2.f340c) {
                if (fVar.j && fVar2.j && this.f376e.j) {
                    return;
                }
                if (!this.f376e.j && this.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT) {
                    a.e.a.m.e eVar6 = this.f373b;
                    if (eVar6.x == 0 && !eVar6.i0()) {
                        f fVar3 = this.h.l.get(0);
                        f fVar4 = this.i.l.get(0);
                        int i4 = fVar3.g;
                        f fVar5 = this.h;
                        int i5 = i4 + fVar5.f343f;
                        int i6 = fVar4.g + this.i.f343f;
                        fVar5.d(i5);
                        this.i.d(i6);
                        this.f376e.d(i6 - i5);
                        return;
                    }
                }
                if (!this.f376e.j && this.f375d == a.e.a.m.e.b.MATCH_CONSTRAINT && this.f372a == 1 && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar6 = this.h.l.get(0);
                    int i7 = (this.i.l.get(0).g + this.i.f343f) - (fVar6.g + this.h.f343f);
                    g gVar3 = this.f376e;
                    int i8 = gVar3.m;
                    if (i7 < i8) {
                        gVar3.d(i7);
                    } else {
                        gVar3.d(i8);
                    }
                }
                if (this.f376e.j && this.h.l.size() > 0 && this.i.l.size() > 0) {
                    f fVar7 = this.h.l.get(0);
                    f fVar8 = this.i.l.get(0);
                    int i9 = fVar7.g + this.h.f343f;
                    int i10 = fVar8.g + this.i.f343f;
                    float fP = this.f373b.P();
                    if (fVar7 == fVar8) {
                        i9 = fVar7.g;
                        i10 = fVar8.g;
                        fP = 0.5f;
                    }
                    this.h.d((int) (i9 + 0.5f + (((i10 - i9) - this.f376e.g) * fP)));
                    this.i.d(this.h.g + this.f376e.g);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:157:0x03ed A[PHI: r0
      0x03ed: PHI (r0v34 a.e.a.m.m.l) = (r0v23 a.e.a.m.m.l), (r0v50 a.e.a.m.m.l) binds: [B:156:0x03eb, B:130:0x0342] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02e7, code lost:
    
        if (r9.f373b.X() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e9, code lost:
    
        r0 = r9.k;
        r1 = r9.h;
        r2 = r9.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0374, code lost:
    
        if (r9.f373b.X() != false) goto L116;
     */
    @Override // a.e.a.m.m.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void d() {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.m.m.n.d():void");
    }

    @Override // a.e.a.m.m.p
    public void e() {
        f fVar = this.h;
        if (fVar.j) {
            this.f373b.k1(fVar.g);
        }
    }

    @Override // a.e.a.m.m.p
    void f() {
        this.f374c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.f376e.c();
        this.g = false;
    }

    @Override // a.e.a.m.m.p
    boolean m() {
        return this.f375d != a.e.a.m.e.b.MATCH_CONSTRAINT || this.f373b.y == 0;
    }

    void q() {
        this.g = false;
        this.h.c();
        this.h.j = false;
        this.i.c();
        this.i.j = false;
        this.k.c();
        this.k.j = false;
        this.f376e.j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f373b.r();
    }
}
