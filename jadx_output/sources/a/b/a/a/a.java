package a.b.a.a;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Executor f129b = new ExecutorC0003a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Executor f130c = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f132e;

    /* JADX INFO: renamed from: a.b.a.a.a$a, reason: collision with other inner class name */
    static class ExecutorC0003a implements Executor {
        ExecutorC0003a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().c(runnable);
        }
    }

    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.d().a(runnable);
        }
    }

    private a() {
        a.b.a.a.b bVar = new a.b.a.a.b();
        this.f132e = bVar;
        this.f131d = bVar;
    }

    public static a d() {
        if (f128a != null) {
            return f128a;
        }
        synchronized (a.class) {
            if (f128a == null) {
                f128a = new a();
            }
        }
        return f128a;
    }

    @Override // a.b.a.a.c
    public void a(Runnable runnable) {
        this.f131d.a(runnable);
    }

    @Override // a.b.a.a.c
    public boolean b() {
        return this.f131d.b();
    }

    @Override // a.b.a.a.c
    public void c(Runnable runnable) {
        this.f131d.c(runnable);
    }
}
