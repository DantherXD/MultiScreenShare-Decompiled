package com.bumptech.glide.t;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class g<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<T, Y> f3807a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f3809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f3810d;

    public g(long j) {
        this.f3808b = j;
        this.f3809c = j;
    }

    private void f() {
        m(this.f3809c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(T t) {
        return this.f3807a.get(t);
    }

    public synchronized long h() {
        return this.f3809c;
    }

    protected int i(Y y) {
        return 1;
    }

    protected void j(T t, Y y) {
    }

    public synchronized Y k(T t, Y y) {
        long jI = i(y);
        if (jI >= this.f3809c) {
            j(t, y);
            return null;
        }
        if (y != null) {
            this.f3810d += jI;
        }
        Y yPut = this.f3807a.put(t, y);
        if (yPut != null) {
            this.f3810d -= (long) i(yPut);
            if (!yPut.equals(y)) {
                j(t, yPut);
            }
        }
        f();
        return yPut;
    }

    public synchronized Y l(T t) {
        Y yRemove;
        yRemove = this.f3807a.remove(t);
        if (yRemove != null) {
            this.f3810d -= (long) i(yRemove);
        }
        return yRemove;
    }

    protected synchronized void m(long j) {
        while (this.f3810d > j) {
            Iterator<Map.Entry<T, Y>> it = this.f3807a.entrySet().iterator();
            Map.Entry<T, Y> next = it.next();
            Y value = next.getValue();
            this.f3810d -= (long) i(value);
            T key = next.getKey();
            it.remove();
            j(key, value);
        }
    }
}
