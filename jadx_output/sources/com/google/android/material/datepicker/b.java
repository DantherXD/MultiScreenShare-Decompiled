package com.google.android.material.datepicker;

import a.g.l.v;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f3994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f3995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f3996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f3997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f3998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c.b.a.b.a0.k f3999f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, c.b.a.b.a0.k kVar, Rect rect) {
        a.g.k.h.c(rect.left);
        a.g.k.h.c(rect.top);
        a.g.k.h.c(rect.right);
        a.g.k.h.c(rect.bottom);
        this.f3994a = rect;
        this.f3995b = colorStateList2;
        this.f3996c = colorStateList;
        this.f3997d = colorStateList3;
        this.f3998e = i;
        this.f3999f = kVar;
    }

    static b a(Context context, int i) {
        a.g.k.h.a(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, c.b.a.b.k.z2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.b.a.b.k.A2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.b.a.b.k.C2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.b.a.b.k.B2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(c.b.a.b.k.D2, 0));
        ColorStateList colorStateListA = c.b.a.b.x.c.a(context, typedArrayObtainStyledAttributes, c.b.a.b.k.E2);
        ColorStateList colorStateListA2 = c.b.a.b.x.c.a(context, typedArrayObtainStyledAttributes, c.b.a.b.k.J2);
        ColorStateList colorStateListA3 = c.b.a.b.x.c.a(context, typedArrayObtainStyledAttributes, c.b.a.b.k.H2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.b.a.b.k.I2, 0);
        c.b.a.b.a0.k kVarM = c.b.a.b.a0.k.b(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.F2, 0), typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.G2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, kVarM, rect);
    }

    int b() {
        return this.f3994a.bottom;
    }

    int c() {
        return this.f3994a.top;
    }

    void d(TextView textView) {
        c.b.a.b.a0.g gVar = new c.b.a.b.a0.g();
        c.b.a.b.a0.g gVar2 = new c.b.a.b.a0.g();
        gVar.setShapeAppearanceModel(this.f3999f);
        gVar2.setShapeAppearanceModel(this.f3999f);
        gVar.W(this.f3996c);
        gVar.c0(this.f3998e, this.f3997d);
        textView.setTextColor(this.f3995b);
        Drawable rippleDrawable = Build.VERSION.SDK_INT >= 21 ? new RippleDrawable(this.f3995b.withAlpha(30), gVar, gVar2) : gVar;
        Rect rect = this.f3994a;
        v.r0(textView, new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
