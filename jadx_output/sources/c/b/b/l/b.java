package c.b.b.l;

/* JADX INFO: loaded from: classes.dex */
public final class b extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f2917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final char[] f2918b = {'T', 'N', '*', 'E'};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char[] f2919c = {'/', ':', '+', '.'};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char f2920d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f2917a = cArr;
        f2920d = cArr[0];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:40:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x010a  */
    /* JADX WARN: Code duplicated, block: B:63:0x0113 A[LOOP:2: B:58:0x0105->B:63:0x0113, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x011d  */
    /* JADX WARN: Code duplicated, block: B:76:0x013b  */
    /* JADX WARN: Code duplicated, block: B:87:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x010e A[SYNTHETIC] */
    @Override // c.b.b.l.n
    public boolean[] c(String str) {
        StringBuilder sb;
        int i;
        int i2;
        boolean[] zArr;
        int i3;
        int i4;
        char upperCase;
        int i5;
        char[] cArr;
        int i6;
        int i7;
        int i8;
        boolean z;
        if (str.length() >= 2) {
            char upperCase2 = Character.toUpperCase(str.charAt(0));
            char upperCase3 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr2 = f2917a;
            boolean zA = a.a(cArr2, upperCase2);
            boolean zA2 = a.a(cArr2, upperCase3);
            char[] cArr3 = f2918b;
            boolean zA3 = a.a(cArr3, upperCase2);
            boolean zA4 = a.a(cArr3, upperCase3);
            if (zA) {
                if (!zA2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!zA3) {
                if (zA2 || zA4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                sb = new StringBuilder();
            } else if (!zA4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
            i = 20;
            for (i2 = 1; i2 < str.length() - 1; i2++) {
                if (!Character.isDigit(str.charAt(i2)) || str.charAt(i2) == '-' || str.charAt(i2) == '$') {
                    i += 9;
                } else {
                    if (!a.a(f2919c, str.charAt(i2))) {
                        throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i2) + '\'');
                    }
                    i += 10;
                }
            }
            zArr = new boolean[i + (str.length() - 1)];
            i4 = 0;
            for (i3 = 0; i3 < str.length(); i3++) {
                upperCase = Character.toUpperCase(str.charAt(i3));
                if (i3 != 0 || i3 == str.length() - 1) {
                    if (upperCase == '*') {
                        upperCase = 'C';
                    } else if (upperCase == 'E') {
                        upperCase = 'D';
                    } else if (upperCase == 'N') {
                        upperCase = 'B';
                    } else if (upperCase == 'T') {
                        upperCase = 'A';
                    }
                }
                i5 = 0;
                while (true) {
                    cArr = a.f2914a;
                    if (i5 < cArr.length) {
                        i6 = 0;
                        break;
                    }
                    if (upperCase == cArr[i5]) {
                        i6 = a.f2915b[i5];
                        break;
                    }
                    i5++;
                }
                i7 = 0;
                i8 = 0;
                z = true;
                while (i7 < 7) {
                    zArr[i4] = z;
                    i4++;
                    if (((i6 >> (6 - i7)) & 1) != 0 || i8 == 1) {
                        z = !z;
                        i7++;
                        i8 = 0;
                    } else {
                        i8++;
                    }
                }
                if (i3 < str.length() - 1) {
                    zArr[i4] = false;
                    i4++;
                }
            }
            return zArr;
        }
        sb = new StringBuilder();
        char c2 = f2920d;
        sb.append(c2);
        sb.append(str);
        sb.append(c2);
        str = sb.toString();
        i = 20;
        while (i2 < str.length() - 1) {
            if (Character.isDigit(str.charAt(i2))) {
                i += 9;
            } else {
                i += 9;
            }
        }
        zArr = new boolean[i + (str.length() - 1)];
        i4 = 0;
        while (i3 < str.length()) {
            upperCase = Character.toUpperCase(str.charAt(i3));
            if (i3 != 0) {
                if (upperCase == '*') {
                    upperCase = 'C';
                } else if (upperCase == 'E') {
                    upperCase = 'D';
                } else if (upperCase == 'N') {
                    upperCase = 'B';
                } else if (upperCase == 'T') {
                    upperCase = 'A';
                }
            } else if (upperCase == '*') {
                upperCase = 'C';
            } else if (upperCase == 'E') {
                upperCase = 'D';
            } else if (upperCase == 'N') {
                upperCase = 'B';
            } else if (upperCase == 'T') {
                upperCase = 'A';
            }
            i5 = 0;
            while (true) {
                cArr = a.f2914a;
                if (i5 < cArr.length) {
                    i6 = 0;
                    break;
                }
                if (upperCase == cArr[i5]) {
                    i6 = a.f2915b[i5];
                    break;
                }
                i5++;
            }
            i7 = 0;
            i8 = 0;
            z = true;
            while (i7 < 7) {
                zArr[i4] = z;
                i4++;
                if (((i6 >> (6 - i7)) & 1) != 0) {
                }
                z = !z;
                i7++;
                i8 = 0;
            }
            if (i3 < str.length() - 1) {
                zArr[i4] = false;
                i4++;
            }
        }
        return zArr;
    }
}
