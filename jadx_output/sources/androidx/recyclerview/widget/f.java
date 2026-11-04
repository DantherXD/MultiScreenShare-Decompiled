package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f2336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f2337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f2338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f2339e;
    boolean h;
    boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f2335a = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f2340f = 0;
    int g = 0;

    f() {
    }

    boolean a(RecyclerView.b0 b0Var) {
        int i = this.f2337c;
        return i >= 0 && i < b0Var.b();
    }

    View b(RecyclerView.w wVar) {
        View viewO = wVar.o(this.f2337c);
        this.f2337c += this.f2338d;
        return viewO;
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f2336b + ", mCurrentPosition=" + this.f2337c + ", mItemDirection=" + this.f2338d + ", mLayoutDirection=" + this.f2339e + ", mStartLine=" + this.f2340f + ", mEndLine=" + this.g + '}';
    }
}
