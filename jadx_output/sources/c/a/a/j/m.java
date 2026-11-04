package c.a.a.j;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f2517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f2518b;
    private String j;
    private DateFormat k;
    protected w m;
    public TimeZone n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected List<d> f2519c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected List<a> f2520d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List<u> f2521e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected List<c0> f2522f = null;
    protected List<r> g = null;
    protected List<v> h = null;
    private int i = 0;
    protected IdentityHashMap<Object, w> l = null;
    public Locale o = c.a.a.a.f2417c;

    public m(z zVar, x xVar) {
        this.n = c.a.a.a.f2416b;
        this.f2518b = zVar;
        this.f2517a = xVar;
        this.n = c.a.a.a.f2416b;
    }

    public static Object o(m mVar, Object obj, Object obj2, Object obj3) {
        List<c0> list = mVar.f2522f;
        if (list != null) {
            if (obj2 != null && !(obj2 instanceof String)) {
                obj2 = c.a.a.a.l(obj2);
            }
            Iterator<c0> it = list.iterator();
            while (it.hasNext()) {
                obj3 = it.next().a(obj, (String) obj2, obj3);
            }
        }
        return obj3;
    }

    public boolean a(Object obj, Object obj2, Object obj3) {
        List<u> list = this.f2521e;
        if (list == null) {
            return true;
        }
        if (obj2 != null && !(obj2 instanceof String)) {
            obj2 = c.a.a.a.l(obj2);
        }
        Iterator<u> it = list.iterator();
        while (it.hasNext()) {
            if (!it.next().b(obj, (String) obj2, obj3)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(Object obj, Object obj2) {
        List<v> list = this.h;
        if (list == null) {
            return true;
        }
        for (v vVar : list) {
            if (obj2 != null && !(obj2 instanceof String)) {
                obj2 = c.a.a.a.l(obj2);
            }
            if (!vVar.c(this, obj, (String) obj2)) {
                return false;
            }
        }
        return true;
    }

    public void c(a0 a0Var, boolean z) {
        this.f2518b.d(a0Var, z);
    }

    public void d() {
        this.i--;
    }

    public List<a> e() {
        if (this.f2520d == null) {
            this.f2520d = new ArrayList();
        }
        return this.f2520d;
    }

    public List<d> f() {
        if (this.f2519c == null) {
            this.f2519c = new ArrayList();
        }
        return this.f2519c;
    }

    public DateFormat g() {
        if (this.k == null && this.j != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.j, this.o);
            this.k = simpleDateFormat;
            simpleDateFormat.setTimeZone(this.n);
        }
        return this.k;
    }

    public List<r> h() {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        return this.g;
    }

    public List<u> i() {
        if (this.f2521e == null) {
            this.f2521e = new ArrayList();
        }
        return this.f2521e;
    }

    public List<v> j() {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        return this.h;
    }

    public List<c0> k() {
        if (this.f2522f == null) {
            this.f2522f = new ArrayList();
        }
        return this.f2522f;
    }

    public void l() {
        this.i++;
    }

    public void m() {
        this.f2518b.write(10);
        for (int i = 0; i < this.i; i++) {
            this.f2518b.write(9);
        }
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        List<r> list = this.g;
        if (list != null) {
            if (obj2 != null && !(obj2 instanceof String)) {
                obj2 = c.a.a.a.l(obj2);
            }
            Iterator<r> it = list.iterator();
            while (it.hasNext()) {
                obj2 = it.next().a(obj, (String) obj2, obj3);
            }
        }
        return obj2;
    }

    public void p(w wVar, Object obj, Object obj2, int i) {
        if ((this.f2518b.n & a0.DisableCircularReferenceDetect.z) == 0) {
            this.m = new w(wVar, obj, obj2, i);
            if (this.l == null) {
                this.l = new IdentityHashMap<>();
            }
            this.l.put(obj, this.m);
        }
    }

    public void q(String str) {
        this.j = str;
        if (this.k != null) {
            this.k = null;
        }
    }

    public final void r(Object obj) {
        if (obj == null) {
            this.f2518b.o();
            return;
        }
        try {
            this.f2517a.a(obj.getClass()).a(this, obj, null, null);
        } catch (IOException e2) {
            throw new c.a.a.d(e2.getMessage(), e2);
        }
    }

    public final void s(String str) {
        z zVar = this.f2518b;
        if (str == null) {
            if ((zVar.n & a0.WriteNullStringAsEmpty.z) != 0) {
                zVar.p("");
                return;
            } else {
                zVar.o();
                return;
            }
        }
        if ((zVar.n & a0.UseSingleQuotes.z) != 0) {
            zVar.r(str);
        } else {
            zVar.q(str, (char) 0, true);
        }
    }

    public void t(Object obj) {
        z zVar;
        String str;
        w wVar = this.m;
        if (obj == wVar.f2533b) {
            zVar = this.f2518b;
            str = "{\"$ref\":\"@\"}";
        } else {
            w wVar2 = wVar.f2532a;
            if (wVar2 == null || obj != wVar2.f2533b) {
                while (true) {
                    w wVar3 = wVar.f2532a;
                    if (wVar3 == null) {
                        break;
                    } else {
                        wVar = wVar3;
                    }
                }
                if (obj == wVar.f2533b) {
                    zVar = this.f2518b;
                    str = "{\"$ref\":\"$\"}";
                } else {
                    String string = this.l.get(obj).toString();
                    this.f2518b.write("{\"$ref\":\"");
                    this.f2518b.write(string);
                    zVar = this.f2518b;
                    str = "\"}";
                }
            } else {
                zVar = this.f2518b;
                str = "{\"$ref\":\"..\"}";
            }
        }
        zVar.write(str);
    }

    public String toString() {
        return this.f2518b.toString();
    }

    public final void u(Object obj, Object obj2) {
        v(obj, obj2, null, 0);
    }

    public final void v(Object obj, Object obj2, Type type, int i) {
        try {
            if (obj == null) {
                this.f2518b.o();
            } else {
                this.f2517a.a(obj.getClass()).a(this, obj, obj2, type);
            }
        } catch (IOException e2) {
            throw new c.a.a.d(e2.getMessage(), e2);
        }
    }

    public final void w(Object obj, String str) {
        if (!(obj instanceof Date)) {
            r(obj);
            return;
        }
        DateFormat dateFormatG = g();
        if (dateFormatG == null) {
            dateFormatG = new SimpleDateFormat(str, this.o);
            dateFormatG.setTimeZone(this.n);
        }
        this.f2518b.p(dateFormatG.format((Date) obj));
    }
}
