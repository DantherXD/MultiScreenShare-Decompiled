package c.b.a.b.a0;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f2634b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f2633a;
            f2 += ((b) cVar).f2634b;
        }
        this.f2633a = cVar;
        this.f2634b = f2;
    }

    @Override // c.b.a.b.a0.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f2633a.a(rectF) + this.f2634b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2633a.equals(bVar.f2633a) && this.f2634b == bVar.f2634b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2633a, Float.valueOf(this.f2634b)});
    }
}
