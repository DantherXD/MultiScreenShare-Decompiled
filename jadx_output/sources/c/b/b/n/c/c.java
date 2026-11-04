package c.b.b.n.c;

import c.b.b.h;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2995a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2996a;

        static {
            int[] iArr = new int[c.b.b.n.b.b.values().length];
            f2996a = iArr;
            try {
                iArr[c.b.b.n.b.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2996a[c.b.b.n.b.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2996a[c.b.b.n.b.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2996a[c.b.b.n.b.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static void a(String str, c.b.b.j.a aVar, String str2) throws h {
        try {
            for (byte b2 : str.getBytes(str2)) {
                aVar.c(b2, 8);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new h(e2);
        }
    }

    static void b(CharSequence charSequence, c.b.b.j.a aVar) throws h {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iP = p(charSequence.charAt(i));
            if (iP == -1) {
                throw new h();
            }
            int i2 = i + 1;
            if (i2 < length) {
                int iP2 = p(charSequence.charAt(i2));
                if (iP2 == -1) {
                    throw new h();
                }
                aVar.c((iP * 45) + iP2, 11);
                i += 2;
            } else {
                aVar.c(iP, 6);
                i = i2;
            }
        }
    }

    static void c(String str, c.b.b.n.b.b bVar, c.b.b.j.a aVar, String str2) throws h {
        int i = a.f2996a[bVar.ordinal()];
        if (i == 1) {
            h(str, aVar);
            return;
        }
        if (i == 2) {
            b(str, aVar);
        } else if (i == 3) {
            a(str, aVar, str2);
        } else {
            if (i != 4) {
                throw new h("Invalid mode: ".concat(String.valueOf(bVar)));
            }
            e(str, aVar);
        }
    }

    private static void d(c.b.b.j.c cVar, c.b.b.j.a aVar) {
        aVar.c(c.b.b.n.b.b.ECI.a(), 4);
        aVar.c(cVar.b(), 8);
    }

    static void e(String str, c.b.b.j.a aVar) throws h {
        int i;
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            for (int i2 = 0; i2 < length; i2 += 2) {
                int i3 = ((bytes[i2] & 255) << 8) | (bytes[i2 + 1] & 255);
                int i4 = 33088;
                if (i3 >= 33088 && i3 <= 40956) {
                    i = i3 - i4;
                } else if (i3 < 57408 || i3 > 60351) {
                    i = -1;
                } else {
                    i4 = 49472;
                    i = i3 - i4;
                }
                if (i == -1) {
                    throw new h("Invalid byte sequence");
                }
                aVar.c(((i >> 8) * 192) + (i & 255), 13);
            }
        } catch (UnsupportedEncodingException e2) {
            throw new h(e2);
        }
    }

    static void f(int i, c.b.b.n.b.c cVar, c.b.b.n.b.b bVar, c.b.b.j.a aVar) throws h {
        int iB = bVar.b(cVar);
        int i2 = 1 << iB;
        if (i < i2) {
            aVar.c(i, iB);
            return;
        }
        throw new h(i + " is bigger than " + (i2 - 1));
    }

    static void g(c.b.b.n.b.b bVar, c.b.b.j.a aVar) {
        aVar.c(bVar.a(), 4);
    }

    static void h(CharSequence charSequence, c.b.b.j.a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int iCharAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.c((iCharAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.c((iCharAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.c(iCharAt, 4);
                }
            }
        }
    }

    private static int i(c.b.b.n.b.b bVar, c.b.b.j.a aVar, c.b.b.j.a aVar2, c.b.b.n.b.c cVar) {
        return aVar.g() + bVar.b(cVar) + aVar2.g();
    }

    private static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(c.b.b.j.a aVar, c.b.b.n.b.a aVar2, c.b.b.n.b.c cVar, b bVar) throws h {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            e.a(aVar, aVar2, cVar, i3, bVar);
            int iJ = j(bVar);
            if (iJ < i) {
                i2 = i3;
                i = iJ;
            }
        }
        return i2;
    }

    private static c.b.b.n.b.b l(String str, String str2) {
        if ("Shift_JIS".equals(str2) && s(str)) {
            return c.b.b.n.b.b.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z2 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return c.b.b.n.b.b.BYTE;
                }
                z = true;
            }
        }
        if (z) {
            return c.b.b.n.b.b.ALPHANUMERIC;
        }
        return z2 ? c.b.b.n.b.b.NUMERIC : c.b.b.n.b.b.BYTE;
    }

    private static c.b.b.n.b.c m(int i, c.b.b.n.b.a aVar) throws h {
        for (int i2 = 1; i2 <= 40; i2++) {
            c.b.b.n.b.c cVarE = c.b.b.n.b.c.e(i2);
            if (v(i, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    public static f n(String str, c.b.b.n.b.a aVar, Map<c.b.b.c, ?> map) throws h {
        c.b.b.n.b.c cVarT;
        c.b.b.j.c cVarA;
        boolean z = map != null && map.containsKey(c.b.b.c.CHARACTER_SET);
        String string = z ? map.get(c.b.b.c.CHARACTER_SET).toString() : "ISO-8859-1";
        c.b.b.n.b.b bVarL = l(str, string);
        c.b.b.j.a aVar2 = new c.b.b.j.a();
        c.b.b.n.b.b bVar = c.b.b.n.b.b.BYTE;
        if (bVarL == bVar && z && (cVarA = c.b.b.j.c.a(string)) != null) {
            d(cVarA, aVar2);
        }
        if ((map != null && map.containsKey(c.b.b.c.GS1_FORMAT)) && Boolean.valueOf(map.get(c.b.b.c.GS1_FORMAT).toString()).booleanValue()) {
            g(c.b.b.n.b.b.FNC1_FIRST_POSITION, aVar2);
        }
        g(bVarL, aVar2);
        c.b.b.j.a aVar3 = new c.b.b.j.a();
        c(str, bVarL, aVar3, string);
        if (map != null) {
            c.b.b.c cVar = c.b.b.c.QR_VERSION;
            if (map.containsKey(cVar)) {
                cVarT = c.b.b.n.b.c.e(Integer.parseInt(map.get(cVar).toString()));
                if (!v(i(bVarL, aVar2, aVar3, cVarT), cVarT, aVar)) {
                    throw new h("Data too big for requested version");
                }
            } else {
                cVarT = t(aVar, bVarL, aVar2, aVar3);
            }
        } else {
            cVarT = t(aVar, bVarL, aVar2, aVar3);
        }
        c.b.b.j.a aVar4 = new c.b.b.j.a();
        aVar4.b(aVar2);
        f(bVarL == bVar ? aVar3.h() : str.length(), cVarT, bVarL, aVar4);
        aVar4.b(aVar3);
        c.b.b.n.b.c.b bVarC = cVarT.c(aVar);
        int iD = cVarT.d() - bVarC.d();
        u(iD, aVar4);
        c.b.b.j.a aVarR = r(aVar4, cVarT.d(), iD, bVarC.c());
        f fVar = new f();
        fVar.c(aVar);
        fVar.f(bVarL);
        fVar.g(cVarT);
        int iB = cVarT.b();
        b bVar2 = new b(iB, iB);
        int iK = k(aVarR, aVar, cVarT, bVar2);
        fVar.d(iK);
        e.a(aVarR, aVar, cVarT, iK, bVar2);
        fVar.e(bVar2);
        return fVar;
    }

    static byte[] o(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[length + i];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new c.b.b.j.d.c(c.b.b.j.d.a.f2884e).b(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    static int p(int i) {
        int[] iArr = f2995a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    static void q(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws h {
        if (i4 >= i3) {
            throw new h("Block ID too large");
        }
        int i5 = i % i3;
        int i6 = i3 - i5;
        int i7 = i / i3;
        int i8 = i7 + 1;
        int i9 = i2 / i3;
        int i10 = i9 + 1;
        int i11 = i7 - i9;
        int i12 = i8 - i10;
        if (i11 != i12) {
            throw new h("EC bytes mismatch");
        }
        if (i3 != i6 + i5) {
            throw new h("RS blocks mismatch");
        }
        if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
            throw new h("Total bytes mismatch");
        }
        if (i4 < i6) {
            iArr[0] = i9;
            iArr2[0] = i11;
        } else {
            iArr[0] = i10;
            iArr2[0] = i12;
        }
    }

    static c.b.b.j.a r(c.b.b.j.a aVar, int i, int i2, int i3) throws h {
        if (aVar.h() != i2) {
            throw new h("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        int iMax = 0;
        int iMax2 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            q(i, i2, i3, i5, iArr, iArr2);
            int i6 = iArr[0];
            byte[] bArr = new byte[i6];
            aVar.j(i4 << 3, bArr, 0, i6);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new c.b.b.n.c.a(bArr, bArrO));
            iMax = Math.max(iMax, i6);
            iMax2 = Math.max(iMax2, bArrO.length);
            i4 += iArr[0];
        }
        if (i2 != i4) {
            throw new h("Data bytes does not match offset");
        }
        c.b.b.j.a aVar2 = new c.b.b.j.a();
        for (int i7 = 0; i7 < iMax; i7++) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byte[] bArrA = ((c.b.b.n.c.a) it.next()).a();
                if (i7 < bArrA.length) {
                    aVar2.c(bArrA[i7], 8);
                }
            }
        }
        for (int i8 = 0; i8 < iMax2; i8++) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byte[] bArrB = ((c.b.b.n.c.a) it2.next()).b();
                if (i8 < bArrB.length) {
                    aVar2.c(bArrB[i8], 8);
                }
            }
        }
        if (i == aVar2.h()) {
            return aVar2;
        }
        throw new h("Interleaving error: " + i + " and " + aVar2.h() + " differ.");
    }

    private static boolean s(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    private static c.b.b.n.b.c t(c.b.b.n.b.a aVar, c.b.b.n.b.b bVar, c.b.b.j.a aVar2, c.b.b.j.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, c.b.b.n.b.c.e(1)), aVar)), aVar);
    }

    static void u(int i, c.b.b.j.a aVar) throws h {
        int i2 = i << 3;
        if (aVar.g() > i2) {
            throw new h("data bits cannot fit in the QR Code" + aVar.g() + " > " + i2);
        }
        for (int i3 = 0; i3 < 4 && aVar.g() < i2; i3++) {
            aVar.a(false);
        }
        int iG = aVar.g() & 7;
        if (iG > 0) {
            while (iG < 8) {
                aVar.a(false);
                iG++;
            }
        }
        int iH = i - aVar.h();
        for (int i4 = 0; i4 < iH; i4++) {
            aVar.c((i4 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.g() != i2) {
            throw new h("Bits size does not equal capacity");
        }
    }

    private static boolean v(int i, c.b.b.n.b.c cVar, c.b.b.n.b.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i + 7) / 8;
    }
}
