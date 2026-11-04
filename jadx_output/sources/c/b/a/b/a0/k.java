package c.b.a.b.a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.b.a.b.a0.c f2652a = new i(0.5f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f2653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    d f2654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d f2655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f2656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c.b.a.b.a0.c f2657f;
    c.b.a.b.a0.c g;
    c.b.a.b.a0.c h;
    c.b.a.b.a0.c i;
    f j;
    f k;
    f l;
    f m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private d f2658a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f2659b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private d f2660c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private d f2661d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c.b.a.b.a0.c f2662e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c.b.a.b.a0.c f2663f;
        private c.b.a.b.a0.c g;
        private c.b.a.b.a0.c h;
        private f i;
        private f j;
        private f k;
        private f l;

        public b() {
            this.f2658a = h.b();
            this.f2659b = h.b();
            this.f2660c = h.b();
            this.f2661d = h.b();
            this.f2662e = new c.b.a.b.a0.a(0.0f);
            this.f2663f = new c.b.a.b.a0.a(0.0f);
            this.g = new c.b.a.b.a0.a(0.0f);
            this.h = new c.b.a.b.a0.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            this.l = h.c();
        }

        public b(k kVar) {
            this.f2658a = h.b();
            this.f2659b = h.b();
            this.f2660c = h.b();
            this.f2661d = h.b();
            this.f2662e = new c.b.a.b.a0.a(0.0f);
            this.f2663f = new c.b.a.b.a0.a(0.0f);
            this.g = new c.b.a.b.a0.a(0.0f);
            this.h = new c.b.a.b.a0.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            this.l = h.c();
            this.f2658a = kVar.f2653b;
            this.f2659b = kVar.f2654c;
            this.f2660c = kVar.f2655d;
            this.f2661d = kVar.f2656e;
            this.f2662e = kVar.f2657f;
            this.f2663f = kVar.g;
            this.g = kVar.h;
            this.h = kVar.i;
            this.i = kVar.j;
            this.j = kVar.k;
            this.k = kVar.l;
            this.l = kVar.m;
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f2651a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f2635a;
            }
            return -1.0f;
        }

        public b A(float f2) {
            this.f2662e = new c.b.a.b.a0.a(f2);
            return this;
        }

        public b B(c.b.a.b.a0.c cVar) {
            this.f2662e = cVar;
            return this;
        }

        public b C(int i, c.b.a.b.a0.c cVar) {
            return D(h.a(i)).F(cVar);
        }

        public b D(d dVar) {
            this.f2659b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f2) {
            this.f2663f = new c.b.a.b.a0.a(f2);
            return this;
        }

        public b F(c.b.a.b.a0.c cVar) {
            this.f2663f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f2) {
            return A(f2).E(f2).w(f2).s(f2);
        }

        public b p(c.b.a.b.a0.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i, c.b.a.b.a0.c cVar) {
            return r(h.a(i)).t(cVar);
        }

        public b r(d dVar) {
            this.f2661d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f2) {
            this.h = new c.b.a.b.a0.a(f2);
            return this;
        }

        public b t(c.b.a.b.a0.c cVar) {
            this.h = cVar;
            return this;
        }

        public b u(int i, c.b.a.b.a0.c cVar) {
            return v(h.a(i)).x(cVar);
        }

        public b v(d dVar) {
            this.f2660c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f2) {
            this.g = new c.b.a.b.a0.a(f2);
            return this;
        }

        public b x(c.b.a.b.a0.c cVar) {
            this.g = cVar;
            return this;
        }

        public b y(int i, c.b.a.b.a0.c cVar) {
            return z(h.a(i)).B(cVar);
        }

        public b z(d dVar) {
            this.f2658a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }
    }

    public interface c {
        c.b.a.b.a0.c a(c.b.a.b.a0.c cVar);
    }

    public k() {
        this.f2653b = h.b();
        this.f2654c = h.b();
        this.f2655d = h.b();
        this.f2656e = h.b();
        this.f2657f = new c.b.a.b.a0.a(0.0f);
        this.g = new c.b.a.b.a0.a(0.0f);
        this.h = new c.b.a.b.a0.a(0.0f);
        this.i = new c.b.a.b.a0.a(0.0f);
        this.j = h.c();
        this.k = h.c();
        this.l = h.c();
        this.m = h.c();
    }

    private k(b bVar) {
        this.f2653b = bVar.f2658a;
        this.f2654c = bVar.f2659b;
        this.f2655d = bVar.f2660c;
        this.f2656e = bVar.f2661d;
        this.f2657f = bVar.f2662e;
        this.g = bVar.f2663f;
        this.h = bVar.g;
        this.i = bVar.h;
        this.j = bVar.i;
        this.k = bVar.j;
        this.l = bVar.k;
        this.m = bVar.l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    private static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new c.b.a.b.a0.a(i3));
    }

    private static b d(Context context, int i, int i2, c.b.a.b.a0.c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, c.b.a.b.k.H3);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(c.b.a.b.k.I3, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(c.b.a.b.k.L3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(c.b.a.b.k.M3, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(c.b.a.b.k.K3, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(c.b.a.b.k.J3, i3);
            c.b.a.b.a0.c cVarM = m(typedArrayObtainStyledAttributes, c.b.a.b.k.N3, cVar);
            c.b.a.b.a0.c cVarM2 = m(typedArrayObtainStyledAttributes, c.b.a.b.k.Q3, cVarM);
            c.b.a.b.a0.c cVarM3 = m(typedArrayObtainStyledAttributes, c.b.a.b.k.R3, cVarM);
            c.b.a.b.a0.c cVarM4 = m(typedArrayObtainStyledAttributes, c.b.a.b.k.P3, cVarM);
            return new b().y(i4, cVarM2).C(i5, cVarM3).u(i6, cVarM4).q(i7, m(typedArrayObtainStyledAttributes, c.b.a.b.k.O3, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new c.b.a.b.a0.a(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, c.b.a.b.a0.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.b.a.b.k.R2, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.S2, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.T2, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static c.b.a.b.a0.c m(TypedArray typedArray, int i, c.b.a.b.a0.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i2 = typedValuePeekValue.type;
        if (i2 == 5) {
            return new c.b.a.b.a0.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
        }
        return i2 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.l;
    }

    public d i() {
        return this.f2656e;
    }

    public c.b.a.b.a0.c j() {
        return this.i;
    }

    public d k() {
        return this.f2655d;
    }

    public c.b.a.b.a0.c l() {
        return this.h;
    }

    public f n() {
        return this.m;
    }

    public f o() {
        return this.k;
    }

    public f p() {
        return this.j;
    }

    public d q() {
        return this.f2653b;
    }

    public c.b.a.b.a0.c r() {
        return this.f2657f;
    }

    public d s() {
        return this.f2654c;
    }

    public c.b.a.b.a0.c t() {
        return this.g;
    }

    public boolean u(RectF rectF) {
        boolean z = this.m.getClass().equals(f.class) && this.k.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.l.getClass().equals(f.class);
        float fA = this.f2657f.a(rectF);
        return z && ((this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0 && (this.i.a(rectF) > fA ? 1 : (this.i.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f2654c instanceof j) && (this.f2653b instanceof j) && (this.f2655d instanceof j) && (this.f2656e instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f2) {
        return v().o(f2).m();
    }

    public k x(c.b.a.b.a0.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}
