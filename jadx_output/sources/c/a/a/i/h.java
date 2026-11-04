package c.a.a.i;

import c.a.a.j.a0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Constructor<?> f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Constructor<?> f2460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Method f2461d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final c.a.a.k.a[] f2462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final c.a.a.k.a[] f2463f;
    final c.a.a.h.c g;
    boolean h = false;
    final boolean i;
    public final String j;
    public final String k;
    public final long l;
    public final int m;
    public final String[] n;

    h(Class<?> cls, Constructor<?> constructor, Constructor<?> constructor2, Method method, c.a.a.k.a[] aVarArr, c.a.a.k.a[] aVarArr2, c.a.a.h.c cVar, String[] strArr) {
        int i;
        boolean z;
        int length = 0;
        this.f2458a = constructor;
        this.f2460c = constructor2;
        this.f2461d = method;
        this.f2462e = aVarArr;
        this.g = cVar;
        if (strArr == null || strArr.length != aVarArr.length) {
            this.n = strArr;
        } else {
            this.n = null;
        }
        if (cVar != null) {
            String strTypeName = cVar.typeName();
            this.j = strTypeName.length() <= 0 ? cls.getName() : strTypeName;
            String strTypeKey = cVar.typeKey();
            this.k = strTypeKey.length() > 0 ? strTypeKey : null;
            i = 0;
            for (d dVar : cVar.parseFeatures()) {
                i |= dVar.u;
            }
        } else {
            this.j = cls.getName();
            this.k = null;
            i = 0;
        }
        String str = this.k;
        this.l = str == null ? 0L : c.a.a.k.d.x(str);
        this.m = i;
        if (cVar != null) {
            d[] features = cVar.parseFeatures();
            z = false;
            for (d dVar2 : features) {
                if (dVar2 == d.SupportArrayToBean) {
                    z = true;
                }
            }
        } else {
            z = false;
        }
        this.i = z;
        c.a.a.k.a[] aVarArrC = c(aVarArr, aVarArr2);
        this.f2463f = Arrays.equals(aVarArr, aVarArrC) ? aVarArr : aVarArrC;
        if (constructor != null) {
            length = constructor.getParameterTypes().length;
        } else if (method != null) {
            length = method.getParameterTypes().length;
        }
        this.f2459b = length;
    }

    static boolean a(List<c.a.a.k.a> list, c.a.a.k.a aVar, boolean z) {
        if (!z) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                c.a.a.k.a aVar2 = list.get(i);
                if (aVar2.f2545b.equals(aVar.f2545b) && (!aVar2.k || aVar.k)) {
                    return false;
                }
            }
        }
        list.add(aVar);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:224:0x04e7 A[PHI: r15 r17 r24 r25 r29 r31 r32
      0x04e7: PHI (r15v12 java.util.ArrayList) = (r10v10 java.util.ArrayList), (r10v10 java.util.ArrayList), (r10v10 java.util.ArrayList), (r15v14 java.util.ArrayList) binds: [B:223:0x04e5, B:239:0x0541, B:241:0x054b, B:219:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r17v11 java.lang.reflect.Constructor<?>) = 
      (r9v28 java.lang.reflect.Constructor<?>)
      (r9v28 java.lang.reflect.Constructor<?>)
      (r9v28 java.lang.reflect.Constructor<?>)
      (r17v15 java.lang.reflect.Constructor<?>)
     binds: [B:223:0x04e5, B:239:0x0541, B:241:0x054b, B:219:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r24v16 int) = (r4v54 int), (r4v54 int), (r4v54 int), (r24v19 int) binds: [B:223:0x04e5, B:239:0x0541, B:241:0x054b, B:219:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r25v13 java.lang.reflect.Method) = 
      (r15v9 java.lang.reflect.Method)
      (r15v9 java.lang.reflect.Method)
      (r15v9 java.lang.reflect.Method)
      (r25v16 java.lang.reflect.Method)
     binds: [B:223:0x04e5, B:239:0x0541, B:241:0x054b, B:219:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r29v8 int) = (r3v37 int), (r3v37 int), (r3v37 int), (r29v10 int) binds: [B:223:0x04e5, B:239:0x0541, B:241:0x054b, B:219:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r31v5 java.lang.reflect.Method[]) = 
      (r5v32 java.lang.reflect.Method[])
      (r5v32 java.lang.reflect.Method[])
      (r5v32 java.lang.reflect.Method[])
      (r31v7 java.lang.reflect.Method[])
     binds: [B:223:0x04e5, B:239:0x0541, B:241:0x054b, B:219:0x0480] A[DONT_GENERATE, DONT_INLINE]
      0x04e7: PHI (r32v2 java.lang.reflect.Field[]) = 
      (r26v7 java.lang.reflect.Field[])
      (r26v7 java.lang.reflect.Field[])
      (r26v7 java.lang.reflect.Field[])
      (r32v4 java.lang.reflect.Field[])
     binds: [B:223:0x04e5, B:239:0x0541, B:241:0x054b, B:219:0x0480] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:245:0x055c  */
    /* JADX WARN: Code duplicated, block: B:247:0x0567  */
    /* JADX WARN: Code duplicated, block: B:248:0x058d  */
    /* JADX WARN: Code duplicated, block: B:249:0x058f  */
    /* JADX WARN: Code duplicated, block: B:252:0x0594 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0596  */
    /* JADX WARN: Code duplicated, block: B:254:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:256:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:258:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:259:0x05df  */
    /* JADX WARN: Code duplicated, block: B:261:0x05e7  */
    /* JADX WARN: Code duplicated, block: B:262:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:266:0x05fc  */
    /* JADX WARN: Code duplicated, block: B:287:0x067d  */
    /* JADX WARN: Code duplicated, block: B:289:0x0685  */
    /* JADX WARN: Code duplicated, block: B:311:0x06c8  */
    /* JADX WARN: Code duplicated, block: B:313:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:363:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:365:0x0815  */
    /* JADX WARN: Code duplicated, block: B:387:0x0688 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:394:0x06cf A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:363:0x07c6, please report this as an issue */
    public static h b(Class<?> cls, int i, Type type, boolean z, boolean z2, boolean z3, boolean z4, c.a.a.g gVar) {
        int i2;
        Constructor<?> constructor;
        Class<? super Object> cls2;
        Method[] methodArr;
        Method method;
        Method method2;
        Constructor<?> constructor2;
        Constructor<?> constructor3;
        Field[] fieldArr;
        Constructor<?> constructor4;
        Method[] methodArr2;
        HashMap map;
        Field[] fieldArr2;
        int i3;
        c.a.a.h.b bVar;
        String str;
        int iOrdinal;
        int iA;
        c.a.a.h.b bVar2;
        Constructor<?> constructor5;
        c.a.a.h.b bVar3;
        Constructor<?> constructor6;
        Method method3;
        Field[] fieldArr3;
        Method[] methodArr3;
        String strName;
        int i4;
        int i5;
        Class<?> returnType;
        int iOrdinal2;
        int iA2;
        String strV;
        Field fieldC;
        boolean z5;
        boolean z6;
        Field field;
        HashMap map2;
        int i6;
        c.a.a.h.b bVar4;
        c.a.a.h.b bVar5;
        Constructor<?> declaredConstructor;
        Class<? super Object> cls3 = Object.class;
        ArrayList arrayList = new ArrayList();
        HashMap map3 = new HashMap();
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        boolean zJ = c.a.a.k.d.J(cls);
        int i7 = i & 1024;
        int i8 = 0;
        if (i7 == 0 && (declaredConstructors.length == 1 || !zJ)) {
            try {
                declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            } catch (Exception unused) {
                declaredConstructor = null;
            }
            if (declaredConstructor != null || !cls.isMemberClass() || (i & 8) != 0) {
                i2 = i8;
                constructor = declaredConstructor;
                break;
            }
            int length = declaredConstructors.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    i2 = i8;
                    constructor = declaredConstructor;
                    break;
                }
                Constructor<?> constructor7 = declaredConstructors[i9];
                Class<?>[] parameterTypes = constructor7.getParameterTypes();
                Constructor<?> constructor8 = declaredConstructor;
                i2 = 0;
                if (parameterTypes.length == 1 && parameterTypes[0].equals(cls.getDeclaringClass())) {
                    constructor = constructor7;
                    break;
                }
                i9++;
                i8 = 0;
                declaredConstructor = constructor8;
            }
        } else {
            i2 = 0;
            constructor = null;
        }
        String[] strArr = null;
        if (z) {
            cls2 = cls3;
            methodArr = null;
            method = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Class<?> superclass = cls;
            Method method4 = null;
            while (superclass != null && superclass != cls3) {
                Method[] declaredMethods = superclass.getDeclaredMethods();
                int length2 = declaredMethods.length;
                Class<? super Object> cls4 = cls3;
                int i10 = i2;
                while (i10 < length2) {
                    int i11 = length2;
                    Method method5 = declaredMethods[i10];
                    Method[] methodArr4 = declaredMethods;
                    int modifiers = method5.getModifiers();
                    if ((modifiers & 8) != 0) {
                        if (method5.isAnnotationPresent(c.a.a.h.a.class)) {
                            if (method4 != null) {
                                throw new c.a.a.d("multi-json creator");
                            }
                            method4 = method5;
                        }
                        i10++;
                        length2 = i11;
                        declaredMethods = methodArr4;
                    } else {
                        if ((modifiers & 2) == 0) {
                            method2 = method4;
                            if ((modifiers & 256) == 0 && (modifiers & 4) == 0) {
                                arrayList2.add(method5);
                            }
                        }
                        method4 = method2;
                        i10++;
                        length2 = i11;
                        declaredMethods = methodArr4;
                    }
                    method2 = method4;
                    method4 = method2;
                    i10++;
                    length2 = i11;
                    declaredMethods = methodArr4;
                }
                superclass = superclass.getSuperclass();
                cls3 = cls4;
            }
            cls2 = cls3;
            Method[] methodArr5 = new Method[arrayList2.size()];
            arrayList2.toArray(methodArr5);
            methodArr = methodArr5;
            method = method4;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        int i12 = (cls.isInterface() || i7 != 0) ? 1 : i2;
        if (constructor == null || i12 != 0) {
            int length3 = declaredConstructors.length;
            int i13 = i2;
            while (true) {
                if (i13 >= length3) {
                    constructor2 = null;
                    break;
                }
                constructor2 = declaredConstructors[i13];
                int i14 = length3;
                if (((c.a.a.h.a) constructor2.getAnnotation(c.a.a.h.a.class)) != null) {
                    break;
                }
                i13++;
                length3 = i14;
            }
            String str2 = "illegal json creator";
            if (constructor2 != null) {
                c.a.a.k.d.O(cls, constructor2, i);
                Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                Type[] genericParameterTypes = z4 ? constructor2.getGenericParameterTypes() : parameterTypes2;
                Annotation[][] parameterAnnotations = constructor2.getParameterAnnotations();
                int i15 = i2;
                while (i15 < parameterTypes2.length) {
                    Annotation[] annotationArr = parameterAnnotations[i15];
                    int length4 = annotationArr.length;
                    String str3 = str2;
                    int i16 = i2;
                    while (true) {
                        if (i16 >= length4) {
                            bVar3 = null;
                            break;
                        }
                        int i17 = length4;
                        Annotation annotation = annotationArr[i16];
                        Annotation[] annotationArr2 = annotationArr;
                        if (annotation instanceof c.a.a.h.b) {
                            bVar3 = (c.a.a.h.b) annotation;
                            break;
                        }
                        i16++;
                        length4 = i17;
                        annotationArr = annotationArr2;
                    }
                    if (bVar3 == null) {
                        throw new c.a.a.d(str3);
                    }
                    Class<?> cls5 = parameterTypes2[i15];
                    Type type2 = genericParameterTypes[i15];
                    Field fieldC2 = c.a.a.k.d.C(cls, bVar3.name(), declaredFields, map3);
                    if (fieldC2 != null) {
                        c.a.a.k.d.O(cls, fieldC2, i);
                    }
                    a(arrayList, new c.a.a.k.a(bVar3.name(), cls, cls5, type2, fieldC2, bVar3.ordinal(), a0.a(bVar3.serialzeFeatures())), z);
                    i15++;
                    str2 = str3;
                    constructor2 = constructor2;
                    map3 = map3;
                    declaredFields = declaredFields;
                    parameterTypes2 = parameterTypes2;
                    methodArr = methodArr;
                    constructor = constructor;
                }
                constructor3 = constructor2;
                fieldArr = declaredFields;
                constructor4 = constructor;
                methodArr2 = methodArr;
                HashMap map4 = map3;
                int i18 = i2;
                int size = arrayList.size();
                c.a.a.k.a[] aVarArr = new c.a.a.k.a[size];
                arrayList.toArray(aVarArr);
                c.a.a.k.a[] aVarArr2 = new c.a.a.k.a[size];
                System.arraycopy(aVarArr, i18, aVarArr2, i18, size);
                Arrays.sort(aVarArr2);
                if (z2) {
                }
                String[] strArr2 = new String[size];
                for (int i19 = i18; i19 < size; i19++) {
                    strArr2[i19] = aVarArr[i19].f2545b;
                }
                strArr = strArr2;
                i3 = i18;
                map = map4;
            } else {
                constructor3 = constructor2;
                fieldArr = declaredFields;
                constructor4 = constructor;
                methodArr2 = methodArr;
                HashMap map5 = map3;
                int i20 = i2;
                if (method != null) {
                    c.a.a.k.d.O(cls, method, i);
                    Class<?>[] parameterTypes3 = method.getParameterTypes();
                    if (parameterTypes3.length > 0) {
                        Type[] genericParameterTypes2 = z4 ? method.getGenericParameterTypes() : parameterTypes3;
                        Annotation[][] parameterAnnotations2 = method.getParameterAnnotations();
                        int i21 = i20;
                        while (i21 < parameterTypes3.length) {
                            Annotation[] annotationArr3 = parameterAnnotations2[i21];
                            int length5 = annotationArr3.length;
                            int i22 = i20;
                            while (true) {
                                if (i22 >= length5) {
                                    bVar2 = null;
                                    break;
                                }
                                Annotation annotation2 = annotationArr3[i22];
                                if (annotation2 instanceof c.a.a.h.b) {
                                    bVar2 = (c.a.a.h.b) annotation2;
                                    break;
                                }
                                i22++;
                            }
                            if (bVar2 == null) {
                                throw new c.a.a.d("illegal json creator");
                            }
                            HashMap map6 = map5;
                            Field[] fieldArr4 = fieldArr;
                            a(arrayList, new c.a.a.k.a(bVar2.name(), cls, parameterTypes3[i21], genericParameterTypes2[i21], c.a.a.k.d.C(cls, bVar2.name(), fieldArr4, map6), bVar2.ordinal(), a0.a(bVar2.serialzeFeatures())), z);
                            i21++;
                            map5 = map6;
                            parameterTypes3 = parameterTypes3;
                            fieldArr = fieldArr4;
                            i20 = 0;
                        }
                        int size2 = arrayList.size();
                        c.a.a.k.a[] aVarArr3 = new c.a.a.k.a[size2];
                        arrayList.toArray(aVarArr3);
                        c.a.a.k.a[] aVarArr4 = new c.a.a.k.a[size2];
                        System.arraycopy(aVarArr3, 0, aVarArr4, 0, size2);
                        Arrays.sort(aVarArr4);
                        return new h(cls, null, null, method, aVarArr3, Arrays.equals(aVarArr3, aVarArr4) ? aVarArr3 : aVarArr4, z2 ? (c.a.a.h.c) cls.getAnnotation(c.a.a.h.c.class) : null, null);
                    }
                    map = map5;
                    i3 = i20;
                } else {
                    map = map5;
                    Field[] fieldArr5 = fieldArr;
                    if (i12 != 0) {
                        fieldArr2 = fieldArr5;
                        i3 = 0;
                    } else {
                        if (!zJ || declaredConstructors.length <= 0) {
                            throw new c.a.a.d("default constructor not found. " + cls);
                        }
                        String[] strArrF = c.a.a.k.d.F(cls);
                        if (strArrF == null) {
                            throw new c.a.a.d("default constructor not found. " + cls);
                        }
                        Constructor<?> constructor9 = constructor3;
                        for (Constructor<?> constructor10 : declaredConstructors) {
                            Class<?>[] parameterTypes4 = constructor10.getParameterTypes();
                            if ((parameterTypes4.length <= 0 || !parameterTypes4[parameterTypes4.length - 1].getName().equals("e.f.a.a")) && (constructor9 == null || constructor9.getParameterTypes().length < parameterTypes4.length)) {
                                constructor9 = constructor10;
                            }
                        }
                        constructor9.setAccessible(true);
                        c.a.a.k.d.O(cls, constructor9, i);
                        Class<?>[] parameterTypes5 = constructor9.getParameterTypes();
                        Type[] genericParameterTypes3 = z4 ? constructor9.getGenericParameterTypes() : parameterTypes5;
                        Annotation[][] parameterAnnotations3 = constructor9.getParameterAnnotations();
                        int i23 = 0;
                        while (i23 < parameterTypes5.length) {
                            String str4 = strArrF[i23];
                            Annotation[] annotationArr4 = parameterAnnotations3[i23];
                            int length6 = annotationArr4.length;
                            int i24 = 0;
                            while (true) {
                                if (i24 >= length6) {
                                    bVar = null;
                                    break;
                                }
                                Annotation annotation3 = annotationArr4[i24];
                                if (annotation3 instanceof c.a.a.h.b) {
                                    bVar = (c.a.a.h.b) annotation3;
                                    break;
                                }
                                i24++;
                            }
                            Class<?> cls6 = parameterTypes5[i23];
                            Type type3 = genericParameterTypes3[i23];
                            Field[] fieldArr6 = fieldArr5;
                            Field fieldC3 = c.a.a.k.d.C(cls, str4, fieldArr6, map);
                            if (fieldC3 != null && bVar == null) {
                                bVar = (c.a.a.h.b) fieldC3.getAnnotation(c.a.a.h.b.class);
                            }
                            if (bVar != null) {
                                iOrdinal = bVar.ordinal();
                                iA = a0.a(bVar.serialzeFeatures());
                                String strName2 = bVar.name();
                                if (strName2.length() != 0) {
                                    str4 = strName2;
                                }
                                str = str4;
                            } else {
                                str = str4;
                                iOrdinal = 0;
                                iA = 0;
                            }
                            a(arrayList, new c.a.a.k.a(str, cls, cls6, type3, fieldC3, iOrdinal, iA), z);
                            i23++;
                            parameterTypes5 = parameterTypes5;
                            fieldArr5 = fieldArr6;
                        }
                        fieldArr2 = fieldArr5;
                        int size3 = arrayList.size();
                        c.a.a.k.a[] aVarArr5 = new c.a.a.k.a[size3];
                        arrayList.toArray(aVarArr5);
                        c.a.a.k.a[] aVarArr6 = new c.a.a.k.a[size3];
                        i3 = 0;
                        System.arraycopy(aVarArr5, 0, aVarArr6, 0, size3);
                        Arrays.sort(aVarArr6);
                        String[] strArr3 = new String[size3];
                        for (int i25 = 0; i25 < size3; i25++) {
                            strArr3[i25] = aVarArr5[i25].f2545b;
                        }
                        strArr = strArr3;
                        constructor3 = constructor9;
                    }
                }
                constructor5 = constructor4;
            }
            fieldArr2 = fieldArr;
            constructor5 = constructor4;
        } else {
            fieldArr2 = declaredFields;
            methodArr2 = methodArr;
            map = map3;
            constructor3 = null;
            i3 = i2;
            constructor5 = constructor;
        }
        if (constructor5 != null) {
            c.a.a.k.d.O(cls, constructor5, i);
        }
        int i26 = 4;
        if (z) {
            constructor6 = constructor5;
            method3 = method;
            fieldArr3 = fieldArr2;
            methodArr3 = methodArr2;
        } else {
            Method[] methodArr6 = methodArr2;
            int length7 = methodArr6.length;
            int i27 = i3;
            while (i27 < length7) {
                Method method6 = methodArr6[i27];
                String name = method6.getName();
                if (name.length() >= i26 && (((returnType = method6.getReturnType()) == Void.TYPE || returnType == method6.getDeclaringClass()) && method6.getParameterTypes().length == 1)) {
                    c.a.a.h.b bVarG = z3 ? (c.a.a.h.b) method6.getAnnotation(c.a.a.h.b.class) : null;
                    if (bVarG == null && z3) {
                        bVarG = c.a.a.k.d.G(cls, method6);
                    }
                    c.a.a.h.b bVar6 = bVarG;
                    if (bVar6 == null) {
                        iOrdinal2 = 0;
                        iA2 = 0;
                    } else if (bVar6.deserialize()) {
                        int iOrdinal3 = bVar6.ordinal();
                        iA2 = a0.a(bVar6.serialzeFeatures());
                        if (bVar6.name().length() != 0) {
                            i27 = i27;
                            length7 = length7;
                            methodArr6 = methodArr6;
                            constructor5 = constructor5;
                            fieldArr2 = fieldArr2;
                            method = method;
                            arrayList = arrayList;
                            a(arrayList, new c.a.a.k.a(bVar6.name(), method6, null, cls, type, iOrdinal3, iA2, bVar6, null, z4), z);
                            c.a.a.k.d.O(cls, method6, i);
                        } else {
                            iOrdinal2 = iOrdinal3;
                        }
                        map2 = map;
                        fieldArr2 = fieldArr2;
                        i27++;
                        arrayList = arrayList;
                        constructor5 = constructor5;
                        length7 = length7;
                        method = method;
                        map = map2;
                        methodArr6 = methodArr6;
                        fieldArr2 = fieldArr2;
                        i26 = 4;
                        i3 = 0;
                    }
                    if (name.startsWith("set")) {
                        char cCharAt = name.charAt(3);
                        if (Character.isUpperCase(cCharAt)) {
                            if (c.a.a.k.d.f2559a) {
                                strV = c.a.a.k.d.v(name.substring(3));
                            } else {
                                strV = Character.toLowerCase(name.charAt(3)) + name.substring(4);
                            }
                            fieldC = c.a.a.k.d.C(cls, strV, fieldArr2, map);
                            if (fieldC == null) {
                                z6 = false;
                                if (method6.getParameterTypes()[0] == Boolean.TYPE) {
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("is");
                                    sb.append(Character.toUpperCase(strV.charAt(0)));
                                    z5 = true;
                                    sb.append(strV.substring(1));
                                    fieldC = c.a.a.k.d.C(cls, sb.toString(), fieldArr2, map);
                                } else {
                                    z5 = true;
                                }
                            } else {
                                z5 = true;
                                z6 = false;
                            }
                            field = fieldC;
                            if (field == null) {
                                fieldArr2 = fieldArr2;
                                map2 = map;
                                i6 = iOrdinal2;
                                bVar4 = bVar6;
                                int i28 = iA2;
                                if (gVar != 0) {
                                    strV = gVar.a(strV);
                                }
                                a(arrayList, new c.a.a.k.a(strV, method6, null, cls, type, i6, i28, bVar4, null, z4), z);
                                c.a.a.k.d.O(cls, method6, i);
                            } else {
                                if (z3) {
                                    bVar5 = (c.a.a.h.b) field.getAnnotation(c.a.a.h.b.class);
                                } else {
                                    bVar5 = null;
                                }
                                if (bVar5 != null) {
                                    iOrdinal2 = bVar5.ordinal();
                                    iA2 = a0.a(bVar5.serialzeFeatures());
                                    if (bVar5.name().length() != 0) {
                                        map2 = map;
                                        fieldArr2 = fieldArr2;
                                        a(arrayList, new c.a.a.k.a(bVar5.name(), method6, field, cls, type, iOrdinal2, iA2, bVar6, bVar5, z4), z);
                                    } else {
                                        fieldArr2 = fieldArr2;
                                        map2 = map;
                                        if (bVar6 == null) {
                                            i6 = iOrdinal2;
                                            bVar4 = bVar5;
                                        }
                                        int i29 = iA2;
                                        if (gVar != 0) {
                                            strV = gVar.a(strV);
                                        }
                                        a(arrayList, new c.a.a.k.a(strV, method6, null, cls, type, i6, i29, bVar4, null, z4), z);
                                        c.a.a.k.d.O(cls, method6, i);
                                    }
                                } else {
                                    fieldArr2 = fieldArr2;
                                    map2 = map;
                                }
                                i6 = iOrdinal2;
                                bVar4 = bVar6;
                                int i210 = iA2;
                                if (gVar != 0) {
                                    strV = gVar.a(strV);
                                }
                                a(arrayList, new c.a.a.k.a(strV, method6, null, cls, type, i6, i210, bVar4, null, z4), z);
                                c.a.a.k.d.O(cls, method6, i);
                            }
                        } else if (cCharAt == '_') {
                            strV = name.substring(4);
                        } else if (cCharAt == 'f') {
                            strV = name.substring(3);
                        } else if (name.length() < 5 || !Character.isUpperCase(name.charAt(4))) {
                            map2 = map;
                            fieldArr2 = fieldArr2;
                        } else {
                            strV = c.a.a.k.d.v(name.substring(3));
                        }
                        fieldC = c.a.a.k.d.C(cls, strV, fieldArr2, map);
                        if (fieldC == null) {
                            z6 = false;
                            if (method6.getParameterTypes()[0] == Boolean.TYPE) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("is");
                                sb2.append(Character.toUpperCase(strV.charAt(0)));
                                z5 = true;
                                sb2.append(strV.substring(1));
                                fieldC = c.a.a.k.d.C(cls, sb2.toString(), fieldArr2, map);
                            } else {
                                z5 = true;
                            }
                        } else {
                            z5 = true;
                            z6 = false;
                        }
                        field = fieldC;
                        if (field == null) {
                            fieldArr2 = fieldArr2;
                            map2 = map;
                            i6 = iOrdinal2;
                            bVar4 = bVar6;
                            int i211 = iA2;
                            if (gVar != 0) {
                                strV = gVar.a(strV);
                            }
                            a(arrayList, new c.a.a.k.a(strV, method6, null, cls, type, i6, i211, bVar4, null, z4), z);
                            c.a.a.k.d.O(cls, method6, i);
                        } else {
                            if (z3) {
                                bVar5 = (c.a.a.h.b) field.getAnnotation(c.a.a.h.b.class);
                            } else {
                                bVar5 = null;
                            }
                            if (bVar5 != null) {
                                iOrdinal2 = bVar5.ordinal();
                                iA2 = a0.a(bVar5.serialzeFeatures());
                                if (bVar5.name().length() != 0) {
                                    map2 = map;
                                    fieldArr2 = fieldArr2;
                                    a(arrayList, new c.a.a.k.a(bVar5.name(), method6, field, cls, type, iOrdinal2, iA2, bVar6, bVar5, z4), z);
                                } else {
                                    fieldArr2 = fieldArr2;
                                    map2 = map;
                                    if (bVar6 == null) {
                                        i6 = iOrdinal2;
                                        bVar4 = bVar5;
                                    }
                                    int i212 = iA2;
                                    if (gVar != 0) {
                                        strV = gVar.a(strV);
                                    }
                                    a(arrayList, new c.a.a.k.a(strV, method6, null, cls, type, i6, i212, bVar4, null, z4), z);
                                    c.a.a.k.d.O(cls, method6, i);
                                }
                            } else {
                                fieldArr2 = fieldArr2;
                                map2 = map;
                            }
                            i6 = iOrdinal2;
                            bVar4 = bVar6;
                            int i213 = iA2;
                            if (gVar != 0) {
                                strV = gVar.a(strV);
                            }
                            a(arrayList, new c.a.a.k.a(strV, method6, null, cls, type, i6, i213, bVar4, null, z4), z);
                            c.a.a.k.d.O(cls, method6, i);
                        }
                    } else {
                        map2 = map;
                        fieldArr2 = fieldArr2;
                    }
                    i27++;
                    arrayList = arrayList;
                    constructor5 = constructor5;
                    length7 = length7;
                    method = method;
                    map = map2;
                    methodArr6 = methodArr6;
                    fieldArr2 = fieldArr2;
                    i26 = 4;
                    i3 = 0;
                }
                arrayList = arrayList;
                map2 = map;
                i27++;
                arrayList = arrayList;
                constructor5 = constructor5;
                length7 = length7;
                method = method;
                map = map2;
                methodArr6 = methodArr6;
                fieldArr2 = fieldArr2;
                i26 = 4;
                i3 = 0;
            }
            methodArr3 = methodArr6;
            constructor6 = constructor5;
            method3 = method;
            fieldArr3 = fieldArr2;
        }
        ArrayList arrayList3 = arrayList;
        Field[] fieldArr7 = fieldArr3;
        ArrayList<Field> arrayList4 = new ArrayList(fieldArr7.length);
        for (Field field2 : fieldArr7) {
            int modifiers2 = field2.getModifiers();
            if ((modifiers2 & 8) == 0) {
                if ((modifiers2 & 16) != 0) {
                    Class<?> type4 = field2.getType();
                    if (Map.class.isAssignableFrom(type4) || Collection.class.isAssignableFrom(type4)) {
                        if ((field2.getModifiers() & 1) != 0) {
                            arrayList4.add(field2);
                        }
                    }
                } else if ((field2.getModifiers() & 1) != 0) {
                    arrayList4.add(field2);
                }
            }
        }
        Class<? super Object> superclass2 = cls.getSuperclass();
        while (superclass2 != null) {
            Class<? super Object> cls7 = cls2;
            if (superclass2 == cls7) {
                break;
            }
            for (Field field3 : superclass2.getDeclaredFields()) {
                int modifiers3 = field3.getModifiers();
                if ((modifiers3 & 8) == 0) {
                    if ((modifiers3 & 16) != 0) {
                        Class<?> type5 = field3.getType();
                        if (Map.class.isAssignableFrom(type5) || Collection.class.isAssignableFrom(type5)) {
                            if ((modifiers3 & 1) != 0) {
                                arrayList4.add(field3);
                            }
                        }
                    } else if ((modifiers3 & 1) != 0) {
                        arrayList4.add(field3);
                    }
                }
            }
            superclass2 = superclass2.getSuperclass();
            cls2 = cls7;
        }
        for (Field field4 : arrayList4) {
            String name2 = field4.getName();
            int size4 = arrayList3.size();
            boolean z7 = false;
            for (int i30 = 0; i30 < size4; i30++) {
                if (((c.a.a.k.a) arrayList3.get(i30)).f2545b.equals(name2)) {
                    z7 = true;
                }
            }
            if (!z7) {
                c.a.a.h.b bVar7 = z3 ? (c.a.a.h.b) field4.getAnnotation(c.a.a.h.b.class) : null;
                if (bVar7 != null) {
                    int iOrdinal4 = bVar7.ordinal();
                    int iA3 = a0.a(bVar7.serialzeFeatures());
                    if (bVar7.name().length() != 0) {
                        name2 = bVar7.name();
                    }
                    i4 = iOrdinal4;
                    i5 = iA3;
                } else {
                    i4 = 0;
                    i5 = 0;
                }
                if (gVar != 0) {
                    name2 = gVar.a(name2);
                }
                c.a.a.k.d.O(cls, field4, i);
                a(arrayList3, new c.a.a.k.a(name2, null, field4, cls, type, i4, i5, null, bVar7, z4), z);
            }
        }
        if (!z) {
            Method[] methodArr7 = methodArr3;
            int i31 = 0;
            for (int length8 = methodArr7.length; i31 < length8; length8 = length8) {
                Method method7 = methodArr7[i31];
                String name3 = method7.getName();
                if (name3.length() >= 4 && name3.startsWith("get")) {
                    if (Character.isUpperCase(name3.charAt(3)) && method7.getParameterTypes().length == 0) {
                        Class<?> returnType2 = method7.getReturnType();
                        if (Collection.class.isAssignableFrom(returnType2) || Map.class.isAssignableFrom(returnType2)) {
                            c.a.a.h.b bVar8 = z3 ? (c.a.a.h.b) method7.getAnnotation(c.a.a.h.b.class) : null;
                            if (bVar8 != null) {
                                strName = bVar8.name();
                                if (strName.length() <= 0) {
                                    strName = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                                }
                            } else {
                                strName = Character.toLowerCase(name3.charAt(3)) + name3.substring(4);
                            }
                            a(arrayList3, new c.a.a.k.a(strName, method7, null, cls, type, 0, 0, bVar8, null, z4), z);
                            c.a.a.k.d.O(cls, method7, i);
                        }
                    }
                }
                i31++;
            }
        }
        int size5 = arrayList3.size();
        c.a.a.k.a[] aVarArr7 = new c.a.a.k.a[size5];
        arrayList3.toArray(aVarArr7);
        c.a.a.k.a[] aVarArr8 = new c.a.a.k.a[size5];
        System.arraycopy(aVarArr7, 0, aVarArr8, 0, size5);
        Arrays.sort(aVarArr8);
        return new h(cls, constructor6, constructor3, method3, aVarArr7, aVarArr8, z2 ? (c.a.a.h.c) cls.getAnnotation(c.a.a.h.c.class) : null, strArr);
    }

    private c.a.a.k.a[] c(c.a.a.k.a[] aVarArr, c.a.a.k.a[] aVarArr2) {
        String[] strArrOrders;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        c.a.a.h.c cVar = this.g;
        if (cVar != null && (strArrOrders = cVar.orders()) != null && strArrOrders.length != 0) {
            int i = 0;
            while (true) {
                if (i >= strArrOrders.length) {
                    z = true;
                    break;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= aVarArr2.length) {
                        z4 = false;
                        break;
                    }
                    if (aVarArr2[i2].f2545b.equals(strArrOrders[i])) {
                        z4 = true;
                        break;
                    }
                    i2++;
                }
                if (!z4) {
                    z = false;
                    break;
                }
                i++;
            }
            if (!z) {
                return aVarArr2;
            }
            if (strArrOrders.length == aVarArr.length) {
                int i3 = 0;
                while (true) {
                    if (i3 >= strArrOrders.length) {
                        z3 = true;
                        break;
                    }
                    if (!aVarArr2[i3].f2545b.equals(strArrOrders[i3])) {
                        z3 = false;
                        break;
                    }
                    i3++;
                }
                if (z3) {
                    return aVarArr2;
                }
                c.a.a.k.a[] aVarArr3 = new c.a.a.k.a[aVarArr2.length];
                for (int i4 = 0; i4 < strArrOrders.length; i4++) {
                    for (int i5 = 0; i5 < aVarArr2.length; i5++) {
                        if (aVarArr2[i5].f2545b.equals(strArrOrders[i4])) {
                            aVarArr3[i4] = aVarArr2[i5];
                            break;
                        }
                    }
                }
                this.h = true;
                return aVarArr3;
            }
            int length = aVarArr2.length;
            c.a.a.k.a[] aVarArr4 = new c.a.a.k.a[length];
            for (int i6 = 0; i6 < strArrOrders.length; i6++) {
                for (int i7 = 0; i7 < aVarArr2.length; i7++) {
                    if (aVarArr2[i7].f2545b.equals(strArrOrders[i6])) {
                        aVarArr4[i6] = aVarArr2[i7];
                        break;
                    }
                }
            }
            int length2 = strArrOrders.length;
            for (int i8 = 0; i8 < aVarArr2.length; i8++) {
                int i9 = 0;
                while (true) {
                    if (i9 >= length || i9 >= length2) {
                        z2 = false;
                        break;
                    }
                    if (aVarArr4[i8].b(aVarArr2[i9])) {
                        z2 = true;
                        break;
                    }
                    i9++;
                }
                if (!z2) {
                    aVarArr4[length2] = aVarArr2[i8];
                    length2++;
                }
            }
            this.h = true;
        }
        return aVarArr2;
    }
}
