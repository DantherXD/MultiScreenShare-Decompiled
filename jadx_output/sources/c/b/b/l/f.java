package c.b.b.l;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends n {
    private static void f(int i, int[] iArr) {
        for (int i2 = 0; i2 < 9; i2++) {
            int i3 = 1;
            if (((1 << (8 - i2)) & i) != 0) {
                i3 = 2;
            }
            iArr[i2] = i3;
        }
    }

    private static String g(String str) {
        String str2;
        int i;
        int i2;
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < length; i3++) {
            char cCharAt = str.charAt(i3);
            if (cCharAt != 0) {
                if (cCharAt != ' ') {
                    if (cCharAt == '@') {
                        str2 = "%V";
                    } else if (cCharAt == '`') {
                        str2 = "%W";
                    } else if (cCharAt != '-' && cCharAt != '.') {
                        if (cCharAt <= 26) {
                            sb.append('$');
                            i = cCharAt - 1;
                        } else if (cCharAt < ' ') {
                            sb.append('%');
                            i = cCharAt - 27;
                        } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                            sb.append('/');
                            i = cCharAt - '!';
                        } else {
                            if (cCharAt <= '9') {
                                i2 = (cCharAt - '0') + 48;
                            } else if (cCharAt <= '?') {
                                sb.append('%');
                                i2 = (cCharAt - ';') + 70;
                            } else if (cCharAt <= 'Z') {
                                i = cCharAt - 'A';
                            } else if (cCharAt <= '_') {
                                sb.append('%');
                                i2 = (cCharAt - '[') + 75;
                            } else if (cCharAt <= 'z') {
                                sb.append('+');
                                i = cCharAt - 'a';
                            } else {
                                if (cCharAt > 127) {
                                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i3) + "'");
                                }
                                sb.append('%');
                                i2 = (cCharAt - '{') + 80;
                            }
                            cCharAt = (char) i2;
                        }
                        i2 = i + 65;
                        cCharAt = (char) i2;
                    }
                }
                sb.append(cCharAt);
            } else {
                str2 = "%U";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    @Override // c.b.b.l.n, c.b.b.g
    public c.b.b.j.b a(String str, c.b.b.a aVar, int i, int i2, Map<c.b.b.c, ?> map) {
        if (aVar == c.b.b.a.CODE_39) {
            return super.a(str, aVar, i, i2, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    @Override // c.b.b.l.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i = 0; i < length; i++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i)) < 0) {
                str = g(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
            }
        }
        int[] iArr = new int[9];
        int i2 = length + 25;
        for (int i3 = 0; i3 < length; i3++) {
            f(e.f2927a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i3))], iArr);
            for (int i4 = 0; i4 < 9; i4++) {
                i2 += iArr[i4];
            }
        }
        boolean[] zArr = new boolean[i2];
        f(148, iArr);
        int iB = n.b(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iB2 = iB + n.b(zArr, iB, iArr2, false);
        for (int i5 = 0; i5 < length; i5++) {
            f(e.f2927a["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i5))], iArr);
            int iB3 = iB2 + n.b(zArr, iB2, iArr, true);
            iB2 = iB3 + n.b(zArr, iB3, iArr2, false);
        }
        f(148, iArr);
        n.b(zArr, iB2, iArr, true);
        return zArr;
    }
}
