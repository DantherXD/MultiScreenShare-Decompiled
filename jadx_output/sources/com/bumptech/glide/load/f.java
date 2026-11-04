package com.bumptech.glide.load;

import com.bumptech.glide.load.q.d.w;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f3104a;

        a(InputStream inputStream) {
            this.f3104a = inputStream;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f3104a);
            } finally {
                this.f3104a.reset();
            }
        }
    }

    class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f3105a;

        b(ByteBuffer byteBuffer) {
            this.f3105a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.a(this.f3105a);
        }
    }

    class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.n.m f3106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.o.a0.b f3107b;

        c(com.bumptech.glide.load.n.m mVar, com.bumptech.glide.load.o.a0.b bVar) {
            this.f3106a = mVar;
            this.f3107b = bVar;
        }

        @Override // com.bumptech.glide.load.f.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            w wVar = null;
            try {
                w wVar2 = new w(new FileInputStream(this.f3106a.a().getFileDescriptor()), this.f3107b);
                try {
                    ImageHeaderParser.ImageType imageTypeC = imageHeaderParser.c(wVar2);
                    try {
                        wVar2.close();
                    } catch (IOException unused) {
                    }
                    this.f3106a.a();
                    return imageTypeC;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        try {
                            wVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f3106a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    class d implements InterfaceC0067f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f3108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.o.a0.b f3109b;

        d(InputStream inputStream, com.bumptech.glide.load.o.a0.b bVar) {
            this.f3108a = inputStream;
            this.f3109b = bVar;
        }

        @Override // com.bumptech.glide.load.f.InterfaceC0067f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f3108a, this.f3109b);
            } finally {
                this.f3108a.reset();
            }
        }
    }

    class e implements InterfaceC0067f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.n.m f3110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.o.a0.b f3111b;

        e(com.bumptech.glide.load.n.m mVar, com.bumptech.glide.load.o.a0.b bVar) {
            this.f3110a = mVar;
            this.f3111b = bVar;
        }

        @Override // com.bumptech.glide.load.f.InterfaceC0067f
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            w wVar = null;
            try {
                w wVar2 = new w(new FileInputStream(this.f3110a.a().getFileDescriptor()), this.f3111b);
                try {
                    int iB = imageHeaderParser.b(wVar2, this.f3111b);
                    try {
                        wVar2.close();
                    } catch (IOException unused) {
                    }
                    this.f3110a.a();
                    return iB;
                } catch (Throwable th) {
                    th = th;
                    wVar = wVar2;
                    if (wVar != null) {
                        try {
                            wVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f3110a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.f$f, reason: collision with other inner class name */
    private interface InterfaceC0067f {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List<ImageHeaderParser> list, com.bumptech.glide.load.n.m mVar, com.bumptech.glide.load.o.a0.b bVar) {
        return c(list, new e(mVar, bVar));
    }

    public static int b(List<ImageHeaderParser> list, InputStream inputStream, com.bumptech.glide.load.o.a0.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return c(list, new d(inputStream, bVar));
    }

    private static int c(List<ImageHeaderParser> list, InterfaceC0067f interfaceC0067f) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = interfaceC0067f.a(list.get(i));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType d(List<ImageHeaderParser> list, com.bumptech.glide.load.n.m mVar, com.bumptech.glide.load.o.a0.b bVar) {
        return g(list, new c(mVar, bVar));
    }

    public static ImageHeaderParser.ImageType e(List<ImageHeaderParser> list, InputStream inputStream, com.bumptech.glide.load.o.a0.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return g(list, new a(inputStream));
    }

    public static ImageHeaderParser.ImageType f(List<ImageHeaderParser> list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : g(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType g(List<ImageHeaderParser> list, g gVar) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType imageTypeA = gVar.a(list.get(i));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
