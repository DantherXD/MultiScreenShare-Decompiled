package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class k<S> extends p<S> {
    private int d0;
    private d<S> e0;
    private com.google.android.material.datepicker.a f0;

    class a extends o<S> {
        a() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s) {
            Iterator<o<S>> it = k.this.c0.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    static <T> k<T> E1(d<T> dVar, int i, com.google.android.material.datepicker.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.t1(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void H0(Bundle bundle) {
        super.H0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.d0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.e0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f0);
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        super.l0(bundle);
        if (bundle == null) {
            bundle = o();
        }
        this.d0 = bundle.getInt("THEME_RES_ID_KEY");
        this.e0 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View p0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.e0.h(layoutInflater.cloneInContext(new ContextThemeWrapper(q(), this.d0)), viewGroup, bundle, this.f0, new a());
    }
}
