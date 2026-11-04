package c.a.a.i;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a extends c.a.a.i.q.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected c.a.a.i.q.f f2427e;

    public a(m mVar, Class<?> cls, c.a.a.k.a aVar) {
        super(cls, aVar, 2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0077  */
    @Override // c.a.a.i.q.d
    public void b(b bVar, Object obj, Type type, Map<String, Object> map) {
        Object objB;
        Class<?> cls;
        if (this.f2427e == null) {
            m mVar = bVar.f2429c;
            c.a.a.k.a aVar = this.f2486a;
            this.f2427e = mVar.c(aVar.h, aVar.i);
        }
        Type cVar = this.f2486a.i;
        boolean z = type instanceof ParameterizedType;
        if (z) {
            l lVar = bVar.g;
            if (lVar != null) {
                lVar.f2471d = type;
            }
            cVar = c.a.a.k.a.e(this.f2487b, type, cVar);
            this.f2427e = bVar.f2429c.d(cVar);
        }
        if ((cVar instanceof ParameterizedType) && z) {
            ParameterizedType parameterizedType = (ParameterizedType) cVar;
            ParameterizedType parameterizedType2 = (ParameterizedType) type;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Type rawType = parameterizedType2.getRawType();
            if ((rawType instanceof Class) && c.a.a.k.d.y(actualTypeArguments, ((Class) rawType).getTypeParameters(), parameterizedType2.getActualTypeArguments())) {
                cVar = new c.a.a.k.c(actualTypeArguments, parameterizedType.getOwnerType(), parameterizedType.getRawType());
            }
        }
        c.a.a.k.a aVar2 = this.f2486a;
        String str = aVar2.o;
        if (str != null) {
            c.a.a.i.q.f fVar = this.f2427e;
            if (fVar instanceof c.a.a.j.h) {
                objB = ((c.a.a.j.h) fVar).d(bVar, cVar, aVar2.f2545b, str);
            } else {
                objB = this.f2427e.b(bVar, cVar, aVar2.f2545b);
            }
        } else {
            objB = this.f2427e.b(bVar, cVar, aVar2.f2545b);
        }
        if (bVar.k == 1) {
            b.a aVarH = bVar.h();
            aVarH.f2435c = this;
            aVarH.f2436d = bVar.g;
            bVar.k = 0;
            return;
        }
        if (obj == null) {
            map.put(this.f2486a.f2545b, objB);
            return;
        }
        if (objB == null && ((cls = this.f2486a.h) == Byte.TYPE || cls == Short.TYPE || cls == Float.TYPE || cls == Double.TYPE)) {
            return;
        }
        g(obj, objB);
    }

    public c.a.a.i.q.f h(m mVar) {
        if (this.f2427e == null) {
            c.a.a.k.a aVar = this.f2486a;
            this.f2427e = mVar.c(aVar.h, aVar.i);
        }
        return this.f2427e;
    }
}
