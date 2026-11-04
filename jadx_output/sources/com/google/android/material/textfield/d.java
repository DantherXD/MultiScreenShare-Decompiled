package com.google.android.material.textfield;

import a.g.l.v;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import c.b.a.b.a0.k;

/* JADX INFO: loaded from: classes.dex */
class d extends com.google.android.material.textfield.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final boolean f4199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TextWatcher f4200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final View.OnFocusChangeListener f4201f;
    private final TextInputLayout.e g;
    private final TextInputLayout.f h;

    @SuppressLint({"ClickableViewAccessibility"})
    private final TextInputLayout.g i;
    private boolean j;
    private boolean k;
    private long l;
    private StateListDrawable m;
    private c.b.a.b.a0.g n;
    private AccessibilityManager o;
    private ValueAnimator p;
    private ValueAnimator q;

    class a extends com.google.android.material.internal.i {

        /* JADX INFO: renamed from: com.google.android.material.textfield.d$a$a, reason: collision with other inner class name */
        class RunnableC0103a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f4203b;

            RunnableC0103a(AutoCompleteTextView autoCompleteTextView) {
                this.f4203b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zIsPopupShowing = this.f4203b.isPopupShowing();
                d.this.E(zIsPopupShowing);
                d.this.j = zIsPopupShowing;
            }
        }

        a() {
        }

        @Override // com.google.android.material.internal.i, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.f4217a.getEditText());
            if (d.this.o.isTouchExplorationEnabled() && d.D(autoCompleteTextViewY) && !d.this.f4219c.hasFocus()) {
                autoCompleteTextViewY.dismissDropDown();
            }
            autoCompleteTextViewY.post(new RunnableC0103a(autoCompleteTextViewY));
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            d.this.f4219c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class c implements View.OnFocusChangeListener {
        c() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z) {
            d.this.f4217a.setEndIconActivated(z);
            if (z) {
                return;
            }
            d.this.E(false);
            d.this.j = false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.textfield.d$d, reason: collision with other inner class name */
    class C0104d extends TextInputLayout.e {
        C0104d(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        @Override // com.google.android.material.textfield.TextInputLayout.e, a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            if (!d.D(d.this.f4217a.getEditText())) {
                cVar.W(Spinner.class.getName());
            }
            if (cVar.J()) {
                cVar.g0(null);
            }
        }

        @Override // a.g.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            AutoCompleteTextView autoCompleteTextViewY = d.y(d.this.f4217a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && d.this.o.isTouchExplorationEnabled() && !d.D(d.this.f4217a.getEditText())) {
                d.this.H(autoCompleteTextViewY);
            }
        }
    }

    class e implements TextInputLayout.f {
        e() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView autoCompleteTextViewY = d.y(textInputLayout.getEditText());
            d.this.F(autoCompleteTextViewY);
            d.this.v(autoCompleteTextViewY);
            d.this.G(autoCompleteTextViewY);
            autoCompleteTextViewY.setThreshold(0);
            autoCompleteTextViewY.removeTextChangedListener(d.this.f4200e);
            autoCompleteTextViewY.addTextChangedListener(d.this.f4200e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!d.D(autoCompleteTextViewY)) {
                v.x0(d.this.f4219c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(d.this.g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    class f implements TextInputLayout.g {

        class a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AutoCompleteTextView f4210b;

            a(AutoCompleteTextView autoCompleteTextView) {
                this.f4210b = autoCompleteTextView;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f4210b.removeTextChangedListener(d.this.f4200e);
            }
        }

        f() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView == null || i != 3) {
                return;
            }
            autoCompleteTextView.post(new a(autoCompleteTextView));
            if (autoCompleteTextView.getOnFocusChangeListener() == d.this.f4201f) {
                autoCompleteTextView.setOnFocusChangeListener(null);
            }
            autoCompleteTextView.setOnTouchListener(null);
            if (d.f4199d) {
                autoCompleteTextView.setOnDismissListener(null);
            }
        }
    }

    class g implements View.OnClickListener {
        g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d.this.H((AutoCompleteTextView) d.this.f4217a.getEditText());
        }
    }

    class h implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AutoCompleteTextView f4213b;

        h(AutoCompleteTextView autoCompleteTextView) {
            this.f4213b = autoCompleteTextView;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (d.this.C()) {
                    d.this.j = false;
                }
                d.this.H(this.f4213b);
            }
            return false;
        }
    }

    class i implements AutoCompleteTextView.OnDismissListener {
        i() {
        }

        @Override // android.widget.AutoCompleteTextView.OnDismissListener
        public void onDismiss() {
            d.this.j = true;
            d.this.l = System.currentTimeMillis();
            d.this.E(false);
        }
    }

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            d dVar = d.this;
            dVar.f4219c.setChecked(dVar.k);
            d.this.q.start();
        }
    }

    static {
        f4199d = Build.VERSION.SDK_INT >= 21;
    }

    d(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4200e = new a();
        this.f4201f = new c();
        this.g = new C0104d(this.f4217a);
        this.h = new e();
        this.i = new f();
        this.j = false;
        this.k = false;
        this.l = Long.MAX_VALUE;
    }

    private c.b.a.b.a0.g A(float f2, float f3, float f4, int i2) {
        k kVarM = k.a().A(f2).E(f2).s(f3).w(f3).m();
        c.b.a.b.a0.g gVarM = c.b.a.b.a0.g.m(this.f4218b, f4);
        gVarM.setShapeAppearanceModel(kVarM);
        gVarM.Y(0, i2, 0, i2);
        return gVarM;
    }

    private void B() {
        this.q = z(67, 0.0f, 1.0f);
        ValueAnimator valueAnimatorZ = z(50, 1.0f, 0.0f);
        this.p = valueAnimatorZ;
        valueAnimatorZ.addListener(new j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.l;
        return jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean D(EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(boolean z) {
        if (this.k != z) {
            this.k = z;
            this.q.cancel();
            this.p.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(AutoCompleteTextView autoCompleteTextView) {
        Drawable drawable;
        if (f4199d) {
            int boxBackgroundMode = this.f4217a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                drawable = this.n;
            } else if (boxBackgroundMode != 1) {
                return;
            } else {
                drawable = this.m;
            }
            autoCompleteTextView.setDropDownBackgroundDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void G(AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new h(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f4201f);
        if (f4199d) {
            autoCompleteTextView.setOnDismissListener(new i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView == null) {
            return;
        }
        if (C()) {
            this.j = false;
        }
        if (this.j) {
            this.j = false;
            return;
        }
        if (f4199d) {
            E(!this.k);
        } else {
            this.k = !this.k;
            this.f4219c.toggle();
        }
        if (!this.k) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(AutoCompleteTextView autoCompleteTextView) {
        if (D(autoCompleteTextView)) {
            return;
        }
        int boxBackgroundMode = this.f4217a.getBoxBackgroundMode();
        c.b.a.b.a0.g boxBackground = this.f4217a.getBoxBackground();
        int iC = c.b.a.b.q.a.c(autoCompleteTextView, c.b.a.b.b.g);
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[0]};
        if (boxBackgroundMode == 2) {
            x(autoCompleteTextView, iC, iArr, boxBackground);
        } else if (boxBackgroundMode == 1) {
            w(autoCompleteTextView, iC, iArr, boxBackground);
        }
    }

    private void w(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, c.b.a.b.a0.g gVar) {
        int boxBackgroundColor = this.f4217a.getBoxBackgroundColor();
        int[] iArr2 = {c.b.a.b.q.a.f(i2, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f4199d) {
            v.r0(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), gVar, gVar));
            return;
        }
        c.b.a.b.a0.g gVar2 = new c.b.a.b.a0.g(gVar.C());
        gVar2.W(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gVar, gVar2});
        int I = v.I(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int iH = v.H(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        v.r0(autoCompleteTextView, layerDrawable);
        v.A0(autoCompleteTextView, I, paddingTop, iH, paddingBottom);
    }

    private void x(AutoCompleteTextView autoCompleteTextView, int i2, int[][] iArr, c.b.a.b.a0.g gVar) {
        LayerDrawable layerDrawable;
        int iC = c.b.a.b.q.a.c(autoCompleteTextView, c.b.a.b.b.k);
        c.b.a.b.a0.g gVar2 = new c.b.a.b.a0.g(gVar.C());
        int iF = c.b.a.b.q.a.f(i2, iC, 0.1f);
        gVar2.W(new ColorStateList(iArr, new int[]{iF, 0}));
        if (f4199d) {
            gVar2.setTint(iC);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iF, iC});
            c.b.a.b.a0.g gVar3 = new c.b.a.b.a0.g(gVar.C());
            gVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{gVar2, gVar});
        }
        v.r0(autoCompleteTextView, layerDrawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AutoCompleteTextView y(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private ValueAnimator z(int i2, float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(c.b.a.b.l.a.f2755a);
        valueAnimatorOfFloat.setDuration(i2);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        float dimensionPixelOffset = this.f4218b.getResources().getDimensionPixelOffset(c.b.a.b.d.O);
        float dimensionPixelOffset2 = this.f4218b.getResources().getDimensionPixelOffset(c.b.a.b.d.L);
        int dimensionPixelOffset3 = this.f4218b.getResources().getDimensionPixelOffset(c.b.a.b.d.M);
        c.b.a.b.a0.g gVarA = A(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        c.b.a.b.a0.g gVarA2 = A(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.n = gVarA;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.m = stateListDrawable;
        stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, gVarA);
        this.m.addState(new int[0], gVarA2);
        this.f4217a.setEndIconDrawable(a.a.k.a.a.d(this.f4218b, f4199d ? c.b.a.b.e.f2720d : c.b.a.b.e.f2721e));
        TextInputLayout textInputLayout = this.f4217a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(c.b.a.b.i.g));
        this.f4217a.setEndIconOnClickListener(new g());
        this.f4217a.e(this.h);
        this.f4217a.f(this.i);
        B();
        this.o = (AccessibilityManager) this.f4218b.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.e
    boolean b(int i2) {
        return i2 != 0;
    }

    @Override // com.google.android.material.textfield.e
    boolean d() {
        return true;
    }
}
