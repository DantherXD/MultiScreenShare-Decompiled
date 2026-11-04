package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0 f1547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private v0 f1548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v0 f1549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private v0 f1550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f1551f;
    private v0 g;
    private v0 h;
    private final b0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    class a extends a.g.d.f.f.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f1554c;

        a(int i, int i2, WeakReference weakReference) {
            this.f1552a = i;
            this.f1553b = i2;
            this.f1554c = weakReference;
        }

        @Override // a.g.d.f.f.a
        public void d(int i) {
        }

        @Override // a.g.d.f.f.a
        public void e(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f1552a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f1553b & 2) != 0);
            }
            z.this.n(this.f1554c, typeface);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f1556b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Typeface f1557c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f1558d;

        b(TextView textView, Typeface typeface, int i) {
            this.f1556b = textView;
            this.f1557c = typeface;
            this.f1558d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1556b.setTypeface(this.f1557c, this.f1558d);
        }
    }

    z(TextView textView) {
        this.f1546a = textView;
        this.i = new b0(textView);
    }

    private void B(int i, float f2) {
        this.i.y(i, f2);
    }

    private void C(Context context, x0 x0Var) {
        String strO;
        Typeface typefaceCreate;
        Typeface typeface;
        this.j = x0Var.k(a.a.j.M2, this.j);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int iK = x0Var.k(a.a.j.R2, -1);
            this.k = iK;
            if (iK != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i2 = a.a.j.Q2;
        if (!x0Var.s(i2) && !x0Var.s(a.a.j.S2)) {
            int i3 = a.a.j.L2;
            if (x0Var.s(i3)) {
                this.m = false;
                int iK2 = x0Var.k(i3, 1);
                if (iK2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (iK2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (iK2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i4 = a.a.j.S2;
        if (x0Var.s(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = x0Var.j(i2, this.j, new a(i5, i6, new WeakReference(this.f1546a)));
                if (typefaceJ != null) {
                    if (i >= 28 && this.k != -1) {
                        typefaceJ = Typeface.create(Typeface.create(typefaceJ, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = typefaceJ;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (strO = x0Var.o(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.k == -1) {
            typefaceCreate = Typeface.create(strO, this.j);
        } else {
            typefaceCreate = Typeface.create(Typeface.create(strO, 0), this.k, (this.j & 2) != 0);
        }
        this.l = typefaceCreate;
    }

    private void a(Drawable drawable, v0 v0Var) {
        if (drawable == null || v0Var == null) {
            return;
        }
        j.i(drawable, v0Var, this.f1546a.getDrawableState());
    }

    private static v0 d(Context context, j jVar, int i) {
        ColorStateList colorStateListF = jVar.f(context, i);
        if (colorStateListF == null) {
            return null;
        }
        v0 v0Var = new v0();
        v0Var.f1507d = true;
        v0Var.f1504a = colorStateListF;
        return v0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f1546a.getCompoundDrawablesRelative();
            TextView textView = this.f1546a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        if (i >= 17) {
            Drawable[] compoundDrawablesRelative2 = this.f1546a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f1546a;
                Drawable drawable7 = compoundDrawablesRelative2[0];
                if (drawable2 == null) {
                    drawable2 = compoundDrawablesRelative2[1];
                }
                Drawable drawable8 = compoundDrawablesRelative2[2];
                if (drawable4 == null) {
                    drawable4 = compoundDrawablesRelative2[3];
                }
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                return;
            }
        }
        Drawable[] compoundDrawables = this.f1546a.getCompoundDrawables();
        TextView textView3 = this.f1546a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        v0 v0Var = this.h;
        this.f1547b = v0Var;
        this.f1548c = v0Var;
        this.f1549d = v0Var;
        this.f1550e = v0Var;
        this.f1551f = v0Var;
        this.g = v0Var;
    }

    void A(int i, float f2) {
        if (androidx.core.widget.b.f1779a || l()) {
            return;
        }
        B(i, f2);
    }

    void b() {
        if (this.f1547b != null || this.f1548c != null || this.f1549d != null || this.f1550e != null) {
            Drawable[] compoundDrawables = this.f1546a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1547b);
            a(compoundDrawables[1], this.f1548c);
            a(compoundDrawables[2], this.f1549d);
            a(compoundDrawables[3], this.f1550e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f1551f == null && this.g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f1546a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f1551f);
            a(compoundDrawablesRelative[2], this.g);
        }
    }

    void c() {
        this.i.b();
    }

    int e() {
        return this.i.j();
    }

    int f() {
        return this.i.k();
    }

    int g() {
        return this.i.l();
    }

    int[] h() {
        return this.i.m();
    }

    int i() {
        return this.i.n();
    }

    ColorStateList j() {
        v0 v0Var = this.h;
        if (v0Var != null) {
            return v0Var.f1504a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        v0 v0Var = this.h;
        if (v0Var != null) {
            return v0Var.f1505b;
        }
        return null;
    }

    boolean l() {
        return this.i.s();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    /* JADX WARN: Code duplicated, block: B:50:0x010c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0114  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:61:0x0140  */
    /* JADX WARN: Code duplicated, block: B:80:0x0187  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    @SuppressLint({"NewApi"})
    void m(AttributeSet attributeSet, int i) {
        boolean zA;
        boolean z;
        String strO;
        ColorStateList colorStateListC;
        String strO2;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        int i2;
        String strO3;
        j jVar;
        int i3;
        int i4;
        int i5;
        Context context = this.f1546a.getContext();
        j jVarB = j.b();
        int[] iArr = a.a.j.a0;
        x0 x0VarV = x0.v(context, attributeSet, iArr, i, 0);
        TextView textView = this.f1546a;
        a.g.l.v.m0(textView, textView.getContext(), iArr, attributeSet, x0VarV.r(), i, 0);
        int iN = x0VarV.n(a.a.j.b0, -1);
        int i6 = a.a.j.e0;
        if (x0VarV.s(i6)) {
            this.f1547b = d(context, jVarB, x0VarV.n(i6, 0));
        }
        int i7 = a.a.j.c0;
        if (x0VarV.s(i7)) {
            this.f1548c = d(context, jVarB, x0VarV.n(i7, 0));
        }
        int i8 = a.a.j.f0;
        if (x0VarV.s(i8)) {
            this.f1549d = d(context, jVarB, x0VarV.n(i8, 0));
        }
        int i9 = a.a.j.d0;
        if (x0VarV.s(i9)) {
            this.f1550e = d(context, jVarB, x0VarV.n(i9, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 17) {
            int i11 = a.a.j.g0;
            if (x0VarV.s(i11)) {
                this.f1551f = d(context, jVarB, x0VarV.n(i11, 0));
            }
            int i12 = a.a.j.h0;
            if (x0VarV.s(i12)) {
                this.g = d(context, jVarB, x0VarV.n(i12, 0));
            }
        }
        x0VarV.w();
        boolean z2 = this.f1546a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            x0 x0VarT = x0.t(context, iN, a.a.j.J2);
            if (z2) {
                zA = false;
                z = false;
            } else {
                int i13 = a.a.j.U2;
                if (x0VarT.s(i13)) {
                    zA = x0VarT.a(i13, false);
                    z = true;
                } else {
                    zA = false;
                    z = false;
                }
            }
            C(context, x0VarT);
            if (i10 < 23) {
                int i14 = a.a.j.N2;
                colorStateListC = x0VarT.s(i14) ? x0VarT.c(i14) : null;
                int i15 = a.a.j.O2;
                colorStateListC2 = x0VarT.s(i15) ? x0VarT.c(i15) : null;
                int i16 = a.a.j.P2;
                colorStateListC3 = x0VarT.s(i16) ? x0VarT.c(i16) : null;
                i4 = a.a.j.V2;
                if (x0VarT.s(i4)) {
                    strO2 = x0VarT.o(i4);
                } else {
                    strO2 = null;
                }
                if (i10 >= 26) {
                    i5 = a.a.j.T2;
                    if (x0VarT.s(i5)) {
                        strO = x0VarT.o(i5);
                    } else {
                        strO = null;
                    }
                } else {
                    strO = null;
                }
                x0VarT.w();
            } else {
                colorStateListC = null;
                colorStateListC2 = null;
            }
            i4 = a.a.j.V2;
            if (x0VarT.s(i4)) {
                strO2 = x0VarT.o(i4);
            } else {
                strO2 = null;
            }
            if (i10 >= 26) {
                i5 = a.a.j.T2;
                if (x0VarT.s(i5)) {
                    strO = x0VarT.o(i5);
                } else {
                    strO = null;
                }
            } else {
                strO = null;
            }
            x0VarT.w();
        } else {
            zA = false;
            z = false;
            strO = null;
            colorStateListC = null;
            strO2 = null;
            colorStateListC2 = null;
            colorStateListC3 = null;
        }
        x0 x0VarV2 = x0.v(context, attributeSet, a.a.j.J2, i, 0);
        if (z2) {
            i2 = 23;
        } else {
            int i17 = a.a.j.U2;
            if (x0VarV2.s(i17)) {
                zA = x0VarV2.a(i17, false);
                i2 = 23;
                z = true;
            } else {
                i2 = 23;
            }
        }
        if (i10 < i2) {
            int i18 = a.a.j.N2;
            if (x0VarV2.s(i18)) {
                colorStateListC = x0VarV2.c(i18);
            }
            int i19 = a.a.j.O2;
            if (x0VarV2.s(i19)) {
                colorStateListC2 = x0VarV2.c(i19);
            }
            int i20 = a.a.j.P2;
            if (x0VarV2.s(i20)) {
                colorStateListC3 = x0VarV2.c(i20);
            }
        }
        int i21 = a.a.j.V2;
        if (x0VarV2.s(i21)) {
            strO2 = x0VarV2.o(i21);
        }
        if (i10 >= 26) {
            int i22 = a.a.j.T2;
            if (x0VarV2.s(i22)) {
                strO3 = x0VarV2.o(i22);
            } else {
                strO3 = strO;
            }
        } else {
            strO3 = strO;
        }
        if (i10 >= 28) {
            int i23 = a.a.j.K2;
            if (x0VarV2.s(i23)) {
                jVar = jVarB;
                if (x0VarV2.f(i23, -1) == 0) {
                    this.f1546a.setTextSize(0, 0.0f);
                }
            } else {
                jVar = jVarB;
            }
        } else {
            jVar = jVarB;
        }
        C(context, x0VarV2);
        x0VarV2.w();
        if (colorStateListC != null) {
            this.f1546a.setTextColor(colorStateListC);
        }
        if (colorStateListC2 != null) {
            this.f1546a.setHintTextColor(colorStateListC2);
        }
        if (colorStateListC3 != null) {
            this.f1546a.setLinkTextColor(colorStateListC3);
        }
        if (!z2 && z) {
            s(zA);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                this.f1546a.setTypeface(typeface, this.j);
            } else {
                this.f1546a.setTypeface(typeface);
            }
        }
        if (strO3 != null) {
            this.f1546a.setFontVariationSettings(strO3);
        }
        if (strO2 != null) {
            if (i10 >= 24) {
                this.f1546a.setTextLocales(LocaleList.forLanguageTags(strO2));
            } else if (i10 >= 21) {
                this.f1546a.setTextLocale(Locale.forLanguageTag(strO2.substring(0, strO2.indexOf(44))));
            }
        }
        this.i.t(attributeSet, i);
        if (androidx.core.widget.b.f1779a && this.i.n() != 0) {
            int[] iArrM = this.i.m();
            if (iArrM.length > 0) {
                if (this.f1546a.getAutoSizeStepGranularity() != -1.0f) {
                    this.f1546a.setAutoSizeTextTypeUniformWithConfiguration(this.i.k(), this.i.j(), this.i.l(), 0);
                } else {
                    this.f1546a.setAutoSizeTextTypeUniformWithPresetSizes(iArrM, 0);
                }
            }
        }
        x0 x0VarU = x0.u(context, attributeSet, a.a.j.i0);
        int iN2 = x0VarU.n(a.a.j.q0, -1);
        j jVar2 = jVar;
        Drawable drawableC = iN2 != -1 ? jVar2.c(context, iN2) : null;
        int iN3 = x0VarU.n(a.a.j.v0, -1);
        Drawable drawableC2 = iN3 != -1 ? jVar2.c(context, iN3) : null;
        int iN4 = x0VarU.n(a.a.j.r0, -1);
        Drawable drawableC3 = iN4 != -1 ? jVar2.c(context, iN4) : null;
        int iN5 = x0VarU.n(a.a.j.o0, -1);
        Drawable drawableC4 = iN5 != -1 ? jVar2.c(context, iN5) : null;
        int iN6 = x0VarU.n(a.a.j.s0, -1);
        Drawable drawableC5 = iN6 != -1 ? jVar2.c(context, iN6) : null;
        int iN7 = x0VarU.n(a.a.j.p0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? jVar2.c(context, iN7) : null);
        int i24 = a.a.j.t0;
        if (x0VarU.s(i24)) {
            androidx.core.widget.i.g(this.f1546a, x0VarU.c(i24));
        }
        int i25 = a.a.j.u0;
        if (x0VarU.s(i25)) {
            i3 = -1;
            androidx.core.widget.i.h(this.f1546a, f0.d(x0VarU.k(i25, -1), null));
        } else {
            i3 = -1;
        }
        int iF = x0VarU.f(a.a.j.w0, i3);
        int iF2 = x0VarU.f(a.a.j.x0, i3);
        int iF3 = x0VarU.f(a.a.j.y0, i3);
        x0VarU.w();
        if (iF != i3) {
            androidx.core.widget.i.j(this.f1546a, iF);
        }
        if (iF2 != i3) {
            androidx.core.widget.i.k(this.f1546a, iF2);
        }
        if (iF3 != i3) {
            androidx.core.widget.i.l(this.f1546a, iF3);
        }
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (a.g.l.v.S(textView)) {
                    textView.post(new b(textView, typeface, this.j));
                } else {
                    textView.setTypeface(typeface, this.j);
                }
            }
        }
    }

    void o(boolean z, int i, int i2, int i3, int i4) {
        if (androidx.core.widget.b.f1779a) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i) {
        String strO;
        ColorStateList colorStateListC;
        ColorStateList colorStateListC2;
        ColorStateList colorStateListC3;
        x0 x0VarT = x0.t(context, i, a.a.j.J2);
        int i2 = a.a.j.U2;
        if (x0VarT.s(i2)) {
            s(x0VarT.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = a.a.j.N2;
            if (x0VarT.s(i4) && (colorStateListC3 = x0VarT.c(i4)) != null) {
                this.f1546a.setTextColor(colorStateListC3);
            }
            int i5 = a.a.j.P2;
            if (x0VarT.s(i5) && (colorStateListC2 = x0VarT.c(i5)) != null) {
                this.f1546a.setLinkTextColor(colorStateListC2);
            }
            int i6 = a.a.j.O2;
            if (x0VarT.s(i6) && (colorStateListC = x0VarT.c(i6)) != null) {
                this.f1546a.setHintTextColor(colorStateListC);
            }
        }
        int i7 = a.a.j.K2;
        if (x0VarT.s(i7) && x0VarT.f(i7, -1) == 0) {
            this.f1546a.setTextSize(0, 0.0f);
        }
        C(context, x0VarT);
        if (i3 >= 26) {
            int i8 = a.a.j.T2;
            if (x0VarT.s(i8) && (strO = x0VarT.o(i8)) != null) {
                this.f1546a.setFontVariationSettings(strO);
            }
        }
        x0VarT.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f1546a.setTypeface(typeface, this.j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        a.g.l.f0.a.f(editorInfo, textView.getText());
    }

    void s(boolean z) {
        this.f1546a.setAllCaps(z);
    }

    void t(int i, int i2, int i3, int i4) {
        this.i.u(i, i2, i3, i4);
    }

    void u(int[] iArr, int i) {
        this.i.v(iArr, i);
    }

    void v(int i) {
        this.i.w(i);
    }

    void w(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.f1504a = colorStateList;
        v0Var.f1507d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new v0();
        }
        v0 v0Var = this.h;
        v0Var.f1505b = mode;
        v0Var.f1506c = mode != null;
        z();
    }
}
