package com.bumptech.glide.load.o.b0;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f3221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f3222c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.m.a f3224e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f3223d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f3220a = new j();

    @Deprecated
    protected e(File file, long j) {
        this.f3221b = file;
        this.f3222c = j;
    }

    public static a c(File file, long j) {
        return new e(file, j);
    }

    private synchronized com.bumptech.glide.m.a d() {
        if (this.f3224e == null) {
            this.f3224e = com.bumptech.glide.m.a.s(this.f3221b, 1, 1, this.f3222c);
        }
        return this.f3224e;
    }

    @Override // com.bumptech.glide.load.o.b0.a
    public void a(com.bumptech.glide.load.g gVar, a.b bVar) {
        String strB = this.f3220a.b(gVar);
        this.f3223d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + gVar);
            }
            try {
                com.bumptech.glide.m.a aVarD = d();
                if (aVarD.q(strB) != null) {
                    this.f3223d.b(strB);
                    return;
                }
                com.bumptech.glide.m.a.c cVarN = aVarD.n(strB);
                if (cVarN == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                }
                try {
                    if (bVar.a(cVarN.f(0))) {
                        cVarN.e();
                    }
                    cVarN.b();
                    this.f3223d.b(strB);
                } catch (Throwable th) {
                    cVarN.b();
                    throw th;
                }
            } catch (IOException e2) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e2);
                }
            }
        } catch (Throwable th2) {
            this.f3223d.b(strB);
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.o.b0.a
    public File b(com.bumptech.glide.load.g gVar) {
        String strB = this.f3220a.b(gVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + gVar);
        }
        try {
            com.bumptech.glide.m.a.e eVarQ = d().q(strB);
            if (eVarQ != null) {
                return eVarQ.a(0);
            }
            return null;
        } catch (IOException e2) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e2);
            return null;
        }
    }
}
