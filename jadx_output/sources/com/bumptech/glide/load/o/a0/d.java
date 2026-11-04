package com.bumptech.glide.load.o.a0;

import com.bumptech.glide.load.o.a0.m;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
abstract class d<T extends m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<T> f3181a = com.bumptech.glide.t.k.e(20);

    d() {
    }

    abstract T a();

    T b() {
        T tPoll = this.f3181a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t) {
        if (this.f3181a.size() < 20) {
            this.f3181a.offer(t);
        }
    }
}
