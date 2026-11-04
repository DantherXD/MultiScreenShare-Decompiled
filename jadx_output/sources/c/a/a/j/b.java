package c.a.a.j;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.IdentityHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2498a = new b();

    private b() {
    }

    private <T> T c(c.a.a.i.b bVar, Class<?> cls, c.a.a.b bVar2) {
        if (bVar2 == null) {
            return null;
        }
        int size = bVar2.size();
        T t = (T) Array.newInstance(cls, size);
        for (int i = 0; i < size; i++) {
            Object objB = bVar2.get(i);
            if (objB == bVar2) {
                Array.set(t, i, t);
            } else {
                if (!cls.isArray()) {
                    objB = c.a.a.k.d.b(objB, cls, bVar.f2429c);
                } else if (!cls.isInstance(objB)) {
                    objB = c(bVar, cls, (c.a.a.b) objB);
                }
                Array.set(t, i, objB);
            }
        }
        bVar2.q(t);
        bVar2.p(cls);
        return t;
    }

    @Override // c.a.a.j.t
    public final void a(m mVar, Object obj, Object obj2, Type type) {
        z zVar = mVar.f2518b;
        Object[] objArr = (Object[]) obj;
        if (obj == null) {
            if ((zVar.n & a0.WriteNullListAsEmpty.z) != 0) {
                zVar.write("[]");
                return;
            } else {
                zVar.o();
                return;
            }
        }
        int length = objArr.length;
        int i = length - 1;
        if (i == -1) {
            zVar.append("[]");
            return;
        }
        w wVar = mVar.m;
        int i2 = 0;
        mVar.p(wVar, obj, obj2, 0);
        try {
            zVar.write(91);
            if ((zVar.n & a0.PrettyFormat.z) != 0) {
                mVar.l();
                mVar.m();
                while (i2 < length) {
                    if (i2 != 0) {
                        zVar.write(44);
                        mVar.m();
                    }
                    mVar.r(objArr[i2]);
                    i2++;
                }
                mVar.d();
                mVar.m();
                zVar.write(93);
                return;
            }
            Class<?> cls = null;
            t tVarA = null;
            while (i2 < i) {
                Object obj3 = objArr[i2];
                if (obj3 == null) {
                    zVar.append("null,");
                } else {
                    IdentityHashMap<Object, w> identityHashMap = mVar.l;
                    if (identityHashMap == null || !identityHashMap.containsKey(obj3)) {
                        Class<?> cls2 = obj3.getClass();
                        if (cls2 == cls) {
                            tVarA.a(mVar, obj3, null, null);
                        } else {
                            tVarA = mVar.f2517a.a(cls2);
                            tVarA.a(mVar, obj3, null, null);
                            cls = cls2;
                        }
                    } else {
                        mVar.t(obj3);
                    }
                    zVar.write(44);
                }
                i2++;
            }
            Object obj4 = objArr[i];
            if (obj4 == null) {
                zVar.append("null]");
            } else {
                IdentityHashMap<Object, w> identityHashMap2 = mVar.l;
                if (identityHashMap2 == null || !identityHashMap2.containsKey(obj4)) {
                    mVar.u(obj4, Integer.valueOf(i));
                } else {
                    mVar.t(obj4);
                }
                zVar.write(93);
            }
        } finally {
            mVar.m = wVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        c.a.a.i.e eVar = bVar.f2432f;
        int iE0 = eVar.e0();
        if (iE0 == 8) {
            eVar.t(16);
            return null;
        }
        if (type != char[].class) {
            if (iE0 == 4) {
                T t = (T) eVar.a();
                eVar.t(16);
                return t;
            }
            Class<?> componentType = ((Class) type).getComponentType();
            c.a.a.b bVar2 = new c.a.a.b();
            bVar.m(componentType, bVar2, obj);
            return (T) c(bVar, componentType, bVar2);
        }
        if (iE0 == 4) {
            String strB0 = eVar.b0();
            eVar.t(16);
            return (T) strB0.toCharArray();
        }
        if (iE0 != 2) {
            return (T) c.a.a.a.l(bVar.j()).toCharArray();
        }
        Number numberK = eVar.k();
        eVar.t(16);
        return (T) numberK.toString().toCharArray();
    }
}
