package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* JADX INFO: loaded from: classes.dex */
public class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TypedArray f1531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TypedValue f1532c;

    private x0(Context context, TypedArray typedArray) {
        this.f1530a = context;
        this.f1531b = typedArray;
    }

    public static x0 t(Context context, int i, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(i, iArr));
    }

    public static x0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static x0 v(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new x0(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f1531b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f1531b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        ColorStateList colorStateListC;
        return (!this.f1531b.hasValue(i) || (resourceId = this.f1531b.getResourceId(i, 0)) == 0 || (colorStateListC = a.a.k.a.a.c(this.f1530a, resourceId)) == null) ? this.f1531b.getColorStateList(i) : colorStateListC;
    }

    public float d(int i, float f2) {
        return this.f1531b.getDimension(i, f2);
    }

    public int e(int i, int i2) {
        return this.f1531b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.f1531b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        return (!this.f1531b.hasValue(i) || (resourceId = this.f1531b.getResourceId(i, 0)) == 0) ? this.f1531b.getDrawable(i) : a.a.k.a.a.d(this.f1530a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        if (!this.f1531b.hasValue(i) || (resourceId = this.f1531b.getResourceId(i, 0)) == 0) {
            return null;
        }
        return j.b().d(this.f1530a, resourceId, true);
    }

    public float i(int i, float f2) {
        return this.f1531b.getFloat(i, f2);
    }

    public Typeface j(int i, int i2, a.g.d.f.f.a aVar) {
        int resourceId = this.f1531b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f1532c == null) {
            this.f1532c = new TypedValue();
        }
        return a.g.d.f.f.d(this.f1530a, resourceId, this.f1532c, i2, aVar);
    }

    public int k(int i, int i2) {
        return this.f1531b.getInt(i, i2);
    }

    public int l(int i, int i2) {
        return this.f1531b.getInteger(i, i2);
    }

    public int m(int i, int i2) {
        return this.f1531b.getLayoutDimension(i, i2);
    }

    public int n(int i, int i2) {
        return this.f1531b.getResourceId(i, i2);
    }

    public String o(int i) {
        return this.f1531b.getString(i);
    }

    public CharSequence p(int i) {
        return this.f1531b.getText(i);
    }

    public CharSequence[] q(int i) {
        return this.f1531b.getTextArray(i);
    }

    public TypedArray r() {
        return this.f1531b;
    }

    public boolean s(int i) {
        return this.f1531b.hasValue(i);
    }

    public void w() {
        this.f1531b.recycle();
    }
}
