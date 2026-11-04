package d.a.j;

/* JADX INFO: loaded from: classes.dex */
final class f extends e<Runnable> {
    f(Runnable runnable) {
        super(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // d.a.j.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + a() + ", " + get() + ")";
    }
}
