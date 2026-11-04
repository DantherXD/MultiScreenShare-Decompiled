package androidx.fragment.app;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
class FragmentManager$6 implements androidx.lifecycle.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ s f1810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.lifecycle.d f1811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ n f1812d;

    @Override // androidx.lifecycle.e
    public void d(androidx.lifecycle.g gVar, androidx.lifecycle.d.b bVar) {
        Bundle bundle;
        if (bVar == androidx.lifecycle.d.b.ON_START && (bundle = (Bundle) this.f1812d.l.get(this.f1809a)) != null) {
            this.f1810b.a(this.f1809a, bundle);
            this.f1812d.q(this.f1809a);
        }
        if (bVar == androidx.lifecycle.d.b.ON_DESTROY) {
            this.f1811c.c(this);
            this.f1812d.m.remove(this.f1809a);
        }
    }
}
