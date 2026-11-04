package com.google.firebase.installations;

/* JADX INFO: loaded from: classes.dex */
public class i extends com.google.firebase.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f4427b;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public i(a aVar) {
        this.f4427b = aVar;
    }

    public i(String str, a aVar) {
        super(str);
        this.f4427b = aVar;
    }
}
