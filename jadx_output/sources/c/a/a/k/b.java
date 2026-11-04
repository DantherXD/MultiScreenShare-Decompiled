package c.a.a.k;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class b<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<V>[] f2550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2551b;

    protected static final class a<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f2553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public V f2554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final a<V> f2555d;

        public a(Type type, V v, int i, a<V> aVar) {
            this.f2553b = type;
            this.f2554c = v;
            this.f2555d = aVar;
            this.f2552a = i;
        }
    }

    public b(int i) {
        this.f2551b = i - 1;
        this.f2550a = new a[i];
    }

    public Class a(String str) {
        int i = 0;
        while (true) {
            a<V>[] aVarArr = this.f2550a;
            if (i >= aVarArr.length) {
                return null;
            }
            a<V> aVar = aVarArr[i];
            if (aVar != null) {
                for (a<V> aVar2 = aVar; aVar2 != null; aVar2 = aVar2.f2555d) {
                    Type type = aVar.f2553b;
                    if (type instanceof Class) {
                        Class cls = (Class) type;
                        if (cls.getName().equals(str)) {
                            return cls;
                        }
                    }
                }
            }
            i++;
        }
    }

    public final V b(Type type) {
        for (a<V> aVar = this.f2550a[System.identityHashCode(type) & this.f2551b]; aVar != null; aVar = aVar.f2555d) {
            if (type == aVar.f2553b) {
                return aVar.f2554c;
            }
        }
        return null;
    }

    public boolean c(Type type, V v) {
        int iIdentityHashCode = System.identityHashCode(type);
        int i = this.f2551b & iIdentityHashCode;
        for (a<V> aVar = this.f2550a[i]; aVar != null; aVar = aVar.f2555d) {
            if (type == aVar.f2553b) {
                aVar.f2554c = v;
                return true;
            }
        }
        this.f2550a[i] = new a<>(type, v, iIdentityHashCode, this.f2550a[i]);
        return false;
    }
}
