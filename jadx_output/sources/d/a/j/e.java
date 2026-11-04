package d.a.j;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
abstract class e<T> extends AtomicReference<T> implements b {
    e(T t) {
        super(d.a.m.b.b.c(t, "value is null"));
    }

    public final boolean a() {
        return get() == null;
    }

    protected abstract void b(T t);

    @Override // d.a.j.b
    public final void c() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        b(andSet);
    }
}
