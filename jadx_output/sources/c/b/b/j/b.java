package c.b.b.j;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2873d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f2874e;

    public b(int i) {
        this(i, i);
    }

    public b(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f2871b = i;
        this.f2872c = i2;
        int i3 = (i + 31) / 32;
        this.f2873d = i3;
        this.f2874e = new int[i3 * i2];
    }

    private b(int i, int i2, int i3, int[] iArr) {
        this.f2871b = i;
        this.f2872c = i2;
        this.f2873d = i3;
        this.f2874e = iArr;
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.f2872c * (this.f2871b + 1));
        for (int i = 0; i < this.f2872c; i++) {
            for (int i2 = 0; i2 < this.f2871b; i2++) {
                sb.append(d(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public void b() {
        int length = this.f2874e.length;
        for (int i = 0; i < length; i++) {
            this.f2874e[i] = 0;
        }
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f2871b, this.f2872c, this.f2873d, (int[]) this.f2874e.clone());
    }

    public boolean d(int i, int i2) {
        return ((this.f2874e[(i2 * this.f2873d) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public int e() {
        return this.f2872c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2871b == bVar.f2871b && this.f2872c == bVar.f2872c && this.f2873d == bVar.f2873d && Arrays.equals(this.f2874e, bVar.f2874e);
    }

    public int f() {
        return this.f2871b;
    }

    public void g(int i, int i2) {
        int i3 = (i2 * this.f2873d) + (i / 32);
        int[] iArr = this.f2874e;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public void h(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f2872c || i5 > this.f2871b) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.f2873d * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.f2874e;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public int hashCode() {
        int i = this.f2871b;
        return (((((((i * 31) + i) * 31) + this.f2872c) * 31) + this.f2873d) * 31) + Arrays.hashCode(this.f2874e);
    }

    public String i(String str, String str2) {
        return a(str, str2, "\n");
    }

    public String toString() {
        return i("X ", "  ");
    }
}
