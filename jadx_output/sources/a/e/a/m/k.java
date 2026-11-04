package a.e.a.m;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class k extends i {
    private int M0 = 0;
    private int N0 = 0;
    private int O0 = 0;
    private int P0 = 0;
    private int Q0 = 0;
    private int R0 = 0;
    private int S0 = 0;
    private int T0 = 0;
    private boolean U0 = false;
    private int V0 = 0;
    private int W0 = 0;
    protected a.e.a.m.m.b.a X0 = new a.e.a.m.m.b.a();
    a.e.a.m.m.b.InterfaceC0006b Y0 = null;

    @Override // a.e.a.m.i, a.e.a.m.h
    public void b(f fVar) {
        q1();
    }

    public void q1() {
        for (int i = 0; i < this.L0; i++) {
            e eVar = this.K0[i];
            if (eVar != null) {
                eVar.R0(true);
            }
        }
    }

    public boolean r1(HashSet<e> hashSet) {
        for (int i = 0; i < this.L0; i++) {
            if (hashSet.contains(this.K0[i])) {
                return true;
            }
        }
        return false;
    }

    public boolean s1() {
        return this.U0;
    }
}
