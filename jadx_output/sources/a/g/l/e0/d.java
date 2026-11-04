package a.g.l.e0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f658a;

    static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final d f659a;

        a(d dVar) {
            this.f659a = dVar;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            a.g.l.e0.c cVarB = this.f659a.b(i);
            if (cVarB == null) {
                return null;
            }
            return cVarB.u0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<a.g.l.e0.c> listC = this.f659a.c(str, i);
            if (listC == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listC.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listC.get(i2).u0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f659a.f(i, i2, bundle);
        }
    }

    static class b extends a {
        b(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            a.g.l.e0.c cVarD = this.f659a.d(i);
            if (cVarD == null) {
                return null;
            }
            return cVarD.u0();
        }
    }

    static class c extends b {
        c(d dVar) {
            super(dVar);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f659a.a(i, a.g.l.e0.c.v0(accessibilityNodeInfo), str, bundle);
        }
    }

    public d() {
        int i = Build.VERSION.SDK_INT;
        this.f658a = i >= 26 ? new c(this) : i >= 19 ? new b(this) : i >= 16 ? new a(this) : null;
    }

    public d(Object obj) {
        this.f658a = obj;
    }

    public void a(int i, a.g.l.e0.c cVar, String str, Bundle bundle) {
    }

    public a.g.l.e0.c b(int i) {
        return null;
    }

    public List<a.g.l.e0.c> c(String str, int i) {
        return null;
    }

    public a.g.l.e0.c d(int i) {
        return null;
    }

    public Object e() {
        return this.f658a;
    }

    public boolean f(int i, int i2, Bundle bundle) {
        return false;
    }
}
