package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class c extends c0 {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1824a;

        static {
            int[] iArr = new int[c0.e.c.values().length];
            f1824a = iArr;
            try {
                iArr[c0.e.c.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1824a[c0.e.c.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1824a[c0.e.c.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1824a[c0.e.c.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f1825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0.e f1826c;

        b(List list, c0.e eVar) {
            this.f1825b = list;
            this.f1826c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1825b.contains(this.f1826c)) {
                this.f1825b.remove(this.f1826c);
                c.this.s(this.f1826c);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.c$c, reason: collision with other inner class name */
    class C0051c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1828a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1829b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f1830c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ c0.e f1831d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ k f1832e;

        C0051c(ViewGroup viewGroup, View view, boolean z, c0.e eVar, k kVar) {
            this.f1828a = viewGroup;
            this.f1829b = view;
            this.f1830c = z;
            this.f1831d = eVar;
            this.f1832e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1828a.endViewTransition(this.f1829b);
            if (this.f1830c) {
                this.f1831d.e().a(this.f1829b);
            }
            this.f1832e.a();
        }
    }

    class d implements a.g.h.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Animator f1834a;

        d(Animator animator) {
            this.f1834a = animator;
        }

        @Override // a.g.h.b.a
        public void a() {
            this.f1834a.end();
        }
    }

    class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f1838c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f1836a.endViewTransition(eVar.f1837b);
                e.this.f1838c.a();
            }
        }

        e(ViewGroup viewGroup, View view, k kVar) {
            this.f1836a = viewGroup;
            this.f1837b = view;
            this.f1838c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1836a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    class f implements a.g.h.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f1841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f1843c;

        f(View view, ViewGroup viewGroup, k kVar) {
            this.f1841a = view;
            this.f1842b = viewGroup;
            this.f1843c = kVar;
        }

        @Override // a.g.h.b.a
        public void a() {
            this.f1841a.clearAnimation();
            this.f1842b.endViewTransition(this.f1841a);
            this.f1843c.a();
        }
    }

    class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0.e f1845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ c0.e f1846c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f1847d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a.d.a f1848e;

        g(c0.e eVar, c0.e eVar2, boolean z, a.d.a aVar) {
            this.f1845b = eVar;
            this.f1846c = eVar2;
            this.f1847d = z;
            this.f1848e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f1845b.f(), this.f1846c.f(), this.f1847d, this.f1848e, false);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f1850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f1851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Rect f1852d;

        h(z zVar, View view, Rect rect) {
            this.f1850b = zVar;
            this.f1851c = view;
            this.f1852d = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1850b.k(this.f1851c, this.f1852d);
        }
    }

    class i implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f1854b;

        i(ArrayList arrayList) {
            this.f1854b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.A(this.f1854b, 4);
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f1856b;

        j(m mVar) {
            this.f1856b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1856b.a();
        }
    }

    private static class k extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f1858c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f1859d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private androidx.fragment.app.f.d f1860e;

        k(c0.e eVar, a.g.h.b bVar, boolean z) {
            super(eVar, bVar);
            this.f1859d = false;
            this.f1858c = z;
        }

        androidx.fragment.app.f.d e(Context context) {
            if (this.f1859d) {
                return this.f1860e;
            }
            androidx.fragment.app.f.d dVarC = androidx.fragment.app.f.c(context, b().f(), b().e() == c0.e.c.VISIBLE, this.f1858c);
            this.f1860e = dVarC;
            this.f1859d = true;
            return dVarC;
        }
    }

    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c0.e f1861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a.g.h.b f1862b;

        l(c0.e eVar, a.g.h.b bVar) {
            this.f1861a = eVar;
            this.f1862b = bVar;
        }

        void a() {
            this.f1861a.d(this.f1862b);
        }

        c0.e b() {
            return this.f1861a;
        }

        a.g.h.b c() {
            return this.f1862b;
        }

        boolean d() {
            c0.e.c cVar;
            c0.e.c cVarC = c0.e.c.c(this.f1861a.f().J);
            c0.e.c cVarE = this.f1861a.e();
            return cVarC == cVarE || !(cVarC == (cVar = c0.e.c.VISIBLE) || cVarE == cVar);
        }
    }

    private static class m extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f1863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f1864d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Object f1865e;

        m(c0.e eVar, a.g.h.b bVar, boolean z, boolean z2) {
            boolean zL;
            Object objN;
            super(eVar, bVar);
            if (eVar.e() == c0.e.c.VISIBLE) {
                Fragment fragmentF = eVar.f();
                this.f1863c = z ? fragmentF.J() : fragmentF.s();
                Fragment fragmentF2 = eVar.f();
                zL = z ? fragmentF2.l() : fragmentF2.k();
            } else {
                Fragment fragmentF3 = eVar.f();
                this.f1863c = z ? fragmentF3.L() : fragmentF3.v();
                zL = true;
            }
            this.f1864d = zL;
            if (z2) {
                Fragment fragmentF4 = eVar.f();
                objN = z ? fragmentF4.N() : fragmentF4.M();
            } else {
                objN = null;
            }
            this.f1865e = objN;
        }

        private z f(Object obj) {
            if (obj == null) {
                return null;
            }
            z zVar = x.f2004b;
            if (zVar != null && zVar.e(obj)) {
                return zVar;
            }
            z zVar2 = x.f2005c;
            if (zVar2 != null && zVar2.e(obj)) {
                return zVar2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + b().f() + " is not a valid framework Transition or AndroidX Transition");
        }

        z e() {
            z zVarF = f(this.f1863c);
            z zVarF2 = f(this.f1865e);
            if (zVarF == null || zVarF2 == null || zVarF == zVarF2) {
                return zVarF != null ? zVarF : zVarF2;
            }
            throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + b().f() + " returned Transition " + this.f1863c + " which uses a different Transition  type than its shared element transition " + this.f1865e);
        }

        public Object g() {
            return this.f1865e;
        }

        Object h() {
            return this.f1863c;
        }

        public boolean i() {
            return this.f1865e != null;
        }

        boolean j() {
            return this.f1864d;
        }
    }

    c(ViewGroup viewGroup) {
        super(viewGroup);
    }

    private void w(List<k> list, List<c0.e> list2, boolean z, Map<c0.e, Boolean> map) {
        StringBuilder sb;
        String str;
        androidx.fragment.app.f.d dVarE;
        ViewGroup viewGroupM = m();
        Context context = viewGroupM.getContext();
        ArrayList<k> arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.d() || (dVarE = kVar.e(context)) == null) {
                kVar.a();
            } else {
                Animator animator = dVarE.f1913b;
                if (animator == null) {
                    arrayList.add(kVar);
                } else {
                    c0.e eVarB = kVar.b();
                    Fragment fragmentF = eVarB.f();
                    if (Boolean.TRUE.equals(map.get(eVarB))) {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + fragmentF + " as this Fragment was involved in a Transition.");
                        }
                        kVar.a();
                    } else {
                        boolean z3 = eVarB.e() == c0.e.c.GONE;
                        if (z3) {
                            list2.remove(eVarB);
                        }
                        View view = fragmentF.J;
                        viewGroupM.startViewTransition(view);
                        animator.addListener(new C0051c(viewGroupM, view, z3, eVarB, kVar));
                        animator.setTarget(view);
                        animator.start();
                        kVar.c().c(new d(animator));
                        z2 = true;
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            c0.e eVarB2 = kVar2.b();
            Fragment fragmentF2 = eVarB2.f();
            if (z) {
                if (n.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Transitions.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else if (z2) {
                if (n.E0(2)) {
                    sb = new StringBuilder();
                    sb.append("Ignoring Animation set on ");
                    sb.append(fragmentF2);
                    str = " as Animations cannot run alongside Animators.";
                    sb.append(str);
                    Log.v("FragmentManager", sb.toString());
                }
                kVar2.a();
            } else {
                View view2 = fragmentF2.J;
                Animation animation = (Animation) a.g.k.h.e(((androidx.fragment.app.f.d) a.g.k.h.e(kVar2.e(context))).f1912a);
                if (eVarB2.e() != c0.e.c.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.a();
                } else {
                    viewGroupM.startViewTransition(view2);
                    androidx.fragment.app.f.e eVar = new androidx.fragment.app.f.e(animation, viewGroupM, view2);
                    eVar.setAnimationListener(new e(viewGroupM, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.c().c(new f(view2, viewGroupM, kVar2));
            }
        }
    }

    private Map<c0.e, Boolean> x(List<m> list, List<c0.e> list2, boolean z, c0.e eVar, c0.e eVar2) {
        Iterator<m> it;
        View view;
        Object obj;
        ArrayList<View> arrayList;
        Object obj2;
        ArrayList<View> arrayList2;
        c0.e eVar3;
        c0.e eVar4;
        View view2;
        Object objN;
        ArrayList<View> arrayList3;
        c cVar;
        c0.e eVar5;
        c0.e eVar6;
        View view3;
        androidx.core.app.k kVarT;
        androidx.core.app.k kVarW;
        View view4;
        c cVar2 = this;
        c0.e eVar7 = eVar;
        c0.e eVar8 = eVar2;
        HashMap map = new HashMap();
        z zVar = null;
        for (m mVar : list) {
            if (!mVar.d()) {
                z zVarE = mVar.e();
                if (zVar == null) {
                    zVar = zVarE;
                } else if (zVarE != null && zVar != zVarE) {
                    throw new IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + mVar.b().f() + " returned Transition " + mVar.h() + " which uses a different Transition  type than other Fragments.");
                }
            }
        }
        if (zVar == null) {
            for (m mVar2 : list) {
                map.put(mVar2.b(), Boolean.FALSE);
                mVar2.a();
            }
            return map;
        }
        View view5 = new View(m().getContext());
        Rect rect = new Rect();
        ArrayList<View> arrayList4 = new ArrayList<>();
        ArrayList<View> arrayList5 = new ArrayList<>();
        a.d.a aVar = new a.d.a();
        Object obj3 = null;
        View view6 = null;
        boolean z2 = false;
        for (m mVar3 : list) {
            if (!mVar3.i() || eVar7 == null || eVar8 == null) {
                arrayList3 = arrayList5;
                cVar = cVar2;
                eVar5 = eVar7;
                eVar6 = eVar8;
                view3 = view5;
                view6 = view6;
            } else {
                Object objB = zVar.B(zVar.g(mVar3.g()));
                ArrayList<String> arrayListO = eVar2.f().O();
                ArrayList<String> arrayListO2 = eVar.f().O();
                ArrayList<String> arrayListP = eVar.f().P();
                View view7 = view6;
                int i2 = 0;
                while (i2 < arrayListP.size()) {
                    int iIndexOf = arrayListO.indexOf(arrayListP.get(i2));
                    ArrayList<String> arrayList6 = arrayListP;
                    if (iIndexOf != -1) {
                        arrayListO.set(iIndexOf, arrayListO2.get(i2));
                    }
                    i2++;
                    arrayListP = arrayList6;
                }
                ArrayList<String> arrayListP2 = eVar2.f().P();
                Fragment fragmentF = eVar.f();
                if (z == 0) {
                    kVarT = fragmentF.w();
                    kVarW = eVar2.f().t();
                } else {
                    kVarT = fragmentF.t();
                    kVarW = eVar2.f().w();
                }
                int i3 = 0;
                for (int size = arrayListO.size(); i3 < size; size = size) {
                    aVar.put(arrayListO.get(i3), arrayListP2.get(i3));
                    i3++;
                }
                a.d.a<String, View> aVar2 = new a.d.a<>();
                cVar2.u(aVar2, eVar.f().J);
                aVar2.o(arrayListO);
                if (kVarT != null) {
                    throw null;
                }
                aVar.o(aVar2.keySet());
                a.d.a<String, View> aVar3 = new a.d.a<>();
                cVar2.u(aVar3, eVar2.f().J);
                aVar3.o(arrayListP2);
                aVar3.o(aVar.values());
                if (kVarW != null) {
                    throw null;
                }
                x.x(aVar, aVar3);
                cVar2.v(aVar2, aVar.keySet());
                cVar2.v(aVar3, aVar.values());
                if (aVar.isEmpty()) {
                    arrayList4.clear();
                    arrayList5.clear();
                    eVar5 = eVar;
                    arrayList3 = arrayList5;
                    cVar = cVar2;
                    view3 = view5;
                    view6 = view7;
                    obj3 = null;
                    eVar6 = eVar2;
                } else {
                    x.f(eVar2.f(), eVar.f(), z, aVar2, true);
                    HashMap map2 = map;
                    View view8 = view5;
                    ArrayList<View> arrayList7 = arrayList5;
                    a.g.l.t.a(m(), new g(eVar2, eVar, z, aVar3));
                    arrayList4.addAll(aVar2.values());
                    if (arrayListO.isEmpty()) {
                        view6 = view7;
                    } else {
                        View view9 = aVar2.get(arrayListO.get(0));
                        zVar.v(objB, view9);
                        view6 = view9;
                    }
                    arrayList3 = arrayList7;
                    arrayList3.addAll(aVar3.values());
                    if (arrayListP2.isEmpty() || (view4 = aVar3.get(arrayListP2.get(0))) == null) {
                        cVar = this;
                    } else {
                        cVar = this;
                        a.g.l.t.a(m(), cVar.new h(zVar, view4, rect));
                        z2 = true;
                    }
                    zVar.z(objB, view8, arrayList4);
                    view3 = view8;
                    zVar.t(objB, null, null, null, null, objB, arrayList3);
                    Boolean bool = Boolean.TRUE;
                    eVar5 = eVar;
                    map = map2;
                    map.put(eVar5, bool);
                    eVar6 = eVar2;
                    map.put(eVar6, bool);
                    obj3 = objB;
                }
            }
            arrayList4 = arrayList4;
            cVar2 = cVar;
            rect = rect;
            view5 = view3;
            eVar8 = eVar6;
            aVar = aVar;
            arrayList5 = arrayList3;
            eVar7 = eVar5;
            zVar = zVar;
        }
        View view10 = view6;
        a.d.a aVar4 = aVar;
        ArrayList<View> arrayList8 = arrayList5;
        c cVar3 = cVar2;
        c0.e eVar9 = eVar7;
        ArrayList<View> arrayList9 = arrayList4;
        Rect rect2 = rect;
        z zVar2 = zVar;
        c0.e eVar10 = eVar8;
        View view11 = view5;
        ArrayList arrayList10 = new ArrayList();
        Iterator<m> it2 = list.iterator();
        Object obj4 = null;
        Object objN2 = null;
        while (it2.hasNext()) {
            m next = it2.next();
            if (next.d()) {
                map.put(next.b(), Boolean.FALSE);
                next.a();
            } else {
                Object objG = zVar2.g(next.h());
                c0.e eVarB = next.b();
                boolean z3 = obj3 != null && (eVarB == eVar9 || eVarB == eVar10);
                if (objG == null) {
                    if (!z3) {
                        map.put(eVarB, Boolean.FALSE);
                        next.a();
                    }
                    arrayList2 = arrayList8;
                    arrayList = arrayList9;
                    it = it2;
                    view = view11;
                    objN = obj4;
                    eVar3 = eVar10;
                    view2 = view10;
                } else {
                    it = it2;
                    ArrayList<View> arrayList11 = new ArrayList<>();
                    Object obj5 = obj4;
                    cVar3.t(arrayList11, eVarB.f().J);
                    if (z3) {
                        if (eVarB == eVar9) {
                            arrayList11.removeAll(arrayList9);
                        } else {
                            arrayList11.removeAll(arrayList8);
                        }
                    }
                    if (arrayList11.isEmpty()) {
                        zVar2.a(objG, view11);
                        arrayList2 = arrayList8;
                        arrayList = arrayList9;
                        view = view11;
                        eVar4 = eVarB;
                        obj2 = objN2;
                        eVar3 = eVar10;
                        obj = obj5;
                    } else {
                        zVar2.b(objG, arrayList11);
                        view = view11;
                        obj = obj5;
                        arrayList = arrayList9;
                        obj2 = objN2;
                        arrayList2 = arrayList8;
                        eVar3 = eVar10;
                        zVar2.t(objG, objG, arrayList11, null, null, null, null);
                        if (eVarB.e() == c0.e.c.GONE) {
                            eVar4 = eVarB;
                            list2.remove(eVar4);
                            ArrayList<View> arrayList12 = new ArrayList<>(arrayList11);
                            arrayList12.remove(eVar4.f().J);
                            zVar2.r(objG, eVar4.f().J, arrayList12);
                            a.g.l.t.a(m(), cVar3.new i(arrayList11));
                        } else {
                            eVar4 = eVarB;
                        }
                    }
                    if (eVar4.e() == c0.e.c.VISIBLE) {
                        arrayList10.addAll(arrayList11);
                        if (z2) {
                            zVar2.u(objG, rect2);
                        }
                        view2 = view10;
                    } else {
                        view2 = view10;
                        zVar2.v(objG, view2);
                    }
                    map.put(eVar4, Boolean.TRUE);
                    if (next.j()) {
                        objN2 = zVar2.n(obj2, objG, null);
                        objN = obj;
                    } else {
                        objN = zVar2.n(obj, objG, null);
                        objN2 = obj2;
                    }
                }
                eVar10 = eVar3;
                obj4 = objN;
                view10 = view2;
                view11 = view;
                arrayList9 = arrayList;
                arrayList8 = arrayList2;
                it2 = it;
            }
        }
        ArrayList<View> arrayList13 = arrayList8;
        ArrayList<View> arrayList14 = arrayList9;
        c0.e eVar11 = eVar10;
        Object objM = zVar2.m(objN2, obj4, obj3);
        for (m mVar4 : list) {
            if (!mVar4.d()) {
                Object objH = mVar4.h();
                c0.e eVarB2 = mVar4.b();
                boolean z4 = obj3 != null && (eVarB2 == eVar9 || eVarB2 == eVar11);
                if (objH != null || z4) {
                    if (a.g.l.v.T(m())) {
                        zVar2.w(mVar4.b().f(), objM, mVar4.c(), cVar3.new j(mVar4));
                    } else {
                        if (n.E0(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + m() + " has not been laid out. Completing operation " + eVarB2);
                        }
                        mVar4.a();
                    }
                }
            }
        }
        if (!a.g.l.v.T(m())) {
            return map;
        }
        x.A(arrayList10, 4);
        ArrayList<String> arrayListO3 = zVar2.o(arrayList13);
        zVar2.c(m(), objM);
        zVar2.y(m(), arrayList14, arrayList13, arrayListO3, aVar4);
        x.A(arrayList10, 0);
        zVar2.A(obj3, arrayList14, arrayList13);
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    @Override // androidx.fragment.app.c0
    void f(List<c0.e> list, boolean z) {
        c0.e eVar = null;
        c0.e eVar2 = null;
        for (c0.e eVar3 : list) {
            c0.e.c cVarC = c0.e.c.c(eVar3.f().J);
            int i2 = a.f1824a[eVar3.e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (cVarC == c0.e.c.VISIBLE && eVar == null) {
                    eVar = eVar3;
                }
            } else if (i2 == 4 && cVarC != c0.e.c.VISIBLE) {
                eVar2 = eVar3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (c0.e eVar4 : list) {
            a.g.h.b bVar = new a.g.h.b();
            eVar4.j(bVar);
            arrayList.add(new k(eVar4, bVar, z));
            a.g.h.b bVar2 = new a.g.h.b();
            eVar4.j(bVar2);
            boolean z2 = false;
            if (z) {
                if (eVar4 == eVar) {
                    z2 = true;
                }
            } else if (eVar4 == eVar2) {
                z2 = true;
            }
            arrayList2.add(new m(eVar4, bVar2, z, z2));
            eVar4.a(new b(arrayList3, eVar4));
        }
        Map<c0.e, Boolean> mapX = x(arrayList2, arrayList3, z, eVar, eVar2);
        w(arrayList, arrayList3, mapX.containsValue(Boolean.TRUE), mapX);
        Iterator<c0.e> it = arrayList3.iterator();
        while (it.hasNext()) {
            s(it.next());
        }
        arrayList3.clear();
    }

    void s(c0.e eVar) {
        eVar.e().a(eVar.f().J);
    }

    void t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (a.g.l.x.a(viewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                t(arrayList, childAt);
            }
        }
    }

    void u(Map<String, View> map, View view) {
        String strL = a.g.l.v.L(view);
        if (strL != null) {
            map.put(strL, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    u(map, childAt);
                }
            }
        }
    }

    void v(a.d.a<String, View> aVar, Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = aVar.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(a.g.l.v.L(it.next().getValue()))) {
                it.remove();
            }
        }
    }
}
