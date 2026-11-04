package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f2061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f2062b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f2063a;

        static {
            int[] iArr = new int[d.b.values().length];
            f2063a = iArr;
            try {
                iArr[d.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2063a[d.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2063a[d.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2063a[d.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2063a[d.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2063a[d.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2063a[d.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(b bVar, e eVar) {
        this.f2061a = bVar;
        this.f2062b = eVar;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        switch (a.f2063a[bVar.ordinal()]) {
            case 1:
                this.f2061a.c(gVar);
                break;
            case 2:
                this.f2061a.g(gVar);
                break;
            case 3:
                this.f2061a.a(gVar);
                break;
            case 4:
                this.f2061a.e(gVar);
                break;
            case 5:
                this.f2061a.f(gVar);
                break;
            case 6:
                this.f2061a.b(gVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        e eVar = this.f2062b;
        if (eVar != null) {
            eVar.d(gVar, bVar);
        }
    }
}
