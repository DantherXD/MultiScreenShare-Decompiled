package com.google.android.material.timepicker;

import a.g.l.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import c.b.a.b.a0.g;
import c.b.a.b.a0.i;
import c.b.a.b.f;
import c.b.a.b.h;
import c.b.a.b.k;

/* JADX INFO: loaded from: classes.dex */
class b extends ConstraintLayout {
    private int A;
    private g B;
    private final Runnable z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.F();
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(h.f2736f, this);
        v.r0(this, B());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.y3, i, 0);
        this.A = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.z3, 0);
        this.z = new a();
        typedArrayObtainStyledAttributes.recycle();
    }

    private Drawable B() {
        g gVar = new g();
        this.B = gVar;
        gVar.U(new i(0.5f));
        this.B.W(ColorStateList.valueOf(-1));
        return this.B;
    }

    private static boolean E(View view) {
        return "skip".equals(view.getTag());
    }

    private void G() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.z);
            handler.post(this.z);
        }
    }

    public int C() {
        return this.A;
    }

    public void D(int i) {
        this.A = i;
        F();
    }

    protected void F() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (E(getChildAt(i2))) {
                i++;
            }
        }
        d dVar = new d();
        dVar.g(this);
        float f2 = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            int i4 = f.f2724b;
            if (id != i4 && !E(childAt)) {
                dVar.i(childAt.getId(), i4, this.A, f2);
                f2 += 360.0f / (childCount - i);
            }
        }
        dVar.c(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            view.setId(v.k());
        }
        G();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        G();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.B.W(ColorStateList.valueOf(i));
    }
}
