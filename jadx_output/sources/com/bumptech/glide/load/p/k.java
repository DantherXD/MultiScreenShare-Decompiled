package com.bumptech.glide.load.p;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes.dex */
public final class k implements n<Uri, File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3432a;

    public static final class a implements o<Uri, File> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3433a;

        public a(Context context) {
            this.f3433a = context;
        }

        @Override // com.bumptech.glide.load.p.o
        public n<Uri, File> b(r rVar) {
            return new k(this.f3433a);
        }
    }

    private static class b implements com.bumptech.glide.load.n.d<File> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f3434b = {"_data"};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f3435c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f3436d;

        b(Context context, Uri uri) {
            this.f3435c = context;
            this.f3436d = uri;
        }

        @Override // com.bumptech.glide.load.n.d
        public Class<File> a() {
            return File.class;
        }

        @Override // com.bumptech.glide.load.n.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.n.d
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.n.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.n.d
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.n.d.a<? super File> aVar) {
            Cursor cursorQuery = this.f3435c.getContentResolver().query(this.f3436d, f3434b, null, null, null);
            String string = null;
            if (cursorQuery != null) {
                try {
                    string = cursorQuery.moveToFirst() ? cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data")) : null;
                    cursorQuery.close();
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            if (!TextUtils.isEmpty(string)) {
                aVar.f(new File(string));
                return;
            }
            aVar.d(new FileNotFoundException("Failed to find file path for: " + this.f3436d));
        }
    }

    public k(Context context) {
        this.f3432a = context;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<File> a(Uri uri, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(uri), new b(this.f3432a, uri));
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return com.bumptech.glide.load.n.p.b.b(uri);
    }
}
