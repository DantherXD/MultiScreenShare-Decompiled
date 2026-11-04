package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    private ColorStateList A;
    private ColorStateList B;
    private boolean C;
    private boolean D;
    private final ArrayList<View> E;
    private final ArrayList<View> F;
    private final int[] G;
    f H;
    private final ActionMenuView.e I;
    private y0 J;
    private androidx.appcompat.widget.c K;
    private d L;
    private androidx.appcompat.view.menu.m.a M;
    private androidx.appcompat.view.menu.g.a N;
    private boolean O;
    private final Runnable P;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionMenuView f1308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f1309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private TextView f1310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ImageButton f1311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ImageView f1312f;
    private Drawable g;
    private CharSequence h;
    ImageButton i;
    View j;
    private Context k;
    private int l;
    private int m;
    private int n;
    int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private p0 u;
    private int v;
    private int w;
    private int x;
    private CharSequence y;
    private CharSequence z;

    class a implements ActionMenuView.e {
        a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            f fVar = Toolbar.this.H;
            if (fVar != null) {
                return fVar.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.N();
        }
    }

    class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    private class d implements androidx.appcompat.view.menu.m {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        androidx.appcompat.view.menu.g f1316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        androidx.appcompat.view.menu.i f1317c;

        d() {
        }

        @Override // androidx.appcompat.view.menu.m
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void d(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f1316b;
            if (gVar2 != null && (iVar = this.f1317c) != null) {
                gVar2.f(iVar);
            }
            this.f1316b = gVar;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean e(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof a.a.n.c) {
                ((a.a.n.c) callback).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.j = null;
            toolbar3.a();
            this.f1317c = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.i);
            }
            Toolbar.this.j = iVar.getActionView();
            this.f1317c = iVar;
            ViewParent parent2 = Toolbar.this.j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.j);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f1078a = 8388611 | (toolbar4.o & 112);
                eVarGenerateDefaultLayoutParams.f1319b = 2;
                toolbar4.j.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.j);
            }
            Toolbar.this.G();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.j;
            if (callback instanceof a.a.n.c) {
                ((a.a.n.c) callback).c();
            }
            return true;
        }

        @Override // androidx.appcompat.view.menu.m
        public boolean i(androidx.appcompat.view.menu.r rVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.m
        public void j(boolean z) {
            if (this.f1317c != null) {
                androidx.appcompat.view.menu.g gVar = this.f1316b;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i = 0; i < size; i++) {
                        if (this.f1316b.getItem(i) == this.f1317c) {
                            z2 = true;
                            break;
                        }
                    }
                }
                if (z2) {
                    return;
                }
                e(this.f1316b, this.f1317c);
            }
        }
    }

    public static class e extends androidx.appcompat.app.a.C0039a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1319b;

        public e(int i, int i2) {
            super(i, i2);
            this.f1319b = 0;
            this.f1078a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1319b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1319b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1319b = 0;
            a(marginLayoutParams);
        }

        public e(androidx.appcompat.app.a.C0039a c0039a) {
            super(c0039a);
            this.f1319b = 0;
        }

        public e(e eVar) {
            super((androidx.appcompat.app.a.C0039a) eVar);
            this.f1319b = 0;
            this.f1319b = eVar.f1319b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class g extends a.i.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f1321e;

        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i) {
                return new g[i];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1320d = parcel.readInt();
            this.f1321e = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1320d);
            parcel.writeInt(this.f1321e ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.a.a.M);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.x = 8388627;
        this.E = new ArrayList<>();
        this.F = new ArrayList<>();
        this.G = new int[2];
        this.I = new a();
        this.P = new b();
        Context context2 = getContext();
        int[] iArr = a.a.j.W2;
        x0 x0VarV = x0.v(context2, attributeSet, iArr, i, 0);
        a.g.l.v.m0(this, context, iArr, attributeSet, x0VarV.r(), i, 0);
        this.m = x0VarV.n(a.a.j.y3, 0);
        this.n = x0VarV.n(a.a.j.p3, 0);
        this.x = x0VarV.l(a.a.j.X2, this.x);
        this.o = x0VarV.l(a.a.j.Y2, 48);
        int iE = x0VarV.e(a.a.j.s3, 0);
        int i2 = a.a.j.x3;
        iE = x0VarV.s(i2) ? x0VarV.e(i2, iE) : iE;
        this.t = iE;
        this.s = iE;
        this.r = iE;
        this.q = iE;
        int iE2 = x0VarV.e(a.a.j.v3, -1);
        if (iE2 >= 0) {
            this.q = iE2;
        }
        int iE3 = x0VarV.e(a.a.j.u3, -1);
        if (iE3 >= 0) {
            this.r = iE3;
        }
        int iE4 = x0VarV.e(a.a.j.w3, -1);
        if (iE4 >= 0) {
            this.s = iE4;
        }
        int iE5 = x0VarV.e(a.a.j.t3, -1);
        if (iE5 >= 0) {
            this.t = iE5;
        }
        this.p = x0VarV.f(a.a.j.j3, -1);
        int iE6 = x0VarV.e(a.a.j.f3, Integer.MIN_VALUE);
        int iE7 = x0VarV.e(a.a.j.b3, Integer.MIN_VALUE);
        int iF = x0VarV.f(a.a.j.d3, 0);
        int iF2 = x0VarV.f(a.a.j.e3, 0);
        h();
        this.u.e(iF, iF2);
        if (iE6 != Integer.MIN_VALUE || iE7 != Integer.MIN_VALUE) {
            this.u.g(iE6, iE7);
        }
        this.v = x0VarV.e(a.a.j.g3, Integer.MIN_VALUE);
        this.w = x0VarV.e(a.a.j.c3, Integer.MIN_VALUE);
        this.g = x0VarV.g(a.a.j.a3);
        this.h = x0VarV.p(a.a.j.Z2);
        CharSequence charSequenceP = x0VarV.p(a.a.j.r3);
        if (!TextUtils.isEmpty(charSequenceP)) {
            setTitle(charSequenceP);
        }
        CharSequence charSequenceP2 = x0VarV.p(a.a.j.o3);
        if (!TextUtils.isEmpty(charSequenceP2)) {
            setSubtitle(charSequenceP2);
        }
        this.k = getContext();
        setPopupTheme(x0VarV.n(a.a.j.n3, 0));
        Drawable drawableG = x0VarV.g(a.a.j.m3);
        if (drawableG != null) {
            setNavigationIcon(drawableG);
        }
        CharSequence charSequenceP3 = x0VarV.p(a.a.j.l3);
        if (!TextUtils.isEmpty(charSequenceP3)) {
            setNavigationContentDescription(charSequenceP3);
        }
        Drawable drawableG2 = x0VarV.g(a.a.j.h3);
        if (drawableG2 != null) {
            setLogo(drawableG2);
        }
        CharSequence charSequenceP4 = x0VarV.p(a.a.j.i3);
        if (!TextUtils.isEmpty(charSequenceP4)) {
            setLogoDescription(charSequenceP4);
        }
        int i3 = a.a.j.z3;
        if (x0VarV.s(i3)) {
            setTitleTextColor(x0VarV.c(i3));
        }
        int i4 = a.a.j.q3;
        if (x0VarV.s(i4)) {
            setSubtitleTextColor(x0VarV.c(i4));
        }
        int i5 = a.a.j.k3;
        if (x0VarV.s(i5)) {
            x(x0VarV.n(i5, 0));
        }
        x0VarV.w();
    }

    private int B(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int iQ = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iQ, iMax + measuredWidth, view.getMeasuredHeight() + iQ);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int C(View view, int i, int[] iArr, int i2) {
        e eVar = (e) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int iQ = q(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iQ, iMax, view.getMeasuredHeight() + iQ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int D(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + iMax + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void E(View view, int i, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void F() {
        removeCallbacks(this.P);
        post(this.P);
    }

    private boolean L() {
        if (!this.O) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (M(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean M(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i) {
        boolean z = a.g.l.v.C(this) == 1;
        int childCount = getChildCount();
        int iB = a.g.l.e.b(i, a.g.l.v.C(this));
        list.clear();
        if (!z) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1319b == 0 && M(childAt) && p(eVar.f1078a) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            View childAt2 = getChildAt(i3);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1319b == 0 && M(childAt2) && p(eVar2.f1078a) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z) {
        e eVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            eVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        }
        eVarGenerateLayoutParams.f1319b = 1;
        if (!z || this.j == null) {
            addView(view, eVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateLayoutParams);
            this.F.add(view);
        }
    }

    private MenuInflater getMenuInflater() {
        return new a.a.n.g(getContext());
    }

    private void h() {
        if (this.u == null) {
            this.u = new p0();
        }
    }

    private void i() {
        if (this.f1312f == null) {
            this.f1312f = new o(getContext());
        }
    }

    private void j() {
        k();
        if (this.f1308b.N() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.f1308b.getMenu();
            if (this.L == null) {
                this.L = new d();
            }
            this.f1308b.setExpandedActionViewsExclusive(true);
            gVar.c(this.L, this.k);
        }
    }

    private void k() {
        if (this.f1308b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1308b = actionMenuView;
            actionMenuView.setPopupTheme(this.l);
            this.f1308b.setOnMenuItemClickListener(this.I);
            this.f1308b.O(this.M, this.N);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f1078a = 8388613 | (this.o & 112);
            this.f1308b.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f1308b, false);
        }
    }

    private void l() {
        if (this.f1311e == null) {
            this.f1311e = new m(getContext(), null, a.a.a.L);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f1078a = 8388611 | (this.o & 112);
            this.f1311e.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    private int p(int i) {
        int iC = a.g.l.v.C(this);
        int iB = a.g.l.e.b(i, iC) & 7;
        if (iB == 1 || iB == 3 || iB == 5) {
            return iB;
        }
        return iC == 1 ? 5 : 3;
    }

    private int q(View view, int i) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int iR = r(eVar.f1078a);
        if (iR == 48) {
            return getPaddingTop() - i2;
        }
        if (iR == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i3 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i3) {
            iMax = i3;
        } else {
            int i4 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i4 < i5) {
                iMax = Math.max(0, iMax - (i5 - i4));
            }
        }
        return paddingTop + iMax;
    }

    private int r(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.x & 112;
    }

    private int s(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return a.g.l.h.b(marginLayoutParams) + a.g.l.h.a(marginLayoutParams);
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int u(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = 0;
        int measuredWidth = 0;
        while (i3 < size) {
            View view = list.get(i3);
            e eVar = (e) view.getLayoutParams();
            int i4 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i;
            int i5 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i2;
            int iMax = Math.max(0, i4);
            int iMax2 = Math.max(0, i5);
            int iMax3 = Math.max(0, -i4);
            int iMax4 = Math.max(0, -i5);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i3++;
            i2 = iMax4;
            i = iMax3;
        }
        return measuredWidth;
    }

    private boolean y(View view) {
        return view.getParent() == this || this.F.contains(view);
    }

    public boolean A() {
        ActionMenuView actionMenuView = this.f1308b;
        return actionMenuView != null && actionMenuView.J();
    }

    void G() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1319b != 2 && childAt != this.f1308b) {
                removeViewAt(childCount);
                this.F.add(childAt);
            }
        }
    }

    public void H(int i, int i2) {
        h();
        this.u.g(i, i2);
    }

    public void I(androidx.appcompat.view.menu.g gVar, androidx.appcompat.widget.c cVar) {
        if (gVar == null && this.f1308b == null) {
            return;
        }
        k();
        androidx.appcompat.view.menu.g gVarN = this.f1308b.N();
        if (gVarN == gVar) {
            return;
        }
        if (gVarN != null) {
            gVarN.O(this.K);
            gVarN.O(this.L);
        }
        if (this.L == null) {
            this.L = new d();
        }
        cVar.G(true);
        if (gVar != null) {
            gVar.c(cVar, this.k);
            gVar.c(this.L, this.k);
        } else {
            cVar.d(this.k, null);
            this.L.d(this.k, null);
            cVar.j(true);
            this.L.j(true);
        }
        this.f1308b.setPopupTheme(this.l);
        this.f1308b.setPresenter(cVar);
        this.K = cVar;
    }

    public void J(Context context, int i) {
        this.n = i;
        TextView textView = this.f1310d;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public void K(Context context, int i) {
        this.m = i;
        TextView textView = this.f1309c;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    public boolean N() {
        ActionMenuView actionMenuView = this.f1308b;
        return actionMenuView != null && actionMenuView.P();
    }

    void a() {
        for (int size = this.F.size() - 1; size >= 0; size--) {
            addView(this.F.get(size));
        }
        this.F.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1308b) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.L;
        androidx.appcompat.view.menu.i iVar = dVar == null ? null : dVar.f1317c;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1308b;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.i == null) {
            m mVar = new m(getContext(), null, a.a.a.L);
            this.i = mVar;
            mVar.setImageDrawable(this.g);
            this.i.setContentDescription(this.h);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f1078a = 8388611 | (this.o & 112);
            eVarGenerateDefaultLayoutParams.f1319b = 2;
            this.i.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.i.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.w;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.u;
        if (p0Var != null) {
            return p0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.v;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarN;
        ActionMenuView actionMenuView = this.f1308b;
        return actionMenuView != null && (gVarN = actionMenuView.N()) != null && gVarN.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.w, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return a.g.l.v.C(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return a.g.l.v.C(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1312f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1312f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        j();
        return this.f1308b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1311e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1311e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.K;
    }

    public Drawable getOverflowIcon() {
        j();
        return this.f1308b.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.k;
    }

    public int getPopupTheme() {
        return this.l;
    }

    public CharSequence getSubtitle() {
        return this.z;
    }

    final TextView getSubtitleTextView() {
        return this.f1310d;
    }

    public CharSequence getTitle() {
        return this.y;
    }

    public int getTitleMarginBottom() {
        return this.t;
    }

    public int getTitleMarginEnd() {
        return this.r;
    }

    public int getTitleMarginStart() {
        return this.q;
    }

    public int getTitleMarginTop() {
        return this.s;
    }

    final TextView getTitleTextView() {
        return this.f1309c;
    }

    public e0 getWrapper() {
        if (this.J == null) {
            this.J = new y0(this, true);
        }
        return this.J;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.a.C0039a) {
            return new e((androidx.appcompat.app.a.C0039a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.D = false;
        }
        if (!this.D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.D = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0237  */
    /* JADX WARN: Code duplicated, block: B:102:0x025a  */
    /* JADX WARN: Code duplicated, block: B:104:0x025d  */
    /* JADX WARN: Code duplicated, block: B:105:0x027f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0282  */
    /* JADX WARN: Code duplicated, block: B:110:0x0295 A[LOOP:0: B:109:0x0293->B:110:0x0295, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x02b7 A[LOOP:1: B:112:0x02b5->B:113:0x02b7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x02e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:118:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:119:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f0 A[LOOP:2: B:121:0x02ee->B:122:0x02f0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:20:0x005d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0061  */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0072  */
    /* JADX WARN: Code duplicated, block: B:28:0x0076  */
    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:48:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0121 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0123  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:58:0x012a  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:62:0x013d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x015e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x0174  */
    /* JADX WARN: Code duplicated, block: B:76:0x0177  */
    /* JADX WARN: Code duplicated, block: B:78:0x0182  */
    /* JADX WARN: Code duplicated, block: B:80:0x018e  */
    /* JADX WARN: Code duplicated, block: B:81:0x019c  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ad A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:92:0x0211  */
    /* JADX WARN: Code duplicated, block: B:94:0x0214  */
    /* JADX WARN: Code duplicated, block: B:96:0x021d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x021f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0223  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iB;
        int iC;
        int iMax;
        int iMin;
        boolean zM;
        boolean zM2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        e eVar;
        e eVar2;
        boolean z2;
        int i5;
        int i6;
        int paddingTop;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int iMax2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int size;
        int i19;
        int i20;
        int size2;
        int i21;
        int i22;
        int i23;
        int size3;
        ImageView imageView;
        View view;
        ActionMenuView actionMenuView;
        ImageButton imageButton;
        boolean z3 = a.g.l.v.C(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i24 = width - paddingRight;
        int[] iArr = this.G;
        iArr[1] = 0;
        iArr[0] = 0;
        int iD = a.g.l.v.D(this);
        int iMin2 = iD >= 0 ? Math.min(iD, i4 - i2) : 0;
        if (M(this.f1311e)) {
            ImageButton imageButton2 = this.f1311e;
            if (z3) {
                iC = C(imageButton2, i24, iArr, iMin2);
                iB = paddingLeft;
            } else {
                iB = B(imageButton2, paddingLeft, iArr, iMin2);
            }
            if (M(this.i)) {
                imageButton = this.i;
                if (z3) {
                    iC = C(imageButton, iC, iArr, iMin2);
                } else {
                    iB = B(imageButton, iB, iArr, iMin2);
                }
            }
            if (M(this.f1308b)) {
                actionMenuView = this.f1308b;
                if (z3) {
                    iB = B(actionMenuView, iB, iArr, iMin2);
                } else {
                    iC = C(actionMenuView, iC, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iB);
            iArr[1] = Math.max(0, currentContentInsetRight - (i24 - iC));
            iMax = Math.max(iB, currentContentInsetLeft);
            iMin = Math.min(iC, i24 - currentContentInsetRight);
            if (M(this.j)) {
                view = this.j;
                if (z3) {
                    iMin = C(view, iMin, iArr, iMin2);
                } else {
                    iMax = B(view, iMax, iArr, iMin2);
                }
            }
            if (M(this.f1312f)) {
                imageView = this.f1312f;
                if (z3) {
                    iMin = C(imageView, iMin, iArr, iMin2);
                } else {
                    iMax = B(imageView, iMax, iArr, iMin2);
                }
            }
            zM = M(this.f1309c);
            zM2 = M(this.f1310d);
            if (zM) {
                e eVar3 = (e) this.f1309c.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) eVar3).topMargin + this.f1309c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar3).bottomMargin + 0;
            } else {
                measuredHeight = 0;
            }
            if (zM2) {
                e eVar4 = (e) this.f1310d.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) eVar4).topMargin + this.f1310d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar4).bottomMargin;
            }
            if (!zM || zM2) {
                if (zM) {
                    textView = this.f1309c;
                } else {
                    textView = this.f1310d;
                }
                if (zM2) {
                    textView2 = this.f1310d;
                } else {
                    textView2 = this.f1309c;
                }
                eVar = (e) textView.getLayoutParams();
                eVar2 = (e) textView2.getLayoutParams();
                z2 = (!zM && this.f1309c.getMeasuredWidth() > 0) || (zM2 && this.f1310d.getMeasuredWidth() > 0);
                i5 = this.x & 112;
                i6 = paddingLeft;
                if (i5 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.s;
                } else if (i5 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                    i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                    i15 = this.s;
                    if (iMax2 < i14 + i15) {
                        iMax2 = i14 + i15;
                    } else {
                        i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                        i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                        i18 = this.t;
                        if (i16 < i17 + i18) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i18) - i16));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.t) - measuredHeight;
                }
                if (z3) {
                    if (z2) {
                        i11 = this.q;
                    } else {
                        i11 = 0;
                    }
                    int i25 = i11 - iArr[1];
                    iMin -= Math.max(0, i25);
                    iArr[1] = Math.max(0, -i25);
                    if (zM) {
                        e eVar5 = (e) this.f1309c.getLayoutParams();
                        int measuredWidth = iMin - this.f1309c.getMeasuredWidth();
                        int measuredHeight2 = this.f1309c.getMeasuredHeight() + paddingTop;
                        this.f1309c.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i12 = measuredWidth - this.r;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) eVar5).bottomMargin;
                    } else {
                        i12 = iMin;
                    }
                    if (zM2) {
                        int i26 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1310d.getLayoutParams())).topMargin;
                        this.f1310d.layout(iMin - this.f1310d.getMeasuredWidth(), i26, iMin, this.f1310d.getMeasuredHeight() + i26);
                        i13 = iMin - this.r;
                    } else {
                        i13 = iMin;
                    }
                    if (z2) {
                        iMin = Math.min(i12, i13);
                    }
                    iMax = iMax;
                } else {
                    if (z2) {
                        i8 = this.q;
                        i7 = 0;
                    } else {
                        i7 = 0;
                        i8 = 0;
                    }
                    int i27 = i8 - iArr[i7];
                    iMax += Math.max(i7, i27);
                    iArr[i7] = Math.max(i7, -i27);
                    if (zM) {
                        e eVar6 = (e) this.f1309c.getLayoutParams();
                        int measuredWidth2 = this.f1309c.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f1309c.getMeasuredHeight() + paddingTop;
                        this.f1309c.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i9 = measuredWidth2 + this.r;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) eVar6).bottomMargin;
                    } else {
                        i9 = iMax;
                    }
                    if (zM2) {
                        int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1310d.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f1310d.getMeasuredWidth() + iMax;
                        this.f1310d.layout(iMax, i28, measuredWidth3, this.f1310d.getMeasuredHeight() + i28);
                        i10 = measuredWidth3 + this.r;
                    } else {
                        i10 = iMax;
                    }
                    if (z2) {
                        iMax = Math.max(i9, i10);
                    }
                }
                b(this.E, 3);
                size = this.E.size();
                for (i19 = i7; i19 < size; i19++) {
                    iMax = B(this.E.get(i19), iMax, iArr, iMin2);
                }
                i20 = iMin2;
                b(this.E, 5);
                size2 = this.E.size();
                for (i21 = i7; i21 < size2; i21++) {
                    iMin = C(this.E.get(i21), iMin, iArr, i20);
                }
                b(this.E, 1);
                int iU = u(this.E, iArr);
                i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iU / 2);
                i23 = iU + i22;
                if (i22 >= iMax) {
                    if (i23 > iMin) {
                        iMax = i22 - (i23 - iMin);
                    } else {
                        iMax = i22;
                    }
                }
                size3 = this.E.size();
                while (i7 < size3) {
                    iMax = B(this.E.get(i7), iMax, iArr, i20);
                    i7++;
                }
                this.E.clear();
            }
            i6 = paddingLeft;
            iMin2 = iMin2;
            i7 = 0;
            b(this.E, 3);
            size = this.E.size();
            while (i19 < size) {
                iMax = B(this.E.get(i19), iMax, iArr, iMin2);
            }
            i20 = iMin2;
            b(this.E, 5);
            size2 = this.E.size();
            while (i21 < size2) {
                iMin = C(this.E.get(i21), iMin, iArr, i20);
            }
            b(this.E, 1);
            int iU2 = u(this.E, iArr);
            i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iU2 / 2);
            i23 = iU2 + i22;
            if (i22 >= iMax) {
                if (i23 > iMin) {
                    iMax = i22 - (i23 - iMin);
                } else {
                    iMax = i22;
                }
            }
            size3 = this.E.size();
            while (i7 < size3) {
                iMax = B(this.E.get(i7), iMax, iArr, i20);
                i7++;
            }
            this.E.clear();
        }
        iB = paddingLeft;
        iC = i24;
        if (M(this.i)) {
            imageButton = this.i;
            if (z3) {
                iC = C(imageButton, iC, iArr, iMin2);
            } else {
                iB = B(imageButton, iB, iArr, iMin2);
            }
        }
        if (M(this.f1308b)) {
            actionMenuView = this.f1308b;
            if (z3) {
                iB = B(actionMenuView, iB, iArr, iMin2);
            } else {
                iC = C(actionMenuView, iC, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iB);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i24 - iC));
        iMax = Math.max(iB, currentContentInsetLeft2);
        iMin = Math.min(iC, i24 - currentContentInsetRight2);
        if (M(this.j)) {
            view = this.j;
            if (z3) {
                iMin = C(view, iMin, iArr, iMin2);
            } else {
                iMax = B(view, iMax, iArr, iMin2);
            }
        }
        if (M(this.f1312f)) {
            imageView = this.f1312f;
            if (z3) {
                iMin = C(imageView, iMin, iArr, iMin2);
            } else {
                iMax = B(imageView, iMax, iArr, iMin2);
            }
        }
        zM = M(this.f1309c);
        zM2 = M(this.f1310d);
        if (zM) {
            e eVar7 = (e) this.f1309c.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) eVar7).topMargin + this.f1309c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar7).bottomMargin + 0;
        } else {
            measuredHeight = 0;
        }
        if (zM2) {
            e eVar8 = (e) this.f1310d.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) eVar8).topMargin + this.f1310d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar8).bottomMargin;
        }
        if (zM) {
            if (zM) {
                textView = this.f1309c;
            } else {
                textView = this.f1310d;
            }
            if (zM2) {
                textView2 = this.f1310d;
            } else {
                textView2 = this.f1309c;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zM) {
            }
            i5 = this.x & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.s;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i15 = this.s;
                if (iMax2 < i14 + i15) {
                    iMax2 = i14 + i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i18 = this.t;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.t) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.q;
                } else {
                    i11 = 0;
                }
                int i29 = i11 - iArr[1];
                iMin -= Math.max(0, i29);
                iArr[1] = Math.max(0, -i29);
                if (zM) {
                    e eVar9 = (e) this.f1309c.getLayoutParams();
                    int measuredWidth4 = iMin - this.f1309c.getMeasuredWidth();
                    int measuredHeight4 = this.f1309c.getMeasuredHeight() + paddingTop;
                    this.f1309c.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i12 = measuredWidth4 - this.r;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) eVar9).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM2) {
                    int i210 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1310d.getLayoutParams())).topMargin;
                    this.f1310d.layout(iMin - this.f1310d.getMeasuredWidth(), i210, iMin, this.f1310d.getMeasuredHeight() + i210);
                    i13 = iMin - this.r;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
                i7 = 0;
            } else {
                if (z2) {
                    i8 = this.q;
                    i7 = 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i211 = i8 - iArr[i7];
                iMax += Math.max(i7, i211);
                iArr[i7] = Math.max(i7, -i211);
                if (zM) {
                    e eVar10 = (e) this.f1309c.getLayoutParams();
                    int measuredWidth5 = this.f1309c.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f1309c.getMeasuredHeight() + paddingTop;
                    this.f1309c.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i9 = measuredWidth5 + this.r;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) eVar10).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM2) {
                    int i212 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1310d.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f1310d.getMeasuredWidth() + iMax;
                    this.f1310d.layout(iMax, i212, measuredWidth6, this.f1310d.getMeasuredHeight() + i212);
                    i10 = measuredWidth6 + this.r;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        } else {
            if (zM) {
                textView = this.f1309c;
            } else {
                textView = this.f1310d;
            }
            if (zM2) {
                textView2 = this.f1310d;
            } else {
                textView2 = this.f1309c;
            }
            eVar = (e) textView.getLayoutParams();
            eVar2 = (e) textView2.getLayoutParams();
            if (zM) {
            }
            i5 = this.x & 112;
            i6 = paddingLeft;
            if (i5 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + this.s;
            } else if (i5 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - measuredHeight) / 2;
                i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
                i15 = this.s;
                if (iMax2 < i14 + i15) {
                    iMax2 = i14 + i15;
                } else {
                    i16 = (((height - paddingBottom) - measuredHeight) - iMax2) - paddingTop2;
                    i17 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                    i18 = this.t;
                    if (i16 < i17 + i18) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) eVar2).bottomMargin + i18) - i16));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin) - this.t) - measuredHeight;
            }
            if (z3) {
                if (z2) {
                    i11 = this.q;
                } else {
                    i11 = 0;
                }
                int i213 = i11 - iArr[1];
                iMin -= Math.max(0, i213);
                iArr[1] = Math.max(0, -i213);
                if (zM) {
                    e eVar11 = (e) this.f1309c.getLayoutParams();
                    int measuredWidth7 = iMin - this.f1309c.getMeasuredWidth();
                    int measuredHeight6 = this.f1309c.getMeasuredHeight() + paddingTop;
                    this.f1309c.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i12 = measuredWidth7 - this.r;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) eVar11).bottomMargin;
                } else {
                    i12 = iMin;
                }
                if (zM2) {
                    int i214 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1310d.getLayoutParams())).topMargin;
                    this.f1310d.layout(iMin - this.f1310d.getMeasuredWidth(), i214, iMin, this.f1310d.getMeasuredHeight() + i214);
                    i13 = iMin - this.r;
                } else {
                    i13 = iMin;
                }
                if (z2) {
                    iMin = Math.min(i12, i13);
                }
                iMax = iMax;
                i7 = 0;
            } else {
                if (z2) {
                    i8 = this.q;
                    i7 = 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i215 = i8 - iArr[i7];
                iMax += Math.max(i7, i215);
                iArr[i7] = Math.max(i7, -i215);
                if (zM) {
                    e eVar12 = (e) this.f1309c.getLayoutParams();
                    int measuredWidth8 = this.f1309c.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f1309c.getMeasuredHeight() + paddingTop;
                    this.f1309c.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i9 = measuredWidth8 + this.r;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) eVar12).bottomMargin;
                } else {
                    i9 = iMax;
                }
                if (zM2) {
                    int i216 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e) this.f1310d.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f1310d.getMeasuredWidth() + iMax;
                    this.f1310d.layout(iMax, i216, measuredWidth9, this.f1310d.getMeasuredHeight() + i216);
                    i10 = measuredWidth9 + this.r;
                } else {
                    i10 = iMax;
                }
                if (z2) {
                    iMax = Math.max(i9, i10);
                }
            }
        }
        b(this.E, 3);
        size = this.E.size();
        while (i19 < size) {
            iMax = B(this.E.get(i19), iMax, iArr, iMin2);
        }
        i20 = iMin2;
        b(this.E, 5);
        size2 = this.E.size();
        while (i21 < size2) {
            iMin = C(this.E.get(i21), iMin, iArr, i20);
        }
        b(this.E, 1);
        int iU3 = u(this.E, iArr);
        i22 = (i6 + (((width - i6) - paddingRight) / 2)) - (iU3 / 2);
        i23 = iU3 + i22;
        if (i22 >= iMax) {
            if (i23 > iMin) {
                iMax = i22 - (i23 - iMin);
            } else {
                iMax = i22;
            }
        }
        size3 = this.E.size();
        while (i7 < size3) {
            iMax = B(this.E.get(i7), iMax, iArr, i20);
            i7++;
        }
        this.E.clear();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        char c2;
        char c3;
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.G;
        if (d1.b(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (M(this.f1311e)) {
            E(this.f1311e, i, 0, i2, 0, this.p);
            measuredWidth = this.f1311e.getMeasuredWidth() + s(this.f1311e);
            iMax = Math.max(0, this.f1311e.getMeasuredHeight() + t(this.f1311e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1311e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (M(this.i)) {
            E(this.i, i, 0, i2, 0, this.p);
            measuredWidth = this.i.getMeasuredWidth() + s(this.i);
            iMax = Math.max(iMax, this.i.getMeasuredHeight() + t(this.i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = 0 + Math.max(currentContentInsetStart, measuredWidth);
        iArr[c3] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (M(this.f1308b)) {
            E(this.f1308b, i, iMax3, i2, 0, this.p);
            measuredWidth2 = this.f1308b.getMeasuredWidth() + s(this.f1308b);
            iMax = Math.max(iMax, this.f1308b.getMeasuredHeight() + t(this.f1308b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1308b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (M(this.j)) {
            iMax4 += D(this.j, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.j.getMeasuredHeight() + t(this.j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.j.getMeasuredState());
        }
        if (M(this.f1312f)) {
            iMax4 += D(this.f1312f, i, iMax4, i2, 0, iArr);
            iMax = Math.max(iMax, this.f1312f.getMeasuredHeight() + t(this.f1312f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1312f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (((e) childAt.getLayoutParams()).f1319b == 0 && M(childAt)) {
                iMax4 += D(childAt, i, iMax4, i2, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + t(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i4 = this.s + this.t;
        int i5 = this.q + this.r;
        if (M(this.f1309c)) {
            D(this.f1309c, i, iMax4 + i5, i2, i4, iArr);
            int measuredWidth3 = this.f1309c.getMeasuredWidth() + s(this.f1309c);
            measuredHeight = this.f1309c.getMeasuredHeight() + t(this.f1309c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1309c.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (M(this.f1310d)) {
            iMax2 = Math.max(iMax2, D(this.f1310d, i, iMax4 + i5, i2, measuredHeight + i4, iArr));
            measuredHeight += this.f1310d.getMeasuredHeight() + t(this.f1310d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1310d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2), L() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.j());
        ActionMenuView actionMenuView = this.f1308b;
        androidx.appcompat.view.menu.g gVarN = actionMenuView != null ? actionMenuView.N() : null;
        int i = gVar.f1320d;
        if (i != 0 && this.L != null && gVarN != null && (menuItemFindItem = gVarN.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f1321e) {
            F();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        if (Build.VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        h();
        this.u.f(i == 1);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.L;
        if (dVar != null && (iVar = dVar.f1317c) != null) {
            gVar.f1320d = iVar.getItemId();
        }
        gVar.f1321e = A();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.C = false;
        }
        if (!this.C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.C = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(a.a.k.a.a.d(getContext(), i));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.g);
            }
        }
    }

    public void setCollapsible(boolean z) {
        this.O = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.w) {
            this.w = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.v) {
            this.v = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(a.a.k.a.a.d(getContext(), i));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!y(this.f1312f)) {
                c(this.f1312f, true);
            }
        } else {
            ImageView imageView = this.f1312f;
            if (imageView != null && y(imageView)) {
                removeView(this.f1312f);
                this.F.remove(this.f1312f);
            }
        }
        ImageView imageView2 = this.f1312f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1312f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            l();
        }
        ImageButton imageButton = this.f1311e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(a.a.k.a.a.d(getContext(), i));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            l();
            if (!y(this.f1311e)) {
                c(this.f1311e, true);
            }
        } else {
            ImageButton imageButton = this.f1311e;
            if (imageButton != null && y(imageButton)) {
                removeView(this.f1311e);
                this.F.remove(this.f1311e);
            }
        }
        ImageButton imageButton2 = this.f1311e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        l();
        this.f1311e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.H = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        j();
        this.f1308b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.l != i) {
            this.l = i;
            if (i == 0) {
                this.k = getContext();
            } else {
                this.k = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1310d;
            if (textView != null && y(textView)) {
                removeView(this.f1310d);
                this.F.remove(this.f1310d);
            }
        } else {
            if (this.f1310d == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.f1310d = a0Var;
                a0Var.setSingleLine();
                this.f1310d.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.n;
                if (i != 0) {
                    this.f1310d.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.B;
                if (colorStateList != null) {
                    this.f1310d.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1310d)) {
                c(this.f1310d, true);
            }
        }
        TextView textView2 = this.f1310d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.z = charSequence;
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.B = colorStateList;
        TextView textView = this.f1310d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1309c;
            if (textView != null && y(textView)) {
                removeView(this.f1309c);
                this.F.remove(this.f1309c);
            }
        } else {
            if (this.f1309c == null) {
                Context context = getContext();
                a0 a0Var = new a0(context);
                this.f1309c = a0Var;
                a0Var.setSingleLine();
                this.f1309c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.m;
                if (i != 0) {
                    this.f1309c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A;
                if (colorStateList != null) {
                    this.f1309c.setTextColor(colorStateList);
                }
            }
            if (!y(this.f1309c)) {
                c(this.f1309c, true);
            }
        }
        TextView textView2 = this.f1309c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.y = charSequence;
    }

    public void setTitleMarginBottom(int i) {
        this.t = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.r = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.q = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.s = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f1309c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean v() {
        d dVar = this.L;
        return (dVar == null || dVar.f1317c == null) ? false : true;
    }

    public boolean w() {
        ActionMenuView actionMenuView = this.f1308b;
        return actionMenuView != null && actionMenuView.H();
    }

    public void x(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public boolean z() {
        ActionMenuView actionMenuView = this.f1308b;
        return actionMenuView != null && actionMenuView.I();
    }
}
