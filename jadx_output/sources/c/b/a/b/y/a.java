package c.b.a.b.y;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import c.b.a.b.a0.g;
import c.b.a.b.a0.k;
import c.b.a.b.a0.n;

/* JADX INFO: loaded from: classes.dex */
public class a extends Drawable implements n, androidx.core.graphics.drawable.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f2815b;

    static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        g f2816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2817b;

        public b(g gVar) {
            this.f2816a = gVar;
            this.f2817b = false;
        }

        public b(b bVar) {
            this.f2816a = (g) bVar.f2816a.getConstantState().newDrawable();
            this.f2817b = bVar.f2817b;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public a(k kVar) {
        this(new b(new g(kVar)));
    }

    private a(b bVar) {
        this.f2815b = bVar;
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f2815b = new b(this.f2815b);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f2815b;
        if (bVar.f2817b) {
            bVar.f2816a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2815b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f2815b.f2816a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2815b.f2816a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f2815b.f2816a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zB = c.b.a.b.y.b.b(iArr);
        b bVar = this.f2815b;
        if (bVar.f2817b == zB) {
            return zOnStateChange;
        }
        bVar.f2817b = zB;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f2815b.f2816a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2815b.f2816a.setColorFilter(colorFilter);
    }

    @Override // c.b.a.b.a0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f2815b.f2816a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.f2815b.f2816a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f2815b.f2816a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2815b.f2816a.setTintMode(mode);
    }
}
