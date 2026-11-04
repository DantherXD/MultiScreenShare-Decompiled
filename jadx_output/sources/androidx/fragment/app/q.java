package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class q extends androidx.lifecycle.p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final androidx.lifecycle.q.a f1971c = new a();
    private final boolean g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<String, Fragment> f1972d = new HashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<String, q> f1973e = new HashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, androidx.lifecycle.r> f1974f = new HashMap<>();
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    class a implements androidx.lifecycle.q.a {
        a() {
        }

        @Override // androidx.lifecycle.q.a
        public <T extends androidx.lifecycle.p> T a(Class<T> cls) {
            return new q(true);
        }
    }

    q(boolean z) {
        this.g = z;
    }

    static q i(androidx.lifecycle.r rVar) {
        return (q) new androidx.lifecycle.q(rVar, f1971c).a(q.class);
    }

    @Override // androidx.lifecycle.p
    protected void d() {
        if (n.E0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.h = true;
    }

    void e(Fragment fragment) {
        if (this.j) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1972d.containsKey(fragment.h)) {
                return;
            }
            this.f1972d.put(fragment.h, fragment);
            if (n.E0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + fragment);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        return this.f1972d.equals(qVar.f1972d) && this.f1973e.equals(qVar.f1973e) && this.f1974f.equals(qVar.f1974f);
    }

    void f(Fragment fragment) {
        if (n.E0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + fragment);
        }
        q qVar = this.f1973e.get(fragment.h);
        if (qVar != null) {
            qVar.d();
            this.f1973e.remove(fragment.h);
        }
        androidx.lifecycle.r rVar = this.f1974f.get(fragment.h);
        if (rVar != null) {
            rVar.a();
            this.f1974f.remove(fragment.h);
        }
    }

    Fragment g(String str) {
        return this.f1972d.get(str);
    }

    q h(Fragment fragment) {
        q qVar = this.f1973e.get(fragment.h);
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(this.g);
        this.f1973e.put(fragment.h, qVar2);
        return qVar2;
    }

    public int hashCode() {
        return (((this.f1972d.hashCode() * 31) + this.f1973e.hashCode()) * 31) + this.f1974f.hashCode();
    }

    Collection<Fragment> j() {
        return new ArrayList(this.f1972d.values());
    }

    androidx.lifecycle.r k(Fragment fragment) {
        androidx.lifecycle.r rVar = this.f1974f.get(fragment.h);
        if (rVar != null) {
            return rVar;
        }
        androidx.lifecycle.r rVar2 = new androidx.lifecycle.r();
        this.f1974f.put(fragment.h, rVar2);
        return rVar2;
    }

    boolean l() {
        return this.h;
    }

    void m(Fragment fragment) {
        if (this.j) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        if ((this.f1972d.remove(fragment.h) != null) && n.E0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + fragment);
        }
    }

    void n(boolean z) {
        this.j = z;
    }

    boolean o(Fragment fragment) {
        if (this.f1972d.containsKey(fragment.h)) {
            return this.g ? this.h : !this.i;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1972d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1973e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1974f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
