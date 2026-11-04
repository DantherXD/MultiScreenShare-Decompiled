package a.m.a;

import a.d.h;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: loaded from: classes.dex */
class b extends a.m.a.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f781a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f783c;

    public static class a<D> extends l<D> {
        private final int l;
        private final Bundle m;
        private final a.m.b.a<D> n;
        private g o;
        private C0031b<D> p;
        private a.m.b.a<D> q;

        @Override // androidx.lifecycle.LiveData
        protected void h() {
            if (b.f781a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void i() {
            if (b.f781a) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void k(m<? super D> mVar) {
            super.k(mVar);
            this.o = null;
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void l(D d2) {
            super.l(d2);
            if (this.q != null) {
                throw null;
            }
        }

        a.m.b.a<D> m(boolean z) {
            if (b.f781a) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void n(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.l);
            printWriter.print(" mArgs=");
            printWriter.println(this.m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.n);
            String str2 = str + "  ";
            throw null;
        }

        void o() {
            g gVar = this.o;
            C0031b<D> c0031b = this.p;
            if (gVar == null || c0031b == null) {
                return;
            }
            super.k(c0031b);
            f(gVar, c0031b);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.l);
            sb.append(" : ");
            a.g.k.b.a(this.n, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: a.m.a.b$b, reason: collision with other inner class name */
    static class C0031b<D> implements m<D> {
    }

    static class c extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final q.a f784c = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private h<a> f785d = new h<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f786e = false;

        static class a implements q.a {
            a() {
            }

            @Override // androidx.lifecycle.q.a
            public <T extends p> T a(Class<T> cls) {
                return new c();
            }
        }

        c() {
        }

        static c f(r rVar) {
            return (c) new q(rVar, f784c).a(c.class);
        }

        @Override // androidx.lifecycle.p
        protected void d() {
            super.d();
            int iJ = this.f785d.j();
            for (int i = 0; i < iJ; i++) {
                this.f785d.k(i).m(true);
            }
            this.f785d.b();
        }

        public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f785d.j() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i = 0; i < this.f785d.j(); i++) {
                    a aVarK = this.f785d.k(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f785d.h(i));
                    printWriter.print(": ");
                    printWriter.println(aVarK.toString());
                    aVarK.n(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void g() {
            int iJ = this.f785d.j();
            for (int i = 0; i < iJ; i++) {
                this.f785d.k(i).o();
            }
        }
    }

    b(g gVar, r rVar) {
        this.f782b = gVar;
        this.f783c = c.f(rVar);
    }

    @Override // a.m.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f783c.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // a.m.a.a
    public void c() {
        this.f783c.g();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        a.g.k.b.a(this.f782b, sb);
        sb.append("}}");
        return sb.toString();
    }
}
