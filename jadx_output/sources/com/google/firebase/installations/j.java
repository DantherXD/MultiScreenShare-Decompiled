package com.google.firebase.installations;

/* JADX INFO: loaded from: classes.dex */
class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f4432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.b.a.a.c.i<l> f4433b;

    public j(o oVar, c.b.a.a.c.i<l> iVar) {
        this.f4432a = oVar;
        this.f4433b = iVar;
    }

    @Override // com.google.firebase.installations.n
    public boolean a(Exception exc) {
        this.f4433b.c(exc);
        return true;
    }

    @Override // com.google.firebase.installations.n
    public boolean b(com.google.firebase.installations.q.d dVar) {
        if (!dVar.k() || this.f4432a.f(dVar)) {
            return false;
        }
        this.f4433b.b(l.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
