package com.bumptech.glide.load.q.f;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.o.r;
import com.bumptech.glide.load.o.v;
import com.bumptech.glide.t.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T extends Drawable> implements v<T>, r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final T f3599b;

    public b(T t) {
        this.f3599b = (T) j.d(t);
    }

    @Override // com.bumptech.glide.load.o.r
    public void c() {
        Bitmap bitmapE;
        T t = this.f3599b;
        if (t instanceof BitmapDrawable) {
            bitmapE = ((BitmapDrawable) t).getBitmap();
        } else if (!(t instanceof com.bumptech.glide.load.q.h.c)) {
            return;
        } else {
            bitmapE = ((com.bumptech.glide.load.q.h.c) t).e();
        }
        bitmapE.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.o.v
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final T a() {
        Drawable.ConstantState constantState = this.f3599b.getConstantState();
        return constantState == null ? this.f3599b : (T) constantState.newDrawable();
    }
}
