package e.g;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class j extends e.d.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f4907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f4909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f4910e;

    public j(long j, long j2, long j3) {
        this.f4910e = j3;
        this.f4907b = j2;
        boolean z = true;
        if (j3 <= 0 ? j < j2 : j > j2) {
            z = false;
        }
        this.f4908c = z;
        this.f4909d = z ? j : j2;
    }

    @Override // e.d.c
    public long b() {
        long j = this.f4909d;
        if (j != this.f4907b) {
            this.f4909d = this.f4910e + j;
        } else {
            if (!this.f4908c) {
                throw new NoSuchElementException();
            }
            this.f4908c = false;
        }
        return j;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4908c;
    }
}
