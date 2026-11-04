package c.b.b.i;

import c.b.b.g;
import c.b.b.i.b.c;
import c.b.b.j.b;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a implements g {
    private static b b(String str, c.b.b.a aVar, int i, int i2, Charset charset, int i3, int i4) {
        if (aVar == c.b.b.a.AZTEC) {
            return c(c.d(str.getBytes(charset), i3, i4), i, i2);
        }
        throw new IllegalArgumentException("Can only encode AZTEC, but got ".concat(String.valueOf(aVar)));
    }

    private static b c(c.b.b.i.b.a aVar, int i, int i2) {
        b bVarA = aVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iF = bVarA.f();
        int iE = bVarA.e();
        int iMax = Math.max(i, iF);
        int iMax2 = Math.max(i2, iE);
        int iMin = Math.min(iMax / iF, iMax2 / iE);
        int i3 = (iMax - (iF * iMin)) / 2;
        int i4 = (iMax2 - (iE * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i5 = 0;
        while (i5 < iE) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < iF) {
                if (bVarA.d(i6, i5)) {
                    bVar.h(i7, i4, iMin, iMin);
                }
                i6++;
                i7 += iMin;
            }
            i5++;
            i4 += iMin;
        }
        return bVar;
    }

    @Override // c.b.b.g
    public b a(String str, c.b.b.a aVar, int i, int i2, Map<c.b.b.c, ?> map) {
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i3 = 33;
        int i4 = 0;
        if (map != null) {
            c.b.b.c cVar = c.b.b.c.CHARACTER_SET;
            if (map.containsKey(cVar)) {
                charsetForName = Charset.forName(map.get(cVar).toString());
            }
            c.b.b.c cVar2 = c.b.b.c.ERROR_CORRECTION;
            i3 = map.containsKey(cVar2) ? Integer.parseInt(map.get(cVar2).toString()) : 33;
            c.b.b.c cVar3 = c.b.b.c.AZTEC_LAYERS;
            if (map.containsKey(cVar3)) {
                i4 = Integer.parseInt(map.get(cVar3).toString());
            }
        }
        return b(str, aVar, i, i2, charsetForName, i3, i4);
    }
}
