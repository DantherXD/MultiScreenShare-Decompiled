package a.g.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a.d.e<String, Typeface> f525a = new a.d.e<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f526b = g.a("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f527c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final a.d.g<String, ArrayList<a.g.k.a<C0013e>>> f528d = new a.d.g<>();

    class a implements Callable<C0013e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.g.i.d f531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f532e;

        a(String str, Context context, a.g.i.d dVar, int i) {
            this.f529b = str;
            this.f530c = context;
            this.f531d = dVar;
            this.f532e = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0013e call() {
            return e.c(this.f529b, this.f530c, this.f531d, this.f532e);
        }
    }

    class b implements a.g.k.a<C0013e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a.g.i.a f533a;

        b(a.g.i.a aVar) {
            this.f533a = aVar;
        }

        @Override // a.g.k.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C0013e c0013e) {
            this.f533a.b(c0013e);
        }
    }

    class c implements Callable<C0013e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f535c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ a.g.i.d f536d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f537e;

        c(String str, Context context, a.g.i.d dVar, int i) {
            this.f534b = str;
            this.f535c = context;
            this.f536d = dVar;
            this.f537e = i;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0013e call() {
            return e.c(this.f534b, this.f535c, this.f536d, this.f537e);
        }
    }

    class d implements a.g.k.a<C0013e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f538a;

        d(String str) {
            this.f538a = str;
        }

        @Override // a.g.k.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(C0013e c0013e) {
            synchronized (e.f527c) {
                a.d.g<String, ArrayList<a.g.k.a<C0013e>>> gVar = e.f528d;
                ArrayList<a.g.k.a<C0013e>> arrayList = gVar.get(this.f538a);
                if (arrayList == null) {
                    return;
                }
                gVar.remove(this.f538a);
                for (int i = 0; i < arrayList.size(); i++) {
                    arrayList.get(i).a(c0013e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a.g.i.e$e, reason: collision with other inner class name */
    static final class C0013e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f540b;

        C0013e(int i) {
            this.f539a = null;
            this.f540b = i;
        }

        @SuppressLint({"WrongConstant"})
        C0013e(Typeface typeface) {
            this.f539a = typeface;
            this.f540b = 0;
        }

        @SuppressLint({"WrongConstant"})
        boolean a() {
            return this.f540b == 0;
        }
    }

    private static String a(a.g.i.d dVar, int i) {
        return dVar.d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    private static int b(f.a aVar) {
        int i = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        f.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i = 0;
            for (f.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i;
    }

    static C0013e c(String str, Context context, a.g.i.d dVar, int i) {
        a.d.e<String, Typeface> eVar = f525a;
        Typeface typefaceC = eVar.c(str);
        if (typefaceC != null) {
            return new C0013e(typefaceC);
        }
        try {
            f.a aVarD = a.g.i.c.d(context, dVar, null);
            int iB = b(aVarD);
            if (iB != 0) {
                return new C0013e(iB);
            }
            Typeface typefaceB = a.g.e.d.b(context, null, aVarD.b(), i);
            if (typefaceB == null) {
                return new C0013e(-3);
            }
            eVar.d(str, typefaceB);
            return new C0013e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0013e(-1);
        }
    }

    static Typeface d(Context context, a.g.i.d dVar, int i, Executor executor, a.g.i.a aVar) {
        String strA = a(dVar, i);
        Typeface typefaceC = f525a.c(strA);
        if (typefaceC != null) {
            aVar.b(new C0013e(typefaceC));
            return typefaceC;
        }
        b bVar = new b(aVar);
        synchronized (f527c) {
            a.d.g<String, ArrayList<a.g.k.a<C0013e>>> gVar = f528d;
            ArrayList<a.g.k.a<C0013e>> arrayList = gVar.get(strA);
            if (arrayList != null) {
                arrayList.add(bVar);
                return null;
            }
            ArrayList<a.g.k.a<C0013e>> arrayList2 = new ArrayList<>();
            arrayList2.add(bVar);
            gVar.put(strA, arrayList2);
            c cVar = new c(strA, context, dVar, i);
            if (executor == null) {
                executor = f526b;
            }
            g.b(executor, cVar, new d(strA));
            return null;
        }
    }

    static Typeface e(Context context, a.g.i.d dVar, a.g.i.a aVar, int i, int i2) {
        String strA = a(dVar, i);
        Typeface typefaceC = f525a.c(strA);
        if (typefaceC != null) {
            aVar.b(new C0013e(typefaceC));
            return typefaceC;
        }
        if (i2 == -1) {
            C0013e c0013eC = c(strA, context, dVar, i);
            aVar.b(c0013eC);
            return c0013eC.f539a;
        }
        try {
            C0013e c0013e = (C0013e) g.c(f526b, new a(strA, context, dVar, i), i2);
            aVar.b(c0013e);
            return c0013e.f539a;
        } catch (InterruptedException unused) {
            aVar.b(new C0013e(-3));
            return null;
        }
    }
}
