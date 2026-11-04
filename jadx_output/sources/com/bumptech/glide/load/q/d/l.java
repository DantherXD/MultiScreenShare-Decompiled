package com.bumptech.glide.load.q.d;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f3545a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f3546b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f3547c = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f3548d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final l f3549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final l f3550f;
    public static final l g;
    public static final com.bumptech.glide.load.h<l> h;
    static final boolean i;

    private static class a extends l {
        a() {
        }

        @Override // com.bumptech.glide.load.q.d.l
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.q.d.l
        public float b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    private static class b extends l {
        b() {
        }

        @Override // com.bumptech.glide.load.q.d.l
        public g a(int i, int i2, int i3, int i4) {
            return g.MEMORY;
        }

        @Override // com.bumptech.glide.load.q.d.l
        public float b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    private static class c extends l {
        c() {
        }

        @Override // com.bumptech.glide.load.q.d.l
        public g a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? g.QUALITY : l.f3547c.a(i, i2, i3, i4);
        }

        @Override // com.bumptech.glide.load.q.d.l
        public float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, l.f3547c.b(i, i2, i3, i4));
        }
    }

    private static class d extends l {
        d() {
        }

        @Override // com.bumptech.glide.load.q.d.l
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.q.d.l
        public float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    private static class e extends l {
        e() {
        }

        @Override // com.bumptech.glide.load.q.d.l
        public g a(int i, int i2, int i3, int i4) {
            return l.i ? g.QUALITY : g.MEMORY;
        }

        @Override // com.bumptech.glide.load.q.d.l
        public float b(int i, int i2, int i3, int i4) {
            if (l.i) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    private static class f extends l {
        f() {
        }

        @Override // com.bumptech.glide.load.q.d.l
        public g a(int i, int i2, int i3, int i4) {
            return g.QUALITY;
        }

        @Override // com.bumptech.glide.load.q.d.l
        public float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    public enum g {
        MEMORY,
        QUALITY
    }

    static {
        d dVar = new d();
        f3549e = dVar;
        f3550f = new f();
        g = dVar;
        h = com.bumptech.glide.load.h.f("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", dVar);
        i = Build.VERSION.SDK_INT >= 19;
    }

    public abstract g a(int i2, int i3, int i4, int i5);

    public abstract float b(int i2, int i3, int i4, int i5);
}
