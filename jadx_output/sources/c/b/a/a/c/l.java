package c.b.a.a.c;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class l implements a<Void, h<List<h<?>>>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Collection f2593a;

    l(Collection collection) {
        this.f2593a = collection;
    }

    @Override // c.b.a.a.c.a
    public final /* synthetic */ h<List<h<?>>> a(h<Void> hVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f2593a);
        return k.c(arrayList);
    }
}
