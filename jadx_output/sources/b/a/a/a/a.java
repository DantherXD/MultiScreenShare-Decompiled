package b.a.a.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import c.b.b.c;
import c.b.b.e;
import c.b.b.j.b;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<c, Object> f2415a;

    static {
        EnumMap enumMap = new EnumMap(c.class);
        f2415a = enumMap;
        enumMap.put(c.CHARACTER_SET, "utf-8");
        enumMap.put(c.ERROR_CORRECTION, c.b.b.n.b.a.H);
        enumMap.put(c.MARGIN, 0);
    }

    private static Bitmap a(Bitmap bitmap, Bitmap bitmap2) {
        if (bitmap == null || bitmap2 == null) {
            return bitmap;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int width2 = bitmap2.getWidth();
        int height2 = bitmap2.getHeight();
        float f2 = ((width * 1.0f) / 5.0f) / width2;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            canvas.scale(f2, f2, width / 2, height / 2);
            canvas.drawBitmap(bitmap2, (width - width2) / 2, (height - height2) / 2, (Paint) null);
            canvas.save();
            canvas.restore();
            return bitmapCreateBitmap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap b(String str, int i, int i2, int i3, Bitmap bitmap) {
        try {
            b bVarA = new e().a(str, c.b.b.a.QR_CODE, i, i, f2415a);
            int[] iArr = new int[i * i];
            for (int i4 = 0; i4 < i; i4++) {
                for (int i5 = 0; i5 < i; i5++) {
                    if (bVarA.d(i5, i4)) {
                        iArr[(i4 * i) + i5] = i2;
                    } else {
                        iArr[(i4 * i) + i5] = i3;
                    }
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i);
            return a(bitmapCreateBitmap, bitmap);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Bitmap c(String str, int i, int i2, Bitmap bitmap) {
        return b(str, i, i2, -1, bitmap);
    }
}
