package com.bumptech.glide.load.o.b0;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f3225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f3226b;

        a(Context context, String str) {
            this.f3225a = context;
            this.f3226b = str;
        }

        @Override // com.bumptech.glide.load.o.b0.d.a
        public File a() {
            File cacheDir = this.f3225a.getCacheDir();
            if (cacheDir == null) {
                return null;
            }
            return this.f3226b != null ? new File(cacheDir, this.f3226b) : cacheDir;
        }
    }

    public f(Context context) {
        this(context, "image_manager_disk_cache", 262144000L);
    }

    public f(Context context, String str, long j) {
        super(new a(context, str), j);
    }
}
