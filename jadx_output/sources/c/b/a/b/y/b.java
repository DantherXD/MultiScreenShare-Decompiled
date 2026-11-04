package c.b.a.b.y;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f2818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f2819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f2820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f2821d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f2822e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int[] f2823f;
    private static final int[] g;
    private static final int[] h;
    private static final int[] i;
    private static final int[] j;
    private static final int[] k;
    static final String l;

    static {
        f2818a = Build.VERSION.SDK_INT >= 21;
        f2819b = new int[]{R.attr.state_pressed};
        f2820c = new int[]{R.attr.state_hovered, R.attr.state_focused};
        f2821d = new int[]{R.attr.state_focused};
        f2822e = new int[]{R.attr.state_hovered};
        f2823f = new int[]{R.attr.state_selected, R.attr.state_pressed};
        g = new int[]{R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
        h = new int[]{R.attr.state_selected, R.attr.state_focused};
        i = new int[]{R.attr.state_selected, R.attr.state_hovered};
        j = new int[]{R.attr.state_selected};
        k = new int[]{R.attr.state_enabled, R.attr.state_pressed};
        l = b.class.getSimpleName();
    }

    private b() {
    }

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22 && i2 <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(k, 0)) != 0) {
            Log.w(l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
