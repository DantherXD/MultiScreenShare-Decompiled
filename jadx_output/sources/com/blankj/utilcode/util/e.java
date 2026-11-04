package com.blankj.utilcode.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class e {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3014a = new a(k.a().getPackageName(), k.a().getPackageName(), 3);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private NotificationChannel f3015b;

        public a(String str, CharSequence charSequence, int i) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f3015b = new NotificationChannel(str, charSequence, i);
            }
        }

        public NotificationChannel b() {
            return this.f3015b;
        }
    }

    public static Notification a(a aVar, k.b<androidx.core.app.f.c> bVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            ((NotificationManager) k.a().getSystemService("notification")).createNotificationChannel(aVar.b());
        }
        androidx.core.app.f.c cVar = new androidx.core.app.f.c(k.a());
        if (i >= 26) {
            cVar.c(aVar.f3015b.getId());
        }
        if (bVar != null) {
            bVar.a(cVar);
        }
        return cVar.a();
    }
}
