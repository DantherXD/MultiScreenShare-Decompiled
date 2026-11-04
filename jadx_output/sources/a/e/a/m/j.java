package a.e.a.m;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean[] f322a = new boolean[3];

    static void a(f fVar, a.e.a.d dVar, e eVar) {
        eVar.u = -1;
        eVar.v = -1;
        e.b bVar = fVar.a0[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.a0[0] == e.b.MATCH_PARENT) {
            int i = eVar.P.g;
            int iU = fVar.U() - eVar.R.g;
            d dVar2 = eVar.P;
            dVar2.i = dVar.q(dVar2);
            d dVar3 = eVar.R;
            dVar3.i = dVar.q(dVar3);
            dVar.f(eVar.P.i, i);
            dVar.f(eVar.R.i, iU);
            eVar.u = 2;
            eVar.L0(i, iU);
        }
        if (fVar.a0[1] == bVar2 || eVar.a0[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i2 = eVar.Q.g;
        int iV = fVar.v() - eVar.S.g;
        d dVar4 = eVar.Q;
        dVar4.i = dVar.q(dVar4);
        d dVar5 = eVar.S;
        dVar5.i = dVar.q(dVar5);
        dVar.f(eVar.Q.i, i2);
        dVar.f(eVar.S.i, iV);
        if (eVar.m0 > 0 || eVar.T() == 8) {
            d dVar6 = eVar.T;
            dVar6.i = dVar.q(dVar6);
            dVar.f(eVar.T.i, eVar.m0 + i2);
        }
        eVar.v = 2;
        eVar.c1(i2, iV);
    }

    public static final boolean b(int i, int i2) {
        return (i & i2) == i2;
    }
}
