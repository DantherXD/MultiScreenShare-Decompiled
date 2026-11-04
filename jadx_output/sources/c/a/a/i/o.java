package c.a.a.i;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a[] f2481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2482b;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f2483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final char[] f2484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f2485c;

        a(String str, int i) {
            this.f2483a = str;
            this.f2484b = str.toCharArray();
            this.f2485c = i;
        }
    }

    public o(int i) {
        this.f2482b = i - 1;
        this.f2481a = new a[i];
        a("$ref", 0, 4, 1185263);
        a("@type", 0, 5, 62680954);
    }

    private static String c(String str, int i, int i2) {
        char[] cArr = new char[i2];
        str.getChars(i, i2 + i, cArr, 0);
        return new String(cArr);
    }

    public String a(String str, int i, int i2, int i3) {
        int i4 = this.f2482b & i3;
        a aVar = this.f2481a[i4];
        if (aVar != null) {
            return (i3 == aVar.f2485c && i2 == aVar.f2484b.length && str.regionMatches(i, aVar.f2483a, 0, i2)) ? aVar.f2483a : c(str, i, i2);
        }
        if (i2 != str.length()) {
            str = c(str, i, i2);
        }
        String strIntern = str.intern();
        this.f2481a[i4] = new a(strIntern, i3);
        return strIntern;
    }

    public String b(char[] cArr, int i, int i2, int i3) {
        int i4 = this.f2482b & i3;
        a aVar = this.f2481a[i4];
        if (aVar == null) {
            String strIntern = new String(cArr, i, i2).intern();
            this.f2481a[i4] = new a(strIntern, i3);
            return strIntern;
        }
        boolean z = false;
        if (i3 == aVar.f2485c && i2 == aVar.f2484b.length) {
            for (int i5 = 0; i5 < i2; i5++) {
                if (cArr[i + i5] == aVar.f2484b[i5]) {
                }
            }
            z = true;
        }
        return z ? aVar.f2483a : new String(cArr, i, i2);
    }
}
