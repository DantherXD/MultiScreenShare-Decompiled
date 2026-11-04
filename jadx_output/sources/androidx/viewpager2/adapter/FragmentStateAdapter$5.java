package androidx.viewpager2.adapter;

import android.os.Handler;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;

/* JADX INFO: loaded from: classes.dex */
class FragmentStateAdapter$5 implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Handler f2413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Runnable f2414b;

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        if (bVar == d.b.ON_DESTROY) {
            this.f2413a.removeCallbacks(this.f2414b);
            gVar.a().c(this);
        }
    }
}
