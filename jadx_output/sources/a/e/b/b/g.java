package a.e.b.b;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private k f395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k f396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a.e.a.k.a.a[] f399f;
    private a.e.a.k.a.a g;
    float h;
    float i;
    private int[] j;
    private double[] k;
    private double[] l;
    private String[] m;
    private float[] n;
    private ArrayList<k> o;
    private HashMap<String, a.e.b.a.e> p;
    private HashMap<String, a.e.b.a.d> q;
    private HashMap<String, a.e.b.a.c> r;
    private e[] s;
    private int t;
    private View u;
    private int v;
    private float w;
    private Interpolator x;
    private boolean y;

    private float a(float f2, float[] fArr) {
        float f3 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f4 = this.i;
            if (f4 != 1.0d) {
                float f5 = this.h;
                if (f2 < f5) {
                    f2 = 0.0f;
                }
                if (f2 > f5 && f2 < 1.0d) {
                    f2 = Math.min((f2 - f5) * f4, 1.0f);
                }
            }
        }
        a.e.a.k.a.b bVar = this.f395b.f420c;
        float f6 = Float.NaN;
        for (k kVar : this.o) {
            a.e.a.k.a.b bVar2 = kVar.f420c;
            if (bVar2 != null) {
                float f7 = kVar.f422e;
                if (f7 < f2) {
                    bVar = bVar2;
                    f3 = f7;
                } else if (Float.isNaN(f6)) {
                    f6 = kVar.f422e;
                }
            }
        }
        if (bVar == null) {
            return f2;
        }
        float f8 = (Float.isNaN(f6) ? 1.0f : f6) - f3;
        double d2 = (f2 - f3) / f8;
        float fA = f3 + (((float) bVar.a(d2)) * f8);
        if (fArr != null) {
            fArr[0] = (float) bVar.b(d2);
        }
        return fA;
    }

    public void b(double d2, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f399f[0].b(d2, dArr);
        this.f399f[0].d(d2, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f395b.b(d2, this.j, dArr, fArr, dArr2, fArr2);
    }

    boolean c(View view, float f2, long j, a.e.a.k.a.c cVar) {
        a.e.b.a.e.a aVar;
        boolean zC;
        float fA = a(f2, null);
        int i = this.v;
        if (i != d.f391a) {
            float f3 = 1.0f / i;
            float fFloor = ((float) Math.floor(fA / f3)) * f3;
            float f4 = (fA % f3) / f3;
            if (!Float.isNaN(this.w)) {
                f4 = (f4 + this.w) % 1.0f;
            }
            Interpolator interpolator = this.x;
            fA = ((interpolator != null ? interpolator.getInterpolation(f4) : ((double) f4) > 0.5d ? 1.0f : 0.0f) * f3) + fFloor;
        }
        float f5 = fA;
        HashMap<String, a.e.b.a.d> map = this.q;
        if (map != null) {
            Iterator<a.e.b.a.d> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().b(view, f5);
            }
        }
        HashMap<String, a.e.b.a.e> map2 = this.p;
        if (map2 != null) {
            a.e.b.a.e.a aVar2 = null;
            boolean zB = false;
            for (a.e.b.a.e eVar : map2.values()) {
                if (eVar instanceof a.e.b.a.e.a) {
                    aVar2 = (a.e.b.a.e.a) eVar;
                } else {
                    zB |= eVar.b(view, f5, j, cVar);
                }
            }
            zC = zB;
            aVar = aVar2;
        } else {
            aVar = null;
            zC = false;
        }
        a.e.a.k.a.a[] aVarArr = this.f399f;
        int i2 = 1;
        if (aVarArr != null) {
            double d2 = f5;
            aVarArr[0].b(d2, this.k);
            this.f399f[0].d(d2, this.l);
            a.e.a.k.a.a aVar3 = this.g;
            if (aVar3 != null) {
                double[] dArr = this.k;
                if (dArr.length > 0) {
                    aVar3.b(d2, dArr);
                    this.g.d(d2, this.l);
                }
            }
            if (!this.y) {
                this.f395b.c(f5, view, this.j, this.k, this.l, null, this.f394a);
                this.f394a = false;
            }
            if (this.t != d.f391a) {
                if (this.u == null) {
                    this.u = ((View) view.getParent()).findViewById(this.t);
                }
                View view2 = this.u;
                if (view2 != null) {
                    float top = (view2.getTop() + this.u.getBottom()) / 2.0f;
                    float left = (this.u.getLeft() + this.u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        float left2 = left - view.getLeft();
                        float top2 = top - view.getTop();
                        view.setPivotX(left2);
                        view.setPivotY(top2);
                    }
                }
            }
            HashMap<String, a.e.b.a.d> map3 = this.q;
            if (map3 != null) {
                for (a.e.b.a.d dVar : map3.values()) {
                    if (dVar instanceof a.e.b.a.d.a) {
                        double[] dArr2 = this.l;
                        if (dArr2.length > 1) {
                            ((a.e.b.a.d.a) dVar).c(view, f5, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.l;
                zC |= aVar.c(view, cVar, f5, j, dArr3[0], dArr3[1]);
            }
            int i3 = i2;
            while (true) {
                a.e.a.k.a.a[] aVarArr2 = this.f399f;
                if (i3 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i3].c(d2, this.n);
                a.e.b.a.a.b(this.f395b.q.get(this.m[i3 - 1]), view, this.n);
                i3++;
            }
            f fVar = this.f397d;
            if (fVar.f392b == 0) {
                if (f5 <= 0.0f) {
                    view.setVisibility(fVar.f393c);
                } else if (f5 >= 1.0f) {
                    fVar = this.f398e;
                    view.setVisibility(fVar.f393c);
                } else if (this.f398e.f393c != fVar.f393c) {
                    view.setVisibility(0);
                }
            }
            if (this.s != null) {
                int i4 = 0;
                while (true) {
                    e[] eVarArr = this.s;
                    if (i4 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i4].a(f5, view);
                    i4++;
                }
            }
        } else {
            i2 = 1;
            k kVar = this.f395b;
            float f6 = kVar.g;
            k kVar2 = this.f396c;
            float f7 = f6 + ((kVar2.g - f6) * f5);
            float f8 = kVar.h;
            float f9 = f8 + ((kVar2.h - f8) * f5);
            float f10 = kVar.i;
            float f11 = kVar2.i;
            float f12 = kVar.j;
            float f13 = kVar2.j;
            float f14 = f7 + 0.5f;
            int i5 = (int) f14;
            float f15 = f9 + 0.5f;
            int i6 = (int) f15;
            int i7 = (int) (f14 + ((f11 - f10) * f5) + f10);
            int i8 = (int) (f15 + ((f13 - f12) * f5) + f12);
            int i9 = i7 - i5;
            int i10 = i8 - i6;
            if (f11 != f10 || f13 != f12 || this.f394a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
                this.f394a = false;
            }
            view.layout(i5, i6, i7, i8);
        }
        HashMap<String, a.e.b.a.c> map4 = this.r;
        if (map4 != null) {
            for (a.e.b.a.c cVar2 : map4.values()) {
                if (cVar2 instanceof a.e.b.a.c.a) {
                    double[] dArr4 = this.l;
                    ((a.e.b.a.c.a) cVar2).c(view, f5, dArr4[0], dArr4[i2]);
                } else {
                    cVar2.b(view, f5);
                }
            }
        }
        return zC;
    }

    public String toString() {
        return " start: x: " + this.f395b.g + " y: " + this.f395b.h + " end: x: " + this.f396c.g + " y: " + this.f396c.h;
    }
}
