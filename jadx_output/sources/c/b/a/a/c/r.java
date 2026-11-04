package c.b.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class r implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ p f2607b;

    r(p pVar) {
        this.f2607b = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2607b.f2603b) {
            if (this.f2607b.f2604c != null) {
                this.f2607b.f2604c.b();
            }
        }
    }
}
