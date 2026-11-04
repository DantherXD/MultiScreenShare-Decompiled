package c.b.b.k.b;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CharSequence f2890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f2893d;

    public e(CharSequence charSequence, int i, int i2) {
        this.f2890a = charSequence;
        this.f2892c = i;
        this.f2891b = i2;
        byte[] bArr = new byte[i * i2];
        this.f2893d = bArr;
        Arrays.fill(bArr, (byte) -1);
    }

    private void a(int i) {
        g(this.f2891b - 1, 0, i, 1);
        g(this.f2891b - 1, 1, i, 2);
        g(this.f2891b - 1, 2, i, 3);
        g(0, this.f2892c - 2, i, 4);
        g(0, this.f2892c - 1, i, 5);
        g(1, this.f2892c - 1, i, 6);
        g(2, this.f2892c - 1, i, 7);
        g(3, this.f2892c - 1, i, 8);
    }

    private void b(int i) {
        g(this.f2891b - 3, 0, i, 1);
        g(this.f2891b - 2, 0, i, 2);
        g(this.f2891b - 1, 0, i, 3);
        g(0, this.f2892c - 4, i, 4);
        g(0, this.f2892c - 3, i, 5);
        g(0, this.f2892c - 2, i, 6);
        g(0, this.f2892c - 1, i, 7);
        g(1, this.f2892c - 1, i, 8);
    }

    private void c(int i) {
        g(this.f2891b - 3, 0, i, 1);
        g(this.f2891b - 2, 0, i, 2);
        g(this.f2891b - 1, 0, i, 3);
        g(0, this.f2892c - 2, i, 4);
        g(0, this.f2892c - 1, i, 5);
        g(1, this.f2892c - 1, i, 6);
        g(2, this.f2892c - 1, i, 7);
        g(3, this.f2892c - 1, i, 8);
    }

    private void d(int i) {
        g(this.f2891b - 1, 0, i, 1);
        g(this.f2891b - 1, this.f2892c - 1, i, 2);
        g(0, this.f2892c - 3, i, 3);
        g(0, this.f2892c - 2, i, 4);
        g(0, this.f2892c - 1, i, 5);
        g(1, this.f2892c - 3, i, 6);
        g(1, this.f2892c - 2, i, 7);
        g(1, this.f2892c - 1, i, 8);
    }

    private boolean f(int i, int i2) {
        return this.f2893d[(i2 * this.f2892c) + i] >= 0;
    }

    private void g(int i, int i2, int i3, int i4) {
        if (i < 0) {
            int i5 = this.f2891b;
            i += i5;
            i2 += 4 - ((i5 + 4) % 8);
        }
        if (i2 < 0) {
            int i6 = this.f2892c;
            i2 += i6;
            i += 4 - ((i6 + 4) % 8);
        }
        i(i2, i, (this.f2890a.charAt(i3) & (1 << (8 - i4))) != 0);
    }

    private void i(int i, int i2, boolean z) {
        this.f2893d[(i2 * this.f2892c) + i] = z ? (byte) 1 : (byte) 0;
    }

    private void j(int i, int i2, int i3) {
        int i4 = i - 2;
        int i5 = i2 - 2;
        g(i4, i5, i3, 1);
        int i6 = i2 - 1;
        g(i4, i6, i3, 2);
        int i7 = i - 1;
        g(i7, i5, i3, 3);
        g(i7, i6, i3, 4);
        g(i7, i2, i3, 5);
        g(i, i5, i3, 6);
        g(i, i6, i3, 7);
        g(i, i2, i3, 8);
    }

    public final boolean e(int i, int i2) {
        return this.f2893d[(i2 * this.f2892c) + i] == 1;
    }

    public final void h() {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 4;
        while (true) {
            if (i5 == this.f2891b && i3 == 0) {
                a(i4);
                i4++;
            }
            if (i5 == this.f2891b - 2 && i3 == 0 && this.f2892c % 4 != 0) {
                b(i4);
                i4++;
            }
            if (i5 == this.f2891b - 2 && i3 == 0 && this.f2892c % 8 == 4) {
                c(i4);
                i4++;
            }
            if (i5 == this.f2891b + 4 && i3 == 2 && this.f2892c % 8 == 0) {
                d(i4);
                i4++;
            }
            do {
                if (i5 < this.f2891b && i3 >= 0 && !f(i3, i5)) {
                    j(i5, i3, i4);
                    i4++;
                }
                i5 -= 2;
                i3 += 2;
                if (i5 < 0) {
                    break;
                }
            } while (i3 < this.f2892c);
            int i6 = i5 + 1;
            int i7 = i3 + 3;
            do {
                if (i6 >= 0 && i7 < this.f2892c && !f(i7, i6)) {
                    j(i6, i7, i4);
                    i4++;
                }
                i6 += 2;
                i7 -= 2;
                i = this.f2891b;
                if (i6 >= i) {
                    break;
                }
            } while (i7 >= 0);
            i5 = i6 + 3;
            i3 = i7 + 1;
            if (i5 >= i && i3 >= (i2 = this.f2892c)) {
                break;
            }
        }
        if (f(i2 - 1, i - 1)) {
            return;
        }
        i(this.f2892c - 1, this.f2891b - 1, true);
        i(this.f2892c - 2, this.f2891b - 2, true);
    }
}
