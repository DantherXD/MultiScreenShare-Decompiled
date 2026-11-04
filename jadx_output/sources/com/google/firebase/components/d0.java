package com.google.firebase.components;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
final class d0 extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Class<?>> f4318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<Class<?>> f4319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<Class<?>> f4320c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<Class<?>> f4321d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set<Class<?>> f4322e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f4323f;
    private final n g;

    private static class a implements com.google.firebase.l.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<?>> f4324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.google.firebase.l.c f4325b;

        public a(Set<Class<?>> set, com.google.firebase.l.c cVar) {
            this.f4324a = set;
            this.f4325b = cVar;
        }
    }

    d0(m<?> mVar, n nVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (t tVar : mVar.c()) {
            if (tVar.d()) {
                boolean zF = tVar.f();
                Class<?> clsB = tVar.b();
                if (zF) {
                    hashSet4.add(clsB);
                } else {
                    hashSet.add(clsB);
                }
            } else if (tVar.c()) {
                hashSet3.add(tVar.b());
            } else {
                boolean zF2 = tVar.f();
                Class<?> clsB2 = tVar.b();
                if (zF2) {
                    hashSet5.add(clsB2);
                } else {
                    hashSet2.add(clsB2);
                }
            }
        }
        if (!mVar.f().isEmpty()) {
            hashSet.add(com.google.firebase.l.c.class);
        }
        this.f4318a = Collections.unmodifiableSet(hashSet);
        this.f4319b = Collections.unmodifiableSet(hashSet2);
        this.f4320c = Collections.unmodifiableSet(hashSet3);
        this.f4321d = Collections.unmodifiableSet(hashSet4);
        this.f4322e = Collections.unmodifiableSet(hashSet5);
        this.f4323f = mVar.f();
        this.g = nVar;
    }

    @Override // com.google.firebase.components.l, com.google.firebase.components.n
    public <T> T a(Class<T> cls) {
        if (!this.f4318a.contains(cls)) {
            throw new v(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.g.a(cls);
        return !cls.equals(com.google.firebase.l.c.class) ? t : (T) new a(this.f4323f, (com.google.firebase.l.c) t);
    }

    @Override // com.google.firebase.components.n
    public <T> com.google.firebase.n.b<T> b(Class<T> cls) {
        if (this.f4319b.contains(cls)) {
            return this.g.b(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<%s>.", cls));
    }

    @Override // com.google.firebase.components.l, com.google.firebase.components.n
    public <T> Set<T> c(Class<T> cls) {
        if (this.f4321d.contains(cls)) {
            return this.g.c(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Set<%s>.", cls));
    }

    @Override // com.google.firebase.components.n
    public <T> com.google.firebase.n.b<Set<T>> d(Class<T> cls) {
        if (this.f4322e.contains(cls)) {
            return this.g.d(cls);
        }
        throw new v(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", cls));
    }
}
