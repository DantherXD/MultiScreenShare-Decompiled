package d.a.m.g;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d.a.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e f4819b = new e("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ThreadFactory f4820c;

    public c() {
        this(f4819b);
    }

    public c(ThreadFactory threadFactory) {
        this.f4820c = threadFactory;
    }

    @Override // d.a.h
    public d.a.h.b a() {
        return new d(this.f4820c);
    }
}
