package com.homwee.multiscreenshare.q;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class c extends RecyclerView.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4669a;

    public c(int i) {
        this.f4669a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(Rect rect, View view, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        rect.top = recyclerView.d0(view) != 0 ? this.f4669a : 0;
    }
}
