package com.blankj.utilcode.util;

import android.app.Activity;
import android.app.Application;
import android.app.Notification;

/* JADX INFO: loaded from: classes.dex */
class m {
    static int a(float f2) {
        return i.a(f2);
    }

    static void b(Activity activity) {
        c.a(activity);
    }

    static int c() {
        return h.a();
    }

    static Application d() {
        return l.f3034b.f();
    }

    static String e() {
        return f.a();
    }

    static Notification f(e.a aVar, k.b<androidx.core.app.f.c> bVar) {
        return e.a(aVar, bVar);
    }

    static g g() {
        return g.a("Utils");
    }

    static void h(Application application) {
        l.f3034b.g(application);
    }

    static void i() {
        j(a.f());
    }

    private static void j(Runnable... runnableArr) {
        for (Runnable runnable : runnableArr) {
            j.b().execute(runnable);
        }
    }

    static void k(Runnable runnable, long j) {
        j.e(runnable, j);
    }

    static void l(Application application) {
        l.f3034b.l(application);
    }
}
