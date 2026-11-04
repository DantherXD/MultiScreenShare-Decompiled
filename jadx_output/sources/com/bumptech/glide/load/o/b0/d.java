package com.bumptech.glide.load.o.b0;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class d implements com.bumptech.glide.load.o.b0.a.InterfaceC0070a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f3219b;

    public interface a {
        File a();
    }

    public d(a aVar, long j) {
        this.f3218a = j;
        this.f3219b = aVar;
    }

    @Override // com.bumptech.glide.load.o.b0.a.InterfaceC0070a
    public com.bumptech.glide.load.o.b0.a a() {
        File fileA = this.f3219b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.mkdirs() || (fileA.exists() && fileA.isDirectory())) {
            return e.c(fileA, this.f3218a);
        }
        return null;
    }
}
