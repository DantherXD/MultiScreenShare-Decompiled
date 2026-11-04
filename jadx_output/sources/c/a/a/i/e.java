package c.a.a.i;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<char[]> f2447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final int[] f2448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f2449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final int[] f2450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean[] f2451f;
    public static final boolean[] g;
    public boolean A;
    protected long B;
    protected int h;
    protected int i;
    public int j;
    protected char k;
    protected int l;
    protected int m;
    protected char[] n;
    protected int o;
    protected boolean p;
    protected boolean q;
    protected int r;
    protected boolean s;
    public TimeZone t;
    public Locale u;
    public Calendar v;
    public int w;
    protected final String x;
    protected final int y;
    protected String z;

    static {
        int i;
        char c2;
        char c3;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
            while (true) {
                boolean[] zArr = f2451f;
                if (c3 >= zArr.length) {
                    break;
                }
                if (c3 >= 'A' && c3 <= 'Z') {
                    zArr[c3] = true;
                } else if (c3 >= 'a' && c3 <= 'z') {
                    zArr[c3] = true;
                } else if (c3 == '_') {
                    zArr[c3] = true;
                }
                c3 = (char) (c3 + 1);
            }
            while (true) {
                boolean[] zArr2 = g;
                if (c2 >= zArr2.length) {
                    return;
                }
                if (c2 >= 'A' && c2 <= 'Z') {
                    zArr2[c2] = true;
                } else if (c2 >= 'a' && c2 <= 'z') {
                    zArr2[c2] = true;
                } else if (c2 == '_') {
                    zArr2[c2] = true;
                } else if (c2 >= '0' && c2 <= '9') {
                    zArr2[c2] = true;
                }
                c2 = (char) (c2 + 1);
            }
        } catch (Exception unused) {
            i = -1;
        }
        c2 = 0;
        f2446a = i >= 23;
        f2447b = new ThreadLocal<>();
        f2448c = new int[103];
        for (int i2 = 48; i2 <= 57; i2++) {
            f2448c[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            f2448c[i3] = (i3 - 97) + 10;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            f2448c[i4] = (i4 - 65) + 10;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f2449d = charArray;
        int[] iArr = new int[256];
        f2450e = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            f2450e[f2449d[i5]] = i5;
        }
        f2450e[61] = 0;
        f2451f = new boolean[256];
        c3 = 0;
        g = new boolean[256];
    }

    public e(String str) {
        this(str, c.a.a.a.f2418d);
    }

    public e(String str, int i) {
        this.j = c.a.a.a.f2418d;
        this.p = false;
        this.q = false;
        this.t = c.a.a.a.f2416b;
        this.u = c.a.a.a.f2417c;
        this.v = null;
        this.w = 0;
        char[] cArr = f2447b.get();
        this.n = cArr;
        if (cArr == null) {
            this.n = new char[512];
        }
        this.j = i;
        this.x = str;
        int length = str.length();
        this.y = length;
        this.l = -1;
        int i2 = (-1) + 1;
        this.l = i2;
        char cCharAt = i2 >= length ? (char) 26 : str.charAt(i2);
        this.k = cCharAt;
        if (cCharAt == 65279) {
            q();
        }
        this.z = (d.InitStringFieldAsEmpty.u & i) != 0 ? "" : null;
        this.A = (d.DisableCircularReferenceDetect.u & i) != 0;
    }

    private void N() {
        int i;
        this.r = this.l - 1;
        this.s = false;
        do {
            this.o++;
            q();
        } while (Character.isLetterOrDigit(this.k));
        String strB0 = b0();
        if (strB0.equals("null")) {
            i = 8;
        } else if (strB0.equals("true")) {
            i = 6;
        } else if (strB0.equals("false")) {
            i = 7;
        } else if (strB0.equals("new")) {
            i = 9;
        } else if (strB0.equals("undefined")) {
            i = 23;
        } else if (strB0.equals("Set")) {
            i = 21;
        } else {
            i = strB0.equals("TreeSet") ? 22 : 18;
        }
        this.h = i;
    }

    private void W(char c2, char c3, char c4, char c5, char c6, char c7, char c8, char c9) {
        Calendar calendar = Calendar.getInstance(this.t, this.u);
        this.v = calendar;
        calendar.set(1, ((c2 - '0') * 1000) + ((c3 - '0') * 100) + ((c4 - '0') * 10) + (c5 - '0'));
        this.v.set(2, (((c6 - '0') * 10) + (c7 - '0')) - 1);
        this.v.set(5, ((c8 - '0') * 10) + (c9 - '0'));
    }

    static boolean c(char c2, char c3, char c4, char c5, char c6, char c7, int i, int i2) {
        if (c2 >= '1' && c2 <= '3' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9' && c5 >= '0' && c5 <= '9') {
            if (c6 == '0') {
                if (c7 < '1' || c7 > '9') {
                    return false;
                }
            } else if (c6 != '1' || (c7 != '0' && c7 != '1' && c7 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            }
            if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            }
            if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    private final String c0(int i, int i2) {
        char[] cArr = this.n;
        if (i2 < cArr.length) {
            this.x.getChars(i, i + i2, cArr, 0);
            return new String(this.n, 0, i2);
        }
        char[] cArr2 = new char[i2];
        this.x.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    static boolean d(char c2, char c3, char c4, char c5, char c6, char c7) {
        if (c2 == '0') {
            if (c3 < '0' || c3 > '9') {
                return false;
            }
        } else {
            if (c2 != '1') {
                if (c2 == '2' && c3 >= '0' && c3 <= '4') {
                }
                return false;
            }
            if (c3 < '0' || c3 > '9') {
                return false;
            }
        }
        if (c4 < '0' || c4 > '5') {
            if (c4 != '6' || c5 != '0') {
                return false;
            }
        } else if (c5 < '0' || c5 > '9') {
            return false;
        }
        if (c6 < '0' || c6 > '5') {
            return c6 == '6' && c7 == '0';
        }
        return c7 >= '0' && c7 <= '9';
    }

    public static final byte[] h(String str, int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        if (i2 == 0) {
            return new byte[0];
        }
        int i6 = (i + i2) - 1;
        while (i < i6 && f2450e[str.charAt(i)] < 0) {
            i++;
        }
        while (i6 > 0 && f2450e[str.charAt(i6)] < 0) {
            i6--;
        }
        if (str.charAt(i6) == '=') {
            i3 = str.charAt(i6 + (-1)) == '=' ? 2 : 1;
        } else {
            i3 = 0;
        }
        int i7 = (i6 - i) + 1;
        if (i2 > 76) {
            i4 = (str.charAt(76) == '\r' ? i7 / 78 : 0) << 1;
        } else {
            i4 = 0;
        }
        int i8 = (((i7 - i4) * 6) >> 3) - i3;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int[] iArr = f2450e;
            int i12 = i + 1;
            int i13 = i12 + 1;
            int i14 = (iArr[str.charAt(i)] << 18) | (iArr[str.charAt(i12)] << 12);
            int i15 = i13 + 1;
            int i16 = i14 | (iArr[str.charAt(i13)] << 6);
            int i17 = i15 + 1;
            int i18 = i16 | iArr[str.charAt(i15)];
            int i19 = i10 + 1;
            bArr[i10] = (byte) (i18 >> 16);
            int i20 = i19 + 1;
            bArr[i19] = (byte) (i18 >> 8);
            int i21 = i20 + 1;
            bArr[i20] = (byte) i18;
            if (i4 > 0 && (i11 = i11 + 1) == 19) {
                i17 += 2;
                i11 = 0;
            }
            i = i17;
            i10 = i21;
        }
        if (i10 < i8) {
            int i22 = 0;
            while (i <= i6 - i3) {
                i5 |= f2450e[str.charAt(i)] << (18 - (i22 * 6));
                i22++;
                i++;
            }
            int i23 = 16;
            while (i10 < i8) {
                bArr[i10] = (byte) (i5 >> i23);
                i23 -= 8;
                i10++;
            }
        }
        return bArr;
    }

    private int p(long j) {
        char cCharAt = this.k;
        int i = 1;
        while (cCharAt != '\"' && cCharAt != '\'') {
            if (cCharAt != ' ' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t' && cCharAt != '\f' && cCharAt != '\b') {
                this.B = 0L;
                this.w = -2;
                return 0;
            }
            int i2 = i + 1;
            int i3 = this.l + i;
            cCharAt = i3 >= this.y ? (char) 26 : this.x.charAt(i3);
            i = i2;
        }
        long j2 = -3750763034362895579L;
        for (int i4 = this.l + i; i4 < this.y; i4++) {
            char cCharAt2 = this.x.charAt(i4);
            if (cCharAt2 == cCharAt) {
                i += (i4 - this.l) - i;
                break;
            }
            j2 = 1099511628211L * (((long) cCharAt2) ^ j2);
        }
        if (j2 != j) {
            this.B = j2;
            this.w = -2;
            return 0;
        }
        int i5 = i + 1;
        int i6 = this.l + i5;
        char cCharAt3 = i6 >= this.y ? (char) 26 : this.x.charAt(i6);
        while (cCharAt3 != ':') {
            if (cCharAt3 > ' ' || !(cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                throw new c.a.a.d("match feild error expect ':'");
            }
            int i7 = i5 + 1;
            int i8 = this.l + i5;
            cCharAt3 = i8 >= this.y ? (char) 26 : this.x.charAt(i8);
            i5 = i7;
        }
        return i5 + 1;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00e8  */
    private static String w(char[] cArr, int i) {
        int i2;
        char[] cArr2 = new char[i];
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            char c2 = cArr[i3];
            if (c2 != '\\') {
                cArr2[i4] = c2;
                i4++;
            } else {
                i3++;
                char c3 = cArr[i3];
                if (c3 == '\"') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\"';
                } else if (c3 == '\'') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\'';
                } else if (c3 == 'F') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\f';
                } else if (c3 == '\\') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\\';
                } else if (c3 == 'b') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\b';
                } else if (c3 == 'f') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\f';
                } else if (c3 == 'n') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\n';
                } else if (c3 == 'r') {
                    i2 = i4 + 1;
                    cArr2[i4] = '\r';
                } else if (c3 != 'x') {
                    switch (c3) {
                        case '/':
                            i2 = i4 + 1;
                            cArr2[i4] = '/';
                            break;
                        case '0':
                            i2 = i4 + 1;
                            cArr2[i4] = 0;
                            break;
                        case '1':
                            i2 = i4 + 1;
                            cArr2[i4] = 1;
                            break;
                        case '2':
                            i2 = i4 + 1;
                            cArr2[i4] = 2;
                            break;
                        case '3':
                            i2 = i4 + 1;
                            cArr2[i4] = 3;
                            break;
                        case '4':
                            i2 = i4 + 1;
                            cArr2[i4] = 4;
                            break;
                        case '5':
                            i2 = i4 + 1;
                            cArr2[i4] = 5;
                            break;
                        case '6':
                            i2 = i4 + 1;
                            cArr2[i4] = 6;
                            break;
                        case '7':
                            i2 = i4 + 1;
                            cArr2[i4] = 7;
                            break;
                        default:
                            switch (c3) {
                                case 't':
                                    i2 = i4 + 1;
                                    cArr2[i4] = '\t';
                                    break;
                                case 'u':
                                    i2 = i4 + 1;
                                    int i5 = i3 + 1;
                                    int i6 = i5 + 1;
                                    int i7 = i6 + 1;
                                    i3 = i7 + 1;
                                    cArr2[i4] = (char) Integer.parseInt(new String(new char[]{cArr[i5], cArr[i6], cArr[i7], cArr[i3]}), 16);
                                    break;
                                case 'v':
                                    i2 = i4 + 1;
                                    cArr2[i4] = 11;
                                    break;
                                default:
                                    throw new c.a.a.d("unclosed.str.lit");
                            }
                            break;
                    }
                } else {
                    i2 = i4 + 1;
                    int[] iArr = f2448c;
                    int i8 = i3 + 1;
                    int i9 = iArr[cArr[i8]] * 16;
                    i3 = i8 + 1;
                    cArr2[i4] = (char) (i9 + iArr[cArr[i3]]);
                }
                i4 = i2;
            }
            i3++;
        }
        return new String(cArr2, 0, i4);
    }

    public final double A(long j) {
        int i;
        char cB;
        int i2;
        double d2;
        int i3;
        int i4;
        char cB2;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return 0.0d;
        }
        int i5 = iP + 1;
        char cB3 = b(this.l + iP);
        int i6 = this.l;
        int i7 = (i6 + i5) - 1;
        boolean z = cB3 == '-';
        if (z) {
            char cB4 = b(i6 + i5);
            i5++;
            cB3 = cB4;
        }
        if (cB3 < '0' || cB3 > '9') {
            this.w = -1;
            return 0.0d;
        }
        int i8 = cB3 - '0';
        while (true) {
            i = i5 + 1;
            cB = b(this.l + i5);
            if (cB < '0' || cB > '9') {
                break;
            }
            i8 = (i8 * 10) + (cB - '0');
            i5 = i;
        }
        if (cB == '.') {
            int i9 = i + 1;
            char cB5 = b(this.l + i);
            if (cB5 < '0' || cB5 > '9') {
                this.w = -1;
                return 0.0d;
            }
            i8 = (i8 * 10) + (cB5 - '0');
            int i10 = 10;
            while (true) {
                i4 = i9 + 1;
                cB2 = b(this.l + i9);
                if (cB2 < '0' || cB2 > '9') {
                    break;
                }
                i8 = (i8 * 10) + (cB2 - '0');
                i10 *= 10;
                i9 = i4;
            }
            i = i4;
            i2 = i10;
            cB = cB2;
        } else {
            i2 = 1;
        }
        boolean z2 = cB == 'e' || cB == 'E';
        if (z2) {
            int i11 = i + 1;
            cB = b(this.l + i);
            if (cB == '+' || cB == '-') {
                int i12 = i11 + 1;
                cB = b(this.l + i11);
                i = i12;
            } else {
                i = i11;
            }
            while (cB >= '0' && cB <= '9') {
                int i13 = i + 1;
                cB = b(this.l + i);
                i = i13;
            }
        }
        int i14 = ((this.l + i) - i7) - 1;
        if (z2 || i14 >= 10) {
            d2 = Double.parseDouble(c0(i7, i14));
        } else {
            d2 = ((double) i8) / ((double) i2);
            if (z) {
                d2 = -d2;
            }
        }
        if (cB == ',') {
            this.l += i - 1;
            q();
            this.w = 3;
            this.h = 16;
            return d2;
        }
        if (cB != '}') {
            this.w = -1;
            return 0.0d;
        }
        int i15 = i + 1;
        char cB6 = b(this.l + i);
        if (cB6 == ',') {
            this.h = 16;
        } else {
            if (cB6 != ']') {
                if (cB6 == '}') {
                    i3 = 13;
                } else {
                    if (cB6 != 26) {
                        this.w = -1;
                        return 0.0d;
                    }
                    this.l += i15 - 1;
                    this.h = 20;
                    this.k = (char) 26;
                }
                this.w = 4;
                return d2;
            }
            i3 = 15;
            this.h = i3;
        }
        this.l += i15 - 1;
        q();
        this.w = 4;
        return d2;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x010c A[PHI: r4
      0x010c: PHI (r4v24 int) = (r4v23 int), (r4v29 int) binds: [B:81:0x010a, B:88:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[PHI: r3 r4
      0x010f: PHI (r3v28 int) = (r3v26 int), (r3v31 int) binds: [B:81:0x010a, B:88:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r4v26 int) = (r4v23 int), (r4v29 int) binds: [B:81:0x010a, B:88:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x011a A[ADDED_TO_REGION] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final double[] B(long r20) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.i.e.B(long):double[]");
    }

    public final double[][] C(long j) {
        int i;
        char cCharAt;
        int i2;
        double d2;
        int i3;
        int i4;
        int i5;
        int i6;
        double[][] dArr;
        char c2;
        int i7;
        double[][] dArr2;
        int i8;
        char cCharAt2;
        int i9 = 0;
        this.w = 0;
        int iP = p(j);
        double[][] dArr3 = null;
        if (iP == 0) {
            return null;
        }
        int i10 = iP + 1;
        int i11 = this.l + iP;
        char cCharAt3 = i11 >= this.y ? (char) 26 : this.x.charAt(i11);
        char c3 = '[';
        if (cCharAt3 != '[') {
            this.w = -1;
            return null;
        }
        int i12 = i10 + 1;
        int i13 = this.l + i10;
        char cCharAt4 = i13 >= this.y ? (char) 26 : this.x.charAt(i13);
        int i14 = 16;
        double[][] dArr4 = new double[16][];
        int i15 = 0;
        loop0: while (true) {
            if (cCharAt4 == c3) {
                int i16 = i12 + 1;
                int i17 = this.l + i12;
                char cCharAt5 = i17 >= this.y ? (char) 26 : this.x.charAt(i17);
                double[] dArr5 = new double[i14];
                int i18 = i9;
                while (true) {
                    int i19 = this.l;
                    int i20 = (i19 + i16) - 1;
                    int i21 = cCharAt5 == '-' ? 1 : i9;
                    if (i21 != 0) {
                        int i22 = i19 + i16;
                        i16++;
                        cCharAt5 = i22 >= this.y ? (char) 26 : this.x.charAt(i22);
                    }
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        break loop0;
                    }
                    int i23 = cCharAt5 - '0';
                    while (true) {
                        i = i16 + 1;
                        int i24 = this.l + i16;
                        cCharAt = i24 >= this.y ? (char) 26 : this.x.charAt(i24);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i23 = (i23 * 10) + (cCharAt - '0');
                        i16 = i;
                    }
                    if (cCharAt == '.') {
                        int i25 = i + 1;
                        int i26 = this.l + i;
                        char cCharAt6 = i26 >= this.y ? (char) 26 : this.x.charAt(i26);
                        if (cCharAt6 < '0' || cCharAt6 > '9') {
                            this.w = -1;
                            return dArr3;
                        }
                        i23 = (i23 * 10) + (cCharAt6 - '0');
                        i2 = 10;
                        while (true) {
                            i = i25 + 1;
                            int i27 = this.l + i25;
                            cCharAt = i27 >= this.y ? (char) 26 : this.x.charAt(i27);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            i23 = (i23 * 10) + (cCharAt - '0');
                            i2 *= 10;
                            i25 = i;
                        }
                    } else {
                        i2 = 1;
                    }
                    boolean z = cCharAt == 'e' || cCharAt == 'E';
                    if (z) {
                        int i28 = i + 1;
                        int i29 = this.l + i;
                        char cCharAt7 = i29 >= this.y ? (char) 26 : this.x.charAt(i29);
                        if (cCharAt7 == '+' || cCharAt7 == '-') {
                            i8 = i28 + 1;
                            int i30 = this.l + i28;
                            cCharAt2 = i30 >= this.y ? (char) 26 : this.x.charAt(i30);
                            cCharAt = cCharAt2;
                            i = i8;
                        } else {
                            cCharAt = cCharAt7;
                            i = i28;
                        }
                        while (true) {
                            if (cCharAt < '0' && cCharAt <= '9') {
                                i8 = i + 1;
                                int i31 = this.l + i;
                                if (i31 >= this.y) {
                                    cCharAt = 26;
                                    i = i8;
                                } else {
                                    cCharAt2 = this.x.charAt(i31);
                                    cCharAt = cCharAt2;
                                    i = i8;
                                }
                                if (cCharAt < '0') {
                                }
                            }
                        }
                    }
                    int i32 = ((this.l + i) - i20) - 1;
                    if (z || i32 >= 10) {
                        d2 = Double.parseDouble(c0(i20, i32));
                    } else {
                        d2 = ((double) i23) / ((double) i2);
                        if (i21 != 0) {
                            d2 = -d2;
                        }
                    }
                    if (i18 >= dArr5.length) {
                        double[] dArr6 = new double[(dArr5.length * 3) / 2];
                        System.arraycopy(dArr5, 0, dArr6, 0, i18);
                        dArr5 = dArr6;
                    }
                    int i33 = i18 + 1;
                    dArr5[i18] = d2;
                    if (cCharAt == ',') {
                        int i34 = i + 1;
                        int i35 = this.l + i;
                        cCharAt5 = i35 >= this.y ? (char) 26 : this.x.charAt(i35);
                        i = i34;
                        c2 = 16;
                        i7 = 0;
                        dArr2 = null;
                    } else {
                        if (cCharAt == ']') {
                            int i36 = i + 1;
                            int i37 = this.l + i;
                            char cCharAt8 = i37 >= this.y ? (char) 26 : this.x.charAt(i37);
                            if (i33 != dArr5.length) {
                                double[] dArr7 = new double[i33];
                                i3 = 0;
                                System.arraycopy(dArr5, 0, dArr7, 0, i33);
                                dArr5 = dArr7;
                            } else {
                                i3 = 0;
                            }
                            if (i15 >= dArr4.length) {
                                dArr4 = new double[(dArr4.length * 3) / 2][];
                                System.arraycopy(dArr5, i3, dArr4, i3, i33);
                            }
                            int i38 = i15 + 1;
                            dArr4[i15] = dArr5;
                            if (cCharAt8 == ',') {
                                int i39 = i36 + 1;
                                int i40 = this.l + i36;
                                cCharAt4 = i40 >= this.y ? (char) 26 : this.x.charAt(i40);
                                i12 = i39;
                                i5 = 16;
                                i6 = 0;
                                dArr = null;
                            } else {
                                if (cCharAt8 == ']') {
                                    int i41 = i36 + 1;
                                    int i42 = this.l + i36;
                                    char cCharAt9 = i42 >= this.y ? (char) 26 : this.x.charAt(i42);
                                    if (i38 != dArr4.length) {
                                        double[][] dArr8 = new double[i38][];
                                        System.arraycopy(dArr4, 0, dArr8, 0, i38);
                                        dArr4 = dArr8;
                                    }
                                    if (cCharAt9 == ',') {
                                        this.l += i41 - 1;
                                        q();
                                        this.w = 3;
                                        this.h = 16;
                                        return dArr4;
                                    }
                                    if (cCharAt9 != '}') {
                                        this.w = -1;
                                        return null;
                                    }
                                    int i43 = i41 + 1;
                                    char cB = b(this.l + i41);
                                    if (cB == ',') {
                                        this.h = 16;
                                    } else {
                                        if (cB != ']') {
                                            if (cB == '}') {
                                                i4 = 13;
                                            } else {
                                                if (cB != 26) {
                                                    this.w = -1;
                                                    return null;
                                                }
                                                this.l += i43 - 1;
                                                this.h = 20;
                                                this.k = (char) 26;
                                            }
                                            this.w = 4;
                                            return dArr4;
                                        }
                                        i4 = 15;
                                        this.h = i4;
                                    }
                                    this.l += i43 - 1;
                                    q();
                                    this.w = 4;
                                    return dArr4;
                                }
                                i5 = 16;
                                i6 = 0;
                                dArr = null;
                                cCharAt4 = cCharAt8;
                                i12 = i36;
                            }
                            i15 = i38;
                            i14 = i5;
                            i9 = i6;
                            dArr3 = dArr;
                            c3 = '[';
                            break;
                        }
                        c2 = 16;
                        i7 = 0;
                        dArr2 = null;
                        cCharAt5 = cCharAt;
                    }
                    dArr3 = dArr2;
                    i18 = i33;
                    i9 = i7;
                    i16 = i;
                }
            }
        }
        double[][] dArr9 = dArr3;
        this.w = -1;
        return dArr9;
    }

    public final float D(long j) {
        int i;
        char cB;
        int i2;
        float f2;
        int i3;
        char cB2;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return 0.0f;
        }
        int i4 = iP + 1;
        char cB3 = b(this.l + iP);
        int i5 = this.l;
        int i6 = (i5 + i4) - 1;
        boolean z = cB3 == '-';
        if (z) {
            char cB4 = b(i5 + i4);
            i4++;
            cB3 = cB4;
        }
        if (cB3 < '0' || cB3 > '9') {
            this.w = -1;
            return 0.0f;
        }
        int i7 = cB3 - '0';
        while (true) {
            i = i4 + 1;
            cB = b(this.l + i4);
            if (cB < '0' || cB > '9') {
                break;
            }
            i7 = (i7 * 10) + (cB - '0');
            i4 = i;
        }
        if (cB == '.') {
            int i8 = i + 1;
            char cB5 = b(this.l + i);
            if (cB5 < '0' || cB5 > '9') {
                this.w = -1;
                return 0.0f;
            }
            i7 = (i7 * 10) + (cB5 - '0');
            int i9 = 10;
            while (true) {
                i3 = i8 + 1;
                cB2 = b(this.l + i8);
                if (cB2 < '0' || cB2 > '9') {
                    break;
                }
                i7 = (i7 * 10) + (cB2 - '0');
                i9 *= 10;
                i8 = i3;
            }
            i = i3;
            i2 = i9;
            cB = cB2;
        } else {
            i2 = 1;
        }
        boolean z2 = cB == 'e' || cB == 'E';
        if (z2) {
            int i10 = i + 1;
            cB = b(this.l + i);
            if (cB == '+' || cB == '-') {
                int i11 = i10 + 1;
                cB = b(this.l + i10);
                i = i11;
            } else {
                i = i10;
            }
            while (cB >= '0' && cB <= '9') {
                int i12 = i + 1;
                cB = b(this.l + i);
                i = i12;
            }
        }
        int i13 = ((this.l + i) - i6) - 1;
        if (z2 || i13 >= 10) {
            f2 = Float.parseFloat(c0(i6, i13));
        } else {
            f2 = i7 / i2;
            if (z) {
                f2 = -f2;
            }
        }
        int i14 = 16;
        if (cB == ',') {
            this.l += i - 1;
            q();
            this.w = 3;
            this.h = 16;
            return f2;
        }
        if (cB != '}') {
            this.w = -1;
            return 0.0f;
        }
        int i15 = i + 1;
        char cB6 = b(this.l + i);
        if (cB6 != ',') {
            if (cB6 == ']') {
                i14 = 15;
            } else if (cB6 == '}') {
                i14 = 13;
            } else {
                if (cB6 != 26) {
                    this.w = -1;
                    return 0.0f;
                }
                this.l += i15 - 1;
                this.h = 20;
                this.k = (char) 26;
            }
            this.h = i14;
            this.l += i15 - 1;
            q();
        } else {
            this.h = i14;
            this.l += i15 - 1;
            q();
        }
        this.w = 4;
        return f2;
    }

    /* JADX WARN: Code duplicated, block: B:82:0x010c A[PHI: r4
      0x010c: PHI (r4v30 int) = (r4v29 int), (r4v35 int) binds: [B:81:0x010a, B:88:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x010f A[PHI: r3 r4
      0x010f: PHI (r3v20 int) = (r3v18 int), (r3v23 int) binds: [B:81:0x010a, B:88:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x010f: PHI (r4v32 int) = (r4v29 int), (r4v35 int) binds: [B:81:0x010a, B:88:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:86:0x011a A[ADDED_TO_REGION] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final float[] E(long r20) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.i.e.E(long):float[]");
    }

    public final float[][] F(long j) {
        int i;
        char cCharAt;
        int i2;
        float f2;
        int i3;
        int i4;
        int i5;
        int i6;
        float[][] fArr;
        char c2;
        int i7;
        float[][] fArr2;
        int i8;
        char cCharAt2;
        int i9 = 0;
        this.w = 0;
        int iP = p(j);
        float[][] fArr3 = null;
        if (iP == 0) {
            return null;
        }
        int i10 = iP + 1;
        int i11 = this.l + iP;
        char cCharAt3 = i11 >= this.y ? (char) 26 : this.x.charAt(i11);
        char c3 = '[';
        if (cCharAt3 != '[') {
            this.w = -1;
            return null;
        }
        int i12 = i10 + 1;
        int i13 = this.l + i10;
        char cCharAt4 = i13 >= this.y ? (char) 26 : this.x.charAt(i13);
        int i14 = 16;
        float[][] fArr4 = new float[16][];
        int i15 = 0;
        loop0: while (true) {
            if (cCharAt4 == c3) {
                int i16 = i12 + 1;
                int i17 = this.l + i12;
                char cCharAt5 = i17 >= this.y ? (char) 26 : this.x.charAt(i17);
                float[] fArr5 = new float[i14];
                int i18 = i9;
                while (true) {
                    int i19 = this.l;
                    int i20 = (i19 + i16) - 1;
                    int i21 = cCharAt5 == '-' ? 1 : i9;
                    if (i21 != 0) {
                        int i22 = i19 + i16;
                        i16++;
                        cCharAt5 = i22 >= this.y ? (char) 26 : this.x.charAt(i22);
                    }
                    if (cCharAt5 < '0' || cCharAt5 > '9') {
                        break loop0;
                    }
                    int i23 = cCharAt5 - '0';
                    while (true) {
                        i = i16 + 1;
                        int i24 = this.l + i16;
                        cCharAt = i24 >= this.y ? (char) 26 : this.x.charAt(i24);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i23 = (i23 * 10) + (cCharAt - '0');
                        i16 = i;
                    }
                    if (cCharAt == '.') {
                        int i25 = i + 1;
                        int i26 = this.l + i;
                        char cCharAt6 = i26 >= this.y ? (char) 26 : this.x.charAt(i26);
                        if (cCharAt6 < '0' || cCharAt6 > '9') {
                            this.w = -1;
                            return fArr3;
                        }
                        i23 = (i23 * 10) + (cCharAt6 - '0');
                        i2 = 10;
                        while (true) {
                            i = i25 + 1;
                            int i27 = this.l + i25;
                            cCharAt = i27 >= this.y ? (char) 26 : this.x.charAt(i27);
                            if (cCharAt < '0' || cCharAt > '9') {
                                break;
                            }
                            i23 = (i23 * 10) + (cCharAt - '0');
                            i2 *= 10;
                            i25 = i;
                        }
                    } else {
                        i2 = 1;
                    }
                    boolean z = cCharAt == 'e' || cCharAt == 'E';
                    if (z) {
                        int i28 = i + 1;
                        int i29 = this.l + i;
                        char cCharAt7 = i29 >= this.y ? (char) 26 : this.x.charAt(i29);
                        if (cCharAt7 == '+' || cCharAt7 == '-') {
                            i8 = i28 + 1;
                            int i30 = this.l + i28;
                            cCharAt2 = i30 >= this.y ? (char) 26 : this.x.charAt(i30);
                            cCharAt = cCharAt2;
                            i = i8;
                        } else {
                            cCharAt = cCharAt7;
                            i = i28;
                        }
                        while (true) {
                            if (cCharAt < '0' && cCharAt <= '9') {
                                i8 = i + 1;
                                int i31 = this.l + i;
                                if (i31 >= this.y) {
                                    cCharAt = 26;
                                    i = i8;
                                } else {
                                    cCharAt2 = this.x.charAt(i31);
                                    cCharAt = cCharAt2;
                                    i = i8;
                                }
                                if (cCharAt < '0') {
                                }
                            }
                        }
                    }
                    int i32 = ((this.l + i) - i20) - 1;
                    if (z || i32 >= 10) {
                        f2 = Float.parseFloat(c0(i20, i32));
                    } else {
                        f2 = i23 / i2;
                        if (i21 != 0) {
                            f2 = -f2;
                        }
                    }
                    if (i18 >= fArr5.length) {
                        float[] fArr6 = new float[(fArr5.length * 3) / 2];
                        System.arraycopy(fArr5, 0, fArr6, 0, i18);
                        fArr5 = fArr6;
                    }
                    int i33 = i18 + 1;
                    fArr5[i18] = f2;
                    if (cCharAt == ',') {
                        int i34 = i + 1;
                        int i35 = this.l + i;
                        cCharAt5 = i35 >= this.y ? (char) 26 : this.x.charAt(i35);
                        i = i34;
                        c2 = 16;
                        i7 = 0;
                        fArr2 = null;
                    } else {
                        if (cCharAt == ']') {
                            int i36 = i + 1;
                            int i37 = this.l + i;
                            char cCharAt8 = i37 >= this.y ? (char) 26 : this.x.charAt(i37);
                            if (i33 != fArr5.length) {
                                float[] fArr7 = new float[i33];
                                i3 = 0;
                                System.arraycopy(fArr5, 0, fArr7, 0, i33);
                                fArr5 = fArr7;
                            } else {
                                i3 = 0;
                            }
                            if (i15 >= fArr4.length) {
                                fArr4 = new float[(fArr4.length * 3) / 2][];
                                System.arraycopy(fArr5, i3, fArr4, i3, i33);
                            }
                            int i38 = i15 + 1;
                            fArr4[i15] = fArr5;
                            if (cCharAt8 == ',') {
                                int i39 = i36 + 1;
                                int i40 = this.l + i36;
                                cCharAt4 = i40 >= this.y ? (char) 26 : this.x.charAt(i40);
                                i12 = i39;
                                i5 = 16;
                                i6 = 0;
                                fArr = null;
                            } else {
                                if (cCharAt8 == ']') {
                                    int i41 = i36 + 1;
                                    int i42 = this.l + i36;
                                    char cCharAt9 = i42 >= this.y ? (char) 26 : this.x.charAt(i42);
                                    if (i38 != fArr4.length) {
                                        float[][] fArr8 = new float[i38][];
                                        System.arraycopy(fArr4, 0, fArr8, 0, i38);
                                        fArr4 = fArr8;
                                    }
                                    if (cCharAt9 == ',') {
                                        this.l += i41 - 1;
                                        q();
                                        this.w = 3;
                                        this.h = 16;
                                        return fArr4;
                                    }
                                    if (cCharAt9 != '}') {
                                        this.w = -1;
                                        return null;
                                    }
                                    int i43 = i41 + 1;
                                    char cB = b(this.l + i41);
                                    if (cB == ',') {
                                        this.h = 16;
                                    } else {
                                        if (cB != ']') {
                                            if (cB == '}') {
                                                i4 = 13;
                                            } else {
                                                if (cB != 26) {
                                                    this.w = -1;
                                                    return null;
                                                }
                                                this.l += i43 - 1;
                                                this.h = 20;
                                                this.k = (char) 26;
                                            }
                                            this.w = 4;
                                            return fArr4;
                                        }
                                        i4 = 15;
                                        this.h = i4;
                                    }
                                    this.l += i43 - 1;
                                    q();
                                    this.w = 4;
                                    return fArr4;
                                }
                                i5 = 16;
                                i6 = 0;
                                fArr = null;
                                cCharAt4 = cCharAt8;
                                i12 = i36;
                            }
                            i15 = i38;
                            i14 = i5;
                            i9 = i6;
                            fArr3 = fArr;
                            c3 = '[';
                            break;
                        }
                        c2 = 16;
                        i7 = 0;
                        fArr2 = null;
                        cCharAt5 = cCharAt;
                    }
                    fArr3 = fArr2;
                    i18 = i33;
                    i9 = i7;
                    i16 = i;
                }
            }
        }
        float[][] fArr9 = fArr3;
        this.w = -1;
        return fArr9;
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0113 A[PHI: r13
      0x0113: PHI (r13v16 int) = (r13v10 int), (r13v14 int), (r13v19 int) binds: [B:100:0x0141, B:96:0x012f, B:89:0x0110] A[DONT_GENERATE, DONT_INLINE]] */
    public int G(long j) {
        int i;
        char cCharAt;
        int i2;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return 0;
        }
        int i3 = iP + 1;
        int i4 = this.l + iP;
        char cCharAt2 = 26;
        char cCharAt3 = i4 >= this.y ? (char) 26 : this.x.charAt(i4);
        boolean z = cCharAt3 == '\"';
        if (z) {
            int i5 = i3 + 1;
            int i6 = this.l + i3;
            cCharAt3 = i6 >= this.y ? (char) 26 : this.x.charAt(i6);
            i3 = i5;
            z = true;
        }
        boolean z2 = cCharAt3 == '-';
        if (z2) {
            int i7 = i3 + 1;
            int i8 = this.l + i3;
            cCharAt3 = i8 >= this.y ? (char) 26 : this.x.charAt(i8);
            i3 = i7;
        }
        if (cCharAt3 < '0' || cCharAt3 > '9') {
            this.w = -1;
            return 0;
        }
        int i9 = cCharAt3 - '0';
        while (true) {
            i = i3 + 1;
            int i10 = this.l + i3;
            cCharAt = i10 >= this.y ? (char) 26 : this.x.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i9 = (i9 * 10) + (cCharAt - '0');
            i3 = i;
        }
        if (cCharAt == '.') {
            this.w = -1;
            return 0;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.w = -1;
                return 0;
            }
            int i11 = i + 1;
            int i12 = this.l + i;
            i = i11;
            cCharAt = i12 >= this.y ? (char) 26 : this.x.charAt(i12);
        }
        if (i9 < 0) {
            this.w = -1;
            return 0;
        }
        while (cCharAt != ',') {
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                if (cCharAt != '}') {
                    this.w = -1;
                    return 0;
                }
                int i13 = i + 1;
                char cB = b(this.l + i);
                if (cB == ',') {
                    this.h = 16;
                    int i14 = this.l + (i13 - 1);
                    this.l = i14;
                    i2 = i14 + 1;
                    this.l = i2;
                    if (i2 < this.y) {
                        cCharAt2 = this.x.charAt(i2);
                    }
                } else if (cB == ']') {
                    this.h = 15;
                    int i15 = this.l + (i13 - 1);
                    this.l = i15;
                    i2 = i15 + 1;
                    this.l = i2;
                    if (i2 < this.y) {
                        cCharAt2 = this.x.charAt(i2);
                    }
                } else if (cB == '}') {
                    this.h = 13;
                    int i16 = this.l + (i13 - 1);
                    this.l = i16;
                    i2 = i16 + 1;
                    this.l = i2;
                    if (i2 < this.y) {
                        cCharAt2 = this.x.charAt(i2);
                    }
                } else {
                    if (cB != 26) {
                        this.w = -1;
                        return 0;
                    }
                    this.h = 20;
                    this.l += i13 - 1;
                }
                this.k = cCharAt2;
                this.w = 4;
                return z2 ? -i9 : i9;
            }
            int i17 = i + 1;
            int i18 = this.l + i;
            i = i17;
            cCharAt = i18 >= this.y ? (char) 26 : this.x.charAt(i18);
        }
        int i19 = this.l + (i - 1);
        this.l = i19;
        int i20 = i19 + 1;
        this.l = i20;
        this.k = i20 < this.y ? this.x.charAt(i20) : (char) 26;
        this.w = 3;
        this.h = 16;
        return z2 ? -i9 : i9;
    }

    public final int[] H(long j) {
        boolean z;
        int[] iArr;
        int i;
        char cCharAt;
        int i2;
        int i3;
        char cCharAt2;
        byte b2;
        int[] iArr2;
        int i4;
        this.w = 0;
        int iP = p(j);
        int[] iArr3 = null;
        if (iP == 0) {
            return null;
        }
        int i5 = iP + 1;
        int i6 = this.l + iP;
        byte b3 = -1;
        if ((i6 >= this.y ? (char) 26 : this.x.charAt(i6)) != '[') {
            this.w = -1;
            return null;
        }
        int i7 = i5 + 1;
        int i8 = this.l + i5;
        char cCharAt3 = i8 >= this.y ? (char) 26 : this.x.charAt(i8);
        int[] iArr4 = new int[16];
        if (cCharAt3 != ']') {
            int i9 = 0;
            while (true) {
                if (cCharAt3 == '-') {
                    int i10 = i7 + 1;
                    int i11 = this.l + i7;
                    cCharAt3 = i11 >= this.y ? (char) 26 : this.x.charAt(i11);
                    i7 = i10;
                    z = true;
                } else {
                    z = false;
                }
                if (cCharAt3 < '0') {
                    iArr = iArr3;
                } else if (cCharAt3 <= '9') {
                    int i12 = cCharAt3 - '0';
                    while (true) {
                        i = i7 + 1;
                        int i13 = this.l + i7;
                        cCharAt = i13 >= this.y ? (char) 26 : this.x.charAt(i13);
                        if (cCharAt < '0' || cCharAt > '9') {
                            break;
                        }
                        i12 = (i12 * 10) + (cCharAt - '0');
                        i7 = i;
                    }
                    if (i9 >= iArr4.length) {
                        int[] iArr5 = new int[(iArr4.length * 3) / 2];
                        System.arraycopy(iArr4, 0, iArr5, 0, i9);
                        iArr4 = iArr5;
                    }
                    i2 = i9 + 1;
                    if (z) {
                        i12 = -i12;
                    }
                    iArr4[i9] = i12;
                    if (cCharAt == ',') {
                        int i14 = i + 1;
                        int i15 = this.l + i;
                        i = i14;
                        iArr2 = null;
                        cCharAt = i15 >= this.y ? (char) 26 : this.x.charAt(i15);
                        b2 = -1;
                    } else {
                        if (cCharAt == ']') {
                            i3 = i + 1;
                            int i16 = this.l + i;
                            if (i16 < this.y) {
                                cCharAt2 = this.x.charAt(i16);
                                break;
                            }
                            cCharAt2 = 26;
                            break;
                        }
                        b2 = -1;
                        iArr2 = null;
                    }
                    i9 = i2;
                    iArr3 = iArr2;
                    b3 = b2;
                    cCharAt3 = cCharAt;
                    i7 = i;
                } else {
                    iArr = null;
                }
                this.w = b3;
                return iArr;
            }
        }
        i3 = i7 + 1;
        int i17 = this.l + i7;
        cCharAt2 = i17 >= this.y ? (char) 26 : this.x.charAt(i17);
        i2 = 0;
        if (i2 != iArr4.length) {
            int[] iArr6 = new int[i2];
            System.arraycopy(iArr4, 0, iArr6, 0, i2);
            iArr4 = iArr6;
        }
        if (cCharAt2 == ',') {
            this.l += i3 - 1;
            q();
            this.w = 3;
            this.h = 16;
            return iArr4;
        }
        if (cCharAt2 != '}') {
            this.w = -1;
            return null;
        }
        int i18 = i3 + 1;
        char cB = b(this.l + i3);
        if (cB == ',') {
            this.h = 16;
        } else {
            if (cB != ']') {
                if (cB == '}') {
                    i4 = 13;
                } else {
                    if (cB != 26) {
                        this.w = -1;
                        return null;
                    }
                    this.l += i18 - 1;
                    this.h = 20;
                    this.k = (char) 26;
                }
                this.w = 4;
                return iArr4;
            }
            i4 = 15;
            this.h = i4;
        }
        this.l += i18 - 1;
        q();
        this.w = 4;
        return iArr4;
    }

    /* JADX WARN: Code duplicated, block: B:73:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f3 A[PHI: r2
      0x00f3: PHI (r2v27 int) = (r2v22 int), (r2v26 int), (r2v31 int) binds: [B:83:0x0125, B:79:0x0110, B:72:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    public long I(long j) {
        int i;
        char cCharAt;
        int i2;
        char cCharAt2;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return 0L;
        }
        int i3 = iP + 1;
        int i4 = this.l + iP;
        char cCharAt3 = i4 >= this.y ? (char) 26 : this.x.charAt(i4);
        boolean z = cCharAt3 == '\"';
        if (z) {
            int i5 = i3 + 1;
            int i6 = this.l + i3;
            cCharAt3 = i6 >= this.y ? (char) 26 : this.x.charAt(i6);
            i3 = i5;
        }
        boolean z2 = cCharAt3 == '-';
        if (z2) {
            int i7 = i3 + 1;
            int i8 = this.l + i3;
            cCharAt3 = i8 >= this.y ? (char) 26 : this.x.charAt(i8);
            i3 = i7;
        }
        if (cCharAt3 < '0' || cCharAt3 > '9') {
            this.w = -1;
            return 0L;
        }
        long j2 = cCharAt3 - '0';
        while (true) {
            i = i3 + 1;
            int i9 = this.l + i3;
            cCharAt = i9 >= this.y ? (char) 26 : this.x.charAt(i9);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i3 = i;
        }
        if (cCharAt == '.') {
            this.w = -1;
            return 0L;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.w = -1;
                return 0L;
            }
            int i10 = i + 1;
            int i11 = this.l + i;
            cCharAt = i11 >= this.y ? (char) 26 : this.x.charAt(i11);
            i = i10;
        }
        if (j2 < 0) {
            this.w = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i12 = this.l + (i - 1);
            this.l = i12;
            int i13 = i12 + 1;
            this.l = i13;
            this.k = i13 >= this.y ? (char) 26 : this.x.charAt(i13);
            this.w = 3;
            this.h = 16;
            return z2 ? -j2 : j2;
        }
        if (cCharAt != '}') {
            this.w = -1;
            return 0L;
        }
        int i14 = i + 1;
        char cB = b(this.l + i);
        if (cB == ',') {
            this.h = 16;
            int i15 = this.l + (i14 - 1);
            this.l = i15;
            i2 = i15 + 1;
            this.l = i2;
            if (i2 >= this.y) {
                cCharAt2 = 26;
            } else {
                cCharAt2 = this.x.charAt(i2);
            }
            this.k = cCharAt2;
        } else if (cB == ']') {
            this.h = 15;
            int i16 = this.l + (i14 - 1);
            this.l = i16;
            i2 = i16 + 1;
            this.l = i2;
            if (i2 >= this.y) {
                cCharAt2 = 26;
            } else {
                cCharAt2 = this.x.charAt(i2);
            }
            this.k = cCharAt2;
        } else if (cB == '}') {
            this.h = 13;
            int i17 = this.l + (i14 - 1);
            this.l = i17;
            i2 = i17 + 1;
            this.l = i2;
            if (i2 >= this.y) {
                cCharAt2 = 26;
            } else {
                cCharAt2 = this.x.charAt(i2);
            }
            this.k = cCharAt2;
        } else {
            if (cB != 26) {
                this.w = -1;
                return 0L;
            }
            this.h = 20;
            this.l += i14 - 1;
            this.k = (char) 26;
        }
        this.w = 4;
        return z2 ? -j2 : j2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    public String J(long j) {
        String str;
        int i;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return null;
        }
        int i2 = iP + 1;
        int i3 = this.l + iP;
        if (i3 >= this.y) {
            throw new c.a.a.d("unclosed str, " + i());
        }
        if (this.x.charAt(i3) == '\"') {
            int i4 = this.l + i2;
            int iIndexOf = this.x.indexOf(34, i4);
            if (iIndexOf == -1) {
                throw new c.a.a.d("unclosed str, " + i());
            }
            if (f2446a) {
                str = this.x.substring(i4, iIndexOf);
            } else {
                int i5 = iIndexOf - i4;
                str = new String(d0(this.l + i2, i5), 0, i5);
            }
            if (str.indexOf(92) != -1) {
                boolean z = false;
                while (true) {
                    int i6 = iIndexOf - 1;
                    int i7 = 0;
                    while (i6 >= 0 && this.x.charAt(i6) == '\\') {
                        i7++;
                        i6--;
                        z = true;
                    }
                    if (i7 % 2 == 0) {
                        break;
                    }
                    iIndexOf = this.x.indexOf(34, iIndexOf + 1);
                }
                int i8 = iIndexOf - i4;
                char[] cArrD0 = d0(this.l + i2, i8);
                if (z) {
                    str = w(cArrD0, i8);
                } else {
                    str = new String(cArrD0, 0, i8);
                    if (str.indexOf(92) != -1) {
                        str = w(cArrD0, i8);
                    }
                }
            }
            int i9 = iIndexOf + 1;
            char cCharAt = i9 >= this.y ? (char) 26 : this.x.charAt(i9);
            if (cCharAt == ',') {
                this.l = i9;
                int i10 = i9 + 1;
                this.l = i10;
                this.k = i10 < this.y ? this.x.charAt(i10) : (char) 26;
                this.w = 3;
                this.h = 16;
                return str;
            }
            if (cCharAt == '}') {
                int i11 = i9 + 1;
                char cCharAt2 = i11 >= this.y ? (char) 26 : this.x.charAt(i11);
                if (cCharAt2 == ',') {
                    this.h = 16;
                } else {
                    if (cCharAt2 != ']') {
                        if (cCharAt2 == '}') {
                            i = 13;
                        } else if (cCharAt2 == 26) {
                            this.h = 20;
                            this.l = i11;
                            this.k = (char) 26;
                        }
                        this.w = 4;
                        return str;
                    }
                    i = 15;
                    this.h = i;
                }
                this.l = i11;
                q();
                this.w = 4;
                return str;
            }
        }
        this.w = -1;
        return this.z;
    }

    public long K(long j) {
        int i;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return 0L;
        }
        int i2 = iP + 1;
        int i3 = this.l + iP;
        if ((i3 >= this.y ? (char) 26 : this.x.charAt(i3)) != '\"') {
            this.w = -1;
            return 0L;
        }
        long j2 = -3750763034362895579L;
        while (true) {
            int i4 = i2 + 1;
            int i5 = this.l + i2;
            char cCharAt = i5 >= this.y ? (char) 26 : this.x.charAt(i5);
            if (cCharAt == '\"') {
                int i6 = i4 + 1;
                int i7 = this.l + i4;
                char cCharAt2 = i7 >= this.y ? (char) 26 : this.x.charAt(i7);
                if (cCharAt2 == ',') {
                    int i8 = this.l + (i6 - 1);
                    this.l = i8;
                    int i9 = i8 + 1;
                    this.l = i9;
                    this.k = i9 < this.y ? this.x.charAt(i9) : (char) 26;
                    this.w = 3;
                    return j2;
                }
                if (cCharAt2 != '}') {
                    this.w = -1;
                    return 0L;
                }
                int i10 = i6 + 1;
                int i11 = this.l + i6;
                char cCharAt3 = i11 >= this.y ? (char) 26 : this.x.charAt(i11);
                if (cCharAt3 == ',') {
                    i = 16;
                } else {
                    if (cCharAt3 != ']') {
                        if (cCharAt3 == '}') {
                            i = 13;
                        } else {
                            if (cCharAt3 != 26) {
                                this.w = -1;
                                return 0L;
                            }
                            this.h = 20;
                            this.l += i10 - 1;
                            this.k = (char) 26;
                        }
                        this.w = 4;
                        return j2;
                    }
                    i = 15;
                }
                this.h = i;
                this.l += i10 - 1;
                q();
                this.w = 4;
                return j2;
            }
            j2 = (j2 ^ ((long) cCharAt)) * 1099511628211L;
            if (cCharAt == '\\') {
                this.w = -1;
                return 0L;
            }
            i2 = i4;
        }
    }

    public boolean L(boolean z) {
        return M(z, this.y - this.l);
    }

    /* JADX WARN: Failed to calculate best type for var: r0v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v31 int
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v31 int, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v3 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v5 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v9 int
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v9 int, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r26v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r26v1 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r28v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r28v0 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v0 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r29v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r29v1 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v10 int
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v10 int, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r2v6 int
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r2v6 int, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r35v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 'this'  ??, new type: c.a.a.i.e
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v31 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v31 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v32 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v11 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v2 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v3 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v13 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v3 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v4 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v9 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r7v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v3 ??, new type: char
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to set immutable type for var: r35v0 'this'  ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r35v0 'this'  ??, new type: c.a.a.i.e
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setImmutableType(TypeInferenceVisitor.java:111)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:102)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:102)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v10 ??, new type: char
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public boolean M(boolean r36, int r37) {
        /*
            Method dump skipped, instruction units count: 1610
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.i.e.M(boolean, int):boolean");
    }

    public final long O() {
        long j;
        boolean z = false;
        this.r = 0;
        if (this.k == '-') {
            this.r = 0 + 1;
            int i = this.l + 1;
            this.l = i;
            if (i >= this.y) {
                throw new c.a.a.d("syntax error, " + i());
            }
            this.k = this.x.charAt(i);
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
        }
        long j2 = 0;
        while (true) {
            char c2 = this.k;
            if (c2 < '0' || c2 > '9') {
                break;
            }
            int i2 = c2 - '0';
            if (j2 < -922337203685477580L) {
                throw new c.a.a.d("error long value, " + j2 + ", " + i());
            }
            long j3 = j2 * 10;
            long j4 = i2;
            if (j3 < j + j4) {
                throw new c.a.a.d("error long value, " + j3 + ", " + i());
            }
            j2 = j3 - j4;
            this.r++;
            int i3 = this.l + 1;
            this.l = i3;
            this.k = i3 >= this.y ? (char) 26 : this.x.charAt(i3);
        }
        return !z ? -j2 : j2;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:19:0x0053  */
    /* JADX WARN: Code duplicated, block: B:20:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0063 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    /* JADX WARN: Code duplicated, block: B:41:0x009c  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x0104  */
    /* JADX WARN: Code duplicated, block: B:74:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:7:0x001e A[PHI: r0
      0x001e: PHI (r0v52 int) = (r0v51 int), (r0v55 int) binds: [B:13:0x003c, B:5:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x007e A[ADDED_TO_REGION, EDGE_INSN: B:80:0x007e->B:30:0x007e BREAK  A[LOOP:0: B:22:0x005f->B:29:0x007b], REMOVE, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e9, code lost:
    
        r0 = r9.x.charAt(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003c -> B:6:0x001c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x00fd -> B:59:0x00e1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P() {
        /*
            Method dump skipped, instruction units count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.i.e.P():void");
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:94:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x0197  */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x019d, code lost:
    
        r5 = r23.x.charAt(r5);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x01b3 -> B:94:0x0194). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number Q() {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.a.i.e.Q():java.lang.Number");
    }

    public final void R() {
        char c2 = this.k;
        int i = this.l + 1;
        int iIndexOf = this.x.indexOf(c2, i);
        if (iIndexOf == -1) {
            throw new c.a.a.d("unclosed str, " + i());
        }
        int i2 = iIndexOf - i;
        char[] cArrD0 = d0(this.l + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrD0[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrD0[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = this.x.indexOf(c2, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrD0.length) {
                int length = (cArrD0.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrD0, 0, cArr, 0, cArrD0.length);
                cArrD0 = cArr;
            }
            this.x.getChars(iIndexOf, iIndexOf2, cArrD0, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (!z) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (cArrD0[i6] == '\\') {
                    z = true;
                }
            }
        }
        this.n = cArrD0;
        this.o = i2;
        this.r = this.l;
        this.s = z;
        int i7 = iIndexOf + 1;
        this.l = i7;
        this.k = i7 >= this.y ? (char) 26 : this.x.charAt(i7);
        this.h = 4;
    }

    public String S(char c2) {
        String str;
        int i = this.l + 1;
        int iIndexOf = this.x.indexOf(c2, i);
        if (iIndexOf == -1) {
            throw new c.a.a.d("unclosed str, " + i());
        }
        if (f2446a) {
            str = this.x.substring(i, iIndexOf);
        } else {
            int i2 = iIndexOf - i;
            str = new String(d0(this.l + 1, i2), 0, i2);
        }
        if (str.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = iIndexOf - 1; i4 >= 0 && this.x.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                iIndexOf = this.x.indexOf(c2, iIndexOf + 1);
            }
            int i5 = iIndexOf - i;
            str = w(d0(this.l + 1, i5), i5);
        }
        int i6 = iIndexOf + 1;
        this.l = i6;
        this.k = i6 >= this.y ? (char) 26 : this.x.charAt(i6);
        return str;
    }

    public final String T(o oVar) {
        char c2;
        while (true) {
            c2 = this.k;
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                break;
            }
            q();
        }
        if (c2 == '\"') {
            return U(oVar, '\"');
        }
        if (c2 == '\'') {
            return U(oVar, '\'');
        }
        if (c2 == '}') {
            q();
            this.h = 13;
            return null;
        }
        if (c2 == ',') {
            q();
            this.h = 16;
            return null;
        }
        if (c2 != 26) {
            return V(oVar);
        }
        this.h = 20;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x007e  */
    public String U(o oVar, char c2) {
        String strW;
        int i = this.l + 1;
        int iIndexOf = this.x.indexOf(c2, i);
        if (iIndexOf == -1) {
            throw new c.a.a.d("unclosed str, " + i());
        }
        int i2 = iIndexOf - i;
        char[] cArrD0 = d0(this.l + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrD0[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrD0[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = this.x.indexOf(c2, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrD0.length) {
                int length = (cArrD0.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrD0, 0, cArr, 0, cArrD0.length);
                cArrD0 = cArr;
            }
            this.x.getChars(iIndexOf, iIndexOf2, cArrD0, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (z) {
            strW = w(cArrD0, i2);
        } else {
            int i6 = 0;
            for (int i7 = 0; i7 < i2; i7++) {
                char c3 = cArrD0[i7];
                i6 = (i6 * 31) + c3;
                if (c3 == '\\') {
                    z = true;
                }
            }
            if (z) {
                strW = w(cArrD0, i2);
            } else {
                strW = i2 < 20 ? oVar.b(cArrD0, 0, i2, i6) : new String(cArrD0, 0, i2);
            }
        }
        int i8 = iIndexOf + 1;
        this.l = i8;
        this.k = i8 >= this.y ? (char) 26 : this.x.charAt(i8);
        return strW;
    }

    public final String V(o oVar) {
        int i = this.k;
        boolean[] zArr = f2451f;
        if (!(i >= zArr.length || zArr[i])) {
            throw new c.a.a.d("illegal identifier : " + this.k + ", " + i());
        }
        this.r = this.l;
        this.o = 1;
        while (true) {
            char cQ = q();
            boolean[] zArr2 = g;
            if (cQ < zArr2.length && !zArr2[cQ]) {
                break;
            }
            i = (i * 31) + cQ;
            this.o++;
        }
        this.k = b(this.l);
        this.h = 18;
        if (this.o == 4 && this.x.startsWith("null", this.r)) {
            return null;
        }
        return oVar.a(this.x, this.r, this.o, i);
    }

    protected void X(char c2, char c3, char c4, char c5, char c6, char c7) {
        this.v.set(11, ((c2 - '0') * 10) + (c3 - '0'));
        this.v.set(12, ((c4 - '0') * 10) + (c5 - '0'));
        this.v.set(13, ((c6 - '0') * 10) + (c7 - '0'));
    }

    protected void Y(char c2, char c3, char c4) {
        int i = (((c3 - '0') * 10) + (c4 - '0')) * 3600 * 1000;
        if (c2 == '-') {
            i = -i;
        }
        if (this.v.getTimeZone().getRawOffset() != i) {
            String[] availableIDs = TimeZone.getAvailableIDs(i);
            if (availableIDs.length > 0) {
                this.v.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
            }
        }
    }

    protected void Z() {
        q();
        char c2 = this.k;
        if (c2 == '/') {
            do {
                q();
            } while (this.k != '\n');
            q();
        } else {
            if (c2 != '*') {
                throw new c.a.a.d("invalid comment");
            }
            while (true) {
                q();
                while (true) {
                    char c3 = this.k;
                    if (c3 == 26) {
                        return;
                    }
                    if (c3 == '*') {
                        q();
                        if (this.k == '/') {
                            q();
                            return;
                        }
                    }
                }
            }
        }
    }

    public byte[] a() {
        return h(this.x, this.r + 1, this.o);
    }

    final void a0() {
        while (true) {
            char c2 = this.k;
            if (c2 > '/') {
                return;
            }
            if (c2 == ' ' || c2 == '\r' || c2 == '\n' || c2 == '\t' || c2 == '\f' || c2 == '\b') {
                q();
            } else if (c2 != '/') {
                return;
            } else {
                Z();
            }
        }
    }

    protected char b(int i) {
        if (i >= this.y) {
            return (char) 26;
        }
        return this.x.charAt(i);
    }

    public final String b0() {
        return this.s ? w(this.n, this.o) : c0(this.r + 1, this.o);
    }

    final char[] d0(int i, int i2) {
        char[] cArr = this.n;
        if (i2 < cArr.length) {
            this.x.getChars(i, i2 + i, cArr, 0);
            return this.n;
        }
        char[] cArr2 = new char[i2];
        this.n = cArr2;
        this.x.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    public void e() {
        char[] cArr = this.n;
        if (cArr.length <= 8196) {
            f2447b.set(cArr);
        }
        this.n = null;
    }

    public final int e0() {
        return this.h;
    }

    public final Number f(boolean z) {
        char[] cArr;
        boolean z2;
        int i = (this.r + this.o) - 1;
        char cCharAt = i >= this.y ? (char) 26 : this.x.charAt(i);
        try {
            if (cCharAt == 'F') {
                return Float.valueOf(Float.parseFloat(v()));
            }
            if (cCharAt == 'D') {
                return Double.valueOf(Double.parseDouble(v()));
            }
            if (z) {
                return g();
            }
            char cCharAt2 = this.x.charAt((this.r + this.o) - 1);
            int i2 = this.o;
            if (cCharAt2 == 'L' || cCharAt2 == 'S' || cCharAt2 == 'B' || cCharAt2 == 'F' || cCharAt2 == 'D') {
                i2--;
            }
            int i3 = this.r;
            char[] cArr2 = this.n;
            int i4 = 0;
            if (i2 < cArr2.length) {
                this.x.getChars(i3, i3 + i2, cArr2, 0);
                cArr = this.n;
            } else {
                char[] cArr3 = new char[i2];
                this.x.getChars(i3, i3 + i2, cArr3, 0);
                cArr = cArr3;
            }
            if (i2 > 9 || this.p) {
                return Double.valueOf(Double.parseDouble(new String(cArr, 0, i2)));
            }
            char c2 = cArr[0];
            int i5 = 2;
            if (c2 == '-') {
                c2 = cArr[1];
                z2 = true;
            } else {
                if (c2 == '+') {
                    c2 = cArr[1];
                } else {
                    i5 = 1;
                }
                z2 = false;
            }
            int i6 = c2 - '0';
            while (i5 < i2) {
                char c3 = cArr[i5];
                if (c3 == '.') {
                    i4 = 1;
                } else {
                    i6 = (i6 * 10) + (c3 - '0');
                    if (i4 != 0) {
                        i4 *= 10;
                    }
                }
                i5++;
            }
            double d2 = ((double) i6) / ((double) i4);
            if (z2) {
                d2 = -d2;
            }
            return Double.valueOf(d2);
        } catch (NumberFormatException e2) {
            throw new c.a.a.d(e2.getMessage() + ", " + i());
        }
    }

    public final BigDecimal g() {
        char cCharAt = this.x.charAt((this.r + this.o) - 1);
        int i = this.o;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        int i2 = this.r;
        char[] cArr = this.n;
        if (i < cArr.length) {
            this.x.getChars(i2, i2 + i, cArr, 0);
            return new BigDecimal(this.n, 0, i);
        }
        char[] cArr2 = new char[i];
        this.x.getChars(i2, i + i2, cArr2, 0);
        return new BigDecimal(cArr2);
    }

    public String i() {
        StringBuilder sb = new StringBuilder();
        sb.append("pos ");
        sb.append(this.l);
        sb.append(", json : ");
        int i = this.y;
        String strSubstring = this.x;
        if (i >= 65536) {
            strSubstring = strSubstring.substring(0, 65536);
        }
        sb.append(strSubstring);
        return sb.toString();
    }

    public final int j() {
        int i;
        boolean z;
        int i2 = this.r;
        int i3 = this.o + i2;
        int i4 = 0;
        if ((i2 >= this.y ? (char) 26 : this.x.charAt(i2)) == '-') {
            i = Integer.MIN_VALUE;
            i2++;
            z = true;
        } else {
            i = -2147483647;
            z = false;
        }
        if (i2 < i3) {
            int i5 = i2 + 1;
            i4 = -((i2 >= this.y ? (char) 26 : this.x.charAt(i2)) - '0');
            i2 = i5;
        }
        while (i2 < i3) {
            int i6 = i2 + 1;
            char cCharAt = i2 >= this.y ? (char) 26 : this.x.charAt(i2);
            if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B') {
                i2 = i6;
                break;
            }
            int i7 = cCharAt - '0';
            if (i4 < -214748364) {
                throw new NumberFormatException(v());
            }
            int i8 = i4 * 10;
            if (i8 < i + i7) {
                throw new NumberFormatException(v());
            }
            i4 = i8 - i7;
            i2 = i6;
        }
        if (!z) {
            return -i4;
        }
        if (i2 > this.r + 1) {
            return i4;
        }
        throw new NumberFormatException(v());
    }

    public final Number k() {
        char c2;
        long j;
        boolean z;
        long j2;
        int i = this.r;
        int i2 = this.o + i;
        int i3 = i2 - 1;
        char cCharAt = i3 >= this.y ? (char) 26 : this.x.charAt(i3);
        if (cCharAt == 'B') {
            i2--;
            c2 = 'B';
        } else if (cCharAt == 'L') {
            i2--;
            c2 = 'L';
        } else if (cCharAt != 'S') {
            c2 = ' ';
        } else {
            i2--;
            c2 = 'S';
        }
        int i4 = this.r;
        if ((i4 >= this.y ? (char) 26 : this.x.charAt(i4)) == '-') {
            j = Long.MIN_VALUE;
            i++;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        if (i < i2) {
            int i5 = i + 1;
            j2 = -((i >= this.y ? (char) 26 : this.x.charAt(i)) - '0');
            i = i5;
        } else {
            j2 = 0;
        }
        while (i < i2) {
            int i6 = i + 1;
            int iCharAt = (i >= this.y ? (char) 26 : this.x.charAt(i)) - '0';
            if (j2 < -922337203685477580L) {
                return new BigInteger(v());
            }
            long j3 = j2 * 10;
            long j4 = iCharAt;
            if (j3 < j + j4) {
                return new BigInteger(v());
            }
            j2 = j3 - j4;
            i = i6;
        }
        if (!z) {
            long j5 = -j2;
            if (j5 > 2147483647L || c2 == 'L') {
                return Long.valueOf(j5);
            }
            int i7 = (int) j5;
            if (c2 == 'S') {
                return Short.valueOf((short) i7);
            }
            return c2 == 'B' ? Byte.valueOf((byte) i7) : Integer.valueOf(i7);
        }
        if (i <= this.r + 1) {
            throw new NumberFormatException(v());
        }
        if (j2 < -2147483648L || c2 == 'L') {
            return Long.valueOf(j2);
        }
        if (c2 == 'S') {
            return Short.valueOf((short) j2);
        }
        int i8 = (int) j2;
        return c2 == 'B' ? Byte.valueOf((byte) i8) : Integer.valueOf(i8);
    }

    public final boolean l() {
        int i = 0;
        while (true) {
            char cB = b(i);
            boolean z = true;
            if (cB == 26) {
                return true;
            }
            if (cB > ' ' || (cB != ' ' && cB != '\n' && cB != '\r' && cB != '\t' && cB != '\f' && cB != '\b')) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }

    public final boolean m(d dVar) {
        return (this.j & dVar.u) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:33:0x0076  */
    /* JADX WARN: Code duplicated, block: B:35:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:38:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005d -> B:8:0x0026). Please report as a decompilation issue!!! */
    public final long n() {
        long j;
        boolean z;
        long j2;
        int i;
        char cCharAt;
        int i2 = this.r;
        int i3 = this.o + i2;
        if (b(i2) == '-') {
            j = Long.MIN_VALUE;
            i2++;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        if (i2 >= i3) {
            j2 = 0;
            if (i2 < i3) {
                i = i2 + 1;
                if (i2 >= this.y) {
                    cCharAt = 26;
                } else {
                    cCharAt = this.x.charAt(i2);
                }
                if (cCharAt != 'L' || cCharAt == 'S' || cCharAt == 'B') {
                    i2 = i;
                } else {
                    int i4 = cCharAt - '0';
                    if (j2 < -922337203685477580L) {
                        throw new NumberFormatException(v());
                    }
                    long j3 = j2 * 10;
                    long j4 = i4;
                    if (j3 < j + j4) {
                        throw new NumberFormatException(v());
                    }
                    j2 = j3 - j4;
                }
            }
            if (z) {
                return -j2;
            }
            if (i2 > this.r + 1) {
                return j2;
            }
            throw new NumberFormatException(v());
        }
        i = i2 + 1;
        j2 = -(b(i2) - '0');
        i2 = i;
        if (i2 < i3) {
            i = i2 + 1;
            if (i2 >= this.y) {
                cCharAt = 26;
            } else {
                cCharAt = this.x.charAt(i2);
            }
            if (cCharAt != 'L') {
            }
            i2 = i;
        }
        if (z) {
            return -j2;
        }
        if (i2 > this.r + 1) {
            return j2;
        }
        throw new NumberFormatException(v());
    }

    public boolean o(long j) {
        char cCharAt = this.k;
        int i = this.l + 1;
        int i2 = 1;
        while (cCharAt != '\"' && cCharAt != '\'') {
            if (cCharAt > ' ' || !(cCharAt == ' ' || cCharAt == '\n' || cCharAt == '\r' || cCharAt == '\t' || cCharAt == '\f' || cCharAt == '\b')) {
                this.B = 0L;
                this.w = -2;
                return false;
            }
            int i3 = i2 + 1;
            int i4 = this.l + i2;
            cCharAt = i4 >= this.y ? (char) 26 : this.x.charAt(i4);
            i2 = i3;
        }
        long j2 = -3750763034362895579L;
        for (int i5 = i; i5 < this.y; i5++) {
            char cCharAt2 = this.x.charAt(i5);
            if (cCharAt2 == cCharAt) {
                i2 += (i5 - i) + 1;
                break;
            }
            j2 = 1099511628211L * (j2 ^ ((long) cCharAt2));
        }
        if (j2 != j) {
            this.w = -2;
            this.B = j2;
            return false;
        }
        int i6 = i2 + 1;
        int i7 = this.l + i2;
        char cCharAt3 = i7 >= this.y ? (char) 26 : this.x.charAt(i7);
        while (cCharAt3 != ':') {
            if (cCharAt3 > ' ' || !(cCharAt3 == ' ' || cCharAt3 == '\n' || cCharAt3 == '\r' || cCharAt3 == '\t' || cCharAt3 == '\f' || cCharAt3 == '\b')) {
                throw new c.a.a.d("match feild error expect ':'");
            }
            int i8 = i6 + 1;
            int i9 = this.l + i6;
            cCharAt3 = i9 >= this.y ? (char) 26 : this.x.charAt(i9);
            i6 = i8;
        }
        int i10 = this.l + i6;
        char cCharAt4 = i10 >= this.y ? (char) 26 : this.x.charAt(i10);
        if (cCharAt4 == '{') {
            int i11 = i10 + 1;
            this.l = i11;
            this.k = i11 >= this.y ? (char) 26 : this.x.charAt(i11);
            this.h = 12;
        } else if (cCharAt4 == '[') {
            int i12 = i10 + 1;
            this.l = i12;
            this.k = i12 >= this.y ? (char) 26 : this.x.charAt(i12);
            this.h = 14;
        } else {
            this.l = i10;
            this.k = i10 >= this.y ? (char) 26 : this.x.charAt(i10);
            s();
        }
        return true;
    }

    public char q() {
        int i = this.l + 1;
        this.l = i;
        char cCharAt = i >= this.y ? (char) 26 : this.x.charAt(i);
        this.k = cCharAt;
        return cCharAt;
    }

    public final void r() {
        char c2;
        while (true) {
            c2 = this.k;
            if (!(c2 <= ' ' && (c2 == ' ' || c2 == '\n' || c2 == '\r' || c2 == '\t' || c2 == '\f' || c2 == '\b'))) {
                break;
            } else {
                q();
            }
        }
        if (c2 == '_' || Character.isLetter(c2)) {
            N();
        } else {
            s();
        }
    }

    public final void s() {
        int i;
        this.o = 0;
        while (true) {
            int i2 = this.l;
            this.i = i2;
            char c2 = this.k;
            if (c2 == '/') {
                Z();
            } else {
                if (c2 == '\"') {
                    R();
                    return;
                }
                if ((c2 >= '0' && c2 <= '9') || c2 == '-') {
                    P();
                    return;
                }
                if (c2 == ',') {
                    q();
                    this.h = 16;
                    return;
                }
                if (c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    if (c2 == ':') {
                        q();
                        this.h = 17;
                        return;
                    }
                    if (c2 == '[') {
                        int i3 = i2 + 1;
                        this.l = i3;
                        this.k = i3 < this.y ? this.x.charAt(i3) : (char) 26;
                        this.h = 14;
                        return;
                    }
                    if (c2 == ']') {
                        q();
                        this.h = 15;
                        return;
                    }
                    if (c2 == 'f') {
                        if (this.x.startsWith("false", i2)) {
                            int i4 = this.l + 5;
                            this.l = i4;
                            char cB = b(i4);
                            this.k = cB;
                            if (cB == ' ' || cB == ',' || cB == '}' || cB == ']' || cB == '\n' || cB == '\r' || cB == '\t' || cB == 26 || cB == '\f' || cB == '\b' || cB == ':') {
                                this.h = 7;
                                return;
                            }
                        }
                        throw new c.a.a.d("scan false error");
                    }
                    if (c2 == 'n') {
                        if (this.x.startsWith("null", i2)) {
                            this.l += 4;
                            i = 8;
                        } else if (this.x.startsWith("new", this.l)) {
                            this.l += 3;
                            i = 9;
                        } else {
                            i = 0;
                        }
                        if (i != 0) {
                            char cB2 = b(this.l);
                            this.k = cB2;
                            if (cB2 == ' ' || cB2 == ',' || cB2 == '}' || cB2 == ']' || cB2 == '\n' || cB2 == '\r' || cB2 == '\t' || cB2 == 26 || cB2 == '\f' || cB2 == '\b') {
                                this.h = i;
                                return;
                            }
                        }
                        throw new c.a.a.d("scan null/new error");
                    }
                    if (c2 == '{') {
                        int i5 = i2 + 1;
                        this.l = i5;
                        this.k = i5 < this.y ? this.x.charAt(i5) : (char) 26;
                        this.h = 12;
                        return;
                    }
                    if (c2 == '}') {
                        int i6 = i2 + 1;
                        this.l = i6;
                        this.k = i6 < this.y ? this.x.charAt(i6) : (char) 26;
                        this.h = 13;
                        return;
                    }
                    if (c2 != 'S' && c2 != 'T') {
                        if (c2 == 't') {
                            if (this.x.startsWith("true", i2)) {
                                int i7 = this.l + 4;
                                this.l = i7;
                                char cB3 = b(i7);
                                this.k = cB3;
                                if (cB3 == ' ' || cB3 == ',' || cB3 == '}' || cB3 == ']' || cB3 == '\n' || cB3 == '\r' || cB3 == '\t' || cB3 == 26 || cB3 == '\f' || cB3 == '\b' || cB3 == ':') {
                                    this.h = 6;
                                    return;
                                }
                            }
                            throw new c.a.a.d("scan true error");
                        }
                        if (c2 != 'u') {
                            switch (c2) {
                                default:
                                    switch (c2) {
                                        case '\'':
                                            R();
                                            return;
                                        case '(':
                                            q();
                                            this.h = 10;
                                            return;
                                        case ')':
                                            q();
                                            this.h = 11;
                                            return;
                                        default:
                                            int i8 = this.y;
                                            if (i2 == i8 || (c2 == 26 && i2 + 1 == i8)) {
                                                if (this.h == 20) {
                                                    throw new c.a.a.d("EOF error");
                                                }
                                                this.h = 20;
                                                int i9 = this.m;
                                                this.l = i9;
                                                this.i = i9;
                                                return;
                                            }
                                            if (c2 > 31 && c2 != 127) {
                                                this.h = 1;
                                                q();
                                                return;
                                            }
                                            break;
                                    }
                                case '\b':
                                case '\t':
                                case '\n':
                                    q();
                                    break;
                            }
                        }
                    }
                    N();
                    return;
                }
                q();
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:124:0x00a3 A[SYNTHETIC] */
    public final void t(int i) {
        this.o = 0;
        while (true) {
            if (i == 2) {
                char c2 = this.k;
                if (c2 >= '0' && c2 <= '9') {
                    this.i = this.l;
                    P();
                    return;
                }
                if (c2 == '\"') {
                    this.i = this.l;
                    R();
                    return;
                } else if (c2 == '[') {
                    this.h = 14;
                    q();
                    return;
                } else if (c2 == '{') {
                    this.h = 12;
                    q();
                    return;
                }
            } else if (i == 4) {
                char c3 = this.k;
                if (c3 == '\"') {
                    this.i = this.l;
                    R();
                    return;
                } else if (c3 >= '0' && c3 <= '9') {
                    this.i = this.l;
                    P();
                    return;
                } else if (c3 == '{') {
                    this.h = 12;
                    int i2 = this.l + 1;
                    this.l = i2;
                    this.k = i2 < this.y ? this.x.charAt(i2) : (char) 26;
                    return;
                }
            } else if (i == 12) {
                char c4 = this.k;
                if (c4 == '{') {
                    this.h = 12;
                    int i3 = this.l + 1;
                    this.l = i3;
                    this.k = i3 < this.y ? this.x.charAt(i3) : (char) 26;
                    return;
                }
                if (c4 == '[') {
                    this.h = 14;
                    int i4 = this.l + 1;
                    this.l = i4;
                    this.k = i4 < this.y ? this.x.charAt(i4) : (char) 26;
                    return;
                }
            } else {
                if (i == 18) {
                    r();
                    return;
                }
                if (i != 20) {
                    switch (i) {
                        case 14:
                            char c5 = this.k;
                            if (c5 == '[') {
                                this.h = 14;
                                q();
                            } else if (c5 == '{') {
                                this.h = 12;
                                q();
                            }
                            break;
                        case 15:
                            if (this.k == ']') {
                                this.h = 15;
                                q();
                            }
                            if (this.k == 26) {
                                this.h = 20;
                            }
                            break;
                        case 16:
                            char c6 = this.k;
                            if (c6 == ',') {
                                this.h = 16;
                                int i5 = this.l + 1;
                                this.l = i5;
                                this.k = i5 < this.y ? this.x.charAt(i5) : (char) 26;
                            } else if (c6 == '}') {
                                this.h = 13;
                                int i6 = this.l + 1;
                                this.l = i6;
                                this.k = i6 < this.y ? this.x.charAt(i6) : (char) 26;
                            } else if (c6 == ']') {
                                this.h = 15;
                                int i7 = this.l + 1;
                                this.l = i7;
                                this.k = i7 < this.y ? this.x.charAt(i7) : (char) 26;
                            } else if (c6 == 26) {
                                this.h = 20;
                            }
                            break;
                    }
                    return;
                }
                if (this.k == 26) {
                    this.h = 20;
                    return;
                }
            }
            char c7 = this.k;
            if (c7 != ' ' && c7 != '\n' && c7 != '\r' && c7 != '\t' && c7 != '\f' && c7 != '\b') {
                s();
                return;
            }
            q();
        }
    }

    public final void u(char c2) {
        this.o = 0;
        while (true) {
            char c3 = this.k;
            if (c3 == c2) {
                int i = this.l + 1;
                this.l = i;
                this.k = i >= this.y ? (char) 26 : this.x.charAt(i);
                s();
                return;
            }
            if (c3 != ' ' && c3 != '\n' && c3 != '\r' && c3 != '\t' && c3 != '\f' && c3 != '\b') {
                throw new c.a.a.d("not match " + c2 + " - " + this.k);
            }
            q();
        }
    }

    public final String v() {
        char cCharAt = this.x.charAt((this.r + this.o) - 1);
        int i = this.o;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        return c0(this.r, i);
    }

    public boolean x() {
        boolean z = false;
        int i = 1;
        if (this.x.startsWith("false", this.l)) {
            i = 5;
        } else if (this.x.startsWith("true", this.l)) {
            z = true;
            i = 4;
        } else {
            char c2 = this.k;
            if (c2 == '1') {
                z = true;
            } else if (c2 != '0') {
                this.w = -1;
                return false;
            }
        }
        int i2 = this.l + i;
        this.l = i2;
        this.k = b(i2);
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x010c A[PHI: r13
      0x010c: PHI (r13v32 int) = (r13v27 int), (r13v31 int), (r13v35 int) binds: [B:76:0x013a, B:72:0x0128, B:65:0x0109] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0115  */
    /* JADX WARN: Code duplicated, block: B:71:0x0119  */
    /* JADX WARN: Code duplicated, block: B:74:0x012b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x012d  */
    /* JADX WARN: Code duplicated, block: B:78:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x013f  */
    /* JADX WARN: Code duplicated, block: B:82:0x014d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0150  */
    public boolean y(long j) {
        int i;
        boolean z;
        int i2;
        int i3;
        char cCharAt;
        char cCharAt2;
        int i4;
        char cB;
        int i5;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return false;
        }
        if (!this.x.startsWith("false", this.l + iP)) {
            if (this.x.startsWith("true", this.l + iP)) {
                i = iP + 4;
            } else if (this.x.startsWith("\"false\"", this.l + iP)) {
                i = iP + 7;
            } else if (this.x.startsWith("\"true\"", this.l + iP)) {
                i = iP + 6;
            } else if (this.x.charAt(this.l + iP) == '1') {
                i = iP + 1;
            } else if (this.x.charAt(this.l + iP) == '0') {
                i = iP + 1;
            } else if (this.x.startsWith("\"1\"", this.l + iP)) {
                i = iP + 3;
            } else {
                if (!this.x.startsWith("\"0\"", this.l + iP)) {
                    this.w = -1;
                    return false;
                }
                i = iP + 3;
            }
            z = true;
            i2 = i + 1;
            i3 = this.l + i;
            cCharAt = 26;
            if (i3 >= this.y) {
                cCharAt2 = 26;
            } else {
                cCharAt2 = this.x.charAt(i3);
            }
            while (cCharAt2 != ',') {
                if (cCharAt2 != '}' || (cCharAt2 != ' ' && cCharAt2 != '\n' && cCharAt2 != '\r' && cCharAt2 != '\t' && cCharAt2 != '\f' && cCharAt2 != '\b')) {
                    break;
                    if (cCharAt2 == '}') {
                        this.w = -1;
                        return false;
                    }
                    i4 = i2 + 1;
                    cB = b(this.l + i2);
                    if (cB == ',') {
                        this.h = 16;
                        int i6 = this.l + (i4 - 1);
                        this.l = i6;
                        i5 = i6 + 1;
                        this.l = i5;
                        if (i5 < this.y) {
                            cCharAt = this.x.charAt(i5);
                        }
                    } else if (cB == ']') {
                        this.h = 15;
                        int i7 = this.l + (i4 - 1);
                        this.l = i7;
                        i5 = i7 + 1;
                        this.l = i5;
                        if (i5 < this.y) {
                            cCharAt = this.x.charAt(i5);
                        }
                    } else if (cB == '}') {
                        this.h = 13;
                        int i8 = this.l + (i4 - 1);
                        this.l = i8;
                        i5 = i8 + 1;
                        this.l = i5;
                        if (i5 < this.y) {
                            cCharAt = this.x.charAt(i5);
                        }
                    } else {
                        if (cB == 26) {
                            this.w = -1;
                            return false;
                        }
                        this.h = 20;
                        this.l += i4 - 1;
                    }
                    this.k = cCharAt;
                    this.w = 4;
                    return z;
                }
                int i9 = i2 + 1;
                int i10 = this.l + i2;
                cCharAt2 = i10 >= this.y ? (char) 26 : this.x.charAt(i10);
                i2 = i9;
            }
            int i11 = this.l + (i2 - 1);
            this.l = i11;
            int i12 = i11 + 1;
            this.l = i12;
            this.k = i12 < this.y ? this.x.charAt(i12) : (char) 26;
            this.w = 3;
            this.h = 16;
            return z;
        }
        i = iP + 5;
        z = false;
        i2 = i + 1;
        i3 = this.l + i;
        cCharAt = 26;
        if (i3 >= this.y) {
            cCharAt2 = 26;
        } else {
            cCharAt2 = this.x.charAt(i3);
        }
        while (true) {
            if (cCharAt2 != '}') {
                break;
            }
            i2 = i9;
        }
        if (cCharAt2 == '}') {
            this.w = -1;
            return false;
        }
        i4 = i2 + 1;
        cB = b(this.l + i2);
        if (cB == ',') {
            this.h = 16;
            int i13 = this.l + (i4 - 1);
            this.l = i13;
            i5 = i13 + 1;
            this.l = i5;
            if (i5 < this.y) {
                cCharAt = this.x.charAt(i5);
            }
        } else if (cB == ']') {
            this.h = 15;
            int i14 = this.l + (i4 - 1);
            this.l = i14;
            i5 = i14 + 1;
            this.l = i5;
            if (i5 < this.y) {
                cCharAt = this.x.charAt(i5);
            }
        } else if (cB == '}') {
            this.h = 13;
            int i15 = this.l + (i4 - 1);
            this.l = i15;
            i5 = i15 + 1;
            this.l = i5;
            if (i5 < this.y) {
                cCharAt = this.x.charAt(i5);
            }
        } else {
            if (cB == 26) {
                this.w = -1;
                return false;
            }
            this.h = 20;
            this.l += i4 - 1;
        }
        this.k = cCharAt;
        this.w = 4;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0103 A[PHI: r14
      0x0103: PHI (r14v34 int) = (r14v28 int), (r14v32 int), (r14v37 int) binds: [B:77:0x0137, B:73:0x0121, B:66:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    public Date z(long j) {
        int i;
        char cCharAt;
        char cCharAt2;
        int i2;
        Date date;
        int i3;
        this.w = 0;
        int iP = p(j);
        if (iP == 0) {
            return null;
        }
        int i4 = this.l;
        char c2 = this.k;
        int i5 = iP + 1;
        int i6 = iP + i4;
        char cCharAt3 = 26;
        char cCharAt4 = i6 >= this.y ? (char) 26 : this.x.charAt(i6);
        if (cCharAt4 == '\"') {
            int i7 = this.l;
            int i8 = i7 + i5;
            int i9 = i5 + 1;
            int i10 = i7 + i5;
            if (i10 < this.y) {
                this.x.charAt(i10);
            }
            int iIndexOf = this.x.indexOf(34, this.l + i9);
            if (iIndexOf == -1) {
                throw new c.a.a.d("unclosed str");
            }
            int i11 = iIndexOf - i8;
            this.l = i8;
            if (M(false, i11)) {
                date = this.v.getTime();
                int i12 = i9 + i11;
                i2 = i12 + 1;
                cCharAt2 = b(i12 + i4);
                this.l = i4;
            } else {
                this.l = i4;
            }
            this.w = -1;
            return null;
        }
        if (cCharAt4 < '0' || cCharAt4 > '9') {
            this.w = -1;
            return null;
        }
        long j2 = cCharAt4 - '0';
        while (true) {
            i = i5 + 1;
            int i13 = this.l + i5;
            cCharAt = i13 >= this.y ? (char) 26 : this.x.charAt(i13);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j2 = (j2 * 10) + ((long) (cCharAt - '0'));
            i5 = i;
        }
        if (cCharAt == '.') {
            this.w = -1;
            return null;
        }
        if (cCharAt == '\"') {
            int i14 = i + 1;
            int i15 = this.l + i;
            cCharAt2 = i15 >= this.y ? (char) 26 : this.x.charAt(i15);
            i2 = i14;
        } else {
            cCharAt2 = cCharAt;
            i2 = i;
        }
        if (j2 < 0) {
            this.w = -1;
            return null;
        }
        date = new Date(j2);
        if (cCharAt2 == ',') {
            int i16 = this.l + (i2 - 1);
            this.l = i16;
            int i17 = i16 + 1;
            this.l = i17;
            this.k = i17 < this.y ? this.x.charAt(i17) : (char) 26;
            this.w = 3;
            this.h = 16;
            return date;
        }
        if (cCharAt2 == '}') {
            int i18 = i2 + 1;
            char cB = b(this.l + i2);
            if (cB == ',') {
                this.h = 16;
                int i19 = this.l + (i18 - 1);
                this.l = i19;
                i3 = i19 + 1;
                this.l = i3;
                if (i3 < this.y) {
                    cCharAt3 = this.x.charAt(i3);
                }
            } else if (cB == ']') {
                this.h = 15;
                int i20 = this.l + (i18 - 1);
                this.l = i20;
                i3 = i20 + 1;
                this.l = i3;
                if (i3 < this.y) {
                    cCharAt3 = this.x.charAt(i3);
                }
            } else if (cB == '}') {
                this.h = 13;
                int i21 = this.l + (i18 - 1);
                this.l = i21;
                i3 = i21 + 1;
                this.l = i3;
                if (i3 < this.y) {
                    cCharAt3 = this.x.charAt(i3);
                }
            } else if (cB == 26) {
                this.h = 20;
                this.l += i18 - 1;
            }
            this.k = cCharAt3;
            this.w = 4;
            return date;
        }
        this.l = i4;
        this.k = c2;
        this.w = -1;
        return null;
    }
}
