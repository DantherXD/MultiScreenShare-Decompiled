package a.a.n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f97a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f98b;

    public static class a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final ActionMode.Callback f99a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Context f100b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ArrayList<f> f101c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final a.d.g<Menu, Menu> f102d = new a.d.g<>();

        public a(Context context, ActionMode.Callback callback) {
            this.f100b = context;
            this.f99a = callback;
        }

        private Menu f(Menu menu) {
            Menu menu2 = this.f102d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            o oVar = new o(this.f100b, (a.g.f.a.a) menu);
            this.f102d.put(menu, oVar);
            return oVar;
        }

        @Override // a.a.n.b.a
        public boolean a(b bVar, Menu menu) {
            return this.f99a.onPrepareActionMode(e(bVar), f(menu));
        }

        @Override // a.a.n.b.a
        public boolean b(b bVar, MenuItem menuItem) {
            return this.f99a.onActionItemClicked(e(bVar), new j(this.f100b, (a.g.f.a.b) menuItem));
        }

        @Override // a.a.n.b.a
        public boolean c(b bVar, Menu menu) {
            return this.f99a.onCreateActionMode(e(bVar), f(menu));
        }

        @Override // a.a.n.b.a
        public void d(b bVar) {
            this.f99a.onDestroyActionMode(e(bVar));
        }

        public ActionMode e(b bVar) {
            int size = this.f101c.size();
            for (int i = 0; i < size; i++) {
                f fVar = this.f101c.get(i);
                if (fVar != null && fVar.f98b == bVar) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f100b, bVar);
            this.f101c.add(fVar2);
            return fVar2;
        }
    }

    public f(Context context, b bVar) {
        this.f97a = context;
        this.f98b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f98b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f98b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new o(this.f97a, (a.g.f.a.a) this.f98b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f98b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f98b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f98b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f98b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f98b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f98b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f98b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f98b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f98b.n(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f98b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f98b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f98b.q(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f98b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f98b.s(z);
    }
}
