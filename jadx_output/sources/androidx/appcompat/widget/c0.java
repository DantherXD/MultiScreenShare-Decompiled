package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends ToggleButton implements a.g.l.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f1366c;

    public c0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public c0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f1365b = eVar;
        eVar.e(attributeSet, i);
        z zVar = new z(this);
        this.f1366c = zVar;
        zVar.m(attributeSet, i);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1365b;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f1366c;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // a.g.l.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1365b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.g.l.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1365b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1365b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1365b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1365b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1365b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }
}
