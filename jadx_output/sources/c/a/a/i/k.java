package c.a.a.i;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
class k implements c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k f2467a = new k();

    k() {
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a6 A[Catch: all -> 0x0145, TRY_LEAVE, TryCatch #0 {all -> 0x0145, blocks: (B:9:0x0041, B:11:0x0047, B:16:0x0054, B:18:0x0058, B:20:0x0065, B:22:0x006d, B:24:0x0074, B:26:0x0080, B:27:0x0082, B:35:0x009f, B:37:0x00a6, B:40:0x00af, B:41:0x00b6, B:28:0x0085, B:31:0x008e, B:34:0x0094, B:42:0x00b7, B:43:0x00d1, B:44:0x00d2, B:47:0x00da, B:49:0x00e6, B:51:0x00ee, B:53:0x00fa, B:56:0x0101, B:57:0x0104, B:59:0x010f, B:61:0x011a, B:62:0x011d, B:64:0x0126, B:66:0x012c, B:67:0x0144), top: B:71:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00af A[Catch: all -> 0x0145, TRY_ENTER, TryCatch #0 {all -> 0x0145, blocks: (B:9:0x0041, B:11:0x0047, B:16:0x0054, B:18:0x0058, B:20:0x0065, B:22:0x006d, B:24:0x0074, B:26:0x0080, B:27:0x0082, B:35:0x009f, B:37:0x00a6, B:40:0x00af, B:41:0x00b6, B:28:0x0085, B:31:0x008e, B:34:0x0094, B:42:0x00b7, B:43:0x00d1, B:44:0x00d2, B:47:0x00da, B:49:0x00e6, B:51:0x00ee, B:53:0x00fa, B:56:0x0101, B:57:0x0104, B:59:0x010f, B:61:0x011a, B:62:0x011d, B:64:0x0126, B:66:0x012c, B:67:0x0144), top: B:71:0x0041 }] */
    public static Object c(b bVar, Map<Object, Object> map, Type type, Type type2, Object obj) {
        Object obj2;
        l lVar;
        e eVar = bVar.f2432f;
        int i = eVar.h;
        int i2 = 16;
        if (i != 12 && i != 16) {
            throw new c.a.a.d("syntax error, expect {, actual " + f.a(i));
        }
        c.a.a.i.q.f fVarD = bVar.f2429c.d(type);
        c.a.a.i.q.f fVarD2 = bVar.f2429c.d(type2);
        eVar.s();
        l lVar2 = bVar.g;
        while (true) {
            try {
                int i3 = eVar.h;
                if (i3 == 13) {
                    eVar.t(i2);
                    bVar.y(lVar2);
                    return map;
                }
                if (i3 == 4 && eVar.o == 4 && eVar.x.startsWith("$ref", eVar.r + 1) && !eVar.m(d.DisableSpecialKeyDetect)) {
                    eVar.u(':');
                    if (eVar.h != 4) {
                        throw new c.a.a.d("illegal ref, " + f.a(i3));
                    }
                    String strB0 = eVar.b0();
                    if (!"..".equals(strB0)) {
                        if ("$".equals(strB0)) {
                            lVar = lVar2;
                            while (true) {
                                l lVar3 = lVar.f2469b;
                                if (lVar3 == null) {
                                    break;
                                }
                                lVar = lVar3;
                            }
                        } else {
                            bVar.b(new b.a(lVar2, strB0));
                            bVar.k = 1;
                            obj2 = null;
                        }
                        eVar.t(13);
                        if (eVar.h == 13) {
                            throw new c.a.a.d("illegal ref");
                        }
                        eVar.t(16);
                        bVar.y(lVar2);
                        return obj2;
                    }
                    lVar = lVar2.f2469b;
                    obj2 = lVar.f2468a;
                    eVar.t(13);
                    if (eVar.h == 13) {
                        throw new c.a.a.d("illegal ref");
                    }
                    eVar.t(16);
                    bVar.y(lVar2);
                    return obj2;
                }
                if (map.size() == 0 && i3 == 4 && "@type".equals(eVar.b0()) && !eVar.m(d.DisableSpecialKeyDetect)) {
                    eVar.u(':');
                    eVar.t(16);
                    if (eVar.h == 13) {
                        eVar.s();
                        bVar.y(lVar2);
                        return map;
                    }
                    eVar.s();
                }
                Object objB = fVarD.b(bVar, type, null);
                if (eVar.h != 17) {
                    throw new c.a.a.d("syntax error, expect :, actual " + eVar.h);
                }
                eVar.s();
                Object objB2 = fVarD2.b(bVar, type2, objB);
                if (bVar.k == 1) {
                    bVar.d(map, objB);
                }
                map.put(objB, objB2);
                if (eVar.h == 16) {
                    eVar.s();
                }
                i2 = 16;
            } catch (Throwable th) {
                bVar.y(lVar2);
                throw th;
            }
        }
    }

    public static Map d(b bVar, Map<String, Object> map, Type type, Object obj) {
        char c2;
        String strV;
        e eVar = bVar.f2432f;
        if (eVar.h != 12) {
            throw new c.a.a.d("syntax error, expect {, actual " + eVar.h);
        }
        l lVar = bVar.g;
        while (true) {
            try {
                eVar.a0();
                while (true) {
                    c2 = eVar.k;
                    if (c2 != ',') {
                        break;
                    }
                    eVar.q();
                    eVar.a0();
                }
                if (c2 == '\"') {
                    strV = eVar.U(bVar.f2428b, '\"');
                    eVar.a0();
                    if (eVar.k != ':') {
                        throw new c.a.a.d("syntax error, " + eVar.i());
                    }
                } else {
                    if (c2 == '}') {
                        eVar.q();
                        eVar.o = 0;
                        eVar.t(16);
                        bVar.y(lVar);
                        return map;
                    }
                    if (c2 == '\'') {
                        strV = eVar.U(bVar.f2428b, '\'');
                        eVar.a0();
                        if (eVar.k != ':') {
                            throw new c.a.a.d("syntax error, " + eVar.i());
                        }
                    } else {
                        strV = eVar.V(bVar.f2428b);
                        eVar.a0();
                        char c3 = eVar.k;
                        if (c3 != ':') {
                            throw new c.a.a.d("expect ':' at " + eVar.i + ", actual " + c3);
                        }
                    }
                }
                eVar.q();
                eVar.a0();
                eVar.o = 0;
                Object objS = null;
                if (strV != "@type" || eVar.m(d.DisableSpecialKeyDetect)) {
                    eVar.s();
                    bVar.y(lVar);
                    if (eVar.h == 8) {
                        eVar.s();
                    } else {
                        objS = bVar.s(type, strV);
                    }
                    map.put(strV, objS);
                    if (bVar.k == 1) {
                        bVar.d(map, strV);
                    }
                    bVar.x(lVar, objS, strV);
                    int i = eVar.h;
                    if (i != 20 && i != 15) {
                        if (i == 13) {
                            eVar.s();
                            bVar.y(lVar);
                            return map;
                        }
                    }
                    bVar.y(lVar);
                    return map;
                }
                Class<?> clsA = bVar.f2429c.a(eVar.U(bVar.f2428b, '\"'), null, eVar.j);
                if (clsA != map.getClass()) {
                    c.a.a.i.q.f fVarD = bVar.f2429c.d(clsA);
                    eVar.t(16);
                    bVar.k = 2;
                    if (lVar != null && !(obj instanceof Integer)) {
                        bVar.w();
                    }
                    Map map2 = (Map) fVarD.b(bVar, clsA, obj);
                    bVar.y(lVar);
                    return map2;
                }
                eVar.t(16);
                if (eVar.h == 13) {
                    eVar.t(16);
                    bVar.y(lVar);
                    return map;
                }
            } catch (Throwable th) {
                bVar.y(lVar);
                throw th;
            }
        }
    }

    protected Map<?, ?> a(Type type) {
        if (type == Properties.class) {
            return new Properties();
        }
        if (type == Hashtable.class) {
            return new Hashtable();
        }
        if (type == IdentityHashMap.class) {
            return new IdentityHashMap();
        }
        if (type == SortedMap.class || type == TreeMap.class) {
            return new TreeMap();
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return new ConcurrentHashMap();
        }
        if (type == Map.class || type == HashMap.class) {
            return new HashMap();
        }
        if (type == LinkedHashMap.class) {
            return new LinkedHashMap();
        }
        if (type == c.a.a.e.class) {
            return new c.a.a.e();
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            return EnumMap.class.equals(rawType) ? new EnumMap((Class) parameterizedType.getActualTypeArguments()[0]) : a(rawType);
        }
        Class cls = (Class) type;
        if (cls.isInterface()) {
            throw new c.a.a.d("unsupport type " + type);
        }
        try {
            return (Map) cls.newInstance();
        } catch (Exception e2) {
            throw new c.a.a.d("unsupport type " + type, e2);
        }
    }

    @Override // c.a.a.i.q.f
    public <T> T b(b bVar, Type type, Object obj) {
        if (type == c.a.a.e.class && bVar.n == null) {
            return (T) bVar.p();
        }
        e eVar = bVar.f2432f;
        if (eVar.h == 8) {
            eVar.t(16);
            return null;
        }
        Map<?, ?> mapA = a(type);
        l lVar = bVar.g;
        try {
            bVar.x(lVar, mapA, obj);
            if (!(type instanceof ParameterizedType)) {
                return (T) bVar.t(mapA, obj);
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            Type type3 = parameterizedType.getActualTypeArguments()[1];
            return String.class == type2 ? (T) d(bVar, mapA, type3, obj) : (T) c(bVar, mapA, type2, type3, obj);
        } finally {
            bVar.y(lVar);
        }
    }
}
