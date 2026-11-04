package com.bumptech.glide.r;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.o.j;
import com.bumptech.glide.load.q.d.l;
import com.bumptech.glide.load.q.d.o;
import com.bumptech.glide.load.q.d.q;
import com.bumptech.glide.r.a;
import com.bumptech.glide.t.k;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T extends a<T>> implements Cloneable {
    private boolean A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3738b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f3742f;
    private int g;
    private Drawable h;
    private int i;
    private boolean n;
    private Drawable p;
    private int q;
    private boolean u;
    private Resources.Theme v;
    private boolean w;
    private boolean x;
    private boolean y;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3739c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private j f3740d = j.f3313e;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.g f3741e = com.bumptech.glide.g.NORMAL;
    private boolean j = true;
    private int k = -1;
    private int l = -1;
    private com.bumptech.glide.load.g m = com.bumptech.glide.s.c.c();
    private boolean o = true;
    private com.bumptech.glide.load.i r = new com.bumptech.glide.load.i();
    private Map<Class<?>, m<?>> s = new com.bumptech.glide.t.b();
    private Class<?> t = Object.class;
    private boolean z = true;

    private boolean C(int i) {
        return D(this.f3738b, i);
    }

    private static boolean D(int i, int i2) {
        return (i & i2) != 0;
    }

    private T M(l lVar, m<Bitmap> mVar) {
        return (T) Q(lVar, mVar, false);
    }

    private T Q(l lVar, m<Bitmap> mVar, boolean z) {
        T t = z ? (T) Z(lVar, mVar) : (T) N(lVar, mVar);
        t.z = true;
        return t;
    }

    private T R() {
        return this;
    }

    private T S() {
        if (this.u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) R();
    }

    public final boolean A() {
        return C(8);
    }

    boolean B() {
        return this.z;
    }

    public final boolean E() {
        return this.o;
    }

    public final boolean F() {
        return this.n;
    }

    public final boolean G() {
        return C(2048);
    }

    public final boolean H() {
        return k.r(this.l, this.k);
    }

    public T I() {
        this.u = true;
        return (T) R();
    }

    public T J() {
        return (T) N(l.f3549e, new com.bumptech.glide.load.q.d.i());
    }

    public T K() {
        return (T) M(l.f3548d, new com.bumptech.glide.load.q.d.j());
    }

    public T L() {
        return (T) M(l.f3547c, new q());
    }

    final T N(l lVar, m<Bitmap> mVar) {
        if (this.w) {
            return (T) clone().N(lVar, mVar);
        }
        f(lVar);
        return (T) Y(mVar, false);
    }

    public T O(int i, int i2) {
        if (this.w) {
            return (T) clone().O(i, i2);
        }
        this.l = i;
        this.k = i2;
        this.f3738b |= 512;
        return (T) S();
    }

    public T P(com.bumptech.glide.g gVar) {
        if (this.w) {
            return (T) clone().P(gVar);
        }
        this.f3741e = (com.bumptech.glide.g) com.bumptech.glide.t.j.d(gVar);
        this.f3738b |= 8;
        return (T) S();
    }

    public <Y> T T(com.bumptech.glide.load.h<Y> hVar, Y y) {
        if (this.w) {
            return (T) clone().T(hVar, y);
        }
        com.bumptech.glide.t.j.d(hVar);
        com.bumptech.glide.t.j.d(y);
        this.r.e(hVar, y);
        return (T) S();
    }

    public T U(com.bumptech.glide.load.g gVar) {
        if (this.w) {
            return (T) clone().U(gVar);
        }
        this.m = (com.bumptech.glide.load.g) com.bumptech.glide.t.j.d(gVar);
        this.f3738b |= 1024;
        return (T) S();
    }

    public T V(float f2) {
        if (this.w) {
            return (T) clone().V(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f3739c = f2;
        this.f3738b |= 2;
        return (T) S();
    }

    public T W(boolean z) {
        if (this.w) {
            return (T) clone().W(true);
        }
        this.j = !z;
        this.f3738b |= 256;
        return (T) S();
    }

    public T X(m<Bitmap> mVar) {
        return (T) Y(mVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    T Y(m<Bitmap> mVar, boolean z) {
        if (this.w) {
            return (T) clone().Y(mVar, z);
        }
        o oVar = new o(mVar, z);
        a0(Bitmap.class, mVar, z);
        a0(Drawable.class, oVar, z);
        a0(BitmapDrawable.class, oVar.c(), z);
        a0(com.bumptech.glide.load.q.h.c.class, new com.bumptech.glide.load.q.h.f(mVar), z);
        return (T) S();
    }

    final T Z(l lVar, m<Bitmap> mVar) {
        if (this.w) {
            return (T) clone().Z(lVar, mVar);
        }
        f(lVar);
        return (T) X(mVar);
    }

    public T a(a<?> aVar) {
        if (this.w) {
            return (T) clone().a(aVar);
        }
        if (D(aVar.f3738b, 2)) {
            this.f3739c = aVar.f3739c;
        }
        if (D(aVar.f3738b, 262144)) {
            this.x = aVar.x;
        }
        if (D(aVar.f3738b, 1048576)) {
            this.A = aVar.A;
        }
        if (D(aVar.f3738b, 4)) {
            this.f3740d = aVar.f3740d;
        }
        if (D(aVar.f3738b, 8)) {
            this.f3741e = aVar.f3741e;
        }
        if (D(aVar.f3738b, 16)) {
            this.f3742f = aVar.f3742f;
            this.g = 0;
            this.f3738b &= -33;
        }
        if (D(aVar.f3738b, 32)) {
            this.g = aVar.g;
            this.f3742f = null;
            this.f3738b &= -17;
        }
        if (D(aVar.f3738b, 64)) {
            this.h = aVar.h;
            this.i = 0;
            this.f3738b &= -129;
        }
        if (D(aVar.f3738b, 128)) {
            this.i = aVar.i;
            this.h = null;
            this.f3738b &= -65;
        }
        if (D(aVar.f3738b, 256)) {
            this.j = aVar.j;
        }
        if (D(aVar.f3738b, 512)) {
            this.l = aVar.l;
            this.k = aVar.k;
        }
        if (D(aVar.f3738b, 1024)) {
            this.m = aVar.m;
        }
        if (D(aVar.f3738b, 4096)) {
            this.t = aVar.t;
        }
        if (D(aVar.f3738b, 8192)) {
            this.p = aVar.p;
            this.q = 0;
            this.f3738b &= -16385;
        }
        if (D(aVar.f3738b, 16384)) {
            this.q = aVar.q;
            this.p = null;
            this.f3738b &= -8193;
        }
        if (D(aVar.f3738b, 32768)) {
            this.v = aVar.v;
        }
        if (D(aVar.f3738b, 65536)) {
            this.o = aVar.o;
        }
        if (D(aVar.f3738b, 131072)) {
            this.n = aVar.n;
        }
        if (D(aVar.f3738b, 2048)) {
            this.s.putAll(aVar.s);
            this.z = aVar.z;
        }
        if (D(aVar.f3738b, 524288)) {
            this.y = aVar.y;
        }
        if (!this.o) {
            this.s.clear();
            int i = this.f3738b & (-2049);
            this.f3738b = i;
            this.n = false;
            this.f3738b = i & (-131073);
            this.z = true;
        }
        this.f3738b |= aVar.f3738b;
        this.r.d(aVar.r);
        return (T) S();
    }

    <Y> T a0(Class<Y> cls, m<Y> mVar, boolean z) {
        if (this.w) {
            return (T) clone().a0(cls, mVar, z);
        }
        com.bumptech.glide.t.j.d(cls);
        com.bumptech.glide.t.j.d(mVar);
        this.s.put(cls, mVar);
        int i = this.f3738b | 2048;
        this.f3738b = i;
        this.o = true;
        int i2 = i | 65536;
        this.f3738b = i2;
        this.z = false;
        if (z) {
            this.f3738b = i2 | 131072;
            this.n = true;
        }
        return (T) S();
    }

    public T b() {
        if (this.u && !this.w) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.w = true;
        return (T) I();
    }

    public T b0(boolean z) {
        if (this.w) {
            return (T) clone().b0(z);
        }
        this.A = z;
        this.f3738b |= 1048576;
        return (T) S();
    }

    @Override // 
    /* JADX INFO: renamed from: c */
    public T clone() {
        try {
            T t = (T) super.clone();
            com.bumptech.glide.load.i iVar = new com.bumptech.glide.load.i();
            t.r = iVar;
            iVar.d(this.r);
            com.bumptech.glide.t.b bVar = new com.bumptech.glide.t.b();
            t.s = bVar;
            bVar.putAll(this.s);
            t.u = false;
            t.w = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public T d(Class<?> cls) {
        if (this.w) {
            return (T) clone().d(cls);
        }
        this.t = (Class) com.bumptech.glide.t.j.d(cls);
        this.f3738b |= 4096;
        return (T) S();
    }

    public T e(j jVar) {
        if (this.w) {
            return (T) clone().e(jVar);
        }
        this.f3740d = (j) com.bumptech.glide.t.j.d(jVar);
        this.f3738b |= 4;
        return (T) S();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(aVar.f3739c, this.f3739c) == 0 && this.g == aVar.g && k.c(this.f3742f, aVar.f3742f) && this.i == aVar.i && k.c(this.h, aVar.h) && this.q == aVar.q && k.c(this.p, aVar.p) && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.n == aVar.n && this.o == aVar.o && this.x == aVar.x && this.y == aVar.y && this.f3740d.equals(aVar.f3740d) && this.f3741e == aVar.f3741e && this.r.equals(aVar.r) && this.s.equals(aVar.s) && this.t.equals(aVar.t) && k.c(this.m, aVar.m) && k.c(this.v, aVar.v);
    }

    public T f(l lVar) {
        return (T) T(l.h, com.bumptech.glide.t.j.d(lVar));
    }

    public final j g() {
        return this.f3740d;
    }

    public final int h() {
        return this.g;
    }

    public int hashCode() {
        return k.m(this.v, k.m(this.m, k.m(this.t, k.m(this.s, k.m(this.r, k.m(this.f3741e, k.m(this.f3740d, k.n(this.y, k.n(this.x, k.n(this.o, k.n(this.n, k.l(this.l, k.l(this.k, k.n(this.j, k.m(this.p, k.l(this.q, k.m(this.h, k.l(this.i, k.m(this.f3742f, k.l(this.g, k.j(this.f3739c)))))))))))))))))))));
    }

    public final Drawable i() {
        return this.f3742f;
    }

    public final Drawable j() {
        return this.p;
    }

    public final int k() {
        return this.q;
    }

    public final boolean l() {
        return this.y;
    }

    public final com.bumptech.glide.load.i m() {
        return this.r;
    }

    public final int n() {
        return this.k;
    }

    public final int o() {
        return this.l;
    }

    public final Drawable p() {
        return this.h;
    }

    public final int q() {
        return this.i;
    }

    public final com.bumptech.glide.g r() {
        return this.f3741e;
    }

    public final Class<?> s() {
        return this.t;
    }

    public final com.bumptech.glide.load.g t() {
        return this.m;
    }

    public final float u() {
        return this.f3739c;
    }

    public final Resources.Theme v() {
        return this.v;
    }

    public final Map<Class<?>, m<?>> w() {
        return this.s;
    }

    public final boolean x() {
        return this.A;
    }

    public final boolean y() {
        return this.x;
    }

    public final boolean z() {
        return this.j;
    }
}
