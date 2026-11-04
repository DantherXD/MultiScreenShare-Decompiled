package com.bumptech.glide.load.p;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final c f3457a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n<Object, Object> f3458b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<b<?, ?>> f3459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f3460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<b<?, ?>> f3461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a.g.k.e<List<Throwable>> f3462f;

    private static class a implements n<Object, Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.p.n
        public n.a<Object> a(Object obj, int i, int i2, com.bumptech.glide.load.i iVar) {
            return null;
        }

        @Override // com.bumptech.glide.load.p.n
        public boolean b(Object obj) {
            return false;
        }
    }

    private static class b<Model, Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<Model> f3463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<Data> f3464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o<? extends Model, ? extends Data> f3465c;

        public b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
            this.f3463a = cls;
            this.f3464b = cls2;
            this.f3465c = oVar;
        }

        public boolean a(Class<?> cls) {
            return this.f3463a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f3464b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public <Model, Data> q<Model, Data> a(List<n<Model, Data>> list, a.g.k.e<List<Throwable>> eVar) {
            return new q<>(list, eVar);
        }
    }

    public r(a.g.k.e<List<Throwable>> eVar) {
        this(eVar, f3457a);
    }

    r(a.g.k.e<List<Throwable>> eVar, c cVar) {
        this.f3459c = new ArrayList();
        this.f3461e = new HashSet();
        this.f3462f = eVar;
        this.f3460d = cVar;
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar, boolean z) {
        b<?, ?> bVar = new b<>(cls, cls2, oVar);
        List<b<?, ?>> list = this.f3459c;
        list.add(z ? list.size() : 0, bVar);
    }

    private <Model, Data> n<Model, Data> c(b<?, ?> bVar) {
        return (n) com.bumptech.glide.t.j.d(bVar.f3465c.b(this));
    }

    private static <Model, Data> n<Model, Data> f() {
        return (n<Model, Data>) f3458b;
    }

    synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, o<? extends Model, ? extends Data> oVar) {
        a(cls, cls2, oVar, true);
    }

    public synchronized <Model, Data> n<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (b<?, ?> bVar : this.f3459c) {
                if (this.f3461e.contains(bVar)) {
                    z = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f3461e.add(bVar);
                    arrayList.add(c(bVar));
                    this.f3461e.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f3460d.a(arrayList, this.f3462f);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z) {
                throw new com.bumptech.glide.i.c((Class<?>) cls, (Class<?>) cls2);
            }
            return f();
        } catch (Throwable th) {
            this.f3461e.clear();
            throw th;
        }
    }

    synchronized <Model> List<n<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b<?, ?> bVar : this.f3459c) {
                if (!this.f3461e.contains(bVar) && bVar.a(cls)) {
                    this.f3461e.add(bVar);
                    arrayList.add(c(bVar));
                    this.f3461e.remove(bVar);
                }
            }
        } catch (Throwable th) {
            this.f3461e.clear();
            throw th;
        }
        return arrayList;
    }

    synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b<?, ?> bVar : this.f3459c) {
            if (!arrayList.contains(bVar.f3464b) && bVar.a(cls)) {
                arrayList.add(bVar.f3464b);
            }
        }
        return arrayList;
    }
}
