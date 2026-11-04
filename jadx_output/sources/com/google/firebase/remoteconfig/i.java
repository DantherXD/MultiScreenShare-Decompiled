package com.google.firebase.remoteconfig;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f4545a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.f f4547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.firebase.i.c f4548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f4549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.firebase.remoteconfig.internal.j f4550f;
    private final com.google.firebase.remoteconfig.internal.j g;
    private final com.google.firebase.remoteconfig.internal.j h;
    private final com.google.firebase.remoteconfig.internal.l i;
    private final com.google.firebase.remoteconfig.internal.m j;
    private final com.google.firebase.remoteconfig.internal.n k;
    private final com.google.firebase.installations.h l;

    i(Context context, com.google.firebase.f fVar, com.google.firebase.installations.h hVar, com.google.firebase.i.c cVar, Executor executor, com.google.firebase.remoteconfig.internal.j jVar, com.google.firebase.remoteconfig.internal.j jVar2, com.google.firebase.remoteconfig.internal.j jVar3, com.google.firebase.remoteconfig.internal.l lVar, com.google.firebase.remoteconfig.internal.m mVar, com.google.firebase.remoteconfig.internal.n nVar) {
        this.f4546b = context;
        this.f4547c = fVar;
        this.l = hVar;
        this.f4548d = cVar;
        this.f4549e = executor;
        this.f4550f = jVar;
        this.g = jVar2;
        this.h = jVar3;
        this.i = lVar;
        this.j = mVar;
        this.k = nVar;
    }

    public static i d() {
        return e(com.google.firebase.f.h());
    }

    public static i e(com.google.firebase.f fVar) {
        return ((n) fVar.f(n.class)).d();
    }

    private static boolean g(com.google.firebase.remoteconfig.internal.k kVar, com.google.firebase.remoteconfig.internal.k kVar2) {
        return kVar2 == null || !kVar.e().equals(kVar2.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ c.b.a.a.c.h i(c.b.a.a.c.h hVar, c.b.a.a.c.h hVar2, c.b.a.a.c.h hVar3) {
        if (!hVar.m() || hVar.j() == null) {
            return c.b.a.a.c.k.c(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.k kVar = (com.google.firebase.remoteconfig.internal.k) hVar.j();
        return (!hVar2.m() || g(kVar, (com.google.firebase.remoteconfig.internal.k) hVar2.j())) ? this.g.k(kVar).f(this.f4549e, new c.b.a.a.c.a() { // from class: com.google.firebase.remoteconfig.d
            @Override // c.b.a.a.c.a
            public final Object a(c.b.a.a.c.h hVar4) {
                return Boolean.valueOf(this.f4540a.n(hVar4));
            }
        }) : c.b.a.a.c.k.c(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ c.b.a.a.c.h l(Void r1) {
        return a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n(c.b.a.a.c.h<com.google.firebase.remoteconfig.internal.k> hVar) {
        if (!hVar.m()) {
            return false;
        }
        this.f4550f.b();
        if (hVar.j() != null) {
            q(hVar.j().c());
            return true;
        }
        Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
        return true;
    }

    static List<Map<String, String>> p(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public c.b.a.a.c.h<Boolean> a() {
        final c.b.a.a.c.h<com.google.firebase.remoteconfig.internal.k> hVarC = this.f4550f.c();
        final c.b.a.a.c.h<com.google.firebase.remoteconfig.internal.k> hVarC2 = this.g.c();
        return c.b.a.a.c.k.f(hVarC, hVarC2).h(this.f4549e, new c.b.a.a.c.a() { // from class: com.google.firebase.remoteconfig.c
            @Override // c.b.a.a.c.a
            public final Object a(c.b.a.a.c.h hVar) {
                return this.f4537a.i(hVarC, hVarC2, hVar);
            }
        });
    }

    public c.b.a.a.c.h<Void> b() {
        return this.i.d().n(new c.b.a.a.c.g() { // from class: com.google.firebase.remoteconfig.a
            @Override // c.b.a.a.c.g
            public final c.b.a.a.c.h a(Object obj) {
                return c.b.a.a.c.k.c(null);
            }
        });
    }

    public c.b.a.a.c.h<Boolean> c() {
        return b().o(this.f4549e, new c.b.a.a.c.g() { // from class: com.google.firebase.remoteconfig.b
            @Override // c.b.a.a.c.g
            public final c.b.a.a.c.h a(Object obj) {
                return this.f4536a.l((Void) obj);
            }
        });
    }

    public String f(String str) {
        return this.j.d(str);
    }

    void o() {
        this.g.c();
        this.h.c();
        this.f4550f.c();
    }

    void q(JSONArray jSONArray) {
        if (this.f4548d == null) {
            return;
        }
        try {
            this.f4548d.k(p(jSONArray));
        } catch (com.google.firebase.i.a e2) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e2);
        } catch (JSONException e3) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e3);
        }
    }
}
