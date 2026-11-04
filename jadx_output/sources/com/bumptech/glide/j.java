package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class j<TranscodeType> extends com.bumptech.glide.r.a<j<TranscodeType>> implements Cloneable {
    protected static final com.bumptech.glide.r.f B = new com.bumptech.glide.r.f().e(com.bumptech.glide.load.o.j.f3311c).P(g.LOW).W(true);
    private final Context C;
    private final k D;
    private final Class<TranscodeType> E;
    private final c F;
    private final e G;
    private l<?, ? super TranscodeType> H;
    private Object I;
    private List<com.bumptech.glide.r.e<TranscodeType>> J;
    private j<TranscodeType> K;
    private j<TranscodeType> L;
    private Float M;
    private boolean N = true;
    private boolean O;
    private boolean P;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3078a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3079b;

        static {
            int[] iArr = new int[g.values().length];
            f3079b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3079b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3079b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3079b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f3078a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3078a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3078a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3078a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3078a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3078a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3078a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3078a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected j(c cVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.F = cVar;
        this.D = kVar;
        this.E = cls;
        this.C = context;
        this.H = kVar.r(cls);
        this.G = cVar.i();
        j0(kVar.p());
        a(kVar.q());
    }

    private com.bumptech.glide.r.c e0(com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        return f0(new Object(), hVar, eVar, null, this.H, aVar.r(), aVar.o(), aVar.n(), aVar, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.bumptech.glide.r.c f0(Object obj, com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i, int i2, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        com.bumptech.glide.r.b bVar;
        com.bumptech.glide.r.d bVar2;
        if (this.L != null) {
            bVar2 = new com.bumptech.glide.r.b(obj, dVar);
            bVar = bVar2;
        } else {
            bVar = 0;
            bVar2 = dVar;
        }
        com.bumptech.glide.r.c cVarG0 = g0(obj, hVar, eVar, bVar2, lVar, gVar, i, i2, aVar, executor);
        if (bVar == 0) {
            return cVarG0;
        }
        int iO = this.L.o();
        int iN = this.L.n();
        if (com.bumptech.glide.t.k.r(i, i2) && !this.L.H()) {
            iO = aVar.o();
            iN = aVar.n();
        }
        j<TranscodeType> jVar = this.L;
        bVar.q(cVarG0, jVar.f0(obj, hVar, eVar, bVar, jVar.H, jVar.r(), iO, iN, this.L, executor));
        return bVar;
    }

    private com.bumptech.glide.r.c g0(Object obj, com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i, int i2, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        j<TranscodeType> jVar = this.K;
        if (jVar == null) {
            if (this.M == null) {
                return t0(obj, hVar, eVar, aVar, dVar, lVar, gVar, i, i2, executor);
            }
            com.bumptech.glide.r.i iVar = new com.bumptech.glide.r.i(obj, dVar);
            iVar.p(t0(obj, hVar, eVar, aVar, iVar, lVar, gVar, i, i2, executor), t0(obj, hVar, eVar, aVar.c().V(this.M.floatValue()), iVar, lVar, i0(gVar), i, i2, executor));
            return iVar;
        }
        if (this.P) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l<?, ? super TranscodeType> lVar2 = jVar.N ? lVar : jVar.H;
        g gVarR = jVar.A() ? this.K.r() : i0(gVar);
        int iO = this.K.o();
        int iN = this.K.n();
        if (com.bumptech.glide.t.k.r(i, i2) && !this.K.H()) {
            iO = aVar.o();
            iN = aVar.n();
        }
        com.bumptech.glide.r.i iVar2 = new com.bumptech.glide.r.i(obj, dVar);
        com.bumptech.glide.r.c cVarT0 = t0(obj, hVar, eVar, aVar, iVar2, lVar, gVar, i, i2, executor);
        this.P = true;
        j<TranscodeType> jVar2 = this.K;
        com.bumptech.glide.r.c cVarF0 = jVar2.f0(obj, hVar, eVar, iVar2, lVar2, gVarR, iO, iN, jVar2, executor);
        this.P = false;
        iVar2.p(cVarT0, cVarF0);
        return iVar2;
    }

    private g i0(g gVar) {
        int i = a.f3079b[gVar.ordinal()];
        if (i == 1) {
            return g.NORMAL;
        }
        if (i == 2) {
            return g.HIGH;
        }
        if (i == 3 || i == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + r());
    }

    @SuppressLint({"CheckResult"})
    private void j0(List<com.bumptech.glide.r.e<Object>> list) {
        Iterator<com.bumptech.glide.r.e<Object>> it = list.iterator();
        while (it.hasNext()) {
            c0((com.bumptech.glide.r.e) it.next());
        }
    }

    private <Y extends com.bumptech.glide.r.j.h<TranscodeType>> Y l0(Y y, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.a<?> aVar, Executor executor) {
        com.bumptech.glide.t.j.d(y);
        if (!this.O) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        com.bumptech.glide.r.c cVarE0 = e0(y, eVar, aVar, executor);
        com.bumptech.glide.r.c cVarG = y.g();
        if (cVarE0.h(cVarG) && !o0(aVar, cVarG)) {
            if (!((com.bumptech.glide.r.c) com.bumptech.glide.t.j.d(cVarG)).isRunning()) {
                cVarG.f();
            }
            return y;
        }
        this.D.o(y);
        y.j(cVarE0);
        this.D.z(y, cVarE0);
        return y;
    }

    private boolean o0(com.bumptech.glide.r.a<?> aVar, com.bumptech.glide.r.c cVar) {
        return !aVar.z() && cVar.i();
    }

    private j<TranscodeType> s0(Object obj) {
        this.I = obj;
        this.O = true;
        return this;
    }

    private com.bumptech.glide.r.c t0(Object obj, com.bumptech.glide.r.j.h<TranscodeType> hVar, com.bumptech.glide.r.e<TranscodeType> eVar, com.bumptech.glide.r.a<?> aVar, com.bumptech.glide.r.d dVar, l<?, ? super TranscodeType> lVar, g gVar, int i, int i2, Executor executor) {
        Context context = this.C;
        e eVar2 = this.G;
        return com.bumptech.glide.r.h.y(context, eVar2, obj, this.I, this.E, aVar, i, i2, gVar, hVar, eVar, this.J, dVar, eVar2.f(), lVar.b(), executor);
    }

    public j<TranscodeType> c0(com.bumptech.glide.r.e<TranscodeType> eVar) {
        if (eVar != null) {
            if (this.J == null) {
                this.J = new ArrayList();
            }
            this.J.add(eVar);
        }
        return this;
    }

    @Override // com.bumptech.glide.r.a
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> a(com.bumptech.glide.r.a<?> aVar) {
        com.bumptech.glide.t.j.d(aVar);
        return (j) super.a(aVar);
    }

    @Override // com.bumptech.glide.r.a
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public j<TranscodeType> c() {
        j<TranscodeType> jVar = (j) super.c();
        jVar.H = jVar.H.clone();
        return jVar;
    }

    public <Y extends com.bumptech.glide.r.j.h<TranscodeType>> Y k0(Y y) {
        return (Y) m0(y, null, com.bumptech.glide.t.e.b());
    }

    <Y extends com.bumptech.glide.r.j.h<TranscodeType>> Y m0(Y y, com.bumptech.glide.r.e<TranscodeType> eVar, Executor executor) {
        return (Y) l0(y, eVar, this, executor);
    }

    public com.bumptech.glide.r.j.i<ImageView, TranscodeType> n0(ImageView imageView) {
        com.bumptech.glide.r.a aVarJ;
        com.bumptech.glide.t.k.a();
        com.bumptech.glide.t.j.d(imageView);
        if (!G() && E() && imageView.getScaleType() != null) {
            switch (a.f3078a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarJ = c().J();
                    break;
                case 2:
                case 6:
                    aVarJ = c().K();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarJ = c().L();
                    break;
                default:
                    aVarJ = this;
                    break;
            }
        } else {
            aVarJ = this;
        }
        return (com.bumptech.glide.r.j.i) l0(this.G.a(imageView, this.E), null, aVarJ, com.bumptech.glide.t.e.b());
    }

    public j<TranscodeType> p0(Bitmap bitmap) {
        return s0(bitmap).a(com.bumptech.glide.r.f.d0(com.bumptech.glide.load.o.j.f3310b));
    }

    public j<TranscodeType> q0(Integer num) {
        return s0(num).a(com.bumptech.glide.r.f.e0(com.bumptech.glide.s.a.c(this.C)));
    }

    public j<TranscodeType> r0(Object obj) {
        return s0(obj);
    }
}
