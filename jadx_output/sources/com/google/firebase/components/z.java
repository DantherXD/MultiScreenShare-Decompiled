package com.google.firebase.components;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
class z<T> implements com.google.firebase.n.b<Set<T>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set<T> f4376b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set<com.google.firebase.n.b<T>> f4375a = Collections.newSetFromMap(new ConcurrentHashMap());

    z(Collection<com.google.firebase.n.b<T>> collection) {
        this.f4375a.addAll(collection);
    }

    static z<?> c(Collection<com.google.firebase.n.b<?>> collection) {
        return new z<>((Set) collection);
    }

    private synchronized void e() {
        Iterator<com.google.firebase.n.b<T>> it = this.f4375a.iterator();
        while (it.hasNext()) {
            this.f4376b.add(it.next().a());
        }
        this.f4375a = null;
    }

    synchronized void b(com.google.firebase.n.b<T> bVar) {
        Set set;
        if (this.f4376b == null) {
            set = this.f4375a;
        } else {
            set = this.f4376b;
            bVar = (com.google.firebase.n.b<T>) bVar.a();
        }
        set.add(bVar);
    }

    @Override // com.google.firebase.n.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Set<T> a() {
        if (this.f4376b == null) {
            synchronized (this) {
                if (this.f4376b == null) {
                    this.f4376b = Collections.newSetFromMap(new ConcurrentHashMap());
                    e();
                }
            }
        }
        return Collections.unmodifiableSet(this.f4376b);
    }
}
