package c.b.a.a.c;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class n<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, a0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a<TResult, h<TContinuationResult>> f2598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0<TContinuationResult> f2599c;

    public n(Executor executor, a<TResult, h<TContinuationResult>> aVar, d0<TContinuationResult> d0Var) {
        this.f2597a = executor;
        this.f2598b = aVar;
        this.f2599c = d0Var;
    }

    @Override // c.b.a.a.c.a0
    public final void a(h<TResult> hVar) {
        this.f2597a.execute(new q(this, hVar));
    }

    @Override // c.b.a.a.c.b
    public final void b() {
        this.f2599c.r();
    }

    @Override // c.b.a.a.c.d
    public final void c(Exception exc) {
        this.f2599c.p(exc);
    }

    @Override // c.b.a.a.c.e
    public final void d(TContinuationResult tcontinuationresult) {
        this.f2599c.q(tcontinuationresult);
    }
}
