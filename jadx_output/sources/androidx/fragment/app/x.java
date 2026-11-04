package androidx.fragment.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2003a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final z f2004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final z f2005c;

    class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f2006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.g.h.b f2008d;

        a(g gVar, Fragment fragment, a.g.h.b bVar) {
            this.f2006b = gVar;
            this.f2007c = fragment;
            this.f2008d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2006b.a(this.f2007c, this.f2008d);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f2009b;

        b(ArrayList arrayList) {
            this.f2009b = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.A(this.f2009b, 4);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f2010b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2011c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.g.h.b f2012d;

        c(g gVar, Fragment fragment, a.g.h.b bVar) {
            this.f2010b = gVar;
            this.f2011c = fragment;
            this.f2012d = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2010b.a(this.f2011c, this.f2012d);
        }
    }

    class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f2013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f2014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View f2015d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Fragment f2016e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f2017f;
        final /* synthetic */ ArrayList g;
        final /* synthetic */ ArrayList h;
        final /* synthetic */ Object i;

        d(Object obj, z zVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f2013b = obj;
            this.f2014c = zVar;
            this.f2015d = view;
            this.f2016e = fragment;
            this.f2017f = arrayList;
            this.g = arrayList2;
            this.h = arrayList3;
            this.i = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj = this.f2013b;
            if (obj != null) {
                this.f2014c.p(obj, this.f2015d);
                this.g.addAll(x.k(this.f2014c, this.f2013b, this.f2016e, this.f2017f, this.f2015d));
            }
            if (this.h != null) {
                if (this.i != null) {
                    ArrayList<View> arrayList = new ArrayList<>();
                    arrayList.add(this.f2015d);
                    this.f2014c.q(this.i, this.h, arrayList);
                }
                this.h.clear();
                this.h.add(this.f2015d);
            }
        }
    }

    class e implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f2018b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f2019c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f2020d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ a.d.a f2021e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ View f2022f;
        final /* synthetic */ z g;
        final /* synthetic */ Rect h;

        e(Fragment fragment, Fragment fragment2, boolean z, a.d.a aVar, View view, z zVar, Rect rect) {
            this.f2018b = fragment;
            this.f2019c = fragment2;
            this.f2020d = z;
            this.f2021e = aVar;
            this.f2022f = view;
            this.g = zVar;
            this.h = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            x.f(this.f2018b, this.f2019c, this.f2020d, this.f2021e, false);
            View view = this.f2022f;
            if (view != null) {
                this.g.k(view, this.h);
            }
        }
    }

    class f implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f2023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ a.d.a f2024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Object f2025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ h f2026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f2027f;
        final /* synthetic */ View g;
        final /* synthetic */ Fragment h;
        final /* synthetic */ Fragment i;
        final /* synthetic */ boolean j;
        final /* synthetic */ ArrayList k;
        final /* synthetic */ Object l;
        final /* synthetic */ Rect m;

        f(z zVar, a.d.a aVar, Object obj, h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f2023b = zVar;
            this.f2024c = aVar;
            this.f2025d = obj;
            this.f2026e = hVar;
            this.f2027f = arrayList;
            this.g = view;
            this.h = fragment;
            this.i = fragment2;
            this.j = z;
            this.k = arrayList2;
            this.l = obj2;
            this.m = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.d.a<String, View> aVarH = x.h(this.f2023b, this.f2024c, this.f2025d, this.f2026e);
            if (aVarH != null) {
                this.f2027f.addAll(aVarH.values());
                this.f2027f.add(this.g);
            }
            x.f(this.h, this.i, this.j, aVarH, false);
            Object obj = this.f2025d;
            if (obj != null) {
                this.f2023b.A(obj, this.k, this.f2027f);
                View viewS = x.s(aVarH, this.f2026e, this.l, this.j);
                if (viewS != null) {
                    this.f2023b.k(viewS, this.m);
                }
            }
        }
    }

    interface g {
        void a(Fragment fragment, a.g.h.b bVar);

        void b(Fragment fragment, a.g.h.b bVar);
    }

    static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Fragment f2028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f2029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.fragment.app.a f2030c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Fragment f2031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f2032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.fragment.app.a f2033f;

        h() {
        }
    }

    static {
        f2004b = Build.VERSION.SDK_INT >= 21 ? new y() : null;
        f2005c = w();
    }

    static void A(ArrayList<View> arrayList, int i) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i);
        }
    }

    static void B(Context context, androidx.fragment.app.g gVar, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, g gVar2) {
        ViewGroup viewGroup;
        SparseArray sparseArray = new SparseArray();
        for (int i3 = i; i3 < i2; i3++) {
            androidx.fragment.app.a aVar = arrayList.get(i3);
            if (arrayList2.get(i3).booleanValue()) {
                e(aVar, sparseArray, z);
            } else {
                c(aVar, sparseArray, z);
            }
        }
        if (sparseArray.size() != 0) {
            View view = new View(context);
            int size = sparseArray.size();
            for (int i4 = 0; i4 < size; i4++) {
                int iKeyAt = sparseArray.keyAt(i4);
                a.d.a<String, String> aVarD = d(iKeyAt, arrayList, arrayList2, i, i2);
                h hVar = (h) sparseArray.valueAt(i4);
                if (gVar.i() && (viewGroup = (ViewGroup) gVar.g(iKeyAt)) != null) {
                    if (z) {
                        o(viewGroup, hVar, view, aVarD, gVar2);
                    } else {
                        n(viewGroup, hVar, view, aVarD, gVar2);
                    }
                }
            }
        }
    }

    private static void a(ArrayList<View> arrayList, a.d.a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View viewM = aVar.m(size);
            if (collection.contains(a.g.l.v.L(viewM))) {
                arrayList.add(viewM);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0057  */
    /* JADX WARN: Code duplicated, block: B:55:0x006e  */
    /* JADX WARN: Code duplicated, block: B:56:0x0070  */
    /* JADX WARN: Code duplicated, block: B:62:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x007f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0082  */
    /* JADX WARN: Code duplicated, block: B:68:0x008a  */
    /* JADX WARN: Code duplicated, block: B:69:0x008c  */
    private static void b(androidx.fragment.app.a aVar, w.a aVar2, SparseArray<h> sparseArray, boolean z, boolean z2) {
        int i;
        boolean z3;
        boolean z4;
        boolean z5;
        View view;
        boolean z6;
        Fragment fragment = aVar2.f1998b;
        if (fragment == null || (i = fragment.z) == 0) {
            return;
        }
        int i2 = z ? f2003a[aVar2.f1997a] : aVar2.f1997a;
        boolean z7 = false;
        boolean z8 = true;
        if (i2 == 1) {
            if (z2) {
                z3 = fragment.O;
            } else if (!fragment.n || fragment.B) {
                z3 = false;
            } else {
                z3 = true;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        } else if (i2 == 3) {
            boolean z9 = fragment.n;
            if (z2 ? !z9 || fragment.B : z9 || (view = fragment.J) == null || view.getVisibility() != 0 || fragment.Q < 0.0f) {
                z6 = false;
            } else {
                z6 = true;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 == 4) {
            if (!z2 ? !(!fragment.n || fragment.B) : fragment.P && fragment.n && fragment.B) {
                z6 = false;
            } else {
                z6 = true;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 == 5) {
            if (!z2) {
                z3 = fragment.B;
            } else if (fragment.P && !fragment.B && fragment.n) {
                z3 = true;
            } else {
                z3 = false;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        } else if (i2 == 6) {
            boolean z10 = fragment.n;
            if (z2) {
                z6 = false;
            } else {
                z6 = false;
            }
            z4 = z6;
            z5 = true;
            z8 = false;
        } else if (i2 != 7) {
            z5 = false;
            z8 = false;
            z4 = false;
        } else {
            if (z2) {
                z3 = fragment.O;
            } else {
                if (fragment.n) {
                }
                z3 = false;
            }
            z4 = false;
            z7 = z3;
            z5 = false;
        }
        h hVarP = sparseArray.get(i);
        if (z7) {
            hVarP = p(hVarP, sparseArray, i);
            hVarP.f2028a = fragment;
            hVarP.f2029b = z;
            hVarP.f2030c = aVar;
        }
        if (!z2 && z8) {
            if (hVarP != null && hVarP.f2031d == fragment) {
                hVarP.f2031d = null;
            }
            if (!aVar.r) {
                n nVar = aVar.t;
                nVar.q0().p(nVar.v(fragment));
                nVar.N0(fragment);
            }
        }
        if (z4 && (hVarP == null || hVarP.f2031d == null)) {
            hVarP = p(hVarP, sparseArray, i);
            hVarP.f2031d = fragment;
            hVarP.f2032e = z;
            hVarP.f2033f = aVar;
        }
        if (z2 || !z5 || hVarP == null || hVarP.f2028a != fragment) {
            return;
        }
        hVarP.f2028a = null;
    }

    public static void c(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        int size = aVar.f1993c.size();
        for (int i = 0; i < size; i++) {
            b(aVar, aVar.f1993c.get(i), sparseArray, false, z);
        }
    }

    private static a.d.a<String, String> d(int i, ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList<String> arrayList4;
        a.d.a<String, String> aVar = new a.d.a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            androidx.fragment.app.a aVar2 = arrayList.get(i4);
            if (aVar2.x(i)) {
                boolean zBooleanValue = arrayList2.get(i4).booleanValue();
                ArrayList<String> arrayList5 = aVar2.p;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (zBooleanValue) {
                        arrayList3 = aVar2.p;
                        arrayList4 = aVar2.q;
                    } else {
                        ArrayList<String> arrayList6 = aVar2.p;
                        arrayList3 = aVar2.q;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = arrayList4.get(i5);
                        String str2 = arrayList3.get(i5);
                        String strRemove = aVar.remove(str2);
                        if (strRemove != null) {
                            aVar.put(str, strRemove);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    public static void e(androidx.fragment.app.a aVar, SparseArray<h> sparseArray, boolean z) {
        if (aVar.t.n0().i()) {
            for (int size = aVar.f1993c.size() - 1; size >= 0; size--) {
                b(aVar, aVar.f1993c.get(size), sparseArray, true, z);
            }
        }
    }

    static void f(Fragment fragment, Fragment fragment2, boolean z, a.d.a<String, View> aVar, boolean z2) {
        if ((z ? fragment2.t() : fragment.t()) != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = aVar == null ? 0 : aVar.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(aVar.i(i));
                arrayList.add(aVar.m(i));
            }
            throw null;
        }
    }

    private static boolean g(z zVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zVar.e(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    static a.d.a<String, View> h(z zVar, a.d.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.k kVarT;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f2028a;
        View viewS = fragment.S();
        if (aVar.isEmpty() || obj == null || viewS == null) {
            aVar.clear();
            return null;
        }
        a.d.a<String, View> aVar2 = new a.d.a<>();
        zVar.j(aVar2, viewS);
        androidx.fragment.app.a aVar3 = hVar.f2030c;
        if (hVar.f2029b) {
            kVarT = fragment.w();
            arrayList = aVar3.p;
        } else {
            kVarT = fragment.t();
            arrayList = aVar3.q;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
            aVar2.o(aVar.values());
        }
        if (kVarT != null) {
            throw null;
        }
        x(aVar, aVar2);
        return aVar2;
    }

    private static a.d.a<String, View> i(z zVar, a.d.a<String, String> aVar, Object obj, h hVar) {
        androidx.core.app.k kVarW;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f2031d;
        a.d.a<String, View> aVar2 = new a.d.a<>();
        zVar.j(aVar2, fragment.m1());
        androidx.fragment.app.a aVar3 = hVar.f2033f;
        if (hVar.f2032e) {
            kVarW = fragment.t();
            arrayList = aVar3.q;
        } else {
            kVarW = fragment.w();
            arrayList = aVar3.p;
        }
        if (arrayList != null) {
            aVar2.o(arrayList);
        }
        if (kVarW != null) {
            throw null;
        }
        aVar.o(aVar2.keySet());
        return aVar2;
    }

    private static z j(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object objV = fragment.v();
            if (objV != null) {
                arrayList.add(objV);
            }
            Object objL = fragment.L();
            if (objL != null) {
                arrayList.add(objL);
            }
            Object objN = fragment.N();
            if (objN != null) {
                arrayList.add(objN);
            }
        }
        if (fragment2 != null) {
            Object objS = fragment2.s();
            if (objS != null) {
                arrayList.add(objS);
            }
            Object objJ = fragment2.J();
            if (objJ != null) {
                arrayList.add(objJ);
            }
            Object objM = fragment2.M();
            if (objM != null) {
                arrayList.add(objM);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        z zVar = f2004b;
        if (zVar != null && g(zVar, arrayList)) {
            return zVar;
        }
        z zVar2 = f2005c;
        if (zVar2 != null && g(zVar2, arrayList)) {
            return zVar2;
        }
        if (zVar == null && zVar2 == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    static ArrayList<View> k(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View viewS = fragment.S();
        if (viewS != null) {
            zVar.f(arrayList2, viewS);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        zVar.b(obj, arrayList2);
        return arrayList2;
    }

    private static Object l(z zVar, ViewGroup viewGroup, View view, a.d.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Rect rect;
        Fragment fragment = hVar.f2028a;
        Fragment fragment2 = hVar.f2031d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f2029b;
        Object objT = aVar.isEmpty() ? null : t(zVar, fragment, fragment2, z);
        a.d.a<String, View> aVarI = i(zVar, aVar, objT, hVar);
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            arrayList.addAll(aVarI.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            rect = new Rect();
            zVar.z(obj3, view, arrayList);
            z(zVar, obj3, obj2, aVarI, hVar.f2032e, hVar.f2033f);
            if (obj != null) {
                zVar.u(obj, rect);
            }
        } else {
            rect = null;
        }
        a.g.l.t.a(viewGroup, new f(zVar, aVar, obj3, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect));
        return obj3;
    }

    private static Object m(z zVar, ViewGroup viewGroup, View view, a.d.a<String, String> aVar, h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        View view2;
        Rect rect;
        Fragment fragment = hVar.f2028a;
        Fragment fragment2 = hVar.f2031d;
        if (fragment != null) {
            fragment.m1().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar.f2029b;
        Object objT = aVar.isEmpty() ? null : t(zVar, fragment, fragment2, z);
        a.d.a<String, View> aVarI = i(zVar, aVar, objT, hVar);
        a.d.a<String, View> aVarH = h(zVar, aVar, objT, hVar);
        if (aVar.isEmpty()) {
            if (aVarI != null) {
                aVarI.clear();
            }
            if (aVarH != null) {
                aVarH.clear();
            }
            obj3 = null;
        } else {
            a(arrayList, aVarI, aVar.keySet());
            a(arrayList2, aVarH, aVar.values());
            obj3 = objT;
        }
        if (obj == null && obj2 == null && obj3 == null) {
            return null;
        }
        f(fragment, fragment2, z, aVarI, true);
        if (obj3 != null) {
            arrayList2.add(view);
            zVar.z(obj3, view, arrayList);
            z(zVar, obj3, obj2, aVarI, hVar.f2032e, hVar.f2033f);
            Rect rect2 = new Rect();
            View viewS = s(aVarH, hVar, obj, z);
            if (viewS != null) {
                zVar.u(obj, rect2);
            }
            rect = rect2;
            view2 = viewS;
        } else {
            view2 = null;
            rect = null;
        }
        a.g.l.t.a(viewGroup, new e(fragment, fragment2, z, aVarH, view2, zVar, rect));
        return obj3;
    }

    private static void n(ViewGroup viewGroup, h hVar, View view, a.d.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2028a;
        Fragment fragment2 = hVar.f2031d;
        z zVarJ = j(fragment2, fragment);
        if (zVarJ == null) {
            return;
        }
        boolean z = hVar.f2029b;
        boolean z2 = hVar.f2032e;
        Object objQ = q(zVarJ, fragment, z);
        Object objR = r(zVarJ, fragment2, z2);
        ArrayList arrayList = new ArrayList();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objL = l(zVarJ, viewGroup, view, aVar, hVar, arrayList, arrayList2, objQ, objR);
        if (objQ == null && objL == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(zVarJ, obj, fragment2, arrayList, view);
        if (arrayListK == null || arrayListK.isEmpty()) {
            obj = null;
        }
        Object obj2 = obj;
        zVarJ.a(objQ, view);
        Object objU = u(zVarJ, objQ, obj2, objL, fragment, hVar.f2029b);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList.size() > 0)) {
            a.g.h.b bVar = new a.g.h.b();
            gVar.b(fragment2, bVar);
            zVarJ.w(fragment2, objU, bVar, new c(gVar, fragment2, bVar));
        }
        if (objU != null) {
            ArrayList<View> arrayList3 = new ArrayList<>();
            zVarJ.t(objU, objQ, arrayList3, obj2, arrayListK, objL, arrayList2);
            y(zVarJ, viewGroup, fragment, view, arrayList2, objQ, arrayList3, obj2, arrayListK);
            zVarJ.x(viewGroup, arrayList2, aVar);
            zVarJ.c(viewGroup, objU);
            zVarJ.s(viewGroup, arrayList2, aVar);
        }
    }

    private static void o(ViewGroup viewGroup, h hVar, View view, a.d.a<String, String> aVar, g gVar) {
        Object obj;
        Fragment fragment = hVar.f2028a;
        Fragment fragment2 = hVar.f2031d;
        z zVarJ = j(fragment2, fragment);
        if (zVarJ == null) {
            return;
        }
        boolean z = hVar.f2029b;
        boolean z2 = hVar.f2032e;
        ArrayList<View> arrayList = new ArrayList<>();
        ArrayList<View> arrayList2 = new ArrayList<>();
        Object objQ = q(zVarJ, fragment, z);
        Object objR = r(zVarJ, fragment2, z2);
        Object objM = m(zVarJ, viewGroup, view, aVar, hVar, arrayList2, arrayList, objQ, objR);
        if (objQ == null && objM == null) {
            obj = objR;
            if (obj == null) {
                return;
            }
        } else {
            obj = objR;
        }
        ArrayList<View> arrayListK = k(zVarJ, obj, fragment2, arrayList2, view);
        ArrayList<View> arrayListK2 = k(zVarJ, objQ, fragment, arrayList, view);
        A(arrayListK2, 4);
        Object objU = u(zVarJ, objQ, obj, objM, fragment, z);
        if (fragment2 != null && arrayListK != null && (arrayListK.size() > 0 || arrayList2.size() > 0)) {
            a.g.h.b bVar = new a.g.h.b();
            gVar.b(fragment2, bVar);
            zVarJ.w(fragment2, objU, bVar, new a(gVar, fragment2, bVar));
        }
        if (objU != null) {
            v(zVarJ, obj, fragment2, arrayListK);
            ArrayList<String> arrayListO = zVarJ.o(arrayList);
            zVarJ.t(objU, objQ, arrayListK2, obj, arrayListK, objM, arrayList);
            zVarJ.c(viewGroup, objU);
            zVarJ.y(viewGroup, arrayList2, arrayList, arrayListO, aVar);
            A(arrayListK2, 0);
            zVarJ.A(objM, arrayList2, arrayList);
        }
    }

    private static h p(h hVar, SparseArray<h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }

    private static Object q(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.J() : fragment.s());
    }

    private static Object r(z zVar, Fragment fragment, boolean z) {
        if (fragment == null) {
            return null;
        }
        return zVar.g(z ? fragment.L() : fragment.v());
    }

    static View s(a.d.a<String, View> aVar, h hVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        androidx.fragment.app.a aVar2 = hVar.f2030c;
        if (obj == null || aVar == null || (arrayList = aVar2.p) == null || arrayList.isEmpty()) {
            return null;
        }
        return aVar.get((z ? aVar2.p : aVar2.q).get(0));
    }

    private static Object t(z zVar, Fragment fragment, Fragment fragment2, boolean z) {
        if (fragment == null || fragment2 == null) {
            return null;
        }
        return zVar.B(zVar.g(z ? fragment2.N() : fragment.M()));
    }

    private static Object u(z zVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean zL;
        if (obj == null || obj2 == null || fragment == null) {
            zL = true;
        } else {
            zL = z ? fragment.l() : fragment.k();
        }
        return zL ? zVar.n(obj2, obj, obj3) : zVar.m(obj2, obj, obj3);
    }

    private static void v(z zVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.n && fragment.B && fragment.P) {
            fragment.v1(true);
            zVar.r(obj, fragment.S(), arrayList);
            a.g.l.t.a(fragment.I, new b(arrayList));
        }
    }

    private static z w() {
        try {
            return (z) Class.forName("a.q.e").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    static void x(a.d.a<String, String> aVar, a.d.a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey(aVar.m(size))) {
                aVar.k(size);
            }
        }
    }

    private static void y(z zVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        a.g.l.t.a(viewGroup, new d(obj, zVar, view, fragment, arrayList, arrayList2, arrayList3, obj2));
    }

    private static void z(z zVar, Object obj, Object obj2, a.d.a<String, View> aVar, boolean z, androidx.fragment.app.a aVar2) {
        ArrayList<String> arrayList = aVar2.p;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        View view = aVar.get((z ? aVar2.q : aVar2.p).get(0));
        zVar.v(obj, view);
        if (obj2 != null) {
            zVar.v(obj2, view);
        }
    }
}
