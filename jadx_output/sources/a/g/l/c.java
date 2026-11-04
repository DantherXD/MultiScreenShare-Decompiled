package a.g.l;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final ClipData f612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Uri f615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Bundle f616e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f621e;

        public a(ClipData clipData, int i) {
            this.f617a = clipData;
            this.f618b = i;
        }

        public c a() {
            return new c(this);
        }

        public a b(Bundle bundle) {
            this.f621e = bundle;
            return this;
        }

        public a c(int i) {
            this.f619c = i;
            return this;
        }

        public a d(Uri uri) {
            this.f620d = uri;
            return this;
        }
    }

    c(a aVar) {
        this.f612a = (ClipData) a.g.k.h.e(aVar.f617a);
        this.f613b = a.g.k.h.b(aVar.f618b, 0, 3, "source");
        this.f614c = a.g.k.h.d(aVar.f619c, 1);
        this.f615d = aVar.f620d;
        this.f616e = aVar.f621e;
    }

    static String a(int i) {
        return (i & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i);
    }

    static String e(int i) {
        if (i == 0) {
            return "SOURCE_APP";
        }
        if (i == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i != 2) {
            return i != 3 ? String.valueOf(i) : "SOURCE_DRAG_AND_DROP";
        }
        return "SOURCE_INPUT_METHOD";
    }

    public ClipData b() {
        return this.f612a;
    }

    public int c() {
        return this.f614c;
    }

    public int d() {
        return this.f613b;
    }

    public String toString() {
        return "ContentInfoCompat{clip=" + this.f612a + ", source=" + e(this.f613b) + ", flags=" + a(this.f614c) + ", linkUri=" + this.f615d + ", extras=" + this.f616e + "}";
    }
}
