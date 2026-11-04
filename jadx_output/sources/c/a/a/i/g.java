package c.a.a.i;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes.dex */
public class g implements c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c.a.a.i.q.d[] f2452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.a.a.i.q.d[] f2453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, c.a.a.i.q.d> f2454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Class<?> f2455d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f2456e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ConcurrentMap<String, Object> f2457f;
    private transient long[] g;
    private transient int[] h;

    public g(m mVar, Class<?> cls, Type type) {
        this(mVar, cls, type, h.b(cls, cls.getModifiers(), type, false, true, true, true, mVar.f2478f));
    }

    public g(m mVar, Class<?> cls, Type type, h hVar) {
        this.f2455d = cls;
        this.f2456e = hVar;
        c.a.a.k.a[] aVarArr = hVar.f2463f;
        this.f2453b = new c.a.a.i.q.d[aVarArr.length];
        int length = aVarArr.length;
        HashMap map = null;
        for (int i = 0; i < length; i++) {
            c.a.a.k.a aVar = hVar.f2463f[i];
            c.a.a.i.q.d dVarB = mVar.b(mVar, cls, aVar);
            this.f2453b[i] = dVarB;
            for (String str : aVar.q) {
                if (map == null) {
                    map = new HashMap();
                }
                map.put(str, dVarB);
            }
        }
        this.f2454c = map;
        c.a.a.k.a[] aVarArr2 = hVar.f2462e;
        this.f2452a = new c.a.a.i.q.d[aVarArr2.length];
        int length2 = aVarArr2.length;
        for (int i2 = 0; i2 < length2; i2++) {
            this.f2452a[i2] = f(hVar.f2462e[i2].f2545b);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 4 */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 19641. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private <T> T d(c.a.a.i.b r45, java.lang.reflect.Type r46, java.lang.Object r47, java.lang.Object r48) {
        /*
            Method dump skipped, instruction units count: 1964
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.i.g.d(c.a.a.i.b, java.lang.reflect.Type, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0078 A[Catch: IllegalAccessException -> 0x02ea, TryCatch #0 {IllegalAccessException -> 0x02ea, blocks: (B:10:0x0025, B:12:0x002b, B:14:0x0034, B:16:0x0042, B:18:0x0046, B:22:0x0059, B:23:0x005b, B:21:0x0053, B:25:0x0060, B:29:0x0073, B:30:0x0075, B:28:0x006d, B:31:0x0078, B:15:0x003a, B:35:0x0085, B:37:0x0089, B:47:0x00b4, B:49:0x00b8, B:51:0x00c1, B:53:0x00c5, B:57:0x00d8, B:56:0x00d2, B:59:0x00dd, B:63:0x00f0, B:62:0x00ea, B:50:0x00be, B:40:0x0092, B:42:0x009e, B:46:0x00b1, B:45:0x00ab, B:64:0x00f3, B:65:0x010b, B:66:0x010c, B:68:0x0112, B:70:0x011a, B:72:0x0128, B:74:0x012c, B:78:0x013f, B:79:0x0141, B:77:0x0139, B:81:0x0147, B:85:0x015a, B:86:0x015c, B:84:0x0154, B:87:0x0160, B:71:0x0120, B:88:0x0165, B:90:0x0169, B:92:0x0171, B:94:0x017e, B:96:0x0182, B:100:0x0195, B:99:0x018f, B:102:0x019a, B:106:0x01ad, B:105:0x01a7, B:93:0x0177, B:107:0x01b0, B:109:0x01b6, B:111:0x01bc, B:120:0x01e7, B:122:0x01ee, B:126:0x0201, B:125:0x01fb, B:128:0x0207, B:132:0x021a, B:131:0x0214, B:114:0x01c6, B:119:0x01d3, B:133:0x021e, B:134:0x0238, B:137:0x023d, B:139:0x0243, B:141:0x0253, B:145:0x0266, B:144:0x0260, B:147:0x026c, B:151:0x027f, B:150:0x0279, B:152:0x0283, B:154:0x0289, B:158:0x029c, B:167:0x02c4, B:170:0x02ce, B:173:0x02d3, B:174:0x02d8, B:176:0x02db, B:179:0x02e0, B:180:0x02e5, B:157:0x0296, B:161:0x02a7, B:165:0x02ba, B:164:0x02b4, B:166:0x02c1), top: B:194:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0160 A[Catch: IllegalAccessException -> 0x02ea, TryCatch #0 {IllegalAccessException -> 0x02ea, blocks: (B:10:0x0025, B:12:0x002b, B:14:0x0034, B:16:0x0042, B:18:0x0046, B:22:0x0059, B:23:0x005b, B:21:0x0053, B:25:0x0060, B:29:0x0073, B:30:0x0075, B:28:0x006d, B:31:0x0078, B:15:0x003a, B:35:0x0085, B:37:0x0089, B:47:0x00b4, B:49:0x00b8, B:51:0x00c1, B:53:0x00c5, B:57:0x00d8, B:56:0x00d2, B:59:0x00dd, B:63:0x00f0, B:62:0x00ea, B:50:0x00be, B:40:0x0092, B:42:0x009e, B:46:0x00b1, B:45:0x00ab, B:64:0x00f3, B:65:0x010b, B:66:0x010c, B:68:0x0112, B:70:0x011a, B:72:0x0128, B:74:0x012c, B:78:0x013f, B:79:0x0141, B:77:0x0139, B:81:0x0147, B:85:0x015a, B:86:0x015c, B:84:0x0154, B:87:0x0160, B:71:0x0120, B:88:0x0165, B:90:0x0169, B:92:0x0171, B:94:0x017e, B:96:0x0182, B:100:0x0195, B:99:0x018f, B:102:0x019a, B:106:0x01ad, B:105:0x01a7, B:93:0x0177, B:107:0x01b0, B:109:0x01b6, B:111:0x01bc, B:120:0x01e7, B:122:0x01ee, B:126:0x0201, B:125:0x01fb, B:128:0x0207, B:132:0x021a, B:131:0x0214, B:114:0x01c6, B:119:0x01d3, B:133:0x021e, B:134:0x0238, B:137:0x023d, B:139:0x0243, B:141:0x0253, B:145:0x0266, B:144:0x0260, B:147:0x026c, B:151:0x027f, B:150:0x0279, B:152:0x0283, B:154:0x0289, B:158:0x029c, B:167:0x02c4, B:170:0x02ce, B:173:0x02d3, B:174:0x02d8, B:176:0x02db, B:179:0x02e0, B:180:0x02e5, B:157:0x0296, B:161:0x02a7, B:165:0x02ba, B:164:0x02b4, B:166:0x02c1), top: B:194:0x0025 }] */
    private <T> T e(b bVar, Type type, Object obj, Object obj2) {
        Enum enumValueOf;
        String strS;
        e eVar = bVar.f2432f;
        T t = (T) a(bVar, type);
        int length = this.f2453b.length;
        int i = 0;
        while (i < length) {
            char c2 = i == length + (-1) ? ']' : ',';
            c.a.a.i.q.d dVar = this.f2453b[i];
            c.a.a.k.a aVar = dVar.f2486a;
            Class<?> cls = aVar.h;
            try {
                if (cls == Integer.TYPE) {
                    int iO = (int) eVar.O();
                    if (aVar.f2548e) {
                        aVar.f2547d.setInt(t, iO);
                    } else {
                        dVar.g(t, new Integer(iO));
                    }
                    char c3 = eVar.k;
                    if (c3 == ',') {
                        int i2 = eVar.l + 1;
                        eVar.l = i2;
                        eVar.k = i2 >= eVar.y ? (char) 26 : eVar.x.charAt(i2);
                        eVar.h = 16;
                    } else if (c3 == ']') {
                        int i3 = eVar.l + 1;
                        eVar.l = i3;
                        eVar.k = i3 >= eVar.y ? (char) 26 : eVar.x.charAt(i3);
                        eVar.h = 15;
                    } else {
                        eVar.s();
                    }
                } else if (cls == String.class) {
                    char c4 = eVar.k;
                    if (c4 == '\"') {
                        strS = eVar.S('\"');
                    } else {
                        if (c4 != 'n' || !eVar.x.startsWith("null", eVar.l)) {
                            throw new c.a.a.d("not match string. feild : " + obj);
                        }
                        int i4 = eVar.l + 4;
                        eVar.l = i4;
                        eVar.k = i4 >= eVar.y ? (char) 26 : eVar.x.charAt(i4);
                        strS = null;
                    }
                    if (aVar.f2548e) {
                        aVar.f2547d.set(t, strS);
                    } else {
                        dVar.g(t, strS);
                    }
                    char c5 = eVar.k;
                    if (c5 == ',') {
                        int i5 = eVar.l + 1;
                        eVar.l = i5;
                        eVar.k = i5 >= eVar.y ? (char) 26 : eVar.x.charAt(i5);
                        eVar.h = 16;
                    } else if (c5 == ']') {
                        int i6 = eVar.l + 1;
                        eVar.l = i6;
                        eVar.k = i6 >= eVar.y ? (char) 26 : eVar.x.charAt(i6);
                        eVar.h = 15;
                    } else {
                        eVar.s();
                    }
                } else if (cls == Long.TYPE) {
                    long jO = eVar.O();
                    if (aVar.f2548e) {
                        aVar.f2547d.setLong(t, jO);
                    } else {
                        dVar.g(t, new Long(jO));
                    }
                    char c6 = eVar.k;
                    if (c6 == ',') {
                        int i7 = eVar.l + 1;
                        eVar.l = i7;
                        eVar.k = i7 >= eVar.y ? (char) 26 : eVar.x.charAt(i7);
                        eVar.h = 16;
                    } else if (c6 == ']') {
                        int i8 = eVar.l + 1;
                        eVar.l = i8;
                        eVar.k = i8 >= eVar.y ? (char) 26 : eVar.x.charAt(i8);
                        eVar.h = 15;
                    } else {
                        eVar.s();
                    }
                } else if (cls == Boolean.TYPE) {
                    boolean zX = eVar.x();
                    if (aVar.f2548e) {
                        aVar.f2547d.setBoolean(t, zX);
                    } else {
                        dVar.g(t, Boolean.valueOf(zX));
                    }
                    char c7 = eVar.k;
                    if (c7 == ',') {
                        int i9 = eVar.l + 1;
                        eVar.l = i9;
                        eVar.k = i9 >= eVar.y ? (char) 26 : eVar.x.charAt(i9);
                        eVar.h = 16;
                    } else if (c7 == ']') {
                        int i10 = eVar.l + 1;
                        eVar.l = i10;
                        eVar.k = i10 >= eVar.y ? (char) 26 : eVar.x.charAt(i10);
                        eVar.h = 15;
                    } else {
                        eVar.s();
                    }
                } else if (cls.isEnum()) {
                    char c8 = eVar.k;
                    if (c8 == '\"') {
                        String strT = eVar.T(bVar.f2428b);
                        enumValueOf = strT == null ? null : Enum.valueOf(cls, strT);
                    } else {
                        if (c8 < '0' || c8 > '9') {
                            throw new c.a.a.d("illegal enum." + eVar.i());
                        }
                        enumValueOf = ((c) ((a) dVar).h(bVar.f2429c)).f2439c[(int) eVar.O()];
                    }
                    dVar.g(t, enumValueOf);
                    char c9 = eVar.k;
                    if (c9 == ',') {
                        int i11 = eVar.l + 1;
                        eVar.l = i11;
                        eVar.k = i11 >= eVar.y ? (char) 26 : eVar.x.charAt(i11);
                        eVar.h = 16;
                    } else if (c9 == ']') {
                        int i12 = eVar.l + 1;
                        eVar.l = i12;
                        eVar.k = i12 >= eVar.y ? (char) 26 : eVar.x.charAt(i12);
                        eVar.h = 15;
                    } else {
                        eVar.s();
                    }
                } else if (cls == Date.class && eVar.k == '1') {
                    dVar.g(t, new Date(eVar.O()));
                    char c10 = eVar.k;
                    if (c10 == ',') {
                        int i13 = eVar.l + 1;
                        eVar.l = i13;
                        eVar.k = i13 >= eVar.y ? (char) 26 : eVar.x.charAt(i13);
                        eVar.h = 16;
                    } else if (c10 == ']') {
                        int i14 = eVar.l + 1;
                        eVar.l = i14;
                        eVar.k = i14 >= eVar.y ? (char) 26 : eVar.x.charAt(i14);
                        eVar.h = 15;
                    } else {
                        eVar.s();
                    }
                } else {
                    char c11 = eVar.k;
                    if (c11 == '[') {
                        int i15 = eVar.l + 1;
                        eVar.l = i15;
                        eVar.k = i15 >= eVar.y ? (char) 26 : eVar.x.charAt(i15);
                        eVar.h = 14;
                    } else if (c11 == '{') {
                        int i16 = eVar.l + 1;
                        eVar.l = i16;
                        eVar.k = i16 >= eVar.y ? (char) 26 : eVar.x.charAt(i16);
                        eVar.h = 12;
                    } else {
                        eVar.s();
                    }
                    dVar.b(bVar, t, aVar.i, null);
                    if (c2 == ']') {
                        if (eVar.h != 15) {
                            throw new c.a.a.d("syntax error");
                        }
                    } else if (c2 == ',' && eVar.h != 16) {
                        throw new c.a.a.d("syntax error");
                    }
                }
                i++;
            } catch (IllegalAccessException e2) {
                throw new c.a.a.d("set " + aVar.f2545b + "error", e2);
            }
        }
        if (eVar.k == ',') {
            int i17 = eVar.l + 1;
            eVar.l = i17;
            eVar.k = i17 >= eVar.y ? (char) 26 : eVar.x.charAt(i17);
            eVar.h = 16;
        } else {
            eVar.s();
        }
        return t;
    }

    private boolean j(b bVar, String str, Object obj, Type type, Map<String, Object> map) {
        e eVar = bVar.f2432f;
        c.a.a.i.q.d dVarF = f(str);
        if (dVarF == null) {
            dVarF = k(str);
        }
        int i = d.SupportNonPublicField.u;
        if (dVarF == null && ((bVar.f2432f.j & i) != 0 || (i & this.f2456e.m) != 0)) {
            if (this.f2457f == null) {
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(1, 0.75f, 1);
                for (Class<?> superclass = this.f2455d; superclass != null && superclass != Object.class; superclass = superclass.getSuperclass()) {
                    for (Field field : superclass.getDeclaredFields()) {
                        String name = field.getName();
                        if (f(name) == null) {
                            int modifiers = field.getModifiers();
                            if ((modifiers & 16) == 0 && (modifiers & 8) == 0) {
                                concurrentHashMap.put(name, field);
                            }
                        }
                    }
                }
                this.f2457f = concurrentHashMap;
            }
            Object obj2 = this.f2457f.get(str);
            if (obj2 != null) {
                if (obj2 instanceof c.a.a.i.q.d) {
                    dVarF = (c.a.a.i.q.d) obj2;
                } else {
                    Field field2 = (Field) obj2;
                    field2.setAccessible(true);
                    dVarF = new a(bVar.f2429c, this.f2455d, new c.a.a.k.a(str, field2.getDeclaringClass(), field2.getType(), field2.getGenericType(), field2, 0, 0));
                    this.f2457f.put(str, dVarF);
                }
            }
        }
        if (dVarF == null) {
            i(bVar, obj, str);
            return false;
        }
        eVar.u(':');
        dVarF.b(bVar, obj, type, map);
        return true;
    }

    private c.a.a.i.q.d k(String str) {
        boolean zStartsWith;
        long jX = c.a.a.k.d.x(str);
        int i = 0;
        if (this.g == null) {
            long[] jArr = new long[this.f2453b.length];
            int i2 = 0;
            while (true) {
                c.a.a.i.q.d[] dVarArr = this.f2453b;
                if (i2 >= dVarArr.length) {
                    break;
                }
                jArr[i2] = c.a.a.k.d.x(dVarArr[i2].f2486a.f2545b);
                i2++;
            }
            Arrays.sort(jArr);
            this.g = jArr;
        }
        int iBinarySearch = Arrays.binarySearch(this.g, jX);
        if (iBinarySearch < 0) {
            zStartsWith = str.startsWith("is");
            if (zStartsWith) {
                iBinarySearch = Arrays.binarySearch(this.g, c.a.a.k.d.x(str.substring(2)));
            }
        } else {
            zStartsWith = false;
        }
        if (iBinarySearch < 0) {
            return null;
        }
        if (this.h == null) {
            int[] iArr = new int[this.g.length];
            Arrays.fill(iArr, -1);
            while (true) {
                c.a.a.i.q.d[] dVarArr2 = this.f2453b;
                if (i >= dVarArr2.length) {
                    break;
                }
                int iBinarySearch2 = Arrays.binarySearch(this.g, c.a.a.k.d.x(dVarArr2[i].f2486a.f2545b));
                if (iBinarySearch2 >= 0) {
                    iArr[iBinarySearch2] = i;
                }
                i++;
            }
            this.h = iArr;
        }
        int i3 = this.h[iBinarySearch];
        if (i3 == -1) {
            return null;
        }
        c.a.a.i.q.d dVar = this.f2453b[i3];
        Class<?> cls = dVar.f2486a.h;
        if (!zStartsWith || cls == Boolean.TYPE || cls == Boolean.class) {
            return dVar;
        }
        return null;
    }

    protected Object a(b bVar, Type type) {
        if ((type instanceof Class) && this.f2455d.isInterface()) {
            return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{(Class) type}, new c.a.a.e((bVar.f2432f.j & d.OrderedField.u) != 0));
        }
        h hVar = this.f2456e;
        Constructor<?> constructor = hVar.f2458a;
        if (constructor == null && hVar.f2461d == null) {
            return null;
        }
        Method method = hVar.f2461d;
        if (method != null && hVar.f2459b > 0) {
            return null;
        }
        try {
            Object objNewInstance = hVar.f2459b == 0 ? constructor != null ? constructor.newInstance(new Object[0]) : method.invoke(null, new Object[0]) : constructor.newInstance(bVar.g.f2468a);
            if (bVar != null && (bVar.f2432f.j & d.InitStringFieldAsEmpty.u) != 0) {
                for (c.a.a.k.a aVar : this.f2456e.f2462e) {
                    if (aVar.h == String.class) {
                        aVar.f(objNewInstance, "");
                    }
                }
            }
            return objNewInstance;
        } catch (Exception e2) {
            throw new c.a.a.d("create instance error, class " + this.f2455d.getName(), e2);
        }
    }

    @Override // c.a.a.i.q.f
    public <T> T b(b bVar, Type type, Object obj) {
        return (T) d(bVar, type, obj, null);
    }

    /* JADX WARN: Code duplicated, block: B:87:0x0146  */
    /* JADX WARN: Code duplicated, block: B:94:0x015c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0160  */
    /* JADX WARN: Code duplicated, block: B:97:0x0167  */
    public Object c(Map<String, Object> map, m mVar) throws IllegalAccessException, InvocationTargetException {
        String str;
        float fFloatValue;
        double dDoubleValue;
        h hVar = this.f2456e;
        if (hVar.f2460c != null) {
            c.a.a.k.a[] aVarArr = hVar.f2462e;
            int length = aVarArr.length;
            Object[] objArr = new Object[length];
            for (int i = 0; i < length; i++) {
                c.a.a.k.a aVar = aVarArr[i];
                Object objW = map.get(aVar.f2545b);
                if (objW == null) {
                    objW = c.a.a.k.d.w(aVar.h);
                }
                objArr[i] = objW;
            }
            Constructor<?> constructor = this.f2456e.f2460c;
            if (constructor == null) {
                return null;
            }
            try {
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                throw new c.a.a.d("create instance error, " + this.f2456e.f2460c.toGenericString(), e2);
            }
        }
        Object objA = a(null, this.f2455d);
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            c.a.a.i.q.d dVarF = f(entry.getKey());
            if (dVarF != null) {
                Object value = entry.getValue();
                if (value == null) {
                    Class<?> cls = dVarF.f2486a.h;
                    if (cls == Integer.TYPE) {
                        value = 0;
                    } else if (cls == Long.TYPE) {
                        value = 0L;
                    } else if (cls == Short.TYPE) {
                        value = (short) 0;
                    } else if (cls == Byte.TYPE) {
                        value = (byte) 0;
                    } else if (cls == Float.TYPE) {
                        value = Float.valueOf(0.0f);
                    } else if (cls == Double.TYPE) {
                        value = Double.valueOf(0.0d);
                    } else if (cls == Character.TYPE) {
                        value = '0';
                    } else if (cls == Boolean.TYPE) {
                        value = Boolean.FALSE;
                    }
                }
                c.a.a.k.a aVar2 = dVarF.f2486a;
                Method method = aVar2.f2546c;
                if (method != null) {
                    method.invoke(objA, c.a.a.k.d.e(value, method.getGenericParameterTypes()[0], mVar));
                } else {
                    Field field = aVar2.f2547d;
                    Type type = aVar2.i;
                    if (type == Boolean.TYPE) {
                        if (value == Boolean.FALSE) {
                            field.setBoolean(objA, false);
                        } else if (value == Boolean.TRUE) {
                            field.setBoolean(objA, true);
                        } else {
                            str = dVarF.f2486a.o;
                            if (str == null && type == Date.class && (value instanceof String)) {
                                try {
                                    value = new SimpleDateFormat(str).parse((String) value);
                                } catch (ParseException unused) {
                                    value = null;
                                }
                            } else if (type instanceof ParameterizedType) {
                                value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                            } else {
                                value = c.a.a.k.d.e(value, type, mVar);
                            }
                            field.set(objA, value);
                        }
                    } else if (type == Integer.TYPE) {
                        if (value instanceof Number) {
                            field.setInt(objA, ((Number) value).intValue());
                        } else {
                            str = dVarF.f2486a.o;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                                } else {
                                    value = c.a.a.k.d.e(value, type, mVar);
                                }
                            } else if (type instanceof ParameterizedType) {
                                value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                            } else {
                                value = c.a.a.k.d.e(value, type, mVar);
                            }
                            field.set(objA, value);
                        }
                    } else if (type == Long.TYPE) {
                        if (value instanceof Number) {
                            field.setLong(objA, ((Number) value).longValue());
                        } else {
                            str = dVarF.f2486a.o;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                                } else {
                                    value = c.a.a.k.d.e(value, type, mVar);
                                }
                            } else if (type instanceof ParameterizedType) {
                                value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                            } else {
                                value = c.a.a.k.d.e(value, type, mVar);
                            }
                            field.set(objA, value);
                        }
                    } else if (type == Float.TYPE) {
                        if (value instanceof Number) {
                            fFloatValue = ((Number) value).floatValue();
                        } else if (value instanceof String) {
                            String str2 = (String) value;
                            fFloatValue = str2.length() <= 10 ? c.a.a.k.d.N(str2) : Float.parseFloat(str2);
                        } else {
                            str = dVarF.f2486a.o;
                            if (str == null) {
                                if (type instanceof ParameterizedType) {
                                    value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                                } else {
                                    value = c.a.a.k.d.e(value, type, mVar);
                                }
                            } else if (type instanceof ParameterizedType) {
                                value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                            } else {
                                value = c.a.a.k.d.e(value, type, mVar);
                            }
                            field.set(objA, value);
                        }
                        field.setFloat(objA, fFloatValue);
                    } else {
                        if (type == Double.TYPE) {
                            if (value instanceof Number) {
                                dDoubleValue = ((Number) value).doubleValue();
                            } else if (value instanceof String) {
                                String str3 = (String) value;
                                dDoubleValue = str3.length() <= 10 ? c.a.a.k.d.M(str3) : Double.parseDouble(str3);
                            }
                            field.setDouble(objA, dDoubleValue);
                        } else {
                            if (value == null || type != value.getClass()) {
                            }
                            field.set(objA, value);
                        }
                        str = dVarF.f2486a.o;
                        if (str == null) {
                            if (type instanceof ParameterizedType) {
                                value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                            } else {
                                value = c.a.a.k.d.e(value, type, mVar);
                            }
                        } else if (type instanceof ParameterizedType) {
                            value = c.a.a.k.d.d(value, (ParameterizedType) type, mVar);
                        } else {
                            value = c.a.a.k.d.e(value, type, mVar);
                        }
                        field.set(objA, value);
                    }
                }
            }
        }
        return objA;
    }

    protected c.a.a.i.q.d f(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        if (!this.f2456e.h) {
            int length = this.f2453b.length - 1;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = (i2 + length) >>> 1;
                int iCompareTo = this.f2453b[i3].f2486a.f2545b.compareTo(str);
                if (iCompareTo < 0) {
                    i2 = i3 + 1;
                } else {
                    if (iCompareTo <= 0) {
                        return this.f2453b[i3];
                    }
                    length = i3 - 1;
                }
            }
            Map<String, c.a.a.i.q.d> map = this.f2454c;
            if (map != null) {
                return map.get(str);
            }
            if (this.g == null) {
                long[] jArr = new long[this.f2453b.length];
                int i4 = 0;
                while (true) {
                    c.a.a.i.q.d[] dVarArr = this.f2453b;
                    if (i4 >= dVarArr.length) {
                        break;
                    }
                    jArr[i4] = c.a.a.k.d.x(dVarArr[i4].f2486a.f2545b);
                    i4++;
                }
                Arrays.sort(jArr);
                this.g = jArr;
            }
            int iBinarySearch = Arrays.binarySearch(this.g, c.a.a.k.d.x(str));
            if (iBinarySearch >= 0) {
                if (this.h == null) {
                    int[] iArr = new int[this.g.length];
                    Arrays.fill(iArr, -1);
                    while (true) {
                        c.a.a.i.q.d[] dVarArr2 = this.f2453b;
                        if (i >= dVarArr2.length) {
                            break;
                        }
                        int iBinarySearch2 = Arrays.binarySearch(this.g, c.a.a.k.d.x(dVarArr2[i].f2486a.f2545b));
                        if (iBinarySearch2 >= 0) {
                            iArr[iBinarySearch2] = i;
                        }
                        i++;
                    }
                    this.h = iArr;
                }
                int i5 = this.h[iBinarySearch];
                if (i5 != -1) {
                    return this.f2453b[i5];
                }
            }
            return k(str);
        }
        while (true) {
            c.a.a.i.q.d[] dVarArr3 = this.f2453b;
            if (i >= dVarArr3.length) {
                return null;
            }
            c.a.a.i.q.d dVar = dVarArr3[i];
            if (dVar.f2486a.f2545b.equalsIgnoreCase(str)) {
                return dVar;
            }
            i++;
        }
    }

    protected c.a.a.i.q.d g(long j) {
        int i = 0;
        while (true) {
            c.a.a.i.q.d[] dVarArr = this.f2453b;
            if (i >= dVarArr.length) {
                return null;
            }
            c.a.a.i.q.d dVar = dVarArr[i];
            if (dVar.f2486a.p == j) {
                return dVar;
            }
            i++;
        }
    }

    protected g h(m mVar, h hVar, String str) {
        c.a.a.h.c cVar = hVar.g;
        if (cVar == null) {
            return null;
        }
        for (Class<?> cls : cVar.seeAlso()) {
            c.a.a.i.q.f fVarD = mVar.d(cls);
            if (fVarD instanceof g) {
                g gVar = (g) fVarD;
                h hVar2 = gVar.f2456e;
                if (hVar2.j.equals(str)) {
                    return gVar;
                }
                g gVarH = h(mVar, hVar2, str);
                if (gVarH != null) {
                    return gVarH;
                }
            }
        }
        return null;
    }

    void i(b bVar, Object obj, String str) {
        e eVar = bVar.f2432f;
        if ((eVar.j & d.IgnoreNotMatch.u) == 0) {
            throw new c.a.a.d("setter not found, class " + this.f2455d.getName() + ", property " + str);
        }
        eVar.u(':');
        Type typeA = null;
        List<c.a.a.i.q.c> list = bVar.l;
        if (list != null) {
            Iterator<c.a.a.i.q.c> it = list.iterator();
            while (it.hasNext()) {
                typeA = it.next().a(obj, str);
            }
        }
        Object objJ = typeA == null ? bVar.j() : bVar.r(typeA);
        if (obj instanceof c.a.a.i.q.a) {
            ((c.a.a.i.q.a) obj).a(str, objJ);
            return;
        }
        List<c.a.a.i.q.b> list2 = bVar.m;
        if (list2 != null) {
            Iterator<c.a.a.i.q.b> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().b(obj, str, objJ);
            }
        }
    }
}
