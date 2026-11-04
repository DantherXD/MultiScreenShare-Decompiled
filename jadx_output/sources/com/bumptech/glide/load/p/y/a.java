package com.bumptech.glide.load.p.y;

import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.n.j;
import com.bumptech.glide.load.p.g;
import com.bumptech.glide.load.p.m;
import com.bumptech.glide.load.p.n;
import com.bumptech.glide.load.p.o;
import com.bumptech.glide.load.p.r;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a implements n<g, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h<Integer> f3484a = h.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m<g, g> f3485b;

    /* JADX INFO: renamed from: com.bumptech.glide.load.p.y.a$a, reason: collision with other inner class name */
    public static class C0081a implements o<g, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m<g, g> f3486a = new m<>(500);

        @Override // com.bumptech.glide.load.p.o
        public n<g, InputStream> b(r rVar) {
            return new a(this.f3486a);
        }
    }

    public a(m<g, g> mVar) {
        this.f3485b = mVar;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(g gVar, int i, int i2, i iVar) {
        m<g, g> mVar = this.f3485b;
        if (mVar != null) {
            g gVarA = mVar.a(gVar, 0, 0);
            if (gVarA == null) {
                this.f3485b.b(gVar, 0, 0, gVar);
            } else {
                gVar = gVarA;
            }
        }
        return new n.a<>(gVar, new j(gVar, ((Integer) iVar.c(f3484a)).intValue()));
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(g gVar) {
        return true;
    }
}
