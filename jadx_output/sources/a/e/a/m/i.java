package a.e.a.m;

import a.e.a.m.m.o;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class i extends e implements h {
    public e[] K0 = new e[4];
    public int L0 = 0;

    @Override // a.e.a.m.h
    public void a() {
        this.L0 = 0;
        Arrays.fill(this.K0, (Object) null);
    }

    @Override // a.e.a.m.h
    public void b(f fVar) {
    }

    @Override // a.e.a.m.h
    public void c(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i = this.L0 + 1;
        e[] eVarArr = this.K0;
        if (i > eVarArr.length) {
            this.K0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.K0;
        int i2 = this.L0;
        eVarArr2[i2] = eVar;
        this.L0 = i2 + 1;
    }

    public void o1(ArrayList<o> arrayList, int i, o oVar) {
        for (int i2 = 0; i2 < this.L0; i2++) {
            oVar.a(this.K0[i2]);
        }
        for (int i3 = 0; i3 < this.L0; i3++) {
            a.e.a.m.m.i.a(this.K0[i3], i, arrayList, oVar);
        }
    }

    public int p1(int i) {
        int i2;
        int i3;
        for (int i4 = 0; i4 < this.L0; i4++) {
            e eVar = this.K0[i4];
            if (i == 0 && (i3 = eVar.I0) != -1) {
                return i3;
            }
            if (i == 1 && (i2 = eVar.J0) != -1) {
                return i2;
            }
        }
        return -1;
    }
}
