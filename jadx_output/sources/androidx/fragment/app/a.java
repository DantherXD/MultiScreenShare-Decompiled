package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class a extends w implements n.o {
    final n t;
    boolean u;
    int v;

    a(n nVar) {
        super(nVar.p0(), nVar.s0() != null ? nVar.s0().k().getClassLoader() : null);
        this.v = -1;
        this.t = nVar;
    }

    private static boolean z(w.a aVar) {
        Fragment fragment = aVar.f1998b;
        return (fragment == null || !fragment.n || fragment.J == null || fragment.C || fragment.B || !fragment.a0()) ? false : true;
    }

    boolean A() {
        for (int i = 0; i < this.f1993c.size(); i++) {
            if (z(this.f1993c.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void B() {
        if (this.s != null) {
            for (int i = 0; i < this.s.size(); i++) {
                this.s.get(i).run();
            }
            this.s = null;
        }
    }

    void C(Fragment.h hVar) {
        for (int i = 0; i < this.f1993c.size(); i++) {
            w.a aVar = this.f1993c.get(i);
            if (z(aVar)) {
                aVar.f1998b.x1(hVar);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0027  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    Fragment D(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f1993c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f1993c.get(size);
            int i = aVar.f1997a;
            if (i == 1) {
                arrayList.remove(aVar.f1998b);
            } else if (i != 3) {
                switch (i) {
                    case 6:
                        arrayList.add(aVar.f1998b);
                        break;
                    case 7:
                        arrayList.remove(aVar.f1998b);
                        break;
                    case 8:
                        fragment = null;
                        break;
                    case 9:
                        fragment = aVar.f1998b;
                        break;
                    case 10:
                        aVar.h = aVar.g;
                        break;
                }
            } else {
                arrayList.add(aVar.f1998b);
            }
        }
        return fragment;
    }

    @Override // androidx.fragment.app.n.o
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (n.E0(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.i) {
            return true;
        }
        this.t.e(this);
        return true;
    }

    @Override // androidx.fragment.app.w
    public int f() {
        return q(false);
    }

    @Override // androidx.fragment.app.w
    public int g() {
        return q(true);
    }

    @Override // androidx.fragment.app.w
    public void h() {
        j();
        this.t.b0(this, false);
    }

    @Override // androidx.fragment.app.w
    public void i() {
        j();
        this.t.b0(this, true);
    }

    @Override // androidx.fragment.app.w
    void k(int i, Fragment fragment, String str, int i2) {
        super.k(i, fragment, str, i2);
        fragment.u = this.t;
    }

    @Override // androidx.fragment.app.w
    public w l(Fragment fragment) {
        n nVar = fragment.u;
        if (nVar == null || nVar == this.t) {
            return super.l(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void p(int i) {
        if (this.i) {
            if (n.E0(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            int size = this.f1993c.size();
            for (int i2 = 0; i2 < size; i2++) {
                w.a aVar = this.f1993c.get(i2);
                Fragment fragment = aVar.f1998b;
                if (fragment != null) {
                    fragment.t += i;
                    if (n.E0(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f1998b + " to " + aVar.f1998b.t);
                    }
                }
            }
        }
    }

    int q(boolean z) {
        if (this.u) {
            throw new IllegalStateException("commit already called");
        }
        if (n.E0(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
            r("  ", printWriter);
            printWriter.close();
        }
        this.u = true;
        this.v = this.i ? this.t.i() : -1;
        this.t.Y(this, z);
        return this.v;
    }

    public void r(String str, PrintWriter printWriter) {
        s(str, printWriter, true);
    }

    public void s(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.k);
            printWriter.print(" mIndex=");
            printWriter.print(this.v);
            printWriter.print(" mCommitted=");
            printWriter.println(this.u);
            if (this.h != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.h));
            }
            if (this.f1994d != 0 || this.f1995e != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1994d));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1995e));
            }
            if (this.f1996f != 0 || this.g != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1996f));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.g));
            }
            if (this.l != 0 || this.m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.l));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.m);
            }
            if (this.n != 0 || this.o != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.n));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.o);
            }
        }
        if (this.f1993c.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f1993c.size();
        for (int i = 0; i < size; i++) {
            w.a aVar = this.f1993c.get(i);
            switch (aVar.f1997a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f1997a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f1998b);
            if (z) {
                if (aVar.f1999c != 0 || aVar.f2000d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f1999c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2000d));
                }
                if (aVar.f2001e != 0 || aVar.f2002f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f2001e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f2002f));
                }
            }
        }
    }

    void t() {
        int size = this.f1993c.size();
        for (int i = 0; i < size; i++) {
            w.a aVar = this.f1993c.get(i);
            Fragment fragment = aVar.f1998b;
            if (fragment != null) {
                fragment.y1(false);
                fragment.w1(this.h);
                fragment.A1(this.p, this.q);
            }
            switch (aVar.f1997a) {
                case 1:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.f1(fragment, false);
                    this.t.g(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1997a);
                case 3:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.Y0(fragment);
                    break;
                case 4:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.B0(fragment);
                    break;
                case 5:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.f1(fragment, false);
                    this.t.j1(fragment);
                    break;
                case 6:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.x(fragment);
                    break;
                case 7:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.f1(fragment, false);
                    this.t.k(fragment);
                    break;
                case 8:
                    this.t.h1(fragment);
                    break;
                case 9:
                    this.t.h1(null);
                    break;
                case 10:
                    this.t.g1(fragment, aVar.h);
                    break;
            }
            if (!this.r && aVar.f1997a != 1 && fragment != null && !n.f1938b) {
                this.t.L0(fragment);
            }
        }
        if (this.r || n.f1938b) {
            return;
        }
        n nVar = this.t;
        nVar.M0(nVar.s, true);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.v >= 0) {
            sb.append(" #");
            sb.append(this.v);
        }
        if (this.k != null) {
            sb.append(" ");
            sb.append(this.k);
        }
        sb.append("}");
        return sb.toString();
    }

    void u(boolean z) {
        for (int size = this.f1993c.size() - 1; size >= 0; size--) {
            w.a aVar = this.f1993c.get(size);
            Fragment fragment = aVar.f1998b;
            if (fragment != null) {
                fragment.y1(true);
                fragment.w1(n.c1(this.h));
                fragment.A1(this.q, this.p);
            }
            switch (aVar.f1997a) {
                case 1:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.f1(fragment, true);
                    this.t.Y0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f1997a);
                case 3:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.g(fragment);
                    break;
                case 4:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.j1(fragment);
                    break;
                case 5:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.f1(fragment, true);
                    this.t.B0(fragment);
                    break;
                case 6:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.k(fragment);
                    break;
                case 7:
                    fragment.r1(aVar.f1999c, aVar.f2000d, aVar.f2001e, aVar.f2002f);
                    this.t.f1(fragment, true);
                    this.t.x(fragment);
                    break;
                case 8:
                    this.t.h1(null);
                    break;
                case 9:
                    this.t.h1(fragment);
                    break;
                case 10:
                    this.t.g1(fragment, aVar.g);
                    break;
            }
            if (!this.r && aVar.f1997a != 3 && fragment != null && !n.f1938b) {
                this.t.L0(fragment);
            }
        }
        if (this.r || !z || n.f1938b) {
            return;
        }
        n nVar = this.t;
        nVar.M0(nVar.s, true);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b2  */
    Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.f1993c.size()) {
            w.a aVar = this.f1993c.get(i);
            int i2 = aVar.f1997a;
            if (i2 == 1) {
                arrayList.add(aVar.f1998b);
            } else if (i2 == 2) {
                Fragment fragment3 = aVar.f1998b;
                int i3 = fragment3.z;
                boolean z = false;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    Fragment fragment4 = arrayList.get(size);
                    if (fragment4.z == i3) {
                        if (fragment4 == fragment3) {
                            z = true;
                        } else {
                            if (fragment4 == fragment2) {
                                this.f1993c.add(i, new w.a(9, fragment4));
                                i++;
                                fragment2 = null;
                            }
                            w.a aVar2 = new w.a(3, fragment4);
                            aVar2.f1999c = aVar.f1999c;
                            aVar2.f2001e = aVar.f2001e;
                            aVar2.f2000d = aVar.f2000d;
                            aVar2.f2002f = aVar.f2002f;
                            this.f1993c.add(i, aVar2);
                            arrayList.remove(fragment4);
                            i++;
                        }
                    }
                }
                if (z) {
                    this.f1993c.remove(i);
                    i--;
                } else {
                    aVar.f1997a = 1;
                    arrayList.add(fragment3);
                }
            } else if (i2 == 3 || i2 == 6) {
                arrayList.remove(aVar.f1998b);
                Fragment fragment5 = aVar.f1998b;
                if (fragment5 == fragment2) {
                    this.f1993c.add(i, new w.a(9, fragment5));
                    i++;
                    fragment2 = null;
                }
            } else if (i2 == 7) {
                arrayList.add(aVar.f1998b);
            } else if (i2 == 8) {
                this.f1993c.add(i, new w.a(9, fragment2));
                i++;
                fragment2 = aVar.f1998b;
            }
            i++;
        }
        return fragment2;
    }

    public String w() {
        return this.k;
    }

    boolean x(int i) {
        int size = this.f1993c.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragment = this.f1993c.get(i2).f1998b;
            int i3 = fragment != null ? fragment.z : 0;
            if (i3 != 0 && i3 == i) {
                return true;
            }
        }
        return false;
    }

    boolean y(ArrayList<a> arrayList, int i, int i2) {
        if (i2 == i) {
            return false;
        }
        int size = this.f1993c.size();
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            Fragment fragment = this.f1993c.get(i4).f1998b;
            int i5 = fragment != null ? fragment.z : 0;
            if (i5 != 0 && i5 != i3) {
                for (int i6 = i; i6 < i2; i6++) {
                    a aVar = arrayList.get(i6);
                    int size2 = aVar.f1993c.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        Fragment fragment2 = aVar.f1993c.get(i7).f1998b;
                        if ((fragment2 != null ? fragment2.z : 0) == i5) {
                            return true;
                        }
                    }
                }
                i3 = i5;
            }
        }
        return false;
    }
}
