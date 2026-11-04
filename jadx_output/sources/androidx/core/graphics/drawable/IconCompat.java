package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final PorterDuff.Mode f1742a = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f1744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f1745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Parcelable f1746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1747f;
    public int g;
    public ColorStateList h;
    PorterDuff.Mode i;
    public String j;
    public String k;

    public IconCompat() {
        this.f1743b = -1;
        this.f1745d = null;
        this.f1746e = null;
        this.f1747f = 0;
        this.g = 0;
        this.h = null;
        this.i = f1742a;
        this.j = null;
    }

    private IconCompat(int i) {
        this.f1743b = -1;
        this.f1745d = null;
        this.f1746e = null;
        this.f1747f = 0;
        this.g = 0;
        this.h = null;
        this.i = f1742a;
        this.j = null;
        this.f1743b = i;
    }

    static Bitmap a(Bitmap bitmap, boolean z) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f2 = iMin;
        float f3 = 0.5f * f2;
        float f4 = 0.9166667f * f3;
        if (z) {
            float f5 = 0.010416667f * f2;
            paint.setColor(0);
            paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f3, f3, f4, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(-16777216);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2, (-(bitmap.getHeight() - iMin)) / 2);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f3, f3, f4, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat b(Resources resources, String str, int i) {
        if (str == null) {
            throw new IllegalArgumentException("Package must not be null.");
        }
        if (i == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f1747f = i;
        if (resources != null) {
            try {
                iconCompat.f1744c = resources.getResourceName(i);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f1744c = str;
        }
        iconCompat.k = str;
        return iconCompat;
    }

    private static int d(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResId();
        }
        try {
            return ((Integer) icon.getClass().getMethod("getResId", new Class[0]).invoke(icon, new Object[0])).intValue();
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon resource", e2);
            return 0;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon resource", e3);
            return 0;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon resource", e4);
            return 0;
        }
    }

    private static String f(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getResPackage();
        }
        try {
            return (String) icon.getClass().getMethod("getResPackage", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon package", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon package", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon package", e4);
            return null;
        }
    }

    private static Uri h(Icon icon) {
        if (Build.VERSION.SDK_INT >= 28) {
            return icon.getUri();
        }
        try {
            return (Uri) icon.getClass().getMethod("getUri", new Class[0]).invoke(icon, new Object[0]);
        } catch (IllegalAccessException e2) {
            Log.e("IconCompat", "Unable to get icon uri", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            Log.e("IconCompat", "Unable to get icon uri", e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("IconCompat", "Unable to get icon uri", e4);
            return null;
        }
    }

    private static String n(int i) {
        switch (i) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public int c() {
        int i = this.f1743b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return d((Icon) this.f1744c);
        }
        if (i == 2) {
            return this.f1747f;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String e() {
        int i = this.f1743b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return f((Icon) this.f1744c);
        }
        if (i == 2) {
            return TextUtils.isEmpty(this.k) ? ((String) this.f1744c).split(":", -1)[0] : this.k;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public Uri g() {
        int i = this.f1743b;
        if (i == -1 && Build.VERSION.SDK_INT >= 23) {
            return h((Icon) this.f1744c);
        }
        if (i == 4 || i == 6) {
            return Uri.parse((String) this.f1744c);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream i(Context context) {
        StringBuilder sb;
        String str;
        Uri uriG = g();
        String scheme = uriG.getScheme();
        if ("content".equals(scheme) || "file".equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriG);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f1744c));
            } catch (FileNotFoundException e3) {
                e = e3;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriG);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void j() {
        Parcelable parcelable;
        this.i = PorterDuff.Mode.valueOf(this.j);
        switch (this.f1743b) {
            case -1:
                parcelable = this.f1746e;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f1746e;
                if (parcelable == null) {
                    byte[] bArr = this.f1745d;
                    this.f1744c = bArr;
                    this.f1743b = 3;
                    this.f1747f = 0;
                    this.g = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f1745d, Charset.forName("UTF-16"));
                this.f1744c = str;
                if (this.f1743b == 2 && this.k == null) {
                    this.k = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f1744c = this.f1745d;
                return;
        }
        this.f1744c = parcelable;
    }

    public void k(boolean z) {
        this.j = this.i.name();
        switch (this.f1743b) {
            case -1:
                if (z) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z) {
                    Bitmap bitmap = (Bitmap) this.f1744c;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f1745d = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f1745d = ((String) this.f1744c).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f1745d = (byte[]) this.f1744c;
                return;
            case 4:
            case 6:
                this.f1745d = this.f1744c.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f1746e = (Parcelable) this.f1744c;
    }

    @Deprecated
    public Icon l() {
        return m(null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    public Icon m(Context context) {
        Bitmap bitmapA;
        Icon iconCreateWithResource;
        Bitmap bitmapDecodeStream;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        switch (this.f1743b) {
            case -1:
                return (Icon) this.f1744c;
            case 0:
            default:
                throw new IllegalArgumentException("Unknown type");
            case 1:
                bitmapA = (Bitmap) this.f1744c;
                iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                colorStateList = this.h;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.i;
                if (mode != f1742a) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 2:
                iconCreateWithResource = Icon.createWithResource(e(), this.f1747f);
                colorStateList = this.h;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.i;
                if (mode != f1742a) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 3:
                iconCreateWithResource = Icon.createWithData((byte[]) this.f1744c, this.f1747f, this.g);
                colorStateList = this.h;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.i;
                if (mode != f1742a) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 4:
                iconCreateWithResource = Icon.createWithContentUri((String) this.f1744c);
                colorStateList = this.h;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.i;
                if (mode != f1742a) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 5:
                if (Build.VERSION.SDK_INT >= 26) {
                    bitmapDecodeStream = (Bitmap) this.f1744c;
                    iconCreateWithResource = Icon.createWithAdaptiveBitmap(bitmapDecodeStream);
                    colorStateList = this.h;
                    if (colorStateList != null) {
                        iconCreateWithResource.setTintList(colorStateList);
                    }
                    mode = this.i;
                    if (mode != f1742a) {
                        iconCreateWithResource.setTintMode(mode);
                    }
                    return iconCreateWithResource;
                }
                bitmapDecodeStream = (Bitmap) this.f1744c;
                bitmapA = a(bitmapDecodeStream, false);
                iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                colorStateList = this.h;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.i;
                if (mode != f1742a) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
            case 6:
                int i = Build.VERSION.SDK_INT;
                if (i >= 30) {
                    iconCreateWithResource = Icon.createWithAdaptiveBitmapContentUri(g());
                } else {
                    if (context == null) {
                        throw new IllegalArgumentException("Context is required to resolve the file uri of the icon: " + g());
                    }
                    InputStream inputStreamI = i(context);
                    if (inputStreamI == null) {
                        throw new IllegalStateException("Cannot load adaptive icon from uri: " + g());
                    }
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamI);
                    if (i >= 26) {
                        iconCreateWithResource = Icon.createWithAdaptiveBitmap(bitmapDecodeStream);
                    } else {
                        bitmapA = a(bitmapDecodeStream, false);
                        iconCreateWithResource = Icon.createWithBitmap(bitmapA);
                    }
                }
                colorStateList = this.h;
                if (colorStateList != null) {
                    iconCreateWithResource.setTintList(colorStateList);
                }
                mode = this.i;
                if (mode != f1742a) {
                    iconCreateWithResource.setTintMode(mode);
                }
                return iconCreateWithResource;
        }
    }

    public String toString() {
        int height;
        if (this.f1743b == -1) {
            return String.valueOf(this.f1744c);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(n(this.f1743b));
        switch (this.f1743b) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1744c).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f1744c).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(c())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1747f);
                if (this.g != 0) {
                    sb.append(" off=");
                    height = this.g;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1744c);
                break;
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != f1742a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }
}
