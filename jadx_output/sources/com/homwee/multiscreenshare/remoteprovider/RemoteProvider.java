package com.homwee.multiscreenshare.remoteprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import com.homwee.multiscreenshare.MainActivity;
import com.homwee.multiscreenshare.r.e;

/* JADX INFO: loaded from: classes.dex */
public class RemoteProvider extends ContentProvider {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final UriMatcher f4681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f4682c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    b f4683d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    SQLiteDatabase f4684e = null;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f4681b = uriMatcher;
        uriMatcher.addURI("com.homwee.multiscreenshare", "autopair", 12);
    }

    private String a(Uri uri) {
        if (f4681b.match(uri) != 12) {
            return null;
        }
        e.d("ContentProvide Code12");
        return "autopair";
    }

    static /* synthetic */ void b() {
        if (MainActivity.s.booleanValue()) {
            return;
        }
        Process.killProcess(Process.myPid());
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        this.f4684e.insert(a(uri), null, contentValues);
        this.f4682c.getContentResolver().notifyChange(uri, null);
        return uri;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f4682c = getContext();
        b bVar = new b(getContext());
        this.f4683d = bVar;
        this.f4684e = bVar.getWritableDatabase();
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.homwee.multiscreenshare.remoteprovider.a
            @Override // java.lang.Runnable
            public final void run() {
                RemoteProvider.b();
            }
        }, 3000L);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        String strA = a(uri);
        e.d("query");
        return this.f4684e.query(strA, strArr, str, strArr2, null, null, str2, null);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
