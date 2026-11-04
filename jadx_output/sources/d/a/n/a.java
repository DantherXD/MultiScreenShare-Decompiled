package d.a.n;

import d.a.c;
import d.a.g;
import d.a.h;
import d.a.l.b;
import d.a.l.d;
import d.a.l.e;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile d<? super Throwable> f4860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile e<? super Runnable, ? extends Runnable> f4861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile e<? super Callable<h>, ? extends h> f4862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile e<? super Callable<h>, ? extends h> f4863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile e<? super Callable<h>, ? extends h> f4864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile e<? super Callable<h>, ? extends h> f4865f;
    static volatile e<? super h, ? extends h> g;
    static volatile e<? super c, ? extends c> h;
    static volatile b<? super c, ? super g, ? extends g> i;

    static <T, U, R> R a(b<T, U, R> bVar, T t, U u) {
        try {
            return bVar.a(t, u);
        } catch (Throwable th) {
            throw d.a.m.h.a.a(th);
        }
    }

    static <T, R> R b(e<T, R> eVar, T t) {
        try {
            return eVar.a(t);
        } catch (Throwable th) {
            throw d.a.m.h.a.a(th);
        }
    }

    static h c(e<? super Callable<h>, ? extends h> eVar, Callable<h> callable) {
        return (h) d.a.m.b.b.c(b(eVar, callable), "Scheduler Callable result can't be null");
    }

    static h d(Callable<h> callable) {
        try {
            return (h) d.a.m.b.b.c(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th) {
            throw d.a.m.h.a.a(th);
        }
    }

    public static h e(Callable<h> callable) {
        d.a.m.b.b.c(callable, "Scheduler Callable can't be null");
        e<? super Callable<h>, ? extends h> eVar = f4862c;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    public static h f(Callable<h> callable) {
        d.a.m.b.b.c(callable, "Scheduler Callable can't be null");
        e<? super Callable<h>, ? extends h> eVar = f4864e;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    public static h g(Callable<h> callable) {
        d.a.m.b.b.c(callable, "Scheduler Callable can't be null");
        e<? super Callable<h>, ? extends h> eVar = f4865f;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    public static h h(Callable<h> callable) {
        d.a.m.b.b.c(callable, "Scheduler Callable can't be null");
        e<? super Callable<h>, ? extends h> eVar = f4863d;
        return eVar == null ? d(callable) : c(eVar, callable);
    }

    static boolean i(Throwable th) {
        return (th instanceof d.a.k.c) || (th instanceof IllegalStateException) || (th instanceof NullPointerException) || (th instanceof IllegalArgumentException) || (th instanceof d.a.k.a);
    }

    public static <T> c<T> j(c<T> cVar) {
        e<? super c, ? extends c> eVar = h;
        return eVar != null ? (c) b(eVar, cVar) : cVar;
    }

    public static void k(Throwable th) {
        d<? super Throwable> dVar = f4860a;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!i(th)) {
            th = new d.a.k.e(th);
        }
        if (dVar != null) {
            try {
                dVar.a(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                o(th2);
            }
        }
        th.printStackTrace();
        o(th);
    }

    public static h l(h hVar) {
        e<? super h, ? extends h> eVar = g;
        return eVar == null ? hVar : (h) b(eVar, hVar);
    }

    public static Runnable m(Runnable runnable) {
        e<? super Runnable, ? extends Runnable> eVar = f4861b;
        return eVar == null ? runnable : (Runnable) b(eVar, runnable);
    }

    public static <T> g<? super T> n(c<T> cVar, g<? super T> gVar) {
        b<? super c, ? super g, ? extends g> bVar = i;
        return bVar != null ? (g) a(bVar, cVar, gVar) : gVar;
    }

    static void o(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
