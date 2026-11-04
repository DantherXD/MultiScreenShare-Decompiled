package c.a.a;

import c.a.a.i.m;
import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class e extends a implements Map<String, Object>, Cloneable, Serializable, InvocationHandler {
    private final Map<String, Object> g;

    public e() {
        this(16, false);
    }

    public e(int i, boolean z) {
        this.g = z ? new LinkedHashMap<>(i) : new HashMap<>(i);
    }

    public e(Map<String, Object> map) {
        this.g = map;
    }

    public e(boolean z) {
        this(16, z);
    }

    @Override // java.util.Map
    public void clear() {
        this.g.clear();
    }

    public Object clone() {
        return new e(new LinkedHashMap(this.g));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.g.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.g.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, Object>> entrySet() {
        return this.g.entrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return this.g.equals(obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.g.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.g.hashCode();
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        String strSubstring;
        StringBuilder sb;
        Class<?>[] parameterTypes = method.getParameterTypes();
        String string = null;
        if (parameterTypes.length == 1) {
            if (method.getName().equals("equals")) {
                return Boolean.valueOf(equals(objArr[0]));
            }
            if (method.getReturnType() != Void.TYPE) {
                throw new d("illegal setter");
            }
            c.a.a.h.b bVar = (c.a.a.h.b) method.getAnnotation(c.a.a.h.b.class);
            String strName = (bVar == null || bVar.name().length() == 0) ? null : bVar.name();
            if (strName == null) {
                String name = method.getName();
                if (!name.startsWith("set")) {
                    throw new d("illegal setter");
                }
                String strSubstring2 = name.substring(3);
                if (strSubstring2.length() == 0) {
                    throw new d("illegal setter");
                }
                strName = Character.toLowerCase(strSubstring2.charAt(0)) + strSubstring2.substring(1);
            }
            this.g.put(strName, objArr[0]);
            return null;
        }
        if (parameterTypes.length != 0) {
            throw new UnsupportedOperationException(method.toGenericString());
        }
        if (method.getReturnType() == Void.TYPE) {
            throw new d("illegal getter");
        }
        c.a.a.h.b bVar2 = (c.a.a.h.b) method.getAnnotation(c.a.a.h.b.class);
        if (bVar2 != null && bVar2.name().length() != 0) {
            string = bVar2.name();
        }
        if (string == null) {
            String name2 = method.getName();
            if (name2.startsWith("get")) {
                strSubstring = name2.substring(3);
                if (strSubstring.length() == 0) {
                    throw new d("illegal getter");
                }
                sb = new StringBuilder();
            } else {
                if (!name2.startsWith("is")) {
                    if (name2.startsWith("hashCode")) {
                        return Integer.valueOf(hashCode());
                    }
                    if (name2.startsWith("toString")) {
                        return toString();
                    }
                    throw new d("illegal getter");
                }
                strSubstring = name2.substring(2);
                if (strSubstring.length() == 0) {
                    throw new d("illegal getter");
                }
                sb = new StringBuilder();
            }
            sb.append(Character.toLowerCase(strSubstring.charAt(0)));
            sb.append(strSubstring.substring(1));
            string = sb.toString();
        }
        return c.a.a.k.d.e(this.g.get(string), method.getGenericReturnType(), m.f2474b);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.g.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.g.keySet();
    }

    public Map<String, Object> n() {
        return this.g;
    }

    public String o(String str) {
        Object obj = get(str);
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Object put(String str, Object obj) {
        return this.g.put(str, obj);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends Object> map) {
        this.g.putAll(map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T q(Class<T> cls, m mVar, int i) {
        if (cls == Map.class) {
            return this;
        }
        return (cls != Object.class || containsKey("@type")) ? (T) c.a.a.k.d.q(this, cls, mVar, i) : this;
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.g.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.g.size();
    }

    @Override // java.util.Map
    public Collection<Object> values() {
        return this.g.values();
    }
}
