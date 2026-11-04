package a.g.e;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"NewApi"})
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a.d.e<String, Typeface> f487b;

    public static class a extends a.g.i.f.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private a.g.d.f.f.a f488a;

        public a(a.g.d.f.f.a aVar) {
            this.f488a = aVar;
        }

        @Override // a.g.i.f.c
        public void a(int i) {
            a.g.d.f.f.a aVar = this.f488a;
            if (aVar != null) {
                aVar.d(i);
            }
        }

        @Override // a.g.i.f.c
        public void b(Typeface typeface) {
            a.g.d.f.f.a aVar = this.f488a;
            if (aVar != null) {
                aVar.e(typeface);
            }
        }
    }

    static {
        j eVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            eVar = new i();
        } else if (i >= 28) {
            eVar = new h();
        } else if (i >= 26) {
            eVar = new g();
        } else if (i < 24 || !f.m()) {
            eVar = i >= 21 ? new e() : new j();
        } else {
            eVar = new f();
        }
        f486a = eVar;
        f487b = new a.d.e<>(16);
    }

    public static Typeface a(Context context, Typeface typeface, int i) {
        Typeface typefaceG;
        if (context != null) {
            return (Build.VERSION.SDK_INT >= 21 || (typefaceG = g(context, typeface, i)) == null) ? Typeface.create(typeface, i) : typefaceG;
        }
        throw new IllegalArgumentException("Context cannot be null");
    }

    public static Typeface b(Context context, CancellationSignal cancellationSignal, a.g.i.f.b[] bVarArr, int i) {
        return f486a.c(context, cancellationSignal, bVarArr, i);
    }

    public static Typeface c(Context context, a.g.d.f.c.a aVar, Resources resources, int i, int i2, a.g.d.f.f.a aVar2, Handler handler, boolean z) {
        Typeface typefaceB;
        if (aVar instanceof a.g.d.f.c.d) {
            a.g.d.f.c.d dVar = (a.g.d.f.c.d) aVar;
            Typeface typefaceH = h(dVar.c());
            if (typefaceH != null) {
                if (aVar2 != null) {
                    aVar2.b(typefaceH, handler);
                }
                return typefaceH;
            }
            boolean z2 = !z ? aVar2 != null : dVar.a() != 0;
            int iD = z ? dVar.d() : -1;
            typefaceB = a.g.i.f.a(context, dVar.b(), i2, z2, iD, a.g.d.f.f.a.c(handler), new a(aVar2));
        } else {
            typefaceB = f486a.b(context, (a.g.d.f.c.b) aVar, resources, i2);
            if (aVar2 != null) {
                if (typefaceB != null) {
                    aVar2.b(typefaceB, handler);
                } else {
                    aVar2.a(-3, handler);
                }
            }
        }
        if (typefaceB != null) {
            f487b.d(e(resources, i, i2), typefaceB);
        }
        return typefaceB;
    }

    public static Typeface d(Context context, Resources resources, int i, String str, int i2) {
        Typeface typefaceE = f486a.e(context, resources, i, str, i2);
        if (typefaceE != null) {
            f487b.d(e(resources, i, i2), typefaceE);
        }
        return typefaceE;
    }

    private static String e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    public static Typeface f(Resources resources, int i, int i2) {
        return f487b.c(e(resources, i, i2));
    }

    private static Typeface g(Context context, Typeface typeface, int i) {
        j jVar = f486a;
        a.g.d.f.c.b bVarI = jVar.i(typeface);
        if (bVarI == null) {
            return null;
        }
        return jVar.b(context, bVarI, context.getResources(), i);
    }

    private static Typeface h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface typefaceCreate = Typeface.create(str, 0);
        Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
        if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
            return null;
        }
        return typefaceCreate;
    }
}
