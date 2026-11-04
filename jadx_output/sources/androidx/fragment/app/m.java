package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f1933a = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f1934b;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final n.l f1935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final boolean f1936b;
    }

    m(n nVar) {
        this.f1934b = nVar;
    }

    void a(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().a(fragment, bundle, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void b(Fragment fragment, boolean z) {
        this.f1934b.s0().k();
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().b(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void c(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().c(fragment, bundle, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void d(Fragment fragment, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().d(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void e(Fragment fragment, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().e(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void f(Fragment fragment, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().f(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void g(Fragment fragment, boolean z) {
        this.f1934b.s0().k();
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().g(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void h(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().h(fragment, bundle, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void i(Fragment fragment, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().i(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().j(fragment, bundle, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void k(Fragment fragment, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().k(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void l(Fragment fragment, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().l(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().m(fragment, view, bundle, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }

    void n(Fragment fragment, boolean z) {
        Fragment fragmentV0 = this.f1934b.v0();
        if (fragmentV0 != null) {
            fragmentV0.E().u0().n(fragment, true);
        }
        for (a aVar : this.f1933a) {
            if (!z || aVar.f1936b) {
                n.l lVar = aVar.f1935a;
                throw null;
            }
        }
    }
}
