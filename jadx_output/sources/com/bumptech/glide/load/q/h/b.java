package com.bumptech.glide.load.q.h;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements com.bumptech.glide.n.a.InterfaceC0087a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.e f3608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.b f3609b;

    public b(com.bumptech.glide.load.o.a0.e eVar, com.bumptech.glide.load.o.a0.b bVar) {
        this.f3608a = eVar;
        this.f3609b = bVar;
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0087a
    public int[] a(int i) {
        com.bumptech.glide.load.o.a0.b bVar = this.f3609b;
        return bVar == null ? new int[i] : (int[]) bVar.d(i, int[].class);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0087a
    public Bitmap b(int i, int i2, Bitmap.Config config) {
        return this.f3608a.e(i, i2, config);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0087a
    public void c(byte[] bArr) {
        com.bumptech.glide.load.o.a0.b bVar = this.f3609b;
        if (bVar == null) {
            return;
        }
        bVar.put(bArr);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0087a
    public void d(Bitmap bitmap) {
        this.f3608a.d(bitmap);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0087a
    public byte[] e(int i) {
        com.bumptech.glide.load.o.a0.b bVar = this.f3609b;
        return bVar == null ? new byte[i] : (byte[]) bVar.d(i, byte[].class);
    }

    @Override // com.bumptech.glide.n.a.InterfaceC0087a
    public void f(int[] iArr) {
        com.bumptech.glide.load.o.a0.b bVar = this.f3609b;
        if (bVar == null) {
            return;
        }
        bVar.put(iArr);
    }
}
