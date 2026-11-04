package com.google.firebase.components;

/* JADX INFO: loaded from: classes.dex */
public class y<T> implements com.google.firebase.n.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f4372a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f4373b = f4372a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile com.google.firebase.n.b<T> f4374c;

    public y(com.google.firebase.n.b<T> bVar) {
        this.f4374c = bVar;
    }

    @Override // com.google.firebase.n.b
    public T a() {
        T tA = (T) this.f4373b;
        Object obj = f4372a;
        if (tA == obj) {
            synchronized (this) {
                tA = (T) this.f4373b;
                if (tA == obj) {
                    tA = this.f4374c.a();
                    this.f4373b = tA;
                    this.f4374c = null;
                }
            }
        }
        return tA;
    }
}
