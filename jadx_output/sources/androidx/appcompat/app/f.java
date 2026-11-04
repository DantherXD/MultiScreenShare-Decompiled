package androidx.appcompat.app;

import a.g.l.b0;
import a.g.l.v;
import a.g.l.z;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.appcompat.widget.c1;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.h0;
import androidx.appcompat.widget.x0;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes.dex */
class f extends androidx.appcompat.app.e implements androidx.appcompat.view.menu.g.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a.d.g<String, Integer> f1087e = new a.d.g<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final boolean f1088f;
    private static final int[] g;
    private static final boolean h;
    private static final boolean i;
    private static boolean j;
    private boolean A;
    private boolean B;
    ViewGroup C;
    private TextView D;
    private View E;
    private boolean F;
    private boolean G;
    boolean H;
    boolean I;
    boolean J;
    boolean K;
    boolean L;
    private boolean M;
    private t[] N;
    private t O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    boolean T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private p Y;
    private p Z;
    boolean a0;
    int b0;
    private final Runnable c0;
    private boolean d0;
    private Rect e0;
    private Rect f0;
    private androidx.appcompat.app.h g0;
    private androidx.appcompat.app.i h0;
    final Object k;
    final Context l;
    Window m;
    private n n;
    final androidx.appcompat.app.d o;
    androidx.appcompat.app.a p;
    MenuInflater q;
    private CharSequence r;
    private d0 s;
    private h t;
    private u u;
    a.a.n.b v;
    ActionBarContextView w;
    PopupWindow x;
    Runnable y;
    z z;

    class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Thread.UncaughtExceptionHandler f1089a;

        a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f1089a = uncaughtExceptionHandler;
        }

        private boolean a(Throwable th) {
            String message;
            if (!(th instanceof Resources.NotFoundException) || (message = th.getMessage()) == null) {
                return false;
            }
            return message.contains("drawable") || message.contains("Drawable");
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (!a(th)) {
                this.f1089a.uncaughtException(thread, th);
                return;
            }
            Resources.NotFoundException notFoundException = new Resources.NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
            notFoundException.initCause(th.getCause());
            notFoundException.setStackTrace(th.getStackTrace());
            this.f1089a.uncaughtException(thread, notFoundException);
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            if ((fVar.b0 & 1) != 0) {
                fVar.U(0);
            }
            f fVar2 = f.this;
            if ((fVar2.b0 & 4096) != 0) {
                fVar2.U(108);
            }
            f fVar3 = f.this;
            fVar3.a0 = false;
            fVar3.b0 = 0;
        }
    }

    class c implements a.g.l.q {
        c() {
        }

        @Override // a.g.l.q
        public a.g.l.d0 a(View view, a.g.l.d0 d0Var) {
            int i = d0Var.i();
            int iL0 = f.this.L0(d0Var, null);
            if (i != iL0) {
                d0Var = d0Var.m(d0Var.g(), iL0, d0Var.h(), d0Var.f());
            }
            return v.a0(view, d0Var);
        }
    }

    class d implements h0.a {
        d() {
        }

        @Override // androidx.appcompat.widget.h0.a
        public void a(Rect rect) {
            rect.top = f.this.L0(null, rect);
        }
    }

    class e implements ContentFrameLayout.a {
        e() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            f.this.S();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.f$f, reason: collision with other inner class name */
    class RunnableC0040f implements Runnable {

        /* JADX INFO: renamed from: androidx.appcompat.app.f$f$a */
        class a extends b0 {
            a() {
            }

            @Override // a.g.l.a0
            public void a(View view) {
                f.this.w.setAlpha(1.0f);
                f.this.z.f(null);
                f.this.z = null;
            }

            @Override // a.g.l.b0, a.g.l.a0
            public void b(View view) {
                f.this.w.setVisibility(0);
            }
        }

        RunnableC0040f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.x.showAtLocation(fVar.w, 55, 0, 0);
            f.this.V();
            if (!f.this.D0()) {
                f.this.w.setAlpha(1.0f);
                f.this.w.setVisibility(0);
            } else {
                f.this.w.setAlpha(0.0f);
                f fVar2 = f.this;
                fVar2.z = v.d(fVar2.w).a(1.0f);
                f.this.z.f(new a());
            }
        }
    }

    class g extends b0 {
        g() {
        }

        @Override // a.g.l.a0
        public void a(View view) {
            f.this.w.setAlpha(1.0f);
            f.this.z.f(null);
            f.this.z = null;
        }

        @Override // a.g.l.b0, a.g.l.a0
        public void b(View view) {
            f.this.w.setVisibility(0);
            f.this.w.sendAccessibilityEvent(32);
            if (f.this.w.getParent() instanceof View) {
                v.l0((View) f.this.w.getParent());
            }
        }
    }

    private final class h implements androidx.appcompat.view.menu.m.a {
        h() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            f.this.L(gVar);
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackF0 = f.this.f0();
            if (callbackF0 == null) {
                return true;
            }
            callbackF0.onMenuOpened(108, gVar);
            return true;
        }
    }

    class i implements a.a.n.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a.a.n.b.a f1098a;

        class a extends b0 {
            a() {
            }

            @Override // a.g.l.a0
            public void a(View view) {
                f.this.w.setVisibility(8);
                f fVar = f.this;
                PopupWindow popupWindow = fVar.x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (fVar.w.getParent() instanceof View) {
                    v.l0((View) f.this.w.getParent());
                }
                f.this.w.k();
                f.this.z.f(null);
                f fVar2 = f.this;
                fVar2.z = null;
                v.l0(fVar2.C);
            }
        }

        public i(a.a.n.b.a aVar) {
            this.f1098a = aVar;
        }

        @Override // a.a.n.b.a
        public boolean a(a.a.n.b bVar, Menu menu) {
            v.l0(f.this.C);
            return this.f1098a.a(bVar, menu);
        }

        @Override // a.a.n.b.a
        public boolean b(a.a.n.b bVar, MenuItem menuItem) {
            return this.f1098a.b(bVar, menuItem);
        }

        @Override // a.a.n.b.a
        public boolean c(a.a.n.b bVar, Menu menu) {
            return this.f1098a.c(bVar, menu);
        }

        @Override // a.a.n.b.a
        public void d(a.a.n.b bVar) {
            this.f1098a.d(bVar);
            f fVar = f.this;
            if (fVar.x != null) {
                fVar.m.getDecorView().removeCallbacks(f.this.y);
            }
            f fVar2 = f.this;
            if (fVar2.w != null) {
                fVar2.V();
                f fVar3 = f.this;
                fVar3.z = v.d(fVar3.w).a(0.0f);
                f.this.z.f(new a());
            }
            f fVar4 = f.this;
            androidx.appcompat.app.d dVar = fVar4.o;
            if (dVar != null) {
                dVar.i(fVar4.v);
            }
            f fVar5 = f.this;
            fVar5.v = null;
            v.l0(fVar5.C);
        }
    }

    static class j {
        static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.densityDpi;
            int i2 = configuration2.densityDpi;
            if (i != i2) {
                configuration3.densityDpi = i2;
            }
        }
    }

    static class k {
        static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }
    }

    static class l {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }
    }

    static class m {
        static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i = configuration.colorMode & 3;
            int i2 = configuration2.colorMode;
            if (i != (i2 & 3)) {
                configuration3.colorMode |= i2 & 3;
            }
            int i3 = configuration.colorMode & 12;
            int i4 = configuration2.colorMode;
            if (i3 != (i4 & 12)) {
                configuration3.colorMode |= i4 & 12;
            }
        }
    }

    class n extends a.a.n.i {
        n(Window.Callback callback) {
            super(callback);
        }

        final ActionMode b(ActionMode.Callback callback) {
            a.a.n.f.a aVar = new a.a.n.f.a(f.this.l, callback);
            a.a.n.b bVarF0 = f.this.F0(aVar);
            if (bVarF0 != null) {
                return aVar.e(bVarF0);
            }
            return null;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || f.this.r0(keyEvent.getKeyCode(), keyEvent);
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i, Menu menu) {
            if (i != 0 || (menu instanceof androidx.appcompat.view.menu.g)) {
                return super.onCreatePanelMenu(i, menu);
            }
            return false;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            f.this.u0(i);
            return true;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            f.this.v0(i);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public boolean onPreparePanel(int i, View view, Menu menu) {
            androidx.appcompat.view.menu.g gVar = menu instanceof androidx.appcompat.view.menu.g ? (androidx.appcompat.view.menu.g) menu : null;
            if (i == 0 && gVar == null) {
                return false;
            }
            if (gVar != null) {
                gVar.a0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i, view, menu);
            if (gVar != null) {
                gVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            androidx.appcompat.view.menu.g gVar;
            t tVarD0 = f.this.d0(0, true);
            if (tVarD0 == null || (gVar = tVarD0.j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, gVar, i);
            }
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return f.this.m0() ? b(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // a.a.n.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            return (f.this.m0() && i == 0) ? b(callback) : super.onWindowStartingActionMode(callback, i);
        }
    }

    private class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final PowerManager f1102c;

        o(Context context) {
            super();
            this.f1102c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // androidx.appcompat.app.f.p
        IntentFilter b() {
            if (Build.VERSION.SDK_INT < 21) {
                return null;
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.p
        public int c() {
            return (Build.VERSION.SDK_INT < 21 || !k.a(this.f1102c)) ? 1 : 2;
        }

        @Override // androidx.appcompat.app.f.p
        public void d() {
            f.this.F();
        }
    }

    abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BroadcastReceiver f1104a;

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        p() {
        }

        void a() {
            BroadcastReceiver broadcastReceiver = this.f1104a;
            if (broadcastReceiver != null) {
                try {
                    f.this.l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f1104a = null;
            }
        }

        abstract IntentFilter b();

        abstract int c();

        abstract void d();

        void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f1104a == null) {
                this.f1104a = new a();
            }
            f.this.l.registerReceiver(this.f1104a, intentFilterB);
        }
    }

    private class q extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.appcompat.app.l f1107c;

        q(androidx.appcompat.app.l lVar) {
            super();
            this.f1107c = lVar;
        }

        @Override // androidx.appcompat.app.f.p
        IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // androidx.appcompat.app.f.p
        public int c() {
            return this.f1107c.d() ? 2 : 1;
        }

        @Override // androidx.appcompat.app.f.p
        public void d() {
            f.this.F();
        }
    }

    private static class r {
        static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    private class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        private boolean c(int i, int i2) {
            return i < -5 || i2 < -5 || i > getWidth() + 5 || i2 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return f.this.T(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !c((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            f.this.N(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i) {
            setBackgroundDrawable(a.a.k.a.a.d(getContext(), i));
        }
    }

    protected static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f1110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1111c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f1112d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1113e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1114f;
        ViewGroup g;
        View h;
        View i;
        androidx.appcompat.view.menu.g j;
        androidx.appcompat.view.menu.e k;
        Context l;
        boolean m;
        boolean n;
        boolean o;
        public boolean p;
        boolean q = false;
        boolean r;
        Bundle s;

        t(int i) {
            this.f1109a = i;
        }

        androidx.appcompat.view.menu.n a(androidx.appcompat.view.menu.m.a aVar) {
            if (this.j == null) {
                return null;
            }
            if (this.k == null) {
                androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(this.l, a.a.g.j);
                this.k = eVar;
                eVar.h(aVar);
                this.j.b(this.k);
            }
            return this.k.g(this.g);
        }

        public boolean b() {
            if (this.h == null) {
                return false;
            }
            return this.i != null || this.k.b().getCount() > 0;
        }

        void c(androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.g gVar2 = this.j;
            if (gVar == gVar2) {
                return;
            }
            if (gVar2 != null) {
                gVar2.O(this.k);
            }
            this.j = gVar;
            if (gVar == null || (eVar = this.k) == null) {
                return;
            }
            gVar.b(eVar);
        }

        void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(a.a.a.f0a, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                themeNewTheme.applyStyle(i, true);
            }
            themeNewTheme.resolveAttribute(a.a.a.E, typedValue, true);
            int i2 = typedValue.resourceId;
            if (i2 == 0) {
                i2 = a.a.i.f44b;
            }
            themeNewTheme.applyStyle(i2, true);
            a.a.n.d dVar = new a.a.n.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(a.a.j.z0);
            this.f1110b = typedArrayObtainStyledAttributes.getResourceId(a.a.j.C0, 0);
            this.f1114f = typedArrayObtainStyledAttributes.getResourceId(a.a.j.B0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private final class u implements androidx.appcompat.view.menu.m.a {
        u() {
        }

        @Override // androidx.appcompat.view.menu.m.a
        public void a(androidx.appcompat.view.menu.g gVar, boolean z) {
            androidx.appcompat.view.menu.g gVarD = gVar.D();
            boolean z2 = gVarD != gVar;
            f fVar = f.this;
            if (z2) {
                gVar = gVarD;
            }
            t tVarY = fVar.Y(gVar);
            if (tVarY != null) {
                if (!z2) {
                    f.this.O(tVarY, z);
                } else {
                    f.this.K(tVarY.f1109a, tVarY, gVarD);
                    f.this.O(tVarY, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.m.a
        public boolean b(androidx.appcompat.view.menu.g gVar) {
            Window.Callback callbackF0;
            if (gVar != gVar.D()) {
                return true;
            }
            f fVar = f.this;
            if (!fVar.H || (callbackF0 = fVar.f0()) == null || f.this.T) {
                return true;
            }
            callbackF0.onMenuOpened(108, gVar);
            return true;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z = i2 < 21;
        f1088f = z;
        g = new int[]{R.attr.windowBackground};
        h = !"robolectric".equals(Build.FINGERPRINT);
        i = i2 >= 17;
        if (!z || j) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(new a(Thread.getDefaultUncaughtExceptionHandler()));
        j = true;
    }

    f(Activity activity, androidx.appcompat.app.d dVar) {
        this(activity, null, dVar, activity);
    }

    f(Dialog dialog, androidx.appcompat.app.d dVar) {
        this(dialog.getContext(), dialog.getWindow(), dVar, dialog);
    }

    private f(Context context, Window window, androidx.appcompat.app.d dVar, Object obj) {
        a.d.g<String, Integer> gVar;
        Integer num;
        androidx.appcompat.app.c cVarI0;
        this.z = null;
        this.A = true;
        this.U = -100;
        this.c0 = new b();
        this.l = context;
        this.o = dVar;
        this.k = obj;
        if (this.U == -100 && (obj instanceof Dialog) && (cVarI0 = I0()) != null) {
            this.U = cVarI0.z().k();
        }
        if (this.U == -100 && (num = (gVar = f1087e).get(obj.getClass().getName())) != null) {
            this.U = num.intValue();
            gVar.remove(obj.getClass().getName());
        }
        if (window != null) {
            I(window);
        }
        androidx.appcompat.widget.j.h();
    }

    private boolean A0(t tVar, KeyEvent keyEvent) {
        d0 d0Var;
        d0 d0Var2;
        d0 d0Var3;
        if (this.T) {
            return false;
        }
        if (tVar.m) {
            return true;
        }
        t tVar2 = this.O;
        if (tVar2 != null && tVar2 != tVar) {
            O(tVar2, false);
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null) {
            tVar.i = callbackF0.onCreatePanelView(tVar.f1109a);
        }
        int i2 = tVar.f1109a;
        boolean z = i2 == 0 || i2 == 108;
        if (z && (d0Var3 = this.s) != null) {
            d0Var3.f();
        }
        if (tVar.i == null) {
            if (z) {
                y0();
            }
            androidx.appcompat.view.menu.g gVar = tVar.j;
            if (gVar == null || tVar.r) {
                if (gVar == null && (!j0(tVar) || tVar.j == null)) {
                    return false;
                }
                if (z && this.s != null) {
                    if (this.t == null) {
                        this.t = new h();
                    }
                    this.s.a(tVar.j, this.t);
                }
                tVar.j.d0();
                if (!callbackF0.onCreatePanelMenu(tVar.f1109a, tVar.j)) {
                    tVar.c(null);
                    if (z && (d0Var = this.s) != null) {
                        d0Var.a(null, this.t);
                    }
                    return false;
                }
                tVar.r = false;
            }
            tVar.j.d0();
            Bundle bundle = tVar.s;
            if (bundle != null) {
                tVar.j.P(bundle);
                tVar.s = null;
            }
            if (!callbackF0.onPreparePanel(0, tVar.i, tVar.j)) {
                if (z && (d0Var2 = this.s) != null) {
                    d0Var2.a(null, this.t);
                }
                tVar.j.c0();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.p = z2;
            tVar.j.setQwertyMode(z2);
            tVar.j.c0();
        }
        tVar.m = true;
        tVar.n = false;
        this.O = tVar;
        return true;
    }

    private void B0(boolean z) {
        d0 d0Var = this.s;
        if (d0Var == null || !d0Var.g() || (ViewConfiguration.get(this.l).hasPermanentMenuKey() && !this.s.b())) {
            t tVarD0 = d0(0, true);
            tVarD0.q = true;
            O(tVarD0, false);
            x0(tVarD0, null);
            return;
        }
        Window.Callback callbackF0 = f0();
        if (this.s.c() && z) {
            this.s.d();
            if (this.T) {
                return;
            }
            callbackF0.onPanelClosed(108, d0(0, true).j);
            return;
        }
        if (callbackF0 == null || this.T) {
            return;
        }
        if (this.a0 && (this.b0 & 1) != 0) {
            this.m.getDecorView().removeCallbacks(this.c0);
            this.c0.run();
        }
        t tVarD1 = d0(0, true);
        androidx.appcompat.view.menu.g gVar = tVarD1.j;
        if (gVar == null || tVarD1.r || !callbackF0.onPreparePanel(0, tVarD1.i, gVar)) {
            return;
        }
        callbackF0.onMenuOpened(108, tVarD1.j);
        this.s.e();
    }

    private int C0(int i2) {
        if (i2 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i2 != 9) {
            return i2;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    private boolean E0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || v.S((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    private boolean G(boolean z) {
        if (this.T) {
            return false;
        }
        int iJ = J();
        boolean zJ0 = J0(n0(this.l, iJ), z);
        if (iJ == 0) {
            c0(this.l).e();
        } else {
            p pVar = this.Y;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iJ == 3) {
            b0(this.l).e();
        } else {
            p pVar2 = this.Z;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return zJ0;
    }

    private void H() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.C.findViewById(R.id.content);
        View decorView = this.m.getDecorView();
        contentFrameLayout.b(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.l.obtainStyledAttributes(a.a.j.z0);
        typedArrayObtainStyledAttributes.getValue(a.a.j.L0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(a.a.j.M0, contentFrameLayout.getMinWidthMinor());
        int i2 = a.a.j.J0;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.getValue(i2, contentFrameLayout.getFixedWidthMajor());
        }
        int i3 = a.a.j.K0;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            typedArrayObtainStyledAttributes.getValue(i3, contentFrameLayout.getFixedWidthMinor());
        }
        int i4 = a.a.j.H0;
        if (typedArrayObtainStyledAttributes.hasValue(i4)) {
            typedArrayObtainStyledAttributes.getValue(i4, contentFrameLayout.getFixedHeightMajor());
        }
        int i5 = a.a.j.I0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            typedArrayObtainStyledAttributes.getValue(i5, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    private void H0() {
        if (this.B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private void I(Window window) {
        if (this.m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.n = nVar;
        window.setCallback(nVar);
        x0 x0VarU = x0.u(this.l, null, g);
        Drawable drawableH = x0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        x0VarU.w();
        this.m = window;
    }

    private androidx.appcompat.app.c I0() {
        for (Context baseContext = this.l; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.c) {
                return (androidx.appcompat.app.c) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    private int J() {
        int i2 = this.U;
        return i2 != -100 ? i2 : androidx.appcompat.app.e.j();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0047  */
    private boolean J0(int i2, boolean z) {
        boolean z2;
        Configuration configurationP = P(this.l, i2, null);
        boolean zL0 = l0();
        int i3 = this.l.getResources().getConfiguration().uiMode & 48;
        int i4 = configurationP.uiMode & 48;
        boolean z3 = true;
        if (i3 != i4 && z && !zL0 && this.Q && (h || this.R)) {
            Object obj = this.k;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z2 = false;
            } else {
                androidx.core.app.a.j((Activity) this.k);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        if (z2 || i3 == i4) {
            z3 = z2;
        } else {
            K0(i4, zL0, null);
        }
        if (z3) {
            Object obj2 = this.k;
            if (obj2 instanceof androidx.appcompat.app.c) {
                ((androidx.appcompat.app.c) obj2).D(i2);
            }
        }
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void K0(int i2, boolean z, Configuration configuration) {
        Resources resources = this.l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i2 | (resources.getConfiguration().uiMode & (-49));
        resources.updateConfiguration(configuration2, null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 26) {
            androidx.appcompat.app.j.a(resources);
        }
        int i4 = this.V;
        if (i4 != 0) {
            this.l.setTheme(i4);
            if (i3 >= 23) {
                this.l.getTheme().applyStyle(this.V, true);
            }
        }
        if (z) {
            Object obj = this.k;
            if (obj instanceof Activity) {
                Activity activity = (Activity) obj;
                if (activity instanceof androidx.lifecycle.g) {
                    if (!((androidx.lifecycle.g) activity).a().b().a(androidx.lifecycle.d.c.STARTED)) {
                        return;
                    }
                } else if (!this.S) {
                    return;
                }
                activity.onConfigurationChanged(configuration2);
            }
        }
    }

    private void M() {
        p pVar = this.Y;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.Z;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    private void M0(View view) {
        view.setBackgroundColor(a.g.d.a.c(this.l, (v.M(view) & 8192) != 0 ? a.a.c.f8b : a.a.c.f7a));
    }

    private Configuration P(Context context, int i2, Configuration configuration) {
        int i3;
        if (i2 != 1) {
            i3 = i2 != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32;
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    private ViewGroup Q() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.l.obtainStyledAttributes(a.a.j.z0);
        int i2 = a.a.j.E0;
        if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.a.j.N0, false)) {
            z(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(i2, false)) {
            z(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.a.j.F0, false)) {
            z(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(a.a.j.G0, false)) {
            z(10);
        }
        this.K = typedArrayObtainStyledAttributes.getBoolean(a.a.j.A0, false);
        typedArrayObtainStyledAttributes.recycle();
        X();
        this.m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.l);
        if (this.L) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.J ? a.a.g.o : a.a.g.n, (ViewGroup) null);
        } else if (this.K) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(a.a.g.f36f, (ViewGroup) null);
            this.I = false;
            this.H = false;
        } else if (this.H) {
            TypedValue typedValue = new TypedValue();
            this.l.getTheme().resolveAttribute(a.a.a.f5f, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new a.a.n.d(this.l, typedValue.resourceId) : this.l).inflate(a.a.g.p, (ViewGroup) null);
            d0 d0Var = (d0) viewGroup.findViewById(a.a.f.p);
            this.s = d0Var;
            d0Var.setWindowCallback(f0());
            if (this.I) {
                this.s.k(109);
            }
            if (this.F) {
                this.s.k(2);
            }
            if (this.G) {
                this.s.k(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.H + ", windowActionBarOverlay: " + this.I + ", android:windowIsFloating: " + this.K + ", windowActionModeOverlay: " + this.J + ", windowNoTitle: " + this.L + " }");
        }
        if (Build.VERSION.SDK_INT >= 21) {
            v.z0(viewGroup, new c());
        } else if (viewGroup instanceof h0) {
            ((h0) viewGroup).setOnFitSystemWindowsListener(new d());
        }
        if (this.s == null) {
            this.D = (TextView) viewGroup.findViewById(a.a.f.M);
        }
        d1.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(a.a.f.f26b);
        ViewGroup viewGroup2 = (ViewGroup) this.m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new e());
        return viewGroup;
    }

    private void W() {
        if (this.B) {
            return;
        }
        this.C = Q();
        CharSequence charSequenceE0 = e0();
        if (!TextUtils.isEmpty(charSequenceE0)) {
            d0 d0Var = this.s;
            if (d0Var != null) {
                d0Var.setWindowTitle(charSequenceE0);
            } else if (y0() != null) {
                y0().t(charSequenceE0);
            } else {
                TextView textView = this.D;
                if (textView != null) {
                    textView.setText(charSequenceE0);
                }
            }
        }
        H();
        w0(this.C);
        this.B = true;
        t tVarD0 = d0(0, false);
        if (this.T) {
            return;
        }
        if (tVarD0 == null || tVarD0.j == null) {
            k0(108);
        }
    }

    private void X() {
        if (this.m == null) {
            Object obj = this.k;
            if (obj instanceof Activity) {
                I(((Activity) obj).getWindow());
            }
        }
        if (this.m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private static Configuration Z(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f2 = configuration.fontScale;
            float f3 = configuration2.fontScale;
            if (f2 != f3) {
                configuration3.fontScale = f3;
            }
            int i2 = configuration.mcc;
            int i3 = configuration2.mcc;
            if (i2 != i3) {
                configuration3.mcc = i3;
            }
            int i4 = configuration.mnc;
            int i5 = configuration2.mnc;
            if (i4 != i5) {
                configuration3.mnc = i5;
            }
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 24) {
                l.a(configuration, configuration2, configuration3);
            } else if (!a.g.k.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i7 = configuration.touchscreen;
            int i8 = configuration2.touchscreen;
            if (i7 != i8) {
                configuration3.touchscreen = i8;
            }
            int i9 = configuration.keyboard;
            int i10 = configuration2.keyboard;
            if (i9 != i10) {
                configuration3.keyboard = i10;
            }
            int i11 = configuration.keyboardHidden;
            int i12 = configuration2.keyboardHidden;
            if (i11 != i12) {
                configuration3.keyboardHidden = i12;
            }
            int i13 = configuration.navigation;
            int i14 = configuration2.navigation;
            if (i13 != i14) {
                configuration3.navigation = i14;
            }
            int i15 = configuration.navigationHidden;
            int i16 = configuration2.navigationHidden;
            if (i15 != i16) {
                configuration3.navigationHidden = i16;
            }
            int i17 = configuration.orientation;
            int i18 = configuration2.orientation;
            if (i17 != i18) {
                configuration3.orientation = i18;
            }
            int i19 = configuration.screenLayout & 15;
            int i20 = configuration2.screenLayout;
            if (i19 != (i20 & 15)) {
                configuration3.screenLayout |= i20 & 15;
            }
            int i21 = configuration.screenLayout & 192;
            int i22 = configuration2.screenLayout;
            if (i21 != (i22 & 192)) {
                configuration3.screenLayout |= i22 & 192;
            }
            int i23 = configuration.screenLayout & 48;
            int i24 = configuration2.screenLayout;
            if (i23 != (i24 & 48)) {
                configuration3.screenLayout |= i24 & 48;
            }
            int i25 = configuration.screenLayout & 768;
            int i26 = configuration2.screenLayout;
            if (i25 != (i26 & 768)) {
                configuration3.screenLayout |= i26 & 768;
            }
            if (i6 >= 26) {
                m.a(configuration, configuration2, configuration3);
            }
            int i27 = configuration.uiMode & 15;
            int i28 = configuration2.uiMode;
            if (i27 != (i28 & 15)) {
                configuration3.uiMode |= i28 & 15;
            }
            int i29 = configuration.uiMode & 48;
            int i30 = configuration2.uiMode;
            if (i29 != (i30 & 48)) {
                configuration3.uiMode |= i30 & 48;
            }
            int i31 = configuration.screenWidthDp;
            int i32 = configuration2.screenWidthDp;
            if (i31 != i32) {
                configuration3.screenWidthDp = i32;
            }
            int i33 = configuration.screenHeightDp;
            int i34 = configuration2.screenHeightDp;
            if (i33 != i34) {
                configuration3.screenHeightDp = i34;
            }
            int i35 = configuration.smallestScreenWidthDp;
            int i36 = configuration2.smallestScreenWidthDp;
            if (i35 != i36) {
                configuration3.smallestScreenWidthDp = i36;
            }
            if (i6 >= 17) {
                j.b(configuration, configuration2, configuration3);
            }
        }
        return configuration3;
    }

    private p b0(Context context) {
        if (this.Z == null) {
            this.Z = new o(context);
        }
        return this.Z;
    }

    private p c0(Context context) {
        if (this.Y == null) {
            this.Y = new q(androidx.appcompat.app.l.a(context));
        }
        return this.Y;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0032  */
    /* JADX WARN: Code duplicated, block: B:19:? A[RETURN, SYNTHETIC] */
    private void g0() {
        androidx.appcompat.app.m mVar;
        androidx.appcompat.app.a aVar;
        W();
        if (this.H && this.p == null) {
            Object obj = this.k;
            if (!(obj instanceof Activity)) {
                if (obj instanceof Dialog) {
                    mVar = new androidx.appcompat.app.m((Dialog) this.k);
                }
                aVar = this.p;
                if (aVar != null) {
                    aVar.r(this.d0);
                }
            }
            mVar = new androidx.appcompat.app.m((Activity) this.k, this.I);
            this.p = mVar;
            aVar = this.p;
            if (aVar != null) {
                aVar.r(this.d0);
            }
        }
    }

    private boolean h0(t tVar) {
        View view = tVar.i;
        if (view != null) {
            tVar.h = view;
            return true;
        }
        if (tVar.j == null) {
            return false;
        }
        if (this.u == null) {
            this.u = new u();
        }
        View view2 = (View) tVar.a(this.u);
        tVar.h = view2;
        return view2 != null;
    }

    private boolean i0(t tVar) {
        tVar.d(a0());
        tVar.g = new s(tVar.l);
        tVar.f1111c = 81;
        return true;
    }

    private boolean j0(t tVar) {
        Context context = this.l;
        int i2 = tVar.f1109a;
        if ((i2 == 0 || i2 == 108) && this.s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(a.a.a.f5f, typedValue, true);
            Resources.Theme themeNewTheme = null;
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(a.a.a.g, typedValue, true);
            } else {
                theme.resolveAttribute(a.a.a.g, typedValue, true);
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                a.a.n.d dVar = new a.a.n.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        gVar.R(this);
        tVar.c(gVar);
        return true;
    }

    private void k0(int i2) {
        this.b0 = (1 << i2) | this.b0;
        if (this.a0) {
            return;
        }
        v.g0(this.m.getDecorView(), this.c0);
        this.a0 = true;
    }

    private boolean l0() {
        int i2;
        if (!this.X && (this.k instanceof Activity)) {
            PackageManager packageManager = this.l.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            try {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    i2 = 269221888;
                } else {
                    i2 = i3 >= 24 ? 786432 : 0;
                }
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(this.l, this.k.getClass()), i2);
                this.W = (activityInfo == null || (activityInfo.configChanges & 512) == 0) ? false : true;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e2);
                this.W = false;
            }
        }
        this.X = true;
        return this.W;
    }

    private boolean q0(int i2, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t tVarD0 = d0(i2, true);
        if (tVarD0.o) {
            return false;
        }
        return A0(tVarD0, keyEvent);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    private boolean t0(int i2, KeyEvent keyEvent) {
        boolean zA0;
        d0 d0Var;
        if (this.v != null) {
            return false;
        }
        boolean zD = true;
        t tVarD0 = d0(i2, true);
        if (i2 != 0 || (d0Var = this.s) == null || !d0Var.g() || ViewConfiguration.get(this.l).hasPermanentMenuKey()) {
            boolean z = tVarD0.o;
            if (z || tVarD0.n) {
                O(tVarD0, true);
                zD = z;
            } else if (tVarD0.m) {
                if (tVarD0.r) {
                    tVarD0.m = false;
                    zA0 = A0(tVarD0, keyEvent);
                } else {
                    zA0 = true;
                }
                if (zA0) {
                    x0(tVarD0, keyEvent);
                } else {
                    zD = false;
                }
            } else {
                zD = false;
            }
        } else if (this.s.c()) {
            zD = this.s.d();
        } else if (this.T || !A0(tVarD0, keyEvent)) {
            zD = false;
        } else {
            zD = this.s.e();
        }
        if (zD) {
            AudioManager audioManager = (AudioManager) this.l.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return zD;
    }

    private void x0(t tVar, KeyEvent keyEvent) {
        int i2;
        ViewGroup.LayoutParams layoutParams;
        if (tVar.o || this.T) {
            return;
        }
        if (tVar.f1109a == 0) {
            if ((this.l.getResources().getConfiguration().screenLayout & 15) == 4) {
                return;
            }
        }
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !callbackF0.onMenuOpened(tVar.f1109a, tVar.j)) {
            O(tVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.l.getSystemService("window");
        if (windowManager != null && A0(tVar, keyEvent)) {
            ViewGroup viewGroup = tVar.g;
            if (viewGroup != null && !tVar.q) {
                View view = tVar.i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i2 = -1;
                }
                tVar.n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i2, -2, tVar.f1112d, tVar.f1113e, 1002, 8519680, -3);
                layoutParams2.gravity = tVar.f1111c;
                layoutParams2.windowAnimations = tVar.f1114f;
                windowManager.addView(tVar.g, layoutParams2);
                tVar.o = true;
            }
            if (viewGroup == null) {
                if (!i0(tVar) || tVar.g == null) {
                    return;
                }
            } else if (tVar.q && viewGroup.getChildCount() > 0) {
                tVar.g.removeAllViews();
            }
            if (!h0(tVar) || !tVar.b()) {
                tVar.q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = tVar.h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            tVar.g.setBackgroundResource(tVar.f1110b);
            ViewParent parent = tVar.h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(tVar.h);
            }
            tVar.g.addView(tVar.h, layoutParams3);
            if (!tVar.h.hasFocus()) {
                tVar.h.requestFocus();
            }
            i2 = -2;
            tVar.n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i2, -2, tVar.f1112d, tVar.f1113e, 1002, 8519680, -3);
            layoutParams4.gravity = tVar.f1111c;
            layoutParams4.windowAnimations = tVar.f1114f;
            windowManager.addView(tVar.g, layoutParams4);
            tVar.o = true;
        }
    }

    private boolean z0(t tVar, int i2, KeyEvent keyEvent, int i3) {
        androidx.appcompat.view.menu.g gVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.m || A0(tVar, keyEvent)) && (gVar = tVar.j) != null) {
            zPerformShortcut = gVar.performShortcut(i2, keyEvent, i3);
        }
        if (zPerformShortcut && (i3 & 1) == 0 && this.s == null) {
            O(tVar, true);
        }
        return zPerformShortcut;
    }

    @Override // androidx.appcompat.app.e
    public void A(int i2) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.l).inflate(i2, viewGroup);
        this.n.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void B(View view) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.n.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void C(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ViewGroup viewGroup = (ViewGroup) this.C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.n.a().onContentChanged();
    }

    @Override // androidx.appcompat.app.e
    public void D(int i2) {
        this.V = i2;
    }

    final boolean D0() {
        ViewGroup viewGroup;
        return this.B && (viewGroup = this.C) != null && v.T(viewGroup);
    }

    @Override // androidx.appcompat.app.e
    public final void E(CharSequence charSequence) {
        this.r = charSequence;
        d0 d0Var = this.s;
        if (d0Var != null) {
            d0Var.setWindowTitle(charSequence);
            return;
        }
        if (y0() != null) {
            y0().t(charSequence);
            return;
        }
        TextView textView = this.D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean F() {
        return G(true);
    }

    public a.a.n.b F0(a.a.n.b.a aVar) {
        androidx.appcompat.app.d dVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        a.a.n.b bVar = this.v;
        if (bVar != null) {
            bVar.c();
        }
        i iVar = new i(aVar);
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null) {
            a.a.n.b bVarU = aVarM.u(iVar);
            this.v = bVarU;
            if (bVarU != null && (dVar = this.o) != null) {
                dVar.g(bVarU);
            }
        }
        if (this.v == null) {
            this.v = G0(iVar);
        }
        return this.v;
    }

    a.a.n.b G0(a.a.n.b.a aVar) {
        a.a.n.b bVarJ;
        Context dVar;
        androidx.appcompat.app.d dVar2;
        V();
        a.a.n.b bVar = this.v;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof i)) {
            aVar = new i(aVar);
        }
        androidx.appcompat.app.d dVar3 = this.o;
        if (dVar3 == null || this.T) {
            bVarJ = null;
        } else {
            try {
                bVarJ = dVar3.j(aVar);
            } catch (AbstractMethodError unused) {
                bVarJ = null;
            }
        }
        if (bVarJ != null) {
            this.v = bVarJ;
        } else {
            if (this.w == null) {
                if (this.K) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.l.getTheme();
                    theme.resolveAttribute(a.a.a.f5f, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.l.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new a.a.n.d(this.l, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.l;
                    }
                    this.w = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, a.a.a.i);
                    this.x = popupWindow;
                    androidx.core.widget.h.b(popupWindow, 2);
                    this.x.setContentView(this.w);
                    this.x.setWidth(-1);
                    dVar.getTheme().resolveAttribute(a.a.a.f1b, typedValue, true);
                    this.w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.x.setHeight(-2);
                    this.y = new RunnableC0040f();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.C.findViewById(a.a.f.h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(a0()));
                        this.w = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.w != null) {
                V();
                this.w.k();
                a.a.n.e eVar = new a.a.n.e(this.w.getContext(), this.w, aVar, this.x == null);
                if (aVar.c(eVar, eVar.e())) {
                    eVar.k();
                    this.w.h(eVar);
                    this.v = eVar;
                    if (D0()) {
                        this.w.setAlpha(0.0f);
                        z zVarA = v.d(this.w).a(1.0f);
                        this.z = zVarA;
                        zVarA.f(new g());
                    } else {
                        this.w.setAlpha(1.0f);
                        this.w.setVisibility(0);
                        this.w.sendAccessibilityEvent(32);
                        if (this.w.getParent() instanceof View) {
                            v.l0((View) this.w.getParent());
                        }
                    }
                    if (this.x != null) {
                        this.m.getDecorView().post(this.y);
                    }
                } else {
                    this.v = null;
                }
            }
        }
        a.a.n.b bVar2 = this.v;
        if (bVar2 != null && (dVar2 = this.o) != null) {
            dVar2.g(bVar2);
        }
        return this.v;
    }

    void K(int i2, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i2 >= 0) {
                t[] tVarArr = this.N;
                if (i2 < tVarArr.length) {
                    tVar = tVarArr[i2];
                }
            }
            if (tVar != null) {
                menu = tVar.j;
            }
        }
        if ((tVar == null || tVar.o) && !this.T) {
            this.n.a().onPanelClosed(i2, menu);
        }
    }

    void L(androidx.appcompat.view.menu.g gVar) {
        if (this.M) {
            return;
        }
        this.M = true;
        this.s.l();
        Window.Callback callbackF0 = f0();
        if (callbackF0 != null && !this.T) {
            callbackF0.onPanelClosed(108, gVar);
        }
        this.M = false;
    }

    final int L0(a.g.l.d0 d0Var, Rect rect) {
        int i2;
        boolean z;
        boolean z2;
        if (d0Var != null) {
            i2 = d0Var.i();
        } else {
            i2 = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.w.getLayoutParams();
            boolean z3 = true;
            if (this.w.isShown()) {
                if (this.e0 == null) {
                    this.e0 = new Rect();
                    this.f0 = new Rect();
                }
                Rect rect2 = this.e0;
                Rect rect3 = this.f0;
                if (d0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(d0Var.g(), d0Var.i(), d0Var.h(), d0Var.f());
                }
                d1.a(this.C, rect2, rect3);
                int i3 = rect2.top;
                int i4 = rect2.left;
                int i5 = rect2.right;
                a.g.l.d0 d0VarJ = v.J(this.C);
                int iG = d0VarJ == null ? 0 : d0VarJ.g();
                int iH = d0VarJ == null ? 0 : d0VarJ.h();
                if (marginLayoutParams.topMargin == i3 && marginLayoutParams.leftMargin == i4 && marginLayoutParams.rightMargin == i5) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i3;
                    marginLayoutParams.leftMargin = i4;
                    marginLayoutParams.rightMargin = i5;
                    z2 = true;
                }
                if (i3 <= 0 || this.E != null) {
                    View view = this.E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i6 = marginLayoutParams2.height;
                        int i7 = marginLayoutParams.topMargin;
                        if (i6 != i7 || marginLayoutParams2.leftMargin != iG || marginLayoutParams2.rightMargin != iH) {
                            marginLayoutParams2.height = i7;
                            marginLayoutParams2.leftMargin = iG;
                            marginLayoutParams2.rightMargin = iH;
                            this.E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.l);
                    this.E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iG;
                    layoutParams.rightMargin = iH;
                    this.C.addView(this.E, -1, layoutParams);
                }
                View view3 = this.E;
                z3 = view3 != null;
                if (z3 && view3.getVisibility() != 0) {
                    M0(this.E);
                }
                if (!this.J && z3) {
                    i2 = 0;
                }
                z = z3;
                z3 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                z = false;
                z3 = false;
            }
            if (z3) {
                this.w.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.E;
        if (view4 != null) {
            view4.setVisibility(z ? 0 : 8);
        }
        return i2;
    }

    void N(int i2) {
        O(d0(i2, true), true);
    }

    void O(t tVar, boolean z) {
        ViewGroup viewGroup;
        d0 d0Var;
        if (z && tVar.f1109a == 0 && (d0Var = this.s) != null && d0Var.c()) {
            L(tVar.j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.l.getSystemService("window");
        if (windowManager != null && tVar.o && (viewGroup = tVar.g) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                K(tVar.f1109a, tVar, null);
            }
        }
        tVar.m = false;
        tVar.n = false;
        tVar.o = false;
        tVar.h = null;
        tVar.q = true;
        if (this.O == tVar) {
            this.O = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View R(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        androidx.appcompat.app.h hVar;
        boolean z2 = false;
        if (this.g0 == null) {
            String string = this.l.obtainStyledAttributes(a.a.j.z0).getString(a.a.j.D0);
            if (string == null) {
                hVar = new androidx.appcompat.app.h();
            } else {
                try {
                    this.g0 = (androidx.appcompat.app.h) Class.forName(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    hVar = new androidx.appcompat.app.h();
                    this.g0 = hVar;
                }
            }
            this.g0 = hVar;
        }
        boolean z3 = f1088f;
        boolean zE0 = true;
        if (z3) {
            if (this.h0 == null) {
                this.h0 = new androidx.appcompat.app.i();
            }
            if (this.h0.a(attributeSet)) {
                z = true;
            } else {
                if (attributeSet instanceof XmlPullParser) {
                    if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    }
                    z = z2;
                } else {
                    zE0 = E0((ViewParent) view);
                }
                z2 = zE0;
                z = z2;
            }
        } else {
            z = z2;
        }
        return this.g0.q(view, str, context, attributeSet, z, z3, true, c1.b());
    }

    void S() {
        androidx.appcompat.view.menu.g gVar;
        d0 d0Var = this.s;
        if (d0Var != null) {
            d0Var.l();
        }
        if (this.x != null) {
            this.m.getDecorView().removeCallbacks(this.y);
            if (this.x.isShowing()) {
                try {
                    this.x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.x = null;
        }
        V();
        t tVarD0 = d0(0, false);
        if (tVarD0 == null || (gVar = tVarD0.j) == null) {
            return;
        }
        gVar.close();
    }

    boolean T(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.k;
        if (((obj instanceof a.g.l.f.a) || (obj instanceof androidx.appcompat.app.g)) && (decorView = this.m.getDecorView()) != null && a.g.l.f.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.n.a().dispatchKeyEvent(keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? p0(keyCode, keyEvent) : s0(keyCode, keyEvent);
    }

    void U(int i2) {
        t tVarD0;
        t tVarD1 = d0(i2, true);
        if (tVarD1.j != null) {
            Bundle bundle = new Bundle();
            tVarD1.j.Q(bundle);
            if (bundle.size() > 0) {
                tVarD1.s = bundle;
            }
            tVarD1.j.d0();
            tVarD1.j.clear();
        }
        tVarD1.r = true;
        tVarD1.q = true;
        if ((i2 != 108 && i2 != 0) || this.s == null || (tVarD0 = d0(0, false)) == null) {
            return;
        }
        tVarD0.m = false;
        A0(tVarD0, null);
    }

    void V() {
        z zVar = this.z;
        if (zVar != null) {
            zVar.b();
        }
    }

    t Y(Menu menu) {
        t[] tVarArr = this.N;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i2 = 0; i2 < length; i2++) {
            t tVar = tVarArr[i2];
            if (tVar != null && tVar.j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        t tVarY;
        Window.Callback callbackF0 = f0();
        if (callbackF0 == null || this.T || (tVarY = Y(gVar.D())) == null) {
            return false;
        }
        return callbackF0.onMenuItemSelected(tVarY.f1109a, menuItem);
    }

    final Context a0() {
        androidx.appcompat.app.a aVarM = m();
        Context contextK = aVarM != null ? aVarM.k() : null;
        return contextK == null ? this.l : contextK;
    }

    @Override // androidx.appcompat.view.menu.g.a
    public void b(androidx.appcompat.view.menu.g gVar) {
        B0(true);
    }

    @Override // androidx.appcompat.app.e
    public void d(View view, ViewGroup.LayoutParams layoutParams) {
        W();
        ((ViewGroup) this.C.findViewById(R.id.content)).addView(view, layoutParams);
        this.n.a().onContentChanged();
    }

    protected t d0(int i2, boolean z) {
        t[] tVarArr = this.N;
        if (tVarArr == null || tVarArr.length <= i2) {
            t[] tVarArr2 = new t[i2 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.N = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i2];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i2);
        tVarArr[i2] = tVar2;
        return tVar2;
    }

    final CharSequence e0() {
        Object obj = this.k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.r;
    }

    @Override // androidx.appcompat.app.e
    public Context f(Context context) {
        this.Q = true;
        int iN0 = n0(context, J());
        Configuration configurationZ = null;
        if (i && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, P(context, iN0, null));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof a.a.n.d) {
            try {
                ((a.a.n.d) context).a(P(context, iN0, null));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!h) {
            return super.f(context);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            Configuration configuration = new Configuration();
            configuration.uiMode = -1;
            configuration.fontScale = 0.0f;
            Configuration configuration2 = j.a(context, configuration).getResources().getConfiguration();
            Configuration configuration3 = context.getResources().getConfiguration();
            configuration2.uiMode = configuration3.uiMode;
            if (!configuration2.equals(configuration3)) {
                configurationZ = Z(configuration2, configuration3);
            }
        }
        Configuration configurationP = P(context, iN0, configurationZ);
        a.a.n.d dVar = new a.a.n.d(context, a.a.i.f45c);
        dVar.a(configurationP);
        boolean z = false;
        try {
            z = context.getTheme() != null;
        } catch (NullPointerException unused3) {
        }
        if (z) {
            a.g.d.f.f.b.a(dVar.getTheme());
        }
        return super.f(dVar);
    }

    final Window.Callback f0() {
        return this.m.getCallback();
    }

    @Override // androidx.appcompat.app.e
    public <T extends View> T i(int i2) {
        W();
        return (T) this.m.findViewById(i2);
    }

    @Override // androidx.appcompat.app.e
    public int k() {
        return this.U;
    }

    @Override // androidx.appcompat.app.e
    public MenuInflater l() {
        if (this.q == null) {
            g0();
            androidx.appcompat.app.a aVar = this.p;
            this.q = new a.a.n.g(aVar != null ? aVar.k() : this.l);
        }
        return this.q;
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.app.a m() {
        g0();
        return this.p;
    }

    public boolean m0() {
        return this.A;
    }

    @Override // androidx.appcompat.app.e
    public void n() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.l);
        if (layoutInflaterFrom.getFactory() == null) {
            a.g.l.g.b(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof f) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    int n0(Context context, int i2) {
        p pVarC0;
        if (i2 == -100) {
            return -1;
        }
        if (i2 != -1) {
            if (i2 != 0) {
                if (i2 != 1 && i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    pVarC0 = b0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                pVarC0 = c0(context);
            }
            return pVarC0.c();
        }
        return i2;
    }

    @Override // androidx.appcompat.app.e
    public void o() {
        androidx.appcompat.app.a aVarM = m();
        if (aVarM == null || !aVarM.l()) {
            k0(0);
        }
    }

    boolean o0() {
        a.a.n.b bVar = this.v;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        androidx.appcompat.app.a aVarM = m();
        return aVarM != null && aVarM.h();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return R(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // androidx.appcompat.app.e
    public void p(Configuration configuration) {
        androidx.appcompat.app.a aVarM;
        if (this.H && this.B && (aVarM = m()) != null) {
            aVarM.m(configuration);
        }
        androidx.appcompat.widget.j.b().g(this.l);
        G(false);
    }

    boolean p0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            this.P = (keyEvent.getFlags() & 128) != 0;
        } else if (i2 == 82) {
            q0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void q(Bundle bundle) {
        this.Q = true;
        G(false);
        X();
        Object obj = this.k;
        if (obj instanceof Activity) {
            String strC = null;
            try {
                strC = androidx.core.app.e.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
            }
            if (strC != null) {
                androidx.appcompat.app.a aVarY0 = y0();
                if (aVarY0 == null) {
                    this.d0 = true;
                } else {
                    aVarY0.r(true);
                }
            }
            androidx.appcompat.app.e.c(this);
        }
        this.R = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    @Override // androidx.appcompat.app.e
    public void r() {
        if (this.k instanceof Activity) {
            androidx.appcompat.app.e.x(this);
        }
        if (this.a0) {
            this.m.getDecorView().removeCallbacks(this.c0);
        }
        this.S = false;
        this.T = true;
        if (this.U != -100) {
            Object obj = this.k;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f1087e.put(this.k.getClass().getName(), Integer.valueOf(this.U));
            } else {
                f1087e.remove(this.k.getClass().getName());
            }
        } else {
            f1087e.remove(this.k.getClass().getName());
        }
        androidx.appcompat.app.a aVar = this.p;
        if (aVar != null) {
            aVar.n();
        }
        M();
    }

    boolean r0(int i2, KeyEvent keyEvent) {
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null && aVarM.o(i2, keyEvent)) {
            return true;
        }
        t tVar = this.O;
        if (tVar != null && z0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.O;
            if (tVar2 != null) {
                tVar2.n = true;
            }
            return true;
        }
        if (this.O == null) {
            t tVarD0 = d0(0, true);
            A0(tVarD0, keyEvent);
            boolean zZ0 = z0(tVarD0, keyEvent.getKeyCode(), keyEvent, 1);
            tVarD0.m = false;
            if (zZ0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void s(Bundle bundle) {
        W();
    }

    boolean s0(int i2, KeyEvent keyEvent) {
        if (i2 == 4) {
            boolean z = this.P;
            this.P = false;
            t tVarD0 = d0(0, false);
            if (tVarD0 != null && tVarD0.o) {
                if (!z) {
                    O(tVarD0, true);
                }
                return true;
            }
            if (o0()) {
                return true;
            }
        } else if (i2 == 82) {
            t0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.app.e
    public void t() {
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null) {
            aVarM.s(true);
        }
    }

    @Override // androidx.appcompat.app.e
    public void u(Bundle bundle) {
    }

    void u0(int i2) {
        androidx.appcompat.app.a aVarM;
        if (i2 != 108 || (aVarM = m()) == null) {
            return;
        }
        aVarM.i(true);
    }

    @Override // androidx.appcompat.app.e
    public void v() {
        this.S = true;
        F();
    }

    void v0(int i2) {
        if (i2 == 108) {
            androidx.appcompat.app.a aVarM = m();
            if (aVarM != null) {
                aVarM.i(false);
                return;
            }
            return;
        }
        if (i2 == 0) {
            t tVarD0 = d0(i2, true);
            if (tVarD0.o) {
                O(tVarD0, false);
            }
        }
    }

    @Override // androidx.appcompat.app.e
    public void w() {
        this.S = false;
        androidx.appcompat.app.a aVarM = m();
        if (aVarM != null) {
            aVarM.s(false);
        }
    }

    void w0(ViewGroup viewGroup) {
    }

    final androidx.appcompat.app.a y0() {
        return this.p;
    }

    @Override // androidx.appcompat.app.e
    public boolean z(int i2) {
        int iC0 = C0(i2);
        if (this.L && iC0 == 108) {
            return false;
        }
        if (this.H && iC0 == 1) {
            this.H = false;
        }
        if (iC0 == 1) {
            H0();
            this.L = true;
            return true;
        }
        if (iC0 == 2) {
            H0();
            this.F = true;
            return true;
        }
        if (iC0 == 5) {
            H0();
            this.G = true;
            return true;
        }
        if (iC0 == 10) {
            H0();
            this.J = true;
            return true;
        }
        if (iC0 == 108) {
            H0();
            this.H = true;
            return true;
        }
        if (iC0 != 109) {
            return this.m.requestFeature(iC0);
        }
        H0();
        this.I = true;
        return true;
    }
}
