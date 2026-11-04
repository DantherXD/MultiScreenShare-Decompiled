package c.a.a.j;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class p implements t {
    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        boolean z;
        Object objN;
        Object objO;
        z zVar = mVar.f2518b;
        if (obj == null) {
            zVar.o();
            return;
        }
        Map<String, Object> treeMap = (Map) obj;
        Class<?> cls = treeMap.getClass();
        boolean z2 = (cls == c.a.a.e.class || cls == HashMap.class || cls == LinkedHashMap.class) && treeMap.containsKey("@type");
        if ((zVar.n & a0.SortField.z) != 0) {
            if (treeMap instanceof c.a.a.e) {
                treeMap = ((c.a.a.e) treeMap).n();
            }
            if (!(treeMap instanceof SortedMap) && !(treeMap instanceof LinkedHashMap)) {
                try {
                    treeMap = new TreeMap(treeMap);
                } catch (Exception unused) {
                }
            }
        }
        IdentityHashMap<Object, w> identityHashMap = mVar.l;
        if (identityHashMap != null && identityHashMap.containsKey(obj)) {
            mVar.t(obj);
            return;
        }
        w wVar = mVar.m;
        mVar.p(wVar, obj, obj2, 0);
        try {
            zVar.write(123);
            mVar.l();
            if ((zVar.n & a0.WriteClassName.z) == 0 || z2) {
                z = true;
            } else {
                zVar.j(mVar.f2517a.f2538c, false);
                zVar.p(obj.getClass().getName());
                z = false;
            }
            Class<?> cls2 = null;
            t tVar = null;
            for (Map.Entry<String, Object> entry : treeMap.entrySet()) {
                Object value = entry.getValue();
                String key = entry.getKey();
                if (mVar.b(obj, key) && mVar.a(obj, key, value) && ((objO = m.o(mVar, obj, (objN = mVar.n(obj, key, value)), value)) != null || (zVar.n & a0.WriteMapNullValue.z) != 0)) {
                    if (objN instanceof String) {
                        String str = (String) objN;
                        if (!z) {
                            zVar.write(44);
                        }
                        if ((zVar.n & a0.PrettyFormat.z) != 0) {
                            mVar.m();
                        }
                        zVar.j(str, true);
                    } else {
                        if (!z) {
                            zVar.write(44);
                        }
                        if ((zVar.n & a0.WriteNonStringKeyAsString.z) == 0 || (objN instanceof Enum)) {
                            mVar.r(objN);
                        } else {
                            mVar.s(c.a.a.a.l(objN));
                        }
                        zVar.write(58);
                    }
                    if (objO == null) {
                        zVar.o();
                    } else {
                        Class<?> cls3 = objO.getClass();
                        if (cls3 == cls2) {
                            tVar.a(mVar, objO, objN, null);
                        } else {
                            t tVarA = mVar.f2517a.a(cls3);
                            tVarA.a(mVar, objO, objN, null);
                            tVar = tVarA;
                            cls2 = cls3;
                        }
                    }
                    z = false;
                }
            }
            mVar.m = wVar;
            mVar.d();
            if ((zVar.n & a0.PrettyFormat.z) != 0 && treeMap.size() > 0) {
                mVar.m();
            }
            zVar.write(125);
        } catch (Throwable th) {
            mVar.m = wVar;
            throw th;
        }
    }
}
