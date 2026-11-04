package c.b.a.a.c;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class t<TResult> implements a0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2610a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2611b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private c<TResult> f2612c;

    public t(Executor executor, c<TResult> cVar) {
        this.f2610a = executor;
        this.f2612c = cVar;
    }

    @Override // c.b.a.a.c.a0
    public final void a(h<TResult> hVar) {
        synchronized (this.f2611b) {
            if (this.f2612c == null) {
                return;
            }
            this.f2610a.execute(new s(this, hVar));
        }
    }
}
