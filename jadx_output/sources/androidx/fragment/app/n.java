package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.OnBackPressedDispatcher;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f1937a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f1938b = true;
    private androidx.activity.result.c<Intent> B;
    private androidx.activity.result.c<?> C;
    private androidx.activity.result.c<String[]> D;
    private boolean F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private ArrayList<androidx.fragment.app.a> K;
    private ArrayList<Boolean> L;
    private ArrayList<Fragment> M;
    private ArrayList<q> N;
    private androidx.fragment.app.q O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1940d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<androidx.fragment.app.a> f1942f;
    private ArrayList<Fragment> g;
    private OnBackPressedDispatcher i;
    private ArrayList<InterfaceC0053n> n;
    private androidx.fragment.app.k<?> t;
    private androidx.fragment.app.g u;
    private Fragment v;
    Fragment w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList<o> f1939c = new ArrayList<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final v f1941e = new v();
    private final androidx.fragment.app.l h = new androidx.fragment.app.l(this);
    private final androidx.activity.b j = new c(false);
    private final AtomicInteger k = new AtomicInteger();
    private final Map<String, Bundle> l = Collections.synchronizedMap(new HashMap());
    private final Map<String, ?> m = Collections.synchronizedMap(new HashMap());
    private Map<Fragment, HashSet<a.g.h.b>> o = Collections.synchronizedMap(new HashMap());
    private final x.g p = new d();
    private final androidx.fragment.app.m q = new androidx.fragment.app.m(this);
    private final CopyOnWriteArrayList<r> r = new CopyOnWriteArrayList<>();
    int s = -1;
    private androidx.fragment.app.j x = null;
    private androidx.fragment.app.j y = new e();
    private d0 z = null;
    private d0 A = new f();
    ArrayDeque<m> E = new ArrayDeque<>();
    private Runnable P = new g();

    class a implements androidx.activity.result.b<androidx.activity.result.a> {
        a() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m mVarPollFirst = n.this.E.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No IntentSenders were started for " + this);
                return;
            }
            String str = mVarPollFirst.f1957b;
            int i = mVarPollFirst.f1958c;
            Fragment fragmentI = n.this.f1941e.i(str);
            if (fragmentI != null) {
                fragmentI.g0(i, aVar.k(), aVar.j());
                return;
            }
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    class b implements androidx.activity.result.b<Map<String, Boolean>> {
        b() {
        }

        @Override // androidx.activity.result.b
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Map<String, Boolean> map) {
            String str;
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
            }
            m mVarPollFirst = n.this.E.pollFirst();
            if (mVarPollFirst == null) {
                str = "No permissions were requested for " + this;
            } else {
                String str2 = mVarPollFirst.f1957b;
                int i2 = mVarPollFirst.f1958c;
                Fragment fragmentI = n.this.f1941e.i(str2);
                if (fragmentI != null) {
                    fragmentI.F0(i2, strArr, iArr);
                    return;
                }
                str = "Permission request result delivered for unknown Fragment " + str2;
            }
            Log.w("FragmentManager", str);
        }
    }

    class c extends androidx.activity.b {
        c(boolean z) {
            super(z);
        }

        @Override // androidx.activity.b
        public void b() {
            n.this.A0();
        }
    }

    class d implements x.g {
        d() {
        }

        @Override // androidx.fragment.app.x.g
        public void a(Fragment fragment, a.g.h.b bVar) {
            if (bVar.b()) {
                return;
            }
            n.this.X0(fragment, bVar);
        }

        @Override // androidx.fragment.app.x.g
        public void b(Fragment fragment, a.g.h.b bVar) {
            n.this.f(fragment, bVar);
        }
    }

    class e extends androidx.fragment.app.j {
        e() {
        }

        @Override // androidx.fragment.app.j
        public Fragment a(ClassLoader classLoader, String str) {
            return n.this.s0().f(n.this.s0().k(), str, null);
        }
    }

    class f implements d0 {
        f() {
        }

        @Override // androidx.fragment.app.d0
        public c0 a(ViewGroup viewGroup) {
            return new androidx.fragment.app.c(viewGroup);
        }
    }

    class g implements Runnable {
        g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n.this.a0(true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ViewGroup f1950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f1951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Fragment f1952c;

        h(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f1950a = viewGroup;
            this.f1951b = view;
            this.f1952c = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1950a.endViewTransition(this.f1951b);
            animator.removeListener(this);
            Fragment fragment = this.f1952c;
            View view = fragment.J;
            if (view == null || !fragment.B) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class i implements r {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Fragment f1954b;

        i(Fragment fragment) {
            this.f1954b = fragment;
        }

        @Override // androidx.fragment.app.r
        public void e(n nVar, Fragment fragment) {
            this.f1954b.j0(fragment);
        }
    }

    class j implements androidx.activity.result.b<androidx.activity.result.a> {
        j() {
        }

        @Override // androidx.activity.result.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.activity.result.a aVar) {
            m mVarPollFirst = n.this.E.pollFirst();
            if (mVarPollFirst == null) {
                Log.w("FragmentManager", "No Activities were started for result for " + this);
                return;
            }
            String str = mVarPollFirst.f1957b;
            int i = mVarPollFirst.f1958c;
            Fragment fragmentI = n.this.f1941e.i(str);
            if (fragmentI != null) {
                fragmentI.g0(i, aVar.k(), aVar.j());
                return;
            }
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
        }
    }

    static class k extends androidx.activity.result.f.a<?, androidx.activity.result.a> {
        k() {
        }

        @Override // androidx.activity.result.f.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public androidx.activity.result.a a(int i, Intent intent) {
            return new androidx.activity.result.a(i, intent);
        }
    }

    public static abstract class l {
    }

    @SuppressLint({"BanParcelableUsage"})
    static class m implements Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f1957b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1958c;

        class a implements Parcelable.Creator<m> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public m createFromParcel(Parcel parcel) {
                return new m(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public m[] newArray(int i) {
                return new m[i];
            }
        }

        m(Parcel parcel) {
            this.f1957b = parcel.readString();
            this.f1958c = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f1957b);
            parcel.writeInt(this.f1958c);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.n$n, reason: collision with other inner class name */
    public interface InterfaceC0053n {
        void a();
    }

    interface o {
        boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2);
    }

    private class p implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f1959a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f1960b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f1961c;

        p(String str, int i, int i2) {
            this.f1959a = str;
            this.f1960b = i;
            this.f1961c = i2;
        }

        @Override // androidx.fragment.app.n.o
        public boolean a(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = n.this.w;
            if (fragment == null || this.f1960b >= 0 || this.f1959a != null || !fragment.p().T0()) {
                return n.this.V0(arrayList, arrayList2, this.f1959a, this.f1960b, this.f1961c);
            }
            return false;
        }
    }

    static class q implements Fragment.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f1963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.fragment.app.a f1964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1965c;

        q(androidx.fragment.app.a aVar, boolean z) {
            this.f1963a = z;
            this.f1964b = aVar;
        }

        @Override // androidx.fragment.app.Fragment.h
        public void a() {
            int i = this.f1965c - 1;
            this.f1965c = i;
            if (i != 0) {
                return;
            }
            this.f1964b.t.e1();
        }

        @Override // androidx.fragment.app.Fragment.h
        public void b() {
            this.f1965c++;
        }

        void c() {
            androidx.fragment.app.a aVar = this.f1964b;
            aVar.t.t(aVar, this.f1963a, false, false);
        }

        void d() {
            boolean z = this.f1965c > 0;
            for (Fragment fragment : this.f1964b.t.r0()) {
                fragment.x1(null);
                if (z && fragment.a0()) {
                    fragment.B1();
                }
            }
            androidx.fragment.app.a aVar = this.f1964b;
            aVar.t.t(aVar, this.f1963a, !z, true);
        }

        public boolean e() {
            return this.f1965c == 0;
        }
    }

    static boolean E0(int i2) {
        return f1937a || Log.isLoggable("FragmentManager", i2);
    }

    private boolean F0(Fragment fragment) {
        return (fragment.F && fragment.G) || fragment.w.n();
    }

    private void K0(a.d.b<Fragment> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentH = bVar.h(i2);
            if (!fragmentH.n) {
                View viewM1 = fragmentH.m1();
                fragmentH.Q = viewM1.getAlpha();
                viewM1.setAlpha(0.0f);
            }
        }
    }

    private void L(Fragment fragment) {
        if (fragment == null || !fragment.equals(f0(fragment.h))) {
            return;
        }
        fragment.e1();
    }

    private void S(int i2) {
        try {
            this.f1940d = true;
            this.f1941e.d(i2);
            M0(i2, false);
            if (f1938b) {
                Iterator<c0> it = r().iterator();
                while (it.hasNext()) {
                    it.next().j();
                }
            }
            this.f1940d = false;
            a0(true);
        } catch (Throwable th) {
            this.f1940d = false;
            throw th;
        }
    }

    private boolean U0(String str, int i2, int i3) {
        a0(false);
        Z(true);
        Fragment fragment = this.w;
        if (fragment != null && i2 < 0 && str == null && fragment.p().T0()) {
            return true;
        }
        boolean zV0 = V0(this.K, this.L, str, i2, i3);
        if (zV0) {
            this.f1940d = true;
            try {
                Z0(this.K, this.L);
                p();
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        l1();
        V();
        this.f1941e.b();
        return zV0;
    }

    private void V() {
        if (this.J) {
            this.J = false;
            k1();
        }
    }

    private int W0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, a.d.b<Fragment> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            androidx.fragment.app.a aVar = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (aVar.A() && !aVar.y(arrayList, i5 + 1, i3)) {
                if (this.N == null) {
                    this.N = new ArrayList<>();
                }
                q qVar = new q(aVar, zBooleanValue);
                this.N.add(qVar);
                aVar.C(qVar);
                if (zBooleanValue) {
                    aVar.t();
                } else {
                    aVar.u(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, aVar);
                }
                d(bVar);
            }
        }
        return i4;
    }

    private void X() {
        if (f1938b) {
            Iterator<c0> it = r().iterator();
            while (it.hasNext()) {
                it.next().j();
            }
        } else {
            if (this.o.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.o.keySet()) {
                m(fragment);
                N0(fragment);
            }
        }
    }

    private void Z(boolean z) {
        if (this.f1940d) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.t == null) {
            if (!this.I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.t.l().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            o();
        }
        if (this.K == null) {
            this.K = new ArrayList<>();
            this.L = new ArrayList<>();
        }
        this.f1940d = true;
        try {
            e0(null, null);
        } finally {
            this.f1940d = false;
        }
    }

    private void Z0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        e0(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).r) {
                if (i3 != i2) {
                    d0(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).r) {
                        i3++;
                    }
                }
                d0(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            d0(arrayList, arrayList2, i3, size);
        }
    }

    private void a1() {
        if (this.n != null) {
            for (int i2 = 0; i2 < this.n.size(); i2++) {
                this.n.get(i2).a();
            }
        }
    }

    private static void c0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            androidx.fragment.app.a aVar = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                aVar.p(-1);
                aVar.u(i2 == i3 + (-1));
            } else {
                aVar.p(1);
                aVar.t();
            }
            i2++;
        }
    }

    static int c1(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private void d(a.d.b<Fragment> bVar) {
        int i2 = this.s;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 5);
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment.f1793c < iMin) {
                O0(fragment, iMin);
                if (fragment.J != null && !fragment.B && fragment.O) {
                    bVar.add(fragment);
                }
            }
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r17v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 'this'  ??, new type: androidx.fragment.app.n
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r8v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v13 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r17v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r17v0 'this'  ??, new type: androidx.fragment.app.n
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v10 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    private void d0(java.util.ArrayList<androidx.fragment.app.a> r18, java.util.ArrayList<java.lang.Boolean> r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.n.d0(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    private void e0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<q> arrayList3 = this.N;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            q qVar = this.N.get(i2);
            if (arrayList == null || qVar.f1963a || (iIndexOf2 = arrayList.indexOf(qVar.f1964b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf2).booleanValue()) {
                if (qVar.e() || (arrayList != null && qVar.f1964b.y(arrayList, 0, arrayList.size()))) {
                    this.N.remove(i2);
                    i2--;
                    size--;
                    if (arrayList == null || qVar.f1963a || (iIndexOf = arrayList.indexOf(qVar.f1964b)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                        qVar.d();
                    }
                }
                i2++;
            } else {
                this.N.remove(i2);
                i2--;
                size--;
            }
            qVar.c();
            i2++;
        }
    }

    private void i1(Fragment fragment) {
        ViewGroup viewGroupO0 = o0(fragment);
        if (viewGroupO0 == null || fragment.r() + fragment.u() + fragment.G() + fragment.H() <= 0) {
            return;
        }
        int i2 = a.k.b.f769c;
        if (viewGroupO0.getTag(i2) == null) {
            viewGroupO0.setTag(i2, fragment);
        }
        ((Fragment) viewGroupO0.getTag(i2)).y1(fragment.F());
    }

    private void j0() {
        if (f1938b) {
            Iterator<c0> it = r().iterator();
            while (it.hasNext()) {
                it.next().k();
            }
        } else if (this.N != null) {
            while (!this.N.isEmpty()) {
                this.N.remove(0).d();
            }
        }
    }

    private boolean k0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f1939c) {
            if (this.f1939c.isEmpty()) {
                return false;
            }
            int size = this.f1939c.size();
            boolean zA = false;
            for (int i2 = 0; i2 < size; i2++) {
                zA |= this.f1939c.get(i2).a(arrayList, arrayList2);
            }
            this.f1939c.clear();
            this.t.l().removeCallbacks(this.P);
            return zA;
        }
    }

    private void k1() {
        Iterator<u> it = this.f1941e.k().iterator();
        while (it.hasNext()) {
            R0(it.next());
        }
    }

    private void l1() {
        synchronized (this.f1939c) {
            if (this.f1939c.isEmpty()) {
                this.j.f(l0() > 0 && H0(this.v));
            } else {
                this.j.f(true);
            }
        }
    }

    private void m(Fragment fragment) {
        HashSet<a.g.h.b> hashSet = this.o.get(fragment);
        if (hashSet != null) {
            Iterator<a.g.h.b> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
            hashSet.clear();
            w(fragment);
            this.o.remove(fragment);
        }
    }

    private androidx.fragment.app.q m0(Fragment fragment) {
        return this.O.h(fragment);
    }

    private void o() {
        if (J0()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private ViewGroup o0(Fragment fragment) {
        ViewGroup viewGroup = fragment.I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.z > 0 && this.u.i()) {
            View viewG = this.u.g(fragment.z);
            if (viewG instanceof ViewGroup) {
                return (ViewGroup) viewG;
            }
        }
        return null;
    }

    private void p() {
        this.f1940d = false;
        this.L.clear();
        this.K.clear();
    }

    private Set<c0> r() {
        HashSet hashSet = new HashSet();
        Iterator<u> it = this.f1941e.k().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().k().I;
            if (viewGroup != null) {
                hashSet.add(c0.o(viewGroup, x0()));
            }
        }
        return hashSet;
    }

    private Set<c0> s(ArrayList<androidx.fragment.app.a> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<w.a> it = arrayList.get(i2).f1993c.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f1998b;
                if (fragment != null && (viewGroup = fragment.I) != null) {
                    hashSet.add(c0.n(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    private void u(Fragment fragment) {
        Animator animator;
        if (fragment.J != null) {
            androidx.fragment.app.f.d dVarC = androidx.fragment.app.f.c(this.t.k(), fragment, !fragment.B, fragment.F());
            if (dVarC == null || (animator = dVarC.f1913b) == null) {
                if (dVarC != null) {
                    fragment.J.startAnimation(dVarC.f1912a);
                    dVarC.f1912a.start();
                }
                fragment.J.setVisibility((!fragment.B || fragment.X()) ? 0 : 8);
                if (fragment.X()) {
                    fragment.v1(false);
                }
            } else {
                animator.setTarget(fragment.J);
                if (!fragment.B) {
                    fragment.J.setVisibility(0);
                } else if (fragment.X()) {
                    fragment.v1(false);
                } else {
                    ViewGroup viewGroup = fragment.I;
                    View view = fragment.J;
                    viewGroup.startViewTransition(view);
                    dVarC.f1913b.addListener(new h(viewGroup, view, fragment));
                }
                dVarC.f1913b.start();
            }
        }
        C0(fragment);
        fragment.P = false;
        fragment.v0(fragment.B);
    }

    private void w(Fragment fragment) {
        fragment.U0();
        this.q.n(fragment, false);
        fragment.I = null;
        fragment.J = null;
        fragment.V = null;
        fragment.W.l(null);
        fragment.q = false;
    }

    static Fragment y0(View view) {
        Object tag = view.getTag(a.k.b.f767a);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    void A(Configuration configuration) {
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null) {
                fragment.O0(configuration);
            }
        }
    }

    void A0() {
        a0(true);
        if (this.j.c()) {
            T0();
        } else {
            this.i.c();
        }
    }

    boolean B(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null && fragment.P0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void B0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "hide: " + fragment);
        }
        if (fragment.B) {
            return;
        }
        fragment.B = true;
        fragment.P = true ^ fragment.P;
        i1(fragment);
    }

    void C() {
        this.G = false;
        this.H = false;
        this.O.n(false);
        S(1);
    }

    void C0(Fragment fragment) {
        if (fragment.n && F0(fragment)) {
            this.F = true;
        }
    }

    boolean D(Menu menu, MenuInflater menuInflater) {
        if (this.s < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null && G0(fragment) && fragment.R0(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.g != null) {
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                Fragment fragment2 = this.g.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.r0();
                }
            }
        }
        this.g = arrayList;
        return z;
    }

    public boolean D0() {
        return this.I;
    }

    void E() {
        this.I = true;
        a0(true);
        X();
        S(-1);
        this.t = null;
        this.u = null;
        this.v = null;
        if (this.i != null) {
            this.j.d();
            this.i = null;
        }
        androidx.activity.result.c<Intent> cVar = this.B;
        if (cVar != null) {
            cVar.a();
            this.C.a();
            this.D.a();
        }
    }

    void F() {
        S(1);
    }

    void G() {
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null) {
                fragment.X0();
            }
        }
    }

    boolean G0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.Z();
    }

    void H(boolean z) {
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null) {
                fragment.Y0(z);
            }
        }
    }

    boolean H0(Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        n nVar = fragment.u;
        return fragment.equals(nVar.w0()) && H0(nVar.v);
    }

    void I(Fragment fragment) {
        Iterator<r> it = this.r.iterator();
        while (it.hasNext()) {
            it.next().e(this, fragment);
        }
    }

    boolean I0(int i2) {
        return this.s >= i2;
    }

    boolean J(MenuItem menuItem) {
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null && fragment.Z0(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean J0() {
        return this.G || this.H;
    }

    void K(Menu menu) {
        if (this.s < 1) {
            return;
        }
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null) {
                fragment.a1(menu);
            }
        }
    }

    void L0(Fragment fragment) {
        if (!this.f1941e.c(fragment.h)) {
            if (E0(3)) {
                Log.d("FragmentManager", "Ignoring moving " + fragment + " to state " + this.s + "since it is not added to " + this);
                return;
            }
            return;
        }
        N0(fragment);
        View view = fragment.J;
        if (view != null && fragment.O && fragment.I != null) {
            float f2 = fragment.Q;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.Q = 0.0f;
            fragment.O = false;
            androidx.fragment.app.f.d dVarC = androidx.fragment.app.f.c(this.t.k(), fragment, true, fragment.F());
            if (dVarC != null) {
                Animation animation = dVarC.f1912a;
                if (animation != null) {
                    fragment.J.startAnimation(animation);
                } else {
                    dVarC.f1913b.setTarget(fragment.J);
                    dVarC.f1913b.start();
                }
            }
        }
        if (fragment.P) {
            u(fragment);
        }
    }

    void M() {
        S(5);
    }

    void M0(int i2, boolean z) {
        androidx.fragment.app.k<?> kVar;
        if (this.t == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z || i2 != this.s) {
            this.s = i2;
            if (f1938b) {
                this.f1941e.r();
            } else {
                Iterator<Fragment> it = this.f1941e.n().iterator();
                while (it.hasNext()) {
                    L0(it.next());
                }
                for (u uVar : this.f1941e.k()) {
                    Fragment fragmentK = uVar.k();
                    if (!fragmentK.O) {
                        L0(fragmentK);
                    }
                    if (fragmentK.o && !fragmentK.Y()) {
                        this.f1941e.q(uVar);
                    }
                }
            }
            k1();
            if (this.F && (kVar = this.t) != null && this.s == 7) {
                kVar.p();
                this.F = false;
            }
        }
    }

    void N(boolean z) {
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null) {
                fragment.c1(z);
            }
        }
    }

    void N0(Fragment fragment) {
        O0(fragment, this.s);
    }

    boolean O(Menu menu) {
        boolean z = false;
        if (this.s < 1) {
            return false;
        }
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null && G0(fragment) && fragment.d1(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:97:0x015d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0160  */
    void O0(Fragment fragment, int i2) {
        ViewGroup viewGroup;
        u uVarM = this.f1941e.m(fragment.h);
        int i3 = 1;
        if (uVarM == null) {
            uVarM = new u(this.q, this.f1941e, fragment);
            uVarM.t(1);
        }
        if (fragment.p && fragment.q && fragment.f1793c == 2) {
            i2 = Math.max(i2, 2);
        }
        int iMin = Math.min(i2, uVarM.d());
        int i4 = fragment.f1793c;
        if (i4 <= iMin) {
            if (i4 < iMin && !this.o.isEmpty()) {
                m(fragment);
            }
            int i5 = fragment.f1793c;
            if (i5 != -1) {
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            if (i5 != 4) {
                                if (i5 == 5) {
                                }
                            }
                            if (iMin > 5) {
                                uVarM.p();
                            }
                        }
                        if (iMin > 4) {
                            uVarM.u();
                        }
                        if (iMin > 5) {
                            uVarM.p();
                        }
                    }
                    if (iMin > 2) {
                        uVarM.a();
                    }
                    if (iMin > 4) {
                        uVarM.u();
                    }
                    if (iMin > 5) {
                        uVarM.p();
                    }
                }
                if (iMin > -1) {
                    uVarM.j();
                }
                if (iMin > 1) {
                    uVarM.f();
                }
                if (iMin > 2) {
                    uVarM.a();
                }
                if (iMin > 4) {
                    uVarM.u();
                }
                if (iMin > 5) {
                    uVarM.p();
                }
            } else if (iMin > -1) {
                uVarM.c();
            }
            if (iMin > 0) {
                uVarM.e();
            }
            if (iMin > -1) {
                uVarM.j();
            }
            if (iMin > 1) {
                uVarM.f();
            }
            if (iMin > 2) {
                uVarM.a();
            }
            if (iMin > 4) {
                uVarM.u();
            }
            if (iMin > 5) {
                uVarM.p();
            }
        } else if (i4 > iMin) {
            if (i4 == 0) {
                i3 = iMin;
                if (i3 < 0) {
                    uVarM.i();
                }
                iMin = i3;
            } else {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                if (i4 == 7) {
                                    if (iMin < 7) {
                                        uVarM.n();
                                    }
                                }
                            }
                            if (iMin < 5) {
                                uVarM.v();
                            }
                        }
                        if (iMin < 4) {
                            if (E0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + fragment);
                            }
                            if (fragment.J != null && this.t.o(fragment) && fragment.f1795e == null) {
                                uVarM.s();
                            }
                        }
                    }
                    if (iMin < 2) {
                        androidx.fragment.app.f.d dVarC = null;
                        View view = fragment.J;
                        if (view != null && (viewGroup = fragment.I) != null) {
                            viewGroup.endViewTransition(view);
                            fragment.J.clearAnimation();
                            if (!fragment.c0()) {
                                if (this.s > -1 && !this.I && fragment.J.getVisibility() == 0 && fragment.Q >= 0.0f) {
                                    dVarC = androidx.fragment.app.f.c(this.t.k(), fragment, false, fragment.F());
                                }
                                fragment.Q = 0.0f;
                                ViewGroup viewGroup2 = fragment.I;
                                View view2 = fragment.J;
                                if (dVarC != null) {
                                    androidx.fragment.app.f.a(fragment, dVarC, this.p);
                                }
                                viewGroup2.removeView(view2);
                                if (E0(2)) {
                                    Log.v("FragmentManager", "Removing view " + view2 + " for fragment " + fragment + " from container " + viewGroup2);
                                }
                                if (viewGroup2 != fragment.I) {
                                    return;
                                }
                            }
                        }
                        if (this.o.get(fragment) == null) {
                            uVarM.h();
                        }
                    }
                }
                if (iMin >= 1) {
                    i3 = iMin;
                } else if (this.o.get(fragment) == null) {
                    uVarM.g();
                    i3 = iMin;
                }
                if (i3 < 0) {
                    uVarM.i();
                }
                iMin = i3;
            }
        }
        if (fragment.f1793c != iMin) {
            if (E0(3)) {
                Log.d("FragmentManager", "moveToState: Fragment state for " + fragment + " not updated inline; expected state " + iMin + " found " + fragment.f1793c);
            }
            fragment.f1793c = iMin;
        }
    }

    void P() {
        l1();
        L(this.w);
    }

    void P0() {
        if (this.t == null) {
            return;
        }
        this.G = false;
        this.H = false;
        this.O.n(false);
        for (Fragment fragment : this.f1941e.n()) {
            if (fragment != null) {
                fragment.e0();
            }
        }
    }

    void Q() {
        this.G = false;
        this.H = false;
        this.O.n(false);
        S(7);
    }

    void Q0(androidx.fragment.app.h hVar) {
        View view;
        for (u uVar : this.f1941e.k()) {
            Fragment fragmentK = uVar.k();
            if (fragmentK.z == hVar.getId() && (view = fragmentK.J) != null && view.getParent() == null) {
                fragmentK.I = hVar;
                uVar.b();
            }
        }
    }

    void R() {
        this.G = false;
        this.H = false;
        this.O.n(false);
        S(5);
    }

    void R0(u uVar) {
        Fragment fragmentK = uVar.k();
        if (fragmentK.K) {
            if (this.f1940d) {
                this.J = true;
                return;
            }
            fragmentK.K = false;
            if (f1938b) {
                uVar.m();
            } else {
                N0(fragmentK);
            }
        }
    }

    public void S0(int i2, int i3) {
        if (i2 >= 0) {
            Y(new p(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    void T() {
        this.H = true;
        this.O.n(true);
        S(4);
    }

    public boolean T0() {
        return U0(null, -1, 0);
    }

    void U() {
        S(2);
    }

    boolean V0(ArrayList<androidx.fragment.app.a> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int i4;
        ArrayList<androidx.fragment.app.a> arrayList3 = this.f1942f;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f1942f.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    androidx.fragment.app.a aVar = this.f1942f.get(size2);
                    if ((str != null && str.equals(aVar.w())) || (i2 >= 0 && i2 == aVar.v)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        androidx.fragment.app.a aVar2 = this.f1942f.get(size2);
                        if (str == null || !str.equals(aVar2.w())) {
                            if (i2 < 0 || i2 != aVar2.v) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f1942f.size() - 1) {
                return false;
            }
            for (int size3 = this.f1942f.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f1942f.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    public void W(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f1941e.e(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.g;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.g.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<androidx.fragment.app.a> arrayList2 = this.f1942f;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                androidx.fragment.app.a aVar = this.f1942f.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.r(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.f1939c) {
            int size3 = this.f1939c.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    o oVar = this.f1939c.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(oVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.u);
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.G);
        printWriter.print(" mStopped=");
        printWriter.print(this.H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.I);
        if (this.F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.F);
        }
    }

    void X0(Fragment fragment, a.g.h.b bVar) {
        HashSet<a.g.h.b> hashSet = this.o.get(fragment);
        if (hashSet != null && hashSet.remove(bVar) && hashSet.isEmpty()) {
            this.o.remove(fragment);
            if (fragment.f1793c < 5) {
                w(fragment);
                N0(fragment);
            }
        }
    }

    void Y(o oVar, boolean z) {
        if (!z) {
            if (this.t == null) {
                if (!this.I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            o();
        }
        synchronized (this.f1939c) {
            if (this.t == null) {
                if (!z) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f1939c.add(oVar);
                e1();
            }
        }
    }

    void Y0(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "remove: " + fragment + " nesting=" + fragment.t);
        }
        boolean z = !fragment.Y();
        if (!fragment.C || z) {
            this.f1941e.s(fragment);
            if (F0(fragment)) {
                this.F = true;
            }
            fragment.o = true;
            i1(fragment);
        }
    }

    boolean a0(boolean z) {
        Z(z);
        boolean z2 = false;
        while (k0(this.K, this.L)) {
            this.f1940d = true;
            try {
                Z0(this.K, this.L);
                p();
                z2 = true;
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        l1();
        V();
        this.f1941e.b();
        return z2;
    }

    void b0(o oVar, boolean z) {
        if (z && (this.t == null || this.I)) {
            return;
        }
        Z(z);
        if (oVar.a(this.K, this.L)) {
            this.f1940d = true;
            try {
                Z0(this.K, this.L);
                p();
            } catch (Throwable th) {
                p();
                throw th;
            }
        }
        l1();
        V();
        this.f1941e.b();
    }

    void b1(Parcelable parcelable) {
        u uVar;
        if (parcelable == null) {
            return;
        }
        androidx.fragment.app.p pVar = (androidx.fragment.app.p) parcelable;
        if (pVar.f1966b == null) {
            return;
        }
        this.f1941e.t();
        for (t tVar : pVar.f1966b) {
            if (tVar != null) {
                Fragment fragmentG = this.O.g(tVar.f1976c);
                if (fragmentG != null) {
                    if (E0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + fragmentG);
                    }
                    uVar = new u(this.q, this.f1941e, fragmentG, tVar);
                } else {
                    uVar = new u(this.q, this.f1941e, this.t.k().getClassLoader(), p0(), tVar);
                }
                Fragment fragmentK = uVar.k();
                fragmentK.u = this;
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + fragmentK.h + "): " + fragmentK);
                }
                uVar.o(this.t.k().getClassLoader());
                this.f1941e.p(uVar);
                uVar.t(this.s);
            }
        }
        for (Fragment fragment : this.O.j()) {
            if (!this.f1941e.c(fragment.h)) {
                if (E0(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + pVar.f1966b);
                }
                this.O.m(fragment);
                fragment.u = this;
                u uVar2 = new u(this.q, this.f1941e, fragment);
                uVar2.t(1);
                uVar2.m();
                fragment.o = true;
                uVar2.m();
            }
        }
        this.f1941e.u(pVar.f1967c);
        if (pVar.f1968d != null) {
            this.f1942f = new ArrayList<>(pVar.f1968d.length);
            int i2 = 0;
            while (true) {
                androidx.fragment.app.b[] bVarArr = pVar.f1968d;
                if (i2 >= bVarArr.length) {
                    break;
                }
                androidx.fragment.app.a aVarJ = bVarArr[i2].j(this);
                if (E0(2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i2 + " (index " + aVarJ.v + "): " + aVarJ);
                    PrintWriter printWriter = new PrintWriter(new b0("FragmentManager"));
                    aVarJ.s("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1942f.add(aVarJ);
                i2++;
            }
        } else {
            this.f1942f = null;
        }
        this.k.set(pVar.f1969e);
        String str = pVar.f1970f;
        if (str != null) {
            Fragment fragmentF0 = f0(str);
            this.w = fragmentF0;
            L(fragmentF0);
        }
        ArrayList<String> arrayList = pVar.g;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle = pVar.h.get(i3);
                bundle.setClassLoader(this.t.k().getClassLoader());
                this.l.put(arrayList.get(i3), bundle);
            }
        }
        this.E = new ArrayDeque<>(pVar.i);
    }

    Parcelable d1() {
        int size;
        j0();
        X();
        a0(true);
        this.G = true;
        this.O.n(true);
        ArrayList<t> arrayListV = this.f1941e.v();
        androidx.fragment.app.b[] bVarArr = null;
        if (arrayListV.isEmpty()) {
            if (E0(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListW = this.f1941e.w();
        ArrayList<androidx.fragment.app.a> arrayList = this.f1942f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            bVarArr = new androidx.fragment.app.b[size];
            for (int i2 = 0; i2 < size; i2++) {
                bVarArr[i2] = new androidx.fragment.app.b(this.f1942f.get(i2));
                if (E0(2)) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f1942f.get(i2));
                }
            }
        }
        androidx.fragment.app.p pVar = new androidx.fragment.app.p();
        pVar.f1966b = arrayListV;
        pVar.f1967c = arrayListW;
        pVar.f1968d = bVarArr;
        pVar.f1969e = this.k.get();
        Fragment fragment = this.w;
        if (fragment != null) {
            pVar.f1970f = fragment.h;
        }
        pVar.g.addAll(this.l.keySet());
        pVar.h.addAll(this.l.values());
        pVar.i = new ArrayList<>(this.E);
        return pVar;
    }

    void e(androidx.fragment.app.a aVar) {
        if (this.f1942f == null) {
            this.f1942f = new ArrayList<>();
        }
        this.f1942f.add(aVar);
    }

    void e1() {
        synchronized (this.f1939c) {
            ArrayList<q> arrayList = this.N;
            boolean z = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z2 = this.f1939c.size() == 1;
            if (z || z2) {
                this.t.l().removeCallbacks(this.P);
                this.t.l().post(this.P);
                l1();
            }
        }
    }

    void f(Fragment fragment, a.g.h.b bVar) {
        if (this.o.get(fragment) == null) {
            this.o.put(fragment, new HashSet<>());
        }
        this.o.get(fragment).add(bVar);
    }

    Fragment f0(String str) {
        return this.f1941e.f(str);
    }

    void f1(Fragment fragment, boolean z) {
        ViewGroup viewGroupO0 = o0(fragment);
        if (viewGroupO0 == null || !(viewGroupO0 instanceof androidx.fragment.app.h)) {
            return;
        }
        ((androidx.fragment.app.h) viewGroupO0).setDrawDisappearingViewsLast(!z);
    }

    u g(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "add: " + fragment);
        }
        u uVarV = v(fragment);
        fragment.u = this;
        this.f1941e.p(uVarV);
        if (!fragment.C) {
            this.f1941e.a(fragment);
            fragment.o = false;
            if (fragment.J == null) {
                fragment.P = false;
            }
            if (F0(fragment)) {
                this.F = true;
            }
        }
        return uVarV;
    }

    public Fragment g0(int i2) {
        return this.f1941e.g(i2);
    }

    void g1(Fragment fragment, androidx.lifecycle.d.c cVar) {
        if (fragment.equals(f0(fragment.h)) && (fragment.v == null || fragment.u == this)) {
            fragment.T = cVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public void h(r rVar) {
        this.r.add(rVar);
    }

    public Fragment h0(String str) {
        return this.f1941e.h(str);
    }

    void h1(Fragment fragment) {
        if (fragment == null || (fragment.equals(f0(fragment.h)) && (fragment.v == null || fragment.u == this))) {
            Fragment fragment2 = this.w;
            this.w = fragment;
            L(fragment2);
            L(this.w);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    int i() {
        return this.k.getAndIncrement();
    }

    Fragment i0(String str) {
        return this.f1941e.i(str);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021  */
    /* JADX WARN: Code duplicated, block: B:16:0x0028  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:31:0x0078  */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x0078, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    void j(androidx.fragment.app.k<?> kVar, androidx.fragment.app.g gVar, Fragment fragment) {
        r iVar;
        androidx.fragment.app.q qVar;
        Object obj;
        String str;
        androidx.activity.c cVar;
        androidx.lifecycle.g gVar2;
        if (this.t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.t = kVar;
        this.u = gVar;
        this.v = fragment;
        if (fragment == null) {
            if (kVar instanceof r) {
                iVar = (r) kVar;
            }
            if (this.v != null) {
                l1();
            }
            if (kVar instanceof androidx.activity.c) {
                cVar = (androidx.activity.c) kVar;
                OnBackPressedDispatcher onBackPressedDispatcherB = cVar.b();
                this.i = onBackPressedDispatcherB;
                if (fragment != null) {
                    gVar2 = cVar;
                    gVar2 = fragment;
                }
                gVar2 = cVar;
                onBackPressedDispatcherB.a(gVar2, this.j);
            }
            if (fragment != null) {
                qVar = fragment.u.m0(fragment);
            } else if (kVar instanceof androidx.lifecycle.s) {
                qVar = androidx.fragment.app.q.i(((androidx.lifecycle.s) kVar).h());
            } else {
                qVar = new androidx.fragment.app.q(false);
            }
            this.O = qVar;
            this.O.n(J0());
            this.f1941e.x(this.O);
            obj = this.t;
            if (obj instanceof androidx.activity.result.e) {
                androidx.activity.result.d dVarD = ((androidx.activity.result.e) obj).d();
                if (fragment != null) {
                    str = fragment.h + ":";
                } else {
                    str = "";
                }
                String str2 = "FragmentManager:" + str;
                this.B = dVarD.g(str2 + "StartActivityForResult", new androidx.activity.result.f.c(), new j());
                this.C = dVarD.g(str2 + "StartIntentSenderForResult", new k(), new a());
                this.D = dVarD.g(str2 + "RequestPermissions", new androidx.activity.result.f.b(), new b());
            }
        }
        iVar = new i(fragment);
        h(iVar);
        if (this.v != null) {
            l1();
        }
        if (kVar instanceof androidx.activity.c) {
            cVar = (androidx.activity.c) kVar;
            OnBackPressedDispatcher onBackPressedDispatcherB2 = cVar.b();
            this.i = onBackPressedDispatcherB2;
            if (fragment != null) {
                gVar2 = cVar;
                gVar2 = fragment;
            }
            gVar2 = cVar;
            onBackPressedDispatcherB2.a(gVar2, this.j);
        }
        if (fragment != null) {
            qVar = fragment.u.m0(fragment);
        } else if (kVar instanceof androidx.lifecycle.s) {
            qVar = androidx.fragment.app.q.i(((androidx.lifecycle.s) kVar).h());
        } else {
            qVar = new androidx.fragment.app.q(false);
        }
        this.O = qVar;
        this.O.n(J0());
        this.f1941e.x(this.O);
        obj = this.t;
        if (obj instanceof androidx.activity.result.e) {
            androidx.activity.result.d dVarD2 = ((androidx.activity.result.e) obj).d();
            if (fragment != null) {
                str = fragment.h + ":";
            } else {
                str = "";
            }
            String str3 = "FragmentManager:" + str;
            this.B = dVarD2.g(str3 + "StartActivityForResult", new androidx.activity.result.f.c(), new j());
            this.C = dVarD2.g(str3 + "StartIntentSenderForResult", new k(), new a());
            this.D = dVarD2.g(str3 + "RequestPermissions", new androidx.activity.result.f.b(), new b());
        }
    }

    void j1(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "show: " + fragment);
        }
        if (fragment.B) {
            fragment.B = false;
            fragment.P = !fragment.P;
        }
    }

    void k(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "attach: " + fragment);
        }
        if (fragment.C) {
            fragment.C = false;
            if (fragment.n) {
                return;
            }
            this.f1941e.a(fragment);
            if (E0(2)) {
                Log.v("FragmentManager", "add from attach: " + fragment);
            }
            if (F0(fragment)) {
                this.F = true;
            }
        }
    }

    public w l() {
        return new androidx.fragment.app.a(this);
    }

    public int l0() {
        ArrayList<androidx.fragment.app.a> arrayList = this.f1942f;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    boolean n() {
        boolean zF0 = false;
        for (Fragment fragment : this.f1941e.l()) {
            if (fragment != null) {
                zF0 = F0(fragment);
            }
            if (zF0) {
                return true;
            }
        }
        return false;
    }

    androidx.fragment.app.g n0() {
        return this.u;
    }

    public androidx.fragment.app.j p0() {
        androidx.fragment.app.j jVar = this.x;
        if (jVar != null) {
            return jVar;
        }
        Fragment fragment = this.v;
        return fragment != null ? fragment.u.p0() : this.y;
    }

    public final void q(String str) {
        this.l.remove(str);
    }

    v q0() {
        return this.f1941e;
    }

    public List<Fragment> r0() {
        return this.f1941e.n();
    }

    androidx.fragment.app.k<?> s0() {
        return this.t;
    }

    void t(androidx.fragment.app.a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.u(z3);
        } else {
            aVar.t();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2 && this.s >= 1) {
            x.B(this.t.k(), this.u, arrayList, arrayList2, 0, 1, true, this.p);
        }
        if (z3) {
            M0(this.s, true);
        }
        for (Fragment fragment : this.f1941e.l()) {
            if (fragment != null && fragment.J != null && fragment.O && aVar.x(fragment.z)) {
                float f2 = fragment.Q;
                if (f2 > 0.0f) {
                    fragment.J.setAlpha(f2);
                }
                if (z3) {
                    fragment.Q = 0.0f;
                } else {
                    fragment.Q = -1.0f;
                    fragment.O = false;
                }
            }
        }
    }

    LayoutInflater.Factory2 t0() {
        return this.h;
    }

    public String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.v;
        if (fragment == null) {
            androidx.fragment.app.k<?> kVar = this.t;
            if (kVar != null) {
                sb.append(kVar.getClass().getSimpleName());
                sb.append("{");
                obj = this.t;
            } else {
                sb.append("null");
            }
            sb.append("}}");
            return sb.toString();
        }
        sb.append(fragment.getClass().getSimpleName());
        sb.append("{");
        obj = this.v;
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append("}");
        sb.append("}}");
        return sb.toString();
    }

    androidx.fragment.app.m u0() {
        return this.q;
    }

    u v(Fragment fragment) {
        u uVarM = this.f1941e.m(fragment.h);
        if (uVarM != null) {
            return uVarM;
        }
        u uVar = new u(this.q, this.f1941e, fragment);
        uVar.o(this.t.k().getClassLoader());
        uVar.t(this.s);
        return uVar;
    }

    Fragment v0() {
        return this.v;
    }

    public Fragment w0() {
        return this.w;
    }

    void x(Fragment fragment) {
        if (E0(2)) {
            Log.v("FragmentManager", "detach: " + fragment);
        }
        if (fragment.C) {
            return;
        }
        fragment.C = true;
        if (fragment.n) {
            if (E0(2)) {
                Log.v("FragmentManager", "remove from detach: " + fragment);
            }
            this.f1941e.s(fragment);
            if (F0(fragment)) {
                this.F = true;
            }
            i1(fragment);
        }
    }

    d0 x0() {
        d0 d0Var = this.z;
        if (d0Var != null) {
            return d0Var;
        }
        Fragment fragment = this.v;
        return fragment != null ? fragment.u.x0() : this.A;
    }

    void y() {
        this.G = false;
        this.H = false;
        this.O.n(false);
        S(4);
    }

    void z() {
        this.G = false;
        this.H = false;
        this.O.n(false);
        S(0);
    }

    androidx.lifecycle.r z0(Fragment fragment) {
        return this.O.k(fragment);
    }
}
