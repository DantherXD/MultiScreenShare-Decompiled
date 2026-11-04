package c.b.a.a.c;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class u<TResult> implements a0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2614b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private d f2615c;

    public u(Executor executor, d dVar) {
        this.f2613a = executor;
        this.f2615c = dVar;
    }

    @Override // c.b.a.a.c.a0
    public final void a(h<TResult> hVar) {
        if (hVar.m() || hVar.k()) {
            return;
        }
        synchronized (this.f2614b) {
            if (this.f2615c == null) {
                return;
            }
            this.f2613a.execute(new v(this, hVar));
        }
    }
}
