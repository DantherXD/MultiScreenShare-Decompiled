package a.e.a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static float f218a = 0.001f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final c f221d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f219b = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f222e = 8;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f223f = null;
    private int[] g = new int[8];
    private int[] h = new int[8];
    private float[] i = new float[8];
    private int j = -1;
    private int k = -1;
    private boolean l = false;

    a(b bVar, c cVar) {
        this.f220c = bVar;
        this.f221d = cVar;
    }

    @Override // a.e.a.b.a
    public float a(int i) {
        int i2 = this.j;
        for (int i3 = 0; i2 != -1 && i3 < this.f219b; i3++) {
            if (i3 == i) {
                return this.i[i2];
            }
            i2 = this.h[i2];
        }
        return 0.0f;
    }

    @Override // a.e.a.b.a
    public final float b(i iVar) {
        int i = this.j;
        for (int i2 = 0; i != -1 && i2 < this.f219b; i2++) {
            if (this.g[i] == iVar.f249e) {
                return this.i[i];
            }
            i = this.h[i];
        }
        return 0.0f;
    }

    @Override // a.e.a.b.a
    public final float c(i iVar, boolean z) {
        if (this.f223f == iVar) {
            this.f223f = null;
        }
        int i = this.j;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f219b) {
            if (this.g[i] == iVar.f249e) {
                if (i == this.j) {
                    this.j = this.h[i];
                } else {
                    int[] iArr = this.h;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.d(this.f220c);
                }
                iVar.o--;
                this.f219b--;
                this.g[i] = -1;
                if (this.l) {
                    this.k = i;
                }
                return this.i[i];
            }
            i2++;
            i3 = i;
            i = this.h[i];
        }
        return 0.0f;
    }

    @Override // a.e.a.b.a
    public final void clear() {
        int i = this.j;
        for (int i2 = 0; i != -1 && i2 < this.f219b; i2++) {
            i iVar = this.f221d.f233d[this.g[i]];
            if (iVar != null) {
                iVar.d(this.f220c);
            }
            i = this.h[i];
        }
        this.j = -1;
        this.k = -1;
        this.l = false;
        this.f219b = 0;
    }

    @Override // a.e.a.b.a
    public boolean d(i iVar) {
        int i = this.j;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f219b; i2++) {
            if (this.g[i] == iVar.f249e) {
                return true;
            }
            i = this.h[i];
        }
        return false;
    }

    @Override // a.e.a.b.a
    public float e(b bVar, boolean z) {
        float fB = b(bVar.f224a);
        c(bVar.f224a, z);
        b.a aVar = bVar.f228e;
        int iK = aVar.k();
        for (int i = 0; i < iK; i++) {
            i iVarG = aVar.g(i);
            h(iVarG, aVar.b(iVarG) * fB, z);
        }
        return fB;
    }

    @Override // a.e.a.b.a
    public final void f(i iVar, float f2) {
        if (f2 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i = this.j;
        if (i == -1) {
            this.j = 0;
            this.i[0] = f2;
            this.g[0] = iVar.f249e;
            this.h[0] = -1;
            iVar.o++;
            iVar.a(this.f220c);
            this.f219b++;
            if (this.l) {
                return;
            }
            int i2 = this.k + 1;
            this.k = i2;
            int[] iArr = this.g;
            if (i2 >= iArr.length) {
                this.l = true;
                this.k = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f219b; i4++) {
            int[] iArr2 = this.g;
            int i5 = iArr2[i];
            int i6 = iVar.f249e;
            if (i5 == i6) {
                this.i[i] = f2;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.h[i];
        }
        int length = this.k;
        int i7 = length + 1;
        if (this.l) {
            int[] iArr3 = this.g;
            if (iArr3[length] != -1) {
                length = iArr3.length;
            }
        } else {
            length = i7;
        }
        int[] iArr4 = this.g;
        if (length >= iArr4.length && this.f219b < iArr4.length) {
            int i8 = 0;
            while (true) {
                int[] iArr5 = this.g;
                if (i8 >= iArr5.length) {
                    break;
                }
                if (iArr5[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr6 = this.g;
        if (length >= iArr6.length) {
            length = iArr6.length;
            int i9 = this.f222e * 2;
            this.f222e = i9;
            this.l = false;
            this.k = length - 1;
            this.i = Arrays.copyOf(this.i, i9);
            this.g = Arrays.copyOf(this.g, this.f222e);
            this.h = Arrays.copyOf(this.h, this.f222e);
        }
        this.g[length] = iVar.f249e;
        this.i[length] = f2;
        int[] iArr7 = this.h;
        if (i3 != -1) {
            iArr7[length] = iArr7[i3];
            iArr7[i3] = length;
        } else {
            iArr7[length] = this.j;
            this.j = length;
        }
        iVar.o++;
        iVar.a(this.f220c);
        int i10 = this.f219b + 1;
        this.f219b = i10;
        if (!this.l) {
            this.k++;
        }
        int[] iArr8 = this.g;
        if (i10 >= iArr8.length) {
            this.l = true;
        }
        if (this.k >= iArr8.length) {
            this.l = true;
            this.k = iArr8.length - 1;
        }
    }

    @Override // a.e.a.b.a
    public i g(int i) {
        int i2 = this.j;
        for (int i3 = 0; i2 != -1 && i3 < this.f219b; i3++) {
            if (i3 == i) {
                return this.f221d.f233d[this.g[i2]];
            }
            i2 = this.h[i2];
        }
        return null;
    }

    @Override // a.e.a.b.a
    public void h(i iVar, float f2, boolean z) {
        float f3 = f218a;
        if (f2 <= (-f3) || f2 >= f3) {
            int i = this.j;
            if (i == -1) {
                this.j = 0;
                this.i[0] = f2;
                this.g[0] = iVar.f249e;
                this.h[0] = -1;
                iVar.o++;
                iVar.a(this.f220c);
                this.f219b++;
                if (this.l) {
                    return;
                }
                int i2 = this.k + 1;
                this.k = i2;
                int[] iArr = this.g;
                if (i2 >= iArr.length) {
                    this.l = true;
                    this.k = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f219b; i4++) {
                int[] iArr2 = this.g;
                int i5 = iArr2[i];
                int i6 = iVar.f249e;
                if (i5 == i6) {
                    float[] fArr = this.i;
                    float f4 = fArr[i] + f2;
                    float f5 = f218a;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i] = f4;
                    if (f4 == 0.0f) {
                        if (i == this.j) {
                            this.j = this.h[i];
                        } else {
                            int[] iArr3 = this.h;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            iVar.d(this.f220c);
                        }
                        if (this.l) {
                            this.k = i;
                        }
                        iVar.o--;
                        this.f219b--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.h[i];
            }
            int length = this.k;
            int i7 = length + 1;
            if (this.l) {
                int[] iArr4 = this.g;
                if (iArr4[length] != -1) {
                    length = iArr4.length;
                }
            } else {
                length = i7;
            }
            int[] iArr5 = this.g;
            if (length >= iArr5.length && this.f219b < iArr5.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr6 = this.g;
                    if (i8 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr7 = this.g;
            if (length >= iArr7.length) {
                length = iArr7.length;
                int i9 = this.f222e * 2;
                this.f222e = i9;
                this.l = false;
                this.k = length - 1;
                this.i = Arrays.copyOf(this.i, i9);
                this.g = Arrays.copyOf(this.g, this.f222e);
                this.h = Arrays.copyOf(this.h, this.f222e);
            }
            this.g[length] = iVar.f249e;
            this.i[length] = f2;
            int[] iArr8 = this.h;
            if (i3 != -1) {
                iArr8[length] = iArr8[i3];
                iArr8[i3] = length;
            } else {
                iArr8[length] = this.j;
                this.j = length;
            }
            iVar.o++;
            iVar.a(this.f220c);
            this.f219b++;
            if (!this.l) {
                this.k++;
            }
            int i10 = this.k;
            int[] iArr9 = this.g;
            if (i10 >= iArr9.length) {
                this.l = true;
                this.k = iArr9.length - 1;
            }
        }
    }

    @Override // a.e.a.b.a
    public void i(float f2) {
        int i = this.j;
        for (int i2 = 0; i != -1 && i2 < this.f219b; i2++) {
            float[] fArr = this.i;
            fArr[i] = fArr[i] / f2;
            i = this.h[i];
        }
    }

    @Override // a.e.a.b.a
    public void j() {
        int i = this.j;
        for (int i2 = 0; i != -1 && i2 < this.f219b; i2++) {
            float[] fArr = this.i;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.h[i];
        }
    }

    @Override // a.e.a.b.a
    public int k() {
        return this.f219b;
    }

    public String toString() {
        int i = this.j;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f219b; i2++) {
            str = ((str + " -> ") + this.i[i] + " : ") + this.f221d.f233d[this.g[i]];
            i = this.h[i];
        }
        return str;
    }
}
