package a.g.l.f0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0024c f668a;

    private static final class a implements InterfaceC0024c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f669a;

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f669a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(Object obj) {
            this.f669a = (InputContentInfo) obj;
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public void a() {
            this.f669a.requestPermission();
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public Uri b() {
            return this.f669a.getLinkUri();
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public ClipDescription c() {
            return this.f669a.getDescription();
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public Object d() {
            return this.f669a;
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public Uri e() {
            return this.f669a.getContentUri();
        }
    }

    private static final class b implements InterfaceC0024c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f671b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f672c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f670a = uri;
            this.f671b = clipDescription;
            this.f672c = uri2;
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public void a() {
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public Uri b() {
            return this.f672c;
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public ClipDescription c() {
            return this.f671b;
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public Object d() {
            return null;
        }

        @Override // a.g.l.f0.c.InterfaceC0024c
        public Uri e() {
            return this.f670a;
        }
    }

    /* JADX INFO: renamed from: a.g.l.f0.c$c, reason: collision with other inner class name */
    private interface InterfaceC0024c {
        void a();

        Uri b();

        ClipDescription c();

        Object d();

        Uri e();
    }

    private c(InterfaceC0024c interfaceC0024c) {
        this.f668a = interfaceC0024c;
    }

    public c(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f668a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public static c f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f668a.e();
    }

    public ClipDescription b() {
        return this.f668a.c();
    }

    public Uri c() {
        return this.f668a.b();
    }

    public void d() {
        this.f668a.a();
    }

    public Object e() {
        return this.f668a.d();
    }
}
