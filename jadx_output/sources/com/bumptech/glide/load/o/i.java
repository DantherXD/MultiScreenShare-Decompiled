package com.bumptech.glide.load.o;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i<DataType, ResourceType, Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<DataType> f3304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> f3305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.q.i.e<ResourceType, Transcode> f3306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a.g.k.e<List<Throwable>> f3307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f3308e;

    interface a<ResourceType> {
        v<ResourceType> a(v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends com.bumptech.glide.load.k<DataType, ResourceType>> list, com.bumptech.glide.load.q.i.e<ResourceType, Transcode> eVar, a.g.k.e<List<Throwable>> eVar2) {
        this.f3304a = cls;
        this.f3305b = list;
        this.f3306c = eVar;
        this.f3307d = eVar2;
        this.f3308e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<ResourceType> b(com.bumptech.glide.load.n.e<DataType> eVar, int i, int i2, com.bumptech.glide.load.i iVar) {
        List<Throwable> list = (List) com.bumptech.glide.t.j.d(this.f3307d.b());
        try {
            return c(eVar, i, i2, iVar, list);
        } finally {
            this.f3307d.a(list);
        }
    }

    private v<ResourceType> c(com.bumptech.glide.load.n.e<DataType> eVar, int i, int i2, com.bumptech.glide.load.i iVar, List<Throwable> list) throws q {
        int size = this.f3305b.size();
        v<ResourceType> vVarA = null;
        for (int i3 = 0; i3 < size; i3++) {
            com.bumptech.glide.load.k<DataType, ResourceType> kVar = this.f3305b.get(i3);
            try {
                if (kVar.b(eVar.a(), iVar)) {
                    vVarA = kVar.a(eVar.a(), i, i2, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e2);
                }
                list.add(e2);
            }
            if (vVarA != null) {
                break;
            }
        }
        if (vVarA != null) {
            return vVarA;
        }
        throw new q(this.f3308e, new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.n.e<DataType> eVar, int i, int i2, com.bumptech.glide.load.i iVar, a<ResourceType> aVar) {
        return this.f3306c.a(aVar.a(b(eVar, i, i2, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f3304a + ", decoders=" + this.f3305b + ", transcoder=" + this.f3306c + '}';
    }
}
