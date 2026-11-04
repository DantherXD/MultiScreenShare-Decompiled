package c.b.a.b.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f2770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f2771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f2772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f2773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f2774e;

    public i(long j, long j2) {
        this.f2770a = 0L;
        this.f2771b = 300L;
        this.f2772c = null;
        this.f2773d = 0;
        this.f2774e = 1;
        this.f2770a = j;
        this.f2771b = j2;
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f2770a = 0L;
        this.f2771b = 300L;
        this.f2772c = null;
        this.f2773d = 0;
        this.f2774e = 1;
        this.f2770a = j;
        this.f2771b = j2;
        this.f2772c = timeInterpolator;
    }

    static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f2773d = valueAnimator.getRepeatCount();
        iVar.f2774e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f2756b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f2757c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f2758d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f2770a;
    }

    public long d() {
        return this.f2771b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f2772c;
        return timeInterpolator != null ? timeInterpolator : a.f2756b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.f2773d;
    }

    public int h() {
        return this.f2774e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
