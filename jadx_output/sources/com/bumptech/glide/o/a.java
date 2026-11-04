package com.bumptech.glide.o;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<i> f3694a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3696c;

    a() {
    }

    @Override // com.bumptech.glide.o.h
    public void a(i iVar) {
        this.f3694a.add(iVar);
        if (this.f3696c) {
            iVar.k();
        } else if (this.f3695b) {
            iVar.a();
        } else {
            iVar.f();
        }
    }

    @Override // com.bumptech.glide.o.h
    public void b(i iVar) {
        this.f3694a.remove(iVar);
    }

    void c() {
        this.f3696c = true;
        Iterator it = com.bumptech.glide.t.k.i(this.f3694a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).k();
        }
    }

    void d() {
        this.f3695b = true;
        Iterator it = com.bumptech.glide.t.k.i(this.f3694a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).a();
        }
    }

    void e() {
        this.f3695b = false;
        Iterator it = com.bumptech.glide.t.k.i(this.f3694a).iterator();
        while (it.hasNext()) {
            ((i) it.next()).f();
        }
    }
}
