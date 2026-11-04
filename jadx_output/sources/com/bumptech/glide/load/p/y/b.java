package com.bumptech.glide.load.p.y;

import android.net.Uri;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.p.g;
import com.bumptech.glide.load.p.n;
import com.bumptech.glide.load.p.o;
import com.bumptech.glide.load.p.r;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class b implements n<Uri, InputStream> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f3487a = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<g, InputStream> f3488b;

    public static class a implements o<Uri, InputStream> {
        @Override // com.bumptech.glide.load.p.o
        public n<Uri, InputStream> b(r rVar) {
            return new b(rVar.d(g.class, InputStream.class));
        }
    }

    public b(n<g, InputStream> nVar) {
        this.f3488b = nVar;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<InputStream> a(Uri uri, int i, int i2, i iVar) {
        return this.f3488b.a(new g(uri.toString()), i, i2, iVar);
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f3487a.contains(uri.getScheme());
    }
}
