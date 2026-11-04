package com.bumptech.glide.load.q.e;

import com.bumptech.glide.load.n.e;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class a implements e<ByteBuffer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteBuffer f3596a;

    /* JADX INFO: renamed from: com.bumptech.glide.load.q.e.a$a, reason: collision with other inner class name */
    public static class C0084a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.n.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.n.e.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f3596a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.n.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.n.e
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a() {
        this.f3596a.position(0);
        return this.f3596a;
    }
}
