package c.b.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class w implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ x f2619c;

    w(x xVar, h hVar) {
        this.f2619c = xVar;
        this.f2618b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2619c.f2621b) {
            if (this.f2619c.f2622c != null) {
                this.f2619c.f2622c.d(this.f2618b.j());
            }
        }
    }
}
