package androidx.fragment.app;

import android.view.ViewGroup;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f1991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ClassLoader f1992b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f1994d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1995e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1996f;
    int g;
    int h;
    boolean i;
    String k;
    int l;
    CharSequence m;
    int n;
    CharSequence o;
    ArrayList<String> p;
    ArrayList<String> q;
    ArrayList<Runnable> s;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ArrayList<a> f1993c = new ArrayList<>();
    boolean j = true;
    boolean r = false;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f1997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Fragment f1998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f1999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f2000d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f2002f;
        androidx.lifecycle.d.c g;
        androidx.lifecycle.d.c h;

        a() {
        }

        a(int i, Fragment fragment) {
            this.f1997a = i;
            this.f1998b = fragment;
            androidx.lifecycle.d.c cVar = androidx.lifecycle.d.c.RESUMED;
            this.g = cVar;
            this.h = cVar;
        }
    }

    w(j jVar, ClassLoader classLoader) {
        this.f1991a = jVar;
        this.f1992b = classLoader;
    }

    public w b(int i, Fragment fragment, String str) {
        k(i, fragment, str, 1);
        return this;
    }

    w c(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.I = viewGroup;
        return b(viewGroup.getId(), fragment, str);
    }

    public w d(Fragment fragment, String str) {
        k(0, fragment, str, 1);
        return this;
    }

    void e(a aVar) {
        this.f1993c.add(aVar);
        aVar.f1999c = this.f1994d;
        aVar.f2000d = this.f1995e;
        aVar.f2001e = this.f1996f;
        aVar.f2002f = this.g;
    }

    public abstract int f();

    public abstract int g();

    public abstract void h();

    public abstract void i();

    public w j() {
        if (this.i) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.j = false;
        return this;
    }

    void k(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.A;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.A + " now " + str);
            }
            fragment.A = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i3 = fragment.y;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.y + " now " + i);
            }
            fragment.y = i;
            fragment.z = i;
        }
        e(new a(i2, fragment));
    }

    public w l(Fragment fragment) {
        e(new a(3, fragment));
        return this;
    }

    public w m(int i, Fragment fragment) {
        return n(i, fragment, null);
    }

    public w n(int i, Fragment fragment, String str) {
        if (i == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        k(i, fragment, str, 2);
        return this;
    }

    public w o(boolean z) {
        this.r = z;
        return this;
    }
}
