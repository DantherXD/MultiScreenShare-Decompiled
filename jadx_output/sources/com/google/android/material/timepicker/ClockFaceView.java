package com.google.android.material.timepicker;

import a.g.l.v;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c.b.a.b.d;
import c.b.a.b.f;
import c.b.a.b.h;
import c.b.a.b.j;
import c.b.a.b.k;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {
    private final ClockHandView C;
    private final Rect D;
    private final RectF E;
    private final SparseArray<TextView> F;
    private final a.g.l.a G;
    private final int[] H;
    private final float[] I;
    private final int J;
    private final int K;
    private final int L;
    private final int M;
    private String[] N;
    private float O;
    private final ColorStateList P;

    class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.D(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.C.g()) - ClockFaceView.this.J);
            return true;
        }
    }

    class b extends a.g.l.a {
        b() {
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            int iIntValue = ((Integer) view.getTag(f.n)).intValue();
            if (iIntValue > 0) {
                cVar.s0((View) ClockFaceView.this.F.get(iIntValue - 1));
            }
            cVar.Z(a.g.l.e0.c.C0020c.a(0, 1, iIntValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.a.b.b.s);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.D = new Rect();
        this.E = new RectF();
        this.F = new SparseArray<>();
        this.I = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.R0, i, j.r);
        Resources resources = getResources();
        ColorStateList colorStateListA = c.b.a.b.x.c.a(context, typedArrayObtainStyledAttributes, k.T0);
        this.P = colorStateListA;
        LayoutInflater.from(context).inflate(h.f2735e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.h);
        this.C = clockHandView;
        this.J = resources.getDimensionPixelSize(d.j);
        int colorForState = colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor());
        this.H = new int[]{colorForState, colorForState, colorStateListA.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = a.a.k.a.a.c(context, c.b.a.b.c.f2706b).getDefaultColor();
        ColorStateList colorStateListA2 = c.b.a.b.x.c.a(context, typedArrayObtainStyledAttributes, k.S0);
        setBackgroundColor(colorStateListA2 != null ? colorStateListA2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        typedArrayObtainStyledAttributes.recycle();
        this.G = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        N(strArr, 0);
        this.K = resources.getDimensionPixelSize(d.w);
        this.L = resources.getDimensionPixelSize(d.x);
        this.M = resources.getDimensionPixelSize(d.l);
    }

    private void K() {
        RectF rectFD = this.C.d();
        for (int i = 0; i < this.F.size(); i++) {
            TextView textView = this.F.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.D);
                this.D.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.D);
                this.E.set(this.D);
                textView.getPaint().setShader(L(rectFD, this.E));
                textView.invalidate();
            }
        }
    }

    private RadialGradient L(RectF rectF, RectF rectF2) {
        if (RectF.intersects(rectF, rectF2)) {
            return new RadialGradient(rectF.centerX() - this.E.left, rectF.centerY() - this.E.top, rectF.width() * 0.5f, this.H, this.I, Shader.TileMode.CLAMP);
        }
        return null;
    }

    private static float M(float f2, float f3, float f4) {
        return Math.max(Math.max(f2, f3), f4);
    }

    private void O(int i) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int size = this.F.size();
        for (int i2 = 0; i2 < Math.max(this.N.length, size); i2++) {
            TextView textView = this.F.get(i2);
            if (i2 >= this.N.length) {
                removeView(textView);
                this.F.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) layoutInflaterFrom.inflate(h.f2734d, (ViewGroup) this, false);
                    this.F.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.N[i2]);
                textView.setTag(f.n, Integer.valueOf(i2));
                v.o0(textView, this.G);
                textView.setTextColor(this.P);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, this.N[i2]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.b
    public void D(int i) {
        if (i != C()) {
            super.D(i);
            this.C.j(C());
        }
    }

    public void N(String[] strArr, int i) {
        this.N = strArr;
        O(i);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f2, boolean z) {
        if (Math.abs(this.O - f2) > 0.001f) {
            this.O = f2;
            K();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        a.g.l.e0.c.v0(accessibilityNodeInfo).Y(a.g.l.e0.c.b.a(1, this.N.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        K();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int iM = (int) (this.M / M(this.K / displayMetrics.heightPixels, this.L / displayMetrics.widthPixels, 1.0f));
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM, 1073741824);
        setMeasuredDimension(iM, iM);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }
}
