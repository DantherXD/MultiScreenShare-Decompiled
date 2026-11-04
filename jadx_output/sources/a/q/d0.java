package a.q;

import android.annotation.SuppressLint;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class d0 extends i0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f843e = true;

    d0() {
    }

    @Override // a.q.i0
    public void a(View view) {
    }

    @Override // a.q.i0
    @SuppressLint({"NewApi"})
    public float c(View view) {
        if (f843e) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f843e = false;
            }
        }
        return view.getAlpha();
    }

    @Override // a.q.i0
    public void d(View view) {
    }

    @Override // a.q.i0
    @SuppressLint({"NewApi"})
    public void f(View view, float f2) {
        if (f843e) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                f843e = false;
            }
        }
        view.setAlpha(f2);
    }
}
