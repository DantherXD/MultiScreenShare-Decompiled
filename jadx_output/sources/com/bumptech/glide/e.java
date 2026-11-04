package com.bumptech.glide;

import android.content.Context;
import android.content.ContextWrapper;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final l<?, ?> f3055a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.b f3056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f3057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.r.j.f f3058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c.a f3059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<com.bumptech.glide.r.e<Object>> f3060f;
    private final Map<Class<?>, l<?, ?>> g;
    private final com.bumptech.glide.load.o.k h;
    private final boolean i;
    private final int j;
    private com.bumptech.glide.r.f k;

    public e(Context context, com.bumptech.glide.load.o.a0.b bVar, i iVar, com.bumptech.glide.r.j.f fVar, c.a aVar, Map<Class<?>, l<?, ?>> map, List<com.bumptech.glide.r.e<Object>> list, com.bumptech.glide.load.o.k kVar, boolean z, int i) {
        super(context.getApplicationContext());
        this.f3056b = bVar;
        this.f3057c = iVar;
        this.f3058d = fVar;
        this.f3059e = aVar;
        this.f3060f = list;
        this.g = map;
        this.h = kVar;
        this.i = z;
        this.j = i;
    }

    public <X> com.bumptech.glide.r.j.i<ImageView, X> a(ImageView imageView, Class<X> cls) {
        return this.f3058d.a(imageView, cls);
    }

    public com.bumptech.glide.load.o.a0.b b() {
        return this.f3056b;
    }

    public List<com.bumptech.glide.r.e<Object>> c() {
        return this.f3060f;
    }

    public synchronized com.bumptech.glide.r.f d() {
        if (this.k == null) {
            this.k = this.f3059e.a().I();
        }
        return this.k;
    }

    public <T> l<?, T> e(Class<T> cls) {
        l<?, T> lVar = (l) this.g.get(cls);
        if (lVar == null) {
            for (Map.Entry<Class<?>, l<?, ?>> entry : this.g.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? (l<?, T>) f3055a : lVar;
    }

    public com.bumptech.glide.load.o.k f() {
        return this.h;
    }

    public int g() {
        return this.j;
    }

    public i h() {
        return this.f3057c;
    }

    public boolean i() {
        return this.i;
    }
}
