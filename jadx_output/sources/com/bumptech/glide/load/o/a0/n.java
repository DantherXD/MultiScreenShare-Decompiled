package com.bumptech.glide.load.o.a0;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Bitmap.Config[] f3203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config[] f3204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Bitmap.Config[] f3205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Bitmap.Config[] f3206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Bitmap.Config[] f3207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c f3208f = new c();
    private final h<b, Bitmap> g = new h<>();
    private final Map<Bitmap.Config, NavigableMap<Integer, Integer>> h = new HashMap();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f3209a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f3209a = iArr;
            try {
                iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3209a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3209a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3209a[Bitmap.Config.ALPHA_8.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static final class b implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f3210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3211b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Bitmap.Config f3212c;

        public b(c cVar) {
            this.f3210a = cVar;
        }

        @Override // com.bumptech.glide.load.o.a0.m
        public void a() {
            this.f3210a.c(this);
        }

        public void b(int i, Bitmap.Config config) {
            this.f3211b = i;
            this.f3212c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f3211b == bVar.f3211b && com.bumptech.glide.t.k.c(this.f3212c, bVar.f3212c);
        }

        public int hashCode() {
            int i = this.f3211b * 31;
            Bitmap.Config config = this.f3212c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return n.i(this.f3211b, this.f3212c);
        }
    }

    static class c extends d<b> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.bumptech.glide.load.o.a0.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a() {
            return new b(this);
        }

        public b e(int i, Bitmap.Config config) {
            b bVarB = b();
            bVarB.b(i, config);
            return bVarB;
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        f3203a = configArr;
        f3204b = configArr;
        f3205c = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        f3206d = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        f3207e = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    private void g(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> navigableMapK = k(bitmap.getConfig());
        Integer num2 = (Integer) navigableMapK.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                navigableMapK.remove(num);
                return;
            } else {
                navigableMapK.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + f(bitmap) + ", this: " + this);
    }

    private b h(int i, Bitmap.Config config) {
        b bVarE = this.f3208f.e(i, config);
        for (Bitmap.Config config2 : j(config)) {
            Integer numCeilingKey = k(config2).ceilingKey(Integer.valueOf(i));
            if (numCeilingKey != null && numCeilingKey.intValue() <= i * 8) {
                if (numCeilingKey.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return bVarE;
                        }
                    } else if (config2.equals(config)) {
                        return bVarE;
                    }
                }
                this.f3208f.c(bVarE);
                return this.f3208f.e(numCeilingKey.intValue(), config2);
            }
        }
        return bVarE;
    }

    static String i(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    private static Bitmap.Config[] j(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && Bitmap.Config.RGBA_F16.equals(config)) {
            return f3204b;
        }
        int i = a.f3209a[config.ordinal()];
        if (i == 1) {
            return f3203a;
        }
        if (i == 2) {
            return f3205c;
        }
        if (i != 3) {
            return i != 4 ? new Bitmap.Config[]{config} : f3207e;
        }
        return f3206d;
    }

    private NavigableMap<Integer, Integer> k(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.h.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.h.put(config, treeMap);
        return treeMap;
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public int a(Bitmap bitmap) {
        return com.bumptech.glide.t.k.g(bitmap);
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public Bitmap b() {
        Bitmap bitmapF = this.g.f();
        if (bitmapF != null) {
            g(Integer.valueOf(com.bumptech.glide.t.k.g(bitmapF)), bitmapF);
        }
        return bitmapF;
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public Bitmap c(int i, int i2, Bitmap.Config config) {
        b bVarH = h(com.bumptech.glide.t.k.f(i, i2, config), config);
        Bitmap bitmapA = this.g.a(bVarH);
        if (bitmapA != null) {
            g(Integer.valueOf(bVarH.f3211b), bitmapA);
            bitmapA.reconfigure(i, i2, config);
        }
        return bitmapA;
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public void d(Bitmap bitmap) {
        b bVarE = this.f3208f.e(com.bumptech.glide.t.k.g(bitmap), bitmap.getConfig());
        this.g.d(bVarE, bitmap);
        NavigableMap<Integer, Integer> navigableMapK = k(bitmap.getConfig());
        Integer num = (Integer) navigableMapK.get(Integer.valueOf(bVarE.f3211b));
        navigableMapK.put(Integer.valueOf(bVarE.f3211b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public String e(int i, int i2, Bitmap.Config config) {
        return i(com.bumptech.glide.t.k.f(i, i2, config), config);
    }

    @Override // com.bumptech.glide.load.o.a0.l
    public String f(Bitmap bitmap) {
        return i(com.bumptech.glide.t.k.g(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.g);
        sb.append(", sortedSizes=(");
        for (Map.Entry<Bitmap.Config, NavigableMap<Integer, Integer>> entry : this.h.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.h.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}
