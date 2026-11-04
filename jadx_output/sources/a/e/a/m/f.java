package a.e.a.m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class f extends l {
    private int N0;
    public a.e.a.e Q0;
    int S0;
    int T0;
    int U0;
    int V0;
    a.e.a.m.m.b L0 = new a.e.a.m.m.b(this);
    public a.e.a.m.m.e M0 = new a.e.a.m.m.e(this);
    protected a.e.a.m.m.b.InterfaceC0006b O0 = null;
    private boolean P0 = false;
    protected a.e.a.d R0 = new a.e.a.d();
    public int W0 = 0;
    public int X0 = 0;
    c[] Y0 = new c[4];
    c[] Z0 = new c[4];
    public boolean a1 = false;
    public boolean b1 = false;
    public boolean c1 = false;
    public int d1 = 0;
    public int e1 = 0;
    private int f1 = 257;
    public boolean g1 = false;
    private boolean h1 = false;
    private boolean i1 = false;
    int j1 = 0;
    private WeakReference<d> k1 = null;
    private WeakReference<d> l1 = null;
    private WeakReference<d> m1 = null;
    private WeakReference<d> n1 = null;
    HashSet<e> o1 = new HashSet<>();
    public a.e.a.m.m.b.a p1 = new a.e.a.m.m.b.a();

    public static boolean O1(int i, e eVar, a.e.a.m.m.b.InterfaceC0006b interfaceC0006b, a.e.a.m.m.b.a aVar, int i2) {
        int i3;
        int i4;
        if (interfaceC0006b == null) {
            return false;
        }
        if (eVar.T() == 8 || (eVar instanceof g) || (eVar instanceof a)) {
            aVar.h = 0;
            aVar.i = 0;
            return false;
        }
        aVar.f329d = eVar.y();
        aVar.f330e = eVar.R();
        aVar.f331f = eVar.U();
        aVar.g = eVar.v();
        aVar.l = false;
        aVar.m = i2;
        e.b bVar = aVar.f329d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z = bVar == bVar2;
        boolean z2 = aVar.f330e == bVar2;
        boolean z3 = z && eVar.e0 > 0.0f;
        boolean z4 = z2 && eVar.e0 > 0.0f;
        if (z && eVar.Y(0) && eVar.x == 0 && !z3) {
            aVar.f329d = e.b.WRAP_CONTENT;
            if (z2 && eVar.y == 0) {
                aVar.f329d = e.b.FIXED;
            }
            z = false;
        }
        if (z2 && eVar.Y(1) && eVar.y == 0 && !z4) {
            aVar.f330e = e.b.WRAP_CONTENT;
            if (z && eVar.x == 0) {
                aVar.f330e = e.b.FIXED;
            }
            z2 = false;
        }
        if (eVar.l0()) {
            aVar.f329d = e.b.FIXED;
            z = false;
        }
        if (eVar.m0()) {
            aVar.f330e = e.b.FIXED;
            z2 = false;
        }
        if (z3) {
            if (eVar.z[0] == 4) {
                aVar.f329d = e.b.FIXED;
            } else if (!z2) {
                e.b bVar3 = aVar.f330e;
                e.b bVar4 = e.b.FIXED;
                if (bVar3 == bVar4) {
                    i4 = aVar.g;
                } else {
                    aVar.f329d = e.b.WRAP_CONTENT;
                    interfaceC0006b.b(eVar, aVar);
                    i4 = aVar.i;
                }
                aVar.f329d = bVar4;
                aVar.f331f = (int) (eVar.t() * i4);
            }
        }
        if (z4) {
            if (eVar.z[1] == 4) {
                aVar.f330e = e.b.FIXED;
            } else if (!z) {
                e.b bVar5 = aVar.f329d;
                e.b bVar6 = e.b.FIXED;
                if (bVar5 == bVar6) {
                    i3 = aVar.f331f;
                } else {
                    aVar.f330e = e.b.WRAP_CONTENT;
                    interfaceC0006b.b(eVar, aVar);
                    i3 = aVar.h;
                }
                aVar.f330e = bVar6;
                aVar.g = eVar.u() == -1 ? (int) (i3 / eVar.t()) : (int) (eVar.t() * i3);
            }
        }
        interfaceC0006b.b(eVar, aVar);
        eVar.h1(aVar.h);
        eVar.I0(aVar.i);
        eVar.H0(aVar.k);
        eVar.x0(aVar.j);
        aVar.m = a.e.a.m.m.b.a.f326a;
        return aVar.l;
    }

    private void Q1() {
        this.W0 = 0;
        this.X0 = 0;
    }

    private void u1(e eVar) {
        int i = this.W0 + 1;
        c[] cVarArr = this.Z0;
        if (i >= cVarArr.length) {
            this.Z0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Z0[this.W0] = new c(eVar, 0, L1());
        this.W0++;
    }

    private void x1(d dVar, a.e.a.i iVar) {
        this.R0.h(iVar, this.R0.q(dVar), 0, 5);
    }

    private void y1(d dVar, a.e.a.i iVar) {
        this.R0.h(this.R0.q(dVar), iVar, 0, 5);
    }

    private void z1(e eVar) {
        int i = this.X0 + 1;
        c[] cVarArr = this.Y0;
        if (i >= cVarArr.length) {
            this.Y0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.Y0[this.X0] = new c(eVar, 1, L1());
        this.X0++;
    }

    void A1(d dVar) {
        WeakReference<d> weakReference = this.m1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.m1.get().d()) {
            this.m1 = new WeakReference<>(dVar);
        }
    }

    void B1(d dVar) {
        WeakReference<d> weakReference = this.k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.k1.get().d()) {
            this.k1 = new WeakReference<>(dVar);
        }
    }

    public boolean C1(boolean z) {
        return this.M0.f(z);
    }

    public boolean D1(boolean z) {
        return this.M0.g(z);
    }

    public boolean E1(boolean z, int i) {
        return this.M0.h(z, i);
    }

    public a.e.a.m.m.b.InterfaceC0006b F1() {
        return this.O0;
    }

    public int G1() {
        return this.f1;
    }

    public a.e.a.d H1() {
        return this.R0;
    }

    public void I1() {
        this.M0.j();
    }

    public void J1() {
        this.M0.k();
    }

    public boolean K1() {
        return this.i1;
    }

    public boolean L1() {
        return this.P0;
    }

    @Override // a.e.a.m.e
    public void M(StringBuilder sb) {
        sb.append(this.p + ":{\n");
        sb.append("  actualWidth:" + this.c0);
        sb.append("\n");
        sb.append("  actualHeight:" + this.d0);
        sb.append("\n");
        Iterator<e> it = o1().iterator();
        while (it.hasNext()) {
            it.next().M(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    public boolean M1() {
        return this.h1;
    }

    public long N1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.S0 = i8;
        this.T0 = i9;
        return this.L0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean P1(int i) {
        return (this.f1 & i) == i;
    }

    public void R1(a.e.a.m.m.b.InterfaceC0006b interfaceC0006b) {
        this.O0 = interfaceC0006b;
        this.M0.n(interfaceC0006b);
    }

    public void S1(int i) {
        this.f1 = i;
        a.e.a.d.f234a = P1(512);
    }

    public void T1(int i) {
        this.N0 = i;
    }

    public void U1(boolean z) {
        this.P0 = z;
    }

    public boolean V1(a.e.a.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean zP1 = P1(64);
        n1(dVar, zP1);
        int size = this.K0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            e eVar = this.K0.get(i);
            eVar.n1(dVar, zP1);
            if (eVar.a0()) {
                z = true;
            }
        }
        return z;
    }

    public void W1() {
        this.L0.e(this);
    }

    @Override // a.e.a.m.e
    public void m1(boolean z, boolean z2) {
        super.m1(z, z2);
        int size = this.K0.size();
        for (int i = 0; i < size; i++) {
            this.K0.get(i).m1(z, z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:155:0x030c A[PHI: r6 r16
      0x030c: PHI (r6v12 ??) = (r6v11 ??), (r6v16 ??), (r6v16 ??), (r6v16 ??) binds: [B:142:0x02cd, B:150:0x02f2, B:151:0x02f4, B:153:0x02fa] A[DONT_GENERATE, DONT_INLINE]
      0x030c: PHI (r16v4 boolean) = (r16v3 boolean), (r16v5 boolean), (r16v5 boolean), (r16v5 boolean) binds: [B:142:0x02cd, B:150:0x02f2, B:151:0x02f4, B:153:0x02fa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // a.e.a.m.l
    public void p1() {
        int i;
        int i2;
        boolean z;
        boolean zV1;
        boolean z2;
        ?? r8;
        ?? r6;
        ?? r11;
        boolean z3;
        int i3;
        e.b bVar;
        this.g0 = 0;
        this.h0 = 0;
        this.h1 = false;
        this.i1 = false;
        int size = this.K0.size();
        int iMax = Math.max(0, U());
        int iMax2 = Math.max(0, v());
        e.b[] bVarArr = this.a0;
        e.b bVar2 = bVarArr[1];
        e.b bVar3 = bVarArr[0];
        WeakReference<d> weakReference = null;
        if (this.Q0 != null) {
            throw null;
        }
        if (this.N0 == 0 && j.b(this.f1, 1)) {
            a.e.a.m.m.h.h(this, F1());
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = this.K0.get(i4);
                if (eVar.k0() && !(eVar instanceof g) && !(eVar instanceof a) && !(eVar instanceof k) && !eVar.j0()) {
                    e.b bVarS = eVar.s(0);
                    e.b bVarS2 = eVar.s(1);
                    e.b bVar4 = e.b.MATCH_CONSTRAINT;
                    if (!(bVarS == bVar4 && eVar.x != 1 && bVarS2 == bVar4 && eVar.y != 1)) {
                        O1(0, eVar, this.O0, new a.e.a.m.m.b.a(), a.e.a.m.m.b.a.f326a);
                    }
                }
            }
        }
        if (size <= 2 || !((bVar3 == (bVar = e.b.WRAP_CONTENT) || bVar2 == bVar) && j.b(this.f1, 1024) && a.e.a.m.m.i.c(this, F1()))) {
            i = iMax2;
            i2 = iMax;
            z = false;
        } else {
            if (bVar3 == bVar) {
                if (iMax >= U() || iMax <= 0) {
                    iMax = U();
                } else {
                    h1(iMax);
                    this.h1 = true;
                }
            }
            if (bVar2 == bVar) {
                if (iMax2 >= v() || iMax2 <= 0) {
                    iMax2 = v();
                } else {
                    I0(iMax2);
                    this.i1 = true;
                }
            }
            i = iMax2;
            i2 = iMax;
            z = true;
        }
        boolean z4 = P1(64) || P1(128);
        a.e.a.d dVar = this.R0;
        dVar.q = false;
        dVar.r = false;
        if (this.f1 != 0 && z4) {
            dVar.r = true;
        }
        ArrayList<e> arrayList = this.K0;
        e.b bVarY = y();
        e.b bVar5 = e.b.WRAP_CONTENT;
        boolean z5 = bVarY == bVar5 || R() == bVar5;
        Q1();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar2 = this.K0.get(i5);
            if (eVar2 instanceof l) {
                ((l) eVar2).p1();
            }
        }
        boolean zP1 = P1(64);
        ?? r12 = z;
        boolean zT1 = true;
        int i6 = 0;
        while (zT1) {
            int i7 = i6 + 1;
            try {
                this.R0.D();
                Q1();
                k(this.R0);
                for (int i8 = 0; i8 < size; i8++) {
                    this.K0.get(i8).k(this.R0);
                }
                zT1 = t1(this.R0);
                WeakReference<d> weakReference2 = this.k1;
                if (weakReference2 != null && weakReference2.get() != null) {
                    y1(this.k1.get(), this.R0.q(this.Q));
                    this.k1 = weakReference;
                }
                WeakReference<d> weakReference3 = this.m1;
                if (weakReference3 != null && weakReference3.get() != null) {
                    x1(this.m1.get(), this.R0.q(this.S));
                    this.m1 = weakReference;
                }
                WeakReference<d> weakReference4 = this.l1;
                if (weakReference4 != null && weakReference4.get() != null) {
                    y1(this.l1.get(), this.R0.q(this.P));
                    this.l1 = weakReference;
                }
                WeakReference<d> weakReference5 = this.n1;
                if (weakReference5 != null && weakReference5.get() != null) {
                    x1(this.n1.get(), this.R0.q(this.R));
                    this.n1 = weakReference;
                }
                if (zT1) {
                    this.R0.z();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                System.out.println("EXCEPTION : " + e2);
            }
            a.e.a.d dVar2 = this.R0;
            if (zT1) {
                zV1 = V1(dVar2, j.f322a);
            } else {
                n1(dVar2, zP1);
                for (int i9 = 0; i9 < size; i9++) {
                    this.K0.get(i9).n1(this.R0, zP1);
                }
                zV1 = false;
            }
            if (z5 && i7 < 8 && j.f322a[2]) {
                int i10 = 0;
                int iMax3 = 0;
                int iMax4 = 0;
                while (i10 < size) {
                    e eVar3 = this.K0.get(i10);
                    iMax4 = Math.max(iMax4, eVar3.g0 + eVar3.U());
                    iMax3 = Math.max(iMax3, eVar3.h0 + eVar3.v());
                    i10++;
                    zV1 = zV1;
                }
                z2 = zV1;
                int iMax5 = Math.max(this.n0, iMax4);
                int iMax6 = Math.max(this.o0, iMax3);
                e.b bVar6 = e.b.WRAP_CONTENT;
                r12 = r12;
                if (bVar3 == bVar6 && U() < iMax5) {
                    r12 = r12;
                    h1(iMax5);
                    this.a0[0] = bVar6;
                    r12 = 1;
                    z2 = true;
                }
                if (bVar2 == bVar6 && v() < iMax6) {
                    I0(iMax6);
                    this.a0[1] = bVar6;
                    r12 = 1;
                    z2 = true;
                }
            } else {
                z2 = zV1;
            }
            int iMax7 = Math.max(this.n0, U());
            ?? r13 = r12;
            if (iMax7 > U()) {
                h1(iMax7);
                this.a0[0] = e.b.FIXED;
                r13 = 1;
                z2 = true;
            }
            int iMax8 = Math.max(this.o0, v());
            if (iMax8 > v()) {
                I0(iMax8);
                r8 = 1;
                this.a0[1] = e.b.FIXED;
                r6 = 1;
                z2 = true;
            } else {
                r8 = 1;
                r6 = r13;
            }
            if (r6 == 0) {
                e.b bVar7 = this.a0[0];
                e.b bVar8 = e.b.WRAP_CONTENT;
                if (bVar7 == bVar8 && i2 > 0) {
                    r6 = r6;
                    if (U() > i2) {
                        this.h1 = r8;
                        this.a0[0] = e.b.FIXED;
                        h1(i2);
                        ?? r7 = r8;
                        z2 = r7 == true ? 1 : 0;
                        r6 = r7;
                    }
                }
                r6 = r6;
                r6 = r6;
                if (this.a0[r8] != bVar8 || i <= 0 || v() <= i) {
                    r11 = r6;
                    z3 = z2;
                    i3 = 8;
                } else {
                    this.i1 = r8;
                    this.a0[r8] = e.b.FIXED;
                    I0(i);
                    i3 = 8;
                    z3 = true;
                    r11 = 1;
                }
            } else {
                r11 = r6;
                z3 = z2;
                i3 = 8;
            }
            zT1 = i7 > i3 ? false : z3;
            i6 = i7;
            weakReference = null;
            r12 = r11;
        }
        this.K0 = arrayList;
        if (r12 != 0) {
            e.b[] bVarArr2 = this.a0;
            bVarArr2[0] = bVar3;
            bVarArr2[1] = bVar2;
        }
        t0(this.R0.v());
    }

    @Override // a.e.a.m.l, a.e.a.m.e
    public void r0() {
        this.R0.D();
        this.S0 = 0;
        this.U0 = 0;
        this.T0 = 0;
        this.V0 = 0;
        this.g1 = false;
        super.r0();
    }

    void s1(e eVar, int i) {
        if (i == 0) {
            u1(eVar);
        } else if (i == 1) {
            z1(eVar);
        }
    }

    public boolean t1(a.e.a.d dVar) {
        boolean zP1 = P1(64);
        g(dVar, zP1);
        int size = this.K0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            e eVar = this.K0.get(i);
            eVar.P0(0, false);
            eVar.P0(1, false);
            if (eVar instanceof a) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e eVar2 = this.K0.get(i2);
                if (eVar2 instanceof a) {
                    ((a) eVar2).v1();
                }
            }
        }
        this.o1.clear();
        for (int i3 = 0; i3 < size; i3++) {
            e eVar3 = this.K0.get(i3);
            if (eVar3.f()) {
                if (eVar3 instanceof k) {
                    this.o1.add(eVar3);
                } else {
                    eVar3.g(dVar, zP1);
                }
            }
        }
        while (this.o1.size() > 0) {
            int size2 = this.o1.size();
            Iterator<e> it = this.o1.iterator();
            while (it.hasNext()) {
                k kVar = (k) it.next();
                if (kVar.r1(this.o1)) {
                    kVar.g(dVar, zP1);
                    this.o1.remove(kVar);
                    break;
                }
            }
            if (size2 == this.o1.size()) {
                Iterator<e> it2 = this.o1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, zP1);
                }
                this.o1.clear();
            }
        }
        if (a.e.a.d.f234a) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar4 = this.K0.get(i4);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            for (e eVar5 : hashSet) {
                j.a(this, dVar, eVar5);
                eVar5.g(dVar, zP1);
            }
        } else {
            for (int i5 = 0; i5 < size; i5++) {
                e eVar6 = this.K0.get(i5);
                if (eVar6 instanceof f) {
                    e.b[] bVarArr = eVar6.a0;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar6.M0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.d1(e.b.FIXED);
                    }
                    eVar6.g(dVar, zP1);
                    if (bVar == bVar3) {
                        eVar6.M0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar6.d1(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar6);
                    if (!eVar6.f()) {
                        eVar6.g(dVar, zP1);
                    }
                }
            }
        }
        if (this.W0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.X0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    public void v1(d dVar) {
        WeakReference<d> weakReference = this.n1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.n1.get().d()) {
            this.n1 = new WeakReference<>(dVar);
        }
    }

    public void w1(d dVar) {
        WeakReference<d> weakReference = this.l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.l1.get().d()) {
            this.l1 = new WeakReference<>(dVar);
        }
    }
}
