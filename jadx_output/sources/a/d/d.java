package a.d;

/* JADX INFO: loaded from: classes.dex */
public class d<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f182b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long[] f184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f186f;

    public d() {
        this(10);
    }

    public d(int i) {
        this.f183c = false;
        if (i == 0) {
            this.f184d = c.f180b;
            this.f185e = c.f181c;
        } else {
            int iF = c.f(i);
            this.f184d = new long[iF];
            this.f185e = new Object[iF];
        }
    }

    private void d() {
        int i = this.f186f;
        long[] jArr = this.f184d;
        Object[] objArr = this.f185e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f182b) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f183c = false;
        this.f186f = i2;
    }

    public void a(long j, E e2) {
        int i = this.f186f;
        if (i != 0 && j <= this.f184d[i - 1]) {
            i(j, e2);
            return;
        }
        if (this.f183c && i >= this.f184d.length) {
            d();
        }
        int i2 = this.f186f;
        if (i2 >= this.f184d.length) {
            int iF = c.f(i2 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f184d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f185e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f184d = jArr;
            this.f185e = objArr;
        }
        this.f184d[i2] = j;
        this.f185e[i2] = e2;
        this.f186f = i2 + 1;
    }

    public void b() {
        int i = this.f186f;
        Object[] objArr = this.f185e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f186f = 0;
        this.f183c = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public d<E> clone() {
        try {
            d<E> dVar = (d) super.clone();
            dVar.f184d = (long[]) this.f184d.clone();
            dVar.f185e = (Object[]) this.f185e.clone();
            return dVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E e(long j) {
        return f(j, null);
    }

    public E f(long j, E e2) {
        int iB = c.b(this.f184d, this.f186f, j);
        if (iB >= 0) {
            Object[] objArr = this.f185e;
            if (objArr[iB] != f182b) {
                return (E) objArr[iB];
            }
        }
        return e2;
    }

    public int g(long j) {
        if (this.f183c) {
            d();
        }
        return c.b(this.f184d, this.f186f, j);
    }

    public long h(int i) {
        if (this.f183c) {
            d();
        }
        return this.f184d[i];
    }

    public void i(long j, E e2) {
        int iB = c.b(this.f184d, this.f186f, j);
        if (iB >= 0) {
            this.f185e[iB] = e2;
            return;
        }
        int i = ~iB;
        int i2 = this.f186f;
        if (i < i2) {
            Object[] objArr = this.f185e;
            if (objArr[i] == f182b) {
                this.f184d[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f183c && i2 >= this.f184d.length) {
            d();
            i = ~c.b(this.f184d, this.f186f, j);
        }
        int i3 = this.f186f;
        if (i3 >= this.f184d.length) {
            int iF = c.f(i3 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f184d;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f185e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f184d = jArr;
            this.f185e = objArr2;
        }
        int i4 = this.f186f;
        if (i4 - i != 0) {
            long[] jArr3 = this.f184d;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f185e;
            System.arraycopy(objArr4, i, objArr4, i5, this.f186f - i);
        }
        this.f184d[i] = j;
        this.f185e[i] = e2;
        this.f186f++;
    }

    public void j(long j) {
        int iB = c.b(this.f184d, this.f186f, j);
        if (iB >= 0) {
            Object[] objArr = this.f185e;
            Object obj = objArr[iB];
            Object obj2 = f182b;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f183c = true;
            }
        }
    }

    public void k(int i) {
        Object[] objArr = this.f185e;
        Object obj = objArr[i];
        Object obj2 = f182b;
        if (obj != obj2) {
            objArr[i] = obj2;
            this.f183c = true;
        }
    }

    public int l() {
        if (this.f183c) {
            d();
        }
        return this.f186f;
    }

    public E m(int i) {
        if (this.f183c) {
            d();
        }
        return (E) this.f185e[i];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f186f * 28);
        sb.append('{');
        for (int i = 0; i < this.f186f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(h(i));
            sb.append('=');
            E eM = m(i);
            if (eM != this) {
                sb.append(eM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
