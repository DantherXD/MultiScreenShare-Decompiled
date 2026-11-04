package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class q0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Interpolator f1466b = new DecelerateInterpolator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f1467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f1468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    j0 f1469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Spinner f1470f;
    private boolean g;
    int h;
    int i;
    private int j;
    private int k;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1471b;

        a(View view) {
            this.f1471b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.this.smoothScrollTo(this.f1471b.getLeft() - ((q0.this.getWidth() - this.f1471b.getWidth()) / 2), 0);
            q0.this.f1467c = null;
        }
    }

    private class b extends BaseAdapter {
        b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return q0.this.f1469e.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) q0.this.f1469e.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return q0.this.c((androidx.appcompat.app.a.c) getItem(i), true);
            }
            ((d) view).a((androidx.appcompat.app.a.c) getItem(i));
            return view;
        }
    }

    private class c implements View.OnClickListener {
        c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = q0.this.f1469e.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = q0.this.f1469e.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    private class d extends LinearLayout {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f1475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.appcompat.app.a.c f1476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private TextView f1477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ImageView f1478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f1479f;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(Context context, androidx.appcompat.app.a.c cVar, boolean z) {
            int i = a.a.a.f3d;
            super(context, null, i);
            int[] iArr = {R.attr.background};
            this.f1475b = iArr;
            this.f1476c = cVar;
            x0 x0VarV = x0.v(context, null, iArr, i, 0);
            if (x0VarV.s(0)) {
                setBackgroundDrawable(x0VarV.g(0));
            }
            x0VarV.w();
            if (z) {
                setGravity(8388627);
            }
            c();
        }

        public void a(androidx.appcompat.app.a.c cVar) {
            this.f1476c = cVar;
            c();
        }

        public androidx.appcompat.app.a.c b() {
            return this.f1476c;
        }

        public void c() {
            androidx.appcompat.app.a.c cVar = this.f1476c;
            View viewB = cVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f1479f = viewB;
                TextView textView = this.f1477d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1478e;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1478e.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1479f;
            if (view != null) {
                removeView(view);
                this.f1479f = null;
            }
            Drawable drawableC = cVar.c();
            CharSequence charSequenceD = cVar.d();
            if (drawableC != null) {
                if (this.f1478e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f1478e = oVar;
                }
                this.f1478e.setImageDrawable(drawableC);
                this.f1478e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1478e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1478e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(charSequenceD);
            if (z) {
                if (this.f1477d == null) {
                    a0 a0Var = new a0(getContext(), null, a.a.a.f4e);
                    a0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    a0Var.setLayoutParams(layoutParams2);
                    addView(a0Var);
                    this.f1477d = a0Var;
                }
                this.f1477d.setText(charSequenceD);
                this.f1477d.setVisibility(0);
            } else {
                TextView textView2 = this.f1477d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1477d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1478e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            z0.a(this, z ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (q0.this.h > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = q0.this.h;
                if (measuredWidth > i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    private Spinner b() {
        x xVar = new x(getContext(), null, a.a.a.h);
        xVar.setLayoutParams(new j0.a(-2, -1));
        xVar.setOnItemSelectedListener(this);
        return xVar;
    }

    private boolean d() {
        Spinner spinner = this.f1470f;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1470f == null) {
            this.f1470f = b();
        }
        removeView(this.f1469e);
        addView(this.f1470f, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1470f.getAdapter() == null) {
            this.f1470f.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1467c;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1467c = null;
        }
        this.f1470f.setSelection(this.k);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1470f);
        addView(this.f1469e, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1470f.getSelectedItemPosition());
        return false;
    }

    public void a(int i) {
        View childAt = this.f1469e.getChildAt(i);
        Runnable runnable = this.f1467c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1467c = aVar;
        post(aVar);
    }

    d c(androidx.appcompat.app.a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.j));
        } else {
            dVar.setFocusable(true);
            if (this.f1468d == null) {
                this.f1468d = new c();
            }
            dVar.setOnClickListener(this.f1468d);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1467c;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a.a.n.a aVarB = a.a.n.a.b(getContext());
        setContentHeight(aVarB.f());
        this.i = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1467c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().e();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.f1469e.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            iMin = -1;
        } else {
            if (childCount > 2) {
                this.h = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.h = View.MeasureSpec.getSize(i) / 2;
            }
            iMin = Math.min(this.h, this.i);
        }
        this.h = iMin;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
        if (!z && this.g) {
            this.f1469e.measure(0, iMakeMeasureSpec);
            if (this.f1469e.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.k);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.g = z;
    }

    public void setContentHeight(int i) {
        this.j = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.k = i;
        int childCount = this.f1469e.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1469e.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1470f;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
