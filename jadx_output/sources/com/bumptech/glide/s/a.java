package com.bumptech.glide.s;

import android.content.Context;
import com.bumptech.glide.load.g;
import com.bumptech.glide.t.k;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f3788c;

    private a(int i, g gVar) {
        this.f3787b = i;
        this.f3788c = gVar;
    }

    public static g c(Context context) {
        return new a(context.getResources().getConfiguration().uiMode & 48, b.c(context));
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        this.f3788c.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f3787b).array());
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3787b == aVar.f3787b && this.f3788c.equals(aVar.f3788c);
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return k.m(this.f3788c, this.f3787b);
    }
}
