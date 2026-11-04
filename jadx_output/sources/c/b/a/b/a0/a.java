package c.b.a.b.a0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2632a;

    public a(float f2) {
        this.f2632a = f2;
    }

    @Override // c.b.a.b.a0.c
    public float a(RectF rectF) {
        return this.f2632a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f2632a == ((a) obj).f2632a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2632a)});
    }
}
