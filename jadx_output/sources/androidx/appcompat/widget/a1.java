package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes.dex */
class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a1 f1340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a1 f1341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final View f1342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final CharSequence f1343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f1344f;
    private final Runnable g = new a();
    private final Runnable h = new b();
    private int i;
    private int j;
    private b1 k;
    private boolean l;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.g(false);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a1.this.c();
        }
    }

    private a1(View view, CharSequence charSequence) {
        this.f1342d = view;
        this.f1343e = charSequence;
        this.f1344f = a.g.l.w.c(ViewConfiguration.get(view.getContext()));
        b();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    private void a() {
        this.f1342d.removeCallbacks(this.g);
    }

    private void b() {
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
    }

    private void d() {
        this.f1342d.postDelayed(this.g, ViewConfiguration.getLongPressTimeout());
    }

    private static void e(a1 a1Var) {
        a1 a1Var2 = f1340b;
        if (a1Var2 != null) {
            a1Var2.a();
        }
        f1340b = a1Var;
        if (a1Var != null) {
            a1Var.d();
        }
    }

    public static void f(View view, CharSequence charSequence) {
        a1 a1Var = f1340b;
        if (a1Var != null && a1Var.f1342d == view) {
            e(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new a1(view, charSequence);
            return;
        }
        a1 a1Var2 = f1341c;
        if (a1Var2 != null && a1Var2.f1342d == view) {
            a1Var2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    private boolean h(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.i) <= this.f1344f && Math.abs(y - this.j) <= this.f1344f) {
            return false;
        }
        this.i = x;
        this.j = y;
        return true;
    }

    void c() {
        if (f1341c == this) {
            f1341c = null;
            b1 b1Var = this.k;
            if (b1Var != null) {
                b1Var.c();
                this.k = null;
                b();
                this.f1342d.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1340b == this) {
            e(null);
        }
        this.f1342d.removeCallbacks(this.h);
    }

    void g(boolean z) {
        long longPressTimeout;
        if (a.g.l.v.S(this.f1342d)) {
            e(null);
            a1 a1Var = f1341c;
            if (a1Var != null) {
                a1Var.c();
            }
            f1341c = this;
            this.l = z;
            b1 b1Var = new b1(this.f1342d.getContext());
            this.k = b1Var;
            b1Var.e(this.f1342d, this.i, this.j, this.l, this.f1343e);
            this.f1342d.addOnAttachStateChangeListener(this);
            if (this.l) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((a.g.l.v.M(this.f1342d) & 1) == 1 ? 3000L : 15000L) - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f1342d.removeCallbacks(this.h);
            this.f1342d.postDelayed(this.h, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.k != null && this.l) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1342d.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                b();
                c();
            }
        } else if (this.f1342d.isEnabled() && this.k == null && h(motionEvent)) {
            e(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.i = view.getWidth() / 2;
        this.j = view.getHeight() / 2;
        g(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        c();
    }
}
