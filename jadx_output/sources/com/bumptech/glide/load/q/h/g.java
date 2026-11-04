package com.bumptech.glide.load.q.h;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bumptech.glide.k;
import com.bumptech.glide.load.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.n.a f3617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f3618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b> f3619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final k f3620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.e f3621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f3622f;
    private boolean g;
    private boolean h;
    private com.bumptech.glide.j<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private m<Bitmap> n;
    private a o;
    private d p;
    private int q;
    private int r;
    private int s;

    static class a extends com.bumptech.glide.r.j.c<Bitmap> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Handler f3623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final int f3624f;
        private final long g;
        private Bitmap h;

        a(Handler handler, int i, long j) {
            this.f3623e = handler;
            this.f3624f = i;
            this.g = j;
        }

        @Override // com.bumptech.glide.r.j.h
        public void h(Drawable drawable) {
            this.h = null;
        }

        Bitmap l() {
            return this.h;
        }

        @Override // com.bumptech.glide.r.j.h
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public void d(Bitmap bitmap, com.bumptech.glide.r.k.b<? super Bitmap> bVar) {
            this.h = bitmap;
            this.f3623e.sendMessageAtTime(this.f3623e.obtainMessage(1, this), this.g);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i != 2) {
                return false;
            }
            g.this.f3620d.o((a) message.obj);
            return false;
        }
    }

    interface d {
        void a();
    }

    g(com.bumptech.glide.c cVar, com.bumptech.glide.n.a aVar, int i, int i2, m<Bitmap> mVar, Bitmap bitmap) {
        this(cVar.f(), com.bumptech.glide.c.t(cVar.h()), aVar, null, i(com.bumptech.glide.c.t(cVar.h()), i, i2), mVar, bitmap);
    }

    g(com.bumptech.glide.load.o.a0.e eVar, k kVar, com.bumptech.glide.n.a aVar, Handler handler, com.bumptech.glide.j<Bitmap> jVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.f3619c = new ArrayList();
        this.f3620d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f3621e = eVar;
        this.f3618b = handler;
        this.i = jVar;
        this.f3617a = aVar;
        o(mVar, bitmap);
    }

    private static com.bumptech.glide.load.g g() {
        return new com.bumptech.glide.s.d(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j<Bitmap> i(k kVar, int i, int i2) {
        return kVar.m().a(com.bumptech.glide.r.f.d0(com.bumptech.glide.load.o.j.f3310b).b0(true).W(true).O(i, i2));
    }

    private void l() {
        if (!this.f3622f || this.g) {
            return;
        }
        if (this.h) {
            com.bumptech.glide.t.j.a(this.o == null, "Pending target must be null when starting from the first frame");
            this.f3617a.i();
            this.h = false;
        }
        a aVar = this.o;
        if (aVar != null) {
            this.o = null;
            m(aVar);
            return;
        }
        this.g = true;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((long) this.f3617a.g());
        this.f3617a.e();
        this.l = new a(this.f3618b, this.f3617a.a(), jUptimeMillis);
        this.i.a(com.bumptech.glide.r.f.e0(g())).r0(this.f3617a).k0(this.l);
    }

    private void n() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.f3621e.d(bitmap);
            this.m = null;
        }
    }

    private void p() {
        if (this.f3622f) {
            return;
        }
        this.f3622f = true;
        this.k = false;
        l();
    }

    private void q() {
        this.f3622f = false;
    }

    void a() {
        this.f3619c.clear();
        n();
        q();
        a aVar = this.j;
        if (aVar != null) {
            this.f3620d.o(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.f3620d.o(aVar2);
            this.l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.f3620d.o(aVar3);
            this.o = null;
        }
        this.f3617a.clear();
        this.k = true;
    }

    ByteBuffer b() {
        return this.f3617a.h().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.l() : this.m;
    }

    int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.f3624f;
        }
        return -1;
    }

    Bitmap e() {
        return this.m;
    }

    int f() {
        return this.f3617a.f();
    }

    int h() {
        return this.s;
    }

    int j() {
        return this.f3617a.b() + this.q;
    }

    int k() {
        return this.r;
    }

    void m(a aVar) {
        d dVar = this.p;
        if (dVar != null) {
            dVar.a();
        }
        this.g = false;
        if (this.k) {
            this.f3618b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f3622f) {
            this.o = aVar;
            return;
        }
        if (aVar.l() != null) {
            n();
            a aVar2 = this.j;
            this.j = aVar;
            for (int size = this.f3619c.size() - 1; size >= 0; size--) {
                this.f3619c.get(size).a();
            }
            if (aVar2 != null) {
                this.f3618b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(m<Bitmap> mVar, Bitmap bitmap) {
        this.n = (m) com.bumptech.glide.t.j.d(mVar);
        this.m = (Bitmap) com.bumptech.glide.t.j.d(bitmap);
        this.i = this.i.a(new com.bumptech.glide.r.f().X(mVar));
        this.q = com.bumptech.glide.t.k.g(bitmap);
        this.r = bitmap.getWidth();
        this.s = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f3619c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = this.f3619c.isEmpty();
        this.f3619c.add(bVar);
        if (zIsEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f3619c.remove(bVar);
        if (this.f3619c.isEmpty()) {
            q();
        }
    }
}
