package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class a implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a.g.k.e<b> f2256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList<b> f2257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList<b> f2258c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final InterfaceC0056a f2259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Runnable f2260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f2261f;
    final h g;
    private int h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    interface InterfaceC0056a {
        void a(int i, int i2);

        void b(b bVar);

        RecyclerView.e0 c(int i);

        void d(int i, int i2);

        void e(int i, int i2);

        void f(b bVar);

        void g(int i, int i2);

        void h(int i, int i2, Object obj);
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2262a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2263b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f2264c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2265d;

        b(int i, int i2, int i3, Object obj) {
            this.f2262a = i;
            this.f2263b = i2;
            this.f2265d = i3;
            this.f2264c = obj;
        }

        String a() {
            int i = this.f2262a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f2262a;
            if (i != bVar.f2262a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f2265d - this.f2263b) == 1 && this.f2265d == bVar.f2263b && this.f2263b == bVar.f2265d) {
                return true;
            }
            if (this.f2265d != bVar.f2265d || this.f2263b != bVar.f2263b) {
                return false;
            }
            Object obj2 = this.f2264c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f2264c)) {
                    return false;
                }
            } else if (bVar.f2264c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f2262a * 31) + this.f2263b) * 31) + this.f2265d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f2263b + "c:" + this.f2265d + ",p:" + this.f2264c + "]";
        }
    }

    a(InterfaceC0056a interfaceC0056a) {
        this(interfaceC0056a, false);
    }

    a(InterfaceC0056a interfaceC0056a, boolean z) {
        this.f2256a = new a.g.k.f(30);
        this.f2257b = new ArrayList<>();
        this.f2258c = new ArrayList<>();
        this.h = 0;
        this.f2259d = interfaceC0056a;
        this.f2261f = z;
        this.g = new h(this);
    }

    private void c(b bVar) {
        s(bVar);
    }

    private void d(b bVar) {
        s(bVar);
    }

    private void f(b bVar) {
        boolean z;
        byte b2;
        int i = bVar.f2263b;
        int i2 = bVar.f2265d + i;
        byte b3 = -1;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f2259d.c(i3) != null || h(i3)) {
                if (b3 == 0) {
                    k(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 1;
            } else {
                if (b3 == 1) {
                    s(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                b2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            b3 = b2;
        }
        if (i4 != bVar.f2265d) {
            a(bVar);
            bVar = b(2, i, i4, null);
        }
        if (b3 == 0) {
            k(bVar);
        } else {
            s(bVar);
        }
    }

    private void g(b bVar) {
        int i = bVar.f2263b;
        int i2 = bVar.f2265d + i;
        int i3 = 0;
        byte b2 = -1;
        int i4 = i;
        while (i < i2) {
            if (this.f2259d.c(i) != null || h(i)) {
                if (b2 == 0) {
                    k(b(4, i4, i3, bVar.f2264c));
                    i4 = i;
                    i3 = 0;
                }
                b2 = 1;
            } else {
                if (b2 == 1) {
                    s(b(4, i4, i3, bVar.f2264c));
                    i4 = i;
                    i3 = 0;
                }
                b2 = 0;
            }
            i3++;
            i++;
        }
        if (i3 != bVar.f2265d) {
            Object obj = bVar.f2264c;
            a(bVar);
            bVar = b(4, i4, i3, obj);
        }
        if (b2 == 0) {
            k(bVar);
        } else {
            s(bVar);
        }
    }

    private boolean h(int i) {
        int size = this.f2258c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2258c.get(i2);
            int i3 = bVar.f2262a;
            if (i3 == 8) {
                if (n(bVar.f2265d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f2263b;
                int i5 = bVar.f2265d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i;
        int i2 = bVar.f2262a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iW = w(bVar.f2263b, i2);
        int i3 = bVar.f2263b;
        int i4 = bVar.f2262a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f2265d; i6++) {
            int iW2 = w(bVar.f2263b + (i * i6), bVar.f2262a);
            int i7 = bVar.f2262a;
            if (i7 == 2 ? iW2 == iW : i7 == 4 && iW2 == iW + 1) {
                i5++;
            } else {
                b bVarB = b(i7, iW, i5, bVar.f2264c);
                l(bVarB, i3);
                a(bVarB);
                if (bVar.f2262a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                iW = iW2;
            }
        }
        Object obj = bVar.f2264c;
        a(bVar);
        if (i5 > 0) {
            b bVarB2 = b(bVar.f2262a, iW, i5, obj);
            l(bVarB2, i3);
            a(bVarB2);
        }
    }

    private void s(b bVar) {
        this.f2258c.add(bVar);
        int i = bVar.f2262a;
        if (i == 1) {
            this.f2259d.g(bVar.f2263b, bVar.f2265d);
            return;
        }
        if (i == 2) {
            this.f2259d.e(bVar.f2263b, bVar.f2265d);
            return;
        }
        if (i == 4) {
            this.f2259d.h(bVar.f2263b, bVar.f2265d, bVar.f2264c);
        } else {
            if (i == 8) {
                this.f2259d.a(bVar.f2263b, bVar.f2265d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    private int w(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f2258c.size() - 1; size >= 0; size--) {
            b bVar = this.f2258c.get(size);
            int i9 = bVar.f2262a;
            if (i9 == 8) {
                int i10 = bVar.f2263b;
                int i11 = bVar.f2265d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f2263b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f2263b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f2265d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f2265d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f2263b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f2263b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f2263b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f2265d;
                } else if (i9 == 2) {
                    i += bVar.f2265d;
                }
            }
        }
        for (int size2 = this.f2258c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f2258c.get(size2);
            if (bVar2.f2262a == 8) {
                int i13 = bVar2.f2265d;
                if (i13 == bVar2.f2263b || i13 < 0) {
                    this.f2258c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f2265d <= 0) {
                this.f2258c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f2261f) {
            return;
        }
        bVar.f2264c = null;
        this.f2256a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i, int i2, int i3, Object obj) {
        b bVarB = this.f2256a.b();
        if (bVarB == null) {
            return new b(i, i2, i3, obj);
        }
        bVarB.f2262a = i;
        bVarB.f2263b = i2;
        bVarB.f2265d = i3;
        bVarB.f2264c = obj;
        return bVarB;
    }

    public int e(int i) {
        int size = this.f2257b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f2257b.get(i2);
            int i3 = bVar.f2262a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f2263b;
                    if (i4 <= i) {
                        int i5 = bVar.f2265d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f2263b;
                    if (i6 == i) {
                        i = bVar.f2265d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f2265d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f2263b <= i) {
                i += bVar.f2265d;
            }
        }
        return i;
    }

    void i() {
        int size = this.f2258c.size();
        for (int i = 0; i < size; i++) {
            this.f2259d.b(this.f2258c.get(i));
        }
        u(this.f2258c);
        this.h = 0;
    }

    void j() {
        i();
        int size = this.f2257b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2257b.get(i);
            int i2 = bVar.f2262a;
            if (i2 == 1) {
                this.f2259d.b(bVar);
                this.f2259d.g(bVar.f2263b, bVar.f2265d);
            } else if (i2 == 2) {
                this.f2259d.b(bVar);
                this.f2259d.d(bVar.f2263b, bVar.f2265d);
            } else if (i2 == 4) {
                this.f2259d.b(bVar);
                this.f2259d.h(bVar.f2263b, bVar.f2265d, bVar.f2264c);
            } else if (i2 == 8) {
                this.f2259d.b(bVar);
                this.f2259d.a(bVar.f2263b, bVar.f2265d);
            }
            Runnable runnable = this.f2260e;
            if (runnable != null) {
                runnable.run();
            }
        }
        u(this.f2257b);
        this.h = 0;
    }

    void l(b bVar, int i) {
        this.f2259d.f(bVar);
        int i2 = bVar.f2262a;
        if (i2 == 2) {
            this.f2259d.d(i, bVar.f2265d);
        } else {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f2259d.h(i, bVar.f2265d, bVar.f2264c);
        }
    }

    int m(int i) {
        return n(i, 0);
    }

    int n(int i, int i2) {
        int size = this.f2258c.size();
        while (i2 < size) {
            b bVar = this.f2258c.get(i2);
            int i3 = bVar.f2262a;
            if (i3 == 8) {
                int i4 = bVar.f2263b;
                if (i4 == i) {
                    i = bVar.f2265d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f2265d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f2263b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f2265d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f2265d;
                }
            }
            i2++;
        }
        return i;
    }

    boolean o(int i) {
        return (this.h & i) != 0;
    }

    boolean p() {
        return this.f2257b.size() > 0;
    }

    boolean q() {
        return (this.f2258c.isEmpty() || this.f2257b.isEmpty()) ? false : true;
    }

    boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f2257b.add(b(4, i, i2, obj));
        this.h |= 4;
        return this.f2257b.size() == 1;
    }

    void t() {
        this.g.b(this.f2257b);
        int size = this.f2257b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f2257b.get(i);
            int i2 = bVar.f2262a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f2260e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f2257b.clear();
    }

    void u(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    void v() {
        u(this.f2257b);
        u(this.f2258c);
        this.h = 0;
    }
}
