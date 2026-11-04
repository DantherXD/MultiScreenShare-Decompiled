package com.google.firebase.l;

/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<T> f4504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f4505b;

    public Class<T> a() {
        return this.f4504a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f4504a, this.f4505b);
    }
}
