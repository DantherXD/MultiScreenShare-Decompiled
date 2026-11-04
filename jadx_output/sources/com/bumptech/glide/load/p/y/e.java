package com.bumptech.glide.load.p.y;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bumptech.glide.g;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.p.n;
import com.bumptech.glide.load.p.o;
import com.bumptech.glide.load.p.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class e<DataT> implements n<Uri, DataT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n<File, DataT> f3494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n<Uri, DataT> f3495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Class<DataT> f3496d;

    private static abstract class a<DataT> implements o<Uri, DataT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f3497a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class<DataT> f3498b;

        a(Context context, Class<DataT> cls) {
            this.f3497a = context;
            this.f3498b = cls;
        }

        @Override // com.bumptech.glide.load.p.o
        public final n<Uri, DataT> b(r rVar) {
            return new e(this.f3497a, rVar.d(File.class, this.f3498b), rVar.d(Uri.class, this.f3498b), this.f3498b);
        }
    }

    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    private static final class d<DataT> implements com.bumptech.glide.load.n.d<DataT> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f3499b = {"_data"};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Context f3500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final n<File, DataT> f3501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final n<Uri, DataT> f3502e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Uri f3503f;
        private final int g;
        private final int h;
        private final i i;
        private final Class<DataT> j;
        private volatile boolean k;
        private volatile com.bumptech.glide.load.n.d<DataT> l;

        d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i, int i2, i iVar, Class<DataT> cls) {
            this.f3500c = context.getApplicationContext();
            this.f3501d = nVar;
            this.f3502e = nVar2;
            this.f3503f = uri;
            this.g = i;
            this.h = i2;
            this.i = iVar;
            this.j = cls;
        }

        private n.a<DataT> d() {
            if (Environment.isExternalStorageLegacy()) {
                return this.f3501d.a(h(this.f3503f), this.g, this.h, this.i);
            }
            return this.f3502e.a(g() ? MediaStore.setRequireOriginal(this.f3503f) : this.f3503f, this.g, this.h, this.i);
        }

        private com.bumptech.glide.load.n.d<DataT> f() {
            n.a<DataT> aVarD = d();
            if (aVarD != null) {
                return aVarD.f3445c;
            }
            return null;
        }

        private boolean g() {
            return this.f3500c.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0;
        }

        private File h(Uri uri) {
            Cursor cursor = null;
            try {
                Cursor cursorQuery = this.f3500c.getContentResolver().query(uri, f3499b, null, null, null);
                if (cursorQuery == null || !cursorQuery.moveToFirst()) {
                    throw new FileNotFoundException("Failed to media store entry for: " + uri);
                }
                String string = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                if (!TextUtils.isEmpty(string)) {
                    File file = new File(string);
                    cursorQuery.close();
                    return file;
                }
                throw new FileNotFoundException("File path was empty in media store for: " + uri);
            } catch (Throwable th) {
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        }

        @Override // com.bumptech.glide.load.n.d
        public Class<DataT> a() {
            return this.j;
        }

        @Override // com.bumptech.glide.load.n.d
        public void b() {
            com.bumptech.glide.load.n.d<DataT> dVar = this.l;
            if (dVar != null) {
                dVar.b();
            }
        }

        @Override // com.bumptech.glide.load.n.d
        public com.bumptech.glide.load.a c() {
            return com.bumptech.glide.load.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.n.d
        public void cancel() {
            this.k = true;
            com.bumptech.glide.load.n.d<DataT> dVar = this.l;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        @Override // com.bumptech.glide.load.n.d
        public void e(g gVar, com.bumptech.glide.load.n.d.a<? super DataT> aVar) {
            try {
                com.bumptech.glide.load.n.d<DataT> dVarF = f();
                if (dVarF == null) {
                    aVar.d(new IllegalArgumentException("Failed to build fetcher for: " + this.f3503f));
                    return;
                }
                this.l = dVarF;
                if (this.k) {
                    cancel();
                } else {
                    dVarF.e(gVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.d(e2);
            }
        }
    }

    e(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f3493a = context.getApplicationContext();
        this.f3494b = nVar;
        this.f3495c = nVar2;
        this.f3496d = cls;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<DataT> a(Uri uri, int i, int i2, i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(uri), new d(this.f3493a, this.f3494b, this.f3495c, uri, i, i2, iVar, this.f3496d));
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(Uri uri) {
        return Build.VERSION.SDK_INT >= 29 && com.bumptech.glide.load.n.p.b.b(uri);
    }
}
