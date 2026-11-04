package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.o.t;
import com.bumptech.glide.load.o.v;
import com.bumptech.glide.load.p.n;
import com.bumptech.glide.load.p.o;
import com.bumptech.glide.load.p.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f3072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.q.a f3073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.q.e f3074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.q.f f3075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.n.f f3076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.q.i.f f3077f;
    private final com.bumptech.glide.q.b g;
    private final com.bumptech.glide.q.d h = new com.bumptech.glide.q.d();
    private final com.bumptech.glide.q.c i = new com.bumptech.glide.q.c();
    private final a.g.k.e<List<Throwable>> j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class c extends a {
        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }

        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public <M> c(M m, List<n<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m);
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public i() {
        a.g.k.e<List<Throwable>> eVarE = com.bumptech.glide.t.l.a.e();
        this.j = eVarE;
        this.f3072a = new p(eVarE);
        this.f3073b = new com.bumptech.glide.q.a();
        this.f3074c = new com.bumptech.glide.q.e();
        this.f3075d = new com.bumptech.glide.q.f();
        this.f3076e = new com.bumptech.glide.load.n.f();
        this.f3077f = new com.bumptech.glide.load.q.i.f();
        this.g = new com.bumptech.glide.q.b();
        r(Arrays.asList("Gif", "Bitmap", "BitmapDrawable"));
    }

    private <Data, TResource, Transcode> List<com.bumptech.glide.load.o.i<Data, TResource, Transcode>> f(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f3074c.d(cls, cls2)) {
            for (Class cls5 : this.f3077f.b(cls4, cls3)) {
                arrayList.add(new com.bumptech.glide.load.o.i(cls, cls4, cls5, this.f3074c.b(cls, cls4), this.f3077f.a(cls4, cls5), this.j));
            }
        }
        return arrayList;
    }

    public <Data> i a(Class<Data> cls, com.bumptech.glide.load.d<Data> dVar) {
        this.f3073b.a(cls, dVar);
        return this;
    }

    public <TResource> i b(Class<TResource> cls, com.bumptech.glide.load.l<TResource> lVar) {
        this.f3075d.a(cls, lVar);
        return this;
    }

    public <Data, TResource> i c(Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.k<Data, TResource> kVar) {
        e("legacy_append", cls, cls2, kVar);
        return this;
    }

    public <Model, Data> i d(Class<Model> cls, Class<Data> cls2, o<Model, Data> oVar) {
        this.f3072a.a(cls, cls2, oVar);
        return this;
    }

    public <Data, TResource> i e(String str, Class<Data> cls, Class<TResource> cls2, com.bumptech.glide.load.k<Data, TResource> kVar) {
        this.f3074c.a(str, kVar, cls, cls2);
        return this;
    }

    public List<ImageHeaderParser> g() {
        List<ImageHeaderParser> listB = this.g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> h(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVarA = this.i.a(cls, cls2, cls3);
        if (this.i.c(tVarA)) {
            return null;
        }
        if (tVarA == null) {
            List<com.bumptech.glide.load.o.i<Data, TResource, Transcode>> listF = f(cls, cls2, cls3);
            tVarA = listF.isEmpty() ? null : new t<>(cls, cls2, cls3, listF, this.j);
            this.i.d(cls, cls2, cls3, tVarA);
        }
        return tVarA;
    }

    public <Model> List<n<Model, ?>> i(Model model) {
        return this.f3072a.d(model);
    }

    public <Model, TResource, Transcode> List<Class<?>> j(Class<Model> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        List<Class<?>> listA = this.h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList<>();
            Iterator<Class<?>> it = this.f3072a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class<?> cls4 : this.f3074c.d(it.next(), cls2)) {
                    if (!this.f3077f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public <X> com.bumptech.glide.load.l<X> k(v<X> vVar) {
        com.bumptech.glide.load.l<X> lVarB = this.f3075d.b(vVar.d());
        if (lVarB != null) {
            return lVarB;
        }
        throw new d(vVar.d());
    }

    public <X> com.bumptech.glide.load.n.e<X> l(X x) {
        return this.f3076e.a(x);
    }

    public <X> com.bumptech.glide.load.d<X> m(X x) {
        com.bumptech.glide.load.d<X> dVarB = this.f3073b.b(x.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(x.getClass());
    }

    public boolean n(v<?> vVar) {
        return this.f3075d.b(vVar.d()) != null;
    }

    public i o(ImageHeaderParser imageHeaderParser) {
        this.g.a(imageHeaderParser);
        return this;
    }

    public i p(com.bumptech.glide.load.n.e.a<?> aVar) {
        this.f3076e.b(aVar);
        return this;
    }

    public <TResource, Transcode> i q(Class<TResource> cls, Class<Transcode> cls2, com.bumptech.glide.load.q.i.e<TResource, Transcode> eVar) {
        this.f3077f.c(cls, cls2, eVar);
        return this;
    }

    public final i r(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        arrayList.add(0, "legacy_prepend_all");
        arrayList.add("legacy_append");
        this.f3074c.e(arrayList);
        return this;
    }
}
