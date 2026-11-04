package a.g.i;

import android.graphics.Typeface;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f.c f510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f511b;

    /* JADX INFO: renamed from: a.g.i.a$a, reason: collision with other inner class name */
    class RunnableC0012a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f513c;

        RunnableC0012a(f.c cVar, Typeface typeface) {
            this.f512b = cVar;
            this.f513c = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f512b.b(this.f513c);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f.c f515b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f516c;

        b(f.c cVar, int i) {
            this.f515b = cVar;
            this.f516c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f515b.a(this.f516c);
        }
    }

    a(f.c cVar, Handler handler) {
        this.f510a = cVar;
        this.f511b = handler;
    }

    private void a(int i) {
        this.f511b.post(new b(this.f510a, i));
    }

    private void c(Typeface typeface) {
        this.f511b.post(new RunnableC0012a(this.f510a, typeface));
    }

    void b(e.C0013e c0013e) {
        if (c0013e.a()) {
            c(c0013e.f539a);
        } else {
            a(c0013e.f540b);
        }
    }
}
