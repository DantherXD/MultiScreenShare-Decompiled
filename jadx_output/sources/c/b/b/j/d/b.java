package c.b.b.j.d;

/* JADX INFO: loaded from: classes.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f2886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f2887b;

    b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f2886a = aVar;
        int length = iArr.length;
        if (length <= 1 || iArr[0] != 0) {
            this.f2887b = iArr;
            return;
        }
        int i = 1;
        while (i < length && iArr[i] == 0) {
            i++;
        }
        if (i == length) {
            this.f2887b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i];
        this.f2887b = iArr2;
        System.arraycopy(iArr, i, iArr2, 0, iArr2.length);
    }

    b a(b bVar) {
        if (!this.f2886a.equals(bVar.f2886a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f()) {
            return bVar;
        }
        if (bVar.f()) {
            return this;
        }
        int[] iArr = this.f2887b;
        int[] iArr2 = bVar.f2887b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i = length; i < iArr.length; i++) {
            iArr3[i] = a.a(iArr2[i - length], iArr[i]);
        }
        return new b(this.f2886a, iArr3);
    }

    b[] b(b bVar) {
        if (!this.f2886a.equals(bVar.f2886a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVarE = this.f2886a.e();
        int iF = this.f2886a.f(bVar.c(bVar.e()));
        b bVarA = this;
        while (bVarA.e() >= bVar.e() && !bVarA.f()) {
            int iE = bVarA.e() - bVar.e();
            int iH = this.f2886a.h(bVarA.c(bVarA.e()), iF);
            b bVarH = bVar.h(iE, iH);
            bVarE = bVarE.a(this.f2886a.b(iE, iH));
            bVarA = bVarA.a(bVarH);
        }
        return new b[]{bVarE, bVarA};
    }

    int c(int i) {
        int[] iArr = this.f2887b;
        return iArr[(iArr.length - 1) - i];
    }

    int[] d() {
        return this.f2887b;
    }

    int e() {
        return this.f2887b.length - 1;
    }

    boolean f() {
        return this.f2887b[0] == 0;
    }

    b g(b bVar) {
        if (!this.f2886a.equals(bVar.f2886a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f() || bVar.f()) {
            return this.f2886a.e();
        }
        int[] iArr = this.f2887b;
        int length = iArr.length;
        int[] iArr2 = bVar.f2887b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            for (int i3 = 0; i3 < length2; i3++) {
                int i4 = i + i3;
                iArr3[i4] = a.a(iArr3[i4], this.f2886a.h(i2, iArr2[i3]));
            }
        }
        return new b(this.f2886a, iArr3);
    }

    b h(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.f2886a.e();
        }
        int length = this.f2887b.length;
        int[] iArr = new int[i + length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = this.f2886a.h(this.f2887b[i3], i2);
        }
        return new b(this.f2886a, iArr);
    }

    public String toString() {
        char c2;
        StringBuilder sb = new StringBuilder(e() * 8);
        for (int iE = e(); iE >= 0; iE--) {
            int iC = c(iE);
            if (iC != 0) {
                if (iC < 0) {
                    sb.append(" - ");
                    iC = -iC;
                } else if (sb.length() > 0) {
                    sb.append(" + ");
                }
                if (iE == 0 || iC != 1) {
                    int iG = this.f2886a.g(iC);
                    if (iG == 0) {
                        c2 = '1';
                    } else if (iG == 1) {
                        c2 = 'a';
                    } else {
                        sb.append("a^");
                        sb.append(iG);
                    }
                    sb.append(c2);
                }
                if (iE != 0) {
                    if (iE == 1) {
                        sb.append('x');
                    } else {
                        sb.append("x^");
                        sb.append(iE);
                    }
                }
            }
        }
        return sb.toString();
    }
}
