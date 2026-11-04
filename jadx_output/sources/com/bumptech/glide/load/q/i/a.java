package com.bumptech.glide.load.q.i;

import android.graphics.Bitmap;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.o.v;
import java.io.ByteArrayOutputStream;

/* JADX INFO: loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f3632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3633b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    public a(Bitmap.CompressFormat compressFormat, int i) {
        this.f3632a = compressFormat;
        this.f3633b = i;
    }

    @Override // com.bumptech.glide.load.q.i.e
    public v<byte[]> a(v<Bitmap> vVar, i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.a().compress(this.f3632a, this.f3633b, byteArrayOutputStream);
        vVar.f();
        return new com.bumptech.glide.load.q.e.b(byteArrayOutputStream.toByteArray());
    }
}
