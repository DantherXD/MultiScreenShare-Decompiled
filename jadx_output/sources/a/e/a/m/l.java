package a.e.a.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class l extends e {
    public ArrayList<e> K0 = new ArrayList<>();

    public void c(e eVar) {
        this.K0.add(eVar);
        if (eVar.I() != null) {
            ((l) eVar.I()).q1(eVar);
        }
        eVar.Z0(this);
    }

    public ArrayList<e> o1() {
        return this.K0;
    }

    public void p1() {
        ArrayList<e> arrayList = this.K0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e eVar = this.K0.get(i);
            if (eVar instanceof l) {
                ((l) eVar).p1();
            }
        }
    }

    public void q1(e eVar) {
        this.K0.remove(eVar);
        eVar.r0();
    }

    @Override // a.e.a.m.e
    public void r0() {
        this.K0.clear();
        super.r0();
    }

    public void r1() {
        this.K0.clear();
    }

    @Override // a.e.a.m.e
    public void t0(a.e.a.c cVar) {
        super.t0(cVar);
        int size = this.K0.size();
        for (int i = 0; i < size; i++) {
            this.K0.get(i).t0(cVar);
        }
    }
}
