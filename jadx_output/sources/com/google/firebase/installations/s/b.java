package com.google.firebase.installations.s;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static b f4497a;

    private b() {
    }

    public static b b() {
        if (f4497a == null) {
            f4497a = new b();
        }
        return f4497a;
    }

    @Override // com.google.firebase.installations.s.a
    public long a() {
        return System.currentTimeMillis();
    }
}
