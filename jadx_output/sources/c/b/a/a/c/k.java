package c.b.a.a.c;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    private static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f2587a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f2588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d0<Void> f2589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @GuardedBy("mLock")
        private int f2590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @GuardedBy("mLock")
        private int f2591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @GuardedBy("mLock")
        private int f2592f;

        @GuardedBy("mLock")
        private Exception g;

        @GuardedBy("mLock")
        private boolean h;

        public a(int i, d0<Void> d0Var) {
            this.f2588b = i;
            this.f2589c = d0Var;
        }

        @GuardedBy("mLock")
        private final void a() {
            if (this.f2590d + this.f2591e + this.f2592f == this.f2588b) {
                if (this.g == null) {
                    boolean z = this.h;
                    d0<Void> d0Var = this.f2589c;
                    if (z) {
                        d0Var.r();
                        return;
                    } else {
                        d0Var.q(null);
                        return;
                    }
                }
                d0<Void> d0Var2 = this.f2589c;
                int i = this.f2591e;
                int i2 = this.f2588b;
                StringBuilder sb = new StringBuilder(54);
                sb.append(i);
                sb.append(" out of ");
                sb.append(i2);
                sb.append(" underlying tasks failed");
                d0Var2.p(new ExecutionException(sb.toString(), this.g));
            }
        }

        @Override // c.b.a.a.c.b
        public final void b() {
            synchronized (this.f2587a) {
                this.f2592f++;
                this.h = true;
                a();
            }
        }

        @Override // c.b.a.a.c.d
        public final void c(Exception exc) {
            synchronized (this.f2587a) {
                this.f2591e++;
                this.g = exc;
                a();
            }
        }

        @Override // c.b.a.a.c.e
        public final void d(Object obj) {
            synchronized (this.f2587a) {
                this.f2590d++;
                a();
            }
        }
    }

    interface b extends c.b.a.a.c.b, d, e<Object> {
    }

    public static <TResult> h<TResult> a(Executor executor, Callable<TResult> callable) {
        com.google.android.gms.common.internal.b.e(executor, "Executor must not be null");
        com.google.android.gms.common.internal.b.e(callable, "Callback must not be null");
        d0 d0Var = new d0();
        executor.execute(new h0(d0Var, callable));
        return d0Var;
    }

    public static <TResult> h<TResult> b(Exception exc) {
        d0 d0Var = new d0();
        d0Var.p(exc);
        return d0Var;
    }

    public static <TResult> h<TResult> c(TResult tresult) {
        d0 d0Var = new d0();
        d0Var.q(tresult);
        return d0Var;
    }

    public static h<Void> d(Collection<? extends h<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return c(null);
        }
        Iterator<? extends h<?>> it = collection.iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next(), "null tasks are not accepted");
        }
        d0 d0Var = new d0();
        a aVar = new a(collection.size(), d0Var);
        Iterator<? extends h<?>> it2 = collection.iterator();
        while (it2.hasNext()) {
            g(it2.next(), aVar);
        }
        return d0Var;
    }

    public static h<List<h<?>>> e(Collection<? extends h<?>> collection) {
        return (collection == null || collection.isEmpty()) ? c(Collections.emptyList()) : d(collection).g(new l(collection));
    }

    public static h<List<h<?>>> f(h<?>... hVarArr) {
        return (hVarArr == null || hVarArr.length == 0) ? c(Collections.emptyList()) : e(Arrays.asList(hVarArr));
    }

    private static void g(h<?> hVar, b bVar) {
        Executor executor = j.f2585b;
        hVar.e(executor, bVar);
        hVar.d(executor, bVar);
        hVar.a(executor, bVar);
    }
}
