package com.google.firebase.components;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class w implements com.google.firebase.l.d, com.google.firebase.l.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, ConcurrentHashMap<com.google.firebase.l.b<Object>, Executor>> f4369a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue<com.google.firebase.l.a<?>> f4370b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f4371c;

    w(Executor executor) {
        this.f4371c = executor;
    }

    private synchronized Set<Map.Entry<com.google.firebase.l.b<Object>, Executor>> b(com.google.firebase.l.a<?> aVar) {
        ConcurrentHashMap<com.google.firebase.l.b<Object>, Executor> concurrentHashMap;
        concurrentHashMap = this.f4369a.get(aVar.a());
        return concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
    }

    void a() {
        Queue<com.google.firebase.l.a<?>> queue;
        synchronized (this) {
            queue = this.f4370b;
            if (queue != null) {
                this.f4370b = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            Iterator<com.google.firebase.l.a<?>> it = queue.iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }
    }

    public void d(final com.google.firebase.l.a<?> aVar) {
        c0.b(aVar);
        synchronized (this) {
            Queue<com.google.firebase.l.a<?>> queue = this.f4370b;
            if (queue != null) {
                queue.add(aVar);
                return;
            }
            for (final Map.Entry<com.google.firebase.l.b<Object>, Executor> entry : b(aVar)) {
                entry.getValue().execute(new Runnable() { // from class: com.google.firebase.components.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((com.google.firebase.l.b) entry.getKey()).a(aVar);
                    }
                });
            }
        }
    }
}
