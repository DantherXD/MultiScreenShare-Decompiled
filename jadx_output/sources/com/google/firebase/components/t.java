package com.google.firebase.components;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f4365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4367c;

    private t(Class<?> cls, int i, int i2) {
        this.f4365a = (Class) c0.c(cls, "Null dependency anInterface.");
        this.f4366b = i;
        this.f4367c = i2;
    }

    private static String a(int i) {
        if (i == 0) {
            return "direct";
        }
        if (i == 1) {
            return "provider";
        }
        if (i == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i);
    }

    public static t g(Class<?> cls) {
        return new t(cls, 0, 1);
    }

    public static t h(Class<?> cls) {
        return new t(cls, 1, 0);
    }

    public static t i(Class<?> cls) {
        return new t(cls, 2, 0);
    }

    public Class<?> b() {
        return this.f4365a;
    }

    public boolean c() {
        return this.f4367c == 2;
    }

    public boolean d() {
        return this.f4367c == 0;
    }

    public boolean e() {
        return this.f4366b == 1;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f4365a == tVar.f4365a && this.f4366b == tVar.f4366b && this.f4367c == tVar.f4367c;
    }

    public boolean f() {
        return this.f4366b == 2;
    }

    public int hashCode() {
        return this.f4367c ^ ((((this.f4365a.hashCode() ^ 1000003) * 1000003) ^ this.f4366b) * 1000003);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.f4365a);
        sb.append(", type=");
        int i = this.f4366b;
        if (i == 1) {
            str = "required";
        } else {
            str = i == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(a(this.f4367c));
        sb.append("}");
        return sb.toString();
    }
}
