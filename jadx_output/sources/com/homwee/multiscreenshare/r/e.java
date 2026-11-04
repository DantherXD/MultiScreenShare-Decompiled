package com.homwee.multiscreenshare.r;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f4678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f4679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f4680c;

    private static String a(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("==");
        stringBuffer.append("(");
        stringBuffer.append(f4678a);
        stringBuffer.append(":");
        stringBuffer.append(f4680c);
        stringBuffer.append(")==:");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static void b(String str) {
        c(new Throwable().getStackTrace());
        Log.d("MultiScreenShare", a(str));
    }

    private static void c(StackTraceElement[] stackTraceElementArr) {
        f4678a = stackTraceElementArr[1].getFileName();
        f4679b = stackTraceElementArr[1].getMethodName();
        f4680c = stackTraceElementArr[1].getLineNumber();
    }

    public static void d(String str) {
        c(new Throwable().getStackTrace());
        Log.i("MultiScreenShare", a(str));
    }
}
