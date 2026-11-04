package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k<?> f1923a;

    private i(k<?> kVar) {
        this.f1923a = kVar;
    }

    public static i b(k<?> kVar) {
        return new i((k) a.g.k.h.f(kVar, "callbacks == null"));
    }

    public void a(Fragment fragment) {
        k<?> kVar = this.f1923a;
        kVar.f1929f.j(kVar, kVar, fragment);
    }

    public void c() {
        this.f1923a.f1929f.y();
    }

    public void d(Configuration configuration) {
        this.f1923a.f1929f.A(configuration);
    }

    public boolean e(MenuItem menuItem) {
        return this.f1923a.f1929f.B(menuItem);
    }

    public void f() {
        this.f1923a.f1929f.C();
    }

    public boolean g(Menu menu, MenuInflater menuInflater) {
        return this.f1923a.f1929f.D(menu, menuInflater);
    }

    public void h() {
        this.f1923a.f1929f.E();
    }

    public void i() {
        this.f1923a.f1929f.G();
    }

    public void j(boolean z) {
        this.f1923a.f1929f.H(z);
    }

    public boolean k(MenuItem menuItem) {
        return this.f1923a.f1929f.J(menuItem);
    }

    public void l(Menu menu) {
        this.f1923a.f1929f.K(menu);
    }

    public void m() {
        this.f1923a.f1929f.M();
    }

    public void n(boolean z) {
        this.f1923a.f1929f.N(z);
    }

    public boolean o(Menu menu) {
        return this.f1923a.f1929f.O(menu);
    }

    public void p() {
        this.f1923a.f1929f.Q();
    }

    public void q() {
        this.f1923a.f1929f.R();
    }

    public void r() {
        this.f1923a.f1929f.T();
    }

    public boolean s() {
        return this.f1923a.f1929f.a0(true);
    }

    public n t() {
        return this.f1923a.f1929f;
    }

    public void u() {
        this.f1923a.f1929f.P0();
    }

    public View v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f1923a.f1929f.t0().onCreateView(view, str, context, attributeSet);
    }

    public void w(Parcelable parcelable) {
        k<?> kVar = this.f1923a;
        if (!(kVar instanceof androidx.lifecycle.s)) {
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
        kVar.f1929f.b1(parcelable);
    }

    public Parcelable x() {
        return this.f1923a.f1929f.d1();
    }
}
