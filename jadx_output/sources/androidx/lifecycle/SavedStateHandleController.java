package androidx.lifecycle;

import androidx.savedstate.SavedStateRegistry;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class SavedStateHandleController implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2081a;

    static final class a implements SavedStateRegistry.a {
        a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.a
        public void a(androidx.savedstate.c cVar) {
            if (!(cVar instanceof s)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
            }
            r rVarH = ((s) cVar).h();
            SavedStateRegistry savedStateRegistryC = cVar.c();
            Iterator<String> it = rVarH.c().iterator();
            while (it.hasNext()) {
                SavedStateHandleController.h(rVarH.b(it.next()), savedStateRegistryC, cVar.a());
            }
            if (rVarH.c().isEmpty()) {
                return;
            }
            savedStateRegistryC.e(a.class);
        }
    }

    static void h(p pVar, SavedStateRegistry savedStateRegistry, d dVar) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) pVar.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.j()) {
            return;
        }
        savedStateHandleController.i(savedStateRegistry, dVar);
        k(savedStateRegistry, dVar);
    }

    private static void k(final SavedStateRegistry savedStateRegistry, final d dVar) {
        d.c cVarB = dVar.b();
        if (cVarB == d.c.INITIALIZED || cVarB.a(d.c.STARTED)) {
            savedStateRegistry.e(a.class);
        } else {
            dVar.a(new e() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.e
                public void d(g gVar, d.b bVar) {
                    if (bVar == d.b.ON_START) {
                        dVar.c(this);
                        savedStateRegistry.e(a.class);
                    }
                }
            });
        }
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        if (bVar == d.b.ON_DESTROY) {
            this.f2081a = false;
            gVar.a().c(this);
        }
    }

    void i(SavedStateRegistry savedStateRegistry, d dVar) {
        if (this.f2081a) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f2081a = true;
        dVar.a(this);
        throw null;
    }

    boolean j() {
        return this.f2081a;
    }
}
