package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f4000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f4001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f4002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f4003d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f4004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f4005f;
    final b g;
    final Paint h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.b.a.b.x.b.c(context, c.b.a.b.b.r, h.class.getCanonicalName()), c.b.a.b.k.q2);
        this.f4000a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.t2, 0));
        this.g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.r2, 0));
        this.f4001b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.s2, 0));
        this.f4002c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.u2, 0));
        ColorStateList colorStateListA = c.b.a.b.x.c.a(context, typedArrayObtainStyledAttributes, c.b.a.b.k.v2);
        this.f4003d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.x2, 0));
        this.f4004e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.w2, 0));
        this.f4005f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(c.b.a.b.k.y2, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
