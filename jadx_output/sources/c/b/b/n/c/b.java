package c.b.b.n.c;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f2992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2994c;

    public b(int i, int i2) {
        this.f2992a = (byte[][]) Array.newInstance((Class<?>) byte.class, i2, i);
        this.f2993b = i;
        this.f2994c = i2;
    }

    public void a(byte b2) {
        for (byte[] bArr : this.f2992a) {
            Arrays.fill(bArr, b2);
        }
    }

    public byte b(int i, int i2) {
        return this.f2992a[i2][i];
    }

    public byte[][] c() {
        return this.f2992a;
    }

    public int d() {
        return this.f2994c;
    }

    public int e() {
        return this.f2993b;
    }

    public void f(int i, int i2, int i3) {
        this.f2992a[i2][i] = (byte) i3;
    }

    public void g(int i, int i2, boolean z) {
        this.f2992a[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((this.f2993b * 2 * this.f2994c) + 2);
        for (int i = 0; i < this.f2994c; i++) {
            byte[] bArr = this.f2992a[i];
            for (int i2 = 0; i2 < this.f2993b; i2++) {
                byte b2 = bArr[i2];
                sb.append(b2 != 0 ? b2 != 1 ? "  " : " 1" : " 0");
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
