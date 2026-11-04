package c.b.a.b.a0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f2650a;

    public i(float f2) {
        this.f2650a = f2;
    }

    @Override // c.b.a.b.a0.c
    public float a(RectF rectF) {
        return this.f2650a * rectF.height();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.f2650a == ((i) obj).f2650a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f2650a)});
    }
}
