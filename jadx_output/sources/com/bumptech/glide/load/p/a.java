package com.bumptech.glide.load.p;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f3395a = 22;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AssetManager f3396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InterfaceC0077a<Data> f3397c;

    /* JADX INFO: renamed from: com.bumptech.glide.load.p.a$a, reason: collision with other inner class name */
    public interface InterfaceC0077a<Data> {
        com.bumptech.glide.load.n.d<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0077a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f3398a;

        public b(AssetManager assetManager) {
            this.f3398a = assetManager;
        }

        @Override // com.bumptech.glide.load.p.a.InterfaceC0077a
        public com.bumptech.glide.load.n.d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.n.h(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, ParcelFileDescriptor> b(r rVar) {
            return new a(this.f3398a, this);
        }
    }

    public static class c implements o<Uri, InputStream>, InterfaceC0077a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AssetManager f3399a;

        public c(AssetManager assetManager) {
            this.f3399a = assetManager;
        }

        @Override // com.bumptech.glide.load.p.a.InterfaceC0077a
        public com.bumptech.glide.load.n.d<InputStream> a(AssetManager assetManager, String str) {
            return new com.bumptech.glide.load.n.n(assetManager, str);
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, InputStream> b(r rVar) {
            return new a(this.f3399a, this);
        }
    }

    public a(AssetManager assetManager, InterfaceC0077a<Data> interfaceC0077a) {
        this.f3396b = assetManager;
        this.f3397c = interfaceC0077a;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(Uri uri, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(uri), this.f3397c.a(this.f3396b, uri.toString().substring(f3395a)));
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return "file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0));
    }
}
