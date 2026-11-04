package com.bumptech.glide.r.j;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class b extends e<Bitmap> {
    public b(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bumptech.glide.r.j.e
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void r(Bitmap bitmap) {
        ((ImageView) this.f3776d).setImageBitmap(bitmap);
    }
}
