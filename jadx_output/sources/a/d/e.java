package a.d;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class e<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<K, V> f187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f192f;
    private int g;
    private int h;

    public e(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f189c = i;
        this.f187a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int e(K k, V v) {
        int iF = f(k, v);
        if (iF >= 0) {
            return iF;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    protected V a(K k) {
        return null;
    }

    protected void b(boolean z, K k, V v, V v2) {
    }

    public final V c(K k) {
        V vPut;
        Objects.requireNonNull(k, "key == null");
        synchronized (this) {
            V v = this.f187a.get(k);
            if (v != null) {
                this.g++;
                return v;
            }
            this.h++;
            V vA = a(k);
            if (vA == null) {
                return null;
            }
            synchronized (this) {
                this.f191e++;
                vPut = this.f187a.put(k, vA);
                if (vPut != null) {
                    this.f187a.put(k, vPut);
                } else {
                    this.f188b += e(k, vA);
                }
            }
            if (vPut != null) {
                b(false, k, vA, vPut);
                return vPut;
            }
            g(this.f189c);
            return vA;
        }
    }

    public final V d(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f190d++;
            this.f188b += e(k, v);
            vPut = this.f187a.put(k, v);
            if (vPut != null) {
                this.f188b -= e(k, vPut);
            }
        }
        if (vPut != null) {
            b(false, k, vPut, v);
        }
        g(this.f189c);
        return vPut;
    }

    protected int f(K k, V v) {
        return 1;
    }

    public void g(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                if (this.f188b < 0 || (this.f187a.isEmpty() && this.f188b != 0)) {
                    break;
                }
                if (this.f188b > i && !this.f187a.isEmpty()) {
                    Map.Entry<K, V> next = this.f187a.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f187a.remove(key);
                    this.f188b -= e(key, value);
                    this.f192f++;
                }
                return;
            }
            b(true, key, value, null);
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.g;
        i2 = this.h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f189c), Integer.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
