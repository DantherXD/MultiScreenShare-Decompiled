package e.g;

/* JADX INFO: loaded from: classes.dex */
final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f4892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f4893b;

    public boolean a() {
        return this.f4892a > this.f4893b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!a() || !((e) obj).a()) {
                e eVar = (e) obj;
                if (this.f4892a != eVar.f4892a || this.f4893b != eVar.f4893b) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (a()) {
            return -1;
        }
        return Float.valueOf(this.f4893b).hashCode() + (Float.valueOf(this.f4892a).hashCode() * 31);
    }

    public String toString() {
        return this.f4892a + ".." + this.f4893b;
    }
}
