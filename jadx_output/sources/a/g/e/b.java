package a.g.e;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f477a = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f479c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f481e;

    private b(int i, int i2, int i3, int i4) {
        this.f478b = i;
        this.f479c = i2;
        this.f480d = i3;
        this.f481e = i4;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f478b, bVar2.f478b), Math.max(bVar.f479c, bVar2.f479c), Math.max(bVar.f480d, bVar2.f480d), Math.max(bVar.f481e, bVar2.f481e));
    }

    public static b b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f477a : new b(i, i2, i3, i4);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return Insets.of(this.f478b, this.f479c, this.f480d, this.f481e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f481e == bVar.f481e && this.f478b == bVar.f478b && this.f480d == bVar.f480d && this.f479c == bVar.f479c;
    }

    public int hashCode() {
        return (((((this.f478b * 31) + this.f479c) * 31) + this.f480d) * 31) + this.f481e;
    }

    public String toString() {
        return "Insets{left=" + this.f478b + ", top=" + this.f479c + ", right=" + this.f480d + ", bottom=" + this.f481e + '}';
    }
}
