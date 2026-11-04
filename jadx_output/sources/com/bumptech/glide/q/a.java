package com.bumptech.glide.q;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<C0088a<?>> f3721a = new ArrayList();

    /* JADX INFO: renamed from: com.bumptech.glide.q.a$a, reason: collision with other inner class name */
    private static final class C0088a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f3722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.d<T> f3723b;

        C0088a(Class<T> cls, com.bumptech.glide.load.d<T> dVar) {
            this.f3722a = cls;
            this.f3723b = dVar;
        }

        boolean a(Class<?> cls) {
            return this.f3722a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, com.bumptech.glide.load.d<T> dVar) {
        this.f3721a.add(new C0088a<>(cls, dVar));
    }

    public synchronized <T> com.bumptech.glide.load.d<T> b(Class<T> cls) {
        for (C0088a<?> c0088a : this.f3721a) {
            if (c0088a.a(cls)) {
                return (com.bumptech.glide.load.d<T>) c0088a.f3723b;
            }
        }
        return null;
    }
}
