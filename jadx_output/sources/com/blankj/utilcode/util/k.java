package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static Application f3033a;

    public static class a {
        public void a(Activity activity) {
        }

        public void b(Activity activity) {
        }

        public void c(Activity activity) {
        }

        public void d(Activity activity) {
        }

        public void e(Activity activity) {
        }

        public void f(Activity activity) {
        }

        public void g(Activity activity, androidx.lifecycle.d.b bVar) {
        }
    }

    public interface b<T> {
        void a(T t);
    }

    public interface c {
        void a(Activity activity);

        void b(Activity activity);
    }

    public static Application a() {
        Application application = f3033a;
        if (application != null) {
            return application;
        }
        b(m.d());
        Objects.requireNonNull(f3033a, "reflect failed.");
        Log.i("Utils", m.e() + " reflect app success.");
        return f3033a;
    }

    public static void b(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = f3033a;
        if (application2 == null) {
            f3033a = application;
            m.h(application);
            m.i();
        } else {
            if (application2.equals(application)) {
                return;
            }
            m.l(f3033a);
            f3033a = application;
            m.h(application);
        }
    }
}
