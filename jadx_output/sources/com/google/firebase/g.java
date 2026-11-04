package com.google.firebase;

/* JADX INFO: loaded from: classes.dex */
public class g extends Exception {
    @Deprecated
    protected g() {
    }

    public g(String str) {
        super(com.google.android.gms.common.internal.b.c(str, "Detail message must not be empty"));
    }

    public g(String str, Throwable th) {
        super(com.google.android.gms.common.internal.b.c(str, "Detail message must not be empty"), th);
    }
}
