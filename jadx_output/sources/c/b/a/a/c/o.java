package c.b.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class o implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ m f2601c;

    o(m mVar, h hVar) {
        this.f2601c = mVar;
        this.f2600b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2600b.k()) {
            this.f2601c.f2596c.r();
            return;
        }
        try {
            this.f2601c.f2596c.q(this.f2601c.f2595b.a(this.f2600b));
        } catch (f e2) {
            boolean z = e2.getCause() instanceof Exception;
            d0 d0Var = this.f2601c.f2596c;
            if (z) {
                d0Var.p((Exception) e2.getCause());
            } else {
                d0Var.p(e2);
            }
        } catch (Exception e3) {
            this.f2601c.f2596c.p(e3);
        }
    }
}
