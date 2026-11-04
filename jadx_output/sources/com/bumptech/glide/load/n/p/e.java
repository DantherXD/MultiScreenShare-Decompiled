package com.bumptech.glide.load.n.p;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f3157a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f3158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f3159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.b f3160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ContentResolver f3161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<ImageHeaderParser> f3162f;

    e(List<ImageHeaderParser> list, a aVar, d dVar, com.bumptech.glide.load.o.a0.b bVar, ContentResolver contentResolver) {
        this.f3158b = aVar;
        this.f3159c = dVar;
        this.f3160d = bVar;
        this.f3161e = contentResolver;
        this.f3162f = list;
    }

    e(List<ImageHeaderParser> list, d dVar, com.bumptech.glide.load.o.a0.b bVar, ContentResolver contentResolver) {
        this(list, f3157a, dVar, bVar, contentResolver);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    private String b(Uri uri) throws Throwable {
        Cursor cursorA;
        ?? r1 = 0;
        try {
            try {
                cursorA = this.f3159c.a(uri);
                if (cursorA != null) {
                    try {
                        if (cursorA.moveToFirst()) {
                            String string = cursorA.getString(0);
                            cursorA.close();
                            return string;
                        }
                    } catch (SecurityException e2) {
                        e = e2;
                        if (Log.isLoggable("ThumbStreamOpener", 3)) {
                            Log.d("ThumbStreamOpener", "Failed to query for thumbnail for Uri: " + uri, e);
                        }
                        if (cursorA != null) {
                            cursorA.close();
                        }
                        return null;
                    }
                }
                if (cursorA != null) {
                    cursorA.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                r1 = this;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SecurityException e3) {
            e = e3;
            cursorA = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    private boolean c(File file) {
        return this.f3158b.a(file) && 0 < this.f3158b.c(file);
    }

    int a(Uri uri) {
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = this.f3161e.openInputStream(uri);
            return f.b(this.f3162f, inputStreamOpenInputStream, this.f3160d);
        } catch (IOException | NullPointerException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                Log.d("ThumbStreamOpener", "Failed to open uri: " + uri, e2);
            }
            if (inputStreamOpenInputStream == null) {
                return -1;
            }
            try {
                return -1;
            } catch (IOException unused) {
                return -1;
            }
        } finally {
            if (inputStreamOpenInputStream != null) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    public InputStream d(Uri uri) throws Throwable {
        String strB = b(uri);
        if (TextUtils.isEmpty(strB)) {
            return null;
        }
        File fileB = this.f3158b.b(strB);
        if (!c(fileB)) {
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileB);
        try {
            return this.f3161e.openInputStream(uriFromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + uriFromFile).initCause(e2));
        }
    }
}
