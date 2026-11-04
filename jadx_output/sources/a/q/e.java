package a.q;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public class e extends androidx.fragment.app.z {

    class a extends m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f844a;

        a(Rect rect) {
            this.f844a = rect;
        }
    }

    class b implements m.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f846a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f847b;

        b(View view, ArrayList arrayList) {
            this.f846a = view;
            this.f847b = arrayList;
        }

        @Override // a.q.m.f
        public void a(m mVar) {
        }

        @Override // a.q.m.f
        public void b(m mVar) {
        }

        @Override // a.q.m.f
        public void c(m mVar) {
        }

        @Override // a.q.m.f
        public void d(m mVar) {
        }

        @Override // a.q.m.f
        public void e(m mVar) {
            mVar.P(this);
            this.f846a.setVisibility(8);
            int size = this.f847b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f847b.get(i)).setVisibility(0);
            }
        }
    }

    class c extends n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f854f;

        c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f849a = obj;
            this.f850b = arrayList;
            this.f851c = obj2;
            this.f852d = arrayList2;
            this.f853e = obj3;
            this.f854f = arrayList3;
        }

        @Override // a.q.n, a.q.m.f
        public void c(m mVar) {
            Object obj = this.f849a;
            if (obj != null) {
                e.this.q(obj, this.f850b, null);
            }
            Object obj2 = this.f851c;
            if (obj2 != null) {
                e.this.q(obj2, this.f852d, null);
            }
            Object obj3 = this.f853e;
            if (obj3 != null) {
                e.this.q(obj3, this.f854f, null);
            }
        }

        @Override // a.q.m.f
        public void e(m mVar) {
            mVar.P(this);
        }
    }

    class d extends m.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Rect f855a;

        d(Rect rect) {
            this.f855a = rect;
        }
    }

    private static boolean C(m mVar) {
        return (androidx.fragment.app.z.l(mVar.z()) && androidx.fragment.app.z.l(mVar.A()) && androidx.fragment.app.z.l(mVar.B())) ? false : true;
    }

    @Override // androidx.fragment.app.z
    public void A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        q qVar = (q) obj;
        if (qVar != null) {
            qVar.C().clear();
            qVar.C().addAll(arrayList2);
            q(qVar, arrayList, arrayList2);
        }
    }

    @Override // androidx.fragment.app.z
    public Object B(Object obj) {
        if (obj == null) {
            return null;
        }
        q qVar = new q();
        qVar.e0((m) obj);
        return qVar;
    }

    @Override // androidx.fragment.app.z
    public void a(Object obj, View view) {
        if (obj != null) {
            ((m) obj).b(view);
        }
    }

    @Override // androidx.fragment.app.z
    public void b(Object obj, ArrayList<View> arrayList) {
        m mVar = (m) obj;
        if (mVar == null) {
            return;
        }
        int i = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int iH0 = qVar.h0();
            while (i < iH0) {
                b(qVar.g0(i), arrayList);
                i++;
            }
            return;
        }
        if (C(mVar) || !androidx.fragment.app.z.l(mVar.C())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            mVar.b(arrayList.get(i));
            i++;
        }
    }

    @Override // androidx.fragment.app.z
    public void c(ViewGroup viewGroup, Object obj) {
        o.a(viewGroup, (m) obj);
    }

    @Override // androidx.fragment.app.z
    public boolean e(Object obj) {
        return obj instanceof m;
    }

    @Override // androidx.fragment.app.z
    public Object g(Object obj) {
        if (obj != null) {
            return ((m) obj).clone();
        }
        return null;
    }

    @Override // androidx.fragment.app.z
    public Object m(Object obj, Object obj2, Object obj3) {
        m mVarM0 = (m) obj;
        m mVar = (m) obj2;
        m mVar2 = (m) obj3;
        if (mVarM0 != null && mVar != null) {
            mVarM0 = new q().e0(mVarM0).e0(mVar).m0(1);
        } else if (mVarM0 == null) {
            mVarM0 = mVar != null ? mVar : null;
        }
        if (mVar2 == null) {
            return mVarM0;
        }
        q qVar = new q();
        if (mVarM0 != null) {
            qVar.e0(mVarM0);
        }
        qVar.e0(mVar2);
        return qVar;
    }

    @Override // androidx.fragment.app.z
    public Object n(Object obj, Object obj2, Object obj3) {
        q qVar = new q();
        if (obj != null) {
            qVar.e0((m) obj);
        }
        if (obj2 != null) {
            qVar.e0((m) obj2);
        }
        if (obj3 != null) {
            qVar.e0((m) obj3);
        }
        return qVar;
    }

    @Override // androidx.fragment.app.z
    public void p(Object obj, View view) {
        if (obj != null) {
            ((m) obj).Q(view);
        }
    }

    @Override // androidx.fragment.app.z
    public void q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        m mVar = (m) obj;
        int i = 0;
        if (mVar instanceof q) {
            q qVar = (q) mVar;
            int iH0 = qVar.h0();
            while (i < iH0) {
                q(qVar.g0(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (C(mVar)) {
            return;
        }
        List<View> listC = mVar.C();
        if (listC.size() == arrayList.size() && listC.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                mVar.b(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                mVar.Q(arrayList.get(size2));
            }
        }
    }

    @Override // androidx.fragment.app.z
    public void r(Object obj, View view, ArrayList<View> arrayList) {
        ((m) obj).a(new b(view, arrayList));
    }

    @Override // androidx.fragment.app.z
    public void t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((m) obj).a(new c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // androidx.fragment.app.z
    public void u(Object obj, Rect rect) {
        if (obj != null) {
            ((m) obj).V(new d(rect));
        }
    }

    @Override // androidx.fragment.app.z
    public void v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            k(view, rect);
            ((m) obj).V(new a(rect));
        }
    }

    @Override // androidx.fragment.app.z
    public void z(Object obj, View view, ArrayList<View> arrayList) {
        q qVar = (q) obj;
        List<View> listC = qVar.C();
        listC.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            androidx.fragment.app.z.d(listC, arrayList.get(i));
        }
        listC.add(view);
        arrayList.add(view);
        b(qVar, arrayList);
    }
}
