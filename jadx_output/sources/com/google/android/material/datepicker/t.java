package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class t extends RecyclerView.h<b> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h<?> f4054d;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4055b;

        a(int i) {
            this.f4055b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f4054d.V1(t.this.f4054d.N1().n(l.k(this.f4055b, t.this.f4054d.P1().f4036c)));
            t.this.f4054d.W1(h.k.DAY);
        }
    }

    public static class b extends RecyclerView.e0 {
        final TextView u;

        b(TextView textView) {
            super(textView);
            this.u = textView;
        }
    }

    t(h<?> hVar) {
        this.f4054d = hVar;
    }

    private View.OnClickListener x(int i) {
        return new a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void l(b bVar, int i) {
        int iZ = z(i);
        String string = bVar.u.getContext().getString(c.b.a.b.i.k);
        bVar.u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iZ)));
        bVar.u.setContentDescription(String.format(string, Integer.valueOf(iZ)));
        c cVarO1 = this.f4054d.O1();
        Calendar calendarI = s.i();
        com.google.android.material.datepicker.b bVar2 = calendarI.get(1) == iZ ? cVarO1.f4005f : cVarO1.f4003d;
        Iterator<Long> it = this.f4054d.Q1().i().iterator();
        while (it.hasNext()) {
            calendarI.setTimeInMillis(it.next().longValue());
            if (calendarI.get(1) == iZ) {
                bVar2 = cVarO1.f4004e;
            }
        }
        bVar2.d(bVar.u);
        bVar.u.setOnClickListener(x(iZ));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public b n(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(c.b.a.b.h.o, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f4054d.N1().t();
    }

    int y(int i) {
        return i - this.f4054d.N1().s().f4037d;
    }

    int z(int i) {
        return this.f4054d.N1().s().f4037d + i;
    }
}
