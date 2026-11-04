package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* JADX INFO: loaded from: classes.dex */
public class f extends Button implements a.g.l.u, androidx.core.widget.b, androidx.core.widget.l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f1380c;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.q);
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f1379b = eVar;
        eVar.e(attributeSet, i);
        z zVar = new z(this);
        this.f1380c = zVar;
        zVar.m(attributeSet, i);
        zVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1379b;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f1779a) {
            return super.getAutoSizeMaxTextSize();
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            return zVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f1779a) {
            return super.getAutoSizeMinTextSize();
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            return zVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f1779a) {
            return super.getAutoSizeStepGranularity();
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            return zVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f1779a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        z zVar = this.f1380c;
        return zVar != null ? zVar.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f1779a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            return zVar.i();
        }
        return 0;
    }

    @Override // a.g.l.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1379b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.g.l.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1379b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1380c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1380c.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.o(z, i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        z zVar = this.f1380c;
        if (zVar == null || androidx.core.widget.b.f1779a || !zVar.l()) {
            return;
        }
        this.f1380c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.f1779a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.t(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (androidx.core.widget.b.f1779a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.u(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (androidx.core.widget.b.f1779a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.v(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1379b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1379b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.s(z);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1379b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1379b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1380c.w(colorStateList);
        this.f1380c.b();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1380c.x(mode);
        this.f1380c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) {
        if (androidx.core.widget.b.f1779a) {
            super.setTextSize(i, f2);
            return;
        }
        z zVar = this.f1380c;
        if (zVar != null) {
            zVar.A(i, f2);
        }
    }
}
