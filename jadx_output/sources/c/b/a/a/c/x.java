package c.b.a.a.c;

import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class x<TResult> implements a0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f2621b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private e<? super TResult> f2622c;

    public x(Executor executor, e<? super TResult> eVar) {
        this.f2620a = executor;
        this.f2622c = eVar;
    }

    @Override // c.b.a.a.c.a0
    public final void a(h<TResult> hVar) {
        if (hVar.m()) {
            synchronized (this.f2621b) {
                if (this.f2622c == null) {
                    return;
                }
                this.f2620a.execute(new w(this, hVar));
            }
        }
    }
}
