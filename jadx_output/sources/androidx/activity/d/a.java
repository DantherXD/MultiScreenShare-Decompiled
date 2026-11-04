package androidx.activity.d;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<b> f1016a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f1017b;

    public void a(b bVar) {
        if (this.f1017b != null) {
            bVar.a(this.f1017b);
        }
        this.f1016a.add(bVar);
    }

    public void b() {
        this.f1017b = null;
    }

    public void c(Context context) {
        this.f1017b = context;
        Iterator<b> it = this.f1016a.iterator();
        while (it.hasNext()) {
            it.next().a(context);
        }
    }
}
