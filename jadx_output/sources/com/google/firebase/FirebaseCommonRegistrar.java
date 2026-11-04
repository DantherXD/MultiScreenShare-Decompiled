package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.components.m;
import com.google.firebase.components.q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements q {
    static /* synthetic */ String a(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    static /* synthetic */ String b(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    static /* synthetic */ String c(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return "auto";
    }

    static /* synthetic */ String d(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? e(installerPackageName) : "";
    }

    private static String e(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.q
    public List<m<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.firebase.p.d.b());
        arrayList.add(com.google.firebase.m.d.b());
        arrayList.add(com.google.firebase.p.h.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(com.google.firebase.p.h.a("fire-core", "20.0.0"));
        arrayList.add(com.google.firebase.p.h.a("device-name", e(Build.PRODUCT)));
        arrayList.add(com.google.firebase.p.h.a("device-model", e(Build.DEVICE)));
        arrayList.add(com.google.firebase.p.h.a("device-brand", e(Build.BRAND)));
        arrayList.add(com.google.firebase.p.h.b("android-target-sdk", new com.google.firebase.p.h.a() { // from class: com.google.firebase.c
            @Override // com.google.firebase.p.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.a((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.p.h.b("android-min-sdk", new com.google.firebase.p.h.a() { // from class: com.google.firebase.d
            @Override // com.google.firebase.p.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.b((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.p.h.b("android-platform", new com.google.firebase.p.h.a() { // from class: com.google.firebase.e
            @Override // com.google.firebase.p.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.c((Context) obj);
            }
        }));
        arrayList.add(com.google.firebase.p.h.b("android-installer", new com.google.firebase.p.h.a() { // from class: com.google.firebase.b
            @Override // com.google.firebase.p.h.a
            public final String a(Object obj) {
                return FirebaseCommonRegistrar.d((Context) obj);
            }
        }));
        String strA = com.google.firebase.p.f.a();
        if (strA != null) {
            arrayList.add(com.google.firebase.p.h.a("kotlin", strA));
        }
        return arrayList;
    }
}
