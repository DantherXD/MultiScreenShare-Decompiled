package a.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    c<K, V> f139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c<K, V> f140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f141d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f142e = 0;

    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f146e;
        }

        @Override // a.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f145d;
        }
    }

    /* JADX INFO: renamed from: a.b.a.b.b$b, reason: collision with other inner class name */
    private static class C0004b<K, V> extends e<K, V> {
        C0004b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f145d;
        }

        @Override // a.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f146e;
        }
    }

    static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final K f143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final V f144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        c<K, V> f145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        c<K, V> f146e;

        c(K k, V v) {
            this.f143b = k;
            this.f144c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f143b.equals(cVar.f143b) && this.f144c.equals(cVar.f144c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f143b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f144c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f144c.hashCode() ^ this.f143b.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f143b + "=" + this.f144c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private c<K, V> f147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f148c = true;

        d() {
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f147b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f146e;
                this.f147b = cVar3;
                this.f148c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f148c) {
                this.f148c = false;
                cVar = b.this.f139b;
            } else {
                c<K, V> cVar2 = this.f147b;
                cVar = cVar2 != null ? cVar2.f145d : null;
            }
            this.f147b = cVar;
            return this.f147b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f148c) {
                return b.this.f139b != null;
            }
            c<K, V> cVar = this.f147b;
            return (cVar == null || cVar.f145d == null) ? false : true;
        }
    }

    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        c<K, V> f150b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c<K, V> f151c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f150b = cVar2;
            this.f151c = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f151c;
            c<K, V> cVar2 = this.f150b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f150b == cVar && cVar == this.f151c) {
                this.f151c = null;
                this.f150b = null;
            }
            c<K, V> cVar2 = this.f150b;
            if (cVar2 == cVar) {
                this.f150b = b(cVar2);
            }
            if (this.f151c == cVar) {
                this.f151c = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f151c;
            this.f151c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f151c != null;
        }
    }

    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0004b c0004b = new C0004b(this.f140c, this.f139b);
        this.f141d.put(c0004b, Boolean.FALSE);
        return c0004b;
    }

    public Map.Entry<K, V> b() {
        return this.f139b;
    }

    protected c<K, V> c(K k) {
        c<K, V> cVar = this.f139b;
        while (cVar != null && !cVar.f143b.equals(k)) {
            cVar = cVar.f145d;
        }
        return cVar;
    }

    public b<K, V>.d d() {
        b<K, V>.d dVar = new d();
        this.f141d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> e() {
        return this.f140c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    protected c<K, V> f(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f142e++;
        c<K, V> cVar2 = this.f140c;
        if (cVar2 == null) {
            this.f139b = cVar;
        } else {
            cVar2.f145d = cVar;
            cVar.f146e = cVar2;
        }
        this.f140c = cVar;
        return cVar;
    }

    public V g(K k, V v) {
        c<K, V> cVarC = c(k);
        if (cVarC != null) {
            return cVarC.f144c;
        }
        f(k, v);
        return null;
    }

    public V h(K k) {
        c<K, V> cVarC = c(k);
        if (cVarC == null) {
            return null;
        }
        this.f142e--;
        if (!this.f141d.isEmpty()) {
            Iterator<f<K, V>> it = this.f141d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarC);
            }
        }
        c<K, V> cVar = cVarC.f146e;
        c<K, V> cVar2 = cVarC.f145d;
        if (cVar != null) {
            cVar.f145d = cVar2;
        } else {
            this.f139b = cVar2;
        }
        c<K, V> cVar3 = cVarC.f145d;
        if (cVar3 != null) {
            cVar3.f146e = cVar;
        } else {
            this.f140c = cVar;
        }
        cVarC.f145d = null;
        cVarC.f146e = null;
        return cVarC.f144c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f139b, this.f140c);
        this.f141d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public int size() {
        return this.f142e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
