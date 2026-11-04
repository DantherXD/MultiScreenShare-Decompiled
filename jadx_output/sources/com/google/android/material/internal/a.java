package com.google.android.material.internal;

import a.g.l.v;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f4110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Paint f4111b;
    private Typeface A;
    private c.b.a.b.x.a B;
    private c.b.a.b.x.a C;
    private CharSequence D;
    private CharSequence E;
    private boolean F;
    private boolean H;
    private Bitmap I;
    private Paint J;
    private float K;
    private float L;
    private int[] M;
    private boolean N;
    private final TextPaint O;
    private final TextPaint P;
    private TimeInterpolator Q;
    private TimeInterpolator R;
    private float S;
    private float T;
    private float U;
    private ColorStateList V;
    private float W;
    private float X;
    private float Y;
    private ColorStateList Z;
    private float a0;
    private float b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f4112c;
    private StaticLayout c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4113d;
    private float d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f4114e;
    private float e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4115f;
    private float f0;
    private float g;
    private CharSequence g0;
    private float h;
    private int i;
    private final Rect j;
    private final Rect k;
    private final RectF l;
    private ColorStateList q;
    private ColorStateList r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private Typeface y;
    private Typeface z;
    private int m = 16;
    private int n = 16;
    private float o = 15.0f;
    private float p = 15.0f;
    private boolean G = true;
    private int h0 = 1;
    private float i0 = 0.0f;
    private float j0 = 1.0f;
    private int k0 = g.f4130a;

    /* JADX INFO: renamed from: com.google.android.material.internal.a$a, reason: collision with other inner class name */
    class C0100a implements c.b.a.b.x.a.InterfaceC0064a {
        C0100a() {
        }

        @Override // c.b.a.b.x.a.InterfaceC0064a
        public void a(Typeface typeface) {
            a.this.R(typeface);
        }
    }

    static {
        f4110a = Build.VERSION.SDK_INT < 18;
        Paint paint = null;
        f4111b = null;
        if (0 != 0) {
            paint.setAntiAlias(true);
            paint.setColor(-65281);
        }
    }

    public a(View view) {
        this.f4112c = view;
        TextPaint textPaint = new TextPaint(129);
        this.O = textPaint;
        this.P = new TextPaint(textPaint);
        this.k = new Rect();
        this.j = new Rect();
        this.l = new RectF();
        this.h = f();
    }

    private void A(TextPaint textPaint) {
        textPaint.setTextSize(this.o);
        textPaint.setTypeface(this.z);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.b0);
        }
    }

    private void B(float f2) {
        if (this.f4115f) {
            this.l.set(f2 < this.h ? this.j : this.k);
            return;
        }
        this.l.left = G(this.j.left, this.k.left, f2, this.Q);
        this.l.top = G(this.s, this.t, f2, this.Q);
        this.l.right = G(this.j.right, this.k.right, f2, this.Q);
        this.l.bottom = G(this.j.bottom, this.k.bottom, f2, this.Q);
    }

    private static boolean C(float f2, float f3) {
        return Math.abs(f2 - f3) < 0.001f;
    }

    private boolean D() {
        return v.C(this.f4112c) == 1;
    }

    private boolean F(CharSequence charSequence, boolean z) {
        return (z ? a.g.j.e.f590d : a.g.j.e.f589c).a(charSequence, 0, charSequence.length());
    }

    private static float G(float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f4 = timeInterpolator.getInterpolation(f4);
        }
        return c.b.a.b.l.a.a(f2, f3, f4);
    }

    private static boolean K(Rect rect, int i, int i2, int i3, int i4) {
        return rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4;
    }

    private void O(float f2) {
        this.d0 = f2;
        v.f0(this.f4112c);
    }

    private boolean S(Typeface typeface) {
        c.b.a.b.x.a aVar = this.C;
        if (aVar != null) {
            aVar.c();
        }
        if (this.y == typeface) {
            return false;
        }
        this.y = typeface;
        return true;
    }

    private void V(float f2) {
        this.e0 = f2;
        v.f0(this.f4112c);
    }

    private boolean Z(Typeface typeface) {
        c.b.a.b.x.a aVar = this.B;
        if (aVar != null) {
            aVar.c();
        }
        if (this.z == typeface) {
            return false;
        }
        this.z = typeface;
        return true;
    }

    private static int a(int i, int i2, float f2) {
        float f3 = 1.0f - f2;
        return Color.argb((int) ((Color.alpha(i) * f3) + (Color.alpha(i2) * f2)), (int) ((Color.red(i) * f3) + (Color.red(i2) * f2)), (int) ((Color.green(i) * f3) + (Color.green(i2) * f2)), (int) ((Color.blue(i) * f3) + (Color.blue(i2) * f2)));
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x007b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0089  */
    /* JADX WARN: Code duplicated, block: B:27:0x009d  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:53:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:56:0x0116  */
    private void b(boolean z) {
        float fAscent;
        int i;
        float fCenterX;
        StaticLayout staticLayout;
        float height;
        CharSequence charSequence;
        float width;
        StaticLayout staticLayout2;
        StaticLayout staticLayout3;
        int i2;
        int i3;
        float fCenterX2;
        float f2;
        float fDescent;
        StaticLayout staticLayout4;
        float f3 = this.L;
        j(this.p, z);
        CharSequence charSequence2 = this.E;
        if (charSequence2 != null && (staticLayout4 = this.c0) != null) {
            this.g0 = TextUtils.ellipsize(charSequence2, this.O, staticLayout4.getWidth(), TextUtils.TruncateAt.END);
        }
        CharSequence charSequence3 = this.g0;
        float lineLeft = 0.0f;
        float fMeasureText = charSequence3 != null ? this.O.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        int iB = a.g.l.e.b(this.n, this.F ? 1 : 0);
        int i4 = iB & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.t = this.k.centerY() - ((this.O.descent() - this.O.ascent()) / 2.0f);
            } else {
                fAscent = this.k.bottom + this.O.ascent();
            }
            i = iB & 8388615;
            if (i != 1) {
                if (i != 5) {
                    this.v = this.k.left;
                } else {
                    fCenterX = this.k.right;
                }
                j(this.o, z);
                staticLayout = this.c0;
                if (staticLayout != null) {
                    height = staticLayout.getHeight();
                } else {
                    height = 0.0f;
                }
                charSequence = this.E;
                if (charSequence != null) {
                    width = this.O.measureText(charSequence, 0, charSequence.length());
                } else {
                    width = 0.0f;
                }
                staticLayout2 = this.c0;
                if (staticLayout2 != null && this.h0 > 1) {
                    width = staticLayout2.getWidth();
                }
                staticLayout3 = this.c0;
                if (staticLayout3 != null) {
                    if (this.h0 > 1) {
                        lineLeft = staticLayout3.getLineStart(0);
                    } else {
                        lineLeft = staticLayout3.getLineLeft(0);
                    }
                }
                this.f0 = lineLeft;
                int iB2 = a.g.l.e.b(this.m, this.F ? 1 : 0);
                i2 = iB2 & 112;
                if (i2 != 48) {
                    if (i2 != 80) {
                        fDescent = this.j.centerY() - (height / 2.0f);
                    } else {
                        fDescent = (this.j.bottom - height) + this.O.descent();
                    }
                    this.s = fDescent;
                } else {
                    this.s = this.j.top;
                }
                i3 = iB2 & 8388615;
                if (i3 != 1) {
                    if (i3 != 5) {
                        f2 = this.j.left;
                    } else {
                        fCenterX2 = this.j.right;
                    }
                    this.u = f2;
                    k();
                    b0(f3);
                }
                fCenterX2 = this.j.centerX();
                width /= 2.0f;
                f2 = fCenterX2 - width;
                this.u = f2;
                k();
                b0(f3);
            }
            fCenterX = this.k.centerX();
            fMeasureText /= 2.0f;
            this.v = fCenterX - fMeasureText;
            j(this.o, z);
            staticLayout = this.c0;
            if (staticLayout != null) {
                height = staticLayout.getHeight();
            } else {
                height = 0.0f;
            }
            charSequence = this.E;
            if (charSequence != null) {
                width = this.O.measureText(charSequence, 0, charSequence.length());
            } else {
                width = 0.0f;
            }
            staticLayout2 = this.c0;
            if (staticLayout2 != null) {
                width = staticLayout2.getWidth();
            }
            staticLayout3 = this.c0;
            if (staticLayout3 != null) {
                if (this.h0 > 1) {
                    lineLeft = staticLayout3.getLineStart(0);
                } else {
                    lineLeft = staticLayout3.getLineLeft(0);
                }
            }
            this.f0 = lineLeft;
            int iB3 = a.g.l.e.b(this.m, this.F ? 1 : 0);
            i2 = iB3 & 112;
            if (i2 != 48) {
                if (i2 != 80) {
                    fDescent = this.j.centerY() - (height / 2.0f);
                } else {
                    fDescent = (this.j.bottom - height) + this.O.descent();
                }
                this.s = fDescent;
            } else {
                this.s = this.j.top;
            }
            i3 = iB3 & 8388615;
            if (i3 != 1) {
                if (i3 != 5) {
                    f2 = this.j.left;
                } else {
                    fCenterX2 = this.j.right;
                }
                this.u = f2;
                k();
                b0(f3);
            }
            fCenterX2 = this.j.centerX();
            width /= 2.0f;
            f2 = fCenterX2 - width;
            this.u = f2;
            k();
            b0(f3);
        }
        fAscent = this.k.top;
        this.t = fAscent;
        i = iB & 8388615;
        if (i != 1) {
            if (i != 5) {
                this.v = this.k.left;
            } else {
                fCenterX = this.k.right;
            }
            j(this.o, z);
            staticLayout = this.c0;
            if (staticLayout != null) {
                height = staticLayout.getHeight();
            } else {
                height = 0.0f;
            }
            charSequence = this.E;
            if (charSequence != null) {
                width = this.O.measureText(charSequence, 0, charSequence.length());
            } else {
                width = 0.0f;
            }
            staticLayout2 = this.c0;
            if (staticLayout2 != null) {
                width = staticLayout2.getWidth();
            }
            staticLayout3 = this.c0;
            if (staticLayout3 != null) {
                if (this.h0 > 1) {
                    lineLeft = staticLayout3.getLineStart(0);
                } else {
                    lineLeft = staticLayout3.getLineLeft(0);
                }
            }
            this.f0 = lineLeft;
            int iB4 = a.g.l.e.b(this.m, this.F ? 1 : 0);
            i2 = iB4 & 112;
            if (i2 != 48) {
                if (i2 != 80) {
                    fDescent = this.j.centerY() - (height / 2.0f);
                } else {
                    fDescent = (this.j.bottom - height) + this.O.descent();
                }
                this.s = fDescent;
            } else {
                this.s = this.j.top;
            }
            i3 = iB4 & 8388615;
            if (i3 != 1) {
                if (i3 != 5) {
                    f2 = this.j.left;
                } else {
                    fCenterX2 = this.j.right;
                }
                this.u = f2;
                k();
                b0(f3);
            }
            fCenterX2 = this.j.centerX();
            width /= 2.0f;
            f2 = fCenterX2 - width;
            this.u = f2;
            k();
            b0(f3);
        }
        fCenterX = this.k.centerX();
        fMeasureText /= 2.0f;
        this.v = fCenterX - fMeasureText;
        j(this.o, z);
        staticLayout = this.c0;
        if (staticLayout != null) {
            height = staticLayout.getHeight();
        } else {
            height = 0.0f;
        }
        charSequence = this.E;
        if (charSequence != null) {
            width = this.O.measureText(charSequence, 0, charSequence.length());
        } else {
            width = 0.0f;
        }
        staticLayout2 = this.c0;
        if (staticLayout2 != null) {
            width = staticLayout2.getWidth();
        }
        staticLayout3 = this.c0;
        if (staticLayout3 != null) {
            if (this.h0 > 1) {
                lineLeft = staticLayout3.getLineStart(0);
            } else {
                lineLeft = staticLayout3.getLineLeft(0);
            }
        }
        this.f0 = lineLeft;
        int iB5 = a.g.l.e.b(this.m, this.F ? 1 : 0);
        i2 = iB5 & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                fDescent = this.j.centerY() - (height / 2.0f);
            } else {
                fDescent = (this.j.bottom - height) + this.O.descent();
            }
            this.s = fDescent;
        } else {
            this.s = this.j.top;
        }
        i3 = iB5 & 8388615;
        if (i3 != 1) {
            if (i3 != 5) {
                f2 = this.j.left;
            } else {
                fCenterX2 = this.j.right;
            }
            this.u = f2;
            k();
            b0(f3);
        }
        fCenterX2 = this.j.centerX();
        width /= 2.0f;
        f2 = fCenterX2 - width;
        this.u = f2;
        k();
        b0(f3);
    }

    private void b0(float f2) {
        i(f2);
        boolean z = f4110a && this.K != 1.0f;
        this.H = z;
        if (z) {
            o();
        }
        v.f0(this.f4112c);
    }

    private void d() {
        h(this.f4114e);
    }

    private float e(float f2) {
        float f3 = this.h;
        return f2 <= f3 ? c.b.a.b.l.a.b(1.0f, 0.0f, this.g, f3, f2) : c.b.a.b.l.a.b(0.0f, 1.0f, f3, 1.0f, f2);
    }

    private float f() {
        float f2 = this.g;
        return f2 + ((1.0f - f2) * 0.5f);
    }

    private boolean g(CharSequence charSequence) {
        boolean zD = D();
        return this.G ? F(charSequence, zD) : zD;
    }

    private void h(float f2) {
        float f3;
        B(f2);
        if (!this.f4115f) {
            this.w = G(this.u, this.v, f2, this.Q);
            this.x = G(this.s, this.t, f2, this.Q);
            b0(G(this.o, this.p, f2, this.R));
            f3 = f2;
        } else if (f2 < this.h) {
            this.w = this.u;
            this.x = this.s;
            b0(this.o);
            f3 = 0.0f;
        } else {
            this.w = this.v;
            this.x = this.t - Math.max(0, this.i);
            b0(this.p);
            f3 = 1.0f;
        }
        TimeInterpolator timeInterpolator = c.b.a.b.l.a.f2756b;
        O(1.0f - G(0.0f, 1.0f, 1.0f - f2, timeInterpolator));
        V(G(1.0f, 0.0f, f2, timeInterpolator));
        if (this.r != this.q) {
            this.O.setColor(a(w(), u(), f3));
        } else {
            this.O.setColor(u());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            float f4 = this.a0;
            float f5 = this.b0;
            if (f4 != f5) {
                this.O.setLetterSpacing(G(f5, f4, f2, timeInterpolator));
            } else {
                this.O.setLetterSpacing(f4);
            }
        }
        this.O.setShadowLayer(G(this.W, this.S, f2, null), G(this.X, this.T, f2, null), G(this.Y, this.U, f2, null), a(v(this.Z), v(this.V), f2));
        if (this.f4115f) {
            this.O.setAlpha((int) (e(f2) * 255.0f));
        }
        v.f0(this.f4112c);
    }

    private boolean h0() {
        return this.h0 > 1 && (!this.F || this.f4115f) && !this.H;
    }

    private void i(float f2) {
        j(f2, false);
    }

    private void j(float f2, boolean z) {
        boolean z2;
        float f3;
        boolean z3;
        if (this.D == null) {
            return;
        }
        float fWidth = this.k.width();
        float fWidth2 = this.j.width();
        if (C(f2, this.p)) {
            f3 = this.p;
            this.K = 1.0f;
            Typeface typeface = this.A;
            Typeface typeface2 = this.y;
            if (typeface != typeface2) {
                this.A = typeface2;
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            float f4 = this.o;
            Typeface typeface3 = this.A;
            Typeface typeface4 = this.z;
            if (typeface3 != typeface4) {
                this.A = typeface4;
                z2 = true;
            } else {
                z2 = false;
            }
            if (C(f2, f4)) {
                this.K = 1.0f;
            } else {
                this.K = f2 / this.o;
            }
            float f5 = this.p / this.o;
            fWidth = (!z && fWidth2 * f5 > fWidth) ? Math.min(fWidth / f5, fWidth2) : fWidth2;
            f3 = f4;
            z3 = z2;
        }
        if (fWidth > 0.0f) {
            z3 = this.L != f3 || this.N || z3;
            this.L = f3;
            this.N = false;
        }
        if (this.E == null || z3) {
            this.O.setTextSize(this.L);
            this.O.setTypeface(this.A);
            this.O.setLinearText(this.K != 1.0f);
            this.F = g(this.D);
            StaticLayout staticLayoutL = l(h0() ? this.h0 : 1, fWidth, this.F);
            this.c0 = staticLayoutL;
            this.E = staticLayoutL.getText();
        }
    }

    private void k() {
        Bitmap bitmap = this.I;
        if (bitmap != null) {
            bitmap.recycle();
            this.I = null;
        }
    }

    private StaticLayout l(int i, float f2, boolean z) {
        StaticLayout staticLayoutA;
        try {
            staticLayoutA = g.c(this.D, this.O, (int) f2).e(TextUtils.TruncateAt.END).h(z).d(Layout.Alignment.ALIGN_NORMAL).g(false).j(i).i(this.i0, this.j0).f(this.k0).a();
        } catch (g.a e2) {
            Log.e("CollapsingTextHelper", e2.getCause().getMessage(), e2);
            staticLayoutA = null;
        }
        return (StaticLayout) a.g.k.h.e(staticLayoutA);
    }

    private void n(Canvas canvas, float f2, float f3) {
        int alpha = this.O.getAlpha();
        canvas.translate(f2, f3);
        float f4 = alpha;
        this.O.setAlpha((int) (this.e0 * f4));
        this.c0.draw(canvas);
        this.O.setAlpha((int) (this.d0 * f4));
        int lineBaseline = this.c0.getLineBaseline(0);
        CharSequence charSequence = this.g0;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.O);
        if (this.f4115f) {
            return;
        }
        String strTrim = this.g0.toString().trim();
        if (strTrim.endsWith("…")) {
            strTrim = strTrim.substring(0, strTrim.length() - 1);
        }
        String str = strTrim;
        this.O.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.c0.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.O);
    }

    private void o() {
        if (this.I != null || this.j.isEmpty() || TextUtils.isEmpty(this.E)) {
            return;
        }
        h(0.0f);
        int width = this.c0.getWidth();
        int height = this.c0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.I = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.c0.draw(new Canvas(this.I));
        if (this.J == null) {
            this.J = new Paint(3);
        }
    }

    private float s(int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) - (c() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.F ? this.k.left : this.k.right - c();
        }
        return this.F ? this.k.right - c() : this.k.left;
    }

    private float t(RectF rectF, int i, int i2) {
        if (i2 == 17 || (i2 & 7) == 1) {
            return (i / 2.0f) + (c() / 2.0f);
        }
        if ((i2 & 8388613) == 8388613 || (i2 & 5) == 5) {
            return this.F ? rectF.left + c() : this.k.right;
        }
        if (this.F) {
            return this.k.right;
        }
        return c() + rectF.left;
    }

    private int v(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.M;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    private int w() {
        return v(this.q);
    }

    private void z(TextPaint textPaint) {
        textPaint.setTextSize(this.p);
        textPaint.setTypeface(this.y);
        if (Build.VERSION.SDK_INT >= 21) {
            textPaint.setLetterSpacing(this.a0);
        }
    }

    public final boolean E() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.r;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.q) != null && colorStateList.isStateful());
    }

    void H() {
        this.f4113d = this.k.width() > 0 && this.k.height() > 0 && this.j.width() > 0 && this.j.height() > 0;
    }

    public void I() {
        J(false);
    }

    public void J(boolean z) {
        if ((this.f4112c.getHeight() <= 0 || this.f4112c.getWidth() <= 0) && !z) {
            return;
        }
        b(z);
        d();
    }

    public void L(int i, int i2, int i3, int i4) {
        if (K(this.k, i, i2, i3, i4)) {
            return;
        }
        this.k.set(i, i2, i3, i4);
        this.N = true;
        H();
    }

    public void M(Rect rect) {
        L(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void N(int i) {
        c.b.a.b.x.d dVar = new c.b.a.b.x.d(this.f4112c.getContext(), i);
        ColorStateList colorStateList = dVar.f2803a;
        if (colorStateList != null) {
            this.r = colorStateList;
        }
        float f2 = dVar.n;
        if (f2 != 0.0f) {
            this.p = f2;
        }
        ColorStateList colorStateList2 = dVar.f2806d;
        if (colorStateList2 != null) {
            this.V = colorStateList2;
        }
        this.T = dVar.i;
        this.U = dVar.j;
        this.S = dVar.k;
        this.a0 = dVar.m;
        c.b.a.b.x.a aVar = this.C;
        if (aVar != null) {
            aVar.c();
        }
        this.C = new c.b.a.b.x.a(new C0100a(), dVar.e());
        dVar.h(this.f4112c.getContext(), this.C);
        I();
    }

    public void P(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            I();
        }
    }

    public void Q(int i) {
        if (this.n != i) {
            this.n = i;
            I();
        }
    }

    public void R(Typeface typeface) {
        if (S(typeface)) {
            I();
        }
    }

    public void T(int i, int i2, int i3, int i4) {
        if (K(this.j, i, i2, i3, i4)) {
            return;
        }
        this.j.set(i, i2, i3, i4);
        this.N = true;
        H();
    }

    public void U(Rect rect) {
        T(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void W(ColorStateList colorStateList) {
        if (this.q != colorStateList) {
            this.q = colorStateList;
            I();
        }
    }

    public void X(int i) {
        if (this.m != i) {
            this.m = i;
            I();
        }
    }

    public void Y(float f2) {
        if (this.o != f2) {
            this.o = f2;
            I();
        }
    }

    public void a0(float f2) {
        float fA = a.g.g.a.a(f2, 0.0f, 1.0f);
        if (fA != this.f4114e) {
            this.f4114e = fA;
            d();
        }
    }

    public float c() {
        if (this.D == null) {
            return 0.0f;
        }
        z(this.P);
        TextPaint textPaint = this.P;
        CharSequence charSequence = this.D;
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void c0(TimeInterpolator timeInterpolator) {
        this.Q = timeInterpolator;
        I();
    }

    public final boolean d0(int[] iArr) {
        this.M = iArr;
        if (!E()) {
            return false;
        }
        I();
        return true;
    }

    public void e0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.D, charSequence)) {
            this.D = charSequence;
            this.E = null;
            k();
            I();
        }
    }

    public void f0(TimeInterpolator timeInterpolator) {
        this.R = timeInterpolator;
        I();
    }

    public void g0(Typeface typeface) {
        boolean zS = S(typeface);
        boolean Z = Z(typeface);
        if (zS || Z) {
            I();
        }
    }

    public void m(Canvas canvas) {
        int iSave = canvas.save();
        if (this.E == null || !this.f4113d) {
            return;
        }
        float lineStart = (this.w + (this.h0 > 1 ? this.c0.getLineStart(0) : this.c0.getLineLeft(0))) - (this.f0 * 2.0f);
        this.O.setTextSize(this.L);
        float f2 = this.w;
        float f3 = this.x;
        boolean z = this.H && this.I != null;
        float f4 = this.K;
        if (f4 != 1.0f && !this.f4115f) {
            canvas.scale(f4, f4, f2, f3);
        }
        if (z) {
            canvas.drawBitmap(this.I, f2, f3, this.J);
            canvas.restoreToCount(iSave);
            return;
        }
        if (!h0() || (this.f4115f && this.f4114e <= this.h)) {
            canvas.translate(f2, f3);
            this.c0.draw(canvas);
        } else {
            n(canvas, lineStart, f3);
        }
        canvas.restoreToCount(iSave);
    }

    public void p(RectF rectF, int i, int i2) {
        this.F = g(this.D);
        rectF.left = s(i, i2);
        rectF.top = this.k.top;
        rectF.right = t(rectF, i, i2);
        rectF.bottom = this.k.top + r();
    }

    public ColorStateList q() {
        return this.r;
    }

    public float r() {
        z(this.P);
        return -this.P.ascent();
    }

    public int u() {
        return v(this.r);
    }

    public float x() {
        A(this.P);
        return -this.P.ascent();
    }

    public float y() {
        return this.f4114e;
    }
}
