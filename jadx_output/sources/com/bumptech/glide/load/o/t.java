package com.bumptech.glide.load.o;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class t<Data, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<Data> f3367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.g.k.e<List<Throwable>> f3368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f3369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f3370d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, a.g.k.e<List<Throwable>> eVar) {
        this.f3367a = cls;
        this.f3368b = eVar;
        this.f3369c = (List) com.bumptech.glide.t.j.c(list);
        this.f3370d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<Transcode> b(com.bumptech.glide.load.n.e<Data> eVar, com.bumptech.glide.load.i iVar, int i, int i2, i.a<ResourceType> aVar, List<Throwable> list) throws q {
        int size = this.f3369c.size();
        v<Transcode> vVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            try {
                vVarA = this.f3369c.get(i3).a(eVar, i, i2, iVar, aVar);
            } catch (q e2) {
                list.add(e2);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f3370d, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.n.e<Data> eVar, com.bumptech.glide.load.i iVar, int i, int i2, i.a<ResourceType> aVar) {
        List<Throwable> list = (List) com.bumptech.glide.t.j.d(this.f3368b.b());
        try {
            return b(eVar, iVar, i, i2, aVar, list);
        } finally {
            this.f3368b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f3369c.toArray()) + '}';
    }
}
