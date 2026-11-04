package com.homwee.multiscreenshare;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.util.Log;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class MyApplication extends Application {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Context f4641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f4642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f4643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f4644e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static com.homwee.multiscreenshare.r.c f4645f;

    public static String a(String str, String str2) {
        try {
            if (f4645f == null) {
                String strF = f("/vendor/cusdata/config/dataIndex/dataIndex_*.ini".replace("*", g()));
                Log.i("MultiScreenShare Application", "CONFIG_FILE_PATH:" + strF);
                f4645f = new com.homwee.multiscreenshare.r.c(new File(strF));
            }
            String string = f4645f.a(str, str2).toString();
            Log.d("MultiScreenShare Application", str2 + " = " + string);
            return string;
        } catch (NullPointerException e2) {
            Log.d("MultiScreenShare Application", str + " - " + str2 + " read failed");
            e2.printStackTrace();
            return null;
        }
    }

    public static String b() {
        return f4642c;
    }

    public static Context c() {
        return f4641b;
    }

    public static String d() {
        return f4643d;
    }

    public static String f(String str) {
        String strReplace = ((String) new com.homwee.multiscreenshare.r.c(new File(str)).c().get("Misc").d().get("m_pCustomizationFunc_File")).replace("\"", "");
        f4644e = strReplace;
        return strReplace;
    }

    public static String g() {
        return ((String) new com.homwee.multiscreenshare.r.c(new File("/vendor/project_id/project_id.ini")).c().get("model").d().get("gProjectID")).replace("\"", "");
    }

    public boolean e() {
        return Build.BRAND.equals("KAJITO");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        f4641b = this;
        f4642c = Build.FINGERPRINT.split("/")[0];
        f4643d = Settings.Global.getString(getContentResolver(), "chcountry");
        com.homwee.multiscreenshare.r.e.d("brand:" + f4642c + ",country:" + f4643d);
    }
}
