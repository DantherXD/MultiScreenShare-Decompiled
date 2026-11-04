package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
public class j0 extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f1419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1422e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1423f;
    private int g;
    private float h;
    private boolean i;
    private int[] j;
    private int[] k;
    private Drawable l;
    private int m;
    private int n;
    private int o;
    private int p;

    public static class a extends LinearLayout.LayoutParams {
        public a(int i, int i2) {
            super(i, i2);
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public j0(Context context) {
        this(context, null);
    }

    public j0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public j0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1419b = true;
        this.f1420c = -1;
        this.f1421d = 0;
        this.f1423f = 8388659;
        int[] iArr = a.a.j.d1;
        x0 x0VarV = x0.v(context, attributeSet, iArr, i, 0);
        a.g.l.v.m0(this, context, iArr, attributeSet, x0VarV.r(), i, 0);
        int iK = x0VarV.k(a.a.j.f1, -1);
        if (iK >= 0) {
            setOrientation(iK);
        }
        int iK2 = x0VarV.k(a.a.j.e1, -1);
        if (iK2 >= 0) {
            setGravity(iK2);
        }
        boolean zA = x0VarV.a(a.a.j.g1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.h = x0VarV.i(a.a.j.i1, -1.0f);
        this.f1420c = x0VarV.k(a.a.j.h1, -1);
        this.i = x0VarV.a(a.a.j.l1, false);
        setDividerDrawable(x0VarV.g(a.a.j.j1));
        this.o = x0VarV.k(a.a.j.m1, 0);
        this.p = x0VarV.f(a.a.j.k1, 0);
        x0VarV.w();
    }

    private void A(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    private void k(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewS = s(i3);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i4 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewS.getMeasuredWidth();
                    measureChildWithMargins(viewS, i2, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i4;
                }
            }
        }
    }

    private void l(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i3 = 0; i3 < i; i3++) {
            View viewS = s(i3);
            if (viewS.getVisibility() != 8) {
                a aVar = (a) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i4 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewS.getMeasuredHeight();
                    measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i2, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i4;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    void g(Canvas canvas) {
        int right;
        int left;
        int paddingRight;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = d1.b(this);
        for (int i = 0; i < virtualChildCount; i++) {
            View viewS = s(i);
            if (viewS != null && viewS.getVisibility() != 8 && t(i)) {
                a aVar = (a) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewS.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.m);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                a aVar2 = (a) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft();
                    paddingRight = ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    right = (left - paddingRight) - this.m;
                } else {
                    right = viewS2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth();
                paddingRight = getPaddingRight();
                right = (left - paddingRight) - this.m;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f1420c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1420c;
        if (childCount <= i2) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1420c == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f1421d;
        if (this.f1422e == 1 && (i = this.f1423f & 112) != 48) {
            if (i == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.g) / 2;
            } else if (i == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.g;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1420c;
    }

    public Drawable getDividerDrawable() {
        return this.l;
    }

    public int getDividerPadding() {
        return this.p;
    }

    public int getDividerWidth() {
        return this.m;
    }

    public int getGravity() {
        return this.f1423f;
    }

    public int getOrientation() {
        return this.f1422e;
    }

    public int getShowDividers() {
        return this.o;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.h;
    }

    void h(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View viewS = s(i);
            if (viewS != null && viewS.getVisibility() != 8 && t(i)) {
                i(canvas, (viewS.getTop() - ((LinearLayout.LayoutParams) ((a) viewS.getLayoutParams())).topMargin) - this.n);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.n : viewS2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    void i(Canvas canvas, int i) {
        this.l.setBounds(getPaddingLeft() + this.p, i, (getWidth() - getPaddingRight()) - this.p, this.n + i);
        this.l.draw(canvas);
    }

    void j(Canvas canvas, int i) {
        this.l.setBounds(i, getPaddingTop() + this.p, this.m + i, (getHeight() - getPaddingBottom()) - this.p);
        this.l.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i = this.f1422e;
        if (i == 0) {
            return new a(-2, -2);
        }
        if (i == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.l == null) {
            return;
        }
        if (this.f1422e == 1) {
            h(canvas);
        } else {
            g(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f1422e == 1) {
            v(i, i2, i3, i4);
        } else {
            u(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f1422e == 1) {
            z(i, i2);
        } else {
            x(i, i2);
        }
    }

    int p(View view, int i) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i) {
        return getChildAt(i);
    }

    public void setBaselineAligned(boolean z) {
        this.f1419b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f1420c = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.l) {
            return;
        }
        this.l = drawable;
        if (drawable != null) {
            this.m = drawable.getIntrinsicWidth();
            this.n = drawable.getIntrinsicHeight();
        } else {
            this.m = 0;
            this.n = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.p = i;
    }

    public void setGravity(int i) {
        if (this.f1423f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1423f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1423f;
        if ((8388615 & i3) != i2) {
            this.f1423f = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.i = z;
    }

    public void setOrientation(int i) {
        if (this.f1422e != i) {
            this.f1422e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.o) {
            requestLayout();
        }
        this.o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1423f;
        if ((i3 & 112) != i2) {
            this.f1423f = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.h = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    protected boolean t(int i) {
        if (i == 0) {
            return (this.o & 1) != 0;
        }
        if (i == getChildCount()) {
            return (this.o & 4) != 0;
        }
        if ((this.o & 2) == 0) {
            return false;
        }
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (getChildAt(i2).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ff  */
    void u(int i, int i2, int i3, int i4) {
        int paddingLeft;
        int i5;
        int i6;
        boolean z;
        int baseline;
        int i7;
        int i8;
        int measuredHeight;
        boolean zB = d1.b(this);
        int paddingTop = getPaddingTop();
        int i9 = i4 - i2;
        int paddingBottom = i9 - getPaddingBottom();
        int paddingBottom2 = (i9 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i10 = this.f1423f;
        int i11 = i10 & 112;
        boolean z2 = this.f1419b;
        int[] iArr = this.j;
        int[] iArr2 = this.k;
        int iB = a.g.l.e.b(8388615 & i10, a.g.l.v.C(this));
        boolean z3 = true;
        if (iB != 1) {
            paddingLeft = iB != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.g;
        } else {
            paddingLeft = getPaddingLeft() + (((i3 - i) - this.g) / 2);
        }
        if (zB) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int iP = 0;
        while (iP < virtualChildCount) {
            int i12 = i5 + (i6 * iP);
            View viewS = s(i12);
            if (viewS == null) {
                paddingLeft += y(i12);
                z = z3;
            } else {
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight2 = viewS.getMeasuredHeight();
                    a aVar = (a) viewS.getLayoutParams();
                    int i13 = iP;
                    if (z2) {
                        virtualChildCount = virtualChildCount;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewS.getBaseline() : -1;
                        i7 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i7 < 0) {
                            i7 = i11;
                        }
                        i8 = i7 & 112;
                        i11 = i11;
                        if (i8 != 16) {
                            if (i8 != 48) {
                                measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                                if (baseline != -1) {
                                    z = true;
                                    measuredHeight += iArr[1] - baseline;
                                }
                            } else if (i8 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight -= iArr2[2] - (viewS.getMeasuredHeight() - baseline);
                                }
                            }
                            z = true;
                        } else {
                            z = true;
                            measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        if (t(i12)) {
                            paddingLeft += this.m;
                        }
                        int i14 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        paddingTop = paddingTop;
                        A(viewS, i14 + q(viewS), measuredHeight, measuredWidth, measuredHeight2);
                        int iR = i14 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(viewS);
                        iP = i13 + p(viewS, i12);
                        paddingLeft = iR;
                    } else {
                        virtualChildCount = virtualChildCount;
                    }
                    i7 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i7 < 0) {
                        i7 = i11;
                    }
                    i8 = i7 & 112;
                    i11 = i11;
                    if (i8 != 16) {
                        if (i8 != 48) {
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).topMargin + paddingTop;
                            if (baseline != -1) {
                                z = true;
                                measuredHeight += iArr[1] - baseline;
                            }
                        } else if (i8 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            measuredHeight = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight -= iArr2[2] - (viewS.getMeasuredHeight() - baseline);
                            }
                        }
                        z = true;
                    } else {
                        z = true;
                        measuredHeight = ((((paddingBottom2 - measuredHeight2) / 2) + paddingTop) + ((LinearLayout.LayoutParams) aVar).topMargin) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    if (t(i12)) {
                        paddingLeft += this.m;
                    }
                    int i15 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                    paddingTop = paddingTop;
                    A(viewS, i15 + q(viewS), measuredHeight, measuredWidth, measuredHeight2);
                    int iR2 = i15 + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(viewS);
                    iP = i13 + p(viewS, i12);
                    paddingLeft = iR2;
                } else {
                    z = true;
                }
                iP++;
                virtualChildCount = virtualChildCount;
                i11 = i11;
                z3 = z;
                paddingTop = paddingTop;
            }
            iP++;
            virtualChildCount = virtualChildCount;
            i11 = i11;
            z3 = z;
            paddingTop = paddingTop;
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    void v(int i, int i2, int i3, int i4) {
        int paddingTop;
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i9 = this.f1423f;
        int i10 = i9 & 112;
        int i11 = i9 & 8388615;
        if (i10 != 16) {
            paddingTop = i10 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.g;
        } else {
            paddingTop = getPaddingTop() + (((i4 - i2) - this.g) / 2);
        }
        int iP = 0;
        while (iP < virtualChildCount) {
            View viewS = s(iP);
            if (viewS == null) {
                paddingTop += y(iP);
            } else {
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight = viewS.getMeasuredHeight();
                    a aVar = (a) viewS.getLayoutParams();
                    int i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i12 < 0) {
                        i12 = i11;
                    }
                    int iB = a.g.l.e.b(i12, a.g.l.v.C(this)) & 7;
                    if (iB != 1) {
                        if (iB != 5) {
                            i6 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i5 = paddingRight - measuredWidth;
                        }
                        int i13 = i6;
                        if (t(iP)) {
                            paddingTop += this.n;
                        }
                        int i14 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        A(viewS, i13, i14 + q(viewS), measuredWidth, measuredHeight);
                        int iR = i14 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS);
                        iP += p(viewS, iP);
                        paddingTop = iR;
                        i7 = 1;
                    } else {
                        i5 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                    }
                    i6 = i5 - ((LinearLayout.LayoutParams) aVar).rightMargin;
                    int i15 = i6;
                    if (t(iP)) {
                        paddingTop += this.n;
                    }
                    int i16 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    A(viewS, i15, i16 + q(viewS), measuredWidth, measuredHeight);
                    int iR2 = i16 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS);
                    iP += p(viewS, iP);
                    paddingTop = iR2;
                    i7 = 1;
                }
                iP += i7;
            }
            i7 = 1;
            iP += i7;
        }
    }

    void w(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03b2 A[PHI: r3
      0x03b2: PHI (r3v36 int) = (r3v32 int), (r3v37 int) binds: [B:168:0x03b0, B:164:0x03a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:198:0x0440  */
    /* JADX WARN: Code duplicated, block: B:63:0x0171  */
    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    /* JADX WARN: Code duplicated, block: B:77:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:84:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01d7  */
    void x(int i, int i2) {
        int[] iArr;
        int i3;
        int iMax;
        int iMax2;
        int i4;
        int i5;
        int baseline;
        int i6;
        int i7;
        byte b2;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        View view;
        int iMax3;
        int i10;
        boolean z3;
        int i11;
        int measuredHeight;
        int iP;
        int baseline2;
        int i12;
        this.g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.j == null || this.k == null) {
            this.j = new int[4];
            this.k = new int[4];
        }
        int[] iArr2 = this.j;
        int[] iArr3 = this.k;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        boolean z4 = this.f1419b;
        boolean z5 = this.i;
        int i13 = 1073741824;
        boolean z6 = mode == 1073741824;
        int iP2 = 0;
        int iMax4 = 0;
        int iMax5 = 0;
        int iMax6 = 0;
        int iMax7 = 0;
        boolean z7 = false;
        int iCombineMeasuredStates = 0;
        boolean z8 = false;
        boolean z9 = true;
        float f2 = 0.0f;
        while (true) {
            iArr = iArr3;
            if (iP2 >= virtualChildCount) {
                break;
            }
            View viewS = s(iP2);
            if (viewS == null) {
                this.g += y(iP2);
            } else {
                if (viewS.getVisibility() == 8) {
                    iP2 += p(viewS, iP2);
                } else {
                    if (t(iP2)) {
                        this.g += this.m;
                    }
                    a aVar = (a) viewS.getLayoutParams();
                    float f3 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f4 = f2 + f3;
                    if (mode == i13 && ((LinearLayout.LayoutParams) aVar).width == 0 && f3 > 0.0f) {
                        int i14 = this.g;
                        this.g = z6 ? i14 + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin : Math.max(i14, ((LinearLayout.LayoutParams) aVar).leftMargin + i14 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        if (z4) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewS.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                            i9 = iP2;
                            z = z5;
                            z2 = z4;
                            view = viewS;
                        } else {
                            i9 = iP2;
                            z = z5;
                            z2 = z4;
                            view = viewS;
                            z7 = true;
                            i10 = 1073741824;
                        }
                        if (mode2 == i10 && ((LinearLayout.LayoutParams) aVar).height == -1) {
                            z3 = true;
                            z8 = true;
                        } else {
                            z3 = false;
                        }
                        i11 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i11;
                        iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                            if (i12 < 0) {
                                i12 = this.f1423f;
                            }
                            int i15 = (((i12 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i15] = Math.max(iArr2[i15], baseline2);
                            iArr[i15] = Math.max(iArr[i15], measuredHeight - baseline2);
                        }
                        iMax5 = Math.max(iMax5, measuredHeight);
                        if (z9 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                            if (!z3) {
                                i11 = measuredHeight;
                            }
                            iMax7 = Math.max(iMax7, i11);
                        } else {
                            int i16 = iMax7;
                            if (!z3) {
                                i11 = measuredHeight;
                            }
                            iMax6 = Math.max(iMax6, i11);
                            iMax7 = i16;
                        }
                        int i17 = i9;
                        iP = p(view, i17) + i17;
                        f2 = f4;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f3 <= 0.0f) {
                            b2 = -2;
                            i8 = Integer.MIN_VALUE;
                        } else {
                            b2 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i8 = 0;
                        }
                        i9 = iP2;
                        int i18 = i8;
                        z = z5;
                        z2 = z4;
                        w(viewS, i9, i, f4 == 0.0f ? this.g : 0, i2, 0);
                        if (i18 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i18;
                        }
                        int measuredWidth = viewS.getMeasuredWidth();
                        if (z6) {
                            view = viewS;
                            iMax3 = this.g + ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view);
                        } else {
                            view = viewS;
                            int i19 = this.g;
                            iMax3 = Math.max(i19, i19 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + r(view));
                        }
                        this.g = iMax3;
                        if (z) {
                            iMax4 = Math.max(measuredWidth, iMax4);
                        }
                    }
                    i10 = 1073741824;
                    if (mode2 == i10) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    i11 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    measuredHeight = view.getMeasuredHeight() + i11;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z2) {
                        i12 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i12 < 0) {
                            i12 = this.f1423f;
                        }
                        int i110 = (((i12 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i110] = Math.max(iArr2[i110], baseline2);
                        iArr[i110] = Math.max(iArr[i110], measuredHeight - baseline2);
                    }
                    iMax5 = Math.max(iMax5, measuredHeight);
                    if (z9) {
                        z9 = false;
                    } else {
                        z9 = false;
                    }
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z3) {
                            i11 = measuredHeight;
                        }
                        iMax7 = Math.max(iMax7, i11);
                    } else {
                        int i111 = iMax7;
                        if (!z3) {
                            i11 = measuredHeight;
                        }
                        iMax6 = Math.max(iMax6, i11);
                        iMax7 = i111;
                    }
                    int i112 = i9;
                    iP = p(view, i112) + i112;
                    f2 = f4;
                }
                int i20 = iP + 1;
                iArr3 = iArr;
                z5 = z;
                z4 = z2;
                i13 = i10;
                iP2 = i20;
            }
            z = z5;
            z2 = z4;
            int i21 = i13;
            iP = iP2;
            i10 = i21;
            int i22 = iP + 1;
            iArr3 = iArr;
            z5 = z;
            z4 = z2;
            i13 = i10;
            iP2 = i22;
        }
        boolean z10 = z5;
        boolean z11 = z4;
        int i23 = iMax5;
        int i24 = iMax6;
        int i25 = iMax7;
        int i26 = iCombineMeasuredStates;
        if (this.g > 0 && t(virtualChildCount)) {
            this.g += this.m;
        }
        int iMax8 = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? i23 : Math.max(i23, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
        if (z10 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.g = 0;
            int iP3 = 0;
            while (iP3 < virtualChildCount) {
                View viewS2 = s(iP3);
                if (viewS2 == null) {
                    this.g += y(iP3);
                } else if (viewS2.getVisibility() == 8) {
                    iP3 += p(viewS2, iP3);
                } else {
                    a aVar2 = (a) viewS2.getLayoutParams();
                    int i27 = this.g;
                    if (z6) {
                        this.g = i27 + ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax4 + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2);
                    } else {
                        this.g = Math.max(i27, i27 + iMax4 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + r(viewS2));
                    }
                    iP3++;
                    iMax8 = iMax8;
                }
                iP3++;
                iMax8 = iMax8;
            }
        }
        int i28 = iMax8;
        int paddingLeft = this.g + getPaddingLeft() + getPaddingRight();
        this.g = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, 0);
        int i29 = (16777215 & iResolveSizeAndState) - this.g;
        if (z7 || (i29 != 0 && f2 > 0.0f)) {
            float f5 = this.h;
            if (f5 > 0.0f) {
                f2 = f5;
            }
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            this.g = 0;
            int i30 = i24;
            int iMax9 = -1;
            int iCombineMeasuredStates2 = i26;
            int i31 = 0;
            while (i31 < virtualChildCount) {
                View viewS3 = s(i31);
                if (viewS3 == null || viewS3.getVisibility() == 8) {
                    i4 = i29;
                    virtualChildCount = virtualChildCount;
                } else {
                    a aVar3 = (a) viewS3.getLayoutParams();
                    float f6 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f6 > 0.0f) {
                        int measuredWidth2 = (int) ((i29 * f6) / f2);
                        float f7 = f2 - f6;
                        int i32 = i29 - measuredWidth2;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i7 = 1073741824;
                            if (mode == 1073741824) {
                                if (measuredWidth2 <= 0) {
                                    measuredWidth2 = 0;
                                }
                            }
                            viewS3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i7), childMeasureSpec);
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewS3.getMeasuredState() & (-16777216));
                            f2 = f7;
                            i4 = i32;
                        } else {
                            i7 = 1073741824;
                        }
                        measuredWidth2 = viewS3.getMeasuredWidth() + measuredWidth2;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewS3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i7), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewS3.getMeasuredState() & (-16777216));
                        f2 = f7;
                        i4 = i32;
                    } else {
                        i4 = i29;
                    }
                    int i33 = this.g;
                    if (z6) {
                        this.g = i33 + viewS3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3);
                    } else {
                        this.g = Math.max(i33, viewS3.getMeasuredWidth() + i33 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + r(viewS3));
                    }
                    boolean z12 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i34 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewS3.getMeasuredHeight() + i34;
                    iMax9 = Math.max(iMax9, measuredHeight2);
                    if (!z12) {
                        i34 = measuredHeight2;
                    }
                    int iMax10 = Math.max(i30, i34);
                    if (z9) {
                        i5 = -1;
                        boolean z13 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z11 && (baseline = viewS3.getBaseline()) != i5) {
                            i6 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i6 < 0) {
                                i6 = this.f1423f;
                            }
                            int i35 = (((i6 & 112) >> 4) & (-2)) >> 1;
                            iArr2[i35] = Math.max(iArr2[i35], baseline);
                            iArr[i35] = Math.max(iArr[i35], measuredHeight2 - baseline);
                        }
                        z9 = z13;
                        i30 = iMax10;
                        f2 = f2;
                    } else {
                        i5 = -1;
                    }
                    if (z11) {
                        i6 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i6 < 0) {
                            i6 = this.f1423f;
                        }
                        int i36 = (((i6 & 112) >> 4) & (-2)) >> 1;
                        iArr2[i36] = Math.max(iArr2[i36], baseline);
                        iArr[i36] = Math.max(iArr[i36], measuredHeight2 - baseline);
                    }
                    z9 = z13;
                    i30 = iMax10;
                    f2 = f2;
                }
                i31++;
                i29 = i4;
                virtualChildCount = virtualChildCount;
            }
            i3 = virtualChildCount;
            this.g += getPaddingLeft() + getPaddingRight();
            iMax = (iArr2[1] == -1 && iArr2[0] == -1 && iArr2[2] == -1 && iArr2[3] == -1) ? iMax9 : Math.max(iMax9, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))));
            iMax2 = i30;
            i26 = iCombineMeasuredStates2;
        } else {
            iMax2 = Math.max(i24, i25);
            if (z10 && mode != 1073741824) {
                for (int i37 = 0; i37 < virtualChildCount; i37++) {
                    View viewS4 = s(i37);
                    if (viewS4 != null && viewS4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewS4.getLayoutParams())).weight > 0.0f) {
                        viewS4.measure(View.MeasureSpec.makeMeasureSpec(iMax4, 1073741824), View.MeasureSpec.makeMeasureSpec(viewS4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i3 = virtualChildCount;
            iMax = i28;
        }
        if (z9 || mode2 == 1073741824) {
            iMax2 = iMax;
        }
        setMeasuredDimension(iResolveSizeAndState | (i26 & (-16777216)), View.resolveSizeAndState(Math.max(iMax2 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, i26 << 16));
        if (z8) {
            k(i3, i);
        }
    }

    int y(int i) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:136:0x02dc A[PHI: r10
      0x02dc: PHI (r10v21 int) = (r10v19 int), (r10v22 int) binds: [B:135:0x02da, B:131:0x02cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x031b  */
    /* JADX WARN: Code duplicated, block: B:154:0x0329  */
    void z(int i, int i2) {
        int i3;
        int iCombineMeasuredStates;
        int iMax;
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        int i7;
        int iMax2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        int iMax3;
        boolean z3;
        int iMax4;
        this.g = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i16 = this.f1420c;
        boolean z4 = this.i;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int iMax5 = 0;
        int i20 = 0;
        int iP = 0;
        boolean z5 = false;
        boolean z6 = false;
        float f2 = 0.0f;
        boolean z7 = true;
        while (true) {
            int i21 = 8;
            int i22 = iMax5;
            if (iP >= virtualChildCount) {
                int i23 = i17;
                int i24 = i19;
                int i25 = i20;
                int i26 = virtualChildCount;
                int i27 = mode2;
                int iMax6 = i18;
                if (this.g > 0) {
                    i3 = i26;
                    if (t(i3)) {
                        this.g += this.n;
                    }
                } else {
                    i3 = i26;
                }
                if (z4 && (i27 == Integer.MIN_VALUE || i27 == 0)) {
                    this.g = 0;
                    int iP2 = 0;
                    while (iP2 < i3) {
                        View viewS = s(iP2);
                        if (viewS == null) {
                            iMax2 = this.g + y(iP2);
                        } else {
                            if (viewS.getVisibility() == i21) {
                                iP2 += p(viewS, iP2);
                            } else {
                                a aVar = (a) viewS.getLayoutParams();
                                int i28 = this.g;
                                iMax2 = Math.max(i28, i28 + i24 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + r(viewS));
                            }
                            iP2++;
                            i21 = 8;
                        }
                        this.g = iMax2;
                        iP2++;
                        i21 = 8;
                    }
                }
                int paddingTop = this.g + getPaddingTop() + getPaddingBottom();
                this.g = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, 0);
                int i29 = (16777215 & iResolveSizeAndState) - this.g;
                if (z5 || (i29 != 0 && f2 > 0.0f)) {
                    float f3 = this.h;
                    if (f3 > 0.0f) {
                        f2 = f3;
                    }
                    this.g = 0;
                    int i30 = i29;
                    int i31 = i25;
                    iCombineMeasuredStates = i23;
                    int i32 = 0;
                    while (i32 < i3) {
                        View viewS2 = s(i32);
                        if (viewS2.getVisibility() == 8) {
                            i4 = i30;
                        } else {
                            a aVar2 = (a) viewS2.getLayoutParams();
                            float f4 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f4 > 0.0f) {
                                int measuredHeight = (int) ((i30 * f4) / f2);
                                float f5 = f2 - f4;
                                i4 = i30 - measuredHeight;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i7 = 1073741824;
                                    if (i27 == 1073741824) {
                                        if (measuredHeight <= 0) {
                                            measuredHeight = 0;
                                        }
                                    }
                                    viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                    f2 = f5;
                                } else {
                                    i7 = 1073741824;
                                }
                                measuredHeight = viewS2.getMeasuredHeight() + measuredHeight;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i7));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                f2 = f5;
                            } else {
                                i4 = i30;
                            }
                            int i33 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewS2.getMeasuredWidth() + i33;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            float f6 = f2;
                            if (mode != 1073741824) {
                                i5 = iCombineMeasuredStates;
                                i6 = -1;
                                z = ((LinearLayout.LayoutParams) aVar2).width == -1;
                                if (!z) {
                                    i33 = measuredWidth;
                                }
                                int iMax7 = Math.max(i31, i33);
                                if (z7 || ((LinearLayout.LayoutParams) aVar2).width != i6) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                int i34 = this.g;
                                this.g = Math.max(i34, viewS2.getMeasuredHeight() + i34 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + r(viewS2));
                                z7 = z2;
                                iCombineMeasuredStates = i5;
                                i31 = iMax7;
                                f2 = f6;
                            } else {
                                i5 = iCombineMeasuredStates;
                                i6 = -1;
                            }
                            if (!z) {
                                i33 = measuredWidth;
                            }
                            int iMax8 = Math.max(i31, i33);
                            if (z7) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            int i35 = this.g;
                            this.g = Math.max(i35, viewS2.getMeasuredHeight() + i35 + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + r(viewS2));
                            z7 = z2;
                            iCombineMeasuredStates = i5;
                            i31 = iMax8;
                            f2 = f6;
                        }
                        i32++;
                        i30 = i4;
                    }
                    this.g += getPaddingTop() + getPaddingBottom();
                    iMax = i31;
                } else {
                    iMax = Math.max(i25, i22);
                    if (z4 && i27 != 1073741824) {
                        for (int i36 = 0; i36 < i3; i36++) {
                            View viewS3 = s(i36);
                            if (viewS3 != null && viewS3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewS3.getLayoutParams())).weight > 0.0f) {
                                viewS3.measure(View.MeasureSpec.makeMeasureSpec(viewS3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i24, 1073741824));
                            }
                        }
                    }
                    iCombineMeasuredStates = i23;
                }
                if (z7 || mode == 1073741824) {
                    iMax = iMax6;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates), iResolveSizeAndState);
                if (z6) {
                    l(i3, i2);
                    return;
                }
                return;
            }
            View viewS4 = s(iP);
            if (viewS4 == null) {
                this.g += y(iP);
                i11 = virtualChildCount;
                i12 = mode2;
                iMax5 = i22;
            } else {
                int i37 = i17;
                if (viewS4.getVisibility() == 8) {
                    iP += p(viewS4, iP);
                    i11 = virtualChildCount;
                    iMax5 = i22;
                    i17 = i37;
                    i12 = mode2;
                } else {
                    if (t(iP)) {
                        this.g += this.n;
                    }
                    a aVar3 = (a) viewS4.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f8 = f2 + f7;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f7 > 0.0f) {
                        int i38 = this.g;
                        this.g = Math.max(i38, ((LinearLayout.LayoutParams) aVar3).topMargin + i38 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax3 = i19;
                        view = viewS4;
                        i14 = i20;
                        z5 = true;
                        i9 = i37;
                        i10 = i18;
                        i11 = virtualChildCount;
                        i12 = mode2;
                        i13 = i22;
                        i15 = iP;
                    } else {
                        int i39 = i18;
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f7 <= 0.0f) {
                            i8 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i8 = 0;
                        }
                        i9 = i37;
                        int i40 = i8;
                        i10 = i39;
                        int i41 = i19;
                        i11 = virtualChildCount;
                        i12 = mode2;
                        i13 = i22;
                        i14 = i20;
                        i15 = iP;
                        w(viewS4, iP, i, 0, i2, f8 == 0.0f ? this.g : 0);
                        if (i40 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i40;
                        }
                        int measuredHeight2 = viewS4.getMeasuredHeight();
                        int i42 = this.g;
                        view = viewS4;
                        this.g = Math.max(i42, i42 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + r(view));
                        iMax3 = z4 ? Math.max(measuredHeight2, i41) : i41;
                    }
                    if (i16 >= 0 && i16 == i15 + 1) {
                        this.f1421d = this.g;
                    }
                    if (i15 < i16 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z3 = false;
                    } else {
                        z3 = true;
                        z6 = true;
                    }
                    int i43 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i43;
                    int iMax9 = Math.max(i10, measuredWidth2);
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i9, view.getMeasuredState());
                    z7 = z7 && ((LinearLayout.LayoutParams) aVar3).width == -1;
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z3) {
                            i43 = measuredWidth2;
                        }
                        iMax5 = Math.max(i13, i43);
                        iMax4 = i14;
                    } else {
                        if (!z3) {
                            i43 = measuredWidth2;
                        }
                        iMax4 = Math.max(i14, i43);
                        iMax5 = i13;
                    }
                    int iP3 = p(view, i15) + i15;
                    i19 = iMax3;
                    f2 = f8;
                    i20 = iMax4;
                    i17 = iCombineMeasuredStates2;
                    iP = iP3;
                    i18 = iMax9;
                }
            }
            iP++;
            mode2 = i12;
            virtualChildCount = i11;
        }
    }
}
