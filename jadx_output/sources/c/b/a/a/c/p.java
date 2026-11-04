package c.b.a.a.c;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class p<TResult> implements a0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2603b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private b f2604c;

    public p(Executor executor, b bVar) {
        this.f2602a = executor;
        this.f2604c = bVar;
    }

    @Override // c.b.a.a.c.a0
    public final void a(h<TResult> hVar) {
        if (hVar.k()) {
            synchronized (this.f2603b) {
                if (this.f2604c == null) {
                    return;
                }
                this.f2602a.execute(new r(this));
            }
        }
    }
}
