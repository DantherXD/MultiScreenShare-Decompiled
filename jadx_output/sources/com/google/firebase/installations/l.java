package com.google.firebase.installations;

import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes.dex */
@AutoValue
public abstract class l {

    @AutoValue.Builder
    public static abstract class a {
        public abstract l a();

        public abstract a b(String str);

        public abstract a c(long j);

        public abstract a d(long j);
    }

    public static a a() {
        return new e.b();
    }

    public abstract String b();

    public abstract long c();

    public abstract long d();
}
