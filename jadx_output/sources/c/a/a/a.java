package c.a.a;

import c.a.a.i.m;
import c.a.a.j.a0;
import c.a.a.j.c0;
import c.a.a.j.n;
import c.a.a.j.r;
import c.a.a.j.t;
import c.a.a.j.u;
import c.a.a.j.v;
import c.a.a.j.x;
import c.a.a.j.y;
import c.a.a.j.z;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f, c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static TimeZone f2416b = TimeZone.getDefault();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Locale f2417c = Locale.getDefault();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f2418d = ((c.a.a.i.d.UseBigDecimal.u | 0) | c.a.a.i.d.SortFeidFastMatch.u) | c.a.a.i.d.IgnoreNotMatch.u;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f2419e = "yyyy-MM-dd HH:mm:ss";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f2420f = (((a0.QuoteFieldNames.z | 0) | a0.SkipTransientField.z) | a0.WriteEnumUsingToString.z) | a0.SortField.z;

    public static final Object c(String str) {
        return d(str, f2418d);
    }

    public static final Object d(String str, int i) {
        if (str == null) {
            return null;
        }
        c.a.a.i.b bVar = new c.a.a.i.b(str, m.f2474b, i);
        Object objK = bVar.k(null);
        bVar.i(objK);
        bVar.close();
        return objK;
    }

    public static final e e(String str) {
        Object objC = c(str);
        if ((objC instanceof e) || objC == null) {
            return (e) objC;
        }
        e eVar = (e) j(objC);
        if ((f2418d & c.a.a.i.d.SupportAutoType.u) != 0) {
            eVar.put("@type", objC.getClass().getName());
        }
        return eVar;
    }

    public static final <T> T f(String str, Class<T> cls) {
        return (T) g(str, cls, new c.a.a.i.d[0]);
    }

    public static final <T> T g(String str, Class<T> cls, c.a.a.i.d... dVarArr) {
        return (T) h(str, cls, m.f2474b, f2418d, dVarArr);
    }

    public static final <T> T h(String str, Type type, m mVar, int i, c.a.a.i.d... dVarArr) {
        return (T) i(str, type, mVar, null, i, dVarArr);
    }

    public static final <T> T i(String str, Type type, m mVar, c.a.a.i.q.g gVar, int i, c.a.a.i.d... dVarArr) {
        if (str == null) {
            return null;
        }
        for (c.a.a.i.d dVar : dVarArr) {
            i |= dVar.u;
        }
        c.a.a.i.b bVar = new c.a.a.i.b(str, mVar, i);
        if (gVar instanceof c.a.a.i.q.c) {
            bVar.g().add((c.a.a.i.q.c) gVar);
        }
        if (gVar instanceof c.a.a.i.q.b) {
            bVar.f().add((c.a.a.i.q.b) gVar);
        }
        if (gVar instanceof c.a.a.i.q.e) {
            bVar.n = (c.a.a.i.q.e) gVar;
        }
        T t = (T) bVar.r(type);
        bVar.i(t);
        bVar.close();
        return t;
    }

    public static final Object j(Object obj) {
        return k(obj, x.f2536a);
    }

    public static Object k(Object obj, x xVar) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            int size = map.size();
            e eVar = new e((Map<String, Object>) (map instanceof LinkedHashMap ? new LinkedHashMap(size) : map instanceof TreeMap ? new TreeMap() : new HashMap(size)));
            for (Map.Entry entry : map.entrySet()) {
                eVar.put(c.a.a.k.d.t(entry.getKey()), j(entry.getValue()));
            }
            return eVar;
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            b bVar = new b(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                bVar.add(j(it.next()));
            }
            return bVar;
        }
        Class<?> cls = obj.getClass();
        if (cls.isEnum()) {
            return ((Enum) obj).name();
        }
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            b bVar2 = new b(length);
            for (int i = 0; i < length; i++) {
                bVar2.add(j(Array.get(obj, i)));
            }
            return bVar2;
        }
        if (m.f(cls)) {
            return obj;
        }
        t tVarA = xVar.a(cls);
        if (!(tVarA instanceof n)) {
            return null;
        }
        n nVar = (n) tVarA;
        e eVar2 = new e();
        try {
            for (Map.Entry<String, Object> entry2 : nVar.b(obj).entrySet()) {
                eVar2.put(entry2.getKey(), j(entry2.getValue()));
            }
            return eVar2;
        } catch (Exception e2) {
            throw new d("toJSON error", e2);
        }
    }

    public static final String l(Object obj) {
        return m(obj, x.f2536a, null, null, f2420f, new a0[0]);
    }

    public static String m(Object obj, x xVar, y[] yVarArr, String str, int i, a0... a0VarArr) {
        z zVar = new z(null, i, a0VarArr);
        try {
            c.a.a.j.m mVar = new c.a.a.j.m(zVar, xVar);
            for (a0 a0Var : a0VarArr) {
                mVar.c(a0Var, true);
            }
            if (str != null && str.length() != 0) {
                mVar.q(str);
                mVar.c(a0.WriteDateUseDateFormat, true);
            }
            if (yVarArr != null) {
                for (y yVar : yVarArr) {
                    if (yVar != null) {
                        if (yVar instanceof v) {
                            mVar.j().add((v) yVar);
                        }
                        if (yVar instanceof r) {
                            mVar.h().add((r) yVar);
                        }
                        if (yVar instanceof c0) {
                            mVar.k().add((c0) yVar);
                        }
                        if (yVar instanceof u) {
                            mVar.i().add((u) yVar);
                        }
                        if (yVar instanceof c.a.a.j.d) {
                            mVar.f().add((c.a.a.j.d) yVar);
                        }
                        if (yVar instanceof c.a.a.j.a) {
                            mVar.e().add((c.a.a.j.a) yVar);
                        }
                    }
                }
            }
            mVar.r(obj);
            return zVar.toString();
        } finally {
            zVar.close();
        }
    }

    @Override // c.a.a.c
    public String a() {
        z zVar = new z(null, f2420f, a0.x);
        try {
            new c.a.a.j.m(zVar, x.f2536a).r(this);
            return zVar.toString();
        } finally {
            zVar.close();
        }
    }

    @Override // c.a.a.f
    public void b(Appendable appendable) {
        z zVar = new z(null, f2420f, a0.x);
        try {
            try {
                new c.a.a.j.m(zVar, x.f2536a).r(this);
                appendable.append(zVar.toString());
                zVar.close();
            } catch (IOException e2) {
                throw new d(e2.getMessage(), e2);
            }
        } catch (Throwable th) {
            zVar.close();
            throw th;
        }
    }

    public String toString() {
        return a();
    }
}
