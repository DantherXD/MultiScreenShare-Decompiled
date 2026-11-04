package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1458a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1459b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1460c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f1461d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1462e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f1463f = 0;
    private boolean g = false;
    private boolean h = false;

    p0() {
    }

    public int a() {
        return this.g ? this.f1458a : this.f1459b;
    }

    public int b() {
        return this.f1458a;
    }

    public int c() {
        return this.f1459b;
    }

    public int d() {
        return this.g ? this.f1459b : this.f1458a;
    }

    public void e(int i, int i2) {
        this.h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1462e = i;
            this.f1458a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1463f = i2;
            this.f1459b = i2;
        }
    }

    public void f(boolean z) {
        int i;
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (this.h) {
            if (z) {
                int i2 = this.f1461d;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1462e;
                }
                this.f1458a = i2;
                i = this.f1460c;
                if (i == Integer.MIN_VALUE) {
                }
            } else {
                int i3 = this.f1460c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1462e;
                }
                this.f1458a = i3;
                i = this.f1461d;
                if (i == Integer.MIN_VALUE) {
                }
            }
            this.f1459b = i;
        }
        this.f1458a = this.f1462e;
        i = this.f1463f;
        this.f1459b = i;
    }

    public void g(int i, int i2) {
        this.f1460c = i;
        this.f1461d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1458a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1459b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1458a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1459b = i2;
        }
    }
}
