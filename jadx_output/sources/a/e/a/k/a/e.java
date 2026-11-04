package a.e.a.k.a;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected a f273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f274b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float[] f275c = new float[10];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f277e;

    public float a(float f2) {
        return (float) this.f273a.a(f2, 0);
    }

    public String toString() {
        String str = this.f277e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.f276d; i++) {
            str = str + "[" + this.f274b[i] + " , " + decimalFormat.format(this.f275c[i]) + "] ";
        }
        return str;
    }
}
