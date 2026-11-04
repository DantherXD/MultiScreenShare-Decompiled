package com.bumptech.glide.load.p;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class d implements n<File, ByteBuffer> {

    private static final class a implements com.bumptech.glide.load.n.d<ByteBuffer> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final File f3405b;

        a(File file) {
            this.f3405b = file;
        }

        @Override // com.bumptech.glide.load.n.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.n.d.a<? super ByteBuffer> aVar) {
            try {
                aVar.f(com.bumptech.glide.t.a.a(this.f3405b));
            } catch (IOException e2) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e2);
                }
                aVar.d(e2);
            }
        }
    }

    public static class b implements o<File, ByteBuffer> {
        @Override // com.bumptech.glide.load.p.o
        public n<File, ByteBuffer> b(r rVar) {
            return new d();
        }
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<ByteBuffer> a(File file, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(file), new a(file));
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(File file) {
        return true;
    }
}
