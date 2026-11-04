package d.a.o;

import d.a.m.g.i;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final d.a.h f4866a = d.a.n.a.h(new CallableC0117a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final d.a.h f4867b = d.a.n.a.e(new b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final d.a.h f4868c = d.a.n.a.f(new c());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final d.a.h f4869d = i.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final d.a.h f4870e = d.a.n.a.g(new d());

    /* JADX INFO: renamed from: d.a.o.a$a, reason: collision with other inner class name */
    static class CallableC0117a implements Callable<d.a.h> {
        CallableC0117a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d.a.h call() {
            return h.f4874a;
        }
    }

    static class b implements Callable<d.a.h> {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d.a.h call() {
            return e.f4871a;
        }
    }

    static class c implements Callable<d.a.h> {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d.a.h call() {
            return f.f4872a;
        }
    }

    static class d implements Callable<d.a.h> {
        d() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d.a.h call() {
            return g.f4873a;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d.a.h f4871a = new d.a.m.g.a();
    }

    static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d.a.h f4872a = new d.a.m.g.b();
    }

    static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d.a.h f4873a = new d.a.m.g.c();
    }

    static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d.a.h f4874a = new d.a.m.g.h();
    }

    public static d.a.h a() {
        return d.a.n.a.l(f4868c);
    }
}
