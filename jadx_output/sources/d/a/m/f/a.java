package d.a.m.f;

import d.a.m.c.c;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f4786b = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f4787c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f4789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f4790f;
    final int g;
    AtomicReferenceArray<Object> h;
    final int i;
    AtomicReferenceArray<Object> j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final AtomicLong f4788d = new AtomicLong();
    final AtomicLong k = new AtomicLong();

    public a(int i) {
        int iA = d.a.m.h.c.a(Math.max(8, i));
        int i2 = iA - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(iA + 1);
        this.h = atomicReferenceArray;
        this.g = i2;
        a(iA);
        this.j = atomicReferenceArray;
        this.i = i2;
        this.f4790f = i2 - 1;
        p(0L);
    }

    private void a(int i) {
        this.f4789e = Math.min(i / 4, f4786b);
    }

    private static int b(int i) {
        return i;
    }

    private static int c(long j, int i) {
        return b(((int) j) & i);
    }

    private long d() {
        return this.k.get();
    }

    private long e() {
        return this.f4788d.get();
    }

    private long g() {
        return this.k.get();
    }

    private static <E> Object h(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    private AtomicReferenceArray<Object> i(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) h(atomicReferenceArray, b(atomicReferenceArray.length() - 1));
    }

    private long j() {
        return this.f4788d.get();
    }

    private T k(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.j = atomicReferenceArray;
        int iC = c(j, i);
        T t = (T) h(atomicReferenceArray, iC);
        if (t != null) {
            n(atomicReferenceArray, iC, null);
            m(j + 1);
        }
        return t;
    }

    private void l(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.h = atomicReferenceArray2;
        this.f4790f = (j2 + j) - 1;
        n(atomicReferenceArray2, i, t);
        o(atomicReferenceArray, atomicReferenceArray2);
        n(atomicReferenceArray, i, f4787c);
        p(j + 1);
    }

    private void m(long j) {
        this.k.lazySet(j);
    }

    private static void n(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    private void o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        n(atomicReferenceArray, b(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void p(long j) {
        this.f4788d.lazySet(j);
    }

    private boolean q(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        n(atomicReferenceArray, i, t);
        p(j + 1);
        return true;
    }

    @Override // d.a.m.c.c
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // d.a.m.c.c
    public boolean isEmpty() {
        return j() == g();
    }

    @Override // d.a.m.c.c
    public boolean offer(T t) {
        Objects.requireNonNull(t, "Null is not a valid element");
        AtomicReferenceArray<Object> atomicReferenceArray = this.h;
        long jE = e();
        int i = this.g;
        int iC = c(jE, i);
        if (jE < this.f4790f) {
            return q(atomicReferenceArray, t, jE, iC);
        }
        long j = ((long) this.f4789e) + jE;
        if (h(atomicReferenceArray, c(j, i)) == null) {
            this.f4790f = j - 1;
            return q(atomicReferenceArray, t, jE, iC);
        }
        if (h(atomicReferenceArray, c(1 + jE, i)) == null) {
            return q(atomicReferenceArray, t, jE, iC);
        }
        l(atomicReferenceArray, jE, iC, t, i);
        return true;
    }

    @Override // d.a.m.c.c
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.j;
        long jD = d();
        int i = this.i;
        int iC = c(jD, i);
        T t = (T) h(atomicReferenceArray, iC);
        boolean z = t == f4787c;
        if (t == null || z) {
            if (z) {
                return k(i(atomicReferenceArray), jD, i);
            }
            return null;
        }
        n(atomicReferenceArray, iC, null);
        m(jD + 1);
        return t;
    }
}
