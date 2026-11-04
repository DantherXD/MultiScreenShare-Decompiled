package com.google.android.material.textfield;

import a.g.l.v;
import android.R;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.x0;
import c.b.a.b.a0.k;
import c.b.a.b.j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4172b = j.g;
    private CharSequence A;
    private int A0;
    private final TextView B;
    private ColorStateList B0;
    private boolean C;
    private int C0;
    private CharSequence D;
    private int D0;
    private boolean E;
    private int E0;
    private c.b.a.b.a0.g F;
    private int F0;
    private c.b.a.b.a0.g G;
    private int G0;
    private k H;
    private boolean H0;
    private final int I;
    final com.google.android.material.internal.a I0;
    private int J;
    private boolean J0;
    private int K;
    private boolean K0;
    private int L;
    private ValueAnimator L0;
    private int M;
    private boolean M0;
    private int N;
    private boolean N0;
    private int O;
    private int P;
    private int Q;
    private final Rect R;
    private final Rect S;
    private final RectF T;
    private Typeface U;
    private final CheckableImageButton V;
    private ColorStateList W;
    private boolean a0;
    private PorterDuff.Mode b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FrameLayout f4173c;
    private boolean c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinearLayout f4174d;
    private Drawable d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinearLayout f4175e;
    private int e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FrameLayout f4176f;
    private View.OnLongClickListener f0;
    EditText g;
    private final LinkedHashSet<f> g0;
    private CharSequence h;
    private int h0;
    private int i;
    private final SparseArray<com.google.android.material.textfield.e> i0;
    private int j;
    private final CheckableImageButton j0;
    private final com.google.android.material.textfield.f k;
    private final LinkedHashSet<g> k0;
    boolean l;
    private ColorStateList l0;
    private int m;
    private boolean m0;
    private boolean n;
    private PorterDuff.Mode n0;
    private TextView o;
    private boolean o0;
    private int p;
    private Drawable p0;
    private int q;
    private int q0;
    private CharSequence r;
    private Drawable r0;
    private boolean s;
    private View.OnLongClickListener s0;
    private TextView t;
    private View.OnLongClickListener t0;
    private ColorStateList u;
    private final CheckableImageButton u0;
    private int v;
    private ColorStateList v0;
    private ColorStateList w;
    private ColorStateList w0;
    private ColorStateList x;
    private ColorStateList x0;
    private CharSequence y;
    private int y0;
    private final TextView z;
    private int z0;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.v0(!textInputLayout.N0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.l) {
                textInputLayout2.n0(editable.length());
            }
            if (TextInputLayout.this.s) {
                TextInputLayout.this.z0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.j0.performClick();
            TextInputLayout.this.j0.jumpDrawablesToCurrentState();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.g.requestLayout();
        }
    }

    class d implements ValueAnimator.AnimatorUpdateListener {
        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.I0.a0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends a.g.l.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final TextInputLayout f4181d;

        public e(TextInputLayout textInputLayout) {
            this.f4181d = textInputLayout;
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            super.g(view, cVar);
            EditText editText = this.f4181d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f4181d.getHint();
            CharSequence error = this.f4181d.getError();
            CharSequence placeholderText = this.f4181d.getPlaceholderText();
            int counterMaxLength = this.f4181d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f4181d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !this.f4181d.N();
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z2 ? hint.toString() : "";
            if (z) {
                cVar.r0(text);
            } else if (!TextUtils.isEmpty(string)) {
                cVar.r0(string);
                if (z3 && placeholderText != null) {
                    cVar.r0(string + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                cVar.r0(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    cVar.g0(string);
                } else {
                    if (z) {
                        string = ((Object) text) + ", " + string;
                    }
                    cVar.r0(string);
                }
                cVar.o0(!z);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.h0(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                cVar.c0(error);
            }
            if (Build.VERSION.SDK_INT < 17 || editText == null) {
                return;
            }
            editText.setLabelFor(c.b.a.b.f.L);
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    static class h extends a.i.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        CharSequence f4182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f4183e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        CharSequence f4184f;
        CharSequence g;
        CharSequence h;

        static class a implements Parcelable.ClassLoaderCreator<h> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i) {
                return new h[i];
            }
        }

        h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4182d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4183e = parcel.readInt() == 1;
            this.f4184f = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f4182d) + " hint=" + ((Object) this.f4184f) + " helperText=" + ((Object) this.g) + " placeholderText=" + ((Object) this.h) + "}";
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f4182d, parcel, i);
            parcel.writeInt(this.f4183e ? 1 : 0);
            TextUtils.writeToParcel(this.f4184f, parcel, i);
            TextUtils.writeToParcel(this.g, parcel, i);
            TextUtils.writeToParcel(this.h, parcel, i);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.b.a.b.b.C);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v158 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47, types: [boolean, int] */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        int i2;
        ?? r2;
        int i3;
        int colorForState;
        int i4 = f4172b;
        super(com.google.android.material.theme.a.a.c(context, attributeSet, i, i4), attributeSet, i);
        this.i = -1;
        this.j = -1;
        this.k = new com.google.android.material.textfield.f(this);
        this.R = new Rect();
        this.S = new Rect();
        this.T = new RectF();
        this.g0 = new LinkedHashSet<>();
        this.h0 = 0;
        this.i0 = new SparseArray<>();
        this.k0 = new LinkedHashSet<>();
        com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(this);
        this.I0 = aVar;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f4173c = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(frameLayout);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f4174d = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        frameLayout.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f4175e = linearLayout2;
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout.addView(linearLayout2);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f4176f = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = c.b.a.b.l.a.f2755a;
        aVar.f0(timeInterpolator);
        aVar.c0(timeInterpolator);
        aVar.Q(8388659);
        int[] iArr = c.b.a.b.k.D4;
        int i5 = c.b.a.b.k.Y4;
        int i6 = c.b.a.b.k.W4;
        int i7 = c.b.a.b.k.l5;
        int i8 = c.b.a.b.k.q5;
        int i9 = c.b.a.b.k.u5;
        x0 x0VarI = com.google.android.material.internal.j.i(context2, attributeSet, iArr, i, i4, i5, i6, i7, i8, i9);
        this.C = x0VarI.a(c.b.a.b.k.t5, true);
        setHint(x0VarI.p(c.b.a.b.k.I4));
        this.K0 = x0VarI.a(c.b.a.b.k.s5, true);
        this.J0 = x0VarI.a(c.b.a.b.k.n5, true);
        int i10 = c.b.a.b.k.H4;
        if (x0VarI.s(i10)) {
            setMinWidth(x0VarI.f(i10, -1));
        }
        int i11 = c.b.a.b.k.G4;
        if (x0VarI.s(i11)) {
            setMaxWidth(x0VarI.f(i11, -1));
        }
        this.H = k.e(context2, attributeSet, i, i4).m();
        this.I = context2.getResources().getDimensionPixelOffset(c.b.a.b.d.Q);
        this.L = x0VarI.e(c.b.a.b.k.L4, 0);
        this.N = x0VarI.f(c.b.a.b.k.S4, context2.getResources().getDimensionPixelSize(c.b.a.b.d.R));
        this.O = x0VarI.f(c.b.a.b.k.T4, context2.getResources().getDimensionPixelSize(c.b.a.b.d.S));
        this.M = this.N;
        float fD = x0VarI.d(c.b.a.b.k.P4, -1.0f);
        float fD2 = x0VarI.d(c.b.a.b.k.O4, -1.0f);
        float fD3 = x0VarI.d(c.b.a.b.k.M4, -1.0f);
        float fD4 = x0VarI.d(c.b.a.b.k.N4, -1.0f);
        k.b bVarV = this.H.v();
        if (fD >= 0.0f) {
            bVarV.A(fD);
        }
        if (fD2 >= 0.0f) {
            bVarV.E(fD2);
        }
        if (fD3 >= 0.0f) {
            bVarV.w(fD3);
        }
        if (fD4 >= 0.0f) {
            bVarV.s(fD4);
        }
        this.H = bVarV.m();
        ColorStateList colorStateListB = c.b.a.b.x.c.b(context2, x0VarI, c.b.a.b.k.J4);
        if (colorStateListB != null) {
            int defaultColor = colorStateListB.getDefaultColor();
            this.C0 = defaultColor;
            this.Q = defaultColor;
            if (colorStateListB.isStateful()) {
                this.D0 = colorStateListB.getColorForState(new int[]{-16842910}, -1);
                i2 = 2;
                this.E0 = colorStateListB.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                colorForState = colorStateListB.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                i2 = 2;
                this.E0 = this.C0;
                ColorStateList colorStateListC = a.a.k.a.a.c(context2, c.b.a.b.c.f2707c);
                this.D0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
            this.F0 = colorForState;
        } else {
            i2 = 2;
            this.Q = 0;
            this.C0 = 0;
            this.D0 = 0;
            this.E0 = 0;
            this.F0 = 0;
        }
        int i12 = c.b.a.b.k.F4;
        if (x0VarI.s(i12)) {
            ColorStateList colorStateListC2 = x0VarI.c(i12);
            this.x0 = colorStateListC2;
            this.w0 = colorStateListC2;
        }
        int i13 = c.b.a.b.k.Q4;
        ColorStateList colorStateListB2 = c.b.a.b.x.c.b(context2, x0VarI, i13);
        this.A0 = x0VarI.b(i13, 0);
        this.y0 = a.g.d.a.c(context2, c.b.a.b.c.f2708d);
        this.G0 = a.g.d.a.c(context2, c.b.a.b.c.f2709e);
        this.z0 = a.g.d.a.c(context2, c.b.a.b.c.f2710f);
        if (colorStateListB2 != null) {
            setBoxStrokeColorStateList(colorStateListB2);
        }
        int i14 = c.b.a.b.k.R4;
        if (x0VarI.s(i14)) {
            setBoxStrokeErrorColor(c.b.a.b.x.c.b(context2, x0VarI, i14));
        }
        if (x0VarI.n(i9, -1) != -1) {
            r2 = 0;
            setHintTextAppearance(x0VarI.n(i9, 0));
        } else {
            r2 = 0;
        }
        int iN = x0VarI.n(i7, r2);
        CharSequence charSequenceP = x0VarI.p(c.b.a.b.k.g5);
        boolean zA = x0VarI.a(c.b.a.b.k.h5, r2);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i15 = c.b.a.b.h.f2732b;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i15, linearLayout2, (boolean) r2);
        this.u0 = checkableImageButton;
        checkableImageButton.setId(c.b.a.b.f.I);
        checkableImageButton.setVisibility(8);
        if (c.b.a.b.x.c.g(context2)) {
            a.g.l.h.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r2);
        }
        int i16 = c.b.a.b.k.i5;
        if (x0VarI.s(i16)) {
            setErrorIconDrawable(x0VarI.g(i16));
        }
        int i17 = c.b.a.b.k.j5;
        if (x0VarI.s(i17)) {
            setErrorIconTintList(c.b.a.b.x.c.b(context2, x0VarI, i17));
        }
        int i18 = c.b.a.b.k.k5;
        if (x0VarI.s(i18)) {
            setErrorIconTintMode(l.e(x0VarI.k(i18, -1), null));
        }
        checkableImageButton.setContentDescription(getResources().getText(c.b.a.b.i.f2742f));
        v.x0(checkableImageButton, i2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iN2 = x0VarI.n(i8, 0);
        boolean zA2 = x0VarI.a(c.b.a.b.k.p5, false);
        CharSequence charSequenceP2 = x0VarI.p(c.b.a.b.k.o5);
        int iN3 = x0VarI.n(c.b.a.b.k.C5, 0);
        CharSequence charSequenceP3 = x0VarI.p(c.b.a.b.k.B5);
        int iN4 = x0VarI.n(c.b.a.b.k.F5, 0);
        CharSequence charSequenceP4 = x0VarI.p(c.b.a.b.k.E5);
        int iN5 = x0VarI.n(c.b.a.b.k.N5, 0);
        CharSequence charSequenceP5 = x0VarI.p(c.b.a.b.k.M5);
        boolean zA3 = x0VarI.a(c.b.a.b.k.U4, false);
        setCounterMaxLength(x0VarI.k(c.b.a.b.k.V4, -1));
        this.q = x0VarI.n(i5, 0);
        this.p = x0VarI.n(i6, 0);
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(c.b.a.b.h.f2733c, (ViewGroup) this.f4174d, false);
        this.V = checkableImageButton2;
        checkableImageButton2.setVisibility(8);
        if (c.b.a.b.x.c.g(context2)) {
            a.g.l.h.c((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i19 = c.b.a.b.k.J5;
        if (x0VarI.s(i19)) {
            setStartIconDrawable(x0VarI.g(i19));
            int i20 = c.b.a.b.k.I5;
            if (x0VarI.s(i20)) {
                setStartIconContentDescription(x0VarI.p(i20));
            }
            setStartIconCheckable(x0VarI.a(c.b.a.b.k.H5, true));
        }
        int i21 = c.b.a.b.k.K5;
        if (x0VarI.s(i21)) {
            setStartIconTintList(c.b.a.b.x.c.b(context2, x0VarI, i21));
        }
        int i22 = c.b.a.b.k.L5;
        if (x0VarI.s(i22)) {
            setStartIconTintMode(l.e(x0VarI.k(i22, -1), null));
        }
        setBoxBackgroundMode(x0VarI.k(c.b.a.b.k.K4, 0));
        this.j0 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(i15, (ViewGroup) this.f4176f, false);
        this.f4176f.addView(this.j0);
        this.j0.setVisibility(8);
        if (c.b.a.b.x.c.g(context2)) {
            i3 = 0;
            a.g.l.h.d((ViewGroup.MarginLayoutParams) this.j0.getLayoutParams(), 0);
        } else {
            i3 = 0;
        }
        this.i0.append(-1, new com.google.android.material.textfield.b(this));
        this.i0.append(i3, new com.google.android.material.textfield.h(this));
        this.i0.append(1, new i(this));
        this.i0.append(2, new com.google.android.material.textfield.a(this));
        this.i0.append(3, new com.google.android.material.textfield.d(this));
        int i23 = c.b.a.b.k.d5;
        if (x0VarI.s(i23)) {
            setEndIconMode(x0VarI.k(i23, 0));
            int i24 = c.b.a.b.k.c5;
            if (x0VarI.s(i24)) {
                setEndIconDrawable(x0VarI.g(i24));
            }
            int i25 = c.b.a.b.k.b5;
            if (x0VarI.s(i25)) {
                setEndIconContentDescription(x0VarI.p(i25));
            }
            setEndIconCheckable(x0VarI.a(c.b.a.b.k.a5, true));
        } else {
            int i26 = c.b.a.b.k.y5;
            if (x0VarI.s(i26)) {
                setEndIconMode(x0VarI.a(i26, false) ? 1 : 0);
                setEndIconDrawable(x0VarI.g(c.b.a.b.k.x5));
                setEndIconContentDescription(x0VarI.p(c.b.a.b.k.w5));
                int i27 = c.b.a.b.k.z5;
                if (x0VarI.s(i27)) {
                    setEndIconTintList(c.b.a.b.x.c.b(context2, x0VarI, i27));
                }
                int i28 = c.b.a.b.k.A5;
                if (x0VarI.s(i28)) {
                    setEndIconTintMode(l.e(x0VarI.k(i28, -1), null));
                }
            }
        }
        if (!x0VarI.s(c.b.a.b.k.y5)) {
            int i29 = c.b.a.b.k.e5;
            if (x0VarI.s(i29)) {
                setEndIconTintList(c.b.a.b.x.c.b(context2, x0VarI, i29));
            }
            int i30 = c.b.a.b.k.f5;
            if (x0VarI.s(i30)) {
                setEndIconTintMode(l.e(x0VarI.k(i30, -1), null));
            }
        }
        a0 a0Var = new a0(context2);
        this.z = a0Var;
        a0Var.setId(c.b.a.b.f.N);
        a0Var.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        v.q0(a0Var, 1);
        this.f4174d.addView(this.V);
        this.f4174d.addView(a0Var);
        a0 a0Var2 = new a0(context2);
        this.B = a0Var2;
        a0Var2.setId(c.b.a.b.f.O);
        a0Var2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        v.q0(a0Var2, 1);
        this.f4175e.addView(a0Var2);
        this.f4175e.addView(this.u0);
        this.f4175e.addView(this.f4176f);
        setHelperTextEnabled(zA2);
        setHelperText(charSequenceP2);
        setHelperTextTextAppearance(iN2);
        setErrorEnabled(zA);
        setErrorTextAppearance(iN);
        setErrorContentDescription(charSequenceP);
        setCounterTextAppearance(this.q);
        setCounterOverflowTextAppearance(this.p);
        setPlaceholderText(charSequenceP3);
        setPlaceholderTextAppearance(iN3);
        setPrefixText(charSequenceP4);
        setPrefixTextAppearance(iN4);
        setSuffixText(charSequenceP5);
        setSuffixTextAppearance(iN5);
        int i31 = c.b.a.b.k.m5;
        if (x0VarI.s(i31)) {
            setErrorTextColor(x0VarI.c(i31));
        }
        int i32 = c.b.a.b.k.r5;
        if (x0VarI.s(i32)) {
            setHelperTextColor(x0VarI.c(i32));
        }
        int i33 = c.b.a.b.k.v5;
        if (x0VarI.s(i33)) {
            setHintTextColor(x0VarI.c(i33));
        }
        int i34 = c.b.a.b.k.Z4;
        if (x0VarI.s(i34)) {
            setCounterTextColor(x0VarI.c(i34));
        }
        int i35 = c.b.a.b.k.X4;
        if (x0VarI.s(i35)) {
            setCounterOverflowTextColor(x0VarI.c(i35));
        }
        int i36 = c.b.a.b.k.D5;
        if (x0VarI.s(i36)) {
            setPlaceholderTextColor(x0VarI.c(i36));
        }
        int i37 = c.b.a.b.k.G5;
        if (x0VarI.s(i37)) {
            setPrefixTextColor(x0VarI.c(i37));
        }
        int i38 = c.b.a.b.k.O5;
        if (x0VarI.s(i38)) {
            setSuffixTextColor(x0VarI.c(i38));
        }
        setCounterEnabled(zA3);
        setEnabled(x0VarI.a(c.b.a.b.k.E4, true));
        x0VarI.w();
        v.x0(this, 2);
        if (Build.VERSION.SDK_INT >= 26) {
            v.y0(this, 1);
        }
    }

    private boolean A() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof com.google.android.material.textfield.c);
    }

    private void A0() {
        if (this.g == null) {
            return;
        }
        v.A0(this.z, Q() ? 0 : v.I(this.g), this.g.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(c.b.a.b.d.v), this.g.getCompoundPaddingBottom());
    }

    private void B() {
        Iterator<f> it = this.g0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    private void B0() {
        this.z.setVisibility((this.y == null || N()) ? 8 : 0);
        r0();
    }

    private void C(int i) {
        Iterator<g> it = this.k0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i);
        }
    }

    private void C0(boolean z, boolean z2) {
        int defaultColor = this.B0.getDefaultColor();
        int colorForState = this.B0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.B0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.P = colorForState2;
        } else if (z2) {
            this.P = colorForState;
        } else {
            this.P = defaultColor;
        }
    }

    private void D(Canvas canvas) {
        c.b.a.b.a0.g gVar = this.G;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.M;
            this.G.draw(canvas);
        }
    }

    private void D0() {
        if (this.g == null) {
            return;
        }
        v.A0(this.B, getContext().getResources().getDimensionPixelSize(c.b.a.b.d.v), this.g.getPaddingTop(), (K() || L()) ? 0 : v.H(this.g), this.g.getPaddingBottom());
    }

    private void E(Canvas canvas) {
        if (this.C) {
            this.I0.m(canvas);
        }
    }

    private void E0() {
        int visibility = this.B.getVisibility();
        boolean z = (this.A == null || N()) ? false : true;
        this.B.setVisibility(z ? 0 : 8);
        if (visibility != this.B.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        r0();
    }

    private void F(boolean z) {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.L0.cancel();
        }
        if (z && this.K0) {
            i(0.0f);
        } else {
            this.I0.a0(0.0f);
        }
        if (A() && ((com.google.android.material.textfield.c) this.F).i0()) {
            y();
        }
        this.H0 = true;
        J();
        B0();
        E0();
    }

    private int G(int i, boolean z) {
        int compoundPaddingLeft = i + this.g.getCompoundPaddingLeft();
        return (this.y == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.z.getMeasuredWidth()) + this.z.getPaddingLeft();
    }

    private int H(int i, boolean z) {
        int compoundPaddingRight = i - this.g.getCompoundPaddingRight();
        return (this.y == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.z.getMeasuredWidth() - this.z.getPaddingRight());
    }

    private boolean I() {
        return this.h0 != 0;
    }

    private void J() {
        TextView textView = this.t;
        if (textView == null || !this.s) {
            return;
        }
        textView.setText((CharSequence) null);
        this.t.setVisibility(4);
    }

    private boolean L() {
        return this.u0.getVisibility() == 0;
    }

    private boolean P() {
        return this.K == 1 && (Build.VERSION.SDK_INT < 16 || this.g.getMinLines() <= 1);
    }

    private int[] R(CheckableImageButton checkableImageButton) {
        int[] drawableState = getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        return iArrCopyOf;
    }

    private void S() {
        p();
        a0();
        F0();
        k0();
        h();
        if (this.K != 0) {
            u0();
        }
    }

    private void T() {
        if (A()) {
            RectF rectF = this.T;
            this.I0.p(rectF, this.g.getWidth(), this.g.getGravity());
            l(rectF);
            int i = this.M;
            this.J = i;
            rectF.top = 0.0f;
            rectF.bottom = i;
            rectF.offset(-getPaddingLeft(), 0.0f);
            ((com.google.android.material.textfield.c) this.F).o0(rectF);
        }
    }

    private static void U(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                U((ViewGroup) childAt, z);
            }
        }
    }

    private void X(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(R(checkableImageButton), colorStateList.getDefaultColor());
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(drawable).mutate();
        androidx.core.graphics.drawable.a.o(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    private void Z() {
        TextView textView = this.t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void a0() {
        if (h0()) {
            v.r0(this.g, this.F);
        }
    }

    private static void b0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean zO = v.O(checkableImageButton);
        boolean z = onLongClickListener != null;
        boolean z2 = zO || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(zO);
        checkableImageButton.setPressable(zO);
        checkableImageButton.setLongClickable(z);
        v.x0(checkableImageButton, z2 ? 1 : 2);
    }

    private static void c0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private static void d0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        b0(checkableImageButton, onLongClickListener);
    }

    private boolean f0() {
        return (this.u0.getVisibility() == 0 || ((I() && K()) || this.A != null)) && this.f4175e.getMeasuredWidth() > 0;
    }

    private void g() {
        TextView textView = this.t;
        if (textView != null) {
            this.f4173c.addView(textView);
            this.t.setVisibility(0);
        }
    }

    private boolean g0() {
        return !(getStartIconDrawable() == null && this.y == null) && this.f4174d.getMeasuredWidth() > 0;
    }

    private com.google.android.material.textfield.e getEndIconDelegate() {
        com.google.android.material.textfield.e eVar = this.i0.get(this.h0);
        return eVar != null ? eVar : this.i0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.u0.getVisibility() == 0) {
            return this.u0;
        }
        if (I() && K()) {
            return this.j0;
        }
        return null;
    }

    private void h() {
        EditText editText;
        int I;
        int dimensionPixelSize;
        int iH;
        Resources resources;
        int i;
        if (this.g == null || this.K != 1) {
            return;
        }
        if (c.b.a.b.x.c.h(getContext())) {
            editText = this.g;
            I = v.I(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(c.b.a.b.d.p);
            iH = v.H(this.g);
            resources = getResources();
            i = c.b.a.b.d.o;
        } else {
            if (!c.b.a.b.x.c.g(getContext())) {
                return;
            }
            editText = this.g;
            I = v.I(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(c.b.a.b.d.n);
            iH = v.H(this.g);
            resources = getResources();
            i = c.b.a.b.d.m;
        }
        v.A0(editText, I, dimensionPixelSize, iH, resources.getDimensionPixelSize(i));
    }

    private boolean h0() {
        EditText editText = this.g;
        return (editText == null || this.F == null || editText.getBackground() != null || this.K == 0) ? false : true;
    }

    private void i0() {
        TextView textView = this.t;
        if (textView == null || !this.s) {
            return;
        }
        textView.setText(this.r);
        this.t.setVisibility(0);
        this.t.bringToFront();
    }

    private void j() {
        c.b.a.b.a0.g gVar = this.F;
        if (gVar == null) {
            return;
        }
        gVar.setShapeAppearanceModel(this.H);
        if (w()) {
            this.F.b0(this.M, this.P);
        }
        int iQ = q();
        this.Q = iQ;
        this.F.W(ColorStateList.valueOf(iQ));
        if (this.h0 == 3) {
            this.g.getBackground().invalidateSelf();
        }
        k();
        invalidate();
    }

    private void j0(boolean z) {
        if (!z || getEndIconDrawable() == null) {
            m();
            return;
        }
        Drawable drawableMutate = androidx.core.graphics.drawable.a.r(getEndIconDrawable()).mutate();
        androidx.core.graphics.drawable.a.n(drawableMutate, this.k.o());
        this.j0.setImageDrawable(drawableMutate);
    }

    private void k() {
        if (this.G == null) {
            return;
        }
        if (x()) {
            this.G.W(ColorStateList.valueOf(this.P));
        }
        invalidate();
    }

    private void k0() {
        Resources resources;
        int i;
        if (this.K == 1) {
            if (c.b.a.b.x.c.h(getContext())) {
                resources = getResources();
                i = c.b.a.b.d.r;
            } else {
                if (!c.b.a.b.x.c.g(getContext())) {
                    return;
                }
                resources = getResources();
                i = c.b.a.b.d.q;
            }
            this.L = resources.getDimensionPixelSize(i);
        }
    }

    private void l(RectF rectF) {
        float f2 = rectF.left;
        int i = this.I;
        rectF.left = f2 - i;
        rectF.right += i;
    }

    private void l0(Rect rect) {
        c.b.a.b.a0.g gVar = this.G;
        if (gVar != null) {
            int i = rect.bottom;
            gVar.setBounds(rect.left, i - this.O, rect.right, i);
        }
    }

    private void m() {
        n(this.j0, this.m0, this.l0, this.o0, this.n0);
    }

    private void m0() {
        if (this.o != null) {
            EditText editText = this.g;
            n0(editText == null ? 0 : editText.getText().length());
        }
    }

    private void n(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            if (z) {
                androidx.core.graphics.drawable.a.o(drawable, colorStateList);
            }
            if (z2) {
                androidx.core.graphics.drawable.a.p(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    private void o() {
        n(this.V, this.a0, this.W, this.c0, this.b0);
    }

    private static void o0(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? c.b.a.b.i.f2739c : c.b.a.b.i.f2738b, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    private void p() {
        int i = this.K;
        if (i == 0) {
            this.F = null;
        } else if (i == 1) {
            this.F = new c.b.a.b.a0.g(this.H);
            this.G = new c.b.a.b.a0.g();
            return;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.K + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.F = (!this.C || (this.F instanceof com.google.android.material.textfield.c)) ? new c.b.a.b.a0.g(this.H) : new com.google.android.material.textfield.c(this.H);
        }
        this.G = null;
    }

    private void p0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.o;
        if (textView != null) {
            e0(textView, this.n ? this.p : this.q);
            if (!this.n && (colorStateList2 = this.w) != null) {
                this.o.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.x) == null) {
                return;
            }
            this.o.setTextColor(colorStateList);
        }
    }

    private int q() {
        return this.K == 1 ? c.b.a.b.q.a.e(c.b.a.b.q.a.d(this, c.b.a.b.b.k, 0), this.Q) : this.Q;
    }

    private void q0() {
        if (!A() || this.H0 || this.J == this.M) {
            return;
        }
        y();
        T();
    }

    private Rect r(Rect rect) {
        if (this.g == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.S;
        boolean z = v.C(this) == 1;
        rect2.bottom = rect.bottom;
        int i = this.K;
        if (i == 1) {
            rect2.left = G(rect.left, z);
            rect2.top = rect.top + this.L;
            rect2.right = H(rect.right, z);
            return rect2;
        }
        if (i != 2) {
            rect2.left = G(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = H(rect.right, z);
            return rect2;
        }
        rect2.left = rect.left + this.g.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.g.getPaddingRight();
        return rect2;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    private boolean r0() {
        boolean z;
        if (this.g == null) {
            return false;
        }
        boolean z2 = true;
        if (g0()) {
            int measuredWidth = this.f4174d.getMeasuredWidth() - this.g.getPaddingLeft();
            if (this.d0 == null || this.e0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.d0 = colorDrawable;
                this.e0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = androidx.core.widget.i.a(this.g);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.d0;
            if (drawable != drawable2) {
                androidx.core.widget.i.i(this.g, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.d0 != null) {
            Drawable[] drawableArrA2 = androidx.core.widget.i.a(this.g);
            androidx.core.widget.i.i(this.g, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
            this.d0 = null;
            z = true;
        } else {
            z = false;
        }
        if (f0()) {
            int measuredWidth2 = this.B.getMeasuredWidth() - this.g.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + a.g.l.h.b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] drawableArrA3 = androidx.core.widget.i.a(this.g);
            Drawable drawable3 = this.p0;
            if (drawable3 == null || this.q0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.p0 = colorDrawable2;
                    this.q0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.p0;
                if (drawable4 != drawable5) {
                    this.r0 = drawableArrA3[2];
                    androidx.core.widget.i.i(this.g, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.q0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                androidx.core.widget.i.i(this.g, drawableArrA3[0], drawableArrA3[1], this.p0, drawableArrA3[3]);
            }
        } else {
            if (this.p0 == null) {
                return z;
            }
            Drawable[] drawableArrA4 = androidx.core.widget.i.a(this.g);
            if (drawableArrA4[2] == this.p0) {
                androidx.core.widget.i.i(this.g, drawableArrA4[0], drawableArrA4[1], this.r0, drawableArrA4[3]);
            } else {
                z2 = z;
            }
            this.p0 = null;
        }
        return z2;
    }

    private int s(Rect rect, Rect rect2, float f2) {
        return P() ? (int) (rect2.top + f2) : rect.bottom - this.g.getCompoundPaddingBottom();
    }

    private void setEditText(EditText editText) {
        if (this.g != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.h0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.g = editText;
        setMinWidth(this.i);
        setMaxWidth(this.j);
        S();
        setTextInputAccessibilityDelegate(new e(this));
        this.I0.g0(this.g.getTypeface());
        this.I0.Y(this.g.getTextSize());
        int gravity = this.g.getGravity();
        this.I0.Q((gravity & (-113)) | 48);
        this.I0.X(gravity);
        this.g.addTextChangedListener(new a());
        if (this.w0 == null) {
            this.w0 = this.g.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.g.getHint();
                this.h = hint;
                setHint(hint);
                this.g.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (this.o != null) {
            n0(this.g.getText().length());
        }
        s0();
        this.k.e();
        this.f4174d.bringToFront();
        this.f4175e.bringToFront();
        this.f4176f.bringToFront();
        this.u0.bringToFront();
        B();
        A0();
        D0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w0(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.u0.setVisibility(z ? 0 : 8);
        this.f4176f.setVisibility(z ? 8 : 0);
        D0();
        if (I()) {
            return;
        }
        r0();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.I0.e0(charSequence);
        if (this.H0) {
            return;
        }
        T();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.s == z) {
            return;
        }
        if (z) {
            a0 a0Var = new a0(getContext());
            this.t = a0Var;
            a0Var.setId(c.b.a.b.f.M);
            v.q0(this.t, 1);
            setPlaceholderTextAppearance(this.v);
            setPlaceholderTextColor(this.u);
            g();
        } else {
            Z();
            this.t = null;
        }
        this.s = z;
    }

    private int t(Rect rect, float f2) {
        return P() ? (int) (rect.centerY() - (f2 / 2.0f)) : rect.top + this.g.getCompoundPaddingTop();
    }

    private boolean t0() {
        int iMax;
        if (this.g == null || this.g.getMeasuredHeight() >= (iMax = Math.max(this.f4175e.getMeasuredHeight(), this.f4174d.getMeasuredHeight()))) {
            return false;
        }
        this.g.setMinimumHeight(iMax);
        return true;
    }

    private Rect u(Rect rect) {
        if (this.g == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.S;
        float fX = this.I0.x();
        rect2.left = rect.left + this.g.getCompoundPaddingLeft();
        rect2.top = t(rect, fX);
        rect2.right = rect.right - this.g.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, fX);
        return rect2;
    }

    private void u0() {
        if (this.K != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4173c.getLayoutParams();
            int iV = v();
            if (iV != layoutParams.topMargin) {
                layoutParams.topMargin = iV;
                this.f4173c.requestLayout();
            }
        }
    }

    private int v() {
        float fR;
        if (!this.C) {
            return 0;
        }
        int i = this.K;
        if (i == 0 || i == 1) {
            fR = this.I0.r();
        } else {
            if (i != 2) {
                return 0;
            }
            fR = this.I0.r() / 2.0f;
        }
        return (int) fR;
    }

    private boolean w() {
        return this.K == 2 && x();
    }

    private void w0(boolean z, boolean z2) {
        ColorStateList textColors;
        com.google.android.material.internal.a aVar;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.g;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.g;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean zK = this.k.k();
        ColorStateList colorStateList = this.w0;
        if (colorStateList != null) {
            this.I0.P(colorStateList);
            this.I0.W(this.w0);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList2 = this.w0;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.G0) : this.G0;
            this.I0.P(ColorStateList.valueOf(colorForState));
            this.I0.W(ColorStateList.valueOf(colorForState));
        } else if (zK) {
            this.I0.P(this.k.p());
        } else {
            if (this.n && (textView = this.o) != null) {
                aVar = this.I0;
                textColors = textView.getTextColors();
            } else if (z4 && (textColors = this.x0) != null) {
                aVar = this.I0;
            }
            aVar.P(textColors);
        }
        if (z3 || !this.J0 || (isEnabled() && z4)) {
            if (z2 || this.H0) {
                z(z);
                return;
            }
            return;
        }
        if (z2 || !this.H0) {
            F(z);
        }
    }

    private boolean x() {
        return this.M > -1 && this.P != 0;
    }

    private void x0() {
        EditText editText;
        if (this.t == null || (editText = this.g) == null) {
            return;
        }
        this.t.setGravity(editText.getGravity());
        this.t.setPadding(this.g.getCompoundPaddingLeft(), this.g.getCompoundPaddingTop(), this.g.getCompoundPaddingRight(), this.g.getCompoundPaddingBottom());
    }

    private void y() {
        if (A()) {
            ((com.google.android.material.textfield.c) this.F).l0();
        }
    }

    private void y0() {
        EditText editText = this.g;
        z0(editText == null ? 0 : editText.getText().length());
    }

    private void z(boolean z) {
        ValueAnimator valueAnimator = this.L0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.L0.cancel();
        }
        if (z && this.K0) {
            i(1.0f);
        } else {
            this.I0.a0(1.0f);
        }
        this.H0 = false;
        if (A()) {
            T();
        }
        y0();
        B0();
        E0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z0(int i) {
        if (i != 0 || this.H0) {
            J();
        } else {
            i0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x004b  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    void F0() {
        int currentTextColor;
        TextView textView;
        int i;
        int i2;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.K == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.g) != null && editText2.hasFocus());
        boolean z3 = isHovered() || ((editText = this.g) != null && editText.isHovered());
        if (isEnabled()) {
            if (this.k.k()) {
                if (this.B0 != null) {
                    C0(z2, z3);
                } else {
                    currentTextColor = this.k.o();
                }
            } else if (!this.n || (textView = this.o) == null) {
                if (z2) {
                    currentTextColor = this.A0;
                } else {
                    currentTextColor = z3 ? this.z0 : this.y0;
                }
            } else if (this.B0 != null) {
                C0(z2, z3);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            if (getErrorIconDrawable() != null && this.k.x() && this.k.k()) {
                z = true;
            }
            setErrorIconVisible(z);
            W();
            Y();
            V();
            if (getEndIconDelegate().d()) {
                j0(this.k.k());
            }
            if (z2 || !isEnabled()) {
                i = this.N;
            } else {
                i = this.O;
            }
            this.M = i;
            if (this.K == 2) {
                q0();
            }
            if (this.K == 1) {
                if (!isEnabled()) {
                    i2 = this.D0;
                } else if (!z3 && !z2) {
                    i2 = this.F0;
                } else if (z2) {
                    i2 = this.E0;
                } else {
                    i2 = this.C0;
                }
                this.Q = i2;
            }
            j();
        }
        currentTextColor = this.G0;
        this.P = currentTextColor;
        if (getErrorIconDrawable() != null) {
            z = true;
        }
        setErrorIconVisible(z);
        W();
        Y();
        V();
        if (getEndIconDelegate().d()) {
            j0(this.k.k());
        }
        if (z2) {
            i = this.N;
        } else {
            i = this.N;
        }
        this.M = i;
        if (this.K == 2) {
            q0();
        }
        if (this.K == 1) {
            if (!isEnabled()) {
                i2 = this.D0;
            } else if (!z3) {
                if (z2) {
                    i2 = this.E0;
                } else {
                    i2 = this.C0;
                }
            } else if (z2) {
                i2 = this.E0;
            } else {
                i2 = this.C0;
            }
            this.Q = i2;
        }
        j();
    }

    public boolean K() {
        return this.f4176f.getVisibility() == 0 && this.j0.getVisibility() == 0;
    }

    public boolean M() {
        return this.k.y();
    }

    final boolean N() {
        return this.H0;
    }

    public boolean O() {
        return this.E;
    }

    public boolean Q() {
        return this.V.getVisibility() == 0;
    }

    public void V() {
        X(this.j0, this.l0);
    }

    public void W() {
        X(this.u0, this.v0);
    }

    public void Y() {
        X(this.V, this.W);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f4173c.addView(view, layoutParams2);
        this.f4173c.setLayoutParams(layoutParams);
        u0();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.g;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.h != null) {
            boolean z = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.g.setHint(this.h);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.g.setHint(hint);
                this.E = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f4173c.getChildCount());
        for (int i2 = 0; i2 < this.f4173c.getChildCount(); i2++) {
            View childAt = this.f4173c.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.g) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.N0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.N0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.M0) {
            return;
        }
        this.M0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.a aVar = this.I0;
        boolean zD0 = aVar != null ? aVar.d0(drawableState) | false : false;
        if (this.g != null) {
            v0(v.T(this) && isEnabled());
        }
        s0();
        F0();
        if (zD0) {
            invalidate();
        }
        this.M0 = false;
    }

    public void e(f fVar) {
        this.g0.add(fVar);
        if (this.g != null) {
            fVar.a(this);
        }
    }

    void e0(TextView textView, int i) {
        boolean z = true;
        try {
            androidx.core.widget.i.n(textView, i);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            androidx.core.widget.i.n(textView, j.f2743a);
            textView.setTextColor(a.g.d.a.c(getContext(), c.b.a.b.c.f2705a));
        }
    }

    public void f(g gVar) {
        this.k0.add(gVar);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.g;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    c.b.a.b.a0.g getBoxBackground() {
        int i = this.K;
        if (i == 1 || i == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.Q;
    }

    public int getBoxBackgroundMode() {
        return this.K;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return this.F.s();
    }

    public float getBoxCornerRadiusBottomStart() {
        return this.F.t();
    }

    public float getBoxCornerRadiusTopEnd() {
        return this.F.G();
    }

    public float getBoxCornerRadiusTopStart() {
        return this.F.F();
    }

    public int getBoxStrokeColor() {
        return this.A0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.B0;
    }

    public int getBoxStrokeWidth() {
        return this.N;
    }

    public int getBoxStrokeWidthFocused() {
        return this.O;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.l && this.n && (textView = this.o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.w;
    }

    public ColorStateList getCounterTextColor() {
        return this.w;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.w0;
    }

    public EditText getEditText() {
        return this.g;
    }

    public CharSequence getEndIconContentDescription() {
        return this.j0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.j0.getDrawable();
    }

    public int getEndIconMode() {
        return this.h0;
    }

    CheckableImageButton getEndIconView() {
        return this.j0;
    }

    public CharSequence getError() {
        if (this.k.x()) {
            return this.k.n();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.k.m();
    }

    public int getErrorCurrentTextColors() {
        return this.k.o();
    }

    public Drawable getErrorIconDrawable() {
        return this.u0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.k.o();
    }

    public CharSequence getHelperText() {
        if (this.k.y()) {
            return this.k.q();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.k.r();
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.I0.r();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.I0.u();
    }

    public ColorStateList getHintTextColor() {
        return this.x0;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.j0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.j0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.z.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.z;
    }

    public CharSequence getStartIconContentDescription() {
        return this.V.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.V.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.U;
    }

    void i(float f2) {
        if (this.I0.y() == f2) {
            return;
        }
        if (this.L0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.L0 = valueAnimator;
            valueAnimator.setInterpolator(c.b.a.b.l.a.f2756b);
            this.L0.setDuration(167L);
            this.L0.addUpdateListener(new d());
        }
        this.L0.setFloatValues(this.I0.y(), f2);
        this.L0.start();
    }

    void n0(int i) {
        boolean z = this.n;
        int i2 = this.m;
        if (i2 == -1) {
            this.o.setText(String.valueOf(i));
            this.o.setContentDescription(null);
            this.n = false;
        } else {
            this.n = i > i2;
            o0(getContext(), this.o, i, this.m, this.n);
            if (z != this.n) {
                p0();
            }
            this.o.setText(a.g.j.a.c().j(getContext().getString(c.b.a.b.i.f2740d, Integer.valueOf(i), Integer.valueOf(this.m))));
        }
        if (this.g == null || z == this.n) {
            return;
        }
        v0(false);
        F0();
        s0();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.g;
        if (editText != null) {
            Rect rect = this.R;
            com.google.android.material.internal.b.a(this, editText, rect);
            l0(rect);
            if (this.C) {
                this.I0.Y(this.g.getTextSize());
                int gravity = this.g.getGravity();
                this.I0.Q((gravity & (-113)) | 48);
                this.I0.X(gravity);
                this.I0.M(r(rect));
                this.I0.U(u(rect));
                this.I0.I();
                if (!A() || this.H0) {
                    return;
                }
                T();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean zT0 = t0();
        boolean zR0 = r0();
        if (zT0 || zR0) {
            this.g.post(new c());
        }
        x0();
        A0();
        D0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.j());
        setError(hVar.f4182d);
        if (hVar.f4183e) {
            this.j0.post(new b());
        }
        setHint(hVar.f4184f);
        setHelperText(hVar.g);
        setPlaceholderText(hVar.h);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.k.k()) {
            hVar.f4182d = getError();
        }
        hVar.f4183e = I() && this.j0.isChecked();
        hVar.f4184f = getHint();
        hVar.g = getHelperText();
        hVar.h = getPlaceholderText();
        return hVar;
    }

    void s0() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.g;
        if (editText == null || this.K != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (f0.a(background)) {
            background = background.mutate();
        }
        if (this.k.k()) {
            currentTextColor = this.k.o();
        } else {
            if (!this.n || (textView = this.o) == null) {
                androidx.core.graphics.drawable.a.c(background);
                this.g.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(androidx.appcompat.widget.j.e(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.Q != i) {
            this.Q = i;
            this.C0 = i;
            this.E0 = i;
            this.F0 = i;
            j();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(a.g.d.a.c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.C0 = defaultColor;
        this.Q = defaultColor;
        this.D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.E0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        j();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.K) {
            return;
        }
        this.K = i;
        if (this.g != null) {
            S();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.A0 != i) {
            this.A0 = i;
            F0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.A0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            F0();
        } else {
            this.y0 = colorStateList.getDefaultColor();
            this.G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.z0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        }
        this.A0 = defaultColor;
        F0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.B0 != colorStateList) {
            this.B0 = colorStateList;
            F0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.N = i;
        F0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.O = i;
        F0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            if (z) {
                a0 a0Var = new a0(getContext());
                this.o = a0Var;
                a0Var.setId(c.b.a.b.f.J);
                Typeface typeface = this.U;
                if (typeface != null) {
                    this.o.setTypeface(typeface);
                }
                this.o.setMaxLines(1);
                this.k.d(this.o, 2);
                a.g.l.h.d((ViewGroup.MarginLayoutParams) this.o.getLayoutParams(), getResources().getDimensionPixelOffset(c.b.a.b.d.T));
                p0();
                m0();
            } else {
                this.k.z(this.o, 2);
                this.o = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i <= 0) {
                i = -1;
            }
            this.m = i;
            if (this.l) {
                m0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.p != i) {
            this.p = i;
            p0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            p0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            p0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            p0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.w0 = colorStateList;
        this.x0 = colorStateList;
        if (this.g != null) {
            v0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        U(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.j0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.j0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.j0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? a.a.k.a.a.d(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.j0.setImageDrawable(drawable);
        V();
    }

    public void setEndIconMode(int i) {
        int i2 = this.h0;
        this.h0 = i;
        C(i2);
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.K)) {
            getEndIconDelegate().a();
            m();
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.K + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.j0, onClickListener, this.s0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.s0 = onLongClickListener;
        d0(this.j0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.l0 != colorStateList) {
            this.l0 = colorStateList;
            this.m0 = true;
            m();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.n0 != mode) {
            this.n0 = mode;
            this.o0 = true;
            m();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (K() != z) {
            this.j0.setVisibility(z ? 0 : 8);
            D0();
            r0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.k.x()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        com.google.android.material.textfield.f fVar = this.k;
        if (zIsEmpty) {
            fVar.t();
        } else {
            fVar.M(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.k.B(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.k.C(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? a.a.k.a.a.d(getContext(), i) : null);
        W();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.u0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.k.x());
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.u0, onClickListener, this.t0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.t0 = onLongClickListener;
        d0(this.u0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.v0 = colorStateList;
        Drawable drawable = this.u0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.o(drawable, colorStateList);
        }
        if (this.u0.getDrawable() != drawable) {
            this.u0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.u0.getDrawable();
        if (drawable != null) {
            drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
            androidx.core.graphics.drawable.a.p(drawable, mode);
        }
        if (this.u0.getDrawable() != drawable) {
            this.u0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.k.D(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.k.E(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.J0 != z) {
            this.J0 = z;
            v0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (M()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!M()) {
                setHelperTextEnabled(true);
            }
            this.k.N(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.k.H(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.k.G(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.k.F(i);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.K0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.C) {
            this.C = z;
            if (z) {
                CharSequence hint = this.g.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.g.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.g.getHint())) {
                    this.g.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.g != null) {
                u0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.I0.N(i);
        this.x0 = this.I0.q();
        if (this.g != null) {
            v0(false);
            u0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            if (this.w0 == null) {
                this.I0.P(colorStateList);
            }
            this.x0 = colorStateList;
            if (this.g != null) {
                v0(false);
            }
        }
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.g;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.j0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? a.a.k.a.a.d(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.j0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.h0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.l0 = colorStateList;
        this.m0 = true;
        m();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.n0 = mode;
        this.o0 = true;
        m();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.s && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        }
        y0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.v = i;
        TextView textView = this.t;
        if (textView != null) {
            androidx.core.widget.i.n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.z.setText(charSequence);
        B0();
    }

    public void setPrefixTextAppearance(int i) {
        androidx.core.widget.i.n(this.z, i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.V.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.V.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? a.a.k.a.a.d(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.V.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            Y();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        c0(this.V, onClickListener, this.f0);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f0 = onLongClickListener;
        d0(this.V, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.W != colorStateList) {
            this.W = colorStateList;
            this.a0 = true;
            o();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.b0 != mode) {
            this.b0 = mode;
            this.c0 = true;
            o();
        }
    }

    public void setStartIconVisible(boolean z) {
        if (Q() != z) {
            this.V.setVisibility(z ? 0 : 8);
            A0();
            r0();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        E0();
    }

    public void setSuffixTextAppearance(int i) {
        androidx.core.widget.i.n(this.B, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.g;
        if (editText != null) {
            v.o0(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.U) {
            this.U = typeface;
            this.I0.g0(typeface);
            this.k.J(typeface);
            TextView textView = this.o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    void v0(boolean z) {
        w0(z, false);
    }
}
