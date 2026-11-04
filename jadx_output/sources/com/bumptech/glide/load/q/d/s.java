package com.bumptech.glide.load.q.d;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
interface s {

    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.n.k f3570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.load.o.a0.b f3571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f3572c;

        a(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.o.a0.b bVar) {
            this.f3571b = (com.bumptech.glide.load.o.a0.b) com.bumptech.glide.t.j.d(bVar);
            this.f3572c = (List) com.bumptech.glide.t.j.d(list);
            this.f3570a = new com.bumptech.glide.load.n.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.q.d.s
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(this.f3570a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.q.d.s
        public ImageHeaderParser.ImageType b() {
            return com.bumptech.glide.load.f.e(this.f3572c, this.f3570a.a(), this.f3571b);
        }

        @Override // com.bumptech.glide.load.q.d.s
        public void c() {
            this.f3570a.c();
        }

        @Override // com.bumptech.glide.load.q.d.s
        public int d() {
            return com.bumptech.glide.load.f.b(this.f3572c, this.f3570a.a(), this.f3571b);
        }
    }

    public static final class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.o.a0.b f3573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f3574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.n.m f3575c;

        b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.o.a0.b bVar) {
            this.f3573a = (com.bumptech.glide.load.o.a0.b) com.bumptech.glide.t.j.d(bVar);
            this.f3574b = (List) com.bumptech.glide.t.j.d(list);
            this.f3575c = new com.bumptech.glide.load.n.m(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.q.d.s
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeFileDescriptor(this.f3575c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.q.d.s
        public ImageHeaderParser.ImageType b() {
            return com.bumptech.glide.load.f.d(this.f3574b, this.f3575c, this.f3573a);
        }

        @Override // com.bumptech.glide.load.q.d.s
        public void c() {
        }

        @Override // com.bumptech.glide.load.q.d.s
        public int d() {
            return com.bumptech.glide.load.f.a(this.f3574b, this.f3575c, this.f3573a);
        }
    }

    Bitmap a(BitmapFactory.Options options);

    ImageHeaderParser.ImageType b();

    void c();

    int d();
}
