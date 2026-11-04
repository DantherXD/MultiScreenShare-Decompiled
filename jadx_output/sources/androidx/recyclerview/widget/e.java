package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
final class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final ThreadLocal<e> f2321b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static Comparator<c> f2322c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    long f2324e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f2325f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<RecyclerView> f2323d = new ArrayList<>();
    private ArrayList<c> g = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f2333d;
            if ((recyclerView == null) != (cVar2.f2333d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f2330a;
            if (z != cVar2.f2330a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f2331b - cVar.f2331b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f2332c - cVar2.f2332c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    static class b implements RecyclerView.p.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int[] f2328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2329d;

        b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f2329d * 2;
            int[] iArr = this.f2328c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2328c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f2328c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2328c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f2329d++;
        }

        void b() {
            int[] iArr = this.f2328c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f2329d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.f2329d = 0;
            int[] iArr = this.f2328c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.w;
            if (recyclerView.v == null || pVar == null || !pVar.u0()) {
                return;
            }
            if (z) {
                if (!recyclerView.n.p()) {
                    pVar.p(recyclerView.v.d(), this);
                }
            } else if (!recyclerView.l0()) {
                pVar.o(this.f2326a, this.f2327b, recyclerView.s0, this);
            }
            int i = this.f2329d;
            if (i > pVar.m) {
                pVar.m = i;
                pVar.n = z;
                recyclerView.l.K();
            }
        }

        boolean d(int i) {
            if (this.f2328c != null) {
                int i2 = this.f2329d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f2328c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i, int i2) {
            this.f2326a = i;
            this.f2327b = i2;
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f2330a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2331b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2332c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public RecyclerView f2333d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2334e;

        c() {
        }

        public void a() {
            this.f2330a = false;
            this.f2331b = 0;
            this.f2332c = 0;
            this.f2333d = null;
            this.f2334e = 0;
        }
    }

    e() {
    }

    private void b() {
        c cVar;
        int size = this.f2323d.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f2323d.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.r0.c(recyclerView, false);
                i += recyclerView.r0.f2329d;
            }
        }
        this.g.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f2323d.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.r0;
                int iAbs = Math.abs(bVar.f2326a) + Math.abs(bVar.f2327b);
                for (int i5 = 0; i5 < bVar.f2329d * 2; i5 += 2) {
                    if (i3 >= this.g.size()) {
                        cVar = new c();
                        this.g.add(cVar);
                    } else {
                        cVar = this.g.get(i3);
                    }
                    int[] iArr = bVar.f2328c;
                    int i6 = iArr[i5 + 1];
                    cVar.f2330a = i6 <= iAbs;
                    cVar.f2331b = iAbs;
                    cVar.f2332c = i6;
                    cVar.f2333d = recyclerView2;
                    cVar.f2334e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.g, f2322c);
    }

    private void c(c cVar, long j) {
        RecyclerView.e0 e0VarI = i(cVar.f2333d, cVar.f2334e, cVar.f2330a ? Long.MAX_VALUE : j);
        if (e0VarI == null || e0VarI.f2176c == null || !e0VarI.s() || e0VarI.t()) {
            return;
        }
        h(e0VarI.f2176c.get(), j);
    }

    private void d(long j) {
        for (int i = 0; i < this.g.size(); i++) {
            c cVar = this.g.get(i);
            if (cVar.f2333d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i) {
        int iJ = recyclerView.o.j();
        for (int i2 = 0; i2 < iJ; i2++) {
            RecyclerView.e0 e0VarF0 = RecyclerView.f0(recyclerView.o.i(i2));
            if (e0VarF0.f2177d == i && !e0VarF0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.O && recyclerView.o.j() != 0) {
            recyclerView.U0();
        }
        b bVar = recyclerView.r0;
        bVar.c(recyclerView, true);
        if (bVar.f2329d != 0) {
            try {
                a.g.h.c.a("RV Nested Prefetch");
                recyclerView.s0.f(recyclerView.v);
                for (int i = 0; i < bVar.f2329d * 2; i += 2) {
                    i(recyclerView, bVar.f2328c[i], j);
                }
                a.g.h.c.b();
            } catch (Throwable th) {
                a.g.h.c.b();
                throw th;
            }
        }
    }

    private RecyclerView.e0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.l;
        try {
            recyclerView.G0();
            RecyclerView.e0 e0VarI = wVar.I(i, false, j);
            if (e0VarI != null) {
                if (!e0VarI.s() || e0VarI.t()) {
                    wVar.a(e0VarI, false);
                } else {
                    wVar.B(e0VarI.f2175b);
                }
            }
            return e0VarI;
        } finally {
            recyclerView.I0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f2323d.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f2324e == 0) {
            this.f2324e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.r0.e(i, i2);
    }

    void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.f2323d.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            a.g.h.c.a("RV Prefetch");
            if (!this.f2323d.isEmpty()) {
                int size = this.f2323d.size();
                long jMax = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f2323d.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2325f);
                }
            }
        } finally {
            this.f2324e = 0L;
            a.g.h.c.b();
        }
    }
}
