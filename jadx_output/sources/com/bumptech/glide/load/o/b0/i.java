package com.bumptech.glide.load.o.b0;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f3230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3231d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final int f3232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f3233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ActivityManager f3234c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c f3235d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f3237f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f3236e = 2.0f;
        float g = 0.4f;
        float h = 0.33f;
        int i = 4194304;

        static {
            f3232a = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f3237f = f3232a;
            this.f3233b = context;
            this.f3234c = (ActivityManager) context.getSystemService("activity");
            this.f3235d = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f3234c)) {
                return;
            }
            this.f3237f = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f3238a;

        b(DisplayMetrics displayMetrics) {
            this.f3238a = displayMetrics;
        }

        @Override // com.bumptech.glide.load.o.b0.i.c
        public int a() {
            return this.f3238a.heightPixels;
        }

        @Override // com.bumptech.glide.load.o.b0.i.c
        public int b() {
            return this.f3238a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f3230c = aVar.f3233b;
        int i = e(aVar.f3234c) ? aVar.i / 2 : aVar.i;
        this.f3231d = i;
        int iC = c(aVar.f3234c, aVar.g, aVar.h);
        float fB = aVar.f3235d.b() * aVar.f3235d.a() * 4;
        int iRound = Math.round(aVar.f3237f * fB);
        int iRound2 = Math.round(fB * aVar.f3236e);
        int i2 = iC - i;
        int i3 = iRound2 + iRound;
        if (i3 <= i2) {
            this.f3229b = iRound2;
            this.f3228a = iRound;
        } else {
            float f2 = i2;
            float f3 = aVar.f3237f;
            float f4 = aVar.f3236e;
            float f5 = f2 / (f3 + f4);
            this.f3229b = Math.round(f4 * f5);
            this.f3228a = Math.round(f5 * aVar.f3237f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Calculation complete, Calculated memory cache size: ");
            sb.append(f(this.f3229b));
            sb.append(", pool size: ");
            sb.append(f(this.f3228a));
            sb.append(", byte array size: ");
            sb.append(f(i));
            sb.append(", memory class limited? ");
            sb.append(i3 > iC);
            sb.append(", max size: ");
            sb.append(f(iC));
            sb.append(", memoryClass: ");
            sb.append(aVar.f3234c.getMemoryClass());
            sb.append(", isLowMemoryDevice: ");
            sb.append(e(aVar.f3234c));
            Log.d("MemorySizeCalculator", sb.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f2, float f3) {
        float memoryClass = activityManager.getMemoryClass() * 1024 * 1024;
        if (e(activityManager)) {
            f2 = f3;
        }
        return Math.round(memoryClass * f2);
    }

    @TargetApi(19)
    static boolean e(ActivityManager activityManager) {
        if (Build.VERSION.SDK_INT >= 19) {
            return activityManager.isLowRamDevice();
        }
        return true;
    }

    private String f(int i) {
        return Formatter.formatFileSize(this.f3230c, i);
    }

    public int a() {
        return this.f3231d;
    }

    public int b() {
        return this.f3228a;
    }

    public int d() {
        return this.f3229b;
    }
}
