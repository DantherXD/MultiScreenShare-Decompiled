package d.a.m.g;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AtomicReferenceArray<Object> implements Runnable, Callable<Object>, d.a.j.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Object f4826b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f4827c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Runnable f4828d;

    public f(Runnable runnable, d.a.m.a.a aVar) {
        super(2);
        this.f4828d = runnable;
        lazySet(0, aVar);
    }

    public void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj == f4827c) {
                return;
            }
            if (obj == f4826b) {
                future.cancel(true);
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    @Override // d.a.j.b
    public void c() {
        Object obj;
        Object obj2;
        Object obj3;
        while (true) {
            Object obj4 = get(1);
            if (obj4 == f4827c || obj4 == (obj3 = f4826b)) {
                break;
            }
            if (compareAndSet(1, obj4, obj3)) {
                if (obj4 == null) {
                    break;
                }
                ((Future) obj4).cancel(true);
                break;
            }
        }
        do {
            obj = get(0);
            if (obj == f4827c || obj == (obj2 = f4826b) || obj == null) {
                return;
            }
        } while (!compareAndSet(0, obj, obj2));
        ((d.a.m.a.a) obj).a(this);
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        run();
        return null;
    }

    @Override // java.lang.Runnable
    public void run() {
        Object obj;
        Object obj2;
        try {
            this.f4828d.run();
        } catch (Throwable th) {
            try {
                d.a.n.a.k(th);
            } finally {
                Object obj3 = get(0);
                if (obj3 != f4826b && obj3 != null && compareAndSet(0, obj3, f4827c)) {
                    ((d.a.m.a.a) obj3).a(this);
                }
                do {
                    obj = get(1);
                    if (obj == f4826b) {
                        break;
                    }
                } while (!compareAndSet(1, obj, f4827c));
            }
        }
        Object obj4 = get(0);
        if (obj4 != f4826b && obj4 != null && compareAndSet(0, obj4, f4827c)) {
            ((d.a.m.a.a) obj4).a(this);
        }
        do {
            if (r1 == obj2) {
                return;
            }
        } while (!compareAndSet(1, get(i), f4827c));
    }
}
