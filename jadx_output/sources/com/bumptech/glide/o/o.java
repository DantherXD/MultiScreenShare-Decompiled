package com.bumptech.glide.o;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class o extends Fragment {
    private final com.bumptech.glide.o.a c0;
    private final m d0;
    private final Set<o> e0;
    private o f0;
    private com.bumptech.glide.k g0;
    private Fragment h0;

    private class a implements m {
        a() {
        }

        @Override // com.bumptech.glide.o.m
        public Set<com.bumptech.glide.k> a() {
            Set<o> setD1 = o.this.D1();
            HashSet hashSet = new HashSet(setD1.size());
            for (o oVar : setD1) {
                if (oVar.G1() != null) {
                    hashSet.add(oVar.G1());
                }
            }
            return hashSet;
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        this(new com.bumptech.glide.o.a());
    }

    @SuppressLint({"ValidFragment"})
    public o(com.bumptech.glide.o.a aVar) {
        this.d0 = new a();
        this.e0 = new HashSet();
        this.c0 = aVar;
    }

    private void C1(o oVar) {
        this.e0.add(oVar);
    }

    private Fragment F1() {
        Fragment fragmentD = D();
        return fragmentD != null ? fragmentD : this.h0;
    }

    private static androidx.fragment.app.n I1(Fragment fragment) {
        while (fragment.D() != null) {
            fragment = fragment.D();
        }
        return fragment.y();
    }

    private boolean J1(Fragment fragment) {
        Fragment fragmentF1 = F1();
        while (true) {
            Fragment fragmentD = fragment.D();
            if (fragmentD == null) {
                return false;
            }
            if (fragmentD.equals(fragmentF1)) {
                return true;
            }
            fragment = fragment.D();
        }
    }

    private void K1(Context context, androidx.fragment.app.n nVar) {
        O1();
        o oVarJ = com.bumptech.glide.c.c(context).k().j(context, nVar);
        this.f0 = oVarJ;
        if (equals(oVarJ)) {
            return;
        }
        this.f0.C1(this);
    }

    private void L1(o oVar) {
        this.e0.remove(oVar);
    }

    private void O1() {
        o oVar = this.f0;
        if (oVar != null) {
            oVar.L1(this);
            this.f0 = null;
        }
    }

    Set<o> D1() {
        o oVar = this.f0;
        if (oVar == null) {
            return Collections.emptySet();
        }
        if (equals(oVar)) {
            return Collections.unmodifiableSet(this.e0);
        }
        HashSet hashSet = new HashSet();
        for (o oVar2 : this.f0.D1()) {
            if (J1(oVar2.F1())) {
                hashSet.add(oVar2);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    com.bumptech.glide.o.a E1() {
        return this.c0;
    }

    public com.bumptech.glide.k G1() {
        return this.g0;
    }

    public m H1() {
        return this.d0;
    }

    @Override // androidx.fragment.app.Fragment
    public void I0() {
        super.I0();
        this.c0.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void J0() {
        super.J0();
        this.c0.e();
    }

    void M1(Fragment fragment) {
        androidx.fragment.app.n nVarI1;
        this.h0 = fragment;
        if (fragment == null || fragment.q() == null || (nVarI1 = I1(fragment)) == null) {
            return;
        }
        K1(fragment.q(), nVarI1);
    }

    public void N1(com.bumptech.glide.k kVar) {
        this.g0 = kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Context context) {
        super.i0(context);
        androidx.fragment.app.n nVarI1 = I1(this);
        if (nVarI1 == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
            }
        } else {
            try {
                K1(q(), nVarI1);
            } catch (IllegalStateException e2) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e2);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void q0() {
        super.q0();
        this.c0.c();
        O1();
    }

    @Override // androidx.fragment.app.Fragment
    public void t0() {
        super.t0();
        this.h0 = null;
        O1();
    }

    @Override // androidx.fragment.app.Fragment
    public String toString() {
        return super.toString() + "{parent=" + F1() + "}";
    }
}
