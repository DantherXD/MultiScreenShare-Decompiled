package com.bumptech.glide.load.o;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class h<R> implements com.bumptech.glide.load.o.f.a, Runnable, Comparable<h<?>>, com.bumptech.glide.t.l.a.f {
    private Object A;
    private com.bumptech.glide.load.a B;
    private com.bumptech.glide.load.n.d<?> C;
    private volatile com.bumptech.glide.load.o.f D;
    private volatile boolean E;
    private volatile boolean F;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final e f3282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a.g.k.e<h<?>> f3283f;
    private com.bumptech.glide.e i;
    private com.bumptech.glide.load.g j;
    private com.bumptech.glide.g k;
    private n l;
    private int m;
    private int n;
    private j o;
    private com.bumptech.glide.load.i p;
    private b<R> q;
    private int r;
    private EnumC0075h s;
    private g t;
    private long u;
    private boolean v;
    private Object w;
    private Thread x;
    private com.bumptech.glide.load.g y;
    private com.bumptech.glide.load.g z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.o.g<R> f3279b = new com.bumptech.glide.load.o.g<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Throwable> f3280c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.t.l.c f3281d = com.bumptech.glide.t.l.c.a();
    private final d<?> g = new d<>();
    private final f h = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f3285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f3286c;

        static {
            int[] iArr = new int[com.bumptech.glide.load.c.values().length];
            f3286c = iArr;
            try {
                iArr[com.bumptech.glide.load.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3286c[com.bumptech.glide.load.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0075h.values().length];
            f3285b = iArr2;
            try {
                iArr2[EnumC0075h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3285b[EnumC0075h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3285b[EnumC0075h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3285b[EnumC0075h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3285b[EnumC0075h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f3284a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3284a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3284a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b<R> {
        void a(q qVar);

        void c(v<R> vVar, com.bumptech.glide.load.a aVar);

        void d(h<?> hVar);
    }

    private final class c<Z> implements i.a<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.a f3287a;

        c(com.bumptech.glide.load.a aVar) {
            this.f3287a = aVar;
        }

        @Override // com.bumptech.glide.load.o.i.a
        public v<Z> a(v<Z> vVar) {
            return h.this.v(this.f3287a, vVar);
        }
    }

    private static class d<Z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.bumptech.glide.load.g f3289a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.bumptech.glide.load.l<Z> f3290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private u<Z> f3291c;

        d() {
        }

        void a() {
            this.f3289a = null;
            this.f3290b = null;
            this.f3291c = null;
        }

        void b(e eVar, com.bumptech.glide.load.i iVar) {
            com.bumptech.glide.t.l.b.a("DecodeJob.encode");
            try {
                eVar.a().a(this.f3289a, new com.bumptech.glide.load.o.e(this.f3290b, this.f3291c, iVar));
            } finally {
                this.f3291c.i();
                com.bumptech.glide.t.l.b.d();
            }
        }

        boolean c() {
            return this.f3291c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        <X> void d(com.bumptech.glide.load.g gVar, com.bumptech.glide.load.l<X> lVar, u<X> uVar) {
            this.f3289a = gVar;
            this.f3290b = lVar;
            this.f3291c = uVar;
        }
    }

    interface e {
        com.bumptech.glide.load.o.b0.a a();
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f3292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f3293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f3294c;

        f() {
        }

        private boolean a(boolean z) {
            return (this.f3294c || z || this.f3293b) && this.f3292a;
        }

        synchronized boolean b() {
            this.f3293b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f3294c = true;
            return a(false);
        }

        synchronized boolean d(boolean z) {
            this.f3292a = true;
            return a(z);
        }

        synchronized void e() {
            this.f3293b = false;
            this.f3292a = false;
            this.f3294c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.o.h$h, reason: collision with other inner class name */
    private enum EnumC0075h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, a.g.k.e<h<?>> eVar2) {
        this.f3282e = eVar;
        this.f3283f = eVar2;
    }

    private void A() {
        int i = a.f3284a[this.t.ordinal()];
        if (i == 1) {
            this.s = k(EnumC0075h.INITIALIZE);
            this.D = j();
        } else if (i != 2) {
            if (i == 3) {
                i();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.t);
        }
        y();
    }

    private void B() {
        Throwable th;
        this.f3281d.c();
        if (!this.E) {
            this.E = true;
            return;
        }
        if (this.f3280c.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f3280c;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    private <Data> v<R> g(com.bumptech.glide.load.n.d<?> dVar, Data data, com.bumptech.glide.load.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = com.bumptech.glide.t.f.b();
            v<R> vVarH = h(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                o("Decoded result " + vVarH, jB);
            }
            return vVarH;
        } finally {
            dVar.b();
        }
    }

    private <Data> v<R> h(Data data, com.bumptech.glide.load.a aVar) {
        return z(data, aVar, this.f3279b.h(data.getClass()));
    }

    private void i() {
        if (Log.isLoggable("DecodeJob", 2)) {
            p("Retrieved data", this.u, "data: " + this.A + ", cache key: " + this.y + ", fetcher: " + this.C);
        }
        v<R> vVarG = null;
        try {
            vVarG = g(this.C, this.A, this.B);
        } catch (q e2) {
            e2.i(this.z, this.B);
            this.f3280c.add(e2);
        }
        if (vVarG != null) {
            r(vVarG, this.B);
        } else {
            y();
        }
    }

    private com.bumptech.glide.load.o.f j() {
        int i = a.f3285b[this.s.ordinal()];
        if (i == 1) {
            return new w(this.f3279b, this);
        }
        if (i == 2) {
            return new com.bumptech.glide.load.o.c(this.f3279b, this);
        }
        if (i == 3) {
            return new z(this.f3279b, this);
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.s);
    }

    private EnumC0075h k(EnumC0075h enumC0075h) {
        int i = a.f3285b[enumC0075h.ordinal()];
        if (i == 1) {
            return this.o.a() ? EnumC0075h.DATA_CACHE : k(EnumC0075h.DATA_CACHE);
        }
        if (i == 2) {
            return this.v ? EnumC0075h.FINISHED : EnumC0075h.SOURCE;
        }
        if (i == 3 || i == 4) {
            return EnumC0075h.FINISHED;
        }
        if (i == 5) {
            return this.o.b() ? EnumC0075h.RESOURCE_CACHE : k(EnumC0075h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0075h);
    }

    private com.bumptech.glide.load.i l(com.bumptech.glide.load.a aVar) {
        com.bumptech.glide.load.i iVar = this.p;
        if (Build.VERSION.SDK_INT < 26) {
            return iVar;
        }
        boolean z = aVar == com.bumptech.glide.load.a.RESOURCE_DISK_CACHE || this.f3279b.w();
        com.bumptech.glide.load.h<Boolean> hVar = com.bumptech.glide.load.q.d.m.f3558e;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool != null && (!bool.booleanValue() || z)) {
            return iVar;
        }
        com.bumptech.glide.load.i iVar2 = new com.bumptech.glide.load.i();
        iVar2.d(this.p);
        iVar2.e(hVar, Boolean.valueOf(z));
        return iVar2;
    }

    private int m() {
        return this.k.ordinal();
    }

    private void o(String str, long j) {
        p(str, j, null);
    }

    private void p(String str, long j, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(com.bumptech.glide.t.f.a(j));
        sb.append(", load key: ");
        sb.append(this.l);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    private void q(v<R> vVar, com.bumptech.glide.load.a aVar) {
        B();
        this.q.c(vVar, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void r(v<R> vVar, com.bumptech.glide.load.a aVar) {
        if (vVar instanceof r) {
            ((r) vVar).c();
        }
        u uVar = 0;
        if (this.g.c()) {
            vVar = u.g(vVar);
            uVar = vVar;
        }
        q(vVar, aVar);
        this.s = EnumC0075h.ENCODE;
        try {
            if (this.g.c()) {
                this.g.b(this.f3282e, this.p);
            }
            if (uVar != 0) {
                uVar.i();
            }
            t();
        } catch (Throwable th) {
            if (uVar != 0) {
                uVar.i();
            }
            throw th;
        }
    }

    private void s() {
        B();
        this.q.a(new q("Failed to load resource", new ArrayList(this.f3280c)));
        u();
    }

    private void t() {
        if (this.h.b()) {
            x();
        }
    }

    private void u() {
        if (this.h.c()) {
            x();
        }
    }

    private void x() {
        this.h.e();
        this.g.a();
        this.f3279b.a();
        this.E = false;
        this.i = null;
        this.j = null;
        this.p = null;
        this.k = null;
        this.l = null;
        this.q = null;
        this.s = null;
        this.D = null;
        this.x = null;
        this.y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.u = 0L;
        this.F = false;
        this.w = null;
        this.f3280c.clear();
        this.f3283f.a(this);
    }

    private void y() {
        this.x = Thread.currentThread();
        this.u = com.bumptech.glide.t.f.b();
        boolean zA = false;
        while (!this.F && this.D != null && !(zA = this.D.a())) {
            this.s = k(this.s);
            this.D = j();
            if (this.s == EnumC0075h.SOURCE) {
                b();
                return;
            }
        }
        if ((this.s == EnumC0075h.FINISHED || this.F) && !zA) {
            s();
        }
    }

    private <Data, ResourceType> v<R> z(Data data, com.bumptech.glide.load.a aVar, t<Data, ResourceType, R> tVar) {
        com.bumptech.glide.load.i iVarL = l(aVar);
        com.bumptech.glide.load.n.e<Data> eVarL = this.i.h().l(data);
        try {
            return tVar.a(eVarL, iVarL, this.m, this.n, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    boolean C() {
        EnumC0075h enumC0075hK = k(EnumC0075h.INITIALIZE);
        return enumC0075hK == EnumC0075h.RESOURCE_CACHE || enumC0075hK == EnumC0075h.DATA_CACHE;
    }

    public void a() {
        this.F = true;
        com.bumptech.glide.load.o.f fVar = this.D;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // com.bumptech.glide.load.o.f.a
    public void b() {
        this.t = g.SWITCH_TO_SOURCE_SERVICE;
        this.q.d(this);
    }

    @Override // com.bumptech.glide.load.o.f.a
    public void c(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.n.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.y = gVar;
        this.A = obj;
        this.C = dVar;
        this.B = aVar;
        this.z = gVar2;
        if (Thread.currentThread() != this.x) {
            this.t = g.DECODE_DATA;
            this.q.d(this);
        } else {
            com.bumptech.glide.t.l.b.a("DecodeJob.decodeFromRetrievedData");
            try {
                i();
            } finally {
                com.bumptech.glide.t.l.b.d();
            }
        }
    }

    @Override // com.bumptech.glide.load.o.f.a
    public void d(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.n.d<?> dVar, com.bumptech.glide.load.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(gVar, aVar, dVar.a());
        this.f3280c.add(qVar);
        if (Thread.currentThread() == this.x) {
            y();
        } else {
            this.t = g.SWITCH_TO_SOURCE_SERVICE;
            this.q.d(this);
        }
    }

    @Override // com.bumptech.glide.t.l.a.f
    public com.bumptech.glide.t.l.c e() {
        return this.f3281d;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(h<?> hVar) {
        int iM = m() - hVar.m();
        return iM == 0 ? this.r - hVar.r : iM;
    }

    h<R> n(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i, int i2, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.i iVar, b<R> bVar, int i3) {
        this.f3279b.u(eVar, obj, gVar, i, i2, jVar, cls, cls2, gVar2, iVar, map, z, z2, this.f3282e);
        this.i = eVar;
        this.j = gVar;
        this.k = gVar2;
        this.l = nVar;
        this.m = i;
        this.n = i2;
        this.o = jVar;
        this.v = z3;
        this.p = iVar;
        this.q = bVar;
        this.r = i3;
        this.t = g.INITIALIZE;
        this.w = obj;
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.bumptech.glide.t.l.b.b("DecodeJob#run(model=%s)", this.w);
        com.bumptech.glide.load.n.d<?> dVar = this.C;
        try {
            try {
                try {
                    if (this.F) {
                        s();
                        if (dVar != null) {
                            dVar.b();
                        }
                        com.bumptech.glide.t.l.b.d();
                        return;
                    }
                    A();
                    if (dVar != null) {
                        dVar.b();
                    }
                    com.bumptech.glide.t.l.b.d();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.F + ", stage: " + this.s, th);
                    }
                    if (this.s != EnumC0075h.ENCODE) {
                        this.f3280c.add(th);
                        s();
                    }
                    if (!this.F) {
                        throw th;
                    }
                    throw th;
                }
            } catch (com.bumptech.glide.load.o.b e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            com.bumptech.glide.t.l.b.d();
            throw th2;
        }
    }

    <Z> v<Z> v(com.bumptech.glide.load.a aVar, v<Z> vVar) {
        v<Z> vVarB;
        com.bumptech.glide.load.m<Z> mVar;
        com.bumptech.glide.load.c cVarB;
        com.bumptech.glide.load.g dVar;
        Class<?> cls = vVar.a().getClass();
        com.bumptech.glide.load.l<Z> lVarN = null;
        if (aVar != com.bumptech.glide.load.a.RESOURCE_DISK_CACHE) {
            com.bumptech.glide.load.m<Z> mVarR = this.f3279b.r(cls);
            mVar = mVarR;
            vVarB = mVarR.b(this.i, vVar, this.m, this.n);
        } else {
            vVarB = vVar;
            mVar = null;
        }
        if (!vVar.equals(vVarB)) {
            vVar.f();
        }
        if (this.f3279b.v(vVarB)) {
            lVarN = this.f3279b.n(vVarB);
            cVarB = lVarN.b(this.p);
        } else {
            cVarB = com.bumptech.glide.load.c.NONE;
        }
        com.bumptech.glide.load.l lVar = lVarN;
        if (!this.o.d(!this.f3279b.x(this.y), aVar, cVarB)) {
            return vVarB;
        }
        if (lVar == null) {
            throw new com.bumptech.glide.i.d(vVarB.a().getClass());
        }
        int i = a.f3286c[cVarB.ordinal()];
        if (i == 1) {
            dVar = new com.bumptech.glide.load.o.d(this.y, this.j);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarB);
            }
            dVar = new x(this.f3279b.b(), this.y, this.j, this.m, this.n, mVar, cls, this.p);
        }
        u uVarG = u.g(vVarB);
        this.g.d(dVar, lVar, uVarG);
        return uVarG;
    }

    void w(boolean z) {
        if (this.h.d(z)) {
            x();
        }
    }
}
