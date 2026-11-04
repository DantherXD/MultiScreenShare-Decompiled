package c.a.a.i.q;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.a.a.k.a f2486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class<?> f2487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Enum[] f2488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long[] f2489d;

    public d(Class<?> cls, c.a.a.k.a aVar, int i) {
        this.f2487b = cls;
        this.f2486a = aVar;
        if (aVar == null) {
            return;
        }
        Class<?> cls2 = aVar.h;
        if (cls2.isEnum()) {
            Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
            int length = enumArr.length;
            long[] jArr = new long[length];
            this.f2489d = new long[enumArr.length];
            for (int i2 = 0; i2 < enumArr.length; i2++) {
                String strName = enumArr[i2].name();
                long jCharAt = -3750763034362895579L;
                for (int i3 = 0; i3 < strName.length(); i3++) {
                    jCharAt = (jCharAt ^ ((long) strName.charAt(i3))) * 1099511628211L;
                }
                jArr[i2] = jCharAt;
                this.f2489d[i2] = jCharAt;
            }
            Arrays.sort(this.f2489d);
            this.f2488c = new Enum[enumArr.length];
            for (int i4 = 0; i4 < this.f2489d.length; i4++) {
                for (int i5 = 0; i5 < length; i5++) {
                    if (this.f2489d[i4] == jArr[i5]) {
                        this.f2488c[i4] = enumArr[i5];
                        break;
                    }
                }
            }
        }
    }

    public Enum a(long j) {
        int iBinarySearch;
        if (this.f2488c != null && (iBinarySearch = Arrays.binarySearch(this.f2489d, j)) >= 0) {
            return this.f2488c[iBinarySearch];
        }
        return null;
    }

    public abstract void b(c.a.a.i.b bVar, Object obj, Type type, Map<String, Object> map);

    public void c(Object obj, double d2) throws IllegalAccessException {
        this.f2486a.f2547d.setDouble(obj, d2);
    }

    public void d(Object obj, float f2) throws IllegalAccessException {
        this.f2486a.f2547d.setFloat(obj, f2);
    }

    public void e(Object obj, int i) throws IllegalAccessException {
        this.f2486a.f2547d.setInt(obj, i);
    }

    public void f(Object obj, long j) throws IllegalAccessException {
        this.f2486a.f2547d.setLong(obj, j);
    }

    public void g(Object obj, Object obj2) {
        Collection collection;
        Collection collection2;
        Map map;
        Map map2;
        if (obj2 == null && this.f2486a.h.isPrimitive()) {
            return;
        }
        c.a.a.k.a aVar = this.f2486a;
        Field field = aVar.f2547d;
        Method method = aVar.f2546c;
        try {
            if (aVar.f2548e) {
                if (!aVar.k) {
                    field.set(obj, obj2);
                    return;
                }
                if (Map.class.isAssignableFrom(aVar.h)) {
                    map = (Map) field.get(obj);
                    if (map != null) {
                        map2 = (Map) obj2;
                        map.putAll(map2);
                        return;
                    }
                    return;
                }
                collection = (Collection) field.get(obj);
                if (collection != null) {
                    collection2 = (Collection) obj2;
                    collection.addAll(collection2);
                }
                return;
            }
            if (!aVar.k) {
                method.invoke(obj, obj2);
                return;
            }
            if (Map.class.isAssignableFrom(aVar.h)) {
                map = (Map) method.invoke(obj, new Object[0]);
                if (map != null) {
                    map2 = (Map) obj2;
                    map.putAll(map2);
                    return;
                }
                return;
            }
            collection = (Collection) method.invoke(obj, new Object[0]);
            if (collection != null) {
                collection2 = (Collection) obj2;
                collection.addAll(collection2);
            }
        } catch (Exception e2) {
            throw new c.a.a.d("set property error, " + this.f2486a.f2545b, e2);
        }
    }
}
