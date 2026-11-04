package a.e.a.m.m;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static int f360a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f362c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f364e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ArrayList<a.e.a.m.e> f361b = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f363d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    ArrayList<a> f365f = null;
    private int g = -1;

    class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference<a.e.a.m.e> f366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f371f;
        int g;

        public a(a.e.a.m.e eVar, a.e.a.d dVar, int i) {
            this.f366a = new WeakReference<>(eVar);
            this.f367b = dVar.x(eVar.P);
            this.f368c = dVar.x(eVar.Q);
            this.f369d = dVar.x(eVar.R);
            this.f370e = dVar.x(eVar.S);
            this.f371f = dVar.x(eVar.T);
            this.g = i;
        }
    }

    public o(int i) {
        this.f362c = -1;
        this.f364e = 0;
        int i2 = f360a;
        f360a = i2 + 1;
        this.f362c = i2;
        this.f364e = i;
    }

    private String e() {
        int i = this.f364e;
        if (i == 0) {
            return "Horizontal";
        }
        if (i == 1) {
            return "Vertical";
        }
        return i == 2 ? "Both" : "Unknown";
    }

    private int j(a.e.a.d dVar, ArrayList<a.e.a.m.e> arrayList, int i) {
        int iX;
        a.e.a.m.d dVar2;
        a.e.a.m.f fVar = (a.e.a.m.f) arrayList.get(0).I();
        dVar.D();
        fVar.g(dVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).g(dVar, false);
        }
        if (i == 0 && fVar.W0 > 0) {
            a.e.a.m.b.b(fVar, dVar, arrayList, 0);
        }
        if (i == 1 && fVar.X0 > 0) {
            a.e.a.m.b.b(fVar, dVar, arrayList, 1);
        }
        try {
            dVar.z();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f365f = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f365f.add(new a(arrayList.get(i3), dVar, i));
        }
        if (i == 0) {
            iX = dVar.x(fVar.P);
            dVar2 = fVar.R;
        } else {
            iX = dVar.x(fVar.Q);
            dVar2 = fVar.S;
        }
        int iX2 = dVar.x(dVar2);
        dVar.D();
        return iX2 - iX;
    }

    public boolean a(a.e.a.m.e eVar) {
        if (this.f361b.contains(eVar)) {
            return false;
        }
        this.f361b.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f361b.size();
        if (this.g != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                o oVar = arrayList.get(i);
                if (this.g == oVar.f362c) {
                    g(this.f364e, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f362c;
    }

    public int d() {
        return this.f364e;
    }

    public int f(a.e.a.d dVar, int i) {
        if (this.f361b.size() == 0) {
            return 0;
        }
        return j(dVar, this.f361b, i);
    }

    public void g(int i, o oVar) {
        for (a.e.a.m.e eVar : this.f361b) {
            oVar.a(eVar);
            int iC = oVar.c();
            if (i == 0) {
                eVar.I0 = iC;
            } else {
                eVar.J0 = iC;
            }
        }
        this.g = oVar.f362c;
    }

    public void h(boolean z) {
        this.f363d = z;
    }

    public void i(int i) {
        this.f364e = i;
    }

    public String toString() {
        String str = e() + " [" + this.f362c + "] <";
        Iterator<a.e.a.m.e> it = this.f361b.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().r();
        }
        return str + " >";
    }
}
