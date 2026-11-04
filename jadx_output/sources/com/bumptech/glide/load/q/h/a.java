package com.bumptech.glide.load.q.h;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.k;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class a implements k<ByteBuffer, c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0085a f3601a = new C0085a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f3602b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f3603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f3604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f3605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C0085a f3606f;
    private final com.bumptech.glide.load.q.h.b g;

    /* JADX INFO: renamed from: com.bumptech.glide.load.q.h.a$a, reason: collision with other inner class name */
    static class C0085a {
        C0085a() {
        }

        com.bumptech.glide.n.a a(com.bumptech.glide.n.a.InterfaceC0087a interfaceC0087a, com.bumptech.glide.n.c cVar, ByteBuffer byteBuffer, int i) {
            return new com.bumptech.glide.n.e(interfaceC0087a, cVar, byteBuffer, i);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<com.bumptech.glide.n.d> f3607a = com.bumptech.glide.t.k.e(0);

        b() {
        }

        synchronized com.bumptech.glide.n.d a(ByteBuffer byteBuffer) {
            com.bumptech.glide.n.d dVarPoll;
            dVarPoll = this.f3607a.poll();
            if (dVarPoll == null) {
                dVarPoll = new com.bumptech.glide.n.d();
            }
            return dVarPoll.p(byteBuffer);
        }

        synchronized void b(com.bumptech.glide.n.d dVar) {
            dVar.a();
            this.f3607a.offer(dVar);
        }
    }

    public a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.o.a0.e eVar, com.bumptech.glide.load.o.a0.b bVar) {
        this(context, list, eVar, bVar, f3602b, f3601a);
    }

    a(Context context, List<ImageHeaderParser> list, com.bumptech.glide.load.o.a0.e eVar, com.bumptech.glide.load.o.a0.b bVar, b bVar2, C0085a c0085a) {
        this.f3603c = context.getApplicationContext();
        this.f3604d = list;
        this.f3606f = c0085a;
        this.g = new com.bumptech.glide.load.q.h.b(eVar, bVar);
        this.f3605e = bVar2;
    }

    private e c(ByteBuffer byteBuffer, int i, int i2, com.bumptech.glide.n.d dVar, com.bumptech.glide.load.i iVar) {
        long jB = com.bumptech.glide.t.f.b();
        try {
            com.bumptech.glide.n.c cVarC = dVar.c();
            if (cVarC.b() > 0 && cVarC.c() == 0) {
                Bitmap.Config config = iVar.c(i.f3627a) == com.bumptech.glide.load.b.PREFER_RGB_565 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
                com.bumptech.glide.n.a aVarA = this.f3606f.a(this.g, cVarC, byteBuffer, e(cVarC, i, i2));
                aVarA.c(config);
                aVarA.e();
                Bitmap bitmapD = aVarA.d();
                if (bitmapD == null) {
                    return null;
                }
                return new e(new c(this.f3603c, aVarA, com.bumptech.glide.load.q.c.c(), i, i2, bitmapD));
            }
            return null;
        } finally {
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                Log.v("BufferGifDecoder", "Decoded GIF from stream in " + com.bumptech.glide.t.f.a(jB));
            }
        }
    }

    private static int e(com.bumptech.glide.n.c cVar, int i, int i2) {
        int iMin = Math.min(cVar.a() / i2, cVar.d() / i);
        int iMax = Math.max(1, iMin == 0 ? 0 : Integer.highestOneBit(iMin));
        if (Log.isLoggable("BufferGifDecoder", 2) && iMax > 1) {
            Log.v("BufferGifDecoder", "Downsampling GIF, sampleSize: " + iMax + ", target dimens: [" + i + "x" + i2 + "], actual dimens: [" + cVar.d() + "x" + cVar.a() + "]");
        }
        return iMax;
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public e a(ByteBuffer byteBuffer, int i, int i2, com.bumptech.glide.load.i iVar) {
        com.bumptech.glide.n.d dVarA = this.f3605e.a(byteBuffer);
        try {
            return c(byteBuffer, i, i2, dVarA, iVar);
        } finally {
            this.f3605e.b(dVarA);
        }
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean b(ByteBuffer byteBuffer, com.bumptech.glide.load.i iVar) {
        return !((Boolean) iVar.c(i.f3628b)).booleanValue() && com.bumptech.glide.load.f.f(this.f3604d, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }
}
