package com.bumptech.glide.load.n;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final OutputStream f3125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f3126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.o.a0.b f3127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3128e;

    public c(OutputStream outputStream, com.bumptech.glide.load.o.a0.b bVar) {
        this(outputStream, bVar, 65536);
    }

    c(OutputStream outputStream, com.bumptech.glide.load.o.a0.b bVar, int i) {
        this.f3125b = outputStream;
        this.f3127d = bVar;
        this.f3126c = (byte[]) bVar.d(i, byte[].class);
    }

    private void a() throws IOException {
        int i = this.f3128e;
        if (i > 0) {
            this.f3125b.write(this.f3126c, 0, i);
            this.f3128e = 0;
        }
    }

    private void b() throws IOException {
        if (this.f3128e == this.f3126c.length) {
            a();
        }
    }

    private void c() {
        byte[] bArr = this.f3126c;
        if (bArr != null) {
            this.f3127d.put(bArr);
            this.f3126c = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f3125b.close();
            c();
        } catch (Throwable th) {
            this.f3125b.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        a();
        this.f3125b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        byte[] bArr = this.f3126c;
        int i2 = this.f3128e;
        this.f3128e = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f3128e;
            if (i6 == 0 && i4 >= this.f3126c.length) {
                this.f3125b.write(bArr, i5, i4);
                return;
            }
            int iMin = Math.min(i4, this.f3126c.length - i6);
            System.arraycopy(bArr, i5, this.f3126c, this.f3128e, iMin);
            this.f3128e += iMin;
            i3 += iMin;
            b();
        } while (i3 < i2);
    }
}
