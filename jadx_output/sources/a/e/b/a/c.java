package a.e.b.a;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends a.e.a.k.a.d {

    public static class a extends c {
        @Override // a.e.b.a.c
        public void b(View view, float f2) {
        }

        public void c(View view, float f2, double d2, double d3) {
            view.setRotation(a(f2) + ((float) Math.toDegrees(Math.atan2(d3, d2))));
        }
    }

    public abstract void b(View view, float f2);
}
