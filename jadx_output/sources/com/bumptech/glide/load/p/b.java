package com.bumptech.glide.load.p;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0079b<Data> f3400a;

    public static class a implements o<byte[], ByteBuffer> {

        /* JADX INFO: renamed from: com.bumptech.glide.load.p.b$a$a, reason: collision with other inner class name */
        class C0078a implements InterfaceC0079b<ByteBuffer> {
            C0078a() {
            }

            @Override // com.bumptech.glide.load.p.b.InterfaceC0079b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // com.bumptech.glide.load.p.b.InterfaceC0079b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p.o
        public n<byte[], ByteBuffer> b(r rVar) {
            return new b(new C0078a());
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.p.b$b, reason: collision with other inner class name */
    public interface InterfaceC0079b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    private static class c<Data> implements com.bumptech.glide.load.n.d<Data> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final byte[] f3402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final InterfaceC0079b<Data> f3403c;

        c(byte[] bArr, InterfaceC0079b<Data> interfaceC0079b) {
            this.f3402b = bArr;
            this.f3403c = interfaceC0079b;
        }

        @Override // com.bumptech.glide.load.n.d
        public Class<Data> a() {
            return this.f3403c.a();
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
        public void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.n.d.a<? super Data> aVar) {
            aVar.f(this.f3403c.b(this.f3402b));
        }
    }

    public static class d implements o<byte[], InputStream> {

        class a implements InterfaceC0079b<InputStream> {
            a() {
            }

            @Override // com.bumptech.glide.load.p.b.InterfaceC0079b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // com.bumptech.glide.load.p.b.InterfaceC0079b
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // com.bumptech.glide.load.p.o
        public n<byte[], InputStream> b(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0079b<Data> interfaceC0079b) {
        this.f3400a = interfaceC0079b;
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n.a<Data> a(byte[] bArr, int i, int i2, com.bumptech.glide.load.i iVar) {
        return new n.a<>(new com.bumptech.glide.s.d(bArr), new c(bArr, this.f3400a));
    }

    @Override // com.bumptech.glide.load.p.n
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(byte[] bArr) {
        return true;
    }
}
