package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final InterfaceC0057b f2266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f2267b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final List<View> f2268c = new ArrayList();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f2269a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a f2270b;

        a() {
        }

        private void c() {
            if (this.f2270b == null) {
                this.f2270b = new a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.f2269a &= ~(1 << i);
                return;
            }
            a aVar = this.f2270b;
            if (aVar != null) {
                aVar.a(i - 64);
            }
        }

        int b(int i) {
            long j;
            a aVar = this.f2270b;
            if (aVar == null) {
                if (i >= 64) {
                    j = this.f2269a;
                }
                return Long.bitCount(j);
            }
            if (i >= 64) {
                return aVar.b(i - 64) + Long.bitCount(this.f2269a);
            }
            j = ((1 << i) - 1) & this.f2269a;
            return Long.bitCount(j);
        }

        boolean d(int i) {
            if (i < 64) {
                return ((1 << i) & this.f2269a) != 0;
            }
            c();
            return this.f2270b.d(i - 64);
        }

        void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f2270b.e(i - 64, z);
                return;
            }
            long j = this.f2269a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f2269a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.f2270b != null) {
                c();
                this.f2270b.e(0, z2);
            }
        }

        boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f2270b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f2269a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f2269a = j3;
            long j4 = j - 1;
            this.f2269a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f2270b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2270b.f(0);
            }
            return z;
        }

        void g() {
            this.f2269a = 0L;
            a aVar = this.f2270b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i) {
            if (i < 64) {
                this.f2269a |= 1 << i;
            } else {
                c();
                this.f2270b.h(i - 64);
            }
        }

        public String toString() {
            if (this.f2270b == null) {
                return Long.toBinaryString(this.f2269a);
            }
            return this.f2270b.toString() + "xx" + Long.toBinaryString(this.f2269a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    interface InterfaceC0057b {
        View a(int i);

        void b(View view);

        void c(int i);

        void d();

        RecyclerView.e0 e(View view);

        void f(int i);

        void g(View view);

        void h(View view, int i, ViewGroup.LayoutParams layoutParams);

        void i(View view, int i);

        int j(View view);

        int k();
    }

    b(InterfaceC0057b interfaceC0057b) {
        this.f2266a = interfaceC0057b;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int iK = this.f2266a.k();
        int i2 = i;
        while (i2 < iK) {
            int iB = i - (i2 - this.f2267b.b(i2));
            if (iB == 0) {
                while (this.f2267b.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += iB;
        }
        return -1;
    }

    private void l(View view) {
        this.f2268c.add(view);
        this.f2266a.b(view);
    }

    private boolean t(View view) {
        if (!this.f2268c.remove(view)) {
            return false;
        }
        this.f2266a.g(view);
        return true;
    }

    void a(View view, int i, boolean z) {
        int iK = i < 0 ? this.f2266a.k() : h(i);
        this.f2267b.e(iK, z);
        if (z) {
            l(view);
        }
        this.f2266a.i(view, iK);
    }

    void b(View view, boolean z) {
        a(view, -1, z);
    }

    void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int iK = i < 0 ? this.f2266a.k() : h(i);
        this.f2267b.e(iK, z);
        if (z) {
            l(view);
        }
        this.f2266a.h(view, iK, layoutParams);
    }

    void d(int i) {
        int iH = h(i);
        this.f2267b.f(iH);
        this.f2266a.f(iH);
    }

    View e(int i) {
        int size = this.f2268c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f2268c.get(i2);
            RecyclerView.e0 e0VarE = this.f2266a.e(view);
            if (e0VarE.m() == i && !e0VarE.t() && !e0VarE.v()) {
                return view;
            }
        }
        return null;
    }

    View f(int i) {
        return this.f2266a.a(h(i));
    }

    int g() {
        return this.f2266a.k() - this.f2268c.size();
    }

    View i(int i) {
        return this.f2266a.a(i);
    }

    int j() {
        return this.f2266a.k();
    }

    void k(View view) {
        int iJ = this.f2266a.j(view);
        if (iJ >= 0) {
            this.f2267b.h(iJ);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    int m(View view) {
        int iJ = this.f2266a.j(view);
        if (iJ == -1 || this.f2267b.d(iJ)) {
            return -1;
        }
        return iJ - this.f2267b.b(iJ);
    }

    boolean n(View view) {
        return this.f2268c.contains(view);
    }

    void o() {
        this.f2267b.g();
        for (int size = this.f2268c.size() - 1; size >= 0; size--) {
            this.f2266a.g(this.f2268c.get(size));
            this.f2268c.remove(size);
        }
        this.f2266a.d();
    }

    void p(View view) {
        int iJ = this.f2266a.j(view);
        if (iJ < 0) {
            return;
        }
        if (this.f2267b.f(iJ)) {
            t(view);
        }
        this.f2266a.c(iJ);
    }

    void q(int i) {
        int iH = h(i);
        View viewA = this.f2266a.a(iH);
        if (viewA == null) {
            return;
        }
        if (this.f2267b.f(iH)) {
            t(viewA);
        }
        this.f2266a.c(iH);
    }

    boolean r(View view) {
        int iJ = this.f2266a.j(view);
        if (iJ == -1) {
            t(view);
            return true;
        }
        if (!this.f2267b.d(iJ)) {
            return false;
        }
        this.f2267b.f(iJ);
        t(view);
        this.f2266a.c(iJ);
        return true;
    }

    void s(View view) {
        int iJ = this.f2266a.j(view);
        if (iJ < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f2267b.d(iJ)) {
            this.f2267b.a(iJ);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f2267b.toString() + ", hidden list:" + this.f2268c.size();
    }
}
