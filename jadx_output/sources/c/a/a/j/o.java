package c.a.a.j;

import java.lang.reflect.Type;
import java.util.IdentityHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o implements t {
    @Override // c.a.a.j.t
    public final void a(m mVar, Object obj, Object obj2, Type type) {
        z zVar = mVar.f2518b;
        int i = 1;
        boolean z = (zVar.n & a0.WriteClassName.z) != 0;
        Type typeB = z ? c.a.a.k.d.B(type) : null;
        if (obj == null) {
            if ((zVar.n & a0.WriteNullListAsEmpty.z) != 0) {
                zVar.write("[]");
                return;
            } else {
                zVar.o();
                return;
            }
        }
        List list = (List) obj;
        int size = list.size();
        if (size == 0) {
            zVar.append("[]");
            return;
        }
        w wVar = mVar.m;
        if ((zVar.n & a0.DisableCircularReferenceDetect.z) == 0) {
            mVar.m = new w(wVar, obj, obj2, 0);
            if (mVar.l == null) {
                mVar.l = new IdentityHashMap<>();
            }
            mVar.l.put(obj, mVar.m);
        }
        try {
            if ((zVar.n & a0.PrettyFormat.z) != 0) {
                zVar.write(91);
                mVar.l();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj3 = list.get(i2);
                    if (i2 != 0) {
                        zVar.write(44);
                    }
                    mVar.m();
                    if (obj3 != null) {
                        IdentityHashMap<Object, w> identityHashMap = mVar.l;
                        if (identityHashMap == null || !identityHashMap.containsKey(obj3)) {
                            t tVarA = mVar.f2517a.a(obj3.getClass());
                            mVar.m = new w(wVar, obj, obj2, 0);
                            tVarA.a(mVar, obj3, Integer.valueOf(i2), typeB);
                        } else {
                            mVar.t(obj3);
                        }
                    } else {
                        mVar.f2518b.o();
                    }
                }
                mVar.d();
                mVar.m();
                zVar.write(93);
                return;
            }
            int i3 = zVar.m + 1;
            if (i3 > zVar.l.length) {
                if (zVar.o == null) {
                    zVar.e(i3);
                } else {
                    zVar.flush();
                    i3 = 1;
                }
            }
            zVar.l[zVar.m] = '[';
            zVar.m = i3;
            for (int i4 = 0; i4 < list.size(); i4++) {
                Object obj4 = list.get(i4);
                if (i4 != 0) {
                    int i5 = zVar.m + 1;
                    if (i5 > zVar.l.length) {
                        if (zVar.o == null) {
                            zVar.e(i5);
                        } else {
                            zVar.flush();
                            i5 = 1;
                        }
                    }
                    zVar.l[zVar.m] = ',';
                    zVar.m = i5;
                }
                if (obj4 == null) {
                    zVar.append("null");
                } else {
                    Class<?> cls = obj4.getClass();
                    if (cls == Integer.class) {
                        zVar.k(((Integer) obj4).intValue());
                    } else if (cls == Long.class) {
                        long jLongValue = ((Long) obj4).longValue();
                        if (z) {
                            zVar.n(jLongValue);
                            zVar.write(76);
                        } else {
                            zVar.n(jLongValue);
                        }
                    } else if (cls == String.class) {
                        String str = (String) obj4;
                        if ((zVar.n & a0.UseSingleQuotes.z) != 0) {
                            zVar.r(str);
                        } else {
                            zVar.q(str, (char) 0, true);
                        }
                    } else {
                        if ((zVar.n & a0.DisableCircularReferenceDetect.z) == 0) {
                            mVar.m = new w(wVar, obj, obj2, 0);
                        }
                        IdentityHashMap<Object, w> identityHashMap2 = mVar.l;
                        if (identityHashMap2 == null || !identityHashMap2.containsKey(obj4)) {
                            mVar.f2517a.a(obj4.getClass()).a(mVar, obj4, Integer.valueOf(i4), typeB);
                        } else {
                            mVar.t(obj4);
                        }
                    }
                }
            }
            int i6 = zVar.m + 1;
            if (i6 <= zVar.l.length) {
                i = i6;
            } else if (zVar.o == null) {
                zVar.e(i6);
                i = i6;
            } else {
                zVar.flush();
            }
            zVar.l[zVar.m] = ']';
            zVar.m = i;
        } finally {
            mVar.m = wVar;
        }
    }
}
