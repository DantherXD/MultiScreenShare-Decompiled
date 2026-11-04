package com.google.firebase.p;

import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.p;
import com.google.firebase.components.t;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class d implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f4532b;

    d(Set<g> set, e eVar) {
        this.f4531a = d(set);
        this.f4532b = eVar;
    }

    public static m<i> b() {
        return m.a(i.class).b(t.i(g.class)).e(new p() { // from class: com.google.firebase.p.a
            @Override // com.google.firebase.components.p
            public final Object a(n nVar) {
                return d.c(nVar);
            }
        }).c();
    }

    static /* synthetic */ i c(n nVar) {
        return new d(nVar.c(g.class), e.a());
    }

    private static String d(Set<g> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<g> it = set.iterator();
        while (it.hasNext()) {
            g next = it.next();
            sb.append(next.b());
            sb.append('/');
            sb.append(next.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // com.google.firebase.p.i
    public String a() {
        if (this.f4532b.b().isEmpty()) {
            return this.f4531a;
        }
        return this.f4531a + ' ' + d(this.f4532b.b());
    }
}
