package androidx.recyclerview.widget;

import a.g.l.v;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class k extends a.g.l.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final RecyclerView f2347d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f2348e;

    public static class a extends a.g.l.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final k f2349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map<View, a.g.l.a> f2350e = new WeakHashMap();

        public a(k kVar) {
            this.f2349d = kVar;
        }

        @Override // a.g.l.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.f2350e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // a.g.l.a
        public a.g.l.e0.d b(View view) {
            a.g.l.a aVar = this.f2350e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // a.g.l.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.f2350e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // a.g.l.a
        public void g(View view, a.g.l.e0.c cVar) {
            if (!this.f2349d.o() && this.f2349d.f2347d.getLayoutManager() != null) {
                this.f2349d.f2347d.getLayoutManager().O0(view, cVar);
                a.g.l.a aVar = this.f2350e.get(view);
                if (aVar != null) {
                    aVar.g(view, cVar);
                    return;
                }
            }
            super.g(view, cVar);
        }

        @Override // a.g.l.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.f2350e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // a.g.l.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.f2350e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // a.g.l.a
        public boolean j(View view, int i, Bundle bundle) {
            if (this.f2349d.o() || this.f2349d.f2347d.getLayoutManager() == null) {
                return super.j(view, i, bundle);
            }
            a.g.l.a aVar = this.f2350e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i, bundle)) {
                    return true;
                }
            } else if (super.j(view, i, bundle)) {
                return true;
            }
            return this.f2349d.f2347d.getLayoutManager().i1(view, i, bundle);
        }

        @Override // a.g.l.a
        public void l(View view, int i) {
            a.g.l.a aVar = this.f2350e.get(view);
            if (aVar != null) {
                aVar.l(view, i);
            } else {
                super.l(view, i);
            }
        }

        @Override // a.g.l.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            a.g.l.a aVar = this.f2350e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        a.g.l.a n(View view) {
            return this.f2350e.remove(view);
        }

        void o(View view) {
            a.g.l.a aVarL = v.l(view);
            if (aVarL == null || aVarL == this) {
                return;
            }
            this.f2350e.put(view, aVarL);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f2347d = recyclerView;
        a.g.l.a aVarN = n();
        this.f2348e = (aVarN == null || !(aVarN instanceof a)) ? new a(this) : (a) aVarN;
    }

    @Override // a.g.l.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().K0(accessibilityEvent);
        }
    }

    @Override // a.g.l.a
    public void g(View view, a.g.l.e0.c cVar) {
        super.g(view, cVar);
        if (o() || this.f2347d.getLayoutManager() == null) {
            return;
        }
        this.f2347d.getLayoutManager().M0(cVar);
    }

    @Override // a.g.l.a
    public boolean j(View view, int i, Bundle bundle) {
        if (super.j(view, i, bundle)) {
            return true;
        }
        if (o() || this.f2347d.getLayoutManager() == null) {
            return false;
        }
        return this.f2347d.getLayoutManager().g1(i, bundle);
    }

    public a.g.l.a n() {
        return this.f2348e;
    }

    boolean o() {
        return this.f2347d.l0();
    }
}
