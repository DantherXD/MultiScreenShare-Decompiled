package com.bumptech.glide.o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set<com.bumptech.glide.r.c> f3715a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.r.c> f3716b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f3717c;

    public boolean a(com.bumptech.glide.r.c cVar) {
        boolean z = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f3715a.remove(cVar);
        if (!this.f3716b.remove(cVar) && !zRemove) {
            z = false;
        }
        if (z) {
            cVar.clear();
        }
        return z;
    }

    public void b() {
        Iterator it = com.bumptech.glide.t.k.i(this.f3715a).iterator();
        while (it.hasNext()) {
            a((com.bumptech.glide.r.c) it.next());
        }
        this.f3716b.clear();
    }

    public void c() {
        this.f3717c = true;
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.f3715a)) {
            if (cVar.isRunning() || cVar.i()) {
                cVar.clear();
                this.f3716b.add(cVar);
            }
        }
    }

    public void d() {
        this.f3717c = true;
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.f3715a)) {
            if (cVar.isRunning()) {
                cVar.e();
                this.f3716b.add(cVar);
            }
        }
    }

    public void e() {
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.f3715a)) {
            if (!cVar.i() && !cVar.j()) {
                cVar.clear();
                if (this.f3717c) {
                    this.f3716b.add(cVar);
                } else {
                    cVar.f();
                }
            }
        }
    }

    public void f() {
        this.f3717c = false;
        for (com.bumptech.glide.r.c cVar : com.bumptech.glide.t.k.i(this.f3715a)) {
            if (!cVar.i() && !cVar.isRunning()) {
                cVar.f();
            }
        }
        this.f3716b.clear();
    }

    public void g(com.bumptech.glide.r.c cVar) {
        this.f3715a.add(cVar);
        if (!this.f3717c) {
            cVar.f();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f3716b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f3715a.size() + ", isPaused=" + this.f3717c + "}";
    }
}
