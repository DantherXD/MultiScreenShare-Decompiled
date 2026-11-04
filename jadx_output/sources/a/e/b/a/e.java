package a.e.b.a;

import a.e.a.k.a.f;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends f {

    public static class a extends e {
        @Override // a.e.b.a.e
        public boolean b(View view, float f2, long j, a.e.a.k.a.c cVar) {
            return this.h;
        }

        public boolean c(View view, a.e.a.k.a.c cVar, float f2, long j, double d2, double d3) {
            view.setRotation(a(f2, j, view, cVar) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
            return this.h;
        }
    }

    public float a(float f2, long j, View view, a.e.a.k.a.c cVar) {
        this.f278a.c(f2, this.g);
        float[] fArr = this.g;
        float f3 = fArr[1];
        if (f3 == 0.0f) {
            this.h = false;
            return fArr[2];
        }
        if (Float.isNaN(this.j)) {
            throw null;
        }
        this.j = (float) ((((double) this.j) + (((j - this.i) * 1.0E-9d) * ((double) f3))) % 1.0d);
        throw null;
    }

    public abstract boolean b(View view, float f2, long j, a.e.a.k.a.c cVar);
}
