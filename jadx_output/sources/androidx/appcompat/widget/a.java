package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
abstract class a extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final C0042a f1327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Context f1328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected ActionMenuView f1329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected c f1330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f1331f;
    protected a.g.l.z g;
    private boolean h;
    private boolean i;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    protected class C0042a implements a.g.l.a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f1332a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1333b;

        protected C0042a() {
        }

        @Override // a.g.l.a0
        public void a(View view) {
            if (this.f1332a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.f1333b);
        }

        @Override // a.g.l.a0
        public void b(View view) {
            a.super.setVisibility(0);
            this.f1332a = false;
        }

        @Override // a.g.l.a0
        public void c(View view) {
            this.f1332a = true;
        }

        public C0042a d(a.g.l.z zVar, int i) {
            a.this.g = zVar;
            this.f1333b = i;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1327b = new C0042a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.a.a.f0a, typedValue, true) || typedValue.resourceId == 0) {
            this.f1328c = context;
        } else {
            this.f1328c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    protected static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    protected int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    protected int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public a.g.l.z f(int i, long j) {
        a.g.l.z zVarA;
        a.g.l.z zVar = this.g;
        if (zVar != null) {
            zVar.b();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            zVarA = a.g.l.v.d(this).a(1.0f);
        } else {
            zVarA = a.g.l.v.d(this).a(0.0f);
        }
        zVarA.d(j);
        zVarA.f(this.f1327b.d(zVarA, i));
        return zVarA;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f1327b.f1333b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1331f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, a.a.j.f47a, a.a.a.f2c, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(a.a.j.j, 0));
        typedArrayObtainStyledAttributes.recycle();
        c cVar = this.f1330e;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            a.g.l.z zVar = this.g;
            if (zVar != null) {
                zVar.b();
            }
            super.setVisibility(i);
        }
    }
}
