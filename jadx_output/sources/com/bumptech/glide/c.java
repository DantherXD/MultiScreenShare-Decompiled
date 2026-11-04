package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.p.s;
import com.bumptech.glide.load.p.u;
import com.bumptech.glide.load.p.w;
import com.bumptech.glide.load.q.d.a0;
import com.bumptech.glide.load.q.d.b0;
import com.bumptech.glide.load.q.d.m;
import com.bumptech.glide.load.q.d.p;
import com.bumptech.glide.load.q.d.t;
import com.bumptech.glide.load.q.d.v;
import com.bumptech.glide.load.q.d.x;
import com.bumptech.glide.load.q.d.y;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class c implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile c f3043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f3044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.bumptech.glide.load.o.k f3045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.o.a0.e f3046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.o.b0.h f3047f;
    private final e g;
    private final i h;
    private final com.bumptech.glide.load.o.a0.b i;
    private final com.bumptech.glide.o.l j;
    private final com.bumptech.glide.o.d k;
    private final a m;
    private final List<k> l = new ArrayList();
    private f n = f.NORMAL;

    public interface a {
        com.bumptech.glide.r.f a();
    }

    c(Context context, com.bumptech.glide.load.o.k kVar, com.bumptech.glide.load.o.b0.h hVar, com.bumptech.glide.load.o.a0.e eVar, com.bumptech.glide.load.o.a0.b bVar, com.bumptech.glide.o.l lVar, com.bumptech.glide.o.d dVar, int i, a aVar, Map<Class<?>, l<?, ?>> map, List<com.bumptech.glide.r.e<Object>> list, boolean z, boolean z2) {
        com.bumptech.glide.load.k gVar;
        com.bumptech.glide.load.k yVar;
        this.f3045d = kVar;
        this.f3046e = eVar;
        this.i = bVar;
        this.f3047f = hVar;
        this.j = lVar;
        this.k = dVar;
        this.m = aVar;
        Resources resources = context.getResources();
        i iVar = new i();
        this.h = iVar;
        iVar.o(new com.bumptech.glide.load.q.d.k());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 27) {
            iVar.o(new p());
        }
        List<ImageHeaderParser> listG = iVar.g();
        com.bumptech.glide.load.q.h.a aVar2 = new com.bumptech.glide.load.q.h.a(context, listG, eVar, bVar);
        com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> kVarH = b0.h(eVar);
        m mVar = new m(iVar.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (!z2 || i2 < 28) {
            gVar = new com.bumptech.glide.load.q.d.g(mVar);
            yVar = new y(mVar, bVar);
        } else {
            yVar = new t();
            gVar = new com.bumptech.glide.load.q.d.h();
        }
        com.bumptech.glide.load.q.f.d dVar2 = new com.bumptech.glide.load.q.f.d(context);
        s.c cVar = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        com.bumptech.glide.load.q.d.c cVar2 = new com.bumptech.glide.load.q.d.c(bVar);
        com.bumptech.glide.load.q.i.a aVar4 = new com.bumptech.glide.load.q.i.a();
        com.bumptech.glide.load.q.i.d dVar4 = new com.bumptech.glide.load.q.i.d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.a(ByteBuffer.class, new com.bumptech.glide.load.p.c()).a(InputStream.class, new com.bumptech.glide.load.p.t(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, gVar).e("Bitmap", InputStream.class, Bitmap.class, yVar);
        if (com.bumptech.glide.load.n.m.c()) {
            iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        }
        iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, kVarH).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, b0.c(eVar)).d(Bitmap.class, Bitmap.class, com.bumptech.glide.load.p.v.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new a0()).b(Bitmap.class, cVar2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.q.d.a(resources, gVar)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.q.d.a(resources, yVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.q.d.a(resources, kVarH)).b(BitmapDrawable.class, new com.bumptech.glide.load.q.d.b(eVar, cVar2)).e("Gif", InputStream.class, com.bumptech.glide.load.q.h.c.class, new com.bumptech.glide.load.q.h.j(listG, aVar2, bVar)).e("Gif", ByteBuffer.class, com.bumptech.glide.load.q.h.c.class, aVar2).b(com.bumptech.glide.load.q.h.c.class, new com.bumptech.glide.load.q.h.d()).d(com.bumptech.glide.n.a.class, com.bumptech.glide.n.a.class, com.bumptech.glide.load.p.v.a.a()).e("Bitmap", com.bumptech.glide.n.a.class, Bitmap.class, new com.bumptech.glide.load.q.h.h(eVar)).c(Uri.class, Drawable.class, dVar2).c(Uri.class, Bitmap.class, new x(dVar2, eVar)).p(new com.bumptech.glide.load.q.e.a.C0084a()).d(File.class, ByteBuffer.class, new com.bumptech.glide.load.p.d.b()).d(File.class, InputStream.class, new com.bumptech.glide.load.p.f.e()).c(File.class, File.class, new com.bumptech.glide.load.q.g.a()).d(File.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.p.f.b()).d(File.class, File.class, com.bumptech.glide.load.p.v.a.a()).p(new com.bumptech.glide.load.n.k.a(bVar));
        if (com.bumptech.glide.load.n.m.c()) {
            iVar.p(new com.bumptech.glide.load.n.m.a());
        }
        Class cls = Integer.TYPE;
        iVar.d(cls, InputStream.class, cVar).d(cls, ParcelFileDescriptor.class, bVar2).d(Integer.class, InputStream.class, cVar).d(Integer.class, ParcelFileDescriptor.class, bVar2).d(Integer.class, Uri.class, dVar3).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, Uri.class, dVar3).d(String.class, InputStream.class, new com.bumptech.glide.load.p.e.c()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.p.e.c()).d(String.class, InputStream.class, new u.c()).d(String.class, ParcelFileDescriptor.class, new u.b()).d(String.class, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.p.y.b.a()).d(Uri.class, InputStream.class, new com.bumptech.glide.load.p.a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.p.a.b(context.getAssets())).d(Uri.class, InputStream.class, new com.bumptech.glide.load.p.y.c.a(context)).d(Uri.class, InputStream.class, new com.bumptech.glide.load.p.y.d.a(context));
        if (i2 >= 29) {
            iVar.d(Uri.class, InputStream.class, new com.bumptech.glide.load.p.y.e.c(context));
            iVar.d(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.p.y.e.b(context));
        }
        iVar.d(Uri.class, InputStream.class, new w.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).d(Uri.class, InputStream.class, new com.bumptech.glide.load.p.x.a()).d(URL.class, InputStream.class, new com.bumptech.glide.load.p.y.f.a()).d(Uri.class, File.class, new com.bumptech.glide.load.p.k.a(context)).d(com.bumptech.glide.load.p.g.class, InputStream.class, new com.bumptech.glide.load.p.y.a.C0081a()).d(byte[].class, ByteBuffer.class, new com.bumptech.glide.load.p.b.a()).d(byte[].class, InputStream.class, new com.bumptech.glide.load.p.b.d()).d(Uri.class, Uri.class, com.bumptech.glide.load.p.v.a.a()).d(Drawable.class, Drawable.class, com.bumptech.glide.load.p.v.a.a()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.q.f.e()).q(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.q.i.b(resources)).q(Bitmap.class, byte[].class, aVar4).q(Drawable.class, byte[].class, new com.bumptech.glide.load.q.i.c(eVar, aVar4, dVar4)).q(com.bumptech.glide.load.q.h.c.class, byte[].class, dVar4);
        if (i2 >= 23) {
            com.bumptech.glide.load.k<ByteBuffer, Bitmap> kVarD = b0.d(eVar);
            iVar.c(ByteBuffer.class, Bitmap.class, kVarD);
            iVar.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.q.d.a(resources, kVarD));
        }
        this.g = new e(context, bVar, iVar, new com.bumptech.glide.r.j.f(), aVar, map, list, kVar, z, i);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f3044c) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f3044c = true;
        m(context, generatedAppGlideModule);
        f3044c = false;
    }

    public static c c(Context context) {
        if (f3043b == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (c.class) {
                if (f3043b == null) {
                    a(context, generatedAppGlideModuleD);
                }
            }
        }
        return f3043b;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            q(e2);
            return null;
        }
    }

    private static com.bumptech.glide.o.l l(Context context) {
        com.bumptech.glide.t.j.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new d(), generatedAppGlideModule);
    }

    private static void n(Context context, d dVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.p.b> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new com.bumptech.glide.p.d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<com.bumptech.glide.p.b> it = listEmptyList.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.p.b next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<com.bumptech.glide.p.b> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        dVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<com.bumptech.glide.p.b> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            it3.next().b(applicationContext, dVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, dVar);
        }
        c cVarA = dVar.a(applicationContext);
        for (com.bumptech.glide.p.b bVar : listEmptyList) {
            try {
                bVar.a(applicationContext, cVarA, cVarA.h);
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar.getClass().getName(), e2);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, cVarA, cVarA.h);
        }
        applicationContext.registerComponentCallbacks(cVarA);
        f3043b = cVarA;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k t(Context context) {
        return l(context).e(context);
    }

    public static k u(androidx.fragment.app.e eVar) {
        return l(eVar).f(eVar);
    }

    public void b() {
        com.bumptech.glide.t.k.a();
        this.f3047f.b();
        this.f3046e.b();
        this.i.b();
    }

    public com.bumptech.glide.load.o.a0.b e() {
        return this.i;
    }

    public com.bumptech.glide.load.o.a0.e f() {
        return this.f3046e;
    }

    com.bumptech.glide.o.d g() {
        return this.k;
    }

    public Context h() {
        return this.g.getBaseContext();
    }

    e i() {
        return this.g;
    }

    public i j() {
        return this.h;
    }

    public com.bumptech.glide.o.l k() {
        return this.j;
    }

    void o(k kVar) {
        synchronized (this.l) {
            if (this.l.contains(kVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.l.add(kVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        r(i);
    }

    boolean p(com.bumptech.glide.r.j.h<?> hVar) {
        synchronized (this.l) {
            Iterator<k> it = this.l.iterator();
            while (it.hasNext()) {
                if (it.next().A(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void r(int i) {
        com.bumptech.glide.t.k.a();
        Iterator<k> it = this.l.iterator();
        while (it.hasNext()) {
            it.next().onTrimMemory(i);
        }
        this.f3047f.a(i);
        this.f3046e.a(i);
        this.i.a(i);
    }

    void s(k kVar) {
        synchronized (this.l) {
            if (!this.l.contains(kVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.l.remove(kVar);
        }
    }
}
