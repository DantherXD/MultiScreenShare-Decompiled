package com.google.firebase.p;

import android.content.Context;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.p;
import com.google.firebase.components.t;

/* JADX INFO: loaded from: classes.dex */
public class h {

    public interface a<T> {
        String a(T t);
    }

    public static m<?> a(String str, String str2) {
        return m.g(g.a(str, str2), g.class);
    }

    public static m<?> b(final String str, final a<Context> aVar) {
        return m.h(g.class).b(t.h(Context.class)).e(new p() { // from class: com.google.firebase.p.b
            @Override // com.google.firebase.components.p
            public final Object a(n nVar) {
                return g.a(str, aVar.a((Context) nVar.a(Context.class)));
            }
        }).c();
    }
}
