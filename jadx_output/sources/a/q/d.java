package a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class d extends j0 {

    class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f839a;

        a(View view) {
            this.f839a = view;
        }

        @Override // a.q.m.f
        public void e(m mVar) {
            c0.g(this.f839a, 1.0f);
            c0.a(this.f839a);
            mVar.P(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f842b = false;

        b(View view) {
            this.f841a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.g(this.f841a, 1.0f);
            if (this.f842b) {
                this.f841a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (a.g.l.v.P(this.f841a) && this.f841a.getLayerType() == 0) {
                this.f842b = true;
                this.f841a.setLayerType(2, null);
            }
        }
    }

    public d(int i) {
        i0(i);
    }

    private Animator j0(View view, float f2, float f3) {
        if (f2 == f3) {
            return null;
        }
        c0.g(view, f2);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, c0.f837b, f3);
        objectAnimatorOfFloat.addListener(new b(view));
        a(new a(view));
        return objectAnimatorOfFloat;
    }

    private static float k0(s sVar, float f2) {
        Float f3;
        return (sVar == null || (f3 = (Float) sVar.f919a.get("android:fade:transitionAlpha")) == null) ? f2 : f3.floatValue();
    }

    @Override // a.q.j0
    public Animator e0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        float fK0 = k0(sVar, 0.0f);
        return j0(view, fK0 != 1.0f ? fK0 : 0.0f, 1.0f);
    }

    @Override // a.q.j0
    public Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2) {
        c0.e(view);
        return j0(view, k0(sVar, 1.0f), 0.0f);
    }

    @Override // a.q.j0, a.q.m
    public void j(s sVar) {
        super.j(sVar);
        sVar.f919a.put("android:fade:transitionAlpha", Float.valueOf(c0.c(sVar.f920b)));
    }
}
