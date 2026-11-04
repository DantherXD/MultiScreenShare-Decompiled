package c.b.a.a.c;

/* JADX INFO: loaded from: classes.dex */
final class s implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ h f2608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ t f2609c;

    s(t tVar, h hVar) {
        this.f2609c = tVar;
        this.f2608b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2609c.f2611b) {
            if (this.f2609c.f2612c != null) {
                this.f2609c.f2612c.a(this.f2608b);
            }
        }
    }
}
