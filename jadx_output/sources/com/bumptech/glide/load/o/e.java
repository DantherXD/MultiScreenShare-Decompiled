package com.bumptech.glide.load.o;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
class e<DataType> implements com.bumptech.glide.load.o.b0.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.d<DataType> f3270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataType f3271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.i f3272c;

    e(com.bumptech.glide.load.d<DataType> dVar, DataType datatype, com.bumptech.glide.load.i iVar) {
        this.f3270a = dVar;
        this.f3271b = datatype;
        this.f3272c = iVar;
    }

    @Override // com.bumptech.glide.load.o.b0.a.b
    public boolean a(File file) {
        return this.f3270a.a(this.f3271b, file, this.f3272c);
    }
}
