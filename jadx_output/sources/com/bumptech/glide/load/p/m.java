package com.bumptech.glide.load.p;

import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class m<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.t.g<b<A>, B> f3437a;

    class a extends com.bumptech.glide.t.g<b<A>, B> {
        a(long j) {
            super(j);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.t.g
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b2) {
            bVar.c();
        }
    }

    static final class b<A> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Queue<b<?>> f3439a = com.bumptech.glide.t.k.e(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f3440b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f3441c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private A f3442d;

        private b() {
        }

        static <A> b<A> a(A a2, int i, int i2) {
            b<A> bVar;
            Queue<b<?>> queue = f3439a;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a2, i, i2);
            return bVar;
        }

        private void b(A a2, int i, int i2) {
            this.f3442d = a2;
            this.f3441c = i;
            this.f3440b = i2;
        }

        public void c() {
            Queue<b<?>> queue = f3439a;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3441c == bVar.f3441c && this.f3440b == bVar.f3440b && this.f3442d.equals(bVar.f3442d);
        }

        public int hashCode() {
            return (((this.f3440b * 31) + this.f3441c) * 31) + this.f3442d.hashCode();
        }
    }

    public m(long j) {
        this.f3437a = new a(j);
    }

    public B a(A a2, int i, int i2) {
        b<A> bVarA = b.a(a2, i, i2);
        B bG = this.f3437a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.f3437a.k(b.a(a2, i, i2), b2);
    }
}
