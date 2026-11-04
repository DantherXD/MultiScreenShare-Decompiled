package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.drawable.b;
import c.b.a.b.a0.g;
import c.b.a.b.k;
import c.b.a.b.x.c;
import c.b.a.b.x.d;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.google.android.material.internal.l;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a extends g implements b, Drawable.Callback, h.b {
    private PorterDuffColorFilter A0;
    private ColorStateList B;
    private ColorStateList B0;
    private ColorStateList C;
    private PorterDuff.Mode C0;
    private float D;
    private int[] D0;
    private float E;
    private boolean E0;
    private ColorStateList F;
    private ColorStateList F0;
    private float G;
    private WeakReference<InterfaceC0096a> G0;
    private ColorStateList H;
    private TextUtils.TruncateAt H0;
    private CharSequence I;
    private boolean I0;
    private boolean J;
    private int J0;
    private Drawable K;
    private boolean K0;
    private ColorStateList L;
    private float M;
    private boolean N;
    private boolean O;
    private Drawable P;
    private Drawable Q;
    private ColorStateList R;
    private float S;
    private CharSequence T;
    private boolean U;
    private boolean V;
    private Drawable W;
    private ColorStateList X;
    private c.b.a.b.l.h Y;
    private c.b.a.b.l.h Z;
    private float a0;
    private float b0;
    private float c0;
    private float d0;
    private float e0;
    private float f0;
    private float g0;
    private float h0;
    private final Context i0;
    private final Paint j0;
    private final Paint k0;
    private final Paint.FontMetrics l0;
    private final RectF m0;
    private final PointF n0;
    private final Path o0;
    private final h p0;
    private int q0;
    private int r0;
    private int s0;
    private int t0;
    private int u0;
    private int v0;
    private boolean w0;
    private int x0;
    private int y0;
    private ColorFilter z0;
    private static final int[] z = {R.attr.state_enabled};
    private static final ShapeDrawable A = new ShapeDrawable(new OvalShape());

    /* JADX INFO: renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0096a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.E = -1.0f;
        this.j0 = new Paint(1);
        this.l0 = new Paint.FontMetrics();
        this.m0 = new RectF();
        this.n0 = new PointF();
        this.o0 = new Path();
        this.y0 = 255;
        this.C0 = PorterDuff.Mode.SRC_IN;
        this.G0 = new WeakReference<>(null);
        M(context);
        this.i0 = context;
        h hVar = new h(this);
        this.p0 = hVar;
        this.I = "";
        hVar.e().density = context.getResources().getDisplayMetrics().density;
        this.k0 = null;
        int[] iArr = z;
        setState(iArr);
        j2(iArr);
        this.I0 = true;
        if (c.b.a.b.y.b.f2818a) {
            A.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        this.j0.setColor(this.u0);
        this.j0.setStyle(Paint.Style.FILL);
        this.m0.set(rect);
        if (!this.K0) {
            canvas.drawRoundRect(this.m0, G0(), G0(), this.j0);
        } else {
            h(new RectF(rect), this.o0);
            super.p(canvas, this.j0, this.o0, u());
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        Paint paint = this.k0;
        if (paint != null) {
            paint.setColor(a.g.e.a.d(-16777216, 127));
            canvas.drawRect(rect, this.k0);
            if (L2() || K2()) {
                j0(rect, this.m0);
                canvas.drawRect(this.m0, this.k0);
            }
            if (this.I != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.k0);
            }
            if (M2()) {
                m0(rect, this.m0);
                canvas.drawRect(this.m0, this.k0);
            }
            this.k0.setColor(a.g.e.a.d(-65536, 127));
            l0(rect, this.m0);
            canvas.drawRect(this.m0, this.k0);
            this.k0.setColor(a.g.e.a.d(-16711936, 127));
            n0(rect, this.m0);
            canvas.drawRect(this.m0, this.k0);
        }
    }

    private void C0(Canvas canvas, Rect rect) {
        if (this.I != null) {
            Paint.Align alignR0 = r0(rect, this.n0);
            p0(rect, this.m0);
            if (this.p0.d() != null) {
                this.p0.e().drawableState = getState();
                this.p0.j(this.i0);
            }
            this.p0.e().setTextAlign(alignR0);
            int iSave = 0;
            boolean z2 = Math.round(this.p0.f(f1().toString())) > Math.round(this.m0.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(this.m0);
            }
            CharSequence charSequenceEllipsize = this.I;
            if (z2 && this.H0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, this.p0.e(), this.m0.width(), this.H0);
            }
            CharSequence charSequence = charSequenceEllipsize;
            int length = charSequence.length();
            PointF pointF = this.n0;
            canvas.drawText(charSequence, 0, length, pointF.x, pointF.y, this.p0.e());
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
    }

    private boolean K2() {
        return this.V && this.W != null && this.w0;
    }

    private boolean L2() {
        return this.J && this.K != null;
    }

    private boolean M2() {
        return this.O && this.P != null;
    }

    private void N2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void O2() {
        this.F0 = this.E0 ? c.b.a.b.y.b.a(this.H) : null;
    }

    @TargetApi(21)
    private void P2() {
        this.Q = new RippleDrawable(c.b.a.b.y.b.a(d1()), this.P, A);
    }

    private float X0() {
        Drawable drawable = this.w0 ? this.W : this.K;
        float f2 = this.M;
        if (f2 > 0.0f || drawable == null) {
            return f2;
        }
        float fCeil = (float) Math.ceil(l.b(this.i0, 24));
        return ((float) drawable.getIntrinsicHeight()) <= fCeil ? drawable.getIntrinsicHeight() : fCeil;
    }

    private float Y0() {
        Drawable drawable = this.w0 ? this.W : this.K;
        float f2 = this.M;
        return (f2 > 0.0f || drawable == null) ? f2 : drawable.getIntrinsicWidth();
    }

    private void Z1(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            onStateChange(getState());
        }
    }

    private void i0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.P) {
            if (drawable.isStateful()) {
                drawable.setState(U0());
            }
            androidx.core.graphics.drawable.a.o(drawable, this.R);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.K;
        if (drawable == drawable2 && this.N) {
            androidx.core.graphics.drawable.a.o(drawable2, this.L);
        }
    }

    private void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (L2() || K2()) {
            float f2 = this.a0 + this.b0;
            float fY0 = Y0();
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.left + f2;
                rectF.left = f3;
                rectF.right = f3 + fY0;
            } else {
                float f4 = rect.right - f2;
                rectF.right = f4;
                rectF.left = f4 - fY0;
            }
            float fX0 = X0();
            float fExactCenterY = rect.exactCenterY() - (fX0 / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fX0;
        }
    }

    private ColorFilter j1() {
        ColorFilter colorFilter = this.z0;
        return colorFilter != null ? colorFilter : this.A0;
    }

    private void l0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (M2()) {
            float f2 = this.h0 + this.g0 + this.S + this.f0 + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.right = rect.right - f2;
            } else {
                rectF.left = rect.left + f2;
            }
        }
    }

    private static boolean l1(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void m0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2()) {
            float f2 = this.h0 + this.g0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.right - f2;
                rectF.right = f3;
                rectF.left = f3 - this.S;
            } else {
                float f4 = rect.left + f2;
                rectF.left = f4;
                rectF.right = f4 + this.S;
            }
            float fExactCenterY = rect.exactCenterY();
            float f5 = this.S;
            float f6 = fExactCenterY - (f5 / 2.0f);
            rectF.top = f6;
            rectF.bottom = f6 + f5;
        }
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (M2()) {
            float f2 = this.h0 + this.g0 + this.S + this.f0 + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                float f3 = rect.right;
                rectF.right = f3;
                rectF.left = f3 - f2;
            } else {
                int i = rect.left;
                rectF.left = i;
                rectF.right = i + f2;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void p0(Rect rect, RectF rectF) {
        float f2;
        rectF.setEmpty();
        if (this.I != null) {
            float fK0 = this.a0 + k0() + this.d0;
            float fO0 = this.h0 + o0() + this.e0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                rectF.left = rect.left + fK0;
                f2 = rect.right - fO0;
            } else {
                rectF.left = rect.left + fO0;
                f2 = rect.right - fK0;
            }
            rectF.right = f2;
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean p1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float q0() {
        this.p0.e().getFontMetrics(this.l0);
        Paint.FontMetrics fontMetrics = this.l0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean q1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean r1(d dVar) {
        ColorStateList colorStateList;
        return (dVar == null || (colorStateList = dVar.f2803a) == null || !colorStateList.isStateful()) ? false : true;
    }

    private boolean s0() {
        return this.V && this.W != null && this.U;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:42:0x016d  */
    private void s1(AttributeSet attributeSet, int i, int i2) {
        TextUtils.TruncateAt truncateAt;
        int i3;
        int i4;
        TypedArray typedArrayH = j.h(this.i0, attributeSet, k.S, i, i2, new int[0]);
        this.K0 = typedArrayH.hasValue(k.E0);
        Z1(c.a(this.i0, typedArrayH, k.r0));
        D1(c.a(this.i0, typedArrayH, k.e0));
        R1(typedArrayH.getDimension(k.m0, 0.0f));
        int i5 = k.f0;
        if (typedArrayH.hasValue(i5)) {
            F1(typedArrayH.getDimension(i5, 0.0f));
        }
        V1(c.a(this.i0, typedArrayH, k.p0));
        X1(typedArrayH.getDimension(k.q0, 0.0f));
        w2(c.a(this.i0, typedArrayH, k.D0));
        B2(typedArrayH.getText(k.Y));
        d dVarF = c.f(this.i0, typedArrayH, k.T);
        dVarF.n = typedArrayH.getDimension(k.U, dVarF.n);
        C2(dVarF);
        int i6 = typedArrayH.getInt(k.W, 0);
        if (i6 == 1) {
            truncateAt = TextUtils.TruncateAt.START;
        } else {
            if (i6 != 2) {
                if (i6 == 3) {
                    truncateAt = TextUtils.TruncateAt.END;
                }
                Q1(typedArrayH.getBoolean(k.l0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
                    Q1(typedArrayH.getBoolean(k.i0, false));
                }
                J1(c.d(this.i0, typedArrayH, k.h0));
                i3 = k.k0;
                if (typedArrayH.hasValue(i3)) {
                    N1(c.a(this.i0, typedArrayH, i3));
                }
                L1(typedArrayH.getDimension(k.j0, -1.0f));
                m2(typedArrayH.getBoolean(k.y0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
                    m2(typedArrayH.getBoolean(k.t0, false));
                }
                a2(c.d(this.i0, typedArrayH, k.s0));
                k2(c.a(this.i0, typedArrayH, k.x0));
                f2(typedArrayH.getDimension(k.v0, 0.0f));
                v1(typedArrayH.getBoolean(k.Z, false));
                C1(typedArrayH.getBoolean(k.d0, false));
                if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
                    C1(typedArrayH.getBoolean(k.b0, false));
                }
                x1(c.d(this.i0, typedArrayH, k.a0));
                i4 = k.c0;
                if (typedArrayH.hasValue(i4)) {
                    z1(c.a(this.i0, typedArrayH, i4));
                }
                z2(c.b.a.b.l.h.b(this.i0, typedArrayH, k.F0));
                p2(c.b.a.b.l.h.b(this.i0, typedArrayH, k.A0));
                T1(typedArrayH.getDimension(k.o0, 0.0f));
                t2(typedArrayH.getDimension(k.C0, 0.0f));
                r2(typedArrayH.getDimension(k.B0, 0.0f));
                G2(typedArrayH.getDimension(k.H0, 0.0f));
                E2(typedArrayH.getDimension(k.G0, 0.0f));
                h2(typedArrayH.getDimension(k.w0, 0.0f));
                c2(typedArrayH.getDimension(k.u0, 0.0f));
                H1(typedArrayH.getDimension(k.g0, 0.0f));
                v2(typedArrayH.getDimensionPixelSize(k.X, Integer.MAX_VALUE));
                typedArrayH.recycle();
            }
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        }
        o2(truncateAt);
        Q1(typedArrayH.getBoolean(k.l0, false));
        if (attributeSet != null) {
            Q1(typedArrayH.getBoolean(k.i0, false));
        }
        J1(c.d(this.i0, typedArrayH, k.h0));
        i3 = k.k0;
        if (typedArrayH.hasValue(i3)) {
            N1(c.a(this.i0, typedArrayH, i3));
        }
        L1(typedArrayH.getDimension(k.j0, -1.0f));
        m2(typedArrayH.getBoolean(k.y0, false));
        if (attributeSet != null) {
            m2(typedArrayH.getBoolean(k.t0, false));
        }
        a2(c.d(this.i0, typedArrayH, k.s0));
        k2(c.a(this.i0, typedArrayH, k.x0));
        f2(typedArrayH.getDimension(k.v0, 0.0f));
        v1(typedArrayH.getBoolean(k.Z, false));
        C1(typedArrayH.getBoolean(k.d0, false));
        if (attributeSet != null) {
            C1(typedArrayH.getBoolean(k.b0, false));
        }
        x1(c.d(this.i0, typedArrayH, k.a0));
        i4 = k.c0;
        if (typedArrayH.hasValue(i4)) {
            z1(c.a(this.i0, typedArrayH, i4));
        }
        z2(c.b.a.b.l.h.b(this.i0, typedArrayH, k.F0));
        p2(c.b.a.b.l.h.b(this.i0, typedArrayH, k.A0));
        T1(typedArrayH.getDimension(k.o0, 0.0f));
        t2(typedArrayH.getDimension(k.C0, 0.0f));
        r2(typedArrayH.getDimension(k.B0, 0.0f));
        G2(typedArrayH.getDimension(k.H0, 0.0f));
        E2(typedArrayH.getDimension(k.G0, 0.0f));
        h2(typedArrayH.getDimension(k.w0, 0.0f));
        c2(typedArrayH.getDimension(k.u0, 0.0f));
        H1(typedArrayH.getDimension(k.g0, 0.0f));
        v2(typedArrayH.getDimensionPixelSize(k.X, Integer.MAX_VALUE));
        typedArrayH.recycle();
    }

    public static a t0(Context context, AttributeSet attributeSet, int i, int i2) {
        a aVar = new a(context, attributeSet, i, i2);
        aVar.s1(attributeSet, i, i2);
        return aVar;
    }

    private void u0(Canvas canvas, Rect rect) {
        if (K2()) {
            j0(rect, this.m0);
            RectF rectF = this.m0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.W.setBounds(0, 0, (int) this.m0.width(), (int) this.m0.height());
            this.W.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private boolean u1(int[] iArr, int[] iArr2) {
        boolean z2;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.B;
        int iL = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.q0) : 0);
        boolean state = true;
        if (this.q0 != iL) {
            this.q0 = iL;
            zOnStateChange = true;
        }
        ColorStateList colorStateList2 = this.C;
        int iL2 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.r0) : 0);
        if (this.r0 != iL2) {
            this.r0 = iL2;
            zOnStateChange = true;
        }
        int iE = c.b.a.b.q.a.e(iL, iL2);
        if ((this.s0 != iE) | (x() == null)) {
            this.s0 = iE;
            W(ColorStateList.valueOf(iE));
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.F;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.t0) : 0;
        if (this.t0 != colorForState) {
            this.t0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.F0 == null || !c.b.a.b.y.b.b(iArr)) ? 0 : this.F0.getColorForState(iArr, this.u0);
        if (this.u0 != colorForState2) {
            this.u0 = colorForState2;
            if (this.E0) {
                zOnStateChange = true;
            }
        }
        int colorForState3 = (this.p0.d() == null || this.p0.d().f2803a == null) ? 0 : this.p0.d().f2803a.getColorForState(iArr, this.v0);
        if (this.v0 != colorForState3) {
            this.v0 = colorForState3;
            zOnStateChange = true;
        }
        boolean z3 = l1(getState(), R.attr.state_checked) && this.U;
        if (this.w0 == z3 || this.W == null) {
            z2 = false;
        } else {
            float fK0 = k0();
            this.w0 = z3;
            if (fK0 != k0()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.B0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.x0) : 0;
        if (this.x0 != colorForState4) {
            this.x0 = colorForState4;
            this.A0 = c.b.a.b.s.a.a(this, this.B0, this.C0);
        } else {
            state = zOnStateChange;
        }
        if (q1(this.K)) {
            state |= this.K.setState(iArr);
        }
        if (q1(this.W)) {
            state |= this.W.setState(iArr);
        }
        if (q1(this.P)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.P.setState(iArr3);
        }
        if (c.b.a.b.y.b.f2818a && q1(this.Q)) {
            state |= this.Q.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            t1();
        }
        return state;
    }

    private void v0(Canvas canvas, Rect rect) {
        if (this.K0) {
            return;
        }
        this.j0.setColor(this.r0);
        this.j0.setStyle(Paint.Style.FILL);
        this.j0.setColorFilter(j1());
        this.m0.set(rect);
        canvas.drawRoundRect(this.m0, G0(), G0(), this.j0);
    }

    private void w0(Canvas canvas, Rect rect) {
        if (L2()) {
            j0(rect, this.m0);
            RectF rectF = this.m0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.K.setBounds(0, 0, (int) this.m0.width(), (int) this.m0.height());
            this.K.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    private void x0(Canvas canvas, Rect rect) {
        if (this.G <= 0.0f || this.K0) {
            return;
        }
        this.j0.setColor(this.t0);
        this.j0.setStyle(Paint.Style.STROKE);
        if (!this.K0) {
            this.j0.setColorFilter(j1());
        }
        RectF rectF = this.m0;
        float f2 = rect.left;
        float f3 = this.G;
        rectF.set(f2 + (f3 / 2.0f), rect.top + (f3 / 2.0f), rect.right - (f3 / 2.0f), rect.bottom - (f3 / 2.0f));
        float f4 = this.E - (this.G / 2.0f);
        canvas.drawRoundRect(this.m0, f4, f4, this.j0);
    }

    private void y0(Canvas canvas, Rect rect) {
        if (this.K0) {
            return;
        }
        this.j0.setColor(this.q0);
        this.j0.setStyle(Paint.Style.FILL);
        this.m0.set(rect);
        canvas.drawRoundRect(this.m0, G0(), G0(), this.j0);
    }

    private void z0(Canvas canvas, Rect rect) {
        Drawable drawable;
        if (M2()) {
            m0(rect, this.m0);
            RectF rectF = this.m0;
            float f2 = rectF.left;
            float f3 = rectF.top;
            canvas.translate(f2, f3);
            this.P.setBounds(0, 0, (int) this.m0.width(), (int) this.m0.height());
            if (c.b.a.b.y.b.f2818a) {
                this.Q.setBounds(this.P.getBounds());
                this.Q.jumpToCurrentState();
                drawable = this.Q;
            } else {
                drawable = this.P;
            }
            drawable.draw(canvas);
            canvas.translate(-f2, -f3);
        }
    }

    public void A1(int i) {
        z1(a.a.k.a.a.c(this.i0, i));
    }

    public void A2(int i) {
        z2(c.b.a.b.l.h.c(this.i0, i));
    }

    public void B1(int i) {
        C1(this.i0.getResources().getBoolean(i));
    }

    public void B2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.I, charSequence)) {
            return;
        }
        this.I = charSequence;
        this.p0.i(true);
        invalidateSelf();
        t1();
    }

    public void C1(boolean z2) {
        if (this.V != z2) {
            boolean zK2 = K2();
            this.V = z2;
            boolean zK3 = K2();
            if (zK2 != zK3) {
                if (zK3) {
                    i0(this.W);
                } else {
                    N2(this.W);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public void C2(d dVar) {
        this.p0.h(dVar, this.i0);
    }

    public Drawable D0() {
        return this.W;
    }

    public void D1(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            onStateChange(getState());
        }
    }

    public void D2(int i) {
        C2(new d(this.i0, i));
    }

    public ColorStateList E0() {
        return this.X;
    }

    public void E1(int i) {
        D1(a.a.k.a.a.c(this.i0, i));
    }

    public void E2(float f2) {
        if (this.e0 != f2) {
            this.e0 = f2;
            invalidateSelf();
            t1();
        }
    }

    public ColorStateList F0() {
        return this.C;
    }

    @Deprecated
    public void F1(float f2) {
        if (this.E != f2) {
            this.E = f2;
            setShapeAppearanceModel(C().w(f2));
        }
    }

    public void F2(int i) {
        E2(this.i0.getResources().getDimension(i));
    }

    public float G0() {
        return this.K0 ? F() : this.E;
    }

    @Deprecated
    public void G1(int i) {
        F1(this.i0.getResources().getDimension(i));
    }

    public void G2(float f2) {
        if (this.d0 != f2) {
            this.d0 = f2;
            invalidateSelf();
            t1();
        }
    }

    public float H0() {
        return this.h0;
    }

    public void H1(float f2) {
        if (this.h0 != f2) {
            this.h0 = f2;
            invalidateSelf();
            t1();
        }
    }

    public void H2(int i) {
        G2(this.i0.getResources().getDimension(i));
    }

    public Drawable I0() {
        Drawable drawable = this.K;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void I1(int i) {
        H1(this.i0.getResources().getDimension(i));
    }

    public void I2(boolean z2) {
        if (this.E0 != z2) {
            this.E0 = z2;
            O2();
            onStateChange(getState());
        }
    }

    public float J0() {
        return this.M;
    }

    public void J1(Drawable drawable) {
        Drawable drawableI0 = I0();
        if (drawableI0 != drawable) {
            float fK0 = k0();
            this.K = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            float fK1 = k0();
            N2(drawableI0);
            if (L2()) {
                i0(this.K);
            }
            invalidateSelf();
            if (fK0 != fK1) {
                t1();
            }
        }
    }

    boolean J2() {
        return this.I0;
    }

    public ColorStateList K0() {
        return this.L;
    }

    public void K1(int i) {
        J1(a.a.k.a.a.d(this.i0, i));
    }

    public float L0() {
        return this.D;
    }

    public void L1(float f2) {
        if (this.M != f2) {
            float fK0 = k0();
            this.M = f2;
            float fK1 = k0();
            invalidateSelf();
            if (fK0 != fK1) {
                t1();
            }
        }
    }

    public float M0() {
        return this.a0;
    }

    public void M1(int i) {
        L1(this.i0.getResources().getDimension(i));
    }

    public ColorStateList N0() {
        return this.F;
    }

    public void N1(ColorStateList colorStateList) {
        this.N = true;
        if (this.L != colorStateList) {
            this.L = colorStateList;
            if (L2()) {
                androidx.core.graphics.drawable.a.o(this.K, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float O0() {
        return this.G;
    }

    public void O1(int i) {
        N1(a.a.k.a.a.c(this.i0, i));
    }

    public Drawable P0() {
        Drawable drawable = this.P;
        if (drawable != null) {
            return androidx.core.graphics.drawable.a.q(drawable);
        }
        return null;
    }

    public void P1(int i) {
        Q1(this.i0.getResources().getBoolean(i));
    }

    public CharSequence Q0() {
        return this.T;
    }

    public void Q1(boolean z2) {
        if (this.J != z2) {
            boolean zL2 = L2();
            this.J = z2;
            boolean zL3 = L2();
            if (zL2 != zL3) {
                if (zL3) {
                    i0(this.K);
                } else {
                    N2(this.K);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public float R0() {
        return this.g0;
    }

    public void R1(float f2) {
        if (this.D != f2) {
            this.D = f2;
            invalidateSelf();
            t1();
        }
    }

    public float S0() {
        return this.S;
    }

    public void S1(int i) {
        R1(this.i0.getResources().getDimension(i));
    }

    public float T0() {
        return this.f0;
    }

    public void T1(float f2) {
        if (this.a0 != f2) {
            this.a0 = f2;
            invalidateSelf();
            t1();
        }
    }

    public int[] U0() {
        return this.D0;
    }

    public void U1(int i) {
        T1(this.i0.getResources().getDimension(i));
    }

    public ColorStateList V0() {
        return this.R;
    }

    public void V1(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            if (this.K0) {
                d0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void W0(RectF rectF) {
        n0(getBounds(), rectF);
    }

    public void W1(int i) {
        V1(a.a.k.a.a.c(this.i0, i));
    }

    public void X1(float f2) {
        if (this.G != f2) {
            this.G = f2;
            this.j0.setStrokeWidth(f2);
            if (this.K0) {
                super.e0(f2);
            }
            invalidateSelf();
        }
    }

    public void Y1(int i) {
        X1(this.i0.getResources().getDimension(i));
    }

    public TextUtils.TruncateAt Z0() {
        return this.H0;
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        t1();
        invalidateSelf();
    }

    public c.b.a.b.l.h a1() {
        return this.Z;
    }

    public void a2(Drawable drawable) {
        Drawable drawableP0 = P0();
        if (drawableP0 != drawable) {
            float fO0 = o0();
            this.P = drawable != null ? androidx.core.graphics.drawable.a.r(drawable).mutate() : null;
            if (c.b.a.b.y.b.f2818a) {
                P2();
            }
            float fO1 = o0();
            N2(drawableP0);
            if (M2()) {
                i0(this.P);
            }
            invalidateSelf();
            if (fO0 != fO1) {
                t1();
            }
        }
    }

    public float b1() {
        return this.c0;
    }

    public void b2(CharSequence charSequence) {
        if (this.T != charSequence) {
            this.T = a.g.j.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float c1() {
        return this.b0;
    }

    public void c2(float f2) {
        if (this.g0 != f2) {
            this.g0 = f2;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public ColorStateList d1() {
        return this.H;
    }

    public void d2(int i) {
        c2(this.i0.getResources().getDimension(i));
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i = this.y0;
        int iA = i < 255 ? c.b.a.b.m.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        y0(canvas, bounds);
        v0(canvas, bounds);
        if (this.K0) {
            super.draw(canvas);
        }
        x0(canvas, bounds);
        A0(canvas, bounds);
        w0(canvas, bounds);
        u0(canvas, bounds);
        if (this.I0) {
            C0(canvas, bounds);
        }
        z0(canvas, bounds);
        B0(canvas, bounds);
        if (this.y0 < 255) {
            canvas.restoreToCount(iA);
        }
    }

    public c.b.a.b.l.h e1() {
        return this.Y;
    }

    public void e2(int i) {
        a2(a.a.k.a.a.d(this.i0, i));
    }

    public CharSequence f1() {
        return this.I;
    }

    public void f2(float f2) {
        if (this.S != f2) {
            this.S = f2;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public d g1() {
        return this.p0.d();
    }

    public void g2(int i) {
        f2(this.i0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.y0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.z0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.D;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.a0 + k0() + this.d0 + this.p0.f(f1().toString()) + this.e0 + o0() + this.h0), this.J0);
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.K0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.E);
        } else {
            outline.setRoundRect(bounds, this.E);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public float h1() {
        return this.e0;
    }

    public void h2(float f2) {
        if (this.f0 != f2) {
            this.f0 = f2;
            invalidateSelf();
            if (M2()) {
                t1();
            }
        }
    }

    public float i1() {
        return this.d0;
    }

    public void i2(int i) {
        h2(this.i0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return p1(this.B) || p1(this.C) || p1(this.F) || (this.E0 && p1(this.F0)) || r1(this.p0.d()) || s0() || q1(this.K) || q1(this.W) || p1(this.B0);
    }

    public boolean j2(int[] iArr) {
        if (Arrays.equals(this.D0, iArr)) {
            return false;
        }
        this.D0 = iArr;
        if (M2()) {
            return u1(getState(), iArr);
        }
        return false;
    }

    float k0() {
        if (L2() || K2()) {
            return this.b0 + Y0() + this.c0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.E0;
    }

    public void k2(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (M2()) {
                androidx.core.graphics.drawable.a.o(this.P, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void l2(int i) {
        k2(a.a.k.a.a.c(this.i0, i));
    }

    public boolean m1() {
        return this.U;
    }

    public void m2(boolean z2) {
        if (this.O != z2) {
            boolean zM2 = M2();
            this.O = z2;
            boolean zM3 = M2();
            if (zM2 != zM3) {
                if (zM3) {
                    i0(this.P);
                } else {
                    N2(this.P);
                }
                invalidateSelf();
                t1();
            }
        }
    }

    public boolean n1() {
        return q1(this.P);
    }

    public void n2(InterfaceC0096a interfaceC0096a) {
        this.G0 = new WeakReference<>(interfaceC0096a);
    }

    float o0() {
        if (M2()) {
            return this.f0 + this.S + this.g0;
        }
        return 0.0f;
    }

    public boolean o1() {
        return this.O;
    }

    public void o2(TextUtils.TruncateAt truncateAt) {
        this.H0 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (L2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.K, i);
        }
        if (K2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.W, i);
        }
        if (M2()) {
            zOnLayoutDirectionChanged |= androidx.core.graphics.drawable.a.m(this.P, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (L2()) {
            zOnLevelChange |= this.K.setLevel(i);
        }
        if (K2()) {
            zOnLevelChange |= this.W.setLevel(i);
        }
        if (M2()) {
            zOnLevelChange |= this.P.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.K0) {
            super.onStateChange(iArr);
        }
        return u1(iArr, U0());
    }

    public void p2(c.b.a.b.l.h hVar) {
        this.Z = hVar;
    }

    public void q2(int i) {
        p2(c.b.a.b.l.h.c(this.i0, i));
    }

    Paint.Align r0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.I != null) {
            float fK0 = this.a0 + k0() + this.d0;
            if (androidx.core.graphics.drawable.a.f(this) == 0) {
                pointF.x = rect.left + fK0;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - fK0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - q0();
        }
        return align;
    }

    public void r2(float f2) {
        if (this.c0 != f2) {
            float fK0 = k0();
            this.c0 = f2;
            float fK1 = k0();
            invalidateSelf();
            if (fK0 != fK1) {
                t1();
            }
        }
    }

    public void s2(int i) {
        r2(this.i0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.y0 != i) {
            this.y0 = i;
            invalidateSelf();
        }
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.z0 != colorFilter) {
            this.z0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // c.b.a.b.a0.g, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.C0 != mode) {
            this.C0 = mode;
            this.A0 = c.b.a.b.s.a.a(this, this.B0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        if (L2()) {
            visible |= this.K.setVisible(z2, z3);
        }
        if (K2()) {
            visible |= this.W.setVisible(z2, z3);
        }
        if (M2()) {
            visible |= this.P.setVisible(z2, z3);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    protected void t1() {
        InterfaceC0096a interfaceC0096a = this.G0.get();
        if (interfaceC0096a != null) {
            interfaceC0096a.a();
        }
    }

    public void t2(float f2) {
        if (this.b0 != f2) {
            float fK0 = k0();
            this.b0 = f2;
            float fK1 = k0();
            invalidateSelf();
            if (fK0 != fK1) {
                t1();
            }
        }
    }

    public void u2(int i) {
        t2(this.i0.getResources().getDimension(i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public void v1(boolean z2) {
        if (this.U != z2) {
            this.U = z2;
            float fK0 = k0();
            if (!z2 && this.w0) {
                this.w0 = false;
            }
            float fK1 = k0();
            invalidateSelf();
            if (fK0 != fK1) {
                t1();
            }
        }
    }

    public void v2(int i) {
        this.J0 = i;
    }

    public void w1(int i) {
        v1(this.i0.getResources().getBoolean(i));
    }

    public void w2(ColorStateList colorStateList) {
        if (this.H != colorStateList) {
            this.H = colorStateList;
            O2();
            onStateChange(getState());
        }
    }

    public void x1(Drawable drawable) {
        if (this.W != drawable) {
            float fK0 = k0();
            this.W = drawable;
            float fK1 = k0();
            N2(this.W);
            i0(this.W);
            invalidateSelf();
            if (fK0 != fK1) {
                t1();
            }
        }
    }

    public void x2(int i) {
        w2(a.a.k.a.a.c(this.i0, i));
    }

    public void y1(int i) {
        x1(a.a.k.a.a.d(this.i0, i));
    }

    void y2(boolean z2) {
        this.I0 = z2;
    }

    public void z1(ColorStateList colorStateList) {
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (s0()) {
                androidx.core.graphics.drawable.a.o(this.W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void z2(c.b.a.b.l.h hVar) {
        this.Y = hVar;
    }
}
