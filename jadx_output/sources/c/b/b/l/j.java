package c.b.b.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class j extends q {
    @Override // c.b.b.l.n, c.b.b.g
    public c.b.b.j.b a(String str, c.b.b.a aVar, int i, int i2, Map<c.b.b.c, ?> map) {
        if (aVar == c.b.b.a.EAN_13) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c.b.b.l.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + p.b(str);
            } catch (c.b.b.d e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (c.b.b.d unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i = i.f2931f[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = n.b(zArr, 0, p.f2936a, true) + 0;
        for (int i2 = 1; i2 <= 6; i2++) {
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (((i >> (6 - i2)) & 1) == 1) {
                iDigit += 10;
            }
            iB += n.b(zArr, iB, p.f2940e[iDigit], false);
        }
        int iB2 = iB + n.b(zArr, iB, p.f2937b, false);
        for (int i3 = 7; i3 <= 12; i3++) {
            iB2 += n.b(zArr, iB2, p.f2939d[Character.digit(str.charAt(i3), 10)], true);
        }
        n.b(zArr, iB2, p.f2936a, true);
        return zArr;
    }
}
