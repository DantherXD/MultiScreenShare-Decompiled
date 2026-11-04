package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f1355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final TextView f1356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WindowManager.LayoutParams f1357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f1358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f1359f;
    private final int[] g;

    b1(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f1357d = layoutParams;
        this.f1358e = new Rect();
        this.f1359f = new int[2];
        this.g = new int[2];
        this.f1354a = context;
        View viewInflate = LayoutInflater.from(context).inflate(a.a.g.s, (ViewGroup) null);
        this.f1355b = viewInflate;
        this.f1356c = (TextView) viewInflate.findViewById(a.a.f.s);
        layoutParams.setTitle(b1.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = a.a.i.f43a;
        layoutParams.flags = 24;
    }

    private void a(View view, int i, int i2, boolean z, WindowManager.LayoutParams layoutParams) {
        int height;
        int i3;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1354a.getResources().getDimensionPixelOffset(a.a.d.m);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1354a.getResources().getDimensionPixelOffset(a.a.d.l);
            height = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            height = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1354a.getResources().getDimensionPixelOffset(z ? a.a.d.o : a.a.d.n);
        View viewB = b(view);
        if (viewB == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        viewB.getWindowVisibleDisplayFrame(this.f1358e);
        Rect rect = this.f1358e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1354a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1358e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        viewB.getLocationOnScreen(this.g);
        view.getLocationOnScreen(this.f1359f);
        int[] iArr = this.f1359f;
        int i4 = iArr[0];
        int[] iArr2 = this.g;
        iArr[0] = i4 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (viewB.getWidth() / 2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.f1355b.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int measuredHeight = this.f1355b.getMeasuredHeight();
        int[] iArr3 = this.f1359f;
        int i5 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i6 = iArr3[1] + height + dimensionPixelOffset3;
        if (!z ? measuredHeight + i6 <= this.f1358e.height() : i5 < 0) {
            layoutParams.y = i5;
        } else {
            layoutParams.y = i6;
        }
    }

    private static View b(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof WindowManager.LayoutParams) && ((WindowManager.LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }

    void c() {
        if (d()) {
            ((WindowManager) this.f1354a.getSystemService("window")).removeView(this.f1355b);
        }
    }

    boolean d() {
        return this.f1355b.getParent() != null;
    }

    void e(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (d()) {
            c();
        }
        this.f1356c.setText(charSequence);
        a(view, i, i2, z, this.f1357d);
        ((WindowManager) this.f1354a.getSystemService("window")).addView(this.f1355b, this.f1357d);
    }
}
