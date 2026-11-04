package com.google.android.material.datepicker;

import a.g.l.v;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class n extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f4045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f4046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d<?> f4047f;
    private final h.l g;
    private final int h;

    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f4048b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f4048b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f4048b.getAdapter().n(i)) {
                n.this.g.a(this.f4048b.getAdapter().getItem(i).longValue());
            }
        }
    }

    public static class b extends RecyclerView.e0 {
        final TextView u;
        final MaterialCalendarGridView v;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(c.b.a.b.f.s);
            this.u = textView;
            v.p0(textView, true);
            this.v = (MaterialCalendarGridView) linearLayout.findViewById(c.b.a.b.f.o);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    n(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l lVarS = aVar.s();
        l lVarP = aVar.p();
        l lVarR = aVar.r();
        if (lVarS.compareTo(lVarR) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (lVarR.compareTo(lVarP) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        int iR1 = m.f4040b * h.R1(context);
        int iR2 = i.e2(context) ? h.R1(context) : 0;
        this.f4045d = context;
        this.h = iR1 + iR2;
        this.f4046e = aVar;
        this.f4047f = dVar;
        this.g = lVar;
        u(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void l(b bVar, int i) {
        l lVarS = this.f4046e.s().s(i);
        bVar.u.setText(lVarS.q(bVar.f2175b.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.v.findViewById(c.b.a.b.f.o);
        if (materialCalendarGridView.getAdapter() == null || !lVarS.equals(materialCalendarGridView.getAdapter().f4041c)) {
            m mVar = new m(lVarS, this.f4047f, this.f4046e);
            materialCalendarGridView.setNumColumns(lVarS.f4038e);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b n(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(c.b.a.b.h.m, viewGroup, false);
        if (!i.e2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f4046e.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long e(int i) {
        return this.f4046e.s().s(i).r();
    }

    l x(int i) {
        return this.f4046e.s().s(i);
    }

    CharSequence y(int i) {
        return x(i).q(this.f4045d);
    }

    int z(l lVar) {
        return this.f4046e.s().t(lVar);
    }
}
