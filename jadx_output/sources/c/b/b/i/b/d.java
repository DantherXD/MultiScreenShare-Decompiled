package c.b.b.i.b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String[] f2854a = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int[][] f2855b = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[][] f2856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int[][] f2857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f2858e;

    class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.d() - fVar2.d();
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) int.class, 5, 256);
        f2856c = iArr;
        iArr[0][32] = 1;
        for (int i = 65; i <= 90; i++) {
            f2856c[0][i] = (i - 65) + 2;
        }
        f2856c[1][32] = 1;
        for (int i2 = 97; i2 <= 122; i2++) {
            f2856c[1][i2] = (i2 - 97) + 2;
        }
        f2856c[2][32] = 1;
        for (int i3 = 48; i3 <= 57; i3++) {
            f2856c[2][i3] = (i3 - 48) + 2;
        }
        int[][] iArr2 = f2856c;
        iArr2[2][44] = 12;
        iArr2[2][46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i4 = 0; i4 < 28; i4++) {
            f2856c[3][iArr3[i4]] = i4;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i5 = 0; i5 < 31; i5++) {
            if (iArr4[i5] > 0) {
                f2856c[4][iArr4[i5]] = i5;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) int.class, 6, 6);
        f2857d = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f2857d;
        iArr7[0][4] = 0;
        iArr7[1][4] = 0;
        iArr7[1][0] = 28;
        iArr7[3][4] = 0;
        iArr7[2][4] = 0;
        iArr7[2][0] = 15;
    }

    public d(byte[] bArr) {
        this.f2858e = bArr;
    }

    private static Collection<f> b(Iterable<f> iterable) {
        LinkedList linkedList = new LinkedList();
        for (f fVar : iterable) {
            boolean z = true;
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                f fVar2 = (f) it.next();
                if (fVar2.f(fVar)) {
                    z = false;
                    break;
                }
                if (fVar.f(fVar2)) {
                    it.remove();
                }
            }
            if (z) {
                linkedList.add(fVar);
            }
        }
        return linkedList;
    }

    private void c(f fVar, int i, Collection<f> collection) {
        char c2 = (char) (this.f2858e[i] & 255);
        boolean z = f2856c[fVar.e()][c2] > 0;
        f fVarB = null;
        for (int i2 = 0; i2 <= 4; i2++) {
            int i3 = f2856c[i2][c2];
            if (i3 > 0) {
                if (fVarB == null) {
                    fVarB = fVar.b(i);
                }
                if (!z || i2 == fVar.e() || i2 == 2) {
                    collection.add(fVarB.g(i2, i3));
                }
                if (!z && f2857d[fVar.e()][i2] >= 0) {
                    collection.add(fVarB.h(i2, i3));
                }
            }
        }
        if (fVar.c() > 0 || f2856c[fVar.e()][c2] == 0) {
            collection.add(fVar.a(i));
        }
    }

    private static void d(f fVar, int i, int i2, Collection<f> collection) {
        f fVarB = fVar.b(i);
        collection.add(fVarB.g(4, i2));
        if (fVar.e() != 4) {
            collection.add(fVarB.h(4, i2));
        }
        if (i2 == 3 || i2 == 4) {
            collection.add(fVarB.g(2, 16 - i2).g(2, 1));
        }
        if (fVar.c() > 0) {
            collection.add(fVar.a(i).a(i + 1));
        }
    }

    private Collection<f> e(Iterable<f> iterable, int i) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next(), i, linkedList);
        }
        return b(linkedList);
    }

    private static Collection<f> f(Iterable<f> iterable, int i, int i2) {
        LinkedList linkedList = new LinkedList();
        Iterator<f> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next(), i, i2, linkedList);
        }
        return b(linkedList);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public c.b.b.j.a a() {
        int i;
        Collection<f> collectionSingletonList = Collections.singletonList(f.f2862a);
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f2858e;
            if (i2 >= bArr.length) {
                return ((f) Collections.min(collectionSingletonList, new a())).i(this.f2858e);
            }
            int i3 = i2 + 1;
            byte b2 = i3 < bArr.length ? bArr[i3] : (byte) 0;
            byte b3 = bArr[i2];
            if (b3 != 13) {
                if (b3 != 44) {
                    if (b3 != 46) {
                        if (b3 == 58 && b2 == 32) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                    } else if (b2 == 32) {
                        i = 3;
                    } else {
                        i = 0;
                    }
                } else if (b2 == 32) {
                    i = 4;
                } else {
                    i = 0;
                }
            } else if (b2 == 10) {
                i = 2;
            } else {
                i = 0;
            }
            if (i > 0) {
                collectionSingletonList = f(collectionSingletonList, i2, i);
                i2 = i3;
            } else {
                collectionSingletonList = e(collectionSingletonList, i2);
            }
            i2++;
        }
    }
}
