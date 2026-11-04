package a.b.a.b;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f138f = new HashMap<>();

    @Override // a.b.a.b.b
    protected b.c<K, V> c(K k) {
        return this.f138f.get(k);
    }

    public boolean contains(K k) {
        return this.f138f.containsKey(k);
    }

    @Override // a.b.a.b.b
    public V g(K k, V v) {
        b.c<K, V> cVarC = c(k);
        if (cVarC != null) {
            return cVarC.f144c;
        }
        this.f138f.put(k, f(k, v));
        return null;
    }

    @Override // a.b.a.b.b
    public V h(K k) {
        V v = (V) super.h(k);
        this.f138f.remove(k);
        return v;
    }

    public Map.Entry<K, V> i(K k) {
        if (contains(k)) {
            return this.f138f.get(k).f146e;
        }
        return null;
    }
}
