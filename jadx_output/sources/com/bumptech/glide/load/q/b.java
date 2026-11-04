package com.bumptech.glide.load.q;

import com.bumptech.glide.load.o.v;
import com.bumptech.glide.t.j;

/* JADX INFO: loaded from: classes.dex */
public class b<T> implements v<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final T f3513b;

    public b(T t) {
        this.f3513b = (T) j.d(t);
    }

    @Override // com.bumptech.glide.load.o.v
    public final T a() {
        return this.f3513b;
    }

    @Override // com.bumptech.glide.load.o.v
    public final int b() {
        return 1;
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<T> d() {
        return (Class<T>) this.f3513b.getClass();
    }

    @Override // com.bumptech.glide.load.o.v
    public void f() {
    }
}
