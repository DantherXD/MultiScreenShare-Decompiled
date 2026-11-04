package a.g.i;

import a.g.k.h;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f542b;

        @Deprecated
        public a(int i, b[] bVarArr) {
            this.f541a = i;
            this.f542b = bVarArr;
        }

        static a a(int i, b[] bVarArr) {
            return new a(i, bVarArr);
        }

        public b[] b() {
            return this.f542b;
        }

        public int c() {
            return this.f541a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f544b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f545c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f546d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f547e;

        @Deprecated
        public b(Uri uri, int i, int i2, boolean z, int i3) {
            this.f543a = (Uri) h.e(uri);
            this.f544b = i;
            this.f545c = i2;
            this.f546d = z;
            this.f547e = i3;
        }

        static b a(Uri uri, int i, int i2, boolean z, int i3) {
            return new b(uri, i, i2, z, i3);
        }

        public int b() {
            return this.f547e;
        }

        public int c() {
            return this.f544b;
        }

        public Uri d() {
            return this.f543a;
        }

        public int e() {
            return this.f545c;
        }

        public boolean f() {
            return this.f546d;
        }
    }

    public static class c {
        public void a(int i) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, d dVar, int i, boolean z, int i2, Handler handler, c cVar) {
        a.g.i.a aVar = new a.g.i.a(cVar, handler);
        return z ? e.e(context, dVar, aVar, i, i2) : e.d(context, dVar, i, null, aVar);
    }
}
