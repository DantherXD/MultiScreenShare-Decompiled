package a.g.l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference<View> f704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Runnable f705b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Runnable f706c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f707d = -1;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a0 f708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f709b;

        a(a0 a0Var, View view) {
            this.f708a = a0Var;
            this.f709b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f708a.c(this.f709b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f708a.a(this.f709b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f708a.b(this.f709b);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c0 f711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f712b;

        b(c0 c0Var, View view) {
            this.f711a = c0Var;
            this.f712b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f711a.a(this.f712b);
        }
    }

    static class c implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        z f714a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f715b;

        c(z zVar) {
            this.f714a = zVar;
        }

        @Override // a.g.l.a0
        @SuppressLint({"WrongConstant"})
        public void a(View view) {
            int i = this.f714a.f707d;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f714a.f707d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f715b) {
                z zVar = this.f714a;
                Runnable runnable = zVar.f706c;
                if (runnable != null) {
                    zVar.f706c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                a0 a0Var = tag instanceof a0 ? (a0) tag : null;
                if (a0Var != null) {
                    a0Var.a(view);
                }
                this.f715b = true;
            }
        }

        @Override // a.g.l.a0
        public void b(View view) {
            this.f715b = false;
            if (this.f714a.f707d > -1) {
                view.setLayerType(2, null);
            }
            z zVar = this.f714a;
            Runnable runnable = zVar.f705b;
            if (runnable != null) {
                zVar.f705b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            a0 a0Var = tag instanceof a0 ? (a0) tag : null;
            if (a0Var != null) {
                a0Var.b(view);
            }
        }

        @Override // a.g.l.a0
        public void c(View view) {
            Object tag = view.getTag(2113929216);
            a0 a0Var = tag instanceof a0 ? (a0) tag : null;
            if (a0Var != null) {
                a0Var.c(view);
            }
        }
    }

    z(View view) {
        this.f704a = new WeakReference<>(view);
    }

    private void g(View view, a0 a0Var) {
        if (a0Var != null) {
            view.animate().setListener(new a(a0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public z a(float f2) {
        View view = this.f704a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void b() {
        View view = this.f704a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long c() {
        View view = this.f704a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public z d(long j) {
        View view = this.f704a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public z e(Interpolator interpolator) {
        View view = this.f704a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public z f(a0 a0Var) {
        View view = this.f704a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, a0Var);
                a0Var = new c(this);
            }
            g(view, a0Var);
        }
        return this;
    }

    public z h(long j) {
        View view = this.f704a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public z i(c0 c0Var) {
        View view = this.f704a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            view.animate().setUpdateListener(c0Var != null ? new b(c0Var, view) : null);
        }
        return this;
    }

    public void j() {
        View view = this.f704a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public z k(float f2) {
        View view = this.f704a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }
}
