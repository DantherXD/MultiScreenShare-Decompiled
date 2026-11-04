package c.b.b.i.b;

/* JADX INFO: loaded from: classes.dex */
final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f2851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f2852d;

    b(g gVar, int i, int i2) {
        super(gVar);
        this.f2851c = (short) i;
        this.f2852d = (short) i2;
    }

    @Override // c.b.b.i.b.g
    public void c(c.b.b.j.a aVar, byte[] bArr) {
        int i;
        int i2 = 0;
        while (true) {
            short s = this.f2852d;
            if (i2 >= s) {
                return;
            }
            if (i2 == 0 || (i2 == 31 && s <= 62)) {
                int i3 = 5;
                aVar.c(31, 5);
                short s2 = this.f2852d;
                if (s2 > 62) {
                    i = s2 - 31;
                    i3 = 16;
                } else if (i2 == 0) {
                    aVar.c(Math.min((int) s2, 31), 5);
                } else {
                    i = s2 - 31;
                }
                aVar.c(i, i3);
            }
            aVar.c(bArr[this.f2851c + i2], 8);
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append((int) this.f2851c);
        sb.append("::");
        sb.append((this.f2851c + this.f2852d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
