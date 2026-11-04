package com.bumptech.glide.load.n;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class b<T> implements d<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AssetManager f3123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private T f3124d;

    public b(AssetManager assetManager, String str) {
        this.f3123c = assetManager;
        this.f3122b = str;
    }

    @Override // com.bumptech.glide.load.n.d
    public void b() {
        T t = this.f3124d;
        if (t == null) {
            return;
        }
        try {
            d(t);
        } catch (IOException unused) {
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
    public void e(com.bumptech.glide.g gVar, d.a<? super T> aVar) {
        try {
            T tF = f(this.f3123c, this.f3122b);
            this.f3124d = tF;
            aVar.f(tF);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.d(e2);
        }
    }

    protected abstract T f(AssetManager assetManager, String str);
}
