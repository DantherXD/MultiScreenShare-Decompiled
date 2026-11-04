package com.bumptech.glide.load.q.e;

import com.bumptech.glide.load.o.v;
import com.bumptech.glide.t.j;

/* JADX INFO: loaded from: classes.dex */
public class b implements v<byte[]> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f3597b;

    public b(byte[] bArr) {
        this.f3597b = (byte[]) j.d(bArr);
    }

    @Override // com.bumptech.glide.load.o.v
    public int b() {
        return this.f3597b.length;
    }

    @Override // com.bumptech.glide.load.o.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public byte[] a() {
        return this.f3597b;
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<byte[]> d() {
        return byte[].class;
    }

    @Override // com.bumptech.glide.load.o.v
    public void f() {
    }
}
