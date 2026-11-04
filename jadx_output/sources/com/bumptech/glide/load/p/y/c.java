package com.bumptech.glide.load.p.y;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.p.n;
import com.bumptech.glide.load.p.o;
import com.bumptech.glide.load.p.r;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class c implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3489a;

    public static class a implements o<Uri, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3490a;

        public a(Context context) {
            this.f3490a = context;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, InputStream> b(r rVar) {
            return new c(this.f3490a);
        }
    }

    public c(Context context) {
        this.f3489a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(Uri uri, int i, int i2, i iVar) {
        if (com.bumptech.glide.load.n.p.b.d(i, i2)) {
            return new n.a<>(new com.bumptech.glide.s.d(uri), com.bumptech.glide.load.n.p.c.f(this.f3489a, uri));
        }
        return null;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return com.bumptech.glide.load.n.p.b.a(uri);
    }
}
