package com.bumptech.glide.load.q.f;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.o.v;

/* JADX INFO: loaded from: classes.dex */
final class c extends b<Drawable> {
    private c(Drawable drawable) {
        super(drawable);
    }

    static v<Drawable> g(Drawable drawable) {
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.o.v
    public int b() {
        return Math.max(1, this.f3599b.getIntrinsicWidth() * this.f3599b.getIntrinsicHeight() * 4);
    }

    @Override // com.bumptech.glide.load.o.v
    public Class<Drawable> d() {
        return this.f3599b.getClass();
    }

    @Override // com.bumptech.glide.load.o.v
    public void f() {
    }
}
