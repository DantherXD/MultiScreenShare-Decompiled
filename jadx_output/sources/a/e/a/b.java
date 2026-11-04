package a.e.a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f228e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f224a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f225b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f226c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<i> f227d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f229f = false;

    public interface a {
        float a(int i);

        float b(i iVar);

        float c(i iVar, boolean z);

        void clear();

        boolean d(i iVar);

        float e(b bVar, boolean z);

        void f(i iVar, float f2);

        i g(int i);

        void h(i iVar, float f2, boolean z);

        void i(float f2);

        void j();

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f228e = new a.e.a.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.o <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iK = this.f228e.k();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < iK; i++) {
            float fA = this.f228e.a(i);
            if (fA < 0.0f) {
                i iVarG = this.f228e.g(i);
                if ((zArr == null || !zArr[iVarG.f249e]) && iVarG != iVar && (((aVar = iVarG.l) == i.a.SLACK || aVar == i.a.ERROR) && fA < f2)) {
                    f2 = fA;
                    iVar2 = iVarG;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z) {
        if (iVar == null || !iVar.i) {
            return;
        }
        this.f225b += iVar.h * this.f228e.b(iVar);
        this.f228e.c(iVar, z);
        if (z) {
            iVar.d(this);
        }
        if (d.f236c && this.f228e.k() == 0) {
            this.f229f = true;
            dVar.j = true;
        }
    }

    public void B(d dVar, b bVar, boolean z) {
        this.f225b += bVar.f225b * this.f228e.e(bVar, z);
        if (z) {
            bVar.f224a.d(this);
        }
        if (d.f236c && this.f224a != null && this.f228e.k() == 0) {
            this.f229f = true;
            dVar.j = true;
        }
    }

    public void C(d dVar, i iVar, boolean z) {
        if (iVar == null || !iVar.p) {
            return;
        }
        float fB = this.f228e.b(iVar);
        this.f225b += iVar.r * fB;
        this.f228e.c(iVar, z);
        if (z) {
            iVar.d(this);
        }
        this.f228e.h(dVar.w.f233d[iVar.q], fB, z);
        if (d.f236c && this.f228e.k() == 0) {
            this.f229f = true;
            dVar.j = true;
        }
    }

    public void D(d dVar) {
        if (dVar.p.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int iK = this.f228e.k();
            for (int i = 0; i < iK; i++) {
                i iVarG = this.f228e.g(i);
                if (iVarG.f250f != -1 || iVarG.i || iVarG.p) {
                    this.f227d.add(iVarG);
                }
            }
            int size = this.f227d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = this.f227d.get(i2);
                    if (iVar.i) {
                        A(dVar, iVar, true);
                    } else if (iVar.p) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.p[iVar.f250f], true);
                    }
                }
                this.f227d.clear();
            } else {
                z = true;
            }
        }
        if (d.f236c && this.f224a != null && this.f228e.k() == 0) {
            this.f229f = true;
            dVar.j = true;
        }
    }

    @Override // a.e.a.d.a
    public i a(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // a.e.a.d.a
    public void b(i iVar) {
        int i = iVar.g;
        float f2 = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f2 = 1000.0f;
            } else if (i == 3) {
                f2 = 1000000.0f;
            } else if (i == 4) {
                f2 = 1.0E9f;
            } else if (i == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f228e.f(iVar, f2);
    }

    @Override // a.e.a.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f224a = null;
            this.f228e.clear();
            for (int i = 0; i < bVar.f228e.k(); i++) {
                this.f228e.h(bVar.f228e.g(i), bVar.f228e.a(i), true);
            }
        }
    }

    @Override // a.e.a.d.a
    public void clear() {
        this.f228e.clear();
        this.f224a = null;
        this.f225b = 0.0f;
    }

    public b d(d dVar, int i) {
        this.f228e.f(dVar.o(i, "ep"), 1.0f);
        this.f228e.f(dVar.o(i, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i) {
        this.f228e.f(iVar, i);
        return this;
    }

    boolean f(d dVar) {
        boolean z;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z = true;
        } else {
            x(iVarG);
            z = false;
        }
        if (this.f228e.k() == 0) {
            this.f229f = true;
        }
        return z;
    }

    i g(d dVar) {
        int iK = this.f228e.k();
        i iVar = null;
        boolean zU = false;
        boolean zU2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        i iVar2 = null;
        for (int i = 0; i < iK; i++) {
            float fA = this.f228e.a(i);
            i iVarG = this.f228e.g(i);
            if (iVarG.l == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > fA) {
                    zU = u(iVarG, dVar);
                    f2 = fA;
                    iVar = iVarG;
                } else if (!zU && u(iVarG, dVar)) {
                    f2 = fA;
                    iVar = iVarG;
                    zU = true;
                }
            } else if (iVar == null && fA < 0.0f) {
                if (iVar2 == null || f3 > fA) {
                    zU2 = u(iVarG, dVar);
                    f3 = fA;
                    iVar2 = iVarG;
                } else if (!zU2 && u(iVarG, dVar)) {
                    f3 = fA;
                    iVar2 = iVarG;
                    zU2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // a.e.a.d.a
    public i getKey() {
        return this.f224a;
    }

    b h(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i2) {
        float f3;
        int i3;
        if (iVar2 == iVar3) {
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar4, 1.0f);
            this.f228e.f(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar2, -1.0f);
            this.f228e.f(iVar3, -1.0f);
            this.f228e.f(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
                f3 = i3;
                this.f225b = f3;
            }
        } else {
            if (f2 <= 0.0f) {
                this.f228e.f(iVar, -1.0f);
                this.f228e.f(iVar2, 1.0f);
                f3 = i;
            } else if (f2 >= 1.0f) {
                this.f228e.f(iVar4, -1.0f);
                this.f228e.f(iVar3, 1.0f);
                i3 = -i2;
                f3 = i3;
            } else {
                float f4 = 1.0f - f2;
                this.f228e.f(iVar, f4 * 1.0f);
                this.f228e.f(iVar2, f4 * (-1.0f));
                this.f228e.f(iVar3, (-1.0f) * f2);
                this.f228e.f(iVar4, 1.0f * f2);
                if (i > 0 || i2 > 0) {
                    f3 = ((-i) * f4) + (i2 * f2);
                }
            }
            this.f225b = f3;
        }
        return this;
    }

    b i(i iVar, int i) {
        this.f224a = iVar;
        float f2 = i;
        iVar.h = f2;
        this.f225b = f2;
        this.f229f = true;
        return this;
    }

    @Override // a.e.a.d.a
    public boolean isEmpty() {
        return this.f224a == null && this.f225b == 0.0f && this.f228e.k() == 0;
    }

    b j(i iVar, i iVar2, float f2) {
        this.f228e.f(iVar, -1.0f);
        this.f228e.f(iVar2, f2);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f228e.f(iVar, -1.0f);
        this.f228e.f(iVar2, 1.0f);
        this.f228e.f(iVar3, f2);
        this.f228e.f(iVar4, -f2);
        return this;
    }

    public b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f225b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar2, -1.0f);
            this.f228e.f(iVar4, 1.0f);
            this.f228e.f(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f228e.f(iVar3, 1.0f);
            this.f228e.f(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar2, -1.0f);
            this.f228e.f(iVar4, f5);
            this.f228e.f(iVar3, -f5);
        }
        return this;
    }

    public b m(i iVar, int i) {
        a aVar;
        float f2;
        if (i < 0) {
            this.f225b = i * (-1);
            aVar = this.f228e;
            f2 = 1.0f;
        } else {
            this.f225b = i;
            aVar = this.f228e;
            f2 = -1.0f;
        }
        aVar.f(iVar, f2);
        return this;
    }

    public b n(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f225b = i;
        }
        if (z) {
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar2, -1.0f);
        } else {
            this.f228e.f(iVar, -1.0f);
            this.f228e.f(iVar2, 1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f225b = i;
        }
        if (z) {
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar2, -1.0f);
            this.f228e.f(iVar3, -1.0f);
        } else {
            this.f228e.f(iVar, -1.0f);
            this.f228e.f(iVar2, 1.0f);
            this.f228e.f(iVar3, 1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f225b = i;
        }
        if (z) {
            this.f228e.f(iVar, 1.0f);
            this.f228e.f(iVar2, -1.0f);
            this.f228e.f(iVar3, 1.0f);
        } else {
            this.f228e.f(iVar, -1.0f);
            this.f228e.f(iVar2, 1.0f);
            this.f228e.f(iVar3, -1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f228e.f(iVar3, 0.5f);
        this.f228e.f(iVar4, 0.5f);
        this.f228e.f(iVar, -0.5f);
        this.f228e.f(iVar2, -0.5f);
        this.f225b = -f2;
        return this;
    }

    void r() {
        float f2 = this.f225b;
        if (f2 < 0.0f) {
            this.f225b = f2 * (-1.0f);
            this.f228e.j();
        }
    }

    boolean s() {
        i iVar = this.f224a;
        return iVar != null && (iVar.l == i.a.UNRESTRICTED || this.f225b >= 0.0f);
    }

    boolean t(i iVar) {
        return this.f228e.d(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f224a;
        if (iVar2 != null) {
            this.f228e.f(iVar2, -1.0f);
            this.f224a.f250f = -1;
            this.f224a = null;
        }
        float fC = this.f228e.c(iVar, true) * (-1.0f);
        this.f224a = iVar;
        if (fC == 1.0f) {
            return;
        }
        this.f225b /= fC;
        this.f228e.i(fC);
    }

    public void y() {
        this.f224a = null;
        this.f228e.clear();
        this.f225b = 0.0f;
        this.f229f = false;
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1095)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1049)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    java.lang.String z() {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.b.z():java.lang.String");
    }
}
