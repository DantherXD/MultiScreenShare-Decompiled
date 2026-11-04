package a.g.k;

/* JADX INFO: loaded from: classes.dex */
public class f<T> implements e<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object[] f602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f603b;

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f602a = new Object[i];
    }

    private boolean c(T t) {
        for (int i = 0; i < this.f603b; i++) {
            if (this.f602a[i] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // a.g.k.e
    public boolean a(T t) {
        if (c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i = this.f603b;
        Object[] objArr = this.f602a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f603b = i + 1;
        return true;
    }

    @Override // a.g.k.e
    public T b() {
        int i = this.f603b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f602a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f603b = i - 1;
        return t;
    }
}
