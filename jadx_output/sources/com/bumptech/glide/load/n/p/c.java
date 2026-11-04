package com.bumptech.glide.load.n.p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.n.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class c implements com.bumptech.glide.load.n.d<InputStream> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f3150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f3151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InputStream f3152d;

    static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f3153a = {"_data"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ContentResolver f3154b;

        a(ContentResolver contentResolver) {
            this.f3154b = contentResolver;
        }

        @Override // com.bumptech.glide.load.n.p.d
        public Cursor a(Uri uri) {
            return this.f3154b.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f3153a, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String[] f3155a = {"_data"};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ContentResolver f3156b;

        b(ContentResolver contentResolver) {
            this.f3156b = contentResolver;
        }

        @Override // com.bumptech.glide.load.n.p.d
        public Cursor a(Uri uri) {
            return this.f3156b.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f3155a, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f3150b = uri;
        this.f3151c = eVar;
    }

    private static c d(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.c.c(context).j().g(), dVar, com.bumptech.glide.c.c(context).e(), context.getContentResolver()));
    }

    public static c f(Context context, Uri uri) {
        return d(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return d(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f3151c.d(this.f3150b);
        int iA = inputStreamD != null ? this.f3151c.a(this.f3150b) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.n.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.n.d
    public void b() {
        InputStream inputStream = this.f3152d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.n.d
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.n.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.n.d
    public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.n.d.a<? super InputStream> aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f3152d = inputStreamH;
            aVar.f(inputStreamH);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.d(e2);
        }
    }
}
