package com.bumptech.glide.load.n;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class g extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f3132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f3133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f3134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte f3135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3136f;

    static {
        byte[] bArr = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f3132b = bArr;
        int length = bArr.length;
        f3133c = length;
        f3134d = length + 2;
    }

    public g(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= -1 && i <= 8) {
            this.f3135e = (byte) i;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        int i2;
        int i3 = this.f3136f;
        if (i3 < 2 || i3 > (i2 = f3134d)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f3135e : f3132b[i3 - 2] & 255;
        }
        if (i != -1) {
            this.f3136f++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.f3136f;
        int i5 = f3134d;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f3135e;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(f3132b, this.f3136f - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.f3136f += i3;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.f3136f = (int) (((long) this.f3136f) + jSkip);
        }
        return jSkip;
    }
}
