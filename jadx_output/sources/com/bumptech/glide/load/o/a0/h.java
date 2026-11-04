package com.bumptech.glide.load.o.a0;

import com.bumptech.glide.load.o.a0.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class h<K extends m, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f3182a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<K, a<K, V>> f3183b = new HashMap();

    private static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final K f3184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<V> f3185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a<K, V> f3186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a<K, V> f3187d;

        a() {
            this(null);
        }

        a(K k) {
            this.f3187d = this;
            this.f3186c = this;
            this.f3184a = k;
        }

        public void a(V v) {
            if (this.f3185b == null) {
                this.f3185b = new ArrayList();
            }
            this.f3185b.add(v);
        }

        public V b() {
            int iC = c();
            if (iC > 0) {
                return this.f3185b.remove(iC - 1);
            }
            return null;
        }

        public int c() {
            List<V> list = this.f3185b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    h() {
    }

    private void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f3182a;
        aVar.f3187d = aVar2;
        aVar.f3186c = aVar2.f3186c;
        g(aVar);
    }

    private void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f3182a;
        aVar.f3187d = aVar2.f3187d;
        aVar.f3186c = aVar2;
        g(aVar);
    }

    private static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f3187d;
        aVar2.f3186c = aVar.f3186c;
        aVar.f3186c.f3187d = aVar2;
    }

    private static <K, V> void g(a<K, V> aVar) {
        aVar.f3186c.f3187d = aVar;
        aVar.f3187d.f3186c = aVar;
    }

    public V a(K k) {
        a<K, V> aVar = this.f3183b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            this.f3183b.put(k, aVar);
        } else {
            k.a();
        }
        b(aVar);
        return aVar.b();
    }

    public void d(K k, V v) {
        a<K, V> aVar = this.f3183b.get(k);
        if (aVar == null) {
            aVar = new a<>(k);
            c(aVar);
            this.f3183b.put(k, aVar);
        } else {
            k.a();
        }
        aVar.a(v);
    }

    public V f() {
        a aVar = this.f3182a;
        while (true) {
            aVar = aVar.f3187d;
            if (aVar.equals(this.f3182a)) {
                return null;
            }
            V v = (V) aVar.b();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.f3183b.remove(aVar.f3184a);
            ((m) aVar.f3184a).a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.f3182a.f3186c; !aVar.equals(this.f3182a); aVar = aVar.f3186c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f3184a);
            sb.append(':');
            sb.append(aVar.c());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
