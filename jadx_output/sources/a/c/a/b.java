package a.c.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
class b extends d {

    class a implements h.a {
        a() {
        }

        @Override // a.c.a.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    b() {
    }

    @Override // a.c.a.d, a.c.a.f
    public void m() {
        h.f167b = new a();
    }
}
