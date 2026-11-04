package androidx.activity.result;

import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
class ActivityResultRegistry$1 implements androidx.lifecycle.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f1019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.activity.result.f.a f1020c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f1021d;

    @Override // androidx.lifecycle.e
    public void d(g gVar, androidx.lifecycle.d.b bVar) {
        if (!androidx.lifecycle.d.b.ON_START.equals(bVar)) {
            if (androidx.lifecycle.d.b.ON_STOP.equals(bVar)) {
                this.f1021d.f1029f.remove(this.f1018a);
                return;
            } else {
                if (androidx.lifecycle.d.b.ON_DESTROY.equals(bVar)) {
                    this.f1021d.i(this.f1018a);
                    return;
                }
                return;
            }
        }
        this.f1021d.f1029f.put(this.f1018a, new d.b<>(this.f1019b, this.f1020c));
        if (this.f1021d.g.containsKey(this.f1018a)) {
            Object obj = this.f1021d.g.get(this.f1018a);
            this.f1021d.g.remove(this.f1018a);
            this.f1019b.a(obj);
        }
        a aVar = (a) this.f1021d.h.getParcelable(this.f1018a);
        if (aVar != null) {
            this.f1021d.h.remove(this.f1018a);
            this.f1019b.a(this.f1020c.a(aVar.k(), aVar.j()));
        }
    }
}
