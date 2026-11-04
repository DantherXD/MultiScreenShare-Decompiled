package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class u0 extends ContextWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f1499a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ArrayList<WeakReference<u0>> f1500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Resources f1501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Resources.Theme f1502d;

    private u0(Context context) {
        super(context);
        if (!c1.b()) {
            this.f1501c = new w0(this, context.getResources());
            this.f1502d = null;
            return;
        }
        c1 c1Var = new c1(this, context.getResources());
        this.f1501c = c1Var;
        Resources.Theme themeNewTheme = c1Var.newTheme();
        this.f1502d = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    private static boolean a(Context context) {
        if ((context instanceof u0) || (context.getResources() instanceof w0) || (context.getResources() instanceof c1)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || c1.b();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f1499a) {
            ArrayList<WeakReference<u0>> arrayList = f1500b;
            if (arrayList == null) {
                f1500b = new ArrayList<>();
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    WeakReference<u0> weakReference = f1500b.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        f1500b.remove(size);
                    }
                }
                for (int size2 = f1500b.size() - 1; size2 >= 0; size2--) {
                    WeakReference<u0> weakReference2 = f1500b.get(size2);
                    u0 u0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            u0 u0Var2 = new u0(context);
            f1500b.add(new WeakReference<>(u0Var2));
            return u0Var2;
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1501c.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1501c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1502d;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1502d;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
