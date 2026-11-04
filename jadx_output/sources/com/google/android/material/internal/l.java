package com.google.android.material.internal;

import a.g.l.d0;
import a.g.l.q;
import a.g.l.v;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class l {

    static class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f4145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d f4146b;

        a(c cVar, d dVar) {
            this.f4145a = cVar;
            this.f4146b = dVar;
        }

        @Override // a.g.l.q
        public d0 a(View view, d0 d0Var) {
            return this.f4145a.a(view, d0Var, new d(this.f4146b));
        }
    }

    static class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            v.l0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public interface c {
        d0 a(View view, d0 d0Var, d dVar);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f4147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4148b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4149c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4150d;

        public d(int i, int i2, int i3, int i4) {
            this.f4147a = i;
            this.f4148b = i2;
            this.f4149c = i3;
            this.f4150d = i4;
        }

        public d(d dVar) {
            this.f4147a = dVar.f4147a;
            this.f4148b = dVar.f4148b;
            this.f4149c = dVar.f4149c;
            this.f4150d = dVar.f4150d;
        }
    }

    public static void a(View view, c cVar) {
        v.z0(view, new a(cVar, new d(v.I(view), view.getPaddingTop(), v.H(view), view.getPaddingBottom())));
        f(view);
    }

    public static float b(Context context, int i) {
        return TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics());
    }

    public static float c(View view) {
        float fW = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            fW += v.w((View) parent);
        }
        return fW;
    }

    public static boolean d(View view) {
        return v.C(view) == 1;
    }

    public static PorterDuff.Mode e(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void f(View view) {
        if (v.S(view)) {
            v.l0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }
}
