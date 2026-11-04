package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class x implements com.bumptech.glide.load.k<Uri, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.q.f.d f3585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.e f3586b;

    public x(com.bumptech.glide.load.q.f.d dVar, com.bumptech.glide.load.o.a0.e eVar) {
        this.f3585a = dVar;
        this.f3586b = eVar;
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.o.v<Bitmap> a(Uri uri, int i, int i2, com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.load.o.v<Drawable> vVarA = this.f3585a.a(uri, i, i2, iVar);
        if (vVarA == null) {
            return null;
        }
        return n.a(this.f3586b, vVarA.a(), i, i2);
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri, com.bumptech.glide.load.i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
