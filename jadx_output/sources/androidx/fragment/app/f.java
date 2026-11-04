package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
class f {

    class a implements a.g.h.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f1901a;

        a(Fragment fragment) {
            this.f1901a = fragment;
        }

        @Override // a.g.h.b.a
        public void a() {
            if (this.f1901a.m() != null) {
                View viewM = this.f1901a.m();
                this.f1901a.q1(null);
                viewM.clearAnimation();
            }
            this.f1901a.s1(null);
        }
    }

    class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f1903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x.g f1904c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.g.h.b f1905d;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f1903b.m() != null) {
                    b.this.f1903b.q1(null);
                    b bVar = b.this;
                    bVar.f1904c.a(bVar.f1903b, bVar.f1905d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, x.g gVar, a.g.h.b bVar) {
            this.f1902a = viewGroup;
            this.f1903b = fragment;
            this.f1904c = gVar;
            this.f1905d = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1902a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1909c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ x.g f1910d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a.g.h.b f1911e;

        c(ViewGroup viewGroup, View view, Fragment fragment, x.g gVar, a.g.h.b bVar) {
            this.f1907a = viewGroup;
            this.f1908b = view;
            this.f1909c = fragment;
            this.f1910d = gVar;
            this.f1911e = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1907a.endViewTransition(this.f1908b);
            Animator animatorN = this.f1909c.n();
            this.f1909c.s1(null);
            if (animatorN == null || this.f1907a.indexOfChild(this.f1908b) >= 0) {
                return;
            }
            this.f1910d.a(this.f1909c, this.f1911e);
        }
    }

    static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f1912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f1913b;

        d(Animator animator) {
            this.f1912a = null;
            this.f1913b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }

        d(Animation animation) {
            this.f1912a = animation;
            this.f1913b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }
    }

    static class e extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ViewGroup f1914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final View f1915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f1917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f1918f;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1918f = true;
            this.f1914b = viewGroup;
            this.f1915c = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f1918f = true;
            if (this.f1916d) {
                return !this.f1917e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1916d = true;
                a.g.l.t.a(this.f1914b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f1918f = true;
            if (this.f1916d) {
                return !this.f1917e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f1916d = true;
                a.g.l.t.a(this.f1914b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1916d || !this.f1918f) {
                this.f1914b.endViewTransition(this.f1915c);
                this.f1917e = true;
            } else {
                this.f1918f = false;
                this.f1914b.post(this);
            }
        }
    }

    static void a(Fragment fragment, d dVar, x.g gVar) {
        View view = fragment.J;
        ViewGroup viewGroup = fragment.I;
        viewGroup.startViewTransition(view);
        a.g.h.b bVar = new a.g.h.b();
        bVar.c(new a(fragment));
        gVar.b(fragment, bVar);
        if (dVar.f1912a != null) {
            e eVar = new e(dVar.f1912a, viewGroup, view);
            fragment.q1(fragment.J);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.J.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f1913b;
        fragment.s1(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.J);
        animator.start();
    }

    private static int b(Fragment fragment, boolean z, boolean z2) {
        if (z2) {
            return z ? fragment.G() : fragment.H();
        }
        return z ? fragment.r() : fragment.u();
    }

    static d c(Context context, Fragment fragment, boolean z, boolean z2) {
        int iC = fragment.C();
        int iB = b(fragment, z, z2);
        boolean z3 = false;
        fragment.r1(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.I;
        if (viewGroup != null) {
            int i = a.k.b.f769c;
            if (viewGroup.getTag(i) != null) {
                fragment.I.setTag(i, null);
            }
        }
        ViewGroup viewGroup2 = fragment.I;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationM0 = fragment.m0(iC, z, iB);
        if (animationM0 != null) {
            return new d(animationM0);
        }
        Animator animatorN0 = fragment.n0(iC, z, iB);
        if (animatorN0 != null) {
            return new d(animatorN0);
        }
        if (iB == 0 && iC != 0) {
            iB = d(iC, z);
        }
        if (iB != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iB));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iB);
                    if (animatorLoadAnimator != null) {
                        return new d(animatorLoadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (zEquals) {
                        throw e3;
                    }
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iB);
                    if (animationLoadAnimation2 != null) {
                        return new d(animationLoadAnimation2);
                    }
                }
            }
        }
        return null;
    }

    private static int d(int i, boolean z) {
        if (i == 4097) {
            return z ? a.k.a.f765e : a.k.a.f766f;
        }
        if (i == 4099) {
            return z ? a.k.a.f763c : a.k.a.f764d;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? a.k.a.f761a : a.k.a.f762b;
    }
}
