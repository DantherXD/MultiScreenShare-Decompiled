package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.i.c;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, c> f4304a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.firebase.n.b<com.google.firebase.j.a.a> f4306c;

    protected b(Context context, com.google.firebase.n.b<com.google.firebase.j.a.a> bVar) {
        this.f4305b = context;
        this.f4306c = bVar;
    }

    protected c a(String str) {
        return new c(this.f4305b, this.f4306c, str);
    }

    public synchronized c b(String str) {
        if (!this.f4304a.containsKey(str)) {
            this.f4304a.put(str, a(str));
        }
        return this.f4304a.get(str);
    }
}
