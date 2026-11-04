package a.e.a.m.m;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f341d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f343f;
    public int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f338a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f339b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f340c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f342e = a.UNKNOWN;
    int h = 1;
    g i = null;
    public boolean j = false;
    List<d> k = new ArrayList();
    List<f> l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f341d = pVar;
    }

    @Override // a.e.a.m.m.d
    public void a(d dVar) {
        Iterator<f> it = this.l.iterator();
        while (it.hasNext()) {
            if (!it.next().j) {
                return;
            }
        }
        this.f340c = true;
        d dVar2 = this.f338a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f339b) {
            this.f341d.a(this);
            return;
        }
        f fVar = null;
        int i = 0;
        for (f fVar2 : this.l) {
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.j) {
                    return;
                } else {
                    this.f343f = this.h * gVar.g;
                }
            }
            d(fVar.g + this.f343f);
        }
        d dVar3 = this.f338a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.k.add(dVar);
        if (this.j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f340c = false;
        this.f339b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (d dVar : this.k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f341d.f373b.r());
        sb.append(":");
        sb.append(this.f342e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
