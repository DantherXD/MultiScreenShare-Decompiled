package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.p;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class RemoteConfigRegistrar implements q {
    static /* synthetic */ n lambda$getComponents$0(com.google.firebase.components.n nVar) {
        return new n((Context) nVar.a(Context.class), (com.google.firebase.f) nVar.a(com.google.firebase.f.class), (com.google.firebase.installations.h) nVar.a(com.google.firebase.installations.h.class), ((com.google.firebase.abt.component.b) nVar.a(com.google.firebase.abt.component.b.class)).b("frc"), nVar.b(com.google.firebase.j.a.a.class));
    }

    @Override // com.google.firebase.components.q
    public List<com.google.firebase.components.m<?>> getComponents() {
        return Arrays.asList(com.google.firebase.components.m.a(n.class).b(t.h(Context.class)).b(t.h(com.google.firebase.f.class)).b(t.h(com.google.firebase.installations.h.class)).b(t.h(com.google.firebase.abt.component.b.class)).b(t.g(com.google.firebase.j.a.a.class)).e(new p() { // from class: com.google.firebase.remoteconfig.g
            @Override // com.google.firebase.components.p
            public final Object a(com.google.firebase.components.n nVar) {
                return RemoteConfigRegistrar.lambda$getComponents$0(nVar);
            }
        }).d().c(), com.google.firebase.p.h.a("fire-rc", "21.0.1"));
    }
}
