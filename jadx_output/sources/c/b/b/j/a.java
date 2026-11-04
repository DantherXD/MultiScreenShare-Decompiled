package c.b.b.j;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f2869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f2870c;

    public a() {
        this.f2870c = 0;
        this.f2869b = new int[1];
    }

    a(int[] iArr, int i) {
        this.f2869b = iArr;
        this.f2870c = i;
    }

    private void e(int i) {
        if (i > (this.f2869b.length << 5)) {
            int[] iArrI = i(i);
            int[] iArr = this.f2869b;
            System.arraycopy(iArr, 0, iArrI, 0, iArr.length);
            this.f2869b = iArrI;
        }
    }

    private static int[] i(int i) {
        return new int[(i + 31) / 32];
    }

    public void a(boolean z) {
        e(this.f2870c + 1);
        if (z) {
            int[] iArr = this.f2869b;
            int i = this.f2870c;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.f2870c++;
    }

    public void b(a aVar) {
        int i = aVar.f2870c;
        e(this.f2870c + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(aVar.f(i2));
        }
    }

    public void c(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        e(this.f2870c + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a clone() {
        return new a((int[]) this.f2869b.clone(), this.f2870c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2870c == aVar.f2870c && Arrays.equals(this.f2869b, aVar.f2869b);
    }

    public boolean f(int i) {
        return (this.f2869b[i / 32] & (1 << (i & 31))) != 0;
    }

    public int g() {
        return this.f2870c;
    }

    public int h() {
        return (this.f2870c + 7) / 8;
    }

    public int hashCode() {
        return (this.f2870c * 31) + Arrays.hashCode(this.f2869b);
    }

    public void j(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (f(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    public void k(a aVar) {
        if (this.f2870c != aVar.f2870c) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f2869b;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ aVar.f2869b[i];
            i++;
        }
    }

    public String toString() {
        int i = this.f2870c;
        StringBuilder sb = new StringBuilder(i + (i / 8) + 1);
        for (int i2 = 0; i2 < this.f2870c; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(f(i2) ? 'X' : '.');
        }
        return sb.toString();
    }
}
