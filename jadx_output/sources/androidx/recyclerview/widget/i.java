package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final RecyclerView.p f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Rect f2344c;

    class a extends i {
        a(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f2342a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f2342a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f2342a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f2342a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f2342a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f2342a.o0() - this.f2342a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f2342a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f2342a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f2342a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f2342a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f2342a.o0() - this.f2342a.e0()) - this.f2342a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f2342a.n0(view, true, this.f2344c);
            return this.f2344c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f2342a.n0(view, true, this.f2344c);
            return this.f2344c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i) {
            this.f2342a.C0(i);
        }
    }

    class b extends i {
        b(RecyclerView.p pVar) {
            super(pVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f2342a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f2342a.R(view) + ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            return this.f2342a.S(view) + ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f2342a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.q) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f2342a.W();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f2342a.W() - this.f2342a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f2342a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f2342a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f2342a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f2342a.g0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f2342a.W() - this.f2342a.g0()) - this.f2342a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f2342a.n0(view, true, this.f2344c);
            return this.f2344c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f2342a.n0(view, true, this.f2344c);
            return this.f2344c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i) {
            this.f2342a.D0(i);
        }
    }

    private i(RecyclerView.p pVar) {
        this.f2343b = Integer.MIN_VALUE;
        this.f2344c = new Rect();
        this.f2342a = pVar;
    }

    /* synthetic */ i(RecyclerView.p pVar, a aVar) {
        this(pVar);
    }

    public static i a(RecyclerView.p pVar) {
        return new a(pVar);
    }

    public static i b(RecyclerView.p pVar, int i) {
        if (i == 0) {
            return a(pVar);
        }
        if (i == 1) {
            return c(pVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.p pVar) {
        return new b(pVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f2343b) {
            return 0;
        }
        return n() - this.f2343b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i);

    public void s() {
        this.f2343b = n();
    }
}
