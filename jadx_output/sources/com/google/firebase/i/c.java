package com.google.firebase.i;

import android.content.Context;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.firebase.n.b<com.google.firebase.j.a.a> f4401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f4403c = null;

    public c(Context context, com.google.firebase.n.b<com.google.firebase.j.a.a> bVar, String str) {
        this.f4401a = bVar;
        this.f4402b = str;
    }

    private void a(com.google.firebase.j.a.a.C0108a c0108a) {
        this.f4401a.a().b(c0108a);
    }

    private void b(List<b> list) {
        ArrayDeque arrayDeque = new ArrayDeque(d());
        int iG = g();
        for (b bVar : list) {
            while (arrayDeque.size() >= iG) {
                i(((com.google.firebase.j.a.a.C0108a) arrayDeque.pollFirst()).f4499b);
            }
            com.google.firebase.j.a.a.C0108a c0108aD = bVar.d(this.f4402b);
            a(c0108aD);
            arrayDeque.offer(c0108aD);
        }
    }

    private static List<b> c(List<Map<String, String>> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<Map<String, String>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(b.a(it.next()));
        }
        return arrayList;
    }

    private List<com.google.firebase.j.a.a.C0108a> d() {
        return this.f4401a.a().d(this.f4402b, "");
    }

    private ArrayList<b> e(List<b> list, Set<String> set) {
        ArrayList<b> arrayList = new ArrayList<>();
        for (b bVar : list) {
            if (!set.contains(bVar.b())) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    private ArrayList<com.google.firebase.j.a.a.C0108a> f(List<com.google.firebase.j.a.a.C0108a> list, Set<String> set) {
        ArrayList<com.google.firebase.j.a.a.C0108a> arrayList = new ArrayList<>();
        for (com.google.firebase.j.a.a.C0108a c0108a : list) {
            if (!set.contains(c0108a.f4499b)) {
                arrayList.add(c0108a);
            }
        }
        return arrayList;
    }

    private int g() {
        if (this.f4403c == null) {
            this.f4403c = Integer.valueOf(this.f4401a.a().f(this.f4402b));
        }
        return this.f4403c.intValue();
    }

    private void i(String str) {
        this.f4401a.a().c(str, null, null);
    }

    private void j(Collection<com.google.firebase.j.a.a.C0108a> collection) {
        Iterator<com.google.firebase.j.a.a.C0108a> it = collection.iterator();
        while (it.hasNext()) {
            i(it.next().f4499b);
        }
    }

    private void l(List<b> list) throws a {
        if (list.isEmpty()) {
            h();
            return;
        }
        HashSet hashSet = new HashSet();
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().b());
        }
        List<com.google.firebase.j.a.a.C0108a> listD = d();
        HashSet hashSet2 = new HashSet();
        Iterator<com.google.firebase.j.a.a.C0108a> it2 = listD.iterator();
        while (it2.hasNext()) {
            hashSet2.add(it2.next().f4499b);
        }
        j(f(listD, hashSet));
        b(e(list, hashSet2));
    }

    private void m() throws a {
        if (this.f4401a.a() == null) {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    public void h() throws a {
        m();
        j(d());
    }

    public void k(List<Map<String, String>> list) throws a {
        m();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        l(c(list));
    }
}
