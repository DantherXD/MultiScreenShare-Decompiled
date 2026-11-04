package a.d;

/* JADX INFO: loaded from: classes.dex */
public class h<E> implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f213b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object[] f216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f217f;

    public h() {
        this(10);
    }

    public h(int i) {
        this.f214c = false;
        if (i == 0) {
            this.f215d = c.f179a;
            this.f216e = c.f181c;
        } else {
            int iE = c.e(i);
            this.f215d = new int[iE];
            this.f216e = new Object[iE];
        }
    }

    private void d() {
        int i = this.f217f;
        int[] iArr = this.f215d;
        Object[] objArr = this.f216e;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f213b) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f214c = false;
        this.f217f = i2;
    }

    public void a(int i, E e2) {
        int i2 = this.f217f;
        if (i2 != 0 && i <= this.f215d[i2 - 1]) {
            i(i, e2);
            return;
        }
        if (this.f214c && i2 >= this.f215d.length) {
            d();
        }
        int i3 = this.f217f;
        if (i3 >= this.f215d.length) {
            int iE = c.e(i3 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f215d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f216e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f215d = iArr;
            this.f216e = objArr;
        }
        this.f215d[i3] = i;
        this.f216e[i3] = e2;
        this.f217f = i3 + 1;
    }

    public void b() {
        int i = this.f217f;
        Object[] objArr = this.f216e;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f217f = 0;
        this.f214c = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public h<E> clone() {
        try {
            h<E> hVar = (h) super.clone();
            hVar.f215d = (int[]) this.f215d.clone();
            hVar.f216e = (Object[]) this.f216e.clone();
            return hVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public E e(int i) {
        return f(i, null);
    }

    public E f(int i, E e2) {
        int iA = c.a(this.f215d, this.f217f, i);
        if (iA >= 0) {
            Object[] objArr = this.f216e;
            if (objArr[iA] != f213b) {
                return (E) objArr[iA];
            }
        }
        return e2;
    }

    public int g(E e2) {
        if (this.f214c) {
            d();
        }
        for (int i = 0; i < this.f217f; i++) {
            if (this.f216e[i] == e2) {
                return i;
            }
        }
        return -1;
    }

    public int h(int i) {
        if (this.f214c) {
            d();
        }
        return this.f215d[i];
    }

    public void i(int i, E e2) {
        int iA = c.a(this.f215d, this.f217f, i);
        if (iA >= 0) {
            this.f216e[iA] = e2;
            return;
        }
        int i2 = ~iA;
        int i3 = this.f217f;
        if (i2 < i3) {
            Object[] objArr = this.f216e;
            if (objArr[i2] == f213b) {
                this.f215d[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f214c && i3 >= this.f215d.length) {
            d();
            i2 = ~c.a(this.f215d, this.f217f, i);
        }
        int i4 = this.f217f;
        if (i4 >= this.f215d.length) {
            int iE = c.e(i4 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f215d;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f216e;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f215d = iArr;
            this.f216e = objArr2;
        }
        int i5 = this.f217f;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f215d;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f216e;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f217f - i2);
        }
        this.f215d[i2] = i;
        this.f216e[i2] = e2;
        this.f217f++;
    }

    public int j() {
        if (this.f214c) {
            d();
        }
        return this.f217f;
    }

    public E k(int i) {
        if (this.f214c) {
            d();
        }
        return (E) this.f216e[i];
    }

    public String toString() {
        if (j() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f217f * 28);
        sb.append('{');
        for (int i = 0; i < this.f217f; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(h(i));
            sb.append('=');
            E eK = k(i);
            if (eK != this) {
                sb.append(eK);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
