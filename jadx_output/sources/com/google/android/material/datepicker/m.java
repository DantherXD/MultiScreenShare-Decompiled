package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
class m extends BaseAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f4040b = s.k().getMaximum(4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final l f4041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final d<?> f4042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Collection<Long> f4043e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    c f4044f;
    final a g;

    m(l lVar, d<?> dVar, a aVar) {
        this.f4041c = lVar;
        this.f4042d = dVar;
        this.g = aVar;
        this.f4043e = dVar.i();
    }

    private void e(Context context) {
        if (this.f4044f == null) {
            this.f4044f = new c(context);
        }
    }

    private boolean h(long j) {
        Iterator<Long> it = this.f4042d.i().iterator();
        while (it.hasNext()) {
            if (s.a(j) == s.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.g.o().e(j)) {
            textView.setEnabled(true);
            if (h(j)) {
                bVar = this.f4044f.f4001b;
            } else {
                long timeInMillis = s.i().getTimeInMillis();
                c cVar = this.f4044f;
                bVar = timeInMillis == j ? cVar.f4002c : cVar.f4000a;
            }
        } else {
            textView.setEnabled(false);
            bVar = this.f4044f.g;
        }
        bVar.d(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (l.l(j).equals(this.f4041c)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(this.f4041c.p(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    int a(int i) {
        return b() + (i - 1);
    }

    int b() {
        return this.f4041c.n();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.f4041c.n() || i > i()) {
            return null;
        }
        return Long.valueOf(this.f4041c.o(j(i)));
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0072  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public TextView getView(int i, View view, ViewGroup viewGroup) {
        e(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c.b.a.b.h.j, viewGroup, false);
        }
        int iB = i - b();
        if (iB >= 0) {
            l lVar = this.f4041c;
            if (iB >= lVar.f4039f) {
                textView.setVisibility(8);
                textView.setEnabled(false);
            } else {
                int i2 = iB + 1;
                textView.setTag(lVar);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i2)));
                long jO = this.f4041c.o(i2);
                textView.setContentDescription(this.f4041c.f4037d == l.m().f4037d ? e.a(jO) : e.d(jO));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        } else {
            textView.setVisibility(8);
            textView.setEnabled(false);
        }
        Long item = getItem(i);
        if (item == null) {
            return textView;
        }
        k(textView, item.longValue());
        return textView;
    }

    boolean f(int i) {
        return i % this.f4041c.f4038e == 0;
    }

    boolean g(int i) {
        return (i + 1) % this.f4041c.f4038e == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4041c.f4039f + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f4041c.f4038e;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i() {
        return (this.f4041c.n() + this.f4041c.f4039f) - 1;
    }

    int j(int i) {
        return (i - this.f4041c.n()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f4043e.iterator();
        while (it.hasNext()) {
            l(materialCalendarGridView, it.next().longValue());
        }
        d<?> dVar = this.f4042d;
        if (dVar != null) {
            Iterator<Long> it2 = dVar.i().iterator();
            while (it2.hasNext()) {
                l(materialCalendarGridView, it2.next().longValue());
            }
            this.f4043e = this.f4042d.i();
        }
    }

    boolean n(int i) {
        return i >= b() && i <= i();
    }
}
