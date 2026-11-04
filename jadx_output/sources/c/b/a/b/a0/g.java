package c.b.a.b.a0;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f2636b = g.class.getSimpleName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Paint f2637c = new Paint(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f2638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m.g[] f2639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m.g[] f2640f;
    private final BitSet g;
    private boolean h;
    private final Matrix i;
    private final Path j;
    private final Path k;
    private final RectF l;
    private final RectF m;
    private final Region n;
    private final Region o;
    private k p;
    private final Paint q;
    private final Paint r;
    private final c.b.a.b.z.a s;
    private final l.b t;
    private final l u;
    private PorterDuffColorFilter v;
    private PorterDuffColorFilter w;
    private final RectF x;
    private boolean y;

    class a implements l.b {
        a() {
        }

        @Override // c.b.a.b.a0.l.b
        public void a(m mVar, Matrix matrix, int i) {
            g.this.g.set(i + 4, mVar.e());
            g.this.f2640f[i] = mVar.f(matrix);
        }

        @Override // c.b.a.b.a0.l.b
        public void b(m mVar, Matrix matrix, int i) {
            g.this.g.set(i, mVar.e());
            g.this.f2639e[i] = mVar.f(matrix);
        }
    }

    class b implements k.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f2642a;

        b(float f2) {
            this.f2642a = f2;
        }

        @Override // c.b.a.b.a0.k.c
        public c.b.a.b.a0.c a(c.b.a.b.a0.c cVar) {
            return cVar instanceof i ? cVar : new c.b.a.b.a0.b(this.f2642a, cVar);
        }
    }

    static final class c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public k f2644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.b.a.b.t.a f2645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorFilter f2646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ColorStateList f2647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public ColorStateList f2648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ColorStateList f2649f;
        public ColorStateList g;
        public PorterDuff.Mode h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(c cVar) {
            this.f2647d = null;
            this.f2648e = null;
            this.f2649f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f2644a = cVar.f2644a;
            this.f2645b = cVar.f2645b;
            this.l = cVar.l;
            this.f2646c = cVar.f2646c;
            this.f2647d = cVar.f2647d;
            this.f2648e = cVar.f2648e;
            this.h = cVar.h;
            this.g = cVar.g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f2649f = cVar.f2649f;
            this.v = cVar.v;
            if (cVar.i != null) {
                this.i = new Rect(cVar.i);
            }
        }

        public c(k kVar, c.b.a.b.t.a aVar) {
            this.f2647d = null;
            this.f2648e = null;
            this.f2649f = null;
            this.g = null;
            this.h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f2644a = kVar;
            this.f2645b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.h = true;
            return gVar;
        }
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.e(context, attributeSet, i, i2).m());
    }

    private g(c cVar) {
        this.f2639e = new m.g[4];
        this.f2640f = new m.g[4];
        this.g = new BitSet(8);
        this.i = new Matrix();
        this.j = new Path();
        this.k = new Path();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Region();
        this.o = new Region();
        Paint paint = new Paint(1);
        this.q = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = new c.b.a.b.z.a();
        this.u = Looper.getMainLooper().getThread() == Thread.currentThread() ? l.k() : new l();
        this.x = new RectF();
        this.y = true;
        this.f2638d = cVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = f2637c;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        g0();
        f0(getState());
        this.t = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private float D() {
        if (L()) {
            return this.r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean J() {
        c cVar = this.f2638d;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || T());
    }

    private boolean K() {
        Paint.Style style = this.f2638d.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean L() {
        Paint.Style style = this.f2638d.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.r.getStrokeWidth() > 0.0f;
    }

    private void N() {
        super.invalidateSelf();
    }

    private void Q(Canvas canvas) {
        if (J()) {
            canvas.save();
            S(canvas);
            if (this.y) {
                int iWidth = (int) (this.x.width() - getBounds().width());
                int iHeight = (int) (this.x.height() - getBounds().height());
                if (iWidth < 0 || iHeight < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((int) this.x.width()) + (this.f2638d.r * 2) + iWidth, ((int) this.x.height()) + (this.f2638d.r * 2) + iHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f2 = (getBounds().left - this.f2638d.r) - iWidth;
                float f3 = (getBounds().top - this.f2638d.r) - iHeight;
                canvas2.translate(-f2, -f3);
                n(canvas2);
                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                bitmapCreateBitmap.recycle();
            } else {
                n(canvas);
            }
            canvas.restore();
        }
    }

    private static int R(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private void S(Canvas canvas) {
        int iZ = z();
        int iA = A();
        if (Build.VERSION.SDK_INT < 21 && this.y) {
            Rect clipBounds = canvas.getClipBounds();
            int i = this.f2638d.r;
            clipBounds.inset(-i, -i);
            clipBounds.offset(iZ, iA);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(iZ, iA);
    }

    private PorterDuffColorFilter f(Paint paint, boolean z) {
        int color;
        int iL;
        if (!z || (iL = l((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(iL, PorterDuff.Mode.SRC_IN);
    }

    private boolean f0(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f2638d.f2647d == null || color2 == (colorForState2 = this.f2638d.f2647d.getColorForState(iArr, (color2 = this.q.getColor())))) {
            z = false;
        } else {
            this.q.setColor(colorForState2);
            z = true;
        }
        if (this.f2638d.f2648e == null || color == (colorForState = this.f2638d.f2648e.getColorForState(iArr, (color = this.r.getColor())))) {
            return z;
        }
        this.r.setColor(colorForState);
        return true;
    }

    private void g(RectF rectF, Path path) {
        h(rectF, path);
        if (this.f2638d.j != 1.0f) {
            this.i.reset();
            Matrix matrix = this.i;
            float f2 = this.f2638d.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.i);
        }
        path.computeBounds(this.x, true);
    }

    private boolean g0() {
        PorterDuffColorFilter porterDuffColorFilter = this.v;
        PorterDuffColorFilter porterDuffColorFilter2 = this.w;
        c cVar = this.f2638d;
        this.v = k(cVar.g, cVar.h, this.q, true);
        c cVar2 = this.f2638d;
        this.w = k(cVar2.f2649f, cVar2.h, this.r, false);
        c cVar3 = this.f2638d;
        if (cVar3.u) {
            this.s.d(cVar3.g.getColorForState(getState(), 0));
        }
        return (a.g.k.c.a(porterDuffColorFilter, this.v) && a.g.k.c.a(porterDuffColorFilter2, this.w)) ? false : true;
    }

    private void h0() {
        float fI = I();
        this.f2638d.r = (int) Math.ceil(0.75f * fI);
        this.f2638d.s = (int) Math.ceil(fI * 0.25f);
        g0();
        N();
    }

    private void i() {
        k kVarY = C().y(new b(-D()));
        this.p = kVarY;
        this.u.d(kVarY, this.f2638d.k, v(), this.k);
    }

    private PorterDuffColorFilter j(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = l(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter k(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? f(paint, z) : j(colorStateList, mode, z);
    }

    public static g m(Context context, float f2) {
        int iB = c.b.a.b.q.a.b(context, c.b.a.b.b.k, g.class.getSimpleName());
        g gVar = new g();
        gVar.M(context);
        gVar.W(ColorStateList.valueOf(iB));
        gVar.V(f2);
        return gVar;
    }

    private void n(Canvas canvas) {
        if (this.g.cardinality() > 0) {
            Log.w(f2636b, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f2638d.s != 0) {
            canvas.drawPath(this.j, this.s.c());
        }
        for (int i = 0; i < 4; i++) {
            this.f2639e[i].b(this.s, this.f2638d.r, canvas);
            this.f2640f[i].b(this.s, this.f2638d.r, canvas);
        }
        if (this.y) {
            int iZ = z();
            int iA = A();
            canvas.translate(-iZ, -iA);
            canvas.drawPath(this.j, f2637c);
            canvas.translate(iZ, iA);
        }
    }

    private void o(Canvas canvas) {
        q(canvas, this.q, this.j, this.f2638d.f2644a, u());
    }

    private void q(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.t().a(rectF) * this.f2638d.k;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    private void r(Canvas canvas) {
        q(canvas, this.r, this.k, this.p, v());
    }

    private RectF v() {
        this.m.set(u());
        float fD = D();
        this.m.inset(fD, fD);
        return this.m;
    }

    public int A() {
        c cVar = this.f2638d;
        return (int) (((double) cVar.s) * Math.cos(Math.toRadians(cVar.t)));
    }

    public int B() {
        return this.f2638d.r;
    }

    public k C() {
        return this.f2638d.f2644a;
    }

    public ColorStateList E() {
        return this.f2638d.g;
    }

    public float F() {
        return this.f2638d.f2644a.r().a(u());
    }

    public float G() {
        return this.f2638d.f2644a.t().a(u());
    }

    public float H() {
        return this.f2638d.p;
    }

    public float I() {
        return w() + H();
    }

    public void M(Context context) {
        this.f2638d.f2645b = new c.b.a.b.t.a(context);
        h0();
    }

    public boolean O() {
        c.b.a.b.t.a aVar = this.f2638d.f2645b;
        return aVar != null && aVar.d();
    }

    public boolean P() {
        return this.f2638d.f2644a.u(u());
    }

    public boolean T() {
        int i = Build.VERSION.SDK_INT;
        return i < 21 || !(P() || this.j.isConvex() || i >= 29);
    }

    public void U(c.b.a.b.a0.c cVar) {
        setShapeAppearanceModel(this.f2638d.f2644a.x(cVar));
    }

    public void V(float f2) {
        c cVar = this.f2638d;
        if (cVar.o != f2) {
            cVar.o = f2;
            h0();
        }
    }

    public void W(ColorStateList colorStateList) {
        c cVar = this.f2638d;
        if (cVar.f2647d != colorStateList) {
            cVar.f2647d = colorStateList;
            onStateChange(getState());
        }
    }

    public void X(float f2) {
        c cVar = this.f2638d;
        if (cVar.k != f2) {
            cVar.k = f2;
            this.h = true;
            invalidateSelf();
        }
    }

    public void Y(int i, int i2, int i3, int i4) {
        c cVar = this.f2638d;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.f2638d.i.set(i, i2, i3, i4);
        invalidateSelf();
    }

    public void Z(float f2) {
        c cVar = this.f2638d;
        if (cVar.n != f2) {
            cVar.n = f2;
            h0();
        }
    }

    public void a0(int i) {
        c cVar = this.f2638d;
        if (cVar.t != i) {
            cVar.t = i;
            N();
        }
    }

    public void b0(float f2, int i) {
        e0(f2);
        d0(ColorStateList.valueOf(i));
    }

    public void c0(float f2, ColorStateList colorStateList) {
        e0(f2);
        d0(colorStateList);
    }

    public void d0(ColorStateList colorStateList) {
        c cVar = this.f2638d;
        if (cVar.f2648e != colorStateList) {
            cVar.f2648e = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.q.setColorFilter(this.v);
        int alpha = this.q.getAlpha();
        this.q.setAlpha(R(alpha, this.f2638d.m));
        this.r.setColorFilter(this.w);
        this.r.setStrokeWidth(this.f2638d.l);
        int alpha2 = this.r.getAlpha();
        this.r.setAlpha(R(alpha2, this.f2638d.m));
        if (this.h) {
            i();
            g(u(), this.j);
            this.h = false;
        }
        Q(canvas);
        if (K()) {
            o(canvas);
        }
        if (L()) {
            r(canvas);
        }
        this.q.setAlpha(alpha);
        this.r.setAlpha(alpha2);
    }

    public void e0(float f2) {
        this.f2638d.l = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f2638d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f2638d.q == 2) {
            return;
        }
        if (P()) {
            outline.setRoundRect(getBounds(), F() * this.f2638d.k);
            return;
        }
        g(u(), this.j);
        if (this.j.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.j);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f2638d.i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.n.set(getBounds());
        g(u(), this.j);
        this.o.setPath(this.j, this.n);
        this.n.op(this.o, Region.Op.DIFFERENCE);
        return this.n;
    }

    protected final void h(RectF rectF, Path path) {
        l lVar = this.u;
        c cVar = this.f2638d;
        lVar.e(cVar.f2644a, cVar.k, rectF, this.t, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.h = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f2638d.g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f2638d.f2649f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f2638d.f2648e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f2638d.f2647d) != null && colorStateList4.isStateful())));
    }

    protected int l(int i) {
        float fI = I() + y();
        c.b.a.b.t.a aVar = this.f2638d.f2645b;
        return aVar != null ? aVar.c(i, fI) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2638d = new c(this.f2638d);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.h = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z = f0(iArr) || g0();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    protected void p(Canvas canvas, Paint paint, Path path, RectF rectF) {
        q(canvas, paint, path, this.f2638d.f2644a, rectF);
    }

    public float s() {
        return this.f2638d.f2644a.j().a(u());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.f2638d;
        if (cVar.m != i) {
            cVar.m = i;
            N();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2638d.f2646c = colorFilter;
        N();
    }

    @Override // c.b.a.b.a0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f2638d.f2644a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f2638d.g = colorStateList;
        g0();
        N();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f2638d;
        if (cVar.h != mode) {
            cVar.h = mode;
            g0();
            N();
        }
    }

    public float t() {
        return this.f2638d.f2644a.l().a(u());
    }

    protected RectF u() {
        this.l.set(getBounds());
        return this.l;
    }

    public float w() {
        return this.f2638d.o;
    }

    public ColorStateList x() {
        return this.f2638d.f2647d;
    }

    public float y() {
        return this.f2638d.n;
    }

    public int z() {
        c cVar = this.f2638d;
        return (int) (((double) cVar.s) * Math.sin(Math.toRadians(cVar.t)));
    }
}
