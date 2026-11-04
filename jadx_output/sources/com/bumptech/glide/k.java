package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.bumptech.glide.o.m;
import com.bumptech.glide.o.n;
import com.bumptech.glide.o.p;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class k implements ComponentCallbacks2, com.bumptech.glide.o.i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final com.bumptech.glide.r.f f3080b = com.bumptech.glide.r.f.c0(Bitmap.class).I();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final com.bumptech.glide.r.f f3081c = com.bumptech.glide.r.f.c0(com.bumptech.glide.load.q.h.c.class).I();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.bumptech.glide.r.f f3082d = com.bumptech.glide.r.f.d0(com.bumptech.glide.load.o.j.f3311c).P(g.LOW).W(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final c f3083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final Context f3084f;
    final com.bumptech.glide.o.h g;
    private final n h;
    private final m i;
    private final p j;
    private final Runnable k;
    private final Handler l;
    private final com.bumptech.glide.o.c m;
    private final CopyOnWriteArrayList<com.bumptech.glide.r.e<Object>> n;
    private com.bumptech.glide.r.f o;
    private boolean p;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.g.a(kVar);
        }
    }

    private class b implements com.bumptech.glide.o.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f3086a;

        b(n nVar) {
            this.f3086a = nVar;
        }

        @Override // com.bumptech.glide.o.c.a
        public void a(boolean z) {
            if (z) {
                synchronized (k.this) {
                    this.f3086a.e();
                }
            }
        }
    }

    public k(c cVar, com.bumptech.glide.o.h hVar, m mVar, Context context) {
        this(cVar, hVar, mVar, new n(), cVar.g(), context);
    }

    k(c cVar, com.bumptech.glide.o.h hVar, m mVar, n nVar, com.bumptech.glide.o.d dVar, Context context) {
        this.j = new p();
        a aVar = new a();
        this.k = aVar;
        Handler handler = new Handler(Looper.getMainLooper());
        this.l = handler;
        this.f3083e = cVar;
        this.g = hVar;
        this.i = mVar;
        this.h = nVar;
        this.f3084f = context;
        com.bumptech.glide.o.c cVarA = dVar.a(context.getApplicationContext(), new b(nVar));
        this.m = cVarA;
        if (com.bumptech.glide.t.k.o()) {
            handler.post(aVar);
        } else {
            hVar.a(this);
        }
        hVar.a(cVarA);
        this.n = new CopyOnWriteArrayList<>(cVar.i().c());
        y(cVar.i().d());
        cVar.o(this);
    }

    private void B(com.bumptech.glide.r.j.h<?> hVar) {
        boolean zA = A(hVar);
        com.bumptech.glide.r.c cVarG = hVar.g();
        if (zA || this.f3083e.p(hVar) || cVarG == null) {
            return;
        }
        hVar.j(null);
        cVarG.clear();
    }

    synchronized boolean A(com.bumptech.glide.r.j.h<?> hVar) {
        com.bumptech.glide.r.c cVarG = hVar.g();
        if (cVarG == null) {
            return true;
        }
        if (!this.h.a(cVarG)) {
            return false;
        }
        this.j.o(hVar);
        hVar.j(null);
        return true;
    }

    @Override // com.bumptech.glide.o.i
    public synchronized void a() {
        x();
        this.j.a();
    }

    @Override // com.bumptech.glide.o.i
    public synchronized void f() {
        w();
        this.j.f();
    }

    @Override // com.bumptech.glide.o.i
    public synchronized void k() {
        this.j.k();
        Iterator<com.bumptech.glide.r.j.h<?>> it = this.j.m().iterator();
        while (it.hasNext()) {
            o(it.next());
        }
        this.j.l();
        this.h.b();
        this.g.b(this);
        this.g.b(this.m);
        this.l.removeCallbacks(this.k);
        this.f3083e.s(this);
    }

    public <ResourceType> j<ResourceType> l(Class<ResourceType> cls) {
        return new j<>(this.f3083e, this, cls, this.f3084f);
    }

    public j<Bitmap> m() {
        return l(Bitmap.class).a(f3080b);
    }

    public j<Drawable> n() {
        return l(Drawable.class);
    }

    public void o(com.bumptech.glide.r.j.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        B(hVar);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        if (i == 60 && this.p) {
            v();
        }
    }

    List<com.bumptech.glide.r.e<Object>> p() {
        return this.n;
    }

    synchronized com.bumptech.glide.r.f q() {
        return this.o;
    }

    <T> l<?, T> r(Class<T> cls) {
        return this.f3083e.i().e(cls);
    }

    public j<Drawable> s(Bitmap bitmap) {
        return n().p0(bitmap);
    }

    public j<Drawable> t(Integer num) {
        return n().q0(num);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.h + ", treeNode=" + this.i + "}";
    }

    public synchronized void u() {
        this.h.c();
    }

    public synchronized void v() {
        u();
        Iterator<k> it = this.i.a().iterator();
        while (it.hasNext()) {
            it.next().u();
        }
    }

    public synchronized void w() {
        this.h.d();
    }

    public synchronized void x() {
        this.h.f();
    }

    protected synchronized void y(com.bumptech.glide.r.f fVar) {
        this.o = fVar.clone().b();
    }

    synchronized void z(com.bumptech.glide.r.j.h<?> hVar, com.bumptech.glide.r.c cVar) {
        this.j.n(hVar);
        this.h.g(cVar);
    }
}
