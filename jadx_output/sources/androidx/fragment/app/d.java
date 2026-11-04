package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler c0;
    private boolean l0;
    private Dialog n0;
    private boolean o0;
    private boolean p0;
    private boolean q0;
    private Runnable d0 = new a();
    private DialogInterface.OnCancelListener e0 = new b();
    private DialogInterface.OnDismissListener f0 = new c();
    private int g0 = 0;
    private int h0 = 0;
    private boolean i0 = true;
    private boolean j0 = true;
    private int k0 = -1;
    private androidx.lifecycle.m<androidx.lifecycle.g> m0 = new C0052d();
    private boolean r0 = false;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d.this.f0.onDismiss(d.this.n0);
        }
    }

    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            if (d.this.n0 != null) {
                d dVar = d.this;
                dVar.onCancel(dVar.n0);
            }
        }
    }

    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            if (d.this.n0 != null) {
                d dVar = d.this;
                dVar.onDismiss(dVar.n0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$d, reason: collision with other inner class name */
    class C0052d implements androidx.lifecycle.m<androidx.lifecycle.g> {
        C0052d() {
        }

        @Override // androidx.lifecycle.m
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.g gVar) {
            if (gVar == null || !d.this.j0) {
                return;
            }
            View viewM1 = d.this.m1();
            if (viewM1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (d.this.n0 != null) {
                if (n.E0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + d.this.n0);
                }
                d.this.n0.setContentView(viewM1);
            }
        }
    }

    class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g f1897a;

        e(g gVar) {
            this.f1897a = gVar;
        }

        @Override // androidx.fragment.app.g
        public View g(int i) {
            return this.f1897a.i() ? this.f1897a.g(i) : d.this.K1(i);
        }

        @Override // androidx.fragment.app.g
        public boolean i() {
            return this.f1897a.i() || d.this.L1();
        }
    }

    private void G1(boolean z, boolean z2) {
        if (this.p0) {
            return;
        }
        this.p0 = true;
        this.q0 = false;
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.n0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.c0.getLooper()) {
                    onDismiss(this.n0);
                } else {
                    this.c0.post(this.d0);
                }
            }
        }
        this.o0 = true;
        if (this.k0 >= 0) {
            E().S0(this.k0, 1);
            this.k0 = -1;
            return;
        }
        w wVarL = E().l();
        wVarL.l(this);
        if (z) {
            wVarL.g();
        } else {
            wVarL.f();
        }
    }

    private void M1(Bundle bundle) {
        if (this.j0 && !this.r0) {
            try {
                this.l0 = true;
                Dialog dialogJ1 = J1(bundle);
                this.n0 = dialogJ1;
                if (this.j0) {
                    O1(dialogJ1, this.g0);
                    Context contextQ = q();
                    if (contextQ instanceof Activity) {
                        this.n0.setOwnerActivity((Activity) contextQ);
                    }
                    this.n0.setCancelable(this.i0);
                    this.n0.setOnCancelListener(this.e0);
                    this.n0.setOnDismissListener(this.f0);
                    this.r0 = true;
                } else {
                    this.n0 = null;
                }
            } finally {
                this.l0 = false;
            }
        }
    }

    public void F1() {
        G1(false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void H0(Bundle bundle) {
        super.H0(bundle);
        Dialog dialog = this.n0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.g0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.h0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.i0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.j0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.k0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public Dialog H1() {
        return this.n0;
    }

    @Override // androidx.fragment.app.Fragment
    public void I0() {
        super.I0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = false;
            dialog.show();
            View decorView = this.n0.getWindow().getDecorView();
            androidx.lifecycle.t.a(decorView, this);
            androidx.lifecycle.u.a(decorView, this);
            androidx.savedstate.d.a(decorView, this);
        }
    }

    public int I1() {
        return this.h0;
    }

    @Override // androidx.fragment.app.Fragment
    public void J0() {
        super.J0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog J1(Bundle bundle) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(l1(), I1());
    }

    View K1(int i) {
        Dialog dialog = this.n0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void L0(Bundle bundle) {
        Bundle bundle2;
        super.L0(bundle);
        if (this.n0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.n0.onRestoreInstanceState(bundle2);
    }

    boolean L1() {
        return this.r0;
    }

    public final Dialog N1() {
        Dialog dialogH1 = H1();
        if (dialogH1 != null) {
            return dialogH1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void O1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @Override // androidx.fragment.app.Fragment
    void S0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.S0(layoutInflater, viewGroup, bundle);
        if (this.J != null || this.n0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.n0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    g e() {
        return new e(super.e());
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Context context) {
        super.i0(context);
        T().g(this.m0);
        if (this.q0) {
            return;
        }
        this.p0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void l0(Bundle bundle) {
        super.l0(bundle);
        this.c0 = new Handler();
        this.j0 = this.z == 0;
        if (bundle != null) {
            this.g0 = bundle.getInt("android:style", 0);
            this.h0 = bundle.getInt("android:theme", 0);
            this.i0 = bundle.getBoolean("android:cancelable", true);
            this.j0 = bundle.getBoolean("android:showsDialog", this.j0);
            this.k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.o0) {
            return;
        }
        if (n.E0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        G1(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void s0() {
        super.s0();
        Dialog dialog = this.n0;
        if (dialog != null) {
            this.o0 = true;
            dialog.setOnDismissListener(null);
            this.n0.dismiss();
            if (!this.p0) {
                onDismiss(this.n0);
            }
            this.n0 = null;
            this.r0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void t0() {
        super.t0();
        if (!this.q0 && !this.p0) {
            this.p0 = true;
        }
        T().k(this.m0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater u0(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater layoutInflaterU0 = super.u0(bundle);
        if (this.j0 && !this.l0) {
            M1(bundle);
            if (n.E0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.n0;
            return dialog != null ? layoutInflaterU0.cloneInContext(dialog.getContext()) : layoutInflaterU0;
        }
        if (n.E0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.j0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return layoutInflaterU0;
    }
}
