package com.bumptech.glide.load.n;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m implements e<ParcelFileDescriptor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f3147a;

    public static final class a implements e.a<ParcelFileDescriptor> {
        @Override // com.bumptech.glide.load.n.e.a
        public Class<ParcelFileDescriptor> a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.n.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ParcelFileDescriptor> b(ParcelFileDescriptor parcelFileDescriptor) {
            return new m(parcelFileDescriptor);
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ParcelFileDescriptor f3148a;

        b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f3148a = parcelFileDescriptor;
        }

        ParcelFileDescriptor a() throws IOException {
            try {
                Os.lseek(this.f3148a.getFileDescriptor(), 0L, OsConstants.SEEK_SET);
                return this.f3148a;
            } catch (ErrnoException e2) {
                throw new IOException(e2);
            }
        }
    }

    public m(ParcelFileDescriptor parcelFileDescriptor) {
        this.f3147a = new b(parcelFileDescriptor);
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }

    @Override // com.bumptech.glide.load.n.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.n.e
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ParcelFileDescriptor a() {
        return this.f3147a.a();
    }
}
