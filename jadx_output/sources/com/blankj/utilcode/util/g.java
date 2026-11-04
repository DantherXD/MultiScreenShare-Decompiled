package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ApplySharedPref"})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, g> f3016a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SharedPreferences f3017b;

    private g(String str, int i) {
        this.f3017b = k.a().getSharedPreferences(str, i);
    }

    public static g a(String str) {
        return b(str, 0);
    }

    public static g b(String str, int i) {
        if (e(str)) {
            str = "spUtils";
        }
        Map<String, g> map = f3016a;
        g gVar = map.get(str);
        if (gVar == null) {
            synchronized (g.class) {
                gVar = map.get(str);
                if (gVar == null) {
                    gVar = new g(str, i);
                    map.put(str, gVar);
                }
            }
        }
        return gVar;
    }

    private static boolean e(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public String c(String str) {
        return d(str, "");
    }

    public String d(String str, String str2) {
        return this.f3017b.getString(str, str2);
    }

    public void f(String str) {
        g(str, false);
    }

    public void g(String str, boolean z) {
        SharedPreferences.Editor editorRemove = this.f3017b.edit().remove(str);
        if (z) {
            editorRemove.commit();
        } else {
            editorRemove.apply();
        }
    }
}
