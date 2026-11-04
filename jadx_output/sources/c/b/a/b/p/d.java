package c.b.a.b.p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static class b implements TypeEvaluator<e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final TypeEvaluator<e> f2783a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f2784b = new e();

        @Override // android.animation.TypeEvaluator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f2784b.a(c.b.a.b.v.a.c(eVar.f2787a, eVar2.f2787a, f2), c.b.a.b.v.a.c(eVar.f2788b, eVar2.f2788b, f2), c.b.a.b.v.a.c(eVar.f2789c, eVar2.f2789c, f2));
            return this.f2784b;
        }
    }

    public static class c extends Property<d, e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, e> f2785a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* JADX INFO: renamed from: c.b.a.b.p.d$d, reason: collision with other inner class name */
    public static class C0063d extends Property<d, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Property<d, Integer> f2786a = new C0063d("circularRevealScrimColor");

        private C0063d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f2787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f2788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f2789c;

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.f2787a = f2;
            this.f2788b = f3;
            this.f2789c = f4;
        }

        public void a(float f2, float f3, float f4) {
            this.f2787a = f2;
            this.f2788b = f3;
            this.f2789c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(e eVar);
}
