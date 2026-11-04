package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f1180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a.d.g<a.g.f.a.b, MenuItem> f1181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a.d.g<a.g.f.a.c, SubMenu> f1182c;

    c(Context context) {
        this.f1180a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof a.g.f.a.b)) {
            return menuItem;
        }
        a.g.f.a.b bVar = (a.g.f.a.b) menuItem;
        if (this.f1181b == null) {
            this.f1181b = new a.d.g<>();
        }
        MenuItem menuItem2 = this.f1181b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f1180a, bVar);
        this.f1181b.put(bVar, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof a.g.f.a.c)) {
            return subMenu;
        }
        a.g.f.a.c cVar = (a.g.f.a.c) subMenu;
        if (this.f1182c == null) {
            this.f1182c = new a.d.g<>();
        }
        SubMenu subMenu2 = this.f1182c.get(cVar);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f1180a, cVar);
        this.f1182c.put(cVar, sVar);
        return sVar;
    }

    final void e() {
        a.d.g<a.g.f.a.b, MenuItem> gVar = this.f1181b;
        if (gVar != null) {
            gVar.clear();
        }
        a.d.g<a.g.f.a.c, SubMenu> gVar2 = this.f1182c;
        if (gVar2 != null) {
            gVar2.clear();
        }
    }

    final void f(int i) {
        if (this.f1181b == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f1181b.size()) {
            if (this.f1181b.i(i2).getGroupId() == i) {
                this.f1181b.k(i2);
                i2--;
            }
            i2++;
        }
    }

    final void g(int i) {
        if (this.f1181b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f1181b.size(); i2++) {
            if (this.f1181b.i(i2).getItemId() == i) {
                this.f1181b.k(i2);
                return;
            }
        }
    }
}
