package c.b.b.i.b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f2853a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int[] a(c.b.b.j.a aVar, int i, int i2) {
        int[] iArr = new int[i2];
        int iG = aVar.g() / i;
        for (int i3 = 0; i3 < iG; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4 |= aVar.f((i3 * i) + i5) ? 1 << ((i - i5) - 1) : 0;
            }
            iArr[i3] = i4;
        }
        return iArr;
    }

    private static void b(c.b.b.j.b bVar, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 <= i6) {
                    bVar.g(i5, i4);
                    bVar.g(i5, i6);
                    bVar.g(i4, i5);
                    bVar.g(i6, i5);
                    i5++;
                }
            }
        }
        int i7 = i - i2;
        bVar.g(i7, i7);
        int i8 = i7 + 1;
        bVar.g(i8, i7);
        bVar.g(i7, i8);
        int i9 = i + i2;
        bVar.g(i9, i7);
        bVar.g(i9, i8);
        bVar.g(i9, i9 - 1);
    }

    private static void c(c.b.b.j.b bVar, boolean z, int i, c.b.b.j.a aVar) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (aVar.f(i3)) {
                    bVar.g(i4, i2 - 5);
                }
                if (aVar.f(i3 + 7)) {
                    bVar.g(i2 + 5, i4);
                }
                if (aVar.f(20 - i3)) {
                    bVar.g(i4, i2 + 5);
                }
                if (aVar.f(27 - i3)) {
                    bVar.g(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (aVar.f(i3)) {
                bVar.g(i5, i2 - 7);
            }
            if (aVar.f(i3 + 10)) {
                bVar.g(i2 + 7, i5);
            }
            if (aVar.f(29 - i3)) {
                bVar.g(i5, i2 + 7);
            }
            if (aVar.f(39 - i3)) {
                bVar.g(i2 - 7, i5);
            }
            i3++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static a d(byte[] bArr, int i, int i2) {
        c.b.b.j.a aVarH;
        int i3;
        boolean z;
        int iAbs;
        int i4;
        int i5;
        c.b.b.j.a aVarA = new d(bArr).a();
        int iG = ((aVarA.g() * i) / 100) + 11;
        int iG2 = aVarA.g() + iG;
        int i6 = 0;
        int i7 = 1;
        if (i2 != 0) {
            boolean z2 = i2 < 0;
            iAbs = Math.abs(i2);
            if (iAbs > (z2 ? 4 : 32)) {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i2)));
            }
            i4 = i(iAbs, z2);
            i3 = f2853a[iAbs];
            int i8 = i4 - (i4 % i3);
            aVarH = h(aVarA, i3);
            if (aVarH.g() + iG > i8) {
                z = z2;
                throw new IllegalArgumentException("Data to large for user specified layer");
            }
            if (z2) {
                z = z2;
                if (aVarH.g() > (i3 << 6)) {
                    throw new IllegalArgumentException("Data to large for user specified layer");
                }
            }
        } else {
            c.b.b.j.a aVarH2 = null;
            int i9 = 0;
            int i10 = 0;
            while (true) {
                if (i9 > 32) {
                    throw new IllegalArgumentException("Data too large for an Aztec code");
                }
                boolean z3 = i9 <= 3 ? i7 : i6;
                int i11 = z3 != 0 ? i9 + 1 : i9;
                int i12 = i(i11, z3);
                if (iG2 <= i12) {
                    if (aVarH2 == null || i10 != f2853a[i11]) {
                        int i13 = f2853a[i11];
                        i10 = i13;
                        aVarH2 = h(aVarA, i13);
                    }
                    int i14 = i12 - (i12 % i10);
                    if ((z3 == 0 || aVarH2.g() <= (i10 << 6)) && aVarH2.g() + iG <= i14) {
                        aVarH = aVarH2;
                        i3 = i10;
                        z = z3;
                        iAbs = i11;
                        i4 = i12;
                        break;
                    }
                }
                i9++;
                i7 = i7;
                i6 = 0;
            }
        }
        c.b.b.j.a aVarE = e(aVarH, i4, i3);
        int iG3 = aVarH.g() / i3;
        c.b.b.j.a aVarF = f(z, iAbs, iG3);
        int i15 = (z ? 11 : 14) + (iAbs << 2);
        int[] iArr = new int[i15];
        int i16 = 2;
        if (z) {
            for (int i17 = i6; i17 < i15; i17++) {
                iArr[i17] = i17;
            }
            i5 = i15;
        } else {
            int i18 = i15 / 2;
            i5 = i15 + 1 + (((i18 - 1) / 15) * 2);
            int i19 = i5 / 2;
            for (int i20 = i6; i20 < i18; i20++) {
                int i21 = (i20 / 15) + i20;
                iArr[(i18 - i20) - i7] = (i19 - i21) - 1;
                iArr[i18 + i20] = i21 + i19 + i7;
            }
        }
        c.b.b.j.b bVar = new c.b.b.j.b(i5);
        int i22 = i6;
        int i23 = i22;
        while (i22 < iAbs) {
            int i24 = ((iAbs - i22) << i16) + (z ? 9 : 12);
            int i25 = i6;
            while (i25 < i24) {
                int i26 = i25 << 1;
                while (i6 < i16) {
                    if (aVarE.f(i23 + i26 + i6)) {
                        int i27 = i22 << 1;
                        bVar.g(iArr[i27 + i6], iArr[i27 + i25]);
                    }
                    if (aVarE.f((i24 << 1) + i23 + i26 + i6)) {
                        int i28 = i22 << 1;
                        bVar.g(iArr[i28 + i25], iArr[((i15 - 1) - i28) - i6]);
                    }
                    if (aVarE.f((i24 << 2) + i23 + i26 + i6)) {
                        int i29 = (i15 - 1) - (i22 << 1);
                        bVar.g(iArr[i29 - i6], iArr[i29 - i25]);
                    }
                    if (aVarE.f((i24 * 6) + i23 + i26 + i6)) {
                        int i30 = i22 << 1;
                        bVar.g(iArr[((i15 - 1) - i30) - i25], iArr[i30 + i6]);
                    }
                    i6++;
                    i16 = 2;
                }
                i25++;
                i6 = 0;
                i16 = 2;
            }
            i23 += i24 << 3;
            i22++;
            i6 = 0;
            i16 = 2;
        }
        c(bVar, z, i5, aVarF);
        int i31 = i5 / 2;
        if (z) {
            b(bVar, i31, 5);
        } else {
            b(bVar, i31, 7);
            int i32 = 0;
            int i33 = 0;
            while (i33 < (i15 / 2) - 1) {
                for (int i34 = i31 & 1; i34 < i5; i34 += 2) {
                    int i35 = i31 - i32;
                    bVar.g(i35, i34);
                    int i36 = i31 + i32;
                    bVar.g(i36, i34);
                    bVar.g(i34, i35);
                    bVar.g(i34, i36);
                }
                i33 += 15;
                i32 += 16;
            }
        }
        a aVar = new a();
        aVar.c(z);
        aVar.f(i5);
        aVar.d(iAbs);
        aVar.b(iG3);
        aVar.e(bVar);
        return aVar;
    }

    private static c.b.b.j.a e(c.b.b.j.a aVar, int i, int i2) {
        int iG = aVar.g() / i2;
        c.b.b.j.d.c cVar = new c.b.b.j.d.c(g(i2));
        int i3 = i / i2;
        int[] iArrA = a(aVar, i2, i3);
        cVar.b(iArrA, i3 - iG);
        c.b.b.j.a aVar2 = new c.b.b.j.a();
        aVar2.c(0, i % i2);
        for (int i4 : iArrA) {
            aVar2.c(i4, i2);
        }
        return aVar2;
    }

    static c.b.b.j.a f(boolean z, int i, int i2) {
        int i3;
        c.b.b.j.a aVar = new c.b.b.j.a();
        int i4 = i - 1;
        if (z) {
            aVar.c(i4, 2);
            aVar.c(i2 - 1, 6);
            i3 = 28;
        } else {
            aVar.c(i4, 5);
            aVar.c(i2 - 1, 11);
            i3 = 40;
        }
        return e(aVar, i3, 4);
    }

    private static c.b.b.j.d.a g(int i) {
        if (i == 4) {
            return c.b.b.j.d.a.f2883d;
        }
        if (i == 6) {
            return c.b.b.j.d.a.f2882c;
        }
        if (i == 8) {
            return c.b.b.j.d.a.g;
        }
        if (i == 10) {
            return c.b.b.j.d.a.f2881b;
        }
        if (i == 12) {
            return c.b.b.j.d.a.f2880a;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    static c.b.b.j.a h(c.b.b.j.a aVar, int i) {
        c.b.b.j.a aVar2 = new c.b.b.j.a();
        int iG = aVar.g();
        int i2 = (1 << i) - 2;
        int i3 = 0;
        while (i3 < iG) {
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = i3 + i5;
                if (i6 >= iG || aVar.f(i6)) {
                    i4 |= 1 << ((i - 1) - i5);
                }
            }
            int i7 = i4 & i2;
            if (i7 == i2) {
                aVar2.c(i7, i);
                i3--;
            } else if (i7 == 0) {
                i7 = i4 | 1;
                aVar2.c(i7, i);
                i3--;
            } else {
                aVar2.c(i4, i);
            }
            i3 += i;
        }
        return aVar2;
    }

    private static int i(int i, boolean z) {
        return ((z ? 88 : 112) + (i << 4)) * i;
    }
}
