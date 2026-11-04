package com.google.firebase.components;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class s {

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<?> f4360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<b> f4361b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set<b> f4362c = new HashSet();

        b(m<?> mVar) {
            this.f4360a = mVar;
        }

        void a(b bVar) {
            this.f4361b.add(bVar);
        }

        void b(b bVar) {
            this.f4362c.add(bVar);
        }

        m<?> c() {
            return this.f4360a;
        }

        Set<b> d() {
            return this.f4361b;
        }

        boolean e() {
            return this.f4361b.isEmpty();
        }

        boolean f() {
            return this.f4362c.isEmpty();
        }

        void g(b bVar) {
            this.f4362c.remove(bVar);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<?> f4363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f4364b;

        private c(Class<?> cls, boolean z) {
            this.f4363a = cls;
            this.f4364b = z;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f4363a.equals(this.f4363a) && cVar.f4364b == this.f4364b;
        }

        public int hashCode() {
            return Boolean.valueOf(this.f4364b).hashCode() ^ ((this.f4363a.hashCode() ^ 1000003) * 1000003);
        }
    }

    static void a(List<m<?>> list) {
        Set<b> setC = c(list);
        Set<b> setB = b(setC);
        int i = 0;
        while (!setB.isEmpty()) {
            b next = setB.iterator().next();
            setB.remove(next);
            i++;
            for (b bVar : next.d()) {
                bVar.g(next);
                if (bVar.f()) {
                    setB.add(bVar);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar2 : setC) {
            if (!bVar2.f() && !bVar2.e()) {
                arrayList.add(bVar2.c());
            }
        }
        throw new u(arrayList);
    }

    private static Set<b> b(Set<b> set) {
        HashSet hashSet = new HashSet();
        for (b bVar : set) {
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    private static Set<b> c(List<m<?>> list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator<m<?>> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (t tVar : bVar.c().c()) {
                            if (tVar.d() && (set = (Set) map.get(new c(tVar.b(), tVar.f()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            m<?> next = it.next();
            b bVar3 = new b(next);
            for (Class<? super Object> cls : next.e()) {
                c cVar = new c(cls, !next.k());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f4364b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", cls));
                }
                set2.add(bVar3);
            }
        }
    }
}
