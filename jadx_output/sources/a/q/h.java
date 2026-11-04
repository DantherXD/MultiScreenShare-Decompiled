package a.q;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: loaded from: classes.dex */
class h<T> extends Property<T, Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Property<T, PointF> f858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PathMeasure f859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float[] f861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PointF f862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f863f;

    h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f861d = new float[2];
        this.f862e = new PointF();
        this.f858a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f859b = pathMeasure;
        this.f860c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f863f);
    }

    @Override // android.util.Property
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f2) {
        this.f863f = f2.floatValue();
        this.f859b.getPosTan(this.f860c * f2.floatValue(), this.f861d, null);
        PointF pointF = this.f862e;
        float[] fArr = this.f861d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f858a.set(t, pointF);
    }
}
