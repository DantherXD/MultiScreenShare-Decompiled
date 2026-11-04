package a.e.a.m.m;

/* JADX INFO: loaded from: classes.dex */
class j extends p {
    public j(a.e.a.m.e eVar) {
        super(eVar);
        eVar.f313f.f();
        eVar.g.f();
        this.f377f = ((a.e.a.m.g) eVar).p1();
    }

    private void q(f fVar) {
        this.h.k.add(fVar);
        fVar.l.add(this.h);
    }

    @Override // a.e.a.m.m.p, a.e.a.m.m.d
    public void a(d dVar) {
        f fVar = this.h;
        if (fVar.f340c && !fVar.j) {
            this.h.d((int) ((fVar.l.get(0).g * ((a.e.a.m.g) this.f373b).s1()) + 0.5f));
        }
    }

    @Override // a.e.a.m.m.p
    void d() {
        f fVar;
        p pVar;
        f fVar2;
        a.e.a.m.g gVar = (a.e.a.m.g) this.f373b;
        int iQ1 = gVar.q1();
        int iR1 = gVar.r1();
        gVar.s1();
        if (gVar.p1() == 1) {
            f fVar3 = this.h;
            if (iQ1 != -1) {
                fVar3.l.add(this.f373b.b0.f313f.h);
                this.f373b.b0.f313f.h.k.add(this.h);
                fVar2 = this.h;
            } else {
                if (iR1 != -1) {
                    fVar3.l.add(this.f373b.b0.f313f.i);
                    this.f373b.b0.f313f.i.k.add(this.h);
                    fVar2 = this.h;
                    iQ1 = -iR1;
                } else {
                    fVar3.f339b = true;
                    fVar3.l.add(this.f373b.b0.f313f.i);
                    this.f373b.b0.f313f.i.k.add(this.h);
                }
                q(this.f373b.f313f.h);
                pVar = this.f373b.f313f;
            }
            fVar2.f343f = iQ1;
            q(this.f373b.f313f.h);
            pVar = this.f373b.f313f;
        } else {
            f fVar4 = this.h;
            if (iQ1 != -1) {
                fVar4.l.add(this.f373b.b0.g.h);
                this.f373b.b0.g.h.k.add(this.h);
                fVar = this.h;
            } else {
                if (iR1 != -1) {
                    fVar4.l.add(this.f373b.b0.g.i);
                    this.f373b.b0.g.i.k.add(this.h);
                    fVar = this.h;
                    iQ1 = -iR1;
                } else {
                    fVar4.f339b = true;
                    fVar4.l.add(this.f373b.b0.g.i);
                    this.f373b.b0.g.i.k.add(this.h);
                }
                q(this.f373b.g.h);
                pVar = this.f373b.g;
            }
            fVar.f343f = iQ1;
            q(this.f373b.g.h);
            pVar = this.f373b.g;
        }
        q(pVar.i);
    }

    @Override // a.e.a.m.m.p
    public void e() {
        if (((a.e.a.m.g) this.f373b).p1() == 1) {
            this.f373b.j1(this.h.g);
        } else {
            this.f373b.k1(this.h.g);
        }
    }

    @Override // a.e.a.m.m.p
    void f() {
        this.h.c();
    }

    @Override // a.e.a.m.m.p
    boolean m() {
        return false;
    }
}
