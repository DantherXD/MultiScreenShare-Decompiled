package c.b.a.a.c;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
final class q implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ n f2606c;

    q(n nVar, h hVar) {
        this.f2606c = nVar;
        this.f2605b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            h hVar = (h) this.f2606c.f2598b.a(this.f2605b);
            if (hVar == null) {
                this.f2606c.c(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = j.f2585b;
            hVar.e(executor, this.f2606c);
            hVar.d(executor, this.f2606c);
            hVar.a(executor, this.f2606c);
        } catch (f e2) {
            boolean z = e2.getCause() instanceof Exception;
            d0 d0Var = this.f2606c.f2599c;
            if (z) {
                d0Var.p((Exception) e2.getCause());
            } else {
                d0Var.p(e2);
            }
        } catch (Exception e3) {
            this.f2606c.f2599c.p(e3);
        }
    }
}
