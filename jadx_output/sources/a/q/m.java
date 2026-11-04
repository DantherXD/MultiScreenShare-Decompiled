package a.q;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class m implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f893b = {2, 1, 3, 4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final g f894c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ThreadLocal<a.d.a<Animator, d>> f895d = new ThreadLocal<>();
    p H;
    private e I;
    private a.d.a<String, String> J;
    private ArrayList<s> x;
    private ArrayList<s> y;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f896e = getClass().getName();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f897f = -1;
    long g = -1;
    private TimeInterpolator h = null;
    ArrayList<Integer> i = new ArrayList<>();
    ArrayList<View> j = new ArrayList<>();
    private ArrayList<String> k = null;
    private ArrayList<Class<?>> l = null;
    private ArrayList<Integer> m = null;
    private ArrayList<View> n = null;
    private ArrayList<Class<?>> o = null;
    private ArrayList<String> p = null;
    private ArrayList<Integer> q = null;
    private ArrayList<View> r = null;
    private ArrayList<Class<?>> s = null;
    private t t = new t();
    private t u = new t();
    q v = null;
    private int[] w = f893b;
    private ViewGroup z = null;
    boolean A = false;
    ArrayList<Animator> B = new ArrayList<>();
    private int C = 0;
    private boolean D = false;
    private boolean E = false;
    private ArrayList<f> F = null;
    private ArrayList<Animator> G = new ArrayList<>();
    private g K = f894c;

    static class a extends g {
        a() {
        }

        @Override // a.q.g
        public Path a(float f2, float f3, float f4, float f5) {
            Path path = new Path();
            path.moveTo(f2, f3);
            path.lineTo(f4, f5);
            return path;
        }
    }

    class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.d.a f898a;

        b(a.d.a aVar) {
            this.f898a = aVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f898a.remove(animator);
            m.this.B.remove(animator);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.this.B.add(animator);
        }
    }

    class c extends AnimatorListenerAdapter {
        c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.this.p();
            animator.removeListener(this);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        View f901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f902b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        s f903c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        m0 f904d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        m f905e;

        d(View view, String str, m mVar, m0 m0Var, s sVar) {
            this.f901a = view;
            this.f902b = str;
            this.f903c = sVar;
            this.f904d = m0Var;
            this.f905e = mVar;
        }
    }

    public static abstract class e {
    }

    public interface f {
        void a(m mVar);

        void b(m mVar);

        void c(m mVar);

        void d(m mVar);

        void e(m mVar);
    }

    private static boolean H(s sVar, s sVar2, String str) {
        Object obj = sVar.f919a.get(str);
        Object obj2 = sVar2.f919a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    private void I(a.d.a<View, s> aVar, a.d.a<View, s> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        View view;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View viewValueAt = sparseArray.valueAt(i);
            if (viewValueAt != null && G(viewValueAt) && (view = sparseArray2.get(sparseArray.keyAt(i))) != null && G(view)) {
                s sVar = aVar.get(viewValueAt);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(viewValueAt);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void J(a.d.a<View, s> aVar, a.d.a<View, s> aVar2) {
        s sVarRemove;
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewI = aVar.i(size);
            if (viewI != null && G(viewI) && (sVarRemove = aVar2.remove(viewI)) != null && G(sVarRemove.f920b)) {
                this.x.add(aVar.k(size));
                this.y.add(sVarRemove);
            }
        }
    }

    private void K(a.d.a<View, s> aVar, a.d.a<View, s> aVar2, a.d.d<View> dVar, a.d.d<View> dVar2) {
        View viewE;
        int iL = dVar.l();
        for (int i = 0; i < iL; i++) {
            View viewM = dVar.m(i);
            if (viewM != null && G(viewM) && (viewE = dVar2.e(dVar.h(i))) != null && G(viewE)) {
                s sVar = aVar.get(viewM);
                s sVar2 = aVar2.get(viewE);
                if (sVar != null && sVar2 != null) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(viewM);
                    aVar2.remove(viewE);
                }
            }
        }
    }

    private void L(a.d.a<View, s> aVar, a.d.a<View, s> aVar2, a.d.a<String, View> aVar3, a.d.a<String, View> aVar4) {
        View view;
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View viewM = aVar3.m(i);
            if (viewM != null && G(viewM) && (view = aVar4.get(aVar3.i(i))) != null && G(view)) {
                s sVar = aVar.get(viewM);
                s sVar2 = aVar2.get(view);
                if (sVar != null && sVar2 != null) {
                    this.x.add(sVar);
                    this.y.add(sVar2);
                    aVar.remove(viewM);
                    aVar2.remove(view);
                }
            }
        }
    }

    private void M(t tVar, t tVar2) {
        a.d.a<View, s> aVar = new a.d.a<>(tVar.f922a);
        a.d.a<View, s> aVar2 = new a.d.a<>(tVar2.f922a);
        int i = 0;
        while (true) {
            int[] iArr = this.w;
            if (i >= iArr.length) {
                c(aVar, aVar2);
                return;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                J(aVar, aVar2);
            } else if (i2 == 2) {
                L(aVar, aVar2, tVar.f925d, tVar2.f925d);
            } else if (i2 == 3) {
                I(aVar, aVar2, tVar.f923b, tVar2.f923b);
            } else if (i2 == 4) {
                K(aVar, aVar2, tVar.f924c, tVar2.f924c);
            }
            i++;
        }
    }

    private void S(Animator animator, a.d.a<Animator, d> aVar) {
        if (animator != null) {
            animator.addListener(new b(aVar));
            e(animator);
        }
    }

    private void c(a.d.a<View, s> aVar, a.d.a<View, s> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            s sVarM = aVar.m(i);
            if (G(sVarM.f920b)) {
                this.x.add(sVarM);
                this.y.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            s sVarM2 = aVar2.m(i2);
            if (G(sVarM2.f920b)) {
                this.y.add(sVarM2);
                this.x.add(null);
            }
        }
    }

    private static void d(t tVar, View view, s sVar) {
        tVar.f922a.put(view, sVar);
        int id = view.getId();
        if (id >= 0) {
            if (tVar.f923b.indexOfKey(id) >= 0) {
                tVar.f923b.put(id, null);
            } else {
                tVar.f923b.put(id, view);
            }
        }
        String strL = a.g.l.v.L(view);
        if (strL != null) {
            if (tVar.f925d.containsKey(strL)) {
                tVar.f925d.put(strL, null);
            } else {
                tVar.f925d.put(strL, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (tVar.f924c.g(itemIdAtPosition) < 0) {
                    a.g.l.v.w0(view, true);
                    tVar.f924c.i(itemIdAtPosition, view);
                    return;
                }
                View viewE = tVar.f924c.e(itemIdAtPosition);
                if (viewE != null) {
                    a.g.l.v.w0(viewE, false);
                    tVar.f924c.i(itemIdAtPosition, null);
                }
            }
        }
    }

    private void h(View view, boolean z) {
        if (view == null) {
            return;
        }
        int id = view.getId();
        ArrayList<Integer> arrayList = this.m;
        if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
            ArrayList<View> arrayList2 = this.n;
            if (arrayList2 == null || !arrayList2.contains(view)) {
                ArrayList<Class<?>> arrayList3 = this.o;
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        if (this.o.get(i).isInstance(view)) {
                            return;
                        }
                    }
                }
                if (view.getParent() instanceof ViewGroup) {
                    s sVar = new s(view);
                    if (z) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f921c.add(this);
                    i(sVar);
                    d(z ? this.t : this.u, view, sVar);
                }
                if (view instanceof ViewGroup) {
                    ArrayList<Integer> arrayList4 = this.q;
                    if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                        ArrayList<View> arrayList5 = this.r;
                        if (arrayList5 == null || !arrayList5.contains(view)) {
                            ArrayList<Class<?>> arrayList6 = this.s;
                            if (arrayList6 != null) {
                                int size2 = arrayList6.size();
                                for (int i2 = 0; i2 < size2; i2++) {
                                    if (this.s.get(i2).isInstance(view)) {
                                        return;
                                    }
                                }
                            }
                            ViewGroup viewGroup = (ViewGroup) view;
                            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                h(viewGroup.getChildAt(i3), z);
                            }
                        }
                    }
                }
            }
        }
    }

    private static a.d.a<Animator, d> x() {
        a.d.a<Animator, d> aVar = f895d.get();
        if (aVar != null) {
            return aVar;
        }
        a.d.a<Animator, d> aVar2 = new a.d.a<>();
        f895d.set(aVar2);
        return aVar2;
    }

    public List<String> A() {
        return this.k;
    }

    public List<Class<?>> B() {
        return this.l;
    }

    public List<View> C() {
        return this.j;
    }

    public String[] D() {
        return null;
    }

    public s E(View view, boolean z) {
        q qVar = this.v;
        if (qVar != null) {
            return qVar.E(view, z);
        }
        return (z ? this.t : this.u).f922a.get(view);
    }

    public boolean F(s sVar, s sVar2) {
        if (sVar == null || sVar2 == null) {
            return false;
        }
        String[] strArrD = D();
        if (strArrD == null) {
            Iterator<String> it = sVar.f919a.keySet().iterator();
            while (it.hasNext()) {
                if (H(sVar, sVar2, it.next())) {
                }
            }
            return false;
        }
        for (String str : strArrD) {
            if (!H(sVar, sVar2, str)) {
            }
        }
        return false;
        return true;
    }

    boolean G(View view) {
        ArrayList<Class<?>> arrayList;
        ArrayList<String> arrayList2;
        int id = view.getId();
        ArrayList<Integer> arrayList3 = this.m;
        if (arrayList3 != null && arrayList3.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList4 = this.n;
        if (arrayList4 != null && arrayList4.contains(view)) {
            return false;
        }
        ArrayList<Class<?>> arrayList5 = this.o;
        if (arrayList5 != null) {
            int size = arrayList5.size();
            for (int i = 0; i < size; i++) {
                if (this.o.get(i).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.p != null && a.g.l.v.L(view) != null && this.p.contains(a.g.l.v.L(view))) {
            return false;
        }
        if ((this.i.size() == 0 && this.j.size() == 0 && (((arrayList = this.l) == null || arrayList.isEmpty()) && ((arrayList2 = this.k) == null || arrayList2.isEmpty()))) || this.i.contains(Integer.valueOf(id)) || this.j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.k;
        if (arrayList6 != null && arrayList6.contains(a.g.l.v.L(view))) {
            return true;
        }
        if (this.l != null) {
            for (int i2 = 0; i2 < this.l.size(); i2++) {
                if (this.l.get(i2).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void N(View view) {
        if (this.E) {
            return;
        }
        a.d.a<Animator, d> aVarX = x();
        int size = aVarX.size();
        m0 m0VarD = c0.d(view);
        for (int i = size - 1; i >= 0; i--) {
            d dVarM = aVarX.m(i);
            if (dVarM.f901a != null && m0VarD.equals(dVarM.f904d)) {
                a.q.a.b(aVarX.i(i));
            }
        }
        ArrayList<f> arrayList = this.F;
        if (arrayList != null && arrayList.size() > 0) {
            ArrayList arrayList2 = (ArrayList) this.F.clone();
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((f) arrayList2.get(i2)).a(this);
            }
        }
        this.D = true;
    }

    void O(ViewGroup viewGroup) {
        d dVar;
        this.x = new ArrayList<>();
        this.y = new ArrayList<>();
        M(this.t, this.u);
        a.d.a<Animator, d> aVarX = x();
        int size = aVarX.size();
        m0 m0VarD = c0.d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animatorI = aVarX.i(i);
            if (animatorI != null && (dVar = aVarX.get(animatorI)) != null && dVar.f901a != null && m0VarD.equals(dVar.f904d)) {
                s sVar = dVar.f903c;
                View view = dVar.f901a;
                s sVarE = E(view, true);
                s sVarT = t(view, true);
                if (sVarE == null && sVarT == null) {
                    sVarT = this.u.f922a.get(view);
                }
                if (!(sVarE == null && sVarT == null) && dVar.f905e.F(sVar, sVarT)) {
                    if (animatorI.isRunning() || animatorI.isStarted()) {
                        animatorI.cancel();
                    } else {
                        aVarX.remove(animatorI);
                    }
                }
            }
        }
        o(viewGroup, this.t, this.u, this.x, this.y);
        T();
    }

    public m P(f fVar) {
        ArrayList<f> arrayList = this.F;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(fVar);
        if (this.F.size() == 0) {
            this.F = null;
        }
        return this;
    }

    public m Q(View view) {
        this.j.remove(view);
        return this;
    }

    public void R(View view) {
        if (this.D) {
            if (!this.E) {
                a.d.a<Animator, d> aVarX = x();
                int size = aVarX.size();
                m0 m0VarD = c0.d(view);
                for (int i = size - 1; i >= 0; i--) {
                    d dVarM = aVarX.m(i);
                    if (dVarM.f901a != null && m0VarD.equals(dVarM.f904d)) {
                        a.q.a.c(aVarX.i(i));
                    }
                }
                ArrayList<f> arrayList = this.F;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.F.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((f) arrayList2.get(i2)).b(this);
                    }
                }
            }
            this.D = false;
        }
    }

    protected void T() {
        a0();
        a.d.a<Animator, d> aVarX = x();
        for (Animator animator : this.G) {
            if (aVarX.containsKey(animator)) {
                a0();
                S(animator, aVarX);
            }
        }
        this.G.clear();
        p();
    }

    public m U(long j) {
        this.g = j;
        return this;
    }

    public void V(e eVar) {
        this.I = eVar;
    }

    public m W(TimeInterpolator timeInterpolator) {
        this.h = timeInterpolator;
        return this;
    }

    public void X(g gVar) {
        if (gVar == null) {
            gVar = f894c;
        }
        this.K = gVar;
    }

    public void Y(p pVar) {
    }

    public m Z(long j) {
        this.f897f = j;
        return this;
    }

    public m a(f fVar) {
        if (this.F == null) {
            this.F = new ArrayList<>();
        }
        this.F.add(fVar);
        return this;
    }

    protected void a0() {
        if (this.C == 0) {
            ArrayList<f> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((f) arrayList2.get(i)).c(this);
                }
            }
            this.E = false;
        }
        this.C++;
    }

    public m b(View view) {
        this.j.add(view);
        return this;
    }

    String b0(String str) {
        String str2 = str + getClass().getSimpleName() + "@" + Integer.toHexString(hashCode()) + ": ";
        if (this.g != -1) {
            str2 = str2 + "dur(" + this.g + ") ";
        }
        if (this.f897f != -1) {
            str2 = str2 + "dly(" + this.f897f + ") ";
        }
        if (this.h != null) {
            str2 = str2 + "interp(" + this.h + ") ";
        }
        if (this.i.size() <= 0 && this.j.size() <= 0) {
            return str2;
        }
        String str3 = str2 + "tgts(";
        if (this.i.size() > 0) {
            for (int i = 0; i < this.i.size(); i++) {
                if (i > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.i.get(i);
            }
        }
        if (this.j.size() > 0) {
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                if (i2 > 0) {
                    str3 = str3 + ", ";
                }
                str3 = str3 + this.j.get(i2);
            }
        }
        return str3 + ")";
    }

    protected void e(Animator animator) {
        if (animator == null) {
            p();
            return;
        }
        if (q() >= 0) {
            animator.setDuration(q());
        }
        if (y() >= 0) {
            animator.setStartDelay(y() + animator.getStartDelay());
        }
        if (s() != null) {
            animator.setInterpolator(s());
        }
        animator.addListener(new c());
        animator.start();
    }

    protected void f() {
        for (int size = this.B.size() - 1; size >= 0; size--) {
            this.B.get(size).cancel();
        }
        ArrayList<f> arrayList = this.F;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        ArrayList arrayList2 = (ArrayList) this.F.clone();
        int size2 = arrayList2.size();
        for (int i = 0; i < size2; i++) {
            ((f) arrayList2.get(i)).d(this);
        }
    }

    public abstract void g(s sVar);

    void i(s sVar) {
        if (this.H != null && !sVar.f919a.isEmpty()) {
            throw null;
        }
    }

    public abstract void j(s sVar);

    void k(ViewGroup viewGroup, boolean z) {
        ArrayList<String> arrayList;
        ArrayList<Class<?>> arrayList2;
        a.d.a<String, String> aVar;
        l(z);
        if ((this.i.size() > 0 || this.j.size() > 0) && (((arrayList = this.k) == null || arrayList.isEmpty()) && ((arrayList2 = this.l) == null || arrayList2.isEmpty()))) {
            for (int i = 0; i < this.i.size(); i++) {
                View viewFindViewById = viewGroup.findViewById(this.i.get(i).intValue());
                if (viewFindViewById != null) {
                    s sVar = new s(viewFindViewById);
                    if (z) {
                        j(sVar);
                    } else {
                        g(sVar);
                    }
                    sVar.f921c.add(this);
                    i(sVar);
                    d(z ? this.t : this.u, viewFindViewById, sVar);
                }
            }
            for (int i2 = 0; i2 < this.j.size(); i2++) {
                View view = this.j.get(i2);
                s sVar2 = new s(view);
                if (z) {
                    j(sVar2);
                } else {
                    g(sVar2);
                }
                sVar2.f921c.add(this);
                i(sVar2);
                d(z ? this.t : this.u, view, sVar2);
            }
        } else {
            h(viewGroup, z);
        }
        if (z || (aVar = this.J) == null) {
            return;
        }
        int size = aVar.size();
        ArrayList arrayList3 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            arrayList3.add(this.t.f925d.remove(this.J.i(i3)));
        }
        for (int i4 = 0; i4 < size; i4++) {
            View view2 = (View) arrayList3.get(i4);
            if (view2 != null) {
                this.t.f925d.put(this.J.m(i4), view2);
            }
        }
    }

    void l(boolean z) {
        t tVar;
        if (z) {
            this.t.f922a.clear();
            this.t.f923b.clear();
            tVar = this.t;
        } else {
            this.u.f922a.clear();
            this.u.f923b.clear();
            tVar = this.u;
        }
        tVar.f924c.b();
    }

    @Override // 
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public m clone() {
        try {
            m mVar = (m) super.clone();
            mVar.G = new ArrayList<>();
            mVar.t = new t();
            mVar.u = new t();
            mVar.x = null;
            mVar.y = null;
            return mVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public Animator n(ViewGroup viewGroup, s sVar, s sVar2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c  */
    protected void o(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        int i;
        View view;
        Animator animator;
        s sVar;
        Animator animator2;
        s sVar2;
        a.d.a<Animator, d> aVarX = x();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            s sVar3 = arrayList.get(i2);
            s sVar4 = arrayList2.get(i2);
            if (sVar3 != null && !sVar3.f921c.contains(this)) {
                sVar3 = null;
            }
            if (sVar4 != null && !sVar4.f921c.contains(this)) {
                sVar4 = null;
            }
            if (sVar3 == null && sVar4 == null) {
                i = size;
            } else {
                if (sVar3 == null || sVar4 == null || F(sVar3, sVar4)) {
                    Animator animatorN = n(viewGroup, sVar3, sVar4);
                    if (animatorN != null) {
                        if (sVar4 != null) {
                            View view2 = sVar4.f920b;
                            String[] strArrD = D();
                            if (strArrD != null && strArrD.length > 0) {
                                sVar2 = new s(view2);
                                s sVar5 = tVar2.f922a.get(view2);
                                if (sVar5 != null) {
                                    int i3 = 0;
                                    while (i3 < strArrD.length) {
                                        sVar2.f919a.put(strArrD[i3], sVar5.f919a.get(strArrD[i3]));
                                        i3++;
                                        animatorN = animatorN;
                                        size = size;
                                        sVar5 = sVar5;
                                    }
                                }
                                Animator animator3 = animatorN;
                                i = size;
                                int size2 = aVarX.size();
                                int i4 = 0;
                                while (true) {
                                    if (i4 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    d dVar = aVarX.get(aVarX.i(i4));
                                    if (dVar.f903c != null && dVar.f901a == view2 && dVar.f902b.equals(u()) && dVar.f903c.equals(sVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i4++;
                                }
                            } else {
                                i = size;
                                animator2 = animatorN;
                                sVar2 = null;
                            }
                            view = view2;
                            animator = animator2;
                            sVar = sVar2;
                        } else {
                            i = size;
                            view = sVar3.f920b;
                            animator = animatorN;
                            sVar = null;
                        }
                        if (animator == null) {
                            continue;
                        } else {
                            if (this.H != null) {
                                throw null;
                            }
                            aVarX.put(animator, new d(view, u(), this, c0.d(viewGroup), sVar));
                            this.G.add(animator);
                        }
                    }
                }
                i = size;
            }
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                Animator animator4 = this.G.get(sparseIntArray.keyAt(i5));
                animator4.setStartDelay((((long) sparseIntArray.valueAt(i5)) - Long.MAX_VALUE) + animator4.getStartDelay());
            }
        }
    }

    protected void p() {
        int i = this.C - 1;
        this.C = i;
        if (i == 0) {
            ArrayList<f> arrayList = this.F;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.F.clone();
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((f) arrayList2.get(i2)).e(this);
                }
            }
            for (int i3 = 0; i3 < this.t.f924c.l(); i3++) {
                View viewM = this.t.f924c.m(i3);
                if (viewM != null) {
                    a.g.l.v.w0(viewM, false);
                }
            }
            for (int i4 = 0; i4 < this.u.f924c.l(); i4++) {
                View viewM2 = this.u.f924c.m(i4);
                if (viewM2 != null) {
                    a.g.l.v.w0(viewM2, false);
                }
            }
            this.E = true;
        }
    }

    public long q() {
        return this.g;
    }

    public e r() {
        return this.I;
    }

    public TimeInterpolator s() {
        return this.h;
    }

    s t(View view, boolean z) {
        q qVar = this.v;
        if (qVar != null) {
            return qVar.t(view, z);
        }
        ArrayList<s> arrayList = z ? this.x : this.y;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = arrayList.get(i2);
            if (sVar == null) {
                return null;
            }
            if (sVar.f920b == view) {
                i = i2;
                break;
            }
        }
        if (i >= 0) {
            return (z ? this.y : this.x).get(i);
        }
        return null;
    }

    public String toString() {
        return b0("");
    }

    public String u() {
        return this.f896e;
    }

    public g v() {
        return this.K;
    }

    public p w() {
        return this.H;
    }

    public long y() {
        return this.f897f;
    }

    public List<Integer> z() {
        return this.i;
    }
}
