package a.e.a.k.a;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f278a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f283f;
    protected long i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f279b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f280c = new int[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected float[][] f281d = (float[][]) Array.newInstance((Class<?>) float.class, 10, 3);
    protected float[] g = new float[3];
    protected boolean h = false;
    protected float j = Float.NaN;

    public String toString() {
        String str = this.f283f;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f282e; i++) {
            str = str + "[" + this.f280c[i] + " , " + decimalFormat.format(this.f281d[i]) + "] ";
        }
        return str;
    }
}
