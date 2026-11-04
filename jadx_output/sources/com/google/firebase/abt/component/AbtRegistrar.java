package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.p;
import com.google.firebase.components.q;
import com.google.firebase.components.t;
import com.google.firebase.p.h;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AbtRegistrar implements q {
    static /* synthetic */ b lambda$getComponents$0(n nVar) {
        return new b((Context) nVar.a(Context.class), nVar.b(com.google.firebase.j.a.a.class));
    }

    @Override // com.google.firebase.components.q
    public List<m<?>> getComponents() {
        return Arrays.asList(m.a(b.class).b(t.h(Context.class)).b(t.g(com.google.firebase.j.a.a.class)).e(new p() { // from class: com.google.firebase.abt.component.a
            @Override // com.google.firebase.components.p
            public final Object a(n nVar) {
                return AbtRegistrar.lambda$getComponents$0(nVar);
            }
        }).c(), h.a("fire-abt", "21.0.0"));
    }
}
