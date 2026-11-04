package c.a.a.j;

import java.io.IOException;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class z extends Writer {
    static final byte[] h;
    static final byte[] i;
    public static final char[] k;
    protected char[] l;
    protected int m;
    protected int n;
    protected final Writer o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<char[]> f2540b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int[] f2541c = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final char[] f2542d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final char[] f2543e = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final char[] f2544f = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    static final char[] g = {'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', 'A', '0', 'B', '0', 'C', '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', 'A', '1', 'B', '1', 'C', '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', 'A', '2', 'B', '2', 'C', '2', 'D', '2', 'E', '2', 'F'};
    static final char[] j = new char[93];

    static {
        byte[] bArr = new byte[161];
        h = bArr;
        byte[] bArr2 = new byte[161];
        i = bArr2;
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i2 = 14; i2 <= 31; i2++) {
            h[i2] = 4;
            i[i2] = 4;
        }
        for (int i3 = 127; i3 < 160; i3++) {
            h[i3] = 4;
            i[i3] = 4;
        }
        char[] cArr = j;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = 't';
        cArr[10] = 'n';
        cArr[11] = 'v';
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        k = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    }

    public z(Writer writer, int i2, a0[] a0VarArr) {
        this.o = writer;
        ThreadLocal<char[]> threadLocal = f2540b;
        char[] cArr = threadLocal.get();
        this.l = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        }
        if (this.l == null) {
            this.l = new char[1024];
        }
        for (a0 a0Var : a0VarArr) {
            i2 |= a0Var.z;
        }
        this.n = i2;
    }

    protected static void f(long j2, int i2, char[] cArr) {
        char c2;
        if (j2 < 0) {
            c2 = '-';
            j2 = -j2;
        } else {
            c2 = 0;
        }
        while (j2 > 2147483647L) {
            long j3 = j2 / 100;
            int i3 = (int) (j2 - (((j3 << 6) + (j3 << 5)) + (j3 << 2)));
            int i4 = i2 - 1;
            cArr[i4] = f2544f[i3];
            i2 = i4 - 1;
            cArr[i2] = f2543e[i3];
            j2 = j3;
        }
        int i5 = (int) j2;
        while (i5 >= 65536) {
            int i6 = i5 / 100;
            int i7 = i5 - (((i6 << 6) + (i6 << 5)) + (i6 << 2));
            int i8 = i2 - 1;
            cArr[i8] = f2544f[i7];
            i2 = i8 - 1;
            cArr[i2] = f2543e[i7];
            i5 = i6;
        }
        while (true) {
            int i9 = (52429 * i5) >>> 19;
            i2--;
            cArr[i2] = f2542d[i5 - ((i9 << 3) + (i9 << 1))];
            if (i9 == 0) {
                break;
            } else {
                i5 = i9;
            }
        }
        if (c2 != 0) {
            cArr[i2 - 1] = c2;
        }
    }

    private void l(String str) {
        int length = str.length();
        boolean z = true;
        int i2 = this.m + length + 1;
        if (i2 > this.l.length) {
            if (this.o != null) {
                if (length == 0) {
                    write(34);
                    write(34);
                    write(58);
                    return;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    }
                    char cCharAt = str.charAt(i3);
                    byte[] bArr = h;
                    if (cCharAt < bArr.length && bArr[cCharAt] != 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    write(34);
                }
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt2 = str.charAt(i4);
                    byte[] bArr2 = h;
                    if (cCharAt2 < bArr2.length && bArr2[cCharAt2] != 0) {
                        write(92);
                        cCharAt2 = j[cCharAt2];
                    }
                    write(cCharAt2);
                }
                if (z) {
                    write(34);
                }
                write(58);
                return;
            }
            e(i2);
        }
        if (length == 0) {
            int i5 = this.m;
            if (i5 + 3 > this.l.length) {
                e(i5 + 3);
            }
            char[] cArr = this.l;
            int i6 = this.m;
            int i7 = i6 + 1;
            this.m = i7;
            cArr[i6] = '\"';
            int i8 = i7 + 1;
            this.m = i8;
            cArr[i7] = '\"';
            this.m = i8 + 1;
            cArr[i8] = ':';
            return;
        }
        int i9 = this.m;
        int i10 = i9 + length;
        str.getChars(0, length, this.l, i9);
        this.m = i2;
        int i11 = i9;
        boolean z2 = false;
        while (i11 < i10) {
            char[] cArr2 = this.l;
            char c2 = cArr2[i11];
            byte[] bArr3 = h;
            if (c2 < bArr3.length && bArr3[c2] != 0) {
                if (z2) {
                    i2++;
                    if (i2 > cArr2.length) {
                        e(i2);
                    }
                    this.m = i2;
                    char[] cArr3 = this.l;
                    int i12 = i11 + 1;
                    System.arraycopy(cArr3, i12, cArr3, i11 + 2, i10 - i11);
                    char[] cArr4 = this.l;
                    cArr4[i11] = '\\';
                    cArr4[i12] = j[c2];
                    i10++;
                    i11 = i12;
                } else {
                    i2 += 3;
                    if (i2 > cArr2.length) {
                        e(i2);
                    }
                    this.m = i2;
                    char[] cArr5 = this.l;
                    int i13 = i11 + 1;
                    System.arraycopy(cArr5, i13, cArr5, i11 + 3, (i10 - i11) - 1);
                    char[] cArr6 = this.l;
                    System.arraycopy(cArr6, 0, cArr6, 1, i11);
                    char[] cArr7 = this.l;
                    cArr7[i9] = '\"';
                    cArr7[i13] = '\\';
                    int i14 = i13 + 1;
                    cArr7[i14] = j[c2];
                    i10 += 2;
                    cArr7[this.m - 2] = '\"';
                    i11 = i14;
                    z2 = true;
                }
            }
            i11++;
        }
        this.l[this.m - 1] = ':';
    }

    private void m(String str) {
        int length = str.length();
        boolean z = true;
        int i2 = this.m + length + 1;
        if (i2 > this.l.length) {
            if (this.o != null) {
                if (length == 0) {
                    write(39);
                    write(39);
                    write(58);
                    return;
                }
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = false;
                        break;
                    }
                    char cCharAt = str.charAt(i3);
                    byte[] bArr = i;
                    if (cCharAt < bArr.length && bArr[cCharAt] != 0) {
                        break;
                    } else {
                        i3++;
                    }
                }
                if (z) {
                    write(39);
                }
                for (int i4 = 0; i4 < length; i4++) {
                    char cCharAt2 = str.charAt(i4);
                    byte[] bArr2 = i;
                    if (cCharAt2 < bArr2.length && bArr2[cCharAt2] != 0) {
                        write(92);
                        cCharAt2 = j[cCharAt2];
                    }
                    write(cCharAt2);
                }
                if (z) {
                    write(39);
                }
                write(58);
                return;
            }
            e(i2);
        }
        if (length == 0) {
            int i5 = this.m;
            if (i5 + 3 > this.l.length) {
                e(i5 + 3);
            }
            char[] cArr = this.l;
            int i6 = this.m;
            int i7 = i6 + 1;
            this.m = i7;
            cArr[i6] = '\'';
            int i8 = i7 + 1;
            this.m = i8;
            cArr[i7] = '\'';
            this.m = i8 + 1;
            cArr[i8] = ':';
            return;
        }
        int i9 = this.m;
        int i10 = i9 + length;
        str.getChars(0, length, this.l, i9);
        this.m = i2;
        int i11 = i9;
        boolean z2 = false;
        while (i11 < i10) {
            char[] cArr2 = this.l;
            char c2 = cArr2[i11];
            byte[] bArr3 = i;
            if (c2 < bArr3.length && bArr3[c2] != 0) {
                if (z2) {
                    i2++;
                    if (i2 > cArr2.length) {
                        e(i2);
                    }
                    this.m = i2;
                    char[] cArr3 = this.l;
                    int i12 = i11 + 1;
                    System.arraycopy(cArr3, i12, cArr3, i11 + 2, i10 - i11);
                    char[] cArr4 = this.l;
                    cArr4[i11] = '\\';
                    cArr4[i12] = j[c2];
                    i10++;
                    i11 = i12;
                } else {
                    i2 += 3;
                    if (i2 > cArr2.length) {
                        e(i2);
                    }
                    this.m = i2;
                    char[] cArr5 = this.l;
                    int i13 = i11 + 1;
                    System.arraycopy(cArr5, i13, cArr5, i11 + 3, (i10 - i11) - 1);
                    char[] cArr6 = this.l;
                    System.arraycopy(cArr6, 0, cArr6, 1, i11);
                    char[] cArr7 = this.l;
                    cArr7[i9] = '\'';
                    cArr7[i13] = '\\';
                    int i14 = i13 + 1;
                    cArr7[i14] = j[c2];
                    i10 += 2;
                    cArr7[this.m - 2] = '\'';
                    i11 = i14;
                    z2 = true;
                }
            }
            i11++;
        }
        this.l[i2 - 1] = ':';
    }

    @Override // java.io.Writer, java.lang.Appendable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public z append(char c2) {
        write(c2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public z append(CharSequence charSequence) {
        String string = charSequence == null ? "null" : charSequence.toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public z append(CharSequence charSequence, int i2, int i3) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i2, i3).toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.o != null && this.m > 0) {
            flush();
        }
        char[] cArr = this.l;
        if (cArr.length <= 8192) {
            f2540b.set(cArr);
        }
        this.l = null;
    }

    public void d(a0 a0Var, boolean z) {
        int i2;
        if (z) {
            i2 = a0Var.z | this.n;
        } else {
            i2 = (~a0Var.z) & this.n;
        }
        this.n = i2;
    }

    protected void e(int i2) {
        char[] cArr = this.l;
        int length = ((cArr.length * 3) / 2) + 1;
        if (length >= i2) {
            i2 = length;
        }
        char[] cArr2 = new char[i2];
        System.arraycopy(cArr, 0, cArr2, 0, this.m);
        this.l = cArr2;
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        Writer writer = this.o;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.l, 0, this.m);
            this.o.flush();
            this.m = 0;
        } catch (IOException e2) {
            throw new c.a.a.d(e2.getMessage(), e2);
        }
    }

    public boolean g(a0 a0Var) {
        return (this.n & a0Var.z) != 0;
    }

    public void h(boolean z) {
        write(z ? "true" : "false");
    }

    public void i(byte[] bArr) {
        int length = bArr.length;
        boolean z = (this.n & a0.UseSingleQuotes.z) != 0;
        char c2 = z ? '\'' : '\"';
        if (length == 0) {
            write(z ? "''" : "\"\"");
            return;
        }
        char[] cArr = c.a.a.i.e.f2449d;
        int i2 = (length / 3) * 3;
        int i3 = length - 1;
        int i4 = this.m;
        int i5 = (((i3 / 3) + 1) << 2) + i4 + 2;
        if (i5 > this.l.length) {
            if (this.o != null) {
                write(c2);
                int i6 = 0;
                while (i6 < i2) {
                    int i7 = i6 + 1;
                    int i8 = i7 + 1;
                    int i9 = ((bArr[i6] & 255) << 16) | ((bArr[i7] & 255) << 8) | (bArr[i8] & 255);
                    write(cArr[(i9 >>> 18) & 63]);
                    write(cArr[(i9 >>> 12) & 63]);
                    write(cArr[(i9 >>> 6) & 63]);
                    write(cArr[i9 & 63]);
                    i6 = i8 + 1;
                }
                int i10 = length - i2;
                if (i10 > 0) {
                    int i11 = ((bArr[i2] & 255) << 10) | (i10 == 2 ? (bArr[i3] & 255) << 2 : 0);
                    write(cArr[i11 >> 12]);
                    write(cArr[(i11 >>> 6) & 63]);
                    write(i10 == 2 ? cArr[i11 & 63] : '=');
                    write(61);
                }
                write(c2);
                return;
            }
            e(i5);
        }
        this.m = i5;
        int i12 = i4 + 1;
        this.l[i4] = c2;
        int i13 = 0;
        while (i13 < i2) {
            int i14 = i13 + 1;
            int i15 = i14 + 1;
            int i16 = ((bArr[i13] & 255) << 16) | ((bArr[i14] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            char[] cArr2 = this.l;
            int i19 = i12 + 1;
            cArr2[i12] = cArr[(i18 >>> 18) & 63];
            int i20 = i19 + 1;
            cArr2[i19] = cArr[(i18 >>> 12) & 63];
            int i21 = i20 + 1;
            cArr2[i20] = cArr[(i18 >>> 6) & 63];
            i12 = i21 + 1;
            cArr2[i21] = cArr[i18 & 63];
            i13 = i17;
        }
        int i22 = length - i2;
        if (i22 > 0) {
            int i23 = ((bArr[i2] & 255) << 10) | (i22 == 2 ? (bArr[i3] & 255) << 2 : 0);
            char[] cArr3 = this.l;
            cArr3[i5 - 5] = cArr[i23 >> 12];
            cArr3[i5 - 4] = cArr[(i23 >>> 6) & 63];
            cArr3[i5 - 3] = i22 == 2 ? cArr[i23 & 63] : '=';
            cArr3[i5 - 2] = '=';
        }
        this.l[i5 - 1] = c2;
    }

    public void j(String str, boolean z) {
        int i2 = this.n;
        if ((a0.UseSingleQuotes.z & i2) == 0) {
            if ((i2 & a0.QuoteFieldNames.z) != 0) {
                q(str, ':', z);
                return;
            } else {
                l(str);
                return;
            }
        }
        if ((a0.QuoteFieldNames.z & i2) == 0) {
            m(str);
        } else {
            r(str);
            write(58);
        }
    }

    public void k(int i2) {
        int i3;
        if (i2 == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int i4 = i2 < 0 ? -i2 : i2;
        int i5 = 0;
        do {
            i3 = f2541c[i5];
            i5++;
        } while (i4 > i3);
        if (i2 < 0) {
            i5++;
        }
        int i6 = this.m + i5;
        if (i6 > this.l.length) {
            if (this.o != null) {
                char[] cArr = new char[i5];
                f(i2, i5, cArr);
                write(cArr, 0, i5);
                return;
            }
            e(i6);
        }
        f(i2, i6, this.l);
        this.m = i6;
    }

    public void n(long j2) {
        if (j2 == Long.MIN_VALUE) {
            write("-9223372036854775808");
            return;
        }
        long j3 = j2 < 0 ? -j2 : j2;
        int i2 = 1;
        long j4 = 10;
        while (true) {
            if (i2 >= 19) {
                i2 = 0;
                break;
            } else {
                if (j3 < j4) {
                    break;
                }
                j4 *= 10;
                i2++;
            }
        }
        int i3 = i2 != 0 ? i2 : 19;
        if (j2 < 0) {
            i3++;
        }
        int i4 = this.m + i3;
        if (i4 > this.l.length) {
            if (this.o != null) {
                char[] cArr = new char[i3];
                f(j2, i3, cArr);
                write(cArr, 0, i3);
                return;
            }
            e(i4);
        }
        f(j2, i4, this.l);
        this.m = i4;
    }

    public void o() {
        write("null");
    }

    public void p(String str) {
        if ((this.n & a0.UseSingleQuotes.z) != 0) {
            r(str);
        } else {
            q(str, (char) 0, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0090 A[PHI: r4 r13
      0x0090: PHI (r4v21 int) = (r4v16 int), (r4v22 int) binds: [B:74:0x00e0, B:40:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0090: PHI (r13v8 int) = (r13v4 int), (r13v9 int) binds: [B:74:0x00e0, B:40:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x0095 A[PHI: r4 r13 r14
      0x0095: PHI (r4v19 int) = (r4v16 int), (r4v18 int), (r4v22 int) binds: [B:74:0x00e0, B:51:0x00a8, B:40:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r13v6 int) = (r13v4 int), (r13v5 int), (r13v9 int) binds: [B:74:0x00e0, B:51:0x00a8, B:40:0x008e] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r14v12 int) = (r14v1 int), (r14v10 int), (r14v1 int) binds: [B:74:0x00e0, B:51:0x00a8, B:40:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c0  */
    protected void q(String str, char c2, boolean z) {
        int i2;
        boolean z2;
        if (str == null) {
            o();
            if (c2 != 0) {
                write(c2);
                return;
            }
            return;
        }
        int length = str.length();
        int i3 = this.m + length + 2;
        if (c2 != 0) {
            i3++;
        }
        char c3 = '/';
        if (i3 > this.l.length) {
            if (this.o != null) {
                write(34);
                for (int i4 = 0; i4 < str.length(); i4++) {
                    char cCharAt = str.charAt(i4);
                    byte[] bArr = h;
                    if ((cCharAt < bArr.length && bArr[cCharAt] != 0) || (cCharAt == '/' && (this.n & a0.WriteSlashAsSpecial.z) != 0)) {
                        write(92);
                        cCharAt = j[cCharAt];
                    }
                    write(cCharAt);
                }
                write(34);
                if (c2 != 0) {
                    write(c2);
                    return;
                }
                return;
            }
            e(i3);
        }
        int i5 = this.m;
        int i6 = i5 + 1;
        int i7 = i6 + length;
        char[] cArr = this.l;
        cArr[i5] = '\"';
        str.getChars(0, length, cArr, i6);
        this.m = i3;
        if (z) {
            int i8 = -1;
            int i9 = -1;
            int i10 = 0;
            char c4 = 0;
            int i11 = i6;
            while (i11 < i7) {
                char c5 = this.l[i11];
                if (c5 == 8232) {
                    i10++;
                    i3 += 4;
                    if (i8 == -1) {
                        c4 = c5;
                        i8 = i11;
                        i9 = i8;
                    } else {
                        c4 = c5;
                        i9 = i11;
                    }
                } else if (c5 < ']') {
                    if (c5 == ' ') {
                        z2 = false;
                    } else if (c5 != c3) {
                        z2 = c5 <= '#' ? true : true;
                    } else if ((a0.WriteSlashAsSpecial.z & this.n) == 0) {
                        if ((c5 <= '#' && c5 != '\\') || (c5 > 31 && c5 != '\\' && c5 != '\"')) {
                            z2 = false;
                        }
                    }
                    if (z2) {
                        i10++;
                        byte[] bArr2 = h;
                        if (c5 < bArr2.length && bArr2[c5] == 4) {
                            i3 += 4;
                        }
                        if (i8 == -1) {
                            c4 = c5;
                            i8 = i11;
                            i9 = i8;
                        } else {
                            c4 = c5;
                            i9 = i11;
                        }
                    }
                } else if (c5 >= 127 && c5 < 160) {
                    if (i8 == -1) {
                        i8 = i11;
                    }
                    i10++;
                    i3 += 4;
                    c4 = c5;
                    i9 = i11;
                }
                i11++;
                c3 = '/';
            }
            if (i10 > 0) {
                int i12 = i3 + i10;
                if (i12 > this.l.length) {
                    e(i12);
                }
                this.m = i12;
                if (i10 == 1) {
                    if (c4 == 8232) {
                        int i13 = i9 + 1;
                        char[] cArr2 = this.l;
                        System.arraycopy(cArr2, i13, cArr2, i9 + 6, (i7 - i9) - 1);
                        char[] cArr3 = this.l;
                        cArr3[i9] = '\\';
                        cArr3[i13] = 'u';
                        int i14 = i13 + 1;
                        cArr3[i14] = '2';
                        int i15 = i14 + 1;
                        cArr3[i15] = '0';
                        int i16 = i15 + 1;
                        cArr3[i16] = '2';
                        cArr3[i16 + 1] = '8';
                    } else {
                        byte[] bArr3 = h;
                        if (c4 >= bArr3.length || bArr3[c4] != 4) {
                            int i17 = i9 + 1;
                            char[] cArr4 = this.l;
                            System.arraycopy(cArr4, i17, cArr4, i9 + 2, (i7 - i9) - 1);
                            char[] cArr5 = this.l;
                            cArr5[i9] = '\\';
                            cArr5[i17] = j[c4];
                        } else {
                            int i18 = i9 + 1;
                            char[] cArr6 = this.l;
                            System.arraycopy(cArr6, i18, cArr6, i9 + 6, (i7 - i9) - 1);
                            char[] cArr7 = this.l;
                            cArr7[i9] = '\\';
                            int i19 = i18 + 1;
                            cArr7[i18] = 'u';
                            int i20 = i19 + 1;
                            char[] cArr8 = k;
                            cArr7[i19] = cArr8[(c4 >>> '\f') & 15];
                            int i21 = i20 + 1;
                            cArr7[i20] = cArr8[(c4 >>> '\b') & 15];
                            cArr7[i21] = cArr8[(c4 >>> 4) & 15];
                            cArr7[i21 + 1] = cArr8[c4 & 15];
                        }
                    }
                } else if (i10 > 1) {
                    for (int i22 = i8 - i6; i22 < str.length(); i22++) {
                        char cCharAt2 = str.charAt(i22);
                        byte[] bArr4 = h;
                        if ((cCharAt2 >= bArr4.length || bArr4[cCharAt2] == 0) && (cCharAt2 != '/' || (this.n & a0.WriteSlashAsSpecial.z) == 0)) {
                            char[] cArr9 = this.l;
                            int i23 = i8 + 1;
                            if (cCharAt2 == 8232) {
                                cArr9[i8] = '\\';
                                int i24 = i23 + 1;
                                cArr9[i23] = 'u';
                                int i25 = i24 + 1;
                                char[] cArr10 = k;
                                cArr9[i24] = cArr10[(cCharAt2 >>> '\f') & 15];
                                int i26 = i25 + 1;
                                cArr9[i25] = cArr10[(cCharAt2 >>> '\b') & 15];
                                int i27 = i26 + 1;
                                cArr9[i26] = cArr10[(cCharAt2 >>> 4) & 15];
                                cArr9[i27] = cArr10[cCharAt2 & 15];
                                i8 = i27 + 1;
                            } else {
                                cArr9[i8] = cCharAt2;
                                i8 = i23;
                            }
                        } else {
                            char[] cArr11 = this.l;
                            int i28 = i8 + 1;
                            cArr11[i8] = '\\';
                            if (bArr4[cCharAt2] == 4) {
                                int i29 = i28 + 1;
                                cArr11[i28] = 'u';
                                int i30 = i29 + 1;
                                char[] cArr12 = k;
                                cArr11[i29] = cArr12[(cCharAt2 >>> '\f') & 15];
                                int i31 = i30 + 1;
                                cArr11[i30] = cArr12[(cCharAt2 >>> '\b') & 15];
                                int i32 = i31 + 1;
                                cArr11[i31] = cArr12[(cCharAt2 >>> 4) & 15];
                                i2 = i32 + 1;
                                cArr11[i32] = cArr12[cCharAt2 & 15];
                            } else {
                                i2 = i28 + 1;
                                cArr11[i28] = j[cCharAt2];
                            }
                            i8 = i2;
                        }
                    }
                }
            }
        }
        if (c2 == 0) {
            this.l[this.m - 1] = '\"';
            return;
        }
        char[] cArr13 = this.l;
        int i33 = this.m;
        cArr13[i33 - 2] = '\"';
        cArr13[i33 - 1] = c2;
    }

    protected void r(String str) {
        int i2 = 0;
        if (str == null) {
            int i3 = this.m + 4;
            if (i3 > this.l.length) {
                e(i3);
            }
            "null".getChars(0, 4, this.l, this.m);
            this.m = i3;
            return;
        }
        int length = str.length();
        int i4 = this.m + length + 2;
        if (i4 > this.l.length) {
            if (this.o != null) {
                write(39);
                while (i2 < str.length()) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt <= '\r' || cCharAt == '\\' || cCharAt == '\'' || (cCharAt == '/' && (this.n & a0.WriteSlashAsSpecial.z) != 0)) {
                        write(92);
                        cCharAt = j[cCharAt];
                    }
                    write(cCharAt);
                    i2++;
                }
                write(39);
                return;
            }
            e(i4);
        }
        int i5 = this.m;
        int i6 = i5 + 1;
        int i7 = i6 + length;
        char[] cArr = this.l;
        cArr[i5] = '\'';
        str.getChars(0, length, cArr, i6);
        this.m = i4;
        int i8 = -1;
        char c2 = 0;
        for (int i9 = i6; i9 < i7; i9++) {
            char c3 = this.l[i9];
            if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && (this.n & a0.WriteSlashAsSpecial.z) != 0)) {
                i2++;
                i8 = i9;
                c2 = c3;
            }
        }
        int i10 = i4 + i2;
        if (i10 > this.l.length) {
            e(i10);
        }
        this.m = i10;
        if (i2 == 1) {
            char[] cArr2 = this.l;
            int i11 = i8 + 1;
            System.arraycopy(cArr2, i11, cArr2, i8 + 2, (i7 - i8) - 1);
            char[] cArr3 = this.l;
            cArr3[i8] = '\\';
            cArr3[i11] = j[c2];
        } else if (i2 > 1) {
            char[] cArr4 = this.l;
            int i12 = i8 + 1;
            System.arraycopy(cArr4, i12, cArr4, i8 + 2, (i7 - i8) - 1);
            char[] cArr5 = this.l;
            cArr5[i8] = '\\';
            cArr5[i12] = j[c2];
            int i13 = i7 + 1;
            for (int i14 = i12 - 2; i14 >= i6; i14--) {
                char[] cArr6 = this.l;
                char c4 = cArr6[i14];
                if (c4 <= '\r' || c4 == '\\' || c4 == '\'' || (c4 == '/' && (this.n & a0.WriteSlashAsSpecial.z) != 0)) {
                    int i15 = i14 + 1;
                    System.arraycopy(cArr6, i15, cArr6, i14 + 2, (i13 - i14) - 1);
                    char[] cArr7 = this.l;
                    cArr7[i14] = '\\';
                    cArr7[i15] = j[c4];
                    i13++;
                }
            }
        }
        this.l[this.m - 1] = '\'';
    }

    public String toString() {
        return new String(this.l, 0, this.m);
    }

    @Override // java.io.Writer
    public void write(int i2) {
        int i3 = 1;
        int i4 = this.m + 1;
        if (i4 <= this.l.length) {
            i3 = i4;
        } else if (this.o == null) {
            e(i4);
            i3 = i4;
        } else {
            flush();
        }
        this.l[this.m] = (char) i2;
        this.m = i3;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str == null) {
            o();
        } else {
            write(str, 0, str.length());
        }
    }

    @Override // java.io.Writer
    public void write(String str, int i2, int i3) {
        int i4;
        int i5 = this.m + i3;
        if (i5 > this.l.length) {
            if (this.o == null) {
                e(i5);
            } else {
                while (true) {
                    char[] cArr = this.l;
                    int length = cArr.length;
                    int i6 = this.m;
                    int i7 = length - i6;
                    i4 = i2 + i7;
                    str.getChars(i2, i4, cArr, i6);
                    this.m = this.l.length;
                    flush();
                    i3 -= i7;
                    if (i3 <= this.l.length) {
                        break;
                    } else {
                        i2 = i4;
                    }
                }
                i5 = i3;
                i2 = i4;
            }
        }
        str.getChars(i2, i3 + i2, this.l, this.m);
        this.m = i5;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > cArr.length || i3 < 0 || (i4 = i2 + i3) > cArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return;
        }
        int i5 = this.m + i3;
        if (i5 > this.l.length) {
            if (this.o == null) {
                e(i5);
            } else {
                do {
                    char[] cArr2 = this.l;
                    int length = cArr2.length;
                    int i6 = this.m;
                    int i7 = length - i6;
                    System.arraycopy(cArr, i2, cArr2, i6, i7);
                    this.m = this.l.length;
                    flush();
                    i3 -= i7;
                    i2 += i7;
                } while (i3 > this.l.length);
                i5 = i3;
            }
        }
        System.arraycopy(cArr, i2, this.l, this.m, i3);
        this.m = i5;
    }
}
