package a.c.a;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class a extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f152b = {R.attr.colorBackground};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f f153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f156f;
    int g;
    final Rect h;
    private final e i;

    static {
        f bVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            bVar = new c();
        } else {
            bVar = i >= 17 ? new b() : new d();
        }
        f153c = bVar;
        f153c.m();
    }

    public ColorStateList getCardBackgroundColor() {
        return f153c.f(this.i);
    }

    public float getCardElevation() {
        return f153c.k(this.i);
    }

    public int getContentPaddingBottom() {
        return this.h.bottom;
    }

    public int getContentPaddingLeft() {
        return this.h.left;
    }

    public int getContentPaddingRight() {
        return this.h.right;
    }

    public int getContentPaddingTop() {
        return this.h.top;
    }

    public float getMaxCardElevation() {
        return f153c.a(this.i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f155e;
    }

    public float getRadius() {
        return f153c.b(this.i);
    }

    public boolean getUseCompatPadding() {
        return this.f154d;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        f fVar = f153c;
        if (!(fVar instanceof c)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(fVar.d(this.i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(fVar.c(this.i)), View.MeasureSpec.getSize(i2)), mode2);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        f153c.j(this.i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f153c.j(this.i, colorStateList);
    }

    public void setCardElevation(float f2) {
        f153c.g(this.i, f2);
    }

    public void setMaxCardElevation(float f2) {
        f153c.l(this.i, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.g = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.f156f = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f155e) {
            this.f155e = z;
            f153c.i(this.i);
        }
    }

    public void setRadius(float f2) {
        f153c.h(this.i, f2);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f154d != z) {
            this.f154d = z;
            f153c.e(this.i);
        }
    }
}
