package com.bumptech.glide.t;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f3812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class<?> f3813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class<?> f3814c;

    public i() {
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3812a = cls;
        this.f3813b = cls2;
        this.f3814c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3812a.equals(iVar.f3812a) && this.f3813b.equals(iVar.f3813b) && k.c(this.f3814c, iVar.f3814c);
    }

    public int hashCode() {
        int iHashCode = ((this.f3812a.hashCode() * 31) + this.f3813b.hashCode()) * 31;
        Class<?> cls = this.f3814c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f3812a + ", second=" + this.f3813b + '}';
    }
}
