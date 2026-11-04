package com.google.firebase.o;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import com.google.firebase.l.c;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f4523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f4524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4525d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f4522a = contextA;
        this.f4523b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f4524c = cVar;
        this.f4525d = b();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : a.g.d.a.b(context);
    }

    private boolean b() {
        return this.f4523b.contains("firebase_data_collection_default_enabled") ? this.f4523b.getBoolean("firebase_data_collection_default_enabled", true) : c();
    }

    private boolean c() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f4522a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f4522a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
