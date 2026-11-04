package androidx.savedstate;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SavedStateRegistry f2379b = new SavedStateRegistry();

    private b(c cVar) {
        this.f2378a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    public SavedStateRegistry b() {
        return this.f2379b;
    }

    public void c(Bundle bundle) {
        androidx.lifecycle.d dVarA = this.f2378a.a();
        if (dVarA.b() != androidx.lifecycle.d.c.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        dVarA.a(new Recreator(this.f2378a));
        this.f2379b.b(dVarA, bundle);
    }

    public void d(Bundle bundle) {
        this.f2379b.c(bundle);
    }
}
