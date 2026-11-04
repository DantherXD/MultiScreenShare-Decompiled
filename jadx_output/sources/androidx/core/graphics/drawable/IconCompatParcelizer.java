package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f1743b = aVar.p(iconCompat.f1743b, 1);
        iconCompat.f1745d = aVar.j(iconCompat.f1745d, 2);
        iconCompat.f1746e = aVar.r(iconCompat.f1746e, 3);
        iconCompat.f1747f = aVar.p(iconCompat.f1747f, 4);
        iconCompat.g = aVar.p(iconCompat.g, 5);
        iconCompat.h = (ColorStateList) aVar.r(iconCompat.h, 6);
        iconCompat.j = aVar.t(iconCompat.j, 7);
        iconCompat.k = aVar.t(iconCompat.k, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i = iconCompat.f1743b;
        if (-1 != i) {
            aVar.F(i, 1);
        }
        byte[] bArr = iconCompat.f1745d;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f1746e;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i2 = iconCompat.f1747f;
        if (i2 != 0) {
            aVar.F(i2, 4);
        }
        int i3 = iconCompat.g;
        if (i3 != 0) {
            aVar.F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.h;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.j;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.k;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
