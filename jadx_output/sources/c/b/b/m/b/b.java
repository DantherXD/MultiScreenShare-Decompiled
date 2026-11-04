package c.b.b.m.b;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f2946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2947b = 0;

    b(int i) {
        this.f2946a = new byte[i];
    }

    private void c(int i, boolean z) {
        this.f2946a[i] = z ? (byte) 1 : (byte) 0;
    }

    void a(boolean z, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f2947b;
            this.f2947b = i3 + 1;
            c(i3, z);
        }
    }

    byte[] b(int i) {
        int length = this.f2946a.length * i;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i2] = this.f2946a[i2 / i];
        }
        return bArr;
    }
}
