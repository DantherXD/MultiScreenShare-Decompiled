package com.bumptech.glide.load.q.d;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final File f3564a = new File("/proc/self/fd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile r f3565b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f3567d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3568e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f3569f;
    private boolean g = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f3566c = d();

    r() {
        int i;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f3567d = 20000;
            i = 0;
        } else {
            this.f3567d = 700;
            i = 128;
        }
        this.f3568e = i;
    }

    public static r a() {
        if (f3565b == null) {
            synchronized (r.class) {
                if (f3565b == null) {
                    f3565b = new r();
                }
            }
        }
        return f3565b;
    }

    private synchronized boolean b() {
        boolean z = true;
        int i = this.f3569f + 1;
        this.f3569f = i;
        if (i >= 50) {
            this.f3569f = 0;
            int length = f3564a.list().length;
            if (length >= this.f3567d) {
                z = false;
            }
            this.g = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f3567d);
            }
        }
        return this.g;
    }

    private static boolean d() {
        String str = Build.MODEL;
        if (str == null || str.length() < 7) {
            return true;
        }
        String strSubstring = str.substring(0, 7);
        strSubstring.hashCode();
        switch (strSubstring) {
            case "SM-A520":
            case "SM-G930":
            case "SM-G935":
            case "SM-G960":
            case "SM-G965":
            case "SM-J720":
            case "SM-N935":
                return Build.VERSION.SDK_INT != 26;
            default:
                return true;
        }
    }

    public boolean c(int i, int i2, boolean z, boolean z2) {
        int i3;
        return z && this.f3566c && Build.VERSION.SDK_INT >= 26 && !z2 && i >= (i3 = this.f3568e) && i2 >= i3 && b();
    }

    @TargetApi(26)
    boolean e(int i, int i2, BitmapFactory.Options options, boolean z, boolean z2) {
        boolean zC = c(i, i2, z, z2);
        if (zC) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zC;
    }
}
