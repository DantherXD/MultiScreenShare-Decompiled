package a.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
class h extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double f166a = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static a f167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Paint f169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f170e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f171f;
    private final RectF g;
    private float h;
    private Path i;
    private float j;
    private float k;
    private float l;
    private ColorStateList m;
    private boolean n;
    private final int o;
    private final int p;
    private boolean q;
    private boolean r;

    interface a {
        void a(Canvas canvas, RectF rectF, float f2, Paint paint);
    }

    private void a(Rect rect) {
        float f2 = this.j;
        float f3 = 1.5f * f2;
        this.g.set(rect.left + f2, rect.top + f3, rect.right - f2, rect.bottom - f3);
        b();
    }

    private void b() {
        float f2 = this.h;
        RectF rectF = new RectF(-f2, -f2, f2, f2);
        RectF rectF2 = new RectF(rectF);
        float f3 = this.k;
        rectF2.inset(-f3, -f3);
        Path path = this.i;
        if (path == null) {
            this.i = new Path();
        } else {
            path.reset();
        }
        this.i.setFillType(Path.FillType.EVEN_ODD);
        this.i.moveTo(-this.h, 0.0f);
        this.i.rLineTo(-this.k, 0.0f);
        this.i.arcTo(rectF2, 180.0f, 90.0f, false);
        this.i.arcTo(rectF, 270.0f, -90.0f, false);
        this.i.close();
        float f4 = this.h;
        float f5 = f4 / (this.k + f4);
        Paint paint = this.f170e;
        float f6 = this.h + this.k;
        int i = this.o;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f6, new int[]{i, i, this.p}, new float[]{0.0f, f5, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f171f;
        float f7 = this.h;
        float f8 = this.k;
        int i2 = this.o;
        paint2.setShader(new LinearGradient(0.0f, (-f7) + f8, 0.0f, (-f7) - f8, new int[]{i2, i2, this.p}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f171f.setAntiAlias(false);
    }

    static float c(float f2, float f3, boolean z) {
        return z ? (float) (((double) f2) + ((1.0d - f166a) * ((double) f3))) : f2;
    }

    static float d(float f2, float f3, boolean z) {
        float f4 = f2 * 1.5f;
        return z ? (float) (((double) f4) + ((1.0d - f166a) * ((double) f3))) : f4;
    }

    private void e(Canvas canvas) {
        float f2 = this.h;
        float f3 = (-f2) - this.k;
        float f4 = f2 + this.f168c + (this.l / 2.0f);
        float f5 = f4 * 2.0f;
        boolean z = this.g.width() - f5 > 0.0f;
        boolean z2 = this.g.height() - f5 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.g;
        canvas.translate(rectF.left + f4, rectF.top + f4);
        canvas.drawPath(this.i, this.f170e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.g.width() - f5, -this.h, this.f171f);
        }
        canvas.restoreToCount(iSave);
        int iSave2 = canvas.save();
        RectF rectF2 = this.g;
        canvas.translate(rectF2.right - f4, rectF2.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.i, this.f170e);
        if (z) {
            canvas.drawRect(0.0f, f3, this.g.width() - f5, (-this.h) + this.k, this.f171f);
        }
        canvas.restoreToCount(iSave2);
        int iSave3 = canvas.save();
        RectF rectF3 = this.g;
        canvas.translate(rectF3.left + f4, rectF3.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.i, this.f170e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.g.height() - f5, -this.h, this.f171f);
        }
        canvas.restoreToCount(iSave3);
        int iSave4 = canvas.save();
        RectF rectF4 = this.g;
        canvas.translate(rectF4.right - f4, rectF4.top + f4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.i, this.f170e);
        if (z2) {
            canvas.drawRect(0.0f, f3, this.g.height() - f5, -this.h, this.f171f);
        }
        canvas.restoreToCount(iSave4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.m = colorStateList;
        this.f169d.setColor(colorStateList.getColorForState(getState(), this.m.getDefaultColor()));
    }

    private void s(float f2, float f3) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f2 + ". Must be >= 0");
        }
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f3 + ". Must be >= 0");
        }
        float fT = t(f2);
        float fT2 = t(f3);
        if (fT > fT2) {
            if (!this.r) {
                this.r = true;
            }
            fT = fT2;
        }
        if (this.l == fT && this.j == fT2) {
            return;
        }
        this.l = fT;
        this.j = fT2;
        this.k = (int) ((fT * 1.5f) + this.f168c + 0.5f);
        this.n = true;
        invalidateSelf();
    }

    private int t(float f2) {
        int i = (int) (f2 + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.n) {
            a(getBounds());
            this.n = false;
        }
        canvas.translate(0.0f, this.l / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.l) / 2.0f);
        f167b.a(canvas, this.g, this.h, this.f169d);
    }

    ColorStateList f() {
        return this.m;
    }

    float g() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(d(this.j, this.h, this.q));
        int iCeil2 = (int) Math.ceil(c(this.j, this.h, this.q));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    void h(Rect rect) {
        getPadding(rect);
    }

    float i() {
        return this.j;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.m;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float j() {
        float f2 = this.j;
        return (Math.max(f2, this.h + this.f168c + ((f2 * 1.5f) / 2.0f)) * 2.0f) + (((this.j * 1.5f) + this.f168c) * 2.0f);
    }

    float k() {
        float f2 = this.j;
        return (Math.max(f2, this.h + this.f168c + (f2 / 2.0f)) * 2.0f) + ((this.j + this.f168c) * 2.0f);
    }

    float l() {
        return this.l;
    }

    void m(boolean z) {
        this.q = z;
        invalidateSelf();
    }

    void o(ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.m;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f169d.getColor() == colorForState) {
            return false;
        }
        this.f169d.setColor(colorForState);
        this.n = true;
        invalidateSelf();
        return true;
    }

    void p(float f2) {
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f2 + ". Must be >= 0");
        }
        float f3 = (int) (f2 + 0.5f);
        if (this.h == f3) {
            return;
        }
        this.h = f3;
        this.n = true;
        invalidateSelf();
    }

    void q(float f2) {
        s(this.l, f2);
    }

    void r(float f2) {
        s(f2, this.j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f169d.setAlpha(i);
        this.f170e.setAlpha(i);
        this.f171f.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f169d.setColorFilter(colorFilter);
    }
}
