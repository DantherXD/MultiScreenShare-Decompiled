package androidx.recyclerview.widget;

import a.g.l.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {
    private static TimeInterpolator h;
    private ArrayList<RecyclerView.e0> i = new ArrayList<>();
    private ArrayList<RecyclerView.e0> j = new ArrayList<>();
    private ArrayList<j> k = new ArrayList<>();
    private ArrayList<i> l = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.e0>> m = new ArrayList<>();
    ArrayList<ArrayList<j>> n = new ArrayList<>();
    ArrayList<ArrayList<i>> o = new ArrayList<>();
    ArrayList<RecyclerView.e0> p = new ArrayList<>();
    ArrayList<RecyclerView.e0> q = new ArrayList<>();
    ArrayList<RecyclerView.e0> r = new ArrayList<>();
    ArrayList<RecyclerView.e0> s = new ArrayList<>();

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2271b;

        a(ArrayList arrayList) {
            this.f2271b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f2271b) {
                c.this.S(jVar.f2305a, jVar.f2306b, jVar.f2307c, jVar.f2308d, jVar.f2309e);
            }
            this.f2271b.clear();
            c.this.n.remove(this.f2271b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2273b;

        b(ArrayList arrayList) {
            this.f2273b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2273b.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f2273b.clear();
            c.this.o.remove(this.f2273b);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c, reason: collision with other inner class name */
    class RunnableC0058c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2275b;

        RunnableC0058c(ArrayList arrayList) {
            this.f2275b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2275b.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.e0) it.next());
            }
            this.f2275b.clear();
            c.this.m.remove(this.f2275b);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f2277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2279c;

        d(RecyclerView.e0 e0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2277a = e0Var;
            this.f2278b = viewPropertyAnimator;
            this.f2279c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2278b.setListener(null);
            this.f2279c.setAlpha(1.0f);
            c.this.G(this.f2277a);
            c.this.r.remove(this.f2277a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f2277a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f2281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f2282b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2283c;

        e(RecyclerView.e0 e0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2281a = e0Var;
            this.f2282b = view;
            this.f2283c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2282b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2283c.setListener(null);
            c.this.A(this.f2281a);
            c.this.p.remove(this.f2281a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f2281a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ RecyclerView.e0 f2285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f2286b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2287c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f2288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2289e;

        f(RecyclerView.e0 e0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2285a = e0Var;
            this.f2286b = i;
            this.f2287c = view;
            this.f2288d = i2;
            this.f2289e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f2286b != 0) {
                this.f2287c.setTranslationX(0.0f);
            }
            if (this.f2288d != 0) {
                this.f2287c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2289e.setListener(null);
            c.this.E(this.f2285a);
            c.this.q.remove(this.f2285a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f2285a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f2291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2293c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2291a = iVar;
            this.f2292b = viewPropertyAnimator;
            this.f2293c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2292b.setListener(null);
            this.f2293c.setAlpha(1.0f);
            this.f2293c.setTranslationX(0.0f);
            this.f2293c.setTranslationY(0.0f);
            c.this.C(this.f2291a.f2299a, true);
            c.this.s.remove(this.f2291a.f2299a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f2291a.f2299a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f2295a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewPropertyAnimator f2296b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f2297c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2295a = iVar;
            this.f2296b = viewPropertyAnimator;
            this.f2297c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2296b.setListener(null);
            this.f2297c.setAlpha(1.0f);
            this.f2297c.setTranslationX(0.0f);
            this.f2297c.setTranslationY(0.0f);
            c.this.C(this.f2295a.f2300b, false);
            c.this.s.remove(this.f2295a.f2300b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f2295a.f2300b, false);
        }
    }

    private static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.e0 f2299a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.e0 f2300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f2304f;

        private i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2) {
            this.f2299a = e0Var;
            this.f2300b = e0Var2;
        }

        i(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i, int i2, int i3, int i4) {
            this(e0Var, e0Var2);
            this.f2301c = i;
            this.f2302d = i2;
            this.f2303e = i3;
            this.f2304f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2299a + ", newHolder=" + this.f2300b + ", fromX=" + this.f2301c + ", fromY=" + this.f2302d + ", toX=" + this.f2303e + ", toY=" + this.f2304f + '}';
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public RecyclerView.e0 f2305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f2306b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f2307c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2308d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2309e;

        j(RecyclerView.e0 e0Var, int i, int i2, int i3, int i4) {
            this.f2305a = e0Var;
            this.f2306b = i;
            this.f2307c = i2;
            this.f2308d = i3;
            this.f2309e = i4;
        }
    }

    private void T(RecyclerView.e0 e0Var) {
        View view = e0Var.f2175b;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.r.add(e0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(e0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List<i> list, RecyclerView.e0 e0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (Y(iVar, e0Var) && iVar.f2299a == null && iVar.f2300b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.e0 e0Var = iVar.f2299a;
        if (e0Var != null) {
            Y(iVar, e0Var);
        }
        RecyclerView.e0 e0Var2 = iVar.f2300b;
        if (e0Var2 != null) {
            Y(iVar, e0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.e0 e0Var) {
        boolean z = false;
        if (iVar.f2300b == e0Var) {
            iVar.f2300b = null;
        } else {
            if (iVar.f2299a != e0Var) {
                return false;
            }
            iVar.f2299a = null;
            z = true;
        }
        e0Var.f2175b.setAlpha(1.0f);
        e0Var.f2175b.setTranslationX(0.0f);
        e0Var.f2175b.setTranslationY(0.0f);
        C(e0Var, z);
        return true;
    }

    private void Z(RecyclerView.e0 e0Var) {
        if (h == null) {
            h = new ValueAnimator().getInterpolator();
        }
        e0Var.f2175b.animate().setInterpolator(h);
        j(e0Var);
    }

    void Q(RecyclerView.e0 e0Var) {
        View view = e0Var.f2175b;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.p.add(e0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(e0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.e0 e0Var = iVar.f2299a;
        View view = e0Var == null ? null : e0Var.f2175b;
        RecyclerView.e0 e0Var2 = iVar.f2300b;
        View view2 = e0Var2 != null ? e0Var2.f2175b : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.s.add(iVar.f2299a);
            duration.translationX(iVar.f2303e - iVar.f2301c);
            duration.translationY(iVar.f2304f - iVar.f2302d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.s.add(iVar.f2300b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
        View view = e0Var.f2175b;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.q.add(e0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(e0Var, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    void U(List<RecyclerView.e0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).f2175b.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean g(RecyclerView.e0 e0Var, List<Object> list) {
        return !list.isEmpty() || super.g(e0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void j(RecyclerView.e0 e0Var) {
        View view = e0Var.f2175b;
        view.animate().cancel();
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.k.get(size).f2305a == e0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(e0Var);
                this.k.remove(size);
            }
        }
        W(this.l, e0Var);
        if (this.i.remove(e0Var)) {
            view.setAlpha(1.0f);
            G(e0Var);
        }
        if (this.j.remove(e0Var)) {
            view.setAlpha(1.0f);
            A(e0Var);
        }
        for (int size2 = this.o.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.o.get(size2);
            W(arrayList, e0Var);
            if (arrayList.isEmpty()) {
                this.o.remove(size2);
            }
        }
        for (int size3 = this.n.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.n.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f2305a == e0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(e0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.n.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.m.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.e0> arrayList3 = this.m.get(size5);
            if (arrayList3.remove(e0Var)) {
                view.setAlpha(1.0f);
                A(e0Var);
                if (arrayList3.isEmpty()) {
                    this.m.remove(size5);
                }
            }
        }
        this.r.remove(e0Var);
        this.p.remove(e0Var);
        this.s.remove(e0Var);
        this.q.remove(e0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void k() {
        int size = this.k.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.k.get(size);
            View view = jVar.f2305a.f2175b;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f2305a);
            this.k.remove(size);
        }
        for (int size2 = this.i.size() - 1; size2 >= 0; size2--) {
            G(this.i.get(size2));
            this.i.remove(size2);
        }
        int size3 = this.j.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.e0 e0Var = this.j.get(size3);
            e0Var.f2175b.setAlpha(1.0f);
            A(e0Var);
            this.j.remove(size3);
        }
        for (int size4 = this.l.size() - 1; size4 >= 0; size4--) {
            X(this.l.get(size4));
        }
        this.l.clear();
        if (p()) {
            for (int size5 = this.n.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList = this.n.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList.get(size6);
                    View view2 = jVar2.f2305a.f2175b;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f2305a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.n.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.m.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.e0> arrayList2 = this.m.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.e0 e0Var2 = arrayList2.get(size8);
                    e0Var2.f2175b.setAlpha(1.0f);
                    A(e0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.m.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.o.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList3 = this.o.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X(arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.o.remove(arrayList3);
                    }
                }
            }
            U(this.r);
            U(this.q);
            U(this.p);
            U(this.s);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public boolean p() {
        return (this.j.isEmpty() && this.l.isEmpty() && this.k.isEmpty() && this.i.isEmpty() && this.q.isEmpty() && this.r.isEmpty() && this.p.isEmpty() && this.s.isEmpty() && this.n.isEmpty() && this.m.isEmpty() && this.o.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.m
    public void u() {
        boolean z = !this.i.isEmpty();
        boolean z2 = !this.k.isEmpty();
        boolean z3 = !this.l.isEmpty();
        boolean z4 = !this.j.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator<RecyclerView.e0> it = this.i.iterator();
            while (it.hasNext()) {
                T(it.next());
            }
            this.i.clear();
            if (z2) {
                ArrayList<j> arrayList = new ArrayList<>();
                arrayList.addAll(this.k);
                this.n.add(arrayList);
                this.k.clear();
                a aVar = new a(arrayList);
                if (z) {
                    v.h0(arrayList.get(0).f2305a.f2175b, aVar, o());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList<i> arrayList2 = new ArrayList<>();
                arrayList2.addAll(this.l);
                this.o.add(arrayList2);
                this.l.clear();
                b bVar = new b(arrayList2);
                if (z) {
                    v.h0(arrayList2.get(0).f2299a.f2175b, bVar, o());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList<RecyclerView.e0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(this.j);
                this.m.add(arrayList3);
                this.j.clear();
                RunnableC0058c runnableC0058c = new RunnableC0058c(arrayList3);
                if (z || z2 || z3) {
                    v.h0(arrayList3.get(0).f2175b, runnableC0058c, (z ? o() : 0L) + Math.max(z2 ? n() : 0L, z3 ? m() : 0L));
                } else {
                    runnableC0058c.run();
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.e0 e0Var) {
        Z(e0Var);
        e0Var.f2175b.setAlpha(0.0f);
        this.j.add(e0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.e0 e0Var, RecyclerView.e0 e0Var2, int i2, int i3, int i4, int i5) {
        if (e0Var == e0Var2) {
            return y(e0Var, i2, i3, i4, i5);
        }
        float translationX = e0Var.f2175b.getTranslationX();
        float translationY = e0Var.f2175b.getTranslationY();
        float alpha = e0Var.f2175b.getAlpha();
        Z(e0Var);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        e0Var.f2175b.setTranslationX(translationX);
        e0Var.f2175b.setTranslationY(translationY);
        e0Var.f2175b.setAlpha(alpha);
        if (e0Var2 != null) {
            Z(e0Var2);
            e0Var2.f2175b.setTranslationX(-i6);
            e0Var2.f2175b.setTranslationY(-i7);
            e0Var2.f2175b.setAlpha(0.0f);
        }
        this.l.add(new i(e0Var, e0Var2, i2, i3, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.e0 e0Var, int i2, int i3, int i4, int i5) {
        View view = e0Var.f2175b;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) e0Var.f2175b.getTranslationY());
        Z(e0Var);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            E(e0Var);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.k.add(new j(e0Var, translationX, translationY, i4, i5));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.e0 e0Var) {
        Z(e0Var);
        this.i.add(e0Var);
        return true;
    }
}
