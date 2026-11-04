package a.e.a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f256a = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f257b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f258c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f259d = 16;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f260e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f261f = new int[16];
    int[] g = new int[16];
    float[] h = new float[16];
    int[] i = new int[16];
    int[] j = new int[16];
    int k = 0;
    int l = -1;
    private final b m;
    protected final c n;

    j(b bVar, c cVar) {
        this.m = bVar;
        this.n = cVar;
        clear();
    }

    private void l(i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f249e % this.f259d;
        int[] iArr2 = this.f260e;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f261f;
                if (iArr[i3] == -1) {
                    break;
                } else {
                    i3 = iArr[i3];
                }
            }
            iArr[i3] = i;
        }
        this.f261f[i] = -1;
    }

    private void m(int i, i iVar, float f2) {
        this.g[i] = iVar.f249e;
        this.h[i] = f2;
        this.i[i] = -1;
        this.j[i] = -1;
        iVar.a(this.m);
        iVar.o++;
        this.k++;
    }

    private int n() {
        for (int i = 0; i < this.f258c; i++) {
            if (this.g[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void o() {
        int i = this.f258c * 2;
        this.g = Arrays.copyOf(this.g, i);
        this.h = Arrays.copyOf(this.h, i);
        this.i = Arrays.copyOf(this.i, i);
        this.j = Arrays.copyOf(this.j, i);
        this.f261f = Arrays.copyOf(this.f261f, i);
        for (int i2 = this.f258c; i2 < i; i2++) {
            this.g[i2] = -1;
            this.f261f[i2] = -1;
        }
        this.f258c = i;
    }

    private void q(int i, i iVar, float f2) {
        int iN = n();
        m(iN, iVar, f2);
        if (i != -1) {
            this.i[iN] = i;
            int[] iArr = this.j;
            iArr[iN] = iArr[i];
            iArr[i] = iN;
        } else {
            this.i[iN] = -1;
            if (this.k > 0) {
                this.j[iN] = this.l;
                this.l = iN;
            } else {
                this.j[iN] = -1;
            }
        }
        int[] iArr2 = this.j;
        if (iArr2[iN] != -1) {
            this.i[iArr2[iN]] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i = iVar.f249e;
        int i2 = i % this.f259d;
        int[] iArr2 = this.f260e;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            return;
        }
        if (this.g[i3] == i) {
            int[] iArr3 = this.f261f;
            iArr2[i2] = iArr3[i3];
            iArr3[i3] = -1;
            return;
        }
        while (true) {
            iArr = this.f261f;
            if (iArr[i3] == -1 || this.g[iArr[i3]] == i) {
                break;
            } else {
                i3 = iArr[i3];
            }
        }
        int i4 = iArr[i3];
        if (i4 == -1 || this.g[i4] != i) {
            return;
        }
        iArr[i3] = iArr[i4];
        iArr[i4] = -1;
    }

    @Override // a.e.a.b.a
    public float a(int i) {
        int i2 = this.k;
        int i3 = this.l;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.h[i3];
            }
            i3 = this.j[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // a.e.a.b.a
    public float b(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.h[iP];
        }
        return 0.0f;
    }

    @Override // a.e.a.b.a
    public float c(i iVar, boolean z) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.h[iP];
        if (this.l == iP) {
            this.l = this.j[iP];
        }
        this.g[iP] = -1;
        int[] iArr = this.i;
        if (iArr[iP] != -1) {
            int[] iArr2 = this.j;
            iArr2[iArr[iP]] = iArr2[iP];
        }
        int[] iArr3 = this.j;
        if (iArr3[iP] != -1) {
            iArr[iArr3[iP]] = iArr[iP];
        }
        this.k--;
        iVar.o--;
        if (z) {
            iVar.d(this.m);
        }
        return f2;
    }

    @Override // a.e.a.b.a
    public void clear() {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            i iVarG = g(i2);
            if (iVarG != null) {
                iVarG.d(this.m);
            }
        }
        for (int i3 = 0; i3 < this.f258c; i3++) {
            this.g[i3] = -1;
            this.f261f[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f259d; i4++) {
            this.f260e[i4] = -1;
        }
        this.k = 0;
        this.l = -1;
    }

    @Override // a.e.a.b.a
    public boolean d(i iVar) {
        return p(iVar) != -1;
    }

    @Override // a.e.a.b.a
    public float e(b bVar, boolean z) {
        float fB = b(bVar.f224a);
        c(bVar.f224a, z);
        j jVar = (j) bVar.f228e;
        int iK = jVar.k();
        int i = 0;
        int i2 = 0;
        while (i < iK) {
            int[] iArr = jVar.g;
            if (iArr[i2] != -1) {
                h(this.n.f233d[iArr[i2]], jVar.h[i2] * fB, z);
                i++;
            }
            i2++;
        }
        return fB;
    }

    @Override // a.e.a.b.a
    public void f(i iVar, float f2) {
        float f3 = f256a;
        if (f2 > (-f3) && f2 < f3) {
            c(iVar, true);
            return;
        }
        if (this.k == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.l = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.h[iP] = f2;
            return;
        }
        if (this.k + 1 >= this.f258c) {
            o();
        }
        int i = this.k;
        int i2 = this.l;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.g;
            int i5 = iArr[i2];
            int i6 = iVar.f249e;
            if (i5 == i6) {
                this.h[i2] = f2;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.j[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, iVar, f2);
    }

    @Override // a.e.a.b.a
    public i g(int i) {
        int i2 = this.k;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.l;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.n.f233d[this.g[i3]];
            }
            i3 = this.j[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // a.e.a.b.a
    public void h(i iVar, float f2, boolean z) {
        float f3 = f256a;
        if (f2 <= (-f3) || f2 >= f3) {
            int iP = p(iVar);
            if (iP == -1) {
                f(iVar, f2);
                return;
            }
            float[] fArr = this.h;
            fArr[iP] = fArr[iP] + f2;
            float f4 = fArr[iP];
            float f5 = f256a;
            if (f4 <= (-f5) || fArr[iP] >= f5) {
                return;
            }
            fArr[iP] = 0.0f;
            c(iVar, z);
        }
    }

    @Override // a.e.a.b.a
    public void i(float f2) {
        int i = this.k;
        int i2 = this.l;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.j[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // a.e.a.b.a
    public void j() {
        int i = this.k;
        int i2 = this.l;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.h;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.j[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // a.e.a.b.a
    public int k() {
        return this.k;
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.k != 0 && iVar != null) {
            int i = iVar.f249e;
            int i2 = this.f260e[i % this.f259d];
            if (i2 == -1) {
                return -1;
            }
            if (this.g[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.f261f;
                if (iArr[i2] == -1 || this.g[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            if (iArr[i2] != -1 && this.g[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            i iVarG = g(i2);
            if (iVarG != null) {
                String str2 = str + iVarG + " = " + a(i2) + " ";
                int iP = p(iVarG);
                String str3 = str2 + "[p: ";
                if (this.i[iP] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.n.f233d[this.g[this.i[iP]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.j[iP] != -1 ? str4 + this.n.f233d[this.g[this.j[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
