package a.q;

import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
class k0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IBinder f889a;

    k0(IBinder iBinder) {
        this.f889a = iBinder;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k0) && ((k0) obj).f889a.equals(this.f889a);
    }

    public int hashCode() {
        return this.f889a.hashCode();
    }
}
