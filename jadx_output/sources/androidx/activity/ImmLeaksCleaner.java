package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f1002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Field f1003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f1004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Activity f1005e;

    ImmLeaksCleaner(Activity activity) {
        this.f1005e = activity;
    }

    private static void h() {
        try {
            f1001a = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f1003c = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f1004d = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f1002b = declaredField3;
            declaredField3.setAccessible(true);
            f1001a = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        if (bVar != d.b.ON_DESTROY) {
            return;
        }
        if (f1001a == 0) {
            h();
        }
        if (f1001a == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f1005e.getSystemService("input_method");
            try {
                Object obj = f1002b.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f1003c.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f1004d.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused2) {
                    } catch (IllegalAccessException unused3) {
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
