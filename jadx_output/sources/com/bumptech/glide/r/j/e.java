package com.bumptech.glide.r.j;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public abstract class e<Z> extends i<ImageView, Z> implements com.bumptech.glide.r.k.b.a {
    private Animatable i;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void p(Z z) {
        if (!(z instanceof Animatable)) {
            this.i = null;
            return;
        }
        Animatable animatable = (Animatable) z;
        this.i = animatable;
        animatable.start();
    }

    private void s(Z z) {
        r(z);
        p(z);
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.o.i
    public void a() {
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.r.j.i, com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void c(Drawable drawable) {
        super.c(drawable);
        s(null);
        q(drawable);
    }

    @Override // com.bumptech.glide.r.j.h
    public void d(Z z, com.bumptech.glide.r.k.b<? super Z> bVar) {
        if (bVar == null || !bVar.a(z, this)) {
            s(z);
        } else {
            p(z);
        }
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void e(Drawable drawable) {
        super.e(drawable);
        s(null);
        q(drawable);
    }

    @Override // com.bumptech.glide.r.j.a, com.bumptech.glide.o.i
    public void f() {
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.bumptech.glide.r.j.i, com.bumptech.glide.r.j.a, com.bumptech.glide.r.j.h
    public void h(Drawable drawable) {
        super.h(drawable);
        Animatable animatable = this.i;
        if (animatable != null) {
            animatable.stop();
        }
        s(null);
        q(drawable);
    }

    public void q(Drawable drawable) {
        ((ImageView) this.f3776d).setImageDrawable(drawable);
    }

    protected abstract void r(Z z);
}
