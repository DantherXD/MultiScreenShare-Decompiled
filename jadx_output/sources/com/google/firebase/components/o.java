package com.google.firebase.components;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f4348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<T> f4349b;

    private static class b implements c<Context> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f4350a;

        private b(Class<? extends Service> cls) {
            this.f4350a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f4350a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f4350a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // com.google.firebase.components.o.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c<T> {
        List<String> a(T t);
    }

    o(T t, c<T> cVar) {
        this.f4348a = t;
        this.f4349b = cVar;
    }

    public static o<Context> b(Context context, Class<? extends Service> cls) {
        return new o<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static q c(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (q.class.isAssignableFrom(cls)) {
                return (q) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new x(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e2) {
            throw new x(String.format("Could not instantiate %s.", str), e2);
        } catch (InstantiationException e3) {
            throw new x(String.format("Could not instantiate %s.", str), e3);
        } catch (NoSuchMethodException e4) {
            throw new x(String.format("Could not instantiate %s", str), e4);
        } catch (InvocationTargetException e5) {
            throw new x(String.format("Could not instantiate %s", str), e5);
        }
    }

    public List<com.google.firebase.n.b<q>> a() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f4349b.a(this.f4348a)) {
            arrayList.add(new com.google.firebase.n.b() { // from class: com.google.firebase.components.c
                @Override // com.google.firebase.n.b
                public final Object a() {
                    return o.c(str);
                }
            });
        }
        return arrayList;
    }
}
