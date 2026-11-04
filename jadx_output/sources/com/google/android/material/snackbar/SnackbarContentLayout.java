package com.google.android.material.snackbar;

import a.g.l.v;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.b.a.b.f;
import c.b.a.b.k;

/* JADX INFO: loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f4152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Button f4153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4155e;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.V3);
        this.f4154d = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.W3, -1);
        this.f4155e = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.d4, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private static void a(View view, int i, int i2) {
        if (v.V(view)) {
            v.A0(view, v.I(view), i, v.H(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    private boolean b(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f4152b.getPaddingTop() == i2 && this.f4152b.getPaddingBottom() == i3) {
            return z;
        }
        a(this.f4152b, i2, i3);
        return true;
    }

    public Button getActionView() {
        return this.f4153c;
    }

    public TextView getMessageView() {
        return this.f4152b;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f4152b = (TextView) findViewById(f.H);
        this.f4153c = (Button) findViewById(f.G);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4154d > 0) {
            int measuredWidth = getMeasuredWidth();
            int i3 = this.f4154d;
            if (measuredWidth > i3) {
                i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                super.onMeasure(i, i2);
            }
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.b.a.b.d.g);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.b.a.b.d.f2716f);
        boolean z = false;
        boolean z2 = this.f4152b.getLayout().getLineCount() > 1;
        if (!z2 || this.f4155e <= 0 || this.f4153c.getMeasuredWidth() <= this.f4155e) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (b(0, dimensionPixelSize, dimensionPixelSize)) {
                z = true;
            }
        } else if (b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            z = true;
        }
        if (z) {
            super.onMeasure(i, i2);
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.f4155e = i;
    }
}
