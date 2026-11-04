package com.bumptech.glide.q;

import com.bumptech.glide.t.i;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference<i> f3728a = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.d.a<i, List<Class<?>>> f3729b = new a.d.a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        i andSet = this.f3728a.getAndSet(null);
        if (andSet == null) {
            andSet = new i(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f3729b) {
            list = this.f3729b.get(andSet);
        }
        this.f3728a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f3729b) {
            this.f3729b.put(new i(cls, cls2, cls3), list);
        }
    }
}
