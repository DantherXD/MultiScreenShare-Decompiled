package com.bumptech.glide.m;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class b implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InputStream f3664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Charset f3665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f3666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3668f;

    class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0 && ((ByteArrayOutputStream) this).buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, b.this.f3665c.name());
            } catch (UnsupportedEncodingException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    public b(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(c.f3670a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f3664b = inputStream;
        this.f3665c = charset;
        this.f3666d = new byte[i];
    }

    public b(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f3664b;
        byte[] bArr = this.f3666d;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.f3667e = 0;
        this.f3668f = i;
    }

    public boolean c() {
        return this.f3668f == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.f3664b) {
            if (this.f3666d != null) {
                this.f3666d = null;
                this.f3664b.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public String d() {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f3664b) {
            if (this.f3666d == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f3667e >= this.f3668f) {
                b();
            }
            for (int i3 = this.f3667e; i3 != this.f3668f; i3++) {
                byte[] bArr2 = this.f3666d;
                if (bArr2[i3] == 10) {
                    if (i3 != this.f3667e) {
                        i2 = i3 - 1;
                        if (bArr2[i2] != 13) {
                            i2 = i3;
                        }
                    } else {
                        i2 = i3;
                    }
                    byte[] bArr3 = this.f3666d;
                    int i4 = this.f3667e;
                    String str = new String(bArr3, i4, i2 - i4, this.f3665c.name());
                    this.f3667e = i3 + 1;
                    return str;
                }
            }
            a aVar = new a((this.f3668f - this.f3667e) + 80);
            loop1: while (true) {
                byte[] bArr4 = this.f3666d;
                int i5 = this.f3667e;
                aVar.write(bArr4, i5, this.f3668f - i5);
                this.f3668f = -1;
                b();
                i = this.f3667e;
                while (i != this.f3668f) {
                    bArr = this.f3666d;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.f3667e;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.f3667e = i + 1;
            return aVar.toString();
        }
    }
}
