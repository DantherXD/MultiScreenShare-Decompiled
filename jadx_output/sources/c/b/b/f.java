package c.b.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final boolean f2844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final StackTraceElement[] f2845c;

    static {
        f2844b = System.getProperty("surefire.test.class.path") != null;
        f2845c = new StackTraceElement[0];
    }

    f() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
