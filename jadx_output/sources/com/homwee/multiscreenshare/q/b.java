package com.homwee.multiscreenshare.q;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b extends androidx.viewpager.widget.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<View> f4667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f4668d;

    public interface a {
        View a(int i);

        int b();
    }

    public b(a aVar) {
        this.f4668d = aVar;
    }

    @Override // androidx.viewpager.widget.a
    public void a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    @Override // androidx.viewpager.widget.a
    public int d() {
        a aVar = this.f4668d;
        return aVar == null ? this.f4667c.size() : aVar.b();
    }

    @Override // androidx.viewpager.widget.a
    public int e(Object obj) {
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public Object g(ViewGroup viewGroup, int i) {
        a aVar = this.f4668d;
        View viewA = aVar == null ? this.f4667c.get(i) : aVar.a(i);
        ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
        if (viewGroup2 != null) {
            viewGroup2.removeView(viewA);
        }
        viewGroup.addView(viewA);
        return viewA;
    }

    @Override // androidx.viewpager.widget.a
    public boolean h(View view, Object obj) {
        return view == obj;
    }
}
