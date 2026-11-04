package c.a.a.j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public class g implements t, c.a.a.i.q.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f2507a = new g();

    private g() {
    }

    @Override // c.a.a.j.t
    public void a(m mVar, Object obj, Object obj2, Type type) {
        String str;
        z zVar = mVar.f2518b;
        if (obj == null) {
            if ((zVar.n & a0.WriteNullListAsEmpty.z) != 0) {
                zVar.write("[]");
                return;
            } else {
                zVar.o();
                return;
            }
        }
        int i = zVar.n;
        a0 a0Var = a0.WriteClassName;
        Type typeB = (i & a0Var.z) != 0 ? c.a.a.k.d.B(type) : null;
        Collection collection = (Collection) obj;
        w wVar = mVar.m;
        int i2 = 0;
        mVar.p(wVar, obj, obj2, 0);
        if ((zVar.n & a0Var.z) != 0) {
            if (HashSet.class != collection.getClass()) {
                str = TreeSet.class == collection.getClass() ? "TreeSet" : "Set";
            }
            zVar.append(str);
        }
        try {
            zVar.write(91);
            for (Object obj3 : collection) {
                int i3 = i2 + 1;
                if (i2 != 0) {
                    zVar.write(44);
                }
                if (obj3 == null) {
                    zVar.o();
                } else {
                    Class<?> cls = obj3.getClass();
                    if (cls == Integer.class) {
                        zVar.k(((Integer) obj3).intValue());
                    } else if (cls == Long.class) {
                        zVar.n(((Long) obj3).longValue());
                        if ((zVar.n & a0.WriteClassName.z) != 0) {
                            zVar.write(76);
                        }
                    } else {
                        mVar.f2517a.a(cls).a(mVar, obj3, Integer.valueOf(i3 - 1), typeB);
                    }
                }
                i2 = i3;
            }
            zVar.write(93);
        } finally {
            mVar.m = wVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v28, types: [T, c.a.a.b, java.util.Collection] */
    @Override // c.a.a.i.q.f
    public <T> T b(c.a.a.i.b bVar, Type type, Object obj) {
        Collection collection;
        if (bVar.f2432f.e0() == 8) {
            bVar.f2432f.t(16);
            return null;
        }
        if (type == c.a.a.b.class) {
            ?? r1 = (T) new c.a.a.b();
            bVar.n(r1);
            return r1;
        }
        Type rawType = type;
        while (!(rawType instanceof Class)) {
            if (!(rawType instanceof ParameterizedType)) {
                throw new c.a.a.d("TODO");
            }
            rawType = ((ParameterizedType) rawType).getRawType();
        }
        Class cls = (Class) rawType;
        if (cls == AbstractCollection.class || cls == Collection.class) {
            collection = (T) new ArrayList();
        } else if (cls.isAssignableFrom(HashSet.class)) {
            collection = (T) new HashSet();
        } else if (cls.isAssignableFrom(LinkedHashSet.class)) {
            collection = (T) new LinkedHashSet();
        } else if (cls.isAssignableFrom(TreeSet.class)) {
            collection = (T) new TreeSet();
        } else if (cls.isAssignableFrom(ArrayList.class)) {
            collection = (T) new ArrayList();
        } else if (cls.isAssignableFrom(EnumSet.class)) {
            collection = (T) EnumSet.noneOf((Class) (type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class));
        } else {
            try {
                collection = (T) ((Collection) cls.newInstance());
            } catch (Exception unused) {
                throw new c.a.a.d("create instane error, class " + cls.getName());
            }
        }
        bVar.m(c.a.a.k.d.B(type), collection, obj);
        return (T) collection;
    }
}
