package c.b.a.b.l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes.dex */
public class g implements TypeEvaluator<Matrix> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f2765a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float[] f2766b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Matrix f2767c = new Matrix();

    public Matrix a(float f2, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f2765a);
        matrix2.getValues(this.f2766b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f2766b;
            float f3 = fArr[i];
            float[] fArr2 = this.f2765a;
            fArr[i] = fArr2[i] + ((f3 - fArr2[i]) * f2);
        }
        this.f2767c.setValues(this.f2766b);
        return this.f2767c;
    }
}
