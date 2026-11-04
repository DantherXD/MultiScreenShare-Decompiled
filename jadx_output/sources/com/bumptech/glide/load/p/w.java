package com.bumptech.glide.load.p;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<String> f3477a = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "android.resource", "content")));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c<Data> f3478b;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f3479a;

        public a(ContentResolver contentResolver) {
            this.f3479a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p.w.c
        public com.bumptech.glide.load.n.d<AssetFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.n.a(this.f3479a, uri);
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, AssetFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f3480a;

        public b(ContentResolver contentResolver) {
            this.f3480a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p.w.c
        public com.bumptech.glide.load.n.d<ParcelFileDescriptor> a(Uri uri) {
            return new com.bumptech.glide.load.n.i(this.f3480a, uri);
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new w(this);
        }
    }

    public interface c<Data> {
        com.bumptech.glide.load.n.d<Data> a(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentResolver f3481a;

        public d(ContentResolver contentResolver) {
            this.f3481a = contentResolver;
        }

        @Override // com.bumptech.glide.load.p.w.c
        public com.bumptech.glide.load.n.d<InputStream> a(Uri uri) {
            return new com.bumptech.glide.load.n.o(this.f3481a, uri);
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, InputStream> b(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.f3478b = cVar;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(Uri uri, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(uri), this.f3478b.a(uri));
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return f3477a.contains(uri.getScheme());
    }
}
