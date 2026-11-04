package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Bundle f1712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private IconCompat f1713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j[] f1714c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j[] f1715d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f1717f;
        private final int g;
        private final boolean h;

        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.f1716e;
        }

        public j[] c() {
            return this.f1715d;
        }

        public Bundle d() {
            return this.f1712a;
        }

        public IconCompat e() {
            int i;
            if (this.f1713b == null && (i = this.i) != 0) {
                this.f1713b = IconCompat.b(null, "", i);
            }
            return this.f1713b;
        }

        public j[] f() {
            return this.f1714c;
        }

        public int g() {
            return this.g;
        }

        public boolean h() {
            return this.f1717f;
        }

        public CharSequence i() {
            return this.j;
        }

        public boolean j() {
            return this.h;
        }
    }

    public static final class b {

        private static class a {
            static Notification.BubbleMetadata a(b bVar) {
                if (bVar == null) {
                    return null;
                }
                throw null;
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.f$b$b, reason: collision with other inner class name */
        private static class C0049b {
            static Notification.BubbleMetadata a(b bVar) {
                if (bVar == null) {
                    return null;
                }
                throw null;
            }
        }

        public static Notification.BubbleMetadata a(b bVar) {
            if (bVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return C0049b.a(bVar);
            }
            if (i == 29) {
                return a.a(bVar);
            }
            return null;
        }
    }

    public static class c {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        a.g.d.c N;
        long O;
        int P;
        boolean Q;
        b R;
        Notification S;
        boolean T;
        Icon U;

        @Deprecated
        public ArrayList<String> V;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f1718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList<a> f1719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ArrayList<i> f1720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<a> f1721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        CharSequence f1722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f1723f;
        PendingIntent g;
        PendingIntent h;
        RemoteViews i;
        Bitmap j;
        CharSequence k;
        int l;
        int m;
        boolean n;
        boolean o;
        d p;
        CharSequence q;
        CharSequence r;
        CharSequence[] s;
        int t;
        int u;
        boolean v;
        String w;
        boolean x;
        String y;
        boolean z;

        @Deprecated
        public c(Context context) {
            this(context, null);
        }

        public c(Context context, String str) {
            this.f1719b = new ArrayList<>();
            this.f1720c = new ArrayList<>();
            this.f1721d = new ArrayList<>();
            this.n = true;
            this.z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.P = 0;
            Notification notification = new Notification();
            this.S = notification;
            this.f1718a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.S.audioStreamType = -1;
            this.m = 0;
            this.V = new ArrayList<>();
            this.Q = true;
        }

        public Notification a() {
            return new g(this).b();
        }

        public Bundle b() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public c c(String str) {
            this.K = str;
            return this;
        }
    }

    public static abstract class d {
    }

    public static Bundle a(Notification notification) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return h.c(notification);
        }
        return null;
    }
}
