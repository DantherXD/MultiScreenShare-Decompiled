package a.a.n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.x0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g extends MenuInflater {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Class<?>[] f103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Class<?>[] f104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object[] f105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object[] f106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Context f107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f108f;

    private static class a implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Class<?>[] f109a = {MenuItem.class};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f110b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f111c;

        public a(Object obj, String str) {
            this.f110b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f111c = cls.getMethod(str, f109a);
            } catch (Exception e2) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e2);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f111c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f111c.invoke(this.f110b, menuItem)).booleanValue();
                }
                this.f111c.invoke(this.f110b, menuItem);
                return true;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    private class b {
        a.g.l.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Menu f112a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f113b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f114c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f115d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f117f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.f112a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f107e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.z != null) {
                if (g.this.f107e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.z));
            }
            if (this.r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.i) {
                    ((androidx.appcompat.view.menu.i) menuItem).t(true);
                } else if (menuItem instanceof j) {
                    ((j) menuItem).h(true);
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f103a, g.this.f105c));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            a.g.l.b bVar = this.A;
            if (bVar != null) {
                a.g.l.i.a(menuItem, bVar);
            }
            a.g.l.i.c(menuItem, this.B);
            a.g.l.i.g(menuItem, this.C);
            a.g.l.i.b(menuItem, this.n, this.o);
            a.g.l.i.f(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                a.g.l.i.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                a.g.l.i.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            i(this.f112a.add(this.f113b, this.i, this.j, this.k));
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenuAddSubMenu = this.f112a.addSubMenu(this.f113b, this.i, this.j, this.k);
            i(subMenuAddSubMenu.getItem());
            return subMenuAddSubMenu;
        }

        public boolean d() {
            return this.h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = g.this.f107e.obtainStyledAttributes(attributeSet, a.a.j.r1);
            this.f113b = typedArrayObtainStyledAttributes.getResourceId(a.a.j.t1, 0);
            this.f114c = typedArrayObtainStyledAttributes.getInt(a.a.j.v1, 0);
            this.f115d = typedArrayObtainStyledAttributes.getInt(a.a.j.w1, 0);
            this.f116e = typedArrayObtainStyledAttributes.getInt(a.a.j.x1, 0);
            this.f117f = typedArrayObtainStyledAttributes.getBoolean(a.a.j.u1, true);
            this.g = typedArrayObtainStyledAttributes.getBoolean(a.a.j.s1, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void g(AttributeSet attributeSet) {
            x0 x0VarU = x0.u(g.this.f107e, attributeSet, a.a.j.y1);
            this.i = x0VarU.n(a.a.j.B1, 0);
            this.j = (x0VarU.k(a.a.j.E1, this.f114c) & (-65536)) | (x0VarU.k(a.a.j.F1, this.f115d) & 65535);
            this.k = x0VarU.p(a.a.j.G1);
            this.l = x0VarU.p(a.a.j.H1);
            this.m = x0VarU.n(a.a.j.z1, 0);
            this.n = c(x0VarU.o(a.a.j.I1));
            this.o = x0VarU.k(a.a.j.P1, 4096);
            this.p = c(x0VarU.o(a.a.j.J1));
            this.q = x0VarU.k(a.a.j.T1, 4096);
            int i = a.a.j.K1;
            this.r = x0VarU.s(i) ? x0VarU.a(i, false) : this.f116e;
            this.s = x0VarU.a(a.a.j.C1, false);
            this.t = x0VarU.a(a.a.j.D1, this.f117f);
            this.u = x0VarU.a(a.a.j.A1, this.g);
            this.v = x0VarU.k(a.a.j.U1, -1);
            this.z = x0VarU.o(a.a.j.L1);
            this.w = x0VarU.n(a.a.j.M1, 0);
            this.x = x0VarU.o(a.a.j.O1);
            String strO = x0VarU.o(a.a.j.N1);
            this.y = strO;
            boolean z = strO != null;
            if (z && this.w == 0 && this.x == null) {
                this.A = (a.g.l.b) e(strO, g.f104b, g.this.f106d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = x0VarU.p(a.a.j.Q1);
            this.C = x0VarU.p(a.a.j.V1);
            int i2 = a.a.j.S1;
            if (x0VarU.s(i2)) {
                this.E = f0.d(x0VarU.k(i2, -1), this.E);
            } else {
                this.E = null;
            }
            int i3 = a.a.j.R1;
            if (x0VarU.s(i3)) {
                this.D = x0VarU.c(i3);
            } else {
                this.D = null;
            }
            x0VarU.w();
            this.h = false;
        }

        public void h() {
            this.f113b = 0;
            this.f114c = 0;
            this.f115d = 0;
            this.f116e = 0;
            this.f117f = true;
            this.g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f103a = clsArr;
        f104b = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f107e = context;
        Object[] objArr = {context};
        this.f105c = objArr;
        this.f106d = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    private void c(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        do {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                }
                throw new RuntimeException("Expecting menu, got " + name);
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        bVar.h();
                    } else if (name2.equals("item")) {
                        if (!bVar.d()) {
                            a.g.l.b bVar2 = bVar.A;
                            if (bVar2 == null || !bVar2.a()) {
                                bVar.a();
                            } else {
                                bVar.b();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    bVar.f(attributeSet);
                } else if (name3.equals("item")) {
                    bVar.g(attributeSet);
                } else if (name3.equals("menu")) {
                    c(xmlPullParser, attributeSet, bVar.b());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    Object b() {
        if (this.f108f == null) {
            this.f108f = a(this.f107e);
        }
        return this.f108f;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof a.g.f.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.f107e.getResources().getLayout(i);
                    c(layout, Xml.asAttributeSet(layout), menu);
                    if (layout != null) {
                        layout.close();
                    }
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
