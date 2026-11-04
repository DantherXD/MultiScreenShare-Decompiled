package com.google.android.material.button;

import a.g.l.v;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.f;
import androidx.core.widget.i;
import c.b.a.b.a0.h;
import c.b.a.b.a0.n;
import c.b.a.b.j;
import c.b.a.b.k;
import com.google.android.material.internal.l;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends f implements Checkable, n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f3948d = {R.attr.state_checkable};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f3949e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f3950f = j.i;
    private final com.google.android.material.button.a g;
    private final LinkedHashSet<a> h;
    private b i;
    private PorterDuff.Mode j;
    private ColorStateList k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private int s;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    static class c extends a.i.a.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f3951d;

        static class a implements Parcelable.ClassLoaderCreator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            k(parcel);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void k(Parcel parcel) {
            this.f3951d = parcel.readInt() == 1;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f3951d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.a.b.b.p);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = f3950f;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i, i2), attributeSet, i);
        this.h = new LinkedHashSet<>();
        this.q = false;
        this.r = false;
        Context context2 = getContext();
        TypedArray typedArrayH = com.google.android.material.internal.j.h(context2, attributeSet, k.S1, i, i2, new int[0]);
        this.p = typedArrayH.getDimensionPixelSize(k.f2, 0);
        this.j = l.e(typedArrayH.getInt(k.i2, -1), PorterDuff.Mode.SRC_IN);
        this.k = c.b.a.b.x.c.a(getContext(), typedArrayH, k.h2);
        this.l = c.b.a.b.x.c.d(getContext(), typedArrayH, k.d2);
        this.s = typedArrayH.getInteger(k.e2, 1);
        this.m = typedArrayH.getDimensionPixelSize(k.g2, 0);
        com.google.android.material.button.a aVar = new com.google.android.material.button.a(this, c.b.a.b.a0.k.e(context2, attributeSet, i, i2).m());
        this.g = aVar;
        aVar.q(typedArrayH);
        typedArrayH.recycle();
        setCompoundDrawablePadding(this.p);
        j(this.l != null);
    }

    private boolean c() {
        int i = this.s;
        return i == 3 || i == 4;
    }

    private boolean d() {
        int i = this.s;
        return i == 1 || i == 2;
    }

    private boolean e() {
        int i = this.s;
        return i == 16 || i == 32;
    }

    private boolean f() {
        return v.C(this) == 1;
    }

    private boolean g() {
        com.google.android.material.button.a aVar = this.g;
        return (aVar == null || aVar.o()) ? false : true;
    }

    private String getA11yClassName() {
        return (b() ? CompoundButton.class : Button.class).getName();
    }

    private int getTextHeight() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextWidth() {
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        return Math.min((int) paint.measureText(string), getLayout().getEllipsizedWidth());
    }

    private void i() {
        if (d()) {
            i.i(this, this.l, null, null, null);
        } else if (c()) {
            i.i(this, null, null, this.l, null);
        } else if (e()) {
            i.i(this, null, this.l, null, null);
        }
    }

    private void j(boolean z) {
        Drawable drawable = this.l;
        if (drawable != null) {
            Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
            this.l = drawableMutate;
            androidx.core.graphics.drawable.a.o(drawableMutate, this.k);
            PorterDuff.Mode mode = this.j;
            if (mode != null) {
                androidx.core.graphics.drawable.a.p(this.l, mode);
            }
            int intrinsicWidth = this.m;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.l.getIntrinsicWidth();
            }
            int intrinsicHeight = this.m;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.l.getIntrinsicHeight();
            }
            Drawable drawable2 = this.l;
            int i = this.n;
            int i2 = this.o;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
        }
        if (z) {
            i();
            return;
        }
        Drawable[] drawableArrA = i.a(this);
        boolean z2 = false;
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        if ((d() && drawable3 != this.l) || ((c() && drawable5 != this.l) || (e() && drawable4 != this.l))) {
            z2 = true;
        }
        if (z2) {
            i();
        }
    }

    private void k(int i, int i2) {
        if (this.l == null || getLayout() == null) {
            return;
        }
        if (!d() && !c()) {
            if (e()) {
                this.n = 0;
                if (this.s == 16) {
                    this.o = 0;
                    j(false);
                    return;
                }
                int intrinsicHeight = this.m;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.l.getIntrinsicHeight();
                }
                int textHeight = (((((i2 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.p) - getPaddingBottom()) / 2;
                if (this.o != textHeight) {
                    this.o = textHeight;
                    j(false);
                }
                return;
            }
            return;
        }
        this.o = 0;
        int i3 = this.s;
        if (i3 == 1 || i3 == 3) {
            this.n = 0;
            j(false);
            return;
        }
        int intrinsicWidth = this.m;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.l.getIntrinsicWidth();
        }
        int textWidth = (((((i - getTextWidth()) - v.H(this)) - intrinsicWidth) - this.p) - v.I(this)) / 2;
        if (f() != (this.s == 4)) {
            textWidth = -textWidth;
        }
        if (this.n != textWidth) {
            this.n = textWidth;
            j(false);
        }
    }

    public void a(a aVar) {
        this.h.add(aVar);
    }

    public boolean b() {
        com.google.android.material.button.a aVar = this.g;
        return aVar != null && aVar.p();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (g()) {
            return this.g.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.l;
    }

    public int getIconGravity() {
        return this.s;
    }

    public int getIconPadding() {
        return this.p;
    }

    public int getIconSize() {
        return this.m;
    }

    public ColorStateList getIconTint() {
        return this.k;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.j;
    }

    public int getInsetBottom() {
        return this.g.c();
    }

    public int getInsetTop() {
        return this.g.d();
    }

    public ColorStateList getRippleColor() {
        if (g()) {
            return this.g.h();
        }
        return null;
    }

    public c.b.a.b.a0.k getShapeAppearanceModel() {
        if (g()) {
            return this.g.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (g()) {
            return this.g.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (g()) {
            return this.g.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.f, a.g.l.u
    public ColorStateList getSupportBackgroundTintList() {
        return g() ? this.g.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.f, a.g.l.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return g() ? this.g.m() : super.getSupportBackgroundTintMode();
    }

    public void h(a aVar) {
        this.h.remove(aVar);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.q;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (g()) {
            h.f(this, this.g.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (b()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f3948d);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(iArrOnCreateDrawableState, f3949e);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(b());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.google.android.material.button.a aVar;
        super.onLayout(z, i, i2, i3, i4);
        if (Build.VERSION.SDK_INT != 21 || (aVar = this.g) == null) {
            return;
        }
        aVar.H(i4 - i2, i3 - i);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.j());
        setChecked(cVar.f3951d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f3951d = this.q;
        return cVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        k(i, i2);
    }

    @Override // androidx.appcompat.widget.f, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        k(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (g()) {
            this.g.r(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (g()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            } else {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.g.s();
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.f, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? a.a.k.a.a.d(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (g()) {
            this.g.t(z);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (b() && isEnabled() && this.q != z) {
            this.q = z;
            refreshDrawableState();
            if (this.r) {
                return;
            }
            this.r = true;
            Iterator<a> it = this.h.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.q);
            }
            this.r = false;
        }
    }

    public void setCornerRadius(int i) {
        if (g()) {
            this.g.u(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (g()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (g()) {
            this.g.f().V(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.l != drawable) {
            this.l = drawable;
            j(true);
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.s != i) {
            this.s = i;
            k(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.p != i) {
            this.p = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? a.a.k.a.a.d(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.m != i) {
            this.m = i;
            j(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            j(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.j != mode) {
            this.j = mode;
            j(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(a.a.k.a.a.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        this.g.v(i);
    }

    public void setInsetTop(int i) {
        this.g.w(i);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.i = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.i;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (g()) {
            this.g.x(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (g()) {
            setRippleColor(a.a.k.a.a.c(getContext(), i));
        }
    }

    @Override // c.b.a.b.a0.n
    public void setShapeAppearanceModel(c.b.a.b.a0.k kVar) {
        if (!g()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.g.y(kVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z) {
        if (g()) {
            this.g.z(z);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (g()) {
            this.g.A(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (g()) {
            setStrokeColor(a.a.k.a.a.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (g()) {
            this.g.B(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (g()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.f, a.g.l.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (g()) {
            this.g.C(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.f, a.g.l.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (g()) {
            this.g.D(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.q);
    }
}
