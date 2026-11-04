package a.e.a;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i implements Comparable<i> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f246b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f248d;
    public float h;
    a l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f249e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f250f = -1;
    public int g = 0;
    public boolean i = false;
    float[] j = new float[9];
    float[] k = new float[9];
    b[] m = new b[16];
    int n = 0;
    public int o = 0;
    boolean p = false;
    int q = -1;
    float r = 0.0f;
    HashSet<b> s = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.l = aVar;
    }

    static void c() {
        f246b++;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.n;
            if (i >= i2) {
                b[] bVarArr = this.m;
                if (i2 >= bVarArr.length) {
                    this.m = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.m;
                int i3 = this.n;
                bVarArr2[i3] = bVar;
                this.n = i3 + 1;
                return;
            }
            if (this.m[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        return this.f249e - iVar.f249e;
    }

    public final void d(b bVar) {
        int i = this.n;
        int i2 = 0;
        while (i2 < i) {
            if (this.m[i2] == bVar) {
                while (i2 < i - 1) {
                    b[] bVarArr = this.m;
                    int i3 = i2 + 1;
                    bVarArr[i2] = bVarArr[i3];
                    i2 = i3;
                }
                this.n--;
                return;
            }
            i2++;
        }
    }

    public void e() {
        this.f248d = null;
        this.l = a.UNKNOWN;
        this.g = 0;
        this.f249e = -1;
        this.f250f = -1;
        this.h = 0.0f;
        this.i = false;
        this.p = false;
        this.q = -1;
        this.r = 0.0f;
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            this.m[i2] = null;
        }
        this.n = 0;
        this.o = 0;
        this.f247c = false;
        Arrays.fill(this.k, 0.0f);
    }

    public void f(d dVar, float f2) {
        this.h = f2;
        this.i = true;
        this.p = false;
        this.q = -1;
        this.r = 0.0f;
        int i = this.n;
        this.f250f = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.m[i2].A(dVar, this, false);
        }
        this.n = 0;
    }

    public void g(a aVar, String str) {
        this.l = aVar;
    }

    public final void h(d dVar, b bVar) {
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            this.m[i2].B(dVar, bVar, false);
        }
        this.n = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f248d != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f248d);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f249e);
        }
        return sb.toString();
    }
}
