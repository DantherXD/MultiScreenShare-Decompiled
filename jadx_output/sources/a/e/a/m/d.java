package a.e.a.m;

import a.e.a.m.m.o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f301f;
    a.e.a.i i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<d> f296a = null;
    public int g = 0;
    int h = Integer.MIN_VALUE;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f302a;

        static {
            int[] iArr = new int[b.values().length];
            f302a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f302a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f302a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f302a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f302a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f302a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f302a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f302a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f302a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f299d = eVar;
        this.f300e = bVar;
    }

    public boolean a(d dVar, int i, int i2, boolean z) {
        if (dVar == null) {
            p();
            return true;
        }
        if (!z && !o(dVar)) {
            return false;
        }
        this.f301f = dVar;
        if (dVar.f296a == null) {
            dVar.f296a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f301f.f296a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public void b(int i, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f296a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                a.e.a.m.m.i.a(it.next().f299d, i, arrayList, oVar);
            }
        }
    }

    public HashSet<d> c() {
        return this.f296a;
    }

    public int d() {
        if (this.f298c) {
            return this.f297b;
        }
        return 0;
    }

    public int e() {
        d dVar;
        if (this.f299d.T() == 8) {
            return 0;
        }
        return (this.h == Integer.MIN_VALUE || (dVar = this.f301f) == null || dVar.f299d.T() != 8) ? this.g : this.h;
    }

    public final d f() {
        switch (a.f302a[this.f300e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f299d.R;
            case 3:
                return this.f299d.P;
            case 4:
                return this.f299d.S;
            case 5:
                return this.f299d.Q;
            default:
                throw new AssertionError(this.f300e.name());
        }
    }

    public e g() {
        return this.f299d;
    }

    public a.e.a.i h() {
        return this.i;
    }

    public d i() {
        return this.f301f;
    }

    public b j() {
        return this.f300e;
    }

    public boolean k() {
        HashSet<d> hashSet = this.f296a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().f().n()) {
                return true;
            }
        }
        return false;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f296a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean m() {
        return this.f298c;
    }

    public boolean n() {
        return this.f301f != null;
    }

    public boolean o(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarJ = dVar.j();
        b bVar = this.f300e;
        if (bVarJ == bVar) {
            return bVar != b.BASELINE || (dVar.g().X() && g().X());
        }
        switch (a.f302a[bVar.ordinal()]) {
            case 1:
                return (bVarJ == b.BASELINE || bVarJ == b.CENTER_X || bVarJ == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z = bVarJ == b.LEFT || bVarJ == b.RIGHT;
                if (dVar.g() instanceof g) {
                    return z || bVarJ == b.CENTER_X;
                }
                return z;
            case 4:
            case 5:
                boolean z2 = bVarJ == b.TOP || bVarJ == b.BOTTOM;
                if (dVar.g() instanceof g) {
                    return z2 || bVarJ == b.CENTER_Y;
                }
                return z2;
            case 6:
                return (bVarJ == b.LEFT || bVarJ == b.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f300e.name());
        }
    }

    public void p() {
        HashSet<d> hashSet;
        d dVar = this.f301f;
        if (dVar != null && (hashSet = dVar.f296a) != null) {
            hashSet.remove(this);
            if (this.f301f.f296a.size() == 0) {
                this.f301f.f296a = null;
            }
        }
        this.f296a = null;
        this.f301f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.f298c = false;
        this.f297b = 0;
    }

    public void q() {
        this.f298c = false;
        this.f297b = 0;
    }

    public void r(a.e.a.c cVar) {
        a.e.a.i iVar = this.i;
        if (iVar == null) {
            this.i = new a.e.a.i(a.e.a.i.a.UNRESTRICTED, null);
        } else {
            iVar.e();
        }
    }

    public void s(int i) {
        this.f297b = i;
        this.f298c = true;
    }

    public String toString() {
        return this.f299d.r() + ":" + this.f300e.toString();
    }
}
