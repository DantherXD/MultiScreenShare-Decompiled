package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class e implements m, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Context f1197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    LayoutInflater f1198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    g f1199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ExpandedMenuView f1200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1201f;
    int g;
    int h;
    private m.a i;
    a j;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1202b = -1;

        public a() {
            a();
        }

        void a() {
            i iVarV = e.this.f1199d.v();
            if (iVarV != null) {
                ArrayList<i> arrayListZ = e.this.f1199d.z();
                int size = arrayListZ.size();
                for (int i = 0; i < size; i++) {
                    if (arrayListZ.get(i) == iVarV) {
                        this.f1202b = i;
                        return;
                    }
                }
            }
            this.f1202b = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public i getItem(int i) {
            ArrayList<i> arrayListZ = e.this.f1199d.z();
            int i2 = i + e.this.f1201f;
            int i3 = this.f1202b;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return arrayListZ.get(i2);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f1199d.z().size() - e.this.f1201f;
            return this.f1202b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f1198c.inflate(eVar.h, viewGroup, false);
            }
            ((n.a) view).e(getItem(i), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(int i, int i2) {
        this.h = i;
        this.g = i2;
    }

    public e(Context context, int i) {
        this(i, 0);
        this.f1197b = context;
        this.f1198c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.m
    public void a(g gVar, boolean z) {
        m.a aVar = this.i;
        if (aVar != null) {
            aVar.a(gVar, z);
        }
    }

    public ListAdapter b() {
        if (this.j == null) {
            this.j = new a();
        }
        return this.j;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean c() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:15:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.view.menu.m
    public void d(Context context, g gVar) {
        LayoutInflater layoutInflaterFrom;
        a aVar;
        if (this.g == 0) {
            if (this.f1197b != null) {
                this.f1197b = context;
                if (this.f1198c == null) {
                    layoutInflaterFrom = LayoutInflater.from(context);
                }
            }
            this.f1199d = gVar;
            aVar = this.j;
            if (aVar != null) {
                aVar.notifyDataSetChanged();
            }
        }
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.g);
        this.f1197b = contextThemeWrapper;
        layoutInflaterFrom = LayoutInflater.from(contextThemeWrapper);
        this.f1198c = layoutInflaterFrom;
        this.f1199d = gVar;
        aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean f(g gVar, i iVar) {
        return false;
    }

    public n g(ViewGroup viewGroup) {
        if (this.f1200e == null) {
            this.f1200e = (ExpandedMenuView) this.f1198c.inflate(a.a.g.g, viewGroup, false);
            if (this.j == null) {
                this.j = new a();
            }
            this.f1200e.setAdapter((ListAdapter) this.j);
            this.f1200e.setOnItemClickListener(this);
        }
        return this.f1200e;
    }

    @Override // androidx.appcompat.view.menu.m
    public void h(m.a aVar) {
        this.i = aVar;
    }

    @Override // androidx.appcompat.view.menu.m
    public boolean i(r rVar) {
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        new h(rVar).d(null);
        m.a aVar = this.i;
        if (aVar == null) {
            return true;
        }
        aVar.b(rVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.m
    public void j(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f1199d.M(this.j.getItem(i), this, 0);
    }
}
