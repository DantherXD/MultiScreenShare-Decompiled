package com.google.android.material.internal;

import a.g.l.v;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.z0;

/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends d implements n.a {
    private static final int[] w = {R.attr.state_checked};
    private final CheckedTextView A;
    private FrameLayout B;
    private androidx.appcompat.view.menu.i C;
    private ColorStateList D;
    private boolean E;
    private Drawable F;
    private final a.g.l.a G;
    private int x;
    private boolean y;
    boolean z;

    class a extends a.g.l.a {
        a() {
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            cVar.U(NavigationMenuItemView.this.z);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a aVar = new a();
        this.G = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(c.b.a.b.h.f2731a, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(c.b.a.b.d.f2715e));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(c.b.a.b.f.f2727e);
        this.A = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        v.o0(checkedTextView, aVar);
    }

    private void B() {
        j0.a aVar;
        int i;
        if (D()) {
            this.A.setVisibility(8);
            FrameLayout frameLayout = this.B;
            if (frameLayout == null) {
                return;
            }
            aVar = (j0.a) frameLayout.getLayoutParams();
            i = -1;
        } else {
            this.A.setVisibility(0);
            FrameLayout frameLayout2 = this.B;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (j0.a) frameLayout2.getLayoutParams();
            i = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i;
        this.B.setLayoutParams(aVar);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(a.a.a.v, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(w, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean D() {
        return this.C.getTitle() == null && this.C.getIcon() == null && this.C.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.B == null) {
                this.B = (FrameLayout) ((ViewStub) findViewById(c.b.a.b.f.f2726d)).inflate();
            }
            this.B.removeAllViews();
            this.B.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(androidx.appcompat.view.menu.i iVar, int i) {
        this.C = iVar;
        if (iVar.getItemId() > 0) {
            setId(iVar.getItemId());
        }
        setVisibility(iVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            v.r0(this, C());
        }
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setTitle(iVar.getTitle());
        setIcon(iVar.getIcon());
        setActionView(iVar.getActionView());
        setContentDescription(iVar.getContentDescription());
        z0.a(this, iVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.n.a
    public androidx.appcompat.view.menu.i getItemData() {
        return this.C;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        androidx.appcompat.view.menu.i iVar = this.C;
        if (iVar != null && iVar.isCheckable() && this.C.isChecked()) {
            ViewGroup.mergeDrawableStates(iArrOnCreateDrawableState, w);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
        if (this.z != z) {
            this.z = z;
            this.G.l(this.A, 2048);
        }
    }

    public void setChecked(boolean z) {
        refreshDrawableState();
        this.A.setChecked(z);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, 0, i, 0);
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.E) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.D);
            }
            int i = this.x;
            drawable.setBounds(0, 0, i, i);
        } else if (this.y) {
            if (this.F == null) {
                Drawable drawableB = a.g.d.f.f.b(getResources(), c.b.a.b.e.g, getContext().getTheme());
                this.F = drawableB;
                if (drawableB != null) {
                    int i2 = this.x;
                    drawableB.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.F;
        }
        androidx.core.widget.i.i(this.A, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.A.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.x = i;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.D = colorStateList;
        this.E = colorStateList != null;
        androidx.appcompat.view.menu.i iVar = this.C;
        if (iVar != null) {
            setIcon(iVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.A.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z) {
        this.y = z;
    }

    public void setTextAppearance(int i) {
        androidx.core.widget.i.n(this.A, i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.A.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.A.setText(charSequence);
    }
}
