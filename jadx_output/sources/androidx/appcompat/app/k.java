package androidx.appcompat.app;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static k f1135a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f1136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1137c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1138d;

    k() {
    }

    static k b() {
        if (f1135a == null) {
            f1135a = new k();
        }
        return f1135a;
    }

    public void a(long j, double d2, double d3) {
        float f2 = (j - 946728000000L) / 8.64E7f;
        float f3 = (0.01720197f * f2) + 6.24006f;
        double d4 = f3;
        double dSin = (Math.sin(d4) * 0.03341960161924362d) + d4 + (Math.sin(2.0f * f3) * 3.4906598739326E-4d) + (Math.sin(f3 * 3.0f) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d5 = (-d3) / 360.0d;
        double dRound = ((double) (Math.round(((double) (f2 - 9.0E-4f)) - d5) + 9.0E-4f)) + d5 + (Math.sin(d4) * 0.0053d) + (Math.sin(2.0d * dSin) * (-0.0069d));
        double dAsin = Math.asin(Math.sin(dSin) * Math.sin(0.4092797040939331d));
        double d6 = 0.01745329238474369d * d2;
        double dSin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d6) * Math.sin(dAsin))) / (Math.cos(d6) * Math.cos(dAsin));
        if (dSin2 >= 1.0d) {
            this.f1138d = 1;
        } else {
            if (dSin2 > -1.0d) {
                double dAcos = (float) (Math.acos(dSin2) / 6.283185307179586d);
                this.f1136b = Math.round((dRound + dAcos) * 8.64E7d) + 946728000000L;
                long jRound = Math.round((dRound - dAcos) * 8.64E7d) + 946728000000L;
                this.f1137c = jRound;
                if (jRound >= j || this.f1136b <= j) {
                    this.f1138d = 1;
                    return;
                } else {
                    this.f1138d = 0;
                    return;
                }
            }
            this.f1138d = 0;
        }
        this.f1136b = -1L;
        this.f1137c = -1L;
    }
}
