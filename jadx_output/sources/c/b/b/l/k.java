package c.b.b.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k extends q {
    @Override // c.b.b.l.n, c.b.b.g
    public c.b.b.j.b a(String str, c.b.b.a aVar, int i, int i2, Map<c.b.b.c, ?> map) {
        if (aVar == c.b.b.a.EAN_8) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c.b.b.l.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (c.b.b.d e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (c.b.b.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iB = n.b(zArr, 0, p.f2936a, true) + 0;
        for (int i = 0; i <= 3; i++) {
            iB += n.b(zArr, iB, p.f2939d[Character.digit(str.charAt(i), 10)], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.f2937b, false);
        for (int i2 = 4; i2 <= 7; i2++) {
            iB2 += n.b(zArr, iB2, p.f2939d[Character.digit(str.charAt(i2), 10)], true);
        }
        n.b(zArr, iB2, p.f2936a, true);
        return zArr;
    }
}
