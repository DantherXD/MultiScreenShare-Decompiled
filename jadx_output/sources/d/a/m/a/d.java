package d.a.m.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements d.a.j.b, a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    List<d.a.j.b> f4757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f4758c;

    @Override // d.a.m.a.a
    public boolean a(d.a.j.b bVar) {
        d.a.m.b.b.c(bVar, "Disposable item is null");
        if (this.f4758c) {
            return false;
        }
        synchronized (this) {
            if (this.f4758c) {
                return false;
            }
            List<d.a.j.b> list = this.f4757b;
            if (list != null && list.remove(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // d.a.m.a.a
    public boolean b(d.a.j.b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.c();
        return true;
    }

    @Override // d.a.j.b
    public void c() {
        if (this.f4758c) {
            return;
        }
        synchronized (this) {
            if (this.f4758c) {
                return;
            }
            this.f4758c = true;
            List<d.a.j.b> list = this.f4757b;
            this.f4757b = null;
            e(list);
        }
    }

    @Override // d.a.m.a.a
    public boolean d(d.a.j.b bVar) {
        d.a.m.b.b.c(bVar, "d is null");
        if (!this.f4758c) {
            synchronized (this) {
                if (!this.f4758c) {
                    List linkedList = this.f4757b;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.f4757b = linkedList;
                    }
                    linkedList.add(bVar);
                    return true;
                }
            }
        }
        bVar.c();
        return false;
    }

    void e(List<d.a.j.b> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        Iterator<d.a.j.b> it = list.iterator();
        while (it.hasNext()) {
            try {
                it.next().c();
            } catch (Throwable th) {
                d.a.k.b.b(th);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(th);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new d.a.k.a(arrayList);
            }
            throw d.a.m.h.a.a((Throwable) arrayList.get(0));
        }
    }
}
