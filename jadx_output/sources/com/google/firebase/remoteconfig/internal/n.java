package com.google.firebase.remoteconfig.internal;

import android.content.SharedPreferences;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Date f4608a = new Date(-1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Date f4609b = new Date(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SharedPreferences f4610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f4611d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f4612e = new Object();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f4613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f4614b;

        a(int i, Date date) {
            this.f4613a = i;
            this.f4614b = date;
        }

        Date a() {
            return this.f4614b;
        }

        int b() {
            return this.f4613a;
        }
    }

    public n(SharedPreferences sharedPreferences) {
        this.f4610c = sharedPreferences;
    }

    a a() {
        a aVar;
        synchronized (this.f4612e) {
            aVar = new a(this.f4610c.getInt("num_failed_fetches", 0), new Date(this.f4610c.getLong("backoff_end_time_in_millis", -1L)));
        }
        return aVar;
    }

    public long b() {
        return this.f4610c.getLong("fetch_timeout_in_seconds", 60L);
    }

    String c() {
        return this.f4610c.getString("last_fetch_etag", null);
    }

    Date d() {
        return new Date(this.f4610c.getLong("last_fetch_time_in_millis", -1L));
    }

    public long e() {
        return this.f4610c.getLong("minimum_fetch_interval_in_seconds", l.f4592a);
    }

    void f() {
        g(0, f4609b);
    }

    void g(int i, Date date) {
        synchronized (this.f4612e) {
            this.f4610c.edit().putInt("num_failed_fetches", i).putLong("backoff_end_time_in_millis", date.getTime()).apply();
        }
    }

    void h(String str) {
        synchronized (this.f4611d) {
            this.f4610c.edit().putString("last_fetch_etag", str).apply();
        }
    }

    void i() {
        synchronized (this.f4611d) {
            this.f4610c.edit().putInt("last_fetch_status", 1).apply();
        }
    }

    void j(Date date) {
        synchronized (this.f4611d) {
            this.f4610c.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
        }
    }

    void k() {
        synchronized (this.f4611d) {
            this.f4610c.edit().putInt("last_fetch_status", 2).apply();
        }
    }
}
