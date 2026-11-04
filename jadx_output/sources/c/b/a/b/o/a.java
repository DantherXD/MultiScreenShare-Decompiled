package c.b.a.b.o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;
import c.b.a.b.b;
import c.b.a.b.j;
import c.b.a.b.k;

/* JADX INFO: loaded from: classes.dex */
public class a extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f2778e = j.m;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[][] f2779f = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    private ColorStateList g;
    private boolean h;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f2700c);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i) {
        int i2 = f2778e;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayH = com.google.android.material.internal.j.h(context2, attributeSet, k.L2, i, i2, new int[0]);
        int i3 = k.M2;
        if (typedArrayH.hasValue(i3)) {
            c.c(this, c.b.a.b.x.c.a(context2, typedArrayH, i3));
        }
        this.h = typedArrayH.getBoolean(k.N2, false);
        typedArrayH.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.g == null) {
            int[][] iArr = f2779f;
            int[] iArr2 = new int[iArr.length];
            int iC = c.b.a.b.q.a.c(this, b.f2703f);
            int iC2 = c.b.a.b.q.a.c(this, b.k);
            int iC3 = c.b.a.b.q.a.c(this, b.h);
            iArr2[0] = c.b.a.b.q.a.f(iC2, iC, 1.0f);
            iArr2[1] = c.b.a.b.q.a.f(iC2, iC3, 0.54f);
            iArr2[2] = c.b.a.b.q.a.f(iC2, iC3, 0.38f);
            iArr2[3] = c.b.a.b.q.a.f(iC2, iC3, 0.38f);
            this.g = new ColorStateList(iArr, iArr2);
        }
        return this.g;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.h = z;
        c.c(this, z ? getMaterialThemeColorsTintList() : null);
    }
}
