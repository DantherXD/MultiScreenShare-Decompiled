package com.bumptech.glide.load.q.i;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.o.v;
import com.bumptech.glide.load.q.d.u;
import com.bumptech.glide.t.j;

/* JADX INFO: loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f3634a;

    public b(Resources resources) {
        this.f3634a = (Resources) j.d(resources);
    }

    @Override // com.bumptech.glide.load.q.i.e
    public v<BitmapDrawable> a(v<Bitmap> vVar, i iVar) {
        return u.g(this.f3634a, vVar);
    }
}
