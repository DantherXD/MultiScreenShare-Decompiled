package c.a.a.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class d implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<m> f2502a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Character> f2503b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Character f2504c = ',';

    final char d(m mVar, Object obj, char c2) {
        ThreadLocal<m> threadLocal = f2502a;
        threadLocal.set(mVar);
        ThreadLocal<Character> threadLocal2 = f2503b;
        threadLocal2.set(Character.valueOf(c2));
        e(obj);
        threadLocal.set(null);
        return threadLocal2.get().charValue();
    }

    public abstract void e(Object obj);
}
