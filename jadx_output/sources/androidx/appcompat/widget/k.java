package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class k extends EditText implements a.g.l.u, a.g.l.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f1424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final z f1425c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final y f1426d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.core.widget.j f1427e;

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.A);
    }

    public k(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        s0.a(this, getContext());
        e eVar = new e(this);
        this.f1424b = eVar;
        eVar.e(attributeSet, i);
        z zVar = new z(this);
        this.f1425c = zVar;
        zVar.m(attributeSet, i);
        zVar.b();
        this.f1426d = new y(this);
        this.f1427e = new androidx.core.widget.j();
    }

    @Override // a.g.l.s
    public a.g.l.c a(a.g.l.c cVar) {
        return this.f1427e.a(this, cVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1424b;
        if (eVar != null) {
            eVar.b();
        }
        z zVar = this.f1425c;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // a.g.l.u
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1424b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // a.g.l.u
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1424b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        y yVar;
        return (Build.VERSION.SDK_INT >= 28 || (yVar = this.f1426d) == null) ? super.getTextClassifier() : yVar.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1425c.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = l.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        String[] strArrF = a.g.l.v.F(this);
        if (inputConnectionA == null || strArrF == null) {
            return inputConnectionA;
        }
        a.g.l.f0.a.d(editorInfo, strArrF);
        return a.g.l.f0.b.a(inputConnectionA, editorInfo, u.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (u.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (u.c(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1424b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.f1424b;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.i.p(this, callback));
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1424b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // a.g.l.u
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1424b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        z zVar = this.f1425c;
        if (zVar != null) {
            zVar.q(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        y yVar;
        if (Build.VERSION.SDK_INT >= 28 || (yVar = this.f1426d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            yVar.b(textClassifier);
        }
    }
}
