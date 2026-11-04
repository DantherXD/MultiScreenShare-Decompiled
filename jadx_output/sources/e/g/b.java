package e.g;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class b extends e.d.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f4885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f4888e;

    public b(char c2, char c3, int i) {
        this.f4888e = i;
        this.f4885b = c3;
        boolean z = true;
        if (i <= 0 ? e.f.a.b.b(c2, c3) < 0 : e.f.a.b.b(c2, c3) > 0) {
            z = false;
        }
        this.f4886c = z;
        this.f4887d = z ? c2 : c3;
    }

    @Override // e.d.a
    public char b() {
        int i = this.f4887d;
        if (i != this.f4885b) {
            this.f4887d = this.f4888e + i;
        } else {
            if (!this.f4886c) {
                throw new NoSuchElementException();
            }
            this.f4886c = false;
        }
        return (char) i;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f4886c;
    }
}
