package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Object f2065a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Object f2066b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a.b.a.b.b<m<? super T>, LiveData<T>.c> f2067c = new a.b.a.b.b<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2068d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f2069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile Object f2070f;
    volatile Object g;
    private int h;
    private boolean i;
    private boolean j;
    private final Runnable k;

    class LifecycleBoundObserver extends LiveData<T>.c implements e {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final g f2071e;

        LifecycleBoundObserver(g gVar, m<? super T> mVar) {
            super(mVar);
            this.f2071e = gVar;
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.b bVar) {
            d.c cVarB = this.f2071e.a().b();
            if (cVarB == d.c.DESTROYED) {
                LiveData.this.k(this.f2075a);
                return;
            }
            d.c cVar = null;
            while (cVar != cVarB) {
                h(k());
                cVar = cVarB;
                cVarB = this.f2071e.a().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        void i() {
            this.f2071e.a().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean j(g gVar) {
            return this.f2071e == gVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return this.f2071e.a().b().a(d.c.STARTED);
        }
    }

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f2066b) {
                obj = LiveData.this.g;
                LiveData.this.g = LiveData.f2065a;
            }
            LiveData.this.l(obj);
        }
    }

    private class b extends LiveData<T>.c {
        b(m<? super T> mVar) {
            super(mVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        boolean k() {
            return true;
        }
    }

    private abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final m<? super T> f2075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f2076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2077c = -1;

        c(m<? super T> mVar) {
            this.f2075a = mVar;
        }

        void h(boolean z) {
            if (z == this.f2076b) {
                return;
            }
            this.f2076b = z;
            LiveData.this.b(z ? 1 : -1);
            if (this.f2076b) {
                LiveData.this.d(this);
            }
        }

        void i() {
        }

        boolean j(g gVar) {
            return false;
        }

        abstract boolean k();
    }

    public LiveData() {
        Object obj = f2065a;
        this.g = obj;
        this.k = new a();
        this.f2070f = obj;
        this.h = -1;
    }

    static void a(String str) {
        if (a.b.a.a.a.d().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void c(LiveData<T>.c cVar) {
        if (cVar.f2076b) {
            if (!cVar.k()) {
                cVar.h(false);
                return;
            }
            int i = cVar.f2077c;
            int i2 = this.h;
            if (i >= i2) {
                return;
            }
            cVar.f2077c = i2;
            cVar.f2075a.a((Object) this.f2070f);
        }
    }

    void b(int i) {
        int i2 = this.f2068d;
        this.f2068d = i + i2;
        if (this.f2069e) {
            return;
        }
        this.f2069e = true;
        while (true) {
            try {
                int i3 = this.f2068d;
                if (i2 == i3) {
                    this.f2069e = false;
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    h();
                } else if (z2) {
                    i();
                }
                i2 = i3;
            } catch (Throwable th) {
                this.f2069e = false;
                throw th;
            }
        }
    }

    void d(LiveData<T>.c cVar) {
        if (this.i) {
            this.j = true;
            return;
        }
        this.i = true;
        do {
            this.j = false;
            if (cVar != null) {
                c(cVar);
                cVar = null;
            } else {
                a.b.a.b.b<m<? super T>, LiveData<T>.c>.d dVarD = this.f2067c.d();
                while (dVarD.hasNext()) {
                    c((c) dVarD.next().getValue());
                    if (this.j) {
                        break;
                    }
                }
            }
        } while (this.j);
        this.i = false;
    }

    public T e() {
        T t = (T) this.f2070f;
        if (t != f2065a) {
            return t;
        }
        return null;
    }

    public void f(g gVar, m<? super T> mVar) {
        a("observe");
        if (gVar.a().b() == d.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
        LiveData<T>.c cVarG = this.f2067c.g(mVar, lifecycleBoundObserver);
        if (cVarG != null && !cVarG.j(gVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarG != null) {
            return;
        }
        gVar.a().a(lifecycleBoundObserver);
    }

    public void g(m<? super T> mVar) {
        a("observeForever");
        b bVar = new b(mVar);
        LiveData<T>.c cVarG = this.f2067c.g(mVar, bVar);
        if (cVarG instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarG != null) {
            return;
        }
        bVar.h(true);
    }

    protected void h() {
    }

    protected void i() {
    }

    protected void j(T t) {
        boolean z;
        synchronized (this.f2066b) {
            z = this.g == f2065a;
            this.g = t;
        }
        if (z) {
            a.b.a.a.a.d().c(this.k);
        }
    }

    public void k(m<? super T> mVar) {
        a("removeObserver");
        LiveData<T>.c cVarH = this.f2067c.h(mVar);
        if (cVarH == null) {
            return;
        }
        cVarH.i();
        cVarH.h(false);
    }

    protected void l(T t) {
        a("setValue");
        this.h++;
        this.f2070f = t;
        d(null);
    }
}
