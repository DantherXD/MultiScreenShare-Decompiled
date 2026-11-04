package d.a.m.b;

import java.util.Comparator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d.a.l.e<Object, Object> f4759a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f4760b = new RunnableC0113a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final d.a.l.a f4761c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final d.a.l.d<Object> f4762d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d.a.l.d<Throwable> f4763e = new d();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d.a.l.d<Throwable> f4764f = new e();
    public static final d.a.l.f g = new f();
    static final d.a.l.g<Object> h = new g();
    static final d.a.l.g<Object> i = new h();
    static final Callable<Object> j = new i();
    static final Comparator<Object> k = new j();
    public static final d.a.l.d<f.a.a> l = new k();

    /* JADX INFO: renamed from: d.a.m.b.a$a, reason: collision with other inner class name */
    static class RunnableC0113a implements Runnable {
        RunnableC0113a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }

        public String toString() {
            return "EmptyRunnable";
        }
    }

    static class b implements d.a.l.a {
        b() {
        }

        @Override // d.a.l.a
        public void run() {
        }

        public String toString() {
            return "EmptyAction";
        }
    }

    static class c implements d.a.l.d<Object> {
        c() {
        }

        @Override // d.a.l.d
        public void a(Object obj) {
        }

        public String toString() {
            return "EmptyConsumer";
        }
    }

    static class d implements d.a.l.d<Throwable> {
        d() {
        }

        @Override // d.a.l.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Throwable th) {
            d.a.n.a.k(th);
        }
    }

    static class e implements d.a.l.d<Throwable> {
        e() {
        }

        @Override // d.a.l.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Throwable th) {
            d.a.n.a.k(new d.a.k.c(th));
        }
    }

    static class f implements d.a.l.f {
        f() {
        }
    }

    static class g implements d.a.l.g<Object> {
        g() {
        }
    }

    static class h implements d.a.l.g<Object> {
        h() {
        }
    }

    static class i implements Callable<Object> {
        i() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    static class j implements Comparator<Object> {
        j() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static class k implements d.a.l.d<f.a.a> {
        k() {
        }

        @Override // d.a.l.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(f.a.a aVar) {
            aVar.a(Long.MAX_VALUE);
        }
    }

    static class l implements d.a.l.e<Object, Object> {
        l() {
        }

        @Override // d.a.l.e
        public Object a(Object obj) {
            return obj;
        }

        public String toString() {
            return "IdentityFunction";
        }
    }

    public static <T> d.a.l.d<T> a() {
        return (d.a.l.d<T>) f4762d;
    }
}
