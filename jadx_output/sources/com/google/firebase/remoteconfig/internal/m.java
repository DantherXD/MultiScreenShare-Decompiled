package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONException;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4602a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Pattern f4603b = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Pattern f4604c = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set<com.google.android.gms.common.util.c<String, k>> f4605d = new HashSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f4606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final j f4607f;
    private final j g;

    public m(Executor executor, j jVar, j jVar2) {
        this.f4606e = executor;
        this.f4607f = jVar;
        this.g = jVar2;
    }

    private void b(final String str, final k kVar) {
        if (kVar == null) {
            return;
        }
        synchronized (this.f4605d) {
            for (final com.google.android.gms.common.util.c<String, k> cVar : this.f4605d) {
                this.f4606e.execute(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.a(str, kVar);
                    }
                });
            }
        }
    }

    private static k c(j jVar) {
        return jVar.d();
    }

    private static String e(j jVar, String str) {
        k kVarC = c(jVar);
        if (kVarC == null) {
            return null;
        }
        try {
            return kVarC.d().getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    private static void g(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", str2, str));
    }

    public void a(com.google.android.gms.common.util.c<String, k> cVar) {
        synchronized (this.f4605d) {
            this.f4605d.add(cVar);
        }
    }

    public String d(String str) {
        String strE = e(this.f4607f, str);
        if (strE != null) {
            b(str, c(this.f4607f));
            return strE;
        }
        String strE2 = e(this.g, str);
        if (strE2 != null) {
            return strE2;
        }
        g(str, "String");
        return "";
    }
}
