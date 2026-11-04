package c.a.a.i;

import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class n extends c.a.a.i.q.d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2479e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f2480f;
    private final b g;
    private final Object h;
    private final Map i;
    private final Collection j;

    public n(b bVar, List list, int i) {
        super(null, null, 0);
        this.g = bVar;
        this.f2479e = i;
        this.f2480f = list;
        this.h = null;
        this.i = null;
        this.j = null;
    }

    public n(Collection collection) {
        super(null, null, 0);
        this.g = null;
        this.f2479e = -1;
        this.f2480f = null;
        this.h = null;
        this.i = null;
        this.j = collection;
    }

    public n(Map map, Object obj) {
        super(null, null, 0);
        this.g = null;
        this.f2479e = -1;
        this.f2480f = null;
        this.h = obj;
        this.i = map;
        this.j = null;
    }

    @Override // c.a.a.i.q.d
    public void b(b bVar, Object obj, Type type, Map<String, Object> map) {
    }

    @Override // c.a.a.i.q.d
    public void g(Object obj, Object obj2) {
        c.a.a.b bVar;
        Object objO;
        Map map = this.i;
        if (map != null) {
            map.put(this.h, obj2);
            return;
        }
        Collection collection = this.j;
        if (collection != null) {
            collection.add(obj2);
            return;
        }
        this.f2480f.set(this.f2479e, obj2);
        List list = this.f2480f;
        if (!(list instanceof c.a.a.b) || (objO = (bVar = (c.a.a.b) list).o()) == null || Array.getLength(objO) <= this.f2479e) {
            return;
        }
        if (bVar.n() != null) {
            obj2 = c.a.a.k.d.e(obj2, bVar.n(), this.g.f2429c);
        }
        Array.set(objO, this.f2479e, obj2);
    }
}
