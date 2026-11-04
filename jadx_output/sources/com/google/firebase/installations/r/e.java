package com.google.firebase.installations.r;

import com.google.firebase.installations.o;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f4488a = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f4489b = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o f4490c = o.c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4492e;

    e() {
    }

    private synchronized long a(int i) {
        if (c(i)) {
            return (long) Math.min(Math.pow(2.0d, this.f4492e) + this.f4490c.e(), f4489b);
        }
        return f4488a;
    }

    private static boolean c(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    private static boolean d(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private synchronized void e() {
        this.f4492e = 0;
    }

    public synchronized boolean b() {
        return this.f4492e == 0 || this.f4490c.a() > this.f4491d;
    }

    public synchronized void f(int i) {
        if (d(i)) {
            e();
            return;
        }
        this.f4492e++;
        this.f4491d = this.f4490c.a() + a(i);
    }
}
