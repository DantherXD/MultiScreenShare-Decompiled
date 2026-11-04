package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.d;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import java.util.ArrayDeque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f1006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayDeque<b> f1007b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements e, androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f1008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f1009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.activity.a f1010c;

        LifecycleOnBackPressedCancellable(d dVar, b bVar) {
            this.f1008a = dVar;
            this.f1009b = bVar;
            dVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f1008a.c(this);
            this.f1009b.e(this);
            androidx.activity.a aVar = this.f1010c;
            if (aVar != null) {
                aVar.cancel();
                this.f1010c = null;
            }
        }

        @Override // androidx.lifecycle.e
        public void d(g gVar, d.b bVar) {
            if (bVar == d.b.ON_START) {
                this.f1010c = OnBackPressedDispatcher.this.b(this.f1009b);
                return;
            }
            if (bVar != d.b.ON_STOP) {
                if (bVar == d.b.ON_DESTROY) {
                    cancel();
                }
            } else {
                androidx.activity.a aVar = this.f1010c;
                if (aVar != null) {
                    aVar.cancel();
                }
            }
        }
    }

    private class a implements androidx.activity.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f1012a;

        a(b bVar) {
            this.f1012a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f1007b.remove(this.f1012a);
            this.f1012a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f1006a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(g gVar, b bVar) {
        d dVarA = gVar.a();
        if (dVarA.b() == d.c.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(dVarA, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f1007b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> itDescendingIterator = this.f1007b.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            b next = itDescendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f1006a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
