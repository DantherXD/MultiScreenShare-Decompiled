package a.q;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f906a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ThreadLocal<WeakReference<a.d.a<ViewGroup, ArrayList<m>>>> f907b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static ArrayList<ViewGroup> f908c = new ArrayList<>();

    private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        m f909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ViewGroup f910c;

        /* JADX INFO: renamed from: a.q.o$a$a, reason: collision with other inner class name */
        class C0035a extends n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a.d.a f911a;

            C0035a(a.d.a aVar) {
                this.f911a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // a.q.m.f
            public void e(m mVar) {
                ((ArrayList) this.f911a.get(a.this.f910c)).remove(mVar);
                mVar.P(this);
            }
        }

        a(m mVar, ViewGroup viewGroup) {
            this.f909b = mVar;
            this.f910c = viewGroup;
        }

        private void a() {
            this.f910c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f910c.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            a();
            if (!o.f908c.remove(this.f910c)) {
                return true;
            }
            a.d.a<ViewGroup, ArrayList<m>> aVarB = o.b();
            ArrayList<m> arrayList = aVarB.get(this.f910c);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                aVarB.put(this.f910c, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f909b);
            this.f909b.a(new C0035a(aVarB));
            this.f909b.k(this.f910c, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).R(this.f910c);
                }
            }
            this.f909b.O(this.f910c);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a();
            o.f908c.remove(this.f910c);
            ArrayList<m> arrayList = o.b().get(this.f910c);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<m> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().R(this.f910c);
                }
            }
            this.f909b.l(true);
        }
    }

    public static void a(ViewGroup viewGroup, m mVar) {
        if (f908c.contains(viewGroup) || !a.g.l.v.T(viewGroup)) {
            return;
        }
        f908c.add(viewGroup);
        if (mVar == null) {
            mVar = f906a;
        }
        m mVarClone = mVar.clone();
        d(viewGroup, mVarClone);
        l.c(viewGroup, null);
        c(viewGroup, mVarClone);
    }

    static a.d.a<ViewGroup, ArrayList<m>> b() {
        a.d.a<ViewGroup, ArrayList<m>> aVar;
        WeakReference<a.d.a<ViewGroup, ArrayList<m>>> weakReference = f907b.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        a.d.a<ViewGroup, ArrayList<m>> aVar2 = new a.d.a<>();
        f907b.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    private static void c(ViewGroup viewGroup, m mVar) {
        if (mVar == null || viewGroup == null) {
            return;
        }
        a aVar = new a(mVar, viewGroup);
        viewGroup.addOnAttachStateChangeListener(aVar);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    private static void d(ViewGroup viewGroup, m mVar) {
        ArrayList<m> arrayList = b().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<m> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().N(viewGroup);
            }
        }
        if (mVar != null) {
            mVar.k(viewGroup, true);
        }
        l lVarB = l.b(viewGroup);
        if (lVarB != null) {
            lVarB.a();
        }
    }
}
