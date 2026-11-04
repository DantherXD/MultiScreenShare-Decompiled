package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes.dex */
class c<V extends View> extends CoordinatorLayout.c<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d f3870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f3871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3872c;

    public c() {
        this.f3871b = 0;
        this.f3872c = 0;
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3871b = 0;
        this.f3872c = 0;
    }

    public int E() {
        d dVar = this.f3870a;
        if (dVar != null) {
            return dVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.I(v, i);
    }

    public boolean G(int i) {
        d dVar = this.f3870a;
        if (dVar != null) {
            return dVar.e(i);
        }
        this.f3871b = i;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v, int i) {
        F(coordinatorLayout, v, i);
        if (this.f3870a == null) {
            this.f3870a = new d(v);
        }
        this.f3870a.c();
        this.f3870a.a();
        int i2 = this.f3871b;
        if (i2 != 0) {
            this.f3870a.e(i2);
            this.f3871b = 0;
        }
        int i3 = this.f3872c;
        if (i3 == 0) {
            return true;
        }
        this.f3870a.d(i3);
        this.f3872c = 0;
        return true;
    }
}
