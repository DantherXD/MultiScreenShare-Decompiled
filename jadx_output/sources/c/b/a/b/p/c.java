package c.b.a.b.p;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f2782a;

    static {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 21) {
            i = 2;
        } else {
            i = i2 >= 18 ? 1 : 0;
        }
        f2782a = i;
    }
}
