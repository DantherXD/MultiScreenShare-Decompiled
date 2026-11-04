package a.e.a.k.a;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f267c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f268d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f269e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<b> f270f = new ArrayList<>();

    static class a {
        public double a(float f2) {
            throw null;
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f271a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f272b;
    }

    public float a(float f2) {
        return (float) this.f265a.a(f2);
    }

    public String toString() {
        String str = this.f266b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (b bVar : this.f270f) {
            str = str + "[" + bVar.f271a + " , " + decimalFormat.format(bVar.f272b) + "] ";
        }
        return str;
    }
}
