package c.b.a.a.c;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class y<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, a0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g<TResult, TContinuationResult> f2624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0<TContinuationResult> f2625c;

    public y(Executor executor, g<TResult, TContinuationResult> gVar, d0<TContinuationResult> d0Var) {
        this.f2623a = executor;
        this.f2624b = gVar;
        this.f2625c = d0Var;
    }

    @Override // c.b.a.a.c.a0
    public final void a(h<TResult> hVar) {
        this.f2623a.execute(new z(this, hVar));
    }

    @Override // c.b.a.a.c.b
    public final void b() {
        this.f2625c.r();
    }

    @Override // c.b.a.a.c.d
    public final void c(Exception exc) {
        this.f2625c.p(exc);
    }

    @Override // c.b.a.a.c.e
    public final void d(TContinuationResult tcontinuationresult) {
        this.f2625c.q(tcontinuationresult);
    }
}
