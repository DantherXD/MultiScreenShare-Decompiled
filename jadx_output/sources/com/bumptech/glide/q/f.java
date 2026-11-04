package com.bumptech.glide.q;

import com.bumptech.glide.load.l;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<a<?>> f3735a = new ArrayList();

    private static final class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f3736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final l<T> f3737b;

        a(Class<T> cls, l<T> lVar) {
            this.f3736a = cls;
            this.f3737b = lVar;
        }

        boolean a(Class<?> cls) {
            return this.f3736a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, l<Z> lVar) {
        this.f3735a.add(new a<>(cls, lVar));
    }

    public synchronized <Z> l<Z> b(Class<Z> cls) {
        int size = this.f3735a.size();
        for (int i = 0; i < size; i++) {
            a<?> aVar = this.f3735a.get(i);
            if (aVar.a(cls)) {
                return (l<Z>) aVar.f3737b;
            }
        }
        return null;
    }
}
