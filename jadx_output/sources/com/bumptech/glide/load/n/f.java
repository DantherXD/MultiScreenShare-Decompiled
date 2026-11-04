package com.bumptech.glide.load.n;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e.a<?> f3129a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f3130b = new HashMap();

    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.n.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.n.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f3131a;

        b(Object obj) {
            this.f3131a = obj;
        }

        @Override // com.bumptech.glide.load.n.e
        public Object a() {
            return this.f3131a;
        }

        @Override // com.bumptech.glide.load.n.e
        public void b() {
        }
    }

    public synchronized <T> e<T> a(T t) {
        e.a<?> aVar;
        com.bumptech.glide.t.j.d(t);
        aVar = this.f3130b.get(t.getClass());
        if (aVar == null) {
            for (e.a<?> aVar2 : this.f3130b.values()) {
                if (aVar2.a().isAssignableFrom(t.getClass())) {
                    aVar = aVar2;
                    break;
                }
            }
        }
        if (aVar == null) {
            aVar = f3129a;
        }
        return (e<T>) aVar.b(t);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f3130b.put(aVar.a(), aVar);
    }
}
