package com.google.android.gms.common.util;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f3835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f3836b;

    @Nullable
    public static String a() {
        if (f3835a == null) {
            if (f3836b == 0) {
                f3836b = Process.myPid();
            }
            f3835a = b(f3836b);
        }
        return f3835a;
    }

    @Nullable
    private static String b(int i) throws Throwable {
        Throwable th;
        BufferedReader bufferedReaderC;
        String strTrim = null;
        if (i <= 0) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder(25);
            sb.append("/proc/");
            sb.append(i);
            sb.append("/cmdline");
            bufferedReaderC = c(sb.toString());
            try {
                strTrim = bufferedReaderC.readLine().trim();
            } catch (IOException unused) {
            } catch (Throwable th2) {
                th = th2;
                g.a(bufferedReaderC);
                throw th;
            }
        } catch (IOException unused2) {
            bufferedReaderC = null;
        } catch (Throwable th3) {
            th = th3;
            bufferedReaderC = null;
        }
        g.a(bufferedReaderC);
        return strTrim;
    }

    private static BufferedReader c(String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return new BufferedReader(new FileReader(str));
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }
}
