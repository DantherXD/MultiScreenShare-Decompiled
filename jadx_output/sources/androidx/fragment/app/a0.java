package androidx.fragment.app;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: loaded from: classes.dex */
class a0 implements androidx.savedstate.c, androidx.lifecycle.s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Fragment f1813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final androidx.lifecycle.r f1814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private androidx.lifecycle.h f1815d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private androidx.savedstate.b f1816e = null;

    a0(Fragment fragment, androidx.lifecycle.r rVar) {
        this.f1813b = fragment;
        this.f1814c = rVar;
    }

    @Override // androidx.lifecycle.g
    public androidx.lifecycle.d a() {
        e();
        return this.f1815d;
    }

    @Override // androidx.savedstate.c
    public SavedStateRegistry c() {
        e();
        return this.f1816e.b();
    }

    void d(androidx.lifecycle.d.b bVar) {
        this.f1815d.h(bVar);
    }

    void e() {
        if (this.f1815d == null) {
            this.f1815d = new androidx.lifecycle.h(this);
            this.f1816e = androidx.savedstate.b.a(this);
        }
    }

    boolean f() {
        return this.f1815d != null;
    }

    void g(Bundle bundle) {
        this.f1816e.c(bundle);
    }

    @Override // androidx.lifecycle.s
    public androidx.lifecycle.r h() {
        e();
        return this.f1814c;
    }

    void i(Bundle bundle) {
        this.f1816e.d(bundle);
    }

    void j(androidx.lifecycle.d.c cVar) {
        this.f1815d.o(cVar);
    }
}
