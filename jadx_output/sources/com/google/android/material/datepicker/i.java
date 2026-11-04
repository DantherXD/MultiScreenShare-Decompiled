package com.google.android.material.datepicker;

import a.g.l.v;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.w;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public final class i<S> extends androidx.fragment.app.d {
    static final Object s0 = "CONFIRM_BUTTON_TAG";
    static final Object t0 = "CANCEL_BUTTON_TAG";
    static final Object u0 = "TOGGLE_BUTTON_TAG";
    private com.google.android.material.datepicker.d<S> A0;
    private p<S> B0;
    private com.google.android.material.datepicker.a C0;
    private h<S> D0;
    private int E0;
    private CharSequence F0;
    private boolean G0;
    private int H0;
    private TextView I0;
    private CheckableImageButton J0;
    private c.b.a.b.a0.g K0;
    private Button L0;
    private final LinkedHashSet<j<? super S>> v0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> w0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> x0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> y0 = new LinkedHashSet<>();
    private int z0;

    class a implements View.OnClickListener {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.v0.iterator();
            while (it.hasNext()) {
                ((j) it.next()).a(i.this.b2());
            }
            i.this.F1();
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = i.this.w0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            i.this.F1();
        }
    }

    class c extends o<S> {
        c() {
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s) {
            i.this.i2();
            i.this.L0.setEnabled(i.this.A0.f());
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i.this.L0.setEnabled(i.this.A0.f());
            i.this.J0.toggle();
            i iVar = i.this;
            iVar.j2(iVar.J0);
            i.this.h2();
        }
    }

    private static Drawable X1(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, a.a.k.a.a.d(context, c.b.a.b.e.f2718b));
        stateListDrawable.addState(new int[0], a.a.k.a.a.d(context, c.b.a.b.e.f2719c));
        return stateListDrawable;
    }

    private static int Y1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(c.b.a.b.d.I) + resources.getDimensionPixelOffset(c.b.a.b.d.J) + resources.getDimensionPixelOffset(c.b.a.b.d.H);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(c.b.a.b.d.D);
        int i = m.f4040b;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(c.b.a.b.d.B) * i) + ((i - 1) * resources.getDimensionPixelOffset(c.b.a.b.d.G)) + resources.getDimensionPixelOffset(c.b.a.b.d.z);
    }

    private static int a2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(c.b.a.b.d.A);
        int i = l.m().f4038e;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(c.b.a.b.d.C) * i) + ((i - 1) * resources.getDimensionPixelOffset(c.b.a.b.d.F));
    }

    private int c2(Context context) {
        int i = this.z0;
        return i != 0 ? i : this.A0.c(context);
    }

    private void d2(Context context) {
        this.J0.setTag(u0);
        this.J0.setImageDrawable(X1(context));
        this.J0.setChecked(this.H0 != 0);
        v.o0(this.J0, null);
        j2(this.J0);
        this.J0.setOnClickListener(new d());
    }

    static boolean e2(Context context) {
        return g2(context, R.attr.windowFullscreen);
    }

    static boolean f2(Context context) {
        return g2(context, c.b.a.b.b.u);
    }

    static boolean g2(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(c.b.a.b.x.b.c(context, c.b.a.b.b.r, h.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h2() {
        int iC2 = c2(l1());
        this.D0 = h.T1(this.A0, iC2, this.C0);
        this.B0 = this.J0.isChecked() ? k.E1(this.A0, iC2, this.C0) : this.D0;
        i2();
        w wVarL = p().l();
        wVarL.m(c.b.a.b.f.v, this.B0);
        wVarL.h();
        this.B0.C1(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i2() {
        String strZ1 = Z1();
        this.I0.setContentDescription(String.format(Q(c.b.a.b.i.i), strZ1));
        this.I0.setText(strZ1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j2(CheckableImageButton checkableImageButton) {
        this.J0.setContentDescription(checkableImageButton.getContext().getString(this.J0.isChecked() ? c.b.a.b.i.l : c.b.a.b.i.n));
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void H0(Bundle bundle) {
        super.H0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.A0);
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b(this.C0);
        if (this.D0.P1() != null) {
            bVar.b(this.D0.P1().g);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.E0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.F0);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void I0() {
        super.I0();
        Window window = N1().getWindow();
        if (this.G0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.K0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = K().getDimensionPixelOffset(c.b.a.b.d.E);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.K0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new c.b.a.b.r.a(N1(), rect));
        }
        h2();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void J0() {
        this.B0.D1();
        super.J0();
    }

    @Override // androidx.fragment.app.d
    public final Dialog J1(Bundle bundle) {
        Dialog dialog = new Dialog(l1(), c2(l1()));
        Context context = dialog.getContext();
        this.G0 = e2(context);
        int iC = c.b.a.b.x.b.c(context, c.b.a.b.b.k, i.class.getCanonicalName());
        c.b.a.b.a0.g gVar = new c.b.a.b.a0.g(context, null, c.b.a.b.b.r, c.b.a.b.j.q);
        this.K0 = gVar;
        gVar.M(context);
        this.K0.W(ColorStateList.valueOf(iC));
        this.K0.V(v.w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public String Z1() {
        return this.A0.b(q());
    }

    public final S b2() {
        return this.A0.a();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void l0(Bundle bundle) {
        super.l0(bundle);
        if (bundle == null) {
            bundle = o();
        }
        this.z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.A0 = (com.google.android.material.datepicker.d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.C0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.E0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.F0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.H0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.x0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.y0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) S();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final View p0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.G0 ? c.b.a.b.h.q : c.b.a.b.h.p, viewGroup);
        Context context = viewInflate.getContext();
        if (this.G0) {
            viewInflate.findViewById(c.b.a.b.f.v).setLayoutParams(new LinearLayout.LayoutParams(a2(context), -2));
        } else {
            View viewFindViewById = viewInflate.findViewById(c.b.a.b.f.w);
            View viewFindViewById2 = viewInflate.findViewById(c.b.a.b.f.v);
            viewFindViewById.setLayoutParams(new LinearLayout.LayoutParams(a2(context), -1));
            viewFindViewById2.setMinimumHeight(Y1(l1()));
        }
        TextView textView = (TextView) viewInflate.findViewById(c.b.a.b.f.B);
        this.I0 = textView;
        v.q0(textView, 1);
        this.J0 = (CheckableImageButton) viewInflate.findViewById(c.b.a.b.f.C);
        TextView textView2 = (TextView) viewInflate.findViewById(c.b.a.b.f.D);
        CharSequence charSequence = this.F0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.E0);
        }
        d2(context);
        this.L0 = (Button) viewInflate.findViewById(c.b.a.b.f.f2725c);
        if (this.A0.f()) {
            this.L0.setEnabled(true);
        } else {
            this.L0.setEnabled(false);
        }
        this.L0.setTag(s0);
        this.L0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(c.b.a.b.f.f2723a);
        button.setTag(t0);
        button.setOnClickListener(new b());
        return viewInflate;
    }
}
