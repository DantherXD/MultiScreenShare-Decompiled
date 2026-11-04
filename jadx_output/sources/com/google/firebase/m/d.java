package com.google.firebase.m;

import android.content.Context;
import com.google.firebase.components.m;
import com.google.firebase.components.n;
import com.google.firebase.components.p;
import com.google.firebase.components.t;
import com.google.firebase.components.y;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadFactory f4509a = new ThreadFactory() { // from class: com.google.firebase.m.a
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return d.e(runnable);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.firebase.n.b<g> f4510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set<e> f4511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f4512d;

    private d(final Context context, Set<e> set) {
        this(new y(new com.google.firebase.n.b() { // from class: com.google.firebase.m.b
            @Override // com.google.firebase.n.b
            public final Object a() {
                return g.a(context);
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4509a));
    }

    d(com.google.firebase.n.b<g> bVar, Set<e> set, Executor executor) {
        this.f4510b = bVar;
        this.f4511c = set;
        this.f4512d = executor;
    }

    public static m<f> b() {
        return m.a(f.class).b(t.h(Context.class)).b(t.i(e.class)).e(new p() { // from class: com.google.firebase.m.c
            @Override // com.google.firebase.components.p
            public final Object a(n nVar) {
                return d.c(nVar);
            }
        }).c();
    }

    static /* synthetic */ f c(n nVar) {
        return new d((Context) nVar.a(Context.class), nVar.c(e.class));
    }

    static /* synthetic */ Thread e(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // com.google.firebase.m.f
    public f.a a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zD = this.f4510b.a().d(str, jCurrentTimeMillis);
        boolean zC = this.f4510b.a().c(jCurrentTimeMillis);
        if (zD && zC) {
            return f.a.COMBINED;
        }
        if (zC) {
            return f.a.GLOBAL;
        }
        return zD ? f.a.SDK : f.a.NONE;
    }
}
