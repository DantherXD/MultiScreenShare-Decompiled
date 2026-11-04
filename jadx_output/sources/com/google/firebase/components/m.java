package com.google.firebase.components;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<Class<? super T>> f4336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set<t> f4337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f4339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p<T> f4340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set<Class<?>> f4341f;

    public static class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<Class<? super T>> f4342a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<t> f4343b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f4344c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f4345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p<T> f4346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Set<Class<?>> f4347f;

        @SafeVarargs
        private b(Class<T> cls, Class<? super T>... clsArr) {
            HashSet hashSet = new HashSet();
            this.f4342a = hashSet;
            this.f4343b = new HashSet();
            this.f4344c = 0;
            this.f4345d = 0;
            this.f4347f = new HashSet();
            c0.c(cls, "Null interface");
            hashSet.add(cls);
            for (Class<? super T> cls2 : clsArr) {
                c0.c(cls2, "Null interface");
            }
            Collections.addAll(this.f4342a, clsArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b<T> f() {
            this.f4345d = 1;
            return this;
        }

        private b<T> g(int i) {
            c0.d(this.f4344c == 0, "Instantiation type has already been set.");
            this.f4344c = i;
            return this;
        }

        private void h(Class<?> cls) {
            c0.a(!this.f4342a.contains(cls), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b<T> b(t tVar) {
            c0.c(tVar, "Null dependency");
            h(tVar.b());
            this.f4343b.add(tVar);
            return this;
        }

        public m<T> c() {
            c0.d(this.f4346e != null, "Missing required property: factory.");
            return new m<>(new HashSet(this.f4342a), new HashSet(this.f4343b), this.f4344c, this.f4345d, this.f4346e, this.f4347f);
        }

        public b<T> d() {
            return g(2);
        }

        public b<T> e(p<T> pVar) {
            this.f4346e = (p) c0.c(pVar, "Null factory");
            return this;
        }
    }

    private m(Set<Class<? super T>> set, Set<t> set2, int i, int i2, p<T> pVar, Set<Class<?>> set3) {
        this.f4336a = Collections.unmodifiableSet(set);
        this.f4337b = Collections.unmodifiableSet(set2);
        this.f4338c = i;
        this.f4339d = i2;
        this.f4340e = pVar;
        this.f4341f = Collections.unmodifiableSet(set3);
    }

    public static <T> b<T> a(Class<T> cls) {
        return new b<>(cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> b(Class<T> cls, Class<? super T>... clsArr) {
        return new b<>(cls, clsArr);
    }

    public static <T> m<T> g(final T t, Class<T> cls) {
        return h(cls).e(new p() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.p
            public final Object a(n nVar) {
                Object obj = t;
                m.l(obj, nVar);
                return obj;
            }
        }).c();
    }

    public static <T> b<T> h(Class<T> cls) {
        return a(cls).f();
    }

    static /* synthetic */ Object l(Object obj, n nVar) {
        return obj;
    }

    static /* synthetic */ Object m(Object obj, n nVar) {
        return obj;
    }

    @SafeVarargs
    public static <T> m<T> n(final T t, Class<T> cls, Class<? super T>... clsArr) {
        return b(cls, clsArr).e(new p() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.p
            public final Object a(n nVar) {
                Object obj = t;
                m.m(obj, nVar);
                return obj;
            }
        }).c();
    }

    public Set<t> c() {
        return this.f4337b;
    }

    public p<T> d() {
        return this.f4340e;
    }

    public Set<Class<? super T>> e() {
        return this.f4336a;
    }

    public Set<Class<?>> f() {
        return this.f4341f;
    }

    public boolean i() {
        return this.f4338c == 1;
    }

    public boolean j() {
        return this.f4338c == 2;
    }

    public boolean k() {
        return this.f4339d == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f4336a.toArray()) + ">{" + this.f4338c + ", type=" + this.f4339d + ", deps=" + Arrays.toString(this.f4337b.toArray()) + "}";
    }
}
