package com.bumptech.glide.load.p.y;

import com.bumptech.glide.load.i;
import com.bumptech.glide.load.p.g;
import com.bumptech.glide.load.p.n;
import com.bumptech.glide.load.p.o;
import com.bumptech.glide.load.p.r;
import java.io.InputStream;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class f implements n<URL, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<g, InputStream> f3504a;

    public static class a implements o<URL, InputStream> {
        @Override // com.bumptech.glide.load.p.o
        public n<URL, InputStream> b(r rVar) {
            return new f(rVar.d(g.class, InputStream.class));
        }
    }

    public f(n<g, InputStream> nVar) {
        this.f3504a = nVar;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(URL url, int i, int i2, i iVar) {
        return this.f3504a.a(new g(url), i, i2, iVar);
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(URL url) {
        return true;
    }
}
