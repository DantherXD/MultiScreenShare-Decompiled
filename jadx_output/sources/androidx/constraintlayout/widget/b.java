package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f1591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f1592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Context f1593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected a.e.a.m.h f1594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected boolean f1595f;
    protected String g;
    protected String h;
    private View[] i;
    protected HashMap<Integer, String> j;

    public b(Context context) {
        super(context);
        this.f1591b = new int[32];
        this.f1595f = false;
        this.i = null;
        this.j = new HashMap<>();
        this.f1593d = context;
        m(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1591b = new int[32];
        this.f1595f = false;
        this.i = null;
        this.j = new HashMap<>();
        this.f1593d = context;
        m(attributeSet);
    }

    private void d(String str) {
        if (str == null || str.length() == 0 || this.f1593d == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int iK = k(strTrim);
        if (iK != 0) {
            this.j.put(Integer.valueOf(iK), strTrim);
            e(iK);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
    }

    private void e(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f1592c + 1;
        int[] iArr = this.f1591b;
        if (i2 > iArr.length) {
            this.f1591b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1591b;
        int i3 = this.f1592c;
        iArr2[i3] = i;
        this.f1592c = i3 + 1;
    }

    private void f(String str) {
        if (str == null || str.length() == 0 || this.f1593d == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && strTrim.equals(((ConstraintLayout.b) layoutParams).c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1593d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String resourceEntryName = null;
                try {
                    resourceEntryName = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(resourceEntryName)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int iJ = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object objG = constraintLayout.g(0, str);
            if (objG instanceof Integer) {
                iJ = ((Integer) objG).intValue();
            }
        }
        if (iJ == 0 && constraintLayout != null) {
            iJ = j(constraintLayout, str);
        }
        if (iJ == 0) {
            try {
                iJ = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return iJ == 0 ? this.f1593d.getResources().getIdentifier(str, "id", this.f1593d.getPackageName()) : iJ;
    }

    protected void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1591b, this.f1592c);
    }

    protected void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i = 0; i < this.f1592c; i++) {
            View viewL = constraintLayout.l(this.f1591b[i]);
            if (viewL != null) {
                viewL.setVisibility(visibility);
                if (elevation > 0.0f && Build.VERSION.SDK_INT >= 21) {
                    viewL.setTranslationZ(viewL.getTranslationZ() + elevation);
                }
            }
        }
    }

    protected void i(ConstraintLayout constraintLayout) {
    }

    protected View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.i;
        if (viewArr == null || viewArr.length != this.f1592c) {
            this.i = new View[this.f1592c];
        }
        for (int i = 0; i < this.f1592c; i++) {
            this.i[i] = constraintLayout.l(this.f1591b[i]);
        }
        return this.i;
    }

    protected void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.n1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == i.z1) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.g = string;
                    setIds(string);
                } else if (index == i.A1) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.h = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void n(a.e.a.m.e eVar, boolean z) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1595f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int iJ;
        if (isInEditMode()) {
            setIds(this.g);
        }
        a.e.a.m.h hVar = this.f1594e;
        if (hVar == null) {
            return;
        }
        hVar.a();
        for (int i = 0; i < this.f1592c; i++) {
            int i2 = this.f1591b[i];
            View viewL = constraintLayout.l(i2);
            if (viewL == null && (iJ = j(constraintLayout, (str = this.j.get(Integer.valueOf(i2))))) != 0) {
                this.f1591b[i] = iJ;
                this.j.put(Integer.valueOf(iJ), str);
                viewL = constraintLayout.l(iJ);
            }
            if (viewL != null) {
                this.f1594e.c(constraintLayout.p(viewL));
            }
        }
        this.f1594e.b(constraintLayout.f1563e);
    }

    public void s() {
        if (this.f1594e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).v0 = (a.e.a.m.e) this.f1594e;
        }
    }

    protected void setIds(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1592c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                d(str.substring(i));
                return;
            } else {
                d(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.h = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1592c = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                f(str.substring(i));
                return;
            } else {
                f(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.g = null;
        this.f1592c = 0;
        for (int i : iArr) {
            e(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.g == null) {
            e(i);
        }
    }
}
