package c.a.a.i;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class p extends g {
    public p(m mVar, Class<?> cls) {
        super(mVar, cls, cls);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:118:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:87:0x015b A[Catch: Exception -> 0x01a7, TRY_LEAVE, TryCatch #0 {Exception -> 0x01a7, blocks: (B:59:0x00e1, B:62:0x00ed, B:77:0x012b, B:65:0x00f9, B:67:0x0100, B:70:0x010d, B:72:0x0115, B:74:0x011e, B:79:0x0131, B:80:0x013e, B:87:0x015b, B:82:0x0143, B:84:0x0150), top: B:113:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x017b  */
    @Override // c.a.a.i.g, c.a.a.i.q.f
    public <T> T b(b bVar, Type type, Object obj) {
        Class<?> clsL;
        Constructor<?> constructor;
        Object obj2;
        Object objNewInstance;
        g gVar = this;
        e eVar = bVar.f2432f;
        int i = eVar.h;
        if (i == 8) {
            eVar.s();
            return null;
        }
        if (bVar.k == 2) {
            bVar.k = 0;
        } else if (i != 12) {
            throw new c.a.a.d("syntax error");
        }
        if (type == null || !(type instanceof Class)) {
            clsL = null;
        } else {
            clsL = (Class) type;
            if (!Throwable.class.isAssignableFrom(clsL)) {
                clsL = null;
            }
        }
        HashMap map = null;
        Throwable th = null;
        String strB0 = null;
        StackTraceElement[] stackTraceElementArr = null;
        while (true) {
            String strT = eVar.T(bVar.f2428b);
            if (strT == null) {
                int i2 = eVar.h;
                if (i2 == 13) {
                    eVar.t(16);
                    constructor = null;
                    break;
                }
                if (i2 == 16) {
                }
            }
            eVar.u(':');
            if (!"@type".equals(strT)) {
                if ("message".equals(strT)) {
                    int i3 = eVar.h;
                    if (i3 == 8) {
                        strB0 = null;
                    } else {
                        if (i3 != 4) {
                            throw new c.a.a.d("syntax error");
                        }
                        strB0 = eVar.b0();
                    }
                    eVar.s();
                } else if ("cause".equals(strT)) {
                    constructor = null;
                    th = (Throwable) gVar.b(bVar, null, "cause");
                } else {
                    constructor = null;
                    if ("stackTrace".equals(strT)) {
                        stackTraceElementArr = (StackTraceElement[]) bVar.q(StackTraceElement[].class);
                    } else {
                        if (map == null) {
                            map = new HashMap();
                        }
                        map.put(strT, bVar.j());
                    }
                }
                if (eVar.h == 13) {
                    eVar.t(16);
                    break;
                }
            } else {
                if (eVar.h != 4) {
                    throw new c.a.a.d("syntax error");
                }
                clsL = c.a.a.k.d.L(eVar.b0(), bVar.f2429c.f2477e, false);
                eVar.t(16);
            }
            constructor = null;
            if (eVar.h == 13) {
                eVar.t(16);
                break;
            }
        }
        if (clsL == null) {
            obj2 = (T) new Exception(strB0, th);
        } else {
            try {
                Constructor<?> constructor2 = constructor;
                Constructor<?> constructor3 = constructor2;
                Constructor<?> constructor4 = constructor3;
                for (Constructor<?> constructor5 : clsL.getConstructors()) {
                    if (constructor5.getParameterTypes().length == 0) {
                        constructor4 = constructor5;
                    } else if (constructor5.getParameterTypes().length == 1 && constructor5.getParameterTypes()[0] == String.class) {
                        constructor3 = constructor5;
                    } else if (constructor5.getParameterTypes().length == 2 && constructor5.getParameterTypes()[0] == String.class && constructor5.getParameterTypes()[1] == Throwable.class) {
                        constructor2 = constructor5;
                    }
                }
                if (constructor2 != null) {
                    objNewInstance = constructor2.newInstance(strB0, th);
                } else if (constructor3 != null) {
                    objNewInstance = constructor3.newInstance(strB0);
                } else {
                    if (constructor4 != null) {
                        objNewInstance = constructor4.newInstance(new Object[0]);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        obj2 = (T) new Exception(strB0, th);
                    }
                }
                obj2 = (T) ((Throwable) objNewInstance);
                if (obj2 == null) {
                    obj2 = (T) new Exception(strB0, th);
                }
            } catch (Exception e2) {
                throw new c.a.a.d("create instance error", e2);
            }
        }
        if (stackTraceElementArr != null) {
            ((Throwable) obj2).setStackTrace(stackTraceElementArr);
        }
        if (map != null) {
            if (clsL == null) {
                gVar = null;
            } else if (clsL != gVar.f2455d) {
                c.a.a.i.q.f fVarD = bVar.f2429c.d(clsL);
                if (fVarD instanceof g) {
                    gVar = (g) fVarD;
                } else {
                    gVar = null;
                }
            }
            if (gVar != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    c.a.a.i.q.d dVarF = gVar.f(str);
                    if (dVarF != null) {
                        dVarF.g(obj2, value);
                    }
                }
            }
        }
        return (T) obj2;
    }
}
