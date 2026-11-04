package a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {
    private static final String[] L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property<Drawable, PointF> M = new b(PointF.class, "boundsOrigin");
    private static final Property<k, PointF> N = new C0034c(PointF.class, "topLeft");
    private static final Property<k, PointF> O = new d(PointF.class, "bottomRight");
    private static final Property<View, PointF> P = new e(PointF.class, "bottomRight");
    private static final Property<View, PointF> Q = new f(PointF.class, "topLeft");
    private static final Property<View, PointF> R = new g(PointF.class, "position");
    private static a.q.k S = new a.q.k();
    private int[] T = new int[2];
    private boolean U = false;
    private boolean V = false;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ BitmapDrawable f814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f816d;

        a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f2) {
            this.f813a = viewGroup;
            this.f814b = bitmapDrawable;
            this.f815c = view;
            this.f816d = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            c0.b(this.f813a).d(this.f814b);
            c0.g(this.f815c, this.f816d);
        }
    }

    static class b extends Property<Drawable, PointF> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f818a;

        b(Class cls, String str) {
            super(cls, str);
            this.f818a = new Rect();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f818a);
            Rect rect = this.f818a;
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f818a);
            this.f818a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f818a);
        }
    }

    /* JADX INFO: renamed from: a.q.c$c, reason: collision with other inner class name */
    static class C0034c extends Property<k, PointF> {
        C0034c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.c(pointF);
        }
    }

    static class d extends Property<k, PointF> {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(k kVar) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, PointF pointF) {
            kVar.a(pointF);
        }
    }

    static class e extends Property<View, PointF> {
        e(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c0.f(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    static class f extends Property<View, PointF> {
        f(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            c0.f(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    static class g extends Property<View, PointF> {
        g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, PointF pointF) {
            int iRound = Math.round(pointF.x);
            int iRound2 = Math.round(pointF.y);
            c0.f(view, iRound, iRound2, view.getWidth() + iRound, view.getHeight() + iRound2);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f819a;
        private k mViewBounds;

        h(k kVar) {
            this.f819a = kVar;
            this.mViewBounds = kVar;
        }
    }

    class i extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f826f;
        final /* synthetic */ int g;

        i(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f822b = view;
            this.f823c = rect;
            this.f824d = i;
            this.f825e = i2;
            this.f826f = i3;
            this.g = i4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f821a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f821a) {
                return;
            }
            a.g.l.v.u0(this.f822b, this.f823c);
            c0.f(this.f822b, this.f824d, this.f825e, this.f826f, this.g);
        }
    }

    class j extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f827a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f828b;

        j(ViewGroup viewGroup) {
            this.f828b = viewGroup;
        }

        @Override // a.q.n, a.q.m.f
        public void a(m mVar) {
            x.c(this.f828b, false);
        }

        @Override // a.q.n, a.q.m.f
        public void b(m mVar) {
            x.c(this.f828b, true);
        }

        @Override // a.q.n, a.q.m.f
        public void d(m mVar) {
            x.c(this.f828b, false);
            this.f827a = true;
        }

        @Override // a.q.m.f
        public void e(m mVar) {
            if (!this.f827a) {
                x.c(this.f828b, false);
            }
            mVar.P(this);
        }
    }

    private static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f832c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f833d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f834e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f835f;
        private int g;

        k(View view) {
            this.f834e = view;
        }

        private void b() {
            c0.f(this.f834e, this.f830a, this.f831b, this.f832c, this.f833d);
            this.f835f = 0;
            this.g = 0;
        }

        void a(PointF pointF) {
            this.f832c = Math.round(pointF.x);
            this.f833d = Math.round(pointF.y);
            int i = this.g + 1;
            this.g = i;
            if (this.f835f == i) {
                b();
            }
        }

        void c(PointF pointF) {
            this.f830a = Math.round(pointF.x);
            this.f831b = Math.round(pointF.y);
            int i = this.f835f + 1;
            this.f835f = i;
            if (i == this.g) {
                b();
            }
        }
    }

    private void c0(s sVar) {
        View view = sVar.f920b;
        if (!a.g.l.v.T(view) && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        sVar.f919a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        sVar.f919a.put("android:changeBounds:parent", sVar.f920b.getParent());
        if (this.V) {
            sVar.f920b.getLocationInWindow(this.T);
            sVar.f919a.put("android:changeBounds:windowX", Integer.valueOf(this.T[0]));
            sVar.f919a.put("android:changeBounds:windowY", Integer.valueOf(this.T[1]));
        }
        if (this.U) {
            sVar.f919a.put("android:changeBounds:clip", a.g.l.v.u(view));
        }
    }

    private boolean d0(View view, View view2) {
        if (!this.V) {
            return true;
        }
        s sVarT = t(view, true);
        if (sVarT == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == sVarT.f920b) {
            return true;
        }
        return false;
    }

    @Override // a.q.m
    public String[] D() {
        return L;
    }

    @Override // a.q.m
    public void g(s sVar) {
        c0(sVar);
    }

    @Override // a.q.m
    public void j(s sVar) {
        c0(sVar);
    }

    @Override // a.q.m
    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        int i2;
        View view;
        ObjectAnimator objectAnimatorA;
        int i3;
        Rect rect;
        ObjectAnimator objectAnimator;
        Animator animatorC;
        Path pathA;
        Property<View, PointF> property;
        if (sVar == null || sVar2 == null) {
            return null;
        }
        Map<String, Object> map = sVar.f919a;
        Map<String, Object> map2 = sVar2.f919a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = sVar2.f920b;
        if (!d0(viewGroup2, viewGroup3)) {
            int iIntValue = ((Integer) sVar.f919a.get("android:changeBounds:windowX")).intValue();
            int iIntValue2 = ((Integer) sVar.f919a.get("android:changeBounds:windowY")).intValue();
            int iIntValue3 = ((Integer) sVar2.f919a.get("android:changeBounds:windowX")).intValue();
            int iIntValue4 = ((Integer) sVar2.f919a.get("android:changeBounds:windowY")).intValue();
            if (iIntValue == iIntValue3 && iIntValue2 == iIntValue4) {
                return null;
            }
            viewGroup.getLocationInWindow(this.T);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
            view2.draw(new Canvas(bitmapCreateBitmap));
            BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
            float fC = c0.c(view2);
            c0.g(view2, 0.0f);
            c0.b(viewGroup).b(bitmapDrawable);
            a.q.g gVarV = v();
            int[] iArr = this.T;
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, a.q.i.a(M, gVarV.a(iIntValue - iArr[0], iIntValue2 - iArr[1], iIntValue3 - iArr[0], iIntValue4 - iArr[1])));
            objectAnimatorOfPropertyValuesHolder.addListener(new a(viewGroup, bitmapDrawable, view2, fC));
            return objectAnimatorOfPropertyValuesHolder;
        }
        Rect rect2 = (Rect) sVar.f919a.get("android:changeBounds:bounds");
        Rect rect3 = (Rect) sVar2.f919a.get("android:changeBounds:bounds");
        int i4 = rect2.left;
        int i5 = rect3.left;
        int i6 = rect2.top;
        int i7 = rect3.top;
        int i8 = rect2.right;
        int i9 = rect3.right;
        int i10 = rect2.bottom;
        int i11 = rect3.bottom;
        int i12 = i8 - i4;
        int i13 = i10 - i6;
        int i14 = i9 - i5;
        int i15 = i11 - i7;
        Rect rect4 = (Rect) sVar.f919a.get("android:changeBounds:clip");
        Rect rect5 = (Rect) sVar2.f919a.get("android:changeBounds:clip");
        if ((i12 == 0 || i13 == 0) && (i14 == 0 || i15 == 0)) {
            i2 = 0;
        } else {
            i2 = (i4 == i5 && i6 == i7) ? 0 : 1;
            if (i8 != i9 || i10 != i11) {
                i2++;
            }
        }
        if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
            i2++;
        }
        if (i2 <= 0) {
            return null;
        }
        if (this.U) {
            c0.f(view, i4, i6, Math.max(i12, i14) + i4, Math.max(i13, i15) + i6);
            if (i4 == i5 && i6 == i7) {
                objectAnimatorA = null;
            } else {
                view = view2;
                objectAnimatorA = a.q.f.a(view, R, v().a(i4, i6, i5, i7));
            }
            if (rect4 == null) {
                i3 = 0;
                rect = new Rect(0, 0, i12, i13);
            } else {
                i3 = 0;
                rect = rect4;
            }
            Rect rect6 = rect5 == null ? new Rect(i3, i3, i14, i15) : rect5;
            if (rect.equals(rect6)) {
                objectAnimator = null;
            } else {
                a.g.l.v.u0(view, rect);
                a.q.k kVar = S;
                Object[] objArr = new Object[2];
                objArr[i3] = rect;
                objArr[1] = rect6;
                ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(view, "clipBounds", kVar, objArr);
                objectAnimatorOfObject.addListener(new i(view, rect5, i5, i7, i9, i11));
                objectAnimator = objectAnimatorOfObject;
            }
            animatorC = r.c(objectAnimatorA, objectAnimator);
        } else {
            c0.f(view, i4, i6, i8, i10);
            if (i2 == 2) {
                if (i12 == i14 && i13 == i15) {
                    pathA = v().a(i4, i6, i5, i7);
                    property = R;
                } else {
                    k kVar2 = new k(view);
                    ObjectAnimator objectAnimatorA2 = a.q.f.a(kVar2, N, v().a(i4, i6, i5, i7));
                    ObjectAnimator objectAnimatorA3 = a.q.f.a(kVar2, O, v().a(i8, i10, i9, i11));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                    animatorSet.addListener(new h(kVar2));
                    animatorC = animatorSet;
                }
            } else if (i4 == i5 && i6 == i7) {
                pathA = v().a(i8, i10, i9, i11);
                property = P;
            } else {
                pathA = v().a(i4, i6, i5, i7);
                property = Q;
            }
            animatorC = a.q.f.a(view, property, pathA);
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            x.c(viewGroup4, true);
            a(new j(viewGroup4));
        }
        return animatorC;
    }
}
