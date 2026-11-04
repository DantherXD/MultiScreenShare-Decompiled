package com.bumptech.glide.n;

import android.graphics.Bitmap;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f3688a = "e";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f3689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int[] f3690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a.InterfaceC0087a f3691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ByteBuffer f3692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f3693f;
    private short[] g;
    private byte[] h;
    private byte[] i;
    private byte[] j;
    private int[] k;
    private int l;
    private c m;
    private Bitmap n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private int s;
    private Boolean t;
    private Bitmap.Config u;

    public e(a.InterfaceC0087a interfaceC0087a) {
        this.f3690c = new int[256];
        this.u = Bitmap.Config.ARGB_8888;
        this.f3691d = interfaceC0087a;
        this.m = new c();
    }

    public e(a.InterfaceC0087a interfaceC0087a, c cVar, ByteBuffer byteBuffer, int i) {
        this(interfaceC0087a);
        r(cVar, byteBuffer, i);
    }

    private int j(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = i; i9 < this.q + i; i9++) {
            byte[] bArr = this.j;
            if (i9 >= bArr.length || i9 >= i2) {
                break;
            }
            int i10 = this.f3689b[bArr[i9] & 255];
            if (i10 != 0) {
                i4 += (i10 >> 24) & 255;
                i5 += (i10 >> 16) & 255;
                i6 += (i10 >> 8) & 255;
                i7 += i10 & 255;
                i8++;
            }
        }
        int i11 = i + i3;
        for (int i12 = i11; i12 < this.q + i11; i12++) {
            byte[] bArr2 = this.j;
            if (i12 >= bArr2.length || i12 >= i2) {
                break;
            }
            int i13 = this.f3689b[bArr2[i12] & 255];
            if (i13 != 0) {
                i4 += (i13 >> 24) & 255;
                i5 += (i13 >> 16) & 255;
                i6 += (i13 >> 8) & 255;
                i7 += i13 & 255;
                i8++;
            }
        }
        if (i8 == 0) {
            return 0;
        }
        return ((i4 / i8) << 24) | ((i5 / i8) << 16) | ((i6 / i8) << 8) | (i7 / i8);
    }

    private void k(b bVar) {
        Boolean bool;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr = this.k;
        int i6 = bVar.f3675d;
        int i7 = this.q;
        int i8 = i6 / i7;
        int i9 = bVar.f3673b / i7;
        int i10 = bVar.f3674c / i7;
        int i11 = bVar.f3672a / i7;
        boolean z = this.l == 0;
        int i12 = this.s;
        int i13 = this.r;
        byte[] bArr = this.j;
        int[] iArr2 = this.f3689b;
        Boolean bool2 = this.t;
        int i14 = 8;
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (true) {
            bool = bool2;
            if (i15 >= i8) {
                break;
            }
            if (bVar.f3676e) {
                if (i16 >= i8) {
                    i = i8;
                    int i18 = i17 + 1;
                    if (i18 == 2) {
                        i17 = i18;
                        i16 = 4;
                    } else if (i18 != 3) {
                        i17 = i18;
                        if (i18 == 4) {
                            i16 = 1;
                            i14 = 2;
                        }
                    } else {
                        i17 = i18;
                        i14 = 4;
                        i16 = 2;
                    }
                } else {
                    i = i8;
                }
                i2 = i16 + i14;
            } else {
                i = i8;
                i2 = i16;
                i16 = i15;
            }
            int i19 = i16 + i9;
            boolean z2 = i7 == 1;
            if (i19 < i13) {
                int i20 = i19 * i12;
                int i21 = i20 + i11;
                int i22 = i21 + i10;
                int i23 = i20 + i12;
                if (i23 < i22) {
                    i22 = i23;
                }
                i3 = i2;
                int i24 = i15 * i7 * bVar.f3674c;
                if (z2) {
                    int i25 = i21;
                    while (true) {
                        i4 = i9;
                        if (i25 >= i22) {
                            break;
                        }
                        int i26 = iArr2[bArr[i24] & 255];
                        if (i26 != 0) {
                            iArr[i25] = i26;
                        } else if (z && bool == null) {
                            bool = Boolean.TRUE;
                        }
                        i24 += i7;
                        i25++;
                        i9 = i4;
                    }
                } else {
                    i4 = i9;
                    int i27 = ((i22 - i21) * i7) + i24;
                    int i28 = i21;
                    while (true) {
                        i5 = i10;
                        if (i28 < i22) {
                            int iJ = j(i24, i27, bVar.f3674c);
                            if (iJ != 0) {
                                iArr[i28] = iJ;
                            } else if (z && bool == null) {
                                bool = Boolean.TRUE;
                            }
                            i24 += i7;
                            i28++;
                            i10 = i5;
                        }
                    }
                }
                bool2 = bool;
                i15++;
                i9 = i4;
                i10 = i5;
                i8 = i;
                i16 = i3;
            } else {
                i3 = i2;
                i4 = i9;
            }
            i5 = i10;
            bool2 = bool;
            i15++;
            i9 = i4;
            i10 = i5;
            i8 = i;
            i16 = i3;
        }
        if (this.t == null) {
            this.t = Boolean.valueOf(bool == null ? false : bool.booleanValue());
        }
    }

    private void l(b bVar) {
        b bVar2 = bVar;
        int[] iArr = this.k;
        int i = bVar2.f3675d;
        int i2 = bVar2.f3673b;
        int i3 = bVar2.f3674c;
        int i4 = bVar2.f3672a;
        boolean z = this.l == 0;
        int i5 = this.s;
        byte[] bArr = this.j;
        int[] iArr2 = this.f3689b;
        int i6 = 0;
        byte b2 = -1;
        while (i6 < i) {
            int i7 = (i6 + i2) * i5;
            int i8 = i7 + i4;
            int i9 = i8 + i3;
            int i10 = i7 + i5;
            if (i10 < i9) {
                i9 = i10;
            }
            int i11 = bVar2.f3674c * i6;
            int i12 = i8;
            while (i12 < i9) {
                byte b3 = bArr[i11];
                int i13 = i;
                int i14 = b3 & 255;
                if (i14 != b2) {
                    int i15 = iArr2[i14];
                    if (i15 != 0) {
                        iArr[i12] = i15;
                    } else {
                        b2 = b3;
                    }
                }
                i11++;
                i12++;
                i = i13;
            }
            i6++;
            bVar2 = bVar;
        }
        Boolean bool = this.t;
        this.t = Boolean.valueOf((bool != null && bool.booleanValue()) || (this.t == null && z && b2 != -1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v15, types: [short] */
    /* JADX WARN: Type inference failed for: r7v17 */
    private void m(b bVar) {
        int i;
        int i2;
        short s;
        this = this;
        if (bVar != null) {
            this.f3692e.position(bVar.j);
        }
        if (bVar == null) {
            c cVar = this.m;
            i = cVar.f3683f;
            i2 = cVar.g;
        } else {
            i = bVar.f3674c;
            i2 = bVar.f3675d;
        }
        int i3 = i * i2;
        byte[] bArr = this.j;
        if (bArr == null || bArr.length < i3) {
            this.j = this.f3691d.e(i3);
        }
        byte[] bArr2 = this.j;
        if (this.g == null) {
            this.g = new short[4096];
        }
        short[] sArr = this.g;
        if (this.h == null) {
            this.h = new byte[4096];
        }
        byte[] bArr3 = this.h;
        if (this.i == null) {
            this.i = new byte[4097];
        }
        byte[] bArr4 = this.i;
        int iQ = q();
        int i4 = 1 << iQ;
        int i5 = i4 + 1;
        int i6 = i4 + 2;
        int i7 = iQ + 1;
        int i8 = (1 << i7) - 1;
        int i9 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            sArr[i10] = 0;
            bArr3[i10] = (byte) i10;
        }
        byte[] bArr5 = this.f3693f;
        int i11 = i7;
        int i12 = i6;
        int i13 = i8;
        int iP = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = -1;
        while (i9 < i3) {
            if (iP == 0) {
                iP = p();
                if (iP <= 0) {
                    this.p = 3;
                    break;
                }
                i14 = 0;
            }
            i16 += (bArr5[i14] & 255) << i15;
            i14++;
            iP--;
            int i21 = i15 + 8;
            i12 = i12;
            i11 = i11;
            i20 = i20;
            i7 = i7;
            i18 = i18;
            while (true) {
                if (i21 < i11) {
                    i15 = i21;
                    break;
                }
                int i22 = i6;
                int i23 = i16 & i13;
                i16 >>= i11;
                i21 -= i11;
                if (i23 == i4) {
                    i13 = i8;
                    i11 = i7;
                    i12 = i22;
                    i6 = i12;
                    i20 = -1;
                } else {
                    if (i23 == i5) {
                        i15 = i21;
                        i6 = i22;
                        break;
                    }
                    if (i20 == -1) {
                        bArr2[i17] = bArr3[i23];
                        i17++;
                        i9++;
                        i20 = i23;
                        i18 = i20;
                        i6 = i22;
                        i21 = i21;
                    } else {
                        if (i23 >= i12) {
                            bArr4[i19] = (byte) i18;
                            i19++;
                            s = i20;
                        } else {
                            s = i23;
                        }
                        while (s >= i4) {
                            bArr4[i19] = bArr3[s];
                            i19++;
                            s = sArr[s];
                        }
                        i18 = bArr3[s] & 255;
                        byte b2 = (byte) i18;
                        bArr2[i17] = b2;
                        while (true) {
                            i17++;
                            i9++;
                            if (i19 <= 0) {
                                break;
                            }
                            i19--;
                            bArr2[i17] = bArr4[i19];
                        }
                        byte[] bArr6 = bArr4;
                        if (i12 < 4096) {
                            sArr[i12] = (short) i20;
                            bArr3[i12] = b2;
                            i12++;
                            if ((i12 & i13) == 0 && i12 < 4096) {
                                i11++;
                                i13 += i12;
                            }
                        }
                        i20 = i23;
                        i6 = i22;
                        i21 = i21;
                        bArr4 = bArr6;
                    }
                }
            }
        }
        Arrays.fill(bArr2, i17, i3, (byte) 0);
    }

    private Bitmap o() {
        Boolean bool = this.t;
        Bitmap bitmapB = this.f3691d.b(this.s, this.r, (bool == null || bool.booleanValue()) ? Bitmap.Config.ARGB_8888 : this.u);
        bitmapB.setHasAlpha(true);
        return bitmapB;
    }

    private int p() {
        int iQ = q();
        if (iQ <= 0) {
            return iQ;
        }
        ByteBuffer byteBuffer = this.f3692e;
        byteBuffer.get(this.f3693f, 0, Math.min(iQ, byteBuffer.remaining()));
        return iQ;
    }

    private int q() {
        return this.f3692e.get() & 255;
    }

    private Bitmap s(b bVar, b bVar2) {
        int i;
        int i2;
        Bitmap bitmap;
        int[] iArr = this.k;
        int i3 = 0;
        if (bVar2 == null) {
            Bitmap bitmap2 = this.n;
            if (bitmap2 != null) {
                this.f3691d.d(bitmap2);
            }
            this.n = null;
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && bVar2.g == 3 && this.n == null) {
            Arrays.fill(iArr, 0);
        }
        if (bVar2 != null && (i2 = bVar2.g) > 0) {
            if (i2 == 2) {
                if (!bVar.f3677f) {
                    c cVar = this.m;
                    int i4 = cVar.l;
                    if (bVar.k == null || cVar.j != bVar.h) {
                        i3 = i4;
                    }
                }
                int i5 = bVar2.f3675d;
                int i6 = this.q;
                int i7 = i5 / i6;
                int i8 = bVar2.f3673b / i6;
                int i9 = bVar2.f3674c / i6;
                int i10 = bVar2.f3672a / i6;
                int i11 = this.s;
                int i12 = (i8 * i11) + i10;
                int i13 = (i7 * i11) + i12;
                while (i12 < i13) {
                    int i14 = i12 + i9;
                    for (int i15 = i12; i15 < i14; i15++) {
                        iArr[i15] = i3;
                    }
                    i12 += this.s;
                }
            } else if (i2 == 3 && (bitmap = this.n) != null) {
                int i16 = this.s;
                bitmap.getPixels(iArr, 0, i16, 0, 0, i16, this.r);
            }
        }
        m(bVar);
        if (bVar.f3676e || this.q != 1) {
            k(bVar);
        } else {
            l(bVar);
        }
        if (this.o && ((i = bVar.g) == 0 || i == 1)) {
            if (this.n == null) {
                this.n = o();
            }
            Bitmap bitmap3 = this.n;
            int i17 = this.s;
            bitmap3.setPixels(iArr, 0, i17, 0, 0, i17, this.r);
        }
        Bitmap bitmapO = o();
        int i18 = this.s;
        bitmapO.setPixels(iArr, 0, i18, 0, 0, i18, this.r);
        return bitmapO;
    }

    @Override // com.bumptech.glide.n.a
    public int a() {
        return this.l;
    }

    @Override // com.bumptech.glide.n.a
    public int b() {
        return this.f3692e.limit() + this.j.length + (this.k.length * 4);
    }

    @Override // com.bumptech.glide.n.a
    public void c(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888 || config == Bitmap.Config.RGB_565) {
            this.u = config;
            return;
        }
        throw new IllegalArgumentException("Unsupported format: " + config + ", must be one of " + Bitmap.Config.ARGB_8888 + " or " + Bitmap.Config.RGB_565);
    }

    @Override // com.bumptech.glide.n.a
    public void clear() {
        this.m = null;
        byte[] bArr = this.j;
        if (bArr != null) {
            this.f3691d.c(bArr);
        }
        int[] iArr = this.k;
        if (iArr != null) {
            this.f3691d.f(iArr);
        }
        Bitmap bitmap = this.n;
        if (bitmap != null) {
            this.f3691d.d(bitmap);
        }
        this.n = null;
        this.f3692e = null;
        this.t = null;
        byte[] bArr2 = this.f3693f;
        if (bArr2 != null) {
            this.f3691d.c(bArr2);
        }
    }

    @Override // com.bumptech.glide.n.a
    public synchronized Bitmap d() {
        if (this.m.f3680c <= 0 || this.l < 0) {
            String str = f3688a;
            if (Log.isLoggable(str, 3)) {
                Log.d(str, "Unable to decode frame, frameCount=" + this.m.f3680c + ", framePointer=" + this.l);
            }
            this.p = 1;
        }
        int i = this.p;
        if (i != 1 && i != 2) {
            this.p = 0;
            if (this.f3693f == null) {
                this.f3693f = this.f3691d.e(255);
            }
            b bVar = this.m.f3682e.get(this.l);
            int i2 = this.l - 1;
            b bVar2 = i2 >= 0 ? this.m.f3682e.get(i2) : null;
            int[] iArr = bVar.k;
            if (iArr == null) {
                iArr = this.m.f3678a;
            }
            this.f3689b = iArr;
            if (iArr == null) {
                String str2 = f3688a;
                if (Log.isLoggable(str2, 3)) {
                    Log.d(str2, "No valid color table found for frame #" + this.l);
                }
                this.p = 1;
                return null;
            }
            if (bVar.f3677f) {
                System.arraycopy(iArr, 0, this.f3690c, 0, iArr.length);
                int[] iArr2 = this.f3690c;
                this.f3689b = iArr2;
                iArr2[bVar.h] = 0;
                if (bVar.g == 2 && this.l == 0) {
                    this.t = Boolean.TRUE;
                }
            }
            return s(bVar, bVar2);
        }
        String str3 = f3688a;
        if (Log.isLoggable(str3, 3)) {
            Log.d(str3, "Unable to decode frame, status=" + this.p);
        }
        return null;
    }

    @Override // com.bumptech.glide.n.a
    public void e() {
        this.l = (this.l + 1) % this.m.f3680c;
    }

    @Override // com.bumptech.glide.n.a
    public int f() {
        return this.m.f3680c;
    }

    @Override // com.bumptech.glide.n.a
    public int g() {
        int i;
        if (this.m.f3680c <= 0 || (i = this.l) < 0) {
            return 0;
        }
        return n(i);
    }

    @Override // com.bumptech.glide.n.a
    public ByteBuffer h() {
        return this.f3692e;
    }

    @Override // com.bumptech.glide.n.a
    public void i() {
        this.l = -1;
    }

    public int n(int i) {
        if (i >= 0) {
            c cVar = this.m;
            if (i < cVar.f3680c) {
                return cVar.f3682e.get(i).i;
            }
        }
        return -1;
    }

    public synchronized void r(c cVar, ByteBuffer byteBuffer, int i) {
        try {
            if (i <= 0) {
                throw new IllegalArgumentException("Sample size must be >=0, not: " + i);
            }
            int iHighestOneBit = Integer.highestOneBit(i);
            this.p = 0;
            this.m = cVar;
            this.l = -1;
            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.f3692e = byteBufferAsReadOnlyBuffer;
            byteBufferAsReadOnlyBuffer.position(0);
            this.f3692e.order(ByteOrder.LITTLE_ENDIAN);
            this.o = false;
            Iterator<b> it = cVar.f3682e.iterator();
            while (it.hasNext()) {
                if (it.next().g == 3) {
                    this.o = true;
                    break;
                }
            }
            this.q = iHighestOneBit;
            int i2 = cVar.f3683f;
            this.s = i2 / iHighestOneBit;
            int i3 = cVar.g;
            this.r = i3 / iHighestOneBit;
            this.j = this.f3691d.e(i2 * i3);
            this.k = this.f3691d.a(this.s * this.r);
        } catch (Throwable th) {
            throw th;
        }
    }
}
