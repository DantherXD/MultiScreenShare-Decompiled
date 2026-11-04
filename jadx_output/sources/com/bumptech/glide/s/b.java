package com.bumptech.glide.s;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.bumptech.glide.load.g;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ConcurrentMap<String, g> f3789a = new ConcurrentHashMap();

    private static PackageInfo a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e2);
            return null;
        }
    }

    private static String b(PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    public static g c(Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, g> concurrentMap = f3789a;
        g gVar = concurrentMap.get(packageName);
        if (gVar != null) {
            return gVar;
        }
        g gVarD = d(context);
        g gVarPutIfAbsent = concurrentMap.putIfAbsent(packageName, gVarD);
        return gVarPutIfAbsent == null ? gVarD : gVarPutIfAbsent;
    }

    private static g d(Context context) {
        return new d(b(a(context)));
    }
}
