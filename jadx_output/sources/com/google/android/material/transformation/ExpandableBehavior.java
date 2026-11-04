package com.google.android.material.transformation;

import a.g.l.v;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4272a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f4274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c.b.a.b.u.a f4275d;

        a(View view, int i, c.b.a.b.u.a aVar) {
            this.f4273b = view;
            this.f4274c = i;
            this.f4275d = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f4273b.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f4272a == this.f4274c) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                c.b.a.b.u.a aVar = this.f4275d;
                expandableBehavior.H((View) aVar, this.f4273b, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f4272a = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4272a = 0;
    }

    private boolean F(boolean z) {
        int i = this.f4272a;
        if (z) {
            return i == 0 || i == 2;
        }
        return i == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected c.b.a.b.u.a G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listR = coordinatorLayout.r(view);
        int size = listR.size();
        for (int i = 0; i < size; i++) {
            View view2 = listR.get(i);
            if (e(coordinatorLayout, view, view2)) {
                return (c.b.a.b.u.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z, boolean z2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        c.b.a.b.u.a aVar = (c.b.a.b.u.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f4272a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i) {
        c.b.a.b.u.a aVarG;
        if (v.T(view) || (aVarG = G(coordinatorLayout, view)) == null || !F(aVarG.a())) {
            return false;
        }
        int i2 = aVarG.a() ? 1 : 2;
        this.f4272a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, aVarG));
        return false;
    }
}
