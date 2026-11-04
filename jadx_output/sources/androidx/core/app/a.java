package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public class a extends a.g.d.a {

    /* JADX INFO: renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    class RunnableC0047a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f1692b;

        RunnableC0047a(Activity activity) {
            this.f1692b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1692b.isFinishing() || b.i(this.f1692b)) {
                return;
            }
            this.f1692b.recreate();
        }
    }

    public static void i(Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void j(Activity activity) {
        int i = Build.VERSION.SDK_INT;
        if (i < 28) {
            if (i <= 23) {
                new Handler(activity.getMainLooper()).post(new RunnableC0047a(activity));
                return;
            } else if (b.i(activity)) {
                return;
            }
        }
        activity.recreate();
    }
}
