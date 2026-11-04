package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Fragment> f1988a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<String, u> f1989b = new HashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private q f1990c;

    v() {
    }

    void a(Fragment fragment) {
        if (this.f1988a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1988a) {
            this.f1988a.add(fragment);
        }
        fragment.n = true;
    }

    void b() {
        this.f1989b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f1989b.get(str) != null;
    }

    void d(int i) {
        for (u uVar : this.f1989b.values()) {
            if (uVar != null) {
                uVar.t(i);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f1989b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u uVar : this.f1989b.values()) {
                printWriter.print(str);
                if (uVar != null) {
                    Fragment fragmentK = uVar.k();
                    printWriter.println(fragmentK);
                    fragmentK.f(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f1988a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = this.f1988a.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
    }

    Fragment f(String str) {
        u uVar = this.f1989b.get(str);
        if (uVar != null) {
            return uVar.k();
        }
        return null;
    }

    Fragment g(int i) {
        for (int size = this.f1988a.size() - 1; size >= 0; size--) {
            Fragment fragment = this.f1988a.get(size);
            if (fragment != null && fragment.y == i) {
                return fragment;
            }
        }
        for (u uVar : this.f1989b.values()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                if (fragmentK.y == i) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment h(String str) {
        if (str != null) {
            for (int size = this.f1988a.size() - 1; size >= 0; size--) {
                Fragment fragment = this.f1988a.get(size);
                if (fragment != null && str.equals(fragment.A)) {
                    return fragment;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (u uVar : this.f1989b.values()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                if (str.equals(fragmentK.A)) {
                    return fragmentK;
                }
            }
        }
        return null;
    }

    Fragment i(String str) {
        Fragment fragmentI;
        for (u uVar : this.f1989b.values()) {
            if (uVar != null && (fragmentI = uVar.k().i(str)) != null) {
                return fragmentI;
            }
        }
        return null;
    }

    int j(Fragment fragment) {
        View view;
        View view2;
        ViewGroup viewGroup = fragment.I;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f1988a.indexOf(fragment);
        for (int i = iIndexOf - 1; i >= 0; i--) {
            Fragment fragment2 = this.f1988a.get(i);
            if (fragment2.I == viewGroup && (view2 = fragment2.J) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f1988a.size()) {
                return -1;
            }
            Fragment fragment3 = this.f1988a.get(iIndexOf);
            if (fragment3.I == viewGroup && (view = fragment3.J) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List<u> k() {
        ArrayList arrayList = new ArrayList();
        for (u uVar : this.f1989b.values()) {
            if (uVar != null) {
                arrayList.add(uVar);
            }
        }
        return arrayList;
    }

    List<Fragment> l() {
        ArrayList arrayList = new ArrayList();
        Iterator<u> it = this.f1989b.values().iterator();
        while (it.hasNext()) {
            u next = it.next();
            arrayList.add(next != null ? next.k() : null);
        }
        return arrayList;
    }

    u m(String str) {
        return this.f1989b.get(str);
    }

    List<Fragment> n() {
        ArrayList arrayList;
        if (this.f1988a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1988a) {
            arrayList = new ArrayList(this.f1988a);
        }
        return arrayList;
    }

    q o() {
        return this.f1990c;
    }

    void p(u uVar) {
        Fragment fragmentK = uVar.k();
        if (c(fragmentK.h)) {
            return;
        }
        this.f1989b.put(fragmentK.h, uVar);
        if (fragmentK.E) {
            boolean z = fragmentK.D;
            q qVar = this.f1990c;
            if (z) {
                qVar.e(fragmentK);
            } else {
                qVar.m(fragmentK);
            }
            fragmentK.E = false;
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + fragmentK);
        }
    }

    void q(u uVar) {
        Fragment fragmentK = uVar.k();
        if (fragmentK.D) {
            this.f1990c.m(fragmentK);
        }
        if (this.f1989b.put(fragmentK.h, null) != null && n.E0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + fragmentK);
        }
    }

    void r() {
        Iterator<Fragment> it = this.f1988a.iterator();
        while (it.hasNext()) {
            u uVar = this.f1989b.get(it.next().h);
            if (uVar != null) {
                uVar.m();
            }
        }
        for (u uVar2 : this.f1989b.values()) {
            if (uVar2 != null) {
                uVar2.m();
                Fragment fragmentK = uVar2.k();
                if (fragmentK.o && !fragmentK.Y()) {
                    q(uVar2);
                }
            }
        }
    }

    void s(Fragment fragment) {
        synchronized (this.f1988a) {
            this.f1988a.remove(fragment);
        }
        fragment.n = false;
    }

    void t() {
        this.f1989b.clear();
    }

    void u(List<String> list) {
        this.f1988a.clear();
        if (list != null) {
            for (String str : list) {
                Fragment fragmentF = f(str);
                if (fragmentF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (n.E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + fragmentF);
                }
                a(fragmentF);
            }
        }
    }

    ArrayList<t> v() {
        ArrayList<t> arrayList = new ArrayList<>(this.f1989b.size());
        for (u uVar : this.f1989b.values()) {
            if (uVar != null) {
                Fragment fragmentK = uVar.k();
                t tVarR = uVar.r();
                arrayList.add(tVarR);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "Saved state of " + fragmentK + ": " + tVarR.n);
                }
            }
        }
        return arrayList;
    }

    ArrayList<String> w() {
        synchronized (this.f1988a) {
            if (this.f1988a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.f1988a.size());
            for (Fragment fragment : this.f1988a) {
                arrayList.add(fragment.h);
                if (n.E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + fragment.h + "): " + fragment);
                }
            }
            return arrayList;
        }
    }

    void x(q qVar) {
        this.f1990c = qVar;
    }
}
