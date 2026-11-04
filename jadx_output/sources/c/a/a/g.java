package c.a.a;

/* JADX INFO: loaded from: classes.dex */
public enum g {
    CamelCase,
    PascalCase,
    SnakeCase,
    KebabCase;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2426a;

        static {
            int[] iArr = new int[g.values().length];
            f2426a = iArr;
            try {
                iArr[g.SnakeCase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2426a[g.KebabCase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2426a[g.PascalCase.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2426a[g.CamelCase.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public String a(String str) {
        char cCharAt;
        int i = a.f2426a[ordinal()];
        int i2 = 0;
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            while (i2 < str.length()) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    cCharAt2 = (char) (cCharAt2 + ' ');
                    if (i2 > 0) {
                        sb.append('_');
                    }
                }
                sb.append(cCharAt2);
                i2++;
            }
            return sb.toString();
        }
        if (i == 2) {
            StringBuilder sb2 = new StringBuilder();
            while (i2 < str.length()) {
                char cCharAt3 = str.charAt(i2);
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    cCharAt3 = (char) (cCharAt3 + ' ');
                    if (i2 > 0) {
                        sb2.append('-');
                    }
                }
                sb2.append(cCharAt3);
                i2++;
            }
            return sb2.toString();
        }
        if (i != 3) {
            if (i != 4 || (cCharAt = str.charAt(0)) < 'A' || cCharAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        }
        char cCharAt4 = str.charAt(0);
        if (cCharAt4 < 'a' || cCharAt4 > 'z') {
            return str;
        }
        char[] charArray2 = str.toCharArray();
        charArray2[0] = (char) (charArray2[0] - ' ');
        return new String(charArray2);
    }
}
