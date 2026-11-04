package c.b.a.b.a0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f2676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f2677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f2678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f2679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f2680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f2681f;
    private final List<f> g = new ArrayList();
    private final List<g> h = new ArrayList();
    private boolean i;

    class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f2682b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Matrix f2683c;

        a(List list, Matrix matrix) {
            this.f2682b = list;
            this.f2683c = matrix;
        }

        @Override // c.b.a.b.a0.m.g
        public void a(Matrix matrix, c.b.a.b.z.a aVar, int i, Canvas canvas) {
            Iterator it = this.f2682b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f2683c, aVar, i, canvas);
            }
        }
    }

    static class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f2685b;

        public b(d dVar) {
            this.f2685b = dVar;
        }

        @Override // c.b.a.b.a0.m.g
        public void a(Matrix matrix, c.b.a.b.z.a aVar, int i, Canvas canvas) {
            aVar.a(canvas, matrix, new RectF(this.f2685b.k(), this.f2685b.o(), this.f2685b.l(), this.f2685b.j()), i, this.f2685b.m(), this.f2685b.n());
        }
    }

    static class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f2686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f2687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f2688d;

        public c(e eVar, float f2, float f3) {
            this.f2686b = eVar;
            this.f2687c = f2;
            this.f2688d = f3;
        }

        @Override // c.b.a.b.a0.m.g
        public void a(Matrix matrix, c.b.a.b.z.a aVar, int i, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f2686b.f2695c - this.f2688d, this.f2686b.f2694b - this.f2687c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f2687c, this.f2688d);
            matrix2.preRotate(c());
            aVar.b(canvas, matrix2, rectF, i);
        }

        float c() {
            return (float) Math.toDegrees(Math.atan((this.f2686b.f2695c - this.f2688d) / (this.f2686b.f2694b - this.f2687c)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final RectF f2689b = new RectF();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public float f2690c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Deprecated
        public float f2691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Deprecated
        public float f2692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Deprecated
        public float f2693f;

        @Deprecated
        public float g;

        @Deprecated
        public float h;

        public d(float f2, float f3, float f4, float f5) {
            q(f2);
            u(f3);
            r(f4);
            p(f5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float j() {
            return this.f2693f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float k() {
            return this.f2690c;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float l() {
            return this.f2692e;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float m() {
            return this.g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float n() {
            return this.h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public float o() {
            return this.f2691d;
        }

        private void p(float f2) {
            this.f2693f = f2;
        }

        private void q(float f2) {
            this.f2690c = f2;
        }

        private void r(float f2) {
            this.f2692e = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(float f2) {
            this.g = f2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void t(float f2) {
            this.h = f2;
        }

        private void u(float f2) {
            this.f2691d = f2;
        }

        @Override // c.b.a.b.a0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2696a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f2689b;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f2694b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f2695c;

        @Override // c.b.a.b.a0.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f2696a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f2694b, this.f2695c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Matrix f2696a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Matrix f2697a = new Matrix();

        g() {
        }

        public abstract void a(Matrix matrix, c.b.a.b.z.a aVar, int i, Canvas canvas);

        public final void b(c.b.a.b.z.a aVar, int i, Canvas canvas) {
            a(f2697a, aVar, i, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    private void b(float f2) {
        if (g() == f2) {
            return;
        }
        float fG = ((f2 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.h.add(new b(dVar));
        p(f2);
    }

    private void c(g gVar, float f2, float f3) {
        b(f2);
        this.h.add(gVar);
        p(f3);
    }

    private float g() {
        return this.f2680e;
    }

    private float h() {
        return this.f2681f;
    }

    private void p(float f2) {
        this.f2680e = f2;
    }

    private void q(float f2) {
        this.f2681f = f2;
    }

    private void r(float f2) {
        this.f2678c = f2;
    }

    private void s(float f2) {
        this.f2679d = f2;
    }

    private void t(float f2) {
        this.f2676a = f2;
    }

    private void u(float f2) {
        this.f2677b = f2;
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        d dVar = new d(f2, f3, f4, f5);
        dVar.s(f6);
        dVar.t(f7);
        this.g.add(dVar);
        b bVar = new b(dVar);
        float f8 = f6 + f7;
        boolean z = f7 < 0.0f;
        if (z) {
            f6 = (f6 + 180.0f) % 360.0f;
        }
        c(bVar, f6, z ? (180.0f + f8) % 360.0f : f8);
        double d2 = f8;
        r(((f2 + f4) * 0.5f) + (((f4 - f2) / 2.0f) * ((float) Math.cos(Math.toRadians(d2)))));
        s(((f3 + f5) * 0.5f) + (((f5 - f3) / 2.0f) * ((float) Math.sin(Math.toRadians(d2)))));
    }

    public void d(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    boolean e() {
        return this.i;
    }

    g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.h), new Matrix(matrix));
    }

    float i() {
        return this.f2678c;
    }

    float j() {
        return this.f2679d;
    }

    float k() {
        return this.f2676a;
    }

    float l() {
        return this.f2677b;
    }

    public void m(float f2, float f3) {
        e eVar = new e();
        eVar.f2694b = f2;
        eVar.f2695c = f3;
        this.g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f2);
        s(f3);
    }

    public void n(float f2, float f3) {
        o(f2, f3, 270.0f, 0.0f);
    }

    public void o(float f2, float f3, float f4, float f5) {
        t(f2);
        u(f3);
        r(f2);
        s(f3);
        p(f4);
        q((f4 + f5) % 360.0f);
        this.g.clear();
        this.h.clear();
        this.i = false;
    }
}
