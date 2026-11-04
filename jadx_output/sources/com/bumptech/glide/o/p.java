package com.bumptech.glide.o;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class p implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<com.bumptech.glide.r.j.h<?>> f3719b = Collections.newSetFromMap(new WeakHashMap());

    @Override // com.bumptech.glide.o.i
    public void a() {
        Iterator it = com.bumptech.glide.t.k.i(this.f3719b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.r.j.h) it.next()).a();
        }
    }

    @Override // com.bumptech.glide.o.i
    public void f() {
        Iterator it = com.bumptech.glide.t.k.i(this.f3719b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.r.j.h) it.next()).f();
        }
    }

    @Override // com.bumptech.glide.o.i
    public void k() {
        Iterator it = com.bumptech.glide.t.k.i(this.f3719b).iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.r.j.h) it.next()).k();
        }
    }

    public void l() {
        this.f3719b.clear();
    }

    public List<com.bumptech.glide.r.j.h<?>> m() {
        return com.bumptech.glide.t.k.i(this.f3719b);
    }

    public void n(com.bumptech.glide.r.j.h<?> hVar) {
        this.f3719b.add(hVar);
    }

    public void o(com.bumptech.glide.r.j.h<?> hVar) {
        this.f3719b.remove(hVar);
    }
}
