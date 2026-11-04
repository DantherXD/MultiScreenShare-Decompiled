package a.g.l;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final View.AccessibilityDelegate f605a = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.AccessibilityDelegate f606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View.AccessibilityDelegate f607c;

    /* JADX INFO: renamed from: a.g.l.a$a, reason: collision with other inner class name */
    static final class C0018a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f608a;

        C0018a(a aVar) {
            this.f608a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f608a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            a.g.l.e0.d dVarB = this.f608a.b(view);
            if (dVarB != null) {
                return (AccessibilityNodeProvider) dVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f608a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            a.g.l.e0.c cVarV0 = a.g.l.e0.c.v0(accessibilityNodeInfo);
            cVarV0.m0(v.W(view));
            cVarV0.f0(v.R(view));
            cVarV0.j0(v.p(view));
            cVarV0.q0(v.K(view));
            this.f608a.g(view, cVarV0);
            cVarV0.e(accessibilityNodeInfo.getText(), view);
            List<a.g.l.e0.c.a> listC = a.c(view);
            for (int i = 0; i < listC.size(); i++) {
                cVarV0.b(listC.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f608a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f608a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f608a.j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f608a.l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f608a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f605a);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f606b = accessibilityDelegate;
        this.f607c = new C0018a(this);
    }

    static List<a.g.l.e0.c.a> c(View view) {
        List<a.g.l.e0.c.a> list = (List) view.getTag(a.g.b.H);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrP = a.g.l.e0.c.p(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; clickableSpanArrP != null && i < clickableSpanArrP.length; i++) {
                if (clickableSpan.equals(clickableSpanArrP[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(a.g.b.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f606b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a.g.l.e0.d b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT < 16 || (accessibilityNodeProvider = this.f606b.getAccessibilityNodeProvider(view)) == null) {
            return null;
        }
        return new a.g.l.e0.d(accessibilityNodeProvider);
    }

    View.AccessibilityDelegate d() {
        return this.f607c;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f606b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, a.g.l.e0.c cVar) {
        this.f606b.onInitializeAccessibilityNodeInfo(view, cVar.u0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f606b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f606b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i, Bundle bundle) {
        List<a.g.l.e0.c.a> listC = c(view);
        boolean zPerformAccessibilityAction = false;
        for (int i2 = 0; i2 < listC.size(); i2++) {
            a.g.l.e0.c.a aVar = listC.get(i2);
            if (aVar.b() == i) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
        }
        if (!zPerformAccessibilityAction && Build.VERSION.SDK_INT >= 16) {
            zPerformAccessibilityAction = this.f606b.performAccessibilityAction(view, i, bundle);
        }
        return (zPerformAccessibilityAction || i != a.g.b.f433a) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i) {
        this.f606b.sendAccessibilityEvent(view, i);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f606b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
