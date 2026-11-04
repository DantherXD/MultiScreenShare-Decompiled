package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<b> f4123a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f4124b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ValueAnimator f4125c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Animator.AnimatorListener f4126d = new a();

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.f4125c == animator) {
                fVar.f4125c = null;
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f4128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ValueAnimator f4129b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f4128a = iArr;
            this.f4129b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f4125c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4125c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f4129b;
        this.f4125c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f4126d);
        this.f4123a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f4125c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f4125c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f4123a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f4123a.get(i);
            if (StateSet.stateSetMatches(bVar.f4128a, iArr)) {
                break;
            } else {
                i++;
            }
        }
        b bVar2 = this.f4124b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f4124b = bVar;
        if (bVar != null) {
            e(bVar);
        }
    }
}
