package a.e.a;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends a.e.a.b {
    private int g;
    private i[] h;
    private i[] i;
    private int j;
    b k;
    c l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f249e - iVar2.f249e;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f244b;

        public b(h hVar) {
            this.f244b = hVar;
        }

        public boolean a(i iVar, float f2) {
            boolean z = true;
            if (!this.f243a.f247c) {
                for (int i = 0; i < 9; i++) {
                    float f3 = iVar.k[i];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f243a.k[i] = f4;
                    } else {
                        this.f243a.k[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f243a.k;
                fArr[i2] = fArr[i2] + (iVar.k[i2] * f2);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.f243a.k[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                h.this.G(this.f243a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f243a = iVar;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f2 = this.f243a.k[i];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            for (int i = 8; i >= 0; i--) {
                float f2 = iVar.k[i];
                float f3 = this.f243a.k[i];
                if (f3 != f2) {
                    if (f3 < f2) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f243a.k, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f243a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f243a.k[i] + " ";
                }
            }
            return str + "] " + this.f243a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.g = 128;
        this.h = new i[128];
        this.i = new i[128];
        this.j = 0;
        this.k = new b(this);
        this.l = cVar;
    }

    private final void F(i iVar) {
        int i;
        int i2 = this.j + 1;
        i[] iVarArr = this.h;
        if (i2 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.h = iVarArr2;
            this.i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.h;
        int i3 = this.j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f249e > iVar.f249e) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a());
            for (int i6 = 0; i6 < this.j; i6++) {
                this.h[i6] = this.i[i6];
            }
        }
        iVar.f247c = true;
        iVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i = 0;
        while (i < this.j) {
            if (this.h[i] == iVar) {
                while (true) {
                    int i2 = this.j;
                    if (i >= i2 - 1) {
                        this.j = i2 - 1;
                        iVar.f247c = false;
                        return;
                    } else {
                        i[] iVarArr = this.h;
                        int i3 = i + 1;
                        iVarArr[i] = iVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // a.e.a.b
    public void B(d dVar, a.e.a.b bVar, boolean z) {
        i iVar = bVar.f224a;
        if (iVar == null) {
            return;
        }
        a.e.a.b.a aVar = bVar.f228e;
        int iK = aVar.k();
        for (int i = 0; i < iK; i++) {
            i iVarG = aVar.g(i);
            float fA = aVar.a(i);
            this.k.b(iVarG);
            if (this.k.a(iVar, fA)) {
                F(iVarG);
            }
            this.f225b += bVar.f225b * fA;
        }
        G(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    @Override // a.e.a.b, a.e.a.d.a
    public i a(d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            i iVar = this.h[i2];
            if (!zArr[iVar.f249e]) {
                this.k.b(iVar);
                b bVar = this.k;
                if (i == -1) {
                    if (bVar.c()) {
                        i = i2;
                    }
                } else if (bVar.d(this.h[i])) {
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.h[i];
    }

    @Override // a.e.a.b, a.e.a.d.a
    public void b(i iVar) {
        this.k.b(iVar);
        this.k.e();
        iVar.k[iVar.g] = 1.0f;
        F(iVar);
    }

    @Override // a.e.a.b, a.e.a.d.a
    public void clear() {
        this.j = 0;
        this.f225b = 0.0f;
    }

    @Override // a.e.a.b, a.e.a.d.a
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // a.e.a.b
    public String toString() {
        String str = " goal -> (" + this.f225b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.b(this.h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
