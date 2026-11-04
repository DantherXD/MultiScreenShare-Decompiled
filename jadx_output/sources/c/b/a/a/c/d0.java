package c.b.a.a.c;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
final class d0<TResult> extends h<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2572a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b0<TResult> f2573b = new b0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    private boolean f2574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f2575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("mLock")
    private TResult f2576e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("mLock")
    private Exception f2577f;

    d0() {
    }

    @GuardedBy("mLock")
    private final void s() {
        com.google.android.gms.common.internal.b.f(this.f2574c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    private final void v() {
        com.google.android.gms.common.internal.b.f(!this.f2574c, "Task is already complete");
    }

    @GuardedBy("mLock")
    private final void w() {
        if (this.f2575d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        synchronized (this.f2572a) {
            if (this.f2574c) {
                this.f2573b.a(this);
            }
        }
    }

    @Override // c.b.a.a.c.h
    public final h<TResult> a(Executor executor, b bVar) {
        this.f2573b.b(new p(f0.a(executor), bVar));
        x();
        return this;
    }

    @Override // c.b.a.a.c.h
    public final h<TResult> b(c<TResult> cVar) {
        return c(j.f2584a, cVar);
    }

    @Override // c.b.a.a.c.h
    public final h<TResult> c(Executor executor, c<TResult> cVar) {
        this.f2573b.b(new t(f0.a(executor), cVar));
        x();
        return this;
    }

    @Override // c.b.a.a.c.h
    public final h<TResult> d(Executor executor, d dVar) {
        this.f2573b.b(new u(f0.a(executor), dVar));
        x();
        return this;
    }

    @Override // c.b.a.a.c.h
    public final h<TResult> e(Executor executor, e<? super TResult> eVar) {
        this.f2573b.b(new x(f0.a(executor), eVar));
        x();
        return this;
    }

    @Override // c.b.a.a.c.h
    public final <TContinuationResult> h<TContinuationResult> f(Executor executor, a<TResult, TContinuationResult> aVar) {
        d0 d0Var = new d0();
        this.f2573b.b(new m(f0.a(executor), aVar, d0Var));
        x();
        return d0Var;
    }

    @Override // c.b.a.a.c.h
    public final <TContinuationResult> h<TContinuationResult> g(a<TResult, h<TContinuationResult>> aVar) {
        return h(j.f2584a, aVar);
    }

    @Override // c.b.a.a.c.h
    public final <TContinuationResult> h<TContinuationResult> h(Executor executor, a<TResult, h<TContinuationResult>> aVar) {
        d0 d0Var = new d0();
        this.f2573b.b(new n(f0.a(executor), aVar, d0Var));
        x();
        return d0Var;
    }

    @Override // c.b.a.a.c.h
    public final Exception i() {
        Exception exc;
        synchronized (this.f2572a) {
            exc = this.f2577f;
        }
        return exc;
    }

    @Override // c.b.a.a.c.h
    public final TResult j() {
        TResult tresult;
        synchronized (this.f2572a) {
            s();
            w();
            if (this.f2577f != null) {
                throw new f(this.f2577f);
            }
            tresult = this.f2576e;
        }
        return tresult;
    }

    @Override // c.b.a.a.c.h
    public final boolean k() {
        return this.f2575d;
    }

    @Override // c.b.a.a.c.h
    public final boolean l() {
        boolean z;
        synchronized (this.f2572a) {
            z = this.f2574c;
        }
        return z;
    }

    @Override // c.b.a.a.c.h
    public final boolean m() {
        boolean z;
        synchronized (this.f2572a) {
            z = this.f2574c && !this.f2575d && this.f2577f == null;
        }
        return z;
    }

    @Override // c.b.a.a.c.h
    public final <TContinuationResult> h<TContinuationResult> n(g<TResult, TContinuationResult> gVar) {
        return o(j.f2584a, gVar);
    }

    @Override // c.b.a.a.c.h
    public final <TContinuationResult> h<TContinuationResult> o(Executor executor, g<TResult, TContinuationResult> gVar) {
        d0 d0Var = new d0();
        this.f2573b.b(new y(f0.a(executor), gVar, d0Var));
        x();
        return d0Var;
    }

    public final void p(Exception exc) {
        com.google.android.gms.common.internal.b.e(exc, "Exception must not be null");
        synchronized (this.f2572a) {
            v();
            this.f2574c = true;
            this.f2577f = exc;
        }
        this.f2573b.a(this);
    }

    public final void q(TResult tresult) {
        synchronized (this.f2572a) {
            v();
            this.f2574c = true;
            this.f2576e = tresult;
        }
        this.f2573b.a(this);
    }

    public final boolean r() {
        synchronized (this.f2572a) {
            if (this.f2574c) {
                return false;
            }
            this.f2574c = true;
            this.f2575d = true;
            this.f2573b.a(this);
            return true;
        }
    }

    public final boolean t(Exception exc) {
        com.google.android.gms.common.internal.b.e(exc, "Exception must not be null");
        synchronized (this.f2572a) {
            if (this.f2574c) {
                return false;
            }
            this.f2574c = true;
            this.f2577f = exc;
            this.f2573b.a(this);
            return true;
        }
    }

    public final boolean u(TResult tresult) {
        synchronized (this.f2572a) {
            if (this.f2574c) {
                return false;
            }
            this.f2574c = true;
            this.f2576e = tresult;
            this.f2573b.a(this);
            return true;
        }
    }
}
