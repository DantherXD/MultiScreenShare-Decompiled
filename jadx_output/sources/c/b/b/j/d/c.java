package c.b.b.j.d;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f2888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<b> f2889b;

    public c(a aVar) {
        this.f2888a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f2889b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    private b a(int i) {
        if (i >= this.f2889b.size()) {
            List<b> list = this.f2889b;
            b bVarG = list.get(list.size() - 1);
            for (int size = this.f2889b.size(); size <= i; size++) {
                a aVar = this.f2888a;
                bVarG = bVarG.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f2889b.add(bVarG);
            }
        }
        return this.f2889b.get(i);
    }

    public void b(int[] iArr, int i) {
        if (i == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrD = new b(this.f2888a, iArr2).h(i, 1).b(bVarA)[1].d();
        int length2 = i - iArrD.length;
        for (int i2 = 0; i2 < length2; i2++) {
            iArr[length + i2] = 0;
        }
        System.arraycopy(iArrD, 0, iArr, length + length2, iArrD.length);
    }
}
