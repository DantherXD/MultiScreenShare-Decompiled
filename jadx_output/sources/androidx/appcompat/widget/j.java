package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PorterDuff.Mode f1410a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static j f1411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private n0 f1412c;

    class a implements n0.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int[] f1413a = {a.a.e.R, a.a.e.P, a.a.e.f19a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f1414b = {a.a.e.o, a.a.e.B, a.a.e.t, a.a.e.p, a.a.e.q, a.a.e.s, a.a.e.r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f1415c = {a.a.e.O, a.a.e.Q, a.a.e.k, a.a.e.K, a.a.e.L, a.a.e.M, a.a.e.N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f1416d = {a.a.e.w, a.a.e.i, a.a.e.v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f1417e = {a.a.e.J, a.a.e.S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int[] f1418f = {a.a.e.f21c, a.a.e.g, a.a.e.f22d, a.a.e.h};

        a() {
        }

        private boolean f(int[] iArr, int i) {
            for (int i2 : iArr) {
                if (i2 == i) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList g(Context context) {
            return h(context, 0);
        }

        private ColorStateList h(Context context, int i) {
            int iC = s0.c(context, a.a.a.v);
            return new ColorStateList(new int[][]{s0.f1492b, s0.f1495e, s0.f1493c, s0.i}, new int[]{s0.b(context, a.a.a.t), a.g.e.a.b(iC, i), a.g.e.a.b(iC, i), i});
        }

        private ColorStateList i(Context context) {
            return h(context, s0.c(context, a.a.a.s));
        }

        private ColorStateList j(Context context) {
            return h(context, s0.c(context, a.a.a.t));
        }

        private ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i = a.a.a.x;
            ColorStateList colorStateListE = s0.e(context, i);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = s0.f1492b;
                iArr2[0] = s0.b(context, i);
                iArr[1] = s0.f1496f;
                iArr2[1] = s0.c(context, a.a.a.u);
                iArr[2] = s0.i;
                iArr2[2] = s0.c(context, i);
            } else {
                iArr[0] = s0.f1492b;
                iArr2[0] = colorStateListE.getColorForState(iArr[0], 0);
                iArr[1] = s0.f1496f;
                iArr2[1] = s0.c(context, a.a.a.u);
                iArr[2] = s0.i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable l(n0 n0Var, Context context, int i) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
            Drawable drawableJ = n0Var.j(context, a.a.e.F);
            Drawable drawableJ2 = n0Var.j(context, a.a.e.G);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void m(Drawable drawable, int i, PorterDuff.Mode mode) {
            if (f0.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = j.f1410a;
            }
            drawable.setColorFilter(j.e(i, mode));
        }

        @Override // androidx.appcompat.widget.n0.f
        public Drawable a(n0 n0Var, Context context, int i) {
            if (i == a.a.e.j) {
                return new LayerDrawable(new Drawable[]{n0Var.j(context, a.a.e.i), n0Var.j(context, a.a.e.k)});
            }
            if (i == a.a.e.y) {
                return l(n0Var, context, a.a.d.i);
            }
            if (i == a.a.e.x) {
                return l(n0Var, context, a.a.d.j);
            }
            if (i == a.a.e.z) {
                return l(n0Var, context, a.a.d.k);
            }
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0046  */
        /* JADX WARN: Code duplicated, block: B:23:0x004c  */
        /* JADX WARN: Code duplicated, block: B:26:0x005d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0061 A[RETURN] */
        @Override // androidx.appcompat.widget.n0.f
        public boolean b(Context context, int i, Drawable drawable) {
            int iRound;
            boolean z;
            PorterDuff.Mode mode = j.f1410a;
            boolean zF = f(this.f1413a, i);
            int i2 = R.attr.colorBackground;
            if (zF) {
                i2 = a.a.a.w;
            } else if (f(this.f1415c, i)) {
                i2 = a.a.a.u;
            } else {
                if (!f(this.f1416d, i)) {
                    if (i == a.a.e.u) {
                        i2 = R.attr.colorForeground;
                        iRound = Math.round(40.8f);
                        z = true;
                    } else if (i != a.a.e.l) {
                        iRound = -1;
                        z = false;
                        i2 = 0;
                    }
                    if (z) {
                        return false;
                    }
                    if (f0.a(drawable)) {
                        drawable = drawable.mutate();
                    }
                    drawable.setColorFilter(j.e(s0.c(context, i2), mode));
                    if (iRound != -1) {
                        drawable.setAlpha(iRound);
                    }
                    return true;
                }
                mode = PorterDuff.Mode.MULTIPLY;
            }
            iRound = -1;
            z = true;
            if (z) {
                return false;
            }
            if (f0.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setColorFilter(j.e(s0.c(context, i2), mode));
            if (iRound != -1) {
                drawable.setAlpha(iRound);
            }
            return true;
        }

        @Override // androidx.appcompat.widget.n0.f
        public ColorStateList c(Context context, int i) {
            if (i == a.a.e.m) {
                return a.a.k.a.a.c(context, a.a.c.f11e);
            }
            if (i == a.a.e.I) {
                return a.a.k.a.a.c(context, a.a.c.h);
            }
            if (i == a.a.e.H) {
                return k(context);
            }
            if (i == a.a.e.f24f) {
                return j(context);
            }
            if (i == a.a.e.f20b) {
                return g(context);
            }
            if (i == a.a.e.f23e) {
                return i(context);
            }
            if (i == a.a.e.D || i == a.a.e.E) {
                return a.a.k.a.a.c(context, a.a.c.g);
            }
            if (f(this.f1414b, i)) {
                return s0.e(context, a.a.a.w);
            }
            if (f(this.f1417e, i)) {
                return a.a.k.a.a.c(context, a.a.c.f10d);
            }
            if (f(this.f1418f, i)) {
                return a.a.k.a.a.c(context, a.a.c.f9c);
            }
            if (i == a.a.e.A) {
                return a.a.k.a.a.c(context, a.a.c.f12f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.n0.f
        public boolean d(Context context, int i, Drawable drawable) {
            Drawable drawableFindDrawableByLayerId;
            int iC;
            if (i == a.a.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.background);
                int i2 = a.a.a.w;
                m(drawableFindDrawableByLayerId2, s0.c(context, i2), j.f1410a);
                m(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), s0.c(context, i2), j.f1410a);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.progress);
                iC = s0.c(context, a.a.a.u);
            } else {
                if (i != a.a.e.y && i != a.a.e.x && i != a.a.e.z) {
                    return false;
                }
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                m(layerDrawable2.findDrawableByLayerId(R.id.background), s0.b(context, a.a.a.w), j.f1410a);
                Drawable drawableFindDrawableByLayerId3 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                int i3 = a.a.a.u;
                m(drawableFindDrawableByLayerId3, s0.c(context, i3), j.f1410a);
                drawableFindDrawableByLayerId = layerDrawable2.findDrawableByLayerId(R.id.progress);
                iC = s0.c(context, i3);
            }
            m(drawableFindDrawableByLayerId, iC, j.f1410a);
            return true;
        }

        @Override // androidx.appcompat.widget.n0.f
        public PorterDuff.Mode e(int i) {
            if (i == a.a.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }
    }

    public static synchronized j b() {
        if (f1411b == null) {
            h();
        }
        return f1411b;
    }

    public static synchronized PorterDuffColorFilter e(int i, PorterDuff.Mode mode) {
        return n0.l(i, mode);
    }

    public static synchronized void h() {
        if (f1411b == null) {
            j jVar = new j();
            f1411b = jVar;
            jVar.f1412c = n0.h();
            f1411b.f1412c.u(new a());
        }
    }

    static void i(Drawable drawable, v0 v0Var, int[] iArr) {
        n0.w(drawable, v0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i) {
        return this.f1412c.j(context, i);
    }

    synchronized Drawable d(Context context, int i, boolean z) {
        return this.f1412c.k(context, i, z);
    }

    synchronized ColorStateList f(Context context, int i) {
        return this.f1412c.m(context, i);
    }

    public synchronized void g(Context context) {
        this.f1412c.s(context);
    }
}
