package c.b.a.b.a0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m[] f2664a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Matrix[] f2665b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix[] f2666c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PointF f2667d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Path f2668e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Path f2669f = new Path();
    private final m g = new m();
    private final float[] h = new float[2];
    private final float[] i = new float[2];
    private final Path j = new Path();
    private final Path k = new Path();
    private boolean l = true;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final l f2670a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i);

        void b(m mVar, Matrix matrix, int i);
    }

    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f2671a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f2672b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f2673c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f2674d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f2675e;

        c(k kVar, float f2, RectF rectF, b bVar, Path path) {
            this.f2674d = bVar;
            this.f2671a = kVar;
            this.f2675e = f2;
            this.f2673c = rectF;
            this.f2672b = path;
        }
    }

    public l() {
        for (int i = 0; i < 4; i++) {
            this.f2664a[i] = new m();
            this.f2665b[i] = new Matrix();
            this.f2666c[i] = new Matrix();
        }
    }

    private float a(int i) {
        return (i + 1) * 90;
    }

    private void b(c cVar, int i) {
        this.h[0] = this.f2664a[i].k();
        this.h[1] = this.f2664a[i].l();
        this.f2665b[i].mapPoints(this.h);
        Path path = cVar.f2672b;
        float[] fArr = this.h;
        if (i == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f2664a[i].d(this.f2665b[i], cVar.f2672b);
        b bVar = cVar.f2674d;
        if (bVar != null) {
            bVar.b(this.f2664a[i], this.f2665b[i], i);
        }
    }

    private void c(c cVar, int i) {
        m mVar;
        Matrix matrix;
        Path path;
        int i2 = (i + 1) % 4;
        this.h[0] = this.f2664a[i].i();
        this.h[1] = this.f2664a[i].j();
        this.f2665b[i].mapPoints(this.h);
        this.i[0] = this.f2664a[i2].k();
        this.i[1] = this.f2664a[i2].l();
        this.f2665b[i2].mapPoints(this.i);
        float[] fArr = this.h;
        float f2 = fArr[0];
        float[] fArr2 = this.i;
        float fMax = Math.max(((float) Math.hypot(f2 - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f2673c, i);
        this.g.n(0.0f, 0.0f);
        f fVarJ = j(i, cVar.f2671a);
        fVarJ.b(fMax, fI, cVar.f2675e, this.g);
        this.j.reset();
        this.g.d(this.f2666c[i], this.j);
        if (this.l && Build.VERSION.SDK_INT >= 19 && (fVarJ.a() || l(this.j, i) || l(this.j, i2))) {
            Path path2 = this.j;
            path2.op(path2, this.f2669f, Path.Op.DIFFERENCE);
            this.h[0] = this.g.k();
            this.h[1] = this.g.l();
            this.f2666c[i].mapPoints(this.h);
            Path path3 = this.f2668e;
            float[] fArr3 = this.h;
            path3.moveTo(fArr3[0], fArr3[1]);
            mVar = this.g;
            matrix = this.f2666c[i];
            path = this.f2668e;
        } else {
            mVar = this.g;
            matrix = this.f2666c[i];
            path = cVar.f2672b;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f2674d;
        if (bVar != null) {
            bVar.a(this.g, this.f2666c[i], i);
        }
    }

    private void f(int i, RectF rectF, PointF pointF) {
        float f2;
        float f3;
        if (i != 1) {
            if (i != 2) {
                f2 = i != 3 ? rectF.right : rectF.left;
                f3 = rectF.top;
            } else {
                f2 = rectF.left;
            }
            pointF.set(f2, f3);
        }
        f2 = rectF.right;
        f3 = rectF.bottom;
        pointF.set(f2, f3);
    }

    private c.b.a.b.a0.c g(int i, k kVar) {
        if (i == 1) {
            return kVar.l();
        }
        if (i != 2) {
            return i != 3 ? kVar.t() : kVar.r();
        }
        return kVar.j();
    }

    private d h(int i, k kVar) {
        if (i == 1) {
            return kVar.k();
        }
        if (i != 2) {
            return i != 3 ? kVar.s() : kVar.q();
        }
        return kVar.i();
    }

    private float i(RectF rectF, int i) {
        float fCenterX;
        float f2;
        float[] fArr = this.h;
        m[] mVarArr = this.f2664a;
        fArr[0] = mVarArr[i].f2678c;
        fArr[1] = mVarArr[i].f2679d;
        this.f2665b[i].mapPoints(fArr);
        if (i == 1 || i == 3) {
            fCenterX = rectF.centerX();
            f2 = this.h[0];
        } else {
            fCenterX = rectF.centerY();
            f2 = this.h[1];
        }
        return Math.abs(fCenterX - f2);
    }

    private f j(int i, k kVar) {
        if (i == 1) {
            return kVar.h();
        }
        if (i != 2) {
            return i != 3 ? kVar.o() : kVar.p();
        }
        return kVar.n();
    }

    public static l k() {
        return a.f2670a;
    }

    private boolean l(Path path, int i) {
        this.k.reset();
        this.f2664a[i].d(this.f2665b[i], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    private void m(c cVar, int i) {
        h(i, cVar.f2671a).b(this.f2664a[i], 90.0f, cVar.f2675e, cVar.f2673c, g(i, cVar.f2671a));
        float fA = a(i);
        this.f2665b[i].reset();
        f(i, cVar.f2673c, this.f2667d);
        Matrix matrix = this.f2665b[i];
        PointF pointF = this.f2667d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f2665b[i].preRotate(fA);
    }

    private void n(int i) {
        this.h[0] = this.f2664a[i].i();
        this.h[1] = this.f2664a[i].j();
        this.f2665b[i].mapPoints(this.h);
        float fA = a(i);
        this.f2666c[i].reset();
        Matrix matrix = this.f2666c[i];
        float[] fArr = this.h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f2666c[i].preRotate(fA);
    }

    public void d(k kVar, float f2, RectF rectF, Path path) {
        e(kVar, f2, rectF, null, path);
    }

    public void e(k kVar, float f2, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f2668e.rewind();
        this.f2669f.rewind();
        this.f2669f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f2, rectF, bVar, path);
        for (int i = 0; i < 4; i++) {
            m(cVar, i);
            n(i);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            b(cVar, i2);
            c(cVar, i2);
        }
        path.close();
        this.f2668e.close();
        if (Build.VERSION.SDK_INT < 19 || this.f2668e.isEmpty()) {
            return;
        }
        path.op(this.f2668e, Path.Op.UNION);
    }
}
