package com.google.firebase.components;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class r extends l implements com.google.firebase.k.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.google.firebase.n.b<Set<Object>> f4351a = new com.google.firebase.n.b() { // from class: com.google.firebase.components.i
        @Override // com.google.firebase.n.b
        public final Object a() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<m<?>, com.google.firebase.n.b<?>> f4352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<Class<?>, com.google.firebase.n.b<?>> f4353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<Class<?>, z<?>> f4354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List<com.google.firebase.n.b<q>> f4355e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final w f4356f;
    private final AtomicReference<Boolean> g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f4357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<com.google.firebase.n.b<q>> f4358b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<m<?>> f4359c = new ArrayList();

        b(Executor executor) {
            this.f4357a = executor;
        }

        static /* synthetic */ q e(q qVar) {
            return qVar;
        }

        public b a(m<?> mVar) {
            this.f4359c.add(mVar);
            return this;
        }

        public b b(final q qVar) {
            this.f4358b.add(new com.google.firebase.n.b() { // from class: com.google.firebase.components.e
                @Override // com.google.firebase.n.b
                public final Object a() {
                    q qVar2 = qVar;
                    r.b.e(qVar2);
                    return qVar2;
                }
            });
            return this;
        }

        public b c(Collection<com.google.firebase.n.b<q>> collection) {
            this.f4358b.addAll(collection);
            return this;
        }

        public r d() {
            return new r(this.f4357a, this.f4358b, this.f4359c);
        }
    }

    private r(Executor executor, Iterable<com.google.firebase.n.b<q>> iterable, Collection<m<?>> collection) {
        this.f4352b = new HashMap();
        this.f4353c = new HashMap();
        this.f4354d = new HashMap();
        this.g = new AtomicReference<>();
        w wVar = new w(executor);
        this.f4356f = wVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(m.n(wVar, w.class, com.google.firebase.l.d.class, com.google.firebase.l.c.class));
        arrayList.add(m.n(this, com.google.firebase.k.a.class, new Class[0]));
        for (m<?> mVar : collection) {
            if (mVar != null) {
                arrayList.add(mVar);
            }
        }
        this.f4355e = i(iterable);
        f(arrayList);
    }

    public static b e(Executor executor) {
        return new b(executor);
    }

    private void f(List<m<?>> list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator<com.google.firebase.n.b<q>> it = this.f4355e.iterator();
            while (it.hasNext()) {
                try {
                    q qVarA = it.next().a();
                    if (qVarA != null) {
                        list.addAll(qVarA.getComponents());
                        it.remove();
                    }
                } catch (x e2) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e2);
                }
            }
            if (this.f4352b.isEmpty()) {
                s.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f4352b.keySet());
                arrayList2.addAll(list);
                s.a(arrayList2);
            }
            for (final m<?> mVar : list) {
                this.f4352b.put(mVar, new y(new com.google.firebase.n.b() { // from class: com.google.firebase.components.d
                    @Override // com.google.firebase.n.b
                    public final Object a() {
                        return this.f4316a.k(mVar);
                    }
                }));
            }
            arrayList.addAll(p(list));
            arrayList.addAll(q());
            o();
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        n();
    }

    private void g(Map<m<?>, com.google.firebase.n.b<?>> map, boolean z) {
        for (Map.Entry<m<?>, com.google.firebase.n.b<?>> entry : map.entrySet()) {
            m<?> key = entry.getKey();
            com.google.firebase.n.b<?> value = entry.getValue();
            if (key.i() || (key.j() && z)) {
                value.a();
            }
        }
        this.f4356f.a();
    }

    private static <T> List<T> i(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ Object k(m mVar) {
        return mVar.d().a(new d0(mVar, this));
    }

    private void n() {
        Boolean bool = this.g.get();
        if (bool != null) {
            g(this.f4352b, bool.booleanValue());
        }
    }

    private void o() {
        Map map;
        Class<?> clsB;
        Object objB;
        for (m<?> mVar : this.f4352b.keySet()) {
            for (t tVar : mVar.c()) {
                if (tVar.f() && !this.f4354d.containsKey(tVar.b())) {
                    map = this.f4354d;
                    clsB = tVar.b();
                    objB = z.c(Collections.emptySet());
                } else if (this.f4353c.containsKey(tVar.b())) {
                    continue;
                } else {
                    if (tVar.e()) {
                        throw new a0(String.format("Unsatisfied dependency for component %s: %s", mVar, tVar.b()));
                    }
                    if (!tVar.f()) {
                        map = this.f4353c;
                        clsB = tVar.b();
                        objB = b0.b();
                    }
                }
                map.put(clsB, objB);
            }
        }
    }

    private List<Runnable> p(List<m<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (m<?> mVar : list) {
            if (mVar.k()) {
                final com.google.firebase.n.b<?> bVar = this.f4352b.get(mVar);
                for (Class<? super Object> cls : mVar.e()) {
                    if (this.f4353c.containsKey(cls)) {
                        final b0 b0Var = (b0) this.f4353c.get(cls);
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.g
                            @Override // java.lang.Runnable
                            public final void run() {
                                b0Var.e(bVar);
                            }
                        });
                    } else {
                        this.f4353c.put(cls, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    private List<Runnable> q() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry<m<?>, com.google.firebase.n.b<?>> entry : this.f4352b.entrySet()) {
            m<?> key = entry.getKey();
            if (!key.k()) {
                com.google.firebase.n.b<?> value = entry.getValue();
                for (Class<? super Object> cls : key.e()) {
                    if (!map.containsKey(cls)) {
                        map.put(cls, new HashSet());
                    }
                    ((Set) map.get(cls)).add(value);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f4354d.containsKey(entry2.getKey())) {
                final z<?> zVar = this.f4354d.get(entry2.getKey());
                for (final com.google.firebase.n.b bVar : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            zVar.b(bVar);
                        }
                    });
                }
            } else {
                this.f4354d.put((Class) entry2.getKey(), z.c((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.l, com.google.firebase.components.n
    public /* bridge */ /* synthetic */ Object a(Class cls) {
        return super.a(cls);
    }

    @Override // com.google.firebase.components.n
    public synchronized <T> com.google.firebase.n.b<T> b(Class<T> cls) {
        c0.c(cls, "Null interface requested.");
        return (com.google.firebase.n.b) this.f4353c.get(cls);
    }

    @Override // com.google.firebase.components.l, com.google.firebase.components.n
    public /* bridge */ /* synthetic */ Set c(Class cls) {
        return super.c(cls);
    }

    @Override // com.google.firebase.components.n
    public synchronized <T> com.google.firebase.n.b<Set<T>> d(Class<T> cls) {
        z<?> zVar = this.f4354d.get(cls);
        if (zVar != null) {
            return zVar;
        }
        return (com.google.firebase.n.b<Set<T>>) f4351a;
    }

    public void h(boolean z) {
        HashMap map;
        if (this.g.compareAndSet(null, Boolean.valueOf(z))) {
            synchronized (this) {
                map = new HashMap(this.f4352b);
            }
            g(map, z);
        }
    }
}
