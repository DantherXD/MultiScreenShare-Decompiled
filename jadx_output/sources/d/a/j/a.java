package d.a.j;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class a implements b, d.a.m.a.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d.a.m.h.b<b> f4744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile boolean f4745c;

    @Override // d.a.m.a.a
    public boolean a(b bVar) {
        d.a.m.b.b.c(bVar, "Disposable item is null");
        if (this.f4745c) {
            return false;
        }
        synchronized (this) {
            if (this.f4745c) {
                return false;
            }
            d.a.m.h.b<b> bVar2 = this.f4744b;
            if (bVar2 != null && bVar2.e(bVar)) {
                return true;
            }
            return false;
        }
    }

    @Override // d.a.m.a.a
    public boolean b(b bVar) {
        if (!a(bVar)) {
            return false;
        }
        bVar.c();
        return true;
    }

    @Override // d.a.j.b
    public void c() {
        if (this.f4745c) {
            return;
        }
        synchronized (this) {
            if (this.f4745c) {
                return;
            }
            this.f4745c = true;
            d.a.m.h.b<b> bVar = this.f4744b;
            this.f4744b = null;
            e(bVar);
        }
    }

    @Override // d.a.m.a.a
    public boolean d(b bVar) {
        d.a.m.b.b.c(bVar, "d is null");
        if (!this.f4745c) {
            synchronized (this) {
                if (!this.f4745c) {
                    d.a.m.h.b<b> bVar2 = this.f4744b;
                    if (bVar2 == null) {
                        bVar2 = new d.a.m.h.b<>();
                        this.f4744b = bVar2;
                    }
                    bVar2.a(bVar);
                    return true;
                }
            }
        }
        bVar.c();
        return false;
    }

    void e(d.a.m.h.b<b> bVar) {
        if (bVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj : bVar.b()) {
            if (obj instanceof b) {
                try {
                    ((b) obj).c();
                } catch (Throwable th) {
                    d.a.k.b.b(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new d.a.k.a(arrayList);
            }
            throw d.a.m.h.a.a((Throwable) arrayList.get(0));
        }
    }

    public boolean f() {
        return this.f4745c;
    }
}
