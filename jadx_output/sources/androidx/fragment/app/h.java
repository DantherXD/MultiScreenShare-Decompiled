package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class h extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList<View> f1919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<View> f1920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f1921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1922e;

    h(Context context, AttributeSet attributeSet, n nVar) {
        String str;
        super(context, attributeSet);
        this.f1922e = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.k.c.h);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(a.k.c.i) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(a.k.c.j);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        Fragment fragmentG0 = nVar.g0(id);
        if (classAttribute != null && fragmentG0 == null) {
            if (id <= 0) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            Fragment fragmentA = nVar.p0().a(context.getClassLoader(), classAttribute);
            fragmentA.x0(context, attributeSet, null);
            nVar.l().o(true).c(this, fragmentA, string).i();
        }
        nVar.Q0(this);
    }

    private void a(View view) {
        ArrayList<View> arrayList = this.f1920c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.f1919b == null) {
            this.f1919b = new ArrayList<>();
        }
        this.f1919b.add(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (n.y0(view) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (n.y0(view) != null) {
            return super.addViewInLayout(view, i, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        a.g.l.d0 d0VarS = a.g.l.d0.s(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1921d;
        a.g.l.d0 d0VarS2 = onApplyWindowInsetsListener != null ? a.g.l.d0.s(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets)) : a.g.l.v.a0(this, d0VarS);
        if (!d0VarS2.l()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                a.g.l.v.h(getChildAt(i), d0VarS2);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.f1922e && this.f1919b != null) {
            for (int i = 0; i < this.f1919b.size(); i++) {
                super.drawChild(canvas, this.f1919b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.f1922e || (arrayList = this.f1919b) == null || arrayList.size() <= 0 || !this.f1919b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1920c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.f1919b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1922e = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    void setDrawDisappearingViewsLast(boolean z) {
        this.f1922e = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT >= 18) {
            throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
        }
        super.setLayoutTransition(layoutTransition);
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1921d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1920c == null) {
                this.f1920c = new ArrayList<>();
            }
            this.f1920c.add(view);
        }
        super.startViewTransition(view);
    }
}
