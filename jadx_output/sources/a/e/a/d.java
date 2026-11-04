package a.e.a;

import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f234a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f235b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f236c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f237d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f238e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f239f = 1000;
    public static e g;
    public static long h;
    public static long i;
    private a m;
    a.e.a.b[] p;
    final c w;
    private a z;
    public boolean j = false;
    int k = 0;
    private HashMap<String, i> l = null;
    private int n = 32;
    private int o = 32;
    public boolean q = false;
    public boolean r = false;
    private boolean[] s = new boolean[32];
    int t = 1;
    int u = 0;
    private int v = 32;
    private i[] x = new i[f239f];
    private int y = 0;

    interface a {
        i a(d dVar, boolean[] zArr);

        void b(i iVar);

        void c(a aVar);

        void clear();

        i getKey();

        boolean isEmpty();
    }

    class b extends a.e.a.b {
        public b(c cVar) {
            this.f228e = new j(this, cVar);
        }
    }

    public d() {
        this.p = null;
        this.p = new a.e.a.b[32];
        C();
        c cVar = new c();
        this.w = cVar;
        this.m = new h(cVar);
        this.z = f238e ? new b(cVar) : new a.e.a.b(cVar);
    }

    private final int B(a aVar, boolean z) {
        if (g != null) {
            throw null;
        }
        for (int i2 = 0; i2 < this.t; i2++) {
            this.s[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (g != null) {
                throw null;
            }
            i3++;
            if (i3 >= this.t * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.s[aVar.getKey().f249e] = true;
            }
            i iVarA = aVar.a(this, this.s);
            if (iVarA != null) {
                boolean[] zArr = this.s;
                int i4 = iVarA.f249e;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (iVarA != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.u; i6++) {
                    a.e.a.b bVar = this.p[i6];
                    if (bVar.f224a.l != i.a.UNRESTRICTED && !bVar.f229f && bVar.t(iVarA)) {
                        float fB = bVar.f228e.b(iVarA);
                        if (fB < 0.0f) {
                            float f3 = (-bVar.f225b) / fB;
                            if (f3 < f2) {
                                i5 = i6;
                                f2 = f3;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    a.e.a.b bVar2 = this.p[i5];
                    bVar2.f224a.f250f = -1;
                    if (g != null) {
                        throw null;
                    }
                    bVar2.x(iVarA);
                    i iVar = bVar2.f224a;
                    iVar.f250f = i5;
                    iVar.h(this, bVar2);
                } else {
                    continue;
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    private void C() {
        int i2 = 0;
        if (f238e) {
            while (i2 < this.u) {
                a.e.a.b bVar = this.p[i2];
                if (bVar != null) {
                    this.w.f230a.a(bVar);
                }
                this.p[i2] = null;
                i2++;
            }
            return;
        }
        while (i2 < this.u) {
            a.e.a.b bVar2 = this.p[i2];
            if (bVar2 != null) {
                this.w.f231b.a(bVar2);
            }
            this.p[i2] = null;
            i2++;
        }
    }

    private i a(i.a aVar, String str) {
        i iVarB = this.w.f232c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
        } else {
            iVarB.e();
        }
        iVarB.g(aVar, str);
        int i2 = this.y;
        int i3 = f239f;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f239f = i4;
            this.x = (i[]) Arrays.copyOf(this.x, i4);
        }
        i[] iVarArr = this.x;
        int i5 = this.y;
        this.y = i5 + 1;
        iVarArr[i5] = iVarB;
        return iVarB;
    }

    private final void l(a.e.a.b bVar) {
        int i2;
        if (f236c && bVar.f229f) {
            bVar.f224a.f(this, bVar.f225b);
        } else {
            a.e.a.b[] bVarArr = this.p;
            int i3 = this.u;
            bVarArr[i3] = bVar;
            i iVar = bVar.f224a;
            iVar.f250f = i3;
            this.u = i3 + 1;
            iVar.h(this, bVar);
        }
        if (f236c && this.j) {
            int i4 = 0;
            while (i4 < this.u) {
                if (this.p[i4] == null) {
                    System.out.println("WTF");
                }
                a.e.a.b[] bVarArr2 = this.p;
                if (bVarArr2[i4] != null && bVarArr2[i4].f229f) {
                    a.e.a.b bVar2 = bVarArr2[i4];
                    bVar2.f224a.f(this, bVar2.f225b);
                    (f238e ? this.w.f230a : this.w.f231b).a(bVar2);
                    this.p[i4] = null;
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (true) {
                        i2 = this.u;
                        if (i5 >= i2) {
                            break;
                        }
                        a.e.a.b[] bVarArr3 = this.p;
                        int i7 = i5 - 1;
                        bVarArr3[i7] = bVarArr3[i5];
                        if (bVarArr3[i7].f224a.f250f == i5) {
                            bVarArr3[i7].f224a.f250f = i7;
                        }
                        i6 = i5;
                        i5++;
                    }
                    if (i6 < i2) {
                        this.p[i6] = null;
                    }
                    this.u = i2 - 1;
                    i4--;
                }
                i4++;
            }
            this.j = false;
        }
    }

    private void n() {
        for (int i2 = 0; i2 < this.u; i2++) {
            a.e.a.b bVar = this.p[i2];
            bVar.f224a.h = bVar.f225b;
        }
    }

    public static a.e.a.b s(d dVar, i iVar, i iVar2, float f2) {
        return dVar.r().j(iVar, iVar2, f2);
    }

    private int u(a aVar) {
        boolean z;
        int i2 = 0;
        while (true) {
            if (i2 >= this.u) {
                z = false;
                break;
            }
            a.e.a.b[] bVarArr = this.p;
            if (bVarArr[i2].f224a.l != i.a.UNRESTRICTED && bVarArr[i2].f225b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (g != null) {
                throw null;
            }
            i3++;
            float f2 = Float.MAX_VALUE;
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            for (int i7 = 0; i7 < this.u; i7++) {
                a.e.a.b bVar = this.p[i7];
                if (bVar.f224a.l != i.a.UNRESTRICTED && !bVar.f229f && bVar.f225b < 0.0f) {
                    int i8 = 9;
                    if (f237d) {
                        int iK = bVar.f228e.k();
                        int i9 = 0;
                        while (i9 < iK) {
                            i iVarG = bVar.f228e.g(i9);
                            float fB = bVar.f228e.b(iVarG);
                            if (fB > 0.0f) {
                                int i10 = 0;
                                while (i10 < i8) {
                                    float f3 = iVarG.j[i10] / fB;
                                    if ((f3 < f2 && i10 == i6) || i10 > i6) {
                                        i5 = iVarG.f249e;
                                        i6 = i10;
                                        i4 = i7;
                                        f2 = f3;
                                    }
                                    i10++;
                                    i8 = 9;
                                }
                            }
                            i9++;
                            i8 = 9;
                        }
                    } else {
                        for (int i11 = 1; i11 < this.t; i11++) {
                            i iVar = this.w.f233d[i11];
                            float fB2 = bVar.f228e.b(iVar);
                            if (fB2 > 0.0f) {
                                for (int i12 = 0; i12 < 9; i12++) {
                                    float f4 = iVar.j[i12] / fB2;
                                    if ((f4 < f2 && i12 == i6) || i12 > i6) {
                                        i5 = i11;
                                        i6 = i12;
                                        i4 = i7;
                                        f2 = f4;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (i4 != -1) {
                a.e.a.b bVar2 = this.p[i4];
                bVar2.f224a.f250f = -1;
                if (g != null) {
                    throw null;
                }
                bVar2.x(this.w.f233d[i5]);
                i iVar2 = bVar2.f224a;
                iVar2.f250f = i4;
                iVar2.h(this, bVar2);
            } else {
                z2 = true;
            }
            if (i3 > this.t / 2) {
                z2 = true;
            }
        }
        return i3;
    }

    public static e w() {
        return g;
    }

    private void y() {
        int i2 = this.n * 2;
        this.n = i2;
        this.p = (a.e.a.b[]) Arrays.copyOf(this.p, i2);
        c cVar = this.w;
        cVar.f233d = (i[]) Arrays.copyOf(cVar.f233d, this.n);
        int i3 = this.n;
        this.s = new boolean[i3];
        this.o = i3;
        this.v = i3;
        if (g != null) {
            throw null;
        }
    }

    void A(a aVar) {
        if (g != null) {
            throw null;
        }
        u(aVar);
        B(aVar, false);
        n();
    }

    public void D() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.w;
            i[] iVarArr = cVar.f233d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.e();
            }
            i2++;
        }
        cVar.f232c.c(this.x, this.y);
        this.y = 0;
        Arrays.fill(this.w.f233d, (Object) null);
        HashMap<String, i> map = this.l;
        if (map != null) {
            map.clear();
        }
        this.k = 0;
        this.m.clear();
        this.t = 1;
        for (int i3 = 0; i3 < this.u; i3++) {
            a.e.a.b[] bVarArr = this.p;
            if (bVarArr[i3] != null) {
                bVarArr[i3].f226c = false;
            }
        }
        C();
        this.u = 0;
        this.z = f238e ? new b(this.w) : new a.e.a.b(this.w);
    }

    public void b(a.e.a.m.e eVar, a.e.a.m.e eVar2, float f2, int i2) {
        a.e.a.m.d.b bVar = a.e.a.m.d.b.LEFT;
        i iVarQ = q(eVar.m(bVar));
        a.e.a.m.d.b bVar2 = a.e.a.m.d.b.TOP;
        i iVarQ2 = q(eVar.m(bVar2));
        a.e.a.m.d.b bVar3 = a.e.a.m.d.b.RIGHT;
        i iVarQ3 = q(eVar.m(bVar3));
        a.e.a.m.d.b bVar4 = a.e.a.m.d.b.BOTTOM;
        i iVarQ4 = q(eVar.m(bVar4));
        i iVarQ5 = q(eVar2.m(bVar));
        i iVarQ6 = q(eVar2.m(bVar2));
        i iVarQ7 = q(eVar2.m(bVar3));
        i iVarQ8 = q(eVar2.m(bVar4));
        a.e.a.b bVarR = r();
        double d2 = f2;
        double d3 = i2;
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (Math.sin(d2) * d3));
        d(bVarR);
        a.e.a.b bVarR2 = r();
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (Math.cos(d2) * d3));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        a.e.a.b bVarR = r();
        bVarR.h(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 8) {
            bVarR.d(this, i4);
        }
        d(bVarR);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    public void d(a.e.a.b bVar) {
        i iVarV;
        if (bVar == null) {
            return;
        }
        if (g != null) {
            throw null;
        }
        boolean z = true;
        if (this.u + 1 >= this.v || this.t + 1 >= this.o) {
            y();
        }
        boolean z2 = false;
        if (!bVar.f229f) {
            bVar.D(this);
            if (bVar.isEmpty()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f224a = iVarP;
                int i2 = this.u;
                l(bVar);
                if (this.u == i2 + 1) {
                    this.z.c(bVar);
                    B(this.z, true);
                    if (iVarP.f250f == -1) {
                        if (bVar.f224a == iVarP && (iVarV = bVar.v(iVarP)) != null) {
                            if (g != null) {
                                throw null;
                            }
                            bVar.x(iVarV);
                        }
                        if (!bVar.f229f) {
                            bVar.f224a.h(this, bVar);
                        }
                        (f238e ? this.w.f230a : this.w.f231b).a(bVar);
                        this.u--;
                    }
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        l(bVar);
    }

    public a.e.a.b e(i iVar, i iVar2, int i2, int i3) {
        if (f235b && i3 == 8 && iVar2.i && iVar.f250f == -1) {
            iVar.f(this, iVar2.h + i2);
            return null;
        }
        a.e.a.b bVarR = r();
        bVarR.n(iVar, iVar2, i2);
        if (i3 != 8) {
            bVarR.d(this, i3);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i2) {
        a.e.a.b bVarR;
        if (f235b && iVar.f250f == -1) {
            float f2 = i2;
            iVar.f(this, f2);
            for (int i3 = 0; i3 < this.k + 1; i3++) {
                i iVar2 = this.w.f233d[i3];
                if (iVar2 != null && iVar2.p && iVar2.q == iVar.f249e) {
                    iVar2.f(this, iVar2.r + f2);
                }
            }
            return;
        }
        int i4 = iVar.f250f;
        if (i4 != -1) {
            a.e.a.b bVar = this.p[i4];
            if (!bVar.f229f) {
                if (bVar.f228e.k() == 0) {
                    bVar.f229f = true;
                } else {
                    bVarR = r();
                    bVarR.m(iVar, i2);
                }
            }
            bVar.f225b = i2;
            return;
        }
        bVarR = r();
        bVarR.i(iVar, i2);
        d(bVarR);
    }

    public void g(i iVar, i iVar2, int i2, boolean z) {
        a.e.a.b bVarR = r();
        i iVarT = t();
        iVarT.g = 0;
        bVarR.o(iVar, iVar2, iVarT, i2);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i2, int i3) {
        a.e.a.b bVarR = r();
        i iVarT = t();
        iVarT.g = 0;
        bVarR.o(iVar, iVar2, iVarT, i2);
        if (i3 != 8) {
            m(bVarR, (int) (bVarR.f228e.b(iVarT) * (-1.0f)), i3);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i2, boolean z) {
        a.e.a.b bVarR = r();
        i iVarT = t();
        iVarT.g = 0;
        bVarR.p(iVar, iVar2, iVarT, i2);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i2, int i3) {
        a.e.a.b bVarR = r();
        i iVarT = t();
        iVarT.g = 0;
        bVarR.p(iVar, iVar2, iVarT, i2);
        if (i3 != 8) {
            m(bVarR, (int) (bVarR.f228e.b(iVarT) * (-1.0f)), i3);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        a.e.a.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 8) {
            bVarR.d(this, i2);
        }
        d(bVarR);
    }

    void m(a.e.a.b bVar, int i2, int i3) {
        bVar.e(o(i3, null), i2);
    }

    public i o(int i2, String str) {
        if (g != null) {
            throw null;
        }
        if (this.t + 1 >= this.o) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i3 = this.k + 1;
        this.k = i3;
        this.t++;
        iVarA.f249e = i3;
        iVarA.g = i2;
        this.w.f233d[i3] = iVarA;
        this.m.b(iVarA);
        return iVarA;
    }

    public i p() {
        if (g != null) {
            throw null;
        }
        if (this.t + 1 >= this.o) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.k + 1;
        this.k = i2;
        this.t++;
        iVarA.f249e = i2;
        this.w.f233d[i2] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarH = null;
        if (obj == null) {
            return null;
        }
        if (this.t + 1 >= this.o) {
            y();
        }
        if (obj instanceof a.e.a.m.d) {
            a.e.a.m.d dVar = (a.e.a.m.d) obj;
            iVarH = dVar.h();
            if (iVarH == null) {
                dVar.r(this.w);
                iVarH = dVar.h();
            }
            int i2 = iVarH.f249e;
            if (i2 == -1 || i2 > this.k || this.w.f233d[i2] == null) {
                if (i2 != -1) {
                    iVarH.e();
                }
                int i3 = this.k + 1;
                this.k = i3;
                this.t++;
                iVarH.f249e = i3;
                iVarH.l = i.a.UNRESTRICTED;
                this.w.f233d[i3] = iVarH;
            }
        }
        return iVarH;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0038 A[PHI: r0
      0x0038: PHI (r0v6 a.e.a.b) = (r0v4 a.e.a.b), (r0v11 a.e.a.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    public a.e.a.b r() {
        a.e.a.b bVarB;
        if (f238e) {
            bVarB = this.w.f230a.b();
            if (bVarB == null) {
                bVarB = new b(this.w);
                i++;
            } else {
                bVarB.y();
            }
        } else {
            bVarB = this.w.f231b.b();
            if (bVarB == null) {
                bVarB = new a.e.a.b(this.w);
                h++;
            } else {
                bVarB.y();
            }
        }
        i.c();
        return bVarB;
    }

    public i t() {
        if (g != null) {
            throw null;
        }
        if (this.t + 1 >= this.o) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.k + 1;
        this.k = i2;
        this.t++;
        iVarA.f249e = i2;
        this.w.f233d[i2] = iVarA;
        return iVarA;
    }

    public c v() {
        return this.w;
    }

    public int x(Object obj) {
        i iVarH = ((a.e.a.m.d) obj).h();
        if (iVarH != null) {
            return (int) (iVarH.h + 0.5f);
        }
        return 0;
    }

    public void z() {
        if (g != null) {
            throw null;
        }
        if (this.m.isEmpty()) {
            n();
            return;
        }
        if (this.q || this.r) {
            if (g != null) {
                throw null;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.u) {
                    z = true;
                    break;
                } else if (!this.p[i2].f229f) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                if (g != null) {
                    throw null;
                }
                n();
                return;
            }
        }
        A(this.m);
    }
}
