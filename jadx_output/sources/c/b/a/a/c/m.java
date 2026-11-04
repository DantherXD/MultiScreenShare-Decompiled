package c.b.a.a.c;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class m<TResult, TContinuationResult> implements a0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f2594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a<TResult, TContinuationResult> f2595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0<TContinuationResult> f2596c;

    public m(Executor executor, a<TResult, TContinuationResult> aVar, d0<TContinuationResult> d0Var) {
        this.f2594a = executor;
        this.f2595b = aVar;
        this.f2596c = d0Var;
    }

    @Override // c.b.a.a.c.a0
    public final void a(h<TResult> hVar) {
        this.f2594a.execute(new o(this, hVar));
    }
}
