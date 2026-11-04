package com.blankj.utilcode.util;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static List<Field> f3013a;

    /* JADX INFO: renamed from: com.blankj.utilcode.util.a$a, reason: collision with other inner class name */
    class RunnableC0066a implements Runnable {
        RunnableC0066a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.g();
        }
    }

    private static void b(Resources resources, float f2) {
        resources.getDisplayMetrics().xdpi = f2;
        k.a().getResources().getDisplayMetrics().xdpi = f2;
        d(resources, f2);
    }

    private static void c(Resources resources, float f2) {
        Iterator<Field> it = f3013a.iterator();
        while (it.hasNext()) {
            try {
                DisplayMetrics displayMetrics = (DisplayMetrics) it.next().get(resources);
                if (displayMetrics != null) {
                    displayMetrics.xdpi = f2;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static void d(Resources resources, float f2) {
        if (f3013a != null) {
            c(resources, f2);
            return;
        }
        f3013a = new ArrayList();
        Class<?> superclass = resources.getClass();
        do {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields == null || declaredFields.length <= 0) {
                return;
            }
            for (Field field : declaredFields) {
                if (field.getType().isAssignableFrom(DisplayMetrics.class)) {
                    field.setAccessible(true);
                    DisplayMetrics displayMetricsE = e(resources, field);
                    if (displayMetricsE != null) {
                        f3013a.add(field);
                        displayMetricsE.xdpi = f2;
                    }
                }
            }
            superclass = superclass.getSuperclass();
        } while (superclass != null);
    }

    private static DisplayMetrics e(Resources resources, Field field) {
        try {
            return (DisplayMetrics) field.get(resources);
        } catch (Exception unused) {
            return null;
        }
    }

    static Runnable f() {
        return new RunnableC0066a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g() {
        b(Resources.getSystem(), Resources.getSystem().getDisplayMetrics().xdpi);
    }
}
