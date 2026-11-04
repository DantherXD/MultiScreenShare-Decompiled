package com.bumptech.glide.load.p.y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.p.n;
import com.bumptech.glide.load.p.o;
import com.bumptech.glide.load.p.r;
import com.bumptech.glide.load.q.d.b0;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class d implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3491a;

    public static class a implements o<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3492a;

        public a(Context context) {
            this.f3492a = context;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, InputStream> b(r rVar) {
            return new d(this.f3492a);
        }
    }

    public d(Context context) {
        this.f3491a = context.getApplicationContext();
    }

    private boolean e(i iVar) {
        Long l = (Long) iVar.c(b0.f3520a);
        return l != null && l.longValue() == -1;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(Uri uri, int i, int i2, i iVar) {
        if (com.bumptech.glide.load.n.p.b.d(i, i2) && e(iVar)) {
            return new n.a<>(new com.bumptech.glide.s.d(uri), com.bumptech.glide.load.n.p.c.g(this.f3491a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return com.bumptech.glide.load.n.p.b.c(uri);
    }
}
