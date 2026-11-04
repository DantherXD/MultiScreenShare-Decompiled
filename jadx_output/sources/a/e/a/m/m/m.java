package a.e.a.m.m;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f353a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    p f357e;
    int g;
    int h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f354b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f355c = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<p> f358f = new ArrayList<>();

    public m(p pVar, int i) {
        this.f356d = null;
        this.f357e = null;
        this.g = 0;
        int i2 = f353a;
        this.g = i2;
        f353a = i2 + 1;
        this.f356d = pVar;
        this.f357e = pVar;
        this.h = i;
    }

    private long c(f fVar, long j) {
        p pVar = fVar.f341d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f341d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f343f) + j));
                }
            }
        }
        if (fVar != pVar.i) {
            return jMin;
        }
        long j2 = j - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.h, j2)), j2 - ((long) pVar.h.f343f));
    }

    private long d(f fVar, long j) {
        p pVar = fVar.f341d;
        if (pVar instanceof k) {
            return j;
        }
        int size = fVar.k.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            d dVar = fVar.k.get(i);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f341d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f343f) + j));
                }
            }
        }
        if (fVar != pVar.h) {
            return jMax;
        }
        long j2 = j + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.i, j2)), j2 - ((long) pVar.i.f343f));
    }

    public void a(p pVar) {
        this.f358f.add(pVar);
        this.f357e = pVar;
    }

    public long b(a.e.a.m.f fVar, int i) {
        p pVar = this.f356d;
        if (pVar instanceof c) {
            if (((c) pVar).f377f != i) {
                return 0L;
            }
        } else if (i == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i == 0 ? fVar.f313f : fVar.g).h;
        f fVar3 = (i == 0 ? fVar.f313f : fVar.g).i;
        boolean zContains = pVar.h.l.contains(fVar2);
        boolean zContains2 = this.f356d.i.l.contains(fVar3);
        long j = this.f356d.j();
        if (!zContains || !zContains2) {
            if (zContains) {
                f fVar4 = this.f356d.h;
                return Math.max(d(fVar4, fVar4.f343f), ((long) this.f356d.h.f343f) + j);
            }
            if (!zContains2) {
                p pVar2 = this.f356d;
                return (((long) pVar2.h.f343f) + pVar2.j()) - ((long) this.f356d.i.f343f);
            }
            f fVar5 = this.f356d.i;
            return Math.max(-c(fVar5, fVar5.f343f), ((long) (-this.f356d.i.f343f)) + j);
        }
        long jD = d(this.f356d.h, 0L);
        long jC = c(this.f356d.i, 0L);
        long j2 = jD - j;
        p pVar3 = this.f356d;
        int i2 = pVar3.i.f343f;
        if (j2 >= (-i2)) {
            j2 += (long) i2;
        }
        int i3 = pVar3.h.f343f;
        long j3 = ((-jC) - j) - ((long) i3);
        if (j3 >= i3) {
            j3 -= (long) i3;
        }
        float fO = pVar3.f373b.o(i);
        float f2 = fO > 0.0f ? (long) ((j3 / fO) + (j2 / (1.0f - fO))) : 0L;
        long j4 = ((long) ((f2 * fO) + 0.5f)) + j + ((long) ((f2 * (1.0f - fO)) + 0.5f));
        p pVar4 = this.f356d;
        return (((long) pVar4.h.f343f) + j4) - ((long) pVar4.i.f343f);
    }
}
