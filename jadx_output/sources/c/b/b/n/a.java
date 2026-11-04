package c.b.b.n;

import c.b.b.c;
import c.b.b.g;
import c.b.b.j.b;
import c.b.b.n.c.f;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    private static b b(f fVar, int i, int i2, int i3) {
        c.b.b.n.c.b bVarA = fVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iE = bVarA.e();
        int iD = bVarA.d();
        int i4 = i3 << 1;
        int i5 = iE + i4;
        int i6 = i4 + iD;
        int iMax = Math.max(i, i5);
        int iMax2 = Math.max(i2, i6);
        int iMin = Math.min(iMax / i5, iMax2 / i6);
        int i7 = (iMax - (iE * iMin)) / 2;
        int i8 = (iMax2 - (iD * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i9 = 0;
        while (i9 < iD) {
            int i10 = 0;
            int i11 = i7;
            while (i10 < iE) {
                if (bVarA.b(i10, i9) == 1) {
                    bVar.h(i11, i8, iMin, iMin);
                }
                i10++;
                i11 += iMin;
            }
            i9++;
            i8 += iMin;
        }
        return bVar;
    }

    @Override // c.b.b.g
    public b a(String str, c.b.b.a aVar, int i, int i2, Map<c, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != c.b.b.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i + 'x' + i2);
        }
        c.b.b.n.b.a aVarValueOf = c.b.b.n.b.a.L;
        int i3 = 4;
        if (map != null) {
            c cVar = c.ERROR_CORRECTION;
            if (map.containsKey(cVar)) {
                aVarValueOf = c.b.b.n.b.a.valueOf(map.get(cVar).toString());
            }
            c cVar2 = c.MARGIN;
            if (map.containsKey(cVar2)) {
                i3 = Integer.parseInt(map.get(cVar2).toString());
            }
        }
        return b(c.b.b.n.c.c.n(str, aVarValueOf, map), i, i2, i3);
    }
}
