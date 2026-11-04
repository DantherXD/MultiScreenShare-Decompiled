package c.b.a.a.c;

import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class b0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2569a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    private Queue<a0<TResult>> f2570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f2571c;

    b0() {
    }

    public final void a(h<TResult> hVar) {
        a0<TResult> a0VarPoll;
        synchronized (this.f2569a) {
            if (this.f2570b != null && !this.f2571c) {
                this.f2571c = true;
                while (true) {
                    synchronized (this.f2569a) {
                        a0VarPoll = this.f2570b.poll();
                        if (a0VarPoll == null) {
                            this.f2571c = false;
                            return;
                        }
                    }
                    a0VarPoll.a(hVar);
                }
            }
        }
    }

    public final void b(a0<TResult> a0Var) {
        synchronized (this.f2569a) {
            if (this.f2570b == null) {
                this.f2570b = new ArrayDeque();
            }
            this.f2570b.add(a0Var);
        }
    }
}
