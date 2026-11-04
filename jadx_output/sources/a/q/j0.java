package a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class j0 extends m {
    private static final String[] L = {"android:visibility:visibility", "android:visibility:parent"};
    private int M = 3;

    class a extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f874c;

        a(ViewGroup viewGroup, View view, View view2) {
            this.f872a = viewGroup;
            this.f873b = view;
            this.f874c = view2;
        }

        @Override // a.q.n, a.q.m.f
        public void a(m mVar) {
            x.a(this.f872a).c(this.f873b);
        }

        @Override // a.q.n, a.q.m.f
        public void b(m mVar) {
            if (this.f873b.getParent() == null) {
                x.a(this.f872a).a(this.f873b);
            } else {
                j0.this.f();
            }
        }

        @Override // a.q.m.f
        public void e(m mVar) {
            this.f874c.setTag(j.f869b, null);
            x.a(this.f872a).c(this.f873b);
            mVar.P(this);
        }
    }

    private static class b extends AnimatorListenerAdapter implements m.f, a.q.a.InterfaceC0033a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ViewGroup f878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f879d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f880e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f881f = false;

        b(View view, int i, boolean z) {
            this.f876a = view;
            this.f877b = i;
            this.f878c = (ViewGroup) view.getParent();
            this.f879d = z;
            g(true);
        }

        private void f() {
            if (!this.f881f) {
                c0.h(this.f876a, this.f877b);
                ViewGroup viewGroup = this.f878c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        private void g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f879d || this.f880e == z || (viewGroup = this.f878c) == null) {
                return;
            }
            this.f880e = z;
            x.c(viewGroup, z);
        }

        @Override // a.q.m.f
        public void a(m mVar) {
            g(false);
        }

        @Override // a.q.m.f
        public void b(m mVar) {
            g(true);
        }

        @Override // a.q.m.f
        public void c(m mVar) {
        }

        @Override // a.q.m.f
        public void d(m mVar) {
        }

        @Override // a.q.m.f
        public void e(m mVar) {
            f();
            mVar.P(this);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f881f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.q.a.InterfaceC0033a
        public void onAnimationPause(Animator animator) {
            if (this.f881f) {
                return;
            }
            c0.h(this.f876a, this.f877b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener, a.q.a.InterfaceC0033a
        public void onAnimationResume(Animator animator) {
            if (this.f881f) {
                return;
            }
            c0.h(this.f876a, 0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f883b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f884c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f885d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ViewGroup f886e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        ViewGroup f887f;

        c() {
        }
    }

    private void c0(s sVar) {
        sVar.f919a.put("android:visibility:visibility", Integer.valueOf(sVar.f920b.getVisibility()));
        sVar.f919a.put("android:visibility:parent", sVar.f920b.getParent());
        int[] iArr = new int[2];
        sVar.f920b.getLocationOnScreen(iArr);
        sVar.f919a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0093  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0075, code lost:
    
        if (r8 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r6.f886e == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0091, code lost:
    
        if (r6.f884c == 0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private a.q.j0.c d0(a.q.s r7, a.q.s r8) {
        /*
            r6 = this;
            a.q.j0$c r6 = new a.q.j0$c
            r6.<init>()
            r0 = 0
            r6.f882a = r0
            r6.f883b = r0
            java.lang.String r1 = "android:visibility:parent"
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:visibility"
            if (r7 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.f919a
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L33
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.f919a
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.f884c = r5
            java.util.Map<java.lang.String, java.lang.Object> r5 = r7.f919a
            java.lang.Object r5 = r5.get(r1)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r6.f886e = r5
            goto L37
        L33:
            r6.f884c = r3
            r6.f886e = r2
        L37:
            if (r8 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r8.f919a
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L5a
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.f919a
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r6.f885d = r2
            java.util.Map<java.lang.String, java.lang.Object> r2 = r8.f919a
            java.lang.Object r1 = r2.get(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r6.f887f = r1
            goto L5e
        L5a:
            r6.f885d = r3
            r6.f887f = r2
        L5e:
            r1 = 1
            if (r7 == 0) goto L82
            if (r8 == 0) goto L82
            int r7 = r6.f884c
            int r8 = r6.f885d
            if (r7 != r8) goto L70
            android.view.ViewGroup r2 = r6.f886e
            android.view.ViewGroup r3 = r6.f887f
            if (r2 != r3) goto L70
            return r6
        L70:
            if (r7 == r8) goto L78
            if (r7 != 0) goto L75
            goto L93
        L75:
            if (r8 != 0) goto L96
            goto L88
        L78:
            android.view.ViewGroup r7 = r6.f887f
            if (r7 != 0) goto L7d
            goto L93
        L7d:
            android.view.ViewGroup r7 = r6.f886e
            if (r7 != 0) goto L96
            goto L88
        L82:
            if (r7 != 0) goto L8d
            int r7 = r6.f885d
            if (r7 != 0) goto L8d
        L88:
            r6.f883b = r1
        L8a:
            r6.f882a = r1
            goto L96
        L8d:
            if (r8 != 0) goto L96
            int r7 = r6.f884c
            if (r7 != 0) goto L96
        L93:
            r6.f883b = r0
            goto L8a
        L96:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.q.j0.d0(a.q.s, a.q.s):a.q.j0$c");
    }

    @Override // a.q.m
    public String[] D() {
        return L;
    }

    @Override // a.q.m
    public boolean F(s sVar, s sVar2) {
        if (sVar == null && sVar2 == null) {
            return false;
        }
        if (sVar != null && sVar2 != null && sVar2.f919a.containsKey("android:visibility:visibility") != sVar.f919a.containsKey("android:visibility:visibility")) {
            return false;
        }
        c cVarD0 = d0(sVar, sVar2);
        if (cVarD0.f882a) {
            return cVarD0.f884c == 0 || cVarD0.f885d == 0;
        }
        return false;
    }

    public abstract Animator e0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    public Animator f0(ViewGroup viewGroup, s sVar, int i, s sVar2, int i2) {
        if ((this.M & 1) != 1 || sVar2 == null) {
            return null;
        }
        if (sVar == null) {
            View view = (View) sVar2.f920b.getParent();
            if (d0(t(view, false), E(view, false)).f882a) {
                return null;
            }
        }
        return e0(viewGroup, sVar2.f920b, sVar, sVar2);
    }

    @Override // a.q.m
    public void g(s sVar) {
        c0(sVar);
    }

    public abstract Animator g0(ViewGroup viewGroup, View view, s sVar, s sVar2);

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    public Animator h0(ViewGroup viewGroup, s sVar, int i, s sVar2, int i2) {
        View view;
        boolean z;
        boolean z2;
        View view2;
        if ((this.M & 2) != 2 || sVar == null) {
            return null;
        }
        View view3 = sVar.f920b;
        View viewA = sVar2 != null ? sVar2.f920b : null;
        int i3 = j.f869b;
        View view4 = (View) view3.getTag(i3);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else {
            if (viewA == null || viewA.getParent() == null) {
                if (viewA != null) {
                    view = null;
                    z = false;
                } else {
                    viewA = null;
                    view = null;
                    z = true;
                }
            } else if (i2 == 4 || view3 == viewA) {
                view = viewA;
                z = false;
                viewA = null;
            } else {
                viewA = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (d0(E(view5, true), t(view5, true)).f882a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.A) {
                            }
                        } else {
                            viewA = r.a(viewGroup, view3, view5);
                        }
                    }
                    z2 = false;
                    View view6 = view;
                    view4 = viewA;
                    view2 = view6;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                z2 = false;
                View view7 = view;
                view4 = viewA;
                view2 = view7;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            c0.h(view2, 0);
            Animator animatorG0 = g0(viewGroup, view2, sVar, sVar2);
            if (animatorG0 != null) {
                b bVar = new b(view2, i2, true);
                animatorG0.addListener(bVar);
                a.q.a.a(animatorG0, bVar);
                a(bVar);
            } else {
                c0.h(view2, visibility);
            }
            return animatorG0;
        }
        if (!z2) {
            int[] iArr = (int[]) sVar.f919a.get("android:visibility:screenLocation");
            int i4 = iArr[0];
            int i5 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i4 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i5 - iArr2[1]) - view4.getTop());
            x.a(viewGroup).a(view4);
        }
        Animator animatorG1 = g0(viewGroup, view4, sVar, sVar2);
        if (!z2) {
            if (animatorG1 == null) {
                x.a(viewGroup).c(view4);
            } else {
                view3.setTag(i3, view4);
                a(new a(viewGroup, view4, view3));
            }
        }
        return animatorG1;
    }

    public void i0(int i) {
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.M = i;
    }

    @Override // a.q.m
    public void j(s sVar) {
        c0(sVar);
    }

    @Override // a.q.m
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        c cVarD0 = d0(sVar, sVar2);
        if (!cVarD0.f882a) {
            return null;
        }
        if (cVarD0.f886e == null && cVarD0.f887f == null) {
            return null;
        }
        return cVarD0.f883b ? f0(viewGroup, sVar, cVarD0.f884c, sVar2, cVarD0.f885d) : h0(viewGroup, sVar, cVarD0.f884c, sVar2, cVarD0.f885d);
    }
}
