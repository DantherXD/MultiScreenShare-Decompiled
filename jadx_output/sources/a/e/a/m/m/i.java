package a.e.a.m.m;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class i {
    public static o a(a.e.a.m.e eVar, int i, ArrayList<o> arrayList, o oVar) {
        a.e.a.m.d dVar;
        int iP1;
        int i2 = i == 0 ? eVar.I0 : eVar.J0;
        if (i2 != -1 && (oVar == null || i2 != oVar.f362c)) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                o oVar2 = arrayList.get(i3);
                if (oVar2.c() == i2) {
                    if (oVar != null) {
                        oVar.g(i, oVar2);
                        arrayList.remove(oVar);
                    }
                    oVar = oVar2;
                    break;
                }
            }
        } else if (i2 != -1) {
            return oVar;
        }
        if (oVar == null) {
            if ((eVar instanceof a.e.a.m.i) && (iP1 = ((a.e.a.m.i) eVar).p1(i)) != -1) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    o oVar3 = arrayList.get(i4);
                    if (oVar3.c() == iP1) {
                        oVar = oVar3;
                        break;
                    }
                }
            }
            if (oVar == null) {
                oVar = new o(i);
            }
            arrayList.add(oVar);
        }
        if (oVar.a(eVar)) {
            if (eVar instanceof a.e.a.m.g) {
                a.e.a.m.g gVar = (a.e.a.m.g) eVar;
                gVar.o1().b(gVar.p1() == 0 ? 1 : 0, arrayList, oVar);
            }
            int iC = oVar.c();
            if (i == 0) {
                eVar.I0 = iC;
                eVar.P.b(i, arrayList, oVar);
                dVar = eVar.R;
            } else {
                eVar.J0 = iC;
                eVar.Q.b(i, arrayList, oVar);
                eVar.T.b(i, arrayList, oVar);
                dVar = eVar.S;
            }
            dVar.b(i, arrayList, oVar);
            eVar.W.b(i, arrayList, oVar);
        }
        return oVar;
    }

    private static o b(ArrayList<o> arrayList, int i) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            o oVar = arrayList.get(i2);
            if (i == oVar.f362c) {
                return oVar;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x0347  */
    public static boolean c(a.e.a.m.f fVar, b.InterfaceC0006b interfaceC0006b) {
        o oVar;
        boolean z;
        boolean z2;
        o oVar2;
        Object obj;
        ArrayList<a.e.a.m.e> arrayListO1 = fVar.o1();
        int size = arrayListO1.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a.e.a.m.e eVar = arrayListO1.get(i2);
            if (!d(fVar.y(), fVar.R(), eVar.y(), eVar.R())) {
                return false;
            }
        }
        if (fVar.Q0 != null) {
            throw null;
        }
        int i3 = 0;
        ArrayList arrayList = null;
        ArrayList<a.e.a.m.i> arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList<a.e.a.m.i> arrayList4 = null;
        ArrayList arrayList5 = null;
        ArrayList arrayList6 = null;
        while (i3 < size) {
            a.e.a.m.e eVar2 = arrayListO1.get(i3);
            if (!d(fVar.y(), fVar.R(), eVar2.y(), eVar2.R())) {
                a.e.a.m.f.O1(i, eVar2, interfaceC0006b, fVar.p1, b.a.f326a);
            }
            boolean z3 = eVar2 instanceof a.e.a.m.g;
            if (z3) {
                a.e.a.m.g gVar = (a.e.a.m.g) eVar2;
                if (gVar.p1() == 0) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(gVar);
                }
                if (gVar.p1() == 1) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(gVar);
                }
            }
            if (eVar2 instanceof a.e.a.m.i) {
                if (eVar2 instanceof a.e.a.m.a) {
                    a.e.a.m.a aVar = (a.e.a.m.a) eVar2;
                    if (aVar.u1() == 0) {
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        arrayList2.add(aVar);
                    }
                    int iU1 = aVar.u1();
                    obj = aVar;
                    if (iU1 == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            obj = aVar;
                        }
                    }
                } else {
                    a.e.a.m.i iVar = (a.e.a.m.i) eVar2;
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(iVar);
                    obj = iVar;
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        obj = iVar;
                    }
                }
                arrayList4.add(obj);
            }
            if (eVar2.P.f301f == null && eVar2.R.f301f == null && !z3 && !(eVar2 instanceof a.e.a.m.a)) {
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                }
                arrayList5.add(eVar2);
            }
            if (eVar2.Q.f301f == null && eVar2.S.f301f == null && eVar2.T.f301f == null && !z3 && !(eVar2 instanceof a.e.a.m.a)) {
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                }
                arrayList6.add(eVar2);
            }
            i3++;
            i = 0;
        }
        ArrayList<o> arrayList7 = new ArrayList<>();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a((a.e.a.m.g) it.next(), 0, arrayList7, null);
            }
        }
        int i4 = 0;
        o oVar3 = null;
        if (arrayList2 != null) {
            for (a.e.a.m.i iVar2 : arrayList2) {
                o oVarA = a(iVar2, i4, arrayList7, oVar3);
                iVar2.o1(arrayList7, i4, oVarA);
                oVarA.b(arrayList7);
                i4 = 0;
                oVar3 = null;
            }
        }
        a.e.a.m.d dVarM = fVar.m(a.e.a.m.d.b.LEFT);
        if (dVarM.c() != null) {
            Iterator<a.e.a.m.d> it2 = dVarM.c().iterator();
            while (it2.hasNext()) {
                a(it2.next().f299d, 0, arrayList7, null);
            }
        }
        a.e.a.m.d dVarM2 = fVar.m(a.e.a.m.d.b.RIGHT);
        if (dVarM2.c() != null) {
            Iterator<a.e.a.m.d> it3 = dVarM2.c().iterator();
            while (it3.hasNext()) {
                a(it3.next().f299d, 0, arrayList7, null);
            }
        }
        a.e.a.m.d dVarM3 = fVar.m(a.e.a.m.d.b.CENTER);
        if (dVarM3.c() != null) {
            Iterator<a.e.a.m.d> it4 = dVarM3.c().iterator();
            while (it4.hasNext()) {
                a(it4.next().f299d, 0, arrayList7, null);
            }
        }
        o oVar4 = null;
        if (arrayList5 != null) {
            Iterator it5 = arrayList5.iterator();
            while (it5.hasNext()) {
                a((a.e.a.m.e) it5.next(), 0, arrayList7, null);
            }
        }
        if (arrayList3 != null) {
            Iterator it6 = arrayList3.iterator();
            while (it6.hasNext()) {
                a((a.e.a.m.g) it6.next(), 1, arrayList7, null);
            }
        }
        int i5 = 1;
        if (arrayList4 != null) {
            for (a.e.a.m.i iVar3 : arrayList4) {
                o oVarA2 = a(iVar3, i5, arrayList7, oVar4);
                iVar3.o1(arrayList7, i5, oVarA2);
                oVarA2.b(arrayList7);
                i5 = 1;
                oVar4 = null;
            }
        }
        a.e.a.m.d dVarM4 = fVar.m(a.e.a.m.d.b.TOP);
        if (dVarM4.c() != null) {
            Iterator<a.e.a.m.d> it7 = dVarM4.c().iterator();
            while (it7.hasNext()) {
                a(it7.next().f299d, 1, arrayList7, null);
            }
        }
        a.e.a.m.d dVarM5 = fVar.m(a.e.a.m.d.b.BASELINE);
        if (dVarM5.c() != null) {
            Iterator<a.e.a.m.d> it8 = dVarM5.c().iterator();
            while (it8.hasNext()) {
                a(it8.next().f299d, 1, arrayList7, null);
            }
        }
        a.e.a.m.d dVarM6 = fVar.m(a.e.a.m.d.b.BOTTOM);
        if (dVarM6.c() != null) {
            Iterator<a.e.a.m.d> it9 = dVarM6.c().iterator();
            while (it9.hasNext()) {
                a(it9.next().f299d, 1, arrayList7, null);
            }
        }
        a.e.a.m.d dVarM7 = fVar.m(a.e.a.m.d.b.CENTER);
        if (dVarM7.c() != null) {
            Iterator<a.e.a.m.d> it10 = dVarM7.c().iterator();
            while (it10.hasNext()) {
                a(it10.next().f299d, 1, arrayList7, null);
            }
        }
        if (arrayList6 != null) {
            Iterator it11 = arrayList6.iterator();
            while (it11.hasNext()) {
                a((a.e.a.m.e) it11.next(), 1, arrayList7, null);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            a.e.a.m.e eVar3 = arrayListO1.get(i6);
            if (eVar3.q0()) {
                o oVarB = b(arrayList7, eVar3.I0);
                o oVarB2 = b(arrayList7, eVar3.J0);
                if (oVarB != null && oVarB2 != null) {
                    oVarB.g(0, oVarB2);
                    oVarB2.i(2);
                    arrayList7.remove(oVarB);
                }
            }
        }
        if (arrayList7.size() <= 1) {
            return false;
        }
        if (fVar.y() == a.e.a.m.e.b.WRAP_CONTENT) {
            int i7 = 0;
            oVar = null;
            for (o oVar5 : arrayList7) {
                if (oVar5.d() != 1) {
                    oVar5.h(false);
                    int iF = oVar5.f(fVar.H1(), 0);
                    if (iF > i7) {
                        oVar = oVar5;
                        i7 = iF;
                    }
                }
            }
            if (oVar != null) {
                fVar.M0(a.e.a.m.e.b.FIXED);
                fVar.h1(i7);
                oVar.h(true);
            } else {
                oVar = null;
            }
        } else {
            oVar = null;
        }
        if (fVar.R() == a.e.a.m.e.b.WRAP_CONTENT) {
            o oVar6 = null;
            int i8 = 0;
            for (o oVar7 : arrayList7) {
                if (oVar7.d() != 0) {
                    oVar7.h(false);
                    int iF2 = oVar7.f(fVar.H1(), 1);
                    if (iF2 > i8) {
                        oVar6 = oVar7;
                        i8 = iF2;
                    }
                }
            }
            z = false;
            z2 = true;
            if (oVar6 != null) {
                fVar.d1(a.e.a.m.e.b.FIXED);
                fVar.I0(i8);
                oVar6.h(true);
                oVar2 = oVar6;
            }
            return (oVar == null || oVar2 != null) ? z2 : z;
        }
        z = false;
        z2 = true;
        oVar2 = null;
        if (oVar == null) {
        }
    }

    public static boolean d(a.e.a.m.e.b bVar, a.e.a.m.e.b bVar2, a.e.a.m.e.b bVar3, a.e.a.m.e.b bVar4) {
        a.e.a.m.e.b bVar5;
        a.e.a.m.e.b bVar6;
        a.e.a.m.e.b bVar7 = a.e.a.m.e.b.FIXED;
        return (bVar3 == bVar7 || bVar3 == (bVar6 = a.e.a.m.e.b.WRAP_CONTENT) || (bVar3 == a.e.a.m.e.b.MATCH_PARENT && bVar != bVar6)) || (bVar4 == bVar7 || bVar4 == (bVar5 = a.e.a.m.e.b.WRAP_CONTENT) || (bVar4 == a.e.a.m.e.b.MATCH_PARENT && bVar2 != bVar5));
    }
}
