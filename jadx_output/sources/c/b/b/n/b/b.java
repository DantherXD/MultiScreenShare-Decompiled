package c.b.b.n.b;

/* JADX INFO: loaded from: classes.dex */
public enum b {
    TERMINATOR(new int[]{0, 0, 0}, 0),
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    STRUCTURED_APPEND(new int[]{0, 0, 0}, 3),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5),
    FNC1_SECOND_POSITION(new int[]{0, 0, 0}, 9),
    HANZI(new int[]{8, 10, 12}, 13);

    private final int[] m;
    private final int n;

    b(int[] iArr, int i) {
        this.m = iArr;
        this.n = i;
    }

    public int a() {
        return this.n;
    }

    public int b(c cVar) {
        char c2;
        int iF = cVar.f();
        if (iF <= 9) {
            c2 = 0;
        } else {
            c2 = iF <= 26 ? (char) 1 : (char) 2;
        }
        return this.m[c2];
    }
}
