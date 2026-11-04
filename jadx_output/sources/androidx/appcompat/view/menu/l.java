package androidx.appcompat.view.menu;

import a.g.l.v;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f1238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f1239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f1240d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f1241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f1242f;
    private int g;
    private boolean h;
    private m.a i;
    private k j;
    private PopupWindow.OnDismissListener k;
    private final PopupWindow.OnDismissListener l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            l.this.e();
        }
    }

    public l(Context context, g gVar, View view, boolean z, int i) {
        this(context, gVar, view, z, i, 0);
    }

    public l(Context context, g gVar, View view, boolean z, int i, int i2) {
        this.g = 8388611;
        this.l = new a();
        this.f1237a = context;
        this.f1238b = gVar;
        this.f1242f = view;
        this.f1239c = z;
        this.f1240d = i;
        this.f1241e = i2;
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f1237a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 17) {
            defaultDisplay.getRealSize(point);
        } else {
            defaultDisplay.getSize(point);
        }
        k dVar = Math.min(point.x, point.y) >= this.f1237a.getResources().getDimensionPixelSize(a.a.d.f15c) ? new d(this.f1237a, this.f1242f, this.f1240d, this.f1241e, this.f1239c) : new q(this.f1237a, this.f1238b, this.f1242f, this.f1240d, this.f1241e, this.f1239c);
        dVar.k(this.f1238b);
        dVar.u(this.l);
        dVar.p(this.f1242f);
        dVar.h(this.i);
        dVar.r(this.h);
        dVar.s(this.g);
        return dVar;
    }

    private void l(int i, int i2, boolean z, boolean z2) {
        k kVarC = c();
        kVarC.v(z2);
        if (z) {
            if ((a.g.l.e.b(this.g, v.C(this.f1242f)) & 7) == 5) {
                i -= this.f1242f.getWidth();
            }
            kVarC.t(i);
            kVarC.w(i2);
            int i3 = (int) ((this.f1237a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarC.q(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        kVarC.g();
    }

    public void b() {
        if (d()) {
            this.j.dismiss();
        }
    }

    public k c() {
        if (this.j == null) {
            this.j = a();
        }
        return this.j;
    }

    public boolean d() {
        k kVar = this.j;
        return kVar != null && kVar.b();
    }

    protected void e() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f1242f = view;
    }

    public void g(boolean z) {
        this.h = z;
        k kVar = this.j;
        if (kVar != null) {
            kVar.r(z);
        }
    }

    public void h(int i) {
        this.g = i;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.k = onDismissListener;
    }

    public void j(m.a aVar) {
        this.i = aVar;
        k kVar = this.j;
        if (kVar != null) {
            kVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f1242f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i, int i2) {
        if (d()) {
            return true;
        }
        if (this.f1242f == null) {
            return false;
        }
        l(i, i2, true, true);
        return true;
    }
}
