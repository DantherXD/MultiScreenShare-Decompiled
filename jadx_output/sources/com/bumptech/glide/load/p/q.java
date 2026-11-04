package com.bumptech.glide.load.p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class q<Model, Data> implements n<Model, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<n<Model, Data>> f3450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.g.k.e<List<Throwable>> f3451b;

    static class a<Data> implements com.bumptech.glide.load.n.d<Data>, com.bumptech.glide.load.n.d.a<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<com.bumptech.glide.load.n.d<Data>> f3452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a.g.k.e<List<Throwable>> f3453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f3454d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bumptech.glide.g f3455e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private com.bumptech.glide.load.n.d.a<? super Data> f3456f;
        private List<Throwable> g;
        private boolean h;

        a(List<com.bumptech.glide.load.n.d<Data>> list, a.g.k.e<List<Throwable>> eVar) {
            this.f3453c = eVar;
            com.bumptech.glide.t.j.c(list);
            this.f3452b = list;
            this.f3454d = 0;
        }

        private void g() {
            if (this.h) {
                return;
            }
            if (this.f3454d < this.f3452b.size() - 1) {
                this.f3454d++;
                e(this.f3455e, this.f3456f);
            } else {
                com.bumptech.glide.t.j.d(this.g);
                this.f3456f.d(new com.bumptech.glide.load.o.q("Fetch failed", new ArrayList(this.g)));
            }
        }

        @Override // com.bumptech.glide.load.n.d
        public Class<Data> a() {
            return this.f3452b.get(0).a();
        }

        @Override // com.bumptech.glide.load.n.d
        public void b() {
            List<Throwable> list = this.g;
            if (list != null) {
                this.f3453c.a(list);
            }
            this.g = null;
            Iterator<com.bumptech.glide.load.n.d<Data>> it = this.f3452b.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // com.bumptech.glide.load.n.d
        public com.bumptech.glide.load.a c() {
            return this.f3452b.get(0).c();
        }

        @Override // com.bumptech.glide.load.n.d
        public void cancel() {
            this.h = true;
            Iterator<com.bumptech.glide.load.n.d<Data>> it = this.f3452b.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
        }

        @Override // com.bumptech.glide.load.n.d.a
        public void d(Exception exc) {
            ((List) com.bumptech.glide.t.j.d(this.g)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.n.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.n.d.a<? super Data> aVar) {
            this.f3455e = gVar;
            this.f3456f = aVar;
            this.g = this.f3453c.b();
            this.f3452b.get(this.f3454d).e(gVar, this);
            if (this.h) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.n.d.a
        public void f(Data data) {
            if (data != null) {
                this.f3456f.f(data);
            } else {
                g();
            }
        }
    }

    q(List<n<Model, Data>> list, a.g.k.e<List<Throwable>> eVar) {
        this.f3450a = list;
        this.f3451b = eVar;
    }

    @Override // com.bumptech.glide.load.p.n
    public n.a<Data> a(Model model, int i, int i2, com.bumptech.glide.load.i iVar) {
        n.a<Data> aVarA;
        int size = this.f3450a.size();
        ArrayList arrayList = new ArrayList(size);
        com.bumptech.glide.load.g gVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            n<Model, Data> nVar = this.f3450a.get(i3);
            if (nVar.b(model) && (aVarA = nVar.a(model, i, i2, iVar)) != null) {
                gVar = aVarA.f3443a;
                arrayList.add(aVarA.f3445c);
            }
        }
        if (arrayList.isEmpty() || gVar == null) {
            return null;
        }
        return new n.a<>(gVar, new a(arrayList, this.f3451b));
    }

    @Override // com.bumptech.glide.load.p.n
    public boolean b(Model model) {
        Iterator<n<Model, Data>> it = this.f3450a.iterator();
        while (it.hasNext()) {
            if (it.next().b(model)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f3450a.toArray()) + '}';
    }
}
