package com.bumptech.glide.q;

import com.bumptech.glide.load.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<String> f3730a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, List<a<?, ?>>> f3731b = new HashMap();

    private static class a<T, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class<T> f3732a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class<R> f3733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final k<T, R> f3734c;

        public a(Class<T> cls, Class<R> cls2, k<T, R> kVar) {
            this.f3732a = cls;
            this.f3733b = cls2;
            this.f3734c = kVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f3732a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f3733b);
        }
    }

    private synchronized List<a<?, ?>> c(String str) {
        List<a<?, ?>> arrayList;
        if (!this.f3730a.contains(str)) {
            this.f3730a.add(str);
        }
        arrayList = this.f3731b.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f3731b.put(str, arrayList);
        }
        return arrayList;
    }

    public synchronized <T, R> void a(String str, k<T, R> kVar, Class<T> cls, Class<R> cls2) {
        c(str).add(new a<>(cls, cls2, kVar));
    }

    public synchronized <T, R> List<k<T, R>> b(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f3730a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f3731b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2)) {
                        arrayList.add(aVar.f3734c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> d(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<String> it = this.f3730a.iterator();
        while (it.hasNext()) {
            List<a<?, ?>> list = this.f3731b.get(it.next());
            if (list != null) {
                for (a<?, ?> aVar : list) {
                    if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f3733b)) {
                        arrayList.add(aVar.f3733b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized void e(List<String> list) {
        ArrayList<String> arrayList = new ArrayList(this.f3730a);
        this.f3730a.clear();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f3730a.add(it.next());
        }
        for (String str : arrayList) {
            if (!list.contains(str)) {
                this.f3730a.add(str);
            }
        }
    }
}
