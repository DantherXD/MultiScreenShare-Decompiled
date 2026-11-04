package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
abstract class p<S> extends Fragment {
    protected final LinkedHashSet<o<S>> c0 = new LinkedHashSet<>();

    p() {
    }

    boolean C1(o<S> oVar) {
        return this.c0.add(oVar);
    }

    void D1() {
        this.c0.clear();
    }
}
