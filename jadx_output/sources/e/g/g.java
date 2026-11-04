package e.g;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class g extends e.d.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4901e;

    public g(int i, int i2, int i3) {
        this.f4901e = i3;
        this.f4898b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f4899c = z;
        this.f4900d = z ? i : i2;
    }

    @Override // e.d.b
    public int b() {
        int i = this.f4900d;
        if (i != this.f4898b) {
            this.f4900d = this.f4901e + i;
        } else {
            if (!this.f4899c) {
                throw new NoSuchElementException();
            }
            this.f4899c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4899c;
    }
}
