package a.a.n;

import a.g.l.a0;
import a.g.l.b0;
import a.g.l.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Interpolator f120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    a0 f121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f122e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f119b = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final b0 f123f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ArrayList<z> f118a = new ArrayList<>();

    class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f124a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f125b = 0;

        a() {
        }

        @Override // a.g.l.a0
        public void a(View view) {
            int i = this.f125b + 1;
            this.f125b = i;
            if (i == h.this.f118a.size()) {
                a0 a0Var = h.this.f121d;
                if (a0Var != null) {
                    a0Var.a(null);
                }
                d();
            }
        }

        @Override // a.g.l.b0, a.g.l.a0
        public void b(View view) {
            if (this.f124a) {
                return;
            }
            this.f124a = true;
            a0 a0Var = h.this.f121d;
            if (a0Var != null) {
                a0Var.b(null);
            }
        }

        void d() {
            this.f125b = 0;
            this.f124a = false;
            h.this.b();
        }
    }

    public void a() {
        if (this.f122e) {
            Iterator<z> it = this.f118a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f122e = false;
        }
    }

    void b() {
        this.f122e = false;
    }

    public h c(z zVar) {
        if (!this.f122e) {
            this.f118a.add(zVar);
        }
        return this;
    }

    public h d(z zVar, z zVar2) {
        this.f118a.add(zVar);
        zVar2.h(zVar.c());
        this.f118a.add(zVar2);
        return this;
    }

    public h e(long j) {
        if (!this.f122e) {
            this.f119b = j;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f122e) {
            this.f120c = interpolator;
        }
        return this;
    }

    public h g(a0 a0Var) {
        if (!this.f122e) {
            this.f121d = a0Var;
        }
        return this;
    }

    public void h() {
        if (this.f122e) {
            return;
        }
        for (z zVar : this.f118a) {
            long j = this.f119b;
            if (j >= 0) {
                zVar.d(j);
            }
            Interpolator interpolator = this.f120c;
            if (interpolator != null) {
                zVar.e(interpolator);
            }
            if (this.f121d != null) {
                zVar.f(this.f123f);
            }
            zVar.j();
        }
        this.f122e = true;
    }
}
