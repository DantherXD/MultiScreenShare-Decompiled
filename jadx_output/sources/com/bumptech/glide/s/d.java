package com.bumptech.glide.s;

import com.bumptech.glide.load.g;
import com.bumptech.glide.t.j;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class d implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f3791b;

    public d(Object obj) {
        this.f3791b = j.d(obj);
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
        messageDigest.update(this.f3791b.toString().getBytes(g.f3112a));
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f3791b.equals(((d) obj).f3791b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f3791b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f3791b + '}';
    }
}
