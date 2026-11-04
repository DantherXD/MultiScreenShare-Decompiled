package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* JADX INFO: loaded from: classes.dex */
public class p extends MultiAutoCompleteTextView implements a.g.l.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f1455b = {R.attr.popupBackground};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f1456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final z f1457d;

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.p);
    }

    public p(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        s0.a(this, getContext());
        x0 x0VarV = x0.v(getContext(), attributeSet, f1455b, i, 0);
        if (x0VarV.s(0)) {
            setDropDownBackgroundDrawable(x0VarV.g(0));
        }
        x0VarV.w();
        e eVar = new e(this);
        this.f1456c = eVar;
        eVar.e(attributeSet, i);
        z zVar = new z(this);
        this.f1457d = zVar;
        zVar.m(attributeSet, i);
        zVar.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1456c;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f1457d;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // a.g.l.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1456c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.g.l.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1456c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return l.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1456c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1456c;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(a.a.k.a.a.d(getContext(), i));
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1456c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1456c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        z zVar = this.f1457d;
        if (zVar != null) {
            zVar.q(context, i);
        }
    }
}
