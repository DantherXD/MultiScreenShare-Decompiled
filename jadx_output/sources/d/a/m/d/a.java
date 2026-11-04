package d.a.m.d;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> extends AtomicInteger implements d.a.m.c.a<T> {
    @Override // d.a.m.c.c
    public final boolean offer(T t) {
        throw new UnsupportedOperationException("Should not be called");
    }
}
