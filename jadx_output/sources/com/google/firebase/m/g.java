package com.google.firebase.m;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static g f4518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final SimpleDateFormat f4519b = new SimpleDateFormat("dd/MM/yyyy z");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f4520c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SharedPreferences f4521d;

    private g(Context context) {
        this.f4520c = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        this.f4521d = context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    static synchronized g a(Context context) {
        if (f4518a == null) {
            f4518a = new g(context);
        }
        return f4518a;
    }

    static boolean b(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f4519b;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    synchronized boolean c(long j) {
        return d("fire-global", j);
    }

    synchronized boolean d(String str, long j) {
        if (!this.f4520c.contains(str)) {
            this.f4520c.edit().putLong(str, j).apply();
            return true;
        }
        if (!b(this.f4520c.getLong(str, -1L), j)) {
            return false;
        }
        this.f4520c.edit().putLong(str, j).apply();
        return true;
    }
}
