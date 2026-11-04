package a.c.a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final RectF f158a = new RectF();

    class a implements h.a {
        a() {
        }

        @Override // a.c.a.h.a
        public void a(Canvas canvas, RectF rectF, float f2, Paint paint) {
            float f3 = 2.0f * f2;
            float fWidth = (rectF.width() - f3) - 1.0f;
            float fHeight = (rectF.height() - f3) - 1.0f;
            if (f2 >= 1.0f) {
                float f4 = f2 + 0.5f;
                float f5 = -f4;
                d.this.f158a.set(f5, f5, f4, f4);
                int iSave = canvas.save();
                canvas.translate(rectF.left + f4, rectF.top + f4);
                canvas.drawArc(d.this.f158a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f158a, 180.0f, 90.0f, true, paint);
                canvas.translate(fHeight, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f158a, 180.0f, 90.0f, true, paint);
                canvas.translate(fWidth, 0.0f);
                canvas.rotate(90.0f);
                canvas.drawArc(d.this.f158a, 180.0f, 90.0f, true, paint);
                canvas.restoreToCount(iSave);
                float f6 = (rectF.left + f4) - 1.0f;
                float f7 = rectF.top;
                canvas.drawRect(f6, f7, (rectF.right - f4) + 1.0f, f7 + f4, paint);
                float f8 = (rectF.left + f4) - 1.0f;
                float f9 = rectF.bottom;
                canvas.drawRect(f8, f9 - f4, (rectF.right - f4) + 1.0f, f9, paint);
            }
            canvas.drawRect(rectF.left, rectF.top + f2, rectF.right, rectF.bottom - f2, paint);
        }
    }

    d() {
    }

    private h n(e eVar) {
        return (h) eVar.d();
    }

    @Override // a.c.a.f
    public float a(e eVar) {
        return n(eVar).i();
    }

    @Override // a.c.a.f
    public float b(e eVar) {
        return n(eVar).g();
    }

    @Override // a.c.a.f
    public float c(e eVar) {
        return n(eVar).j();
    }

    @Override // a.c.a.f
    public float d(e eVar) {
        return n(eVar).k();
    }

    @Override // a.c.a.f
    public void e(e eVar) {
    }

    @Override // a.c.a.f
    public ColorStateList f(e eVar) {
        return n(eVar).f();
    }

    @Override // a.c.a.f
    public void g(e eVar, float f2) {
        n(eVar).r(f2);
    }

    @Override // a.c.a.f
    public void h(e eVar, float f2) {
        n(eVar).p(f2);
        o(eVar);
    }

    @Override // a.c.a.f
    public void i(e eVar) {
        n(eVar).m(eVar.f());
        o(eVar);
    }

    @Override // a.c.a.f
    public void j(e eVar, ColorStateList colorStateList) {
        n(eVar).o(colorStateList);
    }

    @Override // a.c.a.f
    public float k(e eVar) {
        return n(eVar).l();
    }

    @Override // a.c.a.f
    public void l(e eVar, float f2) {
        n(eVar).q(f2);
        o(eVar);
    }

    @Override // a.c.a.f
    public void m() {
        h.f167b = new a();
    }

    public void o(e eVar) {
        Rect rect = new Rect();
        n(eVar).h(rect);
        eVar.e((int) Math.ceil(d(eVar)), (int) Math.ceil(c(eVar)));
        eVar.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
