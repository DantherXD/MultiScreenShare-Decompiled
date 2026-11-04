package com.homwee.multiscreenshare.r;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.homwee.multiscreenshare.MyApplication;
import com.homwee.multiscreenshare.bean.RemoteConfigBean;

/* JADX INFO: loaded from: classes.dex */
public class f {
    public static String a() {
        return MyApplication.c().getSharedPreferences("upgradeservice", 0).getString("remoteconfig", "");
    }

    public static RemoteConfigBean b() {
        String string = MyApplication.c().getSharedPreferences("upgradeservice", 0).getString("remoteconfig", "");
        e.b("getRemoteConfig=" + string);
        if (TextUtils.isEmpty(string)) {
            e.b("remoteConfig=null");
            return null;
        }
        RemoteConfigBean remoteConfigBean = (RemoteConfigBean) c.a.a.a.f(string, RemoteConfigBean.class);
        StringBuilder sb = new StringBuilder();
        sb.append("remoteConfigBean=");
        sb.append(remoteConfigBean == null ? "null" : remoteConfigBean.toString());
        e.b(sb.toString());
        return remoteConfigBean;
    }

    public static void c(String str) {
        SharedPreferences.Editor editorEdit = MyApplication.c().getSharedPreferences("upgradeservice", 0).edit();
        editorEdit.putString("remoteconfig", str);
        editorEdit.apply();
    }
}
