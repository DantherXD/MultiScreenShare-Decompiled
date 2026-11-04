package com.bumptech.glide.load.p;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class s<Data> implements n<Integer, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n<Uri, Data> f3466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Resources f3467b;

    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f3468a;

        public a(Resources resources) {
            this.f3468a = resources;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Integer, AssetFileDescriptor> b(r rVar) {
            return new s(this.f3468a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f3469a;

        public b(Resources resources) {
            this.f3469a = resources;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Integer, ParcelFileDescriptor> b(r rVar) {
            return new s(this.f3469a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements o<Integer, InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f3470a;

        public c(Resources resources) {
            this.f3470a = resources;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Integer, InputStream> b(r rVar) {
            return new s(this.f3470a, rVar.d(Uri.class, InputStream.class));
        }
    }

    public static class d implements o<Integer, Uri> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Resources f3471a;

        public d(Resources resources) {
            this.f3471a = resources;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Integer, Uri> b(r rVar) {
            return new s(this.f3471a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f3467b = resources;
        this.f3466a = nVar;
    }

    private Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f3467b.getResourcePackageName(num.intValue()) + '/' + this.f3467b.getResourceTypeName(num.intValue()) + '/' + this.f3467b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e2) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Log.w("ResourceLoader", "Received invalid resource id: " + num, e2);
            return null;
        }
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(Integer num, int i, int i2, com.bumptech.glide.load.i iVar) {
        Uri uriD = d(num);
        if (uriD == null) {
            return null;
        }
        return this.f3466a.a(uriD, i, i2, iVar);
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean b(Integer num) {
        return true;
    }
}
