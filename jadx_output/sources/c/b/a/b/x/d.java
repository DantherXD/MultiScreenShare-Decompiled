package c.b.a.b.x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import c.b.a.b.k;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f2803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ColorStateList f2804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ColorStateList f2805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ColorStateList f2806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f2807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2808f;
    public final int g;
    public final boolean h;
    public final float i;
    public final float j;
    public final float k;
    public final boolean l;
    public final float m;
    public float n;
    private final int o;
    private boolean p = false;
    private Typeface q;

    class a extends a.g.d.f.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f f2809a;

        a(f fVar) {
            this.f2809a = fVar;
        }

        @Override // a.g.d.f.f.a
        public void d(int i) {
            d.this.p = true;
            this.f2809a.a(i);
        }

        @Override // a.g.d.f.f.a
        public void e(Typeface typeface) {
            d dVar = d.this;
            dVar.q = Typeface.create(typeface, dVar.f2808f);
            d.this.p = true;
            this.f2809a.b(d.this.q, false);
        }
    }

    class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextPaint f2811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f2812b;

        b(TextPaint textPaint, f fVar) {
            this.f2811a = textPaint;
            this.f2812b = fVar;
        }

        @Override // c.b.a.b.x.f
        public void a(int i) {
            this.f2812b.a(i);
        }

        @Override // c.b.a.b.x.f
        public void b(Typeface typeface, boolean z) {
            d.this.l(this.f2811a, typeface);
            this.f2812b.b(typeface, z);
        }
    }

    public d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, k.n4);
        this.n = typedArrayObtainStyledAttributes.getDimension(k.o4, 0.0f);
        this.f2803a = c.a(context, typedArrayObtainStyledAttributes, k.r4);
        this.f2804b = c.a(context, typedArrayObtainStyledAttributes, k.s4);
        this.f2805c = c.a(context, typedArrayObtainStyledAttributes, k.t4);
        this.f2808f = typedArrayObtainStyledAttributes.getInt(k.q4, 0);
        this.g = typedArrayObtainStyledAttributes.getInt(k.p4, 1);
        int iE = c.e(typedArrayObtainStyledAttributes, k.z4, k.y4);
        this.o = typedArrayObtainStyledAttributes.getResourceId(iE, 0);
        this.f2807e = typedArrayObtainStyledAttributes.getString(iE);
        this.h = typedArrayObtainStyledAttributes.getBoolean(k.A4, false);
        this.f2806d = c.a(context, typedArrayObtainStyledAttributes, k.u4);
        this.i = typedArrayObtainStyledAttributes.getFloat(k.v4, 0.0f);
        this.j = typedArrayObtainStyledAttributes.getFloat(k.w4, 0.0f);
        this.k = typedArrayObtainStyledAttributes.getFloat(k.x4, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT < 21) {
            this.l = false;
            this.m = 0.0f;
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, k.U2);
        int i2 = k.V2;
        this.l = typedArrayObtainStyledAttributes2.hasValue(i2);
        this.m = typedArrayObtainStyledAttributes2.getFloat(i2, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    private void d() {
        Typeface typeface;
        String str;
        if (this.q == null && (str = this.f2807e) != null) {
            this.q = Typeface.create(str, this.f2808f);
        }
        if (this.q == null) {
            int i = this.g;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i != 2) {
                typeface = i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE;
            } else {
                typeface = Typeface.SERIF;
            }
            this.q = typeface;
            this.q = Typeface.create(this.q, this.f2808f);
        }
    }

    private boolean i(Context context) {
        if (e.a()) {
            return true;
        }
        int i = this.o;
        return (i != 0 ? a.g.d.f.f.a(context, i) : null) != null;
    }

    public Typeface e() {
        d();
        return this.q;
    }

    public Typeface f(Context context) {
        if (this.p) {
            return this.q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceC = a.g.d.f.f.c(context, this.o);
                this.q = typefaceC;
                if (typefaceC != null) {
                    this.q = Typeface.create(typefaceC, this.f2808f);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f2807e, e2);
            }
        }
        d();
        this.p = true;
        return this.q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        l(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (i(context)) {
            f(context);
        } else {
            d();
        }
        int i = this.o;
        if (i == 0) {
            this.p = true;
        }
        if (this.p) {
            fVar.b(this.q, true);
            return;
        }
        try {
            a.g.d.f.f.e(context, i, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.p = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f2807e, e2);
            this.p = true;
            fVar.a(-3);
        }
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        k(context, textPaint, fVar);
        ColorStateList colorStateList = this.f2803a;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.k;
        float f3 = this.i;
        float f4 = this.j;
        ColorStateList colorStateList2 = this.f2806d;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void k(Context context, TextPaint textPaint, f fVar) {
        if (i(context)) {
            l(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void l(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f2808f;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.n);
        if (Build.VERSION.SDK_INT < 21 || !this.l) {
            return;
        }
        textPaint.setLetterSpacing(this.m);
    }
}
