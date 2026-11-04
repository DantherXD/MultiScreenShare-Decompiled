package com.google.firebase.p;

import com.google.auto.value.AutoValue;
import javax.annotation.Nonnull;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
abstract class g {
    g() {
    }

    static g a(String str, String str2) {
        return new c(str, str2);
    }

    @Nonnull
    public abstract String b();

    @Nonnull
    public abstract String c();
}
