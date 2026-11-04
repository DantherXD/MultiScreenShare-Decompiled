package androidx.appcompat.view.menu;

import a.g.l.v;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.widget.x0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private i f1164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f1165c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RadioButton f1166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TextView f1167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CheckBox f1168f;
    private TextView g;
    private ImageView h;
    private ImageView i;
    private LinearLayout j;
    private Drawable k;
    private int l;
    private Context m;
    private boolean n;
    private Drawable o;
    private boolean p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.C);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        x0 x0VarV = x0.v(getContext(), attributeSet, a.a.j.W1, i, 0);
        this.k = x0VarV.g(a.a.j.Y1);
        this.l = x0VarV.n(a.a.j.X1, -1);
        this.n = x0VarV.a(a.a.j.Z1, false);
        this.m = context;
        this.o = x0VarV.g(a.a.j.a2);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, a.a.a.z, 0);
        this.p = typedArrayObtainStyledAttributes.hasValue(0);
        x0VarV.w();
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(a.a.g.h, (ViewGroup) this, false);
        this.f1168f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(a.a.g.i, (ViewGroup) this, false);
        this.f1165c = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(a.a.g.k, (ViewGroup) this, false);
        this.f1166d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i) {
        this.f1164b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f1164b;
    }

    public void h(boolean z, char c2) {
        int i = (z && this.f1164b.A()) ? 0 : 8;
        if (i == 0) {
            this.g.setText(this.f1164b.h());
        }
        if (this.g.getVisibility() != i) {
            this.g.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        v.r0(this, this.k);
        TextView textView = (TextView) findViewById(a.a.f.M);
        this.f1167e = textView;
        int i = this.l;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.g = (TextView) findViewById(a.a.f.F);
        ImageView imageView = (ImageView) findViewById(a.a.f.I);
        this.h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(a.a.f.r);
        this.j = (LinearLayout) findViewById(a.a.f.l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1165c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1165c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f1166d == null && this.f1168f == null) {
            return;
        }
        if (this.f1164b.m()) {
            if (this.f1166d == null) {
                g();
            }
            compoundButton = this.f1166d;
            compoundButton2 = this.f1168f;
        } else {
            if (this.f1168f == null) {
                c();
            }
            compoundButton = this.f1168f;
            compoundButton2 = this.f1166d;
        }
        if (z) {
            compoundButton.setChecked(this.f1164b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1168f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1166d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f1164b.m()) {
            if (this.f1166d == null) {
                g();
            }
            compoundButton = this.f1166d;
        } else {
            if (this.f1168f == null) {
                c();
            }
            compoundButton = this.f1168f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f1164b.z() || this.r;
        if (z || this.n) {
            ImageView imageView = this.f1165c;
            if (imageView == null && drawable == null && !this.n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.n) {
                this.f1165c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1165c;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1165c.getVisibility() != 0) {
                this.f1165c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1167e.getVisibility() != 8) {
                this.f1167e.setVisibility(8);
            }
        } else {
            this.f1167e.setText(charSequence);
            if (this.f1167e.getVisibility() != 0) {
                this.f1167e.setVisibility(0);
            }
        }
    }
}
