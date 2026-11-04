package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f4437a = TimeUnit.HOURS.toSeconds(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f4438b = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static o f4439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.installations.s.a f4440d;

    private o(com.google.firebase.installations.s.a aVar) {
        this.f4440d = aVar;
    }

    public static o c() {
        return d(com.google.firebase.installations.s.b.b());
    }

    public static o d(com.google.firebase.installations.s.a aVar) {
        if (f4439c == null) {
            f4439c = new o(aVar);
        }
        return f4439c;
    }

    static boolean g(String str) {
        return f4438b.matcher(str).matches();
    }

    static boolean h(String str) {
        return str.contains(":");
    }

    public long a() {
        return this.f4440d.a();
    }

    public long b() {
        return TimeUnit.MILLISECONDS.toSeconds(a());
    }

    public long e() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean f(com.google.firebase.installations.q.d dVar) {
        return TextUtils.isEmpty(dVar.b()) || dVar.h() + dVar.c() < b() + f4437a;
    }
}
