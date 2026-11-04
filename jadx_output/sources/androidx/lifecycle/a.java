package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static a f2085a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<Class<?>, C0054a> f2086b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, Boolean> f2087c = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    static class C0054a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map<d.b, List<b>> f2088a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map<b, d.b> f2089b;

        C0054a(Map<b, d.b> map) {
            this.f2089b = map;
            for (Map.Entry<b, d.b> entry : map.entrySet()) {
                d.b value = entry.getValue();
                List<b> arrayList = this.f2088a.get(value);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.f2088a.put(value, arrayList);
                }
                arrayList.add(entry.getKey());
            }
        }

        private static void b(List<b> list, g gVar, d.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.get(size).a(gVar, bVar, obj);
                }
            }
        }

        void a(g gVar, d.b bVar, Object obj) {
            b(this.f2088a.get(bVar), gVar, bVar, obj);
            b(this.f2088a.get(d.b.ON_ANY), gVar, bVar, obj);
        }
    }

    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Method f2091b;

        b(int i, Method method) {
            this.f2090a = i;
            this.f2091b = method;
            method.setAccessible(true);
        }

        void a(g gVar, d.b bVar, Object obj) {
            try {
                int i = this.f2090a;
                if (i == 0) {
                    this.f2091b.invoke(obj, new Object[0]);
                } else if (i == 1) {
                    this.f2091b.invoke(obj, gVar);
                } else {
                    if (i != 2) {
                        return;
                    }
                    this.f2091b.invoke(obj, gVar, bVar);
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("Failed to call observer method", e3.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f2090a == bVar.f2090a && this.f2091b.getName().equals(bVar.f2091b.getName());
        }

        public int hashCode() {
            return (this.f2090a * 31) + this.f2091b.getName().hashCode();
        }
    }

    a() {
    }

    private C0054a a(Class<?> cls, Method[] methodArr) {
        int i;
        C0054a c0054aC;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (c0054aC = c(superclass)) != null) {
            map.putAll(c0054aC.f2089b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, d.b> entry : c(cls2).f2089b.entrySet()) {
                e(map, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(g.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                d.b bVarValue = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != d.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new b(i, method), bVarValue, cls);
                z = true;
            }
        }
        C0054a c0054a = new C0054a(map);
        this.f2086b.put(cls, c0054a);
        this.f2087c.put(cls, Boolean.valueOf(z));
        return c0054a;
    }

    private Method[] b(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e2) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
        }
    }

    private void e(Map<b, d.b> map, b bVar, d.b bVar2, Class<?> cls) {
        d.b bVar3 = map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f2091b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }

    C0054a c(Class<?> cls) {
        C0054a c0054a = this.f2086b.get(cls);
        return c0054a != null ? c0054a : a(cls, null);
    }

    boolean d(Class<?> cls) {
        Boolean bool = this.f2087c.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f2087c.put(cls, Boolean.FALSE);
        return false;
    }
}
