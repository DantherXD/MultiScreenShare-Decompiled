package c.a.a.i;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class j extends c.a.a.i.q.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Type f2465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c.a.a.i.q.f f2466f;
    private final boolean g;

    public j(m mVar, Class<?> cls, c.a.a.k.a aVar) {
        boolean z;
        super(cls, aVar, 14);
        Type type = aVar.i;
        Class<?> cls2 = aVar.h;
        if (cls2.isArray()) {
            this.f2465e = cls2.getComponentType();
            z = true;
        } else {
            this.f2465e = c.a.a.k.d.B(type);
            z = false;
        }
        this.g = z;
    }

    @Override // c.a.a.i.q.d
    public void b(b bVar, Object obj, Type type, Map<String, Object> map) {
        List arrayList;
        c.a.a.b bVar2;
        Object array;
        e eVar = bVar.f2432f;
        int iE0 = eVar.e0();
        if (iE0 == 8 || (iE0 == 4 && eVar.b0().length() == 0)) {
            g(obj, null);
            bVar.f2432f.s();
            return;
        }
        if (this.g) {
            c.a.a.b bVar3 = new c.a.a.b();
            bVar3.p(this.f2465e);
            bVar2 = bVar3;
            arrayList = bVar3;
        } else {
            arrayList = new ArrayList();
            bVar2 = null;
        }
        l lVar = bVar.g;
        bVar.x(lVar, obj, this.f2486a.f2545b);
        h(bVar, type, arrayList);
        bVar.y(lVar);
        Object obj2 = arrayList;
        if (this.g) {
            array = arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f2465e, arrayList.size()));
            bVar2.q(array);
        }
        if (obj == null) {
            obj2 = array;
            map.put(this.f2486a.f2545b, obj2);
        } else {
            obj2 = array;
            g(obj, obj2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01bf, code lost:
    
        r6.s();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h(c.a.a.i.b r18, java.lang.reflect.Type r19, java.util.Collection r20) {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.i.j.h(c.a.a.i.b, java.lang.reflect.Type, java.util.Collection):void");
    }
}
