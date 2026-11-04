package c.b.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class v implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ u f2617c;

    v(u uVar, h hVar) {
        this.f2617c = uVar;
        this.f2616b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2617c.f2614b) {
            if (this.f2617c.f2615c != null) {
                this.f2617c.f2615c.c(this.f2616b.i());
            }
        }
    }
}
