package com.google.firebase.installations;

/* JADX INFO: loaded from: classes.dex */
class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final c.b.a.a.c.i<String> f4434a;

    public k(c.b.a.a.c.i<String> iVar) {
        this.f4434a = iVar;
    }

    @Override // com.google.firebase.installations.n
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.n
    public boolean b(com.google.firebase.installations.q.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f4434a.d(dVar.d());
        return true;
    }
}
