package c.b.b.m.b;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b[] f2942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f2944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2945d;

    a(int i, int i2) {
        b[] bVarArr = new b[i];
        this.f2942a = bVarArr;
        int length = bVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f2942a[i3] = new b(((i2 + 4) * 17) + 1);
        }
        this.f2945d = i2 * 17;
        this.f2944c = i;
        this.f2943b = -1;
    }

    b a() {
        return this.f2942a[this.f2943b];
    }

    public byte[][] b(int i, int i2) {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) byte.class, this.f2944c * i2, this.f2945d * i);
        int i3 = this.f2944c * i2;
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f2942a[i4 / i2].b(i);
        }
        return bArr;
    }

    void c() {
        this.f2943b++;
    }
}
