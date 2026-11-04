package com.bumptech.glide.load.q.h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends Drawable implements g.b, Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f3610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f3612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f3613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3614f;
    private int g;
    private int h;
    private boolean i;
    private Paint j;
    private Rect k;
    private List<a.r.a.a.b> l;

    static final class a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f3615a;

        a(g gVar) {
            this.f3615a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }
    }

    public c(Context context, com.bumptech.glide.n.a aVar, m<Bitmap> mVar, int i, int i2, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.c(context), aVar, i, i2, mVar, bitmap)));
    }

    c(a aVar) {
        this.f3614f = true;
        this.h = -1;
        this.f3610b = (a) com.bumptech.glide.t.j.d(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.graphics.drawable.Drawable$Callback] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    private Drawable.Callback b() {
        ?? r1 = this;
        while (true) {
            ?? callback = r1.getCallback();
            if (!(callback instanceof Drawable)) {
                return callback;
            }
            r1 = (Drawable) callback;
        }
    }

    private Rect d() {
        if (this.k == null) {
            this.k = new Rect();
        }
        return this.k;
    }

    private Paint h() {
        if (this.j == null) {
            this.j = new Paint(2);
        }
        return this.j;
    }

    private void j() {
        List<a.r.a.a.b> list = this.l;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                this.l.get(i).a(this);
            }
        }
    }

    private void l() {
        this.g = 0;
    }

    private void n() {
        com.bumptech.glide.t.j.a(!this.f3613e, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f3610b.f3615a.f() != 1) {
            if (this.f3611c) {
                return;
            }
            this.f3611c = true;
            this.f3610b.f3615a.r(this);
        }
        invalidateSelf();
    }

    private void o() {
        this.f3611c = false;
        this.f3610b.f3615a.s(this);
    }

    @Override // com.bumptech.glide.load.q.h.g.b
    public void a() {
        if (b() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (g() == f() - 1) {
            this.g++;
        }
        int i = this.h;
        if (i == -1 || this.g < i) {
            return;
        }
        j();
        stop();
    }

    public ByteBuffer c() {
        return this.f3610b.f3615a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f3613e) {
            return;
        }
        if (this.i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), d());
            this.i = false;
        }
        canvas.drawBitmap(this.f3610b.f3615a.c(), (Rect) null, d(), h());
    }

    public Bitmap e() {
        return this.f3610b.f3615a.e();
    }

    public int f() {
        return this.f3610b.f3615a.f();
    }

    public int g() {
        return this.f3610b.f3615a.d();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f3610b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f3610b.f3615a.h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f3610b.f3615a.k();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int i() {
        return this.f3610b.f3615a.j();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f3611c;
    }

    public void k() {
        this.f3613e = true;
        this.f3610b.f3615a.a();
    }

    public void m(m<Bitmap> mVar, Bitmap bitmap) {
        this.f3610b.f3615a.o(mVar, bitmap);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.i = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        h().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        h().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        com.bumptech.glide.t.j.a(!this.f3613e, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f3614f = z;
        if (!z) {
            o();
        } else if (this.f3612d) {
            n();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f3612d = true;
        l();
        if (this.f3614f) {
            n();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f3612d = false;
        o();
    }
}
