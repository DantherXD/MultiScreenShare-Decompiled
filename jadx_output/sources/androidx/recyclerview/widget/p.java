package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final a.d.g<RecyclerView.e0, a> f2363a = new a.d.g<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a.d.d<RecyclerView.e0> f2364b = new a.d.d<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a.g.k.e<a> f2365a = new a.g.k.f(20);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f2366b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        RecyclerView.m.c f2367c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        RecyclerView.m.c f2368d;

        private a() {
        }

        static void a() {
            while (f2365a.b() != null) {
            }
        }

        static a b() {
            a aVarB = f2365a.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f2366b = 0;
            aVar.f2367c = null;
            aVar.f2368d = null;
            f2365a.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.e0 e0Var);

        void b(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    p() {
    }

    private RecyclerView.m.c l(RecyclerView.e0 e0Var, int i) {
        a aVarM;
        RecyclerView.m.c cVar;
        int iF = this.f2363a.f(e0Var);
        if (iF >= 0 && (aVarM = this.f2363a.m(iF)) != null) {
            int i2 = aVarM.f2366b;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                aVarM.f2366b = i3;
                if (i == 4) {
                    cVar = aVarM.f2367c;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarM.f2368d;
                }
                if ((i3 & 12) == 0) {
                    this.f2363a.k(iF);
                    a.c(aVarM);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f2363a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2363a.put(e0Var, aVarB);
        }
        aVarB.f2366b |= 2;
        aVarB.f2367c = cVar;
    }

    void b(RecyclerView.e0 e0Var) {
        a aVarB = this.f2363a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2363a.put(e0Var, aVarB);
        }
        aVarB.f2366b |= 1;
    }

    void c(long j, RecyclerView.e0 e0Var) {
        this.f2364b.i(j, e0Var);
    }

    void d(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f2363a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2363a.put(e0Var, aVarB);
        }
        aVarB.f2368d = cVar;
        aVarB.f2366b |= 8;
    }

    void e(RecyclerView.e0 e0Var, RecyclerView.m.c cVar) {
        a aVarB = this.f2363a.get(e0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f2363a.put(e0Var, aVarB);
        }
        aVarB.f2367c = cVar;
        aVarB.f2366b |= 4;
    }

    void f() {
        this.f2363a.clear();
        this.f2364b.b();
    }

    RecyclerView.e0 g(long j) {
        return this.f2364b.e(j);
    }

    boolean h(RecyclerView.e0 e0Var) {
        a aVar = this.f2363a.get(e0Var);
        return (aVar == null || (aVar.f2366b & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.e0 e0Var) {
        a aVar = this.f2363a.get(e0Var);
        return (aVar == null || (aVar.f2366b & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.e0 e0Var) {
        p(e0Var);
    }

    RecyclerView.m.c m(RecyclerView.e0 e0Var) {
        return l(e0Var, 8);
    }

    RecyclerView.m.c n(RecyclerView.e0 e0Var) {
        return l(e0Var, 4);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0021  */
    void o(b bVar) {
        RecyclerView.m.c cVar;
        RecyclerView.m.c cVar2;
        for (int size = this.f2363a.size() - 1; size >= 0; size--) {
            RecyclerView.e0 e0VarI = this.f2363a.i(size);
            a aVarK = this.f2363a.k(size);
            int i = aVarK.f2366b;
            if ((i & 3) != 3) {
                if ((i & 1) != 0) {
                    cVar = aVarK.f2367c;
                    if (cVar == null) {
                        bVar.a(e0VarI);
                    } else {
                        cVar2 = aVarK.f2368d;
                    }
                } else if ((i & 14) == 14) {
                    bVar.b(e0VarI, aVarK.f2367c, aVarK.f2368d);
                } else if ((i & 12) == 12) {
                    bVar.d(e0VarI, aVarK.f2367c, aVarK.f2368d);
                } else if ((i & 4) != 0) {
                    cVar = aVarK.f2367c;
                    cVar2 = null;
                } else if ((i & 8) != 0) {
                    bVar.b(e0VarI, aVarK.f2367c, aVarK.f2368d);
                }
                bVar.c(e0VarI, cVar, cVar2);
            } else {
                bVar.a(e0VarI);
            }
            a.c(aVarK);
        }
    }

    void p(RecyclerView.e0 e0Var) {
        a aVar = this.f2363a.get(e0Var);
        if (aVar == null) {
            return;
        }
        aVar.f2366b &= -2;
    }

    void q(RecyclerView.e0 e0Var) {
        for (int iL = this.f2364b.l() - 1; iL >= 0; iL--) {
            if (e0Var == this.f2364b.m(iL)) {
                this.f2364b.k(iL);
                break;
            }
        }
        a aVarRemove = this.f2363a.remove(e0Var);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
