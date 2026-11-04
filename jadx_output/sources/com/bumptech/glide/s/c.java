package com.bumptech.glide.s;

import com.bumptech.glide.load.g;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f3790b = new c();

    private c() {
    }

    public static c c() {
        return f3790b;
    }

    @Override // com.bumptech.glide.load.g
    public void a(MessageDigest messageDigest) {
    }

    public String toString() {
        return "EmptySignature";
    }
}
