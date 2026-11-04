package androidx.recyclerview.widget;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a f2341a;

    interface a {
        void a(androidx.recyclerview.widget.a.b bVar);

        androidx.recyclerview.widget.a.b b(int i, int i2, int i3, Object obj);
    }

    h(a aVar) {
        this.f2341a = aVar;
    }

    private int a(List<androidx.recyclerview.widget.a.b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (list.get(size).f2262a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    private void c(List<androidx.recyclerview.widget.a.b> list, int i, androidx.recyclerview.widget.a.b bVar, int i2, androidx.recyclerview.widget.a.b bVar2) {
        int i3 = bVar.f2265d;
        int i4 = bVar2.f2263b;
        int i5 = i3 < i4 ? -1 : 0;
        int i6 = bVar.f2263b;
        if (i6 < i4) {
            i5++;
        }
        if (i4 <= i6) {
            bVar.f2263b = i6 + bVar2.f2265d;
        }
        int i7 = bVar2.f2263b;
        if (i7 <= i3) {
            bVar.f2265d = i3 + bVar2.f2265d;
        }
        bVar2.f2263b = i7 + i5;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    private void d(List<androidx.recyclerview.widget.a.b> list, int i, int i2) {
        androidx.recyclerview.widget.a.b bVar = list.get(i);
        androidx.recyclerview.widget.a.b bVar2 = list.get(i2);
        int i3 = bVar2.f2262a;
        if (i3 == 1) {
            c(list, i, bVar, i2, bVar2);
        } else if (i3 == 2) {
            e(list, i, bVar, i2, bVar2);
        } else {
            if (i3 != 4) {
                return;
            }
            f(list, i, bVar, i2, bVar2);
        }
    }

    void b(List<androidx.recyclerview.widget.a.b> list) {
        while (true) {
            int iA = a(list);
            if (iA == -1) {
                return;
            } else {
                d(list, iA, iA + 1);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00ca A[PHI: r9
      0x00ca: PHI (r9v9 int) = (r9v3 int), (r9v13 int) binds: [B:58:0x00c8, B:45:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    void e(List<androidx.recyclerview.widget.a.b> list, int i, androidx.recyclerview.widget.a.b bVar, int i2, androidx.recyclerview.widget.a.b bVar2) {
        boolean z;
        int i3;
        int i4 = bVar.f2263b;
        int i5 = bVar.f2265d;
        boolean z2 = false;
        int i6 = bVar2.f2263b;
        if (i4 < i5) {
            if (i6 == i4 && bVar2.f2265d == i5 - i4) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
        } else if (i6 == i5 + 1 && bVar2.f2265d == i4 - i5) {
            z = true;
            z2 = true;
        } else {
            z = true;
        }
        int i7 = bVar2.f2263b;
        if (i5 < i7) {
            bVar2.f2263b = i7 - 1;
        } else {
            int i8 = bVar2.f2265d;
            if (i5 < i7 + i8) {
                bVar2.f2265d = i8 - 1;
                bVar.f2262a = 2;
                bVar.f2265d = 1;
                if (bVar2.f2265d == 0) {
                    list.remove(i2);
                    this.f2341a.a(bVar2);
                    return;
                }
                return;
            }
        }
        int i9 = bVar.f2263b;
        int i10 = bVar2.f2263b;
        androidx.recyclerview.widget.a.b bVarB = null;
        if (i9 <= i10) {
            bVar2.f2263b = i10 + 1;
        } else {
            int i11 = bVar2.f2265d;
            if (i9 < i10 + i11) {
                bVarB = this.f2341a.b(2, i9 + 1, (i10 + i11) - i9, null);
                bVar2.f2265d = bVar.f2263b - bVar2.f2263b;
            }
        }
        if (z2) {
            list.set(i, bVar2);
            list.remove(i2);
            this.f2341a.a(bVar);
            return;
        }
        if (z) {
            if (bVarB != null) {
                int i12 = bVar.f2263b;
                if (i12 > bVarB.f2263b) {
                    bVar.f2263b = i12 - bVarB.f2265d;
                }
                int i13 = bVar.f2265d;
                if (i13 > bVarB.f2263b) {
                    bVar.f2265d = i13 - bVarB.f2265d;
                }
            }
            int i14 = bVar.f2263b;
            if (i14 > bVar2.f2263b) {
                bVar.f2263b = i14 - bVar2.f2265d;
            }
            i3 = bVar.f2265d;
            if (i3 > bVar2.f2263b) {
                bVar.f2265d = i3 - bVar2.f2265d;
            }
        } else {
            if (bVarB != null) {
                int i15 = bVar.f2263b;
                if (i15 >= bVarB.f2263b) {
                    bVar.f2263b = i15 - bVarB.f2265d;
                }
                int i16 = bVar.f2265d;
                if (i16 >= bVarB.f2263b) {
                    bVar.f2265d = i16 - bVarB.f2265d;
                }
            }
            int i17 = bVar.f2263b;
            if (i17 >= bVar2.f2263b) {
                bVar.f2263b = i17 - bVar2.f2265d;
            }
            i3 = bVar.f2265d;
            if (i3 >= bVar2.f2263b) {
                bVar.f2265d = i3 - bVar2.f2265d;
            }
        }
        list.set(i, bVar2);
        if (bVar.f2263b != bVar.f2265d) {
            list.set(i2, bVar);
        } else {
            list.remove(i2);
        }
        if (bVarB != null) {
            list.add(i, bVarB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:17:0x0048  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0056  */
    /* JADX WARN: Code duplicated, block: B:22:0x005b  */
    /* JADX WARN: Code duplicated, block: B:24:? A[RETURN, SYNTHETIC] */
    void f(List<androidx.recyclerview.widget.a.b> list, int i, androidx.recyclerview.widget.a.b bVar, int i2, androidx.recyclerview.widget.a.b bVar2) {
        androidx.recyclerview.widget.a.b bVarB;
        int i3;
        int i4;
        int i5;
        int i6 = bVar.f2265d;
        int i7 = bVar2.f2263b;
        androidx.recyclerview.widget.a.b bVarB2 = null;
        if (i6 >= i7) {
            int i8 = bVar2.f2265d;
            if (i6 < i7 + i8) {
                bVar2.f2265d = i8 - 1;
                bVarB = this.f2341a.b(4, bVar.f2263b, 1, bVar2.f2264c);
            }
            i3 = bVar.f2263b;
            i4 = bVar2.f2263b;
            if (i3 <= i4) {
                bVar2.f2263b = i4 + 1;
            } else {
                i5 = bVar2.f2265d;
                if (i3 < i4 + i5) {
                    int i9 = (i4 + i5) - i3;
                    bVarB2 = this.f2341a.b(4, i3 + 1, i9, bVar2.f2264c);
                    bVar2.f2265d -= i9;
                }
            }
            list.set(i2, bVar);
            if (bVar2.f2265d > 0) {
                list.set(i, bVar2);
            } else {
                list.remove(i);
                this.f2341a.a(bVar2);
            }
            if (bVarB != null) {
                list.add(i, bVarB);
            }
            if (bVarB2 != null) {
                list.add(i, bVarB2);
            }
        }
        bVar2.f2263b = i7 - 1;
        bVarB = null;
        i3 = bVar.f2263b;
        i4 = bVar2.f2263b;
        if (i3 <= i4) {
            bVar2.f2263b = i4 + 1;
        } else {
            i5 = bVar2.f2265d;
            if (i3 < i4 + i5) {
                int i10 = (i4 + i5) - i3;
                bVarB2 = this.f2341a.b(4, i3 + 1, i10, bVar2.f2264c);
                bVar2.f2265d -= i10;
            }
        }
        list.set(i2, bVar);
        if (bVar2.f2265d > 0) {
            list.set(i, bVar2);
        } else {
            list.remove(i);
            this.f2341a.a(bVar2);
        }
        if (bVarB != null) {
            list.add(i, bVarB);
        }
        if (bVarB2 != null) {
            list.add(i, bVarB2);
        }
    }
}
