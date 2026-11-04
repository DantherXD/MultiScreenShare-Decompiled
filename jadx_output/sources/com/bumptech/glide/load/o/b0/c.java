package com.bumptech.glide.load.o.b0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f3213a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f3214b = new b();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f3215a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3216b;

        a() {
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue<a> f3217a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVarPoll;
            synchronized (this.f3217a) {
                aVarPoll = this.f3217a.poll();
            }
            return aVarPoll == null ? new a() : aVarPoll;
        }

        void b(a aVar) {
            synchronized (this.f3217a) {
                if (this.f3217a.size() < 10) {
                    this.f3217a.offer(aVar);
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            aVarA = this.f3213a.get(str);
            if (aVarA == null) {
                aVarA = this.f3214b.a();
                this.f3213a.put(str, aVarA);
            }
            aVarA.f3216b++;
        }
        aVarA.f3215a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            aVar = (a) com.bumptech.glide.t.j.d(this.f3213a.get(str));
            int i = aVar.f3216b;
            if (i < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f3216b);
            }
            int i2 = i - 1;
            aVar.f3216b = i2;
            if (i2 == 0) {
                a aVarRemove = this.f3213a.remove(str);
                if (!aVarRemove.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVarRemove + ", safeKey: " + str);
                }
                this.f3214b.b(aVarRemove);
            }
        }
        aVar.f3215a.unlock();
    }
}
