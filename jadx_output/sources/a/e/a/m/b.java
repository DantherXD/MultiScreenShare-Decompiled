package a.e.a.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b {
    /* JADX WARN: Code duplicated, block: B:100:0x016f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0172  */
    /* JADX WARN: Code duplicated, block: B:104:0x0178  */
    /* JADX WARN: Code duplicated, block: B:106:0x0199  */
    /* JADX WARN: Code duplicated, block: B:195:0x0330  */
    /* JADX WARN: Code duplicated, block: B:197:0x0339  */
    /* JADX WARN: Code duplicated, block: B:200:0x0342  */
    /* JADX WARN: Code duplicated, block: B:203:0x034e  */
    /* JADX WARN: Code duplicated, block: B:206:0x035e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:223:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[PHI: r15 r16
      0x0044: PHI (r15v3 boolean) = (r15v1 boolean), (r15v32 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0044: PHI (r16v3 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046 A[PHI: r15 r16
      0x0046: PHI (r15v30 boolean) = (r15v1 boolean), (r15v32 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]
      0x0046: PHI (r16v5 boolean) = (r16v1 boolean), (r16v7 boolean) binds: [B:24:0x0042, B:15:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:326:0x03a7 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r39v0, types: [a.e.a.d] */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29, types: [a.e.a.i] */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [a.e.a.m.e] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    static void a(f fVar, a.e.a.d dVar, int i, int i2, c cVar) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        int i3;
        int i4;
        d dVar2;
        a.e.a.i iVar;
        a.e.a.i iVar2;
        d dVar3;
        int i5;
        int iE;
        d dVar4;
        a.e.a.i iVar3;
        ?? r5;
        a.e.a.i iVar4;
        int size;
        d dVar5;
        int i6;
        int i7 = i;
        e eVar = cVar.f290a;
        e eVar2 = cVar.f292c;
        e eVar3 = cVar.f291b;
        e eVar4 = cVar.f293d;
        e eVar5 = cVar.f294e;
        float f2 = cVar.k;
        boolean z4 = fVar.a0[i7] == e.b.WRAP_CONTENT;
        if (i7 == 0) {
            int i8 = eVar5.z0;
            z = i8 == 0;
            z2 = i8 == 1;
            if (i8 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        } else {
            int i9 = eVar5.A0;
            z = i9 == 0;
            z2 = i9 == 1;
            if (i9 == 2) {
                z3 = true;
            } else {
                z3 = false;
            }
        }
        ?? r7 = eVar;
        boolean z5 = false;
        while (true) {
            obj = null;
            if (z5) {
                break;
            }
            d dVar6 = r7.X[i2];
            int i10 = z3 ? 1 : 4;
            int iE2 = dVar6.e();
            float f3 = f2;
            e.b bVar = r7.a0[i7];
            boolean z6 = z5;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z7 = bVar == bVar2 && r7.z[i7] == 0;
            d dVar7 = dVar6.f301f;
            if (dVar7 != null && r7 != eVar) {
                iE2 += dVar7.e();
            }
            int i11 = iE2;
            if (z3 && r7 != eVar && r7 != eVar3) {
                i10 = 8;
            }
            d dVar8 = dVar6.f301f;
            e eVar6 = eVar;
            if (dVar8 != null) {
                if (r7 == eVar3) {
                    dVar.h(dVar6.i, dVar8.i, i11, 6);
                } else {
                    dVar.h(dVar6.i, dVar8.i, i11, 8);
                }
                if (z7 && !z3) {
                    i10 = 5;
                }
                dVar.e(dVar6.i, dVar6.f301f.i, i11, (r7 == eVar3 && z3 && r7.f0(i7)) ? 5 : i10);
            }
            if (z4) {
                if (r7.T() == 8 || r7.a0[i7] != bVar2) {
                    i6 = 0;
                } else {
                    d[] dVarArr = r7.X;
                    i6 = 0;
                    dVar.h(dVarArr[i2 + 1].i, dVarArr[i2].i, 0, 5);
                }
                dVar.h(r7.X[i2].i, fVar.X[i2].i, i6, 8);
            }
            d dVar9 = r7.X[i2 + 1].f301f;
            if (dVar9 != null) {
                e eVar7 = dVar9.f299d;
                d[] dVarArr2 = eVar7.X;
                if (dVarArr2[i2].f301f != null && dVarArr2[i2].f301f.f299d == r7) {
                    obj = eVar7;
                }
            }
            if (obj != null) {
                r7 = obj;
                z5 = z6;
            } else {
                z5 = true;
            }
            eVar5 = eVar5;
            f2 = f3;
            z = z;
            eVar = eVar6;
            r7 = r7;
        }
        e eVar8 = eVar5;
        float f4 = f2;
        e eVar9 = eVar;
        boolean z8 = z;
        if (eVar4 != null) {
            int i12 = i2 + 1;
            if (eVar2.X[i12].f301f != null) {
                d dVar10 = eVar4.X[i12];
                if ((eVar4.a0[i7] == e.b.MATCH_CONSTRAINT && eVar4.z[i7] == 0) && !z3) {
                    d dVar11 = dVar10.f301f;
                    if (dVar11.f299d == fVar) {
                        dVar.e(dVar10.i, dVar11.i, -dVar10.e(), 5);
                    } else if (z3) {
                        dVar5 = dVar10.f301f;
                        if (dVar5.f299d == fVar) {
                            dVar.e(dVar10.i, dVar5.i, -dVar10.e(), 4);
                        }
                    }
                } else if (z3) {
                    dVar5 = dVar10.f301f;
                    if (dVar5.f299d == fVar) {
                        dVar.e(dVar10.i, dVar5.i, -dVar10.e(), 4);
                    }
                }
                dVar.j(dVar10.i, eVar2.X[i12].f301f.i, -dVar10.e(), 6);
            }
        }
        if (z4) {
            int i13 = i2 + 1;
            a.e.a.i iVar5 = fVar.X[i13].i;
            d[] dVarArr3 = eVar2.X;
            dVar.h(iVar5, dVarArr3[i13].i, dVarArr3[i13].e(), 8);
        }
        ArrayList<e> arrayList = cVar.h;
        if (arrayList != null && (size = arrayList.size()) > 1) {
            float f5 = (!cVar.r || cVar.t) ? f4 : cVar.j;
            float f6 = 0.0f;
            float f7 = 0.0f;
            e eVar10 = null;
            int i14 = 0;
            while (i14 < size) {
                e eVar11 = arrayList.get(i14);
                float f8 = eVar11.D0[i7];
                if (f8 < f6) {
                    if (cVar.t) {
                        d[] dVarArr4 = eVar11.X;
                        dVar.e(dVarArr4[i2 + 1].i, dVarArr4[i2].i, 0, 4);
                    } else {
                        f8 = 1.0f;
                        f6 = 0.0f;
                    }
                    arrayList = arrayList;
                    size = size;
                    i14++;
                    size = size;
                    arrayList = arrayList;
                    f6 = 0.0f;
                }
                if (f8 == f6) {
                    d[] dVarArr5 = eVar11.X;
                    dVar.e(dVarArr5[i2 + 1].i, dVarArr5[i2].i, 0, 8);
                    arrayList = arrayList;
                    size = size;
                } else {
                    if (eVar10 != null) {
                        d[] dVarArr6 = eVar10.X;
                        a.e.a.i iVar6 = dVarArr6[i2].i;
                        int i15 = i2 + 1;
                        a.e.a.i iVar7 = dVarArr6[i15].i;
                        d[] dVarArr7 = eVar11.X;
                        a.e.a.i iVar8 = dVarArr7[i2].i;
                        a.e.a.i iVar9 = dVarArr7[i15].i;
                        a.e.a.b bVarR = dVar.r();
                        bVarR.l(f7, f5, f8, iVar6, iVar7, iVar8, iVar9);
                        dVar.d(bVarR);
                    }
                    f7 = f8;
                    eVar10 = eVar11;
                }
                i14++;
                size = size;
                arrayList = arrayList;
                f6 = 0.0f;
            }
        }
        if (eVar3 != null && (eVar3 == eVar4 || z3)) {
            d dVar12 = eVar9.X[i2];
            int i16 = i2 + 1;
            d dVar13 = eVar2.X[i16];
            d dVar14 = dVar12.f301f;
            a.e.a.i iVar10 = dVar14 != null ? dVar14.i : null;
            d dVar15 = dVar13.f301f;
            a.e.a.i iVar11 = dVar15 != null ? dVar15.i : null;
            d dVar16 = eVar3.X[i2];
            if (eVar4 != null) {
                dVar13 = eVar4.X[i16];
            }
            if (iVar10 != null && iVar11 != null) {
                dVar.c(dVar16.i, iVar10, dVar16.e(), i7 == 0 ? eVar8.p0 : eVar8.q0, iVar11, dVar13.i, dVar13.e(), 7);
            }
        } else if (!z8 || eVar3 == null) {
            int i17 = 8;
            if (z2 && eVar3 != null) {
                int i18 = cVar.j;
                boolean z9 = i18 > 0 && cVar.i == i18;
                e eVar12 = eVar3;
                e eVar13 = eVar12;
                while (eVar13 != null) {
                    e eVar14 = eVar13.F0[i7];
                    while (eVar14 != null && eVar14.T() == i17) {
                        eVar14 = eVar14.F0[i7];
                    }
                    if (eVar13 == eVar3 || eVar13 == eVar4 || eVar14 == null) {
                        eVar12 = eVar12;
                        i4 = i17;
                    } else {
                        e eVar15 = eVar14 == eVar4 ? null : eVar14;
                        d dVar17 = eVar13.X[i2];
                        a.e.a.i iVar12 = dVar17.i;
                        d dVar18 = dVar17.f301f;
                        if (dVar18 != null) {
                            a.e.a.i iVar13 = dVar18.i;
                        }
                        int i19 = i2 + 1;
                        a.e.a.i iVar14 = eVar12.X[i19].i;
                        int iE3 = dVar17.e();
                        int iE4 = eVar13.X[i19].e();
                        if (eVar15 != null) {
                            dVar2 = eVar15.X[i2];
                            a.e.a.i iVar15 = dVar2.i;
                            d dVar19 = dVar2.f301f;
                            iVar2 = dVar19 != null ? dVar19.i : null;
                            iVar = iVar15;
                        } else {
                            dVar2 = eVar4.X[i2];
                            iVar = dVar2 != null ? dVar2.i : null;
                            iVar2 = eVar13.X[i19].i;
                        }
                        if (dVar2 != null) {
                            iE4 += dVar2.e();
                        }
                        int i20 = iE4;
                        int iE5 = eVar12.X[i19].e() + iE3;
                        int i21 = z9 ? 8 : 4;
                        if (iVar12 == null || iVar14 == null || iVar == null || iVar2 == null) {
                            i4 = 8;
                        } else {
                            i4 = 8;
                            dVar.c(iVar12, iVar14, iE5, 0.5f, iVar, iVar2, i20, i21);
                        }
                        eVar14 = eVar15;
                    }
                    eVar12 = eVar13.T() != i4 ? eVar13 : eVar12;
                    eVar13 = eVar14;
                    i17 = i4;
                    i7 = i;
                }
                d dVar20 = eVar3.X[i2];
                d dVar21 = eVar9.X[i2].f301f;
                int i22 = i2 + 1;
                d dVar22 = eVar4.X[i22];
                d dVar23 = eVar2.X[i22].f301f;
                if (dVar21 == null) {
                    i3 = 5;
                } else if (eVar3 != eVar4) {
                    i3 = 5;
                    dVar.e(dVar20.i, dVar21.i, dVar20.e(), 5);
                } else {
                    i3 = 5;
                    if (dVar23 != null) {
                        dVar.c(dVar20.i, dVar21.i, dVar20.e(), 0.5f, dVar22.i, dVar23.i, dVar22.e(), 5);
                    }
                }
                if (dVar23 != null && eVar3 != eVar4) {
                    dVar.e(dVar22.i, dVar23.i, -dVar22.e(), i3);
                }
            }
        } else {
            int i23 = cVar.j;
            boolean z10 = i23 > 0 && cVar.i == i23;
            e eVar16 = eVar3;
            e eVar17 = eVar16;
            while (eVar17 != null) {
                e eVar18 = eVar17.F0[i7];
                while (eVar18 != null && eVar18.T() == 8) {
                    eVar18 = eVar18.F0[i7];
                }
                if (eVar18 != null || eVar17 == eVar4) {
                    d dVar24 = eVar17.X[i2];
                    a.e.a.i iVar16 = dVar24.i;
                    d dVar25 = dVar24.f301f;
                    a.e.a.i iVar17 = dVar25 != null ? dVar25.i : null;
                    if (eVar16 != eVar17) {
                        dVar3 = eVar16.X[i2 + 1];
                    } else {
                        if (eVar17 == eVar3) {
                            d[] dVarArr8 = eVar9.X;
                            if (dVarArr8[i2].f301f != null) {
                                dVar3 = dVarArr8[i2].f301f;
                            } else {
                                iVar17 = null;
                            }
                        }
                        int iE6 = dVar24.e();
                        i5 = i2 + 1;
                        iE = eVar17.X[i5].e();
                        if (eVar18 != null) {
                            dVar4 = eVar18.X[i2];
                        } else {
                            dVar4 = eVar2.X[i5].f301f;
                            if (dVar4 != null) {
                                iVar3 = null;
                            }
                            a.e.a.i iVar18 = eVar17.X[i5].i;
                            if (dVar4 != null) {
                                iE += dVar4.e();
                            }
                            int iE7 = iE6 + eVar16.X[i5].e();
                            if (iVar16 == null && iVar17 != null && iVar3 != null && iVar18 != null) {
                                if (eVar17 == eVar3) {
                                    iE7 = eVar3.X[i2].e();
                                }
                                eVar18 = eVar18;
                                dVar.c(iVar16, iVar17, iE7, 0.5f, iVar3, iVar18, eVar17 == eVar4 ? eVar4.X[i5].e() : iE, z10 ? 8 : 5);
                            }
                            if (eVar17.T() != 8) {
                                eVar17 = eVar16;
                            }
                            eVar16 = eVar17;
                            eVar17 = eVar18;
                        }
                        iVar3 = dVar4.i;
                        a.e.a.i iVar19 = eVar17.X[i5].i;
                        if (dVar4 != null) {
                            iE += dVar4.e();
                        }
                        int iE8 = iE6 + eVar16.X[i5].e();
                        if (iVar16 == null) {
                        }
                    }
                    iVar17 = dVar3.i;
                    int iE9 = dVar24.e();
                    i5 = i2 + 1;
                    iE = eVar17.X[i5].e();
                    if (eVar18 != null) {
                        dVar4 = eVar18.X[i2];
                    } else {
                        dVar4 = eVar2.X[i5].f301f;
                        if (dVar4 != null) {
                            iVar3 = null;
                        }
                        a.e.a.i iVar110 = eVar17.X[i5].i;
                        if (dVar4 != null) {
                            iE += dVar4.e();
                        }
                        int iE10 = iE9 + eVar16.X[i5].e();
                        if (iVar16 == null) {
                        }
                    }
                    iVar3 = dVar4.i;
                    a.e.a.i iVar111 = eVar17.X[i5].i;
                    if (dVar4 != null) {
                        iE += dVar4.e();
                    }
                    int iE11 = iE9 + eVar16.X[i5].e();
                    if (iVar16 == null) {
                    }
                }
                if (eVar17.T() != 8) {
                    eVar17 = eVar16;
                }
                eVar16 = eVar17;
                eVar17 = eVar18;
            }
        }
        if ((!z8 && !z2) || eVar3 == null || eVar3 == eVar4) {
            return;
        }
        d[] dVarArr9 = eVar3.X;
        d dVar26 = dVarArr9[i2];
        if (eVar4 == null) {
            eVar4 = eVar3;
        }
        int i24 = i2 + 1;
        d dVar27 = eVar4.X[i24];
        d dVar28 = dVar26.f301f;
        a.e.a.i iVar20 = dVar28 != null ? dVar28.i : null;
        d dVar29 = dVar27.f301f;
        if (dVar29 != null) {
            iVar4 = dVar29.i;
        } else {
            r5 = 0;
        }
        if (eVar2 != eVar4) {
            d dVar30 = eVar2.X[i24].f301f;
            if (dVar30 != null) {
                r5 = iVar4;
                obj = dVar30.i;
            }
            r5 = iVar4;
            r5 = obj;
        }
        if (eVar3 == eVar4) {
            dVar26 = dVarArr9[i2];
            dVar27 = dVarArr9[i24];
        }
        if (iVar20 == null || r5 == 0) {
            return;
        }
        dVar.c(dVar26.i, iVar20, dVar26.e(), 0.5f, r5, dVar27.i, eVar4.X[i24].e(), 5);
    }

    public static void b(f fVar, a.e.a.d dVar, ArrayList<e> arrayList, int i) {
        c[] cVarArr;
        int i2;
        int i3;
        if (i == 0) {
            i3 = fVar.W0;
            cVarArr = fVar.Z0;
            i2 = 0;
        } else {
            int i4 = fVar.X0;
            cVarArr = fVar.Y0;
            i2 = 2;
            i3 = i4;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            c cVar = cVarArr[i5];
            cVar.a();
            if (arrayList == null || arrayList.contains(cVar.f290a)) {
                a(fVar, dVar, i, i2, cVar);
            }
        }
    }
}
