package com.bumptech.glide.load.q;

import android.annotation.SuppressLint;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.j;
import com.bumptech.glide.load.k;
import com.bumptech.glide.load.o.v;
import com.bumptech.glide.load.q.d.l;
import com.bumptech.glide.load.q.d.m;
import com.bumptech.glide.load.q.d.r;

/* JADX INFO: loaded from: classes.dex */
public abstract class a<T> implements k<ImageDecoder.Source, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r f3505a = r.a();

    /* JADX INFO: renamed from: com.bumptech.glide.load.q.a$a, reason: collision with other inner class name */
    class C0082a implements ImageDecoder.OnHeaderDecodedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f3506a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f3508c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.b f3509d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l f3510e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ j f3511f;

        /* JADX INFO: renamed from: com.bumptech.glide.load.q.a$a$a, reason: collision with other inner class name */
        class C0083a implements ImageDecoder.OnPartialImageListener {
            C0083a() {
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        }

        C0082a(int i, int i2, boolean z, com.bumptech.glide.load.b bVar, l lVar, j jVar) {
            this.f3506a = i;
            this.f3507b = i2;
            this.f3508c = z;
            this.f3509d = bVar;
            this.f3510e = lVar;
            this.f3511f = jVar;
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @SuppressLint({"Override"})
        public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
            ColorSpace.Named named;
            boolean z = false;
            if (a.this.f3505a.c(this.f3506a, this.f3507b, this.f3508c, false)) {
                imageDecoder.setAllocator(3);
            } else {
                imageDecoder.setAllocator(1);
            }
            if (this.f3509d == com.bumptech.glide.load.b.PREFER_RGB_565) {
                imageDecoder.setMemorySizePolicy(0);
            }
            imageDecoder.setOnPartialImageListener(new C0083a());
            Size size = imageInfo.getSize();
            int width = this.f3506a;
            if (width == Integer.MIN_VALUE) {
                width = size.getWidth();
            }
            int height = this.f3507b;
            if (height == Integer.MIN_VALUE) {
                height = size.getHeight();
            }
            float fB = this.f3510e.b(size.getWidth(), size.getHeight(), width, height);
            int iRound = Math.round(size.getWidth() * fB);
            int iRound2 = Math.round(size.getHeight() * fB);
            if (Log.isLoggable("ImageDecoder", 2)) {
                Log.v("ImageDecoder", "Resizing from [" + size.getWidth() + "x" + size.getHeight() + "] to [" + iRound + "x" + iRound2 + "] scaleFactor: " + fB);
            }
            imageDecoder.setTargetSize(iRound, iRound2);
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                if (this.f3511f == j.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                if (z) {
                    named = ColorSpace.Named.DISPLAY_P3;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(named));
            }
            if (i < 26) {
                return;
            }
            named = ColorSpace.Named.SRGB;
            imageDecoder.setTargetColorSpace(ColorSpace.get(named));
        }
    }

    protected abstract v<T> c(ImageDecoder.Source source, int i, int i2, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener);

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final v<T> a(ImageDecoder.Source source, int i, int i2, i iVar) {
        com.bumptech.glide.load.b bVar = (com.bumptech.glide.load.b) iVar.c(m.f3554a);
        l lVar = (l) iVar.c(l.h);
        h<Boolean> hVar = m.f3558e;
        return c(source, i, i2, new C0082a(i, i2, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), bVar, lVar, (j) iVar.c(m.f3555b)));
    }

    @Override // com.bumptech.glide.load.k
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final boolean b(ImageDecoder.Source source, i iVar) {
        return true;
    }
}
