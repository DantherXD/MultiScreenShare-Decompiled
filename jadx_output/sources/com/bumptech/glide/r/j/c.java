package com.bumptech.glide.r.j;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.t.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<T> implements h<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f3772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.r.c f3773d;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public c(int i, int i2) {
        if (k.r(i, i2)) {
            this.f3771b = i;
            this.f3772c = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }

    @Override // com.bumptech.glide.o.i
    public void a() {
    }

    @Override // com.bumptech.glide.r.j.h
    public final void b(g gVar) {
    }

    @Override // com.bumptech.glide.r.j.h
    public void c(Drawable drawable) {
    }

    @Override // com.bumptech.glide.r.j.h
    public void e(Drawable drawable) {
    }

    @Override // com.bumptech.glide.o.i
    public void f() {
    }

    @Override // com.bumptech.glide.r.j.h
    public final com.bumptech.glide.r.c g() {
        return this.f3773d;
    }

    @Override // com.bumptech.glide.r.j.h
    public final void i(g gVar) {
        gVar.g(this.f3771b, this.f3772c);
    }

    @Override // com.bumptech.glide.r.j.h
    public final void j(com.bumptech.glide.r.c cVar) {
        this.f3773d = cVar;
    }

    @Override // com.bumptech.glide.o.i
    public void k() {
    }
}
