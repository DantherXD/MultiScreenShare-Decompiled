package com.bumptech.glide;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.bumptech.glide.load.o.k f3049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.o.a0.e f3050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.o.a0.b f3051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.o.b0.h f3052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.o.c0.a f3053f;
    private com.bumptech.glide.load.o.c0.a g;
    private com.bumptech.glide.load.o.b0.a.InterfaceC0070a h;
    private com.bumptech.glide.load.o.b0.i i;
    private com.bumptech.glide.o.d j;
    private com.bumptech.glide.o.l.b m;
    private com.bumptech.glide.load.o.c0.a n;
    private boolean o;
    private List<com.bumptech.glide.r.e<Object>> p;
    private boolean q;
    private boolean r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, l<?, ?>> f3048a = new a.d.a();
    private int k = 4;
    private c.a l = new a();

    class a implements c.a {
        a() {
        }

        @Override // com.bumptech.glide.c.a
        public com.bumptech.glide.r.f a() {
            return new com.bumptech.glide.r.f();
        }
    }

    c a(Context context) {
        if (this.f3053f == null) {
            this.f3053f = com.bumptech.glide.load.o.c0.a.g();
        }
        if (this.g == null) {
            this.g = com.bumptech.glide.load.o.c0.a.e();
        }
        if (this.n == null) {
            this.n = com.bumptech.glide.load.o.c0.a.c();
        }
        if (this.i == null) {
            this.i = new com.bumptech.glide.load.o.b0.i.a(context).a();
        }
        if (this.j == null) {
            this.j = new com.bumptech.glide.o.f();
        }
        if (this.f3050c == null) {
            int iB = this.i.b();
            if (iB > 0) {
                this.f3050c = new com.bumptech.glide.load.o.a0.k(iB);
            } else {
                this.f3050c = new com.bumptech.glide.load.o.a0.f();
            }
        }
        if (this.f3051d == null) {
            this.f3051d = new com.bumptech.glide.load.o.a0.j(this.i.a());
        }
        if (this.f3052e == null) {
            this.f3052e = new com.bumptech.glide.load.o.b0.g(this.i.d());
        }
        if (this.h == null) {
            this.h = new com.bumptech.glide.load.o.b0.f(context);
        }
        if (this.f3049b == null) {
            this.f3049b = new com.bumptech.glide.load.o.k(this.f3052e, this.h, this.g, this.f3053f, com.bumptech.glide.load.o.c0.a.h(), this.n, this.o);
        }
        List<com.bumptech.glide.r.e<Object>> list = this.p;
        this.p = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        return new c(context, this.f3049b, this.f3052e, this.f3050c, this.f3051d, new com.bumptech.glide.o.l(this.m), this.j, this.k, this.l, this.f3048a, this.p, this.q, this.r);
    }

    void b(com.bumptech.glide.o.l.b bVar) {
        this.m = bVar;
    }
}
