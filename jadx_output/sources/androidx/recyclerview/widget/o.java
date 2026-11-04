package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f2356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f2357b = new a();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f2358a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2359b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f2360c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2361d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2362e;

        a() {
        }

        void a(int i) {
            this.f2358a = i | this.f2358a;
        }

        boolean b() {
            int i = this.f2358a;
            if ((i & 7) != 0 && (i & (c(this.f2361d, this.f2359b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f2358a;
            if ((i2 & 112) != 0 && (i2 & (c(this.f2361d, this.f2360c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f2358a;
            if ((i3 & 1792) != 0 && (i3 & (c(this.f2362e, this.f2359b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f2358a;
            return (i4 & 28672) == 0 || ((c(this.f2362e, this.f2360c) << 12) & i4) != 0;
        }

        int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        void d() {
            this.f2358a = 0;
        }

        void e(int i, int i2, int i3, int i4) {
            this.f2359b = i;
            this.f2360c = i2;
            this.f2361d = i3;
            this.f2362e = i4;
        }
    }

    interface b {
        View a(int i);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    o(b bVar) {
        this.f2356a = bVar;
    }

    View a(int i, int i2, int i3, int i4) {
        int iC = this.f2356a.c();
        int iB = this.f2356a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View viewA = this.f2356a.a(i);
            this.f2357b.e(iC, iB, this.f2356a.e(viewA), this.f2356a.d(viewA));
            if (i3 != 0) {
                this.f2357b.d();
                this.f2357b.a(i3);
                if (this.f2357b.b()) {
                    return viewA;
                }
            }
            if (i4 != 0) {
                this.f2357b.d();
                this.f2357b.a(i4);
                if (this.f2357b.b()) {
                    view = viewA;
                }
            }
            i += i5;
        }
        return view;
    }

    boolean b(View view, int i) {
        this.f2357b.e(this.f2356a.c(), this.f2356a.b(), this.f2356a.e(view), this.f2356a.d(view));
        if (i == 0) {
            return false;
        }
        this.f2357b.d();
        this.f2357b.a(i);
        return this.f2357b.b();
    }
}
