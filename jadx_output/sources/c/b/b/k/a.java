package c.b.b.k;

import c.b.b.c;
import c.b.b.g;
import c.b.b.j.b;
import c.b.b.k.b.e;
import c.b.b.k.b.i;
import c.b.b.k.b.j;
import c.b.b.k.b.k;
import c.b.b.k.b.l;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    private static b b(c.b.b.n.c.b bVar, int i, int i2) {
        b bVar2;
        int iE = bVar.e();
        int iD = bVar.d();
        int iMax = Math.max(i, iE);
        int iMax2 = Math.max(i2, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i3 = (iMax - (iE * iMin)) / 2;
        int i4 = (iMax2 - (iD * iMin)) / 2;
        if (i2 < iD || i < iE) {
            bVar2 = new b(iE, iD);
            i3 = 0;
            i4 = 0;
        } else {
            bVar2 = new b(i, i2);
        }
        bVar2.b();
        int i5 = 0;
        while (i5 < iD) {
            int i6 = i3;
            int i7 = 0;
            while (i7 < iE) {
                if (bVar.b(i7, i5) == 1) {
                    bVar2.h(i6, i4, iMin, iMin);
                }
                i7++;
                i6 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return bVar2;
    }

    private static b c(e eVar, k kVar, int i, int i2) {
        int iH = kVar.h();
        int iG = kVar.g();
        c.b.b.n.c.b bVar = new c.b.b.n.c.b(kVar.j(), kVar.i());
        int i3 = 0;
        for (int i4 = 0; i4 < iG; i4++) {
            if (i4 % kVar.g == 0) {
                int i5 = 0;
                for (int i6 = 0; i6 < kVar.j(); i6++) {
                    bVar.g(i5, i3, i6 % 2 == 0);
                    i5++;
                }
                i3++;
            }
            int i7 = 0;
            for (int i8 = 0; i8 < iH; i8++) {
                if (i8 % kVar.f2909f == 0) {
                    bVar.g(i7, i3, true);
                    i7++;
                }
                bVar.g(i7, i3, eVar.e(i8, i4));
                i7++;
                int i9 = kVar.f2909f;
                if (i8 % i9 == i9 - 1) {
                    bVar.g(i7, i3, i4 % 2 == 0);
                    i7++;
                }
            }
            i3++;
            int i10 = kVar.g;
            if (i4 % i10 == i10 - 1) {
                int i11 = 0;
                for (int i12 = 0; i12 < kVar.j(); i12++) {
                    bVar.g(i11, i3, true);
                    i11++;
                }
                i3++;
            }
        }
        return b(bVar, i, i2);
    }

    @Override // c.b.b.g
    public b a(String str, c.b.b.a aVar, int i, int i2, Map<c, ?> map) {
        c.b.b.b bVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != c.b.b.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        }
        if (i < 0 || i2 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i + 'x' + i2);
        }
        l lVar = l.FORCE_NONE;
        c.b.b.b bVar2 = null;
        if (map != null) {
            l lVar2 = (l) map.get(c.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            c.b.b.b bVar3 = (c.b.b.b) map.get(c.MIN_SIZE);
            if (bVar3 == null) {
                bVar3 = null;
            }
            bVar = (c.b.b.b) map.get(c.MAX_SIZE);
            if (bVar == null) {
                bVar = null;
            }
            bVar2 = bVar3;
        } else {
            bVar = null;
        }
        String strB = j.b(str, lVar, bVar2, bVar);
        k kVarL = k.l(strB.length(), lVar, bVar2, bVar, true);
        e eVar = new e(i.c(strB, kVarL), kVarL.h(), kVarL.g());
        eVar.h();
        return c(eVar, kVarL, i, i2);
    }
}
