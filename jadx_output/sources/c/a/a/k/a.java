package c.a.a.k;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* JADX INFO: loaded from: classes.dex */
public class a implements Comparable<a> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f2546c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Field f2547d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2548e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2549f;
    private int g;
    public final Class<?> h;
    public final Type i;
    public final Class<?> j;
    public final boolean k;
    private final c.a.a.h.b l;
    private final c.a.a.h.b m;
    public final boolean n;
    public final String o;
    public final long p;
    public final String[] q;
    public final int r;

    public a(String str, Class<?> cls, Class<?> cls2, Type type, Field field, int i, int i2) {
        this.g = 0;
        i = i < 0 ? 0 : i;
        this.f2545b = str;
        this.j = cls;
        this.h = cls2;
        this.i = type;
        this.f2546c = null;
        this.f2547d = field;
        this.g = i;
        this.r = i2;
        this.n = cls2.isEnum() && !c.a.a.c.class.isAssignableFrom(cls2);
        this.l = null;
        this.m = null;
        if (field != null) {
            int modifiers = field.getModifiers();
            int i3 = modifiers & 1;
            this.f2548e = true;
            this.f2549f = Modifier.isTransient(modifiers);
        } else {
            this.f2548e = false;
            this.f2549f = false;
        }
        this.k = false;
        long jCharAt = -3750763034362895579L;
        for (int i4 = 0; i4 < str.length(); i4++) {
            jCharAt = (jCharAt ^ ((long) str.charAt(i4))) * 1099511628211L;
        }
        this.p = jCharAt;
        this.o = null;
        this.q = new String[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7, types: [int] */
    public a(String str, Method method, Field field, Class<?> cls, Type type, int i, int i2, c.a.a.h.b bVar, c.a.a.h.b bVar2, boolean z) {
        String str2;
        boolean z2;
        boolean z3;
        Class<?> type2;
        Type genericReturnType;
        Type type3 = type;
        this.g = 0;
        int i3 = i < 0 ? 0 : i;
        this.f2545b = str;
        this.f2546c = method;
        this.f2547d = field;
        this.g = i3;
        this.m = bVar;
        this.l = bVar2;
        this.r = i2;
        c.a.a.h.b bVarD = d();
        Type type4 = null;
        if (bVarD != null) {
            str2 = bVarD.format();
            str2 = str2.trim().length() == 0 ? null : str2;
            this.q = bVarD.alternateNames();
        } else {
            this.q = new String[0];
            str2 = null;
        }
        this.o = str2;
        if (field != null) {
            int modifiers = field.getModifiers();
            this.f2548e = method == null || ((modifiers & 1) != 0 && method.getReturnType() == field.getType());
            this.f2549f = (modifiers & 128) != 0;
        } else {
            this.f2548e = false;
            this.f2549f = false;
        }
        long jCharAt = -3750763034362895579L;
        for (int i4 = 0; i4 < str.length(); i4++) {
            jCharAt = 1099511628211L * (((long) str.charAt(i4)) ^ jCharAt);
        }
        this.p = jCharAt;
        if (method != null) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 1) {
                z2 = false;
                type2 = parameterTypes[0];
                genericReturnType = (type2 == Class.class || type2 == String.class || type2.isPrimitive() || !z) ? type2 : method.getGenericParameterTypes()[0];
                this.k = false;
                z3 = true;
            } else {
                z2 = false;
                type2 = method.getReturnType();
                genericReturnType = (type2 != Class.class && z) ? method.getGenericReturnType() : type2;
                z3 = true;
                this.k = true;
            }
            this.j = method.getDeclaringClass();
        } else {
            z2 = false;
            z3 = true;
            type2 = field.getType();
            Type genericType = (type2.isPrimitive() || type2 == String.class || type2.isEnum() || !z) ? type2 : field.getGenericType();
            this.j = field.getDeclaringClass();
            this.k = Modifier.isFinal(field.getModifiers());
            genericReturnType = genericType;
        }
        if (cls != null && type2 == Object.class && (genericReturnType instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) genericReturnType;
            Type[] actualTypeArguments = type3 instanceof ParameterizedType ? ((ParameterizedType) type3).getActualTypeArguments() : null;
            for (Class<?> superclass = cls; superclass != null && superclass != Object.class && superclass != this.j; superclass = superclass.getSuperclass()) {
                Type genericSuperclass = superclass.getGenericSuperclass();
                if (genericSuperclass instanceof ParameterizedType) {
                    Type[] actualTypeArguments2 = ((ParameterizedType) genericSuperclass).getActualTypeArguments();
                    d.y(actualTypeArguments2, superclass.getTypeParameters(), actualTypeArguments);
                    actualTypeArguments = actualTypeArguments2;
                }
            }
            if (actualTypeArguments != null) {
                TypeVariable<Class<?>>[] typeParameters = this.j.getTypeParameters();
                for (?? r12 = z2; r12 < typeParameters.length; r12++) {
                    if (typeVariable.equals(typeParameters[r12])) {
                        type4 = actualTypeArguments[r12];
                        break;
                    }
                }
            }
            if (type4 != null) {
                this.h = d.z(type4);
                this.i = type4;
                if (type2.isEnum() && !c.a.a.c.class.isAssignableFrom(type2)) {
                    z2 = z3;
                }
                this.n = z2;
                return;
            }
        }
        if (!(genericReturnType instanceof Class)) {
            Type typeE = e(cls, type3 == null ? cls : type3, genericReturnType);
            if (typeE != genericReturnType && ((typeE instanceof ParameterizedType) || (typeE instanceof Class))) {
                type2 = d.z(typeE);
            }
            genericReturnType = typeE;
        }
        this.i = genericReturnType;
        this.h = type2;
        if (!type2.isArray() && type2.isEnum() && !c.a.a.c.class.isAssignableFrom(type2)) {
            z2 = z3;
        }
        this.n = z2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00be A[SYNTHETIC] */
    public static Type e(Class<?> cls, Type type, Type type2) {
        TypeVariable<Class<?>>[] typeParameters;
        ParameterizedType parameterizedType;
        int i;
        boolean z;
        Type type3;
        TypeVariable typeVariable;
        int i2;
        if (cls != null && type != null) {
            if (type2 instanceof GenericArrayType) {
                Type genericComponentType = ((GenericArrayType) type2).getGenericComponentType();
                Type typeE = e(cls, type, genericComponentType);
                return genericComponentType != typeE ? Array.newInstance(d.z(typeE), 0).getClass() : type2;
            }
            if (!d.H(type)) {
                return type2;
            }
            if (type2 instanceof TypeVariable) {
                ParameterizedType parameterizedType2 = (ParameterizedType) d.E(type);
                Class<?> clsZ = d.z(parameterizedType2);
                TypeVariable typeVariable2 = (TypeVariable) type2;
                for (int i3 = 0; i3 < clsZ.getTypeParameters().length; i3++) {
                    if (clsZ.getTypeParameters()[i3].getName().equals(typeVariable2.getName())) {
                        return parameterizedType2.getActualTypeArguments()[i3];
                    }
                }
            }
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType3 = (ParameterizedType) type2;
                Type[] actualTypeArguments = parameterizedType3.getActualTypeArguments();
                Type[] actualTypeArguments2 = null;
                if (type instanceof ParameterizedType) {
                    parameterizedType = (ParameterizedType) type;
                } else {
                    if (cls.getGenericSuperclass() instanceof ParameterizedType) {
                        parameterizedType = (ParameterizedType) cls.getGenericSuperclass();
                        cls = cls.getSuperclass();
                    } else {
                        typeParameters = null;
                        parameterizedType = null;
                    }
                    z = false;
                    for (i = 0; i < actualTypeArguments.length && parameterizedType != null; i++) {
                        type3 = actualTypeArguments[i];
                        if (type3 instanceof TypeVariable) {
                            typeVariable = (TypeVariable) type3;
                            for (i2 = 0; i2 < typeParameters.length; i2++) {
                                if (!typeParameters[i2].getName().equals(typeVariable.getName())) {
                                    if (actualTypeArguments2 == null) {
                                        actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                                    }
                                    actualTypeArguments[i] = actualTypeArguments2[i2];
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        return new c(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                    }
                }
                typeParameters = cls.getTypeParameters();
                z = false;
                while (i < actualTypeArguments.length) {
                    type3 = actualTypeArguments[i];
                    if (type3 instanceof TypeVariable) {
                        typeVariable = (TypeVariable) type3;
                        while (i2 < typeParameters.length) {
                            if (!typeParameters[i2].getName().equals(typeVariable.getName())) {
                                if (actualTypeArguments2 == null) {
                                    actualTypeArguments2 = parameterizedType.getActualTypeArguments();
                                }
                                actualTypeArguments[i] = actualTypeArguments2[i2];
                                z = true;
                            }
                        }
                    }
                }
                if (z) {
                    return new c(actualTypeArguments, parameterizedType3.getOwnerType(), parameterizedType3.getRawType());
                }
            }
        }
        return type2;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        int i = this.g;
        int i2 = aVar.g;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        return this.f2545b.compareTo(aVar.f2545b);
    }

    public boolean b(a aVar) {
        return aVar == this || compareTo(aVar) == 0;
    }

    public Object c(Object obj) {
        return this.f2548e ? this.f2547d.get(obj) : this.f2546c.invoke(obj, new Object[0]);
    }

    public c.a.a.h.b d() {
        c.a.a.h.b bVar = this.l;
        return bVar != null ? bVar : this.m;
    }

    public void f(Object obj, Object obj2) {
        Method method = this.f2546c;
        if (method != null) {
            method.invoke(obj, obj2);
        } else {
            this.f2547d.set(obj, obj2);
        }
    }

    public String toString() {
        return this.f2545b;
    }
}
