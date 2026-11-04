package a.e.a.m.m;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class k extends p {
    public k(a.e.a.m.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }

    @Override // a.e.a.m.m.p, a.e.a.m.m.d
    public void a(d dVar) {
        a.e.a.m.a aVar = (a.e.a.m.a) this.f373b;
        int iS1 = aVar.s1();
        Iterator<f> it = this.h.l.iterator();
        int i = 0;
        int i2 = -1;
        while (it.hasNext()) {
            int i3 = it.next().g;
            if (i2 == -1 || i3 < i2) {
                i2 = i3;
            }
            if (i < i3) {
                i = i3;
            }
        }
        if (iS1 == 0 || iS1 == 2) {
            this.h.d(i2 + aVar.t1());
        } else {
            this.h.d(i + aVar.t1());
        }
    }

    @Override // a.e.a.m.m.p
    void d() {
        p pVar;
        a.e.a.m.e eVar = this.f373b;
        if (eVar instanceof a.e.a.m.a) {
            this.h.f339b = true;
            a.e.a.m.a aVar = (a.e.a.m.a) eVar;
            int iS1 = aVar.s1();
            boolean zR1 = aVar.r1();
            int i = 0;
            if (iS1 != 0) {
                if (iS1 != 1) {
                    if (iS1 == 2) {
                        this.h.f342e = f.a.TOP;
                        while (i < aVar.L0) {
                            a.e.a.m.e eVar2 = aVar.K0[i];
                            if (zR1 || eVar2.T() != 8) {
                                f fVar = eVar2.g.h;
                                fVar.k.add(this.h);
                                this.h.l.add(fVar);
                            }
                            i++;
                        }
                    } else {
                        if (iS1 != 3) {
                            return;
                        }
                        this.h.f342e = f.a.BOTTOM;
                        while (i < aVar.L0) {
                            a.e.a.m.e eVar3 = aVar.K0[i];
                            if (zR1 || eVar3.T() != 8) {
                                f fVar2 = eVar3.g.i;
                                fVar2.k.add(this.h);
                                this.h.l.add(fVar2);
                            }
                            i++;
                        }
                    }
                    q(this.f373b.g.h);
                    pVar = this.f373b.g;
                } else {
                    this.h.f342e = f.a.RIGHT;
                    while (i < aVar.L0) {
                        a.e.a.m.e eVar4 = aVar.K0[i];
                        if (zR1 || eVar4.T() != 8) {
                            f fVar3 = eVar4.f313f.i;
                            fVar3.k.add(this.h);
                            this.h.l.add(fVar3);
                        }
                        i++;
                    }
                }
                q(pVar.i);
            }
            this.h.f342e = f.a.LEFT;
            while (i < aVar.L0) {
                a.e.a.m.e eVar5 = aVar.K0[i];
                if (zR1 || eVar5.T() != 8) {
                    f fVar4 = eVar5.f313f.h;
                    fVar4.k.add(this.h);
                    this.h.l.add(fVar4);
                }
                i++;
            }
            q(this.f373b.f313f.h);
            pVar = this.f373b.f313f;
            q(pVar.i);
        }
    }

    @Override // a.e.a.m.m.p
    public void e() {
        a.e.a.m.e eVar = this.f373b;
        if (eVar instanceof a.e.a.m.a) {
            int iS1 = ((a.e.a.m.a) eVar).s1();
            if (iS1 == 0 || iS1 == 1) {
                this.f373b.j1(this.h.g);
            } else {
                this.f373b.k1(this.h.g);
            }
        }
    }

    @Override // a.e.a.m.m.p
    void f() {
        this.f374c = null;
        this.h.c();
    }

    @Override // a.e.a.m.m.p
    boolean m() {
        return false;
    }
}
