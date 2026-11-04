package com.bumptech.glide.load.n;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class l<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f3144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ContentResolver f3145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f3146d;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f3145c = contentResolver;
        this.f3144b = uri;
    }

    @Override // com.bumptech.glide.load.n.d
    public void b() {
        T t = this.f3146d;
        if (t != null) {
            try {
                d(t);
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

    protected abstract void d(T t);

    @Override // com.bumptech.glide.load.n.d
    public final void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f3144b, this.f3145c);
            this.f3146d = tF;
            aVar.f(tF);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.d(e2);
        }
    }

    protected abstract T f(Uri uri, ContentResolver contentResolver);
}
