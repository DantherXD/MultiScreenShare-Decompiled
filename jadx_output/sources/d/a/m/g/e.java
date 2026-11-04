package d.a.m.g;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AtomicLong implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f4823b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f4824c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f4825d;

    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public e(String str) {
        this(str, 5, false);
    }

    public e(String str, int i) {
        this(str, i, false);
    }

    public e(String str, int i, boolean z) {
        this.f4823b = str;
        this.f4824c = i;
        this.f4825d = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f4823b + '-' + incrementAndGet();
        Thread aVar = this.f4825d ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f4824c);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f4823b + "]";
    }
}
