package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.n.b<com.google.firebase.j.a.a> f4618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, String> f4619b = Collections.synchronizedMap(new HashMap());

    public p(com.google.firebase.n.b<com.google.firebase.j.a.a> bVar) {
        this.f4618a = bVar;
    }

    public void a(String str, k kVar) {
        JSONObject jSONObjectOptJSONObject;
        com.google.firebase.j.a.a aVarA = this.f4618a.a();
        if (aVarA == null) {
            return;
        }
        JSONObject jSONObjectF = kVar.f();
        if (jSONObjectF.length() < 1) {
            return;
        }
        JSONObject jSONObjectD = kVar.d();
        if (jSONObjectD.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectF.optJSONObject(str)) != null) {
            String strOptString = jSONObjectOptJSONObject.optString("choiceId");
            if (strOptString.isEmpty()) {
                return;
            }
            synchronized (this.f4619b) {
                if (strOptString.equals(this.f4619b.get(str))) {
                    return;
                }
                this.f4619b.put(str, strOptString);
                Bundle bundle = new Bundle();
                bundle.putString("arm_key", str);
                bundle.putString("arm_value", jSONObjectD.optString(str));
                bundle.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                bundle.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                bundle.putString("group", jSONObjectOptJSONObject.optString("group"));
                aVarA.e("fp", "personalization_assignment", bundle);
                Bundle bundle2 = new Bundle();
                bundle2.putString("_fpid", strOptString);
                aVarA.e("fp", "_fpc", bundle2);
            }
        }
    }
}
