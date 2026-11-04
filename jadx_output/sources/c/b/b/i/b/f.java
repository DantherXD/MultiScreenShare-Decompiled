package c.b.b.i.b;

import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final f f2862a = new f(g.f2867a, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f2863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final g f2864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f2865d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f2866e;

    private f(g gVar, int i, int i2, int i3) {
        this.f2864c = gVar;
        this.f2863b = i;
        this.f2865d = i2;
        this.f2866e = i3;
    }

    f a(int i) {
        int i2;
        g gVarA = this.f2864c;
        int i3 = this.f2863b;
        int i4 = this.f2866e;
        if (i3 == 4 || i3 == 2) {
            int i5 = d.f2855b[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVarA = gVarA.a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f2865d;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else {
            i2 = i8 == 62 ? 9 : 8;
        }
        f fVar = new f(gVarA, i3, i8 + 1, i4 + i2);
        return fVar.f2865d == 2078 ? fVar.b(i + 1) : fVar;
    }

    f b(int i) {
        int i2 = this.f2865d;
        return i2 == 0 ? this : new f(this.f2864c.b(i - i2, i2), this.f2863b, 0, this.f2866e);
    }

    int c() {
        return this.f2865d;
    }

    int d() {
        return this.f2866e;
    }

    int e() {
        return this.f2863b;
    }

    boolean f(f fVar) {
        int i;
        int i2 = this.f2866e + (d.f2855b[this.f2863b][fVar.f2863b] >> 16);
        int i3 = fVar.f2865d;
        if (i3 > 0 && ((i = this.f2865d) == 0 || i > i3)) {
            i2 += 10;
        }
        return i2 <= fVar.f2866e;
    }

    f g(int i, int i2) {
        int i3 = this.f2866e;
        g gVarA = this.f2864c;
        int i4 = this.f2863b;
        if (i != i4) {
            int i5 = d.f2855b[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            gVarA = gVarA.a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new f(gVarA.a(i2, i8), i, 0, i3 + i8);
    }

    f h(int i, int i2) {
        g gVar = this.f2864c;
        int i3 = this.f2863b;
        int i4 = i3 == 2 ? 4 : 5;
        return new f(gVar.a(d.f2857d[i3][i], i4).a(i2, 5), this.f2863b, 0, this.f2866e + i4 + 5);
    }

    c.b.b.j.a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVarD = b(bArr.length).f2864c; gVarD != null; gVarD = gVarD.d()) {
            linkedList.addFirst(gVarD);
        }
        c.b.b.j.a aVar = new c.b.b.j.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f2854a[this.f2863b], Integer.valueOf(this.f2866e), Integer.valueOf(this.f2865d));
    }
}
