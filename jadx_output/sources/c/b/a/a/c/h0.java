package c.b.a.a.c;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class h0 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ d0 f2581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Callable f2582c;

    h0(d0 d0Var, Callable callable) {
        this.f2581b = d0Var;
        this.f2582c = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2581b.q(this.f2582c.call());
        } catch (Exception e2) {
            this.f2581b.p(e2);
        }
    }
}
