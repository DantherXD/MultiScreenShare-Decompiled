package com.google.firebase.i;

import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f4395a = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final DateFormat f4396b = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Date f4400f;
    private final long g;
    private final long h;

    public b(String str, String str2, String str3, Date date, long j, long j2) {
        this.f4397c = str;
        this.f4398d = str2;
        this.f4399e = str3;
        this.f4400f = date;
        this.g = j;
        this.h = j2;
    }

    static b a(Map<String, String> map) throws a {
        e(map);
        try {
            return new b(map.get("experimentId"), map.get("variantId"), map.containsKey("triggerEvent") ? map.get("triggerEvent") : "", f4396b.parse(map.get("experimentStartTime")), Long.parseLong(map.get("triggerTimeoutMillis")), Long.parseLong(map.get("timeToLiveMillis")));
        } catch (NumberFormatException e2) {
            throw new a("Could not process experiment: one of the durations could not be converted into a long.", e2);
        } catch (ParseException e3) {
            throw new a("Could not process experiment: parsing experiment start time failed.", e3);
        }
    }

    private static void e(Map<String, String> map) throws a {
        ArrayList arrayList = new ArrayList();
        for (String str : f4395a) {
            if (!map.containsKey(str)) {
                arrayList.add(str);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList));
        }
    }

    String b() {
        return this.f4397c;
    }

    long c() {
        return this.f4400f.getTime();
    }

    com.google.firebase.j.a.a.C0108a d(String str) {
        com.google.firebase.j.a.a.C0108a c0108a = new com.google.firebase.j.a.a.C0108a();
        c0108a.f4498a = str;
        c0108a.g = c();
        c0108a.f4499b = this.f4397c;
        c0108a.f4500c = this.f4398d;
        c0108a.f4501d = TextUtils.isEmpty(this.f4399e) ? null : this.f4399e;
        c0108a.f4502e = this.g;
        c0108a.f4503f = this.h;
        return c0108a;
    }
}
