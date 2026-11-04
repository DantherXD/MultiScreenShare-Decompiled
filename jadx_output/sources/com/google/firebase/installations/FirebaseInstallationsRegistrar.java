package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.p;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements q {
    static /* synthetic */ h lambda$getComponents$0(com.google.firebase.components.n nVar) {
        return new g((com.google.firebase.f) nVar.a(com.google.firebase.f.class), nVar.b(com.google.firebase.p.i.class), nVar.b(com.google.firebase.m.f.class));
    }

    @Override // com.google.firebase.components.q
    public List<com.google.firebase.components.m<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.m.a(h.class).b(t.h(com.google.firebase.f.class)).b(t.g(com.google.firebase.m.f.class)).b(t.g(com.google.firebase.p.i.class)).e(new p() { // from class: com.google.firebase.installations.d
            @Override // com.google.firebase.components.p
            public final Object a(com.google.firebase.components.n nVar) {
                return FirebaseInstallationsRegistrar.lambda$getComponents$0(nVar);
            }
        }).c(), com.google.firebase.p.h.a("fire-installations", "17.0.0"));
    }
}
