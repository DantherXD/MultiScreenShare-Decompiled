package c.a.a.k;

import c.a.a.e;
import c.a.a.i.g;
import c.a.a.i.m;
import c.a.a.i.q.f;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.AccessControlException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f2559a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f2560b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile Class f2561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile boolean f2562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile boolean f2563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static volatile Constructor f2564f;
    private static volatile Method g;
    private static volatile Method h;
    private static volatile Method i;
    private static volatile boolean j;
    private static volatile Map<Class, String[]> k;
    private static volatile boolean l;
    private static final ConcurrentMap<String, Class<?>> m;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(36, 0.75f, 1);
        m = concurrentHashMap;
        concurrentHashMap.put("byte", Byte.TYPE);
        concurrentHashMap.put("short", Short.TYPE);
        concurrentHashMap.put("int", Integer.TYPE);
        concurrentHashMap.put("long", Long.TYPE);
        concurrentHashMap.put("float", Float.TYPE);
        concurrentHashMap.put("double", Double.TYPE);
        concurrentHashMap.put("boolean", Boolean.TYPE);
        concurrentHashMap.put("char", Character.TYPE);
        concurrentHashMap.put("[byte", byte[].class);
        concurrentHashMap.put("[short", short[].class);
        concurrentHashMap.put("[int", int[].class);
        concurrentHashMap.put("[long", long[].class);
        concurrentHashMap.put("[float", float[].class);
        concurrentHashMap.put("[double", double[].class);
        concurrentHashMap.put("[boolean", boolean[].class);
        concurrentHashMap.put("[char", char[].class);
        concurrentHashMap.put("[B", byte[].class);
        concurrentHashMap.put("[S", short[].class);
        concurrentHashMap.put("[I", int[].class);
        concurrentHashMap.put("[J", long[].class);
        concurrentHashMap.put("[F", float[].class);
        concurrentHashMap.put("[D", double[].class);
        concurrentHashMap.put("[C", char[].class);
        concurrentHashMap.put("[Z", boolean[].class);
        concurrentHashMap.put("java.util.HashMap", HashMap.class);
        concurrentHashMap.put("java.util.TreeMap", TreeMap.class);
        concurrentHashMap.put("java.util.Date", Date.class);
        concurrentHashMap.put("com.alibaba.fastjson.JSONObject", e.class);
        concurrentHashMap.put("java.util.concurrent.ConcurrentHashMap", ConcurrentHashMap.class);
        concurrentHashMap.put("java.text.SimpleDateFormat", SimpleDateFormat.class);
        concurrentHashMap.put("java.lang.StackTraceElement", StackTraceElement.class);
        concurrentHashMap.put("java.lang.RuntimeException", RuntimeException.class);
    }

    public static Class<?> A(String str) {
        return m.get(str);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003a  */
    public static Type B(Type type) {
        Type typeB;
        if (type instanceof ParameterizedType) {
            typeB = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (typeB instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) typeB).getUpperBounds();
                if (upperBounds.length == 1) {
                    typeB = upperBounds[0];
                }
            }
        } else if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.getName().startsWith("java.")) {
                typeB = null;
            } else {
                typeB = B(cls.getGenericSuperclass());
            }
        } else {
            typeB = null;
        }
        return typeB == null ? Object.class : typeB;
    }

    public static Field C(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        Field fieldD = D(cls, str, fieldArr, map);
        if (fieldD == null) {
            fieldD = D(cls, "_" + str, fieldArr, map);
        }
        if (fieldD == null) {
            fieldD = D(cls, "m_" + str, fieldArr, map);
        }
        if (fieldD != null) {
            return fieldD;
        }
        return D(cls, "m" + str.substring(0, 1).toUpperCase() + str.substring(1), fieldArr, map);
    }

    private static Field D(Class<?> cls, String str, Field[] fieldArr, Map<Class<?>, Field[]> map) {
        char cCharAt;
        char cCharAt2;
        for (Field field : fieldArr) {
            String name = field.getName();
            if (str.equals(name)) {
                return field;
            }
            if (str.length() > 2 && (cCharAt = str.charAt(0)) >= 'a' && cCharAt <= 'z' && (cCharAt2 = str.charAt(1)) >= 'A' && cCharAt2 <= 'Z' && str.equalsIgnoreCase(name)) {
                return field;
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            return null;
        }
        Field[] declaredFields = map != null ? map.get(superclass) : null;
        if (declaredFields == null) {
            declaredFields = superclass.getDeclaredFields();
            if (map != null) {
                map.put(superclass, declaredFields);
            }
        }
        return C(superclass, str, declaredFields, map);
    }

    public static Type E(Type type) {
        return type instanceof Class ? E(((Class) type).getGenericSuperclass()) : type;
    }

    public static String[] F(Class cls) {
        if (f2564f == null && !f2563e) {
            try {
                Class<?> cls2 = Class.forName("kotlin.reflect.jvm.internal.KClassImpl");
                f2564f = cls2.getConstructor(Class.class);
                g = cls2.getMethod("getConstructors", new Class[0]);
                h = Class.forName("e.h.a").getMethod("getParameters", new Class[0]);
                i = Class.forName("e.h.b").getMethod("getName", new Class[0]);
            } catch (Throwable unused) {
                f2563e = true;
            }
        }
        if (f2564f == null || j) {
            return null;
        }
        try {
            Iterator it = ((Iterable) g.invoke(f2564f.newInstance(cls), new Object[0])).iterator();
            Object obj = null;
            while (it.hasNext()) {
                Object next = it.next();
                List list = (List) h.invoke(next, new Object[0]);
                if (obj == null || list.size() != 0) {
                    obj = next;
                }
                it.hasNext();
            }
            List list2 = (List) h.invoke(obj, new Object[0]);
            String[] strArr = new String[list2.size()];
            for (int i2 = 0; i2 < list2.size(); i2++) {
                strArr[i2] = (String) i.invoke(list2.get(i2), new Object[0]);
            }
            return strArr;
        } catch (Throwable unused2) {
            j = true;
            return null;
        }
    }

    public static c.a.a.h.b G(Class<?> cls, Method method) {
        boolean z;
        c.a.a.h.b bVar;
        boolean z2;
        c.a.a.h.b bVar2;
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Method method2 : cls2.getMethods()) {
                if (method2.getName().equals(method.getName())) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    if (parameterTypes.length != parameterTypes2.length) {
                        continue;
                    } else {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= parameterTypes.length) {
                                z2 = true;
                                break;
                            }
                            if (!parameterTypes[i2].equals(parameterTypes2[i2])) {
                                z2 = false;
                                break;
                            }
                            i2++;
                        }
                        if (z2 && (bVar2 = (c.a.a.h.b) method2.getAnnotation(c.a.a.h.b.class)) != null) {
                            return bVar2;
                        }
                    }
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        if (superclass != null && Modifier.isAbstract(superclass.getModifiers())) {
            Class<?>[] parameterTypes3 = method.getParameterTypes();
            for (Method method3 : superclass.getMethods()) {
                Class<?>[] parameterTypes4 = method3.getParameterTypes();
                if (parameterTypes4.length == parameterTypes3.length && method3.getName().equals(method.getName())) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= parameterTypes3.length) {
                            z = true;
                            break;
                        }
                        if (!parameterTypes4[i3].equals(parameterTypes3[i3])) {
                            z = false;
                            break;
                        }
                        i3++;
                    }
                    if (z && (bVar = (c.a.a.h.b) method3.getAnnotation(c.a.a.h.b.class)) != null) {
                        return bVar;
                    }
                }
            }
        }
        return null;
    }

    public static boolean H(Type type) {
        if (type instanceof ParameterizedType) {
            return true;
        }
        if (!(type instanceof Class)) {
            return false;
        }
        Type genericSuperclass = ((Class) type).getGenericSuperclass();
        return genericSuperclass != Object.class && H(genericSuperclass);
    }

    private static boolean I(Class<?> cls, c.a.a.h.c cVar, String str) {
        if (cVar != null && cVar.ignores() != null) {
            for (String str2 : cVar.ignores()) {
                if (str.equalsIgnoreCase(str2)) {
                    return true;
                }
            }
        }
        Class<? super Object> superclass = cls.getSuperclass();
        return (superclass == Object.class || superclass == null || !I(superclass, (c.a.a.h.c) superclass.getAnnotation(c.a.a.h.c.class), str)) ? false : true;
    }

    public static boolean J(Class cls) {
        if (f2561c == null && !f2562d) {
            try {
                f2561c = Class.forName("e.c");
            } catch (Throwable unused) {
                f2562d = true;
            }
        }
        if (f2561c == null) {
            return false;
        }
        return cls.isAnnotationPresent(f2561c);
    }

    private static boolean K(Class cls, String str) {
        String[] strArr;
        if (k == null && !l) {
            try {
                HashMap map = new HashMap();
                map.put(Class.forName("e.g.c"), new String[]{"getEndInclusive", "isEmpty"});
                map.put(Class.forName("e.g.h"), new String[]{"getEndInclusive", "isEmpty"});
                map.put(Class.forName("e.g.k"), new String[]{"getEndInclusive", "isEmpty"});
                map.put(Class.forName("e.g.e"), new String[]{"getEndInclusive", "isEmpty"});
                map.put(Class.forName("e.g.d"), new String[]{"getEndInclusive", "isEmpty"});
                k = map;
            } catch (Throwable unused) {
                l = true;
            }
        }
        return (k == null || (strArr = k.get(cls)) == null || Arrays.binarySearch(strArr, str) < 0) ? false : true;
    }

    public static Class<?> L(String str, ClassLoader classLoader, boolean z) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.length() >= 256) {
            throw new c.a.a.d("className too long. " + str);
        }
        ConcurrentMap<String, Class<?>> concurrentMap = m;
        Class<?> cls = concurrentMap.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.charAt(0) == '[') {
            Class<?> clsL = L(str.substring(1), classLoader, false);
            if (clsL == null) {
                return null;
            }
            return Array.newInstance(clsL, 0).getClass();
        }
        if (str.startsWith("L") && str.endsWith(";")) {
            return L(str.substring(1, str.length() - 1), classLoader, false);
        }
        if (classLoader != null) {
            try {
                cls = classLoader.loadClass(str);
                if (z) {
                    concurrentMap.put(str, cls);
                }
                return cls;
            } catch (Exception unused) {
            }
        }
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader != null && contextClassLoader != classLoader) {
                Class<?> clsLoadClass = contextClassLoader.loadClass(str);
                if (z) {
                    try {
                        m.put(str, clsLoadClass);
                    } catch (Exception unused2) {
                        cls = clsLoadClass;
                    }
                }
                return clsLoadClass;
            }
        } catch (Exception unused3) {
        }
        try {
            cls = Class.forName(str);
            m.put(str, cls);
            return cls;
        } catch (Exception unused4) {
            return cls;
        }
    }

    public static double M(String str) {
        double d2;
        double d3;
        int length = str.length();
        if (length > 10) {
            return Double.parseDouble(str);
        }
        long j2 = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '-' && i3 == 0) {
                z = true;
            } else if (cCharAt == '.') {
                if (i2 != 0) {
                    return Double.parseDouble(str);
                }
                i2 = (length - i3) - 1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    return Double.parseDouble(str);
                }
                j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            }
        }
        if (z) {
            j2 = -j2;
        }
        switch (i2) {
            case 0:
                return j2;
            case 1:
                d2 = j2;
                d3 = 10.0d;
                break;
            case 2:
                d2 = j2;
                d3 = 100.0d;
                break;
            case 3:
                d2 = j2;
                d3 = 1000.0d;
                break;
            case 4:
                d2 = j2;
                d3 = 10000.0d;
                break;
            case 5:
                d2 = j2;
                d3 = 100000.0d;
                break;
            case 6:
                d2 = j2;
                d3 = 1000000.0d;
                break;
            case 7:
                d2 = j2;
                d3 = 1.0E7d;
                break;
            case 8:
                d2 = j2;
                d3 = 1.0E8d;
                break;
            case 9:
                d2 = j2;
                d3 = 1.0E9d;
                break;
            default:
                return Double.parseDouble(str);
        }
        return d2 / d3;
    }

    public static float N(String str) {
        float f2;
        float f3;
        int length = str.length();
        if (length >= 10) {
            return Float.parseFloat(str);
        }
        long j2 = 0;
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt == '-' && i3 == 0) {
                z = true;
            } else if (cCharAt == '.') {
                if (i2 != 0) {
                    return Float.parseFloat(str);
                }
                i2 = (length - i3) - 1;
            } else {
                if (cCharAt < '0' || cCharAt > '9') {
                    return Float.parseFloat(str);
                }
                j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            }
        }
        if (z) {
            j2 = -j2;
        }
        switch (i2) {
            case 0:
                return j2;
            case 1:
                f2 = j2;
                f3 = 10.0f;
                break;
            case 2:
                f2 = j2;
                f3 = 100.0f;
                break;
            case 3:
                f2 = j2;
                f3 = 1000.0f;
                break;
            case 4:
                f2 = j2;
                f3 = 10000.0f;
                break;
            case 5:
                f2 = j2;
                f3 = 100000.0f;
                break;
            case 6:
                f2 = j2;
                f3 = 1000000.0f;
                break;
            case 7:
                f2 = j2;
                f3 = 1.0E7f;
                break;
            case 8:
                f2 = j2;
                f3 = 1.0E8f;
                break;
            case 9:
                f2 = j2;
                f3 = 1.0E9f;
                break;
            default:
                return Float.parseFloat(str);
        }
        return f2 / f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean O(Class<?> cls, Member member, int i2) {
        if (member != 0 && f2560b) {
            Class<? super Object> superclass = cls.getSuperclass();
            if ((superclass == null || superclass == Object.class) && (member.getModifiers() & 1) != 0 && (i2 & 1) != 0) {
                return false;
            }
            try {
                ((AccessibleObject) member).setAccessible(true);
                return true;
            } catch (AccessControlException unused) {
                f2560b = false;
            }
        }
        return false;
    }

    public static void a(String str, Class<?> cls) {
        m.put(str, cls);
    }

    public static final <T> T b(Object obj, Class<T> cls, m mVar) {
        return (T) c(obj, cls, mVar, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T c(Object obj, Class<T> cls, m mVar, int i2) {
        Object obj2;
        if (obj == 0) {
            return null;
        }
        if (cls == null) {
            throw new IllegalArgumentException("clazz is null");
        }
        if (cls == obj.getClass()) {
            return obj;
        }
        if (obj instanceof Map) {
            if (cls == Map.class) {
                return obj;
            }
            Map map = (Map) obj;
            return (cls != Object.class || map.containsKey("@type")) ? (T) q(map, cls, mVar, i2) : obj;
        }
        int i3 = 0;
        if (cls.isArray()) {
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                T t = (T) Array.newInstance(cls.getComponentType(), collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Array.set(t, i3, b(it.next(), cls.getComponentType(), mVar));
                    i3++;
                }
                return t;
            }
            if (cls == byte[].class) {
                return (T) j(obj);
            }
        }
        if (cls.isAssignableFrom(obj.getClass())) {
            return obj;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return (T) h(obj);
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return (T) i(obj);
        }
        if ((cls == Character.TYPE || cls == Character.class) && (obj instanceof String)) {
            String str = (String) obj;
            if (str.length() == 1) {
                return (T) Character.valueOf(str.charAt(0));
            }
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return (T) s(obj);
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return (T) p(obj);
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return (T) r(obj);
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return (T) o(obj);
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return (T) m(obj);
        }
        if (cls == String.class) {
            return (T) t(obj);
        }
        if (cls == BigDecimal.class) {
            return (T) f(obj);
        }
        if (cls == BigInteger.class) {
            return (T) g(obj);
        }
        if (cls == Date.class) {
            return (T) l(obj);
        }
        if (cls.isEnum()) {
            return (T) n(obj, cls, mVar);
        }
        if (Calendar.class.isAssignableFrom(cls)) {
            Date dateL = l(obj);
            if (cls == Calendar.class) {
                obj2 = (T) Calendar.getInstance(c.a.a.a.f2416b, c.a.a.a.f2417c);
            } else {
                try {
                    obj2 = (T) ((Calendar) cls.newInstance());
                } catch (Exception e2) {
                    throw new c.a.a.d("can not cast to : " + cls.getName(), e2);
                }
            }
            ((Calendar) obj2).setTime(dateL);
            return (T) obj2;
        }
        if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.length() == 0 || "null".equals(str2)) {
                return null;
            }
            if (cls == Currency.class) {
                return (T) Currency.getInstance(str2);
            }
        }
        throw new c.a.a.d("can not cast to : " + cls.getName());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v9, types: [T, java.util.HashMap, java.util.Map] */
    public static final <T> T d(Object obj, ParameterizedType parameterizedType, m mVar) {
        if (obj == 0) {
            return obj;
        }
        Type rawType = parameterizedType.getRawType();
        if (rawType == List.class || rawType == ArrayList.class) {
            Type type = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof List) {
                List list = (List) obj;
                int size = list.size();
                ?? r0 = (T) new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    r0.add(type instanceof Class ? (obj2 == null || obj2.getClass() != e.class) ? c(obj2, (Class) type, mVar, 0) : ((e) obj2).q((Class) type, mVar, 0) : e(obj2, type, mVar));
                }
                return r0;
            }
        }
        if (rawType == Set.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == List.class || rawType == ArrayList.class) {
            Type type2 = parameterizedType.getActualTypeArguments()[0];
            if (obj instanceof Iterable) {
                T t = (rawType == Set.class || rawType == HashSet.class) ? (T) new HashSet() : rawType == TreeSet.class ? (T) new TreeSet() : (T) new ArrayList();
                Iterator<T> it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    T next = it.next();
                    ((Collection) t).add(type2 instanceof Class ? (next == null || next.getClass() != e.class) ? c(next, (Class) type2, mVar, 0) : ((e) next).q((Class) type2, mVar, 0) : e(next, type2, mVar));
                }
                return t;
            }
        }
        if (rawType == Map.class || rawType == HashMap.class) {
            Type type3 = parameterizedType.getActualTypeArguments()[0];
            Type type4 = parameterizedType.getActualTypeArguments()[1];
            if (obj instanceof Map) {
                ?? r8 = (T) new HashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    r8.put(e(entry.getKey(), type3, mVar), e(entry.getValue(), type4, mVar));
                }
                return r8;
            }
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (parameterizedType.getActualTypeArguments().length == 1 && (parameterizedType.getActualTypeArguments()[0] instanceof WildcardType)) {
            return (T) e(obj, rawType, mVar);
        }
        throw new c.a.a.d("can not cast to : " + parameterizedType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T e(Object obj, Type type, m mVar) {
        if (obj == 0) {
            return null;
        }
        if (type instanceof Class) {
            return (T) c(obj, (Class) type, mVar, 0);
        }
        if (type instanceof ParameterizedType) {
            return (T) d(obj, (ParameterizedType) type, mVar);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
        }
        if (type instanceof TypeVariable) {
            return obj;
        }
        throw new c.a.a.d("can not cast to : " + type);
    }

    public static final BigDecimal f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        if (obj instanceof BigInteger) {
            return new BigDecimal((BigInteger) obj);
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigDecimal(string);
    }

    public static final BigInteger g(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return BigInteger.valueOf(((Number) obj).longValue());
        }
        String string = obj.toString();
        if (string.length() == 0 || "null".equals(string)) {
            return null;
        }
        return new BigInteger(string);
    }

    public static final Boolean h(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof BigDecimal) {
            return Boolean.valueOf(((BigDecimal) obj).intValueExact() == 1);
        }
        if (obj instanceof Number) {
            return Boolean.valueOf(((Number) obj).intValue() == 1);
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            if ("true".equalsIgnoreCase(str) || "1".equals(str)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(str) || "0".equals(str)) {
                return Boolean.FALSE;
            }
        }
        throw new c.a.a.d("can not cast to int, value : " + obj);
    }

    public static final Byte i(Object obj) {
        byte bByteValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            bByteValue = ((Number) obj).byteValue();
        } else {
            if (!(obj instanceof String)) {
                throw new c.a.a.d("can not cast to byte, value : " + obj);
            }
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            bByteValue = Byte.parseByte(str);
        }
        return Byte.valueOf(bByteValue);
    }

    public static final byte[] j(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            return c.a.a.i.e.h(str, 0, str.length());
        }
        throw new c.a.a.d("can not cast to int, value : " + obj);
    }

    public static final Character k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Character) {
            return (Character) obj;
        }
        if (!(obj instanceof String)) {
            throw new c.a.a.d("can not cast to byte, value : " + obj);
        }
        String str = (String) obj;
        if (str.length() == 0) {
            return null;
        }
        if (str.length() == 1) {
            return Character.valueOf(str.charAt(0));
        }
        throw new c.a.a.d("can not cast to byte, value : " + obj);
    }

    public static final Date l(Object obj) {
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Calendar) {
            return ((Calendar) obj).getTime();
        }
        if (obj instanceof Date) {
            return (Date) obj;
        }
        long jLongValue = -1;
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            jLongValue = (iScale < -100 || iScale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
        } else if (obj instanceof Number) {
            jLongValue = ((Number) obj).longValue();
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            if (str2.indexOf(45) != -1) {
                if (str2.length() == c.a.a.a.f2419e.length()) {
                    str = c.a.a.a.f2419e;
                } else if (str2.length() == 10) {
                    str = "yyyy-MM-dd";
                } else if (str2.length() == 19) {
                    str = "yyyy-MM-dd HH:mm:ss";
                } else {
                    str = (str2.length() == 29 && str2.charAt(26) == ':' && str2.charAt(28) == '0') ? "yyyy-MM-dd'T'HH:mm:ss.SSSXXX" : "yyyy-MM-dd HH:mm:ss.SSS";
                }
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, c.a.a.a.f2417c);
                simpleDateFormat.setTimeZone(c.a.a.a.f2416b);
                try {
                    return simpleDateFormat.parse(str2);
                } catch (ParseException unused) {
                    throw new c.a.a.d("can not cast to Date, value : " + str2);
                }
            }
            if (str2.length() == 0 || "null".equals(str2)) {
                return null;
            }
            jLongValue = Long.parseLong(str2);
        }
        if (jLongValue >= 0) {
            return new Date(jLongValue);
        }
        throw new c.a.a.d("can not cast to Date, value : " + obj);
    }

    public static final Double m(Object obj) {
        double dDoubleValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            dDoubleValue = ((Number) obj).doubleValue();
        } else {
            if (!(obj instanceof String)) {
                throw new c.a.a.d("can not cast to double, value : " + obj);
            }
            String string = obj.toString();
            if (string.length() == 0 || "null".equals(string) || "NULL".equals(string)) {
                return null;
            }
            dDoubleValue = Double.parseDouble(string);
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final <T> T n(Object obj, Class<T> cls, m mVar) {
        try {
            if (obj instanceof String) {
                String str = (String) obj;
                if (str.length() == 0) {
                    return null;
                }
                return (T) Enum.valueOf(cls, str);
            }
            if ((obj instanceof Integer) || (obj instanceof Long)) {
                int iIntValue = ((Number) obj).intValue();
                T[] enumConstants = cls.getEnumConstants();
                if (iIntValue < enumConstants.length) {
                    return enumConstants[iIntValue];
                }
            }
            throw new c.a.a.d("can not cast to : " + cls.getName());
        } catch (Exception e2) {
            throw new c.a.a.d("can not cast to : " + cls.getName(), e2);
        }
    }

    public static final Float o(Object obj) {
        float fFloatValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            fFloatValue = ((Number) obj).floatValue();
        } else {
            if (!(obj instanceof String)) {
                throw new c.a.a.d("can not cast to float, value : " + obj);
            }
            String string = obj.toString();
            if (string.length() == 0 || "null".equals(string)) {
                return null;
            }
            fFloatValue = Float.parseFloat(string);
        }
        return Float.valueOf(fFloatValue);
    }

    public static final Integer p(Object obj) {
        int iIntValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            iIntValue = (iScale < -100 || iScale > 100) ? bigDecimal.intValueExact() : bigDecimal.intValue();
        } else if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        } else {
            if (!(obj instanceof String)) {
                throw new c.a.a.d("can not cast to int, value : " + obj);
            }
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            iIntValue = Integer.parseInt(str);
        }
        return Integer.valueOf(iIntValue);
    }

    public static final <T> T q(Map<String, Object> map, Class<T> cls, m mVar, int i2) {
        int iIntValueExact = 0;
        try {
            if (cls == StackTraceElement.class) {
                String str = (String) map.get("className");
                String str2 = (String) map.get("methodName");
                String str3 = (String) map.get("fileName");
                Number number = (Number) map.get("lineNumber");
                if (number != null) {
                    iIntValueExact = number instanceof BigDecimal ? ((BigDecimal) number).intValueExact() : number.intValue();
                }
                return (T) new StackTraceElement(str, str2, str3, iIntValueExact);
            }
            Object obj = map.get("@type");
            if (obj instanceof String) {
                String str4 = (String) obj;
                if (mVar == null) {
                    mVar = m.f2474b;
                }
                Class<?> clsA = mVar.a(str4, null, i2);
                if (clsA == null) {
                    throw new ClassNotFoundException(str4 + " not found");
                }
                if (!clsA.equals(cls)) {
                    return (T) q(map, clsA, mVar, i2);
                }
            }
            if (cls.isInterface()) {
                e eVar = map instanceof e ? (e) map : new e(map);
                if (mVar == null) {
                    mVar = m.e();
                }
                return mVar.d(cls) != null ? (T) c.a.a.a.f(c.a.a.a.l(eVar), cls) : (T) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls}, eVar);
            }
            if (cls == String.class && (map instanceof e)) {
                return (T) map.toString();
            }
            if (mVar == null) {
                mVar = m.f2474b;
            }
            f fVarD = mVar.d(cls);
            g gVar = fVarD instanceof g ? (g) fVarD : null;
            if (gVar != null) {
                return (T) gVar.c(map, mVar);
            }
            throw new c.a.a.d("can not get javaBeanDeserializer");
        } catch (Exception e2) {
            throw new c.a.a.d(e2.getMessage(), e2);
        }
    }

    public static final Long r(Object obj) {
        long timeInMillis;
        if (obj == null) {
            return null;
        }
        if (obj instanceof BigDecimal) {
            BigDecimal bigDecimal = (BigDecimal) obj;
            int iScale = bigDecimal.scale();
            timeInMillis = (iScale < -100 || iScale > 100) ? bigDecimal.longValueExact() : bigDecimal.longValue();
        } else {
            if (!(obj instanceof Number)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() == 0 || "null".equals(str)) {
                        return null;
                    }
                    try {
                        return Long.valueOf(Long.parseLong(str));
                    } catch (NumberFormatException unused) {
                        c.a.a.i.e eVar = new c.a.a.i.e(str);
                        Calendar calendar = eVar.L(false) ? eVar.v : null;
                        eVar.e();
                        if (calendar != null) {
                            timeInMillis = calendar.getTimeInMillis();
                        }
                    }
                }
                throw new c.a.a.d("can not cast to long, value : " + obj);
            }
            timeInMillis = ((Number) obj).longValue();
        }
        return Long.valueOf(timeInMillis);
    }

    public static final Short s(Object obj) {
        short sShortValue;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            sShortValue = ((Number) obj).shortValue();
        } else {
            if (!(obj instanceof String)) {
                throw new c.a.a.d("can not cast to short, value : " + obj);
            }
            String str = (String) obj;
            if (str.length() == 0 || "null".equals(str)) {
                return null;
            }
            sShortValue = Short.parseShort(str);
        }
        return Short.valueOf(sShortValue);
    }

    public static final String t(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj.toString();
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 15371. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static java.util.List<c.a.a.k.a> u(java.lang.Class<?> r42, int r43, boolean r44, c.a.a.h.c r45, java.util.Map<java.lang.String, java.lang.String> r46, boolean r47, boolean r48, boolean r49, c.a.a.g r50) {
        /*
            Method dump skipped, instruction units count: 1537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.k.d.u(java.lang.Class, int, boolean, c.a.a.h.c, java.util.Map, boolean, boolean, boolean, c.a.a.g):java.util.List");
    }

    public static String v(String str) {
        if (str == null || str.length() == 0 || (str.length() > 1 && Character.isUpperCase(str.charAt(1)) && Character.isUpperCase(str.charAt(0)))) {
            return str;
        }
        char[] charArray = str.toCharArray();
        charArray[0] = Character.toLowerCase(charArray[0]);
        return new String(charArray);
    }

    public static Object w(Class<?> cls) {
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Float.TYPE) {
            return Float.valueOf(0.0f);
        }
        if (cls == Double.TYPE) {
            return Double.valueOf(0.0d);
        }
        if (cls == Boolean.TYPE) {
            return Boolean.FALSE;
        }
        return cls == Character.TYPE ? '0' : null;
    }

    public static long x(String str) {
        if (str == null) {
            return 0L;
        }
        long j2 = -3750763034362895579L;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt != '_' && cCharAt != '-') {
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                }
                j2 = (j2 ^ ((long) cCharAt)) * 1099511628211L;
            }
        }
        return j2;
    }

    public static boolean y(Type[] typeArr, TypeVariable[] typeVariableArr, Type[] typeArr2) {
        if (typeArr2 == null || typeVariableArr.length == 0) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            Type type = typeArr[i2];
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                if (y(actualTypeArguments, typeVariableArr, typeArr2)) {
                    typeArr[i2] = new c(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
                    z = true;
                }
            } else if (type instanceof TypeVariable) {
                for (int i3 = 0; i3 < typeVariableArr.length; i3++) {
                    if (type.equals(typeVariableArr[i3])) {
                        typeArr[i2] = typeArr2[i3];
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    public static Class<?> z(Type type) {
        if (type.getClass() == Class.class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return z(((ParameterizedType) type).getRawType());
        }
        if (type instanceof TypeVariable) {
            return (Class) ((TypeVariable) type).getBounds()[0];
        }
        if (!(type instanceof WildcardType)) {
            return Object.class;
        }
        Type[] upperBounds = ((WildcardType) type).getUpperBounds();
        return upperBounds.length == 1 ? z(upperBounds[0]) : Object.class;
    }
}
