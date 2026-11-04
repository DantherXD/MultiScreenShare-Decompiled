package a.g.l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l f624b;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Field f625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Field f626b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f627c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f628d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f625a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f626b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f627c = declaredField3;
                declaredField3.setAccessible(true);
                f628d = true;
            } catch (ReflectiveOperationException e2) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e2.getMessage(), e2);
            }
        }

        public static d0 a(View view) {
            if (f628d && view.isAttachedToWindow()) {
                try {
                    Object obj = f625a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f626b.get(obj);
                        Rect rect2 = (Rect) f627c.get(obj);
                        if (rect != null && rect2 != null) {
                            d0 d0VarA = new b().b(a.g.e.b.c(rect)).c(a.g.e.b.c(rect2)).a();
                            d0VarA.p(d0VarA);
                            d0VarA.d(view.getRootView());
                            return d0VarA;
                        }
                    }
                } catch (IllegalAccessException e2) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e2.getMessage(), e2);
                }
            }
            return null;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final f f629a;

        public b() {
            int i = Build.VERSION.SDK_INT;
            this.f629a = i >= 30 ? new e() : i >= 29 ? new d() : i >= 20 ? new c() : new f();
        }

        public b(d0 d0Var) {
            int i = Build.VERSION.SDK_INT;
            this.f629a = i >= 30 ? new e(d0Var) : i >= 29 ? new d(d0Var) : i >= 20 ? new c(d0Var) : new f(d0Var);
        }

        public d0 a() {
            return this.f629a.b();
        }

        @Deprecated
        public b b(a.g.e.b bVar) {
            this.f629a.d(bVar);
            return this;
        }

        @Deprecated
        public b c(a.g.e.b bVar) {
            this.f629a.f(bVar);
            return this;
        }
    }

    private static class c extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Field f630c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f631d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Constructor<WindowInsets> f632e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static boolean f633f = false;
        private WindowInsets g;
        private a.g.e.b h;

        c() {
            this.g = h();
        }

        c(d0 d0Var) {
            this.g = d0Var.r();
        }

        private static WindowInsets h() {
            if (!f631d) {
                try {
                    f630c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
                }
                f631d = true;
            }
            Field field = f630c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
                }
            }
            if (!f633f) {
                try {
                    f632e = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
                }
                f633f = true;
            }
            Constructor<WindowInsets> constructor = f632e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
                }
            }
            return null;
        }

        @Override // a.g.l.d0.f
        d0 b() {
            a();
            d0 d0VarS = d0.s(this.g);
            d0VarS.n(this.f636b);
            d0VarS.q(this.h);
            return d0VarS;
        }

        @Override // a.g.l.d0.f
        void d(a.g.e.b bVar) {
            this.h = bVar;
        }

        @Override // a.g.l.d0.f
        void f(a.g.e.b bVar) {
            WindowInsets windowInsets = this.g;
            if (windowInsets != null) {
                this.g = windowInsets.replaceSystemWindowInsets(bVar.f478b, bVar.f479c, bVar.f480d, bVar.f481e);
            }
        }
    }

    private static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f634c;

        d() {
            this.f634c = new WindowInsets.Builder();
        }

        d(d0 d0Var) {
            WindowInsets windowInsetsR = d0Var.r();
            this.f634c = windowInsetsR != null ? new WindowInsets.Builder(windowInsetsR) : new WindowInsets.Builder();
        }

        @Override // a.g.l.d0.f
        d0 b() {
            a();
            d0 d0VarS = d0.s(this.f634c.build());
            d0VarS.n(this.f636b);
            return d0VarS;
        }

        @Override // a.g.l.d0.f
        void c(a.g.e.b bVar) {
            this.f634c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // a.g.l.d0.f
        void d(a.g.e.b bVar) {
            this.f634c.setStableInsets(bVar.e());
        }

        @Override // a.g.l.d0.f
        void e(a.g.e.b bVar) {
            this.f634c.setSystemGestureInsets(bVar.e());
        }

        @Override // a.g.l.d0.f
        void f(a.g.e.b bVar) {
            this.f634c.setSystemWindowInsets(bVar.e());
        }

        @Override // a.g.l.d0.f
        void g(a.g.e.b bVar) {
            this.f634c.setTappableElementInsets(bVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(d0 d0Var) {
            super(d0Var);
        }
    }

    private static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d0 f635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        a.g.e.b[] f636b;

        f() {
            this(new d0((d0) null));
        }

        f(d0 d0Var) {
            this.f635a = d0Var;
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0034  */
        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:20:0x0052  */
        /* JADX WARN: Code duplicated, block: B:23:? A[RETURN, SYNTHETIC] */
        protected final void a() {
            a.g.e.b bVar;
            a.g.e.b bVar2;
            a.g.e.b bVar3;
            a.g.e.b[] bVarArr = this.f636b;
            if (bVarArr != null) {
                a.g.e.b bVarA = bVarArr[m.a(1)];
                a.g.e.b bVar4 = this.f636b[m.a(2)];
                if (bVarA == null || bVar4 == null) {
                    if (bVarA == null) {
                        if (bVar4 != null) {
                            f(bVar4);
                        }
                    }
                    bVar = this.f636b[m.a(16)];
                    if (bVar != null) {
                        e(bVar);
                    }
                    bVar2 = this.f636b[m.a(32)];
                    if (bVar2 != null) {
                        c(bVar2);
                    }
                    bVar3 = this.f636b[m.a(64)];
                    if (bVar3 != null) {
                        g(bVar3);
                    }
                }
                bVarA = a.g.e.b.a(bVarA, bVar4);
                f(bVarA);
                bVar = this.f636b[m.a(16)];
                if (bVar != null) {
                    e(bVar);
                }
                bVar2 = this.f636b[m.a(32)];
                if (bVar2 != null) {
                    c(bVar2);
                }
                bVar3 = this.f636b[m.a(64)];
                if (bVar3 != null) {
                    g(bVar3);
                }
            }
        }

        d0 b() {
            a();
            return this.f635a;
        }

        void c(a.g.e.b bVar) {
        }

        void d(a.g.e.b bVar) {
        }

        void e(a.g.e.b bVar) {
        }

        void f(a.g.e.b bVar) {
        }

        void g(a.g.e.b bVar) {
        }
    }

    private static class g extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static boolean f637c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static Method f638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Class<?> f639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Class<?> f640f;
        private static Field g;
        private static Field h;
        final WindowInsets i;
        private a.g.e.b[] j;
        private a.g.e.b k;
        private d0 l;
        a.g.e.b m;

        g(d0 d0Var, g gVar) {
            this(d0Var, new WindowInsets(gVar.i));
        }

        g(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.k = null;
            this.i = windowInsets;
        }

        private a.g.e.b q(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f637c) {
                r();
            }
            Method method = f638d;
            if (method != null && f640f != null && g != null) {
                try {
                    Object objInvoke = method.invoke(view, new Object[0]);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) g.get(h.get(objInvoke));
                    if (rect != null) {
                        return a.g.e.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e2) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void r() {
            try {
                f638d = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f639e = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f640f = cls;
                g = cls.getDeclaredField("mVisibleInsets");
                h = f639e.getDeclaredField("mAttachInfo");
                g.setAccessible(true);
                h.setAccessible(true);
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
            f637c = true;
        }

        @Override // a.g.l.d0.l
        void d(View view) {
            a.g.e.b bVarQ = q(view);
            if (bVarQ == null) {
                bVarQ = a.g.e.b.f477a;
            }
            n(bVarQ);
        }

        @Override // a.g.l.d0.l
        void e(d0 d0Var) {
            d0Var.p(this.l);
            d0Var.o(this.m);
        }

        @Override // a.g.l.d0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.m, ((g) obj).m);
            }
            return false;
        }

        @Override // a.g.l.d0.l
        final a.g.e.b i() {
            if (this.k == null) {
                this.k = a.g.e.b.b(this.i.getSystemWindowInsetLeft(), this.i.getSystemWindowInsetTop(), this.i.getSystemWindowInsetRight(), this.i.getSystemWindowInsetBottom());
            }
            return this.k;
        }

        @Override // a.g.l.d0.l
        d0 j(int i, int i2, int i3, int i4) {
            b bVar = new b(d0.s(this.i));
            bVar.c(d0.k(i(), i, i2, i3, i4));
            bVar.b(d0.k(h(), i, i2, i3, i4));
            return bVar.a();
        }

        @Override // a.g.l.d0.l
        boolean l() {
            return this.i.isRound();
        }

        @Override // a.g.l.d0.l
        public void m(a.g.e.b[] bVarArr) {
            this.j = bVarArr;
        }

        @Override // a.g.l.d0.l
        void n(a.g.e.b bVar) {
            this.m = bVar;
        }

        @Override // a.g.l.d0.l
        void o(d0 d0Var) {
            this.l = d0Var;
        }
    }

    private static class h extends g {
        private a.g.e.b n;

        h(d0 d0Var, h hVar) {
            super(d0Var, hVar);
            this.n = null;
            this.n = hVar.n;
        }

        h(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
            this.n = null;
        }

        @Override // a.g.l.d0.l
        d0 b() {
            return d0.s(this.i.consumeStableInsets());
        }

        @Override // a.g.l.d0.l
        d0 c() {
            return d0.s(this.i.consumeSystemWindowInsets());
        }

        @Override // a.g.l.d0.l
        final a.g.e.b h() {
            if (this.n == null) {
                this.n = a.g.e.b.b(this.i.getStableInsetLeft(), this.i.getStableInsetTop(), this.i.getStableInsetRight(), this.i.getStableInsetBottom());
            }
            return this.n;
        }

        @Override // a.g.l.d0.l
        boolean k() {
            return this.i.isConsumed();
        }

        @Override // a.g.l.d0.l
        public void p(a.g.e.b bVar) {
            this.n = bVar;
        }
    }

    private static class i extends h {
        i(d0 d0Var, i iVar) {
            super(d0Var, iVar);
        }

        i(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        @Override // a.g.l.d0.l
        d0 a() {
            return d0.s(this.i.consumeDisplayCutout());
        }

        @Override // a.g.l.d0.g, a.g.l.d0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.i, iVar.i) && Objects.equals(this.m, iVar.m);
        }

        @Override // a.g.l.d0.l
        a.g.l.d f() {
            return a.g.l.d.a(this.i.getDisplayCutout());
        }

        @Override // a.g.l.d0.l
        public int hashCode() {
            return this.i.hashCode();
        }
    }

    private static class j extends i {
        private a.g.e.b o;
        private a.g.e.b p;
        private a.g.e.b q;

        j(d0 d0Var, j jVar) {
            super(d0Var, jVar);
            this.o = null;
            this.p = null;
            this.q = null;
        }

        j(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
            this.o = null;
            this.p = null;
            this.q = null;
        }

        @Override // a.g.l.d0.l
        a.g.e.b g() {
            if (this.p == null) {
                this.p = a.g.e.b.d(this.i.getMandatorySystemGestureInsets());
            }
            return this.p;
        }

        @Override // a.g.l.d0.g, a.g.l.d0.l
        d0 j(int i, int i2, int i3, int i4) {
            return d0.s(this.i.inset(i, i2, i3, i4));
        }

        @Override // a.g.l.d0.h, a.g.l.d0.l
        public void p(a.g.e.b bVar) {
        }
    }

    private static class k extends j {
        static final d0 r = d0.s(WindowInsets.CONSUMED);

        k(d0 d0Var, k kVar) {
            super(d0Var, kVar);
        }

        k(d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        @Override // a.g.l.d0.g, a.g.l.d0.l
        final void d(View view) {
        }
    }

    private static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final d0 f641a = new b().a().a().b().c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d0 f642b;

        l(d0 d0Var) {
            this.f642b = d0Var;
        }

        d0 a() {
            return this.f642b;
        }

        d0 b() {
            return this.f642b;
        }

        d0 c() {
            return this.f642b;
        }

        void d(View view) {
        }

        void e(d0 d0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return l() == lVar.l() && k() == lVar.k() && a.g.k.c.a(i(), lVar.i()) && a.g.k.c.a(h(), lVar.h()) && a.g.k.c.a(f(), lVar.f());
        }

        a.g.l.d f() {
            return null;
        }

        a.g.e.b g() {
            return i();
        }

        a.g.e.b h() {
            return a.g.e.b.f477a;
        }

        public int hashCode() {
            return a.g.k.c.b(Boolean.valueOf(l()), Boolean.valueOf(k()), i(), h(), f());
        }

        a.g.e.b i() {
            return a.g.e.b.f477a;
        }

        d0 j(int i, int i2, int i3, int i4) {
            return f641a;
        }

        boolean k() {
            return false;
        }

        boolean l() {
            return false;
        }

        public void m(a.g.e.b[] bVarArr) {
        }

        void n(a.g.e.b bVar) {
        }

        void o(d0 d0Var) {
        }

        public void p(a.g.e.b bVar) {
        }
    }

    public static final class m {
        static int a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    static {
        f623a = Build.VERSION.SDK_INT >= 30 ? k.r : l.f641a;
    }

    public d0(d0 d0Var) {
        if (d0Var == null) {
            this.f624b = new l(this);
            return;
        }
        l lVar = d0Var.f624b;
        int i2 = Build.VERSION.SDK_INT;
        this.f624b = (i2 < 30 || !(lVar instanceof k)) ? (i2 < 29 || !(lVar instanceof j)) ? (i2 < 28 || !(lVar instanceof i)) ? (i2 < 21 || !(lVar instanceof h)) ? (i2 < 20 || !(lVar instanceof g)) ? new l(this) : new g(this, (g) lVar) : new h(this, (h) lVar) : new i(this, (i) lVar) : new j(this, (j) lVar) : new k(this, (k) lVar);
        lVar.e(this);
    }

    private d0(WindowInsets windowInsets) {
        l gVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            gVar = new k(this, windowInsets);
        } else if (i2 >= 29) {
            gVar = new j(this, windowInsets);
        } else if (i2 >= 28) {
            gVar = new i(this, windowInsets);
        } else if (i2 >= 21) {
            gVar = new h(this, windowInsets);
        } else {
            if (i2 < 20) {
                this.f624b = new l(this);
                return;
            }
            gVar = new g(this, windowInsets);
        }
        this.f624b = gVar;
    }

    static a.g.e.b k(a.g.e.b bVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, bVar.f478b - i2);
        int iMax2 = Math.max(0, bVar.f479c - i3);
        int iMax3 = Math.max(0, bVar.f480d - i4);
        int iMax4 = Math.max(0, bVar.f481e - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? bVar : a.g.e.b.b(iMax, iMax2, iMax3, iMax4);
    }

    public static d0 s(WindowInsets windowInsets) {
        return t(windowInsets, null);
    }

    public static d0 t(WindowInsets windowInsets, View view) {
        d0 d0Var = new d0((WindowInsets) a.g.k.h.e(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            d0Var.p(v.J(view));
            d0Var.d(view.getRootView());
        }
        return d0Var;
    }

    @Deprecated
    public d0 a() {
        return this.f624b.a();
    }

    @Deprecated
    public d0 b() {
        return this.f624b.b();
    }

    @Deprecated
    public d0 c() {
        return this.f624b.c();
    }

    void d(View view) {
        this.f624b.d(view);
    }

    @Deprecated
    public a.g.e.b e() {
        return this.f624b.g();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return a.g.k.c.a(this.f624b, ((d0) obj).f624b);
        }
        return false;
    }

    @Deprecated
    public int f() {
        return this.f624b.i().f481e;
    }

    @Deprecated
    public int g() {
        return this.f624b.i().f478b;
    }

    @Deprecated
    public int h() {
        return this.f624b.i().f480d;
    }

    public int hashCode() {
        l lVar = this.f624b;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    public int i() {
        return this.f624b.i().f479c;
    }

    public d0 j(int i2, int i3, int i4, int i5) {
        return this.f624b.j(i2, i3, i4, i5);
    }

    public boolean l() {
        return this.f624b.k();
    }

    @Deprecated
    public d0 m(int i2, int i3, int i4, int i5) {
        return new b(this).c(a.g.e.b.b(i2, i3, i4, i5)).a();
    }

    void n(a.g.e.b[] bVarArr) {
        this.f624b.m(bVarArr);
    }

    void o(a.g.e.b bVar) {
        this.f624b.n(bVar);
    }

    void p(d0 d0Var) {
        this.f624b.o(d0Var);
    }

    void q(a.g.e.b bVar) {
        this.f624b.p(bVar);
    }

    public WindowInsets r() {
        l lVar = this.f624b;
        if (lVar instanceof g) {
            return ((g) lVar).i;
        }
        return null;
    }
}
