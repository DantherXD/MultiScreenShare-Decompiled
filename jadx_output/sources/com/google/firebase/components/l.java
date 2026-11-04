package com.google.firebase.components;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class l implements n {
    l() {
    }

    @Override // com.google.firebase.components.n
    public <T> T a(Class<T> cls) {
        com.google.firebase.n.b<T> bVarB = b(cls);
        if (bVarB == null) {
            return null;
        }
        return bVarB.a();
    }

    @Override // com.google.firebase.components.n
    public <T> Set<T> c(Class<T> cls) {
        return d(cls).a();
    }
}
