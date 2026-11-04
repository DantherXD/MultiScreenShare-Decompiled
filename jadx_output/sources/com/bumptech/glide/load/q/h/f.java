package com.bumptech.glide.load.q.h;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.o.v;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class f implements m<c> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m<Bitmap> f3616b;

    public f(m<Bitmap> mVar) {
        this.f3616b = (m) com.bumptech.glide.t.j.d(mVar);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.f3616b.a(messageDigest);
    }

    @Override // com.bumptech.glide.load.m
    public v<c> b(Context context, v<c> vVar, int i, int i2) {
        c cVarA = vVar.a();
        v<Bitmap> eVar = new com.bumptech.glide.load.q.d.e(cVarA.e(), com.bumptech.glide.c.c(context).f());
        v<Bitmap> vVarB = this.f3616b.b(context, eVar, i, i2);
        if (!eVar.equals(vVarB)) {
            eVar.f();
        }
        cVarA.m(this.f3616b, vVarB.a());
        return vVar;
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f3616b.equals(((f) obj).f3616b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f3616b.hashCode();
    }
}
