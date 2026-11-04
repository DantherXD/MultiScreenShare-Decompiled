package d.a.j;

import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
final class d extends AtomicReference<Future<?>> implements b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4746b;

    d(Future<?> future, boolean z) {
        super(future);
        this.f4746b = z;
    }

    @Override // d.a.j.b
    public void c() {
        Future<?> andSet = getAndSet(null);
        if (andSet != null) {
            andSet.cancel(this.f4746b);
        }
    }
}
