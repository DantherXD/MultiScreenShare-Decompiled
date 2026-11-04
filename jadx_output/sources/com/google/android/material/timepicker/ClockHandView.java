package com.google.android.material.timepicker;

import a.g.l.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import c.b.a.b.j;
import c.b.a.b.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class ClockHandView extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ValueAnimator f4253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f4255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f4256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4257f;
    private int g;
    private final List<d> h;
    private final int i;
    private final float j;
    private final Paint k;
    private final RectF l;
    private final int m;
    private float n;
    private boolean o;
    private c p;
    private double q;
    private int r;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ClockHandView.this.m(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface c {
        void a(float f2, boolean z);
    }

    public interface d {
        void a(float f2, boolean z);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.a.b.b.s);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.k = paint;
        this.l = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.U0, i, j.r);
        this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.W0, 0);
        this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(k.X0, 0);
        Resources resources = getResources();
        this.m = resources.getDimensionPixelSize(c.b.a.b.d.k);
        this.j = resources.getDimensionPixelSize(c.b.a.b.d.i);
        int color = typedArrayObtainStyledAttributes.getColor(k.V0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        k(0.0f);
        this.g = ViewConfiguration.get(context).getScaledTouchSlop();
        v.x0(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void c(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f2 = width;
        float fCos = (this.r * ((float) Math.cos(this.q))) + f2;
        float f3 = height;
        float fSin = (this.r * ((float) Math.sin(this.q))) + f3;
        this.k.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.i, this.k);
        double dSin = Math.sin(this.q);
        double dCos = Math.cos(this.q);
        double d2 = this.r - this.i;
        this.k.setStrokeWidth(this.m);
        canvas.drawLine(f2, f3, width + ((int) (dCos * d2)), height + ((int) (d2 * dSin)), this.k);
        canvas.drawCircle(f2, f3, this.j, this.k);
    }

    private int e(float f2, float f3) {
        int degrees = ((int) Math.toDegrees(Math.atan2(f3 - (getHeight() / 2), f2 - (getWidth() / 2)))) + 90;
        return degrees < 0 ? degrees + 360 : degrees;
    }

    private Pair<Float, Float> h(float f2) {
        float f3 = f();
        if (Math.abs(f3 - f2) > 180.0f) {
            if (f3 > 180.0f && f2 < 180.0f) {
                f2 += 360.0f;
            }
            if (f3 < 180.0f && f2 > 180.0f) {
                f3 += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(f3), Float.valueOf(f2));
    }

    private boolean i(float f2, float f3, boolean z, boolean z2, boolean z3) {
        float fE = e(f2, f3);
        boolean z4 = false;
        boolean z5 = f() != fE;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.f4254c) {
            z4 = true;
        }
        l(fE, z4);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float f2, boolean z) {
        float f3 = f2 % 360.0f;
        this.n = f3;
        this.q = Math.toRadians(f3 - 90.0f);
        int height = getHeight() / 2;
        float width = (getWidth() / 2) + (this.r * ((float) Math.cos(this.q)));
        float fSin = height + (this.r * ((float) Math.sin(this.q)));
        RectF rectF = this.l;
        int i = this.i;
        rectF.set(width - i, fSin - i, width + i, fSin + i);
        Iterator<d> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().a(f3, z);
        }
        invalidate();
    }

    public void b(d dVar) {
        this.h.add(dVar);
    }

    public RectF d() {
        return this.l;
    }

    public float f() {
        return this.n;
    }

    public int g() {
        return this.i;
    }

    public void j(int i) {
        this.r = i;
        invalidate();
    }

    public void k(float f2) {
        l(f2, false);
    }

    public void l(float f2, boolean z) {
        ValueAnimator valueAnimator = this.f4253b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            m(f2, false);
            return;
        }
        Pair<Float, Float> pairH = h(f2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(((Float) pairH.first).floatValue(), ((Float) pairH.second).floatValue());
        this.f4253b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(200L);
        this.f4253b.addUpdateListener(new a());
        this.f4253b.addListener(new b());
        this.f4253b.start();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        c(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        k(f());
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        c cVar;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.f4255d = x;
            this.f4256e = y;
            this.f4257f = true;
            this.o = false;
            z = false;
            z2 = false;
            z3 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.f4255d);
            int i2 = (int) (y - this.f4256e);
            this.f4257f = (i * i) + (i2 * i2) > this.g;
            boolean z4 = this.o;
            z = actionMasked == 1;
            z3 = false;
            z2 = z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean zI = i(x, y, z2, z3, z) | this.o;
        this.o = zI;
        if (zI && z && (cVar = this.p) != null) {
            cVar.a(e(x, y), this.f4257f);
        }
        return true;
    }
}
