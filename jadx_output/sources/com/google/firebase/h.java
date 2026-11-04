package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.j;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4394f;
    private final String g;

    private h(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        com.google.android.gms.common.internal.b.f(!j.a(str), "ApplicationId must be set.");
        this.f4390b = str;
        this.f4389a = str2;
        this.f4391c = str3;
        this.f4392d = str4;
        this.f4393e = str5;
        this.f4394f = str6;
        this.g = str7;
    }

    public static h a(Context context) {
        com.google.android.gms.common.internal.c cVar = new com.google.android.gms.common.internal.c(context);
        String strA = cVar.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new h(strA, cVar.a("google_api_key"), cVar.a("firebase_database_url"), cVar.a("ga_trackingId"), cVar.a("gcm_defaultSenderId"), cVar.a("google_storage_bucket"), cVar.a("project_id"));
    }

    public String b() {
        return this.f4389a;
    }

    public String c() {
        return this.f4390b;
    }

    public String d() {
        return this.f4393e;
    }

    public String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return com.google.android.gms.common.internal.a.a(this.f4390b, hVar.f4390b) && com.google.android.gms.common.internal.a.a(this.f4389a, hVar.f4389a) && com.google.android.gms.common.internal.a.a(this.f4391c, hVar.f4391c) && com.google.android.gms.common.internal.a.a(this.f4392d, hVar.f4392d) && com.google.android.gms.common.internal.a.a(this.f4393e, hVar.f4393e) && com.google.android.gms.common.internal.a.a(this.f4394f, hVar.f4394f) && com.google.android.gms.common.internal.a.a(this.g, hVar.g);
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.a.b(this.f4390b, this.f4389a, this.f4391c, this.f4392d, this.f4393e, this.f4394f, this.g);
    }

    public String toString() {
        return com.google.android.gms.common.internal.a.c(this).a("applicationId", this.f4390b).a("apiKey", this.f4389a).a("databaseUrl", this.f4391c).a("gcmSenderId", this.f4393e).a("storageBucket", this.f4394f).a("projectId", this.g).toString();
    }
}
