package c.b.b.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements c.b.b.g {
    protected static int b(boolean[] zArr, int i, int[] iArr, boolean z) {
        int i2 = 0;
        for (int i3 : iArr) {
            int i4 = 0;
            while (i4 < i3) {
                zArr[i] = z;
                i4++;
                i++;
            }
            i2 += i3;
            z = !z;
        }
        return i2;
    }

    private static c.b.b.j.b e(boolean[] zArr, int i, int i2, int i3) {
        int length = zArr.length;
        int i4 = i3 + length;
        int iMax = Math.max(i, i4);
        int iMax2 = Math.max(1, i2);
        int i5 = iMax / i4;
        int i6 = (iMax - (length * i5)) / 2;
        c.b.b.j.b bVar = new c.b.b.j.b(iMax, iMax2);
        int i7 = 0;
        while (i7 < length) {
            if (zArr[i7]) {
                bVar.h(i6, 0, i5, iMax2);
            }
            i7++;
            i6 += i5;
        }
        return bVar;
    }

    @Override // c.b.b.g
    public c.b.b.j.b a(String str, c.b.b.a aVar, int i, int i2, Map<c.b.b.c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i + 'x' + i2);
        }
        int iD = d();
        if (map != null) {
            c.b.b.c cVar = c.b.b.c.MARGIN;
            if (map.containsKey(cVar)) {
                iD = Integer.parseInt(map.get(cVar).toString());
            }
        }
        return e(c(str), i, i2, iD);
    }

    public abstract boolean[] c(String str);

    public int d() {
        return 10;
    }
}
