package a.g.d.f;

import a.g.k.h;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    public static abstract class a {

        /* JADX INFO: renamed from: a.g.d.f.f$a$a, reason: collision with other inner class name */
        class RunnableC0010a implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Typeface f469b;

            RunnableC0010a(Typeface typeface) {
                this.f469b = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.e(this.f469b);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f471b;

            b(int i) {
                this.f471b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.d(this.f471b);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i, Handler handler) {
            c(handler).post(new b(i));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new RunnableC0010a(typeface));
        }

        public abstract void d(int i);

        public abstract void e(Typeface typeface);
    }

    public static final class b {

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final Object f473a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private static Method f474b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static boolean f475c;

            /* JADX WARN: Code duplicated, block: B:26:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            static void a(Resources.Theme theme) {
                Method method;
                synchronized (f473a) {
                    if (f475c) {
                        method = f474b;
                        if (method != null) {
                            method.invoke(theme, new Object[0]);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f474b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e2) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                        }
                        f475c = true;
                        method = f474b;
                        if (method != null) {
                            try {
                                method.invoke(theme, new Object[0]);
                            } catch (IllegalAccessException | InvocationTargetException e3) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                f474b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: a.g.d.f.f$b$b, reason: collision with other inner class name */
        static class C0011b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                C0011b.a(theme);
            } else if (i >= 23) {
                a.a(theme);
            }
        }
    }

    public static Typeface a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, new TypedValue(), 0, null, null, false, true);
    }

    public static Drawable b(Resources resources, int i, Resources.Theme theme) {
        return Build.VERSION.SDK_INT >= 21 ? resources.getDrawable(i, theme) : resources.getDrawable(i);
    }

    public static Typeface c(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface d(Context context, int i, TypedValue typedValue, int i2, a aVar) {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i, typedValue, i2, aVar, null, true, false);
    }

    public static void e(Context context, int i, a aVar, Handler handler) {
        h.e(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            f(context, i, new TypedValue(), 0, aVar, handler, false, false);
        }
    }

    private static Typeface f(Context context, int i, TypedValue typedValue, int i2, a aVar, Handler handler, boolean z, boolean z2) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        Typeface typefaceG = g(context, resources, typedValue, i, i2, aVar, handler, z, z2);
        if (typefaceG != null || aVar != null || z2) {
            return typefaceG;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    private static Typeface g(Context context, Resources resources, TypedValue typedValue, int i, int i2, a aVar, Handler handler, boolean z, boolean z2) {
        StringBuilder sb;
        String str;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        }
        Typeface typefaceF = a.g.e.d.f(resources, i, i2);
        if (typefaceF != null) {
            if (aVar != null) {
                aVar.b(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z2) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceD = a.g.e.d.d(context, resources, i, string, i2);
                if (aVar != null) {
                    if (typefaceD != null) {
                        aVar.b(typefaceD, handler);
                    } else {
                        aVar.a(-3, handler);
                    }
                }
                return typefaceD;
            }
            c.a aVarB = c.b(resources.getXml(i), resources);
            if (aVarB != null) {
                return a.g.e.d.c(context, aVarB, resources, i, i2, aVar, handler, z);
            }
            Log.e("ResourcesCompat", "Failed to find font-family tag");
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = new StringBuilder();
            str = "Failed to read xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        } catch (XmlPullParserException e3) {
            e = e3;
            sb = new StringBuilder();
            str = "Failed to parse xml resource ";
            sb.append(str);
            sb.append(string);
            Log.e("ResourcesCompat", sb.toString(), e);
            if (aVar != null) {
                aVar.a(-3, handler);
            }
            return null;
        }
    }
}
