package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g f1204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1205c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f1207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LayoutInflater f1208f;
    private final int g;

    public f(g gVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.f1207e = z;
        this.f1208f = layoutInflater;
        this.f1204b = gVar;
        this.g = i;
        a();
    }

    void a() {
        i iVarV = this.f1204b.v();
        if (iVarV != null) {
            ArrayList<i> arrayListZ = this.f1204b.z();
            int size = arrayListZ.size();
            for (int i = 0; i < size; i++) {
                if (arrayListZ.get(i) == iVarV) {
                    this.f1205c = i;
                    return;
                }
            }
        }
        this.f1205c = -1;
    }

    public g b() {
        return this.f1204b;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i getItem(int i) {
        ArrayList<i> arrayListZ = this.f1207e ? this.f1204b.z() : this.f1204b.E();
        int i2 = this.f1205c;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListZ.get(i);
    }

    public void d(boolean z) {
        this.f1206d = z;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<i> arrayListZ = this.f1207e ? this.f1204b.z() : this.f1204b.E();
        return this.f1205c < 0 ? arrayListZ.size() : arrayListZ.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1208f.inflate(this.g, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f1204b.F() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        n.a aVar = (n.a) view;
        if (this.f1206d) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.e(getItem(i), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
