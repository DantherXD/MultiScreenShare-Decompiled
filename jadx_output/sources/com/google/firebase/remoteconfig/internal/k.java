package com.google.firebase.remoteconfig.internal;

import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Date f4582a = new Date(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f4583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private JSONObject f4584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Date f4585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONArray f4586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f4587f;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f4588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Date f4589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private JSONArray f4590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f4591d;

        private b() {
            this.f4588a = new JSONObject();
            this.f4589b = k.f4582a;
            this.f4590c = new JSONArray();
            this.f4591d = new JSONObject();
        }

        public k a() {
            return new k(this.f4588a, this.f4589b, this.f4590c, this.f4591d);
        }

        public b b(JSONObject jSONObject) {
            try {
                this.f4588a = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b c(JSONArray jSONArray) {
            try {
                this.f4590c = new JSONArray(jSONArray.toString());
            } catch (JSONException unused) {
            }
            return this;
        }

        public b d(Date date) {
            this.f4589b = date;
            return this;
        }

        public b e(JSONObject jSONObject) {
            try {
                this.f4591d = new JSONObject(jSONObject.toString());
            } catch (JSONException unused) {
            }
            return this;
        }
    }

    private k(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        this.f4584c = jSONObject;
        this.f4585d = date;
        this.f4586e = jSONArray;
        this.f4587f = jSONObject2;
        this.f4583b = jSONObject3;
    }

    static k b(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        return new k(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObjectOptJSONObject);
    }

    public static b g() {
        return new b();
    }

    public JSONArray c() {
        return this.f4586e;
    }

    public JSONObject d() {
        return this.f4584c;
    }

    public Date e() {
        return this.f4585d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f4583b.toString().equals(((k) obj).toString());
        }
        return false;
    }

    public JSONObject f() {
        return this.f4587f;
    }

    public int hashCode() {
        return this.f4583b.hashCode();
    }

    public String toString() {
        return this.f4583b.toString();
    }
}
